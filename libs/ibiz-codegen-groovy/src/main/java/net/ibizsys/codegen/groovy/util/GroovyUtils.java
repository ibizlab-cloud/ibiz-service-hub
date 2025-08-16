package net.ibizsys.codegen.groovy.util;

import net.ibizsys.codegen.core.util.StdDataTypeUtils;
import net.ibizsys.model.PSModelEnums.StdDataType;

public class GroovyUtils {

	public static String getGroovyType(StdDataType stdDataType) {

		if(StdDataTypeUtils.isStringDataType(stdDataType)) {
			return "String";
		}
		
		if(StdDataTypeUtils.isDateTimeDataType(stdDataType)) {
			return "Date";
		}
		
		if(StdDataTypeUtils.isBigDecimalDataType(stdDataType)) {
			return "BigDecimal";
		}
		
		if(StdDataTypeUtils.isBigIntDataType(stdDataType)) {
			return "BigInteger";
		}
		
		if(StdDataTypeUtils.isIntDataType(stdDataType)) {
			return "Integer";
		}
		
		if(StdDataTypeUtils.isNumberDataType(stdDataType)) {
			return "Double";
		}
	
		if(StdDataTypeUtils.isBinaryDataType(stdDataType)) {
			return "byte[]";
		}
		
		return "def";
	}
	
	
	public static String getPythonType(StdDataType stdDataType) {

		if(StdDataTypeUtils.isStringDataType(stdDataType)) {
			return "str";
		}
		
		if(StdDataTypeUtils.isDateTimeDataType(stdDataType)) {
			return "str";
		}
		
		if(StdDataTypeUtils.isBigDecimalDataType(stdDataType)) {
			return "float";
		}
		
		if(StdDataTypeUtils.isBigIntDataType(stdDataType)) {
			return "int";
		}
		
		if(StdDataTypeUtils.isIntDataType(stdDataType)) {
			return "int";
		}
		
		if(StdDataTypeUtils.isNumberDataType(stdDataType)) {
			return "float";
		}
	
		if(StdDataTypeUtils.isBinaryDataType(stdDataType)) {
			return "str";
		}
		
		return "str";
	}
	
	
	/**
	 * 获取JavaScript类型
	 * @param stdDataType
	 * @return
	 */
	public static String getJavaScriptType(StdDataType stdDataType) {

		if(StdDataTypeUtils.isStringDataType(stdDataType)) {
			return "string";
		}
		
		if(StdDataTypeUtils.isDateTimeDataType(stdDataType)) {
			return "string";
		}
		
		if(StdDataTypeUtils.isBigDecimalDataType(stdDataType)) {
			return "string";
		}
		
		if(StdDataTypeUtils.isBigIntDataType(stdDataType)) {
			return "string";
		}
		
		if(StdDataTypeUtils.isIntDataType(stdDataType)) {
			return "integer";
		}
		
		if(StdDataTypeUtils.isNumberDataType(stdDataType)) {
			return "number";
		}
	
		if(StdDataTypeUtils.isBinaryDataType(stdDataType)) {
			return "array";
		}
		
		return "object";
	}
	
	public static String getJavaType(StdDataType stdDataType) {
        return getJavaType(stdDataType, false);
    }

    public static String getJavaType(StdDataType stdDataType, boolean bFull) {


        /**
         * 判断是否为字符串类型
         *
         * @param dataType
         * @return
         */
        if (StdDataTypeUtils.isStringDataType(stdDataType))
            return "String";

        /**
         * 是否为长字符串类型
         * @param dataType
         * @return
         */
        if (StdDataTypeUtils.isLongStringDataType(stdDataType))
            return "String";


        /**
         * 是否为长字符串类型
         * @param dataType
         * @return
         */
        if (StdDataTypeUtils.isDateTimeDataType(stdDataType)) {
            if (bFull) {
                return "java.sql.Timestamp";
            }
            return "Timestamp";

        }


        /**
         * 是否为大整数类型
         * @param dataType
         * @return
         */
        if (StdDataTypeUtils.isBigIntDataType(stdDataType)) {
            if (bFull) {
                return "java.math.BigInteger";
            }
            return "BigInteger";
        }


        /**
         * 是否为整数类型
         * @param dataType
         * @return
         */
        if (StdDataTypeUtils.isIntDataType(stdDataType))
            return "Integer";


        /**
         * 是否为大数字类型
         * @param dataType
         * @return
         */
        if (StdDataTypeUtils.isBigDecimalDataType(stdDataType)) {
            if (bFull) {
                return "java.math.BigDecimal";
            }
            return "BigDecimal";
        }


        /**
         * 是否为长字符串类型
         * @param dataType
         * @return
         */
        if (StdDataTypeUtils.isDoubleDataType(stdDataType))
            return "Double";

        /**
         * 是否为二进制
         * @param dataType
         * @return
         */
        if (StdDataTypeUtils.isBinaryDataType(stdDataType))
            return "byte[]";

        /**
         * 是否为布尔值
         * @param dataType
         * @return
         */
        if (StdDataTypeUtils.isBooleanDataType(stdDataType))
            return "Boolean";


        return "Object";

    }
	
}
