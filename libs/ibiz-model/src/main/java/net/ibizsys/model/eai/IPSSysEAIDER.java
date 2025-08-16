package net.ibizsys.model.eai;



/**
 *
 */
public interface IPSSysEAIDER extends net.ibizsys.model.eai.IPSEAIDER
		,net.ibizsys.model.eai.IPSSysEAIDEObject{

	
	
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