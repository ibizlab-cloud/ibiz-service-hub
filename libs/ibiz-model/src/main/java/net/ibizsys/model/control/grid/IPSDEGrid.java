package net.ibizsys.model.control.grid;



/**
 * 实体表格部件模型对象接口
 *
 */
public interface IPSDEGrid extends net.ibizsys.model.control.IPSMDAjaxControl
		,net.ibizsys.model.control.IPSControlContainer
		,net.ibizsys.model.control.IPSControlNavigatable
		,net.ibizsys.model.control.IPSMDControl2{

	
	
	/**
	 * 获取表格聚合模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GridAggMode}
	 * @return
	 */
	java.lang.String getAggMode();
	
	
	/**
	 * 获取聚合服务应用实体数据集
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getAggPSAppDEDataSet();


	/**
	 * 获取聚合服务应用实体数据集，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getAggPSAppDEDataSetMust();
	
	
	/**
	 * 获取聚合服务应用实体对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getAggPSAppDataEntity();


	/**
	 * 获取聚合服务应用实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getAggPSAppDataEntityMust();
	
	
	/**
	 * 获取聚合数据布局面板
	 * @return
	 */
	net.ibizsys.model.control.panel.IPSLayoutPanel getAggPSLayoutPanel();


	/**
	 * 获取聚合数据布局面板，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.panel.IPSLayoutPanel getAggPSLayoutPanelMust();
	
	
	/**
	 * 获取列过滤器模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEGridColLinkMode}
	 * @return
	 */
	int getColumnEnableFilter();
	
	
	/**
	 * 获取列链接模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEGridColLinkMode}
	 * @return
	 */
	int getColumnEnableLink();
	
	
	/**
	 * 获取建立数据行为
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getCreatePSControlAction();


	/**
	 * 获取建立数据行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getCreatePSControlActionMust();
	
	
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
	 * 获取获取草稿数据行为（拷贝）
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getGetDraftFromPSControlAction();


	/**
	 * 获取获取草稿数据行为（拷贝），不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getGetDraftFromPSControlActionMust();
	
	
	/**
	 * 获取获取草稿数据行为
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getGetDraftPSControlAction();


	/**
	 * 获取获取草稿数据行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getGetDraftPSControlActionMust();
	
	
	/**
	 * 获取获取数据行为
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getGetPSControlAction();


	/**
	 * 获取获取数据行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getGetPSControlActionMust();
	
	
	/**
	 * 获取表格样式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.GridStyle}
	 * @return
	 */
	java.lang.String getGridStyle();
	
	
	/**
	 * 获取分组模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.MDCtrlGroupMode}
	 * @return
	 */
	java.lang.String getGroupMode();
	
	
	/**
	 * 获取分组应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getGroupPSAppDEField();


	/**
	 * 获取分组应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getGroupPSAppDEFieldMust();
	
	
	/**
	 * 获取分组代码表
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getGroupPSCodeList();


	/**
	 * 获取分组代码表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getGroupPSCodeListMust();
	
	
	/**
	 * 获取分组实体属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getGroupPSDEField();


	/**
	 * 获取分组实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getGroupPSDEFieldMust();
	
	
	/**
	 * 获取分组样式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CtrlGroupStyle}
	 * @return
	 */
	java.lang.String getGroupStyle();
	
	
	/**
	 * 获取分组应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getGroupTextPSAppDEField();


	/**
	 * 获取分组应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getGroupTextPSAppDEFieldMust();
	
	
	/**
	 * 获取分组文本实体属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getGroupTextPSDEField();


	/**
	 * 获取分组文本实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getGroupTextPSDEFieldMust();
	
	
	/**
	 * 获取附加排序方向
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SortDir}
	 * @return
	 */
	java.lang.String getMinorSortDir();
	
	
	/**
	 * 获取附加排序应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getMinorSortPSAppDEField();


	/**
	 * 获取附加排序应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getMinorSortPSAppDEFieldMust();
	
	
	/**
	 * 获取排序值应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getOrderValuePSAppDEField();


	/**
	 * 获取排序值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getOrderValuePSAppDEFieldMust();
	
	
	/**
	 * 获取表格列集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.grid.IPSDEGridColumn> getPSDEGridColumns();
	
	/**
	 * 获取表格列集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.grid.IPSDEGridColumn getPSDEGridColumn(Object objKey, boolean bTryMode);
	
	/**
	 * 设置表格列集合
	 * @param list 表格列集合
	 */
	void setPSDEGridColumns(java.util.List<net.ibizsys.model.control.grid.IPSDEGridColumn> list);
	
	
	/**
	 * 获取表格数据项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.grid.IPSDEGridDataItem> getPSDEGridDataItems();
	
	/**
	 * 获取表格数据项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.grid.IPSDEGridDataItem getPSDEGridDataItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置表格数据项集合
	 * @param list 表格数据项集合
	 */
	void setPSDEGridDataItems(java.util.List<net.ibizsys.model.control.grid.IPSDEGridDataItem> list);
	
	
	/**
	 * 获取表格编辑项更新集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.grid.IPSDEGridEditItemUpdate> getPSDEGridEditItemUpdates();
	
	/**
	 * 获取表格编辑项更新集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.grid.IPSDEGridEditItemUpdate getPSDEGridEditItemUpdate(Object objKey, boolean bTryMode);
	
	/**
	 * 设置表格编辑项更新集合
	 * @param list 表格编辑项更新集合
	 */
	void setPSDEGridEditItemUpdates(java.util.List<net.ibizsys.model.control.grid.IPSDEGridEditItemUpdate> list);
	
	
	/**
	 * 获取表格编辑项值规则集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.grid.IPSDEGridEditItemVR> getPSDEGridEditItemVRs();
	
	/**
	 * 获取表格编辑项值规则集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.grid.IPSDEGridEditItemVR getPSDEGridEditItemVR(Object objKey, boolean bTryMode);
	
	/**
	 * 设置表格编辑项值规则集合
	 * @param list 表格编辑项值规则集合
	 */
	void setPSDEGridEditItemVRs(java.util.List<net.ibizsys.model.control.grid.IPSDEGridEditItemVR> list);
	
	
	/**
	 * 获取表格编辑项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.grid.IPSDEGridEditItem> getPSDEGridEditItems();
	
	/**
	 * 获取表格编辑项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.grid.IPSDEGridEditItem getPSDEGridEditItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置表格编辑项集合
	 * @param list 表格编辑项集合
	 */
	void setPSDEGridEditItems(java.util.List<net.ibizsys.model.control.grid.IPSDEGridEditItem> list);
	
	
	/**
	 * 获取分页模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.PagingMode}
	 * @return
	 */
	int getPagingMode();
	
	
	/**
	 * 获取分页大小
	 * @return
	 */
	int getPagingSize();
	
	
	/**
	 * 获取删除数据行为
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getRemovePSControlAction();


	/**
	 * 获取删除数据行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getRemovePSControlActionMust();
	
	
	/**
	 * 获取排序模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SortMode}
	 * @return
	 */
	java.lang.String getSortMode();
	
	
	/**
	 * 获取更新数据行为
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getUpdatePSControlAction();


	/**
	 * 获取更新数据行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getUpdatePSControlActionMust();
	
	
	/**
	 * 获取是否启用列过滤器
	 * @return
	 */
	boolean isEnableColFilter();
	
	
	/**
	 * 获取是否支持表格定制，未定义时使用应用全局定义{@link PSSysAppDTO#FIELD_GRIDENABLECUSTOMIZED}
	 * @return
	 */
	boolean isEnableCustomized();
	
	
	/**
	 * 获取是否启用分组，计算{@link #getGroupMode}返回不等于(NONE)
	 * @return
	 */
	boolean isEnableGroup();
	
	
	/**
	 * 获取是否支持分页栏
	 * @return
	 */
	boolean isEnablePagingBar();
	
	
	/**
	 * 获取是否支持行编辑
	 * @return
	 */
	boolean isEnableRowEdit();
	
	
	/**
	 * 获取是否支持行编辑仅提交变化值
	 * @return
	 */
	boolean isEnableRowEditChangedOnly();
	
	
	/**
	 * 获取是否支持行次序调整
	 * @return
	 */
	boolean isEnableRowEditOrder();
	
	
	/**
	 * 获取是否支持行新建
	 * @return
	 */
	boolean isEnableRowNew();
	
	
	/**
	 * 获取是否适应屏幕宽度
	 * @return
	 */
	boolean isForceFit();
	
	
	/**
	 * 获取是否隐藏表格头部
	 * @return
	 */
	boolean isHideHeader();
	
	
	/**
	 * 获取是否默认禁用排序
	 * @return
	 */
	boolean isNoSort();
	
	
	/**
	 * 获取是否单项选择
	 * @return
	 */
	boolean isSingleSelect();
}