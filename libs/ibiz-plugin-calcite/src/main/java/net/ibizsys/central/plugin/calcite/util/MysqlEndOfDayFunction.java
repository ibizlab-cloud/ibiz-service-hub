package net.ibizsys.central.plugin.calcite.util;

import java.util.Arrays;
import java.util.Map;

import org.apache.calcite.sql.SqlBasicCall;
import org.apache.calcite.sql.SqlCall;
import org.apache.calcite.sql.SqlFunction;
import org.apache.calcite.sql.SqlFunctionCategory;
import org.apache.calcite.sql.SqlKind;
import org.apache.calcite.sql.SqlLiteral;
import org.apache.calcite.sql.parser.SqlParserPos;

public class MysqlEndOfDayFunction extends SQLFunctionBase {

	public final static MysqlEndOfDayFunction DEFAULT = new MysqlEndOfDayFunction();
	
	
	@Override
	public SqlCall parse(SqlBasicCall sqlBasicCall, Map<String, Object> params) {
		
		if(sqlBasicCall.getOperandList() == null || sqlBasicCall.getOperandList().size()!=1) {
			throw new RuntimeException("参数无效");
		}
		
		SqlFunction TIMESTAMP = new SqlFunction("TIMESTAMP", SqlKind.OTHER_FUNCTION,
				 null, null, null, SqlFunctionCategory.TIMEDATE);
		
		SqlFunction DATE = new SqlFunction("DATE", SqlKind.OTHER_FUNCTION,
				 null, null, null, SqlFunctionCategory.STRING);
		
		SqlFunction CONCAT = new SqlFunction("CONCAT", SqlKind.OTHER_FUNCTION,
				 null, null, null, SqlFunctionCategory.STRING);
		
		
		SqlBasicCall dateCall =	new SqlBasicCall(DATE, Arrays.asList(sqlBasicCall.getOperandList().get(0)), SqlParserPos.ZERO);
		SqlBasicCall concatCall = new SqlBasicCall(CONCAT, Arrays.asList(dateCall, SqlLiteral.createCharString(" 23:59:59", SqlParserPos.ZERO)), SqlParserPos.ZERO);
		SqlBasicCall timestampCall =	new SqlBasicCall(TIMESTAMP, Arrays.asList(concatCall), SqlParserPos.ZERO);
		
		return timestampCall;
		
	}
}
