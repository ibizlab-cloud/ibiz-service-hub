package net.ibizsys.model.control.chart;



/**
 * ECharts图表模型对象接口
 *
 */
public interface IPSECharts{

	
	
	/**
	 * 获取基础配置Json内容
	 * @return
	 */
	java.lang.String getBaseOptionJOString();
	
	
	/**
	 * 获取图表坐标系集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.chart.IPSChartCoordinateSystem> getPSChartCoordinateSystems();
	
	/**
	 * 获取图表坐标系集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.chart.IPSChartCoordinateSystem getPSChartCoordinateSystem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置图表坐标系集合
	 * @param list 图表坐标系集合
	 */
	void setPSChartCoordinateSystems(java.util.List<net.ibizsys.model.control.chart.IPSChartCoordinateSystem> list);
}