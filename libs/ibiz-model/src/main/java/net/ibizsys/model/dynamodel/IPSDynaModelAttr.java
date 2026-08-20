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
	String getAttrTag();
	
	
	/**
	 * 获取属性标记2
	 * @return
	 */
	String getAttrTag2();
	
	String getValue();
	
	String getValueType();
}