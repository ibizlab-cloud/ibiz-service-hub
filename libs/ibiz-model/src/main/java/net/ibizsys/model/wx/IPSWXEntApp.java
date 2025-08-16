package net.ibizsys.model.wx;



/**
 *
 */
public interface IPSWXEntApp extends net.ibizsys.model.wx.IPSWXAccountObject
		,net.ibizsys.model.IPSObject{

	
	
	/**
	 * 获取应用路径
	 * @return
	 */
	java.lang.String getAppURL();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取前端应用
	 * @return
	 */
	net.ibizsys.model.app.IPSApplication getPSApplication();


	/**
	 * 获取前端应用，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.IPSApplication getPSApplicationMust();
	
	
	/**
	 * 获取系统资源对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSSYSRESOURCEID}
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
	 * 获取响应逻辑集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.wx.IPSWXLogic> getPSWXLogics();
	
	/**
	 * 获取响应逻辑集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.wx.IPSWXLogic getPSWXLogic(Object objKey, boolean bTryMode);
	
	/**
	 * 设置响应逻辑集合
	 * @param list 响应逻辑集合
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