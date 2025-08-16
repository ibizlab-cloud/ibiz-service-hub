package net.ibizsys.model.control;



/**
 * 界面部件逻辑模型对象接口
 *
 */
public interface IPSControlLogic extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取注入属性名称
	 * @return
	 */
	java.lang.String getAttrName();
	
	
	/**
	 * 获取事件参数
	 * @return
	 */
	java.lang.String getEventArg();
	
	
	/**
	 * 获取事件参数2
	 * @return
	 */
	java.lang.String getEventArg2();
	
	
	/**
	 * 获取事件名称
	 * @return
	 */
	java.lang.String getEventNames();
	
	
	/**
	 * 获取子项名称
	 * @return
	 */
	java.lang.String getItemName();
	
	
	/**
	 * 获取逻辑标记
	 * @return
	 */
	java.lang.String getLogicTag();
	
	
	/**
	 * 获取触发逻辑类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ControlLogicType}
	 * @return
	 */
	java.lang.String getLogicType();
	
	
	/**
	 * 获取逻辑名称
	 * @return
	 */
	java.lang.String getName();
	
	
	/**
	 * 获取触发应用实体界面行为
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEUIAction getPSAppDEUIAction();


	/**
	 * 获取触发应用实体界面行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEUIAction getPSAppDEUIActionMust();
	
	
	/**
	 * 获取触发应用实体界面逻辑
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEUILogic getPSAppDEUILogic();


	/**
	 * 获取触发应用实体界面逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEUILogic getPSAppDEUILogicMust();
	
	
	/**
	 * 获取触发逻辑所在应用实体
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity();


	/**
	 * 获取触发逻辑所在应用实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust();
	
	
	/**
	 * 获取触发应用预置界面逻辑
	 * @return
	 */
	net.ibizsys.model.app.logic.IPSAppUILogic getPSAppUILogic();


	/**
	 * 获取触发应用预置界面逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.logic.IPSAppUILogic getPSAppUILogicMust();
	
	
	/**
	 * 获取触发视图引擎
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppViewEngine getPSAppViewEngine();


	/**
	 * 获取触发视图引擎，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppViewEngine getPSAppViewEngineMust();
	
	
	/**
	 * 获取触发视图逻辑
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppViewLogic getPSAppViewLogic();


	/**
	 * 获取触发视图逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppViewLogic getPSAppViewLogicMust();
	
	
	/**
	 * 获取脚本代码
	 * @return
	 */
	java.lang.String getScriptCode();
	
	
	/**
	 * 获取定时间隔（ms）
	 * @return
	 */
	int getTimer();
	
	
	/**
	 * 获取触发器类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CtrlLogicTrigger}
	 * @return
	 */
	java.lang.String getTriggerType();
}