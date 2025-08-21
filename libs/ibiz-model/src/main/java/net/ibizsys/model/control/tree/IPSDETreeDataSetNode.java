package net.ibizsys.model.control.tree;



/**
 * 实体树视图实体数据集节点模型对象接口
 * <P>
 * 扩展父接口类型[DE]
 *
 */
public interface IPSDETreeDataSetNode extends net.ibizsys.model.control.tree.IPSDETreeNode
		,net.ibizsys.model.control.IPSControlMDObject{

	
	
	/**
	 * 获取节点计数值应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getChildCntPSAppDEField();


	/**
	 * 获取节点计数值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getChildCntPSAppDEFieldMust();
	
	
	/**
	 * 获取节点样式表值应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getClsPSAppDEField();


	/**
	 * 获取节点样式表值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getClsPSAppDEFieldMust();
	
	
	/**
	 * 获取附加查询条件
	 * @return
	 */
	java.lang.String getCustomCond();
	
	
	/**
	 * 获取数据值2应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getData2PSAppDEField();


	/**
	 * 获取数据值2应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getData2PSAppDEFieldMust();
	
	
	/**
	 * 获取数据对象名称
	 * @return
	 */
	java.lang.String getDataName();
	
	
	/**
	 * 获取数据值应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getDataPSAppDEField();


	/**
	 * 获取数据值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getDataPSAppDEFieldMust();
	
	
	/**
	 * 获取数据源类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DETreeNodeSource}
	 * @return
	 */
	java.lang.String getDataSourceType();
	
	
	/**
	 * 获取过滤应用实体结果集对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getFilterPSAppDEDataSet();


	/**
	 * 获取过滤应用实体结果集对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getFilterPSAppDEDataSetMust();
	
	
	/**
	 * 获取节点图标值应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getIconPSAppDEField();


	/**
	 * 获取节点图标值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getIconPSAppDEFieldMust();
	
	
	/**
	 * 获取节点标识值应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getIdPSAppDEField();


	/**
	 * 获取节点标识值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getIdPSAppDEFieldMust();
	
	
	/**
	 * 获取叶节点标识值应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getLeafFlagPSAppDEField();


	/**
	 * 获取叶节点标识值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getLeafFlagPSAppDEFieldMust();
	
	
	/**
	 * 获取链接值应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getLinkPSAppDEField();


	/**
	 * 获取链接值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getLinkPSAppDEFieldMust();
	
	
	/**
	 * 获取最大加载节点数
	 * @return
	 */
	int getMaxSize();
	
	
	/**
	 * 获取移动数据访问行为
	 * @return
	 */
	java.lang.String getMoveDataAccessAction();
	
	
	/**
	 * 获取移动数据应用实体行为
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getMovePSAppDEAction();


	/**
	 * 获取移动数据应用实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getMovePSAppDEActionMust();
	
	
	/**
	 * 获取移动要求操作标识
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getMovePSDEOPPriv();


	/**
	 * 获取移动要求操作标识，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getMovePSDEOPPrivMust();
	
	
	/**
	 * 获取应用实体行为对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getPSAppDEAction();


	/**
	 * 获取应用实体行为对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getPSAppDEActionMust();
	
	
	/**
	 * 获取应用实体结果集对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet();


	/**
	 * 获取应用实体结果集对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSetMust();
	
	
	/**
	 * 获取应用实体逻辑对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDELogic getPSAppDELogic();


	/**
	 * 获取应用实体逻辑对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDELogic getPSAppDELogicMust();
	
	
	/**
	 * 获取分页大小
	 * @return
	 */
	int getPagingSize();
	
	
	/**
	 * 获取删除数据访问行为
	 * @return
	 */
	java.lang.String getRemoveDataAccessAction();
	
	
	/**
	 * 获取删除数据应用实体行为
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getRemovePSAppDEAction();


	/**
	 * 获取删除数据应用实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getRemovePSAppDEActionMust();
	
	
	/**
	 * 获取删除要求操作标识
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getRemovePSDEOPPriv();


	/**
	 * 获取删除要求操作标识，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getRemovePSDEOPPrivMust();
	
	
	/**
	 * 获取脚本代码
	 * @return
	 */
	java.lang.String getScriptCode();
	
	
	/**
	 * 获取图形样式应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getShapeClsPSAppDEField();


	/**
	 * 获取图形样式应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getShapeClsPSAppDEFieldMust();
	
	
	/**
	 * 获取节点排序方向
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TreeNodeSortDir}
	 * @return
	 */
	java.lang.String getSortDir();
	
	
	/**
	 * 获取节点排序值应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getSortPSAppDEField();


	/**
	 * 获取节点排序值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getSortPSAppDEFieldMust();
	
	
	/**
	 * 获取节点文本格式化
	 * @return
	 */
	java.lang.String getTextFormat();
	
	
	/**
	 * 获取节点文本值属性对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEField();


	/**
	 * 获取节点文本值属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEFieldMust();
	
	
	/**
	 * 获取节点提示值应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTipsPSAppDEField();


	/**
	 * 获取节点提示值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTipsPSAppDEFieldMust();
	
	
	/**
	 * 获取更新数据访问行为
	 * @return
	 */
	java.lang.String getUpdateDataAccessAction();
	
	
	/**
	 * 获取更新数据应用实体行为
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getUpdatePSAppDEAction();


	/**
	 * 获取更新数据应用实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getUpdatePSAppDEActionMust();
	
	
	/**
	 * 获取更新要求操作标识
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getUpdatePSDEOPPriv();


	/**
	 * 获取更新要求操作标识，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getUpdatePSDEOPPrivMust();
	
	
	/**
	 * 获取是否附加节点标题
	 * @return
	 */
	boolean isAppendCaption();
	
	
	/**
	 * 获取是否数据排重模式
	 * @return
	 */
	boolean isDistinctMode();
	
	
	/**
	 * 获取是否支持分页
	 * @return
	 */
	boolean isEnablePaging();
}