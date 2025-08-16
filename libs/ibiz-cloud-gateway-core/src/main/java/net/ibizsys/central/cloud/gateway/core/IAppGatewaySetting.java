package net.ibizsys.central.cloud.gateway.core;

import java.util.List;

import net.ibizsys.central.cloud.gateway.core.util.domain.DeployApp;

/**
 * 应用网关设置
 * @author lionlau
 *
 */
public interface IAppGatewaySetting {

	/**
	 * 加载配置
	 */
	void loadConfig();
	 

	
	/**
	 * 获取部署应用集合
	 * @return
	 */
	List<DeployApp> getDeployApps();
	
	
	/**
	 * 获取临时数据存储文件夹
	 * @return
	 */
	String getTempFolder();
	
	
	/**
	 * 获取本地文件存储文件夹
	 * @return
	 */
	String getFileFolder();
	
}
