package net.ibizsys.model.app.func;



/**
 * 应用功能模型对象接口
 *
 */
public interface IPSAppFunc extends net.ibizsys.model.app.IPSApplicationObject
		,net.ibizsys.model.control.IPSNavigateParamContainer{

	
	
	/**
	 * 获取应用功能类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AppFuncType}
	 * @return
	 */
	String getAppFuncType();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	String getCodeName();
	
	
	/**
	 * 获取功能编号
	 * @return
	 */
	String getFuncSN();
	
	
	/**
	 * 获取Html地址
	 * @return
	 */
	String getHtmlPageUrl();
	
	
	/**
	 * 获取脚本代码
	 * @return
	 */
	String getJSCode();
	
	
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
	 * 获取功能打开模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AppFuncOpenMode}
	 * @return
	 */
	String getOpenMode();
	
	
	/**
	 * 获取打开视图参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getOpenViewParam();
	
	
	/**
	 * 获取应用实体自填模式
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEACMode getPSAppDEACMode();


	/**
	 * 获取应用实体自填模式，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEACMode getPSAppDEACModeMust();
	
	
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
	 * 获取打开视图
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getPSAppView();


	/**
	 * 获取打开视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getPSAppViewMust();
	
	
	/**
	 * 获取预定义功能标识
	 * @return
	 */
	String getPSPDTAppFuncId();
	
	
	/**
	 * 获取应用界面行为
	 * @return
	 */
	net.ibizsys.model.view.IPSUIAction getPSUIAction();


	/**
	 * 获取应用界面行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.view.IPSUIAction getPSUIActionMust();
	
	
	/**
	 * 获取预置类型
	 * @return
	 */
	String getPredefinedType();
	
	
	/**
	 * 获取预置类型参数
	 * @return
	 */
	String getPredefinedTypeParam();
	
	
	/**
	 * 获取操作提示信息
	 * @return
	 */
	String getTooltip();
	
	
	/**
	 * 获取操作提示语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageRes();


	/**
	 * 获取操作提示语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageResMust();
	
	
	/**
	 * 获取用户数据
	 * @return
	 */
	String getUserData();
	
	
	/**
	 * 获取用户数据2
	 * @return
	 */
	String getUserData2();
	
	
	/**
	 * 获取是否系统保留
	 * @return
	 */
	boolean isSystemReserved();
}