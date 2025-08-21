package net.ibizsys.model.control.toolbar;



/**
 * 实体工具栏分组项模型对象接口
 * <P>
 * 扩展父接口类型[ITEMS]
 *
 */
public interface IPSDETBGroupItem extends net.ibizsys.model.control.toolbar.IPSDEToolbarItem{

	
	
	/**
	 * 获取行为级别
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UIActionLevel}
	 * @return
	 */
	int getActionLevel();
	
	
	/**
	 * 获取边框样式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BorderStyle}
	 * @return
	 */
	java.lang.String getBorderStyle();
	
	
	/**
	 * 获取按钮样式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ButtonStyle}
	 * @return
	 */
	java.lang.String getButtonStyle();
	
	
	/**
	 * 获取界面行为组展开模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UGExtractMode}
	 * @return
	 */
	java.lang.String getGroupExtractMode();
	
	
	/**
	 * 获取子项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.toolbar.IPSDEToolbarItem> getPSDEToolbarItems();
	
	/**
	 * 获取子项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.toolbar.IPSDEToolbarItem getPSDEToolbarItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置子项集合
	 * @param list 子项集合
	 */
	void setPSDEToolbarItems(java.util.List<net.ibizsys.model.control.toolbar.IPSDEToolbarItem> list);
	
	
	/**
	 * 获取界面行为组对象
	 * @return
	 */
	net.ibizsys.model.view.IPSUIActionGroup getPSUIActionGroup();


	/**
	 * 获取界面行为组对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.view.IPSUIActionGroup getPSUIActionGroupMust();
}