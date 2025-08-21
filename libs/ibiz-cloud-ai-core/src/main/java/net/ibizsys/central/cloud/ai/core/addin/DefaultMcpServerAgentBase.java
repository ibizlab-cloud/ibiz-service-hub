package net.ibizsys.central.cloud.ai.core.addin;

import net.ibizsys.central.cloud.core.cloudutil.ICloudAIUtilRuntime;

public abstract class DefaultMcpServerAgentBase extends McpServerAgentBase {

	@Override
	protected void onInit() throws Exception {
		super.onInit();

	}

	@Override
	protected void runAuthTimer() {
		// super.runAuthTimer();
	}

	@Override
	public String getName() {
		return ICloudAIUtilRuntime.MCPSERVER_DEFAULT;
	}
}
