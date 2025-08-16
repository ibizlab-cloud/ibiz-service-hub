package net.ibizsys.model.dataentity.logic;



/**
 * 实体主状态逻辑模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDELogicDTO}运行时对象
 *
 */
public interface IPSDEMSLogic extends net.ibizsys.model.dataentity.logic.IPSDELogicBase{

	
	
	/**
	 * 获取开始默认状态节点
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode getDefaultPSDEMSLogicNode();


	/**
	 * 获取开始默认状态节点，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode getDefaultPSDEMSLogicNodeMust();
	
	
	/**
	 * 获取逻辑标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicDTO#FIELD_LOGICTAG}
	 * @return
	 */
	java.lang.String getLogicTag();
	
	
	/**
	 * 获取逻辑标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicDTO#FIELD_LOGICTAG2}
	 * @return
	 */
	java.lang.String getLogicTag2();
	
	
	/**
	 * 获取逻辑标记3
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicDTO#FIELD_LOGICTAG3}
	 * @return
	 */
	java.lang.String getLogicTag3();
	
	
	/**
	 * 获取逻辑标记4
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicDTO#FIELD_LOGICTAG4}
	 * @return
	 */
	java.lang.String getLogicTag4();
	
	
	/**
	 * 获取主状态逻辑节点集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode> getPSDEMSLogicNodes();
	
	/**
	 * 获取主状态逻辑节点集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode getPSDEMSLogicNode(Object objKey, boolean bTryMode);
	
	/**
	 * 设置主状态逻辑节点集合
	 * @param list 主状态逻辑节点集合
	 */
	void setPSDEMSLogicNodes(java.util.List<net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode> list);
	
	
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