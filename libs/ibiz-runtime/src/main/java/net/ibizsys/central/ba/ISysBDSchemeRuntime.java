package net.ibizsys.central.ba;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.service.ISubSysServiceAPIRuntimeBase;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.model.ba.IPSSysBDScheme;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.IModelRuntimeShutdownable;
import net.ibizsys.runtime.ISystemModelRuntime;

/**
 * 系统大数据架构运行时
 * @author lionlau
 *
 */
public interface ISysBDSchemeRuntime extends ISystemModelRuntime, ISubSysServiceAPIRuntimeBase, IModelRuntimeShutdownable{


	/**
	 * 系统默认大数据体系代码标识
	 */
	final static String CODENAME_SYSTEMDEFAULT = "SystemDefault";
	
	
	/**
	 * 配置参数：数据库名称
	 */
	public final static String PARAM_DBNAME = "dbname";
	
	/**
	 * 配置参数：大数据类型
	 */
	public final static String PARAM_BDTYPE = "bdtype";
	
	/**
	 * 配置参数：更新体系
	 */
	public final static String PARAM_UPDATESCHEMA = "updateschema";
	
	/**
	 * 配置参数：数据库对象名称转换
	 */
	public final static String PARAM_DBOBJNAMECASE = "dbobjnamecase";
	
	
	/**
	 * 初始化系统大数据架构运行时
	 * @param iSystemRuntimeContext
	 * @param iPSSysBDScheme
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysBDScheme iPSSysBDScheme) throws Exception;

	
	/**
	 * 获取系统大数据架构模型
	 * @return
	 */
	IPSSysBDScheme getPSSysBDScheme();
	
	
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
	 * 获取是否默认大数据体系
	 * @return
	 */
	boolean isDefaultMode();
	
	
	/**
	 * 是否更新结构
	 * @return
	 */
	boolean isUpdateSchema();
	
	
	
	
	/**
	 * 获取对象名称大小写转化
	 * @return
	 */
	String getDBObjNameCase();
	
//	/**
//	 * 获取数据源连接
//	 * @return
//	 */
//	String getDSLink();
//	
//	
//	/**
//	 * 获取指定系统大数据表运行时对象
//	 * @param strTableName
//	 * @param bTryMode
//	 * @return
//	 */
//	ISysDBTableRuntime getSysDBTableRuntime(String strTableName, boolean bTryMode);
	
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
	Object update(String strTableName, List<Map<String, Object>> args, Map<String, Object> extParamMap, boolean bAppendMode) throws Throwable;


	
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
	Object update(String strTableName, Map<String, Object> arg, Map<String, Object> extParamMap, boolean bAppendMode) throws Throwable;


	
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
	 * 搜索数据集合
	 * @param strTableName
	 * @param iSearchContext
	 * @param outputFields
	 * @return
	 * @throws Throwable
	 */
	Page fetch(String strTableName, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable;
	
	
	/**
	 * 获取大数据类型
	 * @return
	 */
	String getBDType();
	
	
	/**
	 * 设置大数据类型
	 * @param strBDType
	 */
	void setBDType(String strBDType);
	
	
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
}
