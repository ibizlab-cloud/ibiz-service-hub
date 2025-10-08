package net.ibizsys.central.cloud.ai.core.addin;

import net.ibizsys.central.cloud.ai.core.cloudutil.ICloudAIUtilRuntimeContext;
import net.ibizsys.central.cloud.core.util.domain.ChatTool;
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
	
	
	
	/**
	 * 获取沟通工具
	 * @return
	 */
	java.util.List<ChatTool> getTools();
	
	
	
	/**
	 * 是否包含指定工具
	 * @param strToolName
	 * @return
	 */
	boolean containsTool(String strToolName);
	
	
	
	/**
	 * 调用指定工具
	 * @param strToolName
	 * @param arg
	 * @param strAppContext 应用上下文数据
	 * @return
	 * @throws Throwable
	 */
	String callTool(String strToolName, Object arg, String strAppContext) throws Throwable;
}
