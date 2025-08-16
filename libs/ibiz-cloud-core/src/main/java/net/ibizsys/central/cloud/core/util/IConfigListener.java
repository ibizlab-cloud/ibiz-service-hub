package net.ibizsys.central.cloud.core.util;

import java.util.concurrent.Executor;

/**
 * 配置侦听器对象接口
 * @author lionlau
 *
 */
public interface IConfigListener {

	  /**
     * Get executor for execute this receive.
     *
     * @return Executor
     */
    default Executor getExecutor() {
    	return null;
    }
    
    
    /**
     * 获取侦听器所有者
     * @return
     */
    default Object getOwner() {
    	return null;
    }
    
    /**
     * 获取侦听器标记
     * @return
     */
    default Object getTag() {
    	return null;
    }
    

    
   /**
     * Receive config info.
     *
     * @param configInfo config info
     */
    void receiveConfigInfo(final String configInfo);
}
