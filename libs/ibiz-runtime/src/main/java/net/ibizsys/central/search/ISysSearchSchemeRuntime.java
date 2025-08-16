package net.ibizsys.central.search;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.ba.ISysBDSchemeRuntime;
import net.ibizsys.central.service.ISubSysServiceAPIRuntimeBase;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.model.PSModelEnums.DBObjNameCaseMode;
import net.ibizsys.model.search.IPSSysSearchDoc;
import net.ibizsys.model.search.IPSSysSearchScheme;
import net.ibizsys.runtime.IModelRuntimeShutdownable;
import net.ibizsys.runtime.ISystemModelRuntime;

/**
 * 系统搜索架构运行时
 * @author lionlau
 *
 */
public interface ISysSearchSchemeRuntime extends ISystemModelRuntime, ISubSysServiceAPIRuntimeBase, IModelRuntimeShutdownable{


	/**
	 * 初始化系统搜索架构运行时
	 * @param iSystemRuntimeContext
	 * @param iPSSysSearchScheme
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysSearchScheme iPSSysSearchScheme) throws Exception;

	
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
	 * 获取系统搜索架构模型
	 * @return
	 */
	IPSSysSearchScheme getPSSysSearchScheme();
	

	
	/**
	 * 获取相关的大数据运行时
	 * @return
	 */
	ISysBDSchemeRuntime getSysBDSchemeRuntime();
	
	/**
	 * 获取对象名称大小写转化
	 * @return
	 */
	String getDBObjNameCase();
	
	/**
	 * 获取搜索类型
	 * @return
	 */
	String getSearchEngineType();
	
	
	/**
	 * 设置搜索类型
	 * @param strSearchEngineType
	 */
	void setSearchEngineType(String strSearchEngineType);
	
	
	/**
	 * 是否更新结构
	 * @return
	 */
	boolean isUpdateSchema();
	
	
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
	 * 获取数据库对象名转换模式
	 * @return
	 */
	DBObjNameCaseMode getDBObjNameCaseMode();
	
//	/**
//	 * 获取实际对象名称
//	 * @param strObjName
//	 * @return
//	 */
//	String getRealDBObjName(String strObjName);
	
	
	
	/**
	 * 获取指定系统检索文档运行时对象
	 * @param strDocName
	 * @param bTryMode
	 * @return
	 */
	ISysSearchDocRuntime getSysSearchDocRuntime(String strDocName, boolean bTryMode);
	
	
	
	
	
	/**
	 * 获取指定系统检索文档运行时对象
	 * @param iPSSysSearchDoc
	 * @return
	 */
	ISysSearchDocRuntime getSysSearchDocRuntime(IPSSysSearchDoc iPSSysSearchDoc);
	
	
	
	/**
	 * 插入数据
	 * @param strDocName
	 * @param args
	 * @throws Throwable
	 */
	Object insert(String strDocName, List<Map<String, Object>> args, Map<String, Object> extParamMap) throws Throwable;
	
	
	
	
	/**
	 * 更新数据
	 * @param strDocName
	 * @param args
	 * @throws Throwable
	 */
	Object update(String strDocName, List<Map<String, Object>> args, Map<String, Object> extParamMap, boolean bAppendMode) throws Throwable;


	
	/**
	 * 删除数据
	 * @param strDocName
	 * @param args
	 * @throws Throwable
	 */
	Object delete(String strDocName,List<Map<String, Object>> args, Map<String, Object> extParamMap) throws Throwable;
	
	
	
	/**
	 * 插入数据
	 * @param strDocName
	 * @param arg
	 * @throws Throwable
	 */
	Object insert(String strDocName, Map<String, Object> arg, Map<String, Object> extParamMap) throws Throwable;
	
	
	
	
	/**
	 * 更新数据
	 * @param strDocName
	 * @param arg
	 * @throws Throwable
	 */
	Object update(String strDocName, Map<String, Object> arg, Map<String, Object> extParamMap, boolean bAppendMode) throws Throwable;


	
	/**
	 * 删除数据
	 * @param strDocName
	 * @param arg
	 * @throws Throwable
	 */
	Object delete(String strDocName, Map<String, Object> arg, Map<String, Object> extParamMap) throws Throwable;
	
	

	/**
	 * 搜索数据集合
	 * @param strDocName
	 * @param iSearchContext
	 * @param outputFields
	 * @return
	 * @throws Throwable
	 */
	Page fetch(String strDocName, ISearchContext iSearchContext, String[] outputFields, Map<String, Object> extParamMap) throws Throwable;
	
}
