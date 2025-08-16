package net.ibizsys.central.cloud.core.spring.configuration;

import com.alibaba.cloud.nacos.NacosConfigManager;
import com.alibaba.cloud.nacos.NacosConfigProperties;
import com.alibaba.nacos.api.config.ConfigService;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.yaml.snakeyaml.Yaml;

import javax.annotation.PostConstruct;
import java.util.*;

@Component
@ConfigurationProperties("ibiz")
@ConditionalOnProperty(name = "ibiz.servicehub.initmode", havingValue = "auto")
public class EBSXServiceHubProperties  {
    private static final Log log = LogFactory.getLog(EBSXServiceHubProperties.class);

    @JsonProperty("appgateway-default")
    private AppGateway appGatewayDefault;

    public AppGateway getAppGatewayDefault() {
        return appGatewayDefault;
    }

    public void setAppGatewayDefault(AppGateway appGatewayDefault) {
        this.appGatewayDefault = appGatewayDefault;
    }

    @JsonProperty("cloud-devops")
    private CloudDevops cloudDevops ;

    public CloudDevops getCloudDevops() {
        return cloudDevops;
    }

    public void setCloudDevops(CloudDevops cloudDevops) {
        this.cloudDevops = cloudDevops;
    }

    public static class AppGateway {


        @JsonProperty("deployapps")
        private List<String> deployApps ;


        public List<String> getDeployApps() {
            return deployApps;
        }

        public void setDeployApps(List<String> deployApps) {
            this.deployApps = deployApps;
        }

        public Map<String,Object> toMaps(boolean gen) {
            Map<String,Object> map = new LinkedHashMap<>();
            map.put("deployapps", this.getDeployApps());
            return map;
        }

    }

    public static class CloudDevops extends HashMap<String,Object> {

        @Override
        public Object put(String s, Object o) {
            return super.put(s.toLowerCase(), o);
        }

        @Override
        public Object get(Object o) {
            Object value = super.get(o);
            if(value != null || o == null)
                return value;

            String key = o.toString().toUpperCase();
            value = super.get(key);
            if(value != null)
                return value;

            key = key.toLowerCase();
            value = super.get(key);
            if(value != null)
                return value;

            key = key.replace("-","");
            return super.get(key);
        }
    }

}
