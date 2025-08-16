package net.ibizsys.central.plugin.calcite.util;

import java.util.Map;

import org.apache.calcite.sql.SqlBasicCall;
import org.apache.calcite.sql.SqlCall;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.SqlSelect;
import org.apache.calcite.sql.parser.SqlParser;

public class MysqlStartOfQuarterFunction extends SQLFunctionBase {

	public final static MysqlStartOfQuarterFunction DEFAULT = new MysqlStartOfQuarterFunction();

	@Override
	public SqlCall parse(SqlBasicCall sqlBasicCall, Map<String, Object> params) {

		if (sqlBasicCall.getOperandList() == null || sqlBasicCall.getOperandList().size() != 1) {
			throw new RuntimeException("参数无效");
		}

		try {
			String sql = String.format("SELECT DATE_ADD(DATE_FORMAT(%1$s, '%%Y-01-01 00:00:00'), INTERVAL (QUARTER(%1$s) - 1) QUARTER) FROM t1", sqlBasicCall.getOperandList().get(0).toSqlString(CommonSqlDialect.DEFAULT).getSql());
			SqlParser parser = SqlParser.create(sql);
			SqlNode sqlNode = parser.parseQuery();

			// 解析 SQL，获取解析结果
			SqlSelect sqlSelect = (SqlSelect) sqlNode;

			return (SqlCall) sqlSelect.getSelectList().get(0);

		} catch (Throwable ex) {
			throw new RuntimeException(String.format("解析StartOfQuarter函数发生异常，%1$s", ex.getMessage()), ex);
		}

	}
}
