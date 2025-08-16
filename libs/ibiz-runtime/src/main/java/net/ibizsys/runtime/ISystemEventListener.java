package net.ibizsys.runtime;

import java.util.concurrent.Executor;

/**
 * 系统事件侦听器对象接口
 * @author lionlau
 *
 */
public interface ISystemEventListener {

	/**
	 * 系统事件：系统已经加载
	 */
	public final static String EVENT_LOAD = "LOAD";
	
	 /**
     * Get executor for execute this receive.
     *
     * @return Executor
     */
    default Executor getExecutor() {
    	return null;
    }
    
    /**
     * 接收事件
     * @param event
     * @param params
     */
    void receiveEvent(final String event, Object[] params);
	
}
