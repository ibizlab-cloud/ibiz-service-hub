package net.ibizsys.central.cloud.uaa.core.addin;

public interface IAuthProvider extends ICloudAuthUtilRTAddin{

	/**
	 * 建立认证代理
	 * @param strConfig
	 * @return
	 */
	IAuthAgent createAuthAgent(String strConfig);
}
