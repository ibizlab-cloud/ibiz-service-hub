package net.ibizsys.model.control.calendar;



/**
 * 日历部件项模型基础对象接口
 *
 */
public interface IPSCalendarItem extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.control.IPSControlItem
		,net.ibizsys.model.control.IPSControlXDataContainer
		,net.ibizsys.model.control.IPSControlMDataContainer
		,net.ibizsys.model.control.IPSControlObjectNavigatable
		,net.ibizsys.model.IPSModelSortable{

	
	
	/**
	 * 获取默认背景颜色
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_BKCOLOR}
	 * @return
	 */
	java.lang.String getBKColor();
	
	
	/**
	 * 获取默认文本颜色
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_COLOR}
	 * @return
	 */
	java.lang.String getColor();
	
	
	/**
	 * 获取动态样式表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DYNACLASS}
	 * @return
	 */
	java.lang.String getDynaClass();
	
	
	/**
	 * 获取项内置样式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_ITEMSTYLE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CtrlDetailStyle}
	 * @return
	 */
	java.lang.String getItemStyle();
	
	
	/**
	 * 获取项标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_ITEMTYPE}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSDEID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSDETOOLBARID}
	 * @return
	 */
	net.ibizsys.model.control.toolbar.IPSDEContextMenu getPSDEContextMenu();


	/**
	 * 获取上下文菜单对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.toolbar.IPSDEContextMenu getPSDEContextMenuMust();
	
	
	/**
	 * 获取项布局面板
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSSYSVIEWPANELID}
	 * @return
	 */
	net.ibizsys.model.control.panel.IPSLayoutPanel getPSLayoutPanel();


	/**
	 * 获取项布局面板，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.panel.IPSLayoutPanel getPSLayoutPanelMust();
	
	
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
	 * 获取项图标资源对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSSYSIMAGEID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取项图标资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取是否支持编辑
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_EDITMODE}
	 * @return
	 */
	boolean isEnableEdit();
}