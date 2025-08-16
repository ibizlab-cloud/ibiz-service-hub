package net.ibizsys.model.control.form;



/**
 * 实体工作流编辑表单模型基础对象接口
 *
 */
public interface IPSWFEditForm extends net.ibizsys.model.control.IPSControl{

	
	
	/**
	 * 获取流程启动行为
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getWFStartPSControlAction();


	/**
	 * 获取流程启动行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getWFStartPSControlActionMust();
	
	
	/**
	 * 获取流程提交行为
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getWFSubmitPSControlAction();


	/**
	 * 获取流程提交行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.control.IPSControlAction getWFSubmitPSControlActionMust();
}