package net.ibizsys.central.plugin.extension.sysutil;

import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;

public interface ISysDEBIReportProxyUtilRuntimeContext extends ISysUtilRuntimeContext {

	/**
	 * 获取系统实体智能报表代理功能组件运行时对象
	 * @return
	 */
	default ISysDEBIReportProxyUtilRuntime getSysDEBIReportProxyUtilRuntime() {
		return this.getModelRuntime();
	}
	
	
	@Override
	ISysDEBIReportProxyUtilRuntime getModelRuntime();
	
	
}
