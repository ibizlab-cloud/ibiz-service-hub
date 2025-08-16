package net.ibizsys.model.control.dashboard;



/**
 * 应视图门户部件模型对象接口
 *
 */
public interface IPSDBAppViewPortletPart extends net.ibizsys.model.control.dashboard.IPSDBPortletPart{

	
	
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