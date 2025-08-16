package net.ibizsys.central.plugin.ai.agent;

public class EntityAIChatProvider extends AIChatProviderBase{

	
	@Override
	public IAIChatAgent createAIChatAgent(Object aiChatAgentData) {
		return this.getSystemRuntime().createObject(IAIChatAgent.class, EntityAIChatAgent.class);
	}

}
