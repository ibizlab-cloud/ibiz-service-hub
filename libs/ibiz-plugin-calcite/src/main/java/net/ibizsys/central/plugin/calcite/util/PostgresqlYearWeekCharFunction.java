package net.ibizsys.central.plugin.calcite.util;

import org.apache.calcite.sql.SqlBasicCall;
import org.apache.calcite.sql.SqlCall;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.SqlSelect;
import org.apache.calcite.sql.dialect.Db2SqlDialect;
import org.apache.calcite.sql.parser.SqlParser;

import java.util.Map;

public class PostgresqlYearWeekCharFunction extends SQLFunctionBase {

	public final static PostgresqlYearWeekCharFunction DEFAULT = new PostgresqlYearWeekCharFunction();

	@Override
	public SqlCall parse(SqlBasicCall sqlBasicCall, Map<String, Object> params) {

		if (sqlBasicCall.getOperandList() == null || sqlBasicCall.getOperandList().size() != 1) {
			throw new RuntimeException("参数无效");
		}

		try {
			String sql = String.format("SELECT TO_CHAR(CAST(%1$s AS timestamp), 'IYYY\"W\"IW') FROM t1", sqlBasicCall.getOperandList().get(0).toSqlString(Db2SqlDialect.DEFAULT).getSql());
			SqlParser parser = SqlParser.create(sql);
			SqlNode sqlNode = parser.parseQuery();

			// 解析 SQL，获取解析结果
			SqlSelect sqlSelect = (SqlSelect) sqlNode;
			return (SqlCall) sqlSelect.getSelectList().get(0);

		} catch (Throwable ex) {
			throw new RuntimeException(String.format("解析YearWeekToChar函数发生异常，%1$s", ex.getMessage()), ex);
		}
	}
}
