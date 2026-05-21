package net.ibizsys.central.cloud.core.ai;

import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.ibizsys.runtime.util.JsonUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;
import net.ibizsys.central.cloud.core.dataentity.logic.IDEAIChatLogicRuntimeBase;
import net.ibizsys.central.cloud.core.dataentity.logic.IDELogicRuntime;
import net.ibizsys.central.cloud.core.dataentity.util.IDEExtensionUtilRuntime;
import net.ibizsys.central.cloud.core.util.ChatMessagesBuilder;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.msg.ISysMsgTemplRuntime;
import net.ibizsys.model.ai.PSSysAIChatAgentImpl;
import net.ibizsys.model.dataentity.logic.IPSDEBeginLogic;
import net.ibizsys.model.dataentity.logic.IPSDELogicParam;
import net.ibizsys.model.dataentity.logic.PSDELogicImpl;
import net.ibizsys.runtime.util.KeyValueUtils;

public abstract class DESysAIChatAgentRuntimeBase extends SysAIChatAgentRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DESysAIChatAgentRuntimeBase.class);
	private IDEExtensionUtilRuntime iDEExtensionUtilRuntime = null;

	@Override
	protected void onInit() throws Exception {

		this.getPSModelObject().getPSDELogicMust();

		super.onInit();

		if(this.getDataEntityRuntime() == null) {
			throw new Exception("实体运行时无效");
		}
		if (this.getDataEntityRuntime().isEnableExtension() && this.getDataEntityRuntime().getDEExtensionUtilRuntime() != null) {
			this.iDEExtensionUtilRuntime = this.getDataEntityRuntime().getDEExtensionUtilRuntime();
		}
	}

	public IDataEntityRuntime getDataEntityRuntime() {
		return (IDataEntityRuntime) super.getDataEntityRuntime();
	}

	protected IDEExtensionUtilRuntime getDEExtensionUtilRuntime() {
		return this.iDEExtensionUtilRuntime;
	}
	@Override
	protected String getHistoriesConfigId() throws Throwable {
		return String.format("template%1$s%2$s.%3$s.xml.tpl", File.separator, this.getAgentMode(), "history").toLowerCase();
	}

	@Override
	protected String getSystemMessagesConfigId() throws Throwable {
		return String.format("template%1$s%2$s.%3$s.xml.tpl", File.separator, this.getAgentMode(), "system").toLowerCase();
	}

	@Override
	protected String getSuggestionMessagesConfigId() throws Throwable {
		return String.format("template%1$s%2$s.%3$s.xml.tpl", File.separator, this.getAgentMode(), "suggestion").toLowerCase();
	}

	protected String getToolsConfigId() throws Throwable {
		return String.format("template%1$s%2$s.%3$s.json.tpl", File.separator, this.getAgentMode(), "tools").toLowerCase();
	}

	@Override
	protected String getDigestMessageConfigId() throws Throwable {
		return String.format("template%1$s%2$s.%3$s.md.tpl", File.separator, this.getAgentMode(), "digest").toLowerCase();
	}

	@Override
	protected List<ChatMessage> onGetHistories(Object dataOrKeys, Object body, Map<String, Object> params) throws Throwable {
		IDELogicRuntime iDELogicRuntime = (IDELogicRuntime) this.getDataEntityRuntime().getDELogicRuntime(this.getPSModelObject().getPSDELogicMust());
		ObjectNode objectNode = this.getPSModelObject().getObjectNode();
		String codeName = objectNode
				.path(PSSysAIChatAgentImpl.ATTR_GETPSDELOGIC)
				.path(PSDELogicImpl.ATTR_GETCODENAME)
				.asText();
		//动态模式
		if (!ObjectUtils.isEmpty(codeName) && codeName.indexOf("@") != -1) {
			if (getDEExtensionUtilRuntime() != null) {
				String logicTag = String.format("%1$s@%2$s", this.getPSModelObject().getCodeName(), iDELogicRuntime.getFullUniqueTag());
				if (getDEExtensionUtilRuntime().getAIChatDELogicRuntime(logicTag, false, true) != null) {
					iDELogicRuntime = (IDELogicRuntime) getDEExtensionUtilRuntime().getAIChatDELogicRuntime(logicTag, false, true);
				}
			}
		}
		if(body instanceof Map) {
			String sessionId = (String)((Map)body).get(ChatCompletionRequest.FIELD_SESSIONID);
			if(StringUtils.hasLength(sessionId)) {
				//重置聊天聊天会话
				iDELogicRuntime.resetChatCompletion(sessionId);
			}
		}

		if(iDELogicRuntime.getPSDELogic().getStartPSDELogicNode() instanceof IPSDEBeginLogic) {
			IPSDEBeginLogic iPSDEBeginLogic = (IPSDEBeginLogic)iDELogicRuntime.getPSDELogic().getStartPSDELogicNode();
			String strWelcomeMessage = getWelcomeMessage(iDELogicRuntime, iPSDEBeginLogic, dataOrKeys, body);
			if(StringUtils.hasLength(strWelcomeMessage)) {
				List<ChatMessage> list = new ArrayList<ChatMessage>();
				ChatMessagesBuilder chatMessagesBuilder = ChatMessagesBuilder.create().xml(strWelcomeMessage);
				list = chatMessagesBuilder.build(list);
				if(ObjectUtils.isEmpty(list)) {
					chatMessagesBuilder.assistant(strWelcomeMessage);
					list = chatMessagesBuilder.build(list);
				}
				return list;
			}
		}

		return super.onGetHistories(dataOrKeys, body, params);
	}

	protected String getWelcomeMessage(IDELogicRuntime iDELogicRuntime, IPSDEBeginLogic iPSDEBeginLogic, Object dataOrKeys, Object body) throws Throwable {
		if(!StringUtils.hasLength(iPSDEBeginLogic.getMessage()) && iPSDEBeginLogic.getPSSysMsgTempl() == null) {
			return null;
		}

		Map<String, Object>params = new HashMap<String, Object>();
		params.put("logic", iDELogicRuntime);
		params.put("node", iPSDEBeginLogic);
		params.put("body", body);
		String strContent = null;
		if(iPSDEBeginLogic.getPSSysMsgTempl() != null) {
			//存在定义消息模板
			ISysMsgTemplRuntime iSysMsgTemplRuntime = (ISysMsgTemplRuntime)this.getSystemRuntime().getSysMsgTemplRuntime(iPSDEBeginLogic.getPSSysMsgTemplMust());
			strContent = iSysMsgTemplRuntime.getContent(getActiveData(dataOrKeys), params);
		}
		else {
			String strTemplate = iPSDEBeginLogic.getMessage();
			StringTemplateLoader stringTemplateLoader = new StringTemplateLoader();
			Configuration config = new Configuration();
			String strTemplateId = "templ_" + KeyValueUtils.genUniqueId(strTemplate);
			stringTemplateLoader.putTemplate(strTemplateId, strTemplate);
			config.setTemplateLoader(stringTemplateLoader);

			Map<String, Object> engineParams = new HashMap<String, Object>();
			if (params != null) {
				engineParams.putAll(params);
			}

			try {
				freemarker.template.Template template = config.getTemplate(strTemplateId);
				StringWriter sw = new StringWriter();
				template.process(engineParams, sw);
				strContent = sw.toString();
				return strContent;
			} catch (Exception ex) {
				log.error(String.format("获取模板内容发生异常，%1$s", ex.getMessage()), ex);
				return ex.getMessage();
			}
		}
		return strContent;
	}

	@Override
	protected PortalAsyncAction onAsyncChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {

		Object data = this.getActiveData(dataOrKeys);
		this.fillChatCompletionKnowledgeBases(chatCompletionRequest);
		Map<String, Object> extParams = new HashMap<String, Object>();
		ChatCompletionRequest chatCompletionRequest2 = JsonUtils.as(JsonUtils.toString(chatCompletionRequest), ChatCompletionRequest.class);

		extParams.put(IDEAIChatLogicRuntimeBase.DELOGIC_AICHAT_PARAM_ACTION, IDEAIChatLogicRuntimeBase.DELOGIC_AICHAT_ACTION_ASYNCCHATCOMPLETION);
		extParams.put(IDEAIChatLogicRuntimeBase.DELOGIC_AICHAT_PARAM_CHATREQUEST, chatCompletionRequest2);
		extParams.put(IDEAIChatLogicRuntimeBase.DELOGIC_AICHAT_PARAM_DATA, data);
		IDELogicRuntime iDELogicRuntime = (IDELogicRuntime) this.getDataEntityRuntime().getDELogicRuntime(this.getPSModelObject().getPSDELogicMust());
		ObjectNode objectNode = this.getPSModelObject().getObjectNode();
		String codeName = objectNode
				.path(PSSysAIChatAgentImpl.ATTR_GETPSDELOGIC)
				.path(PSDELogicImpl.ATTR_GETCODENAME)
				.asText();
		//动态模式
		if (!ObjectUtils.isEmpty(codeName) && codeName.indexOf("@") != -1) {
			if (getDEExtensionUtilRuntime() != null) {
				String logicTag = String.format("%1$s@%2$s", this.getPSModelObject().getCodeName(), iDELogicRuntime.getFullUniqueTag());
				if (getDEExtensionUtilRuntime().getAIChatDELogicRuntime(logicTag, false, true) != null) {
					iDELogicRuntime = (IDELogicRuntime) getDEExtensionUtilRuntime().getAIChatDELogicRuntime(logicTag, false, true);
					// 进入动态交谈逻辑后置空路由tag
					chatCompletionRequest2.reset(AIAGENTTAG);
				}
			}
		}
		
		//获取默认参数
		if(!ObjectUtils.isEmpty(iDELogicRuntime.getPSDELogic().getPSDELogicParams())) {
			IPSDELogicParam defaultPSDELogicParam = null;
			for(IPSDELogicParam iPSDELogicParam : iDELogicRuntime.getPSDELogic().getPSDELogicParams()) {
				if(iPSDELogicParam.isDefault()) {
					defaultPSDELogicParam = iPSDELogicParam;
					break;
				}
			}

			if(defaultPSDELogicParam != null && defaultPSDELogicParam.isChatCompletionRequestParam()) {
				data = chatCompletionRequest2;
			}
		}


		Object ret = this.getDataEntityRuntime().executeLogic(iDELogicRuntime, new Object[] {data, extParams});
		if(ret instanceof PortalAsyncAction) {
			return (PortalAsyncAction)ret;
		}
		if(ret instanceof ChatCompletionRequest) {
			return super.onAsyncChatCompletion(dataOrKeys, (ChatCompletionRequest)ret, params, bAppendSystemMessage, bAppendHistories);
		}

		throw new Exception(String.format("未支持的返回值[%1$s]", ret));
		//return super.onAsyncChatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
	}


	@Override
	protected ChatCompletionResult onChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {
		Object data = this.getActiveData(dataOrKeys);
		this.fillChatCompletionKnowledgeBases(chatCompletionRequest);
		
		Map<String, Object> extParams = new HashMap<String, Object>();
		ChatCompletionRequest chatCompletionRequest2 = JsonUtils.as(JsonUtils.toString(chatCompletionRequest), ChatCompletionRequest.class);

		extParams.put(IDEAIChatLogicRuntimeBase.DELOGIC_AICHAT_PARAM_ACTION, IDEAIChatLogicRuntimeBase.DELOGIC_AICHAT_ACTION_CHATCOMPLETION);
		extParams.put(IDEAIChatLogicRuntimeBase.DELOGIC_AICHAT_PARAM_CHATREQUEST, chatCompletionRequest2);
		extParams.put(IDEAIChatLogicRuntimeBase.DELOGIC_AICHAT_PARAM_DATA, data);
		IDELogicRuntime iDELogicRuntime = (IDELogicRuntime) this.getDataEntityRuntime().getDELogicRuntime(this.getPSModelObject().getPSDELogicMust());
		ObjectNode objectNode = this.getPSModelObject().getObjectNode();
		String codeName = objectNode
				.path(PSSysAIChatAgentImpl.ATTR_GETPSDELOGIC)
				.path(PSDELogicImpl.ATTR_GETCODENAME)
				.asText();
		//动态模式
		if (!ObjectUtils.isEmpty(codeName) && codeName.indexOf("@") != -1) {
			if (getDEExtensionUtilRuntime() != null) {
				String logicTag = String.format("%1$s@%2$s", this.getPSModelObject().getCodeName(), iDELogicRuntime.getFullUniqueTag());
				if (getDEExtensionUtilRuntime().getAIChatDELogicRuntime(logicTag, false, true) != null) {
					iDELogicRuntime = (IDELogicRuntime) getDEExtensionUtilRuntime().getAIChatDELogicRuntime(logicTag, false, true);
					chatCompletionRequest2.reset(AIAGENTTAG);
				}
			}
		}
		if(!ObjectUtils.isEmpty(iDELogicRuntime.getPSDELogic().getPSDELogicParams())) {
			IPSDELogicParam defaultPSDELogicParam = null;
			for(IPSDELogicParam iPSDELogicParam : iDELogicRuntime.getPSDELogic().getPSDELogicParams()) {
				if(iPSDELogicParam.isDefault()) {
					defaultPSDELogicParam = iPSDELogicParam;
					break;
				}
			}

			if(defaultPSDELogicParam != null && defaultPSDELogicParam.isChatCompletionRequestParam()) {
				data = chatCompletionRequest2;
			}
		}
		Object ret = this.getDataEntityRuntime().executeLogic(iDELogicRuntime, new Object[] {data, extParams});
		if(ret instanceof ChatCompletionResult) {
			return (ChatCompletionResult)ret;
		}
		if(ret instanceof ChatCompletionRequest) {
			return super.onChatCompletion(dataOrKeys, (ChatCompletionRequest)ret, params, bAppendSystemMessage, bAppendHistories);
		}

		throw new Exception(String.format("未支持的返回值[%1$s]", ret));
		//return super.onChatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
	}

	@Override
	protected void onCancelChatCompletion(Object dataOrKeys, String asyncActionId, Object body) throws Throwable {
		IDELogicRuntime iDELogicRuntime = (IDELogicRuntime) this.getDataEntityRuntime().getDELogicRuntime(this.getPSModelObject().getPSDELogicMust());
		ObjectNode objectNode = this.getPSModelObject().getObjectNode();
		String codeName = objectNode
				.path(PSSysAIChatAgentImpl.ATTR_GETPSDELOGIC)
				.path(PSDELogicImpl.ATTR_GETCODENAME)
				.asText();
		//动态模式
		if (!ObjectUtils.isEmpty(codeName) && codeName.indexOf("@") != -1) {
			if (getDEExtensionUtilRuntime() != null) {
				String logicTag = String.format("%1$s@%2$s", this.getPSModelObject().getCodeName(), iDELogicRuntime.getFullUniqueTag());
				if (getDEExtensionUtilRuntime().getAIChatDELogicRuntime(logicTag, false, true) != null) {
					iDELogicRuntime = (IDELogicRuntime) getDEExtensionUtilRuntime().getAIChatDELogicRuntime(logicTag, false, true);
				}
			}
		}
		iDELogicRuntime.cancelChatCompletion(asyncActionId);
	}

}
