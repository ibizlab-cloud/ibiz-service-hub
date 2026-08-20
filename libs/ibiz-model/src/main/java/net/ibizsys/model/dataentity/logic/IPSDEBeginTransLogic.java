package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑开启事务节点模型对象接口
 * <P>
 * 扩展父接口类型[BEGINTRANS]
 *
 */
public interface IPSDEBeginTransLogic extends net.ibizsys.model.dataentity.logic.IPSDELogicNode{

	
	
	/**
	 * 获取事务模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DELogicNodeTSMode}
	 * @return
	 */
	int getTransactionMode();
}