package net.ibizsys.central.sysutil;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.res.ISysFileResourceRuntime;
import net.ibizsys.central.res.ISysResourceRuntime;
import net.ibizsys.central.res.ISysSCMResourceRuntime;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.IAction;

/**
 * 系统代码生成器功能基类
 * 
 * @author lionlau
 *
 */
public abstract class SysCodeGenUtilRuntimeBase extends net.ibizsys.central.sysutil.SysUtilRuntimeBase implements ISysCodeGenUtilRuntime {

	private static final Log log = LogFactory.getLog(SysCodeGenUtilRuntimeBase.class);

	private ThreadLocal<String> templatePathThreadLocal = new ThreadLocal<String>();
	private boolean bTemplateFromResource = true;
	private Map<String, String> templateAliasMap = new HashMap<String, String>();
	private Map<String, Object> params = new HashMap<String, Object>();
	private String strDefautTemplatePath = null;
	
	private ISysFileResourceRuntime templSysFileResourceRuntime = null;
	private ISysFileResourceRuntime codeSysFileResourceRuntime = null;
	

	private ISysCodeGenUtilRuntimeContext iSysCodeGenUtilRuntimeContext = new ISysCodeGenUtilRuntimeContext() {

		@Override
		public String output(Object data, String strTemplateId) throws Throwable {
			return output(data, strTemplateId, null);
		}

		@Override
		public String output(Object data, String strTemplateId, String strIndent) throws Throwable {
			String strContent = getContent(data, strTemplateId, null);
			if (!StringUtils.hasLength(strContent) || !StringUtils.hasLength(strIndent)) {
				return strContent;
			}

			StringBuilder stringBuilder = new StringBuilder();
			String[] lines = strContent.replace("\r\n", "\n").replace("\r", "\n").split("\n");
			for (int i = 0; i < lines.length; i++) {
				if (i != 0) {
					stringBuilder.append("\n");
				}
				stringBuilder.append(strIndent);
				if (StringUtils.hasLength(lines[i])) {
					stringBuilder.append(lines[i]);
				}
			}
			return stringBuilder.toString();
		}

		@Override
		public boolean contains(String strTemplateId) {
			try {
				return StringUtils.hasLength(getTemplateContent(strTemplateId, true));
			} catch (Exception ex) {
				return false;
			}

		}
	};

	@Override
	protected void onInit() throws Exception {

		super.onInit();
		
		prepareTemplate();
		prepareOutput();
	}

	protected void prepareTemplate() throws Exception {

		if(this.getPSSysUtil().getPSSysResource()== null) {
			log.warn(String.format("代码生成组件[%1$s]未指定模板资源", this.getName()));
			return;
		}
		ISysResourceRuntime iSysResourceRuntime = this.getSystemRuntime().getSysResourceRuntime(this.getPSSysUtil().getPSSysResource());
		if(iSysResourceRuntime instanceof ISysFileResourceRuntime) {
			this.setTemplateFromResource(false);
			this.setTemplSysFileResourceRuntime((ISysFileResourceRuntime)iSysResourceRuntime);
		}
	}
	
	protected void prepareOutput() throws Exception {

		if(this.getPSSysUtil().getOutPSSysResource()== null) {
			log.warn(String.format("代码生成组件[%1$s]未指定代码输出资源", this.getName()));
			return;
		}
		
		ISysResourceRuntime iSysResourceRuntime = this.getSystemRuntime().getSysResourceRuntime(this.getPSSysUtil().getOutPSSysResource());
		if(iSysResourceRuntime instanceof ISysFileResourceRuntime) {
			this.setCodeSysFileResourceRuntime((ISysFileResourceRuntime)iSysResourceRuntime);
		}
	}

	@Override
	protected Object onExecuteAction(String strActionName, Object[] args) throws Throwable {
		if (ACTION_GENERATE.equalsIgnoreCase(strActionName)) {
			if(args != null && args.length> 0) {
				Object target = args[0];
				Map<String, Object> params = null;
				if(args.length>=2 && args[1] instanceof Map) {
					params = (Map)args[1];
				}
				this.generate(target, params);
			}
			else {
				this.generate(null, null);
			}
			return null;
		}
		return super.onExecuteAction(strActionName, args);
	}

	@Override
	public void generate(Object target, Map<String, Object> params) {
		
		this.executeAction("生成代码", new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				onGenerate(target, params);
				return null;
			}
		}, null);
	}

	/**
	 * 生成升级
	 * 
	 * @param params
	 * @throws Throwable
	 */
	protected void onGenerate(Object target, Map<String, Object> params) throws Throwable {
		String strDstPath = null;
		if(params!=null) {
			strDstPath = (String)params.get(PARAM_GENERATE_DSTPATH);
		}
		
		String strLastTemplatePath = this.getTemplatePath();
		try {
			ISysFileResourceRuntime templSysFileResourceRuntime = this.getTemplSysFileResourceRuntime(true);
			if(templSysFileResourceRuntime!=null) {
				this.setTemplatePath(templSysFileResourceRuntime.getFile(target).getCanonicalPath());
			}
			else {
				this.setTemplatePath(this.getDefautTemplatePath());
			}
			
			if(StringUtils.hasLength(strDstPath)) {
				this.doGenerate(target, strDstPath, params);
			}
			else {
				ISysFileResourceRuntime codeSysFileResourceRuntime = this.getCodeSysFileResourceRuntime(false);
				if(codeSysFileResourceRuntime instanceof ISysSCMResourceRuntime) {
					ISysSCMResourceRuntime iSysSCMResourceRuntime = (ISysSCMResourceRuntime)codeSysFileResourceRuntime;
					iSysSCMResourceRuntime.checkout(target);
					this.doGenerate(target, codeSysFileResourceRuntime.getFile(target).getCanonicalPath(), params);
					iSysSCMResourceRuntime.checkin(target);
				}
				else {
					this.doGenerate(target, codeSysFileResourceRuntime.getFile(target).getCanonicalPath(), params);
				}			
			}
			
		}
		finally {
			this.setTemplatePath(strLastTemplatePath);
		}
	}
	
	protected void doGenerate(Object data, String strDstPath, Map<String, Object> params) throws Throwable {
		throw new Exception("没有实现");
	}

	protected String getTemplatePath() {
		return this.templatePathThreadLocal.get();
	}

	protected void setTemplatePath(String strTemplatePath) {
		this.templatePathThreadLocal.set(strTemplatePath);
	}

	public boolean isTemplateFromResource() {
		return this.bTemplateFromResource;
	}

	protected void setTemplateFromResource(boolean bTemplateFromResource) {
		this.bTemplateFromResource = bTemplateFromResource;
	}
	
	

	public String getDefautTemplatePath() {
		return strDefautTemplatePath;
	}

	protected void setDefautTemplatePath(String strDefautTemplatePath) {
		this.strDefautTemplatePath = strDefautTemplatePath;
	}

	protected Map<String, Object> getTemplateParams() {
		return this.params;
	}

	protected void setTemplateParams(Map<String, Object> params) {
		this.params.clear();
		if (!ObjectUtils.isEmpty(params)) {
			this.params.putAll(params);
		}
	}

	protected ISysCodeGenUtilRuntimeContext getContext() {
		return this.iSysCodeGenUtilRuntimeContext;
	}

	protected void registerTemplateAlias(String strAlias, String strTemplateId) {
		this.templateAliasMap.put(strAlias, strTemplateId);
	}

	protected boolean unregisterTemplateAlias(String strAlias, String strTemplateId) {
		return this.templateAliasMap.remove(strAlias, strTemplateId);
	}

	protected String getRealTemplateId(String strTemplateId) {
		String strRealTemplateId = this.templateAliasMap.get(strTemplateId);
		if (StringUtils.hasLength(strRealTemplateId)) {
			return strRealTemplateId;
		}
		return strTemplateId;
	}

	/**
	 * 获取模板内容
	 * 
	 * @param strTemplateId
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	protected String getTemplateContent(String strTemplateId, boolean bTryMode) throws Exception {
		String strRealTemplateId = this.getRealTemplateId(strTemplateId);
		if (!StringUtils.hasLength(strRealTemplateId)) {
			throw new Exception(String.format("传入模板标识[%1$s]无效", strTemplateId));
		}

		if (this.isTemplateFromResource()) {
			String strFullModelPath = this.getTemplatePath() + strRealTemplateId.replace("\\", "/");
			InputStream is = this.getClass().getResourceAsStream(strFullModelPath);
			if (is != null) {
				return IOUtils.toString(is, "UTF-8");
			}

			if (bTryMode) {
				return null;
			}
		} else {
			String strFullModelPath = this.getTemplatePath() + strRealTemplateId;
			File file = new File(strFullModelPath);
			if (file.exists()) {
				return FileUtils.readFileToString(file, "UTF-8");
			}

			if (bTryMode) {
				return null;
			}
		}

		throw new Exception(String.format("指定模板[%1$s]不存在", strTemplateId));

	}

	protected void output(Object target, String strOutputPath, Object[] filters, Map<String, Object> fileMap, boolean bIgnoreException) throws Throwable {
		this.onOutput(target, strOutputPath, filters, fileMap, bIgnoreException);
	}

	protected void onOutput(Object target, String strOutputPath, Object[] filters, Map<String, Object> fileMap, boolean bIgnoreException) throws Throwable {
		throw new Exception("没有实现");
	}

	// protected boolean output(IPSModelObject iPSObject, String strTemplateId,
	// String strDestFilePath) throws Exception{
	// return this.output(iPSObject, strTemplateId, strDestFilePath, null,
	// false);
	// }
	
	protected void output(Object data, Map<String, String> outputMap, Map<String, Object> params, Map<String, Object> fileMap, boolean bIgnoreException) throws Throwable {
		for(java.util.Map.Entry<String, String> entry : outputMap.entrySet()) {
			this.output(data, entry.getKey(), params, entry.getValue(), fileMap, bIgnoreException);
		}
		
	}

	protected boolean output(Object data, String strTemplateId, Map<String, Object> params, String strDestFilePath, Map<String, Object> fileMap, boolean bIgnoreException) throws Throwable {

		String strContent = null;
		try {
			strContent = this.getContent(data, strTemplateId, params);
		} catch (Exception ex) {
			if (!bIgnoreException) {
				throw ex;
			}
			strContent = ex.getMessage();
		}

		File file = new File(strDestFilePath);

		if (StringUtils.hasLength(strContent) && file.exists()) {
			String strLastContent = FileUtils.readFileToString(file, "UTF-8");
			if (strContent.equals(strLastContent)) {
				if (fileMap != null) {
					fileMap.put(strDestFilePath, data);
				}
				return false;
			}
		}

		FileUtils.writeStringToFile(file, strContent, "UTF-8", false);
		log.debug(String.format("写入[%1$s]模板[%2$s]", strDestFilePath, strTemplateId));

		if (fileMap != null) {
			fileMap.put(strDestFilePath, data);
		}

		return true;
	}

	protected boolean outputRaw(Object data, String strContent, String strDestFilePath, Map<String, Object> fileMap) throws Throwable {

		File file = new File(strDestFilePath);

		if (StringUtils.hasLength(strContent) && file.exists()) {
			String strLastContent = FileUtils.readFileToString(file, "UTF-8");
			if (strContent.equals(strLastContent)) {
				if (fileMap != null) {
					fileMap.put(strDestFilePath, data);
				}
				return false;
			}
		}

		FileUtils.writeStringToFile(file, strContent, "UTF-8", false);

		if (fileMap != null) {
			fileMap.put(strDestFilePath, data);
		}

		return true;
	}

	protected String getContent(Object data, String strTemplateId, Map<String, Object> params) throws Throwable {
		throw new Exception("没有实现");
	}

	
	@Override
	public ISysFileResourceRuntime getTemplSysFileResourceRuntime(boolean bTryMode) {
		if(this.templSysFileResourceRuntime != null || bTryMode) {
			return this.templSysFileResourceRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("未指定模板系统文件资源运行时对象"));
	}
	
	

	@Override
	public ISysFileResourceRuntime getCodeSysFileResourceRuntime(boolean bTryMode) {
		if(this.codeSysFileResourceRuntime != null || bTryMode) {
			return this.codeSysFileResourceRuntime;
		}
		throw new SystemRuntimeException(this.getSystemRuntime(), this, String.format("未指定输出代码系统文件资源运行时对象"));
	}

	protected void setTemplSysFileResourceRuntime(ISysFileResourceRuntime templSysFileResourceRuntime) {
		this.templSysFileResourceRuntime = templSysFileResourceRuntime;
	}

	protected void setCodeSysFileResourceRuntime(ISysFileResourceRuntime codeSysFileResourceRuntime) {
		this.codeSysFileResourceRuntime = codeSysFileResourceRuntime;
	}

	protected boolean copyDir(String strTemplateId, String strDestDirPath) throws Throwable{
		String strRealTemplateId = this.getRealTemplateId(strTemplateId);
		if (!StringUtils.hasLength(strRealTemplateId)) {
			throw new Exception(String.format("传入模板标识[%1$s]无效", strTemplateId));
		}

		if (this.isTemplateFromResource()) {
			String strFullModelPath = this.getTemplatePath() + strRealTemplateId.replace("\\", "/");
//			InputStream is = this.getClass().getResourceAsStream(strFullModelPath);
//			if (is != null) {
//				return IOUtils.toString(is, "UTF-8");
//			}
//
//			if (bTryMode) {
//				return null;
//			}
			throw new Exception("不支持");
		} else {
			String strSrcDirPath = this.getTemplatePath() + strRealTemplateId;
			return copyDirRaw(strSrcDirPath, strDestDirPath);
		}
	}
	
	protected boolean copyDirRaw(String strSrcDirPath, String strDestDirPath) throws Throwable{
		FileUtils.copyDirectory(new File(strSrcDirPath), new File(strDestDirPath));
		return true;
	}
	
	protected boolean copyFile(String strTemplateId, String strDestFilePath) throws Throwable{
		String strRealTemplateId = this.getRealTemplateId(strTemplateId);
		if (!StringUtils.hasLength(strRealTemplateId)) {
			throw new Exception(String.format("传入模板标识[%1$s]无效", strTemplateId));
		}

		if (this.isTemplateFromResource()) {
			String strFullModelPath = this.getTemplatePath() + strRealTemplateId.replace("\\", "/");
//			InputStream is = this.getClass().getResourceAsStream(strFullModelPath);
//			if (is != null) {
//				return IOUtils.toString(is, "UTF-8");
//			}
//
//			if (bTryMode) {
//				return null;
//			}
			throw new Exception("不支持");
		} else {
			String strSrcFilePath = this.getTemplatePath() + strRealTemplateId;
			return copyFileRaw(strSrcFilePath, strDestFilePath);
		}
	}
	
	protected boolean copyFileRaw(String strSrcFilePath, String strDestFilePath) throws Throwable{
		FileUtils.copyFile(new File(strSrcFilePath), new File(strDestFilePath));
		return true;
	}
}
