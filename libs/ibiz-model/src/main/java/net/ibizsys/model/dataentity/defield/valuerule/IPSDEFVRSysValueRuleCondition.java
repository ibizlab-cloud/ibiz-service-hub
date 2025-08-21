package net.ibizsys.model.dataentity.defield.valuerule;



/**
 * 实体属性值规则系统值规则条件模型对象接口
 * <P>
 * 扩展父接口类型[SYSVALUERULE]
 *
 */
public interface IPSDEFVRSysValueRuleCondition extends net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRSingleCondition{

	
	
	/**
	 * 获取系统值规则对象
	 * @return
	 */
	net.ibizsys.model.valuerule.IPSSysValueRule getPSSysValueRule();


	/**
	 * 获取系统值规则对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.valuerule.IPSSysValueRule getPSSysValueRuleMust();
}