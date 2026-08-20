package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;


import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.ai.IAIChatAgentRuntimeBase;
import net.ibizsys.central.cloud.core.ai.ISysAIChatAgentRuntime;
import net.ibizsys.central.cloud.core.ai.util.AIChatUtils;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.ISysPortalUtilRuntime;
import net.ibizsys.central.cloud.core.util.IPortalAsyncAction;
import net.ibizsys.central.cloud.core.util.UserCancelException;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.ChatMessageRole;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncActionState;
import net.ibizsys.central.plugin.ai.addin.IOpenAIAdapter;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.INamedAction;
import net.ibizsys.runtime.util.INamedRunnable;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;

public abstract class OpenAIAdapterBase extends SysOpenAIServerUtilRTAddinBase implements IOpenAIAdapter {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(OpenAIAdapterBase.class);
	
	private ISysPortalUtilRuntime iSysPortalUtilRuntime = null;
	
	public final static String THINK_BEGIN = "<think>";

	public final static String THINK_END = "</think>";
	
	@Override
	public Object chatCompletion(IAIChatAgentRuntimeBase iAIChatAgentRuntimeBase, ChatCompletionRequest chatCompletionRequest, HttpServletRequest request, HttpServletResponse response, Map<String, Object> body) throws Throwable {
		Assert.notNull(iAIChatAgentRuntimeBase, "传入交谈代理运行时对象无效");
		Assert.notNull(chatCompletionRequest, "传入交谈请求对象无效");
		if(ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
			throw new Exception("交谈请求未携带消息");
		}
		return this.onChatCompletion(iAIChatAgentRuntimeBase, chatCompletionRequest, request, response, body);
	}

	protected ChatCompletionRequest convertChatCompletionRequest(ChatCompletionRequest chatCompletionRequest, HttpServletRequest request, Map<String, Object> body) throws Exception {
		return chatCompletionRequest;
	}
	
	protected Object onChatCompletion(IAIChatAgentRuntimeBase iAIChatAgentRuntimeBase, ChatCompletionRequest chatCompletionRequest, HttpServletRequest request, HttpServletResponse response, Map<String, Object> body) throws Throwable {
		if(this.isRemoveSystemMessage()) {
			//判断第一个消息是否为系统消息
			ChatMessage firstMessage = chatCompletionRequest.getMessages().get(0);
			if(ChatMessageRole.SYSTEM.getValue().equalsIgnoreCase(firstMessage.getRole())) {
				chatCompletionRequest.getMessages().remove(0);
			}
		}
		chatCompletionRequest = this.convertChatCompletionRequest(chatCompletionRequest, request, body);
		return this.doChatCompletion(iAIChatAgentRuntimeBase, chatCompletionRequest, request, response, body);
	}
	
	protected Object doChatCompletion(IAIChatAgentRuntimeBase iAIChatAgentRuntimeBase, ChatCompletionRequest chatCompletionRequest, HttpServletRequest request, HttpServletResponse response, Map<String, Object> body) throws Throwable {
		if(DataTypeUtils.asBoolean(chatCompletionRequest.getStreaming(), true)) {
			boolean bAppendSystemMessage = isRemoveSystemMessage();
			if(!bAppendSystemMessage && !ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
				ChatMessage firstMessage = chatCompletionRequest.getMessages().get(0);
				if(!ChatMessageRole.SYSTEM.getValue().equalsIgnoreCase(firstMessage.getRole())) {
					//如果没有提交SYSTEM消息，还是设置为附加
					bAppendSystemMessage = true;
				}
			}
			return this.doSseChatCompletion(iAIChatAgentRuntimeBase, chatCompletionRequest, bAppendSystemMessage, false, request, response, body);
		}
		else {
			throw new Exception(String.format("未支持同步调用"));
		}
	}

	protected boolean isRemoveSystemMessage() {
		return true;
	}
	

	protected SseEmitter doSseChatCompletion(IAIChatAgentRuntimeBase iAIChatAgentRuntimeBase, ChatCompletionRequest chatCompletionRequest, boolean bAppendSystemMessage, boolean bAppendHistories, HttpServletRequest request, HttpServletResponse response, Map<String, Object> body) throws Throwable {
		
		if(response != null) {
			response.setContentType("text/event-stream");
			response.setCharacterEncoding("UTF-8");
			response.setHeader("Cache-Control", "no-cache");
			response.setHeader("Connection", "keep-alive");
			response.setHeader("Access-Control-Allow-Origin", "*");
		}
		
		long nTimeout = 3000000;
		PortalAsyncAction portalAsyncAction2 = new PortalAsyncAction();
		
		return (SseEmitter)this.sseExecute(iAIChatAgentRuntimeBase, new IPortalAsyncAction() {
			
			@Override
			public Object execute(Object[] args) throws Throwable {
				ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
				Entity entity = new Entity();
				ISysAIChatAgentRuntime iSysAIChatAgentRuntime = null;
				if(iAIChatAgentRuntimeBase instanceof ISysAIChatAgentRuntime) {
					iSysAIChatAgentRuntime = (ISysAIChatAgentRuntime)iAIChatAgentRuntimeBase;
				}
				
				PortalAsyncAction portalAsyncAction = iAIChatAgentRuntimeBase.asyncChatCompletion(entity, chatCompletionRequest, null, bAppendSystemMessage, bAppendHistories);
				portalAsyncAction.copyTo(portalAsyncAction2);
				Object session = (iSysAIChatAgentRuntime != null)?iSysAIChatAgentRuntime.beginChatSession(chatCompletionRequest):null;
				if(session != null) {
					if(!ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
						iSysAIChatAgentRuntime.appendChatMessage(session, chatCompletionRequest.getMessages().get(chatCompletionRequest.getMessages().size() - 1));
					}
				}
				long nCurrentTime = System.currentTimeMillis();
				
				actionSession.setActionParam(ActionSession.PARAM_ASYNCACTION_ID, portalAsyncAction.getAsyncAcitonId());
				
				while(true) {
					boolean bDisabled = EmployeeContext.isCurrentDisabled();
		        	PortalAsyncAction last = null;
					try {
						EmployeeContext.setCurrentDisabled(true);
						last = getSysPortalUtilRuntime().getAsyncAction(portalAsyncAction.getAsyncAcitonId());
					}
					finally {
						EmployeeContext.setCurrentDisabled(bDisabled);
					}
					
					double fCompletionRate = 0.0f;
					if(last.getCompletionRate()!=null) {
						fCompletionRate = last.getCompletionRate().doubleValue();
					}
					
					if(DataTypeUtils.compare(actionSession.getActionStep(), last.getStepInfo(), false) != 0) {
						nCurrentTime = System.currentTimeMillis();
					}
					
					int nActionState = DataTypeUtils.getIntegerValue(last.getActionState(), PortalAsyncActionState.EXECUTING.getValue());
					if(nActionState == PortalAsyncActionState.FINISHED.getValue()) {
						ChatCompletionResult chatCompletionResult = JsonUtils.as(last.getActionResult(), ChatCompletionResult.class);
						actionSession.updateActionStep(last.getStepInfo(), fCompletionRate, chatCompletionResult.getChoices().get(0).getContent());
					}
					else {
						actionSession.updateActionStep(last.getStepInfo(), fCompletionRate, last.getActionResult());
					}
					
					if(nActionState == PortalAsyncActionState.FINISHED.getValue()) {
						if(session != null) {
							ChatCompletionResult chatCompletionResult = JsonUtils.as(last.getActionResult(), ChatCompletionResult.class);
							ChatMessage chatMessage = new ChatMessage();
							chatMessage.setRole(ChatMessageRole.ASSISTANT.getValue());
							chatMessage.setContent(AIChatUtils.removeThinkingContent(chatCompletionResult.getChoices().get(0).getContent()));
							Object ret = iSysAIChatAgentRuntime.appendChatMessage(session, chatMessage, false, false);
							if(ret instanceof IEntityDTO) {
								IEntityDTO iEntityDTO = (IEntityDTO)ret;
								if(iEntityDTO.getDEMethodDTORuntime() != null && iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime() != null) {
									Object messageId =  iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime().getKeyFieldValue(iEntityDTO);
									if(messageId != null) {
										chatCompletionResult.getChoices().get(0).setMessageId(String.valueOf(messageId));
										return JsonUtils.toString(chatCompletionResult);
									}
								}
							}
						}
						return last.getActionResult();
					}
					if (nActionState == PortalAsyncActionState.CANCELED.getValue()) {
						if(session != null) {
							ChatMessage chatMessage = new ChatMessage();
							chatMessage.setContent(AIChatUtils.removeThinkingContent(last.getActionResult()));
							chatMessage.setRole(ChatMessageRole.ASSISTANT.getValue());
							iSysAIChatAgentRuntime.appendChatMessage(session, chatMessage, true, false);
						}
						throw new UserCancelException(last.getActionResult());
					}

					if(nActionState == PortalAsyncActionState.FAILED.getValue()) {
						if(session != null) {
							ChatMessage chatMessage = new ChatMessage();
							chatMessage.setRole(ChatMessageRole.ASSISTANT.getValue());
							chatMessage.setContent(AIChatUtils.removeThinkingContent(last.getActionResult()));
							iSysAIChatAgentRuntime.appendChatMessage(session, chatMessage, false, true);
						}
						throw new Exception(last.getActionResult());
					}
					
					if(System.currentTimeMillis() - nCurrentTime >= nTimeout) {
						throw new Exception("反馈超时");
					}
	
					try {
						Thread.sleep(200);
					} catch (InterruptedException ex) {
						log.error(ex);
					}
				}
			}

			@Override
			public PortalAsyncAction getPortalAsyncAction() {
				return portalAsyncAction2;
			}
			
		}, null, body, 0l);
	}

	
	protected SseEmitter sseExecute(IAIChatAgentRuntimeBase iAIChatAgentRuntimeBase, IAction iAction, Object[] args, Object actionTag, long nTimeout) throws Throwable {

		final SseEmitter sseEmitter = (nTimeout == -1) ? new SseEmitter() : new SseEmitter(nTimeout);
		final IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime)this.getSystemRuntime();
		iServiceSystemRuntime.threadRun(new INamedRunnable() {
			@Override
			public void run() {
				try {
					onSseExecute(iAIChatAgentRuntimeBase, iAction, args, actionTag, sseEmitter);
				} catch (Throwable ex) {
					log.error(ex);
				}
			}
			
			@Override
			public Executor getExecutor() {
				return iServiceSystemRuntime.getSseExecutor();
			}
		});

		return sseEmitter;
	}

	protected void onSseExecute(IAIChatAgentRuntimeBase iAIChatAgentRuntimeBase, IAction iAction, Object[] args, Object actionTag, SseEmitter sseEmitter) throws Throwable {
		final IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime)this.getSystemRuntime();
		PortalAsyncAction srcPortalAsyncAction = null;
		if(iAction instanceof IPortalAsyncAction) {
			srcPortalAsyncAction = ((IPortalAsyncAction)iAction).getPortalAsyncAction();
		}
		
		Map<String, Object> body = (Map<String, Object>)actionTag;
		
		// 开启会话
		boolean bOpenActionSession = (ActionSessionManager.getCurrentSession() == null);
		if (bOpenActionSession) {
			String strActionName = null;
			if(iAction instanceof INamedAction) {
				strActionName = ((INamedAction)iAction).getName();
			}
			if(StringUtils.hasLength(strActionName)) {
				ActionSessionManager.openSession().setName(strActionName);
			}
			else {
				ActionSessionManager.openSession();
			}
			ActionSessionManager.getCurrentSession().setUserContext(EmployeeContext.getCurrent());
		}

		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		String strWorkTag = KeyValueUtils.genUniqueId();
		String strLastResultTag = KeyValueUtils.genUniqueId();

		PortalAsyncAction portalAsyncAction = new PortalAsyncAction();
		portalAsyncAction.setActionState(PortalAsyncActionState.NOTSTARTED.getValue());
		if(srcPortalAsyncAction != null) {
			portalAsyncAction.setAsyncAcitonId(srcPortalAsyncAction.getAsyncAcitonId());
		}

//		try {
//			sseEmitter.send(portalAsyncAction);
//		} catch (IOException ex) {
//			log.error(ex);
//		}

		actionSession.setActionParam(strWorkTag, "1");
		PortalAsyncAction finalSrcPortalAsyncAction = srcPortalAsyncAction;
		
		// 空闲超时
		int nTimeout = 20 * 60 * 1000;
		iServiceSystemRuntime.threadRun(new INamedRunnable() {
			@Override
			public void run() {

				String strLastActionStep = actionSession.getActionStep();
				String strLastActionResult = actionSession.getActionResult();
				
				long nLastActive = System.currentTimeMillis();

				boolean bThinking = false;
				boolean bClientError = false;
				while (true) {
					Object objValue = actionSession.getActionParam(strWorkTag);
					if (ObjectUtils.isEmpty(objValue) || bClientError) {
						break;
					}

					String strActionResult = actionSession.getActionResult();
					String strActionStep = actionSession.getActionStep();
					String strAsyncAcitonId = (String)actionSession.getActionParam(ActionSession.PARAM_ASYNCACTION_ID);
					if(StringUtils.hasLength(strAsyncAcitonId)) {
						portalAsyncAction.setAsyncAcitonId(strAsyncAcitonId);
					}
					
					if (DataTypeUtils.compare(strLastActionStep, strActionStep) != 0 || DataTypeUtils.compare(strLastActionResult, strActionResult) != 0) {
						// 执行任务更新
						String strTemp = strLastActionResult;
						strLastActionResult = strActionResult;

						actionSession.setActionParam(strLastResultTag, strLastActionResult);

						strLastActionStep = strActionStep;

						portalAsyncAction.setStepInfo(strLastActionStep);

						if (StringUtils.hasLength(strLastActionResult) && StringUtils.hasLength(strTemp) && (strLastActionResult.indexOf(strTemp) == 0)) {
							portalAsyncAction.setActionResult(strLastActionResult.substring(strTemp.length()));
						} else {
							portalAsyncAction.setActionResult(strLastActionResult);
						}
						if(StringUtils.hasLength(portalAsyncAction.getActionResult())) {
							
							try {
								nLastActive = System.currentTimeMillis();
								StringBuilder thinkSB = new StringBuilder();
								StringBuilder contentSB = new StringBuilder();
								
								try (BufferedReader reader = new BufferedReader(new StringReader(portalAsyncAction.getActionResult()))) {
									// 读取每行事件数据
									String line;
									
									while ((line = reader.readLine()) != null) {
										if (StringUtils.hasLength(line)) {
											//判断类型
											if(line.indexOf(THINK_BEGIN) == 0) {
												bThinking = true;
												continue;
											}
											
											if(line.indexOf(THINK_END) == 0) {
												bThinking = false;
												continue;
											}
										}
										if(bThinking) {
											if(StringUtils.hasLength(thinkSB.toString())) {
												thinkSB.append("\n");
											}
											thinkSB.append(line);
											
										}
										else {
											if(StringUtils.hasLength(contentSB.toString())) {
												contentSB.append("\n");
											}
											contentSB.append(line);
										}
									}
								}
								
								String strThink = thinkSB.toString();
								String strContent = contentSB.toString();
								
								if(StringUtils.hasLength(strThink)) {
									Map<String, Object> ret = new LinkedHashMap<String, Object>();
									Map<String, Object> choice = new LinkedHashMap<String, Object>();
									Map<String, Object> delta = new LinkedHashMap<String, Object>();
									delta.put("reasoning_content", strThink);
									delta.put("role", "assistant");
									choice.put("delta", delta);
									choice.put("finish_reason", null);
									choice.put("index", 0);
									choice.put("logprobs", null);
									ret.put("choices", Arrays.asList(choice));
									ret.put("object", "chat.completion.chunk");
									ret.put("created", System.currentTimeMillis()/1000);
									ret.put("system_fingerprint", null);
									ret.put("usage", null);
									ret.put("model", body.get("model"));
									ret.put("id", String.format("chatcmpl-%1$s", KeyValueUtils.genUniqueId()));
									sseEmitter.send(String.format("%1$s", JsonUtils.toObjectNode(ret).toString()));
								}
								else
								if(StringUtils.hasLength(strContent)) {
									Map<String, Object> ret = new LinkedHashMap<String, Object>();
									Map<String, Object> choice = new LinkedHashMap<String, Object>();
									Map<String, Object> delta = new LinkedHashMap<String, Object>();
									delta.put("content", strContent);
									delta.put("role", "assistant");
									choice.put("delta", delta);
									choice.put("finish_reason", null);
									choice.put("index", 0);
									choice.put("logprobs", null);
									ret.put("choices", Arrays.asList(choice));
									ret.put("object", "chat.completion.chunk");
									ret.put("created", System.currentTimeMillis()/1000);
									ret.put("system_fingerprint", null);
									ret.put("usage", null);
									ret.put("model", body.get("model"));
									ret.put("id", String.format("chatcmpl-%1$s", KeyValueUtils.genUniqueId()));
									sseEmitter.send(String.format("%1$s", JsonUtils.toObjectNode(ret).toString()));
								}
							} catch (IOException ex) {
								log.error(ex);
								//取消通讯
								bClientError = true;
								break;
							}
						}
					}
						
					

					try {
						Thread.sleep(20);
					} catch (InterruptedException ex) {
						log.error(ex);
					}

					if (nLastActive - System.currentTimeMillis() >= nTimeout) {
						log.warn(String.format("已经超过[%1$s]没有激活，关闭链路", nTimeout));
						break;
					}
				}
				
				if(bClientError) {
					if(finalSrcPortalAsyncAction != null) {
						try {
							iAIChatAgentRuntimeBase.cancelChatCompletion(new Entity(), finalSrcPortalAsyncAction.getAsyncAcitonId(), new HashMap<String, Object>());
						} catch (Throwable ex) {
							log.error(String.format("取消聊天会话发生异常，%1$s", ex.getMessage()), ex);
						}
					}
				}
			}
			
			@Override
			public Executor getExecutor() {
				return iServiceSystemRuntime.getSseExecutor();
			}
		});

		try {
			portalAsyncAction.setActionState(PortalAsyncActionState.EXECUTING.getValue());
			portalAsyncAction.setBeginTime(new java.sql.Timestamp(System.currentTimeMillis()));

			Object objRet = iAction.execute(args);
			// 移除线程参数
			actionSession.removeActionParam(strWorkTag);

			// 完成最后一步数据
			String strActionResult = actionSession.getActionResult();
			String strLastActionResult = (String) actionSession.getActionParam(strLastResultTag);
			if (StringUtils.hasLength(strActionResult) && StringUtils.hasLength(strLastActionResult) && strActionResult.length() > strLastActionResult.length()) {

				portalAsyncAction.setActionResult(strActionResult.substring(strLastActionResult.length()));
				if(StringUtils.hasLength(portalAsyncAction.getActionResult())) {
					try {
						StringBuilder contentSB = new StringBuilder();
						try (BufferedReader reader = new BufferedReader(new StringReader(portalAsyncAction.getActionResult()))) {
							// 读取每行事件数据
							String line;
							while ((line = reader.readLine()) != null) {
								if(StringUtils.hasLength(contentSB.toString())) {
									contentSB.append("\n");
								}
								contentSB.append(line);
							}
						}
						
						String strContent = contentSB.toString();
						if(StringUtils.hasLength(strContent)) {
							Map<String, Object> ret = new LinkedHashMap<String, Object>();
							Map<String, Object> choice = new LinkedHashMap<String, Object>();
							Map<String, Object> delta = new LinkedHashMap<String, Object>();
							delta.put("content", strContent);
							delta.put("role", "assistant");
							choice.put("delta", delta);
							choice.put("finish_reason", null);
							choice.put("index", 0);
							choice.put("logprobs", null);
							ret.put("choices", Arrays.asList(choice));
							ret.put("object", "chat.completion.chunk");
							ret.put("created", System.currentTimeMillis()/1000);
							ret.put("system_fingerprint", null);
							ret.put("usage", null);
							ret.put("model", body.get("model"));
							ret.put("id", String.format("chatcmpl-%1$s", KeyValueUtils.genUniqueId()));
							sseEmitter.send(String.format("%1$s", JsonUtils.toObjectNode(ret).toString()));
						}
					} catch (IOException ex) {
						log.error(ex);
					}
				}
			}

//			portalAsyncAction.set("completionrate", 100.0);
//			portalAsyncAction.setStepInfo(null);
//			if (objRet != null) {
//				if (objRet instanceof String) {
//					portalAsyncAction.setActionResult((String) objRet);
//				} else {
//					String strResult = WebClientBase.getOutputMapper().writeValueAsString(objRet);
//					portalAsyncAction.setActionResult(strResult);
//				}
//			}

//			Object objDownloadRUrl = actionSession.getActionParam(ActionSession.PARAM_ASYNCACTION_DOWNLOADURL);
//			if (objDownloadRUrl != null) {
//				if (objDownloadRUrl instanceof String) {
//					portalAsyncAction.setAsyncResultDownloadUrl((String) objDownloadRUrl);
//				} else {
//					String strResult = WebClientBase.getOutputMapper().writeValueAsString(objDownloadRUrl);
//					portalAsyncAction.setAsyncResultDownloadUrl(strResult);
//				}
//			}
//
//			portalAsyncAction.setActionState(PortalAsyncActionState.FINISHED.getValue());
//			portalAsyncAction.setEndTime(new java.sql.Timestamp(System.currentTimeMillis()));

			try {
				Map<String, Object> ret = new LinkedHashMap<String, Object>();
				Map<String, Object> choice = new LinkedHashMap<String, Object>();
				Map<String, Object> delta = new LinkedHashMap<String, Object>();
				delta.put("content", "");
				choice.put("delta", delta);
				choice.put("finish_reason", "stop");
				choice.put("index", 0);
				choice.put("logprobs", null);
				ret.put("choices", Arrays.asList(choice));
				ret.put("object", "chat.completion.chunk");
				ret.put("created", System.currentTimeMillis()/1000);
				ret.put("system_fingerprint", null);
				ret.put("usage", null);
				ret.put("model", body.get("model"));
				ret.put("id", String.format("chatcmpl-%1$s", KeyValueUtils.genUniqueId()));
				
				sseEmitter.send(String.format("%1$s", JsonUtils.toObjectNode(ret).toString()));
				sseEmitter.send(String.format("%1$s", "[DONE]"));
			} catch (IOException ex) {
				log.error(ex);
			}

			sseEmitter.complete();

			if (bOpenActionSession) {
				ActionSessionManager.closeSession(true);
			}

		} catch (Throwable ex) {
			actionSession.removeActionParam(strWorkTag);

			if (bOpenActionSession) {
				ActionSessionManager.closeSession(false);
			}
//			if(ex instanceof UserCancelException) {
//				portalAsyncAction.setActionState(PortalAsyncActionState.CANCELED.getValue());
//			}else {
//				portalAsyncAction.setActionState(PortalAsyncActionState.FAILED.getValue());
//			}
//			portalAsyncAction.setEndTime(new java.sql.Timestamp(System.currentTimeMillis()));
//			portalAsyncAction.setActionResult(ex.getMessage());
//
//			try {
//				sseEmitter.send(portalAsyncAction);
//			} catch (IOException ex2) {
//				log.error(ex2);
//			}

			sseEmitter.completeWithError(ex);

			throw ex;
		} finally {
			
		}
	}
	
	protected ISysPortalUtilRuntime getSysPortalUtilRuntime() {
		if (this.iSysPortalUtilRuntime == null) {
			this.iSysPortalUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysPortalUtilRuntime.class, false);
		}
		return this.iSysPortalUtilRuntime;
	}
}
