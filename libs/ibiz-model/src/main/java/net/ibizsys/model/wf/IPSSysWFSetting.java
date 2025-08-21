package net.ibizsys.model.wf;



/**
 * 系统工作流设置模型对象接口
 *
 */
public interface IPSSysWFSetting extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取功能界面行为
	 * @return
	 */
	java.util.List<net.ibizsys.model.wf.IPSWFUtilUIAction> getPSWFUtilUIActions();
	
	/**
	 * 获取功能界面行为的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.wf.IPSWFUtilUIAction getPSWFUtilUIAction(Object objKey, boolean bTryMode);
	
	/**
	 * 设置功能界面行为
	 * @param list 功能界面行为
	 */
	void setPSWFUtilUIActions(java.util.List<net.ibizsys.model.wf.IPSWFUtilUIAction> list);
	
	
	/**
	 * 获取催办消息模板
	 * @return
	 */
	net.ibizsys.model.msg.IPSSysMsgTempl getRemindPSSysMsgTempl();


	/**
	 * 获取催办消息模板，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.msg.IPSSysMsgTempl getRemindPSSysMsgTemplMust();
}