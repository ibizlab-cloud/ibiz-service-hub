package net.ibizsys.central.cloud.core.system;

import net.ibizsys.central.cloud.core.ai.ISysAIFactoryRuntime;
import net.ibizsys.model.ai.IPSSysAIFactory;

public interface ISystemModuleUtilRuntime extends net.ibizsys.central.system.ISystemModuleUtilRuntime {

	/**
	 * 建立AI工厂运行时对象
	 * @param iPSSysAIFactory
	 * @return
	 */
	default ISysAIFactoryRuntime createSysAIFactoryRuntime(IPSSysAIFactory iPSSysAIFactory) {
		return null;
	}
	
}
