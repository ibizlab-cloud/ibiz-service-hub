package net.ibizsys.central.service;

import net.ibizsys.central.ISystemPersistentAdapter;

/**
 * 声明外部服务接口为持久化客户端
 * @author lionlau
 *
 */
public interface ISystemPersistentClient {

	/**
	 * 获取系统持久化设配器
	 * @return
	 */
	ISystemPersistentAdapter getSystemPersistentAdapter();
}
