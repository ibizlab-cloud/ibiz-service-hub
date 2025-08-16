package net.ibizsys.central.plugin.extension.system.util;

import net.ibizsys.runtime.IModelRuntime;

public interface IMainSysModelRuntimeProxy<T extends IModelRuntime> {

	/**
	 * 开始代理
	 */
	void start() throws Exception;
	
	/**
	 * 停止代理
	 */
	void stop() throws Exception;
	
	
	/**
	 * 获取代理对象
	 * @return
	 */
	T getProxyObject();
}
