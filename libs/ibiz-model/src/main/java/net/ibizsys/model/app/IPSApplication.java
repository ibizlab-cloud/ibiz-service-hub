package net.ibizsys.model.app;



/**
 * 应用模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysAppDTO}运行时对象
 *
 */
public interface IPSApplication extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取全部资源标识集合
	 * @return
	 */
	java.util.List<java.lang.String> getAllAccessKeys();
	
	
	/**
	 * 获取应用智能报表体系集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.bi.IPSAppBIScheme> getAllPSAppBISchemes();
	
	/**
	 * 获取应用智能报表体系集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.bi.IPSAppBIScheme getPSAppBIScheme(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用智能报表体系集合
	 * @param list 应用智能报表体系集合
	 */
	void setPSAppBISchemes(java.util.List<net.ibizsys.model.app.bi.IPSAppBIScheme> list);
	
	
	/**
	 * 获取应用代码表集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.codelist.IPSAppCodeList> getAllPSAppCodeLists();
	
	/**
	 * 获取应用代码表集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.codelist.IPSAppCodeList getPSAppCodeList(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用代码表集合
	 * @param list 应用代码表集合
	 */
	void setPSAppCodeLists(java.util.List<net.ibizsys.model.app.codelist.IPSAppCodeList> list);
	
	
	/**
	 * 获取应用计数器集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.control.IPSAppCounter> getAllPSAppCounters();
	
	/**
	 * 获取应用计数器集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.control.IPSAppCounter getPSAppCounter(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用计数器集合
	 * @param list 应用计数器集合
	 */
	void setPSAppCounters(java.util.List<net.ibizsys.model.app.control.IPSAppCounter> list);
	
	
	/**
	 * 获取应用实体属性输入提示集合集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.res.IPSAppDEFInputTipSet> getAllPSAppDEFInputTipSets();
	
	/**
	 * 获取应用实体属性输入提示集合集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.res.IPSAppDEFInputTipSet getPSAppDEFInputTipSet(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用实体属性输入提示集合集合
	 * @param list 应用实体属性输入提示集合集合
	 */
	void setPSAppDEFInputTipSets(java.util.List<net.ibizsys.model.app.res.IPSAppDEFInputTipSet> list);
	
	
	/**
	 * 获取应用实体关系集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDERS> getAllPSAppDERSs();
	
	/**
	 * 获取应用实体关系集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDERS getPSAppDERS(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用实体关系集合
	 * @param list 应用实体关系集合
	 */
	void setPSAppDERs(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDERS> list);
	
	
	/**
	 * 获取应用界面行为组集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup> getAllPSAppDEUIActionGroups();
	
	/**
	 * 获取应用界面行为组集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup getPSAppDEUIActionGroup(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用界面行为组集合
	 * @param list 应用界面行为组集合
	 */
	void setPSAppDEUIActionGroups(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup> list);
	
	
	/**
	 * 获取应用界面行为集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUIAction> getAllPSAppDEUIActions();
	
	/**
	 * 获取应用界面行为集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEUIAction getPSAppDEUIAction(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用界面行为集合
	 * @param list 应用界面行为集合
	 */
	void setPSAppDEUIActions(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUIAction> list);
	
	
	/**
	 * 获取应用实体集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDataEntity> getAllPSAppDataEntities();
	
	/**
	 * 获取应用实体集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用实体集合
	 * @param list 应用实体集合
	 */
	void setPSAppDataEntities(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDataEntity> list);
	
	
	/**
	 * 获取应用编辑器样式引用集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.res.IPSAppEditorStyleRef> getAllPSAppEditorStyleRefs();
	
	/**
	 * 获取应用编辑器样式引用集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.res.IPSAppEditorStyleRef getPSAppEditorStyleRef(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用编辑器样式引用集合
	 * @param list 应用编辑器样式引用集合
	 */
	void setPSAppEditorStyleRefs(java.util.List<net.ibizsys.model.app.res.IPSAppEditorStyleRef> list);
	
	
	/**
	 * 获取应用功能集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.func.IPSAppFunc> getAllPSAppFuncs();
	
	/**
	 * 获取应用功能集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.func.IPSAppFunc getPSAppFunc(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用功能集合
	 * @param list 应用功能集合
	 */
	void setPSAppFuncs(java.util.List<net.ibizsys.model.app.func.IPSAppFunc> list);
	
	
	/**
	 * 获取应用语言集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.IPSAppLan> getAllPSAppLans();
	
	/**
	 * 获取应用语言集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.IPSAppLan getPSAppLan(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用语言集合
	 * @param list 应用语言集合
	 */
	void setPSAppLans(java.util.List<net.ibizsys.model.app.IPSAppLan> list);
	
	
	/**
	 * 获取应用逻辑集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.IPSAppLogic> getAllPSAppLogics();
	
	/**
	 * 获取应用逻辑集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.IPSAppLogic getPSAppLogic(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用逻辑集合
	 * @param list 应用逻辑集合
	 */
	void setPSAppLogics(java.util.List<net.ibizsys.model.app.IPSAppLogic> list);
	
	
	/**
	 * 获取应用菜单模型集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.appmenu.IPSAppMenuModel> getAllPSAppMenuModels();
	
	/**
	 * 获取应用菜单模型集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.appmenu.IPSAppMenuModel getPSAppMenuModel(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用菜单模型集合
	 * @param list 应用菜单模型集合
	 */
	void setPSAppMenuModels(java.util.List<net.ibizsys.model.app.appmenu.IPSAppMenuModel> list);
	
	
	/**
	 * 获取应用方法DTO集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.IPSAppMethodDTO> getAllPSAppMethodDTOs();
	
	/**
	 * 获取应用方法DTO集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.IPSAppMethodDTO getPSAppMethodDTO(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用方法DTO集合
	 * @param list 应用方法DTO集合
	 */
	void setPSAppMethodDTOs(java.util.List<net.ibizsys.model.app.IPSAppMethodDTO> list);
	
	
	/**
	 * 获取应用模块集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.IPSAppModule> getAllPSAppModules();
	
	/**
	 * 获取应用模块集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.IPSAppModule getPSAppModule(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用模块集合
	 * @param list 应用模块集合
	 */
	void setPSAppModules(java.util.List<net.ibizsys.model.app.IPSAppModule> list);
	
	
	/**
	 * 获取应用消息模板集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.msg.IPSAppMsgTempl> getAllPSAppMsgTempls();
	
	/**
	 * 获取应用消息模板集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.msg.IPSAppMsgTempl getPSAppMsgTempl(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用消息模板集合
	 * @param list 应用消息模板集合
	 */
	void setPSAppMsgTempls(java.util.List<net.ibizsys.model.app.msg.IPSAppMsgTempl> list);
	
	
	/**
	 * 获取应用前端模板插件引用集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.res.IPSAppPFPluginRef> getAllPSAppPFPluginRefs();
	
	/**
	 * 获取应用前端模板插件引用集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.res.IPSAppPFPluginRef getPSAppPFPluginRef(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用前端模板插件引用集合
	 * @param list 应用前端模板插件引用集合
	 */
	void setPSAppPFPluginRefs(java.util.List<net.ibizsys.model.app.res.IPSAppPFPluginRef> list);
	
	
	/**
	 * 获取应用组件包集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.IPSAppPkg> getAllPSAppPkgs();
	
	/**
	 * 获取应用组件包集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.IPSAppPkg getPSAppPkg(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用组件包集合
	 * @param list 应用组件包集合
	 */
	void setPSAppPkgs(java.util.List<net.ibizsys.model.app.IPSAppPkg> list);
	
	
	/**
	 * 获取应用门户部件分类集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.control.IPSAppPortletCat> getAllPSAppPortletCats();
	
	/**
	 * 获取应用门户部件分类集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.control.IPSAppPortletCat getPSAppPortletCat(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用门户部件分类集合
	 * @param list 应用门户部件分类集合
	 */
	void setPSAppPortletCats(java.util.List<net.ibizsys.model.app.control.IPSAppPortletCat> list);
	
	
	/**
	 * 获取应用门户部件集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.control.IPSAppPortlet> getAllPSAppPortlets();
	
	/**
	 * 获取应用门户部件集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.control.IPSAppPortlet getPSAppPortlet(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用门户部件集合
	 * @param list 应用门户部件集合
	 */
	void setPSAppPortlets(java.util.List<net.ibizsys.model.app.control.IPSAppPortlet> list);
	
	
	/**
	 * 获取应用预置资源集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.IPSAppResource> getAllPSAppResources();
	
	/**
	 * 获取应用预置资源集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.IPSAppResource getPSAppResource(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用预置资源集合
	 * @param list 应用预置资源集合
	 */
	void setPSAppResources(java.util.List<net.ibizsys.model.app.IPSAppResource> list);
	
	
	/**
	 * 获取应用视图子类型引用集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.res.IPSAppSubViewTypeRef> getAllPSAppSubViewTypeRefs();
	
	/**
	 * 获取应用视图子类型引用集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.res.IPSAppSubViewTypeRef getPSAppSubViewTypeRef(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用视图子类型引用集合
	 * @param list 应用视图子类型引用集合
	 */
	void setPSAppSubViewTypeRefs(java.util.List<net.ibizsys.model.app.res.IPSAppSubViewTypeRef> list);
	
	
	/**
	 * 获取应用预置界面逻辑集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.logic.IPSAppUILogic> getAllPSAppUILogics();
	
	/**
	 * 获取应用预置界面逻辑集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.logic.IPSAppUILogic getPSAppUILogic(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用预置界面逻辑集合
	 * @param list 应用预置界面逻辑集合
	 */
	void setPSAppUILogics(java.util.List<net.ibizsys.model.app.logic.IPSAppUILogic> list);
	
	
	/**
	 * 获取应用界面模式集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.IPSAppUIStyle> getAllPSAppUIStyles();
	
	/**
	 * 获取应用界面模式集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.IPSAppUIStyle getPSAppUIStyle(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用界面模式集合
	 * @param list 应用界面模式集合
	 */
	void setPSAppUIStyles(java.util.List<net.ibizsys.model.app.IPSAppUIStyle> list);
	
	
	/**
	 * 获取应用界面主题集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.theme.IPSAppUITheme> getAllPSAppUIThemes();
	
	/**
	 * 获取应用界面主题集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.theme.IPSAppUITheme getPSAppUITheme(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用界面主题集合
	 * @param list 应用界面主题集合
	 */
	void setPSAppUIThemes(java.util.List<net.ibizsys.model.app.theme.IPSAppUITheme> list);
	
	
	/**
	 * 获取应用用户模式集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.usermode.IPSAppUserMode> getAllPSAppUserModes();
	
	/**
	 * 获取应用用户模式集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.usermode.IPSAppUserMode getPSAppUserMode(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用用户模式集合
	 * @param list 应用用户模式集合
	 */
	void setPSAppUserModes(java.util.List<net.ibizsys.model.app.usermode.IPSAppUserMode> list);
	
	
	/**
	 * 获取应用功能页面集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.IPSAppUtilPage> getAllPSAppUtilPages();
	
	/**
	 * 获取应用功能页面集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.IPSAppUtilPage getPSAppUtilPage(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用功能页面集合
	 * @param list 应用功能页面集合
	 */
	void setPSAppUtilPages(java.util.List<net.ibizsys.model.app.IPSAppUtilPage> list);
	
	
	/**
	 * 获取应用功能组件集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.util.IPSAppUtil> getAllPSAppUtils();
	
	/**
	 * 获取应用功能组件集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.util.IPSAppUtil getPSAppUtil(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用功能组件集合
	 * @param list 应用功能组件集合
	 */
	void setPSAppUtils(java.util.List<net.ibizsys.model.app.util.IPSAppUtil> list);
	
	
	/**
	 * 获取应用视图消息组集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.view.IPSAppViewMsgGroup> getAllPSAppViewMsgGroups();
	
	/**
	 * 获取应用视图消息组集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.view.IPSAppViewMsgGroup getPSAppViewMsgGroup(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用视图消息组集合
	 * @param list 应用视图消息组集合
	 */
	void setPSAppViewMsgGroups(java.util.List<net.ibizsys.model.app.view.IPSAppViewMsgGroup> list);
	
	
	/**
	 * 获取应用视图消息集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.view.IPSAppViewMsg> getAllPSAppViewMsgs();
	
	/**
	 * 获取应用视图消息集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.view.IPSAppViewMsg getPSAppViewMsg(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用视图消息集合
	 * @param list 应用视图消息集合
	 */
	void setPSAppViewMsgs(java.util.List<net.ibizsys.model.app.view.IPSAppViewMsg> list);
	
	
	/**
	 * 获取应用视图集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.view.IPSAppView> getAllPSAppViews();
	
	/**
	 * 获取应用视图集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.view.IPSAppView getPSAppView(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用视图集合
	 * @param list 应用视图集合
	 */
	void setPSAppViews(java.util.List<net.ibizsys.model.app.view.IPSAppView> list);
	
	
	/**
	 * 获取应用工作流集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.wf.IPSAppWF> getAllPSAppWFs();
	
	/**
	 * 获取应用工作流集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.wf.IPSAppWF getPSAppWF(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用工作流集合
	 * @param list 应用工作流集合
	 */
	void setPSAppWFs(java.util.List<net.ibizsys.model.app.wf.IPSAppWF> list);
	
	
	/**
	 * 获取全局实体操作标识集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.priv.IPSDEOPPriv> getAllPSDEOPPrivs();
	
	/**
	 * 获取全局实体操作标识集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPriv(Object objKey, boolean bTryMode);
	
	/**
	 * 设置全局实体操作标识集合
	 * @param list 全局实体操作标识集合
	 */
	void setPSDEOPPrivs(java.util.List<net.ibizsys.model.dataentity.priv.IPSDEOPPriv> list);
	
	
	/**
	 * 获取子应用引用集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.IPSSubAppRef> getAllPSSubAppRefs();
	
	/**
	 * 获取子应用引用集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.IPSSubAppRef getPSSubAppRef(Object objKey, boolean bTryMode);
	
	/**
	 * 设置子应用引用集合
	 * @param list 子应用引用集合
	 */
	void setPSSubAppRefs(java.util.List<net.ibizsys.model.app.IPSSubAppRef> list);
	
	
	/**
	 * 获取测试项目集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.testing.IPSSysTestPrj> getAllPSSysTestPrjs();
	
	/**
	 * 获取测试项目集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.testing.IPSSysTestPrj getPSSysTestPrj(Object objKey, boolean bTryMode);
	
	/**
	 * 设置测试项目集合
	 * @param list 测试项目集合
	 */
	void setPSSysTestPrjs(java.util.List<net.ibizsys.model.testing.IPSSysTestPrj> list);
	
	
	/**
	 * 获取应用目录名称
	 * @return
	 */
	java.lang.String getAppFolder();
	
	
	/**
	 * 获取应用模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AppMode}
	 * @return
	 */
	java.lang.String getAppMode();
	
	
	/**
	 * 获取应用标记
	 * @return
	 */
	java.lang.String getAppTag();
	
	
	/**
	 * 获取应用标记2
	 * @return
	 */
	java.lang.String getAppTag2();
	
	
	/**
	 * 获取应用标记3
	 * @return
	 */
	java.lang.String getAppTag3();
	
	
	/**
	 * 获取应用标记4
	 * @return
	 */
	java.lang.String getAppTag4();
	
	
	/**
	 * 获取应用类型
	 * @return
	 */
	java.lang.String getAppType();
	
	
	/**
	 * 获取应用版本
	 * @return
	 */
	java.lang.String getAppVersion();
	
	
	/**
	 * 获取应用下方信息
	 * @return
	 */
	java.lang.String getBottomInfo();
	
	
	/**
	 * 获取应用标题
	 * @return
	 */
	java.lang.String getCaption();
	
	
	/**
	 * 获取代码标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysAppDTO#FIELD_APPPKGNAME}
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取是否默认应用
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysAppDTO#FIELD_DEFAULTPUB}
	 * @return
	 */
	boolean getDefaultFlag();
	
	
	/**
	 * 获取默认对象存储分类
	 * @return
	 */
	java.lang.String getDefaultOSSCat();
	
	
	/**
	 * 获取启动首页视图，计算默认的应用首页视图
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppIndexView getDefaultPSAppIndexView();


	/**
	 * 获取启动首页视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppIndexView getDefaultPSAppIndexViewMust();
	
	
	/**
	 * 获取动态系统模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysAppDTO#FIELD_ENABLEDYNASYS}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DynaSysMode}
	 * @return
	 */
	int getDynaSysMode();
	
	
	/**
	 * 获取模型引擎版本
	 * @return
	 */
	int getEngineVer();
	
	
	/**
	 * 获取应用头部信息
	 * @return
	 */
	java.lang.String getHeaderInfo();
	
	
	/**
	 * 获取前端模板样式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysAppDTO#FIELD_PSPFSTYLEID}
	 * @return
	 */
	java.lang.String getPFStyle();
	
	
	/**
	 * 获取前端模板
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysAppDTO#FIELD_PSPFID}
	 * @return
	 */
	java.lang.String getPFType();
	
	
	/**
	 * 获取代码包名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysAppDTO#FIELD_APPPKGNAME}
	 * @return
	 */
	java.lang.String getPKGCodeName();
	
	
	/**
	 * 获取应用预载逻辑集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.IPSApplicationLogic> getPSApplicationLogics();
	
	/**
	 * 获取应用预载逻辑集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.IPSApplicationLogic getPSApplicationLogic(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用预载逻辑集合
	 * @param list 应用预载逻辑集合
	 */
	void setPSApplicationLogics(java.util.List<net.ibizsys.model.app.IPSApplicationLogic> list);
	
	
	/**
	 * 获取应用默认图标
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取应用默认图标，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取预置资源对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysResource getPSSysResource();


	/**
	 * 获取预置资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysResource getPSSysResourceMust();
	
	
	/**
	 * 获取后端扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin();


	/**
	 * 获取后端扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust();
	
	
	/**
	 * 获取服务代码名称
	 * @return
	 */
	java.lang.String getServiceCodeName();
	
	
	/**
	 * 获取子应用访问标识
	 * @return
	 */
	java.lang.String getSubAppAccessKey();
	
	
	/**
	 * 获取应用子标题
	 * @return
	 */
	java.lang.String getSubCaption();
	
	
	/**
	 * 获取系统代码标识
	 * @return
	 */
	java.lang.String getSysCodeName();
	
	
	/**
	 * 获取应用抬头
	 * @return
	 */
	java.lang.String getTitle();
	
	
	/**
	 * 获取视图代码标识模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysAppDTO#FIELD_CODENAMEMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CodeNameMode}
	 * @return
	 */
	java.lang.String getViewCodeNameMode();
	
	
	/**
	 * 获取是否启用服务接口DTO
	 * @return
	 */
	boolean isEnableServiceAPIDTO();
	
	
	/**
	 * 获取是否启用统一认证登录
	 * @return
	 */
	boolean isEnableUACLogin();
	
	
	/**
	 * 获取是否启用界面模型增强
	 * @return
	 */
	boolean isEnableUIModelEx();
	
	
	/**
	 * 获取是否移动端应用
	 * @return
	 */
	boolean isMobileApp();
	
	
	/**
	 * 获取是否使用服务接口
	 * @return
	 */
	boolean isUseServiceApi();
	
	
	/**
	 * 获取是否流程应用模式
	 * @return
	 */
	boolean isWFAppMode();
}