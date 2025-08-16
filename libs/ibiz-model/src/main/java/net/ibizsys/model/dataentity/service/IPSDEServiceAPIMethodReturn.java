package net.ibizsys.model.dataentity.service;



/**
 * 服务接口实体方法返回模型对象接口
 *
 */
public interface IPSDEServiceAPIMethodReturn extends net.ibizsys.model.dataentity.service.IPSDEMethodReturn{

	
	
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
	
	
	/**
	 * 获取简单值类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.StdDataType}
	 * @return
	 */
	int getStdDataType();
}