package net.ibizsys.central.plugin.open.sysutil;

import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.central.sysutil.SysUtilRuntimeContextProxy;

public abstract class SysOpenUtilRuntimeContextBase <M extends ISysOpenUtilRuntime, C extends ISysUtilRuntimeContext> extends SysUtilRuntimeContextProxy<M, C> implements ISysOpenUtilRuntimeContext {

	public SysOpenUtilRuntimeContextBase(C superContext) {
		super(superContext);
	}
	
	
	@Override
	public ISysOpenUtilRuntime getSysOpenUtilRuntime() {
		return this.getModelRuntime();
	}
}
