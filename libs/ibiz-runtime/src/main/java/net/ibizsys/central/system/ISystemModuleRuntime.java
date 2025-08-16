package net.ibizsys.central.system;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.model.system.IPSSystemModule;
import net.ibizsys.runtime.ISystemModelRuntime;

/**
 * 系统模块运行时对象
 * @author lionlau
 *
 */
public interface ISystemModuleRuntime extends ISystemModelRuntime {

	
	/**
	 * 初始化系统模块运行时
	 * @param iSystemRuntimeContext
	 * @param iPSSystemModule
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSystemModule iPSSystemModule) throws Exception;

	
	
	/**
	 * 获取系统模块模型对象
	 * @return
	 */
	IPSSystemModule getPSSystemModule();
	
	
	
	

}
