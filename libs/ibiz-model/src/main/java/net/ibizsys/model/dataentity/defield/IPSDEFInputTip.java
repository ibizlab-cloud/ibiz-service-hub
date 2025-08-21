package net.ibizsys.model.dataentity.defield;



/**
 * 实体属性输入提示模型对象接口
 *
 */
public interface IPSDEFInputTip extends net.ibizsys.model.dataentity.defield.IPSDEFieldObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取内容
	 * @return
	 */
	java.lang.String getContent();
	
	
	/**
	 * 获取内容语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getContentPSLanguageRes();


	/**
	 * 获取内容语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getContentPSLanguageResMust();
	
	
	/**
	 * 获取Html内容
	 * @return
	 */
	java.lang.String getHtmlContent();
	
	
	/**
	 * 获取直接内容
	 * @return
	 */
	java.lang.String getRawContent();
	
	
	/**
	 * 获取提示模式
	 * @return
	 */
	java.lang.String getTipMode();
	
	
	/**
	 * 获取唯一标记
	 * @return
	 */
	java.lang.String getUniqueTag();
	
	
	/**
	 * 获取是否属性默认输入提示
	 * @return
	 */
	boolean isDefault();
}