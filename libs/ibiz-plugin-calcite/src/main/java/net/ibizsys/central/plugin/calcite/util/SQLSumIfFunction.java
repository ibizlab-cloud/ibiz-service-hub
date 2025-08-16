package net.ibizsys.central.plugin.calcite.util;

import java.util.Arrays;
import java.util.Map;

import org.apache.calcite.sql.SqlBasicCall;
import org.apache.calcite.sql.SqlCall;
import org.apache.calcite.sql.SqlFunction;
import org.apache.calcite.sql.SqlFunctionCategory;
import org.apache.calcite.sql.SqlKind;
import org.apache.calcite.sql.SqlLiteral;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.SqlNodeList;
import org.apache.calcite.sql.fun.SqlCase;
import org.apache.calcite.sql.parser.SqlParserPos;

public class SQLSumIfFunction extends SQLFunctionBase {

	public final static SQLSumIfFunction DEFAULT = new SQLSumIfFunction();
	
	@Override
	public SqlCall parse(SqlBasicCall sqlBasicCall, Map<String, Object> params) {
		
		if(sqlBasicCall.getOperandList() == null || sqlBasicCall.getOperandList().size()!=2) {
			throw new RuntimeException("参数无效");
		}
		
		SqlFunction sumFunction = new SqlFunction("SUM", SqlKind.OTHER_FUNCTION,
				 null, null, null, SqlFunctionCategory.NUMERIC);
		
		SqlNodeList whenList = new SqlNodeList(SqlParserPos.ZERO);
		SqlNodeList thenList = new SqlNodeList(SqlParserPos.ZERO);
		SqlNode elseClause = null;
		
		whenList.add(sqlBasicCall.getOperandList().get(1));
		thenList.add(sqlBasicCall.getOperandList().get(0));
		elseClause = SqlLiteral.createNull(SqlParserPos.ZERO);
		
		SqlCase sqlCase = SqlCase.createSwitched(SqlParserPos.ZERO, null, whenList, thenList, elseClause);
		
		return new SqlBasicCall(sumFunction, Arrays.asList(sqlCase), SqlParserPos.ZERO);
		
	}
	
	
}
