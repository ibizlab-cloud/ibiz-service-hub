package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑节点模型对象接口
 *
 */
public interface IPSDELogicNode extends net.ibizsys.model.dataentity.logic.IPSDELogicNodeBase{

	
	
	/**
	 * 获取节点动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getNodeParams();
	
	
	/**
	 * 获取逻辑节点连出连接集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicLink> getPSDELogicLinks();
	
	/**
	 * 获取逻辑节点连出连接集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicLink getPSDELogicLink(Object objKey, boolean bTryMode);
	
	/**
	 * 设置逻辑节点连出连接集合
	 * @param list 逻辑节点连出连接集合
	 */
	void setPSDELogicLinks(java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicLink> list);
	
	
	/**
	 * 获取节点参数集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam> getPSDELogicNodeParams();
	
	/**
	 * 获取节点参数集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam getPSDELogicNodeParam(Object objKey, boolean bTryMode);
	
	/**
	 * 设置节点参数集合
	 * @param list 节点参数集合
	 */
	void setPSDELogicNodeParams(java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam> list);
	
	
	/**
	 * 获取后台扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin();


	/**
	 * 获取后台扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust();
}