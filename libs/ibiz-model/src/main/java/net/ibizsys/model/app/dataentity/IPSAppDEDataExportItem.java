package net.ibizsys.model.app.dataentity;



/**
 * 应用实体数据导出数据项模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEGridColDTO}运行时对象
 *
 */
public interface IPSAppDEDataExportItem extends net.ibizsys.model.dataentity.dataexport.IPSDEDataExportItem{

	
	
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