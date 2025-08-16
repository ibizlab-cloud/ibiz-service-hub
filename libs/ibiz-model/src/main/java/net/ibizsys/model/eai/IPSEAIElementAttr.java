package net.ibizsys.model.eai;



/**
 *
 */
public interface IPSEAIElementAttr extends net.ibizsys.model.eai.IPSEAIElementObject{

	
	
	/**
	 * 获取属性标记
	 * @return
	 */
	java.lang.String getAttrTag();
	
	
	/**
	 * 获取属性标记2
	 * @return
	 */
	java.lang.String getAttrTag2();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取默认值
	 * @return
	 */
	java.lang.String getDefaultValue();
	
	
	/**
	 * 获取元素属性类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.EAIElementAttrType}
	 * @return
	 */
	java.lang.String getElementAttrType();
	
	
	/**
	 * 获取固定值
	 * @return
	 */
	java.lang.String getFixedValue();
	
	
	/**
	 * 获取是否允许空输入
	 * @return
	 */
	boolean isAllowEmpty();
}