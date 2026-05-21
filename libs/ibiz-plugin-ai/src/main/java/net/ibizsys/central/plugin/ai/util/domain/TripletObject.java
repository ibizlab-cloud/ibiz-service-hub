package net.ibizsys.central.plugin.ai.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

public class TripletObject extends EntityBase {


	/**
	 * 名称
	 */
	public final static String FIELD__NAME = "name";
	
	
	/**
	 * 类型：'person'、'vehicle'、'animal'、'document'、'organization'、'location'、'event'、'object'、'time'、'concept'
	 */
	public final static String FIELD__TYPE = "type";
	
	
	@JsonIgnore
	public String getName() {
		return DataTypeUtils.asString(this.get(FIELD__NAME));
	}
	
	@JsonIgnore
	public void setName(String value) {
		this.set(FIELD__NAME, value);
	}
	
	@JsonIgnore
	public String getType() {
		return DataTypeUtils.asString(this.get(FIELD__TYPE));
	}
	
	@JsonIgnore
	public void setType(String value) {
		this.set(FIELD__TYPE, value);
	}
}
