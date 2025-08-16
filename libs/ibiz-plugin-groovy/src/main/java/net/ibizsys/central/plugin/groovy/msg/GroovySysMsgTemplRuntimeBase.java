package net.ibizsys.central.plugin.groovy.msg;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import groovy.text.Template;
import net.ibizsys.central.cloud.core.msg.SysMsgTemplRuntimeBase;

public abstract class GroovySysMsgTemplRuntimeBase extends SysMsgTemplRuntimeBase {

	private static final Log log = LogFactory.getLog(GroovySysMsgTemplRuntimeBase.class);

	private Map<String, Template> templateCacheMap = new ConcurrentHashMap<String, Template>();
	//private ThreadLocal<Map<String, Template>> templateCacheMapThreadLocal = new ThreadLocal<Map<String, Template>>();
	//private static GStringTemplateEngine engine = new GStringTemplateEngine();
	
	@Override
	protected boolean isEnableFreeMarkerEngine() {
		return false;
	}
	
	
	@Override
	protected void onInit() throws Exception {
		
		super.onInit();
	}
	
	
	

	protected Template getTemplate(String strTemplateId) throws Exception {
		if (isEnableTemplateCache()) {
			Template template = getTemplateCacheMap().get(strTemplateId);
			if (template == null) {
				String strTemplateContent = this.getTemplateContent(strTemplateId, false);
				template = this.getSystemRuntime().getGroovyTemplate(strTemplateContent);
				this.getTemplateCacheMap().put(strTemplateId, template);
			}
			return template;
		} else {
			String strTemplateContent = this.getTemplateContent(strTemplateId, false);
			return this.getSystemRuntime().getGroovyTemplate(strTemplateContent);
		}
	}

	protected boolean isEnableTemplateCache() {
		return true;
	}

	protected void resetDefaultTemplateCache() {
		this.templateCacheMap.clear();
	}

	protected Map<String, Template> getTemplateCacheMap() {
		return this.templateCacheMap;
	}

	protected String getTemplContent(String strType, Object data, Map<String, Object> extParams) {

		Map<String, Object> params = new HashMap<String, Object>();
		if (extParams != null) {
			params.putAll(extParams);
		}
		if (data != null) {
			params.put("data", data);
			params.put("entity", data);
		}
		params.put("sys", this.getSystemRuntime());

		try {

			Template template = this.getTemplate(strType);

			StringWriter sw = new StringWriter();
			template.make(params).writeTo(sw);

			return sw.toString();

		} catch (Exception ex) {
			log.error(String.format("获取模板内容发生异常，%1$s", ex.getMessage()), ex);
			return ex.getMessage();
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
	protected String getTemplateContent(String strTemplateId, boolean bTryMode) throws Exception {
		
		switch(strTemplateId) {
		case TEMPL_CONTENT:
			return this.getContent();
		case TEMPL_SUBJECT:
			return this.getSubject();
		case TEMPL_SMSCONTENT:
			return this.getSMSContent();
		case TEMPL_IMCONTENT:
			return this.getIMContent();
		case TEMPL_WXCONTENT:
			return this.getWXContent();
			
		case TEMPL_DDCONTENT:
			return this.getDDContent();
		case TEMPL_URL:
			return this.getUrl();
		case TEMPL_MOBILEURL:
			return this.getMobileUrl();
		default:
			if (bTryMode) {
				return null;
			}
			throw new Exception(String.format("指定模板[%1$s]不存在", strTemplateId));
		
		}

	}
	
	@Override
	protected void onReset() throws Throwable {
		resetDefaultTemplateCache();
		super.onReset();
	}
}
