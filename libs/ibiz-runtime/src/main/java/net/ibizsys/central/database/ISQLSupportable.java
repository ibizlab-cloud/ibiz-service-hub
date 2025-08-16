package net.ibizsys.central.database;

import java.util.List;

/**
 * SQL 支持对象
 * @author lionlau
 *
 */
public interface ISQLSupportable {

	/**
	 * 直接执行查询SQL
	 * @param strSQL
	 * @param params
	 * @return
	 * @throws Throwable
	 */
	List executeSelectSQL(String strSQL, List<Object> params) throws Throwable;
	
	
	
	
	/**
	 * 直接执行SQL
	 * @param strSQL
	 * @param params
	 * @return
	 * @throws Throwable
	 */
	int executeSQL(String strSQL, List<Object> params) throws Throwable;
	
}
