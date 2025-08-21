package net.ibizsys.central.cloud.ai.core.addin;

import net.ibizsys.central.cloud.core.util.domain.AIAccess;

/**
 * RAGFlow OPEN AI 接口兼容平台
 * @author lionlau
 *
 */
public class RAGFlowPlatform extends AIPlatformBase {

	@Override
	public IAIAccessAgent createAIAccessAgent(AIAccess aiAccess) {
		return new RAGFlowOpenAIAccessAgent();
	}

}
