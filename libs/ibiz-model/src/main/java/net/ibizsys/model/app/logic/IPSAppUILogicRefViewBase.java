package net.ibizsys.model.app.logic;



/**
 * 应用全局界面逻辑引用视图模型基础对象接口
 *
 */
public interface IPSAppUILogicRefViewBase extends net.ibizsys.model.control.IPSNavigateParamContainer
		,net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取视图打开模式
	 * @return
	 */
	java.lang.String getOpenMode();
	
	
	/**
	 * 获取引用模式
	 * @return
	 */
	java.lang.String getRefMode();
	
	
	/**
	 * 获取实际引用视图
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getRefPSAppView();


	/**
	 * 获取实际引用视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getRefPSAppViewMust();
}