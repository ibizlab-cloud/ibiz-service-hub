package net.ibizsys.model.control;



/**
 * 界面部件注入属性模型对象接口
 *
 */
public interface IPSControlAttribute extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取注入属性名称
	 * @return
	 */
	java.lang.String getAttrName();
	
	
	/**
	 * 获取注入属性值
	 * @return
	 */
	java.lang.String getAttrValue();
}