package net.ibizsys.model.control.dashboard;



/**
 * 数据看板部件模型基础对象接口
 *
 */
public interface IPSDashboard extends net.ibizsys.model.control.IPSAjaxControl
		,net.ibizsys.model.control.IPSControlContainer
		,net.ibizsys.model.control.dashboard.IPSDashboardContainer
		,net.ibizsys.model.control.layout.IPSLayoutContainer{

	
	
	/**
	 * 获取看板定制模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CtrlCustomizeMode}
	 * @return
	 */
	int getCustomizeMode();
	
	
	/**
	 * 获取数据看板样式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DashboardStyle}
	 * @return
	 */
	java.lang.String getDashboardStyle();
	
	
	/**
	 * 获取导航栏样式表
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getNavBarPSSysCss();


	/**
	 * 获取导航栏样式表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getNavBarPSSysCssMust();
	
	
	/**
	 * 获取导航栏位置
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.NavBarPos}
	 * @return
	 */
	java.lang.String getNavBarPos();
	
	
	/**
	 * 获取导航栏样式
	 * @return
	 */
	java.lang.String getNavBarStyle();
	
	
	/**
	 * 获取导航栏宽度
	 * @return
	 */
	double getNavBarWidth();
	
	
	/**
	 * 获取导航栏高度
	 * @return
	 */
	double getNavbarHeight();
	
	
	/**
	 * 获取应用动态看板功能
	 * @return
	 */
	net.ibizsys.model.app.util.IPSAppDynaDashboardUtil getPSAppDynaDashboardUtil();


	/**
	 * 获取应用动态看板功能，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.util.IPSAppDynaDashboardUtil getPSAppDynaDashboardUtilMust();
	
	
	/**
	 * 获取数据看板部件集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.dashboard.IPSDBPortletPart> getPSPortlets();
	
	/**
	 * 获取数据看板部件集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.dashboard.IPSDBPortletPart getPSDBPortletPart(Object objKey, boolean bTryMode);
	
	/**
	 * 设置数据看板部件集合
	 * @param list 数据看板部件集合
	 */
	void setPSDBPortletParts(java.util.List<net.ibizsys.model.control.dashboard.IPSDBPortletPart> list);
	
	
	/**
	 * 获取是否支持看板定制
	 * @return
	 */
	boolean isEnableCustomized();
	
	
	/**
	 * 获取是否显示看板导航栏
	 * @return
	 */
	boolean isShowDashboardNavBar();
}