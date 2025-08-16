package net.ibizsys.central.cloud.core.sysutil;

import java.io.File;
import java.util.List;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudExtensionClient;
import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;
import net.ibizsys.central.cloud.core.dataentity.util.IDEExtensionUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.CodeList;
import net.ibizsys.central.cloud.core.util.domain.DeploySystem;


/**
 * 总线系统扩展功能运行时对象接口
 * @author lionlau
 *
 */
public interface IHubSysExtensionUtilRuntime extends ISysUtilRuntime{

	/**
	 * 获取Cloud扩展客户端
	 * @return
	 */
	ICloudExtensionClient getCloudExtensionClient();
	
	/**
	 * 调用WebHook逻辑
	 * @param iSystemRuntime
	 * @param strKey
	 * @param param
	 * @return
	 */
	Object invokeWebHook(ISystemRuntime iSystemRuntime, String strKey, Object param);
	
	/**
	 * 调用动态模型接口
	 * @param iSystemRuntime
	 * @param strPModel
	 * @param strPKey
	 * @param strModel
	 * @param strMethod
	 * @param strKey
	 * @param param
	 * @return
	 */
	Object invokeDynaModelAPI(ISystemRuntime iSystemRuntime, String strPModel, String strPKey, String strModel, String strMethod, String strKey, Object param);
	
	
	
	
	/**
	 * 获取指定应用实体JsonSchema
	 * @param iSystemRuntime
	 * @param strAppTag
	 * @param strAppDataEntityTag
	 * @param param
	 * @param bTryMode 尝试模式
	 * @return
	 */
	File getAppDataEntityJsonSchema(ISystemRuntime iSystemRuntime, String strAppTag, String strAppDataEntityTag, Object param, boolean bTryMode);
	
	
	
	/**
	 * 获取HubApp动态模型文件
	 * @param iSystemRuntime
	 * @param strAppTag
	 * @param param
	 * @param bTryMode 尝试模式
	 * @return
	 */
	File getHubAppDynaModelFile(ISystemRuntime iSystemRuntime, String strAppTag, Object param, boolean bTryMode);
	
	
	/**
	 * 获取App动态模型文件
	 * @param iSystemRuntime
	 * @param strAppTag
	 * @param strModelUri
	 * @param param
	 * @param bTryMode 尝试模式
	 * @return
	 */
	File getAppDynaModelFile(ISystemRuntime iSystemRuntime, String strAppTag, String strModelUri, Object param, boolean bTryMode);
	
	
	/**
	 * 获取HubApp子应用动态模型文件
	 * @param iSystemRuntime
	 * @param strAppTag
	 * @param strSubAppTag
	 * @param strModelUri
	 * @param param
	 * @param bTryMode 尝试模式
	 * @return
	 */
	File getHubSubAppDynaModelFile(ISystemRuntime iSystemRuntime, String strAppTag, String strSubAppTag, String strModelUri, Object param, boolean bTryMode);
	
	
	/**
	 * 获取指定Hub子应用实体JsonSchema
	 * @param iSystemRuntime
	 * @param strAppTag
	 * @param strSubAppTag
	 * @param strAppDataEntityTag
	 * @param param
	 * @param bTryMode 尝试模式
	 * @return
	 */
	File getHubSubAppDataEntityJsonSchema(ISystemRuntime iSystemRuntime, String strAppTag, String strSubAppTag, String strAppDataEntityTag, Object param, boolean bTryMode);
	
	
	/**
	 * 重新加载扩展
	 * @param iSystemRuntime
	 * @param strExtensionId
	 */
	void reloadExtension(ISystemRuntime iSystemRuntime, String strExtensionId);
	
	
	
	/**
	 * 建立传入实体的默认实体扩展功能运行时对象
	 * @param iDataEntityRuntime
	 * @return
	 */
	IDEExtensionUtilRuntime createDEExtensionUtilRuntime(IDataEntityRuntime iDataEntityRuntime);
	
	
	
	
	
	/**
	 * 获取代码表对象
	 * @param iSystemRuntime
	 * @param strCodeListTag
	 * @param nMaxSize 最大项数量
	 * @param param 
	 * @param bTryMode 尝试模式
	 * @return
	 */
	CodeList getCodeList(ISystemRuntime iSystemRuntime, String strCodeListTag, int nMaxSize, Object param, boolean bTryMode);
	
	
	
	/**
	 * 合并系统模型
	 * @param majorFile
	 * @param deploySystems
	 * @param bVerifyModel
	 * @return
	 */
	File mergeDeploySystems(File majorModelFile, List<DeploySystem> deploySystems, boolean bVerifyModel);
	
	
	
	/**
	 * 重新加载合并
	 * @param iSystemRuntime
	 * @param strSystemId
	 */
	void reloadSystemMergences(ISystemRuntime iSystemRuntime, String strSystemId);
	
	
	
	/**
	 * 获取App简单模型文件
	 * @param iSystemRuntime
	 * @param strAppTag
	 * @param strModelUri
	 * @param param
	 * @param bTryMode 尝试模式
	 * @return
	 */
	File getAppSimpleModelFile(ISystemRuntime iSystemRuntime, String strAppTag, String strModelUri, Object param, boolean bTryMode);
	
	
//	/**
//	 * 获取智能立方体缓存数据
//	 * @param iSystemRuntime
//	 * @param strBICubeTag
//	 * @return
//	 */
//	String getBICubeCacheData(ISystemRuntime iSystemRuntime, String strBICubeTag);
//	
//	
//	
//	/**
//	 * 获取实体属性缓存数据
//	 * @param iSystemRuntime
//	 * @param strDataEntityTag
//	 * @return
//	 */
//	String getFieldCacheData(ISystemRuntime iSystemRuntime, String strDataEntityTag);
//	
//	
//	/**
//	 * 获取实体表单缓存数据
//	 * @param iSystemRuntime
//	 * @param strDataEntityTag
//	 * @return
//	 */
//	String getFormCacheData(ISystemRuntime iSystemRuntime, String strDataEntityTag);
}
