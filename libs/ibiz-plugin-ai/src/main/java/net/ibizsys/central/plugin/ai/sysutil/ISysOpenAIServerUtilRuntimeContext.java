package net.ibizsys.central.plugin.ai.sysutil;

import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;

/**
 * 系统OpenAIServer功能组件运行时上下文接口
 * @author lionlau
 *
 */
public interface ISysOpenAIServerUtilRuntimeContext extends ISysUtilRuntimeContext{

	default ISysOpenAIServerUtilRuntime getSysOpenAIServerUtilRuntime() {
		return this.getModelRuntime();
	}
	
	
	@Override
	ISysOpenAIServerUtilRuntime getModelRuntime();

}
