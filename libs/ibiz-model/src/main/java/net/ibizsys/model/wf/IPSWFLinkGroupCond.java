package net.ibizsys.model.wf;



/**
 * 工作流处理连接组合条件模型对象接口
 * <P>
 * 扩展父接口类型[GROUP]
 *
 */
public interface IPSWFLinkGroupCond extends net.ibizsys.model.wf.IPSWFLinkCond{

	
	
	/**
	 * 获取组合条件
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFLinkCondDTO#FIELD_GROUPOP}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GroupCondOP}
	 * @return
	 */
	java.lang.String getGroupOP();
	
	
	/**
	 * 获取子条件集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.wf.IPSWFLinkCond> getPSWFLinkConds();
	
	/**
	 * 获取子条件集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.wf.IPSWFLinkCond getPSWFLinkCond(Object objKey, boolean bTryMode);
	
	/**
	 * 设置子条件集合
	 * @param list 子条件集合
	 */
	void setPSWFLinkConds(java.util.List<net.ibizsys.model.wf.IPSWFLinkCond> list);
	
	
	/**
	 * 获取是否逻辑取反
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFLinkCondDTO#FIELD_GROUPNOTFLAG}
	 * @return
	 */
	boolean isNotMode();
}