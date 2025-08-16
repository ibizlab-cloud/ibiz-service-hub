package net.ibizsys.central.cloud.ai.openai.gpt3.addin;

import net.ibizsys.central.cloud.ai.core.addin.AIPlatformBase;
import net.ibizsys.central.cloud.ai.core.addin.IAIAccessAgent;
import net.ibizsys.central.cloud.core.util.domain.AIAccess;

public class GPT3AIPlatform extends AIPlatformBase {

	@Override
	public IAIAccessAgent createAIAccessAgent(AIAccess aiAccess) {
		return new GPT3AIAccessAgent();
	}

}
