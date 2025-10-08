package net.ibizsys.central.plugin.ai.addin;

import java.util.List;

import io.modelcontextprotocol.server.McpServerFeatures;
import net.ibizsys.runtime.plugin.IModelRTAddin2;

/**
 * McpServer工具对象接口
 * @author lionlau
 *
 */
public interface IMcpServerToolProvider extends IModelRTAddin2 {

	/**
	 * 获取异步工具定义
	 * @return
	 */
	List<McpServerFeatures.AsyncToolSpecification> getAsyncToolSpecifications();
	
	
	/**
	 * 获取同步工具定义
	 * @return
	 */
	List<McpServerFeatures.SyncToolSpecification> getSyncToolSpecifications();
}
