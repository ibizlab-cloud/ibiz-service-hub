package net.ibizsys.model.app;



/**
 * 应用逻辑模型对象接口
 *
 */
public interface IPSApplicationLogic extends net.ibizsys.model.IPSModelObject{

	
	
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
	 * 获取逻辑标记
	 * @return
	 */
	java.lang.String getLogicTag();
	
	
	/**
	 * 获取触发逻辑类型
	 * @return
	 */
	java.lang.String getLogicType();
	
	
	/**
	 * 获取逻辑名称
	 * @return
	 */
	java.lang.String getName();
	
	
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
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UILogicTriggerType}
	 * @return
	 */
	java.lang.String getTriggerType();
}