package net.ibizsys.model.eai;



/**
 *
 */
public interface IPSEAIDEField extends net.ibizsys.model.eai.IPSEAIDEObject
		,net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	String getCodeName();
	
	
	/**
	 * 获取映射目标类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.EAIDEFieldMapType}
	 * @return
	 */
	String getDstType();
	
	
	/**
	 * 获取实体属性映射标记
	 * @return
	 */
	String getFieldTag();
	
	
	/**
	 * 获取实体属性映射标记2
	 * @return
	 */
	String getFieldTag2();
	
	
	/**
	 * 获取实体属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField();


	/**
	 * 获取实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust();
}