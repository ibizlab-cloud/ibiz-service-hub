package net.ibizsys.model.dataentity.ds;



/**
 * 实体数据集合分组模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEDSGrpParamDTO}运行时对象
 *
 */
public interface IPSDEDataSetGroupParam extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取聚合模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDSGrpParamDTO#FIELD_AGGMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AggMode}
	 * @return
	 */
	java.lang.String getAggMode();
	
	
	/**
	 * 获取别名
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDSGrpParamDTO#FIELD_ALIASNAME}
	 * @return
	 */
	java.lang.String getAlias();
	
	
	/**
	 * 获取分组代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDSGrpParamDTO#FIELD_GROUPCODE}
	 * @return
	 */
	java.lang.String getGroupCode();
	
	
	/**
	 * 获取分组连接代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDSGrpParamDTO#FIELD_GROUPJOINCODE}
	 * @return
	 */
	java.lang.String getGroupJoinCode();
	
	
	/**
	 * 获取实体属性，使用指定属性名称或分组项标识进行尝试获取
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDSGrpParamDTO#FIELD_CUSTOMDEFNAME}、{@link net.ibizsys.centralstudio.dto.PSDEDSGrpParamDTO#FIELD_PSDEFNAME}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField();


	/**
	 * 获取实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust();
	
	
	/**
	 * 获取选择代码
	 * @return
	 */
	java.lang.String getSelectCode();
	
	
	/**
	 * 获取排序方向
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDSGrpParamDTO#FIELD_ORDERDIR}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SortDir}
	 * @return
	 */
	java.lang.String getSortDir();
	
	
	/**
	 * 获取标准数据类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDSGrpParamDTO#FIELD_STDDATATYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
	
	
	/**
	 * 获取是否分组项
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDSGrpParamDTO#FIELD_GROUPFLAG}
	 * @return
	 */
	boolean isEnableGroup();
	
	
	/**
	 * 获取是否启用分组排序
	 * @return
	 */
	boolean isEnableSort();
}