package net.ibizsys.model.app.view;



/**
 * 应用视图界面引擎参数模型对象接口
 *
 */
public interface IPSAppViewEngineParam extends net.ibizsys.model.view.IPSUIEngineParam
		,net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取视图逻辑名称
	 * @return
	 */
	String getAppViewLogicName();
	
	
	/**
	 * 获取部件名称
	 * @return
	 */
	String getCtrlName();
	
	
	/**
	 * 获取参数类型
	 * @return
	 */
	String getParamType();
	
	
	/**
	 * 获取直接值
	 * @return
	 */
	Object getValue();
}