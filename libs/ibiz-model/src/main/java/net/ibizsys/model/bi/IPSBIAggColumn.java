package net.ibizsys.model.bi;



/**
 *
 */
public interface IPSBIAggColumn extends net.ibizsys.model.bi.IPSBIAggTableObject
		,net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取聚合数据列标记
	 * @return
	 */
	java.lang.String getColumnTag();
	
	
	/**
	 * 获取聚合数据列标记2
	 * @return
	 */
	java.lang.String getColumnTag2();
	
	
	/**
	 * 获取聚合数据类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.BIAggColumnType}
	 * @return
	 */
	java.lang.String getColumnType();
	
	
	/**
	 * 获取实体属性
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField();


	/**
	 * 获取实体属性，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust();
}