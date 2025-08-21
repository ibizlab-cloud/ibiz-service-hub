package net.ibizsys.central.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.EntityBase;

/**
 * 数据导出结果对象
 * @author lionlau
 *
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExportDataResult extends EntityBase{

	public final static String FIELD_FILENAME = "filename";

	@JsonIgnore
	public String getFileName() {
		Object objValue = this.get(FIELD_FILENAME);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_FILENAME)
	public void setFileName(String fileName) {
		this.set(FIELD_FILENAME, fileName);
	}

	@JsonIgnore
	public boolean isFileNameDirty() {
		return this.contains(FIELD_FILENAME);
	}
}
