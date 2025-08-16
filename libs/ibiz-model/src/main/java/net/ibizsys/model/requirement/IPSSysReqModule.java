package net.ibizsys.model.requirement;



/**
 *
 */
public interface IPSSysReqModule extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取模块编号
	 * @return
	 */
	java.lang.String getModuleSN();
	
	
	/**
	 * 获取模块标记
	 * @return
	 */
	java.lang.String getModuleTag();
	
	
	/**
	 * 获取模块标记2
	 * @return
	 */
	java.lang.String getModuleTag2();
	
	
	/**
	 * 获取需求项集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.requirement.IPSSysReqItem> getPSSysReqItems();
	
	/**
	 * 获取需求项集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.requirement.IPSSysReqItem getPSSysReqItem(Object objKey, boolean bTryMode);
	
	/**
	 * 设置需求项集合
	 * @param list 需求项集合
	 */
	void setPSSysReqItems(java.util.List<net.ibizsys.model.requirement.IPSSysReqItem> list);
	
	
	/**
	 * 获取需求模块集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.requirement.IPSSysReqModule> getPSSysReqModules();
	
	/**
	 * 获取需求模块集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.requirement.IPSSysReqModule getPSSysReqModule(Object objKey, boolean bTryMode);
	
	/**
	 * 设置需求模块集合
	 * @param list 需求模块集合
	 */
	void setPSSysReqModules(java.util.List<net.ibizsys.model.requirement.IPSSysReqModule> list);
	
	
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
	 * 获取父模块
	 * @return
	 */
	net.ibizsys.model.requirement.IPSSysReqModule getParentPSSysReqModule();


	/**
	 * 获取父模块，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.requirement.IPSSysReqModule getParentPSSysReqModuleMust();
}