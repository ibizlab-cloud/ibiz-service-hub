package net.ibizsys.central.cloud.core.ai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.util.ChatMessagesBuilder;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.ChatTool;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.ai.IPSSysAIWorkerAgent;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class SysAIWorkerAgentRuntimeBase extends SysAIAgentRuntimeBase implements ISysAIWorkerAgentRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysAIWorkerAgentRuntimeBase.class);

	private IPSSysAIWorkerAgent iPSSysAIWorkerAgent = null;
	private IDataEntityRuntime iDataEntityRuntime = null;
	private String strAccessKey = null;

	@Override
	protected ISysAIWorkerAgentRuntimeContext createModelRuntimeContext() {
		return new SysAIWorkerAgentRuntimeContextBase<ISysAIWorkerAgentRuntime, ISysAIAgentRuntimeContext>(super.createModelRuntimeContext()) {
			
		};
	}
	
	@Override
	public void init(ISysAIFactoryRuntimeContext iSysAIFactoryRuntimeContext, IPSSysAIWorkerAgent iPSSysAIWorkerAgent) throws Exception {
		this.iPSSysAIWorkerAgent = iPSSysAIWorkerAgent;
		super.init(iSysAIFactoryRuntimeContext);
	}

	@Override
	protected void onInit() throws Exception {
		
//		if(this.getPSModelObject().getPSSysUniRes() != null) {
//		this.strAccessKey = this.getPSModelObject().getPSSysUniRes().getResCode();
//	}
		
		if(StringUtils.hasLength(this.getPSModelObject().getAIPlatformType())) {
			this.setAIPlatformType(this.getPSModelObject().getAIPlatformType());
		}
		
		if(this.getPSModelObject().getPSDataEntity() != null) {
			this.iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(this.getPSModelObject().getPSDataEntityMust().getId(), false);
		}
		

		super.onInit();
	}

	@Override
	public IPSSysAIWorkerAgent getPSModelObject() {
		return this.iPSSysAIWorkerAgent;
	}

	@Override
	public IDataEntityRuntime getDataEntityRuntime() {
		return this.iDataEntityRuntime;
	}

	@Override
	public String getAgentType() {
		return AIAGENT_WORKER;
	}
	
	@Override
	public String getAgentSubType() {
		return this.iPSSysAIWorkerAgent.getAgentType();
	}
	
	@Override
	public String getAccessKey() {
		return this.strAccessKey;
	}
	
	@Override
	public String getAgentMode() {
		return this.iPSSysAIWorkerAgent.getCodeName();
	}


	
	
	@Override
	public ChatCompletionResult chatCompletion(String strMode, Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {
		try {
			return this.onChatCompletion(strMode, dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
		}
		catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			SysAIFactoryRuntimeException.rethrow(this, ex);
			throw new SysAIFactoryRuntimeException(this.getAIFactoryRuntime(), this, String.format("同步聊天交互发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected ChatCompletionResult onChatCompletion(String strMode, Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {
		
		if(getHistoryCount() > 0 && !ObjectUtils.isEmpty(chatCompletionRequest.getMessages()) && chatCompletionRequest.getMessages().size() > this.getHistoryCount()) {
			log.debug(String.format("截取消息历史[%1$s] => [%2$s]", chatCompletionRequest.getMessages().size(), this.getHistoryCount()));
			List<ChatMessage> list = chatCompletionRequest.getMessages().subList(chatCompletionRequest.getMessages().size() - this.getHistoryCount(), chatCompletionRequest.getMessages().size());
			chatCompletionRequest.setMessages(list);
		}
		
		if(bAppendHistories) {
			List<ChatMessage> historyList = this.getHistories(strMode, dataOrKeys, null, params);
			if(!ObjectUtils.isEmpty(historyList)) {
				if(!ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
					historyList.addAll(chatCompletionRequest.getMessages());
					chatCompletionRequest.setMessages(historyList);
				}
				else {
					chatCompletionRequest.setMessages(historyList);
				}
			}
		}
		
		if(bAppendSystemMessage) {
			List<ChatMessage> systemMessageList = this.getSystemMessages(dataOrKeys, params);
			if(!ObjectUtils.isEmpty(systemMessageList)) {
				if(!ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
					systemMessageList.addAll(chatCompletionRequest.getMessages());
					chatCompletionRequest.setMessages(systemMessageList);
				}
				else {
					chatCompletionRequest.setMessages(systemMessageList);
				}
			}
		}
		
		List<ChatTool> toolList = this.getTools(strMode, dataOrKeys, params);
		if(!ObjectUtils.isEmpty(toolList)) {
			if(!ObjectUtils.isEmpty(chatCompletionRequest.getTools())) {
				toolList.addAll(chatCompletionRequest.getTools());
				chatCompletionRequest.setTools(toolList);
			}
			else {
				chatCompletionRequest.setTools(toolList);
			}
		}
		
		return this.getSysAIUtilRuntime().chatCompletion(getAIPlatformType(), chatCompletionRequest);
	}

	protected List<ChatMessage> getHistories(String strMode, Object dataOrKeys, Object body, Map<String, Object> params) throws Throwable {
		return this.onGetHistories(strMode, dataOrKeys, body, params);
	}

	protected List<ChatMessage> onGetHistories(String strMode, Object dataOrKeys, Object body, Map<String, Object> params) throws Throwable {
		Map<String, Object> exTemplParams = null;
		if (params != null && params.containsKey(PARAM_TEMPLPARAMS)) {
			exTemplParams = (Map<String, Object>) params.get(PARAM_TEMPLPARAMS);
		}
		return this.doGetHistories(strMode, getActiveData(dataOrKeys), body, params, exTemplParams);
	}

	protected List<ChatMessage> doGetHistories(String strMode, List entityList, Object body, Map<String, Object> params, Map<String, Object> exTemplParams) throws Throwable {
		// 格式化文本
		String strConfigId = this.getHistoriesConfigId(strMode);
		if(ObjectUtils.isEmpty(strConfigId)) {
			return new ArrayList<ChatMessage>();
		}
		
		Map<String, Object> templParams = new HashMap<String, Object>();
		if (exTemplParams != null) {
			templParams.putAll(exTemplParams);
		}

		String strContent = this.getContent(entityList, strConfigId, templParams, true);
		if(!StringUtils.hasLength(strContent)) {
			return new ArrayList<ChatMessage>();
		}

		return new ChatMessagesBuilder().xml(strContent).build();
	}
	
	protected List<ChatMessage> getSystemMessages(Object dataOrKeys, Map<String, Object> params) throws Throwable {
		return this.onGetSystemMessages(dataOrKeys, params);
	}

	protected List<ChatMessage> onGetSystemMessages(Object dataOrKeys, Map<String, Object> params) throws Throwable {
		Map<String, Object> exTemplParams = null;
		if (params != null && params.containsKey(PARAM_TEMPLPARAMS)) {
			exTemplParams = (Map<String, Object>) params.get(PARAM_TEMPLPARAMS);
		}
		return this.doGetSystemMessages(getActiveData(dataOrKeys), params, exTemplParams);
	}

	protected List<ChatMessage> doGetSystemMessages(List entityList, Map<String, Object> params, Map<String, Object> exTemplParams) throws Throwable {
		// 格式化文本
		String strConfigId = this.getSystemMessagesConfigId();
		if(ObjectUtils.isEmpty(strConfigId)) {
			return new ArrayList<ChatMessage>();
		}

		Map<String, Object> templParams = new HashMap<String, Object>();
		if (exTemplParams != null) {
			templParams.putAll(exTemplParams);
		}

//		templParams.put(TEMPLPARAM_APPDEACMODE, this.getAddinData());
//		templParams.put(TEMPLPARAM_APPDE, this.getPSAppDataEntity());

		String strContent = this.getContent(entityList, strConfigId, templParams, true);
		if(!StringUtils.hasLength(strContent)) {
			return new ArrayList<ChatMessage>();
		}
		
		int nPos = strConfigId.lastIndexOf(".xml.tpl");
		if(nPos == strConfigId.length() - 8) {
			return new ChatMessagesBuilder().xml(strContent).build();
		}
		return new ChatMessagesBuilder().system(strContent).build();
	}
	
	protected List<ChatTool> getTools(String strMode, Object dataOrKeys, Map<String, Object> params) throws Throwable {
		return this.onGetTools(strMode, dataOrKeys, params);
	}

	protected List<ChatTool> onGetTools(String strMode, Object dataOrKeys, Map<String, Object> params) throws Throwable {
		Map<String, Object> exTemplParams = null;
		if (params != null && params.containsKey(PARAM_TEMPLPARAMS)) {
			exTemplParams = (Map<String, Object>) params.get(PARAM_TEMPLPARAMS);
		}
		return this.doGetTools(strMode, getActiveData(dataOrKeys), params, exTemplParams);
	}

	protected List<ChatTool> doGetTools(String strMode, List entityList, Map<String, Object> params, Map<String, Object> exTemplParams) throws Throwable {
		// 格式化文本
		String strConfigId = this.getToolsConfigId(strMode);
		if(ObjectUtils.isEmpty(strConfigId)) {
			return new ArrayList<ChatTool>();
		}

		Map<String, Object> templParams = new HashMap<String, Object>();
		if (exTemplParams != null) {
			templParams.putAll(exTemplParams);
		}

		String strContent = this.getContent(entityList, strConfigId, templParams, true);
		if(!StringUtils.hasLength(strContent)) {
			return new ArrayList<ChatTool>();
		}
		
		return JsonUtils.as(strContent, ChatToolListType);
	}

	protected String getHistoriesConfigId(String strMode) throws Throwable {
		throw new Exception("没有实现");
	}
	
	protected String getSystemMessagesConfigId() throws Throwable {
		throw new Exception("没有实现");
	}
	
	protected String getToolsConfigId(String strMode) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public String getAgentInfo() {
		return this.getPSModelObject().getAgentInfo();
	}
}
