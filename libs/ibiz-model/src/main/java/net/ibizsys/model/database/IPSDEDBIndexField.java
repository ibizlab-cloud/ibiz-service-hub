package net.ibizsys.model.database;



/**
 *
 */
public interface IPSDEDBIndexField extends net.ibizsys.model.database.IPSDBIndexColumnBase{

	
	
	/**
	 * 获取索引属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField();


	/**
	 * 获取索引属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust();
}