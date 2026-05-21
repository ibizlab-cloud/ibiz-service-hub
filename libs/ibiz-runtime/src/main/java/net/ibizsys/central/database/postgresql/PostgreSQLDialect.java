package net.ibizsys.central.database.postgresql;

import org.springframework.util.ObjectUtils;

import net.ibizsys.central.database.DBDialectBase;
import net.ibizsys.model.PSModelEnums.DBObjNameCaseMode;
import net.ibizsys.runtime.util.DBTypes;
import net.ibizsys.runtime.util.DataTypes;
import net.ibizsys.runtime.util.SqlParam;

public class PostgreSQLDialect extends DBDialectBase{

	public PostgreSQLDialect() {
	}
	
	@Override
	public String getDBType() {
		return DBTypes.POSTGRESQL;
	}
	
	@Override
	public String getDBObjStandardName(String strOriginName, DBObjNameCaseMode dbObjNameCaseMode) throws Throwable {
		switch(dbObjNameCaseMode) {
		case LCASE:
			strOriginName = strOriginName.toLowerCase();
			break;
		case UCASE:
			strOriginName = strOriginName.toUpperCase();
			break;
		default:
			return strOriginName;
		}
		
		String[] items = strOriginName.split("[.]");
		if (items.length == 1) {
			return String.format("\"%1$s\"", strOriginName);
		} else {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < items.length; i++) {
				if (i != 0) {
					sb.append(".");
				}
				sb.append(String.format("\"%1$s\"", items[i]));
			}
			return sb.toString();
		}
	}
	

	@Override
	public boolean supportDataType(int stdDataType) {
		switch(stdDataType) {
		case DataTypes.VECTOR:
		case DataTypes.TSVECTOR:
			return true;
		default:
			return super.supportDataType(stdDataType);
		}
	}
	
	
	@Override
	public SqlParam getSqlParam(int stdDataType, Object value) {
		if(stdDataType == DataTypes.TSVECTOR) {
			if(!ObjectUtils.isEmpty(value)) {
				SqlParam sqlParam = SqlParam.value(value);
				sqlParam.setBeforeCode("to_tsvector('simple',");
				sqlParam.setAfterCode(")");
				return sqlParam;
			}
		}
		return super.getSqlParam(stdDataType, value);
	}
}
