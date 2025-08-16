package net.ibizsys.model.dataentity.wizard;



/**
 * 实体向导步骤模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEWizardStepDTO}运行时对象
 *
 */
public interface IPSDEWizardStep extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取图标资源对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardStepDTO#FIELD_PSSYSIMAGEID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImage();


	/**
	 * 获取图标资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysImage getPSSysImageMust();
	
	
	/**
	 * 获取步骤标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardStepDTO#FIELD_STEPTAG}
	 * @return
	 */
	java.lang.String getStepTag();
	
	
	/**
	 * 获取子抬头
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardStepDTO#FIELD_SUBTITLE}
	 * @return
	 */
	java.lang.String getSubTitle();
	
	
	/**
	 * 获取子抬头语言资源对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardStepDTO#FIELD_SUBTITLEPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getSubTitlePSLanguageRes();


	/**
	 * 获取子抬头语言资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getSubTitlePSLanguageResMust();
	
	
	/**
	 * 获取抬头
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardStepDTO#FIELD_PSDEWIZARDSTEPNAME}
	 * @return
	 */
	java.lang.String getTitle();
	
	
	/**
	 * 获取抬头语言资源对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardStepDTO#FIELD_LNPSLANRESID}
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageRes();


	/**
	 * 获取抬头语言资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageResMust();
	
	
	/**
	 * 获取抬头样式表对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardStepDTO#FIELD_PSSYSCSSID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getTitlePSSysCss();


	/**
	 * 获取抬头样式表对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysCss getTitlePSSysCssMust();
	
	
	/**
	 * 获取是否支持链接
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardStepDTO#FIELD_ENABLELINK}
	 * @return
	 */
	boolean isEnableLink();
}