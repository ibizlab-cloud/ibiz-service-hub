package net.ibizsys.central.plugin.calcite.util;

import java.util.Map;

import org.apache.calcite.sql.SqlBasicCall;
import org.apache.calcite.sql.SqlCall;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.SqlSelect;
import org.apache.calcite.sql.dialect.Db2SqlDialect;
import org.apache.calcite.sql.parser.SqlParser;

import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;

public class SQLSessionContextIfFunction extends SQLFunctionBase {

	public final static SQLSessionContextIfFunction DEFAULT = new SQLSessionContextIfFunction();
	
	@Override
	public SqlNode parse(SqlBasicCall sqlBasicCall, Map<String, Object> params) {
		
		if(sqlBasicCall.getOperandList() == null || sqlBasicCall.getOperandList().size()!=2) {
			throw new RuntimeException("参数无效");
		}
		
		String strParamName = getStringValue(sqlBasicCall.getOperandList().get(0).toString());
		IUserContext iUserContext =  UserContext.getCurrent();
		Object value =  iUserContext != null? iUserContext.getSessionParam(strParamName.toLowerCase()) : null;
		if(value == null) {
			try {
				String sql = String.format("SELECT %1$s FROM t1", sqlBasicCall.getOperandList().get(1).toSqlString(Db2SqlDialect.DEFAULT).getSql());
				SqlParser parser = SqlParser.create(sql);
				SqlNode sqlNode = parser.parseQuery();

				// 解析 SQL，获取解析结果
				SqlSelect sqlSelect = (SqlSelect) sqlNode;

				return (SqlCall) sqlSelect.getSelectList().get(0);

			} catch (Throwable ex) {
				throw new RuntimeException(String.format("解析SessionContextIf函数发生异常，%1$s", ex.getMessage()), ex);
			}
		}
		
		return sqlBasicCall.getOperandList().get(1);
		
	}
	
	
}
