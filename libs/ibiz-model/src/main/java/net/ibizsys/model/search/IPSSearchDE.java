package net.ibizsys.model.search;



/**
 *
 */
public interface IPSSearchDE extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
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
	 * 获取实体对象
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity();


	/**
	 * 获取实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust();
	
	
	/**
	 * 获取是否作为NoSQL存储
	 * @return
	 */
	boolean isNoSQLStorage();
}