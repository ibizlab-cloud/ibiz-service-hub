package net.ibizsys.model.app.logic;



/**
 * 应用视图新建数据逻辑模型对象接口
 * <P>
 * 扩展父接口类型[APP_NEWDATA]
 *
 */
public interface IPSAppUINewDataLogic extends net.ibizsys.model.app.logic.IPSAppUILogic{

	
	
	/**
	 * 获取向导添加后操作
	 * @return
	 */
	java.lang.String getActionAfterWizard();
	
	
	/**
	 * 获取批添加应用实体方法
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getBatchAddPSAppDEAction();


	/**
	 * 获取批添加应用实体方法，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getBatchAddPSAppDEActionMust();
	
	
	/**
	 * 获取批添加新建数据视图集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.logic.IPSAppUILogicRefView> getBatchAddPSAppViews();
	
	/**
	 * 获取批添加新建数据视图集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.logic.IPSAppUILogicRefView getBatchAddPSAppUILogicRefView(Object objKey, boolean bTryMode);
	
	/**
	 * 设置批添加新建数据视图集合
	 * @param list 批添加新建数据视图集合
	 */
	void setBatchAddPSAppUILogicRefViews(java.util.List<net.ibizsys.model.app.logic.IPSAppUILogicRefView> list);
	
	
	/**
	 * 获取默认新建数据视图
	 * @return
	 */
	net.ibizsys.model.app.logic.IPSAppUILogicRefView getNewDataPSAppView();


	/**
	 * 获取默认新建数据视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.logic.IPSAppUILogicRefView getNewDataPSAppViewMust();
	
	
	/**
	 * 获取多模式新建数据视图集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.logic.IPSAppUILogicRefView> getNewDataPSAppViews();
	
	/**
	 * 获取多模式新建数据视图集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.logic.IPSAppUILogicRefView getNewDataPSAppUILogicRefView(Object objKey, boolean bTryMode);
	
	/**
	 * 设置多模式新建数据视图集合
	 * @param list 多模式新建数据视图集合
	 */
	void setNewDataPSAppUILogicRefViews(java.util.List<net.ibizsys.model.app.logic.IPSAppUILogicRefView> list);
	
	
	/**
	 * 获取新建数据向导视图
	 * @return
	 */
	net.ibizsys.model.app.logic.IPSAppUILogicRefView getWizardPSAppView();


	/**
	 * 获取新建数据向导视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.logic.IPSAppUILogicRefView getWizardPSAppViewMust();
	
	
	/**
	 * 获取是否只支持批添加
	 * @return
	 */
	boolean isBatchAddOnly();
	
	
	/**
	 * 获取是否支持批添加
	 * @return
	 */
	boolean isEnableBatchAdd();
	
	
	/**
	 * 获取是否支持向导添加
	 * @return
	 */
	boolean isEnableWizardAdd();
}