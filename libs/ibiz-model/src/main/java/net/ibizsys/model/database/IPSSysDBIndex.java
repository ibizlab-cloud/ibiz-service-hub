package net.ibizsys.model.database;



/**
 *
 */
public interface IPSSysDBIndex extends net.ibizsys.model.database.IPSDBIndexBase{

	
	
	/**
	 * 获取索引列对象集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.database.IPSSysDBIndexColumn> getAllPSSysDBIndexColumns();
	
	/**
	 * 获取索引列对象集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.database.IPSSysDBIndexColumn getPSSysDBIndexColumn(Object objKey, boolean bTryMode);
	
	/**
	 * 设置索引列对象集合
	 * @param list 索引列对象集合
	 */
	void setPSSysDBIndexColumns(java.util.List<net.ibizsys.model.database.IPSSysDBIndexColumn> list);
	
	
	/**
	 * 获取是否移除模式
	 * @return
	 */
	boolean getRemoveFlag();
	
	
	/**
	 * 获取来源类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DBIndexSource}
	 * @return
	 */
	java.lang.String getSourceType();
}