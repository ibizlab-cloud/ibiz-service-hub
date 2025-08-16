package net.ibizsys.model.dataentity.logic;



/**
 * 实体界面逻辑触发事件节点模型对象接口
 * <P>
 * 扩展父接口类型[VIEWCTRLFIREEVENT]
 *
 */
public interface IPSDEUICtrlFireEventLogic extends net.ibizsys.model.dataentity.logic.IPSDEUILogicNode{

	
	
	/**
	 * 获取事件名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM2}
	 * @return
	 */
	java.lang.String getEventName();
	
	
	/**
	 * 获取事件参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_DSTPSDLPARAMID}
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getEventParam();


	/**
	 * 获取事件参数，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getEventParamMust();
	
	
	/**
	 * 获取触发对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_SRCPSDLPARAMID}
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getFireCtrl();


	/**
	 * 获取触发对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getFireCtrlMust();
}