package net.ibizsys.model.dataentity.dataflow;



/**
 *
 */
public interface IPSDEDFDEDataFlowSinkNode extends net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowSinkNode{

	
	
	/**
	 * 获取目标实体数据流逻辑对象
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
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getDstPSDataEntity();


	/**
	 * 获取目标实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getDstPSDataEntityMust();
}