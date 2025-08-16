package net.ibizsys.runtime.plugin;

import net.ibizsys.model.res.IPSSysSFPlugin;
import net.ibizsys.runtime.ISystemRuntimeContext;

/**
 * 运行时插件对象
 * @author lionlau
 *
 */
public interface IPluginRuntimeInitable {

	/**
	 * 初始化运行时运行时插件对象
	 * @param iSystemRuntimeContext
	 * @param iPSSysSFPlugin
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysSFPlugin iPSSysSFPlugin) throws Exception;
}
