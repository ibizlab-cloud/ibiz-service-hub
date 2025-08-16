package net.ibizsys.central.plugin.calcite.util;

import java.util.Arrays;
import java.util.Map;

import org.apache.calcite.sql.SqlBasicCall;
import org.apache.calcite.sql.SqlCall;
import org.apache.calcite.sql.SqlFunction;
import org.apache.calcite.sql.SqlFunctionCategory;
import org.apache.calcite.sql.SqlKind;
import org.apache.calcite.sql.parser.SqlParserPos;

public class MysqlDateDiffFunction extends SQLFunctionBase {

	public final static MysqlDateDiffFunction DEFAULT = new MysqlDateDiffFunction();

	@Override
	public SqlCall parse(SqlBasicCall sqlBasicCall, Map<String, Object> params) {

		if(sqlBasicCall.getOperandList() == null || (sqlBasicCall.getOperandList().size()!=3 && sqlBasicCall.getOperandList().size()!=2)) {
			throw new RuntimeException("参数无效");
		}


		SqlFunction DATEDIFF = new SqlFunction("DATEDIFF", SqlKind.OTHER_FUNCTION,
				null, null, null, SqlFunctionCategory.NUMERIC);


		SqlBasicCall dateDiffCall =	new SqlBasicCall(DATEDIFF, Arrays.asList(sqlBasicCall.getOperandList().get(0), sqlBasicCall.getOperandList().get(1)), SqlParserPos.ZERO);
		
		return dateDiffCall;
	}
}
