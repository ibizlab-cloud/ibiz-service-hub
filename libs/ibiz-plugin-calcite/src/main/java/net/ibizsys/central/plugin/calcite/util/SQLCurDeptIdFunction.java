package net.ibizsys.central.plugin.calcite.util;

import java.util.Map;

import org.apache.calcite.sql.SqlBasicCall;
import org.apache.calcite.sql.SqlNode;

import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;

public class SQLCurDeptIdFunction extends SQLSessionContextFunctionBase {

	public final static SQLCurDeptIdFunction DEFAULT = new SQLCurDeptIdFunction();
	
	@Override
	public SqlNode parse(SqlBasicCall sqlBasicCall, Map<String, Object> params) {
		
		if(sqlBasicCall.getOperandList() != null && sqlBasicCall.getOperandList().size()!=0) {
			throw new RuntimeException("参数无效");
		}
		
		return this.getSessionValueSqlNode(UserContext.getCurrentMust(), IUserContext.SESSION_DEPTID, params);
	}
	
	
}
