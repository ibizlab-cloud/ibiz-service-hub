package net.ibizsys.model.wx;



/**
 *
 */
public interface IPSWXAccount extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取系统资源对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysResource getPSSysResource();


	/**
	 * 获取系统资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysResource getPSSysResourceMust();
	
	
	/**
	 * 获取后台扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin();


	/**
	 * 获取后台扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust();
	
	
	/**
	 * 获取系统模块
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModule();


	/**
	 * 获取系统模块，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust();
	
	
	/**
	 * 获取应用集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.wx.IPSWXEntApp> getPSWXEntApps();
	
	/**
	 * 获取应用集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.wx.IPSWXEntApp getPSWXEntApp(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用集合
	 * @param list 应用集合
	 */
	void setPSWXEntApps(java.util.List<net.ibizsys.model.wx.IPSWXEntApp> list);
	
	
	/**
	 * 获取逻辑集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.wx.IPSWXLogic> getPSWXLogics();
	
	/**
	 * 获取逻辑集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.wx.IPSWXLogic getPSWXLogic(Object objKey, boolean bTryMode);
	
	/**
	 * 设置逻辑集合
	 * @param list 逻辑集合
	 */
	void setPSWXLogics(java.util.List<net.ibizsys.model.wx.IPSWXLogic> list);
	
	
	/**
	 * 获取菜单功能集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.wx.IPSWXMenuFunc> getPSWXMenuFuncs();
	
	/**
	 * 获取菜单功能集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.wx.IPSWXMenuFunc getPSWXMenuFunc(Object objKey, boolean bTryMode);
	
	/**
	 * 设置菜单功能集合
	 * @param list 菜单功能集合
	 */
	void setPSWXMenuFuncs(java.util.List<net.ibizsys.model.wx.IPSWXMenuFunc> list);
	
	
	/**
	 * 获取菜单集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.wx.IPSWXMenu> getPSWXMenus();
	
	/**
	 * 获取菜单集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.wx.IPSWXMenu getPSWXMenu(Object objKey, boolean bTryMode);
	
	/**
	 * 设置菜单集合
	 * @param list 菜单集合
	 */
	void setPSWXMenus(java.util.List<net.ibizsys.model.wx.IPSWXMenu> list);
}