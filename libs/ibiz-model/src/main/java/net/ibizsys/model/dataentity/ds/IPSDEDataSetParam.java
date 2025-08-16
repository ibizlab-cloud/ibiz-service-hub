package net.ibizsys.model.dataentity.ds;



/**
 * 实体数据集合参数模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEDSParamDTO}运行时对象
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDSParamDTO#FIELD_PARAMDESC}
	 * @return
	 */
	java.lang.String getParamDesc();
	
	
	/**
	 * 获取参数标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDSParamDTO#FIELD_PARAMTAG}
	 * @return
	 */
	java.lang.String getParamTag();
	
	
	/**
	 * 获取参数标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDSParamDTO#FIELD_PARAMTAG2}
	 * @return
	 */
	java.lang.String getParamTag2();
	
	
	/**
	 * 获取标准数据类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDSParamDTO#FIELD_STDDATATYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
	
	
	/**
	 * 获取值或属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDSParamDTO#FIELD_VALUE}
	 * @return
	 */
	java.lang.String getValue();
	
	
	/**
	 * 获取值类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDSParamDTO#FIELD_VALUETYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEActionParamValueType}
	 * @return
	 */
	java.lang.String getValueType();
	
	
	/**
	 * 获取是否允许空输入
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDSParamDTO#FIELD_ALLOWEMPTY}
	 * @return
	 */
	boolean isAllowEmpty();
	
	
	/**
	 * 获取是否数组
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDSParamDTO#FIELD_ARRAYFLAG}
	 * @return
	 */
	boolean isArray();
}