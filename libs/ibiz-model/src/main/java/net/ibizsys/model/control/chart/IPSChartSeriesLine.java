package net.ibizsys.model.control.chart;



/**
 * 图表折线/面积图序列模型对象接口
 * <P>
 * 扩展父接口类型[area,line]
 *
 */
public interface IPSChartSeriesLine extends net.ibizsys.model.control.chart.IPSChartSeries{

	
	
	/**
	 * 获取阶梯线图
	 * @return
	 */
	java.lang.Object getStep();
	
	
	/**
	 * 获取是否数据堆叠
	 * @return
	 */
	boolean isStack();
}