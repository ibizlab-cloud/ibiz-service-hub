package net.ibizsys.central.cloud.ai.core.addin;

import net.ibizsys.central.cloud.core.util.domain.AIAccess;

/**
 * AI平台提供者
 * @author lionlau
 *
 */
public interface IAIPlatform extends ICloudAIUtilRTAddin{

	/**
	 * 建立AI平台访问代理对象
	 * @param aiAccess
	 * @return
	 */
	IAIAccessAgent createAIAccessAgent(AIAccess aiAccess);
}
