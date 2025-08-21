package net.ibizsys.model.control.form;



/**
 * 实体表单项值规则模型对象接口
 *
 */
public interface IPSDEFormItemVR extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取检查模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.EditItemVRCheckMode}
	 * @return
	 */
	int getCheckMode();
	
	
	/**
	 * 获取模型状态
	 * @return
	 */
	int getModelState();
	
	
	/**
	 * 获取属性值规则 
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule getPSDEFValueRule();


	/**
	 * 获取属性值规则 ，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule getPSDEFValueRuleMust();
	
	
	/**
	 * 获取表单项名称
	 * @return
	 */
	java.lang.String getPSDEFormItemName();
	
	
	/**
	 * 获取系统值规则
	 * @return
	 */
	net.ibizsys.model.valuerule.IPSSysValueRule getPSSysValueRule();


	/**
	 * 获取系统值规则，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.valuerule.IPSSysValueRule getPSSysValueRuleMust();
	
	
	/**
	 * 获取值规则类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TargetVRType}
	 * @return
	 */
	java.lang.String getValueRuleType();
}