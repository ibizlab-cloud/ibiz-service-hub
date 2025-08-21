package net.ibizsys.model.control.menu;



/**
 * 应用菜单项模型对象接口
 *
 */
public interface IPSAppMenuItem extends net.ibizsys.model.control.menu.IPSMenuItem
		,net.ibizsys.model.control.layout.IPSLayoutContainer
		,net.ibizsys.model.control.layout.IPSLayoutItem
		,net.ibizsys.model.control.IPSNavigateParamContainer{

	
	
	/**
	 * 获取菜单项状态
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.MenuItemState}
	 * @return
	 */
	int getAppMenuItemState();
	
	
	/**
	 * 获取计数器标识
	 * @return
	 */
	java.lang.String getCounterId();
	
	
	/**
	 * 获取项直接样式
	 * @return
	 */
	java.lang.String getCssStyle();
	
	
	/**
	 * 获取项数据
	 * @return
	 */
	java.lang.String getData();
	
	
	/**
	 * 获取动态样式表
	 * @return
	 */
	java.lang.String getDynaClass();
	
	
	/**
	 * 获取菜单项通知标记
	 * @return
	 */
	java.lang.String getInformTag();
	
	
	/**
	 * 获取菜单项通知标记2
	 * @return
	 */
	java.lang.String getInformTag2();
	
	
	/**
	 * 获取应用功能
	 * @return
	 */
	net.ibizsys.model.app.func.IPSAppFunc getPSAppFunc();


	/**
	 * 获取应用功能，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.func.IPSAppFunc getPSAppFuncMust();
	
	
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
	 * 获取系统样式表
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCss();


	/**
	 * 获取系统样式表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCssMust();
	
	
	/**
	 * 获取系统图片
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取系统图片，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取前端应用插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin();


	/**
	 * 获取前端应用插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust();
	
	
	/**
	 * 获取预置类型
	 * @return
	 */
	java.lang.String getPredefinedType();
	
	
	/**
	 * 获取预置类型参数
	 * @return
	 */
	java.lang.String getPredefinedTypeParam();
	
	
	/**
	 * 获取标题栏关闭模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GroupTitleBarCloseMode}
	 * @return
	 */
	int getTitleBarCloseMode();
	
	
	/**
	 * 获取是否禁用关闭
	 * @return
	 */
	boolean isDisableClose();
	
	
	/**
	 * 获取是否打开时隐藏边栏
	 * @return
	 */
	boolean isHideSideBar();
	
	
	/**
	 * 获取是否默认打开
	 * @return
	 */
	boolean isOpenDefault();
	
	
	/**
	 * 获取是否分隔栏
	 * @return
	 */
	boolean isSeperator();
	
	
	/**
	 * 获取是否延展
	 * @return
	 */
	boolean isSpanMode();
	
	
	/**
	 * 获取是否启用
	 * @return
	 */
	boolean isValid();
}