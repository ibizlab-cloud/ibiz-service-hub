package net.ibizsys.central.plugin.groovy.sysutil;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import groovy.text.GStringTemplateEngine;
import groovy.text.Template;
import net.ibizsys.central.res.ISysFileResourceRuntime;
import net.ibizsys.central.res.ISysSCMResourceRuntime;
import net.ibizsys.central.sysutil.SysCodeGenUtilRuntimeBase;

public abstract class GroovySysCodeGenUtilRuntimeBase extends SysCodeGenUtilRuntimeBase{
	
	private static final Log log = LogFactory.getLog(GroovySysCodeGenUtilRuntimeBase.class);
	
	private static GStringTemplateEngine engine = new GStringTemplateEngine();
	private Map<String, Template> defaultTemplateCacheMap = new ConcurrentHashMap<String, Template>();
	private ThreadLocal<Map<String, Template>> templateCacheMapThreadLocal = new ThreadLocal<Map<String,Template>>();
	

	@Override
	protected void onInit() throws Exception {
		super.onInit();
	}

	@Override
	public String getContent(Object data, String strTemplateId, Map<String, Object> params) throws Exception {

		Template template = this.getTemplate(strTemplateId);

		Map<String, Object> engineParams = new HashMap<String, Object>();
		if(params != null) {
			engineParams.putAll(params);
		}
		engineParams.put("data", data);

		engineParams.put("ctx", this.getContext());

		StringWriter sw = new StringWriter();
		template.make(engineParams).writeTo(sw);

		return sw.toString();
	}

	protected Template getTemplate(String strTemplateId) throws Exception {
		if (isEnableTemplateCache()) {
			Template template = getTemplateCacheMap().get(strTemplateId);
			if (template == null) {
				String strTemplateContent = this.getTemplateContent(strTemplateId, false);
				StringReader reader = new StringReader(strTemplateContent);
				template = engine.createTemplate(reader);
				this.getTemplateCacheMap().put(strTemplateId, template);
			}
			return template;
		} else {
			String strTemplateContent = this.getTemplateContent(strTemplateId, false);
			StringReader reader = new StringReader(strTemplateContent);
			return engine.createTemplate(reader);
		}
	}

	protected boolean isEnableTemplateCache() {
		return true;
	}
	
	
	protected void resetDefaultTemplateCache() {
		this.defaultTemplateCacheMap.clear();
	}
	
	protected Map<String, Template> getTemplateCacheMap() {
		return this.templateCacheMapThreadLocal.get();
	}
	
	protected void setTemplateCacheMap(Map<String, Template> map) {
		this.templateCacheMapThreadLocal.set(map);
	}
	
	@Override
	protected void onGenerate(Object target, Map<String, Object> params) throws Throwable {
		
		Map<String, Template> lastTemplateCacheMap = this.getTemplateCacheMap();
		try {
			this.setTemplateCacheMap(this.defaultTemplateCacheMap);
			ISysFileResourceRuntime templSysFileResourceRuntime = this.getTemplSysFileResourceRuntime(true);
			if(templSysFileResourceRuntime instanceof ISysSCMResourceRuntime) {
				ISysSCMResourceRuntime iSysSCMResourceRuntime = (ISysSCMResourceRuntime)templSysFileResourceRuntime;
				iSysSCMResourceRuntime.checkout(target);
				this.setTemplateCacheMap(new HashMap<String, Template>());
			}
			super.onGenerate(target, params);
		}
		finally {
			this.setTemplateCacheMap(lastTemplateCacheMap);
		}
	}
}
