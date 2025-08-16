package net.ibizsys.model.dataentity.defield.valuerule;



/**
 * 实体属性值规则数值范围条件模型对象接口
 * <P>
 * 扩展父接口类型[VALUERANGE2]
 *
 */
public interface IPSDEFVRValueRange2Condition extends net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRSingleCondition{

	
	
	/**
	 * 获取最大值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PARAM8}
	 * @return
	 */
	java.lang.Double getMaxValue();
	
	
	/**
	 * 获取最小值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PARAM7}
	 * @return
	 */
	java.lang.Double getMinValue();
	
	
	/**
	 * 获取是否含最大值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PARAM6}
	 * @return
	 */
	boolean isIncludeMaxValue();
	
	
	/**
	 * 获取是否含最小值
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PARAM5}
	 * @return
	 */
	boolean isIncludeMinValue();
}