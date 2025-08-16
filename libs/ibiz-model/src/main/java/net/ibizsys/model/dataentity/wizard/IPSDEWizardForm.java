package net.ibizsys.model.dataentity.wizard;



/**
 * 实体向导表单模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEWizardFormDTO}运行时对象
 *
 */
public interface IPSDEWizardForm extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取下一步确认信息2语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardFormDTO#FIELD_CMPSLANRESID2}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCM2PSLanguageRes();


	/**
	 * 获取下一步确认信息2语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCM2PSLanguageResMust();
	
	
	/**
	 * 获取下一步确认信息语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardFormDTO#FIELD_CMPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCMPSLanguageRes();


	/**
	 * 获取下一步确认信息语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getCMPSLanguageResMust();
	
	
	/**
	 * 获取下一步确认信息
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardFormDTO#FIELD_CONFIRMINFO}
	 * @return
	 */
	java.lang.String getConfirmMsg();
	
	
	/**
	 * 获取下一步确认信息2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardFormDTO#FIELD_CONFIRMINFO2}
	 * @return
	 */
	java.lang.String getConfirmMsg2();
	
	
	/**
	 * 获取向导表单标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardFormDTO#FIELD_FORMTAG}
	 * @return
	 */
	java.lang.String getFormTag();
	
	
	/**
	 * 获取完成启用脚本代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardFormDTO#FIELD_FINISHENABLELOGIC}
	 * @return
	 */
	java.lang.String getGoFinishEnableScriptCode();
	
	
	/**
	 * 获取下一步启用脚本代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardFormDTO#FIELD_NEXTENABLELOGIC}
	 * @return
	 */
	java.lang.String getGoNextEnableScriptCode();
	
	
	/**
	 * 获取上一步启用脚本代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardFormDTO#FIELD_PREVENABLELOGIC}
	 * @return
	 */
	java.lang.String getGoPrevEnableScriptCode();
	
	
	/**
	 * 获取实体表单名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardFormDTO#FIELD_PSDEFORMNAME}
	 * @return
	 */
	java.lang.String getPSDEFormName();
	
	
	/**
	 * 获取向导步骤对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardFormDTO#FIELD_PSDEWIZARDSTEPID}
	 * @return
	 */
	net.ibizsys.model.dataentity.wizard.IPSDEWizardStep getPSDEWizardStep();


	/**
	 * 获取向导步骤对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.wizard.IPSDEWizardStep getPSDEWizardStepMust();
	
	
	/**
	 * 获取向导步骤行为
	 * @return
	 */
	java.lang.String[] getStepActions();
	
	
	/**
	 * 获取向导步骤标记
	 * @return
	 */
	java.lang.String getStepTag();
	
	
	/**
	 * 获取是否首表单
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardFormDTO#FIELD_FIRSTFORM}
	 * @return
	 */
	boolean isFirstForm();
}