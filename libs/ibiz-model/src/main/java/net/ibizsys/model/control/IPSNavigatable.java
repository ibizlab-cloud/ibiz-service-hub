package net.ibizsys.model.control;



/**
 * 支持导航部件模型对象接口
 *
 */
public interface IPSNavigatable extends net.ibizsys.model.control.IPSNavigateParamContainer{

	
	
	/**
	 * 获取导航视图过滤项
	 * @return
	 */
	java.lang.String getNavFilter();
	
	
	/**
	 * 获取导航视图对象
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getNavPSAppView();


	/**
	 * 获取导航视图对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getNavPSAppViewMust();
	
	
	/**
	 * 获取导航关系
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getNavPSDER();


	/**
	 * 获取导航关系，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getNavPSDERMust();
	
	
	/**
	 * 获取导航视图参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getNavViewParamJO();
}