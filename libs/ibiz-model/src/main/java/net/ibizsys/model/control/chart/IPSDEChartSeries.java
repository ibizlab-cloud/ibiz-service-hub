package net.ibizsys.model.control.chart;



/**
 * 实体图表数据序列模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEChartSeriesDTO}运行时对象
 * <P>
 * 子接口扩展识别值 {@link #getSeriesType}
 *
 */
public interface IPSDEChartSeries extends net.ibizsys.model.control.chart.IPSChartSeries{

	
	
	/**
	 * 获取示例数据
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEChartSeriesDTO#FIELD_SAMPLEDATA}
	 * @return
	 */
	java.lang.String getSampleData();
}