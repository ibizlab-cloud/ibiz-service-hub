package net.ibizsys.central.plugin.ai.sysutil;

import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.central.sysutil.SysUtilRuntimeContextProxy;

public abstract class SysOpenAIServerUtilRuntimeContextBase <M extends ISysOpenAIServerUtilRuntime, C extends ISysUtilRuntimeContext> extends SysUtilRuntimeContextProxy<M, C> implements ISysOpenAIServerUtilRuntimeContext {

	public SysOpenAIServerUtilRuntimeContextBase(C superContext) {
		super(superContext);
	}
	
	
	@Override
	public ISysOpenAIServerUtilRuntime getSysOpenAIServerUtilRuntime() {
		return this.getModelRuntime();
	}
}
