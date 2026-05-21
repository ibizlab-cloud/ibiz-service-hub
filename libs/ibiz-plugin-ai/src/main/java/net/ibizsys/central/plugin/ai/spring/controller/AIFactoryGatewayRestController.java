package net.ibizsys.central.plugin.ai.spring.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.HttpStatus;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.IServiceSystemRuntimeBase;
import net.ibizsys.central.cloud.core.ai.IDynaSysAIChatAgentFactoryRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIAgentRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIChatAgentRuntime;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.security.util.AccessTokenUtils;
import net.ibizsys.central.cloud.core.sysutil.ISysPortalUtilRuntime;
import net.ibizsys.central.cloud.core.util.ChatMessagesBuilder;
import net.ibizsys.central.cloud.core.util.UserCancelException;
import net.ibizsys.central.cloud.core.util.domain.AccessToken;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncActionState;
import net.ibizsys.central.plugin.ai.agent.IAIChatSkillAgentRuntimeBase;
import net.ibizsys.central.plugin.ai.agent.ISysAIFactoryRuntime;
import net.ibizsys.central.plugin.ai.util.AIChatUtils;
import net.ibizsys.central.plugin.ai.util.ChatCompletionSessionHolder;
import net.ibizsys.central.plugin.ai.util.IChatCompletionSession;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.SystemRuntimeHolder;

@RestController()
@RequestMapping("")
@ConditionalOnProperty(prefix = "ibiz.servicehub", name = "aifactorygateway", havingValue = "true", matchIfMissing = true)
public class AIFactoryGatewayRestController {

	private static final Logger logger = LoggerFactory.getLogger(AIFactoryGatewayRestController.class);

	public static final String UTF_8 = "UTF-8";
	
	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(AIFactoryGatewayRestController.class);
	
	@Autowired
	IServiceHub iServiceHub;

	@PostConstruct
	protected void postConstruct() {
		iServiceHub.registerIgnoreAuthPattern("/local/ai/sessions/**");
		iServiceHub.registerIgnoreAuthPattern("/*/ai/factories/*/chats/*/webhooks/**");
		iServiceHub.registerIgnoreAuthPattern("/*/ai/factories/*/skill_runners/**");
	}
	

	@PostMapping(value = "/local/ai/sessions/{session_id}/{util}/{method}")
	@ResponseStatus(HttpStatus.OK)
	public Object chatSession(@PathVariable("session_id") String session_id, @PathVariable("util") String util, @PathVariable("method") String method, @RequestBody Map<String, Object> body, HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		boolean bPushSystem = false;
		boolean bChatCompletionSession = false;
		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();
		try {
			
			IChatCompletionSession iChatCompletionSession = ChatCompletionSessionHolder.getById(session_id, false);
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(iChatCompletionSession.getSystemId());
			SystemRuntimeHolder.push(iSystemRuntime);
			bPushSystem = true;
			
			EmployeeContext.setCurrent(iChatCompletionSession.getEmployeeContext());
			ChatCompletionSessionHolder.push(iChatCompletionSession);
			bChatCompletionSession = true;
			
			return iChatCompletionSession.getAgentUtil().internalRequest(util, method, body);
			
		}
		catch (Throwable ex) {
			logger.error(String.format("交互会话操作发生异常，%1$s", ex.getMessage()));
			response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(), String.format("交互会话操作发生异常，%1$s", ex.getMessage()));
			return null;
		}
		finally {
			if(bChatCompletionSession) {
				ChatCompletionSessionHolder.poll();
			}
			
			EmployeeContext.setCurrent(lastEmployeeContext);
			if(bPushSystem) {
				SystemRuntimeHolder.poll();
			}
		}
		
	}
	
	@PostMapping(value = "/{id}/ai/factories/{factory_id}/chats/{agent_id}/toolcall/{command}")
	@ResponseStatus(HttpStatus.OK)
	public Object toolCall(@PathVariable("id") String id, @PathVariable("factory_id") String factory_id, @PathVariable("agent_id") String agent_id, @PathVariable("command") String command, @RequestBody Map<String, Object> body, HttpServletRequest request, HttpServletResponse response) throws IOException {
		boolean bPushSystem = false;
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			bPushSystem = true;
			
			ISysAIFactoryRuntime iSysAIFactoryRuntime = (ISysAIFactoryRuntime)((IServiceSystemRuntime)iSystemRuntime).getSysAIFactoryRuntime(factory_id, true);
			if(iSysAIFactoryRuntime == null) {
				response.sendError(HttpStatus.NOT_FOUND.value(), String.format("指定AI工厂[%1$s]不存在", factory_id));
				return null;
			}
			
			String[] items = agent_id.split("[@-]");
			String strRealAgentId = (items.length == 1)?items[0]:items[1];
			ISysAIChatAgentRuntime iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(strRealAgentId, true);
			if(iSysAIChatAgentRuntime == null) {
				response.sendError(HttpStatus.NOT_FOUND.value(), String.format("指定AI交谈代理[%1$s]不存在", agent_id));
				return null;
			}
			
			if(items.length == 2) {
				if(!(iSysAIChatAgentRuntime instanceof IDynaSysAIChatAgentFactoryRuntime)){
					response.sendError(HttpStatus.NOT_FOUND.value(), String.format("指定AI交谈代理[%1$s]不存在", agent_id));
					return null;
				}
				
				iSysAIChatAgentRuntime = ((IDynaSysAIChatAgentFactoryRuntime)iSysAIChatAgentRuntime).getSysAIChatAgentRuntime(items[0], false);
			}
			
			if(StringUtils.hasLength(iSysAIChatAgentRuntime.getAccessKey())) {
				if(!iSystemRuntime.getSystemAccessManager().testSysUniRes(UserContext.getCurrent(), iSysAIChatAgentRuntime.getAccessKey())) {
					logger.error(String.format("AI交互代理[%1$s]不具备访问控制资源[%2$s]", iSysAIChatAgentRuntime.getName(), iSysAIChatAgentRuntime.getAccessKey()));
					response.sendError(HttpStatus.FORBIDDEN.value(), String.format("AI交互代理[%1$s]不具备访问能力", iSysAIChatAgentRuntime.getName()));
					return null;
				}
			}
			
			if(!(iSysAIChatAgentRuntime instanceof IAIChatSkillAgentRuntimeBase)){
				throw new Exception("AI交互代理类型不正确");
			}
			
			return ((IAIChatSkillAgentRuntimeBase)iSysAIChatAgentRuntime).toolCall(command, body);
		}
		catch (Throwable ex) {
			logger.error(String.format("工具调用发生异常，%1$s", ex.getMessage()));
			response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(), String.format("工具调用发生异常，%1$s", ex.getMessage()));
			return null;
		}
		finally {
			if(bPushSystem) {
				SystemRuntimeHolder.poll();
			}
		}
	}
	
	@PostMapping(value = "/{id}/ai/factories/{factory_id}/chats/{agent_id}/webhooks/{key}")
	@ResponseStatus(HttpStatus.OK)
	public Object invokeWebhook(@PathVariable("id") String id, @PathVariable("factory_id") String factory_id, @PathVariable("agent_id") String agent_id, @PathVariable("key") String key, @RequestBody Map<String, Object> body, HttpServletRequest request, HttpServletResponse response) throws IOException {
		boolean bPushSystem = false;
		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			bPushSystem = true;
			
			ISysAIFactoryRuntime iSysAIFactoryRuntime = (ISysAIFactoryRuntime)((IServiceSystemRuntime)iSystemRuntime).getSysAIFactoryRuntime(factory_id, true);
			if(iSysAIFactoryRuntime == null) {
				response.sendError(HttpStatus.NOT_FOUND.value(), String.format("指定AI工厂[%1$s]不存在", factory_id));
				return null;
			}
			
			AccessToken accessToken = iSysAIFactoryRuntime.getWebhookAccessToken(key, true);
			if(accessToken == null) {
				logger.error(String.format("传入凭证[%1$s]无效", key));
				response.sendError(HttpStatus.FORBIDDEN.value(), String.format("传入凭证[%1$s]无效", key));
				return null;
			}
			
			String[] items = agent_id.split("[@-]");
			String strRealAgentId = (items.length == 1)?items[0]:items[1];
			ISysAIChatAgentRuntime iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(strRealAgentId, true);
			if(iSysAIChatAgentRuntime == null) {
				response.sendError(HttpStatus.NOT_FOUND.value(), String.format("指定AI交谈代理[%1$s]不存在", agent_id));
				return null;
			}
			
			if(items.length == 2) {
				if(!(iSysAIChatAgentRuntime instanceof IDynaSysAIChatAgentFactoryRuntime)){
					response.sendError(HttpStatus.NOT_FOUND.value(), String.format("指定AI交谈代理[%1$s]不存在", agent_id));
					return null;
				}
				
				iSysAIChatAgentRuntime = ((IDynaSysAIChatAgentFactoryRuntime)iSysAIChatAgentRuntime).getSysAIChatAgentRuntime(items[0], false);
			}
			
			String strMessage = (String)body.get("message");
			if(!StringUtils.hasLength(strMessage)) {
				throw new Exception("传入内容无效");
			}
			
			if(accessToken.getEmployee() != null) {
				IEmployeeContext employeeContext = AccessTokenUtils.toEmployeeContext(accessToken, id);
				UserContext.setCurrent(employeeContext);
			}
			else {
				EmployeeContext.setCurrent((IEmployeeContext)iSystemRuntime.createDefaultUserContext());
			}
			
			if(StringUtils.hasLength(iSysAIChatAgentRuntime.getAccessKey())) {
				if(!iSystemRuntime.getSystemAccessManager().testSysUniRes(UserContext.getCurrent(), iSysAIChatAgentRuntime.getAccessKey())) {
					logger.error(String.format("AI交互代理[%1$s]不具备访问控制资源[%2$s]", iSysAIChatAgentRuntime.getName(), iSysAIChatAgentRuntime.getAccessKey()));
					response.sendError(HttpStatus.FORBIDDEN.value(), String.format("AI交互代理[%1$s]不具备访问能力", iSysAIChatAgentRuntime.getName()));
					return null;
				}
			}
			
			ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
			chatCompletionRequest.setMessages(ChatMessagesBuilder.create().user(strMessage).build());
			
			//判断是否有回调
			String strNotifyUrl = (String)body.get("notifyurl");
			if(ObjectUtils.isEmpty(strNotifyUrl)) {
				strNotifyUrl = (String)accessToken.get("notifyurl");
			}
			if(StringUtils.hasLength(strNotifyUrl)) {
				String strFinalNotifyUrl= strNotifyUrl;
				//调异步接口，后续再通知
				PortalAsyncAction portalAsyncAction = iSysAIChatAgentRuntime.asyncChatCompletion(new Entity(), chatCompletionRequest, null, true, false);
				iSystemRuntime.threadRun(new Runnable() {
					@Override
					public void run() {
						invokeWebhookNotifyUrl((IServiceSystemRuntimeBase)iSystemRuntime, portalAsyncAction, strFinalNotifyUrl, body);
					}
				});
				return portalAsyncAction;
			}
			else {
				//调同步接口
				ChatCompletionResult result = iSysAIChatAgentRuntime.chatCompletion(new Entity(), chatCompletionRequest, null, true, false);
				return AIChatUtils.removeThinkingContent(result.getChoices().get(0).getContent());
			}
		}
		catch (Throwable ex) {
			logger.error(String.format("Webhook调用发生异常，%1$s", ex.getMessage()));
			response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(), String.format("Webhook调用发生异常，%1$s", ex.getMessage()));
			return null;
		}
		finally {
			if(bPushSystem) {
				SystemRuntimeHolder.poll();
			}
			EmployeeContext.setCurrent(lastEmployeeContext);
		}
	}
	
	protected void invokeWebhookNotifyUrl(IServiceSystemRuntimeBase iSystemRuntime, PortalAsyncAction portalAsyncAction, String strNotifyUrl, Map<String, Object> body){
		try {
			ChatCompletionResult result = this.doExecuteChatPortalAsyncActionOutput(iSystemRuntime, portalAsyncAction);
			body.put("message", AIChatUtils.removeThinkingContent(result.getChoices().get(0).getContent()));
			body.put("error", false);
			iSystemRuntime.getDefaultWebClient().post(strNotifyUrl, body);
		}
		catch (Throwable ex) {
			log.error(ex);
			body.put("message", ex.getMessage());
			body.put("error", true);
			try {
				iSystemRuntime.getDefaultWebClient().post(strNotifyUrl, body);
			}
			catch (Throwable ex2) {
				log.error(String.format("发送通知发生异常，%1$s", ex.getMessage()), ex);
			}
		}
	}
	
	protected ChatCompletionResult doExecuteChatPortalAsyncActionOutput(IServiceSystemRuntimeBase iSystemRuntime, PortalAsyncAction portalAsyncAction) throws Throwable {
		long nCurrentTime = System.currentTimeMillis();
		long nTimeout = 3000000;
		
		ISysPortalUtilRuntime iSysPortalUtilRuntime = iSystemRuntime.getSysPortalUtilRuntime(false);
		ChatCompletionResult chatCompletionResult = null;
		while (true) {
	
			PortalAsyncAction last = iSysPortalUtilRuntime.getAsyncAction(portalAsyncAction.getAsyncAcitonId());
			int nActionState = DataTypeUtils.getIntegerValue(last.getActionState(), PortalAsyncActionState.EXECUTING.getValue());
			if (nActionState == PortalAsyncActionState.EXECUTING.getValue()) {
				continue;
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
	

	@PostMapping(value = "/{id}/ai/factories/{factory_id}/skill_runners/{key}/register")
	@ResponseStatus(HttpStatus.OK)
	public Object registerSkillRunner(@PathVariable("id") String id, @PathVariable("factory_id") String factory_id, @PathVariable("key") String key, @RequestBody(required=false) Map<String, Object> body, HttpServletRequest request, HttpServletResponse response) throws IOException {
		boolean bPushSystem = false;
		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			bPushSystem = true;
			
			ISysAIFactoryRuntime iSysAIFactoryRuntime = (ISysAIFactoryRuntime)((IServiceSystemRuntime)iSystemRuntime).getSysAIFactoryRuntime(factory_id, true);
			if(iSysAIFactoryRuntime == null) {
				response.sendError(HttpStatus.NOT_FOUND.value(), String.format("指定AI工厂[%1$s]不存在", factory_id));
				return null;
			}
			
			AccessToken accessToken = iSysAIFactoryRuntime.getWebhookAccessToken(key, true);
			if(accessToken == null) {
				logger.error(String.format("传入凭证[%1$s]无效", key));
				response.sendError(HttpStatus.FORBIDDEN.value(), String.format("传入凭证[%1$s]无效", key));
				return null;
			}		
			
			if(accessToken.getEmployee() != null) {
				IEmployeeContext employeeContext = AccessTokenUtils.toEmployeeContext(accessToken, id);
				UserContext.setCurrent(employeeContext);
			}
			else {
				EmployeeContext.setCurrent((IEmployeeContext)iSystemRuntime.createDefaultUserContext());
			}
			
			if(body == null) {
				body = new HashMap<String, Object>();
			}
					
			return iSysAIFactoryRuntime.registerSkillRunner(body);
		}
		catch (Throwable ex) {
			logger.error(String.format("SkillRunner注册发生异常，%1$s", ex.getMessage()));
			response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(), String.format("SkillRunner注册发生异常，%1$s", ex.getMessage()));
			return null;
		}
		finally {
			if(bPushSystem) {
				SystemRuntimeHolder.poll();
			}
			EmployeeContext.setCurrent(lastEmployeeContext);
		}
	}
	
	@PostMapping(value = "/{id}/ai/factories/{factory_id}/skill_runners/{key}/unregister")
	@ResponseStatus(HttpStatus.OK)
	public Object unregisterSkillRunner(@PathVariable("id") String id, @PathVariable("factory_id") String factory_id, @PathVariable("key") String key, @RequestBody Map<String, Object> body, HttpServletRequest request, HttpServletResponse response) throws IOException {
		boolean bPushSystem = false;
		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			bPushSystem = true;
			
			ISysAIFactoryRuntime iSysAIFactoryRuntime = (ISysAIFactoryRuntime)((IServiceSystemRuntime)iSystemRuntime).getSysAIFactoryRuntime(factory_id, true);
			if(iSysAIFactoryRuntime == null) {
				response.sendError(HttpStatus.NOT_FOUND.value(), String.format("指定AI工厂[%1$s]不存在", factory_id));
				return null;
			}
			
			AccessToken accessToken = iSysAIFactoryRuntime.getWebhookAccessToken(key, true);
			if(accessToken == null) {
				logger.error(String.format("传入凭证[%1$s]无效", key));
				response.sendError(HttpStatus.FORBIDDEN.value(), String.format("传入凭证[%1$s]无效", key));
				return null;
			}
			
			if(accessToken.getEmployee() != null) {
				IEmployeeContext employeeContext = AccessTokenUtils.toEmployeeContext(accessToken, id);
				UserContext.setCurrent(employeeContext);
			}
			else {
				EmployeeContext.setCurrent((IEmployeeContext)iSystemRuntime.createDefaultUserContext());
			}
					
			return iSysAIFactoryRuntime.unregisterSkillRunner(body);
		}
		catch (Throwable ex) {
			logger.error(String.format("SkillRunner注销发生异常，%1$s", ex.getMessage()));
			response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(), String.format("SkillRunner注销发生异常，%1$s", ex.getMessage()));
			return null;
		}
		finally {
			if(bPushSystem) {
				SystemRuntimeHolder.poll();
			}
			EmployeeContext.setCurrent(lastEmployeeContext);
		}
	}
	
	@PostMapping(value = "/{id}/ai/factories/{factory_id}/skill_runners/{key}/active")
	@ResponseStatus(HttpStatus.OK)
	public Object activeSkillRunner(@PathVariable("id") String id, @PathVariable("factory_id") String factory_id, @PathVariable("key") String key, @RequestBody Map<String, Object> body, HttpServletRequest request, HttpServletResponse response) throws IOException {
		boolean bPushSystem = false;
		IEmployeeContext lastEmployeeContext = EmployeeContext.getCurrent();
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			bPushSystem = true;
			
			ISysAIFactoryRuntime iSysAIFactoryRuntime = (ISysAIFactoryRuntime)((IServiceSystemRuntime)iSystemRuntime).getSysAIFactoryRuntime(factory_id, true);
			if(iSysAIFactoryRuntime == null) {
				response.sendError(HttpStatus.NOT_FOUND.value(), String.format("指定AI工厂[%1$s]不存在", factory_id));
				return null;
			}
			
			AccessToken accessToken = iSysAIFactoryRuntime.getWebhookAccessToken(key, true);
			if(accessToken == null) {
				logger.error(String.format("传入凭证[%1$s]无效", key));
				response.sendError(HttpStatus.FORBIDDEN.value(), String.format("传入凭证[%1$s]无效", key));
				return null;
			}
			
			if(accessToken.getEmployee() != null) {
				IEmployeeContext employeeContext = AccessTokenUtils.toEmployeeContext(accessToken, id);
				UserContext.setCurrent(employeeContext);
			}
			else {
				EmployeeContext.setCurrent((IEmployeeContext)iSystemRuntime.createDefaultUserContext());
			}
					
			return iSysAIFactoryRuntime.activeSkillRunner(body);
		}
		catch (Throwable ex) {
			logger.error(String.format("SkillRunner激活发生异常，%1$s", ex.getMessage()));
			response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(), String.format("SkillRunner激活发生异常，%1$s", ex.getMessage()));
			return null;
		}
		finally {
			if(bPushSystem) {
				SystemRuntimeHolder.poll();
			}
			EmployeeContext.setCurrent(lastEmployeeContext);
		}
	}
	

	@PostMapping(value = "/{id}/ai/factories/{factory_id}/chats/{agent_id}/chatcompletion")
	@ResponseStatus(HttpStatus.OK)
	public ChatCompletionResult chatCompletion(@PathVariable("id") String id, @PathVariable("factory_id") String factory_id, @PathVariable("agent_id") String agent_id, HttpServletRequest request, HttpServletResponse response, @RequestBody ChatCompletionRequest chatCompletionRequest) throws IOException {
		boolean bPushSystem = false;
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			bPushSystem = true;
			
			ISysAIFactoryRuntime iSysAIFactoryRuntime = (ISysAIFactoryRuntime)((IServiceSystemRuntime)iSystemRuntime).getSysAIFactoryRuntime(factory_id, true);
			if(iSysAIFactoryRuntime == null) {
				response.sendError(HttpStatus.NOT_FOUND.value(), String.format("指定AI工厂[%1$s]不存在", factory_id));
				return null;
			}
			
			String[] items = agent_id.split("[@-]");
			String strRealAgentId = (items.length == 1)?items[0]:items[1];
			ISysAIChatAgentRuntime iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(strRealAgentId, true);
			if(iSysAIChatAgentRuntime == null) {
				response.sendError(HttpStatus.NOT_FOUND.value(), String.format("指定AI交谈代理[%1$s]不存在", agent_id));
				return null;
			}
			
			if(StringUtils.hasLength(iSysAIChatAgentRuntime.getAccessKey())) {
				if(!iSystemRuntime.getSystemAccessManager().testSysUniRes(UserContext.getCurrent(), iSysAIChatAgentRuntime.getAccessKey())) {
					logger.error(String.format("AI交互代理[%1$s]不具备访问控制资源[%2$s]", iSysAIChatAgentRuntime.getName(), iSysAIChatAgentRuntime.getAccessKey()));
					response.sendError(HttpStatus.FORBIDDEN.value(), String.format("AI交互代理[%1$s]不具备访问能力", iSysAIChatAgentRuntime.getName()));
					return null;
				}
			}
			
			iSysAIFactoryRuntime.getChatResourceUtils().convert(chatCompletionRequest, true);
			
			if(items.length ==2) {
				chatCompletionRequest.set(ISysAIAgentRuntime.AIAGENTTAG, items[0]);
			}
			
			return iSysAIChatAgentRuntime.chatCompletion(new Entity(), chatCompletionRequest, null, true, false);
		}
		catch (Throwable ex) {
			logger.error(String.format("交互补全发生异常，%1$s", ex.getMessage()));
			response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(), String.format("交互补全发生异常，%1$s", ex.getMessage()));
			return null;
		}
		finally {
			if(bPushSystem) {
				SystemRuntimeHolder.poll();
			}
		}
	}
	
	
	@PostMapping(value = "/{id}/ai/factories/{factory_id}/chats/{agent_id}/asyncchatcompletion")
	@ResponseStatus(HttpStatus.OK)
	public PortalAsyncAction asyncChatCompletion(@PathVariable("id") String id, @PathVariable("factory_id") String factory_id, @PathVariable("agent_id") String agent_id, HttpServletRequest request, HttpServletResponse response, @RequestBody ChatCompletionRequest chatCompletionRequest) throws IOException {
		boolean bPushSystem = false;
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			bPushSystem = true;
			
			ISysAIFactoryRuntime iSysAIFactoryRuntime = (ISysAIFactoryRuntime)((IServiceSystemRuntime)iSystemRuntime).getSysAIFactoryRuntime(factory_id, true);
			if(iSysAIFactoryRuntime == null) {
				response.sendError(HttpStatus.NOT_FOUND.value(), String.format("指定AI工厂[%1$s]不存在", factory_id));
				return null;
			}
			
			String[] items = agent_id.split("[@-]");
			String strRealAgentId = (items.length == 1)?items[0]:items[1];
			ISysAIChatAgentRuntime iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(strRealAgentId, true);
			if(iSysAIChatAgentRuntime == null) {
				response.sendError(HttpStatus.NOT_FOUND.value(), String.format("指定AI交谈代理[%1$s]不存在", agent_id));
				return null;
			}
			
			if(StringUtils.hasLength(iSysAIChatAgentRuntime.getAccessKey())) {
				if(!iSystemRuntime.getSystemAccessManager().testSysUniRes(UserContext.getCurrent(), iSysAIChatAgentRuntime.getAccessKey())) {
					logger.error(String.format("AI交互代理[%1$s]不具备访问控制资源[%2$s]", iSysAIChatAgentRuntime.getName(), iSysAIChatAgentRuntime.getAccessKey()));
					response.sendError(HttpStatus.FORBIDDEN.value(), String.format("AI交互代理[%1$s]不具备访问能力", iSysAIChatAgentRuntime.getName()));
					return null;
				}
			}
			
			iSysAIFactoryRuntime.getChatResourceUtils().convert(chatCompletionRequest, true);
			
			if(items.length ==2) {
				chatCompletionRequest.set(ISysAIAgentRuntime.AIAGENTTAG, items[0]);
			}
			
			return iSysAIChatAgentRuntime.asyncChatCompletion(new Entity(), chatCompletionRequest, null, true, false);
		}
		catch (Throwable ex) {
			logger.error(String.format("异步交互补全发生异常，%1$s", ex.getMessage()));
			response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(), String.format("异步交互补全发生异常，%1$s", ex.getMessage()));
			return null;
		}
		finally {
			if(bPushSystem) {
				SystemRuntimeHolder.poll();
			}
		}
	}
	
	
	@PostMapping(value = "/{id}/ai/factories/{factory_id}/chats/{agent_id}/cancelchatcompletion")
	@ResponseStatus(HttpStatus.OK)
	public void cancelChatCompletion(@PathVariable("id") String id, @PathVariable("factory_id") String factory_id, @PathVariable("agent_id") String agent_id, HttpServletRequest request, HttpServletResponse response, @RequestBody Map<String, Object> body) throws IOException {
		boolean bPushSystem = false;
		try {
			ISystemRuntime iSystemRuntime = iServiceHub.getLoadedSystemRuntime(id);
			SystemRuntimeHolder.push(iSystemRuntime);
			bPushSystem = true;
			
			ISysAIFactoryRuntime iSysAIFactoryRuntime = (ISysAIFactoryRuntime)((IServiceSystemRuntime)iSystemRuntime).getSysAIFactoryRuntime(factory_id, true);
			if(iSysAIFactoryRuntime == null) {
				response.sendError(HttpStatus.NOT_FOUND.value(), String.format("指定AI工厂[%1$s]不存在", factory_id));
				return;
			}
			
			String[] items = agent_id.split("[@-]");
			String strRealAgentId = (items.length == 1)?items[0]:items[1];
			ISysAIChatAgentRuntime iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(strRealAgentId, true);
			if(iSysAIChatAgentRuntime == null) {
				response.sendError(HttpStatus.NOT_FOUND.value(), String.format("指定AI交谈代理[%1$s]不存在", agent_id));
				return;
			}
			
			if(StringUtils.hasLength(iSysAIChatAgentRuntime.getAccessKey())) {
				if(!iSystemRuntime.getSystemAccessManager().testSysUniRes(UserContext.getCurrent(), iSysAIChatAgentRuntime.getAccessKey())) {
					logger.error(String.format("AI交互代理[%1$s]不具备访问控制资源[%2$s]", iSysAIChatAgentRuntime.getName(), iSysAIChatAgentRuntime.getAccessKey()));
					response.sendError(HttpStatus.FORBIDDEN.value(), String.format("AI交互代理[%1$s]不具备访问能力", iSysAIChatAgentRuntime.getName()));
					return;
				}
			}
			
			String strAsyncActionId = (String) body.get("asyncacitonid");
			if(!StringUtils.hasLength(strAsyncActionId)) {
				throw new Exception("取消聊天交互未指定行为标识");
			}
			if(items.length ==2) {
				body.put(ISysAIAgentRuntime.AIAGENTTAG, items[0]);
			}
			
			iSysAIChatAgentRuntime.cancelChatCompletion(new Entity(), strAsyncActionId, body);
			return;
		}
		catch (Throwable ex) {
			logger.error(String.format("取消交互补全发生异常，%1$s", ex.getMessage()));
			response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(), String.format("取消交互补全发生异常，%1$s", ex.getMessage()));
			return;
		}
		finally {
			if(bPushSystem) {
				SystemRuntimeHolder.poll();
			}
		}
	}

}
