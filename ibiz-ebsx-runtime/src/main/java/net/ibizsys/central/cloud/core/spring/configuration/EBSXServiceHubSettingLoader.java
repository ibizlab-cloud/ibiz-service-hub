package net.ibizsys.central.cloud.core.spring.configuration;

import com.alibaba.cloud.nacos.NacosConfigManager;
import com.alibaba.cloud.nacos.NacosConfigProperties;
import com.alibaba.nacos.api.config.ConfigService;
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
        if(!ObjectUtils.isEmpty(ebsxServiceHubProperties.getCloudDevops()))
            publishConfig("cloud-devops",ebsxServiceHubProperties.getCloudDevops());
    }

    public void publishConfig(String strConfigId, Map map) {
        Assert.hasLength(strConfigId, "传入键名无效");

        ConfigService configService = nacosConfigManager.getConfigService();
        try {
            String strLastContent = configService.getConfig(strConfigId, nacosConfigProperties.getGroup(), 5000);
            if(StringUtils.hasLength(strLastContent))
                return;

            Yaml yaml = new Yaml();// 将Map转换成 YAML 字符串
            String strContent = yaml.dumpAsMap(map);


            configService.publishConfig(strConfigId, nacosConfigProperties.getGroup(), strContent, com.alibaba.nacos.api.config.ConfigType.YAML.toString());
        } catch (Exception ex) {
            log.error(String.format("发布配置[%1$s]发生异常，%2$s", strConfigId, ex.getMessage()), ex);
            throw new RuntimeException( String.format("发布配置[%1$s]发生异常，%2$s", strConfigId, ex.getMessage()), ex);
        }
    }

}
