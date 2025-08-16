package net.ibizsys.model.control.captionbar;



/**
 * 标题栏模型基础对象接口
 *
 */
public interface IPSCaptionBar extends net.ibizsys.model.control.IPSControl{

	
	
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
	 * 获取子标题语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getSubCapPSLanguageRes();


	/**
	 * 获取子标题语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getSubCapPSLanguageResMust();
	
	
	/**
	 * 获取视图子标题
	 * @return
	 */
	java.lang.String getSubCaption();
}