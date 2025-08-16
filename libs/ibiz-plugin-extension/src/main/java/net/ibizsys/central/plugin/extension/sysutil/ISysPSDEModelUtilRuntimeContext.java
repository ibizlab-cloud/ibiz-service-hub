package net.ibizsys.central.plugin.extension.sysutil;

import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;

public interface ISysPSDEModelUtilRuntimeContext extends ISysUtilRuntimeContext {

	/**
	 * 获取系统模型功能组件运行时对象
	 * @return
	 */
	default ISysPSDEModelUtilRuntime getSysPSDEModelUtilRuntime() {
		return this.getModelRuntime();
	}
	
	
	@Override
	ISysPSDEModelUtilRuntime getModelRuntime();
	
	
}
