package net.ibizsys.model.control.chart;



/**
 * 图表部件数据表格对象模型对象接口
 *
 */
public interface IPSChartDataGrid extends net.ibizsys.model.control.chart.IPSChartObject{

	
	
	/**
	 * 获取数据表格位置
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ChartTitlePos}
	 * @return
	 */
	java.lang.String getDataGridPos();
	
	
	/**
	 * 获取是否显示数据表格
	 * @return
	 */
	boolean isShowDataGrid();
}