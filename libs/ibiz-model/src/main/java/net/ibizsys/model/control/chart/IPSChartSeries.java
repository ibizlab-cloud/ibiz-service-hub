package net.ibizsys.model.control.chart;



/**
 * 图表数据序列模型基础对象接口
 *
 */
public interface IPSChartSeries extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.control.IPSControlItemNavigatable{

	
	
	/**
	 * 获取基础配置Json内容
	 * @return
	 */
	java.lang.String getBaseOptionJOString();
	
	
	/**
	 * 获取标题语言资源对象
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageRes();


	/**
	 * 获取标题语言资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageResMust();
	
	
	/**
	 * 获取标题
	 * @return
	 */
	java.lang.String getCaption();
	
	
	/**
	 * 获取分类属性
	 * @return
	 */
	java.lang.String getCatalogField();
	
	
	/**
	 * 获取分类代码表对象
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getCatalogPSCodeList();


	/**
	 * 获取分类代码表对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getCatalogPSCodeListMust();
	
	
	/**
	 * 获取值属性
	 * @return
	 */
	java.lang.String getDataField();
	
	
	/**
	 * 获取ECharts序列类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ChartType}
	 * @return
	 */
	java.lang.String getEChartsType();
	
	
	/**
	 * 获取扩展值2属性
	 * @return
	 */
	java.lang.String getExtValue2Field();
	
	
	/**
	 * 获取扩展值3属性
	 * @return
	 */
	java.lang.String getExtValue3Field();
	
	
	/**
	 * 获取扩展值4属性
	 * @return
	 */
	java.lang.String getExtValue4Field();
	
	
	/**
	 * 获取扩展值属性
	 * @return
	 */
	java.lang.String getExtValueField();
	
	
	/**
	 * 获取分组模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ChartSeriesGroupMode}
	 * @return
	 */
	java.lang.String getGroupMode();
	
	
	/**
	 * 获取序列标识属性
	 * @return
	 */
	java.lang.String getIdField();
	
	
	/**
	 * 获取图表坐标系统
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartCoordinateSystem getPSChartCoordinateSystem();


	/**
	 * 获取图表坐标系统，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartCoordinateSystem getPSChartCoordinateSystemMust();
	
	
	/**
	 * 获取图表数据集对象
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartDataSet getPSChartDataSet();


	/**
	 * 获取图表数据集对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartDataSet getPSChartDataSetMust();
	
	
	/**
	 * 获取图表序列编码
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartSeriesEncode getPSChartSeriesEncode();


	/**
	 * 获取图表序列编码，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartSeriesEncode getPSChartSeriesEncodeMust();
	
	
	/**
	 * 获取前端扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin();


	/**
	 * 获取前端扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust();
	
	
	/**
	 * 获取序列名称属性
	 * @return
	 */
	java.lang.String getSeriesField();
	
	
	/**
	 * 获取结果集行列模式
	 * @return
	 */
	java.lang.String getSeriesLayoutBy();
	
	
	/**
	 * 获取序列代码表对象
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getSeriesPSCodeList();


	/**
	 * 获取序列代码表对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getSeriesPSCodeListMust();
	
	
	/**
	 * 获取图形类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ChartType}
	 * @return
	 */
	java.lang.String getSeriesType();
	
	
	/**
	 * 获取标记属性
	 * @return
	 */
	java.lang.String getTagField();
	
	
	/**
	 * 获取值属性
	 * @return
	 */
	java.lang.String getValueField();
	
	
	/**
	 * 获取是否支持图表数据集
	 * @return
	 */
	boolean isEnableChartDataSet();
}