package net.ibizsys.central.plugin;

import net.ibizsys.central.ISystemRuntimeContext;

public abstract class PluginRuntimeBase extends net.ibizsys.runtime.plugin.PluginRuntimeBase {

	@Override
	protected ISystemRuntimeContext getSystemRuntimeContext() {
		return (ISystemRuntimeContext)super.getSystemRuntimeContext();
	}
	
}
