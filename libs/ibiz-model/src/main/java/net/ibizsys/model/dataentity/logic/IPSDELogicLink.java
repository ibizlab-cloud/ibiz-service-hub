package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑连接模型对象接口
 *
 */
public interface IPSDELogicLink extends net.ibizsys.model.dataentity.logic.IPSDELogicLinkBase{

	
	
	/**
	 * 获取目标逻辑节点对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicNode getDstPSDELogicNode();


	/**
	 * 获取目标逻辑节点对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicNode getDstPSDELogicNodeMust();
	
	
	/**
	 * 获取连接条件对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicLinkGroupCond getPSDELogicLinkGroupCond();


	/**
	 * 获取连接条件对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicLinkGroupCond getPSDELogicLinkGroupCondMust();
	
	
	/**
	 * 获取源逻辑节点对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicNode getSrcPSDELogicNode();


	/**
	 * 获取源逻辑节点对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicNode getSrcPSDELogicNodeMust();
	
	
	/**
	 * 获取是否异常处理连接
	 * @return
	 */
	boolean isCatchLink();
	
	
	/**
	 * 获取是否默认连接
	 * @return
	 */
	boolean isDefaultLink();
	
	
	/**
	 * 获取是否子调用连接
	 * @return
	 */
	boolean isSubCallLink();
}