package net.ibizsys.central.plugin.calcite.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.calcite.sql.SqlLiteral;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.SqlNodeList;
import org.apache.calcite.sql.parser.SqlParserPos;

import net.ibizsys.runtime.security.IUserContext;

public abstract class SQLSessionContextFunctionBase extends SQLFunctionBase {

	private final static Map<String, String> ArrayParamNameMap = new HashMap<String, String>();
	static {
		ArrayParamNameMap.put(IUserContext.SESSION_PDEPT, "");
		ArrayParamNameMap.put(IUserContext.SESSION_SDEPT, "");
		ArrayParamNameMap.put(IUserContext.SESSION_PORG, "");
		ArrayParamNameMap.put(IUserContext.SESSION_SORG, "");
	}
		
	protected SqlNode getSessionValueSqlNode(IUserContext iUserContext, String strSessionName, Map<String, Object> params) {
		
		Object value = iUserContext.getSessionParam(strSessionName);
		
		/**
		 * 需要进一批判断是否为数组
		 */
		if(ArrayParamNameMap.containsKey(strSessionName)) {
			
			ArrayList<SqlNode> list = new ArrayList<SqlNode> ();
			if(value == null) {
				list.add(SqlLiteral.createCharString("", SqlParserPos.ZERO));
				return SqlNodeList.of(SqlParserPos.ZERO, list);
			}
			
			String[] items = value.toString().split("[,]");
			for(String strValue : items) {
				list.add(SqlLiteral.createCharString(strValue, SqlParserPos.ZERO));
			}
			return SqlNodeList.of(SqlParserPos.ZERO, list);
		}
		else {
			if(value == null) {
				return SqlLiteral.createCharString("", SqlParserPos.ZERO);
			}
			if(value instanceof java.lang.Number) {
				return SqlLiteral.createExactNumeric(value.toString(), SqlParserPos.ZERO);
			}
			else {
				return SqlLiteral.createCharString(value.toString(), SqlParserPos.ZERO);
			}
		}
		
		
		
	}
	
	
}
