package net.ibizsys.central.cloud.core.sysutil;

import java.io.File;

import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;
import net.ibizsys.central.cloud.core.dataentity.util.IDEExtensionUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.CodeList;

/**
 * 系统扩展功能运行时对象接口
 * @author lionlau
 *
 */
public interface ISysExtensionUtilRuntime extends ISysUtilRuntime{

	//final public static String OSSCAT_V2SYSTEMSOURCE = "V2SYSTEMSOURCE";
	
    /**
     * 对象存储分类：动态模型
     */
    public final static String OSSCAT_DYNAMODEL = "devops-dynamodel";
    
    
    /**
     * 服务接口：动态模型接口
     */
    public final static String SERVICEAPI_DYNAMODELAPI = "_dynamodelapi";
    
    
    /**
     * 服务接口标记：模型工具接口
     */
    public final static String SERVICEAPITAG_PSMODELTOOLAPI = "PSMODELTOOLAPI";
    
    
    

	
	/**
	 * 调用WebHook逻辑
	 * @param strKey
	 * @param param
	 * @return
	 */
	Object invokeWebHook(String strKey, Object param);
	
    
	/**
	 * 调用动态模型接口
	 * @param strPModel
	 * @param strPKey
	 * @param strModel
	 * @param strMethod
	 * @param strKey
	 * @param param
	 * @return
	 */
	Object invokeDynaModelAPI(String strPModel, String strPKey, String strModel, String strMethod, String strKey, Object param);
	
	
	
	/**
	 * 获取指定应用实体JsonSchema
	 * @param strAppTag
	 * @param strAppDataEntityTag
	 * @param param
	 * @param bTryMode 尝试模式
	 * @return
	 */
	File getAppDataEntityJsonSchema(String strAppTag, String strAppDataEntityTag, Object param, boolean bTryMode);
	
	
	
	
	/**
	 * 获取HubApp动态模型文件
	 * @param strAppTag
	 * @param param
	 * @param bTryMode 尝试模式
	 * @return
	 */
	File getHubAppDynaModelFile(String strAppTag, Object param, boolean bTryMode);
	
	
	/**
	 * 获取App动态模型文件
	 * @param strAppTag
	 * @param strModelUri
	 * @param param
	 * @param bTryMode 尝试模式
	 * @return
	 */
	File getAppDynaModelFile(String strAppTag, String strModelUri, Object param, boolean bTryMode);
	
	
	
	/**
	 * 获取HubApp子应用动态模型文件
	 * @param strAppTag
	 * @param strSubAppTag
	 * @param strModelUri
	 * @param param
	 * @param bTryMode 尝试模式
	 * @return
	 */
	File getHubSubAppDynaModelFile(String strAppTag, String strSubAppTag, String strModelUri, Object param, boolean bTryMode);
	
	
	
	
	/**
	 * 获取指定Hub子应用实体JsonSchema
	 * @param strAppTag
	 * @param strSubAppTag
	 * @param strAppDataEntityTag
	 * @param param
	 * @param bTryMode 尝试模式
	 * @return
	 */
	File getHubSubAppDataEntityJsonSchema(String strAppTag, String strSubAppTag, String strAppDataEntityTag, Object param, boolean bTryMode);
	
	
	
	
	/**
	 * 重新加载扩展
	 * @param strExtensionId
	 */
	void reloadExtension(String strExtensionId);
	
	
	
	/**
	 * 建立传入实体的默认实体扩展功能运行时对象
	 * @param iDataEntityRuntime
	 * @return
	 */
	IDEExtensionUtilRuntime createDEExtensionUtilRuntime(IDataEntityRuntime iDataEntityRuntime);
	
	

	/**
	 * 获取代码表对象
	 * @param strCodeListTag
	 * @param nMaxSize 最大项数量
	 * @param param 
	 * @param bTryMode 尝试模式
	 * @return
	 */
	CodeList getCodeList(String strCodeListTag, int nMaxSize, Object param, boolean bTryMode);
	
	
	
	
	
	/**
	 * 重新加载合并
	 * @param strSystemId
	 */
	void reloadSystemMergences(String strSystemId);
	
	
	
	/**
	 * 获取App简单模型文件
	 * @param strAppTag
	 * @param strModelUri
	 * @param param
	 * @param bTryMode 尝试模式
	 * @return
	 */
	File getAppSimpleModelFile(String strAppTag, String strModelUri, Object param, boolean bTryMode);
	
	
//	/**
//	 * 获取智能立方体缓存数据
//	 * @param strBICubeTag
//	 * @return
//	 */
//	String getBICubeCacheData(String strBICubeTag);
//	
//	
//	
//	/**
//	 * 获取实体属性缓存数据
//	 * @param strDataEntityTag
//	 * @return
//	 */
//	String getFieldCacheData(String strDataEntityTag);
//	
//	
//	/**
//	 * 获取实体表单缓存数据
//	 * @param strDataEntityTag
//	 * @return
//	 */
//	String getFormCacheData(String strDataEntityTag);
	
//	java.util.List<V2SystemExtensionBICube> getSystemExtensionBICubes(String strBICubeTag);
}
