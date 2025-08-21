package net.ibizsys.model.control.wizardpanel;



/**
 * 向导面板部件模型对象基础接口
 *
 */
public interface IPSWizardPanel extends net.ibizsys.model.control.IPSAjaxControl
		,net.ibizsys.model.control.IPSControlContainer{

	
	
	/**
	 * 获取内置式样
	 * @return
	 */
	java.lang.String getWizardStyle();
}