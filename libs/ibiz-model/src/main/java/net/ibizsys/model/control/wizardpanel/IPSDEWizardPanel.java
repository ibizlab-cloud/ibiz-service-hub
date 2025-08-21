package net.ibizsys.model.control.wizardpanel;



/**
 * 实体向导面板部件模型对象接口
 *
 */
public interface IPSDEWizardPanel extends net.ibizsys.model.control.wizardpanel.IPSWizardPanel{

	
	
	/**
	 * 获取完成行为
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getFinishPSControlAction();


	/**
	 * 获取完成行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getFinishPSControlActionMust();
	
	
	/**
	 * 获取初始化行为
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getInitPSControlAction();


	/**
	 * 获取初始化行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getInitPSControlActionMust();
	
	
	/**
	 * 获取实体编辑表单集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.control.form.IPSDEEditForm> getPSDEEditForms();
	
	/**
	 * 获取实体编辑表单集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.control.form.IPSDEEditForm getPSDEEditForm(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体编辑表单集合
	 * @param list 实体编辑表单集合
	 */
	void setPSDEEditForms(java.util.List<net.ibizsys.model.control.form.IPSDEEditForm> list);
	
	
	/**
	 * 获取实体向导对象
	 * @return
	 */
	net.ibizsys.model.dataentity.wizard.IPSDEWizard getPSDEWizard();


	/**
	 * 获取实体向导对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.wizard.IPSDEWizard getPSDEWizardMust();
	
	
	/**
	 * 获取状态应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getStatePSAppDEField();


	/**
	 * 获取状态应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getStatePSAppDEFieldMust();
	
	
	/**
	 * 获取是否显示操作栏
	 * @return
	 */
	boolean isShowActionBar();
	
	
	/**
	 * 获取是否显示步骤栏
	 * @return
	 */
	boolean isShowStepBar();
}