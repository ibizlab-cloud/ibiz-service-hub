package net.ibizsys.central.cloud.ai.ollama.addin;

import net.ibizsys.central.cloud.ai.core.addin.AIPlatformBase;
import net.ibizsys.central.cloud.ai.core.addin.IAIAccessAgent;
import net.ibizsys.central.cloud.core.util.domain.AIAccess;

public class OllamaPlatform extends AIPlatformBase {

	@Override
	public IAIAccessAgent createAIAccessAgent(AIAccess aiAccess) {
		return new OllamaAccessAgent();
	}

}
