package net.ibizsys.model.app;



/**
 * 应用功能页模型对象接口
 *
 */
public interface IPSAppUtilPage extends net.ibizsys.model.app.IPSApplicationObject{

	
	
	/**
	 * 获取目标应用视图
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getPSAppView();


	/**
	 * 获取目标应用视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getPSAppViewMust();
	
	
	/**
	 * 获取页面路径
	 * @return
	 */
	java.lang.String getPageUrl();
	
	
	/**
	 * 获取目标类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AppUtilPageTargetType}
	 * @return
	 */
	java.lang.String getTargetType();
	
	
	/**
	 * 获取动态功能参数集合
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getUtilParams();
	
	
	/**
	 * 获取功能标记
	 * @return
	 */
	java.lang.String getUtilTag();
	
	
	/**
	 * 获取功能类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AppUtilPage}
	 * @return
	 */
	java.lang.String getUtilType();
}