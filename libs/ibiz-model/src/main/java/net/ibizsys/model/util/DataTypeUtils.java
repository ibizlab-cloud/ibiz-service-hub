package net.ibizsys.model.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Base64;
import java.util.Date;
import java.util.TimeZone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;



/**
 * 数据类型辅助类
 * 
 * @author Administrator
 * 
 */
public class DataTypeUtils {
	
	private static final Log log = LogFactory.getLog(DataTypeUtils.class);
	
	/**
	 * Boolean 值，True
	 */
	public final static int BOOLEAN_TRUE = 1;

	/**
	 * Boolean 值，False
	 */
	public final static int BOOLEAN_FALSE = 0;
	

	public DataTypeUtils() {
	}


	/**
	 * 解析文本值到实际值
	 * 
	 * @param dataType 数据类型，参考 net.ibizsys.paas.core.DataTypes 
	 * @param strValue
	 * @return
	 * @throws Exception
	 */
	public static Object parse(int dataType, String strValue) throws Exception {

		if(!StringUtils.hasLength(strValue)) {
			return null;
		}
		
		if (dataType == DataTypes.BIGINT ) {
			return testBigInt(strValue);
		} else if ( dataType == DataTypes.INT || dataType == DataTypes.SMALLINT) {
			return testInteger(strValue);
		} else if (dataType == DataTypes.CHAR || dataType == DataTypes.NCHAR || dataType == DataTypes.NTEXT || dataType == DataTypes.NVARCHAR || dataType == DataTypes.SYSNAME || dataType == DataTypes.TEXT || dataType == DataTypes.VARCHAR) {
			return strValue;
		} else if (dataType == DataTypes.DATETIME || dataType == DataTypes.SMALLDATETIME || dataType == DataTypes.DATE || dataType == DataTypes.TIME ) {
			return testDateTime(strValue);
//		} else if (dataType == DataTypes.DATE) {
//			return testDate(strValue);
//		} else if (dataType == DataTypes.TIME) {
//			return testTime(strValue);
		} else if (dataType == DataTypes.MONEY || dataType == DataTypes.NUMERIC || dataType == DataTypes.SMALLMONEY || dataType == DataTypes.FLOAT || dataType == DataTypes.REAL) {
			return testDouble(strValue);
		} else if (dataType == DataTypes.DECIMAL || dataType == DataTypes.BIGDECIMAL) {
			return testDecimal(strValue);
		}else if (dataType == DataTypes.VARBINARY || dataType == DataTypes.BINARY) {
			return testByteArray(strValue);
		}
		return strValue;
	}
	
	
	/**
	 * 转化转入值到指定类型
	 * @param dataType
	 * @param value
	 * @return
	 * @throws Exception
	 */
	public static Object convert(int dataType, Object value) throws Exception{
		
		if(value == null) {
			return null;
		}
		
		if(value instanceof String) {
			if(!StringUtils.hasLength((String)value)) {
				return null;
			}
		}
		
		if (dataType == DataTypes.BIGINT ) {
			//return testBigInt(strValue);
			return getBigIntegerValue(value, null);
		} else if ( dataType == DataTypes.INT || dataType == DataTypes.SMALLINT) {
			//return testInteger(strValue);
			return getIntegerValue(value, null);
		} else if (dataType == DataTypes.CHAR || dataType == DataTypes.NCHAR || dataType == DataTypes.NTEXT || dataType == DataTypes.NVARCHAR || dataType == DataTypes.SYSNAME || dataType == DataTypes.TEXT || dataType == DataTypes.VARCHAR) {
			//return strValue;
			return getStringValue(value, null);
		} else if (dataType == DataTypes.DATETIME || dataType == DataTypes.SMALLDATETIME || dataType == DataTypes.DATE || dataType == DataTypes.TIME) {
			//return testDateTime(strValue);
			return getDateTimeValue(value, null);
//		} else if (dataType == DataTypes.DATE) {
//			return testDate(strValue);
//		} else if (dataType == DataTypes.TIME) {
//			return testTime(strValue);
		} else if (dataType == DataTypes.MONEY || dataType == DataTypes.NUMERIC || dataType == DataTypes.SMALLMONEY || dataType == DataTypes.FLOAT || dataType == DataTypes.REAL) {
			//return testDouble(strValue);
			return getDoubleValue(value, null);
		} else if (dataType == DataTypes.DECIMAL || dataType == DataTypes.BIGDECIMAL) {
			//return testDecimal(strValue);
			return getBigDecimalValue(value, null);
		}
		else if(dataType == DataTypes.VARBINARY) {
			return getByteArrayValue(value, null);
		}
			
		return value;
	}
	
	
	
	/**
	 * 获取对象的数据类型
	 * 
	 * @param objValue
	 * @return
	 */
	public static int getObjectDataType(Object objValue) {
		if (objValue == null) return DataTypes.VARCHAR;

		if ((objValue instanceof String) || (objValue instanceof Character)) {
			return DataTypes.VARCHAR;
		}

		if (objValue instanceof Integer) {
			return DataTypes.INT;
		}

		if (objValue instanceof Float || objValue instanceof Double) {
			return DataTypes.REAL;
		}
		
		if ((objValue instanceof java.sql.Date) || (objValue instanceof java.util.Date) || (objValue instanceof java.sql.Timestamp)) {
			return DataTypes.DATETIME;
		}

		if (objValue instanceof BigInteger || objValue instanceof Long) {
			return DataTypes.BIGINT;
		}
		
		if (objValue instanceof BigDecimal) {
			return DataTypes.BIGDECIMAL;
		}
		
		
		if (objValue instanceof Byte[] || objValue instanceof byte[]) {
			return DataTypes.VARBINARY;
		}
		
		
		return DataTypes.VARCHAR;
	}
	

//
//	/**
//	 * 转换字符串到时间日期型 
//	 * 
//	 * @param dataType
//	 * @param strValue
//	 * @param timeZone
//	 * @return
//	 */
//	public static Object parseDateTime(int dataType, String strValue, TimeZone timeZone) throws Exception {
//		if (dataType == DataTypes.DATETIME || dataType == DataTypes.SMALLDATETIME) {
//			return testDateTime(strValue, timeZone);
//		} else if (dataType == DataTypes.DATE) {
//			return testDate(strValue, timeZone);
//		} else if (dataType == DataTypes.TIME) {
//			return testTime(strValue, timeZone);
//		}
//
//		return null;
//
//	}
//
	/**
	 * 转换文本值到大整数值
	 * 
	 * @param strInput
	 * @return
	 * @throws Exception
	 */
	public static Object testBigInt(String strInput) throws Exception {
		if (!StringUtils.hasLength(strInput)) return null;
		strInput = strInput.replace(",", "");
		//return BigInteger.valueOf(Long.parseLong(strInput));
		return new BigInteger(strInput);
	}
//
//	/**
//	 * 转换文本值到文本值
//	 * 
//	 * @param strInput
//	 * @return
//	 * @throws Exception
//	 */
//	public static Object testString(String strInput) throws Exception {
//		return strInput;
//	}
//
	/**
	 * 转换文本值到整数值
	 * 
	 * @param strInput
	 * @return
	 * @throws Exception
	 */
	public static Object testInteger(String strInput) throws Exception {
		if (!StringUtils.hasLength(strInput)) return null;
		strInput = strInput.replace(",", "");

		int nValue = java.lang.Integer.parseInt(strInput);
		return nValue;
	}

	/**
	 * 转换文本值到大数值
	 * 
	 * @param strInput
	 * @return
	 * @throws Exception
	 */
	public static Object testDecimal(String strInput) throws Exception {
		if (!StringUtils.hasLength(strInput)) return null;
//		Object objValue = testDouble(strInput);
//		if (objValue != null) {
//			return java.math.BigDecimal.valueOf((Double) objValue);
//		}
//		return null;
		strInput = strInput.replace(",", "");
		return new BigDecimal(strInput);
	}

	/**
	 * 转换文本值到Double
	 * 
	 * @param strInput
	 * @return
	 * @throws Exception
	 */
	public static Object testDouble(String strInput) throws Exception {
		if (!StringUtils.hasLength(strInput)) return null;
		strInput = strInput.replace(",", "");

		double fValue = java.lang.Double.parseDouble(strInput);
		return fValue;
	}
//
//	/**
//	 * 转换文本值到浮点
//	 * 
//	 * @param strInput
//	 * @return
//	 * @throws Exception
//	 */
//	public static Object testFloat(String strInput) throws Exception {
//		if (!StringUtils.hasLength(strInput)) return null;
//		strInput = strInput.replace(",", "");
//
//		float fValue = java.lang.Float.parseFloat(strInput);
//		return fValue;
//	}
//
	/**
	 * 转换文本值到日期
	 * 
	 * @param strInput
	 * @param timeZone
	 * @return
	 * @throws Exception
	 */
	public static Object testDate(String strInput, TimeZone timeZone) throws Exception {
		if (!StringUtils.hasLength(strInput)) return null;
		Date dtDate = DateUtils.parse(strInput, timeZone);
		java.sql.Date retDate = new java.sql.Date(dtDate.getTime());
		return retDate;
	}

	/**
	 * 转换文本值到日期
	 * 
	 * @param strInput
	 * @return
	 * @throws Exception
	 */
	public static Object testDate(String strInput) throws Exception {
		return testDate(strInput, null);
	}

	/**
	 * 转换文本值到时间
	 * 
	 * @param strInput
	 * @return
	 * @throws Exception
	 */
	public static Object testTime(String strInput) throws Exception {
		return testTime(strInput, null);

	}

	/**
	 * 转换文本值到时间
	 * 
	 * @param strInput
	 * @param timeZone
	 * @return
	 * @throws Exception
	 */
	public static Object testTime(String strInput, TimeZone timeZone) throws Exception {
		if (!StringUtils.hasLength(strInput)) return null;
		Date dtDate = DateUtils.parse(strInput, timeZone);
		/*
		 * DateFormat dtFormat = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss"); Date dtDate = dtFormat.parse(strInput);
		 */
		java.sql.Time retTime = new java.sql.Time(dtDate.getTime());
		return retTime;
	}

	/**
	 * 转换文本值到日期时间
	 * 
	 * @param strInput
	 * @return
	 * @throws Exception
	 */
	public static Object testDateTime(String strInput) throws Exception {
		return testDateTime(strInput, null);
	}

	/**
	 * 转换文本值到日期时间
	 * 
	 * @param strInput
	 * @param timeZone
	 * @return
	 * @throws Exception
	 */
	public static Object testDateTime(String strInput, TimeZone timeZone) throws Exception {
		if (!StringUtils.hasLength(strInput)) return null;
		Date dtDate = DateUtils.parse(strInput, timeZone);
		java.sql.Timestamp retDate = new java.sql.Timestamp(dtDate.getTime());
		return retDate;
	}
	
	
	/**
	 * 转换文本值到字节数组
	 * 
	 * @param strInput
	 * @return
	 * @throws Exception
	 */
	public static Object testByteArray(String strInput) throws Exception {
		if (!StringUtils.hasLength(strInput)) return null;
		
		return Base64.getDecoder().decode(strInput);
	}
	
	

	/**
	 * 获取传入值的字节数组值
	 * @param objValue
	 * @param def
	 * @return
	 */
	final static public byte[] getByteArrayValue(Object objValue, byte[] def) {
		if (objValue == null) {
			return def;
		}
		
		if(objValue instanceof byte[]){
			return  (byte[])objValue;
		}
		

		
		String strValue = objValue.toString();
		if(!StringUtils.hasLength(strValue))
			return def;
		
		strValue = strValue.replace(",", "");
		return Base64.getDecoder().decode(strValue);
	}
	
	
	
//
//	/**
//	 * 检查对象长度是否符合要求
//	 * 
//	 * @param dataType
//	 * @param objValue
//	 * @param nLen
//	 * @return
//	 */
//	public static boolean checkLen(int dataType, Object objValue, int nLen) {
//		if (objValue == null) {
//			return false;
//		}
//
//		if (nLen <= 0) {
//			return true;
//		}
//
//		if (dataType == DataTypes.CHAR || dataType == DataTypes.NCHAR || dataType == DataTypes.NTEXT || dataType == DataTypes.NVARCHAR || dataType == DataTypes.SYSNAME || dataType == DataTypes.TEXT || dataType == DataTypes.VARCHAR) {
//			return (objValue.toString().length() <= nLen);
//		}
//		return true;
//	}
//
//	/**
//	 * 小于对比
//	 * 
//	 * @param dataType
//	 * @param objValueFrom
//	 * @param objValueTo
//	 * @return
//	 */
//	public static boolean lessThan(int dataType, Object objValueFrom, Object objValueTo) {
//		long nRet = compare(dataType, objValueFrom, objValueTo);
//		if (nRet <= 0) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//
//	/**
//	 * 对比2个对象值，注意：出现 null 值时按最大处理
//	 * 
//	 * @param strDataType 数据类型，参考 net.ibizsys.paas.core.DataTypes 
//	 * @param objValue
//	 * @param objValueCompare
//	 * @return
//	 */
//	public static long compare(String strDataType, Object objValue, Object objValueCompare) {
//		return compare(DataTypeUtils.fromString(strDataType), objValue, objValueCompare);
//	}
//
	/**
	 * 对比2个对象值，注意：出现 null 值时按最大处理
	 * 
	 * @param dataType 数据类型
	 * @param objValue
	 * @param objValueCompare
	 * @return
	 */
	public static long compare(int dataType, Object objValue, Object objValueCompare) {
		
		if (objValue == null || objValueCompare == null) {
			if (objValue == null && objValueCompare == null) return 0;
			if (objValue == null)
				return 1;
			else
				return -1;
		}

		long nTemp = 0;
		
		if (dataType == DataTypes.BIGINT) {
			
			BigInteger nValue2;
			BigInteger nValueCompare2;
			
			
			if (!(objValue instanceof BigInteger)) {
				nValue2 = new BigInteger(objValue.toString());
			} else
				nValue2 = (BigInteger) objValue;

			if (!(objValueCompare instanceof BigInteger)) {
				nValueCompare2 =   new BigInteger(objValueCompare.toString());
			} else
				nValueCompare2 = (BigInteger) objValueCompare;
			
//			nValue2 = getBigIntegerValue(objValue, null);
//			nValueCompare2 = getBigIntegerValue(objValueCompare, null);

			nTemp = nValue2.longValue() - nValueCompare2.longValue();
		}
		else
		if ( dataType == DataTypes.INT || dataType == DataTypes.SMALLINT) {
			
			Integer nValue;
			Integer nValueCompare;
			
			if (!(objValue instanceof Integer)) {
				nValue = Integer.parseInt(objValue.toString());
			} else
				nValue = (Integer) objValue;

			if (!(objValueCompare instanceof Integer)) {
				nValueCompare = Integer.parseInt(objValueCompare.toString());
			} else
				nValueCompare = (Integer) objValueCompare;

			nTemp = nValue - nValueCompare;

		} else if (dataType == DataTypes.DATETIME || dataType == DataTypes.SMALLDATETIME || dataType == DataTypes.DATE || dataType == DataTypes.TIME) {
			long nTime1 = getDateTimeValue(objValue);
			long nTime2 = getDateTimeValue(objValueCompare);
			nTemp = nTime1 - nTime2;
		} else if ( dataType == DataTypes.MONEY || dataType == DataTypes.NUMERIC || dataType == DataTypes.SMALLMONEY || dataType == DataTypes.FLOAT || dataType == DataTypes.REAL) {
			
			Double fValue;
			Double fValueCompare;
			
			if (!(objValue instanceof Double)) {
				fValue = Double.parseDouble(objValue.toString());
			} else
				fValue = (Double) objValue;

			if (!(objValueCompare instanceof Double)) {
				fValueCompare = Double.parseDouble(objValueCompare.toString());
			} else
				fValueCompare = (Double) objValueCompare;

			double fTemp = fValue - fValueCompare;
			if (fTemp == 0) {
				nTemp = 0;
			} else if (fTemp > 0) {
				nTemp = 1;
			} else {
				nTemp = -1;
			}
		} 
		else if (dataType == DataTypes.DECIMAL || dataType == DataTypes.BIGDECIMAL) {
			
			BigDecimal  fValue2;
			BigDecimal  fValueCompare2;
			
			if (!(objValue instanceof BigDecimal)) {
				//fValue2 = BigDecimal.valueOf(Double.parseDouble(objValue.toString()));
				fValue2 = new BigDecimal(objValue.toString());
			} else
				fValue2 = (BigDecimal) objValue;

			if (!(objValueCompare instanceof BigDecimal)) {
				//fValueCompare2 =  BigDecimal.valueOf(Double.parseDouble(objValueCompare.toString()));
				fValueCompare2 =  new BigDecimal(objValueCompare.toString());
			} else
				fValueCompare2 = (BigDecimal) objValueCompare;

			//double fTemp = fValue2.doubleValue() - fValueCompare2.doubleValue();
			BigDecimal fTemp = fValue2.subtract(fValueCompare2);
			if (fTemp.doubleValue() == 0) {
				nTemp = 0;
			} else if (fTemp.doubleValue() > 0) {
				nTemp = 1;
			} else {
				nTemp = -1;
			}
		}
		else if (dataType == DataTypes.CHAR || dataType == DataTypes.NCHAR || dataType == DataTypes.NTEXT || dataType == DataTypes.NVARCHAR || dataType == DataTypes.SYSNAME || dataType == DataTypes.TEXT || dataType == DataTypes.VARCHAR) {
			nTemp = objValue.toString().compareTo(objValueCompare.toString());
		} 
		else if(dataType == DataTypes.VARBINARY) {
			byte[] val = getByteArrayValue(objValue, null);
			byte[] valCompare = getByteArrayValue(objValueCompare, null);
			
			nTemp =  java.util.Base64.getEncoder().encodeToString(val).compareTo(java.util.Base64.getEncoder().encodeToString(valCompare));
		}

		if (nTemp == 0) {
			return 0;
		} else if (nTemp > 0) {
			return 1;
		} else {
			return -1;
		}
	}

	/**
	 * 对比字符串，大小写敏感
	 * @param strValue
	 * @param strValueCompare
	 * @return
	 */
	public static long compare(String strValue, String strValueCompare) {
		return compare(strValue, strValueCompare, false);
		
	}
	
	/**
	 * 对比字符串
	 * @param strValue
	 * @param strValueCompare
	 * @param bIgnoreCase 
	 * @return
	 */
	public static long compare(String strValue, String strValueCompare, boolean bIgnoreCase) {
		if (strValue == null || strValueCompare == null) {
			if (strValue == null && strValueCompare == null) return 0;
			if (strValue == null)
				return 1;
			else
				return -1;
		}
		
		long nTemp = 0;
		if(!bIgnoreCase) {
			nTemp = strValue.compareTo(strValueCompare);
		}
		else {
			nTemp = strValue.compareToIgnoreCase(strValueCompare);
		}
		if (nTemp == 0) {
			return 0;
		} else if (nTemp > 0) {
			return 1;
		} else {
			return -1;
		}
	}
	/**
	 * 判断是否为字符串的数据类型
	 * 
	 * @param dataType
	 * @return
	 */
	public static boolean isStringDataType(int dataType) {
		switch (dataType) {
		case DataTypes.CHAR:
		case DataTypes.NCHAR:
		case DataTypes.NTEXT:
		case DataTypes.NVARCHAR:
		case DataTypes.SYSNAME:
		case DataTypes.TEXT:
		case DataTypes.VARCHAR:

			return true;
		default:
			return false;

		}
	}
	
	/**
	 * 判断是否为长文本的数据类型
	 * 
	 * @param dataType
	 * @return
	 */
	public static boolean isLongStringDataType(int dataType) {
		switch (dataType) {
		case DataTypes.NTEXT:
		case DataTypes.TEXT:
			return true;
		default:
			return false;
		}
	}
	

	/**
	 * 判断是否为长数据流的数据类型
	 * 
	 * @param dataType
	 * @return
	 */
	public static boolean isLongBinaryDataType(int dataType) {
		switch (dataType) {
		case DataTypes.VARBINARY:
			return true;
		default:
			return false;
		}
	}
	
	/**
	 * 是否为二进制流类型
	 * 
	 * @param dataType
	 * @return
	 */
	public final static boolean isBinaryType(int dataType) {
		return (dataType == DataTypes.BINARY || dataType == DataTypes.VARBINARY);
	}
	
	
	/**
	 * 是否为时间相关类型
	 * 
	 * @param dataType
	 * @return
	 */
	public static boolean isDateTimeDataType(int dataType) {
		switch (dataType) {
		case DataTypes.DATE:
		case DataTypes.DATETIME:
		case DataTypes.SMALLDATETIME:
		case DataTypes.TIME:
		case DataTypes.TIMESTAMP:
			return true;
		default:
			return false;
		}
	}

	
	/**
	 * 是否为整形
	 * 
	 * @param dataType
	 * @return
	 */
	public final static boolean isIntDataType(int dataType) {
		return (dataType == DataTypes.INT
				|| dataType == DataTypes.SMALLINT
				|| dataType == DataTypes.BIGINT
				|| dataType == DataTypes.TINYINT);
	}
	
	
	/**
	 * 是否为Double
	 * 
	 * @param dataType
	 * @return
	 */
	public final static boolean isDoubleDataType(int dataType) {
		return (dataType == DataTypes.FLOAT
				|| dataType == DataTypes.DECIMAL
				|| dataType == DataTypes.MONEY
				|| dataType == DataTypes.SMALLMONEY
				|| dataType == DataTypes.NUMERIC
				|| dataType == DataTypes.REAL
				|| dataType == DataTypes.BIGDECIMAL);
	}
	
	/**
	 * 是否为大整形
	 * 
	 * @param dataType
	 * @return
	 */
	public final static boolean isBigIntDataType(int dataType) {
		return (dataType == DataTypes.BIGINT);
	}

	/**
	 * 是否为大数值
	 * 
	 * @param dataType
	 * @return
	 */
	public final static boolean isBigDecimalDataType(int dataType) {
		return (dataType == DataTypes.BIGDECIMAL || dataType == DataTypes.DECIMAL);
	}
	
	
	/**
	 * 是否为数值类型
	 * 
	 * @param dataType
	 * @return
	 */
	public final static boolean isNumberDataType(int dataType) {
		return isIntDataType(dataType) || isDoubleDataType(dataType);
	}
	
	
	/**
	 * 获取时间对象Long值
	 * 
	 * @param obj
	 * @return
	 */
	public static long getDateTimeValue(Object obj) {
		if (obj instanceof java.sql.Time) {
			return ((java.sql.Time) obj).getTime();
		}

		if (obj instanceof java.sql.Date) {
			return ((java.sql.Date) obj).getTime();
		}

		if (obj instanceof java.sql.Timestamp) {
			return ((java.sql.Timestamp) obj).getTime();
		}

		if (obj instanceof java.util.Date) {
			return ((java.util.Date) obj).getTime();
		}

		return -1;
	}

	
	
	/**
	 * 判断条件是否成立
	 * @param objSrcValue
	 * @param strOp
	 * @param objDstValue
	 * @return
	 */
	public static boolean testCond(Object objSrcValue, String strOp, Object objDstValue) throws Exception{
		return testCond(objSrcValue, strOp, objDstValue, DataTypes.UNKNOWN);
	}
	
	/**
	 * 判断条件是否成立
	 * 
	 * @param objSrcValue
	 * @param strOp
	 * @param strDstValue
	 * @param nValueDataType 值类型
	 * @return
	 * @throws Exception
	 */
	public static boolean testCond(Object objSrcValue, String strOp, Object objDstValue, int nValueDataType) throws Exception {
		if (Conditions.ISNULL.equals(strOp)){
			return objSrcValue == null;
		}

		if (Conditions.ISNOTNULL.equals(strOp)){
			return objSrcValue != null;
		}

		if (objSrcValue == null) {
			if (Conditions.EQ.equals(strOp)){
				return (objDstValue == null);
			}

			if (Conditions.NOTEQ.equals(strOp)){
				return (objDstValue != null);
			}
			return false;
		}

		if (objSrcValue instanceof String) {
			String strSrcValue = (String) objSrcValue;
			String strDstValue = (String) objDstValue;

			if (Conditions.LEFTLIKE.equals(strOp)){
				return strSrcValue.toUpperCase().indexOf(strDstValue.toUpperCase()) == 0;
			}

			if (Conditions.LIKE.equals(strOp)){
				return strSrcValue.toUpperCase().indexOf(strDstValue.toUpperCase()) != -1;
			}

			if (Conditions.RIGHTLIKE.equals(strOp)){
				int nPos = strSrcValue.toUpperCase().indexOf(strDstValue.toUpperCase());
				if (nPos == -1) return false;

				return (nPos + strDstValue.length()) == strSrcValue.length();
			}
		}
		
		if(nValueDataType == DataTypes.UNKNOWN) {
			nValueDataType = getObjectDataType(objSrcValue);
		}

		long nRet = compare(nValueDataType, objSrcValue, objDstValue);
		if (Conditions.EQ.equals(strOp)){
			return (nRet == 0);
		}
		if (Conditions.NOTEQ.equals(strOp)){
			return (nRet != 0);
		}
		if (Conditions.GT.equals(strOp)){
			return (nRet > 0);
		}
		if (Conditions.GTANDEQ.equals(strOp)){
			return (nRet >= 0);
		}
		if (Conditions.LT.equals(strOp)){
			return (nRet < 0);
		}
		if (Conditions.LTANDEQ.equals(strOp)){
			return (nRet <= 0);
		}
		
		throw new Exception(String.format("无法识别的条件值比较操作[%1$s](%2$s)[%3$s]", objSrcValue, strOp, objDstValue));
		//log.warn(String.format("无法识别的条件值比较操作[%1$s](%2$s)[%3$s]", objSrcValue, strOp, objDstValue));
		//return false;
		
	}
//
//	
//	/**
//	 * 获取参数的整数型值
//	 * 
//	 * @param iDataObject 数据对象
//	 * @param strParamName
//	 * @param nDefault
//	 * @return
//	 */
//	final static public int getIntegerValue(IEntity iDataObject, String strParamName, int nDefault) throws Exception {
//		Object objValue = iDataObject.get(strParamName);
//		if (objValue == null) {
//			return nDefault;
//		}
//
//		return Integer.parseInt(objValue.toString());
//	}
//	
//
//	
//
//	/**
//	 * 获取值的对象值
//	 * 
//	 * @param objValue
//	 * @return
//	 * @throws Exception
//	 */
//	final static public Object getObjectValue(Object objValue) throws Exception {
//		return objValue;
//	}
//
//	/**
//	 * 转换对象值到整形值
//	 * 
//	 * @param objValue
//	 * @return
//	 * @throws Exception
//	 */
//	final static public Integer getIntegerValue(Object objValue) throws Exception {
//		return getIntegerValue(objValue, null);
//	}
//
	
	final static public Integer asInteger(Object objValue, Integer def){
		try {
			return getIntegerValue(objValue, def);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	/**
	 * 转换对象值到整形值
	 * 
	 * @param objValue
	 * @param def
	 * @return
	 * @throws Exception
	 */
	final static public Integer getIntegerValue(Object objValue, Integer def) throws Exception {
		if (objValue == null) return def;

		if (objValue instanceof Integer) {
			return (Integer) objValue;
		}
		
		String strValue = objValue.toString();
		if (!StringUtils.hasLength(strValue)) return def;
		strValue = strValue.replace(",", "");
		return Integer.parseInt(strValue);
	}

	final static public BigDecimal asBigDecimal(Object objValue, BigDecimal fDefault) {
		return getBigDecimalValue(objValue, fDefault);
	}
	/**
	 * 获取数据对象指定属性大数值
	 * 
	 * @param objValue
	 * @param fDefault
	 * @return
	 * @throws Exception
	 */
	final static public BigDecimal getBigDecimalValue(Object objValue, BigDecimal fDefault) {
		if (objValue == null) {
			return fDefault;
		}
		
		if(objValue instanceof BigDecimal){
			return  (BigDecimal)objValue;
		}
		
		if(objValue instanceof BigInteger){
			//return BigDecimal.valueOf(((BigInteger)objValue).doubleValue());
			return new BigDecimal(((BigInteger)objValue));
		}
		
		if(objValue instanceof Double){
			return  BigDecimal.valueOf((Double)objValue);
		}
		
		if(objValue instanceof Short){
			return  BigDecimal.valueOf((Short)objValue);
		}
		
		if(objValue instanceof Long){
			return  BigDecimal.valueOf((Long)objValue);
		}
		
		if(objValue instanceof Integer){
			return  BigDecimal.valueOf((Integer)objValue);
		}
		
		String strValue = objValue.toString();
		if(!StringUtils.hasLength(strValue))
			return fDefault;
		
		strValue = strValue.replace(",", "");
		//return BigDecimal.valueOf(Double.parseDouble(strValue));
		return new BigDecimal(strValue);
	}
	
	
	final static public BigInteger asBigInteger(Object objValue,BigInteger nDefault)  {
		return getBigIntegerValue(objValue, nDefault);
	}

	/**
	 * 获取数据对象指定属性大整数
	 * 
	 * @param iDataObject
	 * @param strParamName
	 * @param nDefault
	 * @return
	 * @throws Exception
	 */
	final static public BigInteger getBigIntegerValue(Object objValue,BigInteger nDefault)  {
		
		if (objValue == null) {
			return nDefault;
		}
		if(objValue instanceof BigInteger){
			return (BigInteger)objValue;
		}
		
		if(objValue instanceof BigDecimal){
			return ((BigDecimal)objValue).toBigIntegerExact();
		}
		
		if(objValue instanceof Long){
			return BigInteger.valueOf((Long)objValue); 
		}
		
		if(objValue instanceof Integer){
			return BigInteger.valueOf((Integer)objValue); 
		}
		
		if(objValue instanceof Double){
			return BigInteger.valueOf(((Double)objValue).longValue());
		}
		
		if(objValue instanceof Short){
			return BigInteger.valueOf(((Short)objValue).longValue());
		}
		
		String strValue = null;
		if(objValue instanceof String) {
			strValue = (String)objValue;
		}
		else {
			strValue = objValue.toString();
		}
		if(!StringUtils.hasLength(strValue))
			return nDefault;
		
		strValue = strValue.replace(",", "");
		return new BigInteger(strValue);
	}
//	
//
//	/**
//	 * 获取数据对象指定属性Double值
//	 * 
//	 * @param iDataObject
//	 * @param strParamName
//	 * @param fDefault
//	 * @return
//	 * @throws Exception
//	 */
//	final static public double getDoubleValue(IEntity iDataObject, String strParamName, double fDefault) throws Exception {
//		Object objValue = iDataObject.get(strParamName);
//		if (objValue == null) {
//			return fDefault;
//		}
//		try {
//			String strValue = objValue.toString();
//			if(!StringUtils.hasLength(strValue))
//				return fDefault;
//			return Double.parseDouble(strValue);
//		} catch (Exception ex) {
//			log.error(ex);
//			return fDefault;
//		}
//	}
//
	
	final static public Double asDouble(Object objValue, Double def) {
		try {
			return getDoubleValue(objValue, def);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	/**
	 * 转换对象值到Double值
	 * 
	 * @param objValue
	 * @return
	 * @throws Exception
	 */
	final static public Double getDoubleValue(Object objValue, Double def) throws Exception {
		if (objValue == null) return def;

		if (objValue instanceof Double) {
			return (Double) objValue;
		}
		
		if (objValue instanceof Float) {
			return ((Float) objValue).doubleValue();
		}
		
		if (objValue instanceof BigDecimal) {
			return ((BigDecimal) objValue).doubleValue();
		}
		
		
		

		String strValue = objValue.toString();
		if (!StringUtils.hasLength(strValue)) return def;
		strValue = strValue.replace(",", "");
		return Double.parseDouble(strValue);
	}
	
	
	final static public Float asFloat(Object objValue, Float def) {
		try {
			return getFloatValue(objValue, def);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	/**
	 * 转换对象值到Float值
	 * 
	 * @param objValue
	 * @return
	 * @throws Exception
	 */
	final static public Float getFloatValue(Object objValue, Float def) throws Exception {
		if (objValue == null) return def;

		if (objValue instanceof Float) {
			return (Float) objValue;
		}
		
		if (objValue instanceof Double) {
			return ((Double) objValue).floatValue();
		}
		
		if (objValue instanceof BigDecimal) {
			return ((BigDecimal) objValue).floatValue();
		}

		String strValue = objValue.toString();
		if (!StringUtils.hasLength(strValue)) return def;
		strValue = strValue.replace(",", "");
		return Float.parseFloat(strValue);
	}
	
	
	final static public Long asLong(Object objValue, Long def){
		try {
			return getLongValue(objValue, def);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	/**
	 * 转换对象值到Long值
	 * 
	 * @param objValue
	 * @return
	 * @throws Exception
	 */
	final static public Long getLongValue(Object objValue, Long def) throws Exception {
		if (objValue == null) return def;

		if (objValue instanceof Long) {
			return (Long) objValue;
		}
		
		if (objValue instanceof BigDecimal) {
			return ((BigDecimal) objValue).longValue();
		}
		
		if (objValue instanceof BigInteger) {
			return ((BigInteger) objValue).longValue();
		}

		String strValue = objValue.toString();
		if (!StringUtils.hasLength(strValue)) return def;
		strValue = strValue.replace(",", "");
		return Long.parseLong(strValue);
	}
	
	public static java.sql.Timestamp asDateTimeValue(Object objValue, java.sql.Timestamp def){
		try {
			return getDateTimeValue(objValue, def);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	/**
	 * 获取时间对象Long值
	 * 
	 * @param obj
	 * @return
	 */
	public static java.sql.Timestamp getDateTimeValue(Object objValue, java.sql.Timestamp def) throws Exception {
		if (objValue == null) return def;
		
		if (objValue instanceof java.sql.Timestamp) {
			return (java.sql.Timestamp) objValue;
		}
		
		if (objValue instanceof java.util.Date) {
			return new java.sql.Timestamp(((java.util.Date) objValue).getTime());
		}
		
		if (objValue instanceof java.sql.Time) {
			return new java.sql.Timestamp(((java.sql.Time) objValue).getTime());
		}

		if (objValue instanceof java.sql.Date) {
			return new java.sql.Timestamp(((java.sql.Date) objValue).getTime());
		}

		String strValue = objValue.toString();
		if (!StringUtils.hasLength(strValue)) return def;
		
		return new java.sql.Timestamp(DateUtils.parse(strValue).getTime());
	}
	
	
	final static public Boolean asBoolean(Object objValue, Boolean def) {
		return getBooleanValue(objValue, def);
	}
	
	/**
	 * 转换对象值到Boolean
	 * 
	 * @param objValue
	 * @param def
	 * @return
	 * @throws Exception
	 */
	final static public Boolean getBooleanValue(Object objValue, Boolean def) {
		if (objValue == null) return def;

		if (objValue instanceof Boolean) {
			return ((Boolean) objValue);
		}
		

		String strValue = objValue.toString();
		if (!StringUtils.hasLength(strValue)) return def;
		
		return strValue.equalsIgnoreCase("true") || strValue.equalsIgnoreCase("1");
	}
	
	
	final static public String asString(Object objValue, String strDefault) {
		return getStringValue(objValue, strDefault);
	}
	

	/**
	 * 转换对象值到字符串值
	 * 
	 * @param objValue
	 * @param strDefault
	 * @return
	 * @throws Exception
	 */
	final static public String getStringValue(Object objValue, String strDefault) {
		if (objValue == null) return strDefault;
		if (objValue instanceof String) return (String) objValue;
		return objValue.toString();
	}

	
	
	/**
	 * 格式化字符串
	 * 
	 * @param strFormat
	 * @param arrList
	 * @return
	 */
	final public static String format(String strFormat, Object[] arrList) {
		int nArrCount = ((arrList ==null)?0:arrList.length);
		switch (nArrCount) {
		case 0:
			return strFormat;
		case 1:
			return String.format(strFormat, arrList[0]);
		case 2:
			return String.format(strFormat, arrList[0], arrList[1]);
		case 3:
			return String.format(strFormat, arrList[0], arrList[1], arrList[2]);
		case 4:
			return String.format(strFormat, arrList[0], arrList[1], arrList[2], arrList[3]);
		case 5:
			return String.format(strFormat, arrList[0], arrList[1], arrList[2], arrList[3], arrList[4]);
		case 6:
			return String.format(strFormat, arrList[0], arrList[1], arrList[2], arrList[3], arrList[4], arrList[5]);
		case 7:
			return String.format(strFormat, arrList[0], arrList[1], arrList[2], arrList[3], arrList[4], arrList[5], arrList[6]);
		case 8:
			return String.format(strFormat, arrList[0], arrList[1], arrList[2], arrList[3], arrList[4], arrList[5], arrList[6], arrList[7]);
		case 9:
			return String.format(strFormat, arrList[0], arrList[1], arrList[2], arrList[3], arrList[4], arrList[5], arrList[6], arrList[7], arrList[8]);
		case 10:
			return String.format(strFormat, arrList[0], arrList[1], arrList[2], arrList[3], arrList[4], arrList[5], arrList[6], arrList[7], arrList[8], arrList[9]);
		default:
			throw new RuntimeException("字符串格式化参数不能超过10");
		}
	}
	
	
	public static String getTypeName(int dataType) {

		if (dataType == DataTypes.BIGINT || dataType == DataTypes.INT || dataType == DataTypes.SMALLINT) {
			return "整数型";
		} else if (dataType == DataTypes.CHAR || dataType == DataTypes.NCHAR || dataType == DataTypes.NTEXT || dataType == DataTypes.NVARCHAR || dataType == DataTypes.SYSNAME || dataType == DataTypes.TEXT || dataType == DataTypes.VARCHAR) {
			return "字符型";
		} else if (dataType == DataTypes.DATETIME || dataType == DataTypes.SMALLDATETIME) {
			return "日期时间型";
		} else if (dataType == DataTypes.DATE) {
			return "日期型";
		} else if (dataType == DataTypes.TIME) {
			return "时间型";
		} else if (dataType == DataTypes.DECIMAL || dataType == DataTypes.BIGDECIMAL || dataType == DataTypes.MONEY || dataType == DataTypes.NUMERIC || dataType == DataTypes.SMALLMONEY || dataType == DataTypes.FLOAT || dataType == DataTypes.REAL) {
			return "数值型";
		} else if (dataType == DataTypes.BINARY || dataType == DataTypes.VARBINARY) {
				return "数据流型";
		}
		return "未知类型";

	}
	
	/**
	 * 将传入对象转化为简单数据类型对象
	 * @param object
	 * @return
	 */
	public static Object asSimple(Object object) {
		if((object instanceof String)
				|| (object instanceof Number)
				|| (object instanceof Boolean)
				|| (object instanceof Character)) {
			return object;
		}
		
		if(object instanceof java.util.Date){
			return ((java.util.Date)object).clone();
		}
		
		return null;
	}
}
