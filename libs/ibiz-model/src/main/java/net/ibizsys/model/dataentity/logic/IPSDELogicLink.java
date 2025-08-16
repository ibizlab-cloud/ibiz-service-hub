package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑连接模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDELogicLinkDTO}运行时对象
 *
 */
public interface IPSDELogicLink extends net.ibizsys.model.dataentity.logic.IPSDELogicLinkBase{

	
	
	/**
	 * 获取目标逻辑节点对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicLinkDTO#FIELD_DSTPSDELOGICNODEID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicLinkDTO#FIELD_SRCPSDELOGICNODEID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicLinkDTO#FIELD_DEFAULTLINK}
	 * @return
	 */
	boolean isCatchLink();
	
	
	/**
	 * 获取是否默认连接
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicLinkDTO#FIELD_DEFAULTLINK}
	 * @return
	 */
	boolean isDefaultLink();
	
	
	/**
	 * 获取是否子调用连接
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicLinkDTO#FIELD_DEFAULTLINK}
	 * @return
	 */
	boolean isSubCallLink();
}