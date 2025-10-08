package net.ibizsys.model.app;



/**
 *
 */
public interface IPSSubAppRef extends net.ibizsys.model.app.IPSApplicationObject{

	
	
	/**
	 * 获取 应用实体界面行为组集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup> getAllPSAppDEUIActionGroups();
	
	/**
	 * 获取 应用实体界面行为组集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup getPSAppDEUIActionGroup(Object objKey, boolean bTryMode);
	
	/**
	 * 设置 应用实体界面行为组集合
	 * @param list  应用实体界面行为组集合
	 */
	void setPSAppDEUIActionGroups(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup> list);
	
	
	/**
	 * 获取 合并菜单集合（除默认菜单）
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.appmenu.IPSAppMenuModel> getAllPSAppMenuModels();
	
	/**
	 * 获取 合并菜单集合（除默认菜单）的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.appmenu.IPSAppMenuModel getPSAppMenuModel(Object objKey, boolean bTryMode);
	
	/**
	 * 设置 合并菜单集合（除默认菜单）
	 * @param list  合并菜单集合（除默认菜单）
	 */
	void setPSAppMenuModels(java.util.List<net.ibizsys.model.app.appmenu.IPSAppMenuModel> list);
	
	
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
	 * 获取 合并部件集合（除关系部件）
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.IPSControl> getAllPSControls();
	
	/**
	 * 获取 合并部件集合（除关系部件）的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.IPSControl getPSControl(Object objKey, boolean bTryMode);
	
	/**
	 * 设置 合并部件集合（除关系部件）
	 * @param list  合并部件集合（除关系部件）
	 */
	void setPSControls(java.util.List<net.ibizsys.model.control.IPSControl> list);
	
	
	/**
	 * 获取 应用实体关系部件集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.IPSControl> getAllPSDEDRControls();
	
	/**
	 * 获取 应用实体关系部件集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.IPSControl getPSDEDRControl(Object objKey, boolean bTryMode);
	
	/**
	 * 设置 应用实体关系部件集合
	 * @param list  应用实体关系部件集合
	 */
	void setPSDEDRControls(java.util.List<net.ibizsys.model.control.IPSControl> list);
	
	
	/**
	 * 获取模型戳
	 * @return
	 */
	java.lang.String getModelStamp();
	
	
	/**
	 * 获取应用菜单模型
	 * @return
	 */
	net.ibizsys.model.app.appmenu.IPSAppMenuModel getPSAppMenuModel();


	/**
	 * 获取应用菜单模型，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.appmenu.IPSAppMenuModel getPSAppMenuModelMust();
	
	
	/**
	 * 获取 应用插件集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.res.IPSAppPFPluginRef> getAllPSAppPFPluginRefs();
	
	/**
	 * 获取 应用插件集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.res.IPSAppPFPluginRef getPSAppPFPluginRef(Object objKey, boolean bTryMode);
	
	/**
	 * 设置 应用插件集合
	 * @param list  应用插件集合
	 */
	void setPSAppPFPluginRefs(java.util.List<net.ibizsys.model.app.res.IPSAppPFPluginRef> list);
	
	
	
	/**
	 * 获取引用参数
	 * @return
	 */
	java.lang.String getRefParam();
	
	
	/**
	 * 获取引用参数2
	 * @return
	 */
	java.lang.String getRefParam2();
	
	
	/**
	 * 获取应用服务标识
	 * @return
	 */
	java.lang.String getServiceId();
	
	
	
	/**
	 * 获取访问标识
	 * @return
	 */
	java.lang.String getAccessKey();
	
	
	
	/**
	 * 获取系统引用类型
	 * @return
	 */
	java.lang.String getSysRefType();
	
	
	/**
	 * 获取开发系统标识
	 * @return
	 */
	java.lang.String getPSDevSlnSysId();
}