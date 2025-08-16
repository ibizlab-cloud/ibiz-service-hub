package net.ibizsys.model.app.dataentity;



/**
 * 应用实体界面逻辑节点模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO}运行时对象
 *
 */
public interface IPSAppDEUILogicNode extends net.ibizsys.model.dataentity.logic.IPSDEUILogicNode{

	
	
	/**
	 * 获取前端模板插件对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin();


	/**
	 * 获取前端模板插件对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust();
}