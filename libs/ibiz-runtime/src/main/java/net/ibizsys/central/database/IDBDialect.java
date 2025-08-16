package net.ibizsys.central.database;

import java.util.Collection;

import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.model.dataentity.defield.IPSDEField;

/**
 * 数据库类型运行时对象接口
 * @author lionlau
 *
 */
public interface IDBDialect{

	 /**
     *  合计，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String FUNC_SUM = "SUM";
    /**
     *  平均，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String FUNC_AVG = "AVG";
    /**
     *  最大值，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String FUNC_MAX = "MAX";
    /**
     *  最小值，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String FUNC_MIN = "MIN";
    /**
     *  计数，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String FUNC_COUNT = "COUNT";


    /**
     *  按周天分组，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String FUNC_DAYOFWEEK = "DAYOFWEEK";
    /**
     *  按月天分组，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String FUNC_DAYOFMONTH = "DAYOFMONTH";
    /**
     *  按年天分组，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String FUNC_DAYOFYEAR = "DAYOFYEAR";
    /**
     *  按周分组，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String FUNC_WEEK = "WEEK";
    /**
     *  按月份分组，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String FUNC_MONTH = "MONTH";
    /**
     *  按季度分组，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String FUNC_QUARTER = "QUARTER";
    /**
     *  按年份分组，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String FUNC_YEAR = "YEAR";
    /**
     *  按小时分组，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String FUNC_HOUR = "HOUR";
    /**
     *  按分钟分组，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String FUNC_MINUTE = "MINUTE";
    
    
	/**
	 * 获取数据库类型
	 * @return
	 */
	String getDBType();
	
	
	/**
	 * 获取数据库对象标准名称
	 * 
	 * @param strOriginName
	 * @return
	 */
	String getDBObjStandardName(String strOriginName) throws Throwable;
	
	
	
	/**
	 * 获取数据库函数
	 * @param strFuncName
	 * @return
	 * @throws Throwable
	 */
	IDBFunction getDBFunction(String strFuncName) throws Throwable;
	
	
	/**
	 * 获取条件SQL
	 * @param strFieldName
	 * @param nStdDataType
	 * @param strCondOp
	 * @param objValueOrParam
	 * @param bParam
	 * @param iSearchContext 
	 * @return
	 * @throws Throwable
	 */
	String getConditionSQL(String strFieldName, int nStdDataType, String strCondOp, Object objValueOrParam, boolean bParam, ISearchContext iSearchContext) throws Throwable;
	
	
	
	
	/**
	 * 获取数据库函数SQL
	 * @param strFuncName
	 * @param args 
	 * @return
	 * @throws Throwable
	 */
	String getFunctionSQL(String strFuncName, String[] args) throws Throwable;
	
	
	
	
	/**
	 * 获取最后的插入标识SQL
	 * @param strAlias
	 * @return
	 * @throws Throwable
	 */
	String getLastInsertIdSQL(String strAlias) throws Throwable;
	
	
	
	/**
	 * 获取Json值属性表达式
	 * @param strFieldName
	 * @param strJsonPath
	 * @return
	 * @throws Throwable
	 */
	String getJsonExtractSQL(String strFieldName, String strJsonPath) throws Throwable;
	
	
	
	/**
	 * 获取建立数据表的语句
	 * @param strTableName
	 * @param psDEFieldList
	 * @return
	 * @throws Throwable
	 */
	String getCreateTableSQL(String strTableName, Collection<IPSDEField> psDEFieldList) throws Throwable;
	
	
	/**
	 * 获取建立数据列的语句
	 * @param strTableName
	 * @param iPSDEField
	 * @return
	 * @throws Throwable
	 */
	String getCreateColumnSQL(String strTableName, IPSDEField iPSDEField) throws Throwable;
	
	
	
	/**
	 * 获取插入数据表的语句
	 * @param strTableName
	 * @param columnList
	 * @return
	 * @throws Throwable
	 */
	String getInsertTableSQL(String strTableName, Collection<String> columnList) throws Throwable;
	
	
	
	
	/**
	 * 获取更新数据表的语句
	 * @param strTableName
	 * @param updateColumnList
	 * @param whereColumnList
	 * @return
	 * @throws Throwable
	 */
	String getUpdateTableSQL(String strTableName, Collection<String> updateColumnList, Collection<String> whereColumnList) throws Throwable;
	
	
	/**
	 * 获取删除数据表的语句
	 * @param strTableName
	 * @param whereColumnList
	 * @return
	 * @throws Throwable
	 */
	String getDeleteTableSQL(String strTableName, Collection<String> whereColumnList) throws Throwable;
	
	
}
