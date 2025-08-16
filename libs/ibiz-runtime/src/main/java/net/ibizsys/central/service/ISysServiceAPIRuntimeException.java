package net.ibizsys.central.service;

import net.ibizsys.runtime.ISystemRuntimeException;

/**
 * 系统服务接口运行时异常
 * @author lionlau
 *
 */
public interface ISysServiceAPIRuntimeException extends ISystemRuntimeException{

	/**
	 * 获取系统服务接口运行时对象
	 * @return
	 */
	ISysServiceAPIRuntime getSysServiceAPIRuntime();
}
