package net.ibizsys.central.plugin.ai.sysutil;

import net.ibizsys.central.cloud.core.sysutil.ISysUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.AccessToken;
import net.ibizsys.central.plugin.ai.addin.IMcpServerToolProvider;
import net.ibizsys.central.plugin.ai.addin.IMcpServerTransportAgent;

/**
 * 系统McpServer功能组件运行时对象接口
 * @author lionlau
 *
 */
public interface ISysMcpServerUtilRuntime extends ISysUtilRuntime {

	/**
	 * 传输插件前缀
	 */
	public final static String ADDIN_TRANSPORT_PREFIX = "TRANSPORT:";
	
	/**
	 * 工具插件前缀
	 */
	public final static String ADDIN_TOOL_PREFIX = "TOOL:";
	
	
	public final static String TRANSPORT_HTTP_SSE = "HTTP_SSE";
	
	public final static String TRANSPORT_HTTP_STREAMABLE = "HTTP_STREAMABLE";
	
	public final static String TOOL_DEFAULT = "DEFAULT";
	
	//public final static String TOOL_AIFACTORY = "AIFACTORY";
	
	
	/**
	 * 通过类型获取传输代理对象
	 * @param aiPipelineAgentData
	 * @return
	 */
	IMcpServerTransportAgent getTransportAgent(String strType, boolean bTryMode);
	
	
	/**
	 * 通过类型重置传输代理对象
	 * @param strType
	 * @return
	 */
	boolean resetTransportAgent(String strType);
	
	
	/**
	 * 重置全部传输代理对象
	 */
	void resetTransportAgents();
	
	
//	/**
//	 * 重置全部对象
//	 */
//	void resetAll();
	
	
	/**
	 * 是否存在指定工具对象
	 * @param strToolName
	 * @return
	 */
	boolean containsMcpServerToolProvider(String strToolName);
	
	
	/**
	 * 注册McpServer工具对象
	 * @param strToolName
	 * @param iMcpServerTool
	 */
	void registerMcpServerToolProvider(String strToolName, IMcpServerToolProvider iMcpServerTool);
	
	
	/**
	 * 注销McpServer工具对象
	 * @param strToolName
	 * @param iMcpServerTool
	 * @return
	 */
	boolean unregisterMcpServerToolProvider(String strToolName, IMcpServerToolProvider iMcpServerTool);
	
	
	
	/**
	 * 获取访问凭证数据对象
	 * @param strToken
	 * @param bValid
	 * @param bTryMode
	 * @return
	 */
	AccessToken getAccessToken(String strToken, boolean bValid, boolean bTryMode);
	
	/**
	 * 重新加载McpServer
	 */
	void reload();
}
