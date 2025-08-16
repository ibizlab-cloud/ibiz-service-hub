package net.ibizsys.model.app.bi;



/**
 * 应用智能立方体维度体系模型对象接口
 *
 */
public interface IPSAppBICubeHierarchy extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取全部数据标题
	 * @return
	 */
	java.lang.String getAllCaption();
	
	
	/**
	 * 获取体系标记
	 * @return
	 */
	java.lang.String getHierarchyTag();
	
	
	/**
	 * 获取体系标记2
	 * @return
	 */
	java.lang.String getHierarchyTag2();
	
	
	/**
	 * 获取智能立方体维度体系级别集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.app.bi.IPSAppBICubeLevel> getPSAppBICubeLevels();
	
	/**
	 * 获取智能立方体维度体系级别集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.app.bi.IPSAppBICubeLevel getPSAppBICubeLevel(Object objKey, boolean bTryMode);
	
	/**
	 * 设置智能立方体维度体系级别集合
	 * @param list 智能立方体维度体系级别集合
	 */
	void setPSAppBICubeLevels(java.util.List<net.ibizsys.model.app.bi.IPSAppBICubeLevel> list);
	
	
	/**
	 * 获取相关应用实体对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity();


	/**
	 * 获取相关应用实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust();
	
	
	/**
	 * 获取是否启用全部数据
	 * @return
	 */
	boolean hasAll();
}