package net.ibizsys.model.dataentity.dataflow;



/**
 *
 */
public interface IPSDEDFSysBDSchemeSinkNode extends net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowSinkNode{

	
	
	/**
	 * 获取目标实体属性组对象
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEFGroup getDstPSDEFGroup();


	/**
	 * 获取目标实体属性组对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEFGroup getDstPSDEFGroupMust();
	
	
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
	 * 获取大数据库体系
	 * @return
	 */
	net.ibizsys.model.ba.IPSSysBDScheme getPSSysBDScheme();


	/**
	 * 获取大数据库体系，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.ba.IPSSysBDScheme getPSSysBDSchemeMust();
	
	
	/**
	 * 获取数据表
	 * @return
	 */
	net.ibizsys.model.ba.IPSSysBDTable getPSSysBDTable();


	/**
	 * 获取数据表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.ba.IPSSysBDTable getPSSysBDTableMust();
	
	
	/**
	 * 获取子类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataFlowSysBDSchemeSinkType}
	 * @return
	 */
	java.lang.String getSubType();
	
	
	/**
	 * 获取数据表操作
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DBTableAction}
	 * @return
	 */
	java.lang.String getTableAction();
}