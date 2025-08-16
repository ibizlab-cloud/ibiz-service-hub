package net.ibizsys.model.control.chart;



/**
 * 极坐标系组件模型对象接口
 * <P>
 * 可以用于散点图和折线图。每个极坐标系拥有一个角度轴和一个半径轴。
 *
 */
public interface IPSChartPolar extends net.ibizsys.model.control.chart.IPSChartCoordinateSystemControl{

	
	
	/**
	 * 获取角度轴
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartPolarAngleAxis getPSChartPolarAngleAxis();


	/**
	 * 获取角度轴，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartPolarAngleAxis getPSChartPolarAngleAxisMust();
	
	
	/**
	 * 获取径向轴
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartPolarRadiusAxis getPSChartPolarRadiusAxis();


	/**
	 * 获取径向轴，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.chart.IPSChartPolarRadiusAxis getPSChartPolarRadiusAxisMust();
}