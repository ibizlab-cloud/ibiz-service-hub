package net.ibizsys.model.dataentity.service;



/**
 * 服务接口实体方法输入模型对象接口
 *
 */
public interface IPSDEServiceAPIMethodInput extends net.ibizsys.model.dataentity.service.IPSDEMethodInput{

	
	
	/**
	 * 获取实体服务接口主键属性
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEServiceAPIField getKeyPSDEServiceAPIField();


	/**
	 * 获取实体服务接口主键属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEServiceAPIField getKeyPSDEServiceAPIFieldMust();
	
	
	/**
	 * 获取实体服务接口DTO对象
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEMethodDTO getPSDEMethodDTO();


	/**
	 * 获取实体服务接口DTO对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEMethodDTO getPSDEMethodDTOMust();
}