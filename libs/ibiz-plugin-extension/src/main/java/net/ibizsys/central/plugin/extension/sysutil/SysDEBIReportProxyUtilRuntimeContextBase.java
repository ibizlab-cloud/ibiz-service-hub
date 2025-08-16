package net.ibizsys.central.plugin.extension.sysutil;

import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.central.sysutil.SysUtilRuntimeContextProxy;

public abstract class SysDEBIReportProxyUtilRuntimeContextBase <M extends ISysDEBIReportProxyUtilRuntime, C extends ISysUtilRuntimeContext> extends SysUtilRuntimeContextProxy<M, C> implements ISysDEBIReportProxyUtilRuntimeContext {

	public SysDEBIReportProxyUtilRuntimeContextBase(C superContext) {
		super(superContext);
	}
	
	
	@Override
	public ISysDEBIReportProxyUtilRuntime getSysDEBIReportProxyUtilRuntime() {
		return this.getModelRuntime();
	}
}
