package net.ibizsys.model.control.tree;



/**
 * 实体树节点关系模型对象接口
 *
 */
public interface IPSDETreeNodeRS extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.control.IPSNavigateParamContainer{

	
	
	/**
	 * 获取下级节点对象
	 * @return
	 */
	net.ibizsys.model.control.tree.IPSDETreeNode getChildPSDETreeNode();


	/**
	 * 获取下级节点对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.tree.IPSDETreeNode getChildPSDETreeNodeMust();
	
	
	/**
	 * 获取关系导航参数集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeRSParam> getPSDETreeNodeRSParams();
	
	/**
	 * 获取关系导航参数集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.tree.IPSDETreeNodeRSParam getPSDETreeNodeRSParam(Object objKey, boolean bTryMode);
	
	/**
	 * 设置关系导航参数集合
	 * @param list 关系导航参数集合
	 */
	void setPSDETreeNodeRSParams(java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeRSParam> list);
	
	
	/**
	 * 获取父值过滤项
	 * @return
	 */
	java.lang.String getParentFilter();
	
	
	/**
	 * 获取父关系连接属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getParentPSAppDEField();


	/**
	 * 获取父关系连接属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getParentPSAppDEFieldMust();
	
	
	/**
	 * 获取父值关系
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDER1N getParentPSDER1N();


	/**
	 * 获取父值关系，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDER1N getParentPSDER1NMust();
	
	
	/**
	 * 获取上级节点对象
	 * @return
	 */
	net.ibizsys.model.control.tree.IPSDETreeNode getParentPSDETreeNode();


	/**
	 * 获取上级节点对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.tree.IPSDETreeNode getParentPSDETreeNodeMust();
	
	
	/**
	 * 获取父值级别
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TreeNodeRSPValueLevel}
	 * @return
	 */
	int getParentValueLevel();
	
	
	/**
	 * 获取搜索模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TreeNodeRSSearchMode}
	 * @return
	 */
	int getSearchMode();
}