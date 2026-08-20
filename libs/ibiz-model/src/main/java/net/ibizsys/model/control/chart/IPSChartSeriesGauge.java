package net.ibizsys.model.control.chart;



/**
 * 图表仪表盘序列模型对象接口
 * <P>
 * 扩展父接口类型[gauge]
 *
 */
public interface IPSChartSeriesGauge extends net.ibizsys.model.control.chart.IPSChartSeries{

	
	
	/**
	 * 获取结束角度
	 * @return
	 */
	Integer getEndAngle();
	
	
	/**
	 * 获取最大值
	 * @return
	 */
	Integer getMaxValue();
	
	
	/**
	 * 获取最小值
	 * @return
	 */
	Integer getMinValue();
	
	
	/**
	 * 获取半径
	 * @return
	 */
	Object getRadius();
	
	
	/**
	 * 获取分割段数
	 * @return
	 */
	Integer getSplitNumber();
	
	
	/**
	 * 获取起始角度
	 * @return
	 */
	Integer getStartAngle();
	
	
	/**
	 * 获取是否顺时针
	 * @return
	 */
	boolean isClockwise();
}