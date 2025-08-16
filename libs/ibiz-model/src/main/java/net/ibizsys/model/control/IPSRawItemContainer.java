package net.ibizsys.model.control;



/**
 * 直接内容项容器模型对象接口
 *
 */
public interface IPSRawItemContainer extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取内容类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.RawItemContentType}
	 * @return
	 */
	java.lang.String getContentType();
	
	
	/**
	 * 获取直接内容对象
	 * @return
	 */
	net.ibizsys.model.control.IPSRawItemBase getPSRawItem();


	/**
	 * 获取直接内容对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSRawItemBase getPSRawItemMust();
	
	
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