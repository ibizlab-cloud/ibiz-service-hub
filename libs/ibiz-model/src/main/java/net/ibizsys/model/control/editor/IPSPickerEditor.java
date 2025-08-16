package net.ibizsys.model.control.editor;



/**
 * 数据选择编辑器模型基础对象接口
 *
 */
public interface IPSPickerEditor extends net.ibizsys.model.control.IPSEditor
		,net.ibizsys.model.control.IPSNavigateParamContainer{

	
	
	/**
	 * 获取附加上下文Json字符串
	 * @return
	 */
	java.lang.String getContextJOString();
	
	
	/**
	 * 获取项参数对象
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getItemParamJO();
	
	
	/**
	 * 获取附加参数Json字符串
	 * @return
	 */
	java.lang.String getParamJOString();
	
	
	/**
	 * 获取选择视图
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getPickupPSAppView();


	/**
	 * 获取选择视图，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.view.IPSAppView getPickupPSAppViewMust();
	
	
	/**
	 * 获取是否支持选择视图
	 * @return
	 */
	boolean isEnablePickupView();
}