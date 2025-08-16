package net.ibizsys.model.app.dataentity;



/**
 * 应用实体数据导入模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEDataImpDTO}运行时对象
 *
 */
public interface IPSAppDEDataImport extends net.ibizsys.model.dataentity.dataimport.IPSDEDataImport
		,net.ibizsys.model.app.dataentity.IPSAppDataEntityObject{

	
	
	/**
	 * 获取建立应用实体行为
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataImpDTO#FIELD_CREATEPSDEACTIONID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getCreatePSAppDEAction();


	/**
	 * 获取建立应用实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getCreatePSAppDEActionMust();
	
	
	/**
	 * 获取更新应用实体行为
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataImpDTO#FIELD_UPDATEPSDEACTIONID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getUpdatePSAppDEAction();


	/**
	 * 获取更新应用实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEAction getUpdatePSAppDEActionMust();
}