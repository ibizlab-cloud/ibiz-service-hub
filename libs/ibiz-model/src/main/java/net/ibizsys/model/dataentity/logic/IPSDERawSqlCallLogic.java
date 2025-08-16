package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑直接SQL调用节点模型对象接口
 * <P>
 * 扩展父接口类型[RAWSQLCALL]
 *
 */
public interface IPSDERawSqlCallLogic extends net.ibizsys.model.dataentity.logic.IPSDELogicNode{

	
	
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
	 * 获取是否执行结果填充目标参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM9}
	 * @return
	 */
	boolean isFillDstLogicParam();
	
	
	/**
	 * 获取是否忽略重置目标参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSDELogicNodeDTO#FIELD_PARAM7}
	 * @return
	 */
	boolean isIgnoreResetDstLogicParam();
}