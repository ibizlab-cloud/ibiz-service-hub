package net.ibizsys.model.dataentity.dataflow;



/**
 *
 */
public interface IPSDEDFSysDBSchemeSinkNode extends net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowSinkNode{

	
	
	/**
	 * 获取目标实体属性组对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DSTPSDEFGROUPID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_DSTPSDEID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSSYSDBSCHEMEID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSSYSDBTABLEID}
	 * @return
	 */
	net.ibizsys.model.database.IPSSysDBTable getPSSysDBTable();


	/**
	 * 获取数据表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.database.IPSSysDBTable getPSSysDBTableMust();
	
	
	/**
	 * 获取子类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_LOGICNODESUBTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataFlowSysDBSchemeSinkType}
	 * @return
	 */
	java.lang.String getSubType();
	
	
	/**
	 * 获取数据表操作
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PARAM1}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DBTableAction}
	 * @return
	 */
	java.lang.String getTableAction();
}