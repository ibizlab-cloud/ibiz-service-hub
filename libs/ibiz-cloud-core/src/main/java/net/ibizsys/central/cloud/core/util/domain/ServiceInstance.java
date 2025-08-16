package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 服务实例数据对象
 * @author lionlau
 *
 */
public class ServiceInstance extends EntityBase {

	
	/**
	 * 服务名称
	 */
	public final static String FIELD_SERVICENAME = "servicename";
	  
	
	/**
	 *IP 地址
	 */
	public final static String FIELD_IP = "ip";
	
	
	
	/**
	 * 端口
	 */
	public final static String FIELD_PORT = "port";
	
	
	
    @JsonIgnore
    public ServiceInstance setServiceName(String val) {
        this.set(FIELD_SERVICENAME, val);
        return this;
    }

    
    @JsonIgnore
    public String getServiceName() {
        return (String) this.get(FIELD_SERVICENAME);
    }

   
    @JsonIgnore
    public boolean containsServiceName() {
        return this.contains(FIELD_SERVICENAME);
    }

   
    @JsonIgnore
    public ServiceInstance resetServiceName() {
        this.reset(FIELD_SERVICENAME);
        return this;
    }

	
    @JsonIgnore
    public ServiceInstance setIp(String val) {
        this.set(FIELD_IP, val);
        return this;
    }

    
    @JsonIgnore
    public String getIp() {
        return (String) this.get(FIELD_IP);
    }

   
    @JsonIgnore
    public boolean containsIp() {
        return this.contains(FIELD_IP);
    }

   
    @JsonIgnore
    public ServiceInstance resetIp() {
        this.reset(FIELD_IP);
        return this;
    }
    
    
    @JsonIgnore
    public ServiceInstance setPort(Integer val) {
        this.set(FIELD_PORT, val);
        return this;
    }

    
    @JsonIgnore
    public Integer getPort() {
    	 try{
             return DataTypeUtils.getIntegerValue(this.get(FIELD_PORT),null);
         }catch (Exception e){
             throw new RuntimeException(e);
         }
    }

   
    @JsonIgnore
    public boolean containsPort() {
        return this.contains(FIELD_PORT);
    }

   
    @JsonIgnore
    public ServiceInstance resetPort() {
        this.reset(FIELD_PORT);
        return this;
    }
}
