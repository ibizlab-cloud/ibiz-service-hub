package net.ibizsys.central.plugin.ai.agent;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.TemplateNotFoundException;
import groovy.text.Template;
import net.ibizsys.central.cloud.core.ai.util.ChatCompletionRequestHolder;
import net.ibizsys.central.plugin.ai.util.template.AIAgentRTFreeMarkerContext;
import net.ibizsys.central.plugin.ai.util.template.AIChatUtilsFreeMarkerObject;
import net.ibizsys.central.plugin.ai.util.template.AIFactoryRTFreeMarkerObject;
import net.ibizsys.central.plugin.ai.util.template.SysServiceAPIFreeMarkerObject;
import net.ibizsys.central.plugin.ai.util.template.SystemRTFreeMarkerObject;
import net.ibizsys.central.plugin.ai.util.template.TemplateEntity;
import net.ibizsys.central.util.script.IScriptEntity;
import net.ibizsys.model.PSModelEnums.MsgTemplEngine;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.KeyValueUtils;

/**
 * 用户侧默认的AI交谈代理运行时对象基类
 *
 * @author lionlau
 *
 */
public abstract class DefaultSysAIChatAgentRuntimeBase extends net.ibizsys.central.cloud.core.ai.DefaultSysAIChatAgentRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DefaultSysAIChatAgentRuntimeBase.class);

	private StringTemplateLoader stringTemplateLoader = new StringTemplateLoader();
	private Configuration config = new Configuration();
	private AIFactoryRTFreeMarkerObject aiFactoryRTFreeMarkerObject = null;
	private AIAgentRTFreeMarkerContext aiAgentRTFreeMarkerContext = null;
	private SystemRTFreeMarkerObject systemRTFreeMarkerObject = null;
	private SysServiceAPIFreeMarkerObject sysServiceAPIFreeMarkerObject = null;

	@Override
	protected void onInit() throws Exception {
		
		if(MsgTemplEngine.FREEMARKER.value.equals(this.getPSModelObject().getTemplEngine())) {
			prepareFreeMarkerEnvironment();
		}
		
		super.onInit();
	}

	protected void prepareFreeMarkerEnvironment() throws Exception {

		this.aiFactoryRTFreeMarkerObject = new AIFactoryRTFreeMarkerObject(this.getAIFactoryRuntime());
		this.aiAgentRTFreeMarkerContext = this.createAIAgentRTFreeMarkerContext();
		this.systemRTFreeMarkerObject = new SystemRTFreeMarkerObject(this.getModelRuntimeContext());
		this.sysServiceAPIFreeMarkerObject = new SysServiceAPIFreeMarkerObject(this.getModelRuntimeContext(), null);

		if (StringUtils.hasLength(this.getPSModelObject().getSystemPrompt())) {
			stringTemplateLoader.putTemplate("templ_" + KeyValueUtils.genUniqueId(this.getPSModelObject().getSystemPrompt()), this.getPSModelObject().getSystemPrompt());
		}
		if (StringUtils.hasLength(this.getPSModelObject().getWelcomeMessage())) {
			stringTemplateLoader.putTemplate("templ_" + KeyValueUtils.genUniqueId(this.getPSModelObject().getWelcomeMessage()), this.getPSModelObject().getWelcomeMessage());
		}
		if (StringUtils.hasLength(this.getPSModelObject().getSuggestionPrompt())) {
			stringTemplateLoader.putTemplate("templ_" + KeyValueUtils.genUniqueId(this.getPSModelObject().getSuggestionPrompt()), this.getPSModelObject().getSuggestionPrompt());
		}

		if (ObjectUtils.isEmpty(this.getLongTermMemoryPrompt())) {
			this.setLongTermMemoryPrompt(net.ibizsys.runtime.util.ResourcesUtils.getInstance().getResourceContent(DefaultSysAIChatAgentRuntimeBase.class, "LongTermMemoryPrompt.en.md", false));
		}
		if (ObjectUtils.isEmpty(this.getDailyMemoryPrompt())) {
			this.setDailyMemoryPrompt(net.ibizsys.runtime.util.ResourcesUtils.getInstance().getResourceContent(DefaultSysAIChatAgentRuntimeBase.class, "DailyMemoryPrompt.en.md", false));
		}

		Set<String> templateSet = new HashSet<String>();
		this.fillStringTemplates(templateSet);

		for (String strTemplate : templateSet) {
			if (StringUtils.hasLength(strTemplate)) {
				stringTemplateLoader.putTemplate("templ_" + KeyValueUtils.genUniqueId(strTemplate), strTemplate);
			}
		}

		config.setTemplateLoader(stringTemplateLoader);
	}
	
	protected void fillStringTemplates(Set<String> set) {
		set.add(this.getLongTermMemoryPrompt());
		set.add(this.getDailyMemoryPrompt());
	}

	@Override
	protected ISysAIFactoryRuntimeContext getSysAIFactoryRuntimeContext() {
		return (ISysAIFactoryRuntimeContext) super.getSysAIFactoryRuntimeContext();
	}
	
	protected AIAgentRTFreeMarkerContext createAIAgentRTFreeMarkerContext() {
		return new AIAgentRTFreeMarkerContext(this.getModelRuntimeContext());
	}

	protected String getHistoriesConfigId() throws Throwable {
		return null;
	}

	@Override
	protected String getSystemMessagesConfigId() throws Throwable {
		return null;
	}

	@Override
	protected String getSuggestionMessagesConfigId() throws Throwable {
		return null;
	}

	protected String getToolsConfigId() throws Throwable {
		return null;
	}

	@Override
	protected String getInfoConfigId() throws Throwable {
		return null;
	}

	@Override
	protected String getDigestMessageConfigId() throws Throwable {
		return null;
	}

	@Override
	protected String getRawContent(Object data, String strTemplateContent, Map<String, Object> params) throws Throwable {
		String strTemplateId = "templ_" + KeyValueUtils.genUniqueId(strTemplateContent);
		return this.getContent(data, strTemplateId, params);
	}

	@Override
	protected List getActiveData(Object dataOrKeys) throws Throwable {
		List list = super.getActiveData(dataOrKeys);
		if (!ObjectUtils.isEmpty(list)) {
			List<TemplateEntity> templateEntityList = new ArrayList<TemplateEntity>();
			for (Object item : list) {
				IScriptEntity scriptEntity = (IScriptEntity) this.getSystemRuntime().createScriptEntity((IEntity) item);
				TemplateEntity templateEntity = new TemplateEntity(scriptEntity);
				templateEntityList.add(templateEntity);
			}
			return templateEntityList;
		}
		return list;
	}

	@Override
	protected String getContent(Object data, Template template, Map<String, Object> params) throws Throwable {
		if(!MsgTemplEngine.FREEMARKER.value.equals(this.getPSModelObject().getTemplEngine())) {
			return super.getContent(data, template, params);
		}
		throw new Exception("不支持Groovy模板");
	}

	@Override
	protected String getContent(Object data, String strTemplateId, Map<String, Object> params, boolean bTryMode) throws Throwable {
		
		if(!MsgTemplEngine.FREEMARKER.value.equals(this.getPSModelObject().getTemplEngine())) {
			return super.getContent(data, strTemplateId, params, bTryMode);
		}
		
		freemarker.template.Template template = null;
		try {
			template = config.getTemplate(strTemplateId);
		} catch (Exception ex) {
			if (ex instanceof TemplateNotFoundException) {
				if (bTryMode)
					return null;
			}
			throw new Exception(String.format("获取指定模板[%1$s]发生异常，%2$s", strTemplateId, ex.getMessage()), ex);
		}

		Map<String, Object> engineParams = new HashMap<String, Object>();
		if (params != null) {
			engineParams.putAll(params);
		}
		engineParams.put(TEMPLATE_PARAM_DATA, data);
		engineParams.put(TEMPLATE_PARAM_CTX, this.aiAgentRTFreeMarkerContext);
		engineParams.put(TEMPLATE_PARAM_FACTORY, this.aiFactoryRTFreeMarkerObject);
		// engineParams.put(TEMPLATE_PARAM_SYS, this.getSystemRuntime());
		if (this.getDataEntityRuntime() != null) {
			// engineParams.put(TEMPLATE_PARAM_DE, this.getDataEntityRuntime());
		} else {
			engineParams.put(TEMPLATE_PARAM_DE, null);
		}

		engineParams.put(TEMPLATE_PARAM_REQUEST, ChatCompletionRequestHolder.peek());
		engineParams.put(TEMPLATE_PARAM_UTILS, AIChatUtilsFreeMarkerObject.getInstance());
		engineParams.put(TEMPLATE_PARAM_SYS, this.systemRTFreeMarkerObject);
		engineParams.put(TEMPLATE_PARAM_API, this.sysServiceAPIFreeMarkerObject);

		try {
			StringWriter sw = new StringWriter();
			template.process(engineParams, sw);
			String strContent = sw.toString();
			return strContent;
		} catch (Exception ex) {
			log.error(String.format("获取模板内容发生异常，%1$s", ex.getMessage()), ex);
			return ex.getMessage();
		}
	}
	
	
	/**
	 * 获取旧版GROOVY模板内容
	 * @param data
	 * @param strTemplateId
	 * @param params
	 * @param bTryMode
	 * @return
	 * @throws Throwable
	 */
	protected String getGroovyContent(Object data, String strTemplateId, Map<String, Object> params, boolean bTryMode) throws Throwable {
		return super.getContent(data, strTemplateId, params, bTryMode);
	}
	
	/**
	 * 获取旧版GROOVY模板内容
	 * @param data
	 * @param template
	 * @param params
	 * @return
	 * @throws Throwable
	 */
	protected String getGroovyContent(Object data, Template template, Map<String, Object> params) throws Throwable {
		return super.getContent(data, template, params);
	}
}
