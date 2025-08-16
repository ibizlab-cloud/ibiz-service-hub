package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 应用数据对象
 * @author lionlau
 *
 */
public class AppData extends EntityBase{

	/**
	 *上下文标识
	 */
	public final static String FIELD_CONTEXT = "context";


	@JsonIgnore
	public Entity getContext() {
		Object objValue = this.get(FIELD_CONTEXT);
		if (objValue == null) {
			return null;
		}
		return (Entity) objValue;
	}

	@JsonProperty(FIELD_CONTEXT)
	public void setContext(Entity value) {
		this.set(FIELD_CONTEXT, value);
	}

	@JsonIgnore
	public boolean isContextDirty() {
		return this.contains(FIELD_CONTEXT);
	}
	
	@JsonIgnore
	public Entity getContextIf() {
		Object objValue = this.get(FIELD_CONTEXT);
		if (objValue == null) {
			objValue = new Entity();
			this.set(FIELD_CONTEXT, objValue);
		}
		return (Entity) objValue;
	}
	
	
	/**
	 * 扩展MQTTTopic
	 */
	public final static String FIELD_EXTMQTTTOPIC = "extmqtttopic";
	
	@JsonIgnore
	public Entity getExtMqttTopic() {
		Object objValue = this.get(FIELD_EXTMQTTTOPIC);
		if (objValue == null) {
			return null;
		}
		return (Entity) objValue;
	}

	@JsonProperty(FIELD_EXTMQTTTOPIC)
	public void setExtMqttTopic(Entity value) {
		this.set(FIELD_EXTMQTTTOPIC, value);
	}

	@JsonIgnore
	public boolean isExtMqttTopicDirty() {
		return this.contains(FIELD_EXTMQTTTOPIC);
	}

	@JsonIgnore
	public Entity getExtMqttTopicIf() {
		Object objValue = this.get(FIELD_EXTMQTTTOPIC);
		if (objValue == null) {
			objValue = new Entity();
			this.set(FIELD_EXTMQTTTOPIC, objValue);
		}
		return (Entity) objValue;
	}
	
}
