package net.ibizsys.central.plugin.calcite.util;

import java.util.Map;

import org.apache.calcite.sql.SqlBasicCall;
import org.apache.calcite.sql.SqlNode;

import net.ibizsys.runtime.security.UserContext;

public class SQLSessionContextFunction extends SQLSessionContextFunctionBase {

	public final static SQLSessionContextFunction DEFAULT = new SQLSessionContextFunction();
	
	@Override
	public SqlNode parse(SqlBasicCall sqlBasicCall, Map<String, Object> params) {
		
		if(sqlBasicCall.getOperandList() == null || sqlBasicCall.getOperandList().size()!=1) {
			throw new RuntimeException("参数无效");
		}
		
		//获取参数名称
		String strParamName = getStringValue(sqlBasicCall.getOperandList().get(0).toString());
		return this.getSessionValueSqlNode(UserContext.getCurrentMust(), strParamName.toLowerCase(), params);
	}
	
	
}
