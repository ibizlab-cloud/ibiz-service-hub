package net.ibizsys.model.app.dataentity;



/**
 * 应用实体界面行为组模型对象接口
 *
 */
public interface IPSAppDEUIActionGroup extends net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup
		,net.ibizsys.model.IPSModelSortable{

	
	
	/**
	 * 获取成员行为级别应用实体属性对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getActionLevelPSAppDEField();


	/**
	 * 获取成员行为级别应用实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getActionLevelPSAppDEFieldMust();
	
	
	/**
	 * 获取成员按钮样式应用实体属性对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getButtonStylePSAppDEField();


	/**
	 * 获取成员按钮样式应用实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getButtonStylePSAppDEFieldMust();
	
	
	/**
	 * 获取成员样式表提示应用实体属性对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getClsPSAppDEField();


	/**
	 * 获取成员样式表提示应用实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getClsPSAppDEFieldMust();
	
	
	/**
	 * 获取成员数据应用实体数据集对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getDetailPSAppDEDataSet();


	/**
	 * 获取成员数据应用实体数据集对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getDetailPSAppDEDataSetMust();
	
	
	/**
	 * 获取成员数据应用实体对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getDetailPSAppDataEntity();


	/**
	 * 获取成员数据应用实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getDetailPSAppDataEntityMust();
	
	
	/**
	 * 获取成员启用脚本应用实体属性对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getEnableScriptPSAppDEField();


	/**
	 * 获取成员启用脚本应用实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getEnableScriptPSAppDEFieldMust();
	
	
	/**
	 * 获取成员图标样式表应用实体属性对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getIconClsPSAppDEField();


	/**
	 * 获取成员图标样式表应用实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getIconClsPSAppDEFieldMust();
	
	
	/**
	 * 获取应用实体
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity();


	/**
	 * 获取应用实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust();
	
	
	/**
	 * 获取成员文本应用实体属性对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEField();


	/**
	 * 获取成员文本应用实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEFieldMust();
	
	
	/**
	 * 获取成员提示应用实体属性对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTipsPSAppDEField();


	/**
	 * 获取成员提示应用实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTipsPSAppDEFieldMust();
	
	
	/**
	 * 获取成员界面行为标记应用实体属性对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getUIActionTagPSAppDEField();


	/**
	 * 获取成员界面行为标记应用实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getUIActionTagPSAppDEFieldMust();
	
	
	/**
	 * 获取唯一标记
	 * @return
	 */
	String getUniqueTag();
	
	
	/**
	 * 获取成员显示脚本应用实体属性对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getVisibleScriptPSAppDEField();


	/**
	 * 获取成员显示脚本应用实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getVisibleScriptPSAppDEFieldMust();
}