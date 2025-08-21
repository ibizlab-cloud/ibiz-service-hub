package net.ibizsys.model.control;



/**
 * 界面部件直接内容成员模型基础对象接口
 *
 */
public interface IPSRawItemBase extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取内容类型
	 * @return
	 */
	java.lang.String getContentType();
	
	
	/**
	 * 获取直接Css样式
	 * @return
	 */
	java.lang.String getCssStyle();
	
	
	/**
	 * 获取动态样式表
	 * @return
	 */
	java.lang.String getDynaClass();
	
	
	/**
	 * 获取部件注入属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.IPSControlAttribute> getPSControlAttributes();
	
	/**
	 * 获取部件注入属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.IPSControlAttribute getPSControlAttribute(Object objKey, boolean bTryMode);
	
	/**
	 * 设置部件注入属性集合
	 * @param list 部件注入属性集合
	 */
	void setPSControlAttributes(java.util.List<net.ibizsys.model.control.IPSControlAttribute> list);
	
	
	/**
	 * 获取部件逻辑集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.IPSControlLogic> getPSControlLogics();
	
	/**
	 * 获取部件逻辑集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.IPSControlLogic getPSControlLogic(Object objKey, boolean bTryMode);
	
	/**
	 * 设置部件逻辑集合
	 * @param list 部件逻辑集合
	 */
	void setPSControlLogics(java.util.List<net.ibizsys.model.control.IPSControlLogic> list);
	
	
	/**
	 * 获取部件绘制器集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.IPSControlRender> getPSControlRenders();
	
	/**
	 * 获取部件绘制器集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.IPSControlRender getPSControlRender(Object objKey, boolean bTryMode);
	
	/**
	 * 设置部件绘制器集合
	 * @param list 部件绘制器集合
	 */
	void setPSControlRenders(java.util.List<net.ibizsys.model.control.IPSControlRender> list);
	
	
	/**
	 * 获取直接内容项参数集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.IPSRawItemParam> getPSRawItemParams();
	
	/**
	 * 获取直接内容项参数集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.IPSRawItemParam getPSRawItemParam(Object objKey, boolean bTryMode);
	
	/**
	 * 设置直接内容项参数集合
	 * @param list 直接内容项参数集合
	 */
	void setPSRawItemParams(java.util.List<net.ibizsys.model.control.IPSRawItemParam> list);
	
	
	/**
	 * 获取系统样式表
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCss();


	/**
	 * 获取系统样式表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCssMust();
	
	
	/**
	 * 获取预置类型
	 * @return
	 */
	java.lang.String getPredefinedType();
	
	
	/**
	 * 获取内容高度
	 * @return
	 */
	double getRawItemHeight();
	
	
	/**
	 * 获取内容宽度
	 * @return
	 */
	double getRawItemWidth();
	
	
	/**
	 * 获取操作提示信息
	 * @return
	 */
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
	
	
	/**
	 * 获取是否模板模式
	 * @return
	 */
	boolean isTemplateMode();
}