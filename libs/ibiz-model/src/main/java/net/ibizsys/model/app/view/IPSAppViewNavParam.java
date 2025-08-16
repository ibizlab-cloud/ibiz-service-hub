package net.ibizsys.model.app.view;



/**
 * 应用视图导航参数模型对象接口
 *
 */
public interface IPSAppViewNavParam extends net.ibizsys.model.app.view.IPSAppViewParam
		,net.ibizsys.model.control.IPSNavigateParam{

	
	
	/**
	 * 获取是否直接值
	 * @return
	 */
	boolean isRawValue();
}