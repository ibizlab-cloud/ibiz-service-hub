package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑AI交谈代理调用节点模型对象接口
 * <P>
 * 扩展父接口类型[SYSAICHATAGENT]
 *
 */
public interface IPSDESysAIChatAgentLogic extends net.ibizsys.model.dataentity.logic.IPSDELogicNode{

	
	
	/**
	 * 获取目标逻辑参数对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParam();


	/**
	 * 获取目标逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParamMust();
	
	
	/**
	 * 获取AI交谈代理
	 * @return
	 */
	net.ibizsys.model.ai.IPSSysAIChatAgent getPSSysAIChatAgent();


	/**
	 * 获取AI交谈代理，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.ai.IPSSysAIChatAgent getPSSysAIChatAgentMust();
	
	
	/**
	 * 获取AI工厂
	 * @return
	 */
	net.ibizsys.model.ai.IPSSysAIFactory getPSSysAIFactory();


	/**
	 * 获取AI工厂，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.ai.IPSSysAIFactory getPSSysAIFactoryMust();
	
	
	/**
	 * 获取返回值绑定逻辑参数对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getRetPSDELogicParam();


	/**
	 * 获取返回值绑定逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getRetPSDELogicParamMust();
}