package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑调用实体同步逻辑节点模型对象接口
 * <P>
 * 扩展父接口类型[DEDATASYNC]
 *
 */
public interface IPSDEDEDataSyncLogic extends net.ibizsys.model.dataentity.logic.IPSDELogicNode{

	
	
	/**
	 * 获取目标实体数据同步对象
	 * @return
	 */
	net.ibizsys.model.dataentity.datasync.IPSDEDataSync getDstPSDEDataSync();


	/**
	 * 获取目标实体数据同步对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.datasync.IPSDEDataSync getDstPSDEDataSyncMust();
	
	
	/**
	 * 获取目标逻辑参数对象
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
}