package net.ibizsys.model.wf;



/**
 * 工作流交互处理连接模型对象接口
 * <P>
 * 扩展父接口类型[IAACTION]
 *
 */
public interface IPSWFInteractiveLink extends net.ibizsys.model.wf.IPSWFLink{

	
	
	/**
	 * 获取操作表单标记
	 * @return
	 */
	java.lang.String getFormCodeName();
	
	
	/**
	 * 获取操作表单名称
	 * @return
	 */
	java.lang.String getFormName();
	
	
	/**
	 * 获取源流程处理
	 * @return
	 */
	net.ibizsys.model.wf.IPSWFInteractiveProcess getFromPSWFProcess();


	/**
	 * 获取源流程处理，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.wf.IPSWFInteractiveProcess getFromPSWFProcessMust();
	
	
	/**
	 * 获取移动端操作表单标记
	 * @return
	 */
	java.lang.String getMobFormCodeName();
	
	
	/**
	 * 获取移动端操作表单名称
	 * @return
	 */
	java.lang.String getMobFormName();
	
	
	/**
	 * 获取移动端操作视图标记
	 * @return
	 */
	java.lang.String getMobViewCodeName();
	
	
	/**
	 * 获取移动端操作视图名称
	 * @return
	 */
	java.lang.String getMobViewName();
	
	
	/**
	 * 获取操作角色集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.wf.IPSWFLinkRole> getPSWFLinkRoles();
	
	/**
	 * 获取操作角色集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.wf.IPSWFLinkRole getPSWFLinkRole(Object objKey, boolean bTryMode);
	
	/**
	 * 设置操作角色集合
	 * @param list 操作角色集合
	 */
	void setPSWFLinkRoles(java.util.List<net.ibizsys.model.wf.IPSWFLinkRole> list);
	
	
	/**
	 * 获取操作视图标记
	 * @return
	 */
	java.lang.String getViewCodeName();
	
	
	/**
	 * 获取操作视图名称
	 * @return
	 */
	java.lang.String getViewName();
}