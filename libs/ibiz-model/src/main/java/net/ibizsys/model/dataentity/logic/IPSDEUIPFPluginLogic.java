package net.ibizsys.model.dataentity.logic;



/**
 * 实体界面逻辑调用前端插件节点模型对象接口
 * <P>
 * 扩展父接口类型[PFPLUGIN]
 *
 */
public interface IPSDEUIPFPluginLogic extends net.ibizsys.model.dataentity.logic.IPSDEUILogicNode{

	
	
	/**
	 * 获取前端扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin();


	/**
	 * 获取前端扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust();
}