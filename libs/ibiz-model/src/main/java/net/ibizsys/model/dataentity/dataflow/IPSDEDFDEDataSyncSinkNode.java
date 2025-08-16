package net.ibizsys.model.dataentity.dataflow;



/**
 *
 */
public interface IPSDEDFDEDataSyncSinkNode extends net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowSinkNode{

	
	
	/**
	 * 获取目标实体数据同步对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DSTPSDEDATASYNCID}
	 * @return
	 */
	net.ibizsys.model.dataentity.datasync.IPSDEDataSync getDstPSDEDataSync();


	/**
	 * 获取目标实体数据同步对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.datasync.IPSDEDataSync getDstPSDEDataSyncMust();
	
	
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
	
	
	/**
	 * 获取事件类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PARAM7}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DataSyncInformType}
	 * @return
	 */
	int getEventType();
}