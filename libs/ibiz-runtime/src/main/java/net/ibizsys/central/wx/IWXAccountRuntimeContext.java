package net.ibizsys.central.wx;

/**
 * 系统微信账户运行时上下文对象
 * @author lionlau
 *
 */
public interface IWXAccountRuntimeContext {

	/**
	 * 获取系统微信账户运行时对象
	 * @return
	 */
	IWXAccountRuntime getWXAccountRuntime();
}
