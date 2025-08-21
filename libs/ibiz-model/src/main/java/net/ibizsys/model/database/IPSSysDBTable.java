package net.ibizsys.model.database;



/**
 * 数据库表对象接口
 *
 */
public interface IPSSysDBTable extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取数据列集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.database.IPSSysDBColumn> getAllPSSysDBColumns();
	
	/**
	 * 获取数据列集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.database.IPSSysDBColumn getPSSysDBColumn(Object objKey, boolean bTryMode);
	
	/**
	 * 设置数据列集合
	 * @param list 数据列集合
	 */
	void setPSSysDBColumns(java.util.List<net.ibizsys.model.database.IPSSysDBColumn> list);
	
	
	/**
	 * 获取索引集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.database.IPSSysDBIndex> getAllPSSysDBIndices();
	
	/**
	 * 获取索引集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.database.IPSSysDBIndex getPSSysDBIndex(Object objKey, boolean bTryMode);
	
	/**
	 * 设置索引集合
	 * @param list 索引集合
	 */
	void setPSSysDBIndices(java.util.List<net.ibizsys.model.database.IPSSysDBIndex> list);
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取建立SQL
	 * @return
	 */
	java.lang.String getCreateSql();
	
	
	/**
	 * 获取移除SQL
	 * @return
	 */
	java.lang.String getDropSql();
	
	
	/**
	 * 获取逻辑名称 
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取数据表标记
	 * @return
	 */
	java.lang.String getTableTag();
	
	
	/**
	 * 获取数据表标记2
	 * @return
	 */
	java.lang.String getTableTag2();
	
	
	/**
	 * 获取是否自动扩展结构
	 * @return
	 */
	boolean isAutoExtendModel();
	
	
	/**
	 * 获取是否现有数据结构
	 * @return
	 */
	boolean isExistingModel();
}