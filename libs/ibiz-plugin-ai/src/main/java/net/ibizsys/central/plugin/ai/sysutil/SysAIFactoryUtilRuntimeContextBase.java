package net.ibizsys.central.plugin.ai.sysutil;

import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.central.sysutil.SysUtilRuntimeContextProxy;

public abstract class SysAIFactoryUtilRuntimeContextBase <M extends ISysAIFactoryUtilRuntime, C extends ISysUtilRuntimeContext> extends SysUtilRuntimeContextProxy<M, C> implements ISysAIFactoryUtilRuntimeContext {

	public SysAIFactoryUtilRuntimeContextBase(C superContext) {
		super(superContext);
	}
	
	
	@Override
	public ISysAIFactoryUtilRuntime getSysAIFactoryUtilRuntime() {
		return this.getModelRuntime();
	}
}
