package net.ibizsys.runtime;

/**
 * 模型运行时支持关闭时触发
 * @author lionlau
 *
 */
public interface IModelRuntimeShutdownable {

	/**
	 * 关闭
	 * @throws Exception
	 */
	void shutdown() throws Exception;
	
}
