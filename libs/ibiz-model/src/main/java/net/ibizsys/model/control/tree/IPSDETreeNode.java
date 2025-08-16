package net.ibizsys.model.control.tree;



/**
 * 实体树节点模型对象基础接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO}运行时对象
 * <P>
 * 子接口扩展识别值 {@link #getTreeNodeType}
 *
 */
public interface IPSDETreeNode extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.control.IPSControlItem
		,net.ibizsys.model.control.IPSControlXDataContainer
		,net.ibizsys.model.control.IPSControlMDataContainer
		,net.ibizsys.model.control.IPSControlObjectNavigatable{

	
	
	/**
	 * 获取访问用户模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AccessUserMode}
	 * @return
	 */
	int getAccUserMode();
	
	
	/**
	 * 获取访问标识
	 * @return
	 */
	java.lang.String getAccessKey();
	
	
	/**
	 * 获取计数器标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_COUNTERID}
	 * @return
	 */
	java.lang.String getCounterId();
	
	
	/**
	 * 获取计数器模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_COUNTERMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TreeNodeCounterMode}
	 * @return
	 */
	int getCounterMode();
	
	
	/**
	 * 获取动态样式表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_DYNACLASS}
	 * @return
	 */
	java.lang.String getDynaClass();
	
	
	/**
	 * 获取代码模型对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_MODELOBJ}
	 * @return
	 */
	java.lang.String getModelObj();
	
	
	/**
	 * 获取名称语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_NAMEPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getNamePSLanguageRes();


	/**
	 * 获取名称语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getNamePSLanguageResMust();
	
	
	/**
	 * 获取导航视图过滤项
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_NAVVIEWFILTER}
	 * @return
	 */
	java.lang.String getNavFilter();
	
	
	/**
	 * 获取导航视图对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_PSDEVIEWBASEID}
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getNavPSAppView();


	/**
	 * 获取导航视图对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getNavPSAppViewMust();
	
	
	/**
	 * 获取导航关系
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getNavPSDER();


	/**
	 * 获取导航关系，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getNavPSDERMust();
	
	
	/**
	 * 获取节点标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_NODETYPE}
	 * @return
	 */
	java.lang.String getNodeType();
	
	
	/**
	 * 获取应用实体对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_PSDEID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity();


	/**
	 * 获取应用实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust();
	
	
	/**
	 * 获取上下文菜单对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_PSDETOOLBARID}
	 * @return
	 */
	net.ibizsys.model.control.toolbar.IPSDEContextMenu getPSDEContextMenu();


	/**
	 * 获取上下文菜单对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.toolbar.IPSDEContextMenu getPSDEContextMenuMust();
	
	
	/**
	 * 获取树节点表格列集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeColumn> getPSDETreeNodeColumns();
	
	/**
	 * 获取树节点表格列集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.tree.IPSDETreeNodeColumn getPSDETreeNodeColumn(Object objKey, boolean bTryMode);
	
	/**
	 * 设置树节点表格列集合
	 * @param list 树节点表格列集合
	 */
	void setPSDETreeNodeColumns(java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeColumn> list);
	
	
	/**
	 * 获取树节点数据项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeDataItem> getPSDETreeNodeDataItems();
	
	/**
	 * 获取树节点数据项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.tree.IPSDETreeNodeDataItem getPSDETreeNodeDataItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置树节点数据项集合
	 * @param list 树节点数据项集合
	 */
	void setPSDETreeNodeDataItems(java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeDataItem> list);
	
	
	/**
	 * 获取树节点编辑项更新集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeEditItemUpdate> getPSDETreeNodeEditItemUpdates();
	
	/**
	 * 获取树节点编辑项更新集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.tree.IPSDETreeNodeEditItemUpdate getPSDETreeNodeEditItemUpdate(Object objKey, boolean bTryMode);
	
	/**
	 * 设置树节点编辑项更新集合
	 * @param list 树节点编辑项更新集合
	 */
	void setPSDETreeNodeEditItemUpdates(java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeEditItemUpdate> list);
	
	
	/**
	 * 获取树节点编辑项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeEditItem> getPSDETreeNodeEditItems();
	
	/**
	 * 获取树节点编辑项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.tree.IPSDETreeNodeEditItem getPSDETreeNodeEditItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置树节点编辑项集合
	 * @param list 树节点编辑项集合
	 */
	void setPSDETreeNodeEditItems(java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeEditItem> list);
	
	
	/**
	 * 获取树节点引用视图集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeRV> getPSDETreeNodeRVs();
	
	/**
	 * 获取树节点引用视图集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.tree.IPSDETreeNodeRV getPSDETreeNodeRV(Object objKey, boolean bTryMode);
	
	/**
	 * 设置树节点引用视图集合
	 * @param list 树节点引用视图集合
	 */
	void setPSDETreeNodeRVs(java.util.List<net.ibizsys.model.control.tree.IPSDETreeNodeRV> list);
	
	
	/**
	 * 获取节点界面样式表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_PSSYSCSSID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCss();


	/**
	 * 获取节点界面样式表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCssMust();
	
	
	/**
	 * 获取节点图标对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_PSSYSIMAGEID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取节点图标对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取前端绘制插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin();


	/**
	 * 获取前端绘制插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust();
	
	
	/**
	 * 获取图形动态样式表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_SHAPEDYNACLASS}
	 * @return
	 */
	java.lang.String getShapeDynaClass();
	
	
	/**
	 * 获取图形界面样式表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_SHAPEPSSYSCSSID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getShapePSSysCss();


	/**
	 * 获取图形界面样式表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getShapePSSysCssMust();
	
	
	/**
	 * 获取节点类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_TREENODETYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TreeNodeType}
	 * @return
	 */
	java.lang.String getTreeNodeType();
	
	
	/**
	 * 获取是否有子节点，计算是否存在父节点关系
	 * @return
	 */
	boolean hasPSDETreeNodeRSs();
	
	
	/**
	 * 获取是否允许拖到节点
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_EDITMODE}
	 * @return
	 */
	boolean isAllowDrag();
	
	
	/**
	 * 获取是否允许拖入节点
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_EDITMODE}
	 * @return
	 */
	boolean isAllowDrop();
	
	
	/**
	 * 获取是否允许编辑节点文本
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_EDITMODE}
	 * @return
	 */
	boolean isAllowEditText();
	
	
	/**
	 * 获取是否允许节点排序
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_EDITMODE}
	 * @return
	 */
	boolean isAllowOrder();
	
	
	/**
	 * 获取是否附加父节点标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_APPENDPNODEID}
	 * @return
	 */
	boolean isAppendPNodeId();
	
	
	/**
	 * 获取是否禁止选择
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_DISABLESELECT}
	 * @return
	 */
	boolean isDisableSelect();
	
	
	/**
	 * 获取是否支持选中
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_ENABLECHECK}
	 * @return
	 */
	boolean isEnableCheck();
	
	
	/**
	 * 获取是否支持快速搜索
	 * @return
	 */
	boolean isEnableQuickSearch();
	
	
	/**
	 * 获取是否支持行编辑
	 * @return
	 */
	boolean isEnableRowEdit();
	
	
	/**
	 * 获取是否行编辑仅提交变化值
	 * @return
	 */
	boolean isEnableRowEditChangedOnly();
	
	
	/**
	 * 获取是否仅展开首节点
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_SELECTED}
	 * @return
	 */
	boolean isExpandFirstOnly();
	
	
	/**
	 * 获取是否默认展开
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_EXPAND}
	 * @return
	 */
	boolean isExpanded();
	
	
	/**
	 * 获取是否根节点
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_ROOTNODE}
	 * @return
	 */
	boolean isRootNode();
	
	
	/**
	 * 获取是否仅选择首节点
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_SELECTED}
	 * @return
	 */
	boolean isSelectFirstOnly();
	
	
	/**
	 * 获取是否默认选择
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDETreeNodeDTO#FIELD_SELECTED}
	 * @return
	 */
	boolean isSelected();
}