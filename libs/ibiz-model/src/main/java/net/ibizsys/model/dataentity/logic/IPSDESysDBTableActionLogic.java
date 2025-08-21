package net.ibizsys.model.dataentity.logic;



/**
 * 实体处理逻辑数据库表操作节点模型对象接口
 * <P>
 * 扩展父接口类型[SYSDBTABLEACTION]
 *
 */
public interface IPSDESysDBTableActionLogic extends net.ibizsys.model.dataentity.logic.IPSDELogicNode{

	
	
	/**
	 * 获取数据表操作
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DBTableAction}
	 * @return
	 */
	java.lang.String getDBTableAction();
	
	
	/**
	 * 获取目标逻辑参数对象
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
}