package net.ibizsys.model.app.util;



/**
 * 应用模型存储功能模型对象接口
 *
 */
public interface IPSAppDynaUtilBase extends net.ibizsys.model.app.util.IPSAppUtil{

	
	
	/**
	 * 获取应用标识存储属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getAppIdPSAppDEField();


	/**
	 * 获取应用标识存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getAppIdPSAppDEFieldMust();
	
	
	/**
	 * 获取建立数据行为
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getCreatePSAppDEAction();


	/**
	 * 获取建立数据行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getCreatePSAppDEActionMust();
	
	
	/**
	 * 获取获取数据行为
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getGetPSAppDEAction();


	/**
	 * 获取获取数据行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getGetPSAppDEActionMust();
	
	
	/**
	 * 获取模型标识存储属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getModelIdPSAppDEField();


	/**
	 * 获取模型标识存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getModelIdPSAppDEFieldMust();
	
	
	/**
	 * 获取模型存储属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getModelPSAppDEField();


	/**
	 * 获取模型存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getModelPSAppDEFieldMust();
	
	
	/**
	 * 获取删除数据行为
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getRemovePSAppDEAction();


	/**
	 * 获取删除数据行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getRemovePSAppDEActionMust();
	
	
	/**
	 * 获取功能数据存储实体
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getStoagePSAppDataEntity();


	/**
	 * 获取功能数据存储实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getStoagePSAppDataEntityMust();
	
	
	/**
	 * 获取功能数据存储实体
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getStoragePSAppDataEntity();


	/**
	 * 获取功能数据存储实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getStoragePSAppDataEntityMust();
	
	
	/**
	 * 获取更新数据行为
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getUpdatePSAppDEAction();


	/**
	 * 获取更新数据行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getUpdatePSAppDEActionMust();
	
	
	/**
	 * 获取用户标识存储属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getUserIdPSAppDEField();


	/**
	 * 获取用户标识存储属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getUserIdPSAppDEFieldMust();
}