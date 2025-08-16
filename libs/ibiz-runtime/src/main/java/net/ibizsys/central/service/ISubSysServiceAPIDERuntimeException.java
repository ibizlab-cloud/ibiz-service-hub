package net.ibizsys.central.service;

public interface ISubSysServiceAPIDERuntimeException extends ISubSysServiceAPIRuntimeException{

	/**
	 * 获取外部服务接口运行时对象
	 * @return
	 */
	ISubSysServiceAPIDERuntime getSubSysServiceAPIDERuntime();
}
