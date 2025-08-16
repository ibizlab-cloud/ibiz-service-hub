package net.ibizsys.central.wx;

import net.ibizsys.runtime.ISystemRuntimeException;

public interface IWXAccountRuntimeException extends ISystemRuntimeException{

	/**
	 * 获取系统微信账户运行时对象
	 * @return
	 */
	IWXAccountRuntime getWXAccountRuntime();
}
