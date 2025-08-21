package net.ibizsys.model.app.dataentity;



/**
 * 应用实体界面行为组模型对象接口
 *
 */
public interface IPSAppDEUIActionGroup extends net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup
		,net.ibizsys.model.IPSModelSortable{

	
	
	/**
	 * 获取应用实体
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity();


	/**
	 * 获取应用实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust();
	
	
	/**
	 * 获取唯一标记
	 * @return
	 */
	java.lang.String getUniqueTag();
}