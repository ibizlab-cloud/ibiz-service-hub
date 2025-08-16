package net.ibizsys.model.app.dataentity;



/**
 * 应用实体自填模式模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO}运行时对象
 *
 */
public interface IPSAppDEACMode extends net.ibizsys.model.dataentity.ac.IPSDEACMode{

	
	
	/**
	 * 获取布局面板
	 * @return
	 */
	net.ibizsys.model.control.panel.IPSLayoutPanel getItemPSLayoutPanel();


	/**
	 * 获取布局面板，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.panel.IPSLayoutPanel getItemPSLayoutPanelMust();
	
	
	/**
	 * 获取数据链接视图
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO#FIELD_LINKPSDEVIEWID}
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getLinkPSAppView();


	/**
	 * 获取数据链接视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getLinkPSAppViewMust();
	
	
	/**
	 * 获取从排序应用属性对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO#FIELD_MINORSORTPSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getMinorSortPSAppDEField();


	/**
	 * 获取从排序应用属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getMinorSortPSAppDEFieldMust();
	
	
	/**
	 * 获取应用实体数据集对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO#FIELD_PSDEDATASETID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet();


	/**
	 * 获取应用实体数据集对象，不存在时抛出异常
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
	 * 获取嵌入选择视图
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO#FIELD_PICKUPPSDEVIEWID}
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getPickupPSAppView();


	/**
	 * 获取嵌入选择视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getPickupPSAppViewMust();
	
	
	/**
	 * 获取文本应用属性对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO#FIELD_TEXTPSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEField();


	/**
	 * 获取文本应用属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEFieldMust();
	
	
	/**
	 * 获取值应用属性对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeDTO#FIELD_VALUEPSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getValuePSAppDEField();


	/**
	 * 获取值应用属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getValuePSAppDEFieldMust();
}