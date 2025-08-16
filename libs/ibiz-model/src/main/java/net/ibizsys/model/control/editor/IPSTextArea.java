package net.ibizsys.model.control.editor;



/**
 * 多行文本编辑器模型对象接口
 * <P>
 * 扩展父接口类型[TEXTAREA,MOBTEXTAREA,TEXTAREA_10]
 *
 */
public interface IPSTextArea extends net.ibizsys.model.control.editor.IPSTextEditor
		,net.ibizsys.model.control.IPSNavigateParamContainer{

	
	
	/**
	 * 获取应用实体自填模式对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEACMode getPSAppDEACMode();


	/**
	 * 获取应用实体自填模式对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEACMode getPSAppDEACModeMust();
	
	
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
	 * 获取应用实体对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity();


	/**
	 * 获取应用实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust();
	
	
	/**
	 * 获取选择视图
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getPickupPSAppView();


	/**
	 * 获取选择视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getPickupPSAppViewMust();
	
	
	/**
	 * 获取是否支持自动填充[AC]
	 * @return
	 */
	boolean isEnableAC();
	
	
	/**
	 * 获取是否支持选择视图[PICKUPVIEW]
	 * @return
	 */
	boolean isEnablePickupView();
}