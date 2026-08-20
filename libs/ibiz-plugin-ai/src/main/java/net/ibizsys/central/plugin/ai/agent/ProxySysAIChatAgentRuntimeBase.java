package net.ibizsys.central.plugin.ai.agent;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.knuddels.jtokkit.api.Encoding;
import com.knuddels.jtokkit.api.EncodingType;
import com.knuddels.jtokkit.api.IntArrayList;

import net.ibizsys.central.cloud.core.ai.ISysAIAgentRuntime;
import net.ibizsys.central.cloud.core.ai.util.AIChatUtils;
import net.ibizsys.central.cloud.core.ai.util.ChatCompletionRequestHolder;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudKBClient;
import net.ibizsys.central.cloud.core.dataentity.logic.IDEAIChatLogicRuntimeBase;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.ISysPortalUtilRuntime;
import net.ibizsys.central.cloud.core.util.ChatMessagesBuilder;
import net.ibizsys.central.cloud.core.util.CloudCacheTagUtils;
import net.ibizsys.central.cloud.core.util.IChatResourceUtils;
import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.JTokenKitUtils;
import net.ibizsys.central.cloud.core.util.UserCancelException;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.Document;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncActionState;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncActionType;
import net.ibizsys.central.plugin.ai.util.AIChatAgentUtilBase;
import net.ibizsys.central.plugin.ai.util.ChatCompletionSession;
import net.ibizsys.central.plugin.ai.util.ChatCompletionSessionHolder;
import net.ibizsys.central.plugin.ai.util.IAIChatAgentUtil;
import net.ibizsys.central.plugin.ai.util.IChatCompletionSession;
import net.ibizsys.central.plugin.ai.util.python.PythonAIChatUtils;
import net.ibizsys.central.sysutil.ISysCacheUtilRuntime;
import net.ibizsys.model.PSModelEnums.DELogicSysAIChatAgentType;
import net.ibizsys.model.PSModelEnums.MsgTemplEngine;
import net.ibizsys.model.ai.PSSysAIChatAgentImpl;
import net.ibizsys.runtime.sysutil.ISysFileUtilRuntime;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.ITransactionalUtil;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;

public abstract class ProxySysAIChatAgentRuntimeBase  extends DefaultSysAIChatAgentRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ProxySysAIChatAgentRuntimeBase.class);
	
	public final static String TEMPLATE_PARAM_REQUEST_MESSAGES = "request_messages";
	
	private IAIChatAgentUtil iAIChatAgentUtil = null;
	private final static Random random = new Random();
	private ISysCacheUtilRuntime iSysCacheUtilRuntime = null;
	
	
	@Override
	protected void onInit() throws Exception {
		if (!MsgTemplEngine.FREEMARKER.value.equals(this.getPSModelObject().getTemplEngine())) {
			log.warn(String.format("aichatagent[%1$s]修复模板引擎至[FREEMARKER]", this.getPSModelObject().getName()));
			this.getPSModelObject().getObjectNode().put(PSSysAIChatAgentImpl.ATTR_GETTEMPLENGINE, MsgTemplEngine.FREEMARKER.value);
		}
		super.onInit();
		if(this.getAIChatAgentUtil() == null) {
			throw new Exception("AI交谈代理功能对象无效");
		}
	}
	
	protected IAIChatAgentUtil createAIChatAgentUtil() {
		return new AIChatAgentUtilBase(null) {
			@Override
			public ChatCompletionResult chatCompletion(ChatCompletionRequest chatCompletionRequest, boolean bAppendSystemMessage, boolean bAppendHistories, Map<String, Object> params) throws Throwable {
				return ProxySysAIChatAgentRuntimeBase.this.chatCompletion(chatCompletionRequest, bAppendSystemMessage, bAppendHistories, params);
			}
			
			@Override
			public Page<Chunk> fetchChunks(IChunkSearchContext iChunkSearchContext) throws Throwable {
				Object histories = iChunkSearchContext.get(IChunkSearchContext.PARAM_HISTORIES);
				if(!ObjectUtils.isEmpty(histories)) {
					return ProxySysAIChatAgentRuntimeBase.this.fetchChunksByHistories(iChunkSearchContext);
				}
				return ProxySysAIChatAgentRuntimeBase.this.fetchChunks(iChunkSearchContext);
			}
			
			@Override
			public List<Document> listDocumentsByChunks(IChunkSearchContext iChunkSearchContext) throws Throwable {
				return ProxySysAIChatAgentRuntimeBase.this.listDocumentsByChunks(iChunkSearchContext);
			}

			@Override
			public void outputStep(String message, String title, Map<String, Object> params) throws Throwable {
				ProxySysAIChatAgentRuntimeBase.this.outputStep(message, title, params);
			}

			@Override
			public void waitForInput(String message, String next, Map<String, Object> params) throws Throwable {
				ProxySysAIChatAgentRuntimeBase.this.waitForInput(message, next, params);
			}
			
			@Override
			public File downloadDocument(IChunkSearchContext iChunkSearchContext, String documentId, String type, Map<String, Object> params) throws Throwable {
				return ProxySysAIChatAgentRuntimeBase.this.downloadDocument(iChunkSearchContext, documentId, type, params);
			}
			
			@Override
			public void outputRaw(String content, boolean append, Map<String, Object> params) throws Throwable {
				ProxySysAIChatAgentRuntimeBase.this.outputRaw(content, append, params);
			}
			
			@Override
			public Object internalRequest(String util, String method, Map<String, Object> body) throws Throwable {
				return ProxySysAIChatAgentRuntimeBase.this.internalRequest(util, method, body);
			}

			@Override
			public File downloadOSSFile(String folder, String id, Map<String, Object> params) throws Throwable {
				return ProxySysAIChatAgentRuntimeBase.this.downloadOSSFile(folder, id, params);
			}
			
			@Override
			public List<File> downloadRequestOSSFiles(ChatCompletionRequest request, Map<String, Object> params) throws Throwable {
				return ProxySysAIChatAgentRuntimeBase.this.downloadRequestOSSFiles(request, params);
			}
		};
	}
	
	protected IAIChatAgentUtil getAIChatAgentUtil() {
		if(this.iAIChatAgentUtil == null) {
			this.iAIChatAgentUtil = this.createAIChatAgentUtil();
		}
		return this.iAIChatAgentUtil;
	}
	
	
	@Override
	public PortalAsyncAction asyncChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {

		Map<String, Object> actionParams = new LinkedHashMap<String, Object>();
		// 关闭客户端通知
		actionParams.put(PortalAsyncAction.FIELD_FULLTOPICTAG, null);
		actionParams.put(PortalAsyncAction.FIELD_ACTIONTYPE, PortalAsyncActionType.ASYNCCHATCOMPLETION.getValue());
		return this.getSystemRuntime().asyncExecute(new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return chatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories, IDEAIChatLogicRuntimeBase.DELOGIC_AICHAT_ACTION_ASYNCCHATCOMPLETION);
			}

		}, null, actionParams);
		
	}
	
	@Override
	public ChatCompletionResult chatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {
		return (ChatCompletionResult)ActionSessionManager.execute(new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return chatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories, IDEAIChatLogicRuntimeBase.DELOGIC_AICHAT_ACTION_CHATCOMPLETION);
			}
		}, null, ITransactionalUtil.PROPAGATION_UNKNOWN);
		//return this.chatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories, IDEAIChatLogicRuntimeBase.DELOGIC_AICHAT_ACTION_CHATCOMPLETION);
	}
	
	protected ChatCompletionResult chatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories, String strAction) throws Throwable {
		boolean pushSession = false;
		Map<String, String> lastRunner = this.getSysAIFactoryRuntimeContext().getCurrentSkillRunnerData();
		String strLastBusinessScope = this.getSysAIFactoryRuntimeContext().getCurrentBusinessScope();
		try {
			ChatCompletionSession chatCompletionSession = new ChatCompletionSession();
			String strCacheKey = String.format("ibiz-cloud-sysaichat-%1$s--%2$s-%3$s-%4$s", this.getSystemRuntime().getServiceId(), this.getFullUniqueTag(), this.getPSModelObject().getAgentContextId(), chatCompletionRequest.getSessionId());
			Map<String, String> sessionParams = this.getSysCacheUtilRuntime().getAll(strCacheKey);
			if (!ObjectUtils.isEmpty(sessionParams)) {
				this.getSysCacheUtilRuntime().reset(strCacheKey);
				String strParamValues = sessionParams.get("srfparamvalues");
//				String strAIAgentTag = sessionParams.get(AIAGENTTAG);
//				// 恢复聊天标记
//				chatCompletionRequest.set(AIAGENTTAG, strAIAgentTag);
				
//				chatCompletionRequest.reset("srfskillserviceurl");
//				if(StringUtils.hasLength(strSkillServiceUrl)) {
//					chatCompletionRequest.set("srfskillserviceurl", strSkillServiceUrl);
//				}
				
				if (!ObjectUtils.isEmpty(strParamValues)) {
					Map<String, Object> paramValues = JsonUtils.asMap(strParamValues);
					for (java.util.Map.Entry<String, Object> entry : paramValues.entrySet()) {
						chatCompletionSession.setParam(entry.getKey(), entry.getValue());
					}
				}
			}
			
			chatCompletionSession.setSystemId(this.getSystemRuntime().getDeploySystemId());
			chatCompletionSession.setAction(strAction);
			chatCompletionSession.setAgentUtil(this.getAIChatAgentUtil());
			chatCompletionSession.setEmployeeContext(EmployeeContext.getCurrent());
			chatCompletionSession.setRequest(chatCompletionRequest);
			chatCompletionSession.setActionSession(ActionSessionManager.getCurrentSessionMust());
			
			IChatCompletionSession last = ChatCompletionSessionHolder.peek();
			if(last != null) {
				chatCompletionSession.setBusinessScope(last.getBusinessScope());
				chatCompletionSession.setChatSessionId(last.getChatSessionId());
			}
			else {
				chatCompletionSession.setBusinessScope((String)chatCompletionRequest.get(ISysAIAgentRuntime.SCOPE));
				chatCompletionSession.setChatSessionId(chatCompletionRequest.getSessionId());
			}
			
			this.getSysAIFactoryRuntimeContext().setCurrentBusinessScope(chatCompletionSession.getBusinessScope());
			if(!ObjectUtils.isEmpty(chatCompletionSession.getBusinessScope())) {
				Map<String, String> businessScopeData = this.getSysAIFactoryRuntimeContext().getSkillRunnerDataByBusinessScope(chatCompletionSession.getBusinessScope());
				if(!ObjectUtils.isEmpty(businessScopeData)) {
					this.getSysAIFactoryRuntimeContext().setCurrentSkillRunnerData(businessScopeData);
				}
			}
			
			ChatCompletionSessionHolder.push(chatCompletionSession);
			pushSession = true;
			ChatCompletionResult ret = super.chatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
			return ret;
		}
		finally {
			this.getSysAIFactoryRuntimeContext().setCurrentBusinessScope(strLastBusinessScope);
			this.getSysAIFactoryRuntimeContext().setCurrentSkillRunnerData(lastRunner);
			if(pushSession)
				ChatCompletionSessionHolder.poll();
		}
	}
	
	
	
	protected ChatCompletionResult chatCompletion(ChatCompletionRequest chatCompletionRequest, boolean bAppendSystemMessage, boolean bAppendHistories, Map<String, Object> params) throws Throwable {
		this.fillChatCompletionRequest(chatCompletionRequest, new Entity(), params, bAppendSystemMessage, bAppendHistories);
		return this.doChatCompletion(null, chatCompletionRequest);
	}
	
	@Override
	protected ChatCompletionResult doChatCompletion(String strAIPlatformType, ChatCompletionRequest chatCompletionRequest) throws Throwable {
		IChatCompletionSession iChatCompletionSession = ChatCompletionSessionHolder.peek();
		if(iChatCompletionSession != null) {
			ChatCompletionResult result = null;
			if(IDEAIChatLogicRuntimeBase.DELOGIC_AICHAT_ACTION_CHATCOMPLETION.equals(iChatCompletionSession.getAction())) {
				result = super.doChatCompletion(strAIPlatformType, chatCompletionRequest);
			}
			else {
				PortalAsyncAction portalAsyncAction = this.doAsyncChatCompletion(strAIPlatformType, chatCompletionRequest);
				try {
					result = this.doExecuteChatPortalAsyncActionOutput(portalAsyncAction);
				}
				catch (Throwable ex) {
					if(ex instanceof UserCancelException) {
						try {
							Map<String, Object> body = new HashMap<String, Object>();
							body.putAll(chatCompletionRequest.any());
							this.cancelChatCompletion(new Entity(), portalAsyncAction.getAsyncAcitonId(), body);
						} catch (Throwable ex2) {
							log.error(ex2);
						}
					}
					throw ex;				
				}
			}
			iChatCompletionSession.setResult(result);
			return result;
		}
		else {
			return super.doChatCompletion(strAIPlatformType, chatCompletionRequest);
		}
	}
	
	
	protected ChatCompletionResult doExecuteChatPortalAsyncActionOutput(PortalAsyncAction portalAsyncAction) throws Throwable {
		long nCurrentTime = System.currentTimeMillis();
		long nTimeout = 3000000;
	
		ActionSession actionSession = ChatCompletionSessionHolder.peekMust().getActionSession();
		
		ISysPortalUtilRuntime iSysPortalUtilRuntime = this.getSystemRuntime().getSysPortalUtilRuntime(false);
		ChatCompletionResult chatCompletionResult = null;
		while (true) {
	
			if (this.isCancelChatCompletion(actionSession)) {
				// 外侧用户已经取消，取消实际聊天
				throw new UserCancelException("用户取消");
			}
	
			boolean bDisabled = EmployeeContext.isCurrentDisabled();
        	PortalAsyncAction last = null;
			try {
				EmployeeContext.setCurrentDisabled(true);
				last = iSysPortalUtilRuntime.getAsyncAction(portalAsyncAction.getAsyncAcitonId());
			}
			finally {
				EmployeeContext.setCurrentDisabled(bDisabled);
			}
			
			double fCompletionRate = 0.0f;
			if (last.getCompletionRate() != null) {
				fCompletionRate = last.getCompletionRate().doubleValue();
			}
	
			if (DataTypeUtils.compare(actionSession.getActionStep(), last.getStepInfo(), false) != 0) {
				nCurrentTime = System.currentTimeMillis();
			}
	
			int nActionState = DataTypeUtils.getIntegerValue(last.getActionState(), PortalAsyncActionState.EXECUTING.getValue());
			if (nActionState == PortalAsyncActionState.EXECUTING.getValue()) {
				actionSession.updateActionStep(last.getStepInfo(), fCompletionRate, last.getActionResult());
			}
	
			if (nActionState == PortalAsyncActionState.FINISHED.getValue()) {
				chatCompletionResult = JsonUtils.as(last.getActionResult(), ChatCompletionResult.class);
				break;
			}
			if (nActionState == PortalAsyncActionState.CANCELED.getValue()) {
				throw new UserCancelException(last.getActionResult());
			}
	
			if (nActionState == PortalAsyncActionState.FAILED.getValue()) {
				throw new Exception(last.getActionResult());
			}
	
			if (System.currentTimeMillis() - nCurrentTime >= nTimeout) {
				throw new Exception("反馈超时");
			}
	
			try {
				Thread.sleep(200);
			} catch (InterruptedException ex) {
				log.error(ex);
			}
		}
		
		return chatCompletionResult;
	}
	
	protected boolean isCancelChatCompletion(ActionSession actionSession) {
		if (actionSession == null) {
			actionSession = ActionSessionManager.getCurrentSessionMust();
		}
		String strAsyncActionId = (String) actionSession.getActionParam(ActionSession.PARAM_ASYNCACTION_ID);
		if (ObjectUtils.isEmpty(strAsyncActionId)) {
			return false;
		}
		String strCancelTag = String.format("%1$s-ai-chatcompletion-canceltag--%2$s", CloudCacheTagUtils.PREFIX, strAsyncActionId);
		String strRet = this.getSystemRuntime().getSysCacheUtilRuntime(false).get(strCancelTag);
		return "true".equals(strRet);
	}
	
	@Override
	protected void onCancelChatCompletion(Object dataOrKeys, String asyncActionId, Object body) throws Throwable {
		String strCancelTag = String.format("%1$s-ai-chatcompletion-canceltag--%2$s", CloudCacheTagUtils.PREFIX, asyncActionId);
		// 120 秒内有效
		this.getSystemRuntime().getSysCacheUtilRuntime(false).set(strCancelTag, "true", 120);
		super.onCancelChatCompletion(dataOrKeys, asyncActionId, body);
	}
	
	protected void outputStep(String message, String title, Map<String, Object> params) throws Throwable {
		ObjectNode jsonNode = JsonUtils.createObjectNode();
		if (StringUtils.hasLength(title)) {
			jsonNode.put("title", title);
		}
		jsonNode.put("content", message);
		String strContent = String.format("\r\n<%1$s>\r\n%2$s\r\n</%1$s>\r\n", DELogicSysAIChatAgentType.CHATSTEP.name().toLowerCase(), jsonNode.toPrettyString());

//		if (ChatCompletionSessionHolder.peekMust().getResult() != null) {
//			// 结果对象
//			ChatCompletionResult chatCompletionResult = (ChatCompletionResult)ChatCompletionSessionHolder.peekMust().getResult();
//			if (!ObjectUtils.isEmpty(chatCompletionResult.getChoices())) {
//				// 附加到最后面
//				String strOriginContent = chatCompletionResult.getChoices().get(0).getContent();
//				if(StringUtils.hasLength(strOriginContent)) {
//					strOriginContent += "\r\n";
//				}
//				strOriginContent += strContent;
//				chatCompletionResult.getChoices().get(0).setContent(strOriginContent);
//			} else {
//				ActionSession actionSession = ChatCompletionSessionHolder.peekMust().getActionSession();
//				actionSession.updateActionStep(strContent, 0.0f, strContent);
//				Thread.sleep(200);
//				chatCompletionResult.setChoices(ChatMessagesBuilder.create().assistant(strContent).build());
//			}
//
//			return;
//		}

		ActionSession actionSession = ChatCompletionSessionHolder.peekMust().getActionSession();
		actionSession.updateActionStep(strContent, 0.0f, strContent);
		Thread.sleep(200);

//		ChatCompletionResult chatCompletionResult = new ChatCompletionResult();
//		chatCompletionResult.setChoices(ChatMessagesBuilder.create().assistant(strContent).build());
//		ChatCompletionSessionHolder.peekMust().setResult(chatCompletionResult);
	}

	protected void outputRaw(String content, boolean append, Map<String, Object> params) throws Throwable {
		
		if (append && ChatCompletionSessionHolder.peekMust().getResult() != null) {
			// 结果对象
			ChatCompletionResult chatCompletionResult = (ChatCompletionResult)ChatCompletionSessionHolder.peekMust().getResult();
			if (!ObjectUtils.isEmpty(chatCompletionResult.getChoices())) {
				// 附加到最后面
				String strOriginContent = chatCompletionResult.getChoices().get(0).getContent();
				if(StringUtils.hasLength(strOriginContent)) {
					strOriginContent += "\r\n";
				}
				strOriginContent += content;
				chatCompletionResult.getChoices().get(0).setContent(strOriginContent);
			} else {
				ActionSession actionSession = ChatCompletionSessionHolder.peekMust().getActionSession();
				actionSession.updateActionStep(content, 0.0f, content);
				Thread.sleep(200);
				
				chatCompletionResult.setChoices(ChatMessagesBuilder.create().assistant(content).build());
			}

			return;
		}

		ActionSession actionSession = ChatCompletionSessionHolder.peekMust().getActionSession();
		actionSession.updateActionStep(content, 0.0f, content);
		Thread.sleep(200);

//		ChatCompletionResult chatCompletionResult = new ChatCompletionResult();
//		chatCompletionResult.setChoices(ChatMessagesBuilder.create().assistant(content).build());
//		ChatCompletionSessionHolder.peekMust().setResult(chatCompletionResult);
	}
	
	
	protected void waitForInput(String message, String next, Map<String, Object> params) throws Throwable {
		boolean bError = false;
		try {
			if (ChatCompletionSessionHolder.peekMust().getResult() != null) {
				// 结果对象
				ChatCompletionResult chatCompletionResult = (ChatCompletionResult)ChatCompletionSessionHolder.peekMust().getResult();
				if (StringUtils.hasLength(message)) {
					if (!ObjectUtils.isEmpty(chatCompletionResult.getChoices())) {
						// 附加到最后面
						String strOriginContent = chatCompletionResult.getChoices().get(0).getContent();
						if(StringUtils.hasLength(strOriginContent)) {
							strOriginContent += "\r\n";
						}
						strOriginContent += message;
						chatCompletionResult.getChoices().get(0).setContent(strOriginContent);
						chatCompletionResult.set("srfstopreason", DELogicSysAIChatAgentType.CHATINPUT.value);
//						iDELogicSession.setResult(chatCompletionResult);
//						iDELogicSession.setNext(IDELogicSession.NEXT_END);
						return;
					}
				}
				log.warn(String.format("聊天结果未包含任何选项，忽略附加至结果"));
			}

			
			this.simulateAssistantOutput(message);

			ChatCompletionResult chatCompletionResult = new ChatCompletionResult();
			chatCompletionResult.setChoices(ChatMessagesBuilder.create().assistant(message).build());
			chatCompletionResult.set("srfstopreason", DELogicSysAIChatAgentType.CHATINPUT.value);
			ChatCompletionSessionHolder.peekMust().setResult(chatCompletionResult);
		}
		catch (Throwable ex) {
			bError = true;
			throw ex;
		}
		finally {
			if(!bError) {
				ChatCompletionSessionHolder.peekMust().setNext(next);				
				backupChatCompletionSession();
			}
		}
	}
	
	protected File downloadDocument(IChunkSearchContext iChunkSearchContext, String documentId, String type, Map<String, Object> params) throws Throwable {
		String strActiveKBConfigId = this.getActiveKBAgentConfigId(iChunkSearchContext);
		String strUrl = String.format("lb://ibizcloud-kb/kb/{type}/documents/{document_id}/download");
		Map<String, Object> uriParams = new HashMap<String, Object>();
		uriParams.put("type", strActiveKBConfigId);
		uriParams.put("document_id", documentId);
		
		Map<String, Object> queries = new HashMap<String, Object>();
		queries.put("type", type);
		
		String strFileExt = type;
		if(ICloudKBClient.DOWNLOAD_DOCUMENT_TYPE__FULL.equals(strFileExt)) {
			strFileExt = "full.md";
		}
		
		String strFilePath = new StringBuilder(this.getSysAIFactoryRuntimeContext().getWorkspace().getCanonicalPath())
				.append(File.separator)
				.append("kb")
				.append(File.separator)
				.append(KeyValueUtils.genUniqueId(strActiveKBConfigId))
				.append(File.separator)
				.append("document")
				.append(File.separator)
				.append(documentId)
				.append(".")
				.append(strFileExt).toString();
		
		File file = new File(strFilePath);
		if(!file.exists()) {
			file.getParentFile().mkdirs();
			this.getSystemRuntime().getSysCloudClientUtilRuntime(false).getServiceClient(strUrl).download(strUrl, uriParams, null, queries, file);
		}
		
		return file;		
	}

	protected File downloadOSSFile(String strFolder, String strId, Map<String, Object> params) throws Throwable {
		
		File folderFile = new File( new StringBuilder(this.getSysAIFactoryRuntimeContext().getWorkspace().getCanonicalPath())
				.append(File.separator)
				.append("oss")
				.append(File.separator)
				.append(StringUtils.hasLength(strFolder)?strFolder:"DEFAULT")
				.append(File.separator)
				.append(strId).toString());
		
		if(!folderFile.exists()) {
			folderFile.mkdirs();
		}
		
		//列出成员文件
		File[] files = folderFile.listFiles();
		if(files != null && files.length > 0) {
			for(File file : files) {
				if(file.isHidden()) {
					continue;
				}
				
				if(file.isFile()) {
					return file;
				}
			}
		}
		
		ISysFileUtilRuntime iSysFileUtilRuntime = this.getSystemRuntime().getSysFileUtilRuntime(false);
		net.ibizsys.runtime.util.domain.File ossFile = iSysFileUtilRuntime.getOSSFile(strId, strFolder, false);
		
		File destFile = new File(folderFile.getAbsolutePath() + File.separator + ossFile.getFileName());
		FileUtils.moveFile(new File(ossFile.getLocalPath()), destFile);
		
		return destFile;
	}
	
	protected List<File> downloadRequestOSSFiles(ChatCompletionRequest request, Map<String, Object> params) throws Throwable {
		
		List<ChatMessage> messageList = request.getMessages();
		Object originalMessages = request.get(IChatResourceUtils.FIELD_ORIGINAL);
		if(originalMessages instanceof List) {
			messageList = (List)originalMessages;
		}
		
		List<IEntity> entityList = new ArrayList<IEntity>();
		for(int i = messageList.size()-1;i>=0;i--) {
			ChatMessage chatMessage = messageList.get(i);
			List<IEntity> list = this.getAIFactoryRuntime().getChatResourceUtils().getResourceEntities(chatMessage, true, false);
			if(ObjectUtils.isEmpty(list)) {
				continue;
			}
			
			for(IEntity iEntity : list ) {
				String type = DataTypeUtils.asString(iEntity.get(IChatResourceUtils.FIELD_TYPE));
				if(!IChatResourceUtils.RESOURCETYPE_OSSFILE.equalsIgnoreCase(type)) {
					continue;
				}
				entityList.add(iEntity);
			}
		}
		
		List<File> fileList = new ArrayList<File>();
		for(IEntity iEntity : entityList) {
			String folder = DataTypeUtils.asString(iEntity.get(IChatResourceUtils.FIELD_OSSFILE_FOLDER));
			String id = DataTypeUtils.asString(iEntity.get(IChatResourceUtils.FIELD_OSSFILE_ID));
			File file = downloadOSSFile(folder, id, new HashMap<String, Object>());
			fileList.add(file);
		}
		
		return fileList;
	}
	
	
	/**
	 * 仿真助手输出
	 *
	 * @param actionSession
	 * @param strMessage
	 * @throws Throwable
	 */
	protected void simulateAssistantOutput(String strMessage) throws Throwable {
		ActionSession actionSession = ChatCompletionSessionHolder.peekMust().getActionSession();
		String strLastResult = "";
		Encoding encoding = JTokenKitUtils.getEncoding(EncodingType.CL100K_BASE);
		IntArrayList list = encoding.encode(strMessage);
		int nTotalTokens = list.size();
		int nLastStart = 0;
		while (true) {
			PortalAsyncAction last = new PortalAsyncAction();

			int nSize = 20 + (random.nextInt(100) % 10);

			int nCurEnd = nLastStart + nSize;

			if (nCurEnd > nTotalTokens) {
				nCurEnd = nTotalTokens;
			}
			// 备份
			nLastStart = nCurEnd;

			IntArrayList curList = new IntArrayList(nCurEnd);
			for (int i = 0; i < nCurEnd; i++) {
				curList.add(list.get(i));
			}

			String strCurResult = encoding.decode(curList);
			String strCurStep = strCurResult.substring(strLastResult.length());
			last.setStepInfo(strCurStep);
			last.setActionResult(strCurResult);

			strLastResult = strCurResult;

			double fCompletionRate = 0.0f;
			if (last.getCompletionRate() != null) {
				fCompletionRate = last.getCompletionRate().doubleValue();
			}

			actionSession.updateActionStep(last.getStepInfo(), fCompletionRate, last.getActionResult());

			try {
				Thread.sleep(200);
			} catch (InterruptedException ex) {
				log.error(ex);
			}

			if (nCurEnd >= nTotalTokens) {
				// 结束
				break;
			}
		}
	}
	
	protected void backupChatCompletionSession() throws Throwable {
		
		String strCacheKey = String.format("ibiz-cloud-sysaichat-%1$s--%2$s-%3$s-%4$s", this.getSystemRuntime().getServiceId(), this.getFullUniqueTag(), this.getPSModelObject().getAgentContextId(), ChatCompletionRequestHolder.peekMust().getSessionId());
		Map<String, String> sessionParams = new HashMap<String, String>();
		Map<String, Object> paramValueMap = new LinkedHashMap<String, Object>();
		ChatCompletionSessionHolder.peekMust().fillParams(paramValueMap);;
		sessionParams.put("srfparamvalues", JsonUtils.toString(paramValueMap));

		// 重新回到当前节点，并指定AIAGENTTAG
//		if (!ObjectUtils.isEmpty(strAgentTag)) {
//			sessionParams.put(AIAGENTTAG, strAgentTag);
//		}
//		sessionParams.put("srfnextid", iPSDELogicNode.getCodeName());
//		if(StringUtils.hasLength(strSkillServiceUrl)) {
//			sessionParams.put("srfskillserviceurl", strSkillServiceUrl);
//		}
		this.getSysCacheUtilRuntime().set(strCacheKey, sessionParams, 7200);
	}
	
	protected Object internalRequest(String util, String method, Map<String, Object> body) throws Throwable {
		if("session".equalsIgnoreCase(util)) {
			if("get_request".equals(method)) {
				return PythonAIChatUtils.session.get_request();
			}
			if("get_next".equals(method)) {
				return PythonAIChatUtils.session.get_next();
			}
			if("set_param".equals(method)) {
				PythonAIChatUtils.session.set_param((String)body.get("key"), body.get("value"));
				return "";
			}
			if("get_param".equals(method)) {
				return PythonAIChatUtils.session.get_param((String)body.get("key"));
			}
			
			if("reset_param".equals(method)) {
				return PythonAIChatUtils.session.reset_param((String)body.get("key"));
			}
			
			if("get_request_oss_files".equals(method)) {
				return PythonAIChatUtils.session.get_request_oss_files();
			}
			
		}
		if("agent".equalsIgnoreCase(util)) {
			if("list_documents_by_chunks".equals(method)) {
				return PythonAIChatUtils.agent.list_documents_by_chunks((Map)body.get("request"));
			}
			if("fetch_chunks".equals(method)) {
				return PythonAIChatUtils.agent.fetch_chunks((Map)body.get("request"));
			}
			if("download_document".equals(method)) {
				return PythonAIChatUtils.agent.download_document((Map)body.get("request"), (String)body.get("document_id"), (String)body.get("type"), (Map)body.get("params"));
			}
			if("chat_completion".equals(method)) {
				return PythonAIChatUtils.agent.chat_completion((Map)body.get("request"), (boolean)body.get("append_system"), (boolean)body.get("append_histories"), (Map)body.get("params"));
			}
			if("output_step".equals(method)) {
				PythonAIChatUtils.agent.output_step((String)body.get("message"), (String)body.get("title"), (Map)body.get("params"));
				return "";
			}
			if("output_raw".equals(method)) {
				PythonAIChatUtils.agent.output_raw((String)body.get("message"), (boolean)body.get("append"), (Map)body.get("params"));
				return "";
			}
			if("wait_for_input".equals(method)) {
				PythonAIChatUtils.agent.wait_for_input((String)body.get("message"), (String)body.get("next"), (Map)body.get("params"));
				return "";
			}
			
			if("download_oss_file".equals(method)) {
				return PythonAIChatUtils.agent.download_oss_file((String)body.get("folder"), (String)body.get("file_id"), (Map)body.get("params"));
			}
			
		}
				
		throw new Exception(String.format("未支持的组件[%1$s]调用[%2$s]", util, method));
	}
	
	
	protected ISysCacheUtilRuntime getSysCacheUtilRuntime() {
		if (this.iSysCacheUtilRuntime == null) {
			this.iSysCacheUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCacheUtilRuntime.class, false);
		}
		return this.iSysCacheUtilRuntime;
	}
	
	
	protected List<ChatMessage> getRealChatMessages(ChatCompletionRequest chatCompletionRequest) throws Throwable {
		return this.getRealChatMessages(chatCompletionRequest, getHistoryCount());
	}
	
	protected List<ChatMessage> getRealChatMessages(ChatCompletionRequest chatCompletionRequest, int nHistoryCount) throws Throwable {
		List<ChatMessage> realChatMessageList = new ArrayList<ChatMessage>();
		List<ChatMessage> chatMessageList = (nHistoryCount == -1)?new ArrayList<ChatMessage>(chatCompletionRequest.getMessages()):AIChatUtils.getLastChatMessages(chatCompletionRequest, nHistoryCount);
		for(ChatMessage chatMessage : chatMessageList) {
			//realChatMessageList.addAll(this.getSysAIFactoryRuntimeContext().getAIFactoryRuntime().getChatResourceUtils().convert(chatMessage, true));
			realChatMessageList.add(chatMessage);
		}
		return realChatMessageList;
	}
	
	@Override
	protected List<ChatMessage> onGetHistories(Object dataOrKeys, Object body, Map<String, Object> params) throws Throwable {
		Map<String, String> lastRunner = this.getSysAIFactoryRuntimeContext().getCurrentSkillRunnerData();
		String strLastBusinessScope = this.getSysAIFactoryRuntimeContext().getCurrentBusinessScope();
		try {
			String strBusinessScope = null;
			if(body instanceof Map) {
				strBusinessScope = (String)((Map)body).get(ISysAIAgentRuntime.SCOPE);
			}
			
			this.getSysAIFactoryRuntimeContext().setCurrentBusinessScope(strBusinessScope);
			if(!ObjectUtils.isEmpty(strBusinessScope)) {
				Map<String, String> businessScopeData = this.getSysAIFactoryRuntimeContext().getSkillRunnerDataByBusinessScope(strBusinessScope);
				if(!ObjectUtils.isEmpty(businessScopeData)) {
					this.getSysAIFactoryRuntimeContext().setCurrentSkillRunnerData(businessScopeData);
				}
			}
			return super.onGetHistories(dataOrKeys, body, params);
		}
		finally {
			this.getSysAIFactoryRuntimeContext().setCurrentBusinessScope(strLastBusinessScope);
			this.getSysAIFactoryRuntimeContext().setCurrentSkillRunnerData(lastRunner);
		}
		
	}
}
