package net.ibizsys.central.database;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.Assert;

import net.ibizsys.central.database.mssql.MSSQLDialect;
import net.ibizsys.central.database.mysql.MySQL5Dialect;
import net.ibizsys.central.database.oracle.OracleDialect;
import net.ibizsys.runtime.util.DBTypes;

public class DBDialectUtils {

	private static DBDialectUtils instance = null;
	
	public static DBDialectUtils getInstance() {
		if(DBDialectUtils.instance == null) {
			DBDialectUtils.instance = new DBDialectUtils();
		}
		return DBDialectUtils.instance;
	}
	
	public static void setInstance(DBDialectUtils instance) {
		DBDialectUtils.instance = instance;
	}
	
	
	
	private Map<String, IDBDialect> dbDialectMap = new HashMap<String, IDBDialect>();
	
	
	public IDBDialect get(String strType) {
		Assert.hasLength(strType, "未传入数据库类型");
		IDBDialect iDBDialect = dbDialectMap.get(strType);
		if(iDBDialect == null) {
			iDBDialect = this.createDBDialect(strType);
			dbDialectMap.put(strType, iDBDialect);
		}
		return iDBDialect;
	}
	
	public void setDBDialect(String strType, IDBDialect iDBDialect) {
		Assert.hasLength(strType, "未传入数据库类型");
		dbDialectMap.put(strType, iDBDialect);
	}
	
	public boolean containsDBDialect(String strType) {
		return dbDialectMap.containsKey(strType);
	}
	
	protected IDBDialect createDBDialect(String strType) {
		if(DBTypes.MYSQL5.equals(strType)) {
			return new MySQL5Dialect();
		}
		if(DBTypes.ORACLE.equals(strType)) {
			return new OracleDialect();
		}
		if(DBTypes.SQLSERVER.equals(strType)) {
			return new MSSQLDialect();
		}
		return new SimpleDBDialect(strType);
	}
	
	
	
}
