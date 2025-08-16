package net.ibizsys.central;

import java.util.Collection;

import javax.sql.DataSource;

import net.ibizsys.central.database.ISysDBSchemeRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.service.IDEService;
import net.ibizsys.runtime.security.IUserContext;

/**
 * 系统网关
 * @author lionlau
 *
 */
public interface ISystemGateway {

	/**
	 * 是否启用多系统模式
	 * @return
	 */
	boolean isMultiSystemMode();
	
	
	/**
	 * 获取传入运行时对象的多实例模式
	 * @param runtimeClass
	 * @return
	 */
	boolean isMultiInstanceMode(Class<?> runtimeClass);
	
	
	/**
	 * 是否支持应用网关
	 * @return
	 */
	boolean isEnableAppGateway();
	
	/**
	 * 获取系统运行时
	 * @param strDeploySystemId
	 * @return
	 * @throws Exception
	 */
	ISystemRuntime getSystemRuntime(String strDeploySystemId) ;
	
	
	/**
	 * 获取指定类型系统运行时对象
	 * @param cls
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	<T> T getSystemRuntime(Class<T> cls, boolean bTryMode) ;
	
	
	/**
	 * 获取指定类型系统功能运行时对象
	 * @param systemCls 指定优先的系统类型
	 * @param cls 系统功能运行时类型
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	<T> T getSysUtilRuntime(Class<?> systemCls, Class<T> cls, boolean bTryMode);
	
	
	/**
	 * 获取网关数据源
	 * @param strDSTag 数据源标记
	 * @param bTryMode 尝试模式
	 * @return
	 */
	DataSource getDataSource(String strDSTag, boolean bTryMode);
	
	/**
	 * 获取网关默认数据源
	 * @return
	 */
	DataSource getDefaultDataSource();
	
	
	/**
	 * 填充传入数据库体系的数据源信息
	 * @param iSysDBSchemeRuntime
	 * @return 有填充 true，否则 返回 false
	 */
	boolean fillDataSourceInfo(ISysDBSchemeRuntime iSysDBSchemeRuntime);
	
	
	/**
	 * 调用实体方法
	 * @param strSystemId 部署系统标识
	 * @param strDataEntityName
	 * @param strMethodName
	 * @param objArg
	 * @param iUserContext 用户上下文
	 * @param objTag
	 * @return
	 * @throws Exception
	 */
	Object invokeDEMethod(String strSystemId,String strDataEntityName,String strMethodName, Object objArg, IUserContext iUserContext, Object objTag) throws Throwable;
	
	
	
	/**
	 * 调用接口方法
	 * @param strSystemId 部署系统标识
	 * @param strAPICodeName 接口标识
	 * @param strDataEntityName
	 * @param strMethodName
	 * @param objBody
	 * @param strKey
	 * @param iUserContext 用户上下文
	 * @param objTag
	 * @return
	 * @throws Exception
	 */
	Object invokeAPIMethod(String strSystemId,String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName,String strMethodName, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable;
	
	
	/**
	 * 调用接口方法
	 * @param strSystemId 部署系统标识
	 * @param strAPICodeName 接口标识
	 * @param strDataEntityName
	 * @param strMethodName
	 * @param objBody
	 * @param strKey
	 * @param iUserContext 用户上下文
	 * @param objTag
	 * @return
	 * @throws Exception
	 */
	Object invokeAPIMethod(String strSystemId, String strAPICodeName, String strDataEntityName,String strMethodName, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable;
	
	
	
	
	
	/**
	 * 调用API导入数据
	 * @param strSystemId 部署系统标识
	 * @param strAPICodeName 服务域
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strImportTag
	 * @param objBody
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeAPIImportData(String strSystemId, String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable;
	
	
	/**
	 * 调用API导入数据2
	 * @param strSystemId 部署系统标识
	 * @param strAPICodeName 服务域
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strImportTag
	 * @param objBody
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeAPIImportData2(String strSystemId, String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable;
	
	
	
	/**
	 * 调用API获取数据导入模板
	 * @param strSystemId
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
	Object invokeAPIGetImportTemplate(String strSystemId, String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, IUserContext iUserContext, Object objTag) throws Throwable;

	    
	
	/**
	 * 调用API导出数据
	 * @param strSystemId 部署系统标识
	 * @param strAPICodeName 服务域
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strImportTag
	 * @param objBody
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeAPIExportData(String strSystemId, String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable;
	

	/**
	 * 调用API导出数据
	 * @param strSystemId
	 * @param strAPICodeName
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strDataEntityName
	 * @param strExportTag
	 * @param strMethodName
	 * @param objBody
	 * @param strKey
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeAPIExportData(String strSystemId, String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, String strMethodName, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable;
	
	
	/**
	 * 调用API进行文件上传
	 * @param strSystemId
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
	Object invokeAPIUploadFile(String strSystemId, String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strKey, String strStorageField, net.ibizsys.runtime.util.domain.File file, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable;

	
	

	/**
	 * 调用API进行文件下载
	 * @param strSystemId
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
	Object invokeAPIDownloadFile(String strSystemId, String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strKey, String strStorageField, net.ibizsys.runtime.util.domain.File file, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable;
	
	
	
	/**
	 * 调用API打印数据
	 * @param strSystemId 部署系统标识
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
	Object invokeAPIPrintData(String strSystemId, String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strPrintTag, String strPrintType, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable;

	
	
	/**
	 * 调用API启动流程
	 * @param strSystemId 部署系统标识
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
	Object invokeAPIWFStart(String strSystemId, String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strWFTag, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable;
	
	
	
	/**
	 * 调用API取消流程
	 * @param strSystemId 部署系统标识
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
	Object invokeAPIWFCancel(String strSystemId, String strAPICodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strWFTag, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable;
	
	
	/**
	 * 执行后台任务
	 * @param strSystemId
	 * @param strTaskType
	 * @param strTaskTag
	 * @param strDynaInstId
	 * @param strParam
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeBackendTask(String strSystemId, String strTaskType, String strTaskTag, String strDynaInstId, String strParam, IUserContext iUserContext, Object objTag) throws Throwable;
	
	
	
	
	/**
	 * 注册系统的实体服务对象
	 * @param strSystemId
	 * @param strDataEntityId
	 * @param iDEService
	 */
	void registerDEService(String strSystemId, String strDataEntityId, IDEService iDEService);
	
	
	
	/**
	 * 获取实体服务对象
	 * @param strSystemId
	 * @param strDataEntityId
	 * @return
	 */
	IDEService getDEService(String strSystemId, String strDataEntityId);
	
	
	/**
	 * 获取实体服务对象
	 * @param strSystemId
	 * @param strDataEntityId
	 * @param bTryMode 尝试模式
	 * @return
	 */
	IDEService getDEService(String strSystemId, String strDataEntityId, boolean bTryMode);
	
	
	/**
	 * 注册实体服务
	 * @param runtimeCls
	 * @param strDataEntityId
	 * @param iDEService
	 */
	void registerDEService(Class<?> runtimeCls, String strDataEntityId, IDEService iDEService);
	
	
	
	/**
	 * 获取实体服务对象
	 * @param runtimeCls
	 * @param strDataEntityId
	 * @param bTryMode 尝试模式
	 * @return
	 */
	IDEService getDEService(Class<?> runtimeCls, String strDataEntityId, boolean bTryMode);
	
	
	
	/**
	 * 获取实体运行时对象
	 * @param strSystemId
	 * @param strDataEntityId
	 * @return
	 */
	IDataEntityRuntime getDataEntityRuntime(String strSystemId, String strDataEntityId);
	
	
	
	
	/**
	 * 获取系统运行时集合
	 * @return
	 */
	Collection<ISystemRuntime> getSystemRuntimes();
	
	
	
	
	/**
	 * 调用接口方法
	 * @param strSystemId 部署系统标识
	 * @param strAppCodeName 接口标识
	 * @param strDataEntityName
	 * @param strMethodName
	 * @param objBody
	 * @param strKey
	 * @param iUserContext 用户上下文
	 * @param objTag
	 * @return
	 * @throws Exception
	 */
	Object invokeAppMethod(String strSystemId,String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName,String strMethodName, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable;
	
	
	/**
	 * 调用接口方法
	 * @param strSystemId 部署系统标识
	 * @param strAppCodeName 接口标识
	 * @param strDataEntityName
	 * @param strMethodName
	 * @param objBody
	 * @param strKey
	 * @param iUserContext 用户上下文
	 * @param objTag
	 * @return
	 * @throws Exception
	 */
	Object invokeAppMethod(String strSystemId, String strAppCodeName, String strDataEntityName,String strMethodName, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable;
	
	
	
	
	
	/**
	 * 调用App导入数据
	 * @param strSystemId 部署系统标识
	 * @param strAppCodeName 服务域
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strImportTag
	 * @param objBody
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeAppImportData(String strSystemId, String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable;
	
	
	
	/**
	 * 调用App导出数据
	 * @param strSystemId 部署系统标识
	 * @param strAppCodeName 服务域
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strImportTag
	 * @param objBody
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeAppExportData(String strSystemId, String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable;
	
	
	
	/**
	 * 调用App导出数据
	 * @param strSystemId
	 * @param strAppCodeName
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strDataEntityName
	 * @param strExportTag
	 * @param strMethodName
	 * @param objBody
	 * @param strKey
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeAppExportData(String strSystemId, String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, String strMethodName, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable;
	
	
	
	/**
	 * 调用App打印数据
	 * @param strSystemId 部署系统标识
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
	Object invokeAppPrintData(String strSystemId, String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strPrintTag, String strPrintType, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable;

	
	
	/**
	 * 调用App启动流程
	 * @param strSystemId 部署系统标识
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
	Object invokeAppWFStart(String strSystemId, String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strWFTag, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable;
	
	
	
	
	/**
	 * 调用App取消流程
	 * @param strSystemId 部署系统标识
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
	Object invokeAppWFCancel(String strSystemId, String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strWFTag, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable;
	
	
	/**
	 * 调用App进行文件上传
	 * @param strSystemId
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
	Object invokeAppUploadFile(String strSystemId, String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strKey, String strStorageField, net.ibizsys.runtime.util.domain.File file, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable;

	
	

	/**
	 * 调用App进行文件下载
	 * @param strSystemId
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
	Object invokeAppDownloadFile(String strSystemId, String strAppCodeName, String strParentDEName, String strParentKey, String strDataEntityName, String strKey, String strStorageField, net.ibizsys.runtime.util.domain.File file, Object objBody, IUserContext iUserContext, Object objTag) throws Throwable;
	
	
	
	
	
}
