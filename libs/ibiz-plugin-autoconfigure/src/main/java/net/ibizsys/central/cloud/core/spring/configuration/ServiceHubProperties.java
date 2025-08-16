package net.ibizsys.central.cloud.core.spring.configuration;

import com.baomidou.dynamic.datasource.spring.boot.autoconfigure.DataSourceProperty;
import com.baomidou.dynamic.datasource.spring.boot.autoconfigure.DynamicDataSourceProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.ibizsys.central.cloud.core.util.domain.DataSource;
import net.ibizsys.central.cloud.core.util.domain.DeploySystem;
import net.ibizsys.runtime.util.EntityBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@ConfigurationProperties("ibiz")
@ConditionalOnProperty(name = "ibiz.servicehub.initmode", havingValue = "auto")
public class ServiceHubProperties extends EntityBase {


    @Autowired(required = false)
    DynamicDataSourceProperties dataSourceProperties;

    public String getId() {
        return this.getServiceHub().getOrDefault("id", "").toString();
    }

    @JsonProperty("deploysystems")
    private Map<String,DeploySystem> deploySystems ;


    @JsonProperty("servicehub")
    private ServiceHub serviceHub ;

    @JsonIgnore
    private String defaultDefaultSystemId ;


    public void setDeploySystems(Map<String, DeploySystem> deploySystems) {
        this.deploySystems = deploySystems;
    }

    public Map<String, DeploySystem> getDeploySystems() {
        return deploySystems;
    }

    public ServiceHub getServiceHub() {
        return serviceHub;
    }

    public void setServiceHub(ServiceHub serviceHub) {
        this.serviceHub = serviceHub;
    }


    public static class ServiceHub extends HashMap<String,Object> {

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

    @JsonIgnore
    private boolean isParsed;

    @JsonIgnore
    private ServiceHub parsedServiceHub;

    @JsonIgnore
    private Map<String, DeploySystem> parsedDeploySystems;

    public ServiceHub getParsedServiceHub() {
        parse();
        return parsedServiceHub;
    }

    public Map<String, DeploySystem> getParsedDeploySystems() {
        parse();
        return parsedDeploySystems;
    }

    public synchronized void parse() {
        if(!isParsed) {
            if (parsedServiceHub == null) {
                parsedServiceHub = new ServiceHub();
                parsedServiceHub.putAll(this.getServiceHub());
            }
            if (parsedDeploySystems == null) {
                parsedDeploySystems = new LinkedHashMap();
            }

            DeploySystem master = this.getDeploySystems().getOrDefault("master",new DeploySystem());
            if(StringUtils.hasLength(master.getDeploySystemId())) {
                defaultDefaultSystemId = master.getDeploySystemId();
            }
            else {
                this.getDeploySystems().keySet().forEach(key->{
                    if(!"gateway".equalsIgnoreCase(key) && !StringUtils.hasLength(defaultDefaultSystemId))
                        defaultDefaultSystemId = key;
                });
            }

            if(StringUtils.hasLength(defaultDefaultSystemId)) {
                if(this.getDeploySystems().containsKey(defaultDefaultSystemId))
                    this.getDeploySystems().get(defaultDefaultSystemId).copyTo(master);
                parsedDeploySystems.put(defaultDefaultSystemId,master);
            }


            this.getDeploySystems().entrySet().forEach(entry->{
                DeploySystem value = entry.getValue();
                String key = value.getDeploySystemId();
                if(!StringUtils.hasLength(key)) {
                    key = entry.getKey();
                    value.setDeploySystemId(key);
                }
                if("master".equals(entry.getKey()))
                    return;
                if(StringUtils.hasLength(defaultDefaultSystemId) &&
                        (defaultDefaultSystemId.equalsIgnoreCase(key)||defaultDefaultSystemId.equalsIgnoreCase(value.getDeploySystemId())))
                    return;
                parsedDeploySystems.put(key,value);
            });

            Object _deploysystems = this.getServiceHub().get("deploysystems");
            if (_deploysystems instanceof Map) {
                Collection<?> values = ((Map<?, ?>) _deploysystems).values();
                parsedServiceHub.put("deploysystems", values.stream()
                        .map(Object::toString)
                        .collect(Collectors.toList()));
            }
            Map<String,Object> _datasources = (Map<String,Object>)this.getServiceHub().getOrDefault("datasources", new LinkedHashMap<>());

            if (ObjectUtils.isEmpty(_datasources) || _datasources.containsKey("master")) {
                if (StringUtils.hasLength(this.defaultDefaultSystemId)) {
                    //准备处理默认数据源  {system}__default
                    Map<String, String> datasource = new LinkedHashMap<>();

                    //从spring baomidou 多数据源 中获取 master 打底
                    if(dataSourceProperties.getDatasource().containsKey("master")) {
                        DataSourceProperty dataSourceProperty = dataSourceProperties.getDatasource().get("master");
                        datasource.put(DataSource.FIELD_USERNAME, dataSourceProperty.getUsername());
                        datasource.put(DataSource.FIELD_PASSWORD, dataSourceProperty.getPassword());
                        datasource.put("url", dataSourceProperty.getUrl());
                        datasource.put("driver-class-name", dataSourceProperty.getDriverClassName());
                    }

                    //合并进yml中预置的 ibiz.servicehub.datasources中的master数据源
                    Object masterDatasource = _datasources.get("master");
                    if(masterDatasource instanceof Map) {
                        ((Map<?, ?>) masterDatasource).entrySet().forEach(entry -> {
                            if(!ObjectUtils.isEmpty(entry.getValue())) {
                                datasource.put(entry.getKey().toString(),entry.getValue().toString());
                            }
                        });
                    }

                    //合并进特定设置的 ibiz.servicehub.{system}__default 数据源
                    String defaultDataSourceId = String.format("%1$s__default", defaultDefaultSystemId);
                    Object defaultDatasource = _datasources.get(defaultDataSourceId);
                    if(defaultDatasource instanceof Map) {
                        ((Map<?, ?>) defaultDatasource).entrySet().forEach(entry -> {
                            if(!ObjectUtils.isEmpty(entry.getValue())) {
                                datasource.put(entry.getKey().toString(),entry.getValue().toString());
                            }
                        });
                    }

                    datasource.put(DataSource.FIELD_DATASOURCEID, defaultDataSourceId);



                    Map<String, Object> datasources = new LinkedHashMap<>();
                    datasources.put(defaultDataSourceId, datasource);

                    _datasources.entrySet().forEach(entry -> {
                        if("master".equalsIgnoreCase(entry.getKey())
                                ||defaultDataSourceId.equalsIgnoreCase(entry.getKey())
                                ||ObjectUtils.isEmpty(entry.getValue())
                        )
                            return;
                        if (entry.getValue() instanceof Map) {
                            Map ds = (Map)entry.getValue();
                            if(ObjectUtils.isEmpty(ds.get(DataSource.FIELD_USERNAME))
                                    ||ObjectUtils.isEmpty(ds.get(DataSource.FIELD_PASSWORD))
                                    ||ObjectUtils.isEmpty(ds.get("url")))
                                return;
                        }
                        datasources.put(entry.getKey(), entry.getValue());
                    });

                    parsedServiceHub.put("datasources", datasources);
                }
            }
            isParsed = true;
        }
    }

}
