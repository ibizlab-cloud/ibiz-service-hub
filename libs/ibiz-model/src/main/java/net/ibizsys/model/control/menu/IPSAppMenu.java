package net.ibizsys.model.control.menu;



/**
 * 应用菜单部件模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSAppMenuDTO}运行时对象
 *
 */
public interface IPSAppMenu extends net.ibizsys.model.control.IPSAjaxControl
		,net.ibizsys.model.app.appmenu.IPSAppMenuModel
		,net.ibizsys.model.control.layout.IPSLayoutContainer{

	
	
	/**
	 * 获取应用菜单样式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppMenuDTO#FIELD_APPMENUSTYLE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AppMenuStyle}
	 * @return
	 */
	java.lang.String getAppMenuStyle();
	
	
	/**
	 * 获取布局模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppMenuDTO#FIELD_LAYOUTMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.LayoutMode}
	 * @return
	 */
	java.lang.String getLayoutMode();
	
	
	/**
	 * 获取应用计数器引用
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppMenuDTO#FIELD_PSSYSCOUNTERID}
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
	 * 获取是否支持自定义
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppMenuDTO#FIELD_CUSTOMIZEDFLAG}
	 * @return
	 */
	boolean isEnableCustomized();
}