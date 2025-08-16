package net.ibizsys.model.app.view;



/**
 * 应用首页视图模型对象接口
 * <P>
 * 扩展父接口类型[APPINDEXVIEW]
 *
 */
public interface IPSAppIndexView extends net.ibizsys.model.app.view.IPSAppView{

	
	
	/**
	 * 获取图标路径
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppViewDTO#FIELD_APPICONPATH}
	 * @return
	 */
	java.lang.String getAppIconPath();
	
	
	/**
	 * 获取图标路径2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppViewDTO#FIELD_APPICONPATH2}
	 * @return
	 */
	java.lang.String getAppIconPath2();
	
	
	/**
	 * 获取应用选择模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppViewDTO#FIELD_APPSWITCHMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AppSwitchMode}
	 * @return
	 */
	int getAppSwitchMode();
	
	
	/**
	 * 获取下方信息，默认首页视图使用前端应用的下方信息定义{@link net.ibizsys.centralstudio.dto.PSSysAppDTO#FIELD_BOTTOMINFO}
	 * @return
	 */
	java.lang.String getBottomInfo();
	
	
	/**
	 * 获取默认内容视图
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getDefPSAppView();


	/**
	 * 获取默认内容视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getDefPSAppViewMust();
	
	
	/**
	 * 获取头部信息，默认首页视图使用前端应用的头部信息定义{@link net.ibizsys.centralstudio.dto.PSSysAppDTO#FIELD_HEADERINFO}
	 * @return
	 */
	java.lang.String getHeaderInfo();
	
	
	/**
	 * 获取应用菜单方向
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppViewDTO#FIELD_MAINMENUSIDE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AppIndexViewMenuAlign}
	 * @return
	 */
	java.lang.String getMainMenuAlign();
	
	
	/**
	 * 获取门户应用计数器引用
	 * @return
	 */
	net.ibizsys.model.app.control.IPSAppCounterRef getPortalPSAppCounterRef();


	/**
	 * 获取门户应用计数器引用，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.control.IPSAppCounterRef getPortalPSAppCounterRefMust();
	
	
	/**
	 * 获取是否空白视图模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppViewDTO#FIELD_BLANKMODE}
	 * @return
	 */
	boolean isBlankMode();
	
	
	/**
	 * 获取是否应用起始视图
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppViewDTO#FIELD_DEFAULTPAGE}
	 * @return
	 */
	boolean isDefaultPage();
	
	
	/**
	 * 获取是否支持应用切换
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppViewDTO#FIELD_APPSWITCHMODE}
	 * @return
	 */
	boolean isEnableAppSwitch();
}