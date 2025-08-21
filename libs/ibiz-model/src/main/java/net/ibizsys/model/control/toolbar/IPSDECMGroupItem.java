package net.ibizsys.model.control.toolbar;



/**
 * 上下文菜单分组模型对象接口
 * <P>
 * 扩展父接口类型[ITEMS]
 *
 */
public interface IPSDECMGroupItem extends net.ibizsys.model.control.toolbar.IPSDEContextMenuItem{

	
	
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
	 * 获取子项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.toolbar.IPSDEContextMenuItem> getPSDEContextMenuItems();
	
	/**
	 * 获取子项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.toolbar.IPSDEContextMenuItem getPSDEContextMenuItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置子项集合
	 * @param list 子项集合
	 */
	void setPSDEContextMenuItems(java.util.List<net.ibizsys.model.control.toolbar.IPSDEContextMenuItem> list);
}