package net.ibizsys.model.dynamodel;



/**
 * 动态模型属性对象接口
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