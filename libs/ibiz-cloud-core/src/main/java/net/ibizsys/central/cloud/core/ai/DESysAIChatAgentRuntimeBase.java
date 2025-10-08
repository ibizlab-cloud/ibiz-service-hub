package net.ibizsys.central.cloud.core.ai;

import java.io.File;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.StringUtils;

import groovy.text.Template;
import net.ibizsys.central.cloud.core.dataentity.logic.IDELogicRuntime;
import net.ibizsys.central.cloud.core.util.ChatMessagesBuilder;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;

import net.ibizsys.central.msg.ISysMsgTemplRuntime;
import net.ibizsys.model.dataentity.logic.IPSDEBeginLogic;

public abstract class DESysAIChatAgentRuntimeBase extends SysAIChatAgentRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DESysAIChatAgentRuntimeBase.class);
	
	@Override
	protected void onInit() throws Exception {
		
		this.getPSModelObject().getPSDELogicMust();
		
		super.onInit();
		
		if(this.getDataEntityRuntime() == null) {
			throw new Exception("实体运行时无效");
		}
		
	}
	
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
	protected List<ChatMessage> onGetHistories(Object dataOrKeys, Object body, Map<String, Object> params) throws Throwable {

		IDELogicRuntime iDELogicRuntime = (IDELogicRuntime)this.getDataEntityRuntime().getDELogicRuntime(this.getPSModelObject().getPSDELogicMust());
		if(iDELogicRuntime.getPSDELogic().getStartPSDELogicNode() instanceof IPSDEBeginLogic) {
			IPSDEBeginLogic iPSDEBeginLogic = (IPSDEBeginLogic)iDELogicRuntime.getPSDELogic().getStartPSDELogicNode();
			String strWelcomeMessage = getWelcomeMessage(iDELogicRuntime, iPSDEBeginLogic, dataOrKeys);
			if(StringUtils.hasLength(strWelcomeMessage)) {
				return ChatMessagesBuilder.create().assistant(strWelcomeMessage).build();
			}
		}
		
		return super.onGetHistories(dataOrKeys, body, params);
	}
	
	protected String getWelcomeMessage(IDELogicRuntime iDELogicRuntime, IPSDEBeginLogic iPSDEBeginLogic, Object dataOrKeys) throws Throwable {
		if(!StringUtils.hasLength(iPSDEBeginLogic.getMessage()) && iPSDEBeginLogic.getPSSysMsgTempl() == null) {
			return null;
		}
		
		Map<String, Object>params = new HashMap<String, Object>();
		params.put("logic", iDELogicRuntime);
		params.put("node", iPSDEBeginLogic);
		
		String strContent = null;
		if(iPSDEBeginLogic.getPSSysMsgTempl() != null) {
			//存在定义消息模板
			ISysMsgTemplRuntime iSysMsgTemplRuntime = (ISysMsgTemplRuntime)this.getSystemRuntime().getSysMsgTemplRuntime(iPSDEBeginLogic.getPSSysMsgTemplMust());
			strContent = iSysMsgTemplRuntime.getContent(getActiveData(dataOrKeys), params);
		}
		else {
			String strTemplate = iPSDEBeginLogic.getMessage();
			Template template = this.getSystemRuntime().getGroovyTemplate(strTemplate);
			StringWriter sw = new StringWriter();
			template.make(params).writeTo(sw);
			strContent = sw.toString();
		}
		return strContent;
	}
	
	@Override
	protected PortalAsyncAction onAsyncChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {

		Object data = this.getActiveData(dataOrKeys);
		Map<String, Object> extParams = new HashMap<String, Object>();
		extParams.put(IDELogicRuntime.DELOGIC_AICHAT_PARAM_ACTION, IDELogicRuntime.DELOGIC_AICHAT_ACTION_ASYNCCHATCOMPLETION);
		extParams.put(IDELogicRuntime.DELOGIC_AICHAT_PARAM_CHATREQUEST, chatCompletionRequest);
		
		Object ret = this.getDataEntityRuntime().executeLogic(this.getPSModelObject().getPSDELogicMust(), new Object[] {data, extParams});
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
		Map<String, Object> extParams = new HashMap<String, Object>();
		extParams.put(IDELogicRuntime.DELOGIC_AICHAT_PARAM_ACTION, IDELogicRuntime.DELOGIC_AICHAT_ACTION_ASYNCCHATCOMPLETION);
		extParams.put(IDELogicRuntime.DELOGIC_AICHAT_PARAM_CHATREQUEST, chatCompletionRequest);
		
		Object ret = this.getDataEntityRuntime().executeLogic(this.getPSModelObject().getPSDELogicMust(), new Object[] {data, extParams});
		if(ret instanceof ChatCompletionResult) {
			return (ChatCompletionResult)ret;
		}
		if(ret instanceof ChatCompletionRequest) {
			return super.onChatCompletion(dataOrKeys, (ChatCompletionRequest)ret, params, bAppendSystemMessage, bAppendHistories);
		}
		
		throw new Exception(String.format("未支持的返回值[%1$s]", ret));
		//return super.onChatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
	}
	
}
