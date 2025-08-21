package net.ibizsys.model.app.wf;



/**
 * 应用工作流功能界面行为模型对象接口
 *
 */
public interface IPSAppWFUtilUIAction extends net.ibizsys.model.wf.IPSWFUtilUIAction
		,net.ibizsys.model.app.IPSApplicationObject{

	
	
	/**
	 * 获取应用界面行为
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppUIAction getPSAppUIAction();


	/**
	 * 获取应用界面行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppUIAction getPSAppUIActionMust();
}