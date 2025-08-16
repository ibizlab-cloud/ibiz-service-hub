package net.ibizsys.central.plugin.calcite.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.calcite.sql.SqlBasicCall;
import org.apache.calcite.sql.SqlNode;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.model.PSModelEnums.DBType;

public class FunctionParser {

	private static final Log log = LogFactory.getLog(FunctionParser.class);
	
	/*
	 * 计数函数
	 */
	public final static String COUNTIF = "COUNTIF"; 
	
	/*
	 * 合计函数
	 */
	public final static String SUMIF = "SUMIF"; 
	
	/*
	 * 平均函数
	 */
	public final static String AVGIF = "AVGIF"; 
	
	
	/*
	 * 多维条件
	 */
	public final static String MULTIIF = "MULTIIF"; 
	
	
	/*
	 * 单维条件
	 */
	public final static String IF = "IF"; 
	
	
	/*
	 * 参数
	 */
	public final static String PARAM = "PARAM"; 
	
	/*
	 * 参数数组
	 */
	public final static String PARAMS = "PARAMS"; 
	
	
	/*
	 * 传入时间的所在天最后一秒
	 */
	public final static String ENDOFDAY = "ENDOFDAY"; 
	
	/*
	 * 传入时间的所在天第一秒
	 */
	public final static String STARTOFDAY = "STARTOFDAY"; 
	
	/*
	 * 传入时间的所在周第一秒
	 */
	public final static String STARTOFWEEK = "STARTOFWEEK"; 
	
	
	/*
	 * 传入时间的所在周最后一秒
	 */
	public final static String ENDOFWEEK = "ENDOFWEEK"; 
	
	/*
	 * 传入时间的所在月第一秒
	 */
	public final static String STARTOFMONTH = "STARTOFMONTH"; 
	
	/*
	 * 传入时间的所在月最后一秒
	 */
	public final static String ENDOFMONTH = "ENDOFMONTH"; 
	
	

	/*
	 * 传入时间的所在季度第一秒
	 */
	public final static String STARTOFQUARTER = "STARTOFQUARTER"; 
	
	
	/*
	 * 传入时间的所在季度最后一秒
	 */
	public final static String ENDOFQUARTER = "ENDOFQUARTER"; 
	
	
	/*
	 * 传入时间的所在年第一秒
	 */
	public final static String STARTOFYEAR = "STARTOFYEAR"; 
	
	/*
	 * 传入时间的所在年最后一秒
	 */
	public final static String ENDOFYEAR = "ENDOFYEAR"; 
	
	
	
	/*
	 * 获取传入两个的间隔天
	 */
	public final static String DATEDIFF = "DATEDIFF"; 
	
	
	/*
	 * 获取时间格式化
	 */
	public final static String DATEFORMAT = "DATEFORMAT"; 
	
	/*
	 * 获取时间格式化
	 */
	public final static String DATE_FORMAT = "DATE_FORMAT"; 
	
	
//	/*
//	 * 获取时间格式化
//	 */
//	public final static String DATEADD = "DATEADD"; 
	
	/*
	 * 时间增加
	 */
	public final static String DATE_ADD = "DATE_ADD";
	
	
	/*
	 * 时间减少
	 */
	public final static String DATE_SUB = "DATE_SUB";
	
	
	
	/*
	 * 获取传入字符串的时间
	 */
	public final static String TIMESTAMP = "TIMESTAMP"; 
	
	
	/*
	 * 获取传入时间的年周字符串
	 */
	public final static String YEARWEEKCHAR = "YEARWEEKCHAR"; 
	
	/*
	 * 获取传入时间的年季度字符串
	 */
	public final static String YEARQUARTERCHAR = "YEARQUARTERCHAR"; 
	
	
	/*
	 * 获取当前用户标识 
	 */
	public final static String CURUSERID = "CURUSERID"; 
	
	/*
	 * 获取当前用户部门标识 
	 */
	public final static String CURDEPTID = "CURDEPTID"; 
	
	/*
	 * 获取当前机构标识 
	 */
	public final static String CURORGID = "CURORGID"; 
	
	/*
	 * 获取当前用户标识，等同 CURUSERID
	 */
	public final static String CURRENTUSER = "CURRENTUSER"; 
	
	/*
	 * 获取当前会话值
	 */
	public final static String SESSIONCONTEXT = "SESSIONCONTEXT"; 
	
	/*
	 * 获取当前会话值（尝试）
	 */
	public final static String SESSIONCONTEXTIF = "SESSIONCONTEXTIF"; 
	
	/*
	 * 获取数据上下文值
	 */
	public final static String DATACONTEXT = "DATACONTEXT"; 
	
	/*
	 * 获取数据上下文值（尝试）
	 */
	public final static String DATACONTEXTIF = "DATACONTEXTIF"; 
	
	
	private static Map<String, SQLFunctionBase> SQLFunctionMap = new HashMap<String, SQLFunctionBase>();
	
	static {
		SQLFunctionMap.put(COUNTIF, SQLCountIfFunction.DEFAULT);
		SQLFunctionMap.put(SUMIF, SQLSumIfFunction.DEFAULT);
		SQLFunctionMap.put(AVGIF, SQLAvgIfFunction.DEFAULT);
		SQLFunctionMap.put(MULTIIF, SQLMultiIfFunction.DEFAULT);
		SQLFunctionMap.put(IF, SQLIfFunction.DEFAULT);
		SQLFunctionMap.put(PARAM, SQLParamFunction.DEFAULT);
		SQLFunctionMap.put(PARAMS, SQLParamsFunction.DEFAULT);
		
		
		SQLFunctionMap.put(CURUSERID, SQLCurUserIdFunction.DEFAULT);
		SQLFunctionMap.put(CURDEPTID, SQLCurDeptIdFunction.DEFAULT);
		SQLFunctionMap.put(CURORGID, SQLCurOrgIdFunction.DEFAULT);
		SQLFunctionMap.put(CURRENTUSER, SQLCurUserIdFunction.DEFAULT);
		SQLFunctionMap.put(SESSIONCONTEXT, SQLSessionContextFunction.DEFAULT);
		SQLFunctionMap.put(SESSIONCONTEXTIF, SQLSessionContextIfFunction.DEFAULT);
		SQLFunctionMap.put(DATACONTEXT, SQLDataContextFunction.DEFAULT);
		SQLFunctionMap.put(DATACONTEXTIF, SQLDataContextIfFunction.DEFAULT);
		
		registerSQLFunction(DBType.MYSQL5.value, STARTOFDAY, MysqlStartOfDayFunction.DEFAULT);
		registerSQLFunction("MYSQL", STARTOFDAY, MysqlStartOfDayFunction.DEFAULT);
		
		registerSQLFunction(DBType.MYSQL5.value, ENDOFDAY, MysqlEndOfDayFunction.DEFAULT);
		registerSQLFunction("MYSQL", ENDOFDAY, MysqlEndOfDayFunction.DEFAULT);
		
		registerSQLFunction(DBType.MYSQL5.value, STARTOFWEEK, MysqlStartOfWeekFunction.DEFAULT);
		registerSQLFunction("MYSQL", STARTOFWEEK, MysqlStartOfWeekFunction.DEFAULT);
		
		registerSQLFunction(DBType.MYSQL5.value, ENDOFWEEK, MysqlEndOfWeekFunction.DEFAULT);
		registerSQLFunction("MYSQL", ENDOFWEEK, MysqlEndOfWeekFunction.DEFAULT);
		
		registerSQLFunction(DBType.MYSQL5.value, STARTOFMONTH, MysqlStartOfMonthFunction.DEFAULT);
		registerSQLFunction("MYSQL", STARTOFMONTH, MysqlStartOfMonthFunction.DEFAULT);
		
		registerSQLFunction(DBType.MYSQL5.value, ENDOFMONTH, MysqlEndOfMonthFunction.DEFAULT);
		registerSQLFunction("MYSQL", ENDOFMONTH, MysqlEndOfMonthFunction.DEFAULT);
		
		registerSQLFunction(DBType.MYSQL5.value, STARTOFQUARTER, MysqlStartOfQuarterFunction.DEFAULT);
		registerSQLFunction("MYSQL", STARTOFQUARTER, MysqlStartOfQuarterFunction.DEFAULT);
		
		registerSQLFunction(DBType.MYSQL5.value, ENDOFQUARTER, MysqlEndOfQuarterFunction.DEFAULT);
		registerSQLFunction("MYSQL", ENDOFQUARTER, MysqlEndOfQuarterFunction.DEFAULT);
		
		registerSQLFunction(DBType.MYSQL5.value, STARTOFYEAR, MysqlStartOfYearFunction.DEFAULT);
		registerSQLFunction("MYSQL", STARTOFYEAR, MysqlStartOfYearFunction.DEFAULT);
		
		registerSQLFunction(DBType.MYSQL5.value, ENDOFYEAR, MysqlEndOfYearFunction.DEFAULT);
		registerSQLFunction("MYSQL", ENDOFYEAR, MysqlEndOfYearFunction.DEFAULT);
		
		
		registerSQLFunction(DBType.MYSQL5.value, DATEDIFF, MysqlDateDiffFunction.DEFAULT);
		registerSQLFunction("MYSQL", DATEDIFF, MysqlDateDiffFunction.DEFAULT);
		
		registerSQLFunction(DBType.MYSQL5.value, DATEFORMAT, MysqlDateFormatFunction.DEFAULT);
		registerSQLFunction("MYSQL", DATEFORMAT, MysqlDateFormatFunction.DEFAULT);
		
		registerSQLFunction(DBType.MYSQL5.value, DATE_FORMAT, MysqlDateFormatFunction.DEFAULT);
		registerSQLFunction("MYSQL", DATE_FORMAT, MysqlDateFormatFunction.DEFAULT);
		
		
		registerSQLFunction(DBType.MYSQL5.value, YEARWEEKCHAR, MysqlYearWeekCharFunction.DEFAULT);
		registerSQLFunction("MYSQL", YEARWEEKCHAR, MysqlYearWeekCharFunction.DEFAULT);
		
		registerSQLFunction(DBType.MYSQL5.value, YEARQUARTERCHAR, MysqlYearQuarterCharFunction.DEFAULT);
		registerSQLFunction("MYSQL", YEARQUARTERCHAR, MysqlYearQuarterCharFunction.DEFAULT);
		
		
		//registerSQLFunction(DBType.MYSQL5.value, TIMESTAMP, MysqlTimestampFunction.DEFAULT);
		//registerSQLFunction("MYSQL", TIMESTAMP, MysqlTimestampFunction.DEFAULT);
		
	}
	
	public static SQLFunctionBase getSQLFunction(String strDBType, String strFuncName) {
		String strTag = StringUtils.hasLength(strDBType)?String.format("%1$s:%2$s", strDBType, strFuncName):strFuncName;
		return SQLFunctionMap.get(strTag.toUpperCase());
	}
	
	public static void registerSQLFunction(String strDBType, String strFuncName, SQLFunctionBase sqlFunctionBase) {
		String strTag = StringUtils.hasLength(strDBType)?String.format("%1$s:%2$s", strDBType, strFuncName):strFuncName;
		SQLFunctionMap.put(strTag.toUpperCase(), sqlFunctionBase);
	}
	
	public static SQLFunctionBase unregisterSQLFunction(String strDBType, String strFuncName) {
		String strTag = StringUtils.hasLength(strDBType)?String.format("%1$s:%2$s", strDBType, strFuncName):strFuncName;
		return SQLFunctionMap.remove(strTag.toUpperCase());
	}

	
	public static SqlNode parseSQL(String strDBType, SqlBasicCall function, Map<String, Object> params) {
		String strFuncName = function.getOperator().getName();
		String strTag = StringUtils.hasLength(strDBType)?String.format("%1$s:%2$s", strDBType, strFuncName):strFuncName;
		SQLFunctionBase sqlFunctionBase = SQLFunctionMap.get(strTag.toUpperCase());
		if(sqlFunctionBase != null) {
			return sqlFunctionBase.parse(function, params);
		}
		
		if(StringUtils.hasLength(strDBType)) {
			sqlFunctionBase = SQLFunctionMap.get(strFuncName.toUpperCase());
			if(sqlFunctionBase != null) {
				return sqlFunctionBase.parse(function, params);
			}
		}
		
		return function;
	}
}
