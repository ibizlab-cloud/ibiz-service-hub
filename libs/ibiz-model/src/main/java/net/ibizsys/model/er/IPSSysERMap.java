package net.ibizsys.model.er;



/**
 *
 */
public interface IPSSysERMap extends net.ibizsys.model.er.IPSERMap{

	
	
	/**
	 * 获取ER图节点集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.er.IPSSysERMapNode> getPSSysERMapNodes();
	
	/**
	 * 获取ER图节点集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.er.IPSSysERMapNode getPSSysERMapNode(Object objKey, boolean bTryMode);
	
	/**
	 * 设置ER图节点集合
	 * @param list ER图节点集合
	 */
	void setPSSysERMapNodes(java.util.List<net.ibizsys.model.er.IPSSysERMapNode> list);
	
	
	/**
	 * 获取系统模块
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModule();


	/**
	 * 获取系统模块，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust();
}