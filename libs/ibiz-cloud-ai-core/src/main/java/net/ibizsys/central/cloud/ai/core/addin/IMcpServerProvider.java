package net.ibizsys.central.cloud.ai.core.addin;

import net.ibizsys.central.cloud.core.util.domain.McpServer;

/**
 * McpServer提供者
 * @author lionlau
 *
 */
public interface IMcpServerProvider extends ICloudAIUtilRTAddin{

	/**
	 * 建立AI平台访问代理对象
	 * @param mcpServer
	 * @return
	 */
	IMcpServerAgent createMcpServerAgent(McpServer mcpServer);
}
