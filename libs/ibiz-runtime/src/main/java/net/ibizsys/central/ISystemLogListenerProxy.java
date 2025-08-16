package net.ibizsys.central;

/**
 * 日志接口代理对象接口
 * @author lionlau
 *
 */
public interface ISystemLogListenerProxy {

	/**
	 * 注册日志侦听器
	 * @param iSystemLogListener
	 */
	void registerSystemLogListener(ISystemLogListener iSystemLogListener);
	
	
	/**
	 * 注销日志侦听器
	 * @param iSystemLogListener
	 */
	void unregisterSystemLogListener(ISystemLogListener iSystemLogListener);
	
}
