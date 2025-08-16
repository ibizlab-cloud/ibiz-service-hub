package net.ibizsys.model.control.expbar;



/**
 * 分页导航部件模型对象接口
 *
 */
public interface IPSTabExpPanel extends net.ibizsys.model.control.IPSControl
		,net.ibizsys.model.control.IPSControlContainer{

	
	
	/**
	 * 获取导航面板分页集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.expbar.IPSTabExpPage> getPSTabExpPages();
	
	/**
	 * 获取导航面板分页集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.expbar.IPSTabExpPage getPSTabExpPage(Object objKey, boolean bTryMode);
	
	/**
	 * 设置导航面板分页集合
	 * @param list 导航面板分页集合
	 */
	void setPSTabExpPages(java.util.List<net.ibizsys.model.control.expbar.IPSTabExpPage> list);
	
	
	/**
	 * 获取导航面板布局
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TabViewTabPos}
	 * @return
	 */
	java.lang.String getTabLayout();
	
	
	/**
	 * 获取全局唯一标记
	 * @return
	 */
	java.lang.String getUniqueTag();
}