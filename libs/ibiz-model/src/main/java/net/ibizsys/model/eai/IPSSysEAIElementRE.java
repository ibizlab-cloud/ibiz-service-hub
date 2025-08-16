package net.ibizsys.model.eai;



/**
 *
 */
public interface IPSSysEAIElementRE extends net.ibizsys.model.eai.IPSEAIElementRE{

	
	
	/**
	 * 获取集成数据类型
	 * @return
	 */
	net.ibizsys.model.eai.IPSSysEAIDataType getPSSysEAIDataType();


	/**
	 * 获取集成数据类型，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.eai.IPSSysEAIDataType getPSSysEAIDataTypeMust();
	
	
	/**
	 * 获取引用属性组
	 * @return
	 */
	net.ibizsys.model.eai.IPSSysEAIElement getRefPSSysEAIElement();


	/**
	 * 获取引用属性组，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.eai.IPSSysEAIElement getRefPSSysEAIElementMust();
}