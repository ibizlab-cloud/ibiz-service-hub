package net.ibizsys.model.control;



/**
 * 直接内容部件模型对象基础接口
 * <P>
 * 这个是早期的直接内容接口，只约定了直接内容的相关属性，并没有形成对象（如编辑器）。后续使用直接内容组件接口{@link IPSRawItemBase}
 *
 */
public interface IPSRawItem extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取内容类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.RawItemContentType}
	 * @return
	 */
	java.lang.String getContentType();
	
	
	/**
	 * 获取Html内容
	 * @return
	 */
	java.lang.String getHtmlContent();
	
	
	/**
	 * 获取图片内容
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取图片内容，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取直接内容
	 * @return
	 */
	java.lang.String getRawContent();
	
	
	/**
	 * 获取直接项高度
	 * @return
	 */
	double getRawItemHeight();
	
	
	/**
	 * 获取直接项宽度
	 * @return
	 */
	double getRawItemWidth();
}