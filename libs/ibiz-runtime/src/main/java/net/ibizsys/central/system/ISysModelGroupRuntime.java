package net.ibizsys.central.system;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.model.system.IPSSysModelGroup;
import net.ibizsys.runtime.ISystemModelRuntime;

/**
 * 系统模型组运行时对象
 * @author lionlau
 *
 */
public interface ISysModelGroupRuntime extends ISystemModelRuntime {

	
	/**
	 * 初始化系统模型组运行时
	 * @param iSystemRuntimeContext
	 * @param iPSSysModelGroup
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysModelGroup iPSSysModelGroup) throws Exception;

	
	
	/**
	 * 获取系统模型组模型对象
	 * @return
	 */
	IPSSysModelGroup getPSSysModelGroup();

}
