package net.ibizsys.central.app.dataentity;

import net.ibizsys.central.app.IApplicationRuntime;
import net.ibizsys.central.app.IApplicationRuntimeContext;
import net.ibizsys.central.dataentity.IDataEntityModelRuntime;
import net.ibizsys.central.service.ISysServiceAPIRuntime;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;

public interface IAppDataEntityRuntime  extends IDataEntityModelRuntime{

	/**
	 * 初始化应用实体运行时	
	 * @param iApplicationRuntimeContext
	 * @param iPSAppDataEntity
	 * @throws Exception
	 */
	void init(IApplicationRuntimeContext iApplicationRuntimeContext, IPSAppDataEntity iPSAppDataEntity) throws Exception;
	
	
	
	/**
	 * 获取应用实体模型对象
	 * @return
	 */
	IPSAppDataEntity getPSAppDataEntity();
	
	
	
	/**
	 * 获取系统前端应用运行时对象
	 * @return
	 */
	IApplicationRuntime getApplicationRuntime();

	
	
	/**
	 * 获取应用实体使用服务接口运行时对象
	 * @return
	 */
	ISysServiceAPIRuntime getSysServiceAPIRuntime();
	


	/**
	 * 获取实体服务接口名称
	 * @return
	 */
	String getPSDEServiceAPIName();
	
	/**
	 * 调用接口方法
	 * @param strScope 服务域
	 * @param iAppDataEntityRSRuntime
	 * @param strParentKey
	 * @param strMethodName
	 * @param objBody
	 * @param strKey
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeMethod(String strScope, IAppDataEntityRSRuntime iAppDataEntityRSRuntime, String strParentKey, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable;
	
	
	
	
	/**
	 * 导入数据
	 * @param strScope 服务域
	 * @param iAppDataEntityRSRuntime
	 * @param strParentKey
	 * @param strImportTag
	 * @param objBody
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object importData(String strScope, IAppDataEntityRSRuntime iAppDataEntityRSRuntime, String strParentKey, String strImportTag, Object objBody, Object objTag) throws Throwable;
	
	
	
	/**
	 * 导出数据
	 * @param strScope 服务域
	 * @param iAppDataEntityRSRuntime
	 * @param strParentKey
	 * @param strImportTag
	 * @param objBody
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object exportData(String strScope, IAppDataEntityRSRuntime iAppDataEntityRSRuntime, String strParentKey, String strExportTag, Object objBody, Object objTag) throws Throwable;
	
	
	
	/**
	 * 导出数据
	 * @param strScope
	 * @param iAppDataEntityRSRuntime
	 * @param strParentKey
	 * @param strExportTag
	 * @param strMethodName
	 * @param objBody
	 * @param strKey
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object exportData(String strScope, IAppDataEntityRSRuntime iAppDataEntityRSRuntime, String strParentKey, String strExportTag, String strMethodName, Object objBody, String strKey, Object objTag) throws Throwable;
	
	
	
	/**
	 * 打印数据
	 * @param strScope
	 * @param iAppDataEntityRSRuntime
	 * @param strParentKey
	 * @param strPrintTag
	 * @param objBody
	 * @param strKey
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object printData(String strScope, IAppDataEntityRSRuntime iAppDataEntityRSRuntime, String strParentKey, String strPrintTag, String strPrintType, Object objBody, String strKey, Object objTag) throws Throwable;
	
	
	
	/**
	 * 启动流程
	 * @param strScope
	 * @param iAppDataEntityRSRuntime
	 * @param strParentKey
	 * @param strWFTag
	 * @param objBody
	 * @param strKey
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object wfStart(String strScope, IAppDataEntityRSRuntime iAppDataEntityRSRuntime, String strParentKey, String strWFTag, Object objBody, String strKey, Object objTag) throws Throwable;

	
	
	/**
	 * 取消流程
	 * @param strScope
	 * @param iAppDataEntityRSRuntime
	 * @param strParentKey
	 * @param strWFTag
	 * @param objBody
	 * @param strKey
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object wfCancel(String strScope, IAppDataEntityRSRuntime iAppDataEntityRSRuntime, String strParentKey, String strWFTag, Object objBody, String strKey, Object objTag) throws Throwable;
	
	
	
	/**
	 * 文件上传
	 * @param strScope
	 * @param iAppDataEntityRSRuntime
	 * @param strParentKey
	 * @param strKey
	 * @param strStorageField
	 * @param file
	 * @param objBody
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object uploadFile(String strScope, IAppDataEntityRSRuntime iAppDataEntityRSRuntime, String strParentKey, String strKey, String strStorageField, net.ibizsys.runtime.util.domain.File file, Object objBody, Object objTag) throws Throwable;

	
	


	/**
	 * 文件下载
	 * @param strScope
	 * @param iAppDataEntityRSRuntime
	 * @param strParentKey
	 * @param strKey
	 * @param strStorageField
	 * @param file
	 * @param objBody
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object downloadFile(String strScope, IAppDataEntityRSRuntime iAppDataEntityRSRuntime, String strParentKey, String strKey, String strStorageField, net.ibizsys.runtime.util.domain.File file, Object objBody, Object objTag) throws Throwable;
}
