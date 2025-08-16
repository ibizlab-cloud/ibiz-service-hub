package net.ibizsys.model.app.logic;



/**
 * 应用视图打开数据逻辑模型对象接口
 * <P>
 * 扩展父接口类型[APP_OPENDATA]
 *
 */
public interface IPSAppUIOpenDataLogic extends net.ibizsys.model.app.logic.IPSAppUILogic{

	
	
	/**
	 * 获取默认打开数据视图
	 * @return
	 */
	net.ibizsys.model.app.logic.IPSAppUILogicRefView getOpenDataPSAppView();


	/**
	 * 获取默认打开数据视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.logic.IPSAppUILogicRefView getOpenDataPSAppViewMust();
	
	
	/**
	 * 获取多模式打开数据视图集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.logic.IPSAppUILogicRefView> getOpenDataPSAppViews();
	
	/**
	 * 获取多模式打开数据视图集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.logic.IPSAppUILogicRefView getOpenDataPSAppUILogicRefView(Object objKey, boolean bTryMode);
	
	/**
	 * 设置多模式打开数据视图集合
	 * @param list 多模式打开数据视图集合
	 */
	void setOpenDataPSAppUILogicRefViews(java.util.List<net.ibizsys.model.app.logic.IPSAppUILogicRefView> list);
	
	
	/**
	 * 获取是否编辑模式
	 * @return
	 */
	boolean isEditMode();
}