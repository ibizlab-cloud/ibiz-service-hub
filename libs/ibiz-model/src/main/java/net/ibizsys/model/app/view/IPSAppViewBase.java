package net.ibizsys.model.app.view;



/**
 * 应用视图模型基础对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSAppViewDTO}运行时对象
 *
 */
public interface IPSAppViewBase extends net.ibizsys.model.app.IPSApplicationObject{

	
	
	/**
	 * 获取访问用户模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AccessUserMode}
	 * @return
	 */
	int getAccUserMode();
	
	
	/**
	 * 获取访问标识
	 * @return
	 */
	java.lang.String getAccessKey();
	
	
	/**
	 * 获取标题语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppViewDTO#FIELD_CAPPSLANRESID}
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
	 * 获取完整代码标识
	 * @return
	 */
	java.lang.String getFullCodeName();
	
	
	/**
	 * 获取视图高度
	 * @return
	 */
	int getHeight();
	
	java.lang.String getMainMenuAlign();
	
	
	/**
	 * 获取视图打开模式
	 * @return
	 */
	java.lang.String getOpenMode();
	
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity();

net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust();
	
	net.ibizsys.model.app.IPSAppModule getPSAppModule();

net.ibizsys.model.app.IPSAppModule getPSAppModuleMust();
	
	
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
	
	net.ibizsys.model.app.view.IPSAppViewMsgGroup getPSAppViewMsgGroup();

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
	 * 获取视图界面样式对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCss();


	/**
	 * 获取视图界面样式对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getPSSysCssMust();
	
	
	/**
	 * 获取视图图标对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取视图图标对象，不存在时抛出异常
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
	 * 获取视图优先级
	 * @return
	 */
	int getPriority();
	
	
	/**
	 * 获取是否视图被引用
	 * @return
	 */
	boolean getRefFlag();
	
	
	/**
	 * 获取实际引用视图
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getRefPSAppView();


	/**
	 * 获取实际引用视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getRefPSAppViewMust();
	
	
	/**
	 * 获取子标题语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppViewDTO#FIELD_SUBCAPPSLANRESID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSAppViewDTO#FIELD_TITLEPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageRes();


	/**
	 * 获取抬头语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageResMust();
	
	
	/**
	 * 获取视图类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEViewType}
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