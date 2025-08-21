package net.ibizsys.model.app.codelist;



/**
 * 应用代码表模型对象接口
 *
 */
public interface IPSAppCodeList extends net.ibizsys.model.app.IPSApplicationObject
		,net.ibizsys.model.codelist.IPSCodeList
		,net.ibizsys.model.IPSModelSortable{

	
	
	/**
	 * 获取背景颜色值应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getBKColorPSAppDEField();


	/**
	 * 获取背景颜色值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getBKColorPSAppDEFieldMust();
	
	
	/**
	 * 获取开始值应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getBeginValuePSAppDEField();


	/**
	 * 获取开始值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getBeginValuePSAppDEFieldMust();
	
	
	/**
	 * 获取样式表值应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getClsPSAppDEField();


	/**
	 * 获取样式表值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getClsPSAppDEFieldMust();
	
	
	/**
	 * 获取前景颜色值应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getColorPSAppDEField();


	/**
	 * 获取前景颜色值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getColorPSAppDEFieldMust();
	
	
	/**
	 * 获取数据应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getDataPSAppDEField();


	/**
	 * 获取数据应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getDataPSAppDEFieldMust();
	
	
	/**
	 * 获取禁用标志应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getDisablePSAppDEField();


	/**
	 * 获取禁用标志应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getDisablePSAppDEFieldMust();
	
	
	/**
	 * 获取结束值应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getEndValuePSAppDEField();


	/**
	 * 获取结束值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getEndValuePSAppDEFieldMust();
	
	
	/**
	 * 获取图标样式应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getIconClsPSAppDEField();


	/**
	 * 获取图标样式应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getIconClsPSAppDEFieldMust();
	
	
	/**
	 * 获取图标样式（倍数）应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getIconClsXPSAppDEField();


	/**
	 * 获取图标样式（倍数）应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getIconClsXPSAppDEFieldMust();
	
	
	/**
	 * 获取图标路径应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getIconPathPSAppDEField();


	/**
	 * 获取图标路径应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getIconPathPSAppDEFieldMust();
	
	
	/**
	 * 获取图标路径（倍数）应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getIconPathXPSAppDEField();


	/**
	 * 获取图标路径（倍数）应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getIconPathXPSAppDEFieldMust();
	
	
	/**
	 * 获取排序应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getMinorSortPSAppDEField();


	/**
	 * 获取排序应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getMinorSortPSAppDEFieldMust();
	
	
	/**
	 * 获取应用实体数据集合
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet();


	/**
	 * 获取应用实体数据集合，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSetMust();
	
	
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
	 * 获取父值应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPValuePSAppDEField();


	/**
	 * 获取父值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPValuePSAppDEFieldMust();
	
	
	/**
	 * 获取文本应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEField();


	/**
	 * 获取文本应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEFieldMust();
	
	
	/**
	 * 获取值应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getValuePSAppDEField();


	/**
	 * 获取值应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getValuePSAppDEFieldMust();
}