package net.ibizsys.model.control.dashboard;



/**
 *
 */
public interface IPSDBViewPortletPart extends net.ibizsys.model.control.dashboard.IPSDBSysPortletPart
		,net.ibizsys.model.control.dashboard.IPSDBAppViewPortletPart{

	
	
	/**
	 * 获取嵌入视图对象
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getPortletPSAppView();


	/**
	 * 获取嵌入视图对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getPortletPSAppViewMust();
}