package net.ibizsys.central.cloud.core.dataentity;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import net.ibizsys.central.cloud.core.dataentity.security.IDataEntityAccessManager;
import net.ibizsys.central.cloud.core.dataentity.util.IDEExtensionUtilRuntime;
import net.ibizsys.central.cloud.core.dataentity.wf.IDEWFRuntime;
import net.ibizsys.central.cloud.core.util.domain.DownloadTicket;
import net.ibizsys.central.cloud.core.util.domain.V2ImportSchema;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionLogic;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionSuite;
import net.ibizsys.central.util.domain.ExportDataResult;
import net.ibizsys.central.util.domain.ImportDataResult;
import net.ibizsys.model.dataentity.wf.IPSDEWF;
import net.ibizsys.runtime.util.EntityError;
import net.ibizsys.runtime.util.IEntity;

public interface IDataEntityRuntime extends net.ibizsys.central.dataentity.IDataEntityRuntime {

	
	/* (non-Javadoc)
	 * @see net.ibizsys.central.dataentity.IDataEntityRuntime#getDEWFRuntime(net.ibizsys.model.dataentity.wf.IPSDEWF)
	 */
	IDEWFRuntime getDEWFRuntime(IPSDEWF iPSDEWF);
	
	
	/* (non-Javadoc)
	 * @see net.ibizsys.central.dataentity.IDataEntityRuntime#getDefaultDEWFRuntime()
	 */
	IDEWFRuntime getDefaultDEWFRuntime();
	
	
	/**
	 * 获取代理的实体服务对象
	 * @param cls
	 * @return
	 */
	<T> T getProxyDEService(Class<?> cls);
	
	
	/**
	 * 导入数据
	 * @param strImportTag 导入标记
	 * @param baseEntity
	 * @param inputStream 数据流
	 * @param v2ImportSchema 导入数据体系
	 * @param bTestPriv 是否测试权限
	 * @param parentDataEntityRuntime
	 * @param strParentKey 
	 * @return 错误信息
	 * @throws Throwable
	 */
	Map<Integer, EntityError> importData(String strImportTag, IEntity baseEntity, InputStream inputStream, V2ImportSchema v2ImportSchema, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable;
	
	
	/**
	 * 导入数据2
	 * @param strImportTag 导入标记
	 * @param baseEntity
	 * @param inputStream 数据流
	 * @param v2ImportSchema 导入数据体系
	 * @param bTestPriv 是否测试权限
	 * @param parentDataEntityRuntime
	 * @param strParentKey 
	 * @return 错误信息
	 * @throws Throwable
	 */
	ImportDataResult importData2(String strImportTag, IEntity baseEntity, InputStream inputStream, V2ImportSchema v2ImportSchema, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable;
	
	
	/**
	 * 导出数据2
	 * @param strExportTag
	 * @param objData
	 * @param outputStream
	 * @throws Throwable
	 */
	ExportDataResult exportData2(String strExportTag, Object objData, OutputStream outputStream) throws Throwable;
	
	
	/**
	 * 是否支持扩展
	 * @return
	 */
	boolean isEnableExtension();
	
	
	
	
	/**
	 * 获取实体扩展运行时对象
	 * @return
	 */
	IDEExtensionUtilRuntime getDEExtensionUtilRuntime();
	
	
	
	/**
	 * 重新加载扩展
	 * @param v2SystemExtensionSuite
	 */
	void reloadExtension(V2SystemExtensionSuite v2SystemExtensionSuite);
	
	
	
	/**
	 * 获取扩展逻辑
	 * @param strLogicType
	 * @return
	 */
	V2SystemExtensionLogic[] getExtensionLogics(String strLogicType);
	
	
	
	/**
	 * 执行扩展逻辑
	 * @param v2SystemExtensionLogic
	 * @param objData
	 * @return
	 * @throws Throwable
	 */
	Object executeExtensionLogic(V2SystemExtensionLogic v2SystemExtensionLogic, Object objData) throws Throwable;
	
	
	
	
	/**
	 * 获取扩展会话标识（用于标记当前缓存的标记）
	 * @return
	 */
	String getExtensionSessionId();
	
	
	
	/* (non-Javadoc)
	 * @see net.ibizsys.central.dataentity.IDataEntityRuntime#getDataEntityAccessManager()
	 */
	IDataEntityAccessManager getDataEntityAccessManager();
	
	
	
	/**
	 * 建立下载凭证
	 * @param key
	 * @param strStorageField
	 * @param strOSSFileId
	 * @param bTryMode 尝试模式
	 * @return
	 * @throws Throwable
	 */
	DownloadTicket createDownloadTicket(Object keyOrEntity, String strStorageField, String strOSSFileId, boolean bTryMode) throws Throwable;
	

}
