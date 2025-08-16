package net.ibizsys.model.dataentity.action;



/**
 * 实体处理逻辑行为模型对象接口
 * <P>
 * 扩展父接口类型[DELOGIC]
 *
 */
public interface IPSDELogicAction extends net.ibizsys.model.dataentity.action.IPSDEAction{

	
	
	/**
	 * 获取行为持有者，行为未定义时使用处理逻辑{@link #getPSDELogic}的逻辑持有者配置
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionDTO#FIELD_ACTIONHOLDER}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DELogicHolder}
	 * @return
	 */
	int getActionHolder();
	
	
	/**
	 * 获取实体处理逻辑
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDEActionDTO#FIELD_PSDELOGICID}
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogic getPSDELogic();


	/**
	 * 获取实体处理逻辑，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogic getPSDELogicMust();
}