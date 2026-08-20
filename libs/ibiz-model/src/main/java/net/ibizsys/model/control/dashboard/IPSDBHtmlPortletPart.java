package net.ibizsys.model.control.dashboard;



/**
 * Html页面门户部件模型对象接口
 *
 */
public interface IPSDBHtmlPortletPart extends net.ibizsys.model.control.dashboard.IPSDBSysPortletPart{

	
	
	/**
	 * 获取内容显示模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.PortletHtmlShowMode}
	 * @return
	 */
	String getHtmlShowMode();
	
	
	/**
	 * 获取网页地址
	 * @return
	 */
	String getPageUrl();
}