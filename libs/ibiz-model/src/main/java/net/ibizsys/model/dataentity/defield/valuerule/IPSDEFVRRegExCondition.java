package net.ibizsys.model.dataentity.defield.valuerule;



/**
 * 实体属性值规则正则式条件模型对象接口
 * <P>
 * 扩展父接口类型[REGEX]
 *
 */
public interface IPSDEFVRRegExCondition extends net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRSingleCondition{

	
	
	/**
	 * 获取正则式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_CONDVALUE}
	 * @return
	 */
	java.lang.String getRegExCode();
}