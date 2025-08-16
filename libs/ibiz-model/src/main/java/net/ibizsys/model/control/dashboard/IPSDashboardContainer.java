package net.ibizsys.model.control.dashboard;



/**
 * 数据看板容器模型对象接口
 *
 */
public interface IPSDashboardContainer extends net.ibizsys.model.control.layout.IPSLayoutContainer{

	
	
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
}