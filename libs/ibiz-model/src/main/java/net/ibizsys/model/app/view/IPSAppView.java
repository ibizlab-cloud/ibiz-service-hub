package net.ibizsys.model.app.view;



/**
 * 应用视图模型基础对象接口
 *
 */
public interface IPSAppView extends net.ibizsys.model.app.view.IPSAppViewBase
		,net.ibizsys.model.control.IPSControlContainer{

	
	
	/**
	 * 获取访问用户模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AccessUserMode}
	 * @return
	 */
	int getAccUserMode();
	
	
	/**
	 * 获取访问标识，视图访问标识来自统一资源的资源代码{@link net.ibizsys.model.security.IPSSysUniRes#getResCode}
	 * @return
	 */
	java.lang.String getAccessKey();
	
	
	/**
	 * 获取标题语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageRes();


	/**
	 * 获取标题语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageResMust();
	
	
	/**
	 * 获取视图标题
	 * @return
	 */
	java.lang.String getCaption();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取动态系统模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DynaSysMode}
	 * @return
	 */
	int getDynaSysMode();
	
	
	/**
	 * 获取视图高度
	 * @return
	 */
	int getHeight();
	
	
	/**
	 * 获取应用菜单方向
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AppIndexViewMenuAlign}
	 * @return
	 */
	java.lang.String getMainMenuAlign();
	
	
	/**
	 * 获取默认打开模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.OpenViewMode}
	 * @return
	 */
	java.lang.String getOpenMode();
	
	
	/**
	 * 获取视图应用实体
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity();


	/**
	 * 获取视图应用实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust();
	
	
	/**
	 * 获取应用模块
	 * @return
	 */
	net.ibizsys.model.app.IPSAppModule getPSAppModule();


	/**
	 * 获取应用模块，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.IPSAppModule getPSAppModuleMust();
	
	
	/**
	 * 获取视图界面引擎集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.view.IPSAppViewEngine> getPSAppViewEngines();
	
	/**
	 * 获取视图界面引擎集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.view.IPSAppViewEngine getPSAppViewEngine(Object objKey, boolean bTryMode);
	
	/**
	 * 设置视图界面引擎集合
	 * @param list 视图界面引擎集合
	 */
	void setPSAppViewEngines(java.util.List<net.ibizsys.model.app.view.IPSAppViewEngine> list);
	
	
	/**
	 * 获取视图逻辑集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.view.IPSAppViewLogic> getPSAppViewLogics();
	
	/**
	 * 获取视图逻辑集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.view.IPSAppViewLogic getPSAppViewLogic(Object objKey, boolean bTryMode);
	
	/**
	 * 设置视图逻辑集合
	 * @param list 视图逻辑集合
	 */
	void setPSAppViewLogics(java.util.List<net.ibizsys.model.app.view.IPSAppViewLogic> list);
	
	
	/**
	 * 获取应用视图消息组
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppViewMsgGroup getPSAppViewMsgGroup();


	/**
	 * 获取应用视图消息组，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppViewMsgGroup getPSAppViewMsgGroupMust();
	
	
	/**
	 * 获取视图导航上下文集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.view.IPSAppViewNavContext> getPSAppViewNavContexts();
	
	/**
	 * 获取视图导航上下文集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.view.IPSAppViewNavContext getPSAppViewNavContext(Object objKey, boolean bTryMode);
	
	/**
	 * 设置视图导航上下文集合
	 * @param list 视图导航上下文集合
	 */
	void setPSAppViewNavContexts(java.util.List<net.ibizsys.model.app.view.IPSAppViewNavContext> list);
	
	
	/**
	 * 获取视图导航参数集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.view.IPSAppViewNavParam> getPSAppViewNavParams();
	
	/**
	 * 获取视图导航参数集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.view.IPSAppViewNavParam getPSAppViewNavParam(Object objKey, boolean bTryMode);
	
	/**
	 * 设置视图导航参数集合
	 * @param list 视图导航参数集合
	 */
	void setPSAppViewNavParams(java.util.List<net.ibizsys.model.app.view.IPSAppViewNavParam> list);
	
	
	/**
	 * 获取视图参数集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.view.IPSAppViewParam> getPSAppViewParams();
	
	/**
	 * 获取视图参数集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.view.IPSAppViewParam getPSAppViewParam(Object objKey, boolean bTryMode);
	
	/**
	 * 设置视图参数集合
	 * @param list 视图参数集合
	 */
	void setPSAppViewParams(java.util.List<net.ibizsys.model.app.view.IPSAppViewParam> list);
	
	
	/**
	 * 获取视图对象引用
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.view.IPSAppViewRef> getPSAppViewRefs();
	
	/**
	 * 获取视图对象引用的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.view.IPSAppViewRef getPSAppViewRef(Object objKey, boolean bTryMode);
	
	/**
	 * 设置视图对象引用
	 * @param list 视图对象引用
	 */
	void setPSAppViewRefs(java.util.List<net.ibizsys.model.app.view.IPSAppViewRef> list);
	
	
	/**
	 * 获取视图界面行为集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.view.IPSAppViewUIAction> getPSAppViewUIActions();
	
	/**
	 * 获取视图界面行为集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.view.IPSAppViewUIAction getPSAppViewUIAction(Object objKey, boolean bTryMode);
	
	/**
	 * 设置视图界面行为集合
	 * @param list 视图界面行为集合
	 */
	void setPSAppViewUIActions(java.util.List<net.ibizsys.model.app.view.IPSAppViewUIAction> list);
	
	
	/**
	 * 获取根部件集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.IPSControl> getPSControls();
	
	/**
	 * 获取根部件集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.IPSControl getPSControl(Object objKey, boolean bTryMode);
	
	/**
	 * 设置根部件集合
	 * @param list 根部件集合
	 */
	void setPSControls(java.util.List<net.ibizsys.model.control.IPSControl> list);
	
	
	/**
	 * 获取界面样式表对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCss();


	/**
	 * 获取界面样式表对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCssMust();
	
	
	/**
	 * 获取图标对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取图标对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取前端应用插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin();


	/**
	 * 获取前端应用插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust();
	
	
	/**
	 * 获取视图布局面板
	 * @return
	 */
	net.ibizsys.model.control.panel.IPSViewLayoutPanel getPSViewLayoutPanel();


	/**
	 * 获取视图布局面板，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.panel.IPSViewLayoutPanel getPSViewLayoutPanelMust();
	
	
	/**
	 * 获取视图优先级
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AppViewPriority}
	 * @return
	 */
	int getPriority();
	
	
	/**
	 * 获取是否视图被引用
	 * @return
	 */
	boolean getRefFlag();
	
	
	/**
	 * 获取子标题语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getSubCapPSLanguageRes();


	/**
	 * 获取子标题语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getSubCapPSLanguageResMust();
	
	
	/**
	 * 获取视图子标题
	 * @return
	 */
	java.lang.String getSubCaption();
	
	
	/**
	 * 获取视图抬头
	 * @return
	 */
	java.lang.String getTitle();
	
	
	/**
	 * 获取抬头语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageRes();


	/**
	 * 获取抬头语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageResMust();
	
	
	/**
	 * 获取视图样式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AppUIStyle}
	 * @return
	 */
	java.lang.String getViewStyle();
	
	
	/**
	 * 获取视图类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AppViewType}
	 * @return
	 */
	java.lang.String getViewType();
	
	
	/**
	 * 获取视图宽度
	 * @return
	 */
	int getWidth();
	
	
	/**
	 * 获取是否启用数据权限
	 * @return
	 */
	boolean isEnableDP();
	
	
	/**
	 * 获取是否支持工作流
	 * @return
	 */
	boolean isEnableWF();
	
	
	/**
	 * 获取是否数据选择视图
	 * @return
	 */
	boolean isPickupMode();
	
	
	/**
	 * 获取是否重定向视图
	 * @return
	 */
	boolean isRedirectView();
	
	
	/**
	 * 获取是否显示标题栏
	 * @return
	 */
	boolean isShowCaptionBar();
}