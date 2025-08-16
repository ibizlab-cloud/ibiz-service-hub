package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.EntityBase;

/**
 * Cloud控制台数据对象
 * @author lionlau
 *
 */
public class CloudConsole extends EntityBase {

	
	/**
	 * 标题
	 */
	public final static String FIELD_TOPIC = "topic";
	  
	
	/**
	 *发送者
	 */
	public final static String FIELD_SENDER = "sender";
	
	
	/**
	 *日志分类
	 */
	public final static String FIELD_LOGCAT = "logcat";
	
	
	
	
    @JsonIgnore
    public CloudConsole setTopic(String val) {
        this.set(FIELD_TOPIC, val);
        return this;
    }

    
    @JsonIgnore
    public String getTopic() {
        return (String) this.get(FIELD_TOPIC);
    }

   
    @JsonIgnore
    public boolean containsTopic() {
        return this.contains(FIELD_TOPIC);
    }

   
    @JsonIgnore
    public CloudConsole resetTopic() {
        this.reset(FIELD_TOPIC);
        return this;
    }

	
    @JsonIgnore
    public CloudConsole setSender(String val) {
        this.set(FIELD_SENDER, val);
        return this;
    }

    
    @JsonIgnore
    public String getSender() {
        return (String) this.get(FIELD_SENDER);
    }

   
    @JsonIgnore
    public boolean containsSender() {
        return this.contains(FIELD_SENDER);
    }

   
    @JsonIgnore
    public CloudConsole resetSender() {
        this.reset(FIELD_SENDER);
        return this;
    }
    
    @JsonIgnore
    public CloudConsole setLogCat(String val) {
        this.set(FIELD_LOGCAT, val);
        return this;
    }

    
    @JsonIgnore
    public String getLogCat() {
        return (String) this.get(FIELD_LOGCAT);
    }

   
    @JsonIgnore
    public boolean containsLogCat() {
        return this.contains(FIELD_LOGCAT);
    }

   
    @JsonIgnore
    public CloudConsole resetLogCat() {
        this.reset(FIELD_LOGCAT);
        return this;
    }
}
