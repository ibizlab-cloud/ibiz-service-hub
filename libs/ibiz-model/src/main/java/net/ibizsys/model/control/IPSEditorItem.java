package net.ibizsys.model.control;



/**
 * 编辑器项模型对象接口
 *
 */
public interface IPSEditorItem extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取应用实体自填模式对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEACMode getPSAppDEACMode();


	/**
	 * 获取应用实体自填模式对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEACMode getPSAppDEACModeMust();
	
	
	/**
	 * 获取应用实体结果集对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet();


	/**
	 * 获取应用实体结果集对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSetMust();
	
	
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
}