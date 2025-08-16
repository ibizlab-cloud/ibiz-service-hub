package net.ibizsys.central.plugin.ai.agent;

public class PSAppDEACModeAIChatProvider extends AIChatProviderBase{

	
	@Override
	public IAIChatAgent createAIChatAgent(Object aiChatAgentData) {
		return this.getSystemRuntime().createObject(IAIChatAgent.class, PSAppDEACModeAIChatAgent.class);
	}

}
