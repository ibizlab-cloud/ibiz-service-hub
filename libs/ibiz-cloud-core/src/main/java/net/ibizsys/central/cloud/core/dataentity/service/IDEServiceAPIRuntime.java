package net.ibizsys.central.cloud.core.dataentity.service;

import net.ibizsys.central.dataentity.service.IDEServiceAPIRSRuntime;

public interface IDEServiceAPIRuntime extends net.ibizsys.central.dataentity.service.IDEServiceAPIRuntime {
   
	/**
	 * 聊天补全
	 * @param strScope
	 * @param iDEServiceAPIRSRuntime
	 * @param strParentKey
	 * @param strACTag
	 * @param strMethod
	 * @param objBody
	 * @param strKey
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object chatCompletion(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strACTag, String strMethod, Object objBody, String strKey, Object objTag) throws Throwable;
	
		
	
	/**
	 * 导入数据
	 * @param strScope 服务域
	 * @param iDEServiceAPIRSRuntime
	 * @param strParentKey
	 * @param strImportTag
	 * @param strOSSFileId
	 * @param strImportSchemaId
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object importData(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strImportTag, String strOSSFileId, String strImportSchemaId, Object objTag) throws Throwable;
	
	
	
	/**
	 * 导入数据2
	 * @param strScope 服务域
	 * @param iDEServiceAPIRSRuntime
	 * @param strParentKey
	 * @param strImportTag
	 * @param strOSSFileId
	 * @param strImportSchemaId
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object importData2(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strImportTag, String strOSSFileId, String strImportSchemaId, Object objTag) throws Throwable;
	
	
	/**
	 * 异步导入数据
	 * @param strScope 服务域
	 * @param iDEServiceAPIRSRuntime
	 * @param strParentKey
	 * @param strImportTag
	 * @param strOSSFileId
	 * @param strImportSchemaId
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object asyncImportData(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strImportTag, String strOSSFileId, String strImportSchemaId, Object objTag) throws Throwable;
	
	
	
	/**
	 * 异步导入数据2
	 * @param strScope 服务域
	 * @param iDEServiceAPIRSRuntime
	 * @param strParentKey
	 * @param strImportTag
	 * @param strOSSFileId
	 * @param strImportSchemaId
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object asyncImportData2(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strImportTag, String strOSSFileId, String strImportSchemaId, Object objTag) throws Throwable;
	
	
	
	/**
	 * 建立实体建立下载数据凭证
	 * @param strScope
	 * @param iDEServiceAPIRSRuntime
	 * @param strParentKey
	 * @param strKey
	 * @param strStorageField
	 * @param strOSSFileId
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object createDownloadTicket(String strScope, IDEServiceAPIRSRuntime iDEServiceAPIRSRuntime, String strParentKey, String strKey, String strStorageField, String strOSSFileId, Object objTag) throws Throwable;
}
