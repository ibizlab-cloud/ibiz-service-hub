package net.ibizsys.model.control.map;



/**
 * 地图部件项模型对象基础接口
 *
 */
public interface IPSMapItem extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.control.IPSControlItem
		,net.ibizsys.model.control.IPSControlXDataContainer
		,net.ibizsys.model.control.IPSControlMDataContainer
		,net.ibizsys.model.control.IPSControlObjectNavigatable
		,net.ibizsys.model.IPSModelSortable{

	
	
	/**
	 * 获取默认背景颜色
	 * @return
	 */
	java.lang.String getBKColor();
	
	
	/**
	 * 获取边框颜色
	 * @return
	 */
	java.lang.String getBorderColor();
	
	
	/**
	 * 获取边框宽度
	 * @return
	 */
	int getBorderWidth();
	
	
	/**
	 * 获取默认文本颜色
	 * @return
	 */
	java.lang.String getColor();
	
	
	/**
	 * 获取动态样式表
	 * @return
	 */
	java.lang.String getDynaClass();
	
	
	/**
	 * 获取项样式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.MapItemStyle}
	 * @return
	 */
	java.lang.String getItemStyle();
	
	
	/**
	 * 获取项类型
	 * @return
	 */
	java.lang.String getItemType();
	
	
	/**
	 * 获取最大加载项数
	 * @return
	 */
	int getMaxSize();
	
	
	/**
	 * 获取代码模型对象
	 * @return
	 */
	java.lang.String getModelObj();
	
	
	/**
	 * 获取名称语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getNamePSLanguageRes();


	/**
	 * 获取名称语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getNamePSLanguageResMust();
	
	
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
	 * 获取上下文菜单对象
	 * @return
	 */
	net.ibizsys.model.control.toolbar.IPSDEContextMenu getPSDEContextMenu();


	/**
	 * 获取上下文菜单对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.toolbar.IPSDEContextMenu getPSDEContextMenuMust();
	
	
	/**
	 * 获取项界面样式表
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCss();


	/**
	 * 获取项界面样式表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCssMust();
	
	
	/**
	 * 获取项图标对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取项图标对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取半径
	 * @return
	 */
	int getRadius();
	
	
	/**
	 * 获取图形动态样式表
	 * @return
	 */
	java.lang.String getShapeDynaClass();
	
	
	/**
	 * 获取图形界面样式表
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getShapePSSysCss();


	/**
	 * 获取图形界面样式表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getShapePSSysCssMust();
}