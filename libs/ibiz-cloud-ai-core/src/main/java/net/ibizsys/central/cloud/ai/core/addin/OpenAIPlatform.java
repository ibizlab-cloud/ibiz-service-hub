package net.ibizsys.central.cloud.ai.core.addin;

import net.ibizsys.central.cloud.ai.core.addin.AIPlatformBase;
import net.ibizsys.central.cloud.ai.core.addin.IAIAccessAgent;
import net.ibizsys.central.cloud.core.util.domain.AIAccess;

/**
 * OPEN AI 接口兼容平台
 * @author lionlau
 *
 */
public class OpenAIPlatform extends AIPlatformBase {

	@Override
	public IAIAccessAgent createAIAccessAgent(AIAccess aiAccess) {
		return new OpenAIAccessAgent();
	}

}
