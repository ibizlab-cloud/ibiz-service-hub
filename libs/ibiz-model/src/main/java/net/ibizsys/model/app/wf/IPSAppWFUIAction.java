package net.ibizsys.model.app.wf;



/**
 *
 */
public interface IPSAppWFUIAction extends net.ibizsys.model.wf.uiaction.IPSWFUIAction
		,net.ibizsys.model.app.view.IPSAppUIAction{

	
	
	/**
	 * 获取应用实体方法
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMethod getPSAppDEMethod();


	/**
	 * 获取应用实体方法，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMethod getPSAppDEMethodMust();
	
	
	/**
	 * 获取应用实体对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity();


	/**
	 * 获取应用实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust();
	
	
	/**
	 * 获取应用工作流
	 * @return
	 */
	net.ibizsys.model.app.wf.IPSAppWF getPSAppWF();


	/**
	 * 获取应用工作流，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.wf.IPSAppWF getPSAppWFMust();
	
	
	/**
	 * 获取应用工作流版本
	 * @return
	 */
	net.ibizsys.model.app.wf.IPSAppWFVer getPSAppWFVer();


	/**
	 * 获取应用工作流版本，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.wf.IPSAppWFVer getPSAppWFVerMust();
}