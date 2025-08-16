package net.ibizsys.model.dataentity.ds;



/**
 * 实体数据查询输入模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEDataQueryDTO}运行时对象
 * <P>
 * 实体数据查询输入模型是实体数据查询模型的组成
 *
 */
public interface IPSDEDataQueryInput extends net.ibizsys.model.dataentity.service.IPSDEMethodInput{

	
	
	/**
	 * 获取实体过滤器DTO
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEFilterDTO getPSDEFilterDTO();


	/**
	 * 获取实体过滤器DTO，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEFilterDTO getPSDEFilterDTOMust();
}