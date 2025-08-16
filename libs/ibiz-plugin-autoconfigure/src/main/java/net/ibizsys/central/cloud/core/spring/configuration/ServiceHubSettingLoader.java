package net.ibizsys.central.cloud.core.spring.configuration;

import com.alibaba.cloud.nacos.NacosConfigManager;
import com.alibaba.cloud.nacos.NacosConfigProperties;
import com.alibaba.nacos.api.config.ConfigService;
import com.baomidou.dynamic.datasource.spring.boot.autoconfigure.DataSourceProperty;
import com.baomidou.dynamic.datasource.spring.boot.autoconfigure.DynamicDataSourceProperties;
import net.ibizsys.central.cloud.core.util.NacosConfigUtils;
import net.ibizsys.central.cloud.core.util.domain.DataSource;
import net.ibizsys.central.cloud.core.util.domain.DeploySystem;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DataTypes;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.yaml.snakeyaml.Yaml;

import javax.annotation.PostConstruct;
import java.util.Map;

@Component("ServiceHubSetting")
@ConditionalOnProperty(name = "ibiz.servicehub.initmode", havingValue = "auto")
public class ServiceHubSettingLoader extends NacosServiceHubSettingBase {

    private static final Log log = LogFactory.getLog(ServiceHubSettingLoader.class);

    @Autowired
    private NacosConfigManager nacosConfigManager;
    @Autowired
    private NacosConfigProperties nacosConfigProperties;
    private boolean bLoadConfig = false;
    @Autowired
    private ServiceHubProperties localConfig;

    @Value("${system.model.profile:}")
    private String modelProfile;

    public ServiceHubSettingLoader() {
    }

    public String getId() {
        return localConfig.getId();
    }

    @PostConstruct
    public void postConstruct() {
        this.loadConfig();
    }

    private boolean localMode = false;

    public void setLocalMode(boolean localMode) {
        this.localMode = localMode;
    }

    public boolean isLocalMode() {
        return localMode;
    }

    @Override
    protected void onLoadConfig() throws Exception {
        Map config = null;
        boolean bLocal = false;
        this.setLocalMode(DataTypeUtils.getBooleanValue(localConfig.getServiceHub().get("localmode"), false));
        this.setPublishConfig(DataTypeUtils.getBooleanValue(localConfig.getServiceHub().get("publish-config"), this.isPublishConfig()));
        this.setMonitorDebugModelPathsTimer(DataTypeUtils.getIntegerValue(localConfig.getServiceHub().get("monitordebugmodelpathstimer"), this.getMonitorDebugModelPathsTimer()));

        String serviceHubConfigId = NacosServiceHubSetting.DATAID_SERVICEHUB_PREFIX + this.getId();

        if (!this.isLocalMode()) {
            ConfigService configService = this.nacosConfigManager.getConfigService();
            String content = configService.getConfig(serviceHubConfigId, this.nacosConfigProperties.getGroup(), 5000L);
            if (StringUtils.hasLength(content)) {
                Yaml yaml = new Yaml();
                config = (Map) yaml.loadAs(content, Map.class);
                this.onLoadConfig(config, bLocal);
                return;
            }
            log.warn(String.format("无法获取远程配置[%1$s]，使用本地配置文件", serviceHubConfigId));
            if(this.isPublishConfig())
                publishConfig(serviceHubConfigId,localConfig.getParsedServiceHub());
        }
        else {
            log.info(String.format("本地模式避开加载远程配置[%1$s]，使用本地application.yml配置ibiz.servicehub", serviceHubConfigId));
        }


        config = localConfig.getParsedServiceHub();
        if (config == null) {
            throw new Exception("未定义配置");
        }

        this.setRegisterNamingService(DataTypeUtils.getBooleanValue(config.get("register-naming-service"), this.isRegisterNamingService()));
        this.setPublishConfig(DataTypeUtils.getBooleanValue(config.get("publish-config"), this.isPublishConfig()));

        this.setLocalMode(DataTypeUtils.getBooleanValue(config.get("localmode"), this.isLocalMode()));

        this.setEnableDebug(DataTypeUtils.getBooleanValue(config.get("enabledebug"), this.isEnableDebug()));
        this.setEnableServiceApp(DataTypeUtils.getBooleanValue(config.get("enableserviceapp"), this.isEnableServiceApp()));
        this.setEnableServletApp(DataTypeUtils.getBooleanValue(config.get("enableservletapp"), this.isEnableServletApp()));
        this.setEnableRTCodeMode(DataTypeUtils.getBooleanValue(config.get("enablertcodemode"), this.isEnableRTCodeMode()));
        this.setEnableModelSnapshot(DataTypeUtils.getBooleanValue(config.get("enablemodelsnapshot"), this.isEnableModelSnapshot()));
        this.setEnableMergeSystem(DataTypeUtils.getBooleanValue(config.get("enablemergesystem"), this.isEnableMergeSystem()));
        this.setDebuggerCmd(DataTypeUtils.getStringValue(config.get("debuggercmd"), this.getDebuggerCmd()));
        this.setStartDebugger(DataTypeUtils.getBooleanValue(config.get("startdebugger"), this.isStartDebugger()));
        this.setWorkThreadCorePoolSize(DataTypeUtils.getIntegerValue(config.get("workthreadcorepoolsize"), this.getWorkThreadCorePoolSize()));
        this.setWorkThreadMaximumPoolSize(DataTypeUtils.getIntegerValue(config.get("workthreadmaximumpoolsize"), this.getWorkThreadMaximumPoolSize()));
        this.setWorkThreadBlockingQueueSize(DataTypeUtils.getIntegerValue(config.get("workthreadblockingqueuesize"), this.getWorkThreadBlockingQueueSize()));


        bLocal = true;



        this.onLoadConfig(config, bLocal);


    }

    @Override
    protected DeploySystem loadDeploySystemConfig(Object systemItem) throws Exception {
        DeploySystem deploySystem = null;
        if (!this.isLocalMode()) {
            deploySystem = super.loadDeploySystemConfig(systemItem, true);
            if (deploySystem == null) {
                log.warn(String.format("未找到部署系统[%1$s]远程配置", systemItem.toString()));
                deploySystem = localConfig.getParsedDeploySystems().get(systemItem);
                if (deploySystem == null)
                    throw new Exception(String.format("部署系统[%1$s]配置无效", systemItem.toString()));
                log.info(String.format("部署系统[%1$s]加载本地配置成功", systemItem.toString()));
                if(this.isPublishConfig())
                    publishConfig(DATAID_DEPLOYSYSTEM_PREFIX + systemItem.toString(), deploySystem.any());
            }
            else {
                DeploySystem localDeploySystem = localConfig.getParsedDeploySystems().get(systemItem);
                if(localDeploySystem!=null && localDeploySystem.getSettings()!=null  && deploySystem.getSettings()!=null
                        && !localDeploySystem.getSettings().containsKey("repolocked") && !"modeling".equalsIgnoreCase(modelProfile)
                        && (!ObjectUtils.isEmpty(localDeploySystem.getSettings().get("repo"))
                        || !ObjectUtils.isEmpty(localDeploySystem.getSettings().get("branch")))) {
                    deploySystem.getSettings().put("repo", localDeploySystem.getSettings().get("repo"));
                    deploySystem.getSettings().put("branch", localDeploySystem.getSettings().get("branch"));
                    log.info(String.format("部署系统[%1$s]仓库地址/分支信息发生变化，更新远程配置", systemItem.toString()));
                    if(this.isPublishConfig())
                        publishConfig(DATAID_DEPLOYSYSTEM_PREFIX + systemItem.toString(), deploySystem.any());
                }
            }
        }
        else {
            log.info(String.format("本地模式优先使用本地application.yml配置ibiz.deploysystems.%1$s",  this.getId()));
            deploySystem = localConfig.getParsedDeploySystems().get(systemItem);
            if (deploySystem == null) {
                log.warn(String.format("未找到部署系统[%1$s]本地配置", systemItem.toString()));
                deploySystem = super.loadDeploySystemConfig(systemItem, true);
                if (deploySystem == null)
                    throw new Exception(String.format("部署系统[%1$s]配置无效", systemItem.toString()));
                log.info(String.format("部署系统[%1$s]加载远程配置成功", systemItem.toString()));
            }
            else
                log.info(String.format("部署系统[%1$s]加载本地配置成功", systemItem.toString()));
        }
        return deploySystem;
    }

    @Autowired(required = false)
    DynamicDataSourceProperties dataSourceProperties;

    @Override
    protected DataSource loadDataSourceConfig(Object dataSourceItem) throws Exception {
        DataSource configEntity = super.loadDataSourceConfig(dataSourceItem);
        if (configEntity == null && dataSourceProperties != null ) {
            if(dataSourceProperties.getDatasource().containsKey(dataSourceItem.toString())) {
                DataSourceProperty dataSourceProperty = dataSourceProperties.getDatasource().get(dataSourceItem.toString());
                configEntity.setUsername(dataSourceProperty.getUsername());
                configEntity.setPassword(dataSourceProperty.getPassword());
                configEntity.setJdbcUrl(dataSourceProperty.getUrl());
                configEntity.setDriverClassName(dataSourceProperty.getDriverClassName());
            }
        }
        return configEntity;
    }



    public void publishConfig(String strConfigId, Map map) {
        Assert.hasLength(strConfigId, "传入键名无效");

        if (!this.isPublishConfig()) {
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
            throw new RuntimeException( String.format("发布配置[%1$s]发生异常，%2$s", strConfigId, ex.getMessage()), ex);
        }
    }
}
