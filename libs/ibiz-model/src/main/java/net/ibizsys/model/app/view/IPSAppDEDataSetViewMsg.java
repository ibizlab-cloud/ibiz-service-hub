package net.ibizsys.model.app.view;



/**
 * 应用实体数据集视图消息模型对象接口
 * <P>
 * 扩展父接口类型[1]
 *
 */
public interface IPSAppDEDataSetViewMsg extends net.ibizsys.model.app.view.IPSAppViewMsg
		,net.ibizsys.model.view.IPSDEDataSetViewMsg{

	
	
	/**
	 * 获取缓存范围
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ViewMsgCacheScope}
	 * @return
	 */
	java.lang.String getCacheScope();
	
	
	/**
	 * 获取缓存标记2应用实体属性对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getCacheTag2PSAppDEField();


	/**
	 * 获取缓存标记2应用实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getCacheTag2PSAppDEFieldMust();
	
	
	/**
	 * 获取缓存标记应用实体属性对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getCacheTagPSAppDEField();


	/**
	 * 获取缓存标记应用实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getCacheTagPSAppDEFieldMust();
	
	
	/**
	 * 获取缓存超时
	 * @return
	 */
	int getCacheTimeout();
	
	
	/**
	 * 获取消息内容应用实体属性对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getContentPSAppDEField();


	/**
	 * 获取消息内容应用实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getContentPSAppDEFieldMust();
	
	
	/**
	 * 获取内容类型应用实体属性对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getContentTypePSAppDEField();


	/**
	 * 获取内容类型应用实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getContentTypePSAppDEFieldMust();
	
	
	/**
	 * 获取显示位置应用实体属性对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getMsgPosPSAppDEField();


	/**
	 * 获取显示位置应用实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getMsgPosPSAppDEFieldMust();
	
	
	/**
	 * 获取消息类型标记应用实体属性对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getMsgTypePSAppDEField();


	/**
	 * 获取消息类型标记应用实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getMsgTypePSAppDEFieldMust();
	
	
	/**
	 * 获取显示次序应用实体属性对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getOrderValuePSAppDEField();


	/**
	 * 获取显示次序应用实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getOrderValuePSAppDEFieldMust();
	
	
	/**
	 * 获取应用实体数据集合对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet();


	/**
	 * 获取应用实体数据集合对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSetMust();
	
	
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
	 * 获取移除标志应用实体属性对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getRemoveFlagPSAppDEField();


	/**
	 * 获取移除标志应用实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getRemoveFlagPSAppDEFieldMust();
	
	
	/**
	 * 获取抬头语言标记应用实体属性对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTitleLanResTagPSAppDEField();


	/**
	 * 获取抬头语言标记应用实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTitleLanResTagPSAppDEFieldMust();
	
	
	/**
	 * 获取抬头应用实体属性对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTitlePSAppDEField();


	/**
	 * 获取抬头应用实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTitlePSAppDEFieldMust();
	
	
	/**
	 * 获取是否支持缓存
	 * @return
	 */
	boolean isEnableCache();
}