package net.ibizsys.model.dataentity.wizard;



/**
 * 实体向导逻辑模型对象接口
 *
 */
public interface IPSDEWizardLogic extends net.ibizsys.model.dataentity.logic.IPSDEUILogicGroupDetail{

	
	
	/**
	 * 获取向导表单标识
	 * @return
	 */
	java.lang.String getPSDEWizardFormId();
	
	
	/**
	 * 获取向导表单名称
	 * @return
	 */
	java.lang.String getPSDEWizardFormName();
	
	
	/**
	 * 获取向导表单标记
	 * @return
	 */
	java.lang.String getPSDEWizardFormTag();
	
	
	/**
	 * 获取向导步骤标识
	 * @return
	 */
	java.lang.String getPSDEWizardStepId();
	
	
	/**
	 * 获取向导步骤名称
	 * @return
	 */
	java.lang.String getPSDEWizardStepName();
	
	
	/**
	 * 获取向导步骤标记
	 * @return
	 */
	java.lang.String getPSDEWizardStepTag();
}