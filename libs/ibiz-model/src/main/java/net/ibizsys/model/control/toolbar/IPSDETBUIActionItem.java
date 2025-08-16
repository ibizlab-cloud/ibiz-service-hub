package net.ibizsys.model.control.toolbar;



/**
 * 实体工具栏界面行为项模型对象接口,
 * <P>
 * 扩展父接口类型[DEUIACTION]
 *
 */
public interface IPSDETBUIActionItem extends net.ibizsys.model.control.toolbar.IPSDEToolbarItem
		,net.ibizsys.model.app.view.IPSDEUIActionItem
		,net.ibizsys.model.app.view.IPSWFUIActionItem{

	
	
	/**
	 * 获取行为级别
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_ACTIONLEVEL}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UIActionLevel}
	 * @return
	 */
	int getActionLevel();
	
	
	/**
	 * 获取边框样式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_BORDERSTYLE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BorderStyle}
	 * @return
	 */
	java.lang.String getBorderStyle();
	
	
	/**
	 * 获取按钮样式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_ITEMSTYLE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ButtonStyle}
	 * @return
	 */
	java.lang.String getButtonStyle();
	
	
	/**
	 * 获取界面行为组展开模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_GROUPEXTRACTMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UGExtractMode}
	 * @return
	 */
	java.lang.String getGroupExtractMode();
	
	
	/**
	 * 获取无权限显示模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_NOPRIVDM}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BtnNoPrivDisplayMode}
	 * @return
	 */
	int getNoPrivDisplayMode();
	
	
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
	 * 获取界面行为对象，除了显式指定界面行为，其它类型{@link PSDETBItemDTO#FIELD_BTNACTIONTYPE}也会被仿真为界面行为
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_PSDEUIACTIONID}
	 * @return
	 */
	net.ibizsys.model.view.IPSUIAction getPSUIAction();


	/**
	 * 获取界面行为对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.view.IPSUIAction getPSUIActionMust();
	
	
	/**
	 * 获取界面行为操作目标
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UIActionTarget}
	 * @return
	 */
	java.lang.String getUIActionTarget();
	
	
	/**
	 * 获取是否启用点击切换模式
	 * @return
	 */
	boolean isEnableToggleMode();
	
	
	/**
	 * 获取是否隐藏
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETBItemDTO#FIELD_HIDDENITEM}
	 * @return
	 */
	boolean isHiddenItem();
}