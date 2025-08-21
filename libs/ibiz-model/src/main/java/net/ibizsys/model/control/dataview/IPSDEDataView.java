package net.ibizsys.model.control.dataview;



/**
 * 实体卡片视图部件模型对象接口
 *
 */
public interface IPSDEDataView extends net.ibizsys.model.control.IPSMDAjaxControl
		,net.ibizsys.model.control.IPSControlContainer
		,net.ibizsys.model.control.IPSControlNavigatable
		,net.ibizsys.model.control.IPSMDControl2{

	
	
	/**
	 * 获取卡片栅格布局大型列宽
	 * @return
	 */
	int getCardColLG();
	
	
	/**
	 * 获取卡片栅格布局中型列宽
	 * @return
	 */
	int getCardColMD();
	
	
	/**
	 * 获取卡片栅格布局小型列宽
	 * @return
	 */
	int getCardColSM();
	
	
	/**
	 * 获取卡片栅格布局超小列宽
	 * @return
	 */
	int getCardColXS();
	
	
	/**
	 * 获取卡片高度
	 * @return
	 */
	int getCardHeight();
	
	
	/**
	 * 获取卡片宽度
	 * @return
	 */
	int getCardWidth();
	
	
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
	 * 获取分组栅格布局大型列宽
	 * @return
	 */
	int getGroupColLG();
	
	
	/**
	 * 获取分组栅格布局中型列宽
	 * @return
	 */
	int getGroupColMD();
	
	
	/**
	 * 获取分组栅格布局小型列宽
	 * @return
	 */
	int getGroupColSM();
	
	
	/**
	 * 获取分组栅格布局超小列宽
	 * @return
	 */
	int getGroupColXS();
	
	
	/**
	 * 获取分组高度
	 * @return
	 */
	int getGroupHeight();
	
	
	/**
	 * 获取分组布局
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.MDCtrlGroupLayout}
	 * @return
	 */
	java.lang.String getGroupLayout();
	
	
	/**
	 * 获取分组模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.MDCtrlGroupMode}
	 * @return
	 */
	java.lang.String getGroupMode();
	
	
	/**
	 * 获取分组移动数据行为
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getGroupMovePSControlAction();


	/**
	 * 获取分组移动数据行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getGroupMovePSControlActionMust();
	
	
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
	 * 获取分组应用实体对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getGroupPSAppDataEntity();


	/**
	 * 获取分组应用实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getGroupPSAppDataEntityMust();
	
	
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
	 * 获取分组默认界面样式
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getGroupPSSysCss();


	/**
	 * 获取分组默认界面样式，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getGroupPSSysCssMust();
	
	
	/**
	 * 获取分组绘制插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getGroupPSSysPFPlugin();


	/**
	 * 获取分组绘制插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getGroupPSSysPFPluginMust();
	
	
	/**
	 * 获取分组界面行为组
	 * @return
	 */
	net.ibizsys.model.view.IPSUIActionGroup getGroupPSUIActionGroup();


	/**
	 * 获取分组界面行为组，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.view.IPSUIActionGroup getGroupPSUIActionGroupMust();
	
	
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
	 * 获取分组宽度
	 * @return
	 */
	int getGroupWidth();
	
	
	/**
	 * 获取项布局面板
	 * @return
	 */
	net.ibizsys.model.control.panel.IPSLayoutPanel getItemPSLayoutPanel();


	/**
	 * 获取项布局面板，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.panel.IPSLayoutPanel getItemPSLayoutPanelMust();
	
	
	/**
	 * 获取项默认界面样式
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getItemPSSysCss();


	/**
	 * 获取项默认界面样式，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getItemPSSysCssMust();
	
	
	/**
	 * 获取项绘制插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getItemPSSysPFPlugin();


	/**
	 * 获取项绘制插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getItemPSSysPFPluginMust();
	
	
	/**
	 * 获取默认排序方向
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SortDir}
	 * @return
	 */
	java.lang.String getMinorSortDir();
	
	
	/**
	 * 获取默认排序应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getMinorSortPSAppDEField();


	/**
	 * 获取默认排序应用实体属性，不存在时抛出异常
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
	 * 获取数据项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.dataview.IPSDEDataViewDataItem> getPSDEDataViewDataItems();
	
	/**
	 * 获取数据项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.dataview.IPSDEDataViewDataItem getPSDEDataViewDataItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置数据项集合
	 * @param list 数据项集合
	 */
	void setPSDEDataViewDataItems(java.util.List<net.ibizsys.model.control.dataview.IPSDEDataViewDataItem> list);
	
	
	/**
	 * 获取卡片视图项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.dataview.IPSDEDataViewItem> getPSDEDataViewItems();
	
	/**
	 * 获取卡片视图项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.dataview.IPSDEDataViewItem getPSDEDataViewItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置卡片视图项集合
	 * @param list 卡片视图项集合
	 */
	void setPSDEDataViewItems(java.util.List<net.ibizsys.model.control.dataview.IPSDEDataViewItem> list);
	
	
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
	 * 获取泳道应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getSwimlanePSAppDEField();


	/**
	 * 获取泳道应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getSwimlanePSAppDEFieldMust();
	
	
	/**
	 * 获取泳道代码表
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getSwimlanePSCodeList();


	/**
	 * 获取泳道代码表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getSwimlanePSCodeListMust();
	
	
	/**
	 * 获取是否附加实体默认数据项
	 * @return
	 */
	boolean isAppendDEItems();
	
	
	/**
	 * 获取是否支持卡片编辑
	 * @return
	 */
	boolean isEnableCardEdit();
	
	
	/**
	 * 获取是否支持卡片分组调整
	 * @return
	 */
	boolean isEnableCardEditGroup();
	
	
	/**
	 * 获取是否支持卡片次序调整
	 * @return
	 */
	boolean isEnableCardEditOrder();
	
	
	/**
	 * 获取是否支持卡片新建
	 * @return
	 */
	boolean isEnableCardNew();
	
	
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
	 * 获取是否默认禁用排序
	 * @return
	 */
	boolean isNoSort();
	
	
	/**
	 * 获取是否单项选择，由视图部件参数传入{@link net.ibizsys.centralstudio.dto.PSDEViewCtrlDTO#FIELD_MULTISELECT}
	 * @return
	 */
	boolean isSingleSelect();
}