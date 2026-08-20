package net.ibizsys.model.app.theme;



/**
 * 应用界面主题模型对象接口
 *
 */
public interface IPSAppUITheme extends net.ibizsys.model.app.IPSApplicationObject{

	
	
	/**
	 * 获取主题样式
	 * @return
	 */
	String getCssStyle();
	
	
	/**
	 * 获取主题说明
	 * @return
	 */
	String getThemeDesc();
	
	
	/**
	 * 获取主题参数集合
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getThemeParams();
	
	
	/**
	 * 获取主题标记
	 * @return
	 */
	String getThemeTag();
	
	
	/**
	 * 获取主题远程路径
	 * @return
	 */
	String getThemeUrl();
}