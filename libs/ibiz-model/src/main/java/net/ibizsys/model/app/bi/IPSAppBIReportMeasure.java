package net.ibizsys.model.app.bi;



/**
 * 应用智能报表指标模型对象接口
 *
 */
public interface IPSAppBIReportMeasure extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取聚合模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AggMode}
	 * @return
	 */
	java.lang.String getAggMode();
	
	
	/**
	 * 获取反查数据展示视图
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getDrillDetailPSAppView();


	/**
	 * 获取反查数据展示视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getDrillDetailPSAppViewMust();
	
	
	/**
	 * 获取钻取数据展示视图
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getDrillDownPSAppView();


	/**
	 * 获取钻取数据展示视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getDrillDownPSAppViewMust();
	
	
	/**
	 * 获取报表项标记
	 * @return
	 */
	java.lang.String getItemTag();
	
	
	/**
	 * 获取报表项标记2
	 * @return
	 */
	java.lang.String getItemTag2();
	
	
	/**
	 * 获取Json值格式化
	 * @return
	 */
	java.lang.String getJsonFormat();
	
	
	/**
	 * 获取指标公式
	 * @return
	 */
	java.lang.String getMeasureFormula();
	
	
	/**
	 * 获取指标组
	 * @return
	 */
	java.lang.String getMeasureGroup();
	
	
	/**
	 * 获取指标名称
	 * @return
	 */
	java.lang.String getMeasureName();
	
	
	/**
	 * 获取指标项动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getMeasureParams();
	
	
	/**
	 * 获取指标标记
	 * @return
	 */
	java.lang.String getMeasureTag();
	
	
	/**
	 * 获取指标类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BIMeasureType}
	 * @return
	 */
	java.lang.String getMeasureType();
	
	
	/**
	 * 获取应用智能立方体指标
	 * @return
	 */
	net.ibizsys.model.app.bi.IPSAppBICubeMeasure getPSAppBICubeMeasure();


	/**
	 * 获取应用智能立方体指标，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.bi.IPSAppBICubeMeasure getPSAppBICubeMeasureMust();
	
	
	/**
	 * 获取应用代码表对象
	 * @return
	 */
	net.ibizsys.model.app.codelist.IPSAppCodeList getPSAppCodeList();


	/**
	 * 获取应用代码表对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.codelist.IPSAppCodeList getPSAppCodeListMust();
	
	
	/**
	 * 获取相关应用属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEField();


	/**
	 * 获取相关应用属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEFieldMust();
	
	
	/**
	 * 获取放置类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BIReportItemPlaceType}
	 * @return
	 */
	java.lang.String getPlaceType();
	
	
	/**
	 * 获取标准数据类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
	
	
	/**
	 * 获取文本绘制模板
	 * @return
	 */
	java.lang.String getTextTemplate();
	
	
	/**
	 * 获取提示绘制模板
	 * @return
	 */
	java.lang.String getTipTemplate();
}