package net.ibizsys.central.dataentity.util;

import java.util.Map;

import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.runtime.IModelRuntimeContext;

/**
 * 实体功能运行时上下文对象接口
 * @author lionlau
 *
 */
public interface IDEUtilRuntimeContext extends IModelRuntimeContext{

	@Override
	IDEUtilRuntime getModelRuntime();
	
	
	/**
	 * 获取实体运行时上下文
	 * @return
	 */
	IDataEntityRuntimeContext getDataEntityRuntimeContext();
	
	
	/**
	 * 获取指定类型插件集合
	 * @param cls
	 * @param strTypePrefix
	 * @return
	 */
	<T> Map<String, T> getAddins(Class<T> cls, String strTypePrefix);
}
