package net.ibizsys.central.plugin.calcite.util;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.calcite.sql.*;
import org.apache.calcite.sql.dialect.Db2SqlDialect;
import org.apache.calcite.sql.parser.SqlParser;

public class PostgresqlDateFormatFunction extends SQLFunctionBase {

	public final static PostgresqlDateFormatFunction DEFAULT = new PostgresqlDateFormatFunction();

	private static Map<String, String> FormatMap = new LinkedHashMap<String, String>();

	static {
		FormatMap.put("%Y", "YYYY");
		FormatMap.put("%y", "YY");
		FormatMap.put("%m", "MM");
		FormatMap.put("%d", "DD");
		FormatMap.put("%H", "HH24");
		FormatMap.put("%i", "MI");
		FormatMap.put("%s", "SS");
	}

	@Override
	public SqlCall parse(SqlBasicCall sqlBasicCall, Map<String, Object> params) {
		if (sqlBasicCall.getOperandList() == null || sqlBasicCall.getOperandList().size() != 2) {
			throw new RuntimeException("参数无效");
		}

		String strFormat = getStringValue(sqlBasicCall.getOperandList().get(1).toString());

		for (Map.Entry<String, String> entry : FormatMap.entrySet()) {
			strFormat = strFormat.replace(entry.getKey(), entry.getValue());
		}

		try {
			String sql = String.format("SELECT TO_CHAR(CAST(%1$s AS timestamp), '%2$s')", sqlBasicCall.getOperandList().get(0).toSqlString(Db2SqlDialect.DEFAULT).getSql(), strFormat);
			SqlParser parser = SqlParser.create(sql);
			SqlNode sqlNode = parser.parseQuery();

			// 提取解析结果
			SqlSelect sqlSelect = (SqlSelect) sqlNode;
			return (SqlCall) sqlSelect.getSelectList().get(0);

		} catch (Throwable ex) {
			throw new RuntimeException(String.format("解析DateFormat函数发生异常，%1$s", ex.getMessage()), ex);
		}
	}
}
