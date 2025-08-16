package net.ibizsys.model.app.dataentity;



/**
 * 应用实体属性逻辑模型对象接口
 * <P>
 * 扩展父接口类型[DEFIELD]
 *
 */
public interface IPSAppDEFLogic extends net.ibizsys.model.app.dataentity.IPSAppDELogic
		,net.ibizsys.model.dataentity.logic.IPSDEFLogic{

	
	
	/**
	 * 获取应用实体属性
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSDEFID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEField();


	/**
	 * 获取应用实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEFieldMust();
}