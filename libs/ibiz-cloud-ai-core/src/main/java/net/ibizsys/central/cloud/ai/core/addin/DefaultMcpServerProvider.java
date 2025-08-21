package net.ibizsys.central.cloud.ai.core.addin;

import net.ibizsys.central.cloud.core.util.domain.McpServer;

public class DefaultMcpServerProvider extends McpServerProviderBase {

	@Override
	public IMcpServerAgent createMcpServerAgent(McpServer mcpServer) {
		return this.getSystemRuntime().createObject(IMcpServerAgent.class, DefaultMcpServerAgent.class);
	}

}
