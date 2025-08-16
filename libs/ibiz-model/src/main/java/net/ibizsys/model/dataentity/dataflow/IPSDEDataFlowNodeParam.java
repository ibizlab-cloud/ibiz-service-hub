package net.ibizsys.model.dataentity.dataflow;



/**
 * 实体数据流节点参数模型对象接口
 *
 */
public interface IPSDEDataFlowNodeParam extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取聚合操作模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_AGGMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.AggMode}
	 * @return
	 */
	java.lang.String getAggMode();
	
	
	/**
	 * 获取目标属性名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_CUSTOMDSTPARAM}、{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DSTPSDEFNAME}
	 * @return
	 */
	java.lang.String getDstField();
	
	
	/**
	 * 获取目标列表参数起始位置
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DSTINDEX}
	 * @return
	 */
	int getDstIndex();
	
	
	/**
	 * 获取目标列表排序模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DSTSORTDIR}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SortDir}
	 * @return
	 */
	java.lang.String getDstSortDir();
	
	
	/**
	 * 获取表达式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DIRECTCODE}
	 * @return
	 */
	java.lang.String getExpression();
	
	
	/**
	 * 获取节点参数类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PARAMTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataFlowNodeParamType}
	 * @return
	 */
	java.lang.String getNodeParamType();
	
	
	/**
	 * 获取系统值序列对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSSYSSEQUENCEID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSequence getPSSysSequence();


	/**
	 * 获取系统值序列对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSequence getPSSysSequenceMust();
	
	
	/**
	 * 获取系统值转换器对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSSYSTRANSLATORID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysTranslator getPSSysTranslator();


	/**
	 * 获取系统值转换器对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysTranslator getPSSysTranslatorMust();
	
	
	/**
	 * 获取源属性名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_CUSTOMSRCPARAM}、{@link net.ibizsys.centralstudio.dto.DTO#FIELD_SRCPSDEFNAME}
	 * @return
	 */
	java.lang.String getSrcField();
	
	
	/**
	 * 获取源列表参数起始位置
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_SRCINDEX}
	 * @return
	 */
	int getSrcIndex();
	
	
	/**
	 * 获取源列表参数大小
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_SRCSIZE}
	 * @return
	 */
	int getSrcSize();
	
	
	/**
	 * 获取直接值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_SRCVALUE}
	 * @return
	 */
	java.lang.String getSrcValue();
	
	
	/**
	 * 获取源值标准数据类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_SRCVALUESTDDATATYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getSrcValueStdDataType();
	
	
	/**
	 * 获取源值类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_SRCVALUETYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataFlowParamValueType}
	 * @return
	 */
	java.lang.String getSrcValueType();
	
	
	/**
	 * 获取是否值输出转换
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_INOUTFLAG}
	 * @return
	 */
	boolean isOutTranslate();
}