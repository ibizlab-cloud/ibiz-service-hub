package net.ibizsys.model.dataentity.dataflow;



/**
 * 实体数据流逻辑连接模型对象接口
 *
 */
public interface IPSDEDataFlowLink extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取目标数据流节点对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DSTPSDELOGICNODEID}
	 * @return
	 */
	net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode getDstPSDEDataFlowNode();


	/**
	 * 获取目标数据流节点对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode getDstPSDEDataFlowNodeMust();
	
	
	/**
	 * 获取连接类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DEFAULTLINK}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataFlowLinkType}
	 * @return
	 */
	java.lang.String getLinkType();
	
	
	/**
	 * 获取源数据流节点对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_SRCPSDELOGICNODEID}
	 * @return
	 */
	net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode getSrcPSDEDataFlowNode();


	/**
	 * 获取源数据流节点对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode getSrcPSDEDataFlowNodeMust();
}