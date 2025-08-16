package net.ibizsys.central.plugin.extension.system.util;

import net.ibizsys.central.plugin.extension.system.IMainSysProxySystemModuleUtilRuntimeContext;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.runtime.IModelRuntime;

public class MainSysModelRuntimeProxy extends MainSysModelRuntimeProxyBase<IPSModelObject, IModelRuntime> {

	public MainSysModelRuntimeProxy(IMainSysProxySystemModuleUtilRuntimeContext iMainSysProxySystemModuleUtilRuntimeContext, IPSModelObject iPSModelObject, IModelRuntime realObject) throws Exception {
		super(iMainSysProxySystemModuleUtilRuntimeContext, iPSModelObject, realObject);
	}

}
