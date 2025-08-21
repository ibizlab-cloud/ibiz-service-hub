package net.ibizsys.model.control;



/**
 * 按钮部件模型基础对象接口
 *
 */
public interface IPSButtonBase extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取边框样式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BorderStyle}
	 * @return
	 */
	java.lang.String getBorderStyle();
	
	
	/**
	 * 获取按钮直接样式
	 * @return
	 */
	java.lang.String getButtonCssStyle();
	
	
	/**
	 * 获取按钮高度
	 * @return
	 */
	double getButtonHeight();
	
	
	/**
	 * 获取按钮样式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ButtonStyle}
	 * @return
	 */
	java.lang.String getButtonStyle();
	
	
	/**
	 * 获取按钮类型
	 * @return
	 */
	java.lang.String getButtonType();
	
	
	/**
	 * 获取按钮宽度
	 * @return
	 */
	double getButtonWidth();
	
	
	/**
	 * 获取图标对齐
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ButtonIconAlign}
	 * @return
	 */
	java.lang.String getIconAlign();
	
	
	/**
	 * 获取按钮绘制模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ButtonRenderMode}
	 * @return
	 */
	java.lang.String getRenderMode();
	
	java.lang.String getTooltip();
	
	
	/**
	 * 获取操作提示语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageRes();


	/**
	 * 获取操作提示语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageResMust();
}