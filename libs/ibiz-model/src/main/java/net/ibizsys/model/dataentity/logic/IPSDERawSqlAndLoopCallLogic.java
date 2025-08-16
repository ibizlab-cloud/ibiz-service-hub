package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑直接SQL查询并循环调用节点模型对象接口
 * <P>
 * 扩展父接口类型[RAWSQLANDLOOPCALL]
 *
 */
public interface IPSDERawSqlAndLoopCallLogic extends net.ibizsys.model.dataentity.logic.IPSDELogicNode{

	
	
	/**
	 * 获取目标实体行为对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_DSTPSDEACTIONID}
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getDstPSDEAction();


	/**
	 * 获取目标实体行为对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.action.IPSDEAction getDstPSDEActionMust();
	
	
	/**
	 * 获取目标实体对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_DSTPSDEID}
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
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PSSYSDBSCHEMEID}
	 * @return
	 */
	net.ibizsys.model.database.IPSSysDBScheme getPSSysDBScheme();


	/**
	 * 获取数据库体系，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.database.IPSSysDBScheme getPSSysDBSchemeMust();
	
	
	/**
	 * 获取SQL代码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM4}
	 * @return
	 */
	java.lang.String getSql();
	
	
	/**
	 * 获取附加源参数对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_SRCPSDLPARAMID}
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getSrcPSDELogicParam();


	/**
	 * 获取附加源参数对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.logic.IPSDELogicParam getSrcPSDELogicParamMust();
}