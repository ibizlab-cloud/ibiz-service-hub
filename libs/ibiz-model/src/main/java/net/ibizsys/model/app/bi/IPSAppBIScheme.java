package net.ibizsys.model.app.bi;



/**
 * 应用智能报表体系模型对象接口
 *
 */
public interface IPSAppBIScheme extends net.ibizsys.model.app.IPSApplicationObject{

	
	
	/**
	 * 获取智能立方体集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.bi.IPSAppBICube> getPSAppBICubes();
	
	/**
	 * 获取智能立方体集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.bi.IPSAppBICube getPSAppBICube(Object objKey, boolean bTryMode);
	
	/**
	 * 设置智能立方体集合
	 * @param list 智能立方体集合
	 */
	void setPSAppBICubes(java.util.List<net.ibizsys.model.app.bi.IPSAppBICube> list);
	
	
	/**
	 * 获取智能报表集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.bi.IPSAppBIReport> getPSAppBIReports();
	
	/**
	 * 获取智能报表集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.bi.IPSAppBIReport getPSAppBIReport(Object objKey, boolean bTryMode);
	
	/**
	 * 设置智能报表集合
	 * @param list 智能报表集合
	 */
	void setPSAppBIReports(java.util.List<net.ibizsys.model.app.bi.IPSAppBIReport> list);
	
	
	/**
	 * 获取智能报表唯一标记
	 * @return
	 */
	java.lang.String getUniqueTag();
}