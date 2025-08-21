package net.ibizsys.model.testing;



/**
 * 系统测试数据项模型对象接口
 *
 */
public interface IPSSysTestDataItem extends net.ibizsys.model.IPSModelObject{

	
	
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
	 * 获取相关实体属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField();


	/**
	 * 获取相关实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust();
	
	
	/**
	 * 获取系统示例值
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSampleValue getPSSysSampleValue();


	/**
	 * 获取系统示例值，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSampleValue getPSSysSampleValueMust();
	
	
	/**
	 * 获取引用实体数据集
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getRefPSDEDataSet();


	/**
	 * 获取引用实体数据集，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getRefPSDEDataSetMust();
	
	
	/**
	 * 获取引用实体
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getRefPSDataEntity();


	/**
	 * 获取引用实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getRefPSDataEntityMust();
	
	
	/**
	 * 获取标准数据类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
	
	
	/**
	 * 获取值
	 * @return
	 */
	java.lang.String getValue();
	
	
	/**
	 * 获取值类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TestDataItemValueType}
	 * @return
	 */
	java.lang.String getValueType();
	
	
	/**
	 * 获取值集合
	 * @return
	 */
	java.lang.String[] getValues();
	
	
	/**
	 * 获取是否空值
	 * @return
	 */
	boolean isNullValue();
}