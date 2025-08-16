package net.ibizsys.model.eai;



/**
 *
 */
public interface IPSEAIElementRE extends net.ibizsys.model.eai.IPSEAIElementObject{

	
	
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
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.EAIElementREType}
	 * @return
	 */
	java.lang.String getElementREType();
	
	
	/**
	 * 获取固定值
	 * @return
	 */
	java.lang.String getFixedValue();
	
	
	/**
	 * 获取最大出现次数
	 * @return
	 */
	int getMaxOccurs();
	
	
	/**
	 * 获取最小出现次数
	 * @return
	 */
	int getMinOccurs();
	
	
	/**
	 * 获取属性标记
	 * @return
	 */
	java.lang.String getRETag();
	
	
	/**
	 * 获取属性标记2
	 * @return
	 */
	java.lang.String getRETag2();
	
	
	/**
	 * 获取是否允许空输入
	 * @return
	 */
	boolean isAllowEmpty();
}