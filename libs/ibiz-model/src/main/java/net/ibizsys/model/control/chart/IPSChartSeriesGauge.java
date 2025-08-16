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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEChartSeriesDTO#FIELD_ENDANGLE}
	 * @return
	 */
	java.lang.Integer getEndAngle();
	
	
	/**
	 * 获取最大值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEChartSeriesDTO#FIELD_MAXVALUE}
	 * @return
	 */
	java.lang.Integer getMaxValue();
	
	
	/**
	 * 获取最小值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEChartSeriesDTO#FIELD_MINVALUE}
	 * @return
	 */
	java.lang.Integer getMinValue();
	
	
	/**
	 * 获取半径
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEChartSeriesDTO#FIELD_RADIUS}
	 * @return
	 */
	java.lang.Object getRadius();
	
	
	/**
	 * 获取分割段数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEChartSeriesDTO#FIELD_SPLITNUMBER}
	 * @return
	 */
	java.lang.Integer getSplitNumber();
	
	
	/**
	 * 获取起始角度
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEChartSeriesDTO#FIELD_STARTANGLE}
	 * @return
	 */
	java.lang.Integer getStartAngle();
	
	
	/**
	 * 获取是否顺时针
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEChartSeriesDTO#FIELD_CLOCKWISE}
	 * @return
	 */
	boolean isClockwise();
}