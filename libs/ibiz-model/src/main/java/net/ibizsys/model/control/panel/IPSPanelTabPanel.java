package net.ibizsys.model.control.panel;



/**
 * 面板分页部件模型对象接口
 * <P>
 * 扩展父接口类型[TABPANEL]
 *
 */
public interface IPSPanelTabPanel extends net.ibizsys.model.control.panel.IPSPanelItem
		,net.ibizsys.model.control.panel.IPSPanelDataRegion{

	
	
	/**
	 * 获取分页面板集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.panel.IPSPanelTabPage> getPSPanelTabPages();
	
	/**
	 * 获取分页面板集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.panel.IPSPanelTabPage getPSPanelTabPage(Object objKey, boolean bTryMode);
	
	/**
	 * 设置分页面板集合
	 * @param list 分页面板集合
	 */
	void setPSPanelTabPages(java.util.List<net.ibizsys.model.control.panel.IPSPanelTabPage> list);
}