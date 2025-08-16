package net.ibizsys.model.app.wf;



/**
 *
 */
public interface IPSAppWFVer extends net.ibizsys.model.app.IPSApplicationObject{

	
	
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
	 * 获取工作流版本
	 * @return
	 */
	net.ibizsys.model.wf.IPSWFVersion getPSWFVersion();


	/**
	 * 获取工作流版本，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.wf.IPSWFVersion getPSWFVersionMust();
}