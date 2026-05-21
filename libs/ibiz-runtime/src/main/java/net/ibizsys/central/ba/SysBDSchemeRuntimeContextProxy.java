package net.ibizsys.central.ba;

public class SysBDSchemeRuntimeContextProxy<M extends ISysBDSchemeRuntime, C extends ISysBDSchemeRuntimeContext> extends SysBDSchemeRuntimeContextBase<M>{

	final C proxyContext;
	public SysBDSchemeRuntimeContextProxy(C proxyContext) {
		this.proxyContext = proxyContext;
	}
	
	
//	@Override
//	public <T> Map<String, T> getAddins(Class<T> cls, String strTypePrefix) {
//		return this.getProxyContext().getAddins(cls, strTypePrefix);
//	}
//
//	@Override
//	public ISystemRuntimeContext getSystemRuntimeContext() {
//		return this.getProxyContext().getSystemRuntimeContext();
//	}
//	
	@Override
	public M getModelRuntime() {
		return (M)getProxyContext().getSysBDSchemeRuntime();
	}
	
	protected C getProxyContext() {
		return this.proxyContext;
	}


	@Override
	public ISysBDSchemeRuntime getSysBDSchemeRuntime() {
		return getProxyContext().getSysBDSchemeRuntime();
	}


//	@Override
//	public String getSetting(String strKey, String strDefault) {
//		return getProxyContext().getSetting(strKey, strDefault);
//	}
//
//
//	@Override
//	public int getSetting(String strKey, int nDefault) {
//		return getProxyContext().getSetting(strKey, nDefault);
//	}
//
//
//	@Override
//	public long getSetting(String strKey, long nDefault) {
//		return getProxyContext().getSetting(strKey, nDefault);
//	}
//
//
//	@Override
//	public double getSetting(String strKey, double fDefault) {
//		return getProxyContext().getSetting(strKey, fDefault);
//	}
//
//
//	@Override
//	public boolean getSetting(String strKey, boolean bDefault) {
//		return getProxyContext().getSetting(strKey, bDefault);
//	}
//
//
//	@Override
//	public Map<String, Object> getSettings(String strPKey, Map<String, Object> params) {
//		return getProxyContext().getSettings(strPKey, params);
//	}

	
	
}
