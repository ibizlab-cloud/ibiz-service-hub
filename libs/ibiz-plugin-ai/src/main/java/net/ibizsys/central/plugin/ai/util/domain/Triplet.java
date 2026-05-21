package net.ibizsys.central.plugin.ai.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

public class Triplet extends EntityBase {

	/**
	 * 主语
	 */
	public final static String FIELD__SUBJECT = "subject";
	
	
	/**
	 * 指向对象
	 */
	public final static String FIELD__OBJECT = "object";
	
	
	/**
	 * 关系或谓语
	 */
	public final static String FIELD__PREDICATE = "predicate";
	
	
	/**
	 * 主语属性
	 */
	public final static String FIELD__ATTRIBUTE = "attribute";
	
	
	
	@JsonIgnore
	public String getPredicate() {
		return DataTypeUtils.asString(this.get(FIELD__PREDICATE));
	}
	
	@JsonIgnore
	public void setPredicate(String value) {
		this.set(FIELD__PREDICATE, value);
	}
	
	@JsonIgnore
	public String getAttribute() {
		return DataTypeUtils.asString(this.get(FIELD__ATTRIBUTE));
	}
	
	@JsonIgnore
	public void setAttribute(String value) {
		this.set(FIELD__ATTRIBUTE, value);
	}
	
	@JsonProperty(FIELD__SUBJECT)
	public TripletSubject getSubject() {
		TripletSubject subject = (TripletSubject)this.get(FIELD__SUBJECT);
		if(subject == null) {
			subject = new TripletSubject();
			this.set(FIELD__SUBJECT, subject);
		}
		return subject;
	}
	
	@JsonProperty(FIELD__SUBJECT)
	public void setSubject(TripletSubject value) {
		this.set(FIELD__SUBJECT, value);
	}
	
	@JsonProperty(FIELD__OBJECT)
	public TripletObject getObject() {
		TripletObject object = (TripletObject)this.get(FIELD__OBJECT);
		if(object == null) {
			object = new TripletObject();
			this.set(FIELD__OBJECT, object);
		}
		return object;
	}
	
	@JsonProperty(FIELD__OBJECT)
	public void setObject(TripletObject value) {
		this.set(FIELD__OBJECT, value);
	}
}
