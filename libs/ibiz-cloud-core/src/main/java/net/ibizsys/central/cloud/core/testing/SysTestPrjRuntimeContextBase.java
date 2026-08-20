package net.ibizsys.central.cloud.core.testing;

import net.ibizsys.central.testing.SysTestPrjRuntimeContextProxy;

public abstract class SysTestPrjRuntimeContextBase extends SysTestPrjRuntimeContextProxy implements ISysTestPrjRuntimeContext {

	protected SysTestPrjRuntimeContextBase(net.ibizsys.central.testing.ISysTestPrjRuntimeContext proxySysTestPrjRuntimeContext) {
		super(proxySysTestPrjRuntimeContext);
	}
	
	@Override
	public ISysTestPrjRuntime getModelRuntime() {
		return (ISysTestPrjRuntime)super.getModelRuntime();
	}

}
