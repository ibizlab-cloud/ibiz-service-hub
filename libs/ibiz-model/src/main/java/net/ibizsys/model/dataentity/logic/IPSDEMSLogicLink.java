package net.ibizsys.model.dataentity.logic;



/**
 * 实体主状态逻辑连接模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDELogicLinkDTO}运行时对象
 *
 */
public interface IPSDEMSLogicLink extends net.ibizsys.model.dataentity.logic.IPSDELogicLinkBase{

	
	
	/**
	 * 获取目标主状态节点对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicLinkDTO#FIELD_DSTPSDELOGICNODEID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicLinkDTO#FIELD_SRCPSDELOGICNODEID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicLinkDTO#FIELD_DEFAULTLINK}
	 * @return
	 */
	boolean isDefaultLink();
}