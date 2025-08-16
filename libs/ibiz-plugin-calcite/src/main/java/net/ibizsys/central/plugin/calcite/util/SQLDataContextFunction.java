package net.ibizsys.central.plugin.calcite.util;

import java.util.Map;

import org.apache.calcite.sql.SqlBasicCall;
import org.apache.calcite.sql.SqlLiteral;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.parser.SqlParserPos;

public class SQLDataContextFunction extends SQLSessionContextFunctionBase {

	public final static SQLDataContextFunction DEFAULT = new SQLDataContextFunction();
	
	@Override
	public SqlNode parse(SqlBasicCall sqlBasicCall, Map<String, Object> params) {
		
		if(sqlBasicCall.getOperandList() == null || sqlBasicCall.getOperandList().size()!=1) {
			throw new RuntimeException("参数无效");
		}
		
		//获取参数名称
		String strParamName = getStringValue(sqlBasicCall.getOperandList().get(0).toString());
		Object value = params!=null?params.get(strParamName.toLowerCase()):null;
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
