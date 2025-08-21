package net.ibizsys.model.dataentity.dr;



/**
 *
 */
public interface IPSDEDRSysDER1NItem extends net.ibizsys.model.dataentity.dr.IPSDEDRItem{

	
	
	/**
	 * 获取实体关系对象
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getPSDER();


	/**
	 * 获取实体关系对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getPSDERMust();
}