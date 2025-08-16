package net.ibizsys.central.cloud.open.core.addin;

import net.ibizsys.central.cloud.core.util.domain.OpenAccess;

/**
 * 开放平台提供者
 * @author lionlau
 *
 */
public interface IOpenPlatform extends ICloudOpenUtilRTAddin{

	/**
	 * 建立开放平台访问代理对象
	 * @param openAccess
	 * @return
	 */
	IOpenAccessAgent createOpenAccessAgent(OpenAccess openAccess);
}
