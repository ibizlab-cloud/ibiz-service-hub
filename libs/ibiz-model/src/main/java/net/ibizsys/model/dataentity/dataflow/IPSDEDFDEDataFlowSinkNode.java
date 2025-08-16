package net.ibizsys.model.dataentity.dataflow;



/**
 *
 */
public interface IPSDEDFDEDataFlowSinkNode extends net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowSinkNode{

	
	
	/**
	 * 获取目标实体数据流逻辑对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DSTPSDEDATAFLOWID}
	 * @return
	 */
	net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow getDstPSDEDataFlow();


	/**
	 * 获取目标实体数据流逻辑对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow getDstPSDEDataFlowMust();
	
	
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