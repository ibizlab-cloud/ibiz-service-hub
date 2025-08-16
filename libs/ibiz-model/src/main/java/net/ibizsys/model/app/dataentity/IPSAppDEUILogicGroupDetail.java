package net.ibizsys.model.app.dataentity;



/**
 * 应用实体界面逻辑组成员模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSCtrlLogicGrpDetailDTO}运行时对象
 *
 */
public interface IPSAppDEUILogicGroupDetail extends net.ibizsys.model.dataentity.logic.IPSDEUILogicGroupDetail{

	
	
	/**
	 * 获取应用实体界面逻辑对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSCtrlLogicGrpDetailDTO#FIELD_PSDELOGICID}
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEUILogic getPSAppDEUILogic();


	/**
	 * 获取应用实体界面逻辑对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDEUILogic getPSAppDEUILogicMust();
	
	
	/**
	 * 获取应用实体对象
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity();


	/**
	 * 获取应用实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust();
	
	
	/**
	 * 获取应用预置界面逻辑对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSCtrlLogicGrpDetailDTO#FIELD_PSSYSVIEWLOGICID}
	 * @return
	 */
	net.ibizsys.model.app.logic.IPSAppUILogic getPSAppUILogic();


	/**
	 * 获取应用预置界面逻辑对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.app.logic.IPSAppUILogic getPSAppUILogicMust();
}