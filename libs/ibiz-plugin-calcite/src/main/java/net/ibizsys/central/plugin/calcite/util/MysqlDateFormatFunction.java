package net.ibizsys.central.plugin.calcite.util;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.calcite.sql.SqlBasicCall;
import org.apache.calcite.sql.SqlCall;
import org.apache.calcite.sql.SqlFunction;
import org.apache.calcite.sql.SqlFunctionCategory;
import org.apache.calcite.sql.SqlKind;
import org.apache.calcite.sql.SqlLiteral;
import org.apache.calcite.sql.parser.SqlParserPos;

public class MysqlDateFormatFunction extends SQLFunctionBase {

	public final static MysqlDateFormatFunction DEFAULT = new MysqlDateFormatFunction();
	
	private static Map<String, String> FormatMap = new LinkedHashMap<String, String>();
	static {
		//临时支持以下
		FormatMap.put("yyyy", "%Y");
		FormatMap.put("yy", "%y");
		FormatMap.put("MM", "%m");
		FormatMap.put("dd", "%d");
		
		FormatMap.put("HH", "%H");
		FormatMap.put("mm", "%i");
		FormatMap.put("ss", "%s");
		
		
	}
	
	@Override
	public SqlCall parse(SqlBasicCall sqlBasicCall, Map<String, Object> params) {
		
		if(sqlBasicCall.getOperandList() == null || sqlBasicCall.getOperandList().size()!=2) {
			throw new RuntimeException("参数无效");
		}
		

		SqlFunction DATE_FORMAT = new SqlFunction("DATE_FORMAT", SqlKind.OTHER_FUNCTION,
				 null, null, null, SqlFunctionCategory.STRING);
		
		String strFormat = getStringValue(sqlBasicCall.getOperandList().get(1).toString());
		
		while(true) {
			String strLastFormat = strFormat;
			for(java.util.Map.Entry<String, String> entry : FormatMap.entrySet()) {
				strFormat = strFormat.replace(entry.getKey(), entry.getValue());
				//有变化，重新开始
				if(!strLastFormat.equals(strFormat)) {
					break;
				}
			}
			
			if(strLastFormat.equals(strFormat)) {
				break;
			}
		}
		
		
		SqlBasicCall dateFormatCall =	new SqlBasicCall(DATE_FORMAT, Arrays.asList(sqlBasicCall.getOperandList().get(0), SqlLiteral.createCharString(strFormat, SqlParserPos.ZERO)), SqlParserPos.ZERO);
		
		return dateFormatCall;
	}
}
