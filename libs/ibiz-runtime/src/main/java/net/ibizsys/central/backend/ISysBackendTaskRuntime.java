package net.ibizsys.central.backend;

public interface ISysBackendTaskRuntime extends net.ibizsys.runtime.backend.ISysBackendTaskRuntime, ISysBackendTaskRuntimeBase {

	
	/**
	 * 获取服务容器标识
	 * @return
	 */
	default String getServiceContainer() {
		return getPSSysBackService().getServiceContainer();
	}
	
	
	/**
	 * 获取是否不启用分布式
	 * @return
	 */
	default boolean isStandalone() {
		return getPSSysBackService().isStandalone();
	}
}
