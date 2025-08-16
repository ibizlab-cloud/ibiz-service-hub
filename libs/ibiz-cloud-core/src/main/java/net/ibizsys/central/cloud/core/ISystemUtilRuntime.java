package net.ibizsys.central.cloud.core;

import net.ibizsys.central.cloud.core.ai.ISysAIFactoryRuntime;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.model.ai.IPSSysAIFactory;

public interface ISystemUtilRuntime extends net.ibizsys.central.ISystemUtilRuntime {

	/**
	 * 建立默认的用户上下文对象
	 * @return
	 */
	IEmployeeContext createDefaultUserContext();
	
	
	/**
	 * 建立匿名用户上下文对象
	 * @return
	 */
	IEmployeeContext createAnonymousUserContext();
	
	
	
	/**
	 * 建立AI工厂运行时对象
	 * @param iPSSysAIFactory
	 * @return
	 */
	ISysAIFactoryRuntime createSysAIFactoryRuntime(IPSSysAIFactory iPSSysAIFactory);
}
