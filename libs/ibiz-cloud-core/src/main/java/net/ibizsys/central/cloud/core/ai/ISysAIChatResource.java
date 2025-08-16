package net.ibizsys.central.cloud.core.ai;

public interface ISysAIChatResource extends IAIChatResource {

	/**
	 * 初始化
	 * @param iSysAIFactoryRuntimeContext
	 * @param iPSSysAIChatAgent
	 * @throws Exception
	 */
	void init(ISysAIFactoryRuntimeContext iSysAIFactoryRuntimeContext, String type) throws Exception;
	
	
	
	/**
	 * 重新刷新
	 */
	void reload();
}
