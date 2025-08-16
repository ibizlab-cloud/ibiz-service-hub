package net.ibizsys.central.plugin.calcite.util;

import java.util.Map;

import org.apache.calcite.sql.SqlBasicCall;
import org.apache.calcite.sql.SqlCall;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.SqlNodeList;
import org.apache.calcite.sql.fun.SqlCase;
import org.apache.calcite.sql.parser.SqlParserPos;

public class SQLIfFunction extends SQLFunctionBase {

	public final static SQLIfFunction DEFAULT = new SQLIfFunction();
	
	@Override
	public SqlCall parse(SqlBasicCall sqlBasicCall, Map<String, Object> params) {
		
		if(sqlBasicCall.getOperandList() == null || sqlBasicCall.getOperandList().size()!=3) {
			throw new RuntimeException("参数无效");
		}
		
		SqlNodeList whenList = new SqlNodeList(SqlParserPos.ZERO);
		SqlNodeList thenList = new SqlNodeList(SqlParserPos.ZERO);
		SqlNode elseClause = null;
		
		int nSize = sqlBasicCall.getOperandList().size()/2;
		for(int i=0;i<nSize;i++) {
			whenList.add(sqlBasicCall.getOperandList().get(i*2));
			thenList.add(sqlBasicCall.getOperandList().get(i*2+1));
		}
		if(sqlBasicCall.getOperandList().size()%2 != 0) {
			elseClause = sqlBasicCall.getOperandList().get(sqlBasicCall.getOperandList().size() - 1);
		}

		return SqlCase.createSwitched(SqlParserPos.ZERO, null, whenList, thenList, elseClause);
	}
	
	
}
