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
	java.lang.String getCssStyle();
	
	
	/**
	 * 获取主题说明
	 * @return
	 */
	java.lang.String getThemeDesc();
	
	
	/**
	 * 获取主题参数集合
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getThemeParams();
	
	
	/**
	 * 获取主题标记
	 * @return
	 */
	java.lang.String getThemeTag();
	
	
	/**
	 * 获取主题远程路径
	 * @return
	 */
	java.lang.String getThemeUrl();
}