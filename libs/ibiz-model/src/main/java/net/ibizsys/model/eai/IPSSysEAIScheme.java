package net.ibizsys.model.eai;



/**
 *
 */
public interface IPSSysEAIScheme extends net.ibizsys.model.eai.IPSEAIScheme{

	
	
	/**
	 * 获取集成实体映射集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.eai.IPSSysEAIDE> getAllPSSysEAIDEs();
	
	/**
	 * 获取集成实体映射集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.eai.IPSSysEAIDE getPSSysEAIDE(Object objKey, boolean bTryMode);
	
	/**
	 * 设置集成实体映射集合
	 * @param list 集成实体映射集合
	 */
	void setPSSysEAIDEs(java.util.List<net.ibizsys.model.eai.IPSSysEAIDE> list);
	
	
	/**
	 * 获取集成数据类型集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.eai.IPSSysEAIDataType> getAllPSSysEAIDataTypes();
	
	/**
	 * 获取集成数据类型集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.eai.IPSSysEAIDataType getPSSysEAIDataType(Object objKey, boolean bTryMode);
	
	/**
	 * 设置集成数据类型集合
	 * @param list 集成数据类型集合
	 */
	void setPSSysEAIDataTypes(java.util.List<net.ibizsys.model.eai.IPSSysEAIDataType> list);
	
	
	/**
	 * 获取集成元素集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.eai.IPSSysEAIElement> getAllPSSysEAIElements();
	
	/**
	 * 获取集成元素集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.eai.IPSSysEAIElement getPSSysEAIElement(Object objKey, boolean bTryMode);
	
	/**
	 * 设置集成元素集合
	 * @param list 集成元素集合
	 */
	void setPSSysEAIElements(java.util.List<net.ibizsys.model.eai.IPSSysEAIElement> list);
	
	
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