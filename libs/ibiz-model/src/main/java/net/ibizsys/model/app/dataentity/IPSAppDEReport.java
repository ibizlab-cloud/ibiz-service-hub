package net.ibizsys.model.app.dataentity;



/**
 * 应用实体报表模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEReportDTO}运行时对象
 *
 */
public interface IPSAppDEReport extends net.ibizsys.model.dataentity.report.IPSDEReport
		,net.ibizsys.model.app.dataentity.IPSAppDataEntityObject{

	
	
	/**
	 * 获取应用智能报表立方体
	 * @return
	 */
	net.ibizsys.model.app.bi.IPSAppBICube getPSAppBICube();


	/**
	 * 获取应用智能报表立方体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.bi.IPSAppBICube getPSAppBICubeMust();
	
	
	/**
	 * 获取应用智能报表
	 * @return
	 */
	net.ibizsys.model.app.bi.IPSAppBIReport getPSAppBIReport();


	/**
	 * 获取应用智能报表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.bi.IPSAppBIReport getPSAppBIReportMust();
	
	
	/**
	 * 获取应用智能报表体系
	 * @return
	 */
	net.ibizsys.model.app.bi.IPSAppBIScheme getPSAppBIScheme();


	/**
	 * 获取应用智能报表体系，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.bi.IPSAppBIScheme getPSAppBISchemeMust();
	
	
	/**
	 * 获取应用实体数据集合
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEReportDTO#FIELD_PSDEDSID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet();


	/**
	 * 获取应用实体数据集合，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSetMust();
	
	
	/**
	 * 获取应用实体数据集合2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEReportDTO#FIELD_PSDEDSID2}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet2();


	/**
	 * 获取应用实体数据集合2，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet2Must();
	
	
	/**
	 * 获取应用实体数据集合3
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEReportDTO#FIELD_PSDEDSID3}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet3();


	/**
	 * 获取应用实体数据集合3，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet3Must();
	
	
	/**
	 * 获取应用实体数据集合4
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEReportDTO#FIELD_PSDEDSID4}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet4();


	/**
	 * 获取应用实体数据集合4，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet4Must();
	
	
	/**
	 * 获取应用实体报表项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEReportItem> getPSAppDEReportItems();
	
	/**
	 * 获取应用实体报表项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEReportItem getPSAppDEReportItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用实体报表项集合
	 * @param list 应用实体报表项集合
	 */
	void setPSAppDEReportItems(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEReportItem> list);
	
	
	/**
	 * 获取布局面板
	 * @return
	 */
	net.ibizsys.model.control.panel.IPSLayoutPanel getPSLayoutPanel();


	/**
	 * 获取布局面板，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.panel.IPSLayoutPanel getPSLayoutPanelMust();
}