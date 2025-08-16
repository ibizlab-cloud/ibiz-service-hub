package net.ibizsys.central.plugin.extension.dataentity.util.proxy;

import java.lang.reflect.Method;

import net.ibizsys.central.dataentity.logic.IDEMSLogicRuntime;
import net.ibizsys.central.plugin.extension.dataentity.util.IDEExtensionUtilRuntimeContext;

public class DEMSLogicRuntimeProxy extends DEModelRuntimeProxyBase<IDEMSLogicRuntime>{

	
	public DEMSLogicRuntimeProxy(IDEExtensionUtilRuntimeContext iDEExtensionUtilRuntimeContext, IDEMSLogicRuntime realObject) throws Exception {
		super(iDEExtensionUtilRuntimeContext, realObject);
		
	}

	@Override
	public String getModelType() {
		return "PSDEMSLOGIC";
	}
	
	
	@Override
	protected IDEMSLogicRuntime getRealObject(Method method, Object[] args) {
		String[] tags = this.getExtensionTags(method, args);
		if(tags != null) {
			for(String strTag : tags) {
				IDEMSLogicRuntime iDEMSLogicRuntime = this.getDEExtensionUtilRuntime().getDEMSLogicRuntime(strTag, false, true);
				if(iDEMSLogicRuntime != null) {
					return iDEMSLogicRuntime;
				}
			}
		}
		
		return super.getRealObject(method, args);
	}
	
}
