package net.ibizsys.central.plugin.ai.sysutil;

import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;

/**
 * 系统AI工厂功能组件运行时上下文接口
 * @author lionlau
 *
 */
public interface ISysAIFactoryUtilRuntimeContext extends ISysUtilRuntimeContext{

	default ISysAIFactoryUtilRuntime getSysAIFactoryUtilRuntime() {
		return this.getModelRuntime();
	}
	
	
	@Override
	ISysAIFactoryUtilRuntime getModelRuntime();
	
	/**
	 * 获取配置内容
	 * @param 当前数据
	 * @param strConfigId
	 * @param bTryMode
	 * @return
	 * @throws Throwable
	 */
	String getConfigContent(Object data, String strConfigId, boolean bTryMode) throws Throwable;
}
