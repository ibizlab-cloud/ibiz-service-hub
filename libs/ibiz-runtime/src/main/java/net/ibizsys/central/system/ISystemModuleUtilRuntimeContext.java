package net.ibizsys.central.system;

import java.util.Map;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.runtime.IModelRuntimeContext;

/**
 * 系统模块运行时上下文对象接口
 * @author lionlau
 *
 */
public interface ISystemModuleUtilRuntimeContext extends IModelRuntimeContext{

	
	
	
	/* (non-Javadoc)
	 * @see net.ibizsys.runtime.IModelRuntimeContext#getModelRuntime()
	 */
	ISystemModuleUtilRuntime getModelRuntime();
	
	
	/**
	 * 获取指定类型插件集合
	 * @param cls
	 * @param strTypePrefix
	 * @return
	 */
	<T> Map<String, T> getAddins(Class<T> cls, String strTypePrefix);
	
	
	/**
	 * 获取系统运行时上下文对象
	 * @return
	 */
	ISystemRuntimeContext getSystemRuntimeContext();
}
