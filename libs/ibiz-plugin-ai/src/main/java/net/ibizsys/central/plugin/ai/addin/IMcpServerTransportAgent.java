package net.ibizsys.central.plugin.ai.addin;

import net.ibizsys.central.plugin.ai.mcp.spec.McpServerTransportProvider;
import net.ibizsys.runtime.plugin.IModelRTAddin;

public interface IMcpServerTransportAgent extends IModelRTAddin, McpServerTransportProvider{

	/**
	 * 获取类型
	 * @return
	 */
	String getType();
	
	/**
	 * 开始代理
	 */
	void start() throws Exception;
	
	/**
	 * 停止代理
	 */
	void stop() throws Exception;
	
//	/**
//	 * Immediately closes all the transports with connected clients and releases any
//	 * associated resources.
//	 */
//	default void close() {
//		//this.closeGracefully().subscribe();
//		try {
//			stop();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}


}
