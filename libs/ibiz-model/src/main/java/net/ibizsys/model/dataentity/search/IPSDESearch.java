package net.ibizsys.model.dataentity.search;



/**
 *
 */
public interface IPSDESearch extends net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取实体标记
	 * @return
	 */
	java.lang.String getDETag();
	
	
	/**
	 * 获取实体标记2
	 * @return
	 */
	java.lang.String getDETag2();
	
	
	/**
	 * 获取全文检索实体
	 * @return
	 */
	net.ibizsys.model.search.IPSSysSearchDE getPSSysSearchDE();


	/**
	 * 获取全文检索实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.search.IPSSysSearchDE getPSSysSearchDEMust();
	
	
	/**
	 * 获取全文检索体系
	 * @return
	 */
	net.ibizsys.model.search.IPSSysSearchScheme getPSSysSearchScheme();


	/**
	 * 获取全文检索体系，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.search.IPSSysSearchScheme getPSSysSearchSchemeMust();
	
	
	/**
	 * 获取是否作为NoSQL存储
	 * @return
	 */
	boolean isNoSQLStorage();
}