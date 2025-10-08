package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑开始节点模型对象接口
 * <P>
 * 扩展父接口类型[BEGIN]
 *
 */
public interface IPSDEBeginLogic extends net.ibizsys.model.dataentity.logic.IPSDELogicNode{

	
	
	/**
	 * 获取消息内容
	 * @return
	 */
	java.lang.String getMessage();
	
	
	/**
	 * 获取消息模板
	 * @return
	 */
	net.ibizsys.model.msg.IPSSysMsgTempl getPSSysMsgTempl();


	/**
	 * 获取消息模板，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.msg.IPSSysMsgTempl getPSSysMsgTemplMust();
}