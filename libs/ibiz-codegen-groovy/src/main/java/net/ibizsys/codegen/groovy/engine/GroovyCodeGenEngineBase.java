package net.ibizsys.codegen.groovy.engine;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import groovy.text.GStringTemplateEngine;
import groovy.text.Template;
import net.ibizsys.codegen.core.engine.CodeGenEngineBase;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.IPSObject;
import net.ibizsys.model.IPSSystem;

public abstract class GroovyCodeGenEngineBase extends CodeGenEngineBase {

	private static final Log log = LogFactory.getLog(GroovyCodeGenEngineBase.class);
	private GStringTemplateEngine engine = new GStringTemplateEngine();
	private Map<String, Template> templateCacheMap = new ConcurrentHashMap<String, Template>();

	@Override
	protected void onInit() throws Exception {
		super.onInit();
	}

	@Override
	public String getContent(IPSObject iPSObject, String strTemplateId, Map<String, Object> extparams) throws Exception {

		Template template = this.getTemplate(strTemplateId);

		Map<String, Object> params = new HashMap<String, Object>();
		if(extparams!=null) {
			extparams.putAll(params);
		}
		params.put("item", iPSObject);
		IPSSystem iPSSystem = null;

		if (iPSObject instanceof IPSSystem) {
			iPSSystem = (IPSSystem) iPSObject;
		} else {
			if (iPSObject instanceof IPSModelObject) {
				iPSSystem = ((IPSModelObject) iPSObject).getParentPSModelObject(IPSSystem.class, false);
			}
		}

		params.put("sys", iPSSystem);
		params.put("ctx", this.getContext());

		StringWriter sw = new StringWriter();
		template.make(params).writeTo(sw);

		return sw.toString();
	}

	protected Template getTemplate(String strTemplateId) throws Exception {
		if (isEnableTemplateCache()) {
			Template template = templateCacheMap.get(strTemplateId);
			if (template == null) {
				String strTemplateContent = this.getTemplateContent(strTemplateId, false);
				StringReader reader = new StringReader(strTemplateContent);
				template = engine.createTemplate(reader);
				this.templateCacheMap.put(strTemplateId, template);
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

}
