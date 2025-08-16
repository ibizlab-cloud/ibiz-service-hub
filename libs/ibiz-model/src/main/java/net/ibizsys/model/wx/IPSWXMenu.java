package net.ibizsys.model.wx;



/**
 *
 */
public interface IPSWXMenu extends net.ibizsys.model.wx.IPSWXAccountObject
		,net.ibizsys.model.IPSObject{

	
	
	/**
	 * 获取菜单项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.wx.IPSWXMenuItem> getPSWXMenuItems();
	
	/**
	 * 获取菜单项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.wx.IPSWXMenuItem getPSWXMenuItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置菜单项集合
	 * @param list 菜单项集合
	 */
	void setPSWXMenuItems(java.util.List<net.ibizsys.model.wx.IPSWXMenuItem> list);
	
	
	/**
	 * 获取是否默认菜单
	 * @return
	 */
	boolean isDefaultMenu();
}