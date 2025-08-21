package net.ibizsys.model.dataentity.ds;



/**
 * 实体数据集合参数模型对象接口
 *
 */
public interface IPSDEDataSetParam extends net.ibizsys.model.IPSModelObject
		,net.ibizsys.model.IPSModelSortable{

	
	
	/**
	 * 获取实体属性搜索模式
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEFSearchMode getPSDEFSearchMode();


	/**
	 * 获取实体属性搜索模式，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEFSearchMode getPSDEFSearchModeMust();
	
	
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
	 * 获取参数描述
	 * @return
	 */
	java.lang.String getParamDesc();
	
	
	/**
	 * 获取参数标记
	 * @return
	 */
	java.lang.String getParamTag();
	
	
	/**
	 * 获取参数标记2
	 * @return
	 */
	java.lang.String getParamTag2();
	
	
	/**
	 * 获取标准数据类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
	
	
	/**
	 * 获取值或属性
	 * @return
	 */
	java.lang.String getValue();
	
	
	/**
	 * 获取值类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEActionParamValueType}
	 * @return
	 */
	java.lang.String getValueType();
	
	
	/**
	 * 获取是否允许空输入
	 * @return
	 */
	boolean isAllowEmpty();
	
	
	/**
	 * 获取是否数组
	 * @return
	 */
	boolean isArray();
}