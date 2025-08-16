package net.ibizsys.central.plugin.calcite.util;

import java.util.Map;

import org.apache.calcite.sql.SqlBasicCall;
import org.apache.calcite.sql.SqlCall;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.SqlSelect;
import org.apache.calcite.sql.parser.SqlParser;

public class MysqlEndOfQuarterFunction extends SQLFunctionBase {

	public final static MysqlEndOfQuarterFunction DEFAULT = new MysqlEndOfQuarterFunction();

	@Override
	public SqlCall parse(SqlBasicCall sqlBasicCall, Map<String, Object> params) {

		if (sqlBasicCall.getOperandList() == null || sqlBasicCall.getOperandList().size() != 1) {
			throw new RuntimeException("参数无效");
		}

		try {
			String sql = String.format("SELECT DATE_SUB( DATE_ADD( DATE_FORMAT(%1$s, '%%Y-01-01 23:59:59'), INTERVAL (QUARTER(%1$s)) QUARTER), INTERVAL 1 DAY) FROM t1", sqlBasicCall.getOperandList().get(0).toSqlString(CommonSqlDialect.DEFAULT).getSql());
			SqlParser parser = SqlParser.create(sql);
			SqlNode sqlNode = parser.parseQuery();

			// 解析 SQL，获取解析结果
			SqlSelect sqlSelect = (SqlSelect) sqlNode;

			return (SqlCall) sqlSelect.getSelectList().get(0);

		} catch (Throwable ex) {
			throw new RuntimeException(String.format("解析EndOfQuarter函数发生异常，%1$s", ex.getMessage()), ex);
		}
	}
}
