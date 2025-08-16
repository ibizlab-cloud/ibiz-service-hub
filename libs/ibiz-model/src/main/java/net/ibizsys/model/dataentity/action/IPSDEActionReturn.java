package net.ibizsys.model.dataentity.action;



/**
 * 实体行为返回模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSDEActionDTO}运行时对象
 * <P>
 * 实体行为返回模型是实体行为模型的组成
 *
 */
public interface IPSDEActionReturn extends net.ibizsys.model.dataentity.service.IPSDEMethodReturn{

	
	
	/**
	 * 获取属性组关联查询
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQuery getPSDEDataQuery();


	/**
	 * 获取属性组关联查询，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQuery getPSDEDataQueryMust();
	
	
	/**
	 * 获取实体方法DTO对象
	 * @return
	 */
	net.ibizsys.model.dataentity.service.IPSDEMethodDTO getPSDEMethodDTO();


	/**
	 * 获取实体方法DTO对象，不存在时抛出异常
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