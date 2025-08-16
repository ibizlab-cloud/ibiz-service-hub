package net.ibizsys.runtime.backend;

import net.ibizsys.model.backservice.IPSSysBackService;
import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemRuntime;
import net.ibizsys.runtime.ISystemRuntimeContext;

/**
 * 系统后台作业运行时
 * @author lionlau
 *
 */
public interface ISysBackendTaskRuntime extends IModelRuntime {

	/**
	 * 初始化逻辑运行时
	 * @param iSystemRuntimeContext
	 * @param iPSSysLogic
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysBackService iPSSysBackService) throws Exception;

	/**
	 * 获取系统模型对象
	 * @return
	 */
	ISystemRuntime getSystemRuntime();
	
	
	/**
	 * 获取系统后台任务模型对象
	 * @return
	 * @throws Exception
	 */
	IPSSysBackService getPSSysBackService() ;
}
