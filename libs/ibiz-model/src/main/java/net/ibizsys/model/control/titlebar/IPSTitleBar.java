package net.ibizsys.model.control.titlebar;



/**
 * 标题栏部件模型对象基础接口
 *
 */
public interface IPSTitleBar extends net.ibizsys.model.control.IPSControl{

	
	
	/**
	 * 获取标题语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageRes();


	/**
	 * 获取标题语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageResMust();
	
	
	/**
	 * 获取标题
	 * @return
	 */
	java.lang.String getCaption();
	
	
	/**
	 * 获取图标资源
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取图标资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取标题栏样式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TitleBarStyle}
	 * @return
	 */
	java.lang.String getTitleBarStyle();
	
	
	/**
	 * 获取标题栏类型
	 * @return
	 */
	java.lang.String getTitleBarType();
}