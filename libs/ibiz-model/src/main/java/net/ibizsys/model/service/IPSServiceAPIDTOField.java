package net.ibizsys.model.service;



/**
 *
 */
public interface IPSServiceAPIDTOField extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取标准数据类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
	
	
	/**
	 * 获取外部服务接口DTO属性类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDomainFieldType}
	 * @return
	 */
	java.lang.String getType();
	
	
	/**
	 * 获取是否只读属性
	 * @return
	 */
	boolean isReadOnly();
}