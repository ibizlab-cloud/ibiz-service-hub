package net.ibizsys.model.control.list;



/**
 * 实体列表部件数据项模型对象接口
 *
 */
public interface IPSDEListDataItem extends net.ibizsys.model.control.list.IPSListDataItem{

	
	
	/**
	 * 获取关联应用实体属性
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEField();


	/**
	 * 获取关联应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEFieldMust();
}