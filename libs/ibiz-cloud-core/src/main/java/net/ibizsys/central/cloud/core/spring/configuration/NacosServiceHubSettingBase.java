package net.ibizsys.central.cloud.core.spring.configuration;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.yaml.snakeyaml.Yaml;

import com.alibaba.cloud.nacos.NacosConfigManager;
import com.alibaba.cloud.nacos.NacosConfigProperties;
import com.alibaba.nacos.api.config.ConfigService;

import net.ibizsys.central.ISystemRuntimeSetting;
import net.ibizsys.central.cloud.core.ServiceHubSettingBase;
import net.ibizsys.central.cloud.core.util.ConfigEntity;
import net.ibizsys.central.cloud.core.util.NacosConfigUtils;
import net.ibizsys.central.cloud.core.util.domain.DataSource;
import net.ibizsys.central.cloud.core.util.domain.DeploySystem;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * Nacos服务总线配置基类
 * @author lionlau
 *
 */
public abstract class NacosServiceHubSettingBase extends ServiceHubSettingBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(NacosServiceHubSettingBase.class);

	/**
	 * 数据项：服务总线前缀
	 */
	public final static String DATAID_SERVICEHUB_PREFIX = "servicehub-";
	
	/**
	 * 数据项：应用总线前缀
	 */
	public final static String DATAID_APPHUB_PREFIX = "apphub-";
	

	/**
	 * 数据项：部署系统前缀
	 */
	public final static String DATAID_DEPLOYSYSTEM_PREFIX = "deploysystem-";
	
	/**
	 * 数据项：部署应用前缀
	 */
	public final static String DATAID_DEPLOYAPP_PREFIX = "deployapp-";
	
	
	/**
	 * 数据项：数据库实例前缀
	 */
	public final static String DATAID_DBINST_PREFIX = "dbinst-";
	
	
	/**
	 * 数据项：大数据库实例前缀
	 */
	public final static String DATAID_BDINST_PREFIX = "bdinst-";
	
	/**
	 * 数据项：合并系统前缀
	 */
	public final static String DATAID_SYSTEMHUB_PREFIX = "systemhub-";
	
	
	/**
	 * 数据项：系统扩展前缀
	 */
	public final static String DATAID_SYSTEMEXTENSION_PREFIX = "systemextension-";
	
	
	/**
	 * 数据项：系统合并前缀
	 */
	public final static String DATAID_SYSTEMMERGENCES_PREFIX = "systemmergences-" ;
	
	
	/**
	 * 数据项：刷新信号前缀
	 */
	public final static String DATAID_RELOADSIGNAL_PREFIX = "reloadsignal-";
	
	
	@Autowired
	private NacosConfigManager nacosConfigManager;

	@Autowired
	private NacosConfigProperties nacosConfigProperties;


	private boolean bLoadConfig = false;
	
	public static final String DEFAULT_TEMPFOLDER = "/app/file/tempfile";
	public static final String DEFAULT_FILEFOLDER = "/app/file/datafile";
	public static final String DEFAULT_FONTFOLDER = "/usr/share/fonts";
	public static final String DEFAULT_REPORTFOLDER = "/app/file/datafile/report";
	
	private Map<String, Object> defaultSystemSettings = new LinkedHashMap<String, Object>();

	public synchronized void loadConfig() {
		if (bLoadConfig) {
			return;
		}
		try {
			onLoadConfig();
			
			bLoadConfig = true;
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	protected void onLoadConfig() throws Exception {

		ConfigService configService = nacosConfigManager.getConfigService();
		
		// 本方法启动的时候获取内容
		boolean bLocal = false;
		String content = configService.getConfig(DATAID_SERVICEHUB_PREFIX + this.getId(), this.nacosConfigProperties.getGroup(), 5000);
		if(!StringUtils.hasLength(content)) {
			log.warn(String.format("无法获取远程配置[%1$s]，使用本地配置文件", DATAID_SERVICEHUB_PREFIX + this.getId()));
			//优先获取远程配置，没有则尝试从本地获取
			content = this.getLocalConfig();
			
			if(!StringUtils.hasLength(content)) {
				throw new Exception("未定义配置");
			}
			bLocal = true;
		}
		
		Yaml yaml = new Yaml();
		Map config = yaml.loadAs(content, Map.class);

		this.onLoadConfig(config, bLocal);
		
	}
	
	@Override
	public synchronized void reloadConfig() {
		if (!bLoadConfig) {
			loadConfig();
			return;
		}
		try {
			onReloadConfig();
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}


	protected DeploySystem loadDeploySystemConfig(Object systemItem) throws Exception {
		return loadDeploySystemConfig(systemItem, false);
	}

	protected DeploySystem loadDeploySystemConfig(Object systemItem, boolean bTryMode) throws Exception {
		ConfigService configService = nacosConfigManager.getConfigService();
		Yaml yaml = new Yaml();
		String deploySystemConfig = configService.getConfig(DATAID_DEPLOYSYSTEM_PREFIX + systemItem.toString(), this.nacosConfigProperties.getGroup(), 5000);
		if (!StringUtils.hasLength(deploySystemConfig)) {
			if (bTryMode)
				return null;
			throw new Exception(String.format("部署系统[%1$s]配置无效", systemItem.toString()));
		}
		Map map2 = yaml.loadAs(deploySystemConfig, Map.class);
		DeploySystem deploySystem = new DeploySystem();
		deploySystem.putAll(map2);
		deploySystem.setDeploySystemId(systemItem.toString());
		return deploySystem;
	}

	protected DataSource loadDataSourceConfig(Object dataSourceItem) throws Exception {
		String strDBInstConfigKey = String.format("%1$s%2$s", DATAID_DBINST_PREFIX, dataSourceItem);
		String strBackupConfigId = strDBInstConfigKey;
		strDBInstConfigKey = NacosConfigUtils.getDataId(strBackupConfigId);
		if(!strBackupConfigId.equals(strDBInstConfigKey)) {
			log.warn(String.format("键名[%1$s]包含非法字符，转换至[%2$s]，可能会出现键名冲突", strBackupConfigId, strDBInstConfigKey));
		}

		ConfigService configService = nacosConfigManager.getConfigService();

		String strDBInstConfig = configService.getConfig(strDBInstConfigKey, this.nacosConfigProperties.getGroup(), 5000);
		if(!StringUtils.hasLength(strDBInstConfig)) {
			log.warn(String.format("未定义数据库实例[%1$s]配置，访问可能会出现问题", strDBInstConfigKey));
			return null;
		}

		DataSource configEntity = new DataSource();
		(new ConfigEntity(strDBInstConfig)).copyTo(configEntity);

		String strDBInstConfigExKey = String.format("%1$s%2$s-ex", DATAID_DBINST_PREFIX, dataSourceItem);
		strDBInstConfigExKey = NacosConfigUtils.getDataId(strDBInstConfigExKey);
		String strDBInstConfigEx = configService.getConfig(strDBInstConfigExKey, this.nacosConfigProperties.getGroup(), 5000);
		if(StringUtils.hasLength(strDBInstConfigExKey)) {
			(new ConfigEntity(strDBInstConfigEx)).copyTo(configEntity);
		}

		return configEntity;
	}

	/**
	 * 加载配置
	 * @param config
	 * @param bLocal 配置是否来自本地定义
	 * @throws Exception
	 */
	protected void onLoadConfig(Map config, boolean bLocal) throws Exception {
		
		Object value = config.get("enableappgateway");
		if (value != null) {
			this.setEnableAppGateway(value.toString().equalsIgnoreCase("true"));
		}
		
		if(!StringUtils.hasLength(this.getTempFolder())) {
			value = config.get("tempfolder");
			if (value != null) {
				this.setTempFolder(value.toString());
			}
		}
		
		if(!StringUtils.hasLength(this.getFileFolder())) {
			value = config.get("filefolder");
			if (value != null) {
				this.setFileFolder(value.toString());
			}
		}
		
		if(!StringUtils.hasLength(this.getFontFolder())) {
			value = config.get("fontfolder");
			if (value != null) {
				this.setFontFolder(value.toString());
			}
		}
		
		if(!StringUtils.hasLength(this.getReportFolder())) {
			value = config.get("reportfolder");
			if (value != null) {
				this.setReportFolder(value.toString());
			}
		}
		
		if(!StringUtils.hasLength(this.getLibraryFolder())) {
			value = config.get("libraryfolder");
			if (value != null) {
				this.setLibraryFolder(value.toString());
			}
		}
		
		if(!StringUtils.hasLength(this.getSystemModelFolder())) {
			value = config.get("systemmodelfolder");
			if (value != null) {
				this.setSystemModelFolder(value.toString());
			}
		}
		
		
		if(!StringUtils.hasLength(this.getTempFolder())) {
			this.setTempFolder(DEFAULT_TEMPFOLDER);
		}
		
		if(!StringUtils.hasLength(this.getFileFolder())) {
			this.setFileFolder(DEFAULT_FILEFOLDER);
		}
		
		if(!StringUtils.hasLength(this.getFontFolder())) {
			this.setFontFolder(DEFAULT_FONTFOLDER);
		}
		
		if(!StringUtils.hasLength(this.getReportFolder())) {
			this.setReportFolder(DEFAULT_REPORTFOLDER);
		}
		
		if(!StringUtils.hasLength(this.getLibraryFolder())) {
			this.setLibraryFolder(String.format("%1$s/lib", this.getFileFolder()));
		}
		
		if(!StringUtils.hasLength(this.getSystemModelFolder())) {
			this.setSystemModelFolder(String.format("%1$s/sysmodel", this.getTempFolder()));
		}
		
		if(!StringUtils.hasLength(this.getCloudPluginServiceId())) {
			value = config.get("cloudpluginserviceid");
			if (value != null) {
				this.setCloudPluginServiceId(value.toString());
			}
		}
		
		
		value = config.get("enablereloadsystem");
		if (value != null) {
			this.setEnableReloadSystem(DataTypeUtils.getBooleanValue(value, this.isEnableReloadSystem()));
		}
		
		value = config.get("enableprodmode");
		if (value != null) {
			this.setEnableProdMode(DataTypeUtils.getBooleanValue(value, this.isEnableProdMode()));
		}

		value = config.get("monitordebugmodelpathstimer");
		if (value != null) {
			this.setMonitorDebugModelPathsTimer(DataTypeUtils.getIntegerValue(value, this.getMonitorDebugModelPathsTimer()));
		}
		
		value = config.get("concurrentloadsystemmergences");
		if (value != null) {
			this.setConcurrentLoadSystemMergences(DataTypeUtils.getBooleanValue(value, this.isConcurrentLoadSystemMergences()));
		}
		
		if(this.getNode() == null) {
			value = config.get("node");
			if (value != null) {
				this.setNode(Long.valueOf(value.toString()));
			}
		}
		

		Map<String, Object> systemSettings = null;
		if (config.get("systemsettings") instanceof Map) {
			systemSettings = (Map) config.get("systemsettings");
			this.defaultSystemSettings.clear();
			this.defaultSystemSettings.putAll(systemSettings);
		}


		Object objDataSources = config.get("datasources");
		Map<String, DataSource> dataSourceMap = new HashMap<String, DataSource>();
		if (objDataSources instanceof Map) {
			List<DataSource> dataSourceList = new ArrayList<DataSource>();
			Map<String, Object> map = (Map<String, Object>) objDataSources;
			for (Map.Entry<String, Object> entry : map.entrySet()) {
				DataSource dataSource = new DataSource();
				Object objDataSource = entry.getValue();
				if(objDataSource instanceof Map) {
					
					Map<String, Object> source = (Map<String, Object>)objDataSource;
					dataSource.putAll(source);
					//进一步处理属性，这些属性将完全复制之数据源配置
					for (Map.Entry<String, Object> item : source.entrySet()) {
						String strKey = item.getKey().replace("-", "");
						if(strKey.equals(item.getKey())) {
							continue;
						}
						dataSource.set(strKey, item.getValue());
					}
					
					if (ObjectUtils.isEmpty(dataSource.getDriverClassName())) {
						dataSource.setDriverClassName((String) dataSource.get("driver-class-name"));
					}
				}
				else {
					DataSource configEntity = loadDataSourceConfig(objDataSource);
					if(configEntity != null)
						configEntity.copyTo(dataSource);
				}
				
				if (ObjectUtils.isEmpty(dataSource.getJdbcUrl())) {
					dataSource.setJdbcUrl((String) dataSource.get("url"));
				}
				dataSource.setDataSourceId(entry.getKey());
				
				dataSourceList.add(dataSource);
				
				dataSourceMap.put(dataSource.getDataSourceId(), dataSource);
			}
			this.setDataSources(dataSourceList);
		}
		

		Object objDeploySystems = config.get("deploysystems");
		if (objDeploySystems instanceof List) {
			List<DeploySystem> deploySystemList = new ArrayList<DeploySystem>();
			List list = (List) objDeploySystems;
			for (Object item : list) {
				if (ObjectUtils.isEmpty(item)) {
					continue;
				}
				
				//判断是否指定接口
				String strEnableAPIs = "";
				String strItem = item.toString();
				int nPos = strItem.indexOf(":");
				if(nPos != -1) {
					item = strItem.substring(0, nPos);
					strEnableAPIs = strItem.substring(nPos + 1);
				}

				DeploySystem deploySystem =  loadDeploySystemConfig(item);
				
				if(this.getSystemRuntimeClass()!=null) {
					String strSystemRuntimeClass = this.getSystemRuntimeClass().get(item);
					if(StringUtils.hasLength(strSystemRuntimeClass)) {
						deploySystem.setRuntimeClassName(strSystemRuntimeClass);
					}
				}
				
				// 合并设置
				if (systemSettings != null) {
					Map<String, Object> settings = new HashMap<String, Object>();
					settings.putAll(systemSettings);
					if (deploySystem.getSettings() != null) {
						settings.putAll(deploySystem.getSettings());
					}
					deploySystem.setSettings(settings);
				}
				
				//放入启动接口
				if(StringUtils.hasLength(strEnableAPIs)) {
					if(deploySystem.getSettings()==null) {
						deploySystem.setSettings(new HashMap<String, Object>());
					}
					deploySystem.getSettings().put(ISystemRuntimeSetting.PARAM_ENABLEAPIS, strEnableAPIs);
					//deploySystem.setAPIs(Arrays.asList(strInterfaces.split("[;]")));
				}
				
				//判断是否存在默认数据源
				String strDefaultDBInstTag = String.format("%1$s__default", deploySystem.getDeploySystemId());
				if(dataSourceMap.containsKey(strDefaultDBInstTag)) {
					if(deploySystem.getSettings()==null) {
						deploySystem.setSettings(new HashMap<String, Object>());
					}
					deploySystem.getSettings().put(ISystemRuntimeSetting.PARAM_DEFAULTDBINSTTAG, strDefaultDBInstTag);
				}
				
				
				
				deploySystemList.add(deploySystem);
			}
			this.setDeploySystems(deploySystemList);
		}
		
	}
	
	protected void onReloadConfig() throws Exception {

		ConfigService configService = nacosConfigManager.getConfigService();
		
		String content = configService.getConfig(DATAID_SERVICEHUB_PREFIX + this.getId(), this.nacosConfigProperties.getGroup(), 5000);
		if(!StringUtils.hasLength(content)) {
			throw new Exception("未定义配置");
		}
		
		Yaml yaml = new Yaml();
		Map config = yaml.loadAs(content, Map.class);

		this.onReloadConfig(config);
		
	}
	
	/**
	 * 重新 加载配置
	 * @param config
	 * @throws Exception
	 */
	protected void onReloadConfig(Map config) throws Exception {
		
		Map<String, Object> systemSettings = null;
		if (config.get("systemsettings") instanceof Map) {
			systemSettings = (Map) config.get("systemsettings");
		}
		
		Object objDataSources = config.get("datasources");
		Map<String, DataSource> dataSourceMap = new HashMap<String, DataSource>();
		if (objDataSources instanceof Map) {
			List<DataSource> dataSourceList = new ArrayList<DataSource>();
			Map<String, Object> map = (Map<String, Object>) objDataSources;
			for (Map.Entry<String, Object> entry : map.entrySet()) {
				DataSource dataSource = new DataSource();
				Object objDataSource = entry.getValue();
				if(objDataSource instanceof Map) {
					
					Map<String, Object> source = (Map<String, Object>)objDataSource;
					dataSource.putAll(source);
					//进一步处理属性，这些属性将完全复制之数据源配置
					for (Map.Entry<String, Object> item : source.entrySet()) {
						String strKey = item.getKey().replace("-", "");
						if(strKey.equals(item.getKey())) {
							continue;
						}
						dataSource.set(strKey, item.getValue());
					}
					
					if (ObjectUtils.isEmpty(dataSource.getDriverClassName())) {
						dataSource.setDriverClassName((String) dataSource.get("driver-class-name"));
					}
				}
				else {
					DataSource configEntity = loadDataSourceConfig(objDataSource);
					if(configEntity != null)
						configEntity.copyTo(dataSource);
				}
				
				if (ObjectUtils.isEmpty(dataSource.getJdbcUrl())) {
					dataSource.setJdbcUrl((String) dataSource.get("url"));
				}
				dataSource.setDataSourceId(entry.getKey());
				
				dataSourceList.add(dataSource);
				
				dataSourceMap.put(dataSource.getDataSourceId(), dataSource);
			}
			this.setDataSources(dataSourceList);
		}
		else {
			this.setDataSources(new ArrayList<DataSource>());
		}
		
		
		Object objDeploySystems = config.get("deploysystems");
		if (objDeploySystems instanceof List) {
			List<DeploySystem> deploySystemList = new ArrayList<DeploySystem>();
			List list = (List) objDeploySystems;
			for (Object item : list) {
				if (ObjectUtils.isEmpty(item)) {
					continue;
				}
				
				//判断是否指定接口
				String strEnableAPIs = "";
				String strItem = item.toString();
				int nPos = strItem.indexOf(":");
				if(nPos != -1) {
					item = strItem.substring(0, nPos);
					strEnableAPIs = strItem.substring(nPos + 1);
				}

				DeploySystem deploySystem =  loadDeploySystemConfig(item);
				
				// 合并设置
				if (systemSettings != null) {
					Map<String, Object> settings = new HashMap<String, Object>();
					settings.putAll(systemSettings);
					if (deploySystem.getSettings() != null) {
						settings.putAll(deploySystem.getSettings());
					}
					deploySystem.setSettings(settings);
				}
				
				//放入启动接口
				if(StringUtils.hasLength(strEnableAPIs)) {
					if(deploySystem.getSettings()==null) {
						deploySystem.setSettings(new HashMap<String, Object>());
					}
					deploySystem.getSettings().put(ISystemRuntimeSetting.PARAM_ENABLEAPIS, strEnableAPIs);
					//deploySystem.setAPIs(Arrays.asList(strInterfaces.split("[;]")));
				}
				
				//判断是否存在默认数据源
				String strDefaultDBInstTag = String.format("%1$s__default", deploySystem.getDeploySystemId());
				if(dataSourceMap.containsKey(strDefaultDBInstTag)) {
					if(deploySystem.getSettings()==null) {
						deploySystem.setSettings(new HashMap<String, Object>());
					}
					deploySystem.getSettings().put(ISystemRuntimeSetting.PARAM_DEFAULTDBINSTTAG, strDefaultDBInstTag);
				}
				
				deploySystemList.add(deploySystem);
			}
			this.setDeploySystems(deploySystemList);
		}
		else {
			this.setDeploySystems(new ArrayList<DeploySystem>());
		}
		
	}
	

	
	/**
	 * 获取本地配置
	 * @return
	 * @throws Exception
	 */
	protected String getLocalConfig() throws Exception{
		//优先获取远程配置，没有则尝试从本地获取
		try(InputStream is = this.getClass().getResourceAsStream("/servicehub.yml")){
			if(is != null) {
				return IOUtils.toString(is, "UTF-8");
			}
		}
		
		return null;
	}
	
	@Override
	public Map<String, Object> getDefaultSystemSettings() {
		return this.defaultSystemSettings;
	}
}
