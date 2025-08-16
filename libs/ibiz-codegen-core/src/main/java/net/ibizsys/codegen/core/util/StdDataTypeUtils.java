package net.ibizsys.codegen.core.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.model.PSModelEnums.StdDataType;

/**
 * 数据类型辅助类
 * 
 * @author Administrator
 * 
 */
public class StdDataTypeUtils {

	private static final Log log = LogFactory.getLog(StdDataTypeUtils.class);

	public StdDataTypeUtils() {
	}

	/**
	 * 判断是否为字符串的数据类型
	 * 
	 * @param dataType
	 * @return
	 */
	public static boolean isStringDataType(StdDataType dataType) {
		if (dataType == StdDataType.CHAR || dataType == StdDataType.NCHAR || dataType == StdDataType.NTEXT || dataType == StdDataType.NVARCHAR || dataType == StdDataType.SYSNAME || dataType == StdDataType.TEXT || dataType == StdDataType.VARCHAR) {
			return true;
		}
		return false;
	}

	/**
	 * 判断是否为长文本的数据类型
	 * 
	 * @param dataType
	 * @return
	 */
	public static boolean isLongStringDataType(StdDataType dataType) {
		if (dataType == StdDataType.NTEXT || dataType == StdDataType.TEXT) {
			return true;
		}
		return false;
	}

	/**
	 * 判断是否为长数据流的数据类型
	 * 
	 * @param dataType
	 * @return
	 */
	public static boolean isLongBinaryDataType(StdDataType dataType) {
		if (dataType == StdDataType.VARBINARY) {
			return true;
		}
		return false;
	}

	/**
	 * 是否为二进制流类型
	 * 
	 * @param dataType
	 * @return
	 */
	public final static boolean isBinaryDataType(StdDataType dataType) {
		return (dataType == StdDataType.BINARY || dataType == StdDataType.VARBINARY);
	}

	/**
	 * 是否为二进制流类型
	 * 
	 * @param dataType
	 * @return
	 */
	@Deprecated
	public final static boolean isBinaryType(StdDataType dataType) {
		return (dataType == StdDataType.BINARY || dataType == StdDataType.VARBINARY);
	}

	/**
	 * 是否为时间相关类型
	 * 
	 * @param dataType
	 * @return
	 */
	public static boolean isDateTimeDataType(StdDataType dataType) {

		if (dataType == StdDataType.DATE || dataType == StdDataType.DATETIME || dataType == StdDataType.SMALLDATETIME || dataType == StdDataType.TIME || dataType == StdDataType.TIMESTAMP) {
			return true;
		}
		return false;
	}

	/**
	 * 是否为整形
	 * 
	 * @param dataType
	 * @return
	 */
	public final static boolean isIntDataType(StdDataType dataType) {
		return (dataType == StdDataType.INT || dataType == StdDataType.SMALLINT || dataType == StdDataType.BIGINT || dataType == StdDataType.TINYINT);
	}

	/**
	 * 是否为Double
	 * 
	 * @param dataType
	 * @return
	 */
	public final static boolean isDoubleDataType(StdDataType dataType) {
		return (dataType == StdDataType.FLOAT || dataType == StdDataType.DECIMAL || dataType == StdDataType.MONEY || dataType == StdDataType.SMALLMONEY || dataType == StdDataType.NUMERIC || dataType == StdDataType.REAL || dataType == StdDataType.BIGDECIMAL);
	}

	/**
	 * 是否为大整形
	 * 
	 * @param dataType
	 * @return
	 */
	public final static boolean isBigIntDataType(StdDataType dataType) {
		return (dataType == StdDataType.BIGINT);
	}

	/**
	 * 是否为大数值
	 * 
	 * @param dataType
	 * @return
	 */
	public final static boolean isBigDecimalDataType(StdDataType dataType) {
		return (dataType == StdDataType.BIGDECIMAL || dataType == StdDataType.DECIMAL);
	}

	/**
	 * 是否为数值类型
	 * 
	 * @param dataType
	 * @return
	 */
	public final static boolean isNumberDataType(StdDataType dataType) {
		return isIntDataType(dataType) || isDoubleDataType(dataType);
	}

	/**
	 * 是否为布尔类型
	 * @param dataType
	 * @return
	 */
	public final static boolean isBooleanDataType(StdDataType dataType) {
		return (dataType == StdDataType.BIT);
	}

	public static String getTypeName(StdDataType dataType) {

		if (dataType == StdDataType.BIGINT || dataType == StdDataType.INT || dataType == StdDataType.SMALLINT) {
			return "整数型";
		} else if (dataType == StdDataType.CHAR || dataType == StdDataType.NCHAR || dataType == StdDataType.NTEXT || dataType == StdDataType.NVARCHAR || dataType == StdDataType.SYSNAME || dataType == StdDataType.TEXT || dataType == StdDataType.VARCHAR) {
			return "字符型";
		} else if (dataType == StdDataType.DATETIME || dataType == StdDataType.SMALLDATETIME) {
			return "日期时间型";
		} else if (dataType == StdDataType.DATE) {
			return "日期型";
		} else if (dataType == StdDataType.TIME) {
			return "时间型";
		} else if (dataType == StdDataType.DECIMAL || dataType == StdDataType.BIGDECIMAL || dataType == StdDataType.MONEY || dataType == StdDataType.NUMERIC || dataType == StdDataType.SMALLMONEY || dataType == StdDataType.FLOAT || dataType == StdDataType.REAL) {
			return "数值型";
		} else if (dataType == StdDataType.BINARY || dataType == StdDataType.VARBINARY) {
			return "数据流型";
		}
		return "未知类型";

	}

}
