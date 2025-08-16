package net.ibizsys.model.wf;



/**
 * 工作流嵌入流程处理模型对象接口
 * <P>
 * 扩展父接口类型[EMBED]
 *
 */
public interface IPSWFEmbedWFProcess extends net.ibizsys.model.wf.IPSWFEmbedWFProcessBase{

	
	
	/**
	 * 获取组织角色集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.wf.IPSWFProcessRole> getPSWFProcessRoles();
	
	/**
	 * 获取组织角色集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.wf.IPSWFProcessRole getPSWFProcessRole(Object objKey, boolean bTryMode);
	
	/**
	 * 设置组织角色集合
	 * @param list 组织角色集合
	 */
	void setPSWFProcessRoles(java.util.List<net.ibizsys.model.wf.IPSWFProcessRole> list);
}