package net.ibizsys.model.control;



/**
 * 界面部件成员项参数对象接口
 *
 */
public interface IPSControlItemParam extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取标题
	 * @return
	 */
	java.lang.String getCaption();
	
	
	/**
	 * 获取参数
	 * @return
	 */
	java.lang.String getKey();
	
	
	/**
	 * 获取系统图片
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取系统图片，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取调用界面行为
	 * @return
	 */
	net.ibizsys.model.view.IPSUIAction getPSUIAction();


	/**
	 * 获取调用界面行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.view.IPSUIAction getPSUIActionMust();
	
	
	/**
	 * 获取提示信息
	 * @return
	 */
	java.lang.String getTooltip();
	
	
	/**
	 * 获取内容
	 * @return
	 */
	java.lang.String getValue();
}