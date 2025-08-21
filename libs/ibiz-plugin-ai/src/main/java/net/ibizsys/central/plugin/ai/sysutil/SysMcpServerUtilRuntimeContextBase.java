package net.ibizsys.central.plugin.ai.sysutil;

import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.central.sysutil.SysUtilRuntimeContextProxy;

public abstract class SysMcpServerUtilRuntimeContextBase <M extends ISysMcpServerUtilRuntime, C extends ISysUtilRuntimeContext> extends SysUtilRuntimeContextProxy<M, C> implements ISysMcpServerUtilRuntimeContext {

	public SysMcpServerUtilRuntimeContextBase(C superContext) {
		super(superContext);
	}
	
	
	@Override
	public ISysMcpServerUtilRuntime getSysMcpServerUtilRuntime() {
		return this.getModelRuntime();
	}
}
