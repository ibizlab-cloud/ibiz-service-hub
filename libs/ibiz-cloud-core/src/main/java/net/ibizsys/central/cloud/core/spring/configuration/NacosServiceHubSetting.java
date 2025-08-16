package net.ibizsys.central.cloud.core.spring.configuration;

import javax.annotation.PostConstruct;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("ServiceHubSetting")
@ConfigurationProperties(NacosServiceHubSetting.PREFIX)
@ConditionalOnProperty(name = "ibiz.servicehub.initmode", havingValue = "manual", matchIfMissing = true)
public class NacosServiceHubSetting extends NacosServiceHubSettingBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(NacosServiceHubSetting.class);

	@PostConstruct
	public void postConstruct() {
		loadConfig();
	}
	
}
