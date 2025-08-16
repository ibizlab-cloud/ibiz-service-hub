package net.ibizsys.model.app.view;



/**
 * 应用视图界面行为模型对象接口
 *
 */
public interface IPSAppViewUIAction extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取应用计数器引用
	 * @return
	 */
	net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRef();


	/**
	 * 获取应用计数器引用，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRefMust();
	
	
	/**
	 * 获取界面行为对象
	 * @return
	 */
	net.ibizsys.model.view.IPSUIAction getPSUIAction();


	/**
	 * 获取界面行为对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.view.IPSUIAction getPSUIActionMust();
	
	
	/**
	 * 获取界面行为参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getUIActionParamJO();
	
	
	/**
	 * 获取界面行为操作目标
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.UIActionTarget}
	 * @return
	 */
	java.lang.String getUIActionTarget();
	
	
	/**
	 * 获取界面行为数据部件名称
	 * @return
	 */
	java.lang.String getXDataControlName();
	
	
	/**
	 * 获取是否先保存目标数据
	 * @return
	 */
	boolean isSaveTargetFirst();
}