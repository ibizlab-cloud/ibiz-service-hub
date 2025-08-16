package net.ibizsys.central.app;

import net.ibizsys.runtime.ISystemRuntimeException;

public interface IApplicationRuntimeException extends ISystemRuntimeException{

	/**
	 * 获取系统应用运行时对象
	 * @return
	 */
	IApplicationRuntime getApplicationRuntime();
}
