package net.ibizsys.model.control.chart;



/**
 * 图表位置模型对象接口
 *
 */
public interface IPSChartPosition{

	
	
	/**
	 * 获取下方间隔
	 * @return
	 */
	Object getBottom();
	
	
	/**
	 * 获取高度
	 * @return
	 */
	Object getHeight();
	
	
	/**
	 * 获取左侧间隔
	 * @return
	 */
	Object getLeft();
	
	
	/**
	 * 获取右侧间隔
	 * @return
	 */
	Object getRight();
	
	
	/**
	 * 获取上方间隔
	 * @return
	 */
	Object getTop();
	
	
	/**
	 * 获取宽度
	 * @return
	 */
	Object getWidth();
}