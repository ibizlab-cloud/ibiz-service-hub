package net.ibizsys.model.control;



/**
 * 界面部件容器模型基础对象接口
 *
 */
public interface IPSControlContainer extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取计数器引用集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.control.IPSAppCounterRef> getPSAppCounterRefs();
	
	/**
	 * 获取计数器引用集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRef(Object objKey, boolean bTryMode);
	
	/**
	 * 设置计数器引用集合
	 * @param list 计数器引用集合
	 */
	void setPSAppCounterRefs(java.util.List<net.ibizsys.model.app.control.IPSAppCounterRef> list);
	
	
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
}