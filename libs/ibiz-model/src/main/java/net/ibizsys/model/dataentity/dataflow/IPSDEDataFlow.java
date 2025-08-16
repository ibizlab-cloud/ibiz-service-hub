package net.ibizsys.model.dataentity.dataflow;



/**
 * 实体数据流逻辑模型对象接口
 *
 */
public interface IPSDEDataFlow extends net.ibizsys.model.dataentity.IPSDataEntityObject
		,net.ibizsys.model.res.IPSSysSFPluginSupportable{

	
	
	/**
	 * 获取调试模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DEBUGMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DELogicDebugMode}
	 * @return
	 */
	int getDebugMode();
	
	
	/**
	 * 获取逻辑子类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_LOGICSUBTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DataFlowSubType}
	 * @return
	 */
	java.lang.String getLogicSubType();
	
	
	/**
	 * 获取逻辑连接集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowLink> getPSDEDataFlowLinks();
	
	/**
	 * 获取逻辑连接集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowLink getPSDEDataFlowLink(Object objKey, boolean bTryMode);
	
	/**
	 * 设置逻辑连接集合
	 * @param list 逻辑连接集合
	 */
	void setPSDEDataFlowLinks(java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowLink> list);
	
	
	/**
	 * 获取逻辑处理集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode> getPSDEDataFlowNodes();
	
	/**
	 * 获取逻辑处理集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode getPSDEDataFlowNode(Object objKey, boolean bTryMode);
	
	/**
	 * 设置逻辑处理集合
	 * @param list 逻辑处理集合
	 */
	void setPSDEDataFlowNodes(java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode> list);
	
	
	/**
	 * 获取数据流逻辑包模型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_CUSTOMCODE}
	 * @return
	 */
	java.lang.String getPackageModel();
}