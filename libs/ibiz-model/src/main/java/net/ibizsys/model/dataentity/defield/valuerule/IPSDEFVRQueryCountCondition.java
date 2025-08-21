package net.ibizsys.model.dataentity.defield.valuerule;



/**
 * 实体属性值规则查询计数条件模型对象接口
 * <P>
 * 扩展父接口类型[QUERYCOUNT]
 *
 */
public interface IPSDEFVRQueryCountCondition extends net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRSingleCondition{

	
	
	/**
	 * 获取最大值
	 * @return
	 */
	java.lang.Integer getMaxValue();
	
	
	/**
	 * 获取最小值
	 * @return
	 */
	java.lang.Integer getMinValue();
	
	
	/**
	 * 获取实体数据查询对象
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQuery getPSDEDataQuery();


	/**
	 * 获取实体数据查询对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQuery getPSDEDataQueryMust();
	
	
	/**
	 * 获取是否始终检查
	 * @return
	 */
	boolean isAlwaysCheck();
	
	
	/**
	 * 获取是否含最大值
	 * @return
	 */
	boolean isIncludeMaxValue();
	
	
	/**
	 * 获取是否含最小值
	 * @return
	 */
	boolean isIncludeMinValue();
}