package net.ibizsys.model.control.list;



/**
 * 实体列表部件模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEListDTO}运行时对象
 *
 */
public interface IPSDEList extends net.ibizsys.model.control.list.IPSList
		,net.ibizsys.model.control.IPSMDControl2{

	
	
	/**
	 * 获取分组模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEListDTO#FIELD_GROUPMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.MDCtrlGroupMode}
	 * @return
	 */
	java.lang.String getGroupMode();
	
	
	/**
	 * 获取分组应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEListDTO#FIELD_GROUPPSDEFID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEListDTO#FIELD_GROUPPSCODELISTID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEListDTO#FIELD_GROUPPSSYSCSSID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEListDTO#FIELD_GROUPPSDEUAGROUPID}
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
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEListDTO#FIELD_GROUPSTYLE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CtrlGroupStyle}
	 * @return
	 */
	java.lang.String getGroupStyle();
	
	
	/**
	 * 获取分组应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEListDTO#FIELD_GROUPTEXTPSDEFID}
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
	 * 获取默认排序方向
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEListDTO#FIELD_MINORSORTDIR}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SortDir}
	 * @return
	 */
	java.lang.String getMinorSortDir();
	
	
	/**
	 * 获取默认排序应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEListDTO#FIELD_MINORSORTPSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getMinorSortPSAppDEField();


	/**
	 * 获取默认排序应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getMinorSortPSAppDEFieldMust();
	
	
	/**
	 * 获取移动端列表样式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEListDTO#FIELD_MOBLISTSTYLE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.MobMDCtrlType}
	 * @return
	 */
	java.lang.String getMobListStyle();
	
	
	/**
	 * 获取列表数据项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.list.IPSDEListDataItem> getPSDEListDataItems();
	
	/**
	 * 获取列表数据项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.list.IPSDEListDataItem getPSDEListDataItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置列表数据项集合
	 * @param list 列表数据项集合
	 */
	void setPSDEListDataItems(java.util.List<net.ibizsys.model.control.list.IPSDEListDataItem> list);
	
	
	/**
	 * 获取列表项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.list.IPSDEListItem> getPSDEListItems();
	
	/**
	 * 获取列表项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.list.IPSDEListItem getPSDEListItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置列表项集合
	 * @param list 列表项集合
	 */
	void setPSDEListItems(java.util.List<net.ibizsys.model.control.list.IPSDEListItem> list);
	
	
	/**
	 * 获取分页模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.PagingMode}
	 * @return
	 */
	int getPagingMode();
	
	
	/**
	 * 获取分页大小
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEListDTO#FIELD_PAGESIZE}
	 * @return
	 */
	int getPagingSize();
	
	
	/**
	 * 获取是否启用分组，计算{@link #getGroupMode}返回不等于(NONE)
	 * @return
	 */
	boolean isEnableGroup();
	
	
	/**
	 * 获取是否支持分页栏
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEListDTO#FIELD_ENABLEPAGINGBAR}
	 * @return
	 */
	boolean isEnablePagingBar();
	
	
	/**
	 * 获取是否支持行编辑
	 * @return
	 */
	boolean isEnableRowEdit();
	
	
	/**
	 * 获取是否支持行分组调整
	 * @return
	 */
	boolean isEnableRowEditGroup();
	
	
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
	 * 获取是否默认禁用排序
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEListDTO#FIELD_NOSORT}
	 * @return
	 */
	boolean isNoSort();
	
	
	/**
	 * 获取是否显示头部
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEListDTO#FIELD_SHOWHEADER}
	 * @return
	 */
	boolean isShowHeader();
	
	
	/**
	 * 获取是否单项选择，由视图部件参数传入{@link net.ibizsys.centralstudio.dto.PSDEViewCtrlDTO#FIELD_MULTISELECT}
	 * @return
	 */
	boolean isSingleSelect();
}