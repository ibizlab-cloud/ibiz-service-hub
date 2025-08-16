package net.ibizsys.model.dynamodel;



/**
 *
 */
public interface IPSJsonArraySchema extends net.ibizsys.model.dynamodel.IPSJsonNodeSchema{

	
	
	/**
	 * 获取是否支持额外节点
	 * @return
	 */
	boolean isEnableAdditionalItems();
	
	
	/**
	 * 获取是否唯一项限制
	 * @return
	 */
	boolean isEnableUniqueItems();
}