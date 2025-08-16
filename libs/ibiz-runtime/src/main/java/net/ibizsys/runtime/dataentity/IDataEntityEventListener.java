package net.ibizsys.runtime.dataentity;

import java.util.concurrent.Executor;

/**
 * 实体事件侦听器对象接口
 * @author lionlau
 *
 */
public interface IDataEntityEventListener {

	/**
	 * 同步数据对象，参数1 为事件类型，参数2 为数据
	 */
	public final static String EVENT_SYNCENTITY = "SYNCENTITY";
	
	
	
	
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
    void receiveEvent(final IDataEntityRuntime iDataEntityRuntime, final String event, Object[] params);
	
}
