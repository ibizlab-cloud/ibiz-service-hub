package net.ibizsys.central.cloud.ai.core.addin;

import net.ibizsys.central.cloud.ai.core.cloudutil.ICloudAIUtilRuntimeContext;
import net.ibizsys.central.cloud.core.util.domain.McpServer;

/**
 * McpServer代理
 * @author lionlau
 *
 */
public interface IMcpServerAgent extends ICloudAIUtilRTAddin{

	/**
	 * 初始化
	 * @param ctx
	 * @param mcpServer
	 * @throws Exception
	 */
	void init(ICloudAIUtilRuntimeContext ctx, McpServer mcpServer) throws Exception;
	
	
	/**
	 * 开始代理
	 */
	void start() throws Exception;
	
	/**
	 * 停止代理
	 */
	void stop() throws Exception;
	
	
	/**
	 * 获取代理数据
	 * @return
	 */
	McpServer getAgentData();

	
	/**
	 * 获取McpServer类型
	 * @return
	 */
	String getType();
	
	
	
	
}
