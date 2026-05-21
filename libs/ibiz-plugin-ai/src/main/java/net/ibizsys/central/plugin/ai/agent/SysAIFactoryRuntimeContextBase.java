package net.ibizsys.central.plugin.ai.agent;

import net.ibizsys.central.cloud.core.ai.SysAIFactoryRuntimeContextProxy;

public abstract class SysAIFactoryRuntimeContextBase extends SysAIFactoryRuntimeContextProxy implements ISysAIFactoryRuntimeContext {

	protected SysAIFactoryRuntimeContextBase(net.ibizsys.central.cloud.core.ai.ISysAIFactoryRuntimeContext proxySysAIFactoryRuntimeContext) {
		super(proxySysAIFactoryRuntimeContext);
	}

}
