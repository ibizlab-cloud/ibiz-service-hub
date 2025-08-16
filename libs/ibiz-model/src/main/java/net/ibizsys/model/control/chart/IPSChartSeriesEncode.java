package net.ibizsys.model.control.chart;



/**
 * 图表序列编码模型对象接口
 * <P>
 * 子接口扩展识别值 {@link #getType}
 *
 */
public interface IPSChartSeriesEncode extends net.ibizsys.model.control.chart.IPSChartObject{

	
	
	/**
	 * 获取序列标识维度
	 * @return
	 */
	java.lang.String getItemId();
	
	
	/**
	 * 获取序列名称维度
	 * @return
	 */
	java.lang.String getItemName();
	
	
	/**
	 * 获取坐标系类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ChartCoordinateSystem}
	 * @return
	 */
	java.lang.String getType();
}