package net.ibizsys.model.app.dataentity;



/**
 * 实体映射模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEMapDTO}运行时对象
 *
 */
public interface IPSAppDEMap extends net.ibizsys.model.dataentity.datamap.IPSDEMap{

	
	
	/**
	 * 获取目标应用实体
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getDstPSAppDataEntity();


	/**
	 * 获取目标应用实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getDstPSAppDataEntityMust();
	
	
	/**
	 * 获取映射行为集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMapAction> getPSAppDEMapActions();
	
	/**
	 * 获取映射行为集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMapAction getPSAppDEMapAction(Object objKey, boolean bTryMode);
	
	/**
	 * 设置映射行为集合
	 * @param list 映射行为集合
	 */
	void setPSAppDEMapActions(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMapAction> list);
	
	
	/**
	 * 获取映射数据集集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMapDataSet> getPSAppDEMapDataSets();
	
	/**
	 * 获取映射数据集集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMapDataSet getPSAppDEMapDataSet(Object objKey, boolean bTryMode);
	
	/**
	 * 设置映射数据集集合
	 * @param list 映射数据集集合
	 */
	void setPSAppDEMapDataSets(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMapDataSet> list);
	
	
	/**
	 * 获取映射属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMapField> getPSAppDEMapFields();
	
	/**
	 * 获取映射属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEMapField getPSAppDEMapField(Object objKey, boolean bTryMode);
	
	/**
	 * 设置映射属性集合
	 * @param list 映射属性集合
	 */
	void setPSAppDEMapFields(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMapField> list);
}