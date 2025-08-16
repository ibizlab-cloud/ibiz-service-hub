package net.ibizsys.model.app.dataentity;



/**
 * 应用实体数据导入数据项模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEDataImpItemDTO}运行时对象
 *
 */
public interface IPSAppDEDataImportItem extends net.ibizsys.model.dataentity.dataimport.IPSDEDataImportItem{

	
	
	/**
	 * 获取应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEDataImpItemDTO#FIELD_PSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEField();


	/**
	 * 获取应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEFieldMust();
}