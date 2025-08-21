package net.ibizsys.central.plugin.ai.addin;

import net.ibizsys.runtime.plugin.IModelRTAddin;

public interface IMcpServerTransportProvider extends IModelRTAddin{

	/**
	 * 建立传输代理
	 * @param addin
	 * @return
	 */
	IMcpServerTransportAgent createMcpServerTransportAgent(Object addin);
}
