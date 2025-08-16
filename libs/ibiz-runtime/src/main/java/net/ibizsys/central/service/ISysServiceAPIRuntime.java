package net.ibizsys.central.service;

import net.ibizsys.central.ISystemModelRuntime;
import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.dataentity.service.IDEServiceAPIRSRuntime;
import net.ibizsys.central.dataentity.service.IDEServiceAPIRuntime;
import net.ibizsys.model.service.IPSSysServiceAPI;

/**
 * 系统服务接口运行时
 * @author lionlau
 *
 */
public interface ISysServiceAPIRuntime extends ISystemModelRuntime {

	/**
	 * 忽略后续处理
	 */
	public final static Object RET_IGNOREPOSTPROCESS = new Object();
	
	
	/**
	 * 初始化系统服务接口运行时
	 * @param iSystemRuntimeContext
	 * @param iPSSysServiceAPI
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysServiceAPI iPSSysServiceAPI) throws Exception;

	
	/**
	 * 获取系统服务接口模型
	 * @return
	 */
	IPSSysServiceAPI getPSSysServiceAPI();
	
	

	/**
	 * 获取服务接口级别
	 * @return
	 */
	int getAPILevel();


	/**
	 * 获取实体服务接口运行时对象
	 * @param strTag
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	IDEServiceAPIRuntime getDEServiceAPIRuntime(String strTag, boolean bTryMode);
	
	
	
	/**
	 * 获取实体服务接口关系运行时对象
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	IDEServiceAPIRSRuntime getDEServiceAPIRSRuntime(String strTag, boolean bTryMode);
	
	
	
	/**
	 * 获取实体服务接口关系运行时
	 * @param strMajorDETag
	 * @param strMinorDETag
	 * @param bTryMode
	 * @return
	 */
	IDEServiceAPIRSRuntime getDEServiceAPIRSRuntime(String strMajorDETag, String strMinorDETag, boolean bTryMode);
	
	/**
	 * 调用实体方法
	 * @param strScope 服务域
	 * @param strDataEntityName
	 * @param strMethodName
	 * @param objBody
	 * @param strKey
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeDEMethod(String strScope, String strDataEntityName, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable;
	
	
	
	
	/**
	 * 调用实体方法
	 * @param strScope 服务域
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strDataEntityName
	 * @param strMethodName
	 * @param objBody
	 * @param strKey
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeDEMethod(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable;
	
	
	
	
	/**
	 * 导入数据
	 * @param strScope 服务域
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strImportTag
	 * @param objBody
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeDEImportData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, Object objTag) throws Throwable;

	

	/**
	 * 导入数据2
	 * @param strScope 服务域
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strImportTag
	 * @param objBody
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeDEImportData2(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, Object objTag) throws Throwable;
	
	
	
	/**
	 * 异步导入数据
	 * @param strScope 服务域
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strImportTag
	 * @param objBody
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeDEAsyncImportData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, Object objTag) throws Throwable;

	

	/**
	 * 异步导入数据2
	 * @param strScope 服务域
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strImportTag
	 * @param objBody
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeDEAsyncImportData2(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objBody, Object objTag) throws Throwable;
	
	

	/**
	 * 获取导入数据模板
	 * @param strScope
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strDataEntityName
	 * @param strImportTag
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeDEGetImportTemplate(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strImportTag, Object objTag) throws Throwable;
	
	
	/**
	 * 导出数据
	 * @param strScope 服务域
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strImportTag
	 * @param objBody
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeDEExportData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, Object objBody, Object objTag) throws Throwable;
	
	

	/**
	 * 导出数据
	 * @param strScope
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strDataEntityName
	 * @param strExportTag
	 * @param strMethodName 导出数据行为
	 * @param objBody
	 * @param strKey
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeDEExportData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable;
	
	

	/**
	 * 异步导出数据
	 * @param strScope
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strDataEntityName
	 * @param strExportTag
	 * @param strMethodName 导出数据行为
	 * @param objBody
	 * @param strKey
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeDEAsyncExportData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable;
	
	
	
	
	/**
	 * 打印数据
	 * @param strScope 服务域
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strKey
	 * @param strPrintTag
	 * @param strContentType 内容类型
	 * @param objBody
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeDEPrintData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strPrintTag, String strContentType, Object objBody, String strKey, Object objTag) throws Throwable;

	
	
	
	/**
	 * 启动流程数据
	 * @param strScope 服务域
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strKey
	 * @param strWFTag
	 * @param objBody
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeDEWFStart(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strWFTag, Object objBody, String strKey, Object objTag) throws Throwable;
	
	
	/**
	 * 取消流程
	 * @param strScope 服务域
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strKey
	 * @param strWFTag
	 * @param objBody
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeDEWFCancel(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strWFTag, Object objBody, String strKey, Object objTag) throws Throwable;
	
	
	
	/**
	 * 文件上传
	 * @param strScope
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strDataEntityName
	 * @param strKey
	 * @param strStorageField
	 * @param file
	 * @param inputStream
	 * @param objBody
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeDEUploadFile(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strKey, String strStorageField, net.ibizsys.runtime.util.domain.File file, Object objBody, Object objTag) throws Throwable;

	
	

	/**
	 * 文件下载
	 * @param strScope
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strDataEntityName
	 * @param strKey
	 * @param strStorageField
	 * @param file
	 * @param outputStream
	 * @param objBody
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeDEDownloadFile(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strKey, String strStorageField, net.ibizsys.runtime.util.domain.File file, Object objBody, Object objTag) throws Throwable;
	
	
	
	
	/**
	 * 调用实体自动填充
	 * @param strScope
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strDataEntityName
	 * @param strACTag
	 * @param strMethodName
	 * @param objBody
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeDEAutoComplete(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strACTag, String strMethodName, Object objBody, Object objTag) throws Throwable;
	
	
	
	
	/**
	 * 实体报表
	 * @param strScope 服务域
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strKey
	 * @param strReportTag
	 * @param strContentType 内容类型
	 * @param objBody
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeDEReport(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strReportTag, String strReportType, Object objBody, Object objTag) throws Throwable;

	
}
