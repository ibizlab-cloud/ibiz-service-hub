package net.ibizsys.model.app.dataentity;



/**
 * 应用实体数据导入模型对象接口
 *
 */
public interface IPSAppDEDataImport extends net.ibizsys.model.dataentity.dataimport.IPSDEDataImport
		,net.ibizsys.model.app.dataentity.IPSAppDataEntityObject{

	
	
	/**
	 * 获取建立应用实体行为
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getCreatePSAppDEAction();


	/**
	 * 获取建立应用实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getCreatePSAppDEActionMust();
	
	
	/**
	 * 获取更新应用实体行为
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getUpdatePSAppDEAction();


	/**
	 * 获取更新应用实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getUpdatePSAppDEActionMust();
}