package net.ibizsys.model.dataentity.action;



/**
 *
 */
public interface IPSDEActionVR extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取检查次序
	 * @return
	 */
	int getOrderValue();
	
	
	/**
	 * 获取属性值规则
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule getPSDEFValueRule();


	/**
	 * 获取属性值规则，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule getPSDEFValueRuleMust();
	
	
	/**
	 * 获取属性对象
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField();


	/**
	 * 获取属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust();
	
	
	/**
	 * 获取值规则类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TargetVRType}
	 * @return
	 */
	java.lang.String getValueRuleType();
}