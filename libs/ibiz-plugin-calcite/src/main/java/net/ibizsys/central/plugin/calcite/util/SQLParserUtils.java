package net.ibizsys.central.plugin.calcite.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.calcite.config.Lex;
import org.apache.calcite.sql.SqlDialect;
import org.apache.calcite.sql.dialect.Db2SqlDialect;
import org.apache.calcite.sql.dialect.MssqlSqlDialect;
import org.apache.calcite.sql.dialect.MysqlSqlDialect;
import org.apache.calcite.sql.dialect.OracleSqlDialect;
import org.apache.calcite.sql.dialect.PostgresqlSqlDialect;
import org.apache.calcite.sql.parser.SqlParser;
import org.apache.calcite.sql.parser.SqlParser.Config;

import net.ibizsys.runtime.util.DBTypes;

public class SQLParserUtils {

	static Map<String, Config> ConfigMap = new HashMap<String, Config>();
	static Map<String, SqlDialect> SqlDialectMap = new HashMap<String, SqlDialect>();
	static Map<String, Lex> LexMap = new HashMap<String, Lex>();
	static {
		ConfigMap.put(DBTypes.MYSQL5, SqlParser.config().withLex(getLex(DBTypes.MYSQL5)));
		ConfigMap.put("MYSQL", ConfigMap.get(DBTypes.MYSQL5));
		ConfigMap.put(DBTypes.SQLITE, ConfigMap.get(DBTypes.MYSQL5));
		ConfigMap.put(DBTypes.ORACLE, SqlParser.config().withLex(getLex(DBTypes.ORACLE)));
		ConfigMap.put(DBTypes.PPAS, ConfigMap.get(DBTypes.ORACLE));
		ConfigMap.put(DBTypes.SQLSERVER, SqlParser.config().withLex(getLex(DBTypes.SQLSERVER)));
		ConfigMap.put("", SqlParser.config().withLex(Lex.MYSQL_ANSI));
	}
	
	/**
	 * @param strDBType
	 * @return
	 */
	public static SqlDialect getSqlDialect(String strDBType) {
		strDBType = strDBType.toUpperCase();
		
		SqlDialect sqlDialect = SqlDialectMap.get(strDBType);
		if(sqlDialect != null) {
			return sqlDialect;
		}
		
		switch(strDBType) {
		case DBTypes.MYSQL5:
		case DBTypes.SQLITE:
		case "MYSQL":
			return MysqlSqlDialect.DEFAULT;
		case DBTypes.DB2:
			return Db2SqlDialect.DEFAULT;
		case DBTypes.ORACLE:
		case DBTypes.PPAS:
			return OracleSqlDialect.DEFAULT;
		case DBTypes.POSTGRESQL:
			return PostgresqlSqlDialect.DEFAULT;
		case DBTypes.SQLSERVER:
			return MssqlSqlDialect.DEFAULT;
		default:
			return MysqlSqlDialect.DEFAULT;
		}
	}
	
	
	public static void setSqlDialect(String strDBType,  SqlDialect sqlDialect) {
		SqlDialectMap.put(strDBType.toUpperCase(), sqlDialect);
	}
	
	
	public static Lex getLex(String strDBType) {
		
		strDBType = strDBType.toUpperCase();
		
		Lex lex = LexMap.get(strDBType);
		if(lex != null) {
			return lex;
		}
		
		switch(strDBType) {
		case DBTypes.MYSQL5:
		case DBTypes.SQLITE:
		case "MYSQL":
			return Lex.MYSQL;
		case DBTypes.ORACLE:
		case DBTypes.PPAS:
			return Lex.ORACLE;
		case DBTypes.SQLSERVER:
			return Lex.SQL_SERVER;
		default:
			return Lex.MYSQL_ANSI;
		}
	}
	
	public static void setLex(String strDBType, Lex lex) {
		LexMap.put(strDBType.toUpperCase(), lex);
	}
	
	public static Config getConfig(String strDBType) {
		Config config = ConfigMap.get(strDBType.toUpperCase());
		if(config != null) {
			return config;
		}
		return ConfigMap.get("");
	}
	
	public static void setConfig(String strDBType, Config config) {
		ConfigMap.put(strDBType.toUpperCase(), config);
	}
}
