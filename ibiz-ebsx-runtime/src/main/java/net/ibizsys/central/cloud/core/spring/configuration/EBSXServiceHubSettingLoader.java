package net.ibizsys.central.cloud.core.spring.configuration;

import com.alibaba.cloud.nacos.NacosConfigManager;
import com.alibaba.cloud.nacos.NacosConfigProperties;
import com.alibaba.nacos.api.config.ConfigService;
import net.ibizsys.central.cloud.core.util.NacosConfigUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.yaml.snakeyaml.Yaml;

import javax.annotation.PostConstruct;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;

@Component
@ConditionalOnProperty(name = "ibiz.servicehub.initmode", havingValue = "auto")
public class EBSXServiceHubSettingLoader {
    private static final Log log = LogFactory.getLog(EBSXServiceHubSettingLoader.class);

    @Autowired
    private NacosConfigManager nacosConfigManager;
    @Autowired
    private NacosConfigProperties nacosConfigProperties;
    @Autowired
    private EBSXServiceHubProperties ebsxServiceHubProperties;

    @PostConstruct
    public void postConstruct() {
        Map appMap = ebsxServiceHubProperties.getAppGatewayDefault().toMaps(true);
        if(!ObjectUtils.isEmpty(appMap))
            publishConfig("appgateway-default",appMap);

        if(!ObjectUtils.isEmpty(ebsxServiceHubProperties.getCloudAI()) ) {
            String strConfig = getConfig("cloud-ai");
            if(!StringUtils.hasLength(strConfig)) {
                publishConfig("cloud-ai",ebsxServiceHubProperties.getCloudAI(),true);
            }
        }
        if(!ObjectUtils.isEmpty(ebsxServiceHubProperties.getCloudKB()) ) {
            String strConfig = getConfig("cloud-kb");
            if(!StringUtils.hasLength(strConfig)) {
                publishConfig("cloud-kb",ebsxServiceHubProperties.getCloudKB(),true);
            }
        }
        if(!ObjectUtils.isEmpty(ebsxServiceHubProperties.getCloudOSS()) ) {
            Yaml yaml = new Yaml();
            String strConfig = getConfig("cloud-oss");
            Map config = (!StringUtils.hasLength(strConfig)) ? ebsxServiceHubProperties.getCloudOSS() : yaml.loadAs(strConfig, LinkedHashMap.class);
            boolean rewriteOssConfig = !StringUtils.hasLength(strConfig);
            String filepath = getRemoteConfigOSSFilePath();
            String hubFilepath = getRemoteConfigHubFilePath(); //读取hub配置，并移除


            if(StringUtils.hasLength(hubFilepath)) {
                // hub配置迁移到oss配置
                filepath = hubFilepath;
                config.put("filepath", filepath);
                rewriteOssConfig = true;
            }
            else if(!StringUtils.hasLength(filepath)) {
                // 双无filepath配置
                if (!StringUtils.hasLength(getConfig("cloud-devops"))) {
                    //全新安装
                    rewriteOssConfig = true;
                }
                else {
                    //ibizutil模式
                    try {
                        filepath="/app/file/datafile/gateway/ibizutil";
                        if(Files.exists(Paths.get(filepath))) {
                            config.put("filepath", filepath);
                            rewriteOssConfig = true;
                        }
                    }catch (Exception ex) {

                    }
                }

            }

            if(!config.containsKey("filepath")) {
                config.put("filepath", ebsxServiceHubProperties.getCloudOSS().getOrDefault("filepath","/app/file/oss/file"));
                rewriteOssConfig = true;
            }

            if(!config.containsKey("libreoffice")) {
                config.put("libreoffice",ebsxServiceHubProperties.getCloudOSS().get("libreoffice"));
                rewriteOssConfig = true;
            }

            if(!config.containsKey("unzip_7z")) {
                config.put("unzip_7z",ebsxServiceHubProperties.getCloudOSS().get("unzip_7z"));
                rewriteOssConfig = true;
            }


            if(rewriteOssConfig)
                publishConfig("cloud-oss",config,true);


        }

        if(!ObjectUtils.isEmpty(ebsxServiceHubProperties.getCloudDevops()))
            publishConfig("cloud-devops",ebsxServiceHubProperties.getCloudDevops());

    }

    public String getRemoteConfigHubFilePath() {
        String hubFilepath = null;
        Yaml yaml = new Yaml();
        String allinone = getConfig("servicehub-allinone");
        if(StringUtils.hasLength(allinone)){
            Map allinoneConfig = yaml.loadAs(allinone, LinkedHashMap.class);
            if(allinoneConfig.containsKey("systemsettings")) {
                Map systemsettings  = (Map)allinoneConfig.get("systemsettings");
                if(systemsettings.containsKey("cloudossutil")) {
                    Map cloudossutil  = (Map)systemsettings.get("cloudossutil");
                    if(cloudossutil.containsKey("filepath")) {
                        hubFilepath = (String)cloudossutil.remove("filepath");
                        systemsettings.remove("cloudossutil");
                        publishConfig("servicehub-allinone",allinoneConfig,true);
                    }
                }
            }
        }
        return hubFilepath;
    }

    public String getRemoteConfigOSSFilePath() {
        String filepath = null;
        Yaml yaml = new Yaml();
        String strConfig = getConfig("cloud-oss");
        if(StringUtils.hasLength(strConfig)) {
            Map config = yaml.loadAs(strConfig, LinkedHashMap.class);
            if(config.containsKey("filepath"))
                filepath = (String)config.get("filepath");
        }
        return filepath;
    }

    public void publishConfig(String strConfigId, Map map) {
        publishConfig(strConfigId,map,false);
    }
    public void publishConfig(String strConfigId, Map map, boolean rewrite) {
        Assert.hasLength(strConfigId, "传入键名无效");

        ConfigService configService = nacosConfigManager.getConfigService();
        try {
            String strLastContent = configService.getConfig(strConfigId, nacosConfigProperties.getGroup(), 5000);
            if(StringUtils.hasLength(strLastContent) && !rewrite)
                return;

            Yaml yaml = new Yaml();// 将Map转换成 YAML 字符串
            String strContent = yaml.dumpAsMap(map);


            configService.publishConfig(strConfigId, nacosConfigProperties.getGroup(), strContent, com.alibaba.nacos.api.config.ConfigType.YAML.toString());
        } catch (Exception ex) {
            log.error(String.format("发布配置[%1$s]发生异常，%2$s", strConfigId, ex.getMessage()), ex);
            throw new RuntimeException( String.format("发布配置[%1$s]发生异常，%2$s", strConfigId, ex.getMessage()), ex);
        }
    }


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
            throw new RuntimeException(String.format("获取配置[%1$s]发生异常，%2$s", strConfigId, ex.getMessage()), ex);
        }
    }

}
