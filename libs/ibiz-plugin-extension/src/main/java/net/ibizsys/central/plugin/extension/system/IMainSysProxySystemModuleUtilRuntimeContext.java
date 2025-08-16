package net.ibizsys.central.plugin.extension.system;

import net.ibizsys.central.system.ISystemModuleUtilRuntimeContext;

public interface IMainSysProxySystemModuleUtilRuntimeContext extends ISystemModuleUtilRuntimeContext{

	@Override
	IMainSysProxySystemModuleUtilRuntime getModelRuntime();
}
