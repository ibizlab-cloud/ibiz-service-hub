package net.ibizsys.model.dataentity.defield.valuerule;



/**
 * 实体属性值规则值范围条件模型对象接口
 * <P>
 * 扩展父接口类型[VALUERANGE3]
 *
 */
public interface IPSDEFVRValueRange3Condition extends net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRSingleCondition{

	
	
	/**
	 * 获取值分隔符
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PARAM}
	 * @return
	 */
	java.lang.String getSeparator();
	
	
	/**
	 * 获取值集合
	 * @return
	 */
	java.lang.String[] getValueRanges();
}