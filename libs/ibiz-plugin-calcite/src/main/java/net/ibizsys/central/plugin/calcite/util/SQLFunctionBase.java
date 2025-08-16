package net.ibizsys.central.plugin.calcite.util;

import java.util.Map;

import org.apache.calcite.sql.SqlBasicCall;
import org.apache.calcite.sql.SqlNode;

public abstract class SQLFunctionBase {

	public abstract SqlNode parse(SqlBasicCall sqlBasicCall, Map<String, Object> params);
	
	
	public static String getStringValue(String strValue) {
		if((strValue.indexOf("'") == 0) && (strValue.lastIndexOf("'") == strValue.length() -1)) {
			strValue = strValue.substring(1);
			strValue = strValue.substring(0, strValue.length() -1);
			return strValue.replace("''", "'");
		}
		
		return strValue;
	}
}
