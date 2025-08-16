package net.ibizsys.central.plugin.ai.agent;

public class DefaultAIChatProvider extends AIChatProviderBase{

	
	@Override
	public IAIChatAgent createAIChatAgent(Object aiChatAgentData) {
		return this.getSystemRuntime().createObject(IAIChatAgent.class, DefaultAIChatAgent.class);
	}

}
