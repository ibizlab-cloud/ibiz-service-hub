package net.ibizsys.model.control.chart;



/**
 * 图表饼图序列模型对象接口
 * <P>
 * 扩展父接口类型[pie,pie3d]
 *
 */
public interface IPSChartSeriesPie extends net.ibizsys.model.control.chart.IPSChartSeriesCSNone
		,net.ibizsys.model.control.chart.IPSChartPosition{

	
	
	/**
	 * 获取圆心
	 * @return
	 */
	java.lang.Object getCenter();
	
	
	/**
	 * 获取最小扇区角度
	 * @return
	 */
	java.lang.Integer getMinAngle();
	
	
	/**
	 * 获取无标签扇区角度
	 * @return
	 */
	java.lang.Integer getMinShowLabelAngle();
	
	
	/**
	 * 获取半径
	 * @return
	 */
	java.lang.Object getRadius();
	
	
	/**
	 * 获取展示南丁格尔图
	 * @return
	 */
	java.lang.Object getRoseType();
	
	
	/**
	 * 获取起始角度
	 * @return
	 */
	java.lang.Integer getStartAngle();
}