package net.ibizsys.model.dataentity.service;



/**
 * 实体方法DTO对象接口
 *
 */
public interface IPSDEMethodDTO extends net.ibizsys.model.dataentity.IPSDataEntityObject{

	
	
	/**
	 * 获取DTO属性集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.service.IPSDEMethodDTOField> getPSDEMethodDTOFields();
	
	/**
	 * 获取DTO属性集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.service.IPSDEMethodDTOField getPSDEMethodDTOField(Object objKey, boolean bTryMode);
	
	/**
	 * 设置DTO属性集合
	 * @param list DTO属性集合
	 */
	void setPSDEMethodDTOFields(java.util.List<net.ibizsys.model.dataentity.service.IPSDEMethodDTOField> list);
	
	
	/**
	 * 获取实体方法DTO对象来源类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEMethodDTOSourceType}
	 * @return
	 */
	java.lang.String getSourceType();
	
	
	/**
	 * 获取源动态模型系统DTO
	 * @return
	 */
	net.ibizsys.model.service.IPSSysMethodDTO getSrcPSSysMethodDTO();


	/**
	 * 获取源动态模型系统DTO，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSysMethodDTO getSrcPSSysMethodDTOMust();
	
	
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
	
	
	/**
	 * 获取是否默认域对象
	 * @return
	 */
	boolean isDefaultMode();
}