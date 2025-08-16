package net.ibizsys.central.cloud.core.util;



/**
 * 配置侦听器仓库对象接口
 * @author lionlau
 *
 */
public interface IConfigListenerRepo {

	/**
	 * 添加配置侦听器
	 * @param strConfigId
	 * @param iConfigListener
	 */
	void addConfigListener(String strConfigId, IConfigListener iConfigListener);
	
	/**
	 * 移除配置侦听器
	 * @param strConfigId
	 * @param iConfigListener
	 */
	void removeConfigListener(String strConfigId, IConfigListener iConfigListener);
	
	
	
	/**
	 * 通过侦听器所有者删除侦听器
	 * @param owner
	 */
	void removeConfigListenersByOwner(Object owner);
	
	
	
	/**
	 * 通过侦听器标记删除侦听器
	 * @param owner
	 */
	void removeConfigListenersByTag(Object tag);
}
