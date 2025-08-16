package net.ibizsys.central.database;

import java.util.List;

import org.springframework.data.domain.Page;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.util.SqlCommandParam;

/**
 * 数据库服务层
 * @author lionlau
 *
 */
public interface IDBDataService {
	
	
	/**
	 * 推入当前数据源
	 * @param iSysDBSchemeRuntime
	 */
	void push(ISysDBSchemeRuntime iSysDBSchemeRuntime);
	
	
	/**
	 * 推出当前数据源
	 */
	void poll();
	
	
	/**
	 * 当前数据源
	 * @return
	 */
	ISysDBSchemeRuntime current();
	
	
	/**
	 * 插入数据
	 * @param iSysDBTableRuntime
	 * @param args
	 * @throws Throwable
	 */
	int insert(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, ISysDBTableRuntime iSysDBTableRuntime, List<SqlCommandParam> args) throws Throwable;
	
	
	
	
	/**
	 * 更新数据
	 * @param iSysDBTableRuntime
	 * @param args
	 * @throws Throwable
	 */
	int update(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, ISysDBTableRuntime iSysDBTableRuntime, List<SqlCommandParam> args) throws Throwable;


	
	/**
	 * 删除数据
	 * @param iSysDBTableRuntime
	 * @param args
	 * @throws Throwable
	 */
	int delete(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, ISysDBTableRuntime iSysDBTableRuntime,List<SqlCommandParam> args) throws Throwable;
	
	
	
	/**
	 * 插入数据
	 * @param iSysDBTableRuntime
	 * @param arg
	 * @throws Throwable
	 */
	int insert(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, ISysDBTableRuntime iSysDBTableRuntime, SqlCommandParam arg) throws Throwable;
	
	
	
	
	/**
	 * 更新数据
	 * @param iSysDBTableRuntime
	 * @param arg
	 * @throws Throwable
	 */
	int update(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, ISysDBTableRuntime iSysDBTableRuntime, SqlCommandParam arg) throws Throwable;


	
	/**
	 * 删除数据
	 * @param iSysDBTableRuntime
	 * @param arg
	 * @throws Throwable
	 */
	int delete(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, ISysDBTableRuntime iSysDBTableRuntime, SqlCommandParam arg) throws Throwable;
	
	
	/**
	 * 查询数据
	 * @param iSysDBTableRuntime
	 * @param arg
	 * @return
	 * @throws Throwable
	 */
	List select(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, ISysDBTableRuntime iSysDBTableRuntime, SqlCommandParam arg) throws Throwable;
	
	
	
	/**
	 * 查询一行数据
	 * @param iSysDBTableRuntime
	 * @param arg
	 * @return
	 * @throws Throwable
	 */
	Object selectOne(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, ISysDBTableRuntime iSysDBTableRuntime, SqlCommandParam arg) throws Throwable;
	
	
	
	/**
	 * 搜索数据集合
	 * @param iSysDBSchemeRuntimeContext 系统数据库体系上下文
	 * @param iDataEntityRuntime
	 * @param iPSDEDataSet
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	Page select(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, ISearchContext iSearchContext) throws Throwable;
	
	
	/**
	 * 搜索数据集合
	 * @param iSysDBSchemeRuntimeContext 系统数据库体系上下文
	 * @param iDataEntityRuntime
	 * @param iPSDEDataQuery
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	List select(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext) throws Throwable;
	
	
	
	/**
	 * 搜索数据集合
	 * @param iSysDBSchemeRuntimeContext 系统数据库体系上下文
	 * @param iDataEntityRuntime
	 * @param iPSDEDataQuery
	 * @param iSearchContext
	 * @return
	 * @throws Throwable
	 */
	Page select2(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext) throws Throwable;
	
	
	/**
	 * 获取条件Sql语句
	 * @param strFieldName
	 * @param nStdDataType
	 * @param strCondOp
	 * @param objValueOrParam
	 * @param bParam
	 * @param iSearchContext
	 * @param iDBDialect
	 * @return
	 * @throws Throwable
	 */
	String getConditionSQL(String strFieldName, int nStdDataType, String strCondOp, Object objValueOrParam, boolean bParam, ISearchContext iSearchContext, IDBDialect iDBDialect) throws Throwable;
	
	
	/**
	 * 直接执行查询SQL
	 * @param strSQL
	 * @param params
	 * @return
	 * @throws Throwable
	 */
	List executeSelectSQL(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, String strSQL, List<Object> params) throws Throwable;
	
	
	
	
	/**
	 * 直接执行SQL
	 * @param strSQL
	 * @param params
	 * @return
	 * @throws Throwable
	 */
	int executeSQL(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, String strSQL, List<Object> params) throws Throwable;
	
//
//	/**
//	 * 查询数据
//	 * @param iDataEntityRuntime
//	 * @param iPSDEDataQuery 指定数据查询对象
//	 * @param filter
//	 * @param pageable
//	 * @param outputFields
//	 * @return
//	 * @throws Throwable
//	 */
//	List<?> query(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, Object filter, Pageable pageable, String[] outputFields) throws Throwable;
//	
//	
//	
//	
//	
//	/**
//	 * 搜索数据集合
//	 * @param iDataEntityRuntime
//	 * @param iPSDEDataSet
//	 * @param filter
//	 * @param pageable 指定分页参数，不指定时按默认分页处理
//	 * @param bCount 指定是否计数操作
//	 * @param outputFields
//	 * @return
//	 * @throws Throwable
//	 */
//	Page<?> searchDataSet(IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, Object filter, Pageable pageable, boolean bCount, String[] outputFields) throws Throwable;
	
}
