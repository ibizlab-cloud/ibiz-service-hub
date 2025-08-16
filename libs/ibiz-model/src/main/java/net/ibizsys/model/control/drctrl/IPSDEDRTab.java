package net.ibizsys.model.control.drctrl;



/**
 *
 */
public interface IPSDEDRTab extends net.ibizsys.model.control.drctrl.IPSDRTab
		,net.ibizsys.model.control.drctrl.IPSDEDRCtrl{

	
	
	/**
	 * 获取关系分页集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.drctrl.IPSDEDRTabPage> getPSDEDRTabPages();
	
	/**
	 * 获取关系分页集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.drctrl.IPSDEDRTabPage getPSDEDRTabPage(Object objKey, boolean bTryMode);
	
	/**
	 * 设置关系分页集合
	 * @param list 关系分页集合
	 */
	void setPSDEDRTabPages(java.util.List<net.ibizsys.model.control.drctrl.IPSDEDRTabPage> list);
}