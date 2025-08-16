package net.ibizsys.model.eai;



/**
 *
 */
public interface IPSSysEAIElement extends net.ibizsys.model.eai.IPSSysEAISchemeObject
		,net.ibizsys.model.eai.IPSEAIElement{

	
	
	/**
	 * 获取集成元素属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.eai.IPSSysEAIElementAttr> getAllPSSysEAIElementAttrs();
	
	/**
	 * 获取集成元素属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.eai.IPSSysEAIElementAttr getPSSysEAIElementAttr(Object objKey, boolean bTryMode);
	
	/**
	 * 设置集成元素属性集合
	 * @param list 集成元素属性集合
	 */
	void setPSSysEAIElementAttrs(java.util.List<net.ibizsys.model.eai.IPSSysEAIElementAttr> list);
	
	
	/**
	 * 获取集成元素引用元素集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.eai.IPSSysEAIElementRE> getAllPSSysEAIElementREs();
	
	/**
	 * 获取集成元素引用元素集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.eai.IPSSysEAIElementRE getPSSysEAIElementRE(Object objKey, boolean bTryMode);
	
	/**
	 * 设置集成元素引用元素集合
	 * @param list 集成元素引用元素集合
	 */
	void setPSSysEAIElementREs(java.util.List<net.ibizsys.model.eai.IPSSysEAIElementRE> list);
}