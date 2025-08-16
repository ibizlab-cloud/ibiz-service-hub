package net.ibizsys.model.dynamodel;



/**
 *
 */
public interface IPSJsonObjectSchema extends net.ibizsys.model.dynamodel.IPSJsonNodeSchema{

	
	
	/**
	 * 获取是否支持扩展属性
	 * @return
	 */
	boolean isEnableAdditionalProperties();
}