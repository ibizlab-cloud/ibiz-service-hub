package net.ibizsys.model.dataentity.logic;



/**
 * 实体主状态逻辑连接组合条件模型对象接口
 * <P>
 * 扩展父接口类型[GROUP]
 *
 */
public interface IPSDEMSLogicLinkGroupCond extends net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkCond
		,net.ibizsys.model.dataentity.logic.IPSDELogicLinkGroupCondBase{

	
	
	/**
	 * 获取子条件集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkCond> getPSDEMSLogicLinkConds();
	
	/**
	 * 获取子条件集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkCond getPSDEMSLogicLinkCond(Object objKey, boolean bTryMode);
	
	/**
	 * 设置子条件集合
	 * @param list 子条件集合
	 */
	void setPSDEMSLogicLinkConds(java.util.List<net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkCond> list);
}