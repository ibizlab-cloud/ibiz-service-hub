package net.ibizsys.model.dataentity.logic;



/**
 * 实体界面逻辑模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDELogicDTO}运行时对象
 *
 */
public interface IPSDEUILogic extends net.ibizsys.model.dataentity.logic.IPSDELogicBase{

	
	
	/**
	 * 获取逻辑处理节点集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.logic.IPSDEUILogicNode> getPSDEUILogicNodes();
	
	/**
	 * 获取逻辑处理节点集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicNode getPSDEUILogicNode(Object objKey, boolean bTryMode);
	
	/**
	 * 设置逻辑处理节点集合
	 * @param list 逻辑处理节点集合
	 */
	void setPSDEUILogicNodes(java.util.List<net.ibizsys.model.dataentity.logic.IPSDEUILogicNode> list);
	
	
	/**
	 * 获取逻辑处理参数集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.logic.IPSDEUILogicParam> getPSDEUILogicParams();
	
	/**
	 * 获取逻辑处理参数集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getPSDEUILogicParam(Object objKey, boolean bTryMode);
	
	/**
	 * 设置逻辑处理参数集合
	 * @param list 逻辑处理参数集合
	 */
	void setPSDEUILogicParams(java.util.List<net.ibizsys.model.dataentity.logic.IPSDEUILogicParam> list);
	
	
	/**
	 * 获取开始处理节点
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicNode getStartPSDEUILogicNode();


	/**
	 * 获取开始处理节点，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicNode getStartPSDEUILogicNodeMust();
}