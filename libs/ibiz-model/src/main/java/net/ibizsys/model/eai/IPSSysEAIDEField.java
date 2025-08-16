package net.ibizsys.model.eai;



/**
 *
 */
public interface IPSSysEAIDEField extends net.ibizsys.model.eai.IPSEAIDEField
		,net.ibizsys.model.eai.IPSSysEAIDEObject{

	
	
	/**
	 * 获取集成元素属性
	 * @return
	 */
	net.ibizsys.model.eai.IPSSysEAIElementAttr getPSSysEAIElementAttr();


	/**
	 * 获取集成元素属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.eai.IPSSysEAIElementAttr getPSSysEAIElementAttrMust();
	
	
	/**
	 * 获取集成元素引用属性
	 * @return
	 */
	net.ibizsys.model.eai.IPSSysEAIElementRE getPSSysEAIElementRE();


	/**
	 * 获取集成元素引用属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.eai.IPSSysEAIElementRE getPSSysEAIElementREMust();
}