package net.ibizsys.model.dataentity.wizard;



/**
 * 实体向导逻辑模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEWizardLogicDTO}运行时对象
 *
 */
public interface IPSDEWizardLogic extends net.ibizsys.model.dataentity.logic.IPSDEUILogicGroupDetail{

	
	
	/**
	 * 获取向导表单标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardLogicDTO#FIELD_PSDEWIZARDFORMID}
	 * @return
	 */
	java.lang.String getPSDEWizardFormId();
	
	
	/**
	 * 获取向导表单名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardLogicDTO#FIELD_PSDEWIZARDFORMNAME}
	 * @return
	 */
	java.lang.String getPSDEWizardFormName();
	
	
	/**
	 * 获取向导表单标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardLogicDTO#FIELD_FORMTAG}
	 * @return
	 */
	java.lang.String getPSDEWizardFormTag();
	
	
	/**
	 * 获取向导步骤标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardLogicDTO#FIELD_PSDEWIZARDSTEPID}
	 * @return
	 */
	java.lang.String getPSDEWizardStepId();
	
	
	/**
	 * 获取向导步骤名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardLogicDTO#FIELD_PSDEWIZARDSTEPNAME}
	 * @return
	 */
	java.lang.String getPSDEWizardStepName();
	
	
	/**
	 * 获取向导步骤标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardLogicDTO#FIELD_STEPTAG}
	 * @return
	 */
	java.lang.String getPSDEWizardStepTag();
}