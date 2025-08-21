package net.ibizsys.model.control.panel;



/**
 * 面板部件模型对象基础接口
 *
 */
public interface IPSPanel extends net.ibizsys.model.control.IPSControl
		,net.ibizsys.model.control.IPSControlContainer
		,net.ibizsys.model.control.layout.IPSLayoutContainer{

	
	
	/**
	 * 获取面板字段项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.panel.IPSPanelField> getAllPSPanelFields();
	
	/**
	 * 获取面板字段项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.panel.IPSPanelField getPSPanelField(Object objKey, boolean bTryMode);
	
	/**
	 * 设置面板字段项集合
	 * @param list 面板字段项集合
	 */
	void setPSPanelFields(java.util.List<net.ibizsys.model.control.panel.IPSPanelField> list);
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取面板数据模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.PanelGetDataMode}
	 * @return
	 */
	int getDataMode();
	
	
	/**
	 * 获取数据对象名称
	 * @return
	 */
	java.lang.String getDataName();
	
	
	/**
	 * 获取面板数据刷新间隔
	 * @return
	 */
	int getDataTimer();
	
	
	/**
	 * 获取获取数据行为
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getGetPSControlAction();


	/**
	 * 获取获取数据行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getGetPSControlActionMust();
	
	
	/**
	 * 获取布局模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.LayoutMode}
	 * @return
	 */
	java.lang.String getLayoutMode();
	
	
	/**
	 * 获取面板样式
	 * @return
	 */
	java.lang.String getPanelStyle();
	
	
	/**
	 * 获取面板宽度
	 * @return
	 */
	double getPanelWidth();
	
	
	/**
	 * 获取面板顶级成员集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.panel.IPSPanelItem> getRootPSPanelItems();
	
	/**
	 * 获取面板顶级成员集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.panel.IPSPanelItem getRootPSPanelItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置面板顶级成员集合
	 * @param list 面板顶级成员集合
	 */
	void setRootPSPanelItems(java.util.List<net.ibizsys.model.control.panel.IPSPanelItem> list);
	
	
	/**
	 * 获取是否布局面板
	 * @return
	 */
	boolean isLayoutPanel();
	
	
	/**
	 * 获取是否移动端面板
	 * @return
	 */
	boolean isMobilePanel();
}