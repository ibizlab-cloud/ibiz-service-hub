package net.ibizsys.central.plugin.calcite.util;

import java.util.Map;

import org.apache.calcite.sql.SqlBasicCall;
import org.apache.calcite.sql.SqlLiteral;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.SqlNumericLiteral;
import org.apache.calcite.sql.parser.SqlParserPos;

public class SQLParamFunction extends SQLFunctionBase {

	public final static SQLParamFunction DEFAULT = new SQLParamFunction();
	
	@Override
	public SqlNode parse(SqlBasicCall sqlBasicCall, Map<String, Object> params) {
		
		if(sqlBasicCall.getOperandList() == null || sqlBasicCall.getOperandList().size()!=2) {
			throw new RuntimeException("参数无效");
		}
		
		//获取参数名称
		String strParamName = getStringValue( sqlBasicCall.getOperandList().get(0).toString());
		
		Object value = params!=null?params.get(strParamName.toLowerCase()):null;
		if(value == null) {
			//使用默认值
			return sqlBasicCall.getOperandList().get(1);
		}
		
		//判断参数的类型
		if(sqlBasicCall.getOperandList().get(1) instanceof SqlLiteral) {
			SqlLiteral sqlLiteral = (SqlLiteral)sqlBasicCall.getOperandList().get(1);
			if(sqlLiteral instanceof SqlNumericLiteral) {
				return SqlLiteral.createExactNumeric(value.toString(), SqlParserPos.ZERO);
			}
			else {
				return SqlLiteral.createCharString(value.toString(), SqlParserPos.ZERO);
			}
		}
		
		if(value instanceof java.lang.Number) {
			return SqlLiteral.createExactNumeric(value.toString(), SqlParserPos.ZERO);
		}
		else {
			return SqlLiteral.createCharString(value.toString(), SqlParserPos.ZERO);
		}
	}
	
	
}
