package net.ibizsys.model.dataentity.dataflow;



/**
 *
 */
public interface IPSDEDFSysDataSyncAgentSourceNode extends net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowSourceNode{

	
	
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
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataFlowSysDataSyncAgentSourceType}
	 * @return
	 */
	java.lang.String getSubType();
}