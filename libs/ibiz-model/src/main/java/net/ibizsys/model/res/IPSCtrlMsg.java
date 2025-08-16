package net.ibizsys.model.res;



/**
 *
 */
public interface IPSCtrlMsg extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取消息配置
	 * @return
	 */
	java.lang.String getMsgModel();
	
	
	/**
	 * 获取部件消息项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.res.IPSCtrlMsgItem> getPSCtrlMsgItems();
	
	/**
	 * 获取部件消息项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.res.IPSCtrlMsgItem getPSCtrlMsgItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置部件消息项集合
	 * @param list 部件消息项集合
	 */
	void setPSCtrlMsgItems(java.util.List<net.ibizsys.model.res.IPSCtrlMsgItem> list);
}