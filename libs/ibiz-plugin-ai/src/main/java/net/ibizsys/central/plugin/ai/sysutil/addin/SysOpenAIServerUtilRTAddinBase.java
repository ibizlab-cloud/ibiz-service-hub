package net.ibizsys.central.plugin.ai.sysutil.addin;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.plugin.ai.sysutil.ISysOpenAIServerUtilRuntime;
import net.ibizsys.central.plugin.ai.sysutil.ISysOpenAIServerUtilRuntimeContext;
import net.ibizsys.runtime.plugin.ModelRTAddinBase2;

public abstract class SysOpenAIServerUtilRTAddinBase extends ModelRTAddinBase2 implements ISysOpenAIServerUtilRTAddin{

	protected ISysOpenAIServerUtilRuntimeContext getContext() {
		return (ISysOpenAIServerUtilRuntimeContext)super.getContext();
	}
	
	public IServiceSystemRuntime getSystemRuntime() {
		return (IServiceSystemRuntime)getContext().getSysOpenAIServerUtilRuntime().getSystemRuntime();
	}
	
	public ISysOpenAIServerUtilRuntime getSysOpenAIServerUtilRuntime() {
		return this.getContext().getSysOpenAIServerUtilRuntime();
	}
	
}
