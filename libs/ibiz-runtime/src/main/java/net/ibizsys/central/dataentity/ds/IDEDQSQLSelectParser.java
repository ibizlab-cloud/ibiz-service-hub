package net.ibizsys.central.dataentity.ds;

import java.util.Set;

import net.ibizsys.central.database.IDBDialect;
import net.ibizsys.central.dataentity.IDataEntityRuntime;

/**
 * 实体数据查询SQL查询分析器
 * @author lionlau
 *
 */
public interface IDEDQSQLSelectParser {
	
	/**
	 * 重新选择列
	 * @param strSQL
	 * @param columnList
	 * @param iDBDialect
	 * @param iDataEntityRuntime
	 * @param iDEDataQueryCodeRuntime
	 * @return
	 * @throws Throwable
	 */
	String reselect(String strSQL, Set<String> columnList, IDBDialect iDBDialect, IDataEntityRuntime iDataEntityRuntime, IDEDataQueryCodeRuntime iDEDataQueryCodeRuntime) throws Throwable;
	

}
