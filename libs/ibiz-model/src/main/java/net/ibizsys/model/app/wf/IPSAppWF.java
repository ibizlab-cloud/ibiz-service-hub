package net.ibizsys.model.app.wf;



/**
 *
 */
public interface IPSAppWF extends net.ibizsys.model.app.IPSApplicationObject{

	
	
	/**
	 * 获取工作流界面行为集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.wf.IPSAppWFUIAction> getAllPSAppWFUIActions();
	
	/**
	 * 获取工作流界面行为集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.wf.IPSAppWFUIAction getPSAppWFUIAction(Object objKey, boolean bTryMode);
	
	/**
	 * 设置工作流界面行为集合
	 * @param list 工作流界面行为集合
	 */
	void setPSAppWFUIActions(java.util.List<net.ibizsys.model.app.wf.IPSAppWFUIAction> list);
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取应用工作流实体集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.wf.IPSAppWFDE> getPSAppWFDEs();
	
	/**
	 * 获取应用工作流实体集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.wf.IPSAppWFDE getPSAppWFDE(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用工作流实体集合
	 * @param list 应用工作流实体集合
	 */
	void setPSAppWFDEs(java.util.List<net.ibizsys.model.app.wf.IPSAppWFDE> list);
	
	
	/**
	 * 获取应用工作流版本集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.wf.IPSAppWFVer> getPSAppWFVers();
	
	/**
	 * 获取应用工作流版本集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.wf.IPSAppWFVer getPSAppWFVer(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用工作流版本集合
	 * @param list 应用工作流版本集合
	 */
	void setPSAppWFVers(java.util.List<net.ibizsys.model.app.wf.IPSAppWFVer> list);
	
	
	/**
	 * 获取工作流
	 * @return
	 */
	net.ibizsys.model.wf.IPSWorkflow getPSWorkflow();


	/**
	 * 获取工作流，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.wf.IPSWorkflow getPSWorkflowMust();
	
	
	/**
	 * 获取是否有工作流版本
	 * @return
	 */
	boolean hasPSAppWFVer();
}