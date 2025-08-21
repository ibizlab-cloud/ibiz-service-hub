package net.ibizsys.model.wf;



/**
 * 工作流处理连接角色模型对象接口
 *
 */
public interface IPSWFLinkRole extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取通知消息模板
	 * @return
	 */
	net.ibizsys.model.msg.IPSSysMsgTempl getPSSysMsgTempl();


	/**
	 * 获取通知消息模板，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.msg.IPSSysMsgTempl getPSSysMsgTemplMust();
	
	
	/**
	 * 获取流程处理角色
	 * @return
	 */
	net.ibizsys.model.wf.IPSWFProcessRole getPSWFProcessRole();


	/**
	 * 获取流程处理角色，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.wf.IPSWFProcessRole getPSWFProcessRoleMust();
}