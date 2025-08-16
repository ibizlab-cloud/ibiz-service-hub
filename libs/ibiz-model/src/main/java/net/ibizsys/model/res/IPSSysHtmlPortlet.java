package net.ibizsys.model.res;



/**
 *
 */
public interface IPSSysHtmlPortlet extends net.ibizsys.model.res.IPSSysPortlet{

	
	
	/**
	 * 获取内容显示模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.PortletHtmlShowMode}
	 * @return
	 */
	java.lang.String getHtmlShowMode();
	
	
	/**
	 * 获取页面路径
	 * @return
	 */
	java.lang.String getPageUrl();
}