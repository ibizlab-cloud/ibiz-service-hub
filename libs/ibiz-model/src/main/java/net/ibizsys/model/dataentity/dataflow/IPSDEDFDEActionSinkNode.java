package net.ibizsys.model.dataentity.dataflow;



/**
 * 实体数据流实体行为消费节点模型对象接口
 * <P>
 * 扩展父接口类型[DFDEACTIONSINK]
 *
 */
public interface IPSDEDFDEActionSinkNode extends net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowSinkNode{

	
	
	/**
	 * 获取目标实体行为对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DSTPSDEACTIONID}
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getDstPSDEAction();


	/**
	 * 获取目标实体行为对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getDstPSDEActionMust();
	
	
	/**
	 * 获取目标实体对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DSTPSDEID}
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getDstPSDataEntity();


	/**
	 * 获取目标实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getDstPSDataEntityMust();
}