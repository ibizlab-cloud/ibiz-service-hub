package net.ibizsys.central.plugin.calcite.util;

import org.apache.calcite.sql.SqlBasicCall;
import org.apache.calcite.sql.SqlCall;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.SqlSelect;
import org.apache.calcite.sql.dialect.Db2SqlDialect;
import org.apache.calcite.sql.parser.SqlParser;

import java.util.Map;

public class PostgresqlDateDiffFunction extends SQLFunctionBase {

	public final static PostgresqlDateDiffFunction DEFAULT = new PostgresqlDateDiffFunction();

	@Override
	public SqlCall parse(SqlBasicCall sqlBasicCall, Map<String, Object> params) {

		if (sqlBasicCall.getOperandList() == null || (sqlBasicCall.getOperandList().size() != 2 && sqlBasicCall.getOperandList().size() != 3)) {
			throw new RuntimeException("参数无效");
		}

		try {
			String sql = String.format(
					"SELECT EXTRACT(DAY FROM (CAST(%2$s AS timestamp) - CAST(%1$s AS timestamp)))",
					sqlBasicCall.getOperandList().get(0).toSqlString(Db2SqlDialect.DEFAULT).getSql(),
					sqlBasicCall.getOperandList().get(1).toSqlString(Db2SqlDialect.DEFAULT).getSql()
			);

			SqlParser parser = SqlParser.create(sql);
			SqlNode sqlNode = parser.parseQuery();

			// 解析 SQL，获取解析结果
			SqlSelect sqlSelect = (SqlSelect) sqlNode;
			return (SqlCall) sqlSelect.getSelectList().get(0);

		} catch (Throwable ex) {
			throw new RuntimeException(String.format("解析DateDiff函数发生异常，%1$s", ex.getMessage()), ex);
		}
	}
}
