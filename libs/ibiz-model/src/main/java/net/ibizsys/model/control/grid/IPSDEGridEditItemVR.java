package net.ibizsys.model.control.grid;



/**
 * 实体表格编辑项值规则模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEGEIVRDTO}运行时对象
 *
 */
public interface IPSDEGridEditItemVR extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取检查模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGEIVRDTO#FIELD_CHECKMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.EditItemVRCheckMode}
	 * @return
	 */
	int getCheckMode();
	
	
	/**
	 * 获取属性值规则 
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGEIVRDTO#FIELD_PSDEFVRID}
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule getPSDEFValueRule();


	/**
	 * 获取属性值规则 ，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule getPSDEFValueRuleMust();
	
	
	/**
	 * 获取表格编辑项名称
	 * @return
	 */
	java.lang.String getPSDEGridEditItemName();
	
	
	/**
	 * 获取系统值规则
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGEIVRDTO#FIELD_PSSYSVALUERULEID}
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
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEGEIVRDTO#FIELD_VRTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.TargetVRType}
	 * @return
	 */
	java.lang.String getValueRuleType();
}