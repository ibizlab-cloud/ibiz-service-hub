package net.ibizsys.model.res;



/**
 *
 */
public interface IPSSysChartTheme extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	String getCodeName();
	
	
	/**
	 * 获取主题说明
	 * @return
	 */
	String getThemeDesc();
	
	
	/**
	 * 获取主题参数
	 * @return
	 */
	String getThemeParams();
	
	
	/**
	 * 获取主题标记
	 * @return
	 */
	String getThemeTag();
	
	
	/**
	 * 获取主题标记2
	 * @return
	 */
	String getThemeTag2();
	
	
	/**
	 * 获取是否默认主题
	 * @return
	 */
	boolean isDefaultMode();
}