package net.ibizsys.central.system;

import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.IModelRuntimeException;

/**
 * 系统模块功能运行时异常接口
 * @author lionlau
 *
 */
public interface ISystemModuleUtilRuntimeException extends IModelRuntimeException{

	/**
	 * 获取智能报表系统模块功能运行时对象
	 * @return
	 */
	ISystemModuleUtilRuntime getSystemModuleUtilRuntime();
	

	
	/**
	 * 获取错误代码
	 * 
	 * @return the nErrorCode
	 */
	int getErrorCode();
	
	
	
	
	
	/**
	 * 获取相关的模型运行时对象
	 * @return
	 */
	IModelRuntime getModelRuntime();
	
}
