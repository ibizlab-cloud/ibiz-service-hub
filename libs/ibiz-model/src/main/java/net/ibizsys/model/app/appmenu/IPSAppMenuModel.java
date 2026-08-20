package net.ibizsys.model.app.appmenu;



/**
 * 应用菜单模型对象接口
 *
 */
public interface IPSAppMenuModel extends net.ibizsys.model.app.IPSApplicationObject{

	
	net.ibizsys.model.app.dataentity.IPSAppDEField getAppFuncTagPSAppDEField();

net.ibizsys.model.app.dataentity.IPSAppDEField getAppFuncTagPSAppDEFieldMust();
	
	net.ibizsys.model.app.dataentity.IPSAppDEField getClsPSAppDEField();

net.ibizsys.model.app.dataentity.IPSAppDEField getClsPSAppDEFieldMust();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	String getCodeName();
	
	int getDynamicMode();
	
	net.ibizsys.model.app.dataentity.IPSAppDEField getEnableScriptPSAppDEField();

net.ibizsys.model.app.dataentity.IPSAppDEField getEnableScriptPSAppDEFieldMust();
	
	net.ibizsys.model.app.dataentity.IPSAppDEField getIconClsPSAppDEField();

net.ibizsys.model.app.dataentity.IPSAppDEField getIconClsPSAppDEFieldMust();
	
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getItemPSAppDEDataSet();

net.ibizsys.model.app.dataentity.IPSAppDEDataSet getItemPSAppDEDataSetMust();
	
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getItemPSAppDataEntity();

net.ibizsys.model.app.dataentity.IPSAppDataEntity getItemPSAppDataEntityMust();
	
	
	/**
	 * 获取菜单项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.menu.IPSAppMenuItem> getPSAppMenuItems();
	
	/**
	 * 获取菜单项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.menu.IPSAppMenuItem getPSAppMenuItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置菜单项集合
	 * @param list 菜单项集合
	 */
	void setPSAppMenuItems(java.util.List<net.ibizsys.model.control.menu.IPSAppMenuItem> list);
	
	net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEField();

net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEFieldMust();
	
	net.ibizsys.model.app.dataentity.IPSAppDEField getTipsPSAppDEField();

net.ibizsys.model.app.dataentity.IPSAppDEField getTipsPSAppDEFieldMust();
	
	net.ibizsys.model.app.dataentity.IPSAppDEField getVisibleScriptPSAppDEField();

net.ibizsys.model.app.dataentity.IPSAppDEField getVisibleScriptPSAppDEFieldMust();
}