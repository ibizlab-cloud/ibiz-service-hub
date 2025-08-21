package net.ibizsys.model.dataentity.logic;



/**
 * 实体界面逻辑调用实体处理逻辑节点模型对象接口
 * <P>
 * 扩展父接口类型[DELOGIC]
 *
 */
public interface IPSDEUIDELogicLogic extends net.ibizsys.model.dataentity.logic.IPSDEUILogicNode{

	
	
	/**
	 * 获取应用实体逻辑对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDELogic getDstPSAppDELogic();


	/**
	 * 获取应用实体逻辑对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDELogic getDstPSAppDELogicMust();
	
	
	/**
	 * 获取应用实体对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getDstPSAppDataEntity();


	/**
	 * 获取应用实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getDstPSAppDataEntityMust();
	
	
	/**
	 * 获取目标逻辑参数对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getDstPSDEUILogicParam();


	/**
	 * 获取目标逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getDstPSDEUILogicParamMust();
	
	
	/**
	 * 获取返回值绑定逻辑参数对象
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getRetPSDEUILogicParam();


	/**
	 * 获取返回值绑定逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getRetPSDEUILogicParamMust();
}