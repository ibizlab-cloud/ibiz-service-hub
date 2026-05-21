package net.ibizsys.central.cloud.core.dataentity.service;

import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;

public class ProxyDERuntime<FIELD_ENUM extends IProxyDEFieldEnum, ACTION_ENUM extends IProxyDEActionEnum, DATASET_ENUM extends IProxyDEDataSetEnum> extends ProxyDERuntimeBase<FIELD_ENUM, ACTION_ENUM, DATASET_ENUM> {

	public ProxyDERuntime(IDataEntityRuntime iDataEntityRuntime, Class<FIELD_ENUM> proxyDEFieldEnum) throws Exception {
		super(iDataEntityRuntime, proxyDEFieldEnum, null, null);
	}

	public ProxyDERuntime(IDataEntityRuntime iDataEntityRuntime, Class<FIELD_ENUM> proxyDEFieldEnum, Class<ACTION_ENUM> proxyDEActionEnum) throws Exception {
		super(iDataEntityRuntime, proxyDEFieldEnum, proxyDEActionEnum, null);
	}

	
	public ProxyDERuntime(IDataEntityRuntime iDataEntityRuntime, Class<FIELD_ENUM> proxyDEFieldEnum, Class<ACTION_ENUM> proxyDEActionEnum, Class<DATASET_ENUM> proxyDEDataSetEnum) throws Exception {
		super(iDataEntityRuntime, proxyDEFieldEnum, proxyDEActionEnum, proxyDEDataSetEnum);
	}

	
	
	
}
