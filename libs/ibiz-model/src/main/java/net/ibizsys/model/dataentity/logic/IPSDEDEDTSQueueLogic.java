package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑调用实体分布处理队列节点模型对象接口
 * <P>
 * 扩展父接口类型[DEDTSQUEUE]
 *
 */
public interface IPSDEDEDTSQueueLogic extends net.ibizsys.model.dataentity.logic.IPSDELogicNode{

	
	
	/**
	 * 获取目标实体异步处理队列对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_DSTPSDEDTSQUEUEID}
	 * @return
	 */
	net.ibizsys.model.dataentity.dts.IPSDEDTSQueue getDstPSDEDTSQueue();


	/**
	 * 获取目标实体异步处理队列对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.dts.IPSDEDTSQueue getDstPSDEDTSQueueMust();
	
	
	/**
	 * 获取目标逻辑参数对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_DSTPSDLPARAMID}
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParam();


	/**
	 * 获取目标逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParamMust();
	
	
	/**
	 * 获取目标实体对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_DSTPSDEID}
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getDstPSDataEntity();


	/**
	 * 获取目标实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getDstPSDataEntityMust();
}