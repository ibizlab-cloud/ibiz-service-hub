package net.ibizsys.central.plugin.extension.sysutil;

import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.central.sysutil.SysUtilRuntimeContextProxy;

public abstract class SysExtensionUtilRuntimeContextBase <M extends ISysExtensionUtilRuntime, C extends ISysUtilRuntimeContext> extends SysUtilRuntimeContextProxy<M, C> implements ISysExtensionUtilRuntimeContext {

	public SysExtensionUtilRuntimeContextBase(C superContext) {
		super(superContext);
	}
	
	
	@Override
	public ISysExtensionUtilRuntime getSysExtensionUtilRuntime() {
		return this.getModelRuntime();
	}
}
