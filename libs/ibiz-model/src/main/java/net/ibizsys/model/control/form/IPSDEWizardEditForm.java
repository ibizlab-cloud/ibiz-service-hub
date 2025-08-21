package net.ibizsys.model.control.form;



/**
 * 实体向导编辑表单模型对象接口
 *
 */
public interface IPSDEWizardEditForm extends net.ibizsys.model.control.form.IPSDEEditForm{

	
	
	/**
	 * 获取回退数据行为
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getGoBackPSControlAction();


	/**
	 * 获取回退数据行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getGoBackPSControlActionMust();
	
	
	/**
	 * 获取实体向导表单对象
	 * @return
	 */
	net.ibizsys.model.dataentity.wizard.IPSDEWizardForm getPSDEWizardForm();


	/**
	 * 获取实体向导表单对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.wizard.IPSDEWizardForm getPSDEWizardFormMust();
}