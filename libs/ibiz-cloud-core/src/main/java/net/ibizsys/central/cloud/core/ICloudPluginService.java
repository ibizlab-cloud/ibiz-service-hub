package net.ibizsys.central.cloud.core;

import net.ibizsys.model.IPSSystemService;

/**
 * Cloud 插件服务对象接口
 * @author lionlau
 *
 */
public interface ICloudPluginService {

	/**
	 * 初始化插件服务
	 * @param iPSSystemService
	 * @throws Exception
	 */
	void init(IPSSystemService iPSSystemService) throws Exception;
}
