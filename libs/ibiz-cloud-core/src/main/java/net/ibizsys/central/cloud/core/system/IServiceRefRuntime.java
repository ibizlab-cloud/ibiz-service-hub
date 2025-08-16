package net.ibizsys.central.cloud.core.system;

public interface IServiceRefRuntime extends net.ibizsys.central.system.ISysRefRuntime {

	/**
	 * 引用服务标识
	 */
	public final static String PARAM_REFSERVICEID = "refserviceid";
	
	/**
	 * 获取引用服务标识
	 * @return
	 */
	String getRefServiceId();
}
