package net.ibizsys.model.dataentity.mainstate;



/**
 * 实体主状态行为模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEMSActionDTO}运行时对象
 *
 */
public interface IPSDEMainStateAction extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取实体行为
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEMSActionDTO#FIELD_PSDEACTIONID}
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getPSDEAction();


	/**
	 * 获取实体行为，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getPSDEActionMust();
	
	
	/**
	 * 获取是否行为允许模式，由实体主状态定义{@link net.ibizsys.model.dataentity.mainstate.IPSDEMainState#isActionAllowMode}
	 * @return
	 */
	boolean isAllowMode();
}