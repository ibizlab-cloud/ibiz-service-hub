package net.ibizsys.model.dataentity.dataflow;



/**
 *
 */
public interface IPSDEDFSysDBSchemeSourceNode extends net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowSourceNode{

	
	
	/**
	 * 获取目标实体数据查询对象
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQuery getDstPSDEDataQuery();


	/**
	 * 获取目标实体数据查询对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataQuery getDstPSDEDataQueryMust();
	
	
	/**
	 * 获取目标实体数据集对象
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getDstPSDEDataSet();


	/**
	 * 获取目标实体数据集对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getDstPSDEDataSetMust();
	
	
	/**
	 * 获取目标实体对象
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getDstPSDataEntity();


	/**
	 * 获取目标实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getDstPSDataEntityMust();
	
	
	/**
	 * 获取数据库体系
	 * @return
	 */
	net.ibizsys.model.database.IPSSysDBScheme getPSSysDBScheme();


	/**
	 * 获取数据库体系，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.database.IPSSysDBScheme getPSSysDBSchemeMust();
	
	
	/**
	 * 获取数据表
	 * @return
	 */
	net.ibizsys.model.database.IPSSysDBTable getPSSysDBTable();


	/**
	 * 获取数据表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.database.IPSSysDBTable getPSSysDBTableMust();
	
	
	/**
	 * 获取SQL代码
	 * @return
	 */
	java.lang.String getSql();
	
	
	/**
	 * 获取子类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataFlowSysDBSchemeSourceType}
	 * @return
	 */
	java.lang.String getSubType();
}