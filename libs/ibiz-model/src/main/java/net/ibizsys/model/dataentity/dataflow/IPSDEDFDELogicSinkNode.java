package net.ibizsys.model.dataentity.dataflow;



/**
 *
 */
public interface IPSDEDFDELogicSinkNode extends net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowSinkNode{

	
	
	/**
	 * 获取目标实体处理逻辑对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogic getDstPSDELogic();


	/**
	 * 获取目标实体处理逻辑对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogic getDstPSDELogicMust();
	
	
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