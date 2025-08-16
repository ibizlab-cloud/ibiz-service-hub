package net.ibizsys.runtime.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

/**
 * 数据库类型
 * @author lionlau
 *
 */
public class DBTypes {

	/**
     *  DB2，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DB2 = "DB2";
   
    /**
     *  MySQL5，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String MYSQL5 = "MYSQL5";
    
    /**
     *  Oracle，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ORACLE = "ORACLE";
    /**
     *  SqlServer，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SQLSERVER = "SQLSERVER";
    /**
     *  PostgreSQL，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String POSTGRESQL = "POSTGRESQL";
    /**
     *  PPAS，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String PPAS = "PPAS";
    /**
     *  SQLite，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SQLITE = "SQLITE";
    /**
     *  DM，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DM = "DM";
    /**
     *  HANA，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String HANA = "HANA";

    private final static Map<String, String> driverClassNameMap = new HashMap<String, String>();
    
    private final static Map<String, String> compatibleTypeMap = new HashMap<String, String>();
    
    private final static String _MYSQL = "MYSQL";
    
    static {
    	//registerDriverClassName(MYSQL5, "com.mysql.jdbc.Driver");
    	registerCompatibleType(ORACLE, "");
    	registerCompatibleType(DB2, "");
    	registerCompatibleType(SQLSERVER, "");
    	registerCompatibleType(POSTGRESQL, ORACLE);
    	registerCompatibleType(PPAS, ORACLE);
    }
   
    
    public static void registerDriverClassName(String strDBType, String strDriverClassName) {
    	Assert.hasLength(strDBType, "未传入数据库类型");
    	Assert.hasLength(strDriverClassName, "未传入驱动名称");
    	driverClassNameMap.put(strDBType.toUpperCase(), strDriverClassName);
    }
    
    
    public static String getDriverClassName(String strDBType) {
    	Assert.hasLength(strDBType, "未传入数据库类型");
    	strDBType = strDBType.toUpperCase();
    	String strDriverClassName =  driverClassNameMap.get(strDBType);
    	if(strDriverClassName == null) {
    		if(_MYSQL.equals(strDBType)) {
    			return driverClassNameMap.get(MYSQL5);
    		}
    		
    		if(MYSQL5.equals(strDBType)) {
    			return driverClassNameMap.get(_MYSQL);
    		}
    	}
    	
    	return strDriverClassName;
    }
    
    public static void registerCompatibleType(String strDBType, String strCompatibleType) {
    	Assert.hasLength(strDBType, "未传入数据库类型");
    	if(StringUtils.hasLength(strCompatibleType)) {
    		compatibleTypeMap.put(strDBType.toUpperCase(), strCompatibleType.toUpperCase());
    	}
    	else {
    		compatibleTypeMap.put(strDBType.toUpperCase(), "");
    	}
    }
    
    
    /**
     * 获取数据库的兼容类型
     * @param strDBType
     * @return
     */
    public static String getCompatibleType(String strDBType) {
    	Assert.hasLength(strDBType, "未传入数据库类型");
    	strDBType = strDBType.toUpperCase();
    	String strCompatibleType =  compatibleTypeMap.get(strDBType);
    	if(strCompatibleType != null) {
    		return strCompatibleType;
    	}
    	
    	//未定义兼容 MYSQL5 
    	return MYSQL5;
    }
    
    
    /**
     * 从JdbcUrl获取数据库类型
     * @param strJdbcUrl
     * @return
     */
    public static String fromJdbcUrl(String strJdbcUrl) {
    	Assert.hasLength(strJdbcUrl, "未传入Jdbc路径");
    	int nPos = strJdbcUrl.indexOf("://");
    	if(nPos == -1) {
    		throw new RuntimeException(String.format("路径[%1$s]格式不正确", strJdbcUrl));
    	}
    	String strTemp = strJdbcUrl.substring(0, nPos);
    	nPos = strTemp.lastIndexOf(":");
    	if(nPos == -1) {
    		throw new RuntimeException(String.format("路径[%1$s]格式不正确", strJdbcUrl));
    	}
    	strTemp =  strTemp.substring(nPos+1).toUpperCase();
    	if(_MYSQL.equals(strTemp)) {
			return MYSQL5;
		}
    	return strTemp;
    }
    
    
    
}
