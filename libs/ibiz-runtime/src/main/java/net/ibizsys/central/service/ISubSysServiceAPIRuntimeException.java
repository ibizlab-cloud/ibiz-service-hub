package net.ibizsys.central.service;

import net.ibizsys.runtime.ISystemRuntimeException;

public interface ISubSysServiceAPIRuntimeException extends ISystemRuntimeException {

	/**
	 * 获取外部服务接口运行时对象
	 * @return
	 */
	ISubSysServiceAPIRuntime getSubSysServiceAPIRuntime();
	
	
	
	/**
	 * 获取反馈状态码
	 * @return
	 */
	int getStatusCode();
}
