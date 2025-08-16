package net.ibizsys.central.app;

import net.ibizsys.central.ISystemModelRuntime;
import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.app.dataentity.IAppDataEntityRSRuntime;
import net.ibizsys.central.app.dataentity.IAppDataEntityRuntime;
import net.ibizsys.central.sysutil.ISysUtilRuntimeBase;
import net.ibizsys.model.app.IPSApplication;

/**
 * 前端应用接口运行时
 * @author lionlau
 *
 */
public interface IApplicationRuntime extends ISysUtilRuntimeBase, ISystemModelRuntime {

	
	/**
	 * 初始化前端应用运行时
	 * @param iSystemRuntimeContext
	 * @param iPSApplication
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext, IPSApplication iPSApplication) throws Exception;

	
	/**
	 * 获取前端应用模型
	 * @return
	 */
	IPSApplication getPSApplication();
	
	


	/**
	 * 获取应用实体运行时对象
	 * @param strTag
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	IAppDataEntityRuntime getAppDataEntityRuntime(String strTag, boolean bTryMode);
	
	
	
	/**
	 * 获取应用实体关系运行时对象
	 * @param strTag
	 * @param bTryMode
	 * @return
	 */
	IAppDataEntityRSRuntime getAppDataEntityRSRuntime(String strTag, boolean bTryMode);
	
	
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
	 * @param strMethodName
	 * @param objBody
	 * @param strKey
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeDEExportData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strExportTag, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable;
	
	
	
	
	/**
	 * 打印数据
	 * @param strScope 服务域
	 * @param strParentDEName
	 * @param strParentKey
	 * @param strKey
	 * @param strPrintTag
	 * @param objBody
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeDEPrintData(String strScope, String strParentDEName, String strParentKey, String strDataEntityName, String strPrintTag, String strPrintType, Object objBody, String strKey, Object objTag) throws Throwable;

	
	
	
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
}
