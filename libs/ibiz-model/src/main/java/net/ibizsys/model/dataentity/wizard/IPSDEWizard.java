package net.ibizsys.model.dataentity.wizard;



/**
 * 实体向导模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEWizardDTO}运行时对象
 *
 */
public interface IPSDEWizard extends net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取完成标题语言资源标识
	 * @return
	 */
	java.lang.String getFinishCapLanResTag();
	
	
	/**
	 * 获取完成标题语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardDTO#FIELD_FINISHPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getFinishCapPSLanguageRes();


	/**
	 * 获取完成标题语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getFinishCapPSLanguageResMust();
	
	
	/**
	 * 获取完成标题
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardDTO#FIELD_FINISHCAPTION}
	 * @return
	 */
	java.lang.String getFinishCaption();
	
	
	/**
	 * 获取首向导表单
	 * @return
	 */
	net.ibizsys.model.dataentity.wizard.IPSDEWizardForm getFirstPSDEWizardForm();


	/**
	 * 获取首向导表单，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.wizard.IPSDEWizardForm getFirstPSDEWizardFormMust();
	
	
	/**
	 * 获取下一步标题语言资源标识
	 * @return
	 */
	java.lang.String getNextCapLanResTag();
	
	
	/**
	 * 获取下一步标题语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardDTO#FIELD_NEXTPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getNextCapPSLanguageRes();


	/**
	 * 获取下一步标题语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getNextCapPSLanguageResMust();
	
	
	/**
	 * 获取下一步标题
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardDTO#FIELD_NEXTCAPTION}
	 * @return
	 */
	java.lang.String getNextCaption();
	
	
	/**
	 * 获取实体向导表单集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.wizard.IPSDEWizardForm> getPSDEWizardForms();
	
	/**
	 * 获取实体向导表单集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.wizard.IPSDEWizardForm getPSDEWizardForm(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体向导表单集合
	 * @param list 实体向导表单集合
	 */
	void setPSDEWizardForms(java.util.List<net.ibizsys.model.dataentity.wizard.IPSDEWizardForm> list);
	
	
	/**
	 * 获取实体向导步骤集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.wizard.IPSDEWizardStep> getPSDEWizardSteps();
	
	/**
	 * 获取实体向导步骤集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.wizard.IPSDEWizardStep getPSDEWizardStep(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体向导步骤集合
	 * @param list 实体向导步骤集合
	 */
	void setPSDEWizardSteps(java.util.List<net.ibizsys.model.dataentity.wizard.IPSDEWizardStep> list);
	
	
	/**
	 * 获取上一步标题语言资源标识
	 * @return
	 */
	java.lang.String getPrevCapLanResTag();
	
	
	/**
	 * 获取上一步标题语言资源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardDTO#FIELD_PREVPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getPrevCapPSLanguageRes();


	/**
	 * 获取上一步标题语言资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getPrevCapPSLanguageResMust();
	
	
	/**
	 * 获取上一步标题
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardDTO#FIELD_PREVCAPTION}
	 * @return
	 */
	java.lang.String getPrevCaption();
	
	
	/**
	 * 获取向导样式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardDTO#FIELD_WIZARDSTYLE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.WizardStyle}
	 * @return
	 */
	java.lang.String getWizardStyle();
	
	
	/**
	 * 获取是否启用主状态迁移逻辑
	 * @return
	 */
	boolean isEnableMainStateLogic();
	
	
	/**
	 * 获取是否状态向导
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardDTO#FIELD_STATEWIZARDFLAG}
	 * @return
	 */
	boolean isStateWizard();
}