package net.ibizsys.model.control.calendar;



/**
 * 系统日历部件项模型对象接口
 *
 */
public interface IPSSysCalendarItem extends net.ibizsys.model.control.calendar.IPSDECalendarItem{

	
	
	/**
	 * 获取背景颜色应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getBKColorPSAppDEField();


	/**
	 * 获取背景颜色应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getBKColorPSAppDEFieldMust();
	
	
	/**
	 * 获取开始时间应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getBeginTimePSAppDEField();


	/**
	 * 获取开始时间应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getBeginTimePSAppDEFieldMust();
	
	
	/**
	 * 获取项样式表值应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getClsPSAppDEField();


	/**
	 * 获取项样式表值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getClsPSAppDEFieldMust();
	
	
	/**
	 * 获取文本颜色应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getColorPSAppDEField();


	/**
	 * 获取文本颜色应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getColorPSAppDEFieldMust();
	
	
	/**
	 * 获取内容应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getContentPSAppDEField();


	/**
	 * 获取内容应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getContentPSAppDEFieldMust();
	
	
	/**
	 * 获取建立数据应用实体行为
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getCreatePSAppDEAction();


	/**
	 * 获取建立数据应用实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getCreatePSAppDEActionMust();
	
	
	/**
	 * 获取建立要求操作标识
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getCreatePSDEOPPriv();


	/**
	 * 获取建立要求操作标识，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getCreatePSDEOPPrivMust();
	
	
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
	 * 获取日历项默认行为，取出上下文菜单{@link #getPSDEContextMenu}中首个行为级别{@link net.ibizsys.model.control.toolbar.IPSDECMUIActionItem#getActionLevel}为[{@link net.ibizsys.model.PSModelEnums.UIActionLevel#OFTEN}]的行为项
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppViewUIAction getDefaultPSUIAction();


	/**
	 * 获取日历项默认行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppViewUIAction getDefaultPSUIActionMust();
	
	
	/**
	 * 获取结束时间应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getEndTimePSAppDEField();


	/**
	 * 获取结束时间应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getEndTimePSAppDEFieldMust();
	
	
	/**
	 * 获取项图标值应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getIconPSAppDEField();


	/**
	 * 获取项图标值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getIconPSAppDEFieldMust();
	
	
	/**
	 * 获取项标识值应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getIdPSAppDEField();


	/**
	 * 获取项标识值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getIdPSAppDEFieldMust();
	
	
	/**
	 * 获取级别应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getLevelPSAppDEField();


	/**
	 * 获取级别应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getLevelPSAppDEFieldMust();
	
	
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
	 * 获取应用实体数据集
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet();


	/**
	 * 获取应用实体数据集，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSetMust();
	
	
	/**
	 * 获取前端模板插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin();


	/**
	 * 获取前端模板插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust();
	
	
	/**
	 * 获取日历项默认行为
	 * @return
	 */
	net.ibizsys.model.view.IPSUIAction getPSUIAction();


	/**
	 * 获取日历项默认行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.view.IPSUIAction getPSUIActionMust();
	
	
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
	 * 获取标记值2应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTag2PSAppDEField();


	/**
	 * 获取标记值2应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTag2PSAppDEFieldMust();
	
	
	/**
	 * 获取标记值应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTagPSAppDEField();


	/**
	 * 获取标记值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTagPSAppDEFieldMust();
	
	
	/**
	 * 获取项文本值应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEField();


	/**
	 * 获取项文本值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEFieldMust();
	
	
	/**
	 * 获取提示应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTipsPSAppDEField();


	/**
	 * 获取提示应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTipsPSAppDEFieldMust();
	
	
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
}