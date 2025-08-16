package net.ibizsys.central.plugin.cloud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudAIClient;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.KeyValueUtils;

public class CloudServiceAIClientRuntime extends CloudServicePredefinedClientRuntimeBase{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(CloudServiceAIClientRuntime.class);
	
	
	public final static String CONTEXT_AITYPE = "AITYPE";
	
	public final static String CONTEXT_AISESSION = "AISESSION";
	
	
	public final static String CONTEXT_AITYPE_DEFAULT = "DEFAULT";
	
	/**
	 * 方法代码标识：交互补全
	 */
	public final static String METHODCODENAME_CHATCOMPLETION = "CHATCOMPLETION";
	
	protected ICloudAIClient getCloudAIClient() {
		return this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_AI, ICloudAIClient.class);
	}
	
	@Override
	protected Object onInvokeMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, Map<String, Object> context, Object[] args) throws Throwable {
		if(METHODCODENAME_CHATCOMPLETION.equalsIgnoreCase(iPSSubSysServiceAPIDEMethod.getCodeName())) {
			if(ObjectUtils.isEmpty(args)) {
				throw new Exception("未传入调用参数");
			}
			
			String strAIType = null;
			String strSessionId = null;
			if(context!=null) {
				strAIType = (String) context.get(CONTEXT_AITYPE);
				strSessionId = (String) context.get(CONTEXT_AISESSION);
			}
			if(!StringUtils.hasLength(strAIType)) {
				strAIType = CONTEXT_AITYPE_DEFAULT;
			}
			
			if(!StringUtils.hasLength(strSessionId)) {
				if(EmployeeContext.getCurrent()!=null) {
					strSessionId = String.format("%1$s_%2$s_%3$s", EmployeeContext.getCurrent().getTenant(), EmployeeContext.getCurrent().getSystemid(), EmployeeContext.getCurrent().getUaausername());
				}
				else
					if(AuthenticationUser.getCurrent()!=null) {
						strSessionId = String.format("%1$s", AuthenticationUser.getCurrent().getUsername());
					}
					else
						strSessionId = KeyValueUtils.genGuidEx();
			}
			
			//重新构建参数
			Object arg = args[0];
			ChatCompletionRequest chatCompletionRequest = null;
			if(arg instanceof ChatCompletionRequest) {
				chatCompletionRequest = (ChatCompletionRequest)arg;
			}
			else {
				List<ChatMessage> list = new ArrayList<>();
				if(arg instanceof List) {
					for(Object item : (List)arg) {
						list.add(getChatMessage(item));
					}
				}
				else {
					list.add(getChatMessage(arg));
				}
				chatCompletionRequest = new ChatCompletionRequest();
				chatCompletionRequest.setSessionId(strSessionId);
				chatCompletionRequest.setMessages(list);
			}
			
			return getCloudAIClient().chatCompletion(strAIType, chatCompletionRequest);
		}
		return super.onInvokeMethod(iPSSubSysServiceAPIDEMethod, context, args);
	}
	
	
	protected ChatMessage getChatMessage(Object item) throws Throwable{
		if(item instanceof ChatMessage) {
			return (ChatMessage)item;
		}
		if(item instanceof IEntity) {
			ChatMessage chatMessage = new ChatMessage();
			((IEntity)item).copyTo(chatMessage);
			return chatMessage;
		}
		if(item instanceof Map) {
			ChatMessage chatMessage = new ChatMessage();
			Map map = (Map)item;
			for(Object key : map.keySet()) {
				if(ObjectUtils.isEmpty(key)) {
					continue;
				}
				chatMessage.set(key.toString(), map.get(key));
			}
			return chatMessage;
		}
		throw new Exception(String.format("无法将对象[%1$s]转换至ChatMessage",item));
	}
}
