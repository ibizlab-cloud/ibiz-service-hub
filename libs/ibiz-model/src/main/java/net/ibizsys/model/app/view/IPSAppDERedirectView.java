package net.ibizsys.model.app.view;



/**
 * 应用实体重定向视图模型对象接口
 * <P>
 * 扩展父接口类型[DEREDIRECTVIEW]
 *
 */
public interface IPSAppDERedirectView extends net.ibizsys.model.app.view.IPSAppRedirectView
		,net.ibizsys.model.app.view.IPSAppDEView{

	
	
	/**
	 * 获取获取数据应用实体行为
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getGetDataPSAppDEAction();


	/**
	 * 获取获取数据应用实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getGetDataPSAppDEActionMust();
	
	
	/**
	 * 获取应用实体数据类型识别属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTypePSAppDEField();


	/**
	 * 获取应用实体数据类型识别属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getTypePSAppDEFieldMust();
	
	
	/**
	 * 获取是否自定义获取数据行为
	 * @return
	 */
	boolean isEnableCustomGetDataAction();
	
	
	/**
	 * 获取是否启用工作流
	 * @return
	 */
	boolean isEnableWorkflow();
}