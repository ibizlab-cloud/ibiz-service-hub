package net.ibizsys.model.ai;



/**
 * AI工厂相关对象接口
 *
 */
public interface IPSSysAIFactoryObject extends net.ibizsys.model.ai.IPSAIFactoryObject{

	
	
	/**
	 * 获取所属系统AI工厂对象
	 * @return
	 */
	net.ibizsys.model.ai.IPSSysAIFactory getPSSysAIFactory();


	/**
	 * 获取所属系统AI工厂对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.ai.IPSSysAIFactory getPSSysAIFactoryMust();
}