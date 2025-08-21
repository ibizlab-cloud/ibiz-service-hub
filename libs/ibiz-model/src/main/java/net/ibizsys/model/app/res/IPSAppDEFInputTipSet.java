package net.ibizsys.model.app.res;



/**
 * 应用实体属性提示集合模型对象接口
 *
 */
public interface IPSAppDEFInputTipSet extends net.ibizsys.model.app.IPSApplicationObject
		,net.ibizsys.model.res.IPSDEFInputTipSet{

	
	
	/**
	 * 获取内容应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getContentPSAppDEField();


	/**
	 * 获取内容应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getContentPSAppDEFieldMust();
	
	
	/**
	 * 获取关闭标志应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getEnableClosePSAppDEField();


	/**
	 * 获取关闭标志应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getEnableClosePSAppDEFieldMust();
	
	
	/**
	 * 获取链接应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getLinkPSAppDEField();


	/**
	 * 获取链接应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getLinkPSAppDEFieldMust();
	
	
	/**
	 * 获取应用实体数据集合
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet();


	/**
	 * 获取应用实体数据集合，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSetMust();
	
	
	/**
	 * 获取应用实体
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity();


	/**
	 * 获取应用实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust();
	
	
	/**
	 * 获取唯一标记应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getUniqueTagPSAppDEField();


	/**
	 * 获取唯一标记应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getUniqueTagPSAppDEFieldMust();
}