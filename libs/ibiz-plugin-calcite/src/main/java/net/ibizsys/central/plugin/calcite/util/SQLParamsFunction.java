package net.ibizsys.central.plugin.calcite.util;
import java.util.ArrayList;
import java.util.Map;

import org.apache.calcite.sql.SqlBasicCall;
import org.apache.calcite.sql.SqlLiteral;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.SqlNodeList;
import org.apache.calcite.sql.SqlNumericLiteral;
import org.apache.calcite.sql.parser.SqlParserPos;

public class SQLParamsFunction extends SQLFunctionBase {

	public final static SQLParamsFunction DEFAULT = new SQLParamsFunction();

	@Override
	public SqlNode parse(SqlBasicCall sqlBasicCall, Map<String, Object> params) {

		if(sqlBasicCall.getOperandList() == null || sqlBasicCall.getOperandList().size() < 2) {
			throw new RuntimeException("参数无效");
		}

		//获取参数名称
		String strParamName = getStringValue( sqlBasicCall.getOperandList().get(0).toString());

		Object value = params!=null?params.get(strParamName.toLowerCase()):null;
		if(value == null) {
			//使用默认值
			if(sqlBasicCall.getOperandList().get(1) instanceof SqlNodeList) {
				return sqlBasicCall.getOperandList().get(1);
			}
			else {
				ArrayList<SqlNode> list = new ArrayList<SqlNode> ();
				for (int i = 1; i < sqlBasicCall.getOperandList().size(); i++) {
					list.add(sqlBasicCall.getOperandList().get(i));
				}
				return SqlNodeList.of(SqlParserPos.ZERO, list);
			}
		}

		String[] items = value.toString().split("[,]");

		//判断参数的类型
		if(sqlBasicCall.getOperandList().get(1) instanceof SqlNodeList) {
			SqlNodeList sqlNodeList = (SqlNodeList)sqlBasicCall.getOperandList().get(1);
			if(sqlNodeList.size()>0 && sqlNodeList.get(0) instanceof SqlLiteral) {
				SqlLiteral sqlLiteral = (SqlLiteral)sqlNodeList.get(0);
				ArrayList<SqlNode> list = new ArrayList<SqlNode> ();
				if(sqlLiteral instanceof SqlNumericLiteral) {
					for(String strValue : items) {
						list.add(SqlLiteral.createExactNumeric(strValue, SqlParserPos.ZERO));
					}
				}
				else {
					for(String strValue : items) {
						list.add(SqlLiteral.createCharString(strValue, SqlParserPos.ZERO));
					}
				}
				return SqlNodeList.of(SqlParserPos.ZERO, list);
			}
		}
		else
		if(sqlBasicCall.getOperandList().get(1) instanceof SqlLiteral) {
			SqlLiteral sqlLiteral = (SqlLiteral)sqlBasicCall.getOperandList().get(1);
			ArrayList<SqlNode> list = new ArrayList<SqlNode> ();
			if(sqlLiteral instanceof SqlNumericLiteral) {
				for(String strValue : items) {
					list.add(SqlLiteral.createExactNumeric(strValue, SqlParserPos.ZERO));
				}
			}
			else {
				for(String strValue : items) {
					list.add(SqlLiteral.createCharString(strValue, SqlParserPos.ZERO));
				}

			}
			return SqlNodeList.of(SqlParserPos.ZERO, list);
		}

		ArrayList<SqlNode> list = new ArrayList<SqlNode> ();
		for(String strValue : items) {
			list.add(SqlLiteral.createCharString(strValue, SqlParserPos.ZERO));
		}
		return SqlNodeList.of(SqlParserPos.ZERO, list);

	}


}
