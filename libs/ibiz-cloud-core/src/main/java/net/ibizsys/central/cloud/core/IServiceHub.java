package net.ibizsys.central.cloud.core;

import java.io.File;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.io.Resource;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.ISystemGateway;
import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.service.ISysServiceAPIRequestMappingAdapter;
import net.ibizsys.central.cloud.core.util.IConfigListener;
import net.ibizsys.central.cloud.core.util.domain.AppData;
import net.ibizsys.central.cloud.core.util.domain.DataSource;
import net.ibizsys.central.cloud.core.util.domain.DeploySystem;
import net.ibizsys.central.cloud.core.util.domain.ServiceInstance;
import net.ibizsys.central.database.ISysDBSchemeRuntime;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.runtime.security.IUserContext;

/**
 * 服务网关对象接口
 * @author lionlau
 *
 */
public interface IServiceHub extends ISystemGateway{

	/**
	 * Cloud核心系统部署标识
	 */
	public final static String DEPLOYSYSYTEMID_GATEWAY = "gateway";
	
	
	/**
	 * Cloud插件系统部署标识
	 */
	public final static String DEPLOYSYSYTEMID_ADDIN = "addin";
	
	
	/**
	 * Cloud部署系统远程模型路径模式
	 */
	public final static String DEPLOYSYSYTEMMODELPATH_REMOTE = "__REMOTE__";
	
	/**
	 * Cloud部署系统内置模型路径模式
	 */
	public final static String DEPLOYSYSYTEMMODELPATH_BUILTIN = "__BUILTIN__";
	
	
	
	/**
	 * 部署系统默认服务标识前缀
	 */
	public final static String SERVICEID_DEPLOYSYSYTEM_PREFIX  = "servicehub-";
	
	/**
	 * Servlet动态后台应用服务路径前缀
	 */
	public final static String BASEURL_SERVLETAPP = "web";
	
	
	/**
	 * 动态数据源前缀
	 */
	public final static String DYNADATASOURCE_PREFIX = "dynadatasource_";

	
	
//	/**
//	 * 代理应用服务路径前缀
//	 */
//	public final static String BASEURL_PROXYAPP = "proxy-app";
	
	/**
	 * 获取当前实例标识
	 * @return
	 */
	String getInstanceId();
	
	
	/**
	 * 服务总线是否已经安装
	 * @return
	 */
	boolean isInstalled();
	
	
	/**
	 * 是否支持Servlet应用
	 * @return
	 */
	boolean isEnableServletApp();
	
	
	/**
	 * 是否支持服务应用
	 * @return
	 */
	boolean isEnableServiceApp();
	
	
	
	/**
	 * 是否启用调试
	 * @return
	 */
	boolean isEnableDebug();
	
	
	
	/**
	 * 是否启用运行时代码模式
	 * @return
	 */
	boolean isEnableRTCodeMode();
	
	
	/**
	 * 是否启用生产模式
	 * @return
	 */
	boolean isEnableProdMode();
	
	/**
	 * 获取Servlet应用服务前缀
	 * @return
	 */
	String getServletAppBaseUrl();
	
	
//	/**
//	 * 获取代理应用服务前缀
//	 * @return
//	 */
//	String getServiceAppBaseUrl();
	
	
	/**
	 * 获取工作线程核心池数量
	 * @return
	 */
	int getWorkThreadCorePoolSize();
	
	/**
	 * 获取工作线程池最大数量
	 * @return
	 */
	int getWorkThreadMaximumPoolSize();
	
	/**
	 * 获取工作线程池处理队列大小
	 * @return
	 */
	int getWorkThreadBlockingQueueSize();
	
	
	/**
	 * 获取服务总线系统运行时对象
	 * @param bTryMode 尝试模式
	 * @return
	 */
	IHubSystemRuntime getHubSystemRuntime(boolean bTryMode);
	
	
	
	/**
	 * 获取服务总线系统运行时对象（必须存在）
	 * @return
	 */
	IHubSystemRuntime getHubSystemRuntime();
	
	
	
	
	/**
	 * 获取Cloud插件服务对象
	 * @return
	 */
	ICloudPluginService getCloudPluginService();
	
	
	
	/**
	 * 获取服务路径
	 * @return
	 */
	String getServiceUrl();
	
	
	
	/**
	 * 获取服务总线IP地址
	 * @return
	 */
	String getIPAddress();
	
	
	
	/**
	 * 获取服务总线侦听端口
	 * @return
	 */
	int getPort();
	
	
//	/**
//	 * 获取系统UAA功能对象运行时
//	 * @return
//	 */
//	ISysUAAUtilRuntime getSysUAAUtilRuntime();
//	
//	
//	
//	/**
//	 * 获取系统工作流功能
//	 * @return
//	 */
//	ISysWFUtilRuntime getSysWFUtilRuntime();
	

	
	
	/**
	 * 注册过滤器排除
	 * @param excludesPattern
	 */
	void registerIgnoreAuthPattern(String ignoreAuthPattern);

	
	/**
	 * 注销过滤器排除
	 * @param excludesPattern
	 */
	void unregisterIgnoreAuthPattern(String ignoreAuthPattern);
	
	
	/**
	 * 注册命名服务
	 * @param strServiceId
	 */
	void registerNamingService(String strServiceId);
	
	
	
	/**
	 * 注册命名服务
	 * @param strServiceId
	 * @param strIp
	 * @param nPort
	 */
	void registerNamingService(String strServiceId, String strIp, int nPort);
	
	
	
	/**
	 *  注销命名服务
	 * @param strServiceId
	 */
	void unregisterNamingService(String strServiceId);
	
	
	/**
	 * 注销命名服务
	 * @param strServiceId
	 * @param strIp
	 * @param nPort
	 */
	void unregisterNamingService(String strServiceId, String strIp, int nPort);
	
	/**
	 * 发布配置
	 * @param strConfigId
	 * @param objectNode
	 */
	void publishConfig(String strConfigId, ObjectNode objectNode);
	
	
	/**
	 * 发布配置（以Yaml形式）
	 * @param strConfigId
	 * @param map 
	 */
	void publishConfig(String strConfigId, Map map);
	
	
	/**
	 * 发布配置（直接内容）
	 * @param strConfigId
	 * @param strContent 
	 */
	void publishConfig(String strConfigId, String strContent);
	
	
	
	/**
	 * 获取指定配置项内容
	 * @param strConfigId
	 * @return
	 */
	String getConfig(String strConfigId);
	
	
	/**
	 * 增加配置侦听器对象
	 * @param dataId
	 * @param listener
	 */
    void addConfigListener(String dataId, IConfigListener listener);
    
    
    /**
     * 移除配置侦听器对象
     * @param dataId
     * @param listener
     */
    void removeConfigListener(String dataId, IConfigListener listener);
	
    
    /**
     * 获取Cloud组件运行时对象
     * @param systemCls
     * @param cls
     * @param bTryMode
     * @return
     */
    public <T extends ICloudUtilRuntime> T getCloudUtilRuntime(Class<?> systemCls, Class<T> cls, boolean bTryMode);
	
	/**
	 * 通知服务Hub需要注册的云体系功能组件
	 * @param systemRuntimeCls
	 * @param cloudUtilCls
	 */
	void requireCloudUtilRuntime(Class<?> systemRuntimeCls, Class<? extends ICloudUtilRuntime> cloudUtilCls);
	
	/**
	 * 调用获取应用数据
	 * @param strDeploySystemId
	 * @param strSystemTag
	 * @param strOrgId
	 * @param iAuthenticationUser
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	AppData invokeGetAppData(String strDeploySystemId, String strSystemTag, String strOrgId, IAuthenticationUser iAuthenticationUser, Object objTag) throws Throwable;
	
	
	/**
	 * 调用获取应用数据
	 * @param strDeploySystemId
	 * @param strDCSystemTag
	 * @param iAuthenticationUser
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	AppData invokeGetAppData(String strDeploySystemId, String strDCSystemTag, IAuthenticationUser iAuthenticationUser, Object objTag) throws Throwable;
	
	
	/**
	 * 执行DevOps操作
	 * @param strDeploySystemId
	 * @param strAction
	 * @param objBody
	 * @param strKey
	 * @param iUserContext
	 * @param objTag
	 * @return
	 * @throws Throwable
	 */
	Object invokeDevOpsAction(String strDeploySystemId, String strAction, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable;
	

	
	/**
	 * 响应Web资源
	 * @param request
	 * @param requestPath
	 * @return
	 */
	Resource resolveWebResource(HttpServletRequest request, String requestPath);
	
	
	
	
	/**
	 * 获取指定系统模型服务对象
	 * @param serviceId
	 * @param tryMode 
	 * @return
	 */
	IPSSystemService getPSSystemService(String serviceId, boolean tryMode);
	
	
	
	
	
	/**
	 *  获取命名服务实例集合
	 * @param strServiceId
	 */
	List<ServiceInstance> getNamingServiceInstances(String serviceId);
	
	
	
	
	/**
	 * 重新加载指定系统运行时
	 * @param serviceId
	 * @return
	 */
	ISystemRuntime reloadSystemRuntime(String serviceId);
	
	
	/**
	 * 获取指定已经加载的系统运行时
	 * @param strDeploySystemId
	 * @return
	 */
	ISystemRuntime getLoadedSystemRuntime(String strDeploySystemId);
	
	
	/**
	 * 获取指定已经加载的系统运行时
	 * @param strDeploySystemId
	 * @param bTryMode
	 * @return
	 */
	ISystemRuntime getLoadedSystemRuntime(String strDeploySystemId, boolean bTryMode);
	
	
	
	/**
	 * 获取服务总线标识
	 * @return
	 */
	String getId();
	
	
	/**
	 * 直接注册系统运行时
	 * @param deploySystem
	 * @return
	 */
	ISystemRuntime registerSystemRuntime(DeploySystem deploySystem);
	
	
	
	/**
	 * 直接注销系统运行时
	 * @param deploySystem
	 */
	void unregisterSystemRuntime(DeploySystem deploySystem);
	
	
	/**
	 * 获取服务总线设置
	 * @return
	 */
	IServiceHubSetting getServiceHubSetting();
	
	
	
	
	/**
	 * 注册传入系统的应用网关路由
	 * @param iSystemRuntime
	 */
	void registerAppGatewayRoutes(ISystemRuntime iSystemRuntime);
	
	
	/**
	 * 注册动态数据源
	 * @param iSystemRuntime
	 * @param ds
	 * @return
	 */
	javax.sql.DataSource registerDynaDataSourceIf(ISystemRuntime iSystemRuntime, DataSource ds);
	
	
	
	/**
	 * 注销动态数据源
	 * @param iSystemRuntime
	 * @param ds
	 */
	void unregisterDynaDataSource(ISystemRuntime iSystemRuntime, DataSource ds);
	
	
	/**
	 * 注销运行时系统大的全部动态数据源
	 * @param iSystemRuntime
	 */
	void unregisterDynaDataSources(ISystemRuntime iSystemRuntime);
	
	
	
	/**
	 * 判断命名服务是否存在
	 * @param strServiceId
	 * @param bHealth
	 */
	boolean containsNamingService(String strServiceId, boolean bHealth);
	
	
	
	
	/**
	 * 获取部署系统本地模型路径
	 * @param strDeploySystemId
	 * @param tryMode
	 * @return
	 */
	File getDeploySystemModelFolder(String strDeploySystemId, boolean tryMode);
	
	
	
	/**
	 * 获取系统服务接口请求映射适配器
	 * @return
	 */
	ISysServiceAPIRequestMappingAdapter getSysServiceAPIRequestMappingAdapter();
	
	
	
//	/**
//	 * 获取系统数据库体系同步适配器
//	 * @param bTryMode
//	 * @return
//	 */
//	ISysDBSchemeSyncAdapter getSysDBSchemeSyncAdapter(boolean bTryMode);
	
	
	
	/**
	 * 更新数据库体系
	 * @param iSysDBSchemeRuntime
	 */
	void updateDBSchema(ISysDBSchemeRuntime iSysDBSchemeRuntime);
	

	/**
	 * 注册动态数据源
	 * @param strCloudDataSourceId
	 * @param bReload
	 * @param bTryMode
	 * @return
	 */
	javax.sql.DataSource registerDynaDataSource(String strCloudDataSourceId, boolean bReload, boolean bTryMode);
	
	
	
	/**
	 * 注销动态数据源
	 * @param strCloudDataSourceId
	 */
	void unregisterDynaDataSource(String strCloudDataSourceId);
	
	
	/**
	 * 测试动态数据源
	 * @param ds
	 * @return
	 */
	boolean testDynaDataSource(DataSource ds, boolean bTryMode) throws Throwable;
	
	
	/**
	 * 是否并行加载系统合并
	 * @return
	 */
	boolean isConcurrentLoadSystemMergences();
}
