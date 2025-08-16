package net.ibizsys.model.eai;



/**
 *
 */
public interface IPSSysEAIDE extends net.ibizsys.model.eai.IPSEAIDE
		,net.ibizsys.model.eai.IPSSysEAISchemeObject{

	
	
	/**
	 * 获取集成实体属性映射集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.eai.IPSSysEAIDEField> getAllPSSysEAIDEFields();
	
	/**
	 * 获取集成实体属性映射集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.eai.IPSSysEAIDEField getPSSysEAIDEField(Object objKey, boolean bTryMode);
	
	/**
	 * 设置集成实体属性映射集合
	 * @param list 集成实体属性映射集合
	 */
	void setPSSysEAIDEFields(java.util.List<net.ibizsys.model.eai.IPSSysEAIDEField> list);
	
	
	/**
	 * 获取集成实体关系映射集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.eai.IPSSysEAIDER> getAllPSSysEAIDERs();
	
	/**
	 * 获取集成实体关系映射集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.eai.IPSSysEAIDER getPSSysEAIDER(Object objKey, boolean bTryMode);
	
	/**
	 * 设置集成实体关系映射集合
	 * @param list 集成实体关系映射集合
	 */
	void setPSSysEAIDERs(java.util.List<net.ibizsys.model.eai.IPSSysEAIDER> list);
	
	
	/**
	 * 获取映射集成元素
	 * @return
	 */
	net.ibizsys.model.eai.IPSSysEAIElement getPSSysEAIElement();


	/**
	 * 获取映射集成元素，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.eai.IPSSysEAIElement getPSSysEAIElementMust();
}