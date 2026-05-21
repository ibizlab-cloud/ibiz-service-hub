package net.ibizsys.central.plugin.task.sysutil.addin;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.plugin.task.sysutil.ISysTaskUtilRuntime;
import net.ibizsys.central.plugin.task.sysutil.ISysTaskUtilRuntimeContext;
import net.ibizsys.runtime.plugin.ModelRTAddinBase2;

public abstract class SysTaskUtilRTAddinBase extends ModelRTAddinBase2 implements ISysTaskUtilRTAddin{

	protected ISysTaskUtilRuntimeContext getContext() {
		return (ISysTaskUtilRuntimeContext)super.getContext();
	}
	
	public IServiceSystemRuntime getSystemRuntime() {
		return (IServiceSystemRuntime)getContext().getSysTaskUtilRuntime().getSystemRuntime();
	}
	
	public ISysTaskUtilRuntime getSysTaskUtilRuntime() {
		return this.getContext().getSysTaskUtilRuntime();
	}
	
}
