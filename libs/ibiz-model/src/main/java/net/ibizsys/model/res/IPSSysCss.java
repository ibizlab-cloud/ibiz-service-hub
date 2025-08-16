package net.ibizsys.model.res;



/**
 * 系统界面样式表模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysCssDTO}运行时对象
 *
 */
public interface IPSSysCss extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取样式名称
	 * @return
	 */
	java.lang.String getCssName();
	
	
	/**
	 * 获取直接样式内容
	 * @return
	 */
	java.lang.String getCssStyle();
	
	
	/**
	 * 获取配置样式内容
	 * @return
	 */
	java.lang.String getDesignCssStyle();
}