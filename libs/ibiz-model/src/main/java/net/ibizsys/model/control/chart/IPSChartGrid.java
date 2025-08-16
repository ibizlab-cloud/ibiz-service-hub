package net.ibizsys.model.control.chart;



/**
 * 图表坐标系内绘图网格模型对象接口
 * <P>
 * 扩展父接口类型[grid]
 * <P>
 * 单个 grid 内最多可以放置上下两个 X 轴，左右两个 Y 轴。可以在网格上绘制折线图，柱状图，散点图（气泡图）。
 *
 */
public interface IPSChartGrid extends net.ibizsys.model.control.chart.IPSChartCoordinateSystemControl
		,net.ibizsys.model.control.chart.IPSChartPosition{

	
	
	/**
	 * 获取绘图表格X轴[0]
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartGridXAxis getPSChartGridXAxis0();


	/**
	 * 获取绘图表格X轴[0]，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartGridXAxis getPSChartGridXAxis0Must();
	
	
	/**
	 * 获取绘图表格X轴[1]
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartGridXAxis getPSChartGridXAxis1();


	/**
	 * 获取绘图表格X轴[1]，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartGridXAxis getPSChartGridXAxis1Must();
	
	
	/**
	 * 获取绘图表格Y轴[0]
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartGridYAxis getPSChartGridYAxis0();


	/**
	 * 获取绘图表格Y轴[0]，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartGridYAxis getPSChartGridYAxis0Must();
	
	
	/**
	 * 获取绘图表格Y轴[1]
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartGridYAxis getPSChartGridYAxis1();


	/**
	 * 获取绘图表格Y轴[1]，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartGridYAxis getPSChartGridYAxis1Must();
}