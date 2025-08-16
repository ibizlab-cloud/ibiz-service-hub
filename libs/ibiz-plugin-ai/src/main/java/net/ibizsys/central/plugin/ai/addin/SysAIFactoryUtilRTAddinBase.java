package net.ibizsys.central.plugin.ai.addin;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.plugin.ai.sysutil.ISysAIFactoryUtilRuntime;
import net.ibizsys.central.plugin.ai.sysutil.ISysAIFactoryUtilRuntimeContext;
import net.ibizsys.runtime.plugin.ModelRTAddinBase2;

public abstract class SysAIFactoryUtilRTAddinBase extends ModelRTAddinBase2 implements ISysAIFactoryUtilRTAddin{

	protected ISysAIFactoryUtilRuntimeContext getContext() {
		return (ISysAIFactoryUtilRuntimeContext)super.getContext();
	}
	
	public ISystemRuntime getSystemRuntime() {
		return getContext().getSysAIFactoryUtilRuntime().getSystemRuntime();
	}
	
	public ISysAIFactoryUtilRuntime getSysAIFactoryUtilRuntime() {
		return this.getContext().getSysAIFactoryUtilRuntime();
	}
	
}
