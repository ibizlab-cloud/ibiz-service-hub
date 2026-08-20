package net.ibizsys.central.cloud.core.sysutil;

import java.io.File;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.util.domain.CodeGenResult;
import net.ibizsys.central.cloud.core.util.domain.CompileResult;
import net.ibizsys.central.cloud.core.util.domain.RunTestResult;
import net.ibizsys.central.cloud.core.util.freemarker.CodeNameUtilsMethod;
import net.ibizsys.central.cloud.core.util.freemarker.LanguageUtilsMethod;
import net.ibizsys.central.res.ISysFileResourceRuntime;
import net.ibizsys.central.res.ISysResourceRuntime;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.KeyValueUtils;

public abstract class SysHotCodeUtilRuntimeBase extends SysUtilRuntimeBase implements ISysHotCodeUtilRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysHotCodeUtilRuntimeBase.class);
	
	private ISysFileResourceRuntime configSysFileResourceRuntime = null;
	
	@Override
	protected void onInstall() throws Exception {
		this.prepareConfig();
		super.onInstall();
		this.listenReloadSignal();
		
		this.localReload();
	}
	
	protected void prepareConfig() throws Exception {
		if (this.getPSModelObject().getPSSysResource() == null) {
			log.warn(String.format("应用组件[%1$s]未指定配置资源", this.getName()));
			return;
		}
		ISysResourceRuntime iSysResourceRuntime = this.getSystemRuntime().getSysResourceRuntime(this.getPSModelObject().getPSSysResource());
//		ISysResourceRuntime iSysResourceRuntime = this.getSystemRuntime().getSysResourceRuntime("HOTCODE", true);
		if (iSysResourceRuntime instanceof ISysFileResourceRuntime) {
			this.setConfigSysFileResourceRuntime((ISysFileResourceRuntime) iSysResourceRuntime);
		}
	}

	@Override
	public IServiceSystemRuntime getSystemRuntime() {
		return (IServiceSystemRuntime) super.getSystemRuntime();
	}

	@Override
	public ISysFileResourceRuntime getConfigSysFileResourceRuntime(boolean bTryMode) {
		if (this.configSysFileResourceRuntime != null || bTryMode) {
			return this.configSysFileResourceRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("未指定热代码配置系统文件资源运行时对象"));
	}

	protected void setConfigSysFileResourceRuntime(ISysFileResourceRuntime templSysFileResourceRuntime) {
		this.configSysFileResourceRuntime = templSysFileResourceRuntime;
	}
	
	
	@Override
	public CompileResult compile(String strPath, Map<String, Object> params) {
		return (CompileResult) executeAction("编译代码", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onCompile(strPath, params);
			}
		}, null);
	}

	protected CompileResult onCompile(String strPath, Map<String, Object> params) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public File getFile(String strPath, boolean bTryMode) {
		return (File) executeAction("获取文件", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGetFile(strPath, bTryMode);
			}
		}, null);
	}

	protected File onGetFile(String strPath, boolean bTryMode) throws Throwable {
		ISysFileResourceRuntime iSysFileResourceRuntime = this.getConfigSysFileResourceRuntime(bTryMode);
		if(iSysFileResourceRuntime == null) {
			return null;
		}
		File rootFile = iSysFileResourceRuntime.getFile(null);
		File realFile = new File(rootFile, strPath);
		if(realFile.exists()) {
			return realFile;
		}
		if(bTryMode) {
			return null;
		}
		
		throw new Exception(String.format("指定文件[%1$s]不存在", strPath));
	}

	@Override
	public CodeGenResult generate(String strPath, Map<String, Object> params) {
		return (CodeGenResult) executeAction("生成代码", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onGenerate(strPath, params);
			}
		}, null);
	}

	protected CodeGenResult onGenerate(String strPath, Map<String, Object> params) throws Throwable {
		String strPSModelType = DataTypeUtils.getStringValue(params.get("psmodeltype"), null);
		String strPSModelId = DataTypeUtils.getStringValue(params.get("psmodelid"), null);
		String strTemplCode = DataTypeUtils.getStringValue(params.get("templcode"), null);
		
		if(ObjectUtils.isEmpty(strTemplCode)) {
			if(ObjectUtils.isEmpty(strPath)) {
				throw new Exception("未指定模板文件路径");
			}
			ISysFileResourceRuntime iSysFileResourceRuntime = this.getConfigSysFileResourceRuntime(false);
			iSysFileResourceRuntime.reload();
			File file = new File(iSysFileResourceRuntime.getFile(null), strPath);
			if (!file.exists() || !file.isFile()) {
				throw new Exception(String.format("指定文件[%1$s]不存在", strPath));
			}
			strTemplCode = FileUtils.readFileToString(file, "UTF-8");
		}
		
		Map<String, Object> templParams = new HashMap<String, Object>();
		templParams.put(TEMPLATE_PARAM_SYS, this.getSystemRuntime().getPSSystem());
		templParams.put(TEMPLATE_PARAM_DATA, this.getSystemRuntime().getPSSystem());
		
		if(StringUtils.hasLength(strPSModelType) && StringUtils.hasLength(strPSModelId)) {
			IPSModelObject iPSModelObject = this.getSystemRuntime().getPSSystemService().getPSModelObjectByDslId(strPSModelType, strPSModelId, false);
			templParams.put(TEMPLATE_PARAM_DATA, iPSModelObject);
			
			if(iPSModelObject instanceof IPSDataEntity) {
				templParams.put(TEMPLATE_PARAM_DE, iPSModelObject);
			}
			else
				if(iPSModelObject.getParentPSModelObject(IPSDataEntity.class, true)!=null) {
					templParams.put(TEMPLATE_PARAM_DE, iPSModelObject.getParentPSModelObject(IPSDataEntity.class, false));
				}
				else			
					if(iPSModelObject instanceof IPSApplication) {
						templParams.put(TEMPLATE_PARAM_APP, iPSModelObject);
					}
					else
						if(iPSModelObject.getParentPSModelObject(IPSApplication.class, true)!=null) {
							templParams.put(TEMPLATE_PARAM_APP, iPSModelObject.getParentPSModelObject(IPSApplication.class, false));
						}
		}
		
		CodeGenResult codeGenResult = new CodeGenResult();
		codeGenResult.setSuccess(true);
		try {
			String strCode = this.generateContent(strTemplCode, templParams);
			codeGenResult.setCode(strCode);
		}
		catch (Throwable ex) {
			codeGenResult.setSuccess(false);
			codeGenResult.setErrorMessage(ex.toString());
		}
		return codeGenResult;
	}
	
	protected String generateContent(String strTemplate, Map<String, Object> templParams) throws Throwable {
		StringTemplateLoader stringTemplateLoader = new StringTemplateLoader();
		Configuration config = new Configuration(Configuration.VERSION_2_3_30);
		CodeNameUtilsMethod.registerSharedVariables(config);
		LanguageUtilsMethod.registerSharedVariables(config);
		
		String strTemplateId = "templ_" + KeyValueUtils.genUniqueId(strTemplate);
		stringTemplateLoader.putTemplate(strTemplateId, strTemplate);
		config.setTemplateLoader(stringTemplateLoader);
		
		freemarker.template.Template template = config.getTemplate(strTemplateId);
		StringWriter sw = new StringWriter();
		template.process(templParams, sw);
		String strContent = sw.toString();
		return strContent;
	}
	
	protected void onRegisterSharedVariables(Configuration config) throws Throwable{
		
	}
	
	
	@Override
	public RunTestResult runTest(String strPath, Map<String, Object> params) {
		return (RunTestResult) executeAction("运行测试", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return onRunTest(strPath, params);
			}
		}, null);
	}

	protected RunTestResult onRunTest(String strPath, Map<String, Object> params) throws Throwable {
		throw new Exception("运行测试");
	}
	
	
	@Override
	protected void onReload() throws Throwable {
		super.onReload();
		
		
	}
}
