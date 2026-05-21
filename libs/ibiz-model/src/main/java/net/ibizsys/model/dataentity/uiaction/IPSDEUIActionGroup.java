package net.ibizsys.model.dataentity.uiaction;



/**
 * 实体界面行为组模型对象接口
 *
 */
public interface IPSDEUIActionGroup extends net.ibizsys.model.dataentity.IPSDataEntityObject
		,net.ibizsys.model.view.IPSUIActionGroup{

	
	
	/**
	 * 获取成员行为级别实体属性对象
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getActionLevelPSDEField();


	/**
	 * 获取成员行为级别实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getActionLevelPSDEFieldMust();
	
	
	/**
	 * 获取成员按钮样式实体属性对象
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getButtonStylePSDEField();


	/**
	 * 获取成员按钮样式实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getButtonStylePSDEFieldMust();
	
	
	/**
	 * 获取成员样式表提示实体属性对象
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getClsPSDEField();


	/**
	 * 获取成员样式表提示实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getClsPSDEFieldMust();
	
	
	/**
	 * 获取成员数据实体数据集对象
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getDetailPSDEDataSet();


	/**
	 * 获取成员数据实体数据集对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getDetailPSDEDataSetMust();
	
	
	/**
	 * 获取成员数据实体对象
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getDetailPSDataEntity();


	/**
	 * 获取成员数据实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getDetailPSDataEntityMust();
	
	
	/**
	 * 获取动态模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AIAgentDynamicMode}
	 * @return
	 */
	int getDynamicMode();
	
	
	/**
	 * 获取成员启用脚本实体属性对象
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getEnableScriptPSDEField();


	/**
	 * 获取成员启用脚本实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getEnableScriptPSDEFieldMust();
	
	
	/**
	 * 获取成员图标样式表实体属性对象
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getIconClsPSDEField();


	/**
	 * 获取成员图标样式表实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getIconClsPSDEFieldMust();
	
	
	/**
	 * 获取成员文本实体属性对象
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTextPSDEField();


	/**
	 * 获取成员文本实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTextPSDEFieldMust();
	
	
	/**
	 * 获取成员提示实体属性对象
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTipsPSDEField();


	/**
	 * 获取成员提示实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getTipsPSDEFieldMust();
	
	
	/**
	 * 获取成员界面行为标记实体属性对象
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getUIActionTagPSDEField();


	/**
	 * 获取成员界面行为标记实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getUIActionTagPSDEFieldMust();
	
	
	/**
	 * 获取成员显示脚本实体属性对象
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getVisibleScriptPSDEField();


	/**
	 * 获取成员显示脚本实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getVisibleScriptPSDEFieldMust();
}