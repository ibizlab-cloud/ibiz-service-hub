package net.ibizsys.central.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import net.ibizsys.runtime.util.EntityBase;

/**
 * 自填数据项
 * 
 * @author lionlau
 *
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ACDataItem extends EntityBase {

	/**
	 * 文本
	 */
	public final static String FIELD_TEXT = "text";

	@JsonIgnore
	public String getText() {
		Object objValue = this.get(FIELD_TEXT);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_TEXT)
	public void setText(String text) {
		this.set(FIELD_TEXT, text);
	}

	@JsonIgnore
	public boolean isTextDirty() {
		return this.contains(FIELD_TEXT);
	}

	
	
	/**
	 * 值
	 */
	public final static String FIELD_VALUE = "value";

	@JsonIgnore
	public String getValue() {
		Object objValue = this.get(FIELD_VALUE);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_VALUE)
	public void setValue(String value) {
		this.set(FIELD_VALUE, value);
	}

	@JsonIgnore
	public boolean isValueDirty() {
		return this.contains(FIELD_VALUE);
	}
	
	/**
	 * 实际
	 */
	public final static String FIELD_REALTEXT = "realtext";

	@JsonIgnore
	public String getRealText() {
		Object objRealText = this.get(FIELD_REALTEXT);
		if (objRealText == null) {
			return null;
		}
		return (String) objRealText;
	}

	@JsonProperty(FIELD_REALTEXT)
	public void setRealText(String realtext) {
		this.set(FIELD_REALTEXT, realtext);
	}

	@JsonIgnore
	public boolean isRealTextDirty() {
		return this.contains(FIELD_REALTEXT);
	}
}
