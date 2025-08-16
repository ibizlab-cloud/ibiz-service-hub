package net.ibizsys.model.control.wizardpanel;



/**
 * 向导面板部件模型对象基础接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEWizardDTO}运行时对象
 *
 */
public interface IPSWizardPanel extends net.ibizsys.model.control.IPSAjaxControl
		,net.ibizsys.model.control.IPSControlContainer{

	
	
	/**
	 * 获取内置式样
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEWizardDTO#FIELD_WIZARDSTYLE}
	 * @return
	 */
	java.lang.String getWizardStyle();
}