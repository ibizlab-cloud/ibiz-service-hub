package net.ibizsys.model.uml;



/**
 *
 */
public interface IPSSysUCMap extends net.ibizsys.model.uml.IPSUMLObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取UC图节点关系集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.uml.IPSSysUCMapNode> getPSSysUCMapNodes();
	
	/**
	 * 获取UC图节点关系集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.uml.IPSSysUCMapNode getPSSysUCMapNode(Object objKey, boolean bTryMode);
	
	/**
	 * 设置UC图节点关系集合
	 * @param list UC图节点关系集合
	 */
	void setPSSysUCMapNodes(java.util.List<net.ibizsys.model.uml.IPSSysUCMapNode> list);
	
	
	/**
	 * 获取用例关系集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.uml.IPSSysUseCaseRS> getPSSysUseCaseRSs();
	
	/**
	 * 获取用例关系集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.uml.IPSSysUseCaseRS getPSSysUseCaseRS(Object objKey, boolean bTryMode);
	
	/**
	 * 设置用例关系集合
	 * @param list 用例关系集合
	 */
	void setPSSysUseCaseRs(java.util.List<net.ibizsys.model.uml.IPSSysUseCaseRS> list);
	
	
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
	
	
	/**
	 * 获取编号
	 * @return
	 */
	java.lang.String getUCMapSN();
}