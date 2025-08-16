package net.ibizsys.model.dataentity.defield.valuerule;



/**
 * 实体属性值规则单项条件模型基础对象接口
 *
 */
public interface IPSDEFVRSingleCondition extends net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition{

	
	
	/**
	 * 获取属性名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEFVRCondDTO#FIELD_CUSTOMDEFNAME}、{@link net.ibizsys.centralstudio.dto.PSDEFVRCondDTO#FIELD_PSDEFID}
	 * @return
	 */
	java.lang.String getDEFName();
}