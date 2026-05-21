package net.ibizsys.central.plugin.task.sysutil;

import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.central.sysutil.SysUtilRuntimeContextProxy;

public abstract class SysTaskUtilRuntimeContextBase <M extends ISysTaskUtilRuntime, C extends ISysUtilRuntimeContext> extends SysUtilRuntimeContextProxy<M, C> implements ISysTaskUtilRuntimeContext {

	public SysTaskUtilRuntimeContextBase(C superContext) {
		super(superContext);
	}
	
	
	@Override
	public ISysTaskUtilRuntime getSysTaskUtilRuntime() {
		return this.getModelRuntime();
	}
}
