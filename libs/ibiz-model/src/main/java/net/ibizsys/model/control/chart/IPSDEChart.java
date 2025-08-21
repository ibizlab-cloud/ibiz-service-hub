package net.ibizsys.model.control.chart;



/**
 * 实体图表部件模型对象接口
 *
 */
public interface IPSDEChart extends net.ibizsys.model.control.chart.IPSChart
		,net.ibizsys.model.control.chart.IPSECharts{

	
	
	/**
	 * 获取默认排序方向
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SortDir}
	 * @return
	 */
	java.lang.String getMinorSortDir();
	
	
	/**
	 * 获取默认排序应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getMinorSortPSAppDEField();


	/**
	 * 获取默认排序应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getMinorSortPSAppDEFieldMust();
	
	
	/**
	 * 获取实体图表数据表格对象
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSDEChartDataGrid getPSDEChartDataGrid();


	/**
	 * 获取实体图表数据表格对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSDEChartDataGrid getPSDEChartDataGridMust();
	
	
	/**
	 * 获取实体图表图例对象
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSDEChartLegend getPSDEChartLegend();


	/**
	 * 获取实体图表图例对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSDEChartLegend getPSDEChartLegendMust();
	
	
	/**
	 * 获取图表数据序列集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.chart.IPSDEChartSeries> getPSDEChartSerieses();
	
	/**
	 * 获取图表数据序列集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.chart.IPSDEChartSeries getPSDEChartSeries(Object objKey, boolean bTryMode);
	
	/**
	 * 设置图表数据序列集合
	 * @param list 图表数据序列集合
	 */
	void setPSDEChartSeries(java.util.List<net.ibizsys.model.control.chart.IPSDEChartSeries> list);
	
	
	/**
	 * 获取实体图表标题对象
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSDEChartTitle getPSDEChartTitle();


	/**
	 * 获取实体图表标题对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSDEChartTitle getPSDEChartTitleMust();
}