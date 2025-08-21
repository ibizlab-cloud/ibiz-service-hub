package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑调用实体通知逻辑节点模型对象接口
 * <P>
 * 扩展父接口类型[DENOTIFY]
 *
 */
public interface IPSDEDENotifyLogic extends net.ibizsys.model.dataentity.logic.IPSDELogicNode{

	
	
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
	 * 获取目标实体通知对象
	 * @return
	 */
	net.ibizsys.model.dataentity.notify.IPSDENotify getDstPSDENotify();


	/**
	 * 获取目标实体通知对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.notify.IPSDENotify getDstPSDENotifyMust();
	
	
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