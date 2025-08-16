package net.ibizsys.model.app.dataentity;



/**
 * 应用实体自动填充数据项模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEACModeItemDTO}运行时对象
 *
 */
public interface IPSAppDEACModeDataItem extends net.ibizsys.model.dataentity.ac.IPSDEACModeDataItem{

	
	
	/**
	 * 获取应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEACModeItemDTO#FIELD_PSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEField();


	/**
	 * 获取应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEFieldMust();
}