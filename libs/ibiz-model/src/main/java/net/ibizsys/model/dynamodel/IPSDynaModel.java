package net.ibizsys.model.dynamodel;



/**
 * 动态模型对象接口
 *
 */
public interface IPSDynaModel extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dynamodel.IPSDynaModelAttr> getPSDynaModelAttrs();
	
	/**
	 * 获取属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dynamodel.IPSDynaModelAttr getPSDynaModelAttr(Object objKey, boolean bTryMode);
	
	/**
	 * 设置属性集合
	 * @param list 属性集合
	 */
	void setPSDynaModelAttrs(java.util.List<net.ibizsys.model.dynamodel.IPSDynaModelAttr> list);
}