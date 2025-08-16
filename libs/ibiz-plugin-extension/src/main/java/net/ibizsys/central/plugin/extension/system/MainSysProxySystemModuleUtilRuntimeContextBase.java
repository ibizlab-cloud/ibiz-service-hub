package net.ibizsys.central.plugin.extension.system;

import net.ibizsys.central.system.ISystemModuleUtilRuntimeContext;
import net.ibizsys.central.system.SystemModuleUtilRuntimeContextProxy;

public abstract class MainSysProxySystemModuleUtilRuntimeContextBase <M extends IMainSysProxySystemModuleUtilRuntime, C extends ISystemModuleUtilRuntimeContext> extends SystemModuleUtilRuntimeContextProxy<M, C> implements IMainSysProxySystemModuleUtilRuntimeContext {

	public MainSysProxySystemModuleUtilRuntimeContextBase(C superContext) {
		super(superContext);
	}
	
	
}
