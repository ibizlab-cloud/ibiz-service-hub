package net.ibizsys.central.cloud.ai.core.addin;

import net.ibizsys.central.cloud.core.util.domain.AIAccess;

/**
 * 代理 AI 接口兼容平台
 * @author lionlau
 *
 */
public class ProxyPlatform extends AIPlatformBase {

	@Override
	public IAIAccessAgent createAIAccessAgent(AIAccess aiAccess) {
		return new ProxyAIAccessAgent();
	}

}
