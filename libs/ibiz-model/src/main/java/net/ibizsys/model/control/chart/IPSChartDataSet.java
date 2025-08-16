package net.ibizsys.model.control.chart;



/**
 * 图表数据集模型对象接口
 *
 */
public interface IPSChartDataSet extends net.ibizsys.model.control.chart.IPSChartObject{

	
	
	/**
	 * 获取图表数据集属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.chart.IPSChartDataSetField> getPSChartDataSetFields();
	
	/**
	 * 获取图表数据集属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.chart.IPSChartDataSetField getPSChartDataSetField(Object objKey, boolean bTryMode);
	
	/**
	 * 设置图表数据集属性集合
	 * @param list 图表数据集属性集合
	 */
	void setPSChartDataSetFields(java.util.List<net.ibizsys.model.control.chart.IPSChartDataSetField> list);
}