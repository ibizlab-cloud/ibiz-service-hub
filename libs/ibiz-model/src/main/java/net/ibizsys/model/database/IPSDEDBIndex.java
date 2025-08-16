package net.ibizsys.model.database;



/**
 *
 */
public interface IPSDEDBIndex extends net.ibizsys.model.database.IPSDBIndexBase
		,net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取索引属性对象集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.database.IPSDEDBIndexField> getAllPSDEDBIndexFields();
	
	/**
	 * 获取索引属性对象集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.database.IPSDEDBIndexField getPSDEDBIndexField(Object objKey, boolean bTryMode);
	
	/**
	 * 设置索引属性对象集合
	 * @param list 索引属性对象集合
	 */
	void setPSDEDBIndexFields(java.util.List<net.ibizsys.model.database.IPSDEDBIndexField> list);
}