package net.ibizsys.model.res;



/**
 * 系统界面样式表模型对象接口
 *
 */
public interface IPSSysCss extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	String getCodeName();
	
	
	/**
	 * 获取样式名称
	 * @return
	 */
	String getCssName();
	
	
	/**
	 * 获取直接样式内容
	 * @return
	 */
	String getCssStyle();
	
	
	/**
	 * 获取配置样式内容
	 * @return
	 */
	String getDesignCssStyle();
}