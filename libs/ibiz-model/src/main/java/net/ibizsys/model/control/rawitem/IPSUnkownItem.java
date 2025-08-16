package net.ibizsys.model.control.rawitem;



/**
 *
 */
public interface IPSUnkownItem extends net.ibizsys.model.control.IPSRawItemBase{

	
	
	/**
	 * 获取Html内容
	 * @return
	 */
	java.lang.String getHtmlContent();
	
	
	/**
	 * 获取图片对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取图片对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取直接内容
	 * @return
	 */
	java.lang.String getRawContent();
}