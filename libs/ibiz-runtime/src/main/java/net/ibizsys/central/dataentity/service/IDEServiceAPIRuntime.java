package net.ibizsys.central.dataentity.service;

import net.ibizsys.central.dataentity.IDataEntityModelRuntime;
import net.ibizsys.central.service.ISysServiceAPIRuntime;
import net.ibizsys.central.service.ISysServiceAPIRuntimeContext;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPI;
import net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod;

/**
 * 实体服务接口运行时对象接口
 * @author lionlau
 *
 */
public interface IDEServiceAPIRuntime extends IDataEntityModelRuntime{

	/**
	 * 初始化实体服务接口运行时	
	 * @param iSysServiceAPIRuntimeContext
	 * @param iPSDEServiceAPI
	 * @throws Exception
	 */
	void init(ISysServiceAPIRuntimeContext iSysServiceAPIRuntimeContext, IPSDEServiceAPI iPSDEServiceAPI) throws Exception;
	
	
	
	/**
	 * 获取实体服务接口模型对象
	 * @return
	 */
	IPSDEServiceAPI getPSDEServiceAPI();
	
	
	
	/**
	 * 获取系统服务接口运行时对象
	 * @return
	 */
	ISysServiceAPIRuntime getSysServiceAPIRuntime();

	
	/**
	 * 获取服务接口模式
	 * @return
	 */
	int getAPIMode();
	
	
	

	
	/**
	 * 获取实体服务接口方法
	 * @param strMethodCodeName
	 * @param bTryMode
	 * @return
	 */
	IPSDEServiceAPIMethod getPSDEServiceAPIMethod(String strMethodCodeName, boolean bTryMode);
	

	
	/**
	 * 调用接口方法
	 * @param strScope 服务域
	 * @param iDEServiceAPIRSRuntime
	 * @param strParentKey
	 * @param strMethodName
	 * @param objBody
	 * @param strKey
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeMethod(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable;
	
	
	
	
	/**
	 * 导入数据
	 * @param strScope 服务域
	 * @param iDEServiceAPIRSRuntime
	 * @param strParentKey
	 * @param strImportTag
	 * @param objBody
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object importData(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strImportTag, Object objBody, Object objTag) throws Throwable;
	
	
	
	/**
	 * 导入数据2
	 * @param strScope 服务域
	 * @param iDEServiceAPIRSRuntime
	 * @param strParentKey
	 * @param strImportTag
	 * @param objBody
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object importData2(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strImportTag, Object objBody, Object objTag) throws Throwable;
	
	
	/**
	 * 异步导入数据
	 * @param strScope 服务域
	 * @param iDEServiceAPIRSRuntime
	 * @param strParentKey
	 * @param strImportTag
	 * @param objBody
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object asyncImportData(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strImportTag, Object objBody, Object objTag) throws Throwable;
	
	
	
	/**
	 * 异步导入数据2
	 * @param strScope 服务域
	 * @param iDEServiceAPIRSRuntime
	 * @param strParentKey
	 * @param strImportTag
	 * @param objBody
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object asyncImportData2(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strImportTag, Object objBody, Object objTag) throws Throwable;
	
	
	/**
	 * 获取导入数据模板
	 * @param strScope 服务域
	 * @param iDEServiceAPIRSRuntime
	 * @param strParentKey
	 * @param strImportTag
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object getImportTemplate(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strImportTag, Object objTag) throws Throwable;
	
	
	/**
	 * 导出数据
	 * @param strScope 服务域
	 * @param iDEServiceAPIRSRuntime
	 * @param strParentKey
	 * @param strImportTag
	 * @param objBody
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object exportData(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strExportTag, Object objBody, Object objTag) throws Throwable;
	
	
	/**
	 * 导出数据
	 * @param strScope
	 * @param iDEServiceAPIRSRuntime
	 * @param strParentKey
	 * @param strExportTag
	 * @param strMethodName
	 * @param objBody
	 * @param strKey
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object exportData(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strExportTag, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable;
	
	
	
	/**
	 * 异步导出数据
	 * @param strScope
	 * @param iDEServiceAPIRSRuntime
	 * @param strParentKey
	 * @param strExportTag
	 * @param strMethodName
	 * @param objBody
	 * @param strKey
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object asyncExportData(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strExportTag, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable;
	
	
	
	/**
	 * 打印数据
	 * @param strScope
	 * @param iDEServiceAPIRSRuntime
	 * @param strParentKey
	 * @param strPrintTag
	 * @param objBody
	 * @param strKey
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object printData(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strPrintTag, String strPrintType, Object objBody, String strKey, Object objTag) throws Throwable;
	
	
	
	/**
	 * 启动流程
	 * @param strScope
	 * @param iDEServiceAPIRSRuntime
	 * @param strParentKey
	 * @param strWFTag
	 * @param objBody
	 * @param strKey
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object wfStart(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strWFTag, Object objBody, String strKey, Object objTag) throws Throwable;
	
	
	
	/**
	 * 取消流程
	 * @param strScope
	 * @param iDEServiceAPIRSRuntime
	 * @param strParentKey
	 * @param strWFTag
	 * @param objBody
	 * @param strKey
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object wfCancel(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strWFTag, Object objBody, String strKey, Object objTag) throws Throwable;
	
	
	
	/**
	 * 文件上传
	 * @param strScope
	 * @param iDEServiceAPIRSRuntime
	 * @param strParentKey
	 * @param strKey
	 * @param strStorageField
	 * @param file
	 * @param inputStream
	 * @param objBody
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object uploadFile(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strKey, String strStorageField, net.ibizsys.runtime.util.domain.File file, Object objBody, Object objTag) throws Throwable;

	
	


	/**
	 * 文件下载
	 * @param strScope
	 * @param iDEServiceAPIRSRuntime
	 * @param strParentKey
	 * @param strKey
	 * @param strStorageField
	 * @param file
	 * @param outputStream
	 * @param objBody
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object downloadFile(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strKey, String strStorageField, net.ibizsys.runtime.util.domain.File file, Object objBody, Object objTag) throws Throwable;
	
	

	/**
	 * 自动完成
	 * @param strScope
	 * @param iDEServiceAPIRSRuntime
	 * @param strParentKey
	 * @param strACTag
	 * @param strMethod
	 * @param objBody
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object autoComplete(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strACTag, String strMethod, Object objBody, Object objTag) throws Throwable;
	
	
	
	/**
	 * 输出报表
	 * @param strScope
	 * @param iDEServiceAPIRSRuntime
	 * @param strParentKey
	 * @param strPrintTag
	 * @param strPrintType
	 * @param objBody
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object report(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strReportTag, String strReportType, Object objBody, Object objTag) throws Throwable;
}
