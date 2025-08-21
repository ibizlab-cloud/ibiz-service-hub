package net.ibizsys.model.wf;



/**
 * 工作流版本模型对象接口
 *
 */
public interface IPSWFVersion extends net.ibizsys.model.wf.IPSWorkflowObject
		,net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取流程连接集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.wf.IPSWFLink> getPSWFLinks();
	
	/**
	 * 获取流程连接集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.wf.IPSWFLink getPSWFLink(Object objKey, boolean bTryMode);
	
	/**
	 * 设置流程连接集合
	 * @param list 流程连接集合
	 */
	void setPSWFLinks(java.util.List<net.ibizsys.model.wf.IPSWFLink> list);
	
	
	/**
	 * 获取流程处理集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.wf.IPSWFProcess> getPSWFProcesses();
	
	/**
	 * 获取流程处理集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.wf.IPSWFProcess getPSWFProcess(Object objKey, boolean bTryMode);
	
	/**
	 * 设置流程处理集合
	 * @param list 流程处理集合
	 */
	void setPSWFProcesses(java.util.List<net.ibizsys.model.wf.IPSWFProcess> list);
	
	
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
	 * 获取开始处理
	 * @return
	 */
	net.ibizsys.model.wf.IPSWFProcess getStartPSWFProcess();


	/**
	 * 获取开始处理，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.wf.IPSWFProcess getStartPSWFProcessMust();
	
	
	/**
	 * 获取工作流代码标识
	 * @return
	 */
	java.lang.String getWFCodeName();
	
	
	/**
	 * 获取版本
	 * @return
	 */
	int getWFVersion();
	
	
	/**
	 * 获取是否有移动端流程启动视图
	 * @return
	 */
	boolean hasMobStartView();
	
	
	/**
	 * 获取是否有流程启动视图
	 * @return
	 */
	boolean hasStartView();
	
	
	/**
	 * 获取是否启用
	 * @return
	 */
	boolean isValid();
}