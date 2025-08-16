package net.ibizsys.model.database;



/**
 *
 */
public interface IPSSysDBIndexColumn extends net.ibizsys.model.database.IPSDBIndexColumnBase{

	
	
	/**
	 * 获取索引列
	 * @return
	 */
	net.ibizsys.model.database.IPSSysDBColumn getPSSysDBColumn();


	/**
	 * 获取索引列，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.database.IPSSysDBColumn getPSSysDBColumnMust();
}