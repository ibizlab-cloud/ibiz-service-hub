package net.ibizsys.model.control.chart;



/**
 * 图表序列无坐标编码模型对象接口
 * <P>
 * 扩展父接口类型[NONE]
 *
 */
public interface IPSChartSeriesCSNoneEncode extends net.ibizsys.model.control.chart.IPSChartSeriesEncode{

	
	
	/**
	 * 获取分类属性
	 * @return
	 */
	java.lang.String getCategory();
	
	
	/**
	 * 获取值属性
	 * @return
	 */
	java.lang.String getValue();
}