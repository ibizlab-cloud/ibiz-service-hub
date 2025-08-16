package net.ibizsys.runtime.plugin;

import net.ibizsys.runtime.IModelRuntimeContext;

/**
 * 模型运行时插件接口
 * @author lionlau
 *
 */
public interface IModelRTAddin {

	/**
	 * 初始化
	 * @param ctx
	 * @param addinData
	 * @throws Exception
	 */
	void init(IModelRuntimeContext ctx, Object addinData) throws Exception;
	
	
	/**
	 * 获取名称
	 * @return
	 */
	String getName();
	
	
//	/**
//	 * 获取模型运行时
//	 * @return
//	 */
//	IModelRuntime getModelRuntime(); 
}
