package net.ibizsys.central;

import java.util.List;

import javax.sql.DataSource;

import net.ibizsys.central.app.IApplicationRuntime;
import net.ibizsys.central.ba.ISysBDSchemeRuntime;
import net.ibizsys.central.backend.ISysBackendTaskRuntime;
import net.ibizsys.central.bi.ISysBISchemeRuntime;
import net.ibizsys.central.database.IDBDialect;
import net.ibizsys.central.database.ISysDBSchemeRuntime;
import net.ibizsys.central.dataentity.IDataEntityGroupRuntime;
import net.ibizsys.central.dataentity.IDataEntityGroupUtilRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.logic.IDELogicNodeRuntime;
import net.ibizsys.central.dataentity.logic.IDELogicParamRuntime;
import net.ibizsys.central.dataentity.service.IDEService;
import net.ibizsys.central.res.ISysResourceRuntime;
import net.ibizsys.central.res.ISysUniStateRuntime;
import net.ibizsys.central.search.ISysSearchSchemeRuntime;
import net.ibizsys.central.security.ISystemAccessManager;
import net.ibizsys.central.service.ISubSysServiceAPIRuntime;
import net.ibizsys.central.service.ISysServiceAPIRuntime;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.system.ISysRefRuntime;
import net.ibizsys.central.system.ISystemModuleRuntime;
import net.ibizsys.central.system.ISystemModuleUtilRuntime;
import net.ibizsys.central.sysutil.ISysCacheUtilRuntime;
import net.ibizsys.central.sysutil.ISysUniStateUtilRuntime;
import net.ibizsys.central.sysutil.ISysUtilRuntime;
import net.ibizsys.central.testing.ISysTestDataRuntime;
import net.ibizsys.central.util.groovy.ISystemRTGroovyContext;
import net.ibizsys.central.util.script.ISystemRTScriptContext;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.ba.IPSSysBDScheme;
import net.ibizsys.model.backservice.IPSSysBackService;
import net.ibizsys.model.bi.IPSSysBIScheme;
import net.ibizsys.model.database.IPSSysDBScheme;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDELogicParam;
import net.ibizsys.model.res.IPSSysContent;
import net.ibizsys.model.res.IPSSysResource;
import net.ibizsys.model.res.IPSSysUniState;
import net.ibizsys.model.res.IPSSysUtil;
import net.ibizsys.model.search.IPSSysSearchScheme;
import net.ibizsys.model.service.IPSSubSysServiceAPI;
import net.ibizsys.model.system.IPSSysRef;
import net.ibizsys.model.testing.IPSSysTestData;
import net.ibizsys.runtime.security.IUserContext;

/**
 * 业务中台系统运行时接口
 * 
 * @author lionlau
 *
 */
public interface ISystemRuntime extends net.ibizsys.runtime.ISystemRuntime, ISystemUtilRuntime, ISystemLogListenerProxy {

	/**
	 * 全局插件标识：持久化适配器
	 */
	final static String GLOBALPLUGIN_PERSISTENTADAPTER = "GLOBAL_PERSISTENTADAPTER";

	/**
	 * 全局插件标识：数据库持久化适配器
	 */
	final static String GLOBALPLUGIN_DBPERSISTENTADAPTER = "GLOBAL_DBPERSISTENTADAPTER";

	/**
	 * 全局插件标识：大数据库持久化适配器
	 */
	final static String GLOBALPLUGIN_BDPERSISTENTADAPTER = "GLOBAL_BDPERSISTENTADAPTER";

	/**
	 * 全局插件标识：缓存适配器
	 */
	final static String GLOBALPLUGIN_CACHEADAPTER = "GLOBAL_CACHEADAPTER";

	/**
	 * 全局插件标识：访问管理对象
	 */
	final static String GLOBALPLUGIN_ACCESSMANAGER = "GLOBAL_ACCESSMANAGER";

	/**
	 * 全局插件标识：实体运行时
	 */
	final static String GLOBALPLUGIN_DATAENTITYRUNTIME = "GLOBAL_DATAENTITYRUNTIME";

	/**
	 * 全局插件标识：数据库适配层
	 */
	final static String GLOBALPLUGIN_DBDIALECT = "GLOBAL_DBDIALECT";

	/**
	 * 全局插件标识：系统日志适配器
	 */
	final static String GLOBALPLUGIN_LOGADAPTER = "GLOBAL_LOGADAPTER";

	/**
	 * 全局插件标识：Web请求客户端对象
	 */
	final static String GLOBALPLUGIN_WEBCLIENT = "GLOBAL_WEBCLIENT";

	/**
	 * 全局插件标识：系统运行时
	 */
	final static String GLOBALPLUGIN_SYSTEMRUNTIME = "GLOBAL_SYSTEMRUNTIME";

	/**
	 * 实体逻辑运行时前缀
	 */
	public final static String ADDIN_DELOGICNODERUNTIME_PREFIX = "DELOGICNODERUNTIME:";
	
	
	/**
	 * 系统资源内容的内容分类代码标识
	 */
	public final static String RESOURCES_PSSYSCONTENTCAT = "RESOURCES";

	/**
	 * 初始化系统运行时对象
	 * 
	 * @param iSystemGatewayContext
	 * @param iPSSystemService
	 * @param strDeploySystemId
	 * @param data
	 * @throws Exception
	 */
	void init(ISystemGatewayContext iSystemGatewayContext, IPSSystemService iPSSystemService, String strDeploySystemId, Object data) throws Exception;

	/**
	 * 获取服务标识（未指定时使用部署标识）
	 * 
	 * @return
	 */
	String getServiceId();

	/**
	 * 获取上下文系统标识
	 * 
	 * @return
	 */
	String getContextId();

	/**
	 * 是否启用租户模式
	 * 
	 * @return
	 */
	boolean isEnableTenantMode();

	/**
	 * 获取系统模型服务对象
	 * 
	 * @return
	 */
	IPSSystemService getPSSystemService();

	/**
	 * 获取系统运行时设置
	 * 
	 * @return
	 */
	ISystemRuntimeSetting getSystemRuntimeSetting();

	/**
	 * 获取系统访问管理对象
	 * 
	 * @return
	 */
	ISystemAccessManager getSystemAccessManager();

	/**
	 * 获取系统运行时脚本上下文对象
	 */
	ISystemRTScriptContext getSystemRTScriptContext();

	/**
	 * 调用实体方法
	 * 
	 * @param strDataEntityName
	 * @param strMethodName
	 * @param objArg
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Exception
	 */
	Object invokeDEMethod(String strDataEntityName, String strMethodName, Object objArg, IUserContext iUserContext, Object objTag) throws Throwable;

	/**
	 * 调用API方法
	 * 
	 * @param strAPICodeName
	 * @param strDataEntityName
	 * @param strMethodName
	 * @param objArg
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Exception
	 */
	Object invokeAPIMethod(String strAPICodeName, String strDataEntityName, String strMethodName, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable;

	/**
	 * 调用API方法
	 * 
	 * @param strAPICodeName
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strDataEntityName
	 * @param strMethodName
	 * @param objBody
	 * @param strKey
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeAPIMethod(String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strMethodName, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable;

	/**
	 * 调用API导入数据
	 * 
	 * @param strAPICodeName
	 *            服务域
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strImportTag
	 * @param objBody
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeAPIImportData(String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable;

	/**
	 * 调用API导入数据2
	 * 
	 * @param strAPICodeName
	 *            服务域
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strImportTag
	 * @param objBody
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeAPIImportData2(String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable;

	/**
	 * 调用API获取数据导入模板
	 * 
	 * @param strAPICodeName
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strDataEntityName
	 * @param strImportTag
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeAPIGetImportTemplate(String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, IUserContext iUserContext, Object objTag) throws Throwable;

	/**
	 * 调用API导出数据
	 * 
	 * @param strAPICodeName
	 *            服务域
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strImportTag
	 * @param objBody
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeAPIExportData(String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable;

	/**
	 * 调用API导出数据
	 * 
	 * @param strAPICodeName
	 *            服务域
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strImportTag
	 * @param objBody
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeAPIExportData(String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, String strMethodName, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable;

	/**
	 * 调用API打印数据
	 * 
	 * @param strAPICodeName
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strKey
	 * @param strPrintTag
	 * @param strPrintType
	 * @param objBody
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeAPIPrintData(String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strPrintTag, String strPrintType, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable;

	/**
	 * 调用API启动流程
	 * 
	 * @param strAPICodeName
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strKey
	 * @param strWFTag
	 * @param objBody
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeAPIWFStart(String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strWFTag, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable;

	/**
	 * 调用API取消流程
	 * 
	 * @param strAPICodeName
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strKey
	 * @param strWFTag
	 * @param objBody
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeAPIWFCancel(String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strWFTag, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable;

	/**
	 * 调用API进行文件上传
	 * 
	 * @param strAPICodeName
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strDataEntityName
	 * @param strKey
	 * @param strStorageField
	 * @param file
	 * @param objBody
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeAPIUploadFile(String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strKey, String strStorageField, net.ibizsys.runtime.util.domain.File file, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable;

	/**
	 * 调用API进行文件下载
	 * 
	 * @param strAPICodeName
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strDataEntityName
	 * @param strKey
	 * @param strStorageField
	 * @param file
	 * @param objBody
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeAPIDownloadFile(String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strKey, String strStorageField, net.ibizsys.runtime.util.domain.File file, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable;

	/**
	 * 获取系统服务接口运行时对象
	 * 
	 * @param strCodeName
	 * @param bTryMode
	 * @return
	 */
	ISysServiceAPIRuntime getSysServiceAPIRuntime(String strCodeName, boolean bTryMode);

	/**
	 * 获取系统前端应用运行时对象
	 * 
	 * @param strCodeName
	 * @param bTryMode
	 * @return
	 */
	IApplicationRuntime getApplicationRuntime(String strCodeName, boolean bTryMode);

	/**
	 * 获取系统数据库体系运行时对象
	 * 
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	ISysDBSchemeRuntime getSysDBSchemeRuntime(String strTag, boolean bTryMode);

	/**
	 * 获取系统数据库体系运行时对象
	 * 
	 * @param iPSSysDBScheme
	 * @return
	 */
	ISysDBSchemeRuntime getSysDBSchemeRuntime(IPSSysDBScheme iPSSysDBScheme);

	/**
	 * 获取系统模块运行时对象
	 * 
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	ISystemModuleRuntime getSystemModuleRuntime(String strTag, boolean bTryMode);

	/**
	 * 获取外部系统服务接口运行时对象
	 * 
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	ISubSysServiceAPIRuntime getSubSysServiceAPIRuntime(String strTag, boolean bTryMode);

	/**
	 * 获取外部系统服务接口运行时对象
	 * 
	 * @param iPSSubSysServiceAPI
	 *            外部服务接口模型对象
	 * @return
	 */
	ISubSysServiceAPIRuntime getSubSysServiceAPIRuntime(IPSSubSysServiceAPI iPSSubSysServiceAPI);

	/**
	 * 获取数据库适配层
	 * 
	 * @param strDBType
	 * @return
	 */
	IDBDialect getDBDialect(String strDBType);

	/**
	 * 获取指定实体运行时对象
	 * 
	 * @param strIdOrName
	 * @return
	 * @throws Exception
	 */
	IDataEntityRuntime getDataEntityRuntime(String strIdOrName);

	/**
	 * 获取指定实体运行时对象
	 * 
	 * @param strIdOrName
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	IDataEntityRuntime getDataEntityRuntime(String strIdOrName, boolean bTryMode);

	/**
	 * 获取实体逻辑节点运行时
	 * 
	 * @param iPSDELogicNode
	 * @return
	 */
	IDELogicNodeRuntime getDELogicNodeRuntime(IPSDELogicNode iPSDELogicNode, boolean bNewInstance);

	/**
	 * 获取实体逻辑参数运行时
	 * 
	 * @param iPSDELogicParam
	 * @return
	 */
	IDELogicParamRuntime getDELogicParamRuntime(IPSDELogicParam iPSDELogicParam);

	/**
	 * 执行后台任务
	 * 
	 * @param strTaskType
	 * @param strTaskTag
	 * @param strDynaInstId
	 * @param strParam
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeBackendTask(String strTaskType, String strTaskTag, String strDynaInstId, String strParam, IUserContext iUserContext, Object objTag) throws Throwable;

	/**
	 * 获取指定后台任务运行时对象
	 * 
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	ISysBackendTaskRuntime getSysBackendTaskRuntime(String strTag, boolean bTryMode);

	/**
	 * 获取后台任务运行时对象
	 * 
	 * @param iPSSysBackService
	 * @return
	 */
	ISysBackendTaskRuntime getSysBackendTaskRuntime(IPSSysBackService iPSSysBackService);

	/**
	 * 判断传入实体是否支持实体运行时
	 * 
	 * @param iPSDataEntity
	 * @return
	 */
	boolean isEnableDEService(IPSDataEntity iPSDataEntity);

	/**
	 * 获取实体服务对象
	 * 
	 * @param strDataEntityId
	 * @return
	 */
	IDEService getDEService(String strDataEntityId);

	/**
	 * 获取实体服务对象
	 * 
	 * @param iDataEntityRuntime
	 * @return
	 */
	IDEService getDEService(IDataEntityRuntime iDataEntityRuntime);

	/**
	 * 获取部署系统标记
	 * 
	 * @return
	 */
	Object getDeploySystemTag();

	/**
	 * 获取部署会话标识
	 * 
	 * @return
	 */
	String getDeploySessionId();

	/**
	 * 获取指定实体组运行时对象
	 * 
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	IDataEntityGroupRuntime getDataEntityGroupRuntime(String strTag, boolean bTryMode);

	/**
	 * 获取实体组运行时集合
	 * 
	 * @return
	 */
	List<IDataEntityGroupUtilRuntime> getDataEntityGroupUtilRuntimes();

	/**
	 * 获取大数据体系运行时对象
	 * 
	 * @param iPSSysBDScheme
	 * @return
	 */
	ISysBDSchemeRuntime getSysBDSchemeRuntime(IPSSysBDScheme iPSSysBDScheme);

	/**
	 * 获取系统大数据体系运行时对象
	 * 
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	ISysBDSchemeRuntime getSysBDSchemeRuntime(String strTag, boolean bTryMode);

	/**
	 * 获取默认的大数据体系运行时对象
	 * 
	 * @return
	 */
	ISysBDSchemeRuntime getDefaultSysBDSchemeRuntime();

	/**
	 * 获取传入实体的大数据体系运行时对象
	 * 
	 * @param iDataEntityRuntime
	 * @return
	 */
	ISysBDSchemeRuntime getSysBDSchemeRuntime(IDataEntityRuntime iDataEntityRuntime);

	/**
	 * 调用App方法
	 * 
	 * @param strAppCodeName
	 * @param strDataEntityName
	 * @param strMethodName
	 * @param objArg
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Exception
	 */
	Object invokeAppMethod(String strAppCodeName, String strDataEntityName, String strMethodName, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable;

	/**
	 * 调用App方法
	 * 
	 * @param strAppCodeName
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strDataEntityName
	 * @param strMethodName
	 * @param objBody
	 * @param strKey
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeAppMethod(String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strMethodName, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable;

	/**
	 * 调用App导入数据
	 * 
	 * @param strAppCodeName
	 *            服务域
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strImportTag
	 * @param objBody
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeAppImportData(String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable;

	/**
	 * 调用App导出数据
	 * 
	 * @param strAppCodeName
	 *            服务域
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strImportTag
	 * @param objBody
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeAppExportData(String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable;

	/**
	 * 调用App导出数据
	 * 
	 * @param strAppCodeName
	 *            服务域
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strImportTag
	 * @param objBody
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeAppExportData(String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, String strMethodName, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable;

	/**
	 * 调用App打印数据
	 * 
	 * @param strAppCodeName
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strKey
	 * @param strPrintTag
	 * @param strPrintType
	 * @param objBody
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeAppPrintData(String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strPrintTag, String strPrintType, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable;

	/**
	 * 调用App启动流程
	 * 
	 * @param strAppCodeName
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strKey
	 * @param strWFTag
	 * @param objBody
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeAppWFStart(String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strWFTag, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable;

	/**
	 * 调用App取消流程
	 * 
	 * @param strAppCodeName
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strKey
	 * @param strWFTag
	 * @param objBody
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeAppWFCancel(String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strWFTag, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable;

	/**
	 * 调用API进行文件上传
	 * 
	 * @param strAppCodeName
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strDataEntityName
	 * @param strKey
	 * @param strStorageField
	 * @param file
	 * @param objBody
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeAppUploadFile(String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strKey, String strStorageField, net.ibizsys.runtime.util.domain.File file, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable;

	/**
	 * 调用App进行文件下载
	 * 
	 * @param strAppCodeName
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strDataEntityName
	 * @param strKey
	 * @param strStorageField
	 * @param file
	 * @param objBody
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeAppDownloadFile(String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strKey, String strStorageField, net.ibizsys.runtime.util.domain.File file, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable;

	/**
	 * 获取默认的Web调用客户端
	 * 
	 * @param bTryMode
	 *            尝试获取
	 * @return
	 */
	IWebClient getDefaultWebClient();

	/**
	 * 获取系统统一状态组件
	 * 
	 * @param bTryMode
	 * @return
	 */
	ISysUniStateUtilRuntime getSysUniStateUtilRuntime(boolean bTryMode);

	/**
	 * 获取系统缓存功能组件
	 * 
	 * @param bTryMode
	 * @return
	 */
	ISysCacheUtilRuntime getSysCacheUtilRuntime(boolean bTryMode);

	/**
	 * 获取网关数据源
	 * 
	 * @param strDSTag
	 *            数据源标记
	 * @param bTryMode
	 *            尝试模式
	 * @return
	 */
	DataSource getDataSource(String strDSTag, boolean bTryMode);

	/**
	 * 获取网关默认数据源
	 * 
	 * @return
	 */
	DataSource getDefaultDataSource();

	/**
	 * 获取系统测试数据运行时对象
	 * 
	 * @param iPSSysTestData
	 * @return
	 */
	ISysTestDataRuntime getSysTestDataRuntime(IPSSysTestData iPSSysTestData);

	/**
	 * 获取系统运行时Groovy上下文对象
	 * 
	 * @return
	 */
	ISystemRTGroovyContext getSystemRTGroovyContext();

	/**
	 * 获取预置资源运行时对象
	 * 
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	ISysResourceRuntime getSysResourceRuntime(String strTag, boolean bTryMode);

	/**
	 * 获取预置资源运行时对象
	 * 
	 * @param iPSSysResource
	 *            外部服务接口模型对象
	 * @return
	 */
	ISysResourceRuntime getSysResourceRuntime(IPSSysResource iPSSysResource);

	/**
	 * 获取系统引用运行时对象
	 * 
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	ISysRefRuntime getSysRefRuntime(String strTag, boolean bTryMode);

	/**
	 * 获取系统引用运行时对象
	 * 
	 * @param iPSSysRef
	 *            系统引用模型对象
	 * @return
	 */
	ISysRefRuntime getSysRefRuntime(IPSSysRef iPSSysRef);

	/**
	 * 获取系统预置功能运行时对象
	 * 
	 * @param iPSSysUtil
	 * @return
	 */
	ISysUtilRuntime getSysUtilRuntime(IPSSysUtil iPSSysUtil);

	/**
	 * 获取系统搜索体系运行时对象
	 * 
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	ISysSearchSchemeRuntime getSysSearchSchemeRuntime(String strTag, boolean bTryMode);

	/**
	 * 获取系统搜索体系运行时对象
	 * 
	 * @param iPSSysSearchScheme
	 * @return
	 */
	ISysSearchSchemeRuntime getSysSearchSchemeRuntime(IPSSysSearchScheme iPSSysSearchScheme);

	/**
	 * 获取统一状态运行时对象
	 * 
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	ISysUniStateRuntime getSysUniStateRuntime(String strTag, boolean bTryMode);

	/**
	 * 获取统一状态运行时对象
	 * 
	 * @param iPSSysUniState
	 *            外部服务接口模型对象
	 * @return
	 */
	ISysUniStateRuntime getSysUniStateRuntime(IPSSysUniState iPSSysUniState);

	/**
	 * 获取系统智能报表体系运行时对象
	 * 
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	ISysBISchemeRuntime getSysBISchemeRuntime(String strTag, boolean bTryMode);

	/**
	 * 获取系统智能报表体系运行时对象
	 * 
	 * @param iPSSysBIScheme
	 * @return
	 */
	ISysBISchemeRuntime getSysBISchemeRuntime(IPSSysBIScheme iPSSysBIScheme);

	/**
	 * 安装数据
	 */
	void installData(String strMode) throws Exception;

	/**
	 * 通过应用实体标记获取实体运行时对象
	 * 
	 * @param strAppTag
	 * @param strAppDataEntityTag
	 * @param bTryMode
	 * @return
	 */
	IDataEntityRuntime getDataEntityRuntimeByAppDataEntityTag(String strAppTag, String strAppDataEntityTag, boolean bTryMode);

	/**
	 * 获取系统模块功能运行时对象
	 * 
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	ISystemModuleUtilRuntime getSystemModuleUtilRuntime(String strTag, boolean bTryMode);

	
	
	/**
	 * 获取资源系统内容模型对象
	 * @param strPath
	 * @param bTryMode
	 * @return
	 */
	IPSSysContent getResourcePSSysContent(String strPath, boolean bTryMode);
	
	
	/**
	 * 获取资源系统内容模型对象
	 * @param strPath
	 * @param strDefault
	 * @return
	 */
	String getResourceContent(String strPath, String strDefault);
}
