package net.ibizsys.model.database;



/**
 *
 */
public interface IPSDEDBIndexField extends net.ibizsys.model.database.IPSDBIndexColumnBase
		,net.ibizsys.model.IPSModelSortable{

	
	
	/**
	 * 获取排序值
	 * @return
	 */
	int getOrderValue();
	
	
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