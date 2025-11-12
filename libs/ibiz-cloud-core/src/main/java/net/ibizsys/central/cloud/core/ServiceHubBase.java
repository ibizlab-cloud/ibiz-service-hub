package net.ibizsys.central.cloud.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

import javax.management.MBeanServer;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.eclipse.jgit.api.CloneCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.PullCommand;
import org.eclipse.jgit.api.errors.CheckoutConflictException;
import org.eclipse.jgit.api.errors.WrongRepositoryStateException;
import org.eclipse.jgit.internal.storage.file.FileRepository;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.reactive.ReactorLoadBalancerExchangeFilterFunction;
import org.springframework.core.io.Resource;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.Assert;
import org.springframework.util.DigestUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.PathMatcher;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.yaml.snakeyaml.Yaml;

import com.alibaba.cloud.nacos.NacosConfigManager;
import com.alibaba.cloud.nacos.NacosConfigProperties;
import com.alibaba.cloud.nacos.NacosDiscoveryProperties;
import com.alibaba.cloud.nacos.NacosServiceManager;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.listener.Listener;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.ISystemRuntimeSetting;
import net.ibizsys.central.SystemGateway;
import net.ibizsys.central.SystemGatewayException;
import net.ibizsys.central.Version;
import net.ibizsys.central.app.IApplicationRuntime;
import net.ibizsys.central.cloud.core.app.IServiceAppRuntime;
import net.ibizsys.central.cloud.core.app.IServletAppRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudDevOpsUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudDevOpsClient;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudExtensionClient;
import net.ibizsys.central.cloud.core.database.ISysDBSchemeSyncAdapter;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.service.ISysServiceAPIDocAdapter;
import net.ibizsys.central.cloud.core.service.ISysServiceAPIRequestMappingAdapter;
import net.ibizsys.central.cloud.core.service.StandardSysServiceAPIRequestMappingAdapter;
import net.ibizsys.central.cloud.core.servlet.IServiceHubFilter;
import net.ibizsys.central.cloud.core.spring.configuration.NacosServiceHubSetting;
import net.ibizsys.central.cloud.core.spring.configuration.NacosServiceHubSettingBase;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.spring.util.GatewayUtils;
import net.ibizsys.central.cloud.core.system.IExtensionSysRefRuntime;
import net.ibizsys.central.cloud.core.sysutil.IHubSysDevOpsUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.IHubSysExtensionUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysDevOpsUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysExtensionUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysUAAUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysUtilContainerOnly;
import net.ibizsys.central.cloud.core.util.ConfigEntity;
import net.ibizsys.central.cloud.core.util.IConfigListener;
import net.ibizsys.central.cloud.core.util.NacosConfigUtils;
import net.ibizsys.central.cloud.core.util.domain.AppData;
import net.ibizsys.central.cloud.core.util.domain.DataSource;
import net.ibizsys.central.cloud.core.util.domain.DeploySystem;
import net.ibizsys.central.cloud.core.util.domain.ServiceInstance;
import net.ibizsys.central.cloud.core.util.domain.V2DataSource;
import net.ibizsys.central.cloud.core.util.domain.V2DeploySystem;
import net.ibizsys.central.cloud.core.util.domain.V2DeploySystemDataSource;
import net.ibizsys.central.database.ISysDBSchemeRuntime;
import net.ibizsys.central.plugin.spring.service.client.WebFluxClient;
import net.ibizsys.central.service.ISysServiceAPIRuntime;
import net.ibizsys.central.sysutil.ISysUtilRuntimeBase;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.PSModelEnums.AppMode;
import net.ibizsys.model.PSModelEnums.DataSourceLink;
import net.ibizsys.model.PSModelEnums.DynaSysMode;
import net.ibizsys.model.PSModelEnums.PluginRTMode;
import net.ibizsys.model.PSModelEnums.SysRefType;
import net.ibizsys.model.PSModelServiceImpl;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.database.IPSSysDBScheme;
import net.ibizsys.model.res.IPSSysSFPlugin;
import net.ibizsys.model.service.IPSSysServiceAPI;
import net.ibizsys.runtime.ModelException;
import net.ibizsys.runtime.res.SysSFPluginRuntime;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.sysutil.ISysFileUtilRuntime;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DataTypes;
import net.ibizsys.runtime.util.DateUtils;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogLevels;
import net.ibizsys.runtime.util.ZipUtils;
import net.ibizsys.runtime.util.domain.Log;

public abstract class ServiceHubBase extends SystemGateway implements IServiceHub, IServiceHubFilter {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ServiceHubBase.class);

	public final static String LOGCAT = "SERVICEHUB";

	private IServiceHubSetting iServiceHubSetting;

	private IServiceHubFilter realServiceHubFilter = null;
	private Set<String> ignoreAuthPatternSet = null;
	private PathMatcher pathMatcher = new AntPathMatcher();
	private Map<String, IServletAppRuntime> servletAppRuntimeMap = new ConcurrentHashMap<String, IServletAppRuntime>();

	private IHubSystemRuntime hubSystemRuntime = null;

	private RequestMappingHandlerMapping requestMappingHandlerMapping = null;

	private ISysServiceAPIDocAdapter sysServiceAPIDocAdapter = null;

	private ISysDBSchemeSyncAdapter sysDBSchemeSyncAdapter = null;

	@Autowired
	private NacosServiceManager nacosServiceManager;

	@Autowired
	private NacosDiscoveryProperties nacosDiscoveryProperties;

	@Autowired
	private NacosConfigManager nacosConfigManager;

	@Autowired
	private NacosConfigProperties nacosConfigProperties;

	@Autowired
	private ReactorLoadBalancerExchangeFilterFunction reactorLoadBalancerExchangeFilterFunction;

	private NamingService namingService = null;

	private String strIPAddress = null;

	private Map<Class<? extends ICloudUtilRuntime>, Class<?>> requiredCloudUtilRuntimeMap = new LinkedHashMap<Class<? extends ICloudUtilRuntime>, Class<?>>();

	private Map<IConfigListener, Listener> configListenerMap = new ConcurrentHashMap<IConfigListener, Listener>();

	private String strDeploySystemModelPath = null;

	private boolean bInstalled = false;

	private ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter = null;

	private ICloudPluginService cloudPluginService = null;

	private Map<String, String> deploySystemVerMap = new ConcurrentHashMap<String, String>();

	private Map<String, IConfigListener> deploySystemVerListenerMap = new ConcurrentHashMap<String, IConfigListener>();

	private Map<String, IConfigListener> dynaDataSourceListenerMap = new ConcurrentHashMap<String, IConfigListener>();

	/**
	 * 数据库实例配置Map
	 */
	private Map<String, ConfigEntity> dbInstConfigMap = new HashMap<String, ConfigEntity>();

	private Map<String, DataSource> dataSourceMap = new HashMap<String, DataSource>();

	private String strServiceHubVerConfig = "";

	private ICloudExtensionClient iCloudExtensionClient = null;

	private Map<String, String> debugModelPathMap = new ConcurrentHashMap<String, String>();

	public int getMonitorDebugModelPathsTimer() {
		return getServiceHubSetting().getMonitorDebugModelPathsTimer();
	}

	private Map<String, Long> debugModelPathTimestampMap = new ConcurrentHashMap<String, Long>();

	private String strInstanceId = KeyValueUtils.genUniqueId();

	@Value("${server.port}")
	private int port;

	// private Map<Class, Object> sysUtilRuntimeMap = new
	// ConcurrentHashMap<Class, Object>();

	public static IServiceHub getInstance() {
		return (IServiceHub) getInstance(false);
	}

	public ServiceHubBase() {
		if (getInstance(true) == null) {
			setInstance(this);
		}
	}

	protected void onPostConstruct() {

		WebFluxClient.setExchangeFilterFunction(reactorLoadBalancerExchangeFilterFunction);
		this.namingService = nacosServiceManager.getNamingService(nacosDiscoveryProperties.getNacosProperties());
		this.strIPAddress = nacosDiscoveryProperties.getIp();
		if (!StringUtils.hasLength(this.strIPAddress)) {
			try {
				this.strIPAddress = InetAddress.getLocalHost().getHostAddress();
			} catch (UnknownHostException e) {
				log.debug(e);
			}
		}
		log.info(String.format("服务网关版本[%1$s]", Version.toVersionString()));
		log.debug(String.format("服务网关开始初始化[%1$s:%2$s]", this.strIPAddress, this.port));
	}

	public IServiceHubSetting getServiceHubSetting() {
		return this.iServiceHubSetting;
	}

	public void setServiceHubSetting(IServiceHubSetting iServiceHubSetting) {
		this.iServiceHubSetting = iServiceHubSetting;
	}

	protected RequestMappingHandlerMapping getRequestMappingHandlerMapping() {
		return this.requestMappingHandlerMapping;
	}

	protected void setRequestMappingHandlerMapping(RequestMappingHandlerMapping requestMappingHandlerMapping) {
		this.requestMappingHandlerMapping = requestMappingHandlerMapping;
	}

	protected ISysServiceAPIDocAdapter getSysServiceAPIDocAdapter() {
		return sysServiceAPIDocAdapter;
	}

	protected void setSysServiceAPIDocAdapter(ISysServiceAPIDocAdapter sysServiceAPIDocAdapter) {
		this.sysServiceAPIDocAdapter = sysServiceAPIDocAdapter;
	}

	protected ISysDBSchemeSyncAdapter getSysDBSchemeSyncAdapter() {
		return sysDBSchemeSyncAdapter;
	}

	protected void setSysDBSchemeSyncAdapter(ISysDBSchemeSyncAdapter sysDBSchemeSyncAdapter) {
		this.sysDBSchemeSyncAdapter = sysDBSchemeSyncAdapter;
	}

	// @Override
	// public ISysDBSchemeSyncAdapter getSysDBSchemeSyncAdapter(boolean
	// bTryMode) {
	// ISysDBSchemeSyncAdapter iSysDBSchemeSyncAdapter =
	// getSysDBSchemeSyncAdapter();
	// if(iSysDBSchemeSyncAdapter != null || bTryMode) {
	// return iSysDBSchemeSyncAdapter;
	// }
	// throw new SystemGatewayException(this,
	// String.format("系统数据库体系同步设配器对象无效"));
	// }

	public void install() {
		try {
			if (getServiceHubSetting() == null) {
				throw new Exception("无效的配置对象");
			}

			log.debug(String.format("服务总线[%1$s]开始安装部署", getServiceHubSetting().getId()));
			onInstall();
			this.bInstalled = true;

		} catch (Exception ex) {
			throw new SystemGatewayException(this, String.format("安装服务网关发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected void onInstall() throws Exception {

		registerIgnoreAuthPatterns();

		this.setEnableAppGateway(this.getServiceHubSetting().isEnableAppGateway());
		this.setTempFolder(this.getServiceHubSetting().getTempFolder());
		this.setFileFolder(this.getServiceHubSetting().getFileFolder());
		this.setReportFolder(this.getServiceHubSetting().getReportFolder());
		this.setFontFolder(this.getServiceHubSetting().getFontFolder());

		/**
		 * 准备Cloud环境插件服务
		 */
		this.prepareCloudPluginService();

		// 服务总线版本配置
		this.strServiceHubVerConfig = this.getConfig(String.format("%1$s%2$s", NacosServiceHubSettingBase.DATAID_SERVICEHUB_PREFIX, getId()));
		if (this.strServiceHubVerConfig == null) {
			this.strServiceHubVerConfig = "";
		}

		// 安装动态数据源
		List<DataSource> dataSourceList = this.getServiceHubSetting().getDataSources();
		if (dataSourceList != null) {
			for (DataSource ds : dataSourceList) {
				try {
					this.dataSourceMap.put(ds.getDataSourceId(), ds);
					this.registerDataSource(ds);
				} catch (Exception ex) {
					throw new Exception(String.format("注册数据源[%1$s]发生异常，%2$s", ds.getDataSourceId(), ex.getMessage()), ex);
				}
			}
		}

		if (this.getSysDBSchemeSyncAdapter() == null) {
			log.warn(String.format("未配置数据库模型同步适配器，无法同步数据库模型"));
		}

		List<DeploySystem> deploySystemList = this.getServiceHubSetting().getDeploySystems();
		if (!ObjectUtils.isEmpty(deploySystemList)) {
			for (DeploySystem deploySystem : deploySystemList) {
				try {
					registerDeploySystem(deploySystem);
				} catch (Exception ex) {
					if (this.getServiceHubSetting().isIgnoreLoadSystemError()) {
						log.error(String.format("注册系统[%1$s]发生异常，%2$s", deploySystem.getDeploySystemId(), ex.getMessage()), ex);
						logEvent(LogLevels.ERROR, String.format("服务系统[%2$s@%1$s]注册发生异常，%3$s", getId(), deploySystem.getDeploySystemId(), ex.getMessage()), deploySystem);
					} else {
						throw new Exception(String.format("注册系统[%1$s]发生异常，%2$s", deploySystem.getDeploySystemId(), ex.getMessage()), ex);
					}
				}
			}

			if (this.getServiceHubSetting().isEnableReloadSystem() && !this.isEnableDebug()) {

				if (getMonitorDebugModelPathsTimer() != -1 && !ObjectUtils.isEmpty(this.debugModelPathMap)) {
					this.getHubSystemRuntime().threadRun(new Runnable() {
						@Override
						public void run() {
							doMonitorDebugModelPaths();
						}
					}, System.currentTimeMillis() + getMonitorDebugModelPathsTimer());
				}

				for (DeploySystem deploySystem : deploySystemList) {

					if (DEPLOYSYSYTEMID_GATEWAY.equalsIgnoreCase(deploySystem.getDeploySystemId())) {
						continue;
					}

					if (!DataTypeUtils.getBooleanValue(deploySystem.getEnableReload(), true)) {
						continue;
					}

					String strConfigId = String.format("%1$s%2$s-ver", NacosServiceHubSettingBase.DATAID_DEPLOYSYSTEM_PREFIX, deploySystem.getDeploySystemId());
					String strConfig = this.getConfig(strConfigId);
					if (strConfig == null) {
						strConfig = "";
					}
					this.deploySystemVerMap.put(strConfigId, strConfig);
					if (!this.deploySystemVerListenerMap.containsKey(strConfigId)) {
						IConfigListener iConfigListener = new IConfigListener() {

							@Override
							public Executor getExecutor() {
								return null;
							}

							@Override
							public void receiveConfigInfo(String configInfo) {

								String strConfig = deploySystemVerMap.get(strConfigId);
								if (configInfo == null) {
									configInfo = "";
								}
								if (configInfo.equals(strConfig)) {
									log.debug(String.format("部署系统[%1$s]接收到版本变化，但配置内容一致，忽略", deploySystem.getDeploySystemId()));
									logEvent(LogLevels.INFO, String.format("服务系统[%2$s@%1$s]接收到版本变化，但配置内容一致，忽略重新部署", getId(), deploySystem.getDeploySystemId()), deploySystem);
									return;
								}
								deploySystemVerMap.put(strConfigId, configInfo);
								log.debug(String.format("部署系统[%1$s]版本发生变化", deploySystem.getDeploySystemId()));
								logEvent(LogLevels.INFO, String.format("服务系统[%2$s@%1$s]接收到版本变化，重新部署", getId(), deploySystem.getDeploySystemId()), deploySystem);
								if (isInstalled()) {
									reloadDeploySystem(deploySystem, configInfo);

								} else {
									log.warn(String.format("服务总线未安装完成，忽略部署系统版本变化"));
								}
							}
						};
						this.addConfigListener(strConfigId, iConfigListener);
						this.deploySystemVerListenerMap.put(strConfigId, iConfigListener);
					}
				}
			}
		}

		// 部署需要的插件
		if (!ObjectUtils.isEmpty(this.requiredCloudUtilRuntimeMap)) {
			for (java.util.Map.Entry<Class<? extends ICloudUtilRuntime>, Class<?>> entry : this.requiredCloudUtilRuntimeMap.entrySet()) {
				this.getSysUtilRuntime(entry.getValue(), entry.getKey(), false);
			}
		}

		if (this.isEnableDebug() && this.getServiceHubSetting().isStartDebugger()) {
			this.startCloudDebugger();
		}

		// 监控服务总线配置
		if (this.getServiceHubSetting().isEnableReloadSystem() && !this.isEnableDebug()) {
			String strServiceHubVerId = String.format("%1$s%2$s-ver", NacosServiceHubSettingBase.DATAID_SERVICEHUB_PREFIX, getId());
			this.addConfigListener(strServiceHubVerId, new IConfigListener() {

				@Override
				public Executor getExecutor() {
					return null;
				}

				@Override
				public void receiveConfigInfo(String configInfo) {
					if (configInfo == null) {
						configInfo = "";
					}
					if (configInfo.equals(strServiceHubVerConfig)) {
						log.debug(String.format("服务总线[%1$s]接收到版本变化，但配置内容一致，忽略", getId()));
						logEvent(LogLevels.INFO, String.format("服务总线[%1$s]接收到版本变化，但配置内容一致，忽略重新部署", getId()));
						return;
					}
					strServiceHubVerConfig = configInfo;
					log.debug(String.format("服务总线[%1$s]版本发生变化", getId()));
					logEvent(LogLevels.INFO, String.format("服务总线[%1$s]接收到版本变化，重新部署", getId()));
					if (isInstalled()) {
						reloadServiceHub(configInfo);
					} else {
						log.warn(String.format("服务总线未安装完成，忽略配置版本变化"));
					}
				}
			});
		}
	}

	/**
	 * 准备Cloud环境插件服务
	 * 
	 * @throws Exception
	 */
	protected void prepareCloudPluginService() throws Exception {
		String cloudPluginServiceId = this.getServiceHubSetting().getCloudPluginServiceId();
		if (!StringUtils.hasLength(cloudPluginServiceId)) {
			log.warn(String.format("未指定Cloud插件服务标识，未启用插件服务"));
			return;
		}

		DeploySystem deploySystem = new DeploySystem();
		deploySystem.setDeploySystemId(cloudPluginServiceId);
		deploySystem.setModelPath(DEPLOYSYSYTEMMODELPATH_REMOTE);
		IPSSystemService iPSSystemService = null;
		try {
			iPSSystemService = this.getPSSystemService(deploySystem, true);
		} catch (Exception ex) {
			log.error(String.format("获取Cloud插件服务发生异常，%1$s", ex.getMessage()), ex);
		}

		if (iPSSystemService == null) {
			log.warn(String.format("Cloud插件服务[%1$s]无效，未启用插件服务", cloudPluginServiceId));
			return;
		}

		ICloudPluginService cloudPluginService = this.createCloudPluginService();
		cloudPluginService.init(iPSSystemService);
		this.setCloudPluginService(cloudPluginService);
	}

	protected ICloudPluginService createCloudPluginService() {
		return new CloudPluginService();
	}

	/**
	 * 启动Debugger
	 * 
	 * @throws Exception
	 */
	protected void startCloudDebugger() throws Exception {

		String strDebuggerCmd = this.getServiceHubSetting().getDebuggerCmd();
		if (!StringUtils.hasLength(strDebuggerCmd)) {
			// 自动构建mingl
			String strDebugTag = String.format("%1$s_%2$s", this.strIPAddress, this.port).replace(".", "_");

			strDebuggerCmd = String.format("java -Dibiz.debug.config.debugIpAddr=127.0.0.1:12345 -Dibiz.debug.mqttmessenger.serviceUrl=tcp://mqtt.ibizcloud.cn:31883 -Dibiz.debug.mqttmessenger.debugSystemTag=%1$s -jar /ibiztools/clouddebugger.jar", strDebugTag);
			log.debug(String.format("CloudDebugger command: %1$s", strDebuggerCmd));

		}

		Runtime.getRuntime().exec(strDebuggerCmd);
		log.info("CloudDebugger启动成功");
	}

	@Override
	public boolean isInstalled() {
		return this.bInstalled;
	}

	@Override
	public boolean isEnableServiceApp() {
		return this.getServiceHubSetting().isEnableServiceApp();
	}

	@Override
	public boolean isEnableServletApp() {
		return this.getServiceHubSetting().isEnableServletApp();
	}

	@Override
	public boolean isEnableDebug() {
		if (isEnableProdMode()) {
			return false;
		}
		return this.getServiceHubSetting().isEnableDebug();
	}

	@Override
	public boolean isEnableRTCodeMode() {
		return this.getServiceHubSetting().isEnableRTCodeMode();
	}

	@Override
	public boolean isEnableProdMode() {
		return this.getServiceHubSetting().isEnableProdMode();
	}

	@Override
	public int getWorkThreadCorePoolSize() {
		return this.getServiceHubSetting().getWorkThreadCorePoolSize();
	}

	@Override
	public int getWorkThreadMaximumPoolSize() {
		return this.getServiceHubSetting().getWorkThreadMaximumPoolSize();
	}

	@Override
	public int getWorkThreadBlockingQueueSize() {
		return this.getServiceHubSetting().getWorkThreadBlockingQueueSize();
	}

	@Override
	public boolean isConcurrentLoadSystemMergences() {
		return this.getServiceHubSetting().isConcurrentLoadSystemMergences();
	}

	@Override
	public String getServletAppBaseUrl() {
		return BASEURL_SERVLETAPP;
	}

	// @Override
	// public String getServiceAppBaseUrl() {
	// return BASEURL_PROXYAPP;
	// }

	@Override
	public ICloudPluginService getCloudPluginService() {
		return this.cloudPluginService;
	}

	/**
	 * 设置Cloud插件服务对象
	 * 
	 * @param cloudPluginService
	 */
	protected void setCloudPluginService(ICloudPluginService cloudPluginService) {
		this.cloudPluginService = cloudPluginService;
	}

	/**
	 * 准备忽略认证的路径集合
	 * 
	 * @throws Exception
	 */
	protected void registerIgnoreAuthPatterns() throws Exception {
		this.registerIgnoreAuthPattern("/swagger-ui/**");
		this.registerIgnoreAuthPattern("/swagger**/**");
		this.registerIgnoreAuthPattern("/webjars/**");
		this.registerIgnoreAuthPattern("/v3/**");
		if (isEnableServletApp()) {
			this.registerIgnoreAuthPattern(String.format("/%1$s/**", getServletAppBaseUrl()));
		}

	}

	protected javax.sql.DataSource registerDataSource(DataSource ds) throws Exception {
		throw new Exception("未提供注册动态数据源能力");
	}

	protected void unregisterDataSource(DataSource ds) throws Exception {
		throw new Exception("未提供注销动态数据源能力");
	}

	protected boolean containsDataSource(DataSource ds) throws Exception {
		throw new Exception("未提供判断是否存在动态数据源能力");
	}

	protected javax.sql.DataSource getDataSource(DataSource ds, boolean bTryMode) throws Exception {
		throw new Exception("未提供获取动态数据源能力");
	}

	protected ISystemRuntime registerDeploySystem(DeploySystem deploySystem) throws Exception {

		IPSSystemService iPSSystemService = null;
		V2DeploySystem v2DeploySystem = null;
		if (!DEPLOYSYSYTEMID_GATEWAY.equalsIgnoreCase(deploySystem.getDeploySystemId())) {

			v2DeploySystem = this.getV2DeploySystem(deploySystem);
			if (StringUtils.hasLength(deploySystem.getDebugModelPath())) {
				try {
					File folder = this.getDeploySystemModelFolder(deploySystem.getDeploySystemId(), deploySystem.getDebugModelPath());
					if (folder != null) {
						PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
						psModelServiceImpl.setPSModelFolderPath(folder.getCanonicalPath());
						long nLastModifiedTime = this.getLastModifiedTime(folder.getCanonicalPath());
						if (nLastModifiedTime > 0) {
							psModelServiceImpl.setModelDigest(KeyValueUtils.genUniqueId(Long.valueOf(nLastModifiedTime).toString()));
						} else {
							psModelServiceImpl.setModelDigest(KeyValueUtils.genUniqueId());
						}
						if (v2DeploySystem != null)
							installCloudSystemModel(v2DeploySystem, folder.getCanonicalPath());
						iPSSystemService = psModelServiceImpl;
						log.debug(String.format("部署系统[%1$s]使用调试模型[%2$s][%3$s]", deploySystem.getDeploySystemId(), deploySystem.getDebugModelPath(), folder.getCanonicalPath()));
					}

				} catch (Throwable ex) {
					log.error(String.format("部署系统[%1$s]获取调试模型[%2$s]发生异常，%3$s", deploySystem.getDeploySystemId(), deploySystem.getDebugModelPath(), ex.getMessage()), ex);
				}
			}

			if (v2DeploySystem != null) {
				if (deploySystem.getSettings() == null) {
					deploySystem.setSettings(new LinkedHashMap<String, Object>());
				}
				deploySystem.getSettings().put("v2deploysystem", v2DeploySystem);

				// 注册数据源
				List<V2DeploySystemDataSource> v2DeploySystemDataSourceList = v2DeploySystem.getDataSources();
				if (!ObjectUtils.isEmpty(v2DeploySystemDataSourceList)) {
					for (V2DeploySystemDataSource v2DeploySystemDataSource : v2DeploySystemDataSourceList) {
						if (!StringUtils.hasLength(v2DeploySystemDataSource.getDataSourceId())) {
							continue;
						}

						String strName = v2DeploySystemDataSource.getName();
						if (!StringUtils.hasLength(strName)) {
							continue;
						}

						DataSource dataSource = this.dataSourceMap.get(v2DeploySystemDataSource.getDataSourceId());
						if (dataSource == null) {
							V2DataSource v2DataSource = this.getV2DataSource(v2DeploySystemDataSource.getDataSourceId());
							dataSource = new DataSource();
							dataSource.setDataSourceId(v2DataSource.getId());
							dataSource.setDBType(v2DataSource.getType());
							dataSource.setJdbcUrl(v2DataSource.getUrl());
							dataSource.setUsername(v2DataSource.getUsername());
							dataSource.setPassword(v2DataSource.getPassword());
						}

						if (strName.indexOf("db.") == 0) {
							String strModelTag = strName.substring(3);
							deploySystem.getSettings().put(String.format("sysdbscheme.%1$s.datasourcetag", strModelTag), dataSource.getDataSourceId());
							if (StringUtils.hasLength(dataSource.getDBType())) {
								deploySystem.getSettings().put(String.format("sysdbscheme.%1$s.dbtype", strModelTag), dataSource.getDBType());
							}
							deploySystem.getSettings().put(String.format("sysdbscheme.%1$s.updateschema", strModelTag), DataTypeUtils.getBooleanValue(v2DeploySystemDataSource.getUpdateSchema(), true));
							if (DataSourceLink.DEFAULT.value.equalsIgnoreCase(strModelTag)) {
								deploySystem.getSettings().put(ISystemRuntimeSetting.PARAM_DEFAULTDBINSTTAG, dataSource.getDataSourceId());
							}
						}

						try {
							if (this.dataSourceMap.containsKey(v2DeploySystemDataSource.getDataSourceId())) {
								continue;
							}

							this.dataSourceMap.put(dataSource.getDataSourceId(), dataSource);
							this.registerDataSource(dataSource);
						} catch (Exception ex) {
							throw new Exception(String.format("注册数据源[%1$s]发生异常，%2$s", v2DeploySystemDataSource.getDataSourceId(), ex.getMessage()), ex);
						}
					}
				}
				if (iPSSystemService == null) {
					iPSSystemService = this.getPSSystemService(v2DeploySystem);
				}
			}
		}

		// 如系统中配置了主系统，设置入参数
		if (StringUtils.hasLength(deploySystem.getMainSystemId())) {
			deploySystem.getSettingsIf().put(IServiceSystemRuntime.PARAM_MAINSYSTEMID, deploySystem.getMainSystemId());
		}

		if (iPSSystemService == null) {
			iPSSystemService = this.getPSSystemService(deploySystem);
		}

		if (iPSSystemService != null) {
			if (!ObjectUtils.isEmpty(iPSSystemService.getPSSystem().getAllPSSysSFPlugins())) {
				for (IPSSysSFPlugin iPSSysSFPlugin : iPSSystemService.getPSSystem().getAllPSSysSFPlugins()) {
					if (iPSSysSFPlugin.isRuntimeObject() && iPSSysSFPlugin.getRTObjectSource() == PluginRTMode.REMOTE.value) {
						this.prepareRemotePlugin(iPSSysSFPlugin);
					}
				}
			}
		}

		// if (iPSSystemService == null) {
		// String strModelPath = deploySystem.getModelPath();
		// if (StringUtils.hasLength(strModelPath)) {
		// PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
		// psModelServiceImpl.setPSModelFolderPath(strModelPath);
		// iPSSystemService = psModelServiceImpl;
		// }
		// }

		boolean bMustRuntimeClass = (v2DeploySystem == null);
		String strRuntimeClassName = deploySystem.getRuntimeClassName();
		if (!StringUtils.hasLength(strRuntimeClassName) && iPSSystemService != null) {
			strRuntimeClassName = iPSSystemService.getPSSystem().getRTObjectName();
			if (StringUtils.hasLength(strRuntimeClassName)) {
				bMustRuntimeClass = true;
			}
		}

		ISystemRuntime iSystemRuntime = null;
		if (StringUtils.hasLength(strRuntimeClassName)) {
			try {
				iSystemRuntime = (ISystemRuntime) SysSFPluginRuntime.createObject(strRuntimeClassName);
			} catch (Throwable ex) {
				log.error(String.format("无法建立系统[%1$s]运行时对象[%2$s]", deploySystem.getDeploySystemId(), strRuntimeClassName));
				if (bMustRuntimeClass) {
					throw ex;
				}
			}
		}

		if (iSystemRuntime == null) {
			if (!ObjectUtils.isEmpty(deploySystem.getSettings())) {
				Object mainSystemId = deploySystem.getSettings().get(IServiceSystemRuntime.PARAM_MAINSYSTEMID);
				if (!ObjectUtils.isEmpty(mainSystemId)) {
					Object objMainSystemRuntime = deploySystem.getSettings().get(IServiceSystemRuntime.PARAM_MAINSYSTEMRUNTIME);
					if (objMainSystemRuntime instanceof IServiceSystemRuntime) {
						iSystemRuntime = ((IServiceSystemRuntime) objMainSystemRuntime).createAddinSystemRuntime(deploySystem);
					}
				}
			}

			if (iSystemRuntime == null) {
				if (DEPLOYSYSYTEMID_GATEWAY.equalsIgnoreCase(deploySystem.getDeploySystemId())) {
					iSystemRuntime = new HubSystemRuntime();
				} else {
					iSystemRuntime = new ServiceSystemRuntime();
				}
			}
		}

		// if (!ObjectUtils.isEmpty(deploySystem.getMergeSystems())) {
		// deploySystem.getSettingsIf().put(IServiceSystemRuntime.PARAM_MERGESYSTEMS,
		// deploySystem.getMergeSystems());
		// }

		// 设置系统是否支持更新数据库体系
		boolean bUpdateDBScheme = DataTypeUtils.getBooleanValue(deploySystem.getUpdateDBSchema(), false);
		deploySystem.getSettings().put(IServiceSystemRuntime.PARAM_UPDATEDBSCHEMA, bUpdateDBScheme);

		String strOSSFolder = deploySystem.getOSSFolder();
		deploySystem.getSettings().put(IServiceSystemRuntime.PARAM_OSSFOLDER, strOSSFolder);

		iSystemRuntime.init(getSystemGatewayContext(), iPSSystemService, deploySystem.getDeploySystemId(), deploySystem.getSettings());
		this.registerSystemRuntime(deploySystem, iSystemRuntime);

		return iSystemRuntime;
	}

	protected void prepareRemotePlugin(IPSSysSFPlugin iPSSysSFPlugin) throws Exception {

		String strUrl = String.format("%1$s/%2$s", this.getServiceHubSetting().getLibraryFolder(), iPSSysSFPlugin.getRTObjectRepo());
		File jarFile = new File(strUrl.replace("\\", "/"));
		if (!jarFile.exists()) {
			return;
		}

		Class<?> rtObjectClass = null;
		try {
			rtObjectClass = Class.forName(iPSSysSFPlugin.getRTObjectName());
			if (rtObjectClass != null) {
				return;
			}
		} catch (Exception ex) {
			if (!StringUtils.hasLength(iPSSysSFPlugin.getRTObjectRepo())) {
				throw ex;
			}
		}

		try {
			URLClassLoader child = (URLClassLoader) ClassLoader.getSystemClassLoader();
			Class<URLClassLoader> classLoaderClass = URLClassLoader.class;
			Method method = classLoaderClass.getDeclaredMethod("addURL", URL.class);
			method.setAccessible(true);
			method.invoke(child, jarFile.toURI().toURL());

			rtObjectClass = Class.forName(iPSSysSFPlugin.getRTObjectName());
			return;
		} catch (Exception ex) {
			throw new ModelException(iPSSysSFPlugin, String.format("系统后台插件[%1$s]指定组件[%2$s]加载发生异常，%3$s", iPSSysSFPlugin.getName(), iPSSysSFPlugin.getRTObjectName(), ex.getMessage()));
		}
	}

	protected String getDeploySystemModelPath() {
		if (!StringUtils.hasLength(this.strDeploySystemModelPath)) {
			String strPath = String.format("%1$s%2$sdeploysystem", this.getServiceHubSetting().getSystemModelFolder(), File.separator);
			File folder = new File(strPath);
			if (!folder.exists()) {
				folder.mkdirs();
			}
			this.strDeploySystemModelPath = strPath;
		}
		return this.strDeploySystemModelPath;
	}

	protected IPSSystemService getPSSystemService(DeploySystem deploySystem) throws Exception {
		return this.getPSSystemService(deploySystem, false);
	}

	protected IPSSystemService getPSSystemService(DeploySystem deploySystem, boolean tryMode) throws Exception {

		if (DEPLOYSYSYTEMID_GATEWAY.equalsIgnoreCase(deploySystem.getDeploySystemId())) {
			return null;
		}

		String strModelPath = deploySystem.getModelPath();
		if (!StringUtils.hasLength(strModelPath)) {
			return null;
		}

		if (DEPLOYSYSYTEMMODELPATH_BUILTIN.equals(strModelPath)) {
			return null;
		}

		if (strModelPath.indexOf(DEPLOYSYSYTEMMODELPATH_REMOTE) != 0) {
			PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
			psModelServiceImpl.setPSModelFolderPath(strModelPath);
			return psModelServiceImpl;
		}

		String strModelDigest = null;
		int nPos = strModelPath.indexOf(":");
		if (nPos > 0) {
			strModelDigest = strModelPath.substring(nPos + 1);
		}

		if (!StringUtils.hasLength(strModelDigest)) {
			// 获取系统模型路径
			ISysCloudClientUtilRuntime iSysCloudClientRuntime = this.getHubSystemRuntime(false).getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
			ICloudDevOpsClient iCloudDevOpsClient = iSysCloudClientRuntime.getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_DEVOPS).getProxyClient(ICloudDevOpsClient.class);
			strModelDigest = iCloudDevOpsClient.getSystemModelDigest(deploySystem.getDeploySystemId());
			if (!StringUtils.hasLength(strModelDigest)) {
				if (tryMode) {
					return null;
				}
				throw new Exception(String.format("未定义远程模型配置"));
			}
		}

		String[] items = strModelDigest.split("[|]");
		if (items.length < 2) {
			throw new Exception(String.format("远程模型配置不正确"));
		}

		String strFileId = items[1];
		// 判断本地路径是否存在
		String strDynaModelPath = String.format("%1$s%2$s%3$s", this.getDeploySystemModelPath(), File.separator, strFileId);
		if (this.getServiceHubSetting().isEnableModelSnapshot()) {
			strDynaModelPath = String.format("%1$s%2$s%3$s", strDynaModelPath, File.separator, KeyValueUtils.genUniqueId());
		}
		File systemModelFile = new File(strDynaModelPath + File.separator + "PSSYSTEM.json");
		if (!systemModelFile.exists()) {

			ISysFileUtilRuntime iSysFileUtilRuntime = this.getHubSystemRuntime(false).getSysUtilRuntime(ISysFileUtilRuntime.class, false);

			net.ibizsys.runtime.util.domain.File ossFile = iSysFileUtilRuntime.getOSSFile(strFileId, ICloudDevOpsUtilRuntime.OSSCAT_DYNAMODEL, true);
			if (ossFile == null) {
				ossFile = iSysFileUtilRuntime.getOSSFile(strFileId, null, true);
				if (ossFile == null) {
					throw new Exception(String.format("指定模型文件[%1$s]不存在", strFileId));
				}
			}
			File dynaModelFolder = new File(strDynaModelPath);
			if (!systemModelFile.exists()) {
				ZipUtils.unzip(new File(ossFile.getLocalPath()), dynaModelFolder);
			}
		}

		log.debug(String.format("系统[%1$s]使用远程模型[%2$s][%3$s]", deploySystem.getDeploySystemId(), strModelDigest, strDynaModelPath));

		String strOrginDynaModelPath = strDynaModelPath;
		if (this.getServiceHubSetting().isEnableMergeSystem()) {
			// 判断是否进行系统合并
			if (!ObjectUtils.isEmpty(deploySystem.getMergeSystems())) {
				List<DeploySystem> list = new ArrayList<DeploySystem>();
				for (String strMergeSystemId : deploySystem.getMergeSystems()) {
					DeploySystem mergeDeploySystem = new DeploySystem();
					mergeDeploySystem.setDeploySystemId(strMergeSystemId);
					mergeDeploySystem.setModelPath(DEPLOYSYSYTEMMODELPATH_REMOTE);
					File file = this.getDeploySystemModelFolder(mergeDeploySystem, false);
					mergeDeploySystem.setModelPath(file.getCanonicalPath());
					list.add(mergeDeploySystem);
					log.debug(String.format("合入系统[%1$s]模型[%2$s]", mergeDeploySystem.getDeploySystemId(), mergeDeploySystem.getModelPath()));
				}

				try {
					IHubSysExtensionUtilRuntime iHubSysExtensionUtilRuntime = this.getHubSystemRuntime(false).getSysUtilRuntime(IHubSysExtensionUtilRuntime.class, false);
					File mergeFile = iHubSysExtensionUtilRuntime.mergeDeploySystems(new File(strDynaModelPath), list, true);
					strDynaModelPath = mergeFile.getCanonicalPath();
				} catch (Exception ex) {
					throw new Exception(String.format("合并部署系统发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}

		V2DeploySystem v2DeploySystem = this.getV2DeploySystem(deploySystem);
		if (v2DeploySystem != null) {
			try {
				IHubSysExtensionUtilRuntime iHubSysExtensionUtilRuntime = this.getHubSystemRuntime(false).getSysUtilRuntime(IHubSysExtensionUtilRuntime.class, false);
				File mergeFile = iHubSysExtensionUtilRuntime.mergeV2DeploySystem(new File(strDynaModelPath), v2DeploySystem, true);
				strDynaModelPath = mergeFile.getCanonicalPath();
			} catch (Exception ex) {
				throw new Exception(String.format("合并V2部署系统发生异常，%1$s", ex.getMessage()), ex);
			}
		}

		PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
		psModelServiceImpl.setPSModelFolderPath(strDynaModelPath);
		psModelServiceImpl.setModelDigest(items[0]);
		if (!StringUtils.hasLength(psModelServiceImpl.getModelDigest())) {
			long nLastModifiedTime = this.getLastModifiedTime(strOrginDynaModelPath);
			if (nLastModifiedTime > 0) {
				psModelServiceImpl.setModelDigest(KeyValueUtils.genUniqueId(Long.valueOf(nLastModifiedTime).toString()));
			} else {
				psModelServiceImpl.setModelDigest(KeyValueUtils.genUniqueId());
			}
		}
		return psModelServiceImpl;
	}

	@Override
	public File getDeploySystemModelFolder(String strDeploySystemId, boolean tryMode) {
		try {
			DeploySystem deploySystem = new DeploySystem();
			String deploySystemConfig = ServiceHub.getInstance().getConfig(NacosServiceHubSetting.DATAID_DEPLOYSYSTEM_PREFIX + strDeploySystemId);
			if (StringUtils.hasLength(deploySystemConfig)) {
				Yaml yaml = new Yaml();
				Map map2 = yaml.loadAs(deploySystemConfig, Map.class);
				deploySystem.putAll(map2);
			}

			deploySystem.setDeploySystemId(strDeploySystemId);
			if (!StringUtils.hasLength(deploySystem.getModelPath())) {
				deploySystem.setModelPath(DEPLOYSYSYTEMMODELPATH_REMOTE);
			}

			return this.getDeploySystemModelFolder(deploySystem, tryMode);
		} catch (Throwable ex) {
			throw new SystemGatewayException(this, String.format("获取部署系统[%1$s]本地模型路径发生异常，%2$s", strDeploySystemId, ex.getMessage()), ex);
		}
	}

	/**
	 * 获取部署系统远程模型文件夹路径
	 * 
	 * @param deploySystem
	 * @param tryMode
	 * @return
	 * @throws Exception
	 */
	protected File getDeploySystemModelFolder(DeploySystem deploySystem, boolean tryMode) throws Exception {

		String strModelPath = deploySystem.getModelPath();
		if (!StringUtils.hasLength(strModelPath)) {
			if (tryMode) {
				return null;
			}
			throw new Exception(String.format("未定义系统模型路径"));
		}

		if (DEPLOYSYSYTEMMODELPATH_BUILTIN.equals(strModelPath)) {
			return null;
		}

		if (strModelPath.indexOf(DEPLOYSYSYTEMMODELPATH_REMOTE) != 0) {
			return new File(strModelPath);
		}

		String strModelDigest = null;
		int nPos = strModelPath.indexOf(":");
		if (nPos > 0) {
			strModelDigest = strModelPath.substring(nPos + 1);
		}

		if (!StringUtils.hasLength(strModelDigest)) {
			// 获取系统模型路径
			ISysCloudClientUtilRuntime iSysCloudClientRuntime = this.getHubSystemRuntime(false).getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
			ICloudDevOpsClient iCloudDevOpsClient = iSysCloudClientRuntime.getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_DEVOPS).getProxyClient(ICloudDevOpsClient.class);
			strModelDigest = iCloudDevOpsClient.getSystemModelDigest(deploySystem.getDeploySystemId());

			if (!StringUtils.hasLength(strModelDigest)) {
				if (tryMode) {
					return null;
				}
				throw new Exception(String.format("未定义远程模型配置"));
			}
		}

		String[] items = strModelDigest.split("[|]");
		if (items.length < 2) {
			throw new Exception(String.format("远程模型配置不正确"));
		}

		String strFileId = items[1];
		// 判断本地路径是否存在
		String strDynaModelPath = String.format("%1$s%2$s%3$s", this.getDeploySystemModelPath(), File.separator, strFileId);
		if (this.getServiceHubSetting().isEnableModelSnapshot()) {
			strDynaModelPath = String.format("%1$s%2$s%3$s", strDynaModelPath, File.separator, KeyValueUtils.genUniqueId());
		}

		File dynaModelFolder = new File(strDynaModelPath);
		File systemModelFile = new File(strDynaModelPath + File.separator + "PSSYSTEM.json");
		if (!systemModelFile.exists()) {

			ISysFileUtilRuntime iSysFileUtilRuntime = this.getHubSystemRuntime(false).getSysUtilRuntime(ISysFileUtilRuntime.class, false);

			net.ibizsys.runtime.util.domain.File ossFile = iSysFileUtilRuntime.getOSSFile(strFileId, ICloudDevOpsUtilRuntime.OSSCAT_DYNAMODEL, true);
			if (ossFile == null) {
				ossFile = iSysFileUtilRuntime.getOSSFile(strFileId, null, true);
				if (ossFile == null) {
					throw new Exception(String.format("指定模型文件[%1$s]不存在", strFileId));
				}
			}

			if (!systemModelFile.exists()) {
				ZipUtils.unzip(new File(ossFile.getLocalPath()), dynaModelFolder);
			}
		}
		return dynaModelFolder;
	}

	protected IPSSystemService getPSSystemService(V2DeploySystem v2DeploySystem) throws Exception {

		if (StringUtils.hasLength(v2DeploySystem.getOssFile())) {
			String strFileId = v2DeploySystem.getOssFile();
			// 判断本地路径是否存在
			String strDynaModelPath = String.format("%1$s%2$s%3$s", this.getDeploySystemModelPath(), File.separator, strFileId);
			if (this.getServiceHubSetting().isEnableModelSnapshot()) {
				strDynaModelPath = String.format("%1$s%2$s%3$s", strDynaModelPath, File.separator, KeyValueUtils.genUniqueId());
			}

			File systemModelFile = new File(strDynaModelPath + File.separator + "PSSYSTEM.json");
			if (!systemModelFile.exists()) {

				ISysFileUtilRuntime iSysFileUtilRuntime = this.getHubSystemRuntime(false).getSysUtilRuntime(ISysFileUtilRuntime.class, false);

				net.ibizsys.runtime.util.domain.File ossFile = iSysFileUtilRuntime.getOSSFile(strFileId, ISysExtensionUtilRuntime.OSSCAT_DYNAMODEL, true);
				if (ossFile == null) {
					ossFile = iSysFileUtilRuntime.getOSSFile(strFileId, null, true);
					if (ossFile == null) {
						throw new Exception(String.format("指定远程模型文件[%1$s]不存在", strFileId));
					}
				}
				File dynaModelFolder = new File(strDynaModelPath);
				if (!systemModelFile.exists()) {
					ZipUtils.unzip(new File(ossFile.getLocalPath()), dynaModelFolder);
				}
			}

			log.debug(String.format("系统[%1$s]使用远程模型[%2$s][%3$s]", v2DeploySystem.getId(), v2DeploySystem.getOssFile(), strDynaModelPath));

			// 备份原来的模型路径
			String strOrginDynaModelPath = strDynaModelPath;

			try {
				IHubSysExtensionUtilRuntime iHubSysExtensionUtilRuntime = this.getHubSystemRuntime(false).getSysUtilRuntime(IHubSysExtensionUtilRuntime.class, false);
				File mergeFile = iHubSysExtensionUtilRuntime.mergeV2DeploySystem(new File(strDynaModelPath), v2DeploySystem, true);
				strDynaModelPath = mergeFile.getCanonicalPath();
			} catch (Exception ex) {
				throw new Exception(String.format("合并V2部署系统发生异常，%1$s", ex.getMessage()), ex);
			}

			PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
			psModelServiceImpl.setPSModelFolderPath(strDynaModelPath);
			psModelServiceImpl.setModelDigest(v2DeploySystem.getOssFileDigest());
			if (!StringUtils.hasLength(psModelServiceImpl.getModelDigest())) {
				long nLastModifiedTime = this.getLastModifiedTime(strOrginDynaModelPath);
				if (nLastModifiedTime > 0) {
					psModelServiceImpl.setModelDigest(KeyValueUtils.genUniqueId(Long.valueOf(nLastModifiedTime).toString()));
				} else {
					psModelServiceImpl.setModelDigest(KeyValueUtils.genUniqueId());
				}
			}
			installCloudSystemModel(v2DeploySystem, strDynaModelPath);
			return psModelServiceImpl;
		}

		if (StringUtils.hasLength(v2DeploySystem.getHttpUrlToRepo())) {

			String strHttpUrlToRepo = v2DeploySystem.getHttpUrlToRepo();
			if (StringUtils.hasLength(v2DeploySystem.getDefaultBranch())) {
				if (strHttpUrlToRepo.indexOf("#") == -1) {
					strHttpUrlToRepo = strHttpUrlToRepo + "#" + v2DeploySystem.getDefaultBranch();
				}
			}

			File folder = this.getDeploySystemModelFolder(v2DeploySystem.getId(), strHttpUrlToRepo, false);
			if (folder != null) {
				log.debug(String.format("系统[%1$s]使用远程模型[%2$s][%3$s]", v2DeploySystem.getId(), strHttpUrlToRepo, folder.getCanonicalPath()));

				String strOrginDynaModelPath = folder.getCanonicalPath();

				try {
					IHubSysExtensionUtilRuntime iHubSysExtensionUtilRuntime = this.getHubSystemRuntime(false).getSysUtilRuntime(IHubSysExtensionUtilRuntime.class, false);
					folder = iHubSysExtensionUtilRuntime.mergeV2DeploySystem(folder, v2DeploySystem, true);
				} catch (Exception ex) {
					throw new Exception(String.format("合并V2部署系统发生异常，%1$s", ex.getMessage()), ex);
				}

				PSModelServiceImpl psModelServiceImpl = new PSModelServiceImpl();
				psModelServiceImpl.setPSModelFolderPath(folder.getCanonicalPath());
				long nLastModifiedTime = this.getLastModifiedTime(strOrginDynaModelPath);
				if (nLastModifiedTime > 0) {
					psModelServiceImpl.setModelDigest(KeyValueUtils.genUniqueId(Long.valueOf(nLastModifiedTime).toString()));
				} else {
					psModelServiceImpl.setModelDigest(KeyValueUtils.genUniqueId());
				}
				installCloudSystemModel(v2DeploySystem, folder.getCanonicalPath());
				return psModelServiceImpl;
			}
		}
		return null;
	}

	protected void installCloudSystemModel(V2DeploySystem v2DeploySystem, String strPSModelFolderPath) throws Exception {

		String strConfigId = String.format("systemsource-%1$s", v2DeploySystem.getId()).toLowerCase();
		String strConfig = ServiceHub.getInstance().getConfig(strConfigId);
		ConfigEntity configEntity = new ConfigEntity(strConfig);

		String strOSSFileId = configEntity.getString("modelossid", null);
		String strHttpUrlToRepo = configEntity.getString("httpurltorepo", null);
		String strFileHashCode = configEntity.getString("modeldigest", null);
		if (StringUtils.hasLength(v2DeploySystem.getOssFile())) {
			if (v2DeploySystem.getOssFile().equals(strOSSFileId)) {
				return;
			}

			strOSSFileId = v2DeploySystem.getOssFile();
		} else {
			if (!StringUtils.hasLength(v2DeploySystem.getHttpUrlToRepo())) {
				log.warn("未定义部署系统远程模型路径");
				return;
			}

			if (v2DeploySystem.getHttpUrlToRepo().indexOf(".zip") != -1 && v2DeploySystem.getHttpUrlToRepo().equals(strHttpUrlToRepo)) {
				return;
			}

			strHttpUrlToRepo = v2DeploySystem.getHttpUrlToRepo();

			File tempFile = File.createTempFile("model_" + v2DeploySystem.getId(), ".zip");
			ZipUtils.zip(new File(strPSModelFolderPath), tempFile);
			try (FileInputStream fis = new FileInputStream(tempFile)) {
				String strFileHashCode2 = DigestUtils.md5DigestAsHex(fis);
				if (strFileHashCode2.equals(strFileHashCode)) {
					return;
				}
				strFileHashCode = strFileHashCode2;
			}
			;

			// 上传文件
			ISysFileUtilRuntime iSysFileUtilRuntime = this.getHubSystemRuntime(false).getSysUtilRuntime(ISysFileUtilRuntime.class, false);
			net.ibizsys.runtime.util.domain.File ossFile = iSysFileUtilRuntime.createOSSFile(tempFile, ICloudDevOpsUtilRuntime.OSSCAT_DYNAMODEL);
			strOSSFileId = ossFile.getOSSId();
		}

		// 写入远程配置
		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("modelossid", strOSSFileId);
		if (StringUtils.hasLength(strHttpUrlToRepo)) {
			map.put("httpurltorepo", strHttpUrlToRepo);
		}
		if (StringUtils.hasLength(strFileHashCode)) {
			map.put("modeldigest", strFileHashCode);
		}

		ServiceHub.getInstance().publishConfig(strConfigId, map);
		invokeCloudDevOpsPubCode(v2DeploySystem);

	}

	protected void invokeCloudDevOpsPubCode(V2DeploySystem v2DeploySystem) throws Exception {
		ISysCloudClientUtilRuntime iSysCloudClientRuntime = this.getHubSystemRuntime(false).getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
		ICloudDevOpsClient iCloudDevOpsClient = iSysCloudClientRuntime.getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_DEVOPS).getProxyClient(ICloudDevOpsClient.class);
		iCloudDevOpsClient.invokeDevCallback(v2DeploySystem.getId(), "PUBCODE", "token");
	}

	protected File getDeploySystemModelFolder(String systemId, String strHttpUrlToRepo) throws Exception {
		return this.getDeploySystemModelFolder(systemId, strHttpUrlToRepo, true);
	}

	protected File getDeploySystemModelFolder(String systemId, String strHttpUrlToRepo, boolean bDebugModelPath) throws Exception {

		if (!StringUtils.hasLength(strHttpUrlToRepo)) {
			throw new Exception("未传入仓库路径");
		}

		String strOriginHttpUrlToRepo = strHttpUrlToRepo;
		boolean bGitMode = true;
		String strSubFolder = null;
		String strSystemPath = systemId;

		String[] parts = strHttpUrlToRepo.split("[#]");
		if (parts.length == 2) {
			strHttpUrlToRepo = parts[0];
			strSubFolder = parts[1];
		}

		String[] items = strHttpUrlToRepo.split("[/]");
		String strLastItem = items[items.length - 1];
		// int nPos = strLastItem.lastIndexOf(".zip");
		// if(nPos != -1 && (nPos == strLastItem.length() - 4)) {
		// strSystemPath = strLastItem.substring(0, nPos);
		// }
		int nPos = strLastItem.lastIndexOf(".git");
		if (nPos != -1 && (nPos == strLastItem.length() - 4)) {
			strSystemPath = strLastItem.substring(0, nPos);
		} else {
			bGitMode = false;
			nPos = strLastItem.lastIndexOf(".zip");
			if (nPos != -1 && (nPos == strLastItem.length() - 4)) {
				strSystemPath = strLastItem.substring(0, nPos);
			}
		}

		if (bGitMode) {
			if (!isEnableProdMode()) {
				log.warn(String.format("非生产模式忽略GIT模式"));
				return null;
			}
		}

		String strBranch = null;
		String strFilePath = String.format("%1$s%2$s%3$s%2$s%4$s%2$s%5$s", this.getDeploySystemModelPath(), File.separator, "systemsources4", systemId, strSystemPath);
		if (bGitMode) {
			strBranch = strSubFolder;
			if (!StringUtils.hasLength(strBranch)) {
				strBranch = "master";
			}
			strFilePath += String.format("%1$s%2$s", File.separator, strBranch);
		}
		File file = new File(strFilePath);
		String strPath = file.getCanonicalPath();
		if (bGitMode) {
			// 放入Debug模型路径监控Map
			if (bDebugModelPath) {
				this.debugModelPathMap.put(systemId, strOriginHttpUrlToRepo);
			}

			String strGitPath = strHttpUrlToRepo;

			String strGitUserName = null;
			String strGitPassword = null;

			try {
				if (file.exists()) {
					try (FileRepository fr = new FileRepository(new File(String.format("%1$s%2$s.git", strPath, File.separator))); Git git = new Git(fr)) {
						try {
							boolean hasLocalChanges = git.status().call().hasUncommittedChanges();
							if (hasLocalChanges) {
								git.clean().setForce(true).setCleanDirectories(true).call();
							}
						} catch (Throwable ex) {
							log.error(ex);
						}
						PullCommand pullCommand = git.pull().setRemoteBranchName(strBranch);
						if (StringUtils.hasLength(strGitUserName)) {
							if (StringUtils.hasLength(strGitPassword)) {
								pullCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(strGitUserName, strGitPassword));
							} else {
								pullCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(strGitUserName, ""));
							}
						}
						pullCommand.call();
					}

				} else {
					file.mkdirs();
					try {
						CloneCommand cloneCommand = Git.cloneRepository().setURI(strGitPath).setDirectory(file).setBranch(strBranch);
						if (StringUtils.hasLength(strGitUserName)) {
							if (StringUtils.hasLength(strGitPassword)) {
								cloneCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(strGitUserName, strGitPassword));
							} else {
								cloneCommand.setCredentialsProvider(new UsernamePasswordCredentialsProvider(strGitUserName, ""));
							}
						}
						cloneCommand.call();
					} catch (Throwable ex) {
						file.delete();
						throw ex;
					}
				}
			} catch (Throwable ex) {
				if (ex instanceof WrongRepositoryStateException || ex instanceof CheckoutConflictException) {
					log.error(String.format("Git仓库状态异常，%1$s。执行清除目录操作[%2$s]", ex.getMessage(), file.getCanonicalPath()));
					FileUtils.deleteDirectory(file);
				}

				throw new Exception(String.format("签出Git项目发生异常，%1$s", ex.getMessage()), ex);
			}
		} else {
			if (!file.exists()) {
				// 目前仅支持ZIP模式
				File tempFile = File.createTempFile("resource", ".zip");
				try {
					this.getHubSystemRuntime().getDefaultWebClient().download(strHttpUrlToRepo, tempFile);
				} catch (Throwable ex) {
					throw new Exception(String.format("下载文件发生异常，%1$s", ex.getMessage()), ex);
				}

				ZipUtils.unzip(tempFile, file);
			}

			if (StringUtils.hasLength(strSubFolder)) {
				file = new File(file.getAbsolutePath() + File.separator + strSubFolder);
				strPath = file.getCanonicalPath();
			}
		}

		File modelFile = new File(String.format("%1$s%2$sibizmodel.yaml", strPath, File.separator));
		if (modelFile.exists()) {
			// 从配置文件中提取目录
			try {
				Yaml yaml = new Yaml();
				Map config = yaml.loadAs(new FileInputStream(modelFile), Map.class);
				if (config != null) {
					String strModelFolder = (String) config.get("modelfolder");
					if (StringUtils.hasLength(strModelFolder)) {
						if (bGitMode) {
							if (bDebugModelPath) {
								this.debugModelPathTimestampMap.put(systemId, this.getLastModifiedTime(strPath + File.separator + strModelFolder));
							}
						}
						return new File(strPath + File.separator + strModelFolder);
					}
				}
			} catch (Throwable ex) {
				log.error(String.format("加载系统模型配置发生异常，%1$s", ex.getMessage()), ex);
				throw new Exception(String.format("加载系统模型配置发生异常，%1$s", ex.getMessage()), ex);
			}
		}

		File systemModelFile = new File(strPath + File.separator + "PSSYSTEM.json");
		if (systemModelFile.exists()) {
			if (bGitMode) {
				if (bDebugModelPath) {
					this.debugModelPathTimestampMap.put(systemId, this.getLastModifiedTime(strPath));
				}
			}
			return file;
		}

		throw new Exception(String.format("系统模型文件不存在"));
	}

	protected void registerSystemRuntime(DeploySystem deploySystem, ISystemRuntime iSystemRuntime) throws Exception {
		String strDeploySystemId = deploySystem.getDeploySystemId();
		this.registerSystemRuntime(strDeploySystemId, iSystemRuntime);

		if (!DEPLOYSYSYTEMID_GATEWAY.equalsIgnoreCase(strDeploySystemId)) {
			boolean bEnableServiceHubAPI = true;
			if (iSystemRuntime instanceof IServiceSystemRuntime) {
				bEnableServiceHubAPI = ((IServiceSystemRuntime) iSystemRuntime).isEnableServiceHubAPI();
			}

			if (bEnableServiceHubAPI) {
				String strServiceName = String.format("%1$s-%2$s", "servicehub", iSystemRuntime.getDeploySystemId());
				this.registerNamingService(strServiceName);
			}
		}

		// 注册数据源
		registerDataSources(deploySystem, iSystemRuntime);

		// 安装数据
		String strInstallData = DataTypeUtils.getStringValue(deploySystem.getInstallData(), ISysUtilRuntimeBase.INSTALLDATAMODE_DEFAULT);
		if (StringUtils.hasLength(strInstallData)) {
			if (!strInstallData.equalsIgnoreCase("FALSE")) {
				iSystemRuntime.installData(strInstallData);
			}
		}

		// 注册服务
		registerServiceAPIRequestMapping(deploySystem, iSystemRuntime);
		// 注册应用
		if (isEnableServletApp()) {
			registerServletAppRequestMapping(deploySystem, iSystemRuntime);
		}
		if (isEnableServiceApp()) {
			registerServiceAppRequestMapping(deploySystem, iSystemRuntime);
		}

		// 注册应用网关路由
		registerAppGatewayRoutes(deploySystem, iSystemRuntime);

		if (log.isDebugEnabled()) {
			log.debug(String.format("系统[%1$s]已经注册", strDeploySystemId));
			this.outputMemoryUsage();
		}
	}

	@Override
	public void registerSystemRuntime(String strDeploySystemId, ISystemRuntime iSystemRuntime) throws Exception {
		super.registerSystemRuntime(strDeploySystemId, iSystemRuntime);
		if (this.getServiceHubFilter() == null) {
			this.setServiceHubFilter(iSystemRuntime.getSysUtilRuntime(IServiceHubFilter.class, true));
		}

		if (DEPLOYSYSYTEMID_GATEWAY.equalsIgnoreCase(strDeploySystemId)) {
			if (iSystemRuntime instanceof IHubSystemRuntime) {
				this.setHubSystemRuntime((IHubSystemRuntime) iSystemRuntime);
			}
		}
	}

	protected void registerServiceAPIRequestMapping(DeploySystem deploySystem, ISystemRuntime iSystemRuntime) throws Exception {
		if (this.getRequestMappingHandlerMapping() == null) {
			log.warn(String.format("接口请求映射处理对象无效"));
			return;
		}

		java.util.List<IPSSysServiceAPI> psSysServiceAPIs = iSystemRuntime.getPSSystem().getAllPSSysServiceAPIs();
		if (psSysServiceAPIs != null) {
			for (IPSSysServiceAPI iPSSysServiceAPI : psSysServiceAPIs) {

				ISysServiceAPIRuntime iSysServiceAPIRuntime = iSystemRuntime.getSysServiceAPIRuntime(iPSSysServiceAPI.getCodeName(), true);
				if (iSysServiceAPIRuntime == null) {
					log.warn(String.format("系统[%1$s]服务接口[%2$s]运行时对象无效，忽略请求处理映射", deploySystem.getDeploySystemId(), iPSSysServiceAPI.getName()));
					continue;
				}

				ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter = getSysServiceAPIRequestMappingAdapter(iSysServiceAPIRuntime);
				if (iSysServiceAPIRequestMappingAdapter == null) {
					continue;
				}

				if (iSysServiceAPIRuntime instanceof net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime) {
					((net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime) iSysServiceAPIRuntime).registerMapping(iSysServiceAPIRequestMappingAdapter);
				} else {
					iSysServiceAPIRequestMappingAdapter.registerMapping(iSysServiceAPIRuntime);
				}

				// 注册服务
				String strServiceName = String.format("%1$s-%2$s", iSystemRuntime.getDeploySystemId(), iPSSysServiceAPI.getCodeName()).toLowerCase();
				this.registerNamingService(strServiceName);
			}
		}
	}

	protected void registerServletAppRequestMapping(DeploySystem deploySystem, ISystemRuntime iSystemRuntime) throws Exception {

		String prefix = String.format("/%1$s/", this.getServletAppBaseUrl());

		java.util.List<IPSApplication> psApplications = iSystemRuntime.getPSSystem().getAllPSApps();
		if (psApplications != null) {
			for (IPSApplication iPSApplication : psApplications) {

				IApplicationRuntime iApplicationRuntime = iSystemRuntime.getApplicationRuntime(iPSApplication.getCodeName(), true);
				if (iApplicationRuntime == null) {
					log.warn(String.format("系统[%1$s]前端应用[%2$s]运行时对象无效，忽略请求处理映射", deploySystem.getDeploySystemId(), iPSApplication.getName()));
					continue;
				}

				if (!(iApplicationRuntime instanceof IServletAppRuntime)) {
					continue;
				}

				// log.info(String.format("系统[%1$s]前端应用[%2$s]运行时对象类型不支持，忽略请求处理映射",
				// deploySystem.getDeploySystemId(), iPSApplication.getName()));

				IServletAppRuntime iServletAppRuntime = (IServletAppRuntime) iApplicationRuntime;
				String url = iServletAppRuntime.getBaseUrl();
				if (url.indexOf(prefix) != 0) {
					log.warn(String.format("系统[%1$s]前端应用[%2$s]服务前缀[%3$s]不一致，忽略注册", deploySystem.getDeploySystemId(), iApplicationRuntime.getName(), url));
					continue;
				}

				url = url.substring(prefix.length());
				servletAppRuntimeMap.put(url + "/**", iServletAppRuntime);

				// 注册服务
				String strServiceName = String.format("%1$s-app-%2$s", iSystemRuntime.getDeploySystemId(), iPSApplication.getCodeName()).toLowerCase();
				this.registerNamingService(strServiceName);
			}
		}
	}

	protected void registerServiceAppRequestMapping(DeploySystem deploySystem, ISystemRuntime iSystemRuntime) throws Exception {
		if (this.getRequestMappingHandlerMapping() == null) {
			log.warn(String.format("接口请求映射处理对象无效"));
			return;
		}

		// String prefix = String.format("/%1$s/", this.getServiceAppBaseUrl());

		java.util.List<IPSApplication> psApplications = iSystemRuntime.getPSSystem().getAllPSApps();
		if (psApplications != null) {
			for (IPSApplication iPSApplication : psApplications) {

				IApplicationRuntime iApplicationRuntime = iSystemRuntime.getApplicationRuntime(iPSApplication.getCodeName(), true);
				if (iApplicationRuntime == null) {
					continue;
				}

				// log.warn(String.format("系统[%1$s]前端应用[%2$s]运行时对象无效，忽略请求处理映射",
				// deploySystem.getDeploySystemId(), iPSApplication.getName()));

				if (!(iApplicationRuntime instanceof IServiceAppRuntime)) {
					// log.warn(String.format("系统[%1$s]前端应用[%2$s]运行时对象类型不支持，忽略请求处理映射",
					// deploySystem.getDeploySystemId(),
					// iPSApplication.getName()));
					continue;
				}

				IServiceAppRuntime iServiceAppRuntime = (IServiceAppRuntime) iApplicationRuntime;
				// String url = iServiceAppRuntime.getBaseUrl();
				// if (url.indexOf(prefix) != 0) {
				// log.warn(String.format("系统[%1$s]前端应用[%2$s]服务前缀[%3$s]不一致，忽略注册",
				// deploySystem.getDeploySystemId(),
				// iApplicationRuntime.getName(), url));
				// continue;
				// }

				ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter = this.getApplicationRequestMappingAdapter(iServiceAppRuntime);
				iServiceAppRuntime.registerMapping(iSysServiceAPIRequestMappingAdapter);

				// 注册服务
				String strServiceName = String.format("%1$s-app-%2$s", iSystemRuntime.getDeploySystemId(), iPSApplication.getCodeName()).toLowerCase();
				this.registerNamingService(strServiceName);
			}
		}
	}

	protected void unregisterSystemRuntime(DeploySystem deploySystem, ISystemRuntime iSystemRuntime) throws Exception {
		String strDeploySystemId = deploySystem.getDeploySystemId();
		if (DEPLOYSYSYTEMID_GATEWAY.equalsIgnoreCase(strDeploySystemId)) {
			throw new Exception(String.format("无法注销[%1$s]系统运行时", strDeploySystemId));
		}

		try {
			unregisterServiceAPIRequestMapping(deploySystem, iSystemRuntime);
		} catch (Throwable ex) {
			log.error(String.format("注销服务接口路径映射发生异常，%1$s", ex.getMessage()), ex);
		}

		try {
			if (this.isEnableServletApp()) {
				unregisterServletAppRequestMapping(deploySystem, iSystemRuntime);
			}
		} catch (Throwable ex) {
			log.error(String.format("注销前端应用路径映射发生异常，%1$s", ex.getMessage()), ex);
		}

		try {
			if (this.isEnableServiceApp()) {
				unregisterServiceAppRequestMapping(deploySystem, iSystemRuntime);
			}
		} catch (Throwable ex) {
			log.error(String.format("注销前端应用路径映射发生异常，%1$s", ex.getMessage()), ex);
		}

		try {
			boolean bEnableServiceHubAPI = true;
			if (iSystemRuntime instanceof IServiceSystemRuntime) {
				bEnableServiceHubAPI = ((IServiceSystemRuntime) iSystemRuntime).isEnableServiceHubAPI();
			}

			if (bEnableServiceHubAPI) {
				String strServiceName = String.format("%1$s-%2$s", "servicehub", iSystemRuntime.getDeploySystemId());
				this.unregisterNamingService(strServiceName);
			}
		} catch (Throwable ex) {
			log.error(String.format("注销系统命名服务发生异常，%1$s", ex.getMessage()), ex);
		}

		this.unregisterSystemRuntime(strDeploySystemId, iSystemRuntime);

		// 注销数据源
		// unregisterDataSources(deploySystem, iSystemRuntime);
		// 注销服务

		// 注销应用网关路由
		// unregisterAppGatewayRoutes(deploySystem, iSystemRuntime);

		System.gc();
		if (log.isDebugEnabled()) {
			log.debug(String.format("系统[%1$s]已经注销", strDeploySystemId));
			this.outputMemoryUsage();
		}
	}

	protected void unregisterSystemRuntime(String strDeploySystemId, ISystemRuntime iSystemRuntime) throws Exception {
		if (iSystemRuntime instanceof IServiceSystemRuntime) {
			((IServiceSystemRuntime) iSystemRuntime).shutdown();
		}
		super.unregisterSystemRuntime(strDeploySystemId);
	}

	protected void unregisterServiceAPIRequestMapping(DeploySystem deploySystem, ISystemRuntime iSystemRuntime) throws Exception {
		if (this.getRequestMappingHandlerMapping() == null) {
			log.warn(String.format("接口请求映射处理对象无效"));
			return;
		}

		java.util.List<IPSSysServiceAPI> psSysServiceAPIs = iSystemRuntime.getPSSystem().getAllPSSysServiceAPIs();
		if (psSysServiceAPIs != null) {
			for (IPSSysServiceAPI iPSSysServiceAPI : psSysServiceAPIs) {

				ISysServiceAPIRuntime iSysServiceAPIRuntime = iSystemRuntime.getSysServiceAPIRuntime(iPSSysServiceAPI.getCodeName(), true);
				if (iSysServiceAPIRuntime == null) {
					log.warn(String.format("系统[%1$s]服务接口[%2$s]运行时对象无效，忽略请求处理映射", deploySystem.getDeploySystemId(), iPSSysServiceAPI.getName()));
					continue;
				}

				ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter = getSysServiceAPIRequestMappingAdapter(iSysServiceAPIRuntime);
				if (iSysServiceAPIRequestMappingAdapter == null) {
					continue;
				}

				if (iSysServiceAPIRuntime instanceof net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime) {
					((net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime) iSysServiceAPIRuntime).unregisterMapping(iSysServiceAPIRequestMappingAdapter);
				} else {
					iSysServiceAPIRequestMappingAdapter.unregisterMapping(iSysServiceAPIRuntime);
				}

				// 注销服务
				String strServiceName = String.format("%1$s-%2$s", iSystemRuntime.getDeploySystemId(), iPSSysServiceAPI.getCodeName()).toLowerCase();
				this.unregisterNamingService(strServiceName);
			}
		}
	}

	protected void unregisterServletAppRequestMapping(DeploySystem deploySystem, ISystemRuntime iSystemRuntime) throws Exception {

		String prefix = String.format("/%1$s/", this.getServletAppBaseUrl());
		java.util.List<IPSApplication> psApplications = iSystemRuntime.getPSSystem().getAllPSApps();
		if (psApplications != null) {
			for (IPSApplication iPSApplication : psApplications) {

				IApplicationRuntime iApplicationRuntime = iSystemRuntime.getApplicationRuntime(iPSApplication.getCodeName(), true);
				if (iApplicationRuntime == null) {
					log.warn(String.format("系统[%1$s]前端应用[%2$s]运行时对象无效，忽略请求处理映射", deploySystem.getDeploySystemId(), iPSApplication.getName()));
					continue;
				}

				if (!(iApplicationRuntime instanceof IServletAppRuntime)) {
					// log.warn(String.format("系统[%1$s]前端应用[%2$s]运行时对象类型不支持，忽略请求处理映射",
					// deploySystem.getDeploySystemId(),
					// iPSApplication.getName()));
					continue;
				}

				IServletAppRuntime iServletAppRuntime = (IServletAppRuntime) iApplicationRuntime;

				String url = iServletAppRuntime.getBaseUrl();
				if (url.indexOf(prefix) != 0) {
					log.warn(String.format("系统[%1$s]前端应用[%2$s]服务前缀[%3$s]不一致，忽略注销", deploySystem.getDeploySystemId(), iApplicationRuntime.getName(), url));
					continue;
				}

				url = url.substring(prefix.length());

				servletAppRuntimeMap.remove(url + "/**", iServletAppRuntime);

				// 注销
				String strServiceName = String.format("%1$s-app-%2$s", iSystemRuntime.getDeploySystemId(), iPSApplication.getCodeName()).toLowerCase();
				this.unregisterNamingService(strServiceName);
			}
		}
	}

	protected void unregisterServiceAppRequestMapping(DeploySystem deploySystem, ISystemRuntime iSystemRuntime) throws Exception {

		if (this.getRequestMappingHandlerMapping() == null) {
			log.warn(String.format("接口请求映射处理对象无效"));
			return;
		}

		// String prefix = String.format("/%1$s/", this.getServiceAppBaseUrl());
		java.util.List<IPSApplication> psApplications = iSystemRuntime.getPSSystem().getAllPSApps();
		if (psApplications != null) {
			for (IPSApplication iPSApplication : psApplications) {

				IApplicationRuntime iApplicationRuntime = iSystemRuntime.getApplicationRuntime(iPSApplication.getCodeName(), true);
				if (iApplicationRuntime == null) {
					log.warn(String.format("系统[%1$s]前端应用[%2$s]运行时对象无效，忽略请求处理映射", deploySystem.getDeploySystemId(), iPSApplication.getName()));
					continue;
				}

				if (!(iApplicationRuntime instanceof IServiceAppRuntime)) {
					// log.warn(String.format("系统[%1$s]前端应用[%2$s]运行时对象类型不支持，忽略请求处理映射",
					// deploySystem.getDeploySystemId(),
					// iPSApplication.getName()));
					continue;
				}

				IServiceAppRuntime iServiceAppRuntime = (IServiceAppRuntime) iApplicationRuntime;
				// String url = iServiceAppRuntime.getBaseUrl();
				// if (url.indexOf(prefix) != 0) {
				// log.warn(String.format("系统[%1$s]前端应用[%2$s]服务前缀[%3$s]不一致，忽略注册",
				// deploySystem.getDeploySystemId(),
				// iApplicationRuntime.getName(), url));
				// continue;
				// }

				ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter = this.getApplicationRequestMappingAdapter(iServiceAppRuntime);
				iServiceAppRuntime.unregisterMapping(iSysServiceAPIRequestMappingAdapter);

				// 注销
				String strServiceName = String.format("%1$s-app-%2$s", iSystemRuntime.getDeploySystemId(), iPSApplication.getCodeName()).toLowerCase();
				this.unregisterNamingService(strServiceName);
			}
		}
	}

	protected ISysServiceAPIRequestMappingAdapter getSysServiceAPIRequestMappingAdapter(ISysServiceAPIRuntime iSysServiceAPIRuntime) throws Exception {
		if (this.iSysServiceAPIRequestMappingAdapter == null) {
			StandardSysServiceAPIRequestMappingAdapter standardSysServiceAPIRequestMappingAdapter = new StandardSysServiceAPIRequestMappingAdapter();
			standardSysServiceAPIRequestMappingAdapter.init(this.getSystemGatewayContext(), this.getRequestMappingHandlerMapping(), this.getSysServiceAPIDocAdapter());
			this.iSysServiceAPIRequestMappingAdapter = standardSysServiceAPIRequestMappingAdapter;
		}
		return this.iSysServiceAPIRequestMappingAdapter;

	}

	protected ISysServiceAPIRequestMappingAdapter getApplicationRequestMappingAdapter(IApplicationRuntime iApplicationRuntime) throws Exception {
		if (this.iSysServiceAPIRequestMappingAdapter == null) {
			StandardSysServiceAPIRequestMappingAdapter standardSysServiceAPIRequestMappingAdapter = new StandardSysServiceAPIRequestMappingAdapter();
			standardSysServiceAPIRequestMappingAdapter.init(this.getSystemGatewayContext(), this.getRequestMappingHandlerMapping(), this.getSysServiceAPIDocAdapter());
			this.iSysServiceAPIRequestMappingAdapter = standardSysServiceAPIRequestMappingAdapter;
		}
		return this.iSysServiceAPIRequestMappingAdapter;

	}

	@Override
	public ISysServiceAPIRequestMappingAdapter getSysServiceAPIRequestMappingAdapter() {
		if (this.iSysServiceAPIRequestMappingAdapter == null) {
			StandardSysServiceAPIRequestMappingAdapter standardSysServiceAPIRequestMappingAdapter = new StandardSysServiceAPIRequestMappingAdapter();
			try {
				standardSysServiceAPIRequestMappingAdapter.init(this.getSystemGatewayContext(), this.getRequestMappingHandlerMapping(), this.getSysServiceAPIDocAdapter());
			} catch (Exception ex) {
				throw new SystemGatewayException(this, String.format("初始化系统服务接口请求映射设配器发生异常，%1$s", ex.getMessage()), ex);
			}
			this.iSysServiceAPIRequestMappingAdapter = standardSysServiceAPIRequestMappingAdapter;
		}
		return this.iSysServiceAPIRequestMappingAdapter;
	}

	@Override
	public boolean fillDataSourceInfo(ISysDBSchemeRuntime iSysDBSchemeRuntime) {
		// String strDBType = configEntity.getString("dbtype", null);
		// if(StringUtils.hasLength(strDBType)) {
		// iSysDBSchemeRuntime.setDBType(strDBType);
		// }

		// 设置数据源属性
		// iSysDBSchemeRuntime.setDataSourceProperties(configEntity.any());
		return super.fillDataSourceInfo(iSysDBSchemeRuntime);
	}

	/**
	 * 注册部署系统数据源
	 * 
	 * @param deploySystem
	 * @param iSystemRuntime
	 * @throws Exception
	 */
	protected void registerDataSources(DeploySystem deploySystem, ISystemRuntime iSystemRuntime) throws Exception {

		List<IPSSysDBScheme> psSysDBSchemes = iSystemRuntime.getPSSystem().getAllPSSysDBSchemes();
		if (ObjectUtils.isEmpty(psSysDBSchemes)) {
			log.warn(String.format("系统[%1$s]未定义数据库体系结构", deploySystem.getDeploySystemId()));
			return;
		}

		for (IPSSysDBScheme iPSSysDBScheme : psSysDBSchemes) {
			ISysDBSchemeRuntime iSysDBSchemeRuntime = iSystemRuntime.getSysDBSchemeRuntime(iPSSysDBScheme);
			String strDBInstTag = iPSSysDBScheme.getDBInstTag();
			if (!StringUtils.hasLength(strDBInstTag)) {
				continue;
			}

			if (!strDBInstTag.equals(iSysDBSchemeRuntime.getDataSourceTag())) {
				log.warn(String.format("系统[%1$s]数据库[%2$s]指定数据源[%3$s]，忽略默认指定[%4$s]", deploySystem.getDeploySystemId(), iPSSysDBScheme.getName(), iSysDBSchemeRuntime.getDataSourceTag(), strDBInstTag));
				continue;
			}

			if (this.registerDBInst(strDBInstTag) == null) {
				log.warn(String.format("未定义数据库实例[%1$s]配置，系统[%2$s]数据库[%3$s]访问可能会出现问题", strDBInstTag, deploySystem.getDeploySystemId(), iPSSysDBScheme.getName()));
				continue;
			}
		}

		boolean bUpdateDBScheme = DataTypeUtils.getBooleanValue(deploySystem.getUpdateDBSchema(), false);
		if (!bUpdateDBScheme) {
			log.warn(String.format("系统[%1$s]忽略发布数据库结构", deploySystem.getDeploySystemId()));
			return;
		}
		if (this.getSysDBSchemeSyncAdapter() != null && bUpdateDBScheme) {
			for (IPSSysDBScheme iPSSysDBScheme : psSysDBSchemes) {
				ISysDBSchemeRuntime iSysDBSchemeRuntime = iSystemRuntime.getSysDBSchemeRuntime(iPSSysDBScheme);
				if (iSysDBSchemeRuntime instanceof net.ibizsys.central.cloud.core.database.ISysDBSchemeRuntime) {
					if (((net.ibizsys.central.cloud.core.database.ISysDBSchemeRuntime) iSysDBSchemeRuntime).isSelfUpdateSchema()) {
						log.warn(String.format("系统[%1$s]数据库[%2$s]自身发布结构", deploySystem.getDeploySystemId(), iPSSysDBScheme.getName(), iSysDBSchemeRuntime.getDataSourceTag()));
						continue;
					}
				}

				DataSource dataSource = this.dataSourceMap.get(iSysDBSchemeRuntime.getDataSourceTag());
				if (dataSource == null) {
					log.warn(String.format("系统[%1$s]数据库[%2$s]指定数据源[%3$s]不存在，忽略发布结构", deploySystem.getDeploySystemId(), iPSSysDBScheme.getName(), iSysDBSchemeRuntime.getDataSourceTag()));
					continue;
				}

				if (!iSysDBSchemeRuntime.isUpdateSchema()) {
					log.debug(String.format("系统[%1$s]数据库[%2$s]未启用模型更新", iSystemRuntime.getDeploySystemId(), iSysDBSchemeRuntime.getDSLink()));
					continue;
				}

				try {
					this.getSysDBSchemeSyncAdapter().sync(iSystemRuntime, iSysDBSchemeRuntime, dataSource, null);
				} catch (Throwable ex) {
					// throw new
					// Exception(String.format("同步系统[%1$s]数据库[%2$s]结构发生异常，%3$s",
					// iSystemRuntime.getDeploySystemId(),
					// iSysDBSchemeRuntime.getDSLink(), ex.getMessage()), ex);
					log.error(String.format("同步系统[%1$s]数据库[%2$s]结构发生异常，%3$s", iSystemRuntime.getDeploySystemId(), iSysDBSchemeRuntime.getDSLink(), ex.getMessage()), ex);
				}
			}
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.ibizsys.central.cloud.core.IServiceHub#updateDBSchema(net.ibizsys.
	 * central.database.ISysDBSchemeRuntime)
	 */
	public void updateDBSchema(ISysDBSchemeRuntime iSysDBSchemeRuntime) {
		Assert.notNull(iSysDBSchemeRuntime, "传入系统数据库体系运行时对象无效");

		ISystemRuntime iSystemRuntime = iSysDBSchemeRuntime.getSystemRuntime();
		IPSSysDBScheme iPSSysDBScheme = iSysDBSchemeRuntime.getPSSysDBScheme();

		try {

			String strDBInstTag = iSysDBSchemeRuntime.getPSSysDBScheme().getDBInstTag();
			if (StringUtils.hasLength(strDBInstTag)) {
				if (!strDBInstTag.equals(iSysDBSchemeRuntime.getDataSourceTag())) {
					log.warn(String.format("系统[%1$s]数据库[%2$s]指定数据源[%3$s]，忽略默认指定[%4$s]", iSystemRuntime.getDeploySystemId(), iPSSysDBScheme.getName(), iSysDBSchemeRuntime.getDataSourceTag(), strDBInstTag));
				} else {
					if (this.registerDBInst(strDBInstTag) == null) {
						log.warn(String.format("未定义数据库实例[%1$s]配置，系统[%2$s]数据库[%3$s]访问可能会出现问题", strDBInstTag, iSystemRuntime.getDeploySystemId(), iPSSysDBScheme.getName()));
					}
				}
			}

			DataSource dataSource = this.dataSourceMap.get(iSysDBSchemeRuntime.getDataSourceTag());
			if (dataSource == null) {
				log.warn(String.format("系统[%1$s]数据库[%2$s]指定数据源[%3$s]不存在，忽略发布结构", iSystemRuntime.getDeploySystemId(), iPSSysDBScheme.getName(), iSysDBSchemeRuntime.getDataSourceTag()));
				return;
			}

			this.getSysDBSchemeSyncAdapter().sync(iSystemRuntime, iSysDBSchemeRuntime, dataSource, null);
		} catch (Throwable ex) {
			log.error(String.format("同步系统[%1$s]数据库[%2$s]结构发生异常，%3$s", iSystemRuntime.getDeploySystemId(), iSysDBSchemeRuntime.getDSLink(), ex.getMessage()), ex);
			throw new SystemGatewayException(this, iSysDBSchemeRuntime, String.format("同步系统[%1$s]数据库[%2$s]结构发生异常，%3$s", iSystemRuntime.getDeploySystemId(), iSysDBSchemeRuntime.getDSLink(), ex.getMessage()), ex);
		}

	}

	protected javax.sql.DataSource registerDBInst(String strDBInstTag) throws Exception {
		ConfigEntity configEntity = this.dbInstConfigMap.get(strDBInstTag);
		if (configEntity == null) {

			// 注册数据源
			String strDBInstConfigKey = String.format("%1$s%2$s", NacosServiceHubSetting.DATAID_DBINST_PREFIX, strDBInstTag);
			String strConfig = this.getConfig(strDBInstConfigKey);
			if (!StringUtils.hasLength(strConfig)) {
				log.warn(String.format("未定义数据库实例[%1$s]配置，访问可能会出现问题", strDBInstConfigKey));
				return null;
			}

			configEntity = new ConfigEntity(strConfig);
			String strDBInstConfigExKey = String.format("%1$s%2$s-ex", NacosServiceHubSetting.DATAID_DBINST_PREFIX, strDBInstTag);
			String strConfigEx = this.getConfig(strDBInstConfigExKey);
			if (StringUtils.hasLength(strConfigEx)) {
				ConfigEntity configexEntity = new ConfigEntity(strConfigEx);
				configexEntity.copyTo(configEntity);
			}

			DataSource dataSource = new DataSource();
			configEntity.copyTo(dataSource);

			if (ObjectUtils.isEmpty(dataSource.getJdbcUrl())) {
				dataSource.setJdbcUrl((String) dataSource.get("url"));
			}

			dataSource.setDataSourceId(strDBInstTag);
			dataSourceMap.put(dataSource.getDataSourceId(), dataSource);
			this.registerDataSource(dataSource);

			this.dbInstConfigMap.put(strDBInstTag, configEntity);
		}

		return this.getDataSource(strDBInstTag, true);
	}

	protected void registerAppGatewayRoutes(DeploySystem deploySystem, ISystemRuntime iSystemRuntime) throws Exception {
		this.onRegisterAppGatewayRoutes(iSystemRuntime);
	}

	/**
	 * 注册应用网关路由信息
	 * 
	 * @param iSystemRuntime
	 * @throws Exception
	 */
	protected void onRegisterAppGatewayRoutes(ISystemRuntime iSystemRuntime) throws Exception {

		boolean bEnableExtension = false;
		if (iSystemRuntime instanceof IServiceSystemRuntime) {
			bEnableExtension = ((IServiceSystemRuntime) iSystemRuntime).isEnableExtension();
		}

		String strDynaModelAPI = "";
		java.util.List<IPSSysServiceAPI> psSysServiceAPIs = iSystemRuntime.getPSSystem().getAllPSSysServiceAPIs();
		if (!ObjectUtils.isEmpty(psSysServiceAPIs)) {
			for (IPSSysServiceAPI iPSSysServiceAPI : psSysServiceAPIs) {
				if (ISysExtensionUtilRuntime.SERVICEAPITAG_PSMODELTOOLAPI.equalsIgnoreCase(iPSSysServiceAPI.getAPITag())) {
					strDynaModelAPI = iPSSysServiceAPI.getCodeName().toLowerCase();
					log.debug(String.format("部署系统[%1$s]使用接口[%2$s][%3$s]提供模型工具服务", iSystemRuntime.getDeploySystemId(), iPSSysServiceAPI.getName(), iPSSysServiceAPI.getCodeName()));
					break;
				}
			}
		}

		java.util.List<IPSApplication> psApplications = iSystemRuntime.getPSSystem().getAllPSApps();
		if (!ObjectUtils.isEmpty(psApplications)) {

			for (IPSApplication iPSApplication : psApplications) {

				ObjectNode objectNode = null;
				if (iPSApplication.getDynaSysMode() == DynaSysMode.DISABLED.value) {
					objectNode = GatewayUtils.getAppGatewayNode(iSystemRuntime.getDeploySystemId(), iSystemRuntime.getServiceId(), iPSApplication);
					if (objectNode == null) {
						log.warn(String.format("部署系统应用[%1$s][%2$s]未提供路由配置", iSystemRuntime.getDeploySystemId(), iPSApplication.getName()));
						continue;
					}
				} else {
					objectNode = GatewayUtils.getAppGatewayNode(iSystemRuntime.getDeploySystemId(), iSystemRuntime.getServiceId(), iPSApplication, bEnableExtension);
					if (objectNode == null) {
						log.warn(String.format("部署系统应用[%1$s][%2$s]未提供路由配置", iSystemRuntime.getDeploySystemId(), iPSApplication.getName()));
						continue;
					}

					if (bEnableExtension) {
						java.util.Collection<IExtensionSysRefRuntime> extensionSysRefRuntimes = ((IServiceSystemRuntime) iSystemRuntime).getExtensionSysRefRuntimes(true);
						if (!ObjectUtils.isEmpty(extensionSysRefRuntimes)) {

							// 判断主应用是否为代理应用
							String strAppMode = iPSApplication.getAppMode();
							if (AppMode.CLOUDHUBAPP_PLACEHOLDER.value.equals(strAppMode)) {
								String strMainCodeName = iPSApplication.getCodeName();
								String strMainAppTag = iPSApplication.getAppTag();

								if (StringUtils.hasLength(strMainCodeName) && StringUtils.hasLength(strMainAppTag)) {
									for (IExtensionSysRefRuntime iExtensionSysRefRuntime : extensionSysRefRuntimes) {
										if (SysRefType.EXTENSION_DEVSYS.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType()) || SysRefType.MERGENCE_DEVSYS.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType()) || SysRefType.EXTENSION_DEVSYS_PSMODELTOOL.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType())) {

											List<IPSApplication> psApplicationList = iExtensionSysRefRuntime.getPSSystemService().getPSSystem().getAllPSApps();
											if (ObjectUtils.isEmpty(psApplicationList)) {
												continue;
											}

											IPSApplication realPSApplication = null;
											for (IPSApplication subPSApplication : psApplicationList) {
												if (!AppMode.CLOUDHUBAPP.value.equals(subPSApplication.getAppMode())) {
													continue;
												}

												if (!strMainCodeName.equals(subPSApplication.getCodeName())) {
													continue;
												}

												realPSApplication = subPSApplication;
												break;
											}

											if (realPSApplication != null) {
												if (iExtensionSysRefRuntime.getDeploySystem() != null) {
													objectNode = GatewayUtils.getAppGatewayNode(iSystemRuntime.getDeploySystemId(), iExtensionSysRefRuntime.getDeploySystem().getDeploySystemId(), realPSApplication, bEnableExtension, true);
												} else {
													objectNode = GatewayUtils.getAppGatewayNode(iSystemRuntime.getDeploySystemId(), iSystemRuntime.getServiceId(), realPSApplication, bEnableExtension, true);
												}
												break;
											}
										}
									}
								}
							}

							for (IExtensionSysRefRuntime iExtensionSysRefRuntime : extensionSysRefRuntimes) {

								// 判断系统引用类型
								if (SysRefType.EXTENSION_DEVSYS.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType()) || SysRefType.MERGENCE_DEVSYS.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType())) {

									List<IPSApplication> psApplicationList = iExtensionSysRefRuntime.getPSSystemService().getPSSystem().getAllPSApps();
									if (ObjectUtils.isEmpty(psApplicationList)) {
										continue;
									}

									for (IPSApplication subPSApplication : psApplicationList) {
										String strDeploySystemId = String.format("%1$s__%2$s", iExtensionSysRefRuntime.getExtensionTag(), iPSApplication.getCodeName()).toLowerCase();
										ObjectNode subObjectNode = null;
										if (iExtensionSysRefRuntime.getDeploySystem() != null) {
											subObjectNode = GatewayUtils.getAppGatewayNode(strDeploySystemId, iExtensionSysRefRuntime.getDeploySystem().getDeploySystemId(), subPSApplication, bEnableExtension);
										} else {
											subObjectNode = GatewayUtils.getAppGatewayNode(strDeploySystemId, iSystemRuntime.getServiceId(), subPSApplication, bEnableExtension);
										}

										if (subObjectNode == null) {
											log.warn(String.format("部署系统扩展应用[%1$s][%2$s][%3$s]未提供路由配置", iSystemRuntime.getDeploySystemId(), iExtensionSysRefRuntime.getName(), iPSApplication.getName()));
											continue;
										}

										objectNode = GatewayUtils.appendAppGatewayNode(objectNode, subObjectNode);
									}
									continue;
								}

								if (SysRefType.EXTENSION_DEVSYS_PSMODELTOOL.value.equals(iExtensionSysRefRuntime.getPSSysRef().getSysRefType())) {

									List<IPSApplication> psApplicationList = iExtensionSysRefRuntime.getPSSystemService().getPSSystem().getAllPSApps();
									if (ObjectUtils.isEmpty(psApplicationList)) {
										continue;
									}

									for (IPSApplication subPSApplication : psApplicationList) {
										String strDeploySystemId = String.format("%1$s__%2$s", iExtensionSysRefRuntime.getExtensionTag(), iPSApplication.getCodeName()).toLowerCase();
										ObjectNode subObjectNode = GatewayUtils.getPSModelToolAppGatewayNode(strDeploySystemId, iSystemRuntime.getServiceId(), subPSApplication, strDynaModelAPI);
										if (subObjectNode == null) {
											log.warn(String.format("部署系统扩展应用[%1$s][%2$s][%3$s]未提供路由配置", iSystemRuntime.getDeploySystemId(), iExtensionSysRefRuntime.getName(), iPSApplication.getName()));
											continue;
										}

										objectNode = GatewayUtils.appendAppGatewayNode(objectNode, subObjectNode);
									}

									continue;
								}
							}
						}
					}
				}

				String strConfigId = String.format("deployapp-%1$s-%2$s", iSystemRuntime.getDeploySystemId(), iPSApplication.getCodeName()).toLowerCase();
				this.publishConfig(strConfigId, objectNode);
			}
		}
	}

	@Override
	public void registerAppGatewayRoutes(ISystemRuntime iSystemRuntime) {
		Assert.notNull(iSystemRuntime, "传入系统运行时对象无效");
		try {
			this.onRegisterAppGatewayRoutes(iSystemRuntime);
		} catch (Throwable ex) {
			throw new SystemGatewayException(this, String.format("注册系统运行时应用网关发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected V2DeploySystem getV2DeploySystem(DeploySystem deploySystem) throws Exception {
		boolean bExtension = DataTypeUtils.getBooleanValue(deploySystem.getExtension(), false);
		if (!bExtension) {
			return null;
		}

		return getCloudExtensionClient().getDeploySystem(deploySystem.getDeploySystemId());
	}

	protected V2DataSource getV2DataSource(String strDataSourceId) throws Exception {
		return getCloudExtensionClient().getDataSource(strDataSourceId);
	}

	protected ICloudExtensionClient getCloudExtensionClient() throws Exception {
		if (this.iCloudExtensionClient == null) {
			// 获取系统模型路径
			ISysCloudClientUtilRuntime iSysCloudClientRuntime = this.getHubSystemRuntime(false).getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
			this.iCloudExtensionClient = iSysCloudClientRuntime.getServiceClient(ICloudUtilRuntime.CLOUDSERVICE_EXTENSION, ICloudExtensionClient.class, true);
		}
		return this.iCloudExtensionClient;
	}

	@Override
	public <T extends ICloudUtilRuntime> T getCloudUtilRuntime(Class<?> systemCls, Class<T> cls, boolean bTryMode) {
		return this.getSysUtilRuntime(systemCls, cls, bTryMode);
	}

	@Override
	public <T> T getSysUtilRuntime(Class<?> systemCls, Class<T> cls, boolean bTryMode) {
		// 获取指定系统
		if (systemCls != null) {
			ISystemRuntime iSystemRuntime = (ISystemRuntime) this.getSystemRuntime(systemCls, true);
			if (iSystemRuntime != null) {
				return iSystemRuntime.getSysUtilRuntime(cls, bTryMode);
			}
		}

		if (this.getHubSystemRuntime(true) != null) {
			T t = this.getHubSystemRuntime(false).getSysUtilRuntime(cls, true);
			if (t != null && (!(t instanceof ISysUtilContainerOnly))) {
				return t;
			}
		}

		// 循环系统
		for (ISystemRuntime iSystemRuntime : this.getSystemRuntimes()) {
			if (iSystemRuntime == this.getHubSystemRuntime(true)) {
				continue;
			}
			if (iSystemRuntime instanceof IServiceSystemRuntime) {
				T t = ((IServiceSystemRuntime) iSystemRuntime).getSysUtilRuntime(cls, true, true);
				if (t != null && (!(t instanceof ISysUtilContainerOnly))) {
					return t;
				}
			} else {
				T t = iSystemRuntime.getSysUtilRuntime(cls, true);
				if (t != null && (!(t instanceof ISysUtilContainerOnly))) {
					return t;
				}
			}
		}

		if (!bTryMode) {
			if (this.getHubSystemRuntime(true) != null) {
				// 强行从网关系统中获取
				return this.getHubSystemRuntime(false).getSysUtilRuntime(cls, false);
			}
		}

		if (bTryMode)
			return null;
		throw new SystemGatewayException(this, String.format("无法获取指定系统功能组件运行时对象[%1$s]", cls.getCanonicalName()));
	}

	@Override
	public boolean doFilter(ServletRequest request, ServletResponse response) throws IOException, ServletException {

		// 置空当前认证信息
		UserContext.setCurrent(null);
		SecurityContextHolder.getContext().setAuthentication(null);
		if (this.getServiceHubFilter() == null) {
			return true;
		}

		if (this.ignoreAuthPatternSet != null) {
			String strRequestURI = ((HttpServletRequest) request).getRequestURI();
			Iterator<String> it = this.ignoreAuthPatternSet.iterator();
			while (it.hasNext()) {
				String strPattern = it.next();
				if (pathMatcher.match(strPattern, strRequestURI)) {
					request.setAttribute(ISysUAAUtilRuntime.ATTRIBUTE_IGNOREAUTHPATTERN, strPattern);
					if (this.getSysServiceAPIDocAdapter() != null) {
						if (strRequestURI.equals("/v3/api-docs")) {
							return this.getSysServiceAPIDocAdapter().outputOpenAPIDoc((HttpServletRequest) request, (HttpServletResponse) response);
						}
					}
					return true;
				}
			}
		}
		return this.getServiceHubFilter().doFilter(request, response);
	}

	@Override
	public boolean redoFilter() throws IOException, ServletException {
		if (this.getServiceHubFilter() == null) {
			return false;
		}
		return this.getServiceHubFilter().redoFilter();
	}

	@Override
	public void registerIgnoreAuthPattern(String ignoreAuthPattern) {
		if (this.ignoreAuthPatternSet == null) {
			this.ignoreAuthPatternSet = new HashSet<String>();
		}
		this.ignoreAuthPatternSet.addAll(Arrays.asList(ignoreAuthPattern.split("\\s*,\\s*")));
	}

	@Override
	public void unregisterIgnoreAuthPattern(String ignoreAuthPattern) {
		if (this.ignoreAuthPatternSet == null) {
			return;
		}
		this.ignoreAuthPatternSet.removeAll(Arrays.asList(ignoreAuthPattern.split("\\s*,\\s*")));
	}

	protected void setServiceHubFilter(IServiceHubFilter iServiceHubFilter) {
		this.realServiceHubFilter = iServiceHubFilter;
	}

	protected IServiceHubFilter getServiceHubFilter() {
		return this.realServiceHubFilter;
	}

	@Override
	public IHubSystemRuntime getHubSystemRuntime() {
		return this.getHubSystemRuntime(false);
	}

	@Override
	public IHubSystemRuntime getHubSystemRuntime(boolean bTryMode) {
		if (this.hubSystemRuntime != null || bTryMode) {
			return this.hubSystemRuntime;
		}
		throw new SystemGatewayException(this, String.format("未定义服务总线系统"));
	}

	protected void setHubSystemRuntime(IHubSystemRuntime hubSystemRuntime) {
		this.hubSystemRuntime = hubSystemRuntime;
	}

	@Override
	public void registerNamingService(String strServiceId) {
		this.registerNamingService(strServiceId, this.strIPAddress, this.port);
	}

	@Override
	public void registerNamingService(String strServiceId, String strIp, int nPort) {
		if (!getServiceHubSetting().isRegisterNamingService()) {
			log.warn(String.format("忽略注册命名服务[%1$s]", strServiceId));
			return;
		}

		if (this.namingService == null) {
			throw new SystemGatewayException(this, "命名服务对象无效");
		}

		try {
			if (this.isEnableDebug()) {
				// 强行移除
				// namingService.deregisterInstance(strServiceId,
				// nacosDiscoveryProperties.getGroup(), strIp, nPort);
				log.warn(String.format("调试模式调整命名服务[%1$s] ==> [%1$s-debug]", strServiceId));
				strServiceId = String.format("%1$s-debug", strServiceId);
				namingService.registerInstance(strServiceId, nacosDiscoveryProperties.getGroup(), strIp, nPort);
			} else {
				namingService.registerInstance(strServiceId, nacosDiscoveryProperties.getGroup(), strIp, nPort);
				// strServiceId = String.format("%1$s-debug", strServiceId);
				// namingService.deregisterInstance(strServiceId,
				// nacosDiscoveryProperties.getGroup(), strIp, nPort);
			}

		} catch (Exception ex) {
			log.error(String.format("注册命名服务[%1$s]发生异常，%2$s", strServiceId, ex.getMessage()), ex);
			throw new SystemGatewayException(this, String.format("注册命名服务[%1$s][%3$s:%4$s]发生异常，%2$s", strServiceId, ex.getMessage(), strIp, nPort), ex);
		}
	}

	@Override
	public void unregisterNamingService(String strServiceId) {
		this.unregisterNamingService(strServiceId, this.strIPAddress, this.port);
	}

	@Override
	public void unregisterNamingService(String strServiceId, String strIp, int nPort) {
		if (!getServiceHubSetting().isRegisterNamingService()) {
			log.warn(String.format("忽略注销命名服务[%1$s]", strServiceId));
			return;
		}

		if (this.namingService == null) {
			throw new SystemGatewayException(this, "命名服务对象无效");
		}

		try {
			if (this.isEnableDebug()) {
				strServiceId = String.format("%1$s-debug", strServiceId);
			}
			namingService.deregisterInstance(strServiceId, nacosDiscoveryProperties.getGroup(), strIp, nPort);
		} catch (Exception ex) {
			log.error(String.format("注册命名服务[%1$s]发生异常，%2$s", strServiceId, ex.getMessage()), ex);
			throw new SystemGatewayException(this, String.format("注销命名服务[%1$s][%3$s:%4$s]发生异常，%2$s", strServiceId, ex.getMessage(), strIp, nPort), ex);
		}
	}

	@Override
	public boolean containsNamingService(String strServiceId, boolean bHealth) {
		if (this.namingService == null) {
			throw new SystemGatewayException(this, "命名服务对象无效");
		}

		try {
			List<Instance> instances = namingService.selectInstances(strServiceId, nacosDiscoveryProperties.getGroup(), bHealth);
			return !ObjectUtils.isEmpty(instances);
		} catch (Exception ex) {
			log.error(String.format("查询命名服务[%1$s]发生异常，%2$s", strServiceId, ex.getMessage()), ex);
			throw new SystemGatewayException(this, String.format("查询命名服务[%1$s]发生异常，%2$s", strServiceId, ex.getMessage()), ex);
		}
	}

	@Override
	public void publishConfig(String strConfigId, ObjectNode objectNode) {
		Assert.hasLength(strConfigId, "传入键名无效");
		if (!getServiceHubSetting().isPublishConfig()) {
			log.warn(String.format("忽略发布配置[%1$s]", strConfigId));
			return;
		}

		String strBackupConfigId = strConfigId;
		strConfigId = NacosConfigUtils.getDataId(strBackupConfigId);
		if (!strBackupConfigId.equals(strConfigId)) {
			log.warn(String.format("键名[%1$s]包含非法字符，转换至[%2$s]，可能会出现键名冲突", strBackupConfigId, strConfigId));
		}

		ConfigService configService = nacosConfigManager.getConfigService();
		try {
			String strContent = objectNode.toPrettyString();
			String strLastContent = configService.getConfig(strConfigId, nacosConfigProperties.getGroup(), 5000);
			if (DataTypeUtils.compare(DataTypes.VARCHAR, strContent, strLastContent) == 0) {
				log.warn(String.format("配置项[%1$s]没有发生变化，忽略发布", strConfigId));
				return;
			}
			configService.publishConfig(strConfigId, nacosConfigProperties.getGroup(), strContent, com.alibaba.nacos.api.config.ConfigType.JSON.toString());
		} catch (Exception ex) {
			log.error(String.format("发布配置[%1$s]发生异常，%2$s", strConfigId, ex.getMessage()), ex);
			throw new SystemGatewayException(this, String.format("发布配置[%1$s]发生异常，%2$s", strConfigId, ex.getMessage()), ex);
		}
	}

	@Override
	public void publishConfig(String strConfigId, Map map) {
		Assert.hasLength(strConfigId, "传入键名无效");

		if (!getServiceHubSetting().isPublishConfig()) {
			log.warn(String.format("忽略发布配置[%1$s]", strConfigId));
			return;
		}

		String strBackupConfigId = strConfigId;
		strConfigId = NacosConfigUtils.getDataId(strBackupConfigId);
		if (!strBackupConfigId.equals(strConfigId)) {
			log.warn(String.format("键名[%1$s]包含非法字符，转换至[%2$s]，可能会出现键名冲突", strBackupConfigId, strConfigId));
		}

		ConfigService configService = nacosConfigManager.getConfigService();
		try {
			Yaml yaml = new Yaml();// 将Map转换成 YAML 字符串
			String strContent = yaml.dumpAsMap(map);

			String strLastContent = configService.getConfig(strConfigId, nacosConfigProperties.getGroup(), 5000);
			if (DataTypeUtils.compare(DataTypes.VARCHAR, strContent, strLastContent) == 0) {
				log.warn(String.format("配置项[%1$s]没有发生变化，忽略发布", strConfigId));
				return;
			}

			configService.publishConfig(strConfigId, nacosConfigProperties.getGroup(), strContent, com.alibaba.nacos.api.config.ConfigType.YAML.toString());
		} catch (Exception ex) {
			log.error(String.format("发布配置[%1$s]发生异常，%2$s", strConfigId, ex.getMessage()), ex);
			throw new SystemGatewayException(this, String.format("发布配置[%1$s]发生异常，%2$s", strConfigId, ex.getMessage()), ex);
		}
	}

	@Override
	public void publishConfig(String strConfigId, String strContent) {
		Assert.hasLength(strConfigId, "传入键名无效");

		if (!getServiceHubSetting().isPublishConfig()) {
			log.warn(String.format("忽略发布配置[%1$s]", strConfigId));
			return;
		}

		String strBackupConfigId = strConfigId;
		strConfigId = NacosConfigUtils.getDataId(strBackupConfigId);
		if (!strBackupConfigId.equals(strConfigId)) {
			log.warn(String.format("键名[%1$s]包含非法字符，转换至[%2$s]，可能会出现键名冲突", strBackupConfigId, strConfigId));
		}

		ConfigService configService = nacosConfigManager.getConfigService();
		try {

			String strLastContent = configService.getConfig(strConfigId, nacosConfigProperties.getGroup(), 5000);
			if (DataTypeUtils.compare(DataTypes.VARCHAR, strContent, strLastContent) == 0) {
				log.warn(String.format("配置项[%1$s]没有发生变化，忽略发布", strConfigId));
				return;
			}
			if (strContent == null) {
				strContent = "";
			}

			if (strContent.indexOf("{") == 0) {
				configService.publishConfig(strConfigId, nacosConfigProperties.getGroup(), strContent, com.alibaba.nacos.api.config.ConfigType.JSON.toString());
			} else {
				configService.publishConfig(strConfigId, nacosConfigProperties.getGroup(), strContent, com.alibaba.nacos.api.config.ConfigType.YAML.toString());
			}

		} catch (Exception ex) {
			log.error(String.format("发布配置[%1$s]发生异常，%2$s", strConfigId, ex.getMessage()), ex);
			throw new SystemGatewayException(this, String.format("发布配置[%1$s]发生异常，%2$s", strConfigId, ex.getMessage()), ex);
		}
	}

	@Override
	public void removeConfig(String strConfigId) {
		Assert.hasLength(strConfigId, "传入键名无效");

		if (!getServiceHubSetting().isPublishConfig()) {
			log.warn(String.format("忽略发布配置[%1$s]", strConfigId));
			return;
		}

		String strBackupConfigId = strConfigId;
		strConfigId = NacosConfigUtils.getDataId(strBackupConfigId);
		if (!strBackupConfigId.equals(strConfigId)) {
			log.warn(String.format("键名[%1$s]包含非法字符，转换至[%2$s]，可能会出现键名冲突", strBackupConfigId, strConfigId));
		}

		ConfigService configService = nacosConfigManager.getConfigService();
		try {
			configService.removeConfig(strConfigId, nacosConfigProperties.getGroup());
		} catch (Exception ex) {
			log.error(String.format("移除配置[%1$s]发生异常，%2$s", strConfigId, ex.getMessage()), ex);
			throw new SystemGatewayException(this, String.format("移除配置[%1$s]发生异常，%2$s", strConfigId, ex.getMessage()), ex);
		}
	}

	@Override
	public String getConfig(String strConfigId) {

		Assert.hasLength(strConfigId, "传入键名无效");

		String strBackupConfigId = strConfigId;
		strConfigId = NacosConfigUtils.getDataId(strBackupConfigId);
		if (!strBackupConfigId.equals(strConfigId)) {
			log.warn(String.format("键名[%1$s]包含非法字符，转换至[%2$s]，可能会出现键名冲突", strBackupConfigId, strConfigId));
		}

		ConfigService configService = nacosConfigManager.getConfigService();
		try {
			return configService.getConfig(strConfigId, nacosConfigProperties.getGroup(), 5000);
		} catch (Exception ex) {
			log.error(String.format("获取配置[%1$s]发生异常，%2$s", strConfigId, ex.getMessage()), ex);
			throw new SystemGatewayException(this, String.format("获取配置[%1$s]发生异常，%2$s", strConfigId, ex.getMessage()), ex);
		}
	}

	@Override
	public void addConfigListener(String strConfigId, final IConfigListener listener) {
		Listener l = new Listener() {
			@Override
			public Executor getExecutor() {
				return listener.getExecutor();
			}

			@Override
			public void receiveConfigInfo(String configInfo) {
				log.debug(String.format("配置项[%1$s]发生变化", strConfigId));
				listener.receiveConfigInfo(configInfo);
			}
		};
		ConfigService configService = nacosConfigManager.getConfigService();
		try {
			configService.addListener(strConfigId, nacosConfigProperties.getGroup(), l);
			this.configListenerMap.put(listener, l);
		} catch (Exception ex) {
			log.error(String.format("侦听配置[%1$s]发生异常，%2$s", strConfigId, ex.getMessage()), ex);
			throw new SystemGatewayException(this, String.format("侦听配置[%1$s]发生异常，%2$s", strConfigId, ex.getMessage()), ex);
		}
	}

	@Override
	public void removeConfigListener(String strConfigId, IConfigListener listener) {

		Listener l = this.configListenerMap.get(listener);
		if (listener == null) {
			log.warn(String.format("未注册侦听器[%1$s]", listener));
			return;
		}

		ConfigService configService = nacosConfigManager.getConfigService();
		try {

			configService.removeListener(strConfigId, nacosConfigProperties.getGroup(), l);
			this.configListenerMap.remove(listener);
		} catch (Exception ex) {
			log.error(String.format("取消侦听配置[%1$s]发生异常，%2$s", strConfigId, ex.getMessage()), ex);
			throw new SystemGatewayException(this, String.format("取消侦听配置[%1$s]发生异常，%2$s", strConfigId, ex.getMessage()), ex);
		}
	}

	@Override
	public void requireCloudUtilRuntime(Class<?> systemRuntimeCls, Class<? extends ICloudUtilRuntime> cloudUtilCls) {
		this.requiredCloudUtilRuntimeMap.put(cloudUtilCls, systemRuntimeCls);
	}

	@Override
	public AppData invokeGetAppData(String strDeploySystemId, String strSystemTag, String strOrgId, IAuthenticationUser iAuthenticationUser, Object objTag) throws Throwable {
		// 获取系统运行时
		ISystemRuntime iSystemRuntime = this.getSystemRuntime(strDeploySystemId);
		if (iSystemRuntime instanceof IServiceSystemRuntime) {
			return ((IServiceSystemRuntime) iSystemRuntime).invokeGetAppData(strSystemTag, strOrgId, iAuthenticationUser, objTag);
		}
		throw new SystemGatewayException(this, String.format("部署系统[%1$s]不支持此调用", strDeploySystemId));
	}

	@Override
	public AppData invokeGetAppData(String strDeploySystemId, String strDCSystemTag, IAuthenticationUser iAuthenticationUser, Object objTag) throws Throwable {
		// 获取系统运行时
		ISystemRuntime iSystemRuntime = this.getSystemRuntime(strDeploySystemId);
		if (iSystemRuntime instanceof IServiceSystemRuntime) {
			return ((IServiceSystemRuntime) iSystemRuntime).invokeGetAppData(strDCSystemTag, iAuthenticationUser, objTag);
		}
		throw new SystemGatewayException(this, String.format("部署系统[%1$s]不支持此调用", strDeploySystemId));
	}

	@Override
	public Object invokeDevOpsAction(String strDeploySystemId, String strAction, Object objBody, String strKey, IUserContext iUserContext, Object objTag) throws Throwable {

		IAuthenticationUser authenticationUser = AuthenticationUser.getCurrentMust();
		if (!AuthenticationUser.isSuperuser(authenticationUser) && !AuthenticationUser.isDevuser(authenticationUser)) {
			if (!iUserContext.isSuperuser()) {
				throw new SystemGatewayException(this, "必须管理员才能进行此操作", Errors.ACCESSDENY);
			}
		}

		// 获取系统运行时
		ISystemRuntime iSystemRuntime = this.getSystemRuntime(strDeploySystemId);
		// 优先使用指定系统DevOps组件执行作业
		ISysDevOpsUtilRuntime iSysDevOpsUtilRuntime = iSystemRuntime.getSysUtilRuntime(ISysDevOpsUtilRuntime.class, true);
		if (iSysDevOpsUtilRuntime != null) {
			if (!(iSysDevOpsUtilRuntime instanceof ISysUtilContainerOnly) && iSysDevOpsUtilRuntime instanceof IHubSysDevOpsUtilRuntime) {
				return ((IHubSysDevOpsUtilRuntime) iSysDevOpsUtilRuntime).executeAction(iSystemRuntime, strAction, objBody, strKey, objTag);
			}
			return iSysDevOpsUtilRuntime.executeAction(strAction, objBody, strKey, objTag);
		}
		IHubSysDevOpsUtilRuntime iHubSysDevOpsUtilRuntime = this.getHubSystemRuntime().getSysUtilRuntime(IHubSysDevOpsUtilRuntime.class, false);
		return iHubSysDevOpsUtilRuntime.executeAction(iSystemRuntime, strAction, objBody, strKey, objTag);
	}

	protected ISystemRuntime reloadDeploySystem(DeploySystem deploySystem, String strConfigInfo) {

		ISystemRuntime iSystemRuntime = this.getLoadedSystemRuntime(deploySystem.getDeploySystemId(), true);
		if (iSystemRuntime != null) {
			this.logEvent(LogLevels.INFO, String.format("服务系统[%2$s@%1$s]执行重新部署", this.getId(), deploySystem.getDeploySystemId()), deploySystem);
			try {
				this.unregisterSystemRuntime(deploySystem, iSystemRuntime);
				this.logEvent(LogLevels.INFO, String.format("服务系统[%2$s@%1$s]卸载成功", this.getId(), deploySystem.getDeploySystemId()), deploySystem);

			} catch (Throwable ex) {
				this.logEvent(LogLevels.ERROR, String.format("服务系统[%2$s@%1$s]卸载发生异常， %3$s", this.getId(), deploySystem.getDeploySystemId(), ex.getMessage()), deploySystem);
				throw new SystemGatewayException(this, String.format("注销系统[%1$s]运行时对象发生异常，%2$s", deploySystem.getDeploySystemId(), ex.getMessage()), ex);
			}
			iSystemRuntime = null;
		}

		try {
			iSystemRuntime = this.registerDeploySystem(deploySystem);
			this.logEvent(LogLevels.INFO, String.format("服务系统[%2$s@%1$s]部署成功", this.getId(), deploySystem.getDeploySystemId()), deploySystem);
		} catch (Throwable ex) {
			this.logEvent(LogLevels.ERROR, String.format("服务系统[%2$s@%1$s]部署发生异常， %3$s", this.getId(), deploySystem.getDeploySystemId(), ex.getMessage()), deploySystem);
			throw new SystemGatewayException(this, String.format("注册系统[%1$s]运行时对象发生异常，%2$s", deploySystem.getDeploySystemId(), ex.getMessage()), ex);
		}

		log.info(String.format("重新加载系统[%1$s]运行时对象完成", deploySystem.getDeploySystemId()));
		return iSystemRuntime;
	}

	@Override
	public Resource resolveWebResource(HttpServletRequest request, String requestPath) {

		for (java.util.Map.Entry<String, IServletAppRuntime> entry : this.servletAppRuntimeMap.entrySet()) {
			if (pathMatcher.match(entry.getKey(), requestPath)) {
				return entry.getValue().resolveResource(request, requestPath);
			}
		}

		return null;
	}

	@Override
	public IPSSystemService getPSSystemService(String serviceId, boolean tryMode) {
		try {
			DeploySystem deploySystem = new DeploySystem();
			String deploySystemConfig = ServiceHub.getInstance().getConfig(NacosServiceHubSetting.DATAID_DEPLOYSYSTEM_PREFIX + serviceId);
			if (StringUtils.hasLength(deploySystemConfig)) {
				Yaml yaml = new Yaml();
				Map map2 = yaml.loadAs(deploySystemConfig, Map.class);
				deploySystem.putAll(map2);
			}

			deploySystem.setDeploySystemId(serviceId);
			if (!StringUtils.hasLength(deploySystem.getModelPath())) {
				deploySystem.setModelPath(DEPLOYSYSYTEMMODELPATH_REMOTE);
			}

			return this.getPSSystemService(deploySystem, tryMode);
		} catch (Exception ex) {
			throw new SystemGatewayException(this, String.format("获取指定服务系统[%1$s]模型发生异常，%2$s", serviceId, ex.getMessage()), ex);
		}
	}

	@Override
	public List<ServiceInstance> getNamingServiceInstances(String strServiceId) {
		if (this.namingService == null) {
			throw new SystemGatewayException(this, "命名服务对象无效");
		}

		try {
			List<Instance> instanceList = this.namingService.selectInstances(strServiceId, nacosDiscoveryProperties.getGroup(), true);
			if (!ObjectUtils.isEmpty(instanceList)) {
				List<ServiceInstance> list = new ArrayList<ServiceInstance>();
				for (Instance instance : instanceList) {
					ServiceInstance serviceInstance = new ServiceInstance();
					serviceInstance.setServiceName(strServiceId);
					serviceInstance.setIp(instance.getIp());
					serviceInstance.setPort(instance.getPort());
					list.add(serviceInstance);
				}
				return list;
			}
			return null;

		} catch (Exception ex) {
			log.error(String.format("获取命名服务[%1$s]实例清单发生异常，%2$s", strServiceId, ex.getMessage()), ex);
			throw new SystemGatewayException(this, String.format("获取命名服务[%1$s]实例清单发生异常，%2$s", strServiceId, ex.getMessage()), ex);
		}
	}

	@Override
	public ISystemRuntime reloadSystemRuntime(String serviceId) {

		Assert.hasLength(serviceId, "未传入系统标识");

		DeploySystem reloadDeploySystem = null;
		List<DeploySystem> deploySystemList = this.getServiceHubSetting().getDeploySystems();
		if (deploySystemList != null) {
			for (DeploySystem deploySystem : deploySystemList) {
				if (serviceId.equalsIgnoreCase(deploySystem.getDeploySystemId())) {
					reloadDeploySystem = deploySystem;
					break;
				}
			}
		}

		if (reloadDeploySystem == null) {
			throw new SystemGatewayException(this, String.format("无法获取指定部署系统[%1$s]", serviceId));
		}

		return this.reloadDeploySystem(reloadDeploySystem, null);
	}

	@Override
	public ISystemRuntime getLoadedSystemRuntime(String strDeploySystemId) {
		return this.getLoadedSystemRuntime(strDeploySystemId, false);
	}

	protected synchronized void reloadServiceHub(String strConfigInfo) {
		try {
			onReloadServiceHub(strConfigInfo);
			logEvent(LogLevels.INFO, String.format("服务总线[%1$s]重新部署成功", this.getId()));
		} catch (Throwable ex) {
			log.error(String.format("重新加载服务总线发生异常，%1$s", ex.getMessage()), ex);
			logEvent(LogLevels.DEBUG, String.format("服务总线[%1$s]重新部署发生异常，%2$s", this.getId(), ex.getMessage()), ex);
		}

	}

	protected void onReloadServiceHub(String strConfigInfo) throws Throwable {

		List<DeploySystem> lastDeploySystemList = this.getServiceHubSetting().getDeploySystems();

		List<DataSource> lastDataSourceList = this.getServiceHubSetting().getDataSources();

		Map<String, DeploySystem> lastDeploySystemMap = new HashMap<String, DeploySystem>();
		if (!ObjectUtils.isEmpty(lastDeploySystemList)) {
			for (DeploySystem deploySystem : lastDeploySystemList) {
				lastDeploySystemMap.put(deploySystem.getDeploySystemId(), deploySystem);
			}
		}

		this.getServiceHubSetting().reloadConfig();

		// 安装动态数据源
		List<DataSource> dataSourceList = this.getServiceHubSetting().getDataSources();
		if (!ObjectUtils.isEmpty(dataSourceList)) {
			for (DataSource ds : dataSourceList) {
				try {
					if (this.dataSourceMap.containsKey(ds.getDataSourceId())) {
						continue;
					}
					this.dataSourceMap.put(ds.getDataSourceId(), ds);
					this.registerDataSource(ds);
				} catch (Exception ex) {
					throw new Exception(String.format("注册数据源[%1$s]发生异常，%2$s", ds.getDataSourceId(), ex.getMessage()), ex);
				}
			}
		}

		List<DeploySystem> deploySystemList = this.getServiceHubSetting().getDeploySystems();
		if (!ObjectUtils.isEmpty(deploySystemList)) {
			for (DeploySystem deploySystem : deploySystemList) {

				DeploySystem lastDeploySystem = lastDeploySystemMap.remove(deploySystem.getDeploySystemId());
				if (lastDeploySystem != null && getLoadedSystemRuntime(deploySystem.getDeploySystemId(), true) == null) {
					lastDeploySystem = null;
				}
				if (lastDeploySystem == null) {
					// 不存在，执行部署
					String strConfigId = String.format("%1$s%2$s-ver", NacosServiceHubSettingBase.DATAID_DEPLOYSYSTEM_PREFIX, deploySystem.getDeploySystemId());
					String strConfig = this.getConfig(strConfigId);
					if (strConfig == null) {
						strConfig = "";
					}
					this.deploySystemVerMap.put(strConfigId, strConfig);

					this.logEvent(LogLevels.INFO, String.format("服务总线[%1$s]安装服务系统[%2$s]", this.getId(), deploySystem.getDeploySystemId()));
					// 重新部署
					try {
						this.reloadDeploySystem(deploySystem, strConfigInfo);
					} catch (Throwable ex) {
						if (this.getServiceHubSetting().isIgnoreLoadSystemError()) {
							log.error(String.format("重新加载部署系统[%1$s]发生异常，%2$s", deploySystem.getDeploySystemId(), ex.getMessage()), ex);
						} else
							throw ex;
					}

					if (!this.deploySystemVerListenerMap.containsKey(strConfigId)) {
						IConfigListener iConfigListener = new IConfigListener() {

							@Override
							public Executor getExecutor() {
								return null;
							}

							@Override
							public void receiveConfigInfo(String configInfo) {

								String strConfig = deploySystemVerMap.get(strConfigId);
								if (configInfo == null) {
									configInfo = "";
								}
								if (configInfo.equals(strConfig)) {
									log.debug(String.format("部署系统[%1$s]接收到版本变化，但配置内容一致，忽略", deploySystem.getDeploySystemId()));
									logEvent(LogLevels.INFO, String.format("服务系统[%2$s@%1$s]接收到版本变化，但配置内容一致，忽略重新部署", getId(), deploySystem.getDeploySystemId()), deploySystem);
									return;
								}
								deploySystemVerMap.put(strConfigId, configInfo);
								log.debug(String.format("部署系统[%1$s]版本发生变化", deploySystem.getDeploySystemId()));
								logEvent(LogLevels.INFO, String.format("服务系统[%2$s@%1$s]接收到版本变化，重新部署", getId(), deploySystem.getDeploySystemId()), deploySystem);
								if (isInstalled()) {
									reloadDeploySystem(deploySystem, configInfo);

								} else {
									log.warn(String.format("服务总线未安装完成，忽略部署系统版本变化"));
								}
							}
						};
						this.addConfigListener(strConfigId, iConfigListener);
						this.deploySystemVerListenerMap.put(strConfigId, iConfigListener);
					}
				}

			}
		}

		// 卸除剩余系统
		lastDeploySystemMap.remove(DEPLOYSYSYTEMID_GATEWAY);

		for (DeploySystem deploySystem : lastDeploySystemMap.values()) {

			String strConfigId = String.format("%1$s%2$s-ver", NacosServiceHubSettingBase.DATAID_DEPLOYSYSTEM_PREFIX, deploySystem.getDeploySystemId());

			ISystemRuntime iSystemRuntime = this.getLoadedSystemRuntime(deploySystem.getDeploySystemId(), true);
			if (iSystemRuntime != null) {
				try {
					this.logEvent(LogLevels.INFO, String.format("服务总线[%1$s]移除服务系统[%2$s]", this.getId(), deploySystem.getDeploySystemId()));
					this.unregisterSystemRuntime(deploySystem, iSystemRuntime);
					this.logEvent(LogLevels.INFO, String.format("服务系统[%2$s@%1$s]卸载成功", this.getId(), deploySystem.getDeploySystemId()), deploySystem);

				} catch (Throwable ex) {
					this.logEvent(LogLevels.ERROR, String.format("服务系统[%2$s@%1$s]卸载发生异常， %3$s", this.getId(), deploySystem.getDeploySystemId(), ex.getMessage()), deploySystem);
					if (this.getServiceHubSetting().isIgnoreLoadSystemError()) {
						log.error(String.format("注销系统[%1$s]运行时对象发生异常，%2$s", deploySystem.getDeploySystemId(), ex.getMessage()), ex);
					} else {
						throw new SystemGatewayException(this, String.format("注销系统[%1$s]运行时对象发生异常，%2$s", deploySystem.getDeploySystemId(), ex.getMessage()), ex);
					}
				}
				iSystemRuntime = null;
			}

			IConfigListener iConfigListener = this.deploySystemVerListenerMap.remove(strConfigId);
			if (iConfigListener != null) {
				this.removeConfigListener(strConfigId, iConfigListener);
			}
		}
	}

	@Override
	public ISystemRuntime registerSystemRuntime(DeploySystem deploySystem) {
		Assert.notNull(deploySystem, "传入部署系统数据对象无效");
		try {
			return this.registerDeploySystem(deploySystem);
		} catch (Exception ex) {
			throw new SystemGatewayException(this, String.format("注册部署系统[%1$s]运行时发生异常，%2$s", deploySystem.getDeploySystemId(), ex.getMessage()), ex);
		}
	}

	@Override
	public void unregisterSystemRuntime(DeploySystem deploySystem) {
		Assert.notNull(deploySystem, "传入部署系统数据对象无效");
		try {
			ISystemRuntime iSystemRuntime = this.getLoadedSystemRuntime(deploySystem.getDeploySystemId(), false);
			this.unregisterSystemRuntime(deploySystem, iSystemRuntime);
		} catch (Exception ex) {
			throw new SystemGatewayException(this, String.format("注销部署系统[%1$s]运行时发生异常，%2$s", deploySystem.getDeploySystemId(), ex.getMessage()), ex);
		}
	}

	@Override
	public javax.sql.DataSource registerDynaDataSourceIf(ISystemRuntime iSystemRuntime, DataSource ds) {
		Assert.notNull(ds, "传入动态数据源数据对象无效");
		try {
			javax.sql.DataSource dataSource = this.getDataSource(ds, true);
			if (dataSource != null) {
				return dataSource;
			}
			return this.registerDataSource(ds);
		} catch (Exception ex) {
			throw new SystemGatewayException(this, String.format("注册动态数据源[%1$s]发生异常，%2$s", ds.getDataSourceId(), ex.getMessage()), ex);
		}
	}

	@Override
	public void unregisterDynaDataSource(ISystemRuntime iSystemRuntime, DataSource ds) {
		// TODO Auto-generated method stub

	}

	@Override
	public void unregisterDynaDataSources(ISystemRuntime iSystemRuntime) {
		// TODO Auto-generated method stub

	}

	@Override
	public javax.sql.DataSource registerDynaDataSource(String strCloudDataSourceId, boolean bReload, boolean bTryMode) {
		Assert.hasLength(strCloudDataSourceId, "传入动态数据源标识无效");
		try {
			javax.sql.DataSource dataSource = this.onRegisterDynaDataSource(strCloudDataSourceId, bReload, bTryMode);

			return dataSource;
		} catch (Throwable ex) {
			throw new SystemGatewayException(this, String.format("注册动态数据源[%1$s]发生异常，%2$s", strCloudDataSourceId, ex.getMessage()), ex);
		}
	}

	protected javax.sql.DataSource onRegisterDynaDataSource(String strCloudDataSourceId, boolean bReload, boolean bTryMode) throws Throwable {
		String strConfigId = String.format("%1$s%2$s", NacosServiceHubSettingBase.DATAID_DBINST_PREFIX, strCloudDataSourceId);
		String strConfig = this.getConfig(strConfigId);
		if (strConfig == null) {
			strConfig = "";
		}

		ConfigEntity configEntity = new ConfigEntity(strConfig);
		DataSource dataSource = new DataSource();
		configEntity.copyTo(dataSource);
		if (ObjectUtils.isEmpty(dataSource.getJdbcUrl())) {
			dataSource.setJdbcUrl((String) dataSource.get("url"));
		}
		dataSource.setDataSourceId(strCloudDataSourceId);

		if (bReload) {
			try {
				this.unregisterDynaDataSource(strCloudDataSourceId);
			} catch (Throwable ex) {
				log.error(String.format("注销数据源[%1$s]发生异常，%2$s", strCloudDataSourceId, ex.getMessage()), ex);
				if (!bTryMode) {
					throw new Exception(String.format("注销原有数据源发生异常，%1$s", ex.getMessage()), ex);
				}
			}
		}

		javax.sql.DataSource ds = null;
		try {
			ds = this.registerDataSource(dataSource);
		} catch (Throwable ex) {
			if (!bTryMode) {
				throw new Exception(String.format("注册数据源发生异常，%1$s", ex.getMessage()), ex);
			}
		}

		synchronized (this.dynaDataSourceListenerMap) {
			if (!this.dynaDataSourceListenerMap.containsKey(strConfigId)) {
				IConfigListener iConfigListener = new IConfigListener() {
					@Override
					public Executor getExecutor() {
						return null;
					}

					@Override
					public void receiveConfigInfo(String configInfo) {
						try {
							log.debug(String.format("数据源[%1$s]接收到配置变化，执行重新部署", strCloudDataSourceId));
							registerDynaDataSource(strCloudDataSourceId, true, true);
						} catch (Throwable ex) {
							log.error(String.format("重新部署数据源[%1$s]发生异常，%2$s", strCloudDataSourceId, ex.getMessage()), ex);
						}
					}
				};
				this.addConfigListener(strConfigId, iConfigListener);
				this.dynaDataSourceListenerMap.put(strConfigId, iConfigListener);
			}
		}

		return ds;
	}

	@Override
	public void unregisterDynaDataSource(String strCloudDataSourceId) {
		Assert.hasLength(strCloudDataSourceId, "传入动态数据源标识无效");
		try {
			onUnregisterDynaDataSource(strCloudDataSourceId);
		} catch (Throwable ex) {
			throw new SystemGatewayException(this, String.format("注销动态数据源[%1$s]发生异常，%2$s", strCloudDataSourceId, ex.getMessage()), ex);
		}
	}

	protected void onUnregisterDynaDataSource(String strCloudDataSourceId) throws Throwable {
		String strConfigId = String.format("%1$s%2$s", NacosServiceHubSettingBase.DATAID_DBINST_PREFIX, strCloudDataSourceId);
		DataSource dataSource = new DataSource();
		dataSource.setDataSourceId(strCloudDataSourceId);

		try {
			this.unregisterDataSource(dataSource);
		} catch (Throwable ex) {
			log.error(String.format("注销数据源[%1$s]发生异常，%2$s", strCloudDataSourceId, ex.getMessage()), ex);
		}

		synchronized (this.dynaDataSourceListenerMap) {
			IConfigListener iConfigListener = this.dynaDataSourceListenerMap.remove(strConfigId);
			if (iConfigListener != null) {
				this.removeConfigListener(strConfigId, iConfigListener);
			}
		}
	}

	@Override
	public boolean testDynaDataSource(DataSource ds, boolean bTryMode) throws Throwable {
		Assert.notNull(ds, "传入动态数据源数据对象无效");
		DataSource dataSource = new DataSource();
		ds.copyTo(dataSource);

		dataSource.setDataSourceId(KeyValueUtils.genUniqueId());

		try {
			this.registerDataSource(dataSource);
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			log.error(String.format("注册测试数据源[%1$s]发生异常，%2$s", ds.getJdbcUrl(), ex.getMessage()), ex);
			if (bTryMode) {
				return false;
			}
			throw ex;
		}
		try {
			this.unregisterDataSource(dataSource);
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			log.error(String.format("注销测试数据源[%1$s]发生异常，%2$s", ds.getJdbcUrl(), ex.getMessage()), ex);
		}

		return true;
	}

	protected void doMonitorDebugModelPaths() {

		for (java.util.Map.Entry<String, String> entry : this.debugModelPathMap.entrySet()) {
			try {
				File file = this.getDeploySystemModelFolder(entry.getKey(), entry.getValue(), false);
				if (file != null) {
					long nTime = this.getLastModifiedTime(file.getCanonicalPath(), "PSSYSAPP.hub.json");
					if (nTime != -1) {
						Long lastTime = debugModelPathTimestampMap.get(entry.getKey());
						if (lastTime == null) {
							this.debugModelPathTimestampMap.put(entry.getKey(), nTime);
						} else {
							if (nTime > lastTime) {
								this.debugModelPathTimestampMap.put(entry.getKey(), nTime);
								// 写入版本变化，触发重新加载
								String strConfigId = String.format("%1$s%2$s-ver", NacosServiceHubSettingBase.DATAID_DEPLOYSYSTEM_PREFIX, entry.getKey()).toLowerCase();
								Map<String, Object> map = new LinkedHashMap<String, Object>();
								map.put("publishdate", DateUtils.getCurTimeString2());

								publishConfig(strConfigId, map);
								log.debug(String.format("服务系统[%1$s]更新配置版本成功", entry.getKey()));
							}
						}
					}
				}
			} catch (Throwable ex) {
				log.error(ex);
			}
		}

		this.getHubSystemRuntime().threadRun(new Runnable() {
			@Override
			public void run() {
				doMonitorDebugModelPaths();
			}
		}, System.currentTimeMillis() + getMonitorDebugModelPathsTimer());
	}

	protected long getLastModifiedTime(String strPath, String... ignoreFileNames) {
		Path dir = Paths.get(strPath);
		Map<String, Long> map = new HashMap<String, Long>();
		map.put("", new Long(-1));
		Set<String> ignoreSet = ignoreFileNames == null ? java.util.Collections.emptySet() : Arrays.stream(ignoreFileNames).map(String::toLowerCase).collect(java.util.stream.Collectors.toSet());
		try (Stream<Path> stream = Files.walk(dir)) {
			stream.filter(Files::isRegularFile).forEach(file -> {
				if (ignoreSet.contains(file.getFileName().toString().toLowerCase()))
					return;
				try {
					// 获取文件的基本属性
					BasicFileAttributes attrs = Files.readAttributes(file, BasicFileAttributes.class);
					long nLast = map.get("");
					long nTime = attrs.lastModifiedTime().toInstant().getEpochSecond();
					if (nLast == -1 || nTime > nLast) {
						map.put("", nTime);
					}
				} catch (IOException e) {
					log.error("An I/O error occurred: " + e.getMessage());
				}
			});
		} catch (IOException e) {
			log.error("An I/O error occurred while walking the directory: " + e.getMessage());
		}
		return map.get("");
	}

	@Override
	public String getServiceUrl() {
		return String.format("http://%1$s:%2$s", this.strIPAddress, this.port);
	}

	@Override
	public String getIPAddress() {
		return this.strIPAddress;
	}

	@Override
	public int getPort() {
		return this.port;
	}

	@Override
	public String getId() {
		return this.getServiceHubSetting().getId();
	}

	@Override
	public String getInstanceId() {
		return this.strInstanceId;
	}

	protected String getLogCat() {
		return LOGCAT;
	}

	public void logEvent(int nLogLevel, String strInfo) {
		logEvent(nLogLevel, strInfo, null);
	}

	public void logEvent(int nLogLevel, String strInfo, Object objData) {
		this.logEvent(nLogLevel, LOGCAT, strInfo, objData);
	}

	/**
	 * 日志服务总线事件信息
	 * 
	 * @param nLogLevel
	 * @param strCat
	 * @param strInfo
	 * @param objData
	 */
	public void logEvent(int nLogLevel, String strCat, String strInfo, Object objData) {
		boolean bDisabled = EmployeeContext.isCurrentDisabled();
		try {
			EmployeeContext.setCurrentDisabled(true);
			IHubSystemRuntime iHubSystemRuntime = this.getHubSystemRuntime(true);
			if (iHubSystemRuntime != null) {
				if (objData instanceof DeploySystem) {
					Log log = new Log();
					log.setSystemId(((DeploySystem) objData).getDeploySystemId());
					log.set("dcsystemid", ((DeploySystem) objData).getDeploySystemId());
					objData = log;
				}
				iHubSystemRuntime.logEvent(nLogLevel, strCat, strInfo, objData);
			} else {
				switch (nLogLevel) {
				case LogLevels.INFO:
					log.info(strInfo);
					break;
				case LogLevels.DEBUG:
					log.debug(strInfo);
					break;
				case LogLevels.WARN:
					log.warn(strInfo);
					break;
				case LogLevels.ERROR:
					if (objData instanceof Throwable) {
						log.error(strInfo, (Throwable) objData);
					} else {
						log.error(strInfo);
					}
					break;
				}
			}
		} catch (Throwable ex) {
			log.error(String.format("日志事件发生异常，%1$s", ex.getMessage()), ex);
		} finally {
			EmployeeContext.setCurrentDisabled(bDisabled);
		}
	}

	protected void outputMemoryUsage() {
		// 获取平台的MBean服务器
		MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();

		// 获取MemoryMXBean
		MemoryMXBean memoryMXBean;
		try {
			memoryMXBean = ManagementFactory.newPlatformMXBeanProxy(mbs, ManagementFactory.MEMORY_MXBEAN_NAME, MemoryMXBean.class);
		} catch (IOException ex) {
			log.error(ex);
			return;
		}

		// 获取堆内存使用情况
		MemoryUsage heapMemoryUsage = memoryMXBean.getHeapMemoryUsage();
		log.debug("Heap Memory Usage:");
		log.debug("\tInit: " + heapMemoryUsage.getInit());
		log.debug("\tUsed: " + heapMemoryUsage.getUsed());
		log.debug("\tCommitted: " + heapMemoryUsage.getCommitted());
		log.debug("\tMax: " + heapMemoryUsage.getMax());

		// 获取非堆内存使用情况
		MemoryUsage nonHeapMemoryUsage = memoryMXBean.getNonHeapMemoryUsage();
		log.debug("Non-Heap Memory Usage:");
		log.debug("\tInit: " + nonHeapMemoryUsage.getInit());
		log.debug("\tUsed: " + nonHeapMemoryUsage.getUsed());
		log.debug("\tCommitted: " + nonHeapMemoryUsage.getCommitted());
		log.debug("\tMax: " + nonHeapMemoryUsage.getMax());
	}
}
