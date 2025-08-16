package net.ibizsys.model.service;



/**
 *
 */
public interface IPSSysMethodDTO extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取DTO属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.service.IPSSysMethodDTOField> getPSSysMethodDTOFields();
	
	/**
	 * 获取DTO属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.service.IPSSysMethodDTOField getPSSysMethodDTOField(Object objKey, boolean bTryMode);
	
	/**
	 * 设置DTO属性集合
	 * @param list DTO属性集合
	 */
	void setPSSysMethodDTOFields(java.util.List<net.ibizsys.model.service.IPSSysMethodDTOField> list);
	
	
	/**
	 * 获取系统方法DTO对象来源类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEMethodDTOSourceType}
	 * @return
	 */
	java.lang.String getSourceType();
	
	
	/**
	 * 获取标记
	 * @return
	 */
	java.lang.String getTag();
	
	
	/**
	 * 获取标记2
	 * @return
	 */
	java.lang.String getTag2();
	
	
	/**
	 * 获取类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEMethodDTOType}
	 * @return
	 */
	java.lang.String getType();
}