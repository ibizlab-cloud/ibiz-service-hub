package net.ibizsys.central.cloud.core.ai;

public interface IAIFactoryRuntimeBaseContext {

	/**
	 * 获取AI工厂运行时对象
	 * @return
	 */
	IAIFactoryRuntimeBase getAIFactoryRuntime();
	
	
	/**
	 * 获取配置内容
	 * @param 当前数据
	 * @param strConfigId
	 * @param bTryMode
	 * @return
	 * @throws Throwable
	 */
	String getConfigContent(Object data, String strConfigId, boolean bTryMode) throws Throwable;
}
