package net.ibizsys.runtime.util;

/**
 * 分布式事务行为
 * @author lionlau
 *
 */
public interface IDTSAction extends IAction{

	/**
	 * 获取取消的超时时长（毫秒）
	 * @return
	 */
	int getCancelTimeout();
	
	
	
	
	/**
	 * 获取刷新的计数间隔（毫秒）
	 * @return
	 */
	int getRefreshTimer();
	
	
	
	
	/**
	 * 执行确认操作
	 * @param args
	 * @param result
	 * @throws Throwable
	 */
	void confirm(Object[] args, Object result) throws Throwable;
	
	
	
	
	/**
	 * 执行取消操作
	 * @param args
	 * @param result
	 * @param timeout 是否为超时
	 * @throws Throwable
	 */
	void cancel(Object[] args, Object result, boolean timeout) throws Throwable;
}
