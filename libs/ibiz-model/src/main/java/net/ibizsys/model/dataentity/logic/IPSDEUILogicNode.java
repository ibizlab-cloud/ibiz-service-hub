package net.ibizsys.model.dataentity.logic;



/**
 * 实体界面逻辑节点模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO}运行时对象
 * <P>
 * 子接口扩展识别值 {@link #getLogicNodeType}
 *
 */
public interface IPSDEUILogicNode extends net.ibizsys.model.dataentity.logic.IPSDELogicNodeBase{

	
	
	/**
	 * 获取目标逻辑参数对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_dstpsdlparamid}
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getDstPSDEUILogicParam();


	/**
	 * 获取目标逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getDstPSDEUILogicParamMust();
	
	
	/**
	 * 获取逻辑节点连出连接集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.logic.IPSDEUILogicLink> getPSDEUILogicLinks();
	
	/**
	 * 获取逻辑节点连出连接集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicLink getPSDEUILogicLink(Object objKey, boolean bTryMode);
	
	/**
	 * 设置逻辑节点连出连接集合
	 * @param list 逻辑节点连出连接集合
	 */
	void setPSDEUILogicLinks(java.util.List<net.ibizsys.model.dataentity.logic.IPSDEUILogicLink> list);
	
	
	/**
	 * 获取逻辑节点参数集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.logic.IPSDEUILogicNodeParam> getPSDEUILogicNodeParams();
	
	/**
	 * 获取逻辑节点参数集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicNodeParam getPSDEUILogicNodeParam(Object objKey, boolean bTryMode);
	
	/**
	 * 设置逻辑节点参数集合
	 * @param list 逻辑节点参数集合
	 */
	void setPSDEUILogicNodeParams(java.util.List<net.ibizsys.model.dataentity.logic.IPSDEUILogicNodeParam> list);
	
	
	/**
	 * 获取源逻辑参数对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_SRCPSDLPARAMID}
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getSrcPSDEUILogicParam();


	/**
	 * 获取源逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getSrcPSDEUILogicParamMust();
}