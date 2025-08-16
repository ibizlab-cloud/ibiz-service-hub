package net.ibizsys.central.database;

import net.ibizsys.central.ISystemPersistentAdapter;
import net.ibizsys.central.ISystemRuntimeContext;

/**
 * 系统数据库持久化适配层
 * @author lionlau
 *
 */
public interface ISysDBPersistentAdapter extends ISystemPersistentAdapter,ISQLSupportable{

	/**
	 * 初始化
	 * @param iSystemRuntimeContext
	 * @param iSysDBSchemeRuntime
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext, ISysDBSchemeRuntime iSysDBSchemeRuntime) throws Exception;
	
	
	
	
	/**
	 * 获取系统数据库体系运行时
	 * @return
	 */
	ISysDBSchemeRuntime getSysDBSchemeRuntime();
	
	
	
	
	/**
	 * 获取数据库类型
	 * @return
	 */
	String getDBType();
	
	
	
	
	
	
//	/**
//	 * 直接执行查询SQL
//	 * @param strSQL
//	 * @param params
//	 * @return
//	 * @throws Throwable
//	 */
//	List executeSelectSQL(String strSQL, List<Object> params) throws Throwable;
//	
//	
//	
//	
//	/**
//	 * 直接执行SQL
//	 * @param strSQL
//	 * @param params
//	 * @return
//	 * @throws Throwable
//	 */
//	int executeSQL(String strSQL, List<Object> params) throws Throwable;
	
}
