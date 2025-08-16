package net.ibizsys.model.control;



/**
 * 单项数据界面部件模型基础对象接口
 *
 */
public interface IPSSDControl extends net.ibizsys.model.control.IPSControl{

	
	
	/**
	 * 获取当前数据属性
	 * @return
	 */
	java.lang.String getActiveDataField();
	
	
	/**
	 * 获取建立数据行为
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getCreatePSControlAction();


	/**
	 * 获取建立数据行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getCreatePSControlActionMust();
	
	
	/**
	 * 获取获取草稿数据行为（拷贝）
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getGetDraftFromPSControlAction();


	/**
	 * 获取获取草稿数据行为（拷贝），不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getGetDraftFromPSControlActionMust();
	
	
	/**
	 * 获取获取草稿数据行为
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getGetDraftPSControlAction();


	/**
	 * 获取获取草稿数据行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getGetDraftPSControlActionMust();
	
	
	/**
	 * 获取获取数据行为
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getGetPSControlAction();


	/**
	 * 获取获取数据行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getGetPSControlActionMust();
	
	
	/**
	 * 获取部件导航上下文集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.IPSControlNavContext> getPSControlNavContexts();
	
	/**
	 * 获取部件导航上下文集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.IPSControlNavContext getPSControlNavContext(Object objKey, boolean bTryMode);
	
	/**
	 * 设置部件导航上下文集合
	 * @param list 部件导航上下文集合
	 */
	void setPSControlNavContexts(java.util.List<net.ibizsys.model.control.IPSControlNavContext> list);
	
	
	/**
	 * 获取部件导航参数集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.IPSControlNavParam> getPSControlNavParams();
	
	/**
	 * 获取部件导航参数集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.IPSControlNavParam getPSControlNavParam(Object objKey, boolean bTryMode);
	
	/**
	 * 设置部件导航参数集合
	 * @param list 部件导航参数集合
	 */
	void setPSControlNavParams(java.util.List<net.ibizsys.model.control.IPSControlNavParam> list);
	
	
	/**
	 * 获取删除数据行为
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getRemovePSControlAction();


	/**
	 * 获取删除数据行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getRemovePSControlActionMust();
	
	
	/**
	 * 获取更新数据行为
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getUpdatePSControlAction();


	/**
	 * 获取更新数据行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getUpdatePSControlActionMust();
	
	
	/**
	 * 获取是否当前数据模式
	 * @return
	 */
	boolean isActiveDataMode();
	
	
	/**
	 * 获取是否只读模式
	 * @return
	 */
	boolean isReadOnly();
}