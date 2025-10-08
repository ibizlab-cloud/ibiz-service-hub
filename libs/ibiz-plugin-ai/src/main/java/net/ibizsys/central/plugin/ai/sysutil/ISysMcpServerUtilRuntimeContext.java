package net.ibizsys.central.plugin.ai.sysutil;

import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.runtime.security.IUserContext;

/**
 * 系统McpServer功能组件运行时上下文接口
 * @author lionlau
 *
 */
public interface ISysMcpServerUtilRuntimeContext extends ISysUtilRuntimeContext{

	default ISysMcpServerUtilRuntime getSysMcpServerUtilRuntime() {
		return this.getModelRuntime();
	}
	
	
	@Override
	ISysMcpServerUtilRuntime getModelRuntime();
	
	
	/**
	 * 获取基础路径
	 * @return
	 */
	String getBaseUrl();
	
	
	/**
	 * 获取默认的用户上下文
	 * @return
	 */
	IUserContext getDefaultUserContext();
	
	
	/**
	 * 仅支持默认用户上下文
	 * @return
	 */
	boolean isDefaultUserOnly();
}
