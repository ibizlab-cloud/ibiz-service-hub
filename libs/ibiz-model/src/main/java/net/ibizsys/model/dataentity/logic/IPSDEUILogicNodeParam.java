package net.ibizsys.model.dataentity.logic;



/**
 * 实体界面逻辑节点参数模型对象接口
 *
 */
public interface IPSDEUILogicNodeParam extends net.ibizsys.model.dataentity.logic.IPSDELogicNodeParamBase{

	
	
	/**
	 * 获取目标逻辑参数
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getDstPSDEUILogicParam();


	/**
	 * 获取目标逻辑参数，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getDstPSDEUILogicParamMust();
	
	
	/**
	 * 获取表达式
	 * @return
	 */
	java.lang.String getExpression();
	
	
	/**
	 * 获取源逻辑参数
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getSrcPSDEUILogicParam();


	/**
	 * 获取源逻辑参数，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getSrcPSDEUILogicParamMust();
}