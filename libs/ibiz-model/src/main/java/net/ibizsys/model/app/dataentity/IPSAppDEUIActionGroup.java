package net.ibizsys.model.app.dataentity;



/**
 * 应用实体界面行为组模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEUIActionGroupDTO}运行时对象
 *
 */
public interface IPSAppDEUIActionGroup extends net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup
		,net.ibizsys.model.IPSModelSortable{

	
	
	/**
	 * 获取应用实体
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEUIActionGroupDTO#FIELD_PSDEID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity();


	/**
	 * 获取应用实体，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust();
	
	
	/**
	 * 获取唯一标记
	 * @return
	 */
	java.lang.String getUniqueTag();
}