package net.ibizsys.model.app.dataentity;



/**
 * 应用实体数据导出模型对象接口
 *
 */
public interface IPSAppDEDataExport extends net.ibizsys.model.dataentity.dataexport.IPSDEDataExport
		,net.ibizsys.model.app.dataentity.IPSAppDataEntityObject{

	
	
	/**
	 * 获取应用实体数据集合
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet();


	/**
	 * 获取应用实体数据集合，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSetMust();
}