package net.ibizsys.model.control.panel;



/**
 * 面板逻辑模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysViewPanelLogicDTO}运行时对象
 *
 */
public interface IPSPanelLogic extends net.ibizsys.model.control.panel.IPSPanelObject
		,net.ibizsys.model.app.view.IPSAppViewLogic{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
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
	 * 获取逻辑名称
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取逻辑触发
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.PanelLogicType}
	 * @return
	 */
	java.lang.String getLogicTrigger();
	
	
	/**
	 * 获取触发逻辑类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ControlLogicType}
	 * @return
	 */
	java.lang.String getLogicType();
	
	
	/**
	 * 获取应用实体界面逻辑
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEUILogic getPSAppDEUILogic();


	/**
	 * 获取应用实体界面逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEUILogic getPSAppDEUILogicMust();
	
	
	/**
	 * 获取应用实体对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity();


	/**
	 * 获取应用实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust();
	
	
	/**
	 * 获取应用预置界面逻辑
	 * @return
	 */
	net.ibizsys.model.app.logic.IPSAppUILogic getPSAppUILogic();


	/**
	 * 获取应用预置界面逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.logic.IPSAppUILogic getPSAppUILogicMust();
	
	
	/**
	 * 获取定时间隔（ms）
	 * @return
	 */
	int getTimer();
}