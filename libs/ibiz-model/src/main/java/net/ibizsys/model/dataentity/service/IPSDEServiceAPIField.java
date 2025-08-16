package net.ibizsys.model.dataentity.service;



/**
 * 服务接口实体属性模型对象接口
 *
 */
public interface IPSDEServiceAPIField extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.dataentity.defield.IPSDEFieldBase{

	
	
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
	 * 获取逻辑名称语言资源
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getLNPSLanguageRes();


	/**
	 * 获取逻辑名称语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getLNPSLanguageResMust();
	
	
	/**
	 * 获取逻辑名称
	 * @return
	 */
	java.lang.String getLogicName();
	
	
	/**
	 * 获取排序值
	 * @return
	 */
	int getOrderValue();
	
	
	/**
	 * 获取标准数据类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
	
	
	/**
	 * 获取字符串长度
	 * @return
	 */
	int getStringLength();
	
	
	/**
	 * 获取是否允许空输入
	 * @return
	 */
	boolean isAllowEmpty();
	
	
	/**
	 * 获取是否支持建立
	 * @return
	 */
	boolean isEnableCreate();
	
	
	/**
	 * 获取是否支持修改
	 * @return
	 */
	boolean isEnableModify();
	
	
	/**
	 * 获取是否主键属性
	 * @return
	 */
	boolean isKeyField();
	
	
	/**
	 * 获取是否主信息属性
	 * @return
	 */
	boolean isMajorField();
}