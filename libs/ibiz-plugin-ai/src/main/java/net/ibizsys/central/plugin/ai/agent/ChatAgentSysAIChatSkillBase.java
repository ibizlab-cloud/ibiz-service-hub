package net.ibizsys.central.plugin.ai.agent;

import org.springframework.util.ObjectUtils;

public abstract class ChatAgentSysAIChatSkillBase extends net.ibizsys.central.cloud.core.ai.ChatAgentSysAIChatSkillBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ChatAgentSysAIChatSkillBase.class);
	
	@Override
	protected void onInit() throws Exception {
		
		super.onInit();
	}
	
	@Override
	protected void prepareSkillInfo() throws Exception {
		if(getSysAIChatAgentRuntime() instanceof IAIChatSkillAgentRuntimeBase) {
			IAIChatSkillAgentRuntimeBase iAIChatSkillAgentRuntimeBase = (IAIChatSkillAgentRuntimeBase)getSysAIChatAgentRuntime();
			
			if(ObjectUtils.isEmpty(this.getDescription())) {
				this.setDescription(iAIChatSkillAgentRuntimeBase.getReadme());
			}
			if(ObjectUtils.isEmpty(this.getPrompt())) {
				this.setPrompt(iAIChatSkillAgentRuntimeBase.getSkillPrompt());
			}
		}
		super.prepareSkillInfo();
	}
}
