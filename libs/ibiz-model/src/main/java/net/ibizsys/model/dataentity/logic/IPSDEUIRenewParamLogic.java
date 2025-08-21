package net.ibizsys.model.dataentity.logic;



/**
 * 实体界面逻辑重建逻辑参数节点模型对象接口
 * <P>
 * 扩展父接口类型[RENEWPARAM]
 *
 */
public interface IPSDEUIRenewParamLogic extends net.ibizsys.model.dataentity.logic.IPSDEUILogicNode{

	
	
	/**
	 * 获取目标逻辑参数对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getDstPSDEUILogicParam();


	/**
	 * 获取目标逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getDstPSDEUILogicParamMust();
}