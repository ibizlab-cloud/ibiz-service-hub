package net.ibizsys.model.dataentity.logic;



/**
 * 实体界面逻辑拷贝逻辑参数节点模型对象接口
 * <P>
 * 扩展父接口类型[COPYPARAM]
 *
 */
public interface IPSDEUICopyParamLogic extends net.ibizsys.model.dataentity.logic.IPSDEUILogicNode{

	
	
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
	
	
	/**
	 * 获取源逻辑参数对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getSrcPSDEUILogicParam();


	/**
	 * 获取源逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getSrcPSDEUILogicParamMust();
}