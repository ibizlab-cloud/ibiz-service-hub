package net.ibizsys.model.control.dashboard;



/**
 *
 */
public interface IPSDBViewPortletPart extends net.ibizsys.model.control.dashboard.IPSDBSysPortletPart
		,net.ibizsys.model.control.dashboard.IPSDBAppViewPortletPart{

	
	
	/**
	 * 获取嵌入视图对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSAPPVIEWID}
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getPortletPSAppView();


	/**
	 * 获取嵌入视图对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getPortletPSAppViewMust();
}