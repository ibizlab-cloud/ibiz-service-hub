package net.ibizsys.model.dataentity.datamap;



/**
 * 实体映射数据查询模型对象接口
 *
 */
public interface IPSDEMapDataQuery extends net.ibizsys.model.dataentity.datamap.IPSDEMapObject{

	
	
	/**
	 * 获取目标实体查询
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQuery getDstPSDEDataQuery();


	/**
	 * 获取目标实体查询，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQuery getDstPSDEDataQueryMust();
	
	
	/**
	 * 获取映射模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEMapObjectMapMode}
	 * @return
	 */
	java.lang.String getMapMode();
	
	
	/**
	 * 获取映射动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getMapParams();
	
	
	/**
	 * 获取源实体查询
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQuery getSrcPSDEDataQuery();


	/**
	 * 获取源实体查询，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQuery getSrcPSDEDataQueryMust();
	
	
	/**
	 * 获取是否启用查询条件附加
	 * @return
	 */
	boolean isEnableDQCond();
}