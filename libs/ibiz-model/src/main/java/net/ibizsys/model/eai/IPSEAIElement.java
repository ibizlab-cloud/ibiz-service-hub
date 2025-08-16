package net.ibizsys.model.eai;



/**
 *
 */
public interface IPSEAIElement extends net.ibizsys.model.eai.IPSSysEAISchemeObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取元素标记
	 * @return
	 */
	java.lang.String getElementTag();
	
	
	/**
	 * 获取元素标记2
	 * @return
	 */
	java.lang.String getElementTag2();
	
	
	/**
	 * 获取集成元素类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.EAIElementType}
	 * @return
	 */
	java.lang.String getElementType();
	
	
	/**
	 * 获取引用元素排序模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.EAIElementREOrderMode}
	 * @return
	 */
	java.lang.String getOrderMode();
}