package net.ibizsys.central.plugin.ai.sysutil.addin;

import net.ibizsys.central.plugin.ai.addin.IMcpServerTransportAgent;

public class HttpSseMcpServerTransportProvider extends McpServerTransportProviderBase {

	@Override
	public IMcpServerTransportAgent createMcpServerTransportAgent(Object addin) {
		HttpSseMcpServerTransportAgent httpSseMcpServerTransportAgent = new HttpSseMcpServerTransportAgent();
		this.getSystemRuntime().autowareObject(httpSseMcpServerTransportAgent);
		return httpSseMcpServerTransportAgent;
	}

}
