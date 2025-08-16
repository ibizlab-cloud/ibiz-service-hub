package net.ibizsys.model.service;



/**
 *
 */
public interface IPSSysMethodDTOField extends net.ibizsys.model.dataentity.defield.IPSDEFieldBase
		,net.ibizsys.model.IPSModelSortable
		,net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取默认值
	 * @return
	 */
	java.lang.String getDefaultValue();
	
	
	/**
	 * 获取默认值类型
	 * @return
	 */
	java.lang.String getDefaultValueType();
	
	
	/**
	 * 获取属性标记
	 * @return
	 */
	java.lang.String getFieldTag();
	
	
	/**
	 * 获取属性标记2
	 * @return
	 */
	java.lang.String getFieldTag2();
	
	
	/**
	 * 获取Json格式化
	 * @return
	 */
	java.lang.String getJsonFormat();
	
	
	/**
	 * 获取中文名称
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取引用实体方法DTO对象
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEMethodDTO getRefPSDEMethodDTO();


	/**
	 * 获取引用实体方法DTO对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEMethodDTO getRefPSDEMethodDTOMust();
	
	
	/**
	 * 获取引用实体对象
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getRefPSDataEntity();


	/**
	 * 获取引用实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getRefPSDataEntityMust();
	
	
	/**
	 * 获取引用系统方法DTO对象
	 * @return
	 */
	net.ibizsys.model.service.IPSSysMethodDTO getRefPSSysMethodDTO();


	/**
	 * 获取引用系统方法DTO对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSysMethodDTO getRefPSSysMethodDTOMust();
	
	
	/**
	 * 获取DTO属性来源类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEMethodDTOFieldSourceType}
	 * @return
	 */
	java.lang.String getSourceType();
	
	
	/**
	 * 获取标准数据类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
	
	
	/**
	 * 获取系统DTO对象属性类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEMethodDTOFieldType}
	 * @return
	 */
	java.lang.String getType();
	
	
	/**
	 * 获取是否允许空输入
	 * @return
	 */
	boolean isAllowEmpty();
	
	
	/**
	 * 获取是否只读属性
	 * @return
	 */
	boolean isReadOnly();
}