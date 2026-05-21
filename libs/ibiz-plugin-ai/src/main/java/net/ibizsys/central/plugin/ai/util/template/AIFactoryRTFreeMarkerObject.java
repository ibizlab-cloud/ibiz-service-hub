package net.ibizsys.central.plugin.ai.util.template;

import java.util.HashMap;
import java.util.Map;

import net.ibizsys.central.cloud.core.ai.ISysAIFactoryRuntime;

public class AIFactoryRTFreeMarkerObject {

	private final ISysAIFactoryRuntime iSysAIFactoryRuntime;
	private Map<String, AIChatAgentRTFreeMarkerObject> aiChatAgentRTFreeMarkerObjectMap = new HashMap<String, AIChatAgentRTFreeMarkerObject>();
	public AIFactoryRTFreeMarkerObject(ISysAIFactoryRuntime iSysAIFactoryRuntime) {
		this.iSysAIFactoryRuntime = iSysAIFactoryRuntime;
	}
	
	protected ISysAIFactoryRuntime getSysAIFactoryRuntime() {
		return this.iSysAIFactoryRuntime;
	}
	
	public AIChatAgentRTFreeMarkerObject chat(String strChatAgentTag) {
		AIChatAgentRTFreeMarkerObject aiChatAgentRTFreeMarkerObject = aiChatAgentRTFreeMarkerObjectMap.get(strChatAgentTag);
		if(aiChatAgentRTFreeMarkerObject == null) {
			aiChatAgentRTFreeMarkerObject = new AIChatAgentRTFreeMarkerObject(this.getSysAIFactoryRuntime().getAIChatAgentRuntime(strChatAgentTag, false));
			this.aiChatAgentRTFreeMarkerObjectMap.put(strChatAgentTag, aiChatAgentRTFreeMarkerObject);
		}
		return aiChatAgentRTFreeMarkerObject;
	}
}
