package net.ibizsys.model.dynamodel;



/**
 *
 */
public interface IPSJsonNodeSchema extends net.ibizsys.model.dynamodel.IPSJsonNode{

	
	
	/**
	 * 获取描述信息
	 * @return
	 */
	java.lang.String getDescription();
	
	
	/**
	 * 获取引用模型标识
	 * @return
	 */
	java.lang.String getRefSchemaId();
	
	
	/**
	 * 获取类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.JsonPropertyType}
	 * @return
	 */
	java.lang.String getType();
	
	
	/**
	 * 获取是否引用模型模式
	 * @return
	 */
	boolean isRefMode();
}