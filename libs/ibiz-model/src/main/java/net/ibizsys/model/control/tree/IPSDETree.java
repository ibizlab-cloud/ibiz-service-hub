package net.ibizsys.model.control.tree;



/**
 * 实体树视图部件模型对象接口
 *
 */
public interface IPSDETree extends net.ibizsys.model.control.IPSMDAjaxControl
		,net.ibizsys.model.control.IPSControlContainer
		,net.ibizsys.model.control.IPSControlNavigatable{

	
	
	/**
	 * 获取无值显示内容
	 * @return
	 */
	java.lang.String getEmptyText();
	
	
	/**
	 * 获取无值内容语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getEmptyTextPSLanguageRes();


	/**
	 * 获取无值内容语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getEmptyTextPSLanguageResMust();
	
	
	/**
	 * 获取固定起始列数
	 * @return
	 */
	int getFrozenFirstColumn();
	
	
	/**
	 * 获取固定末尾列数
	 * @return
	 */
	int getFrozenLastColumn();
	
	
	/**
	 * 获取应用计数器引用
	 * @return
	 */
	net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRef();


	/**
	 * 获取应用计数器引用，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRefMust();
	
	
	/**
	 * 获取树表格列集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.tree.IPSDETreeColumn> getPSDETreeColumns();
	
	/**
	 * 获取树表格列集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.tree.IPSDETreeColumn getPSDETreeColumn(Object objKey, boolean bTryMode);
	
	/**
	 * 设置树表格列集合
	 * @param list 树表格列集合
	 */
	void setPSDETreeColumns(java.util.List<net.ibizsys.model.control.tree.IPSDETreeColumn> list);
	
	
	/**
	 * 获取树节点关系集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeRS> getPSDETreeNodeRSs();
	
	/**
	 * 获取树节点关系集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.tree.IPSDETreeNodeRS getPSDETreeNodeRS(Object objKey, boolean bTryMode);
	
	/**
	 * 设置树节点关系集合
	 * @param list 树节点关系集合
	 */
	void setPSDETreeNodeRs(java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeRS> list);
	
	
	/**
	 * 获取树节点集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.tree.IPSDETreeNode> getPSDETreeNodes();
	
	/**
	 * 获取树节点集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.tree.IPSDETreeNode getPSDETreeNode(Object objKey, boolean bTryMode);
	
	/**
	 * 设置树节点集合
	 * @param list 树节点集合
	 */
	void setPSDETreeNodes(java.util.List<net.ibizsys.model.control.tree.IPSDETreeNode> list);
	
	
	/**
	 * 获取树表格模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TreeGridMode}
	 * @return
	 */
	int getTreeGridMode();
	
	
	/**
	 * 获取树视图样式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TreeStyle}
	 * @return
	 */
	java.lang.String getTreeStyle();
	
	
	/**
	 * 获取是否支持编辑
	 * @return
	 */
	boolean isEnableEdit();
	
	
	/**
	 * 获取是否支持根选择
	 * @return
	 */
	boolean isEnableRootSelect();
	
	
	/**
	 * 获取是否默认输出图标
	 * @return
	 */
	boolean isOutputIconDefault();
	
	
	/**
	 * 获取是否显示根
	 * @return
	 */
	boolean isRootVisible();
}