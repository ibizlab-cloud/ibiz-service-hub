package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑大数据库表操作节点模型对象接口
 * <P>
 * 扩展父接口类型[SYSBDTABLEACTION]
 *
 */
public interface IPSDESysBDTableActionLogic extends net.ibizsys.model.dataentity.logic.IPSDELogicNode{

	
	
	/**
	 * 获取数据表操作
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM1}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DBTableAction}
	 * @return
	 */
	java.lang.String getBDTableAction();
	
	
	/**
	 * 获取目标逻辑参数对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_DSTPSDLPARAMID}
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParam();


	/**
	 * 获取目标逻辑参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParamMust();
	
	
	/**
	 * 获取大数据体系
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PSSYSBDSCHEMEID}
	 * @return
	 */
	net.ibizsys.model.ba.IPSSysBDScheme getPSSysBDScheme();


	/**
	 * 获取大数据体系，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.ba.IPSSysBDScheme getPSSysBDSchemeMust();
	
	
	/**
	 * 获取数据表
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PSSYSBDTABLEID}
	 * @return
	 */
	net.ibizsys.model.ba.IPSSysBDTable getPSSysBDTable();


	/**
	 * 获取数据表，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.ba.IPSSysBDTable getPSSysBDTableMust();
}