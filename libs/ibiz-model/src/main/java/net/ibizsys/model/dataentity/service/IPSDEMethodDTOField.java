package net.ibizsys.model.dataentity.service;



/**
 * 实体方法DTO属性对象接口
 *
 */
public interface IPSDEMethodDTOField extends net.ibizsys.model.dataentity.defield.IPSDEFieldBase
		,net.ibizsys.model.IPSModelSortable
		,net.ibizsys.model.IPSModelObject{

	
	String getLowerCaseName();
	
	
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
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEFDefaultValueType}
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
	 * 获取实体属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField();


	/**
	 * 获取实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust();
	
	
	/**
	 * 获取嵌套数据主关系
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getPSDER();


	/**
	 * 获取嵌套数据主关系，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.der.IPSDERBase getPSDERMust();
	
	
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
	 * 获取相关的DTO对象
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEMethodDTO getRelatedPSDEMethodDTO();


	/**
	 * 获取相关的DTO对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEMethodDTO getRelatedPSDEMethodDTOMust();
	
	
	/**
	 * 获取相关的DTO属性对象
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEMethodDTOField getRelatedPSDEMethodDTOField();


	/**
	 * 获取相关的DTO属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEMethodDTOField getRelatedPSDEMethodDTOFieldMust();
	
	
	/**
	 * 获取相关的实体对象
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getRelatedPSDataEntity();


	/**
	 * 获取相关的实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getRelatedPSDataEntityMust();
	
	
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
	 * 获取实体DTO对象属性类型
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
	 * 获取是否忽略输出
	 * @return
	 */
	boolean isIgnoreOutput();
	
	
	/**
	 * 获取是否为List的MAP投射
	 * @return
	 */
	boolean isListMap();
	
	
	/**
	 * 获取是否只读属性
	 * @return
	 */
	boolean isReadOnly();
}