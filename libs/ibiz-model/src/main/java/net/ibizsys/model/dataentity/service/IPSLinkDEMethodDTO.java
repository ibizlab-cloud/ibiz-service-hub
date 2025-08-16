package net.ibizsys.model.dataentity.service;



/**
 * 链接实体方法DTO模型对象接口
 * <P>
 * 扩展父接口类型[LINK]
 *
 */
public interface IPSLinkDEMethodDTO extends net.ibizsys.model.dataentity.service.IPSDEMethodDTO{

	
	
	/**
	 * 获取引用实体方法DTO对象
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEMethodDTO getRefPSDEMethodDTO();


	/**
	 * 获取引用实体方法DTO对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEMethodDTO getRefPSDEMethodDTOMust();
	
	
	/**
	 * 获取引用实体对象
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getRefPSDataEntity();


	/**
	 * 获取引用实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getRefPSDataEntityMust();
}