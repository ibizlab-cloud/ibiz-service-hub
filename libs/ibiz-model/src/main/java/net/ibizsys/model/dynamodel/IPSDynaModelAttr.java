package net.ibizsys.model.dynamodel;



/**
 *
 */
public interface IPSDynaModelAttr extends net.ibizsys.model.IPSModelObject{

	
	
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
	
	java.lang.String getValue();
	
	java.lang.String getValueType();
}