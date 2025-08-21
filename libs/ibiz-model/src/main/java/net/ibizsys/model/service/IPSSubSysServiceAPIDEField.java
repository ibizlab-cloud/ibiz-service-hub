package net.ibizsys.model.service;



/**
 * 外部系统服务接口实体属性模型对象接口
 *
 */
public interface IPSSubSysServiceAPIDEField extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取代码名称2
	 * @return
	 */
	java.lang.String getCodeName2();
	
	
	/**
	 * 获取数据类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEFDataType}
	 * @return
	 */
	java.lang.String getDataType();
	
	
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
	 * 获取属性类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SubSysSADEFieldType}
	 * @return
	 */
	java.lang.String getFieldType();
	
	
	/**
	 * 获取属性长度
	 * @return
	 */
	int getLength();
	
	
	/**
	 * 获取逻辑名称
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取代码表
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getPSCodeList();


	/**
	 * 获取代码表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getPSCodeListMust();
	
	
	/**
	 * 获取属性精度
	 * @return
	 */
	int getPrecision();
	
	
	/**
	 * 获取预定义类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SubSysSADEFieldPredefinedType}
	 * @return
	 */
	java.lang.String getPredefinedType();
	
	
	/**
	 * 获取引用外部服务接口实体对象
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDE getRefPSSubSysServiceAPIDE();


	/**
	 * 获取引用外部服务接口实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDE getRefPSSubSysServiceAPIDEMust();
	
	
	/**
	 * 获取标准数据类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
	
	
	/**
	 * 获取是否允许空输入
	 * @return
	 */
	boolean isAllowEmpty();
	
	
	/**
	 * 获取是否属性为数组
	 * @return
	 */
	boolean isArray();
	
	
	/**
	 * 获取是否主键属性
	 * @return
	 */
	boolean isKeyDEField();
	
	
	/**
	 * 获取是否主信息属性
	 * @return
	 */
	boolean isMajorDEField();
}