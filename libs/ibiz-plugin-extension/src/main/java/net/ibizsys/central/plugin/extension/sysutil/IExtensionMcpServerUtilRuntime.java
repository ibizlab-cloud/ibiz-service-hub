package net.ibizsys.central.plugin.extension.sysutil;

import java.util.List;

import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionLogic;
import net.ibizsys.central.plugin.ai.sysutil.ISysMcpServerUtilRuntime;

public interface IExtensionMcpServerUtilRuntime extends ISysMcpServerUtilRuntime{

	/**
	 * 重新加载扩展逻辑
	 * @param tools
	 */
	void reloadExtensionTools(List<V2SystemExtensionLogic> tools);
}
