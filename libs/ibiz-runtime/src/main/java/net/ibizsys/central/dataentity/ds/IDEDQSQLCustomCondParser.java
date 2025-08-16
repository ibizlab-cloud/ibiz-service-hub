package net.ibizsys.central.dataentity.ds;

import java.util.Map;
import java.util.Set;

import net.ibizsys.central.database.IDBDialect;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.runtime.util.ISearchCustomCond;

/**
 * 实体数据查询SQL自定义条件分析器
 * @author lionlau
 *
 */
public interface IDEDQSQLCustomCondParser {
	
	/**
	 * 分析传入的自定义条件
	 * @param iSearchCustomCond
	 * @parma iDBDialect 数据库设配器
	 * @param iDEDataQueryCodeRuntime
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	String parse(ISearchCustomCond iSearchCustomCond, IDBDialect iDBDialect, IDataEntityRuntime iDataEntityRuntime, IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime, ISearchContext iSearchContext) throws Throwable;
	
	/**
	 * 分析传入的自定义条件
	 * @param iSearchCustomCond
	 * @parma iDBDialect 数据库设配器
	 * @param iDEDataQueryCodeRuntime
	 * @param iSearchContext
	 * @param params 
	 * @return
	 * @throws Throwable
	 */
	String parse(ISearchCustomCond iSearchCustomCond, IDBDialect iDBDialect, IDataEntityRuntime iDataEntityRuntime, IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime, ISearchContext iSearchContext, Map<String, Object> params) throws Throwable;

	
	/**
	 * 分析传入的自定义条件
	 * @param iSearchCustomCond
	 * @parma iDBDialect 数据库设配器
	 * @param iDEDataQueryCodeRuntime
	 * @param iSearchContext
	 * @param params
	 * @param columnList 受影响的列 
	 * @return
	 * @throws Throwable
	 */
	String parse(ISearchCustomCond iSearchCustomCond, IDBDialect iDBDialect, IDataEntityRuntime iDataEntityRuntime, IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime, ISearchContext iSearchContext, Map<String, Object> params, Set<String> relatedColumnList) throws Throwable;
	
	
}
