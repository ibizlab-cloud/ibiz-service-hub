package net.ibizsys.model.dataentity.defield.valuerule;



/**
 * 实体属性值规则标准条件模型对象接口
 * <P>
 * 扩展父接口类型[SIMPLE]
 *
 */
public interface IPSDEFVRSimpleCondition extends net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRSingleCondition{

	
	
	/**
	 * 获取条件操作
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSDBVALUEOPID}
	 * @return
	 */
	java.lang.String getCondOp();
	
	
	/**
	 * 获取参数类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PARAMTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEFVRParamType}
	 * @return
	 */
	java.lang.String getParamType();
	
	
	/**
	 * 获取参数值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_CONDVALUE}
	 * @return
	 */
	java.lang.String getParamValue();
}