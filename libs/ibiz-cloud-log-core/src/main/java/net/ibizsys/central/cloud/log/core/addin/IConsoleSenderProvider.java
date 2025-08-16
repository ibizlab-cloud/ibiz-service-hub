package net.ibizsys.central.cloud.log.core.addin;

public interface IConsoleSenderProvider extends ICloudLogUtilRTAddin{

	/**
	 * 建立发送者
	 * @param strConfig
	 * @return
	 */
	IConsoleSender createConsoleSender(String strConfig);
}
