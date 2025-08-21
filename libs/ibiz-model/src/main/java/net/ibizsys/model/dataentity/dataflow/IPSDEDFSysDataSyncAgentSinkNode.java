package net.ibizsys.model.dataentity.dataflow;



/**
 *
 */
public interface IPSDEDFSysDataSyncAgentSinkNode extends net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowSinkNode{

	
	
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
	
	
	/**
	 * 获取事件类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DataSyncInformType}
	 * @return
	 */
	int getEventType();
	
	
	/**
	 * 获取系统数据同步代理
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
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataFlowSysDataSyncAgentSinkType}
	 * @return
	 */
	java.lang.String getSubType();
}