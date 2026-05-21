package net.ibizsys.central.cloud.core;

import java.util.concurrent.Executor;

import net.ibizsys.central.cloud.core.ai.ISysAIFactoryRuntime;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.model.ai.IPSSysAIFactory;
import net.ibizsys.runtime.util.IAction;

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
	 * 建立超级用户上下文
	 * @return
	 */
	IEmployeeContext createSuperUserContext();
	
	
	/**
	 * 建立AI工厂运行时对象
	 * @param iPSSysAIFactory
	 * @return
	 */
	ISysAIFactoryRuntime createSysAIFactoryRuntime(IPSSysAIFactory iPSSysAIFactory);
	
	
	/**
	 * 获取SSE执行器
	 * @return
	 */
	Executor getSseExecutor();
	
	
	
	/**
	 * 
	 */
	PortalAsyncAction asyncExecute(IAction iAction, Object[] args, Object actionTag) throws Throwable;
}
