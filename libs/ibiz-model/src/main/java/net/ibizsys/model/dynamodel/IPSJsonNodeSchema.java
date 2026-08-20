package net.ibizsys.model.dynamodel;



/**
 *
 */
public interface IPSJsonNodeSchema extends net.ibizsys.model.dynamodel.IPSJsonNode{

	
	
	/**
	 * 获取描述信息
	 * @return
	 */
	String getDescription();
	
	
	/**
	 * 获取引用模型标识
	 * @return
	 */
	String getRefSchemaId();
	
	
	/**
	 * 获取类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.JsonNodeType}
	 * @return
	 */
	String getType();
	
	
	/**
	 * 获取是否引用模型模式
	 * @return
	 */
	boolean isRefMode();
}