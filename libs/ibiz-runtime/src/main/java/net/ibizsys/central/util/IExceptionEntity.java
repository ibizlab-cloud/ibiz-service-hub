package net.ibizsys.central.util;

public interface IExceptionEntity extends net.ibizsys.runtime.util.IEntity{

	/**
	 * 获取隐藏对象
	 * @return
	 */
	Throwable getException();
	
}
