package net.ibizsys.central.backend;

/**
 * 系统后台作业运行时对象基接口
 * @author lionlau
 *
 */
public interface ISysBackendTaskRuntimeBase  {

	/**
	 * 执行后台任务
	 * @param strDynaInstId
	 * @param strParam
	 * @return
	 * @throws Throwable
	 */
	Object execute(String strDynaInstId, String strParam) throws Throwable;
	
	/**
	 * 获取后台作业标识
	 * @return
	 */
	String getId();
	
	
	/**
	 * 获取后台作业名称
	 * @return
	 */
	String getName();
	
	/**
	 * 定时触发策略
	 * @return
	 */
	String getTimerPolicy();
	
	
	/**
	 * 定时触发模式
	 * @return
	 */
	boolean isTimerMode();
	
	

	/**
	 * 是否为本地定时模式
	 * @return
	 */
	boolean isLocalMode();
	
	
	/**
	 * 获取服务容器标识
	 * @return
	 */
	String getServiceContainer();
	
	
	/**
	 * 获取是否不启用分布式
	 * @return
	 */
	boolean isStandalone();
	
}
