package net.ibizsys.central.plugin.ai.agent;

import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.util.StringUtils;

import groovy.text.GStringTemplateEngine;
import groovy.text.Template;
import net.ibizsys.central.cloud.core.cloudutil.ICloudAIUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysAIUtilRuntime;
import net.ibizsys.central.plugin.ai.addin.SysAIFactoryUtilRTAddinBase;
import net.ibizsys.central.plugin.ai.sysutil.ISysAIFactoryUtilRuntimeContext;

public abstract class AIAgentBase extends SysAIFactoryUtilRTAddinBase implements IAIAgent{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(AIAgentBase.class);
	
	/**
	 * 模板上下文参数：当前数据
	 */
	public final static String TEMPLATE_PARAM_DATA = "data";

	/**
	 * 模板上下文参数：上下文对象
	 */
	public final static String TEMPLATE_PARAM_CTX = "ctx";
	
	private String strAgentMode = null;
	private String strConfigPath = null;
	private String strAIPlatformType = ICloudAIUtilRuntime.AIPLATFORM_DEFAULT;
	private ISysAIUtilRuntime iSysAIUtilRuntime = null;
	
	private Map<String, String> configAliasMap = new HashMap<String, String>();
	private Map<String, String> configContentMap = new HashMap<String, String>();
	private static GStringTemplateEngine engine = new GStringTemplateEngine();
	private Map<String, Template> defaultTemplateCacheMap = new ConcurrentHashMap<String, Template>();
	
	
	
	@Override
	public void init(ISysAIFactoryUtilRuntimeContext ctx, Object addinData, String strAgentMode) throws Exception {
		this.strAgentMode = strAgentMode;
		super.init(ctx, addinData);
	}
	
	@Override
	protected void onInit() throws Exception {
		if (!StringUtils.hasLength(this.getConfigPath())) {
			this.setConfigPath(String.format("%1$s%2$s%3$s", this.getAgentType(), "/", this.getAgentMode()).toLowerCase());
		}
		
		super.onInit();
	}
	
	protected ISysAIUtilRuntime getSysAIUtilRuntime() {
		if (this.iSysAIUtilRuntime == null) {
			this.iSysAIUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysAIUtilRuntime.class, false);
		}
		return this.iSysAIUtilRuntime;
	}

	@Override
	public String getAgentMode() {
		return this.strAgentMode;
	}

	public String getConfigPath() {
		return strConfigPath;
	}

	protected void setConfigPath(String strConfigPath) {
		this.strConfigPath = strConfigPath;
	}

	/**
	 * 获取AI平台类型
	 * @return
	 */
	public String getAIPlatformType() {
		return strAIPlatformType;
	}
	
	protected void setAIPlatformType(String strAIPlatformType) {
		this.strAIPlatformType = strAIPlatformType;
	}
	
	protected abstract IAIAgentContext getAIAgentContext();
	
	protected String getContent(Object data, String strTemplateId, Map<String, Object> params) throws Throwable{
		return this.getContent(data, strTemplateId, params, false);
	}
	
	protected String getContent(Object data, String strTemplateId, Map<String, Object> params, boolean bTryMode) throws Throwable{

		Template template = this.getTemplate(strTemplateId, bTryMode);
		if(template == null) {
			return null;
		}

		Map<String, Object> engineParams = new HashMap<String, Object>();
		if (params != null) {
			engineParams.putAll(params);
		}
		engineParams.put(TEMPLATE_PARAM_DATA, data);
		engineParams.put(TEMPLATE_PARAM_CTX, this.getAIAgentContext());

		StringWriter sw = new StringWriter();
		template.make(engineParams).writeTo(sw);

		return sw.toString();
	}
	
	protected Template getTemplate(String strTemplateId, boolean bTryMode) throws Throwable {
		if (isEnableTemplateCache()) {
			Template template = getTemplateCacheMap().get(strTemplateId);
			if (template == null) {
				String strTemplateContent = this.getTemplateContent(strTemplateId, bTryMode);
				if(!StringUtils.hasLength(strTemplateContent)) {
					return null;
				}
				StringReader reader = new StringReader(strTemplateContent);
				template = engine.createTemplate(reader);
				this.getTemplateCacheMap().put(strTemplateId, template);
			}
			return template;
		} else {
			String strTemplateContent = this.getTemplateContent(strTemplateId, bTryMode);
			if(!StringUtils.hasLength(strTemplateContent)) {
				return null;
			}
			StringReader reader = new StringReader(strTemplateContent);
			return engine.createTemplate(reader);
		}
	}
	
	/**
	 * 获取模板内容
	 * 
	 * @param strTemplateId
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	protected String getTemplateContent(String strTemplateId, boolean bTryMode) throws Throwable {
		String strContent = this.configContentMap.get(strTemplateId);
		if(strContent!=null && strContent.length() == 0){
			if(!bTryMode) {
				throw new Exception(String.format("指定配置[%1$s]不存在", strTemplateId));
			}
			return null;
		}
		
		String strFullConfigId = String.format("%1$s%2$s%3$s", this.getConfigPath(), File.separator, strTemplateId);
		
		strContent = this.getContext().getConfigContent(null, strFullConfigId, true);
		if(!StringUtils.hasLength(strContent)) {
			strContent = "";
		}
		this.configContentMap.put(strTemplateId, strContent);
		if(strContent!=null && strContent.length() == 0){
			if(!bTryMode) {
				throw new Exception(String.format("指定配置[%1$s]不存在", strFullConfigId));
			}
			return null;
		}
		return strContent;
	}
	
	

	protected Map<String, Template> getTemplateCacheMap() {
		return this.defaultTemplateCacheMap;
	}
	
	protected void registerConfigAlias(String strAlias, String strConfigId) {
		this.configAliasMap.put(strAlias, strConfigId);
	}

	protected boolean unregisterConfigAlias(String strAlias, String strConfigId) {
		return this.configAliasMap.remove(strAlias, strConfigId);
	}

	protected String getRealConfigId(String strConfigId) {
		String strRealConfigId = this.configAliasMap.get(strConfigId);
		if (StringUtils.hasLength(strRealConfigId)) {
			return strRealConfigId;
		}
		return strConfigId;
	}

	protected boolean isEnableTemplateCache() {
		return true;
	}
}
