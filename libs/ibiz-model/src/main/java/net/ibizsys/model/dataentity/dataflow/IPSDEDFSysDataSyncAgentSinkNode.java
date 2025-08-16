package net.ibizsys.model.dataentity.dataflow;



/**
 *
 */
public interface IPSDEDFSysDataSyncAgentSinkNode extends net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowSinkNode{

	
	
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
	
	
	/**
	 * 获取系统数据同步代理
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSSYSDATASYNCAGENTID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysDataSyncAgent getPSSysDataSyncAgent();


	/**
	 * 获取系统数据同步代理，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysDataSyncAgent getPSSysDataSyncAgentMust();
	
	
	/**
	 * 获取子类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_LOGICNODESUBTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataFlowSysDataSyncAgentSinkType}
	 * @return
	 */
	java.lang.String getSubType();
}