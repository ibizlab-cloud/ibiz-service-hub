package net.ibizsys.model.codelist;



/**
 *
 */
public interface IPSThreshold extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取背景颜色
	 * @return
	 */
	java.lang.String getBKColor();
	
	
	/**
	 * 获取开始值
	 * @return
	 */
	java.lang.Double getBeginValue();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取文本颜色
	 * @return
	 */
	java.lang.String getColor();
	
	
	/**
	 * 获取数据
	 * @return
	 */
	java.lang.String getData();
	
	
	/**
	 * 获取结束值
	 * @return
	 */
	java.lang.Double getEndValue();
	
	
	/**
	 * 获取显示样式
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCss();


	/**
	 * 获取显示样式，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCssMust();
	
	
	/**
	 * 获取图标对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取图标对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取文本
	 * @return
	 */
	java.lang.String getText();
	
	
	/**
	 * 获取文本语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTextPSLanguageRes();


	/**
	 * 获取文本语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTextPSLanguageResMust();
	
	
	/**
	 * 获取阈值项标记
	 * @return
	 */
	java.lang.String getThresholdTag();
	
	
	/**
	 * 获取阈值项标记2
	 * @return
	 */
	java.lang.String getThresholdTag2();
	
	
	/**
	 * 获取提示信息
	 * @return
	 */
	java.lang.String getTooltip();
	
	
	/**
	 * 获取提示信息语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageRes();


	/**
	 * 获取提示信息语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageResMust();
	
	
	/**
	 * 获取是否包含开始值
	 * @return
	 */
	boolean isIncludeBeginValue();
	
	
	/**
	 * 获取是否包含结束值
	 * @return
	 */
	boolean isIncludeEndValue();
}