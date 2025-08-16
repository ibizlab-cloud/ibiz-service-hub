package net.ibizsys.model.wf.uiaction;



/**
 *
 */
public interface IPSWFUIAction extends net.ibizsys.model.wf.IPSWorkflowObject
		,net.ibizsys.model.view.IPSUIAction{

	
	
	/**
	 * 获取前端应用视图
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getFrontPSAppView();


	/**
	 * 获取前端应用视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getFrontPSAppViewMust();
	
	
	/**
	 * 获取是否先保存目标数据
	 * @return
	 */
	boolean isSaveTargetFirst();
}