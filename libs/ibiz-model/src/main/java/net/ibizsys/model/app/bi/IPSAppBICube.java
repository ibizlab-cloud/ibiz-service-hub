package net.ibizsys.model.app.bi;



/**
 * 应用智能立方体模型对象接口
 *
 */
public interface IPSAppBICube extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取访问标识
	 * @return
	 */
	java.lang.String getAccessKey();
	
	
	/**
	 * 获取默认反查应用视图对象
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getDrillDetailPSAppView();


	/**
	 * 获取默认反查应用视图对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getDrillDetailPSAppViewMust();
	
	
	/**
	 * 获取智能立方体维度集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.bi.IPSAppBICubeDimension> getPSAppBICubeDimensions();
	
	/**
	 * 获取智能立方体维度集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.bi.IPSAppBICubeDimension getPSAppBICubeDimension(Object objKey, boolean bTryMode);
	
	/**
	 * 设置智能立方体维度集合
	 * @param list 智能立方体维度集合
	 */
	void setPSAppBICubeDimensions(java.util.List<net.ibizsys.model.app.bi.IPSAppBICubeDimension> list);
	
	
	/**
	 * 获取智能立方体指标集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.bi.IPSAppBICubeMeasure> getPSAppBICubeMeasures();
	
	/**
	 * 获取智能立方体指标集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.bi.IPSAppBICubeMeasure getPSAppBICubeMeasure(Object objKey, boolean bTryMode);
	
	/**
	 * 设置智能立方体指标集合
	 * @param list 智能立方体指标集合
	 */
	void setPSAppBICubeMeasures(java.util.List<net.ibizsys.model.app.bi.IPSAppBICubeMeasure> list);
	
	
	/**
	 * 获取系统智能立方体
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity();


	/**
	 * 获取系统智能立方体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust();
	
	
	/**
	 * 获取门户部件默认界面行为组对象
	 * @return
	 */
	net.ibizsys.model.view.IPSUIActionGroup getPorletPSUIActionGroup();


	/**
	 * 获取门户部件默认界面行为组对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.view.IPSUIActionGroup getPorletPSUIActionGroupMust();
}