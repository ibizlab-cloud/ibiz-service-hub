package net.ibizsys.runtime;

/**
 * 系统运行时异常接口
 * @author lionlau
 *
 */
public interface ISystemRuntimeException extends IModelRuntimeException{

	/**
	 * 获取系统对象
	 * @return
	 */
	ISystemRuntimeBase getSystemRuntime();
	

	
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
