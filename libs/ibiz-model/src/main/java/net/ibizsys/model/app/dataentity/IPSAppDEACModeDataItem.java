package net.ibizsys.model.app.dataentity;



/**
 * 应用实体自动填充数据项模型对象接口
 *
 */
public interface IPSAppDEACModeDataItem extends net.ibizsys.model.dataentity.ac.IPSDEACModeDataItem{

	
	
	/**
	 * 获取应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEField();


	/**
	 * 获取应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEFieldMust();
}