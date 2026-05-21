package net.ibizsys.central.cloud.core.database;

import java.sql.SQLException;
import java.util.Map;

import javax.sql.DataSource;

public interface ISysDBSchemeRuntime extends net.ibizsys.central.database.ISysDBSchemeRuntime {

	/**
	 * 是否自更新数据库体系
	 * @return
	 */
	public boolean isSelfUpdateSchema();
	
	
	
	/**
	 * 判断表是否存在
	 * @param tableName
	 * @return
	 * @throws SQLException
	 */
	boolean doesTableExist(String tableName) throws SQLException;

	
	/**
	 * 获取指定表列集合
	 * @param tableName
	 * @return
	 * @throws SQLException
	 */
	Map<String, Object> getTableColumns(String tableName) throws SQLException;
	
	
	
	/**
	 * 获取数据源对象
	 * @return
	 */
	DataSource getDataSource();
}
