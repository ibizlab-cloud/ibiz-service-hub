package net.ibizsys.central.plugin.extension.sysutil;

import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.central.sysutil.SysUtilRuntimeContextProxy;

public abstract class SysPSDEModelUtilRuntimeContextBase <M extends ISysPSDEModelUtilRuntime, C extends ISysUtilRuntimeContext> extends SysUtilRuntimeContextProxy<M, C> implements ISysPSDEModelUtilRuntimeContext {

	public SysPSDEModelUtilRuntimeContextBase(C superContext) {
		super(superContext);
	}
	
	
	@Override
	public ISysPSDEModelUtilRuntime getSysPSDEModelUtilRuntime() {
		return this.getModelRuntime();
	}
}
