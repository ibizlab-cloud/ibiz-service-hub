package net.ibizsys.model.dataentity.action;



/**
 * 实体通过键值获取行为模型对象接口
 * <P>
 * 扩展父接口类型[SELECTBYKEY]
 *
 */
public interface IPSDESelectByKeyAction extends net.ibizsys.model.dataentity.action.IPSDEAction{

	
	
	/**
	 * 获取实体数据查询
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQuery getPSDEDataQuery();


	/**
	 * 获取实体数据查询，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQuery getPSDEDataQueryMust();
}