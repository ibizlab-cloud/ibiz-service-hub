package net.ibizsys.central.service.client;

import net.ibizsys.runtime.util.IEntity;

public interface IWebClientRepEntity extends IEntity {

	/**
	 * 获取内容
	 * @return
	 */
	Object getBody();
	
	
	/**
	 * 获取头部对象
	 * @return
	 */
	IEntity getHeader();
	
	
	
	
	/**
	 * 获取反馈状态码
	 * @return
	 */
	int getStatusCode();
}
