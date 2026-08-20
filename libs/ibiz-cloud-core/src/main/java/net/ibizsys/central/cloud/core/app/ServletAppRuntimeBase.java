package net.ibizsys.central.cloud.core.app;

import java.io.File;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import net.ibizsys.central.app.ApplicationRuntimeBase;
import net.ibizsys.central.app.ApplicationRuntimeException;
import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.spring.configuration.NacosServiceHubSettingBase;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.util.IConfigListener;
import net.ibizsys.central.cloud.core.util.domain.CodeGenResult;
import net.ibizsys.central.cloud.core.util.freemarker.CodeNameUtilsMethod;
import net.ibizsys.central.cloud.core.util.freemarker.LanguageUtilsMethod;
import net.ibizsys.central.res.ISysFileResourceRuntime;
import net.ibizsys.central.res.ISysResourceRuntime;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DateUtils;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogLevels;

/**
 * @author lionlau
 *
 */
public abstract class ServletAppRuntimeBase extends ApplicationRuntimeBase implements IServletAppRuntime, IHotAppRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ServletAppRuntimeBase.class);

	private String baseUrl = null;
	private String resourceRoot = null;
	private boolean fromClassPathResource = false;
	private int requestPathOffset = 0;
	private ISysFileResourceRuntime configSysFileResourceRuntime = null;

	private boolean enableCloudReload = false;

	private boolean bInstalled = false;

	@Override
	protected void onInit() throws Exception {

		if (!StringUtils.hasLength(this.getBaseUrl())) {
			this.prepareBaseUrl();
		}
		super.onInit();

		

		this.registerIgnoreAuthPattern();
	}

	protected void registerIgnoreAuthPattern() {

	}

	protected void prepareBaseUrl() throws Exception {
		this.setBaseUrl(String.format("/%1$s/%2$s/%3$s", ServiceHub.getInstance().getServletAppBaseUrl(), this.getSystemRuntime().getServiceId(), this.getPSApplication().getCodeName()).toLowerCase());
		this.requestPathOffset = this.getBaseUrl().length() - 1 - ServiceHub.getInstance().getServletAppBaseUrl().length();
	}

	@Override
	public String getBaseUrl() {
		return this.baseUrl;
	}

	protected void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	protected String getResourceRoot() {
		return this.resourceRoot;
	}

	protected void setResourceRoot(String resourceRoot) {
		this.resourceRoot = resourceRoot;
	}

	protected void prepareResourceRoot() throws Exception {
		prepareConfig();
	}

	protected boolean isFromClassPathResource() {
		return this.fromClassPathResource;
	}

	protected void setFromClassPathResource(boolean fromClassPathResource) {
		this.fromClassPathResource = fromClassPathResource;
	}

	@Override
	public Resource resolveResource(HttpServletRequest request, String requestPath) {
		if (requestPath.indexOf("/") == 0) {
			requestPath = requestPath.substring(this.requestPathOffset);
		} else {
			requestPath = requestPath.substring(this.requestPathOffset - 1);
		}

		if (requestPath.indexOf("/") == 0) {
			requestPath = requestPath.substring(1);
		}

		if (!StringUtils.hasLength(requestPath)) {
			requestPath = getStartPage();
		}
		return onResolveResource(request, requestPath);
	}

	protected String getStartPage() {
		return "index.html";
	}

	protected Resource onResolveResource(HttpServletRequest request, String requestPath) {

		return this.getResource(requestPath);
	}

	protected Resource getResource(String requestPath) {

		String fullPath = String.format("%1$s%2$s%3$s", getResourceRoot(), File.separator, requestPath);

		if (isFromClassPathResource()) {
			ClassPathResource classPathResource = new ClassPathResource(fullPath);
			if (classPathResource.exists()) {
				return classPathResource;
			}
			return null;
		}

		File file = new File(fullPath);
		if (file.exists()) {
			return new FileSystemResource(file);
		}

		return null;
	}

	@Override
	public synchronized void install() throws Exception {
		if (!this.bInstalled) {
			this.onInstall();

			this.bInstalled = true;
		}
	}

	protected void onInstall() throws Exception {

		if (!StringUtils.hasLength(this.getResourceRoot())) {
			this.prepareResourceRoot();
		}

		this.onRegisterDEMethodPluginRuntimes();

		listenReloadSignal();

	}

	protected void prepareConfig() throws Exception {

		if (this.getPSModelObject().getPSSysResource() == null) {
			log.warn(String.format("应用组件[%1$s]未指定配置资源", this.getName()));
			return;
		}
		ISysResourceRuntime iSysResourceRuntime = this.getSystemRuntime().getSysResourceRuntime(this.getPSModelObject().getPSSysResource());
		if (iSysResourceRuntime instanceof ISysFileResourceRuntime) {
			this.setFromClassPathResource(false);
			this.setConfigSysFileResourceRuntime((ISysFileResourceRuntime) iSysResourceRuntime);
			this.setResourceRoot(this.getConfigSysFileResourceRuntime(false).getFile(null).getCanonicalPath());
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
		throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("未指定应用配置系统文件资源运行时对象"));
	}

	protected void setConfigSysFileResourceRuntime(ISysFileResourceRuntime templSysFileResourceRuntime) {
		this.configSysFileResourceRuntime = templSysFileResourceRuntime;
	}

	protected void onRegisterDEMethodPluginRuntimes() throws Exception {

	}

	protected String getReloadSignalId() {
		return String.format("%1$s%2$s-%3$s", NacosServiceHubSettingBase.DATAID_RELOADSIGNAL_PREFIX, this.getSystemRuntime().getDeploySystemId(), this.getConfigFolder().replace(".", "-")).toLowerCase();
	}

	protected void listenReloadSignal() throws Exception {
		if (!(this.getSystemRuntime() instanceof IServiceSystemRuntime)) {
			return;
		}

		String strReloadSignalId = getReloadSignalId();
		log.debug(String.format("应用[%1$s]监控重载配置[%2$s]", this.getName(), strReloadSignalId));
		((IServiceSystemRuntime) this.getSystemRuntime()).getConfigListenerRepo().addConfigListener(strReloadSignalId, new IConfigListener() {
			@Override
			public void receiveConfigInfo(String configInfo) {
				log.debug(String.format("%1$s接收到重载信号", getConfigFolder()));
				getSystemRuntime().threadRun(new Runnable() {
					@Override
					public void run() {
						localReload();
					}
				});

			}
		});
		this.enableCloudReload = true;
	}

	protected boolean isEnableCloudReload() {
		return this.enableCloudReload;
	}

	@Override
	public boolean isInstalled() {
		return this.bInstalled;
	}

	@Override
	public void reload() {
		try {
			if (this.isEnableCloudReload() && ServiceHub.getInstance().getServiceHubSetting().isPublishConfig()) {
				String strReloadSignalId = getReloadSignalId();
				Map<String, String> map = new LinkedHashMap<String, String>();
				map.put("reloaddate", DateUtils.getCurTimeString2());
				this.onFillReloadSignal(map);
				ServiceHub.getInstance().publishConfig(strReloadSignalId, map);
				return;
			}

			this.onReload();
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			ApplicationRuntimeException.rethrow(this, ex);
			throw new ApplicationRuntimeException(this, String.format("重新加载发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected void onFillReloadSignal(Map<String, String> map) throws Throwable {

	}

	public void localReload() {
		try {
			this.onReload();
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			ApplicationRuntimeException.rethrow(this, ex);
			throw new ApplicationRuntimeException(this, String.format("重新加载发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected void onReload() throws Throwable {
		this.onReload(false);
	}

	protected void onReload(boolean bFirst) throws Throwable {
		// 重新加载资源
		if (!bFirst) {
			if (this.getConfigSysFileResourceRuntime(true) != null) {
				this.getConfigSysFileResourceRuntime(false).reload();
			}
		}
	}
	
	@Override
	public File getFile(String strPath, boolean bTryMode) {
		try {
			return this.onGetFile(strPath, bTryMode);
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			ApplicationRuntimeException.rethrow(this, ex);
			throw new ApplicationRuntimeException(this, String.format("获取文件发生异常，%1$s", ex.getMessage()), ex);
		}
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
		try {
			return onGenerate(strPath, params);
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			ApplicationRuntimeException.rethrow(this, ex);
			throw new ApplicationRuntimeException(this, String.format("生成代码发生异常，%1$s", ex.getMessage()), ex);
		}
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
		templParams.put(TEMPLATE_PARAM_APP, this.getPSApplication());
		templParams.put(TEMPLATE_PARAM_DATA, this.getPSApplication());
		
		if(StringUtils.hasLength(strPSModelType) && StringUtils.hasLength(strPSModelId)) {
			IPSModelObject iPSModelObject = this.getSystemRuntime().getPSSystemService().getPSModelObjectByDslId(strPSModelType, strPSModelId, false);
			templParams.put(TEMPLATE_PARAM_DATA, iPSModelObject);
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
	public void uninstall() {
		try {
			onUninstall();
		} catch (Throwable ex) {
			log.error(String.format("卸载应用[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			this.getSystemRuntime().log(LogLevels.ERROR, getLogCat(), String.format("卸载应用[%1$s]发生异常，%2$s", this.getName(), ex.getMessage()), null);
		}
	}

	protected void onUninstall() throws Throwable {

	}

}
