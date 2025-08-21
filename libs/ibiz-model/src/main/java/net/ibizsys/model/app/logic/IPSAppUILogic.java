package net.ibizsys.model.app.logic;



/**
 * 应用全局界面逻辑模型对象接口
 *
 */
public interface IPSAppUILogic extends net.ibizsys.model.res.IPSSysViewLogic{

	
	
	/**
	 * 获取应用实体界面逻辑对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEUILogic getPSAppDEUILogic();


	/**
	 * 获取应用实体界面逻辑对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEUILogic getPSAppDEUILogicMust();
	
	
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
	 * 获取应用界面逻辑引用视图集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.logic.IPSAppUILogicRefView> getPSAppUILogicRefViews();
	
	/**
	 * 获取应用界面逻辑引用视图集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.logic.IPSAppUILogicRefView getPSAppUILogicRefView(Object objKey, boolean bTryMode);
	
	/**
	 * 设置应用界面逻辑引用视图集合
	 * @param list 应用界面逻辑引用视图集合
	 */
	void setPSAppUILogicRefViews(java.util.List<net.ibizsys.model.app.logic.IPSAppUILogicRefView> list);
	
	
	/**
	 * 获取前端插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin();


	/**
	 * 获取前端插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust();
	
	
	/**
	 * 获取界面逻辑类型
	 * @return
	 */
	java.lang.String getViewLogicType();
	
	
	/**
	 * 获取是否内建逻辑
	 * @return
	 */
	boolean isBuiltinLogic();
}