package net.ibizsys.central.cloud.core.sysutil;

import java.io.File;
import java.util.List;

import net.ibizsys.central.cloud.core.cloudutil.client.ICloudExtensionClient;
import net.ibizsys.central.cloud.core.util.domain.V2DeploySystem;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionBICube;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionField;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionForm;
import net.ibizsys.central.cloud.core.util.domain.V2SystemVersion;

/**
 * Cloud扩展功能组件
 * @author lionlau
 *
 */
public interface ISysCloudExtensionUtilRuntime extends ISysUtilRuntime{

	/**
	 * 云平台服务总线节点模板
	 */
	public final static String CLOUD_CONFIGID_SERVICEHUB_X = "x-servicehub";

	
	
	
	public final static String CLOUD_CONFIG_DBINST = "dbinst";
	public final static String CLOUD_CONFIG_DBINST_DBTYPE = "dbtype";
	public final static String CLOUD_CONFIG_DBINST_DBNAME = "dbname";
	public final static String CLOUD_CONFIG_DBINST_USERNAME = "username";
	public final static String CLOUD_CONFIG_DBINST_PASSWORD = "password";
	public final static String CLOUD_CONFIG_DBINST_URL = "url";

	public final static String CLOUD_CONFIG_DEPLOYSYSTEM = "deploysystem";
	public final static String CLOUD_CONFIG_DEPLOYSYSTEM_MODELPATH = "modelpath";
	public final static String CLOUD_CONFIG_DEPLOYSYSTEM_MODELPATH_REMOTE = "__REMOTE__";
	public final static String CLOUD_CONFIG_DEPLOYSYSTEM_UPDATEDBSCHEMA = "updatedbschema";
	public final static String CLOUD_CONFIG_DEPLOYSYSTEM_EXTENSION = "extension";
	
	
	public final static String CLOUD_CONFIG_SERVICEHUB = "servicehub";

	public final static String CLOUD_CONFIG_SYSTEMSOURCE = "systemsource";
	
	public final static String CLOUD_CONFIG_SYSTEMMERGENCES = "systemmergences";
	
	
	
	
	/**
	 * 获取Cloud扩展客户端
	 * @return
	 */
	ICloudExtensionClient getCloudExtensionClient();
	
	/**
	 * 发布指定标识数据源
	 * @param id
	 */
	boolean publishDataSource(String id);
	
	
	/**
	 * 发布全部数据源
	 */
	void publishAllDataSources();
	
	
	
	/**
	 * 发布指定标识服务总线
	 * @param id
	 */
	boolean publishServiceHub(String id);
	
	
	/**
	 * 发布指定标识服务总线
	 * @param id
	 * @param publishVer
	 */
	boolean publishServiceHub(String id, boolean publishVer);
	
	
	
	
	/**
	 * 发布全部服务总线
	 */
	void publishAllServiceHubs();
	
	
	
	/**
	 * 发布默认的应用网关
	 */
	boolean publishDefaultAppGateway();
	
	
	/**
	 * 发布指定标识服务总线版本
	 * @param id
	 */
	boolean publishServiceHubVer(String id);
	
	
	
	/**
	 * 发布指定标识部署系统版本
	 * @param id
	 */
	boolean publishDeploySystemVer(String id);
	
	
	
	
	/**
	 * 发布指定标识部署系统
	 * @param id
	 */
	boolean publishDeploySystem(String id);
	
	
	/**
	 * 发布指定标识部署系统
	 * @param id
	 * @param publishVer
	 */
	boolean publishDeploySystem(String id, boolean publishVer);
	
	
	/**
	 * 发布指定标识系统合并版本
	 * @param id
	 */
	boolean publishSystemMergencesVer(String id);
	
	
	
	
	/**
	 * 部署系统应用系统版本
	 * @param systemId
	 * @param versionId
	 * @param publishVer
	 * @return
	 */
	V2DeploySystem applySystemVersion(String deploySystemId, String versionId, boolean publishVer);
	
	
	
	/**
	 * 构建系统版本（Compose）
	 * @param systemId
	 * @param versionName
	 * @param build
	 * @return
	 */
	V2SystemVersion createSystemVersion(String systemId, String versionName, boolean build);
	

//	/**
//	 * 发布系统源
//	 * @param systemId
//	 * @param v2SystemVersion
//	 */
//	void publishSystemSource(String systemId, String versionId);
	
	
	/**
	 * 构建系统版本
	 * @param systemId
	 * @param versionId
	 * @return
	 */
	V2SystemVersion buildSystemVersion(String systemId, String versionId);
//	
//	/**
//	 * 发布指定标识服务总线版本
//	 * @param id
//	 */
//	void publishServiceHubVer(String id);
	
	
	/**
	 * 获取系统合并的本地模型路径
	 * @param systemId
	 * @param systemSourceId
	 * @return
	 */
	File getSystemModelFolder(String systemId, String systemSourceId);
	
	
	
	/**
	 * 获取智能立方体缓存数据
	 * @param strExtensionId
	 * @param strBICubeTag
	 * @return
	 */
	String getSystemExtensionBICubeCacheData(String strExtensionId, String strBICubeTag);
	
	
	
	/**
	 * 获取实体属性缓存数据
	 * @param strExtensionId
	 * @param strDataEntityTag
	 * @return
	 */
	String getSystemExtensionFieldCacheData(String strExtensionId, String strDataEntityTag);
	
	
	/**
	 * 获取实体表单缓存数据
	 * @param strExtensionId
	 * @param strDataEntityTag
	 * @return
	 */
	String getSystemExtensionFormCacheData(String strExtensionId, String strDataEntityTag);
	
	
	/**
	 * 获取智能立方体扩展数据
	 * @param strExtensionId
	 * @return
	 */
	List<V2SystemExtensionBICube> getSystemExtensionBICubes(String strExtensionId);
	
	
	/**
	 * 获取智能立方体扩展数据
	 * @param strExtensionId
	 * @param strBICubeTag
	 * @return
	 */
	List<V2SystemExtensionBICube> getSystemExtensionBICubes(String strExtensionId, String strBICubeTag);
	
	
	/**
	 * 获取实体属性扩展数据
	 * @param strExtensionId
	 * @param strDataEntityTag
	 * @return
	 */
	List<V2SystemExtensionField> getSystemExtensionFields(String strExtensionId, String strDataEntityTag);
	
	
	
	/**
	 * 获取实体表单扩展数据
	 * @param strExtensionId
	 * @param strDataEntityTag
	 * @return
	 */
	List<V2SystemExtensionForm> getSystemExtensionForms(String strExtensionId, String strDataEntityTag);
}
