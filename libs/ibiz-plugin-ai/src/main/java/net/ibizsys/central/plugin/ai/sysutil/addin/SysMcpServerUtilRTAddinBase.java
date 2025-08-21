package net.ibizsys.central.plugin.ai.sysutil.addin;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.plugin.ai.sysutil.ISysMcpServerUtilRuntime;
import net.ibizsys.central.plugin.ai.sysutil.ISysMcpServerUtilRuntimeContext;
import net.ibizsys.runtime.plugin.ModelRTAddinBase2;

public abstract class SysMcpServerUtilRTAddinBase extends ModelRTAddinBase2 implements ISysMcpServerUtilRTAddin{

	protected ISysMcpServerUtilRuntimeContext getContext() {
		return (ISysMcpServerUtilRuntimeContext)super.getContext();
	}
	
	public ISystemRuntime getSystemRuntime() {
		return getContext().getSysMcpServerUtilRuntime().getSystemRuntime();
	}
	
	public ISysMcpServerUtilRuntime getSysMcpServerUtilRuntime() {
		return this.getContext().getSysMcpServerUtilRuntime();
	}
	
}
