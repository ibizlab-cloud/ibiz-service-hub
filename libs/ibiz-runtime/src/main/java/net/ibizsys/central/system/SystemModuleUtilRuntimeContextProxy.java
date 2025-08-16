package net.ibizsys.central.system;

import java.util.Map;

import net.ibizsys.central.ISystemRuntimeContext;

public class SystemModuleUtilRuntimeContextProxy<M extends ISystemModuleUtilRuntime, C extends ISystemModuleUtilRuntimeContext> extends SystemModuleUtilRuntimeContextBase<M>{

	final C proxyContext;
	public SystemModuleUtilRuntimeContextProxy(C proxyContext) {
		this.proxyContext = proxyContext;
	}
	
	
	@Override
	public <T> Map<String, T> getAddins(Class<T> cls, String strTypePrefix) {
		return this.getProxyContext().getAddins(cls, strTypePrefix);
	}

	@Override
	public M getModelRuntime() {
		return (M)getProxyContext().getModelRuntime();
	}
	
	@Override
	public ISystemRuntimeContext getSystemRuntimeContext() {
		return getProxyContext().getSystemRuntimeContext();
	}
	
	
	protected C getProxyContext() {
		return this.proxyContext;
	}

}
