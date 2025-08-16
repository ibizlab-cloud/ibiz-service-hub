package net.ibizsys.central.cloud.kb.core.addin;

import net.ibizsys.central.cloud.core.util.domain.KBAccess;

/**
 * KB平台提供者
 * @author lionlau
 *
 */
public interface IKBPlatform extends ICloudKBUtilRTAddin{

	/**
	 * 建立KB平台访问代理对象
	 * @param aiAccess
	 * @return
	 */
	IKBAccessAgent createKBAccessAgent(KBAccess kbAccess);
}
