package net.ibizsys.runtime.plugin;

import net.ibizsys.model.res.IPSSysSFPlugin;
import net.ibizsys.runtime.ISystemRuntimeContext;

/**
 * 插件运行时基类
 * @author lionlau
 *
 */
public abstract class PluginRuntimeBase implements IPluginRuntimeInitable {

	private ISystemRuntimeContext iSystemRuntimeContext = null;
	private IPSSysSFPlugin iPSSysSFPlugin = null;
	
	@Override
	public void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysSFPlugin iPSSysSFPlugin) throws Exception {
		this.iSystemRuntimeContext = iSystemRuntimeContext;
		this.iPSSysSFPlugin = iPSSysSFPlugin;
		this.onInit();
	}
	
	protected void onInit() throws Exception{
		
	}
	
	protected ISystemRuntimeContext getSystemRuntimeContext() {
		return this.iSystemRuntimeContext;
	}
	
	protected IPSSysSFPlugin getPSSysSFPlugin() {
		return this.iPSSysSFPlugin;
	}
}
