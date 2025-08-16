package net.ibizsys.model.app.bi;



/**
 * 应用智能报表模型对象接口
 *
 */
public interface IPSAppBIReport extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取访问标识
	 * @return
	 */
	java.lang.String getAccessKey();
	
	
	/**
	 * 获取系统智能立方体
	 * @return
	 */
	net.ibizsys.model.app.bi.IPSAppBICube getPSAppBICube();


	/**
	 * 获取系统智能立方体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.bi.IPSAppBICube getPSAppBICubeMust();
	
	
	/**
	 * 获取智能立方体维度集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.bi.IPSAppBIReportDimension> getPSAppBIReportDimensions();
	
	/**
	 * 获取智能立方体维度集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.bi.IPSAppBIReportDimension getPSAppBIReportDimension(Object objKey, boolean bTryMode);
	
	/**
	 * 设置智能立方体维度集合
	 * @param list 智能立方体维度集合
	 */
	void setPSAppBIReportDimensions(java.util.List<net.ibizsys.model.app.bi.IPSAppBIReportDimension> list);
	
	
	/**
	 * 获取智能立方体指标集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.bi.IPSAppBIReportMeasure> getPSAppBIReportMeasures();
	
	/**
	 * 获取智能立方体指标集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.bi.IPSAppBIReportMeasure getPSAppBIReportMeasure(Object objKey, boolean bTryMode);
	
	/**
	 * 设置智能立方体指标集合
	 * @param list 智能立方体指标集合
	 */
	void setPSAppBIReportMeasures(java.util.List<net.ibizsys.model.app.bi.IPSAppBIReportMeasure> list);
	
	
	/**
	 * 获取相关应用实体
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity();


	/**
	 * 获取相关应用实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust();
	
	
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
	
	
	/**
	 * 获取报表标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_BIREPORTTAG}
	 * @return
	 */
	java.lang.String getReportTag();
	
	
	/**
	 * 获取报表标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_BIREPORTTAG2}
	 * @return
	 */
	java.lang.String getReportTag2();
	
	
	/**
	 * 获取报表前端模型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_BIREPORTUIMODEL}
	 * @return
	 */
	java.lang.String getReportUIModel();
}