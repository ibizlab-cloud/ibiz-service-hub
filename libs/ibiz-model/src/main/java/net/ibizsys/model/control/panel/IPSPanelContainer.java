package net.ibizsys.model.control.panel;



/**
 * 面板容器项模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO}运行时对象
 * <P>
 * 扩展父接口类型[CONTAINER]
 *
 */
public interface IPSPanelContainer extends net.ibizsys.model.control.panel.IPSPanelItem
		,net.ibizsys.model.control.panel.IPSPanelDataRegion{

	
	
	/**
	 * 获取界面行为组展开模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO#FIELD_ITEMPARAM4}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UGExtractMode}
	 * @return
	 */
	java.lang.String getActionGroupExtractMode();
	
	
	/**
	 * 获取动态标题绑定值项，仅在数据区域类型{@link #getDataRegionType}为无(NONE)及继承(INHERIT)时启用
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO#FIELD_FIELDNAME}
	 * @return
	 */
	java.lang.String getCaptionItemName();
	
	
	/**
	 * 获取成员集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.panel.IPSPanelItem> getPSPanelItems();
	
	/**
	 * 获取成员集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.panel.IPSPanelItem getPSPanelItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置成员集合
	 * @param list 成员集合
	 */
	void setPSPanelItems(java.util.List<net.ibizsys.model.control.panel.IPSPanelItem> list);
	
	
	/**
	 * 获取界面行为组对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO#FIELD_PSDEUAGROUPID}
	 * @return
	 */
	net.ibizsys.model.view.IPSUIActionGroup getPSUIActionGroup();


	/**
	 * 获取界面行为组对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.view.IPSUIActionGroup getPSUIActionGroupMust();
	
	
	/**
	 * 获取预置类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO#FIELD_PREDEFINEDTYPE}
	 * @return
	 */
	java.lang.String getPredefinedType();
	
	
	/**
	 * 获取标题栏关闭模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysViewPanelItemDTO#FIELD_TITLEBARCLOSEMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GroupTitleBarCloseMode}
	 * @return
	 */
	int getTitleBarCloseMode();
}