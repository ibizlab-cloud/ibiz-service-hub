package net.ibizsys.central.plugin.test.testing.addin;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.testing.ISysTestPrjRuntime;
import net.ibizsys.central.cloud.core.testing.ISysTestPrjRuntimeContext;
import net.ibizsys.runtime.plugin.ModelRTAddinBase2;

public abstract class SysTestPrjRTAddinBase extends ModelRTAddinBase2 implements ISysTestPrjRTAddin{

	protected ISysTestPrjRuntimeContext getContext() {
		return (ISysTestPrjRuntimeContext)super.getContext();
	}
	
	public IServiceSystemRuntime getSystemRuntime() {
		return (IServiceSystemRuntime)getContext().getModelRuntime().getSystemRuntime();
	}
	
	public ISysTestPrjRuntime getSysTestPrjRuntime() {
		return this.getContext().getModelRuntime();
	}
	
}
