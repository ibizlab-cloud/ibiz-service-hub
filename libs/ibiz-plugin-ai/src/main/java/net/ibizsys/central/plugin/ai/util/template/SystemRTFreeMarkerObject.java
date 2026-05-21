package net.ibizsys.central.plugin.ai.util.template;

import org.springframework.util.ObjectUtils;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIAgentRuntimeContext;
import net.ibizsys.central.cloud.core.ai.ISysAIChatAgentRuntime;
import net.ibizsys.central.cloud.core.ai.util.ChatCompletionRequestHolder;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.DataTypeUtils;

public class SystemRTFreeMarkerObject {

	private ISysAIAgentRuntimeContext iSysAIAgentRuntimeContext = null;
	private ISystemRuntime iSystemRuntime = null;
	
	public SystemRTFreeMarkerObject(ISysAIAgentRuntimeContext iSysAIAgentRuntimeContext) {
		this.iSysAIAgentRuntimeContext = iSysAIAgentRuntimeContext;
	}
	
	public SystemRTFreeMarkerObject(ISystemRuntime iSystemRuntime) {
		this.iSystemRuntime = iSystemRuntime;
	}
	
	
	/**
	 * 获取用户标识
	 * @return
	 */
	public String getUser_id() {
		return UserContext.getCurrentMust().getUserid();
	}
	
	
	public String getUser_name() {
		return UserContext.getCurrentMust().getUsername();
	}
	
	public String getUser_code() {
		return UserContext.getCurrentMust().getUsercode();
	}
	
	
	public String getDept_id() {
		return UserContext.getCurrentMust().getDeptid();
	}
	
	public String getDept_name() {
		return UserContext.getCurrentMust().getDeptname();
	}
	
	public String getDept_code() {
		return UserContext.getCurrentMust().getDeptcode();
	}
	
	public String getOrg_id() {
		return UserContext.getCurrentMust().getOrgid();
	}
	
	public String getOrg_name() {
		return UserContext.getCurrentMust().getOrgname();
	}
	
	public String getOrg_code() {
		return UserContext.getCurrentMust().getOrgcode();
	}
	
	
	public String getQuery() {
		ChatCompletionRequest chatCompletionRequest = ChatCompletionRequestHolder.peek();
		if(chatCompletionRequest == null || ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
			return null;
		}
		
		return chatCompletionRequest.getMessages().get(chatCompletionRequest.getMessages().size() -1).getContent();
	}
	
	public int getConversation_turns() {
		if(this.iSysAIAgentRuntimeContext == null) {
			return -1;
		}
		Integer value = ((ISysAIChatAgentRuntime)this.iSysAIAgentRuntimeContext.getModelRuntime()).getPSModelObject().getMemoryMaxTurns();
		return DataTypeUtils.asInteger(value, -1);
	}
	
}
