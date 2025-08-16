package net.ibizsys.central.cloud.ai.core.addin;

import net.ibizsys.central.cloud.ai.core.addin.AIPlatformBase;
import net.ibizsys.central.cloud.ai.core.addin.IAIAccessAgent;
import net.ibizsys.central.cloud.core.util.domain.AIAccess;

public class SimpleAIPlatform extends AIPlatformBase {

	@Override
	public IAIAccessAgent createAIAccessAgent(AIAccess aiAccess) {
		return new SimpleAIAccessAgent();
	}

}
