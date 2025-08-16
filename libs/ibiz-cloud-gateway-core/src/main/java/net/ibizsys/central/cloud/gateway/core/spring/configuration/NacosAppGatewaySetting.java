package net.ibizsys.central.cloud.gateway.core.spring.configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.gateway.event.RefreshRoutesEvent;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.cloud.gateway.route.RouteDefinitionRepository;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.yaml.snakeyaml.Yaml;

import com.alibaba.cloud.nacos.NacosConfigManager;
import com.alibaba.cloud.nacos.NacosConfigProperties;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.listener.Listener;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.gateway.core.AppGatewaySettingBase;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Component("AppGatewaySetting")
@ConfigurationProperties(NacosAppGatewaySetting.PREFIX)
public class NacosAppGatewaySetting  extends AppGatewaySettingBase implements RouteDefinitionRepository{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(NacosAppGatewaySetting.class);
	private static ObjectMapper MAPPER = new ObjectMapper();
	
	/**
	 * 数据项：应用网关前缀
	 */
	public final static String DATAID_APPGATEWAY_PREFIX = "appgateway-";
	
	
	/**
	 * 数据项：部署应用前缀
	 */
	public final static String DATAID_DEPLOYAPP_PREFIX = "deployapp-";
	
	
	
	
	@Autowired 
    private NacosConfigManager nacosConfigManager; 
	
	@Autowired 
	NacosConfigProperties nacosConfigProperties;
	
	@Autowired 
	ApplicationEventPublisher applicationEventPublisher;
	

	private Map<String, List<RouteDefinition>> routeDefinitionListMap = new HashMap<String, List<RouteDefinition>>();
	private List<RouteDefinition> cacheRouteDefinitionList = new ArrayList<>();
	private List<RouteDefinition> emptyRouteDefinitionList = new ArrayList<>();
	private Map<String, String> routeContentMap = new HashMap<String, String>();
	private List<Object> deployAppList = new ArrayList<>();
	private Map<String, List<Listener>> deployAppListenerMap = new HashMap<String, List<Listener>>();
 
	@PostConstruct
	public void postConstruct() {
		loadConfig();
	}
	
	private boolean bLoadConfig = false;
	public synchronized void loadConfig() {
		if(bLoadConfig) {
			return ;
		}
		try {
			onLoadConfig();
			bLoadConfig = true;
		}
		catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	
	protected void onLoadConfig() throws Exception {
		
		
		ConfigService configService = nacosConfigManager.getConfigService();
		
		String content = configService.getConfig(DATAID_APPGATEWAY_PREFIX + this.getId(), this.nacosConfigProperties.getGroup(), 5000);

		this.cacheRouteDefinitionList = reloadGatewayConfig(true, content);
		
		configService.addListener(DATAID_APPGATEWAY_PREFIX + this.getId(), this.nacosConfigProperties.getGroup(), new Listener() {

			@Override
			public Executor getExecutor() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void receiveConfigInfo(String configInfo) {
				onReceiveGatewayConfigInfo(DATAID_APPGATEWAY_PREFIX + getId(), configInfo);
			}
			
		});
		
		final List<Object> list = this.deployAppList;
		for(Object item : list) {
			if(ObjectUtils.isEmpty(item)) {
				continue;
			}
			String strItem = item.toString();
			addDeployAppConfigListenerIf(configService, strItem);
		}
		

	}
	
	protected synchronized void addDeployAppConfigListenerIf(ConfigService configService, String strItem) throws Exception{
		if(deployAppListenerMap.containsKey(strItem)) {
			return;
		}
		
		Listener l1 = new Listener() {
			@Override
			public Executor getExecutor() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void receiveConfigInfo(String configInfo) {
				onReceiveDeployAppConfigInfo(DATAID_DEPLOYAPP_PREFIX + strItem, configInfo);
			}
		};
		
		Listener l2 = new Listener() {
			@Override
			public Executor getExecutor() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void receiveConfigInfo(String configInfo) {
				onReceiveDeployAppConfigInfo(DATAID_DEPLOYAPP_PREFIX + strItem + "-ex", configInfo);
			}
		};
		
//		Listener l3 = new Listener() {
//			@Override
//			public Executor getExecutor() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//			@Override
//			public void receiveConfigInfo(String configInfo) {
//				onReceiveDeployAppConfigInfo(DATAID_DEPLOYAPP_PREFIX + strItem + "-dm", configInfo);
//			}
//		};
		
		
		configService.addListener(DATAID_DEPLOYAPP_PREFIX + strItem, this.nacosConfigProperties.getGroup(), l1);
		configService.addListener(DATAID_DEPLOYAPP_PREFIX + strItem + "-ex", this.nacosConfigProperties.getGroup(), l2);
		//configService.addListener(DATAID_DEPLOYAPP_PREFIX + strItem + "-dm", this.nacosConfigProperties.getGroup(), l3);
		log.debug(String.format("监控部署应用[%1$s]配置变化", strItem));
		//deployAppListenerMap.put(strItem, Arrays.asList(l1, l2, l3));
		deployAppListenerMap.put(strItem, Arrays.asList(l1, l2));
	}
	
	protected synchronized void removeDeployAppConfigListenerIf(ConfigService configService, String strItem) throws Exception{
		
		List<Listener> listeners = deployAppListenerMap.get(strItem);
		if(deployAppListenerMap == null) {
			return;
		}
		
		configService.removeListener(DATAID_DEPLOYAPP_PREFIX + strItem, this.nacosConfigProperties.getGroup(), listeners.get(0));
		configService.removeListener(DATAID_DEPLOYAPP_PREFIX + strItem + "-ex", this.nacosConfigProperties.getGroup(), listeners.get(1));
		//configService.removeListener(DATAID_DEPLOYAPP_PREFIX + strItem + "-dm", this.nacosConfigProperties.getGroup(), listeners.get(2));
		log.debug(String.format("取消监控部署应用[%1$s]配置变化", strItem));
		deployAppListenerMap.remove(strItem);
	}
	
	
	protected synchronized void refreshDeployAppConfigListeners(ConfigService configService, List<Object> items) throws Exception{
		
		Map<String, List<Listener>> deployAppListenerMap2 = new HashMap<String, List<Listener>>();
		deployAppListenerMap2.putAll(this.deployAppListenerMap);
		
		if(!ObjectUtils.isEmpty(items)) {
			for(Object item : items) {
				if(ObjectUtils.isEmpty(item)) {
					continue;
				}
				String strItem = item.toString();
				this.addDeployAppConfigListenerIf(configService, strItem);
				deployAppListenerMap2.remove(strItem);
			}
		}
		if(!ObjectUtils.isEmpty(deployAppListenerMap2)) {
			for(java.util.Map.Entry<String, List<Listener>> entry : deployAppListenerMap2.entrySet()) {
				String strItem = entry.getKey();
				removeDeployAppConfigListenerIf(configService, strItem);
			}
		}
	}
	
	protected List<RouteDefinition> getRouteDefinitionList(String strContent) throws Exception{
		if(strContent.indexOf("{") == 0){
			ObjectNode objectNode = (ObjectNode) MAPPER.readTree(strContent);
			JsonNode routesNode = objectNode.get("routes");
			if(routesNode == null) {
				return null;
			}
			return MAPPER.convertValue(routesNode, new TypeReference<List<RouteDefinition>>() {});
		}
		else {
			Yaml yaml = new Yaml();
			Map config = yaml.loadAs(strContent, Map.class);
			if(config == null) {
				return null;
			}
			Object value = config.get("routes");
			if(value == null) {
				return null;
			}
			return MAPPER.convertValue(value, new TypeReference<List<RouteDefinition>>() {});
		}
	}

	protected synchronized void onReceiveGatewayConfigInfo(String strId, String configInfo) {
		log.debug(String.format("配置项[%1$s]触发变化", strId));
		String strLastContent = routeContentMap.get(strId);
		if(StringUtils.hasLength(strLastContent) && StringUtils.hasLength(configInfo)) {
			if(strLastContent.equals(configInfo)) {
				log.debug(String.format("内容没有变化，忽略刷新"));
				return;
			}
		}
		try {
			this.cacheRouteDefinitionList = reloadGatewayConfig(false, configInfo);
		}
		catch(Exception ex) {
			log.error(String.format("刷新网关配置发生异常，%1$s", ex.getMessage()), ex);
			return;
		}
		
		applicationEventPublisher.publishEvent(new RefreshRoutesEvent(this));
	}
	
	protected synchronized void onReceiveDeployAppConfigInfo(String strId, String configInfo) {
		log.debug(String.format("配置项[%1$s]触发变化", strId));
		String strLastContent = routeContentMap.get(strId);
		if(StringUtils.hasLength(strLastContent) && StringUtils.hasLength(configInfo)) {
			if(strLastContent.equals(configInfo)) {
				log.debug(String.format("内容没有变化，忽略刷新"));
				return;
			}
		}
		try {
			this.cacheRouteDefinitionList = reloadDeployAppConfig(strId, configInfo);
		}
		catch(Exception ex) {
			log.error(String.format("刷新网关配置发生异常，%1$s", ex.getMessage()), ex);
			return;
		}
		
		applicationEventPublisher.publishEvent(new RefreshRoutesEvent(this));
	}
	
	protected synchronized List<RouteDefinition> reloadGatewayConfig(boolean bFirst, String configInfo) throws Exception {
		
		routeContentMap.put(DATAID_APPGATEWAY_PREFIX + this.getId(), configInfo);
		
		Yaml yaml = new Yaml();
		Map config = yaml.loadAs(configInfo, Map.class);
		if(bFirst) {
			Object value = config.get("tempfolder");
			if(value != null) {
				this.setTempFolder(value.toString());
			}
			value = config.get("filefolder");
			if(value != null) {
				this.setFileFolder(value.toString());
			}
		}

		Object value = config.get("routes");
		routeDefinitionListMap.put(DATAID_APPGATEWAY_PREFIX + this.getId(), null);
		if(value != null) {
			List<RouteDefinition> routeDefinitionList = MAPPER.convertValue(value, new TypeReference<List<RouteDefinition>>() {});
			if(routeDefinitionList != null) {
				routeDefinitionListMap.put(DATAID_APPGATEWAY_PREFIX + this.getId(), routeDefinitionList);
			}
		}
		
		ConfigService configService = nacosConfigManager.getConfigService();
		Object objDeployApps = config.get("deployapps");
		if(objDeployApps instanceof List) {
			this.deployAppList = (List)objDeployApps;
		}
		else {
			this.deployAppList = new ArrayList<>();
		}
		final List<Object> list = this.deployAppList;
		for(Object item : list) {
			if(ObjectUtils.isEmpty(item)) {
				continue;
			}
			String strItem = item.toString();
			String deployAppConfig = configService.getConfig(DATAID_DEPLOYAPP_PREFIX + strItem, this.nacosConfigProperties.getGroup(), 5000);
			routeContentMap.put(DATAID_DEPLOYAPP_PREFIX + strItem, deployAppConfig);
			routeDefinitionListMap.put(DATAID_DEPLOYAPP_PREFIX + strItem, null);
			
			if(StringUtils.hasLength(deployAppConfig)) {
				List<RouteDefinition> routeDefinitionList = this.getRouteDefinitionList(deployAppConfig);
				if(routeDefinitionList != null) {
					routeDefinitionListMap.put(DATAID_DEPLOYAPP_PREFIX + strItem, routeDefinitionList);
				}
			}
			else {
				log.warn(String.format("部署应用[%1$s]未提供配置", item));
			}
			
			//用户扩展配置
			deployAppConfig = configService.getConfig(DATAID_DEPLOYAPP_PREFIX + strItem+"-ex", this.nacosConfigProperties.getGroup(), 5000);
			routeContentMap.put(DATAID_DEPLOYAPP_PREFIX + strItem+"-ex", deployAppConfig);
			routeDefinitionListMap.put(DATAID_DEPLOYAPP_PREFIX + strItem+"-ex", null);
			if(StringUtils.hasLength(deployAppConfig)) {
				List<RouteDefinition> routeDefinitionList = this.getRouteDefinitionList(deployAppConfig);
				if(routeDefinitionList != null) {
					routeDefinitionListMap.put(DATAID_DEPLOYAPP_PREFIX + strItem+"-ex", routeDefinitionList);
				}
			}
			
			//动态模型配置
//			deployAppConfig = configService.getConfig(DATAID_DEPLOYAPP_PREFIX + strItem+"-dm", this.nacosConfigProperties.getGroup(), 5000);
//			routeContentMap.put(DATAID_DEPLOYAPP_PREFIX + strItem+"-dm", deployAppConfig);
//			routeDefinitionListMap.put(DATAID_DEPLOYAPP_PREFIX + strItem+"-dm", null);
//			if(StringUtils.hasLength(deployAppConfig)) {
//				List<RouteDefinition> routeDefinitionList = this.getRouteDefinitionList(deployAppConfig);
//				if(routeDefinitionList != null) {
//					routeDefinitionListMap.put(DATAID_DEPLOYAPP_PREFIX + strItem+"-dm", routeDefinitionList);
//				}
//			}
		}
		
		refreshDeployAppConfigListeners(configService, list);
		
		return this.getAllRouteDefinitionList();
	}
	
	protected synchronized List<RouteDefinition> reloadDeployAppConfig(String strConfigId, String configInfo) throws Exception {
		
		routeContentMap.put(strConfigId, configInfo);
		routeDefinitionListMap.put(strConfigId, null);
		if(StringUtils.hasLength(configInfo)) {
			List<RouteDefinition> routeDefinitionList = this.getRouteDefinitionList(configInfo);
			if(routeDefinitionList != null) {
				routeDefinitionListMap.put(strConfigId, routeDefinitionList);
			}
		}
		
		return this.getAllRouteDefinitionList();
	}
	
	protected synchronized List<RouteDefinition> getAllRouteDefinitionList() {
		List<RouteDefinition> allRouteDefinitionList = new ArrayList<>();
		
		List<RouteDefinition> routeDefinitionList = routeDefinitionListMap.get(DATAID_APPGATEWAY_PREFIX + this.getId());
		if(routeDefinitionList != null) {
			allRouteDefinitionList.addAll(routeDefinitionList);
		}
		
		
		final List<Object> list = this.deployAppList;
		for(Object item : list) {
			if(ObjectUtils.isEmpty(item)) {
				continue;
			}
			String strItem = item.toString();
			routeDefinitionList = routeDefinitionListMap.get(DATAID_DEPLOYAPP_PREFIX + strItem);
			if(routeDefinitionList != null) {
				allRouteDefinitionList.addAll(routeDefinitionList);
			}
			routeDefinitionList = routeDefinitionListMap.get(DATAID_DEPLOYAPP_PREFIX + strItem + "-ex");
			if(routeDefinitionList != null) {
				allRouteDefinitionList.addAll(routeDefinitionList);
			}
//			routeDefinitionList = routeDefinitionListMap.get(DATAID_DEPLOYAPP_PREFIX + strItem + "-dm");
//			if(routeDefinitionList != null) {
//				allRouteDefinitionList.addAll(routeDefinitionList);
//			}
		}
		
		return allRouteDefinitionList;
	}


	@Override
	public Flux<RouteDefinition> getRouteDefinitions() {
		
		List<RouteDefinition> routeDefinitionList = this.cacheRouteDefinitionList;
		if(routeDefinitionList != null) {
			return Flux.fromIterable(routeDefinitionList) ;
		}
		else {
			return Flux.fromIterable(emptyRouteDefinitionList) ;
		}
	//	List<RouteDefinition> routeDefinitions = new ArrayList<RouteDefinition>();
		
		
//		try {
//			List<RouteDefinition> routeDefinitions = new ArrayList<RouteDefinition>();
//			return Flux.fromIterable( routeDefinitions) ;
//			}catch (NacosException e) {
//			log.error( "getRouteDefinitions by nacos error" , e);
//			}
//			return Flux.fromIterable(new ArrayList());
//
//		return null;
	}


	@Override
	public Mono<Void> save(Mono<RouteDefinition> route) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Mono<Void> delete(Mono<String> routeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
