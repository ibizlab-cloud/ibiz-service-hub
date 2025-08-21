package net.ibizsys.model.control.toolbar;



/**
 * 实体工具栏部件模型对象接口
 *
 */
public interface IPSDEToolbar extends net.ibizsys.model.control.IPSControl{

	
	
	/**
	 * 获取工具栏所有者
	 * @return
	 */
	java.lang.Object getOwner();
	
	
	/**
	 * 获取工具栏项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.toolbar.IPSDEToolbarItem> getPSDEToolbarItems();
	
	/**
	 * 获取工具栏项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.toolbar.IPSDEToolbarItem getPSDEToolbarItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置工具栏项集合
	 * @param list 工具栏项集合
	 */
	void setPSDEToolbarItems(java.util.List<net.ibizsys.model.control.toolbar.IPSDEToolbarItem> list);
	
	
	/**
	 * 获取工具栏样式
	 * @return
	 */
	java.lang.String getToolbarStyle();
	
	
	/**
	 * 获取界面行为数据部件名称
	 * @return
	 */
	java.lang.String getXDataControlName();
}