package net.ibizsys.model.app.dataentity;



/**
 * 应用实体行为附加逻辑模型对象接口
 *
 */
public interface IPSAppDEActionLogic extends net.ibizsys.model.app.dataentity.IPSAppDEMethodLogic{

	
	
	/**
	 * 获取触发目标行为
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getDstPSAppDEAction();


	/**
	 * 获取触发目标行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getDstPSAppDEActionMust();
	
	
	/**
	 * 获取目标行为所属实体
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getDstPSAppDataEntity();


	/**
	 * 获取目标行为所属实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getDstPSAppDataEntityMust();
	
	
	/**
	 * 获取应用实体逻辑
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDELogic getPSAppDELogic();


	/**
	 * 获取应用实体逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDELogic getPSAppDELogicMust();
	
	
	/**
	 * 获取是否克隆传入参数
	 * @return
	 */
	boolean isCloneParam();
	
	
	/**
	 * 获取是否内部逻辑
	 * @return
	 */
	boolean isInternalLogic();
}