package net.ibizsys.model.dataentity.logic;



/**
 * 实体界面逻辑调用界面行为节点模型对象接口
 * <P>
 * 扩展父接口类型[DEUIACTION]
 *
 */
public interface IPSDEUIActionLogic extends net.ibizsys.model.dataentity.logic.IPSDEUILogicNode{

	
	
	/**
	 * 获取调用应用实体界面行为
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEUIAction getDstPSAppDEUIAction();


	/**
	 * 获取调用应用实体界面行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEUIAction getDstPSAppDEUIActionMust();
	
	
	/**
	 * 获取目标应用实体对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getDstPSAppDataEntity();


	/**
	 * 获取目标应用实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getDstPSAppDataEntityMust();
}