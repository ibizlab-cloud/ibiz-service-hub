package net.ibizsys.model.app.view;



/**
 * 应用实体工作流视图模型基础对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEViewBaseDTO}运行时对象
 *
 */
public interface IPSAppDEWFView extends net.ibizsys.model.app.view.IPSAppDEView{

	
	
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
	
	
	/**
	 * 获取工作流版本对象
	 * @return
	 */
	net.ibizsys.model.wf.IPSWFVersion getPSWFVersion();


	/**
	 * 获取工作流版本对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.wf.IPSWFVersion getPSWFVersionMust();
	
	
	/**
	 * 获取工作流对象
	 * @return
	 */
	net.ibizsys.model.wf.IPSWorkflow getPSWorkflow();


	/**
	 * 获取工作流对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.wf.IPSWorkflow getPSWorkflowMust();
	
	
	/**
	 * 获取是否流程交互模式
	 * @return
	 */
	boolean isWFIAMode();
}