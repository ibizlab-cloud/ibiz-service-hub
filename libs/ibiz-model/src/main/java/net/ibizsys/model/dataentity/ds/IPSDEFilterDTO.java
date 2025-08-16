package net.ibizsys.model.dataentity.ds;



/**
 * 实体方法过滤器DTO对象接口
 * <P>
 * 扩展父接口类型[DEFILTER]
 *
 */
public interface IPSDEFilterDTO extends net.ibizsys.model.dataentity.service.IPSDEMethodDTO{

	
	
	/**
	 * 获取DTO对象属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.ds.IPSDEFilterDTOField> getPSDEFilterDTOFields();
	
	/**
	 * 获取DTO对象属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.ds.IPSDEFilterDTOField getPSDEFilterDTOField(Object objKey, boolean bTryMode);
	
	/**
	 * 设置DTO对象属性集合
	 * @param list DTO对象属性集合
	 */
	void setPSDEFilterDTOFields(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEFilterDTOField> list);
}