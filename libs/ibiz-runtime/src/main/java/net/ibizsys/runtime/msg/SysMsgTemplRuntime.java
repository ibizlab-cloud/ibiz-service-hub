package net.ibizsys.runtime.msg;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.msg.IPSSysMsgTempl;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.ISystemRuntimeSetting;
import net.ibizsys.runtime.SystemModelRuntimeBase;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 系统消息运行时对象实现
 * @author lionlau
 *
 */
public class SysMsgTemplRuntime extends SystemModelRuntimeBase implements ISysMsgTemplRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysMsgTemplRuntime.class);
	
	public final static String TEMPL_CONTENT = "CONTENT";
	public final static String TEMPL_SUBJECT = "SUBJECT";
	public final static String TEMPL_IMCONTENT = "IMCONTENT";
	public final static String TEMPL_SMSCONTENT = "SMSCONTENT";
	public final static String TEMPL_WXCONTENT = "WXCONTENT";
	public final static String TEMPL_DDCONTENT = "DDCONTENT";
	public final static String TEMPL_URL = "URL";
	public final static String TEMPL_MOBILEURL = "MOBILEURL";
	
	
	private IPSSysMsgTempl iPSSysMsgTempl = null;
	
	private StringTemplateLoader stringTemplateLoader = new StringTemplateLoader();
	private Configuration config = new Configuration();
	
	private String strContent = null;
	private	String strSubject = null;
	private String strIMContent = null;
	private String strSMSContent = null;
	private String strWXContent = null;
	private String strDDContent = null;
	private String strUrl = null;
	private String strMobileUrl = null;
	
	/**
	 * 获取消息模板的配置目录
	 * @param iPSSysMsgTarget
	 * @return
	 */
	public static String getConfigFolder(IPSSysMsgTempl iPSSysMsgTempl) {
		return ISystemRuntimeSetting.CONFIGFOLDER_SYSMSGTEMPL + "." + PSModelUtils.calcUniqueTag(iPSSysMsgTempl.getPSSystemModule(), iPSSysMsgTempl.getCodeName());
	}
	
	@Override
	public void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, IPSSysMsgTempl iPSSysMsgTempl) throws Exception {
		
		Assert.notNull(iSystemRuntimeBaseContext, "传入系统运行时上下文对象无效");
		Assert.notNull(iPSSysMsgTempl, "传入系统消息模板模型对象无效");
		
		this.setSystemRuntimeBaseContext(iSystemRuntimeBaseContext);
		this.iPSSysMsgTempl = iPSSysMsgTempl;
		
		this.setConfigFolder(getConfigFolder(iPSSysMsgTempl));
		
		this.setContent(this.getPSSysMsgTempl().getContent());
		this.setSubject(this.getPSSysMsgTempl().getSubject());
		this.setIMContent(this.getPSSysMsgTempl().getIMContent());
		this.setSMSContent(this.getPSSysMsgTempl().getSMSContent());
		this.setWXContent(this.getPSSysMsgTempl().getWXContent());
		this.setDDContent(this.getPSSysMsgTempl().getDDContent());
		this.setUrl(this.getPSSysMsgTempl().getTaskUrl());
		this.setMobileUrl(this.getPSSysMsgTempl().getMobTaskUrl());
		
		
		this.onInit();
	}
	
	@Override
	protected void onInit() throws Exception {
		if(isEnableFreeMarkerEngine()) {
			this.prepareFreeMarkerEngine();
		}
		super.onInit();
	}
	
	protected void prepareFreeMarkerEngine() throws Exception {
		if(StringUtils.hasLength(this.getContent())) {
			stringTemplateLoader.putTemplate(TEMPL_CONTENT, this.getContent());
		}
		
		if(StringUtils.hasLength(this.getSubject())) {
			stringTemplateLoader.putTemplate(TEMPL_SUBJECT, this.getSubject());
		}
		
		if(StringUtils.hasLength(this.getSMSContent())) {
			stringTemplateLoader.putTemplate(TEMPL_SMSCONTENT, this.getSMSContent());
		}
		
		if(StringUtils.hasLength(this.getIMContent())) {
			stringTemplateLoader.putTemplate(TEMPL_IMCONTENT, this.getIMContent());
		}
		
		if(StringUtils.hasLength(this.getWXContent())) {
			stringTemplateLoader.putTemplate(TEMPL_WXCONTENT, this.getWXContent());
		}
		
		if(StringUtils.hasLength(this.getDDContent())) {
			stringTemplateLoader.putTemplate(TEMPL_DDCONTENT, this.getDDContent());
		}
		
		if(StringUtils.hasLength(this.getUrl())) {
			stringTemplateLoader.putTemplate(TEMPL_URL, this.getUrl());
		}
		
		if(StringUtils.hasLength(this.getMobileUrl())) {
			stringTemplateLoader.putTemplate(TEMPL_MOBILEURL, this.getMobileUrl());
		}
		
		config.setTemplateLoader(stringTemplateLoader);
	}
	
	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSysMsgTempl();
	}

	protected boolean isEnableFreeMarkerEngine() {
		return true;
	}
	
	protected String getContent() {
		return strContent;
	}




	protected void setContent(String strContent) {
		this.strContent = strContent;
	}




	protected String getSubject() {
		return strSubject;
	}




	protected void setSubject(String strSubject) {
		this.strSubject = strSubject;
	}




	protected String getIMContent() {
		return strIMContent;
	}




	protected void setIMContent(String strIMContent) {
		this.strIMContent = strIMContent;
	}




	protected String getSMSContent() {
		return strSMSContent;
	}




	protected void setSMSContent(String strSMSContent) {
		this.strSMSContent = strSMSContent;
	}




	protected String getWXContent() {
		return strWXContent;
	}




	protected void setWXContent(String strWXContent) {
		this.strWXContent = strWXContent;
	}




	protected String getDDContent() {
		return strDDContent;
	}




	protected void setDDContent(String strDDContent) {
		this.strDDContent = strDDContent;
	}



	protected String getUrl() {
		return strUrl;
	}




	protected void setUrl(String strUrl) {
		this.strUrl = strUrl;
	}


	protected String getMobileUrl() {
		return strMobileUrl;
	}




	protected void setMobileUrl(String strMobileUrl) {
		this.strMobileUrl = strMobileUrl;
	}

	
	

	@Override
	public IPSSysMsgTempl getPSSysMsgTempl() {
		return this.iPSSysMsgTempl;
	}
	
	

	@Override
	public String getContentType() {
		return getPSSysMsgTempl().getContentType();
	}


	@Override
	public String getContent(IEntityBase iEntityBase) {
		if(!StringUtils.hasLength(this.getContent())) {
			return null;
		}
		return getTemplContent(TEMPL_CONTENT, iEntityBase);
	}


	@Override
	public String getSubject(IEntityBase iEntityBase) {
		if(!StringUtils.hasLength(this.getSubject())) {
			return null;
		}
		return getTemplContent(TEMPL_SUBJECT, iEntityBase);
	}


	@Override
	public String getSMSContent(IEntityBase iEntityBase) {
		if(!StringUtils.hasLength(this.getSMSContent())) {
			return null;
		}
		return getTemplContent(TEMPL_SMSCONTENT, iEntityBase);
	}


	@Override
	public String getWXContent(IEntityBase iEntityBase) {
		if(!StringUtils.hasLength(this.getWXContent())) {
			return null;
		}
		return getTemplContent(TEMPL_WXCONTENT, iEntityBase);
	}


	@Override
	public String getDDContent(IEntityBase iEntityBase) {
		if(!StringUtils.hasLength(this.getDDContent())) {
			return null;
		}
		return getTemplContent(TEMPL_DDCONTENT, iEntityBase);
	}


	@Override
	public String getIMContent(IEntityBase iEntityBase) {
		if(!StringUtils.hasLength(this.getIMContent())) {
			return null;
		}
		return getTemplContent(TEMPL_IMCONTENT, iEntityBase);
	}
	
	
	@Override
	public String getUrl(IEntityBase iEntityBase) {
		if(!StringUtils.hasLength(this.getUrl())) {
			return null;
		}
		return getTemplContent(TEMPL_URL, iEntityBase);
	}

	
	@Override
	public String getMobileUrl(IEntityBase iEntityBase) {
		if(!StringUtils.hasLength(this.getMobileUrl())) {
			return null;
		}
		return getTemplContent(TEMPL_MOBILEURL, iEntityBase);
	}

	
	
	protected String getTemplContent(String strType, IEntityBase iEntityBase) {
		return this.getTemplContent(strType, iEntityBase, null);
	}
	
	protected String getTemplContent(String strType, Object data, Map<String, Object> extParams) {
		
		Map<String, Object> params = new HashMap<String, Object>();
		if(extParams != null) {
			params.putAll(extParams);
		}
		
		this.onFillTemplParams(strType, data, params);
		
		if (data != null) {
			params.put("data", data);
			params.put("entity", data);
		}
		
		params.put("sys", this.getSystemRuntime().getSystemRTScriptContext());
		
		
		try {
			Template template = config.getTemplate(strType);
			StringWriter sw = new StringWriter();
			template.process(params, sw);
			String strContent = sw.toString();
			if(StringUtils.hasLength(strContent)) {
				strContent = strContent.toString();
			}
			return strContent;
		}
		catch(Exception ex) {
			log.error(String.format("获取模板内容发生异常，%1$s",ex.getMessage()),ex);
			return ex.getMessage();
		}
	}
	
	protected void onFillTemplParams(String strType, Object data, Map<String, Object> params) {
		
	}



	@Override
	public synchronized void reset() {
		try {
			onReset();
		}
		catch (Throwable ex) {
			log.error(String.format("重置消息模板发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onReset() throws Throwable {
		
	}
	
	
	@Override
	public String getId() {
		return getPSSysMsgTempl().getDynaModelFilePath();
	}

	@Override
	public String getName() {
		return getPSSysMsgTempl().getName();
	}

}
