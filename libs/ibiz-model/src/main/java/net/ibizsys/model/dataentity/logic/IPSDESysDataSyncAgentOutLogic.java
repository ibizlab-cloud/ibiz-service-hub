package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑调用系统数据同步代理输出节点模型对象接口
 * <P>
 * 扩展父接口类型[SYSDATASYNCAGENTOUT]
 *
 */
public interface IPSDESysDataSyncAgentOutLogic extends net.ibizsys.model.dataentity.logic.IPSDELogicNode{

	
	
	/**
	 * 获取目标逻辑参数对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_DSTPSDLPARAMID}
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParam();


	/**
	 * 获取目标逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParamMust();
	
	
	/**
	 * 获取系统数据同步代理
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PSSYSDATASYNCAGENTID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysDataSyncAgent getPSSysDataSyncAgent();


	/**
	 * 获取系统数据同步代理，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysDataSyncAgent getPSSysDataSyncAgentMust();
}