package net.ibizsys.central.database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.sql.DataSource;

import net.ibizsys.model.dataentity.defield.IPSDEField;

public class DBSchemeUtils {

	public static boolean doesTableExist(DataSource dataSource, IDBDialect iDBDialect, String tableName) throws SQLException {
		Connection connection = null;
		DatabaseMetaData meta = null;
		ResultSet tables = null;
		try {
			connection = dataSource.getConnection();
			meta = connection.getMetaData();
			tables = meta.getTables(null, null, tableName, new String[] { "TABLE" });
			return tables.next();
		} finally {
			if (tables != null) {
				tables.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
	}

	public static Map<String, Map<String, Object>> getTableColumns(DataSource dataSource, IDBDialect iDBDialect, String tableName) throws SQLException {
		Map<String, Map<String, Object>> map = new LinkedHashMap<String, Map<String, Object>>();
		Connection connection = null;
		DatabaseMetaData meta = null;
		ResultSet tables = null;
		try {
			connection = dataSource.getConnection();
			meta = connection.getMetaData();
			ResultSet columns = meta.getColumns(null, null, tableName.toUpperCase(), null);
			// 遍历结果集并打印每一列的信息
			while (columns.next()) {
				String columnName = columns.getString("COLUMN_NAME");
				String columnType = columns.getString("TYPE_NAME");
				// int dataSize = columns.getInt("COLUMN_SIZE");
				// String defaultValue = columns.getString("COLUMN_DEF");
				// boolean isNullable = columns.getBoolean("NULLABLE");
				
				Map<String, Object> details = new LinkedHashMap<String, Object>();
				details.put("COLUMN_NAME", columnName);
				details.put("TYPE_NAME", columnType);

				map.put(columnName.toUpperCase(), details);
			}

			return map;
		} finally {
			if (tables != null) {
				tables.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
	}

	public static void createTable(DataSource dataSource, IDBDialect iDBDialect, String tableName, Collection<IPSDEField> psDEFieldList) throws Exception {
		String strSQL = null;
		try {
			strSQL = iDBDialect.getCreateTableSQL(tableName, psDEFieldList);
		} catch (Throwable ex) {
			throw new Exception(String.format("获取建立数据表SQL发生异常，%1$s", ex.getMessage()));
		}

		Connection connection = null;
		Statement statement = null;
		try {
			connection = dataSource.getConnection();
			statement = connection.createStatement();
			statement.executeUpdate(strSQL);
		} finally {
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
	}

	public static void createColumn(DataSource dataSource, IDBDialect iDBDialect, String tableName, IPSDEField iPSDEField) throws Exception {
		String strSQL = null;
		try {
			strSQL = iDBDialect.getCreateColumnSQL(tableName, iPSDEField);
		} catch (Throwable ex) {
			throw new Exception(String.format("获取建立数据列SQL发生异常，%1$s", ex.getMessage()));
		}

		Connection connection = null;
		Statement statement = null;
		try {
			connection = dataSource.getConnection();
			statement = connection.createStatement();
			statement.executeUpdate(strSQL);
		} finally {
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
	}
}
