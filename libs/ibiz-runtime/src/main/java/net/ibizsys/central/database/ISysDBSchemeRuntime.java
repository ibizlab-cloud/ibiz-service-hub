package net.ibizsys.central.database;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;

import net.ibizsys.central.ISystemModelRuntime;
import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.model.database.IPSSysDBScheme;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.IModelRuntimeShutdownable;

/**
 * 系统数据库架构运行时
 * @author lionlau
 *
 */
public interface ISysDBSchemeRuntime extends ISystemModelRuntime, IModelRuntimeShutdownable{

	
	/**
	 * 初始化系统数据库架构运行时
	 * @param iSystemRuntimeContext
	 * @param iPSSysDBScheme
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysDBScheme iPSSysDBScheme) throws Exception;

	
	
	/**
	 * 获取系统数据库架构模型
	 * @return
	 */
	IPSSysDBScheme getPSSysDBScheme();
	
	/**
	 * 安装功能
	 * @throws Throwable
	 */
	void install() throws Exception;

	
	/**
	 * 是否已经安装
	 * @return
	 */
	boolean isInstalled();
	
	/**
	 * 卸载功能
	 */
	void uninstall();
	
	
	/**
	 * 获取数据源连接
	 * @return
	 */
	String getDSLink();
	
	/**
	 * SaaS数据租户列
	 * @return
	 */
	java.lang.String getSaaSDCIdColumnName();
	
	
	/**
	 * SaaS数据主键列
	 * @return
	 */
	java.lang.String getSaaSDataIdColumnName();
	 
	
	/**
	 * 获取指定系统数据库表运行时对象
	 * @param strTableName
	 * @param bTryMode
	 * @return
	 */
	ISysDBTableRuntime getSysDBTableRuntime(String strTableName, boolean bTryMode);
	
	/**
	 * 插入数据
	 * @param strTableName
	 * @param args
	 * @throws Throwable
	 */
	Object insert(String strTableName, List<Map<String, Object>> args, Map<String, Object> extParamMap) throws Throwable;
	
	
	
	
	/**
	 * 更新数据
	 * @param strTableName
	 * @param args
	 * @throws Throwable
	 */
	Object update(String strTableName, List<Map<String, Object>> args, Map<String, Object> extParamMap) throws Throwable;


	
	/**
	 * 删除数据
	 * @param strTableName
	 * @param args
	 * @throws Throwable
	 */
	Object delete(String strTableName,List<Map<String, Object>> args, Map<String, Object> extParamMap) throws Throwable;
	
	
	
	/**
	 * 插入数据
	 * @param strTableName
	 * @param arg
	 * @throws Throwable
	 */
	Object insert(String strTableName, Map<String, Object> arg, Map<String, Object> extParamMap) throws Throwable;
	
	
	
	
	/**
	 * 更新数据
	 * @param strTableName
	 * @param arg
	 * @throws Throwable
	 */
	Object update(String strTableName, Map<String, Object> arg, Map<String, Object> extParamMap) throws Throwable;


	
	/**
	 * 删除数据
	 * @param strTableName
	 * @param arg
	 * @throws Throwable
	 */
	Object delete(String strTableName, Map<String, Object> arg, Map<String, Object> extParamMap) throws Throwable;
	
	
	/**
	 * 查询数据
	 * @param strTableName
	 * @param condition
	 * @return
	 * @throws Throwable
	 */
	List select(String strTableName, Map<String, Object> paramMap, Map<String, Object> extParamMap) throws Throwable;
	
	
	
//	/**
//	 * 查询一行数据
//	 * @param strTableName
//	 * @param condition
//	 * @return
//	 * @throws Throwable
//	 */
//	Object selectOne(String strTableName, Object condition, Map<String, Object> extParamMap) throws Throwable;
//	
//	
//	/**
//	 * 检查主键
//	 * @param strTableName
//	 * @param arg
//	 * @return
//	 * @throws Throwable
//	 */
//	int checkKey(String strTableName, Object arg, Map<String, Object> extParamMap) throws Throwable;
//	
	

	/**
	 * 查询数据
	 * @param iDataEntityRuntime
	 * @param iPSDEDataQuery 指定数据查询对象
	 * @param iSearchContext
	 * @param outputFields
	 * @return
	 * @throws Throwable
	 */
	List query(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable;
	
	
	
	
	/**
	 * 查询数据
	 * @param iDataEntityRuntime
	 * @param iPSDEDataQuery 指定数据查询对象
	 * @param iSearchContext
	 * @param outputFields
	 * @return
	 * @throws Throwable
	 */
	Page query2(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable;
	
	
	/**
	 * 搜索数据集合
	 * @param iDataEntityRuntime
	 * @param iPSDEDataSet
	 * @param iSearchContext
	 * @param outputFields
	 * @return
	 * @throws Throwable
	 */
	Page fetchDataSet(IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable;
	
	
	/**
	 * 直接执行查询SQL
	 * @param strSQL
	 * @param params
	 * @return
	 * @throws Throwable
	 */
	List executeSelectSQL(String strSQL, List<Object> params) throws Throwable;
	
	
	
	
	/**
	 * 直接执行SQL
	 * @param strSQL
	 * @param params
	 * @return
	 * @throws Throwable
	 */
	int executeSQL(String strSQL, List<Object> params) throws Throwable;
	
	
	/**
	 * 获取数据库类型
	 * @return
	 */
	String getDBType();
	
	
	/**
	 * 设置数据库类型
	 * @param strDBType
	 */
	void setDBType(String strDBType);
	
	
	
	/**
	 * 是否已经定义数据库类型（默认为  MYSQL5）
	 * @return
	 */
	boolean isDBTypeDefined();
	
	
	
	/**
	 * 获取实际数据库类型
	 * @return
	 */
	String getRealDBType();
	
	
	/**
	 * 设置实际数据库类型
	 * @param strRealDBType
	 */
	void setRealDBType(String strRealDBType);
	
	
	/**
	 * 获取运行时的数据源标记
	 * @return
	 */
	Object getDataSourceTag();
	
	
	
	/**
	 * 设置运行时的数据源标记
	 * @param objDataSourceTag
	 */
	void setDataSourceTag(Object objDataSourceTag);
	
	
	
	/**
	 * 设置数据源配置
	 * @param map
	 */
	void setDataSourceProperties(Map<String, Object> map);
	
	
	/**
	 * 获取数据源属性
	 * @param strKey
	 * @param objDefault
	 * @return
	 */
	Object getDataSourceProperty(String strKey, Object objDefault);
	
	
	
	/**
	 * 使用当前数据源
	 */
	void push();
	
	
	/**
	 * 退出当前数据源
	 */
	void poll();
	
	
	
	/**
	 * 获取当前数据库体系是否处于活动状态
	 * @return
	 */
	boolean isActive();
	
	
	/**
	 * 建立索引前先移除
	 * @return
	 */
	boolean isDropIndexFirst();
	
	
	
	
	/**
	 * 是否更新结构
	 * @return
	 */
	boolean isUpdateSchema();
	
	
	
	
	/**
	 * 获取数据库访问设配器
	 * @return
	 */
	IDBDialect getDBDialect();
}
