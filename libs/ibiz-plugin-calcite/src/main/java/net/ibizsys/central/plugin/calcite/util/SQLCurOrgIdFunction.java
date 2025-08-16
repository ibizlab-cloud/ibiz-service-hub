package net.ibizsys.central.plugin.calcite.util;

import java.util.Map;

import org.apache.calcite.sql.SqlBasicCall;
import org.apache.calcite.sql.SqlNode;

import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;

public class SQLCurOrgIdFunction extends SQLSessionContextFunctionBase {

	public final static SQLCurOrgIdFunction DEFAULT = new SQLCurOrgIdFunction();
	
	@Override
	public SqlNode parse(SqlBasicCall sqlBasicCall, Map<String, Object> params) {
		
		if(sqlBasicCall.getOperandList() != null && sqlBasicCall.getOperandList().size()!=0) {
			throw new RuntimeException("参数无效");
		}
		
		return this.getSessionValueSqlNode(UserContext.getCurrentMust(), IUserContext.SESSION_ORGID, params);
	}
	
	
}
