package net.ibizsys.model.control;



/**
 * 界面部件行为模型基础对象接口
 *
 */
public interface IPSControlAction extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取上下文转换逻辑
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDELogic getADPSAppDELogic();


	/**
	 * 获取上下文转换逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDELogic getADPSAppDELogicMust();
	
	
	/**
	 * 获取行为描述
	 * @return
	 */
	java.lang.String getActionDesc();
	
	
	/**
	 * 获取目标行为名称
	 * @return
	 */
	java.lang.String getActionName();
	
	
	/**
	 * 获取应用实体方法
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMethod getPSAppDEMethod();


	/**
	 * 获取应用实体方法，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMethod getPSAppDEMethodMust();
	
	
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
	 * 获取处理超时时长（毫秒）
	 * @return
	 */
	int getTimeout();
}