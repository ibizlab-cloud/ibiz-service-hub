package net.ibizsys.model.dataentity.logic;



/**
 * 实体主状态逻辑连接模型对象接口
 *
 */
public interface IPSDEMSLogicLink extends net.ibizsys.model.dataentity.logic.IPSDELogicLinkBase{

	
	
	/**
	 * 获取目标主状态节点对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode getDstPSDEMSLogicNode();


	/**
	 * 获取目标主状态节点对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode getDstPSDEMSLogicNodeMust();
	
	
	/**
	 * 获取连接条件对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkGroupCond getPSDEMSLogicLinkGroupCond();


	/**
	 * 获取连接条件对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkGroupCond getPSDEMSLogicLinkGroupCondMust();
	
	
	/**
	 * 获取源主状态节点对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode getSrcPSDEMSLogicNode();


	/**
	 * 获取源主状态节点对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode getSrcPSDEMSLogicNodeMust();
	
	
	/**
	 * 获取是否默认连接
	 * @return
	 */
	boolean isDefaultLink();
}