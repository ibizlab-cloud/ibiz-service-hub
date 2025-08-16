package net.ibizsys.central.dataentity.ds;

import net.ibizsys.central.database.IDBDialect;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode;
import net.ibizsys.model.dataentity.ds.IPSDEDataQueryCodeExp;
import net.ibizsys.runtime.IModelRuntime;


/**
 * 实体查询代码运行时对象接口
 * @author lionlau
 *
 */
public interface IDEDataQueryCodeRuntime extends IModelRuntime {

	/**
	 * 初始化
	 * @param iDataEntityRuntimeContext
	 * @param iPSDEDataQuery
	 * @param iPSDEDataQueryCode
	 * @throws Exception
	 */
	void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataQuery iPSDEDataQuery, IPSDEDataQueryCode iPSDEDataQueryCode) throws Exception;
	
	
	/**
	 * 
	 * @return
	 */
	IDataEntityRuntime getDataEntityRuntime();
	
	/**
	 * 获取实体查询型对象
	 * @return
	 */
	IPSDEDataQuery getPSDEDataQuery();
	
	
	/**
	 * 获取实体查询代码模型对象
	 * @return
	 */
	IPSDEDataQueryCode getPSDEDataQueryCode();
	
	
	/**
	 * 获取指定实体查询代码属性表达式
	 * @param strName
	 * @param bTryMode
	 * @return
	 */
	IPSDEDataQueryCodeExp getPSDEDataQueryCodeExp(String strName, boolean bTryMode);
	
	
	
	/**
	 * 获取数据库语法适配层
	 * @return
	 */
	IDBDialect getDBDialect();
	
	
	
	
//	/**
//	 * 忽略搜索属性条件
//	 * @param iSearchFieldCond
//	 * @return
//	 */
//	boolean ignoreSearchFieldCond(ISearchFieldCond iSearchFieldCond);
	
	
//	/**
//	 * 获取查询代码的搜索条件代码
//	 * @param searchCondList
//	 * @param strCondOP 指定条件操作
//	 * @param iDBDataService
//	 * @param iSearchContext
//	 * @return
//	 * @throws Throwable
//	 */
//	String getConditionSQL(List<ISearchCond> searchCondList, String strCondOp, IDBDataService iDBDataService, ISearchContext iSearchContext) throws Throwable;
//	
//	
//	/**
//	 * * 获取查询代码的搜索条件代码
//	 * @param iSearchCond
//	 * @param iDBDataService
//	 * @param iSearchContext
//	 * @return
//	 * @throws Throwable
//	 */
//	String getConditionSQL(ISearchCond iSearchCond, IDBDataService iDBDataService, ISearchContext iSearchContext) throws Throwable;
	
}
