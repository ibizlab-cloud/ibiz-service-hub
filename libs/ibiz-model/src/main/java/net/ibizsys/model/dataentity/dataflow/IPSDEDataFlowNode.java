package net.ibizsys.model.dataentity.dataflow;



/**
 * 实体数据流逻辑节点模型对象接口
 *
 */
public interface IPSDEDataFlowNode extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.res.IPSSysSFPluginSupportable{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取高度
	 * @return
	 */
	int getHeight();
	
	
	/**
	 * 获取左侧位置
	 * @return
	 */
	int getLeftPos();
	
	
	/**
	 * 获取节点动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getNodeParams();
	
	
	/**
	 * 获取数据流节点类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.LogicNodeType}
	 * @return
	 */
	java.lang.String getNodeType();
	
	
	/**
	 * 获取数据流节点过滤器
	 * @return
	 */
	net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNodeFilter getPSDEDataFlowNodeFilter();


	/**
	 * 获取数据流节点过滤器，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNodeFilter getPSDEDataFlowNodeFilterMust();
	
	
	/**
	 * 获取节点参数集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNodeParam> getPSDEDataFlowNodeParams();
	
	/**
	 * 获取节点参数集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNodeParam getPSDEDataFlowNodeParam(Object objKey, boolean bTryMode);
	
	/**
	 * 设置节点参数集合
	 * @param list 节点参数集合
	 */
	void setPSDEDataFlowNodeParams(java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNodeParam> list);
	
	
	/**
	 * 获取上方位置
	 * @return
	 */
	int getTopPos();
	
	
	/**
	 * 获取宽度
	 * @return
	 */
	int getWidth();
}