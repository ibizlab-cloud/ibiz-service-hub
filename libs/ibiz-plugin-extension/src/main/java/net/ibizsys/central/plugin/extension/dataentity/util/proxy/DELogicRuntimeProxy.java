package net.ibizsys.central.plugin.extension.dataentity.util.proxy;

import net.ibizsys.central.dataentity.logic.IDELogicRuntime;
import net.ibizsys.central.plugin.extension.dataentity.util.IDEExtensionUtilRuntimeContext;

public class DELogicRuntimeProxy extends DEModelRuntimeProxyBase<IDELogicRuntime>{

	public DELogicRuntimeProxy(IDEExtensionUtilRuntimeContext iDEExtensionUtilRuntimeContext, IDELogicRuntime realObject) throws Exception {
		super(iDEExtensionUtilRuntimeContext, realObject);
	}

	@Override
	public String getModelType() {
		return "PSDELOGIC";
	}
	
	
}
