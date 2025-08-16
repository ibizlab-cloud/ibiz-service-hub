package net.ibizsys.runtime;

/**
 * 模型运行时异常
 * @author lionlau
 *
 */
public interface IModelRuntimeException {

	
	/**
	 * 获取相关的模型运行时对象
	 * @return
	 */
	IModelRuntime getModelRuntime();
	
	
	/**
	 * 获取错误代码
	 * 
	 * @return the nErrorCode
	 */
	int getErrorCode();
}
