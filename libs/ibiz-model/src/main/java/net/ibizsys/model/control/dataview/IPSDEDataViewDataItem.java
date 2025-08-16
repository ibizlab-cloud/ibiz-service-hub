package net.ibizsys.model.control.dataview;



/**
 * 实体卡片视图部件数据项模型对象接口
 *
 */
public interface IPSDEDataViewDataItem extends net.ibizsys.model.data.IPSDataItem{

	
	
	/**
	 * 获取前端代码表对象
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getFrontPSCodeList();


	/**
	 * 获取前端代码表对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.codelist.IPSCodeList getFrontPSCodeListMust();
	
	
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
	
	
	/**
	 * 获取脚本代码
	 * @return
	 */
	java.lang.String getScriptCode();
	
	
	/**
	 * 获取是否脚本代码模式
	 * @return
	 */
	boolean isCustomCode();
}