package net.ibizsys.model.app.theme;



/**
 * 应用界面主题模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSAppUIThemeDTO}运行时对象
 *
 */
public interface IPSAppUITheme extends net.ibizsys.model.app.IPSApplicationObject{

	
	
	/**
	 * 获取主题样式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppUIThemeDTO#FIELD_CSSSTYLE}
	 * @return
	 */
	java.lang.String getCssStyle();
	
	
	/**
	 * 获取主题说明
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppUIThemeDTO#FIELD_THEMEDESC}
	 * @return
	 */
	java.lang.String getThemeDesc();
	
	
	/**
	 * 获取主题参数集合
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppUIThemeDTO#FIELD_THEMEPARAMS}
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getThemeParams();
	
	
	/**
	 * 获取主题标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppUIThemeDTO#FIELD_THEMETAG}
	 * @return
	 */
	java.lang.String getThemeTag();
	
	
	/**
	 * 获取主题远程路径
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppUIThemeDTO#FIELD_THEMEURL}
	 * @return
	 */
	java.lang.String getThemeUrl();
}