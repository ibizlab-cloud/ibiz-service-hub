package net.ibizsys.model.control;



/**
 * 图片部件模型基础对象接口
 *
 */
public interface IPSImageBase{

	
	
	/**
	 * 获取提示信息
	 * @return
	 */
	java.lang.String getAlternativeText();
	
	
	/**
	 * 获取适配模式
	 * @return
	 */
	java.lang.String getFitMode();
	
	
	/**
	 * 获取系统图片资源
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取系统图片资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取是否中间放置
	 * @return
	 */
	boolean isPlaceCenter();
}