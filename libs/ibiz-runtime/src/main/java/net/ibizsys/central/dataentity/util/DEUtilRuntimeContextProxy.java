package net.ibizsys.central.dataentity.util;

import java.util.Map;

import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;

public class DEUtilRuntimeContextProxy<M extends IDEUtilRuntime, C extends IDEUtilRuntimeContext> extends DEUtilRuntimeContextBase<M>{

	final C proxyContext;
	public DEUtilRuntimeContextProxy(C proxyContext) {
		this.proxyContext = proxyContext;
	}
	
	
	@Override
	public <T> Map<String, T> getAddins(Class<T> cls, String strTypePrefix) {
		return this.getProxyContext().getAddins(cls, strTypePrefix);
	}
	
	@Override
	public IDataEntityRuntimeContext getDataEntityRuntimeContext() {
		return this.getProxyContext().getDataEntityRuntimeContext();
	}

	@Override
	public M getModelRuntime() {
		return (M)getProxyContext().getModelRuntime();
	}
	
	
	
	protected C getProxyContext() {
		return this.proxyContext;
	}
	
	
	

}
