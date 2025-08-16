package net.ibizsys.model.dataentity.dataflow;



/**
 *
 */
public interface IPSDEDFSysBDSchemeSinkNode extends net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowSinkNode{

	
	
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
	 * 获取大数据库体系
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSSYSBDSCHEMEID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_PSSYSBDTABLEID}
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
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.DTO#FIELD_LOGICNODESUBTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DEDataFlowSysBDSchemeSinkType}
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