package net.ibizsys.model.control.menu;



/**
 * 应用菜单部件模型对象接口
 *
 */
public interface IPSAppMenu extends net.ibizsys.model.control.IPSAjaxControl
		,net.ibizsys.model.app.appmenu.IPSAppMenuModel
		,net.ibizsys.model.control.layout.IPSLayoutContainer{

	
	
	/**
	 * 获取成员应用功能标记应用实体属性对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getAppFuncTagPSAppDEField();


	/**
	 * 获取成员应用功能标记应用实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getAppFuncTagPSAppDEFieldMust();
	
	
	/**
	 * 获取应用菜单样式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AppMenuStyle}
	 * @return
	 */
	String getAppMenuStyle();
	
	
	/**
	 * 获取成员样式表提示应用实体属性对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getClsPSAppDEField();


	/**
	 * 获取成员样式表提示应用实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getClsPSAppDEFieldMust();
	
	
	/**
	 * 获取动态模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AIAgentDynamicMode}
	 * @return
	 */
	int getDynamicMode();
	
	
	/**
	 * 获取成员启用脚本应用实体属性对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getEnableScriptPSAppDEField();


	/**
	 * 获取成员启用脚本应用实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getEnableScriptPSAppDEFieldMust();
	
	
	/**
	 * 获取成员图标样式表应用实体属性对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getIconClsPSAppDEField();


	/**
	 * 获取成员图标样式表应用实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getIconClsPSAppDEFieldMust();
	
	
	/**
	 * 获取成员数据应用实体数据集对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getItemPSAppDEDataSet();


	/**
	 * 获取成员数据应用实体数据集对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getItemPSAppDEDataSetMust();
	
	
	/**
	 * 获取成员数据应用实体对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getItemPSAppDataEntity();


	/**
	 * 获取成员数据应用实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getItemPSAppDataEntityMust();
	
	
	/**
	 * 获取布局模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.LayoutMode}
	 * @return
	 */
	String getLayoutMode();
	
	
	/**
	 * 获取应用计数器引用
	 * @return
	 */
	net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRef();


	/**
	 * 获取应用计数器引用，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRefMust();
	
	
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
	
	
	/**
	 * 获取成员文本应用实体属性对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEField();


	/**
	 * 获取成员文本应用实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEFieldMust();
	
	
	/**
	 * 获取成员提示应用实体属性对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTipsPSAppDEField();


	/**
	 * 获取成员提示应用实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTipsPSAppDEFieldMust();
	
	
	/**
	 * 获取成员显示脚本应用实体属性对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getVisibleScriptPSAppDEField();


	/**
	 * 获取成员显示脚本应用实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getVisibleScriptPSAppDEFieldMust();
	
	
	/**
	 * 获取是否支持自定义
	 * @return
	 */
	boolean isEnableCustomized();
}