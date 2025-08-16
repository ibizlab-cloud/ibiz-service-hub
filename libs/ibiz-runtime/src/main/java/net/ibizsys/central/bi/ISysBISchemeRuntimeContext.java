package net.ibizsys.central.bi;

import net.ibizsys.runtime.IModelRuntimeContext;

/**
 * 系统智能报表体系运行时上下文对象
 * @author lionlau
 *
 */
public interface ISysBISchemeRuntimeContext extends IModelRuntimeContext {

	/**
	 * 获取系统智能报表体系运行时对象
	 * @return
	 */
	default ISysBISchemeRuntime getSysBISchemeRuntime() {
		return getModelRuntime();
	}
	
	
	
	@Override
	ISysBISchemeRuntime getModelRuntime();
	
	
	
}
