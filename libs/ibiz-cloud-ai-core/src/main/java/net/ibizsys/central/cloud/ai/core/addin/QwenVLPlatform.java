package net.ibizsys.central.cloud.ai.core.addin;

import net.ibizsys.central.cloud.core.util.domain.AIAccess;

/**
 * QWENVL OPEN AI 接口兼容平台
 * @author lionlau
 *
 */
public class QwenVLPlatform extends AIPlatformBase {

	@Override
	public IAIAccessAgent createAIAccessAgent(AIAccess aiAccess) {
		return new QwenVLOpenAIAccessAgent();
	}

}
