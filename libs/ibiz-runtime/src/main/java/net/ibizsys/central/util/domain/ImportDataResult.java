package net.ibizsys.central.util.domain;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import net.ibizsys.runtime.util.EntityBase;
import net.ibizsys.runtime.util.EntityError;

/**
 * 数据导入结果对象
 * @author lionlau
 *
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImportDataResult extends EntityBase{

	/**
	 * 总数
	 */
	public final static String FIELD_TOTAL = "total";

	@JsonIgnore
	public Long getTotal() {
		Object objValue = this.get(FIELD_TOTAL);
		if (objValue == null) {
			return null;
		}
		return (Long) objValue;
	}

	@JsonProperty(FIELD_TOTAL)
	public void setTotal(Long total) {
		this.set(FIELD_TOTAL, total);
	}

	@JsonIgnore
	public boolean isTotalDirty() {
		return this.contains(FIELD_TOTAL);
	}
	
	
	/**
	 * 成功数量
	 */
	public final static String FIELD_SUCCESS = "success";

	@JsonIgnore
	public Long getSuccess() {
		Object objValue = this.get(FIELD_SUCCESS);
		if (objValue == null) {
			return null;
		}
		return (Long) objValue;
	}

	@JsonProperty(FIELD_SUCCESS)
	public void setSuccess(Long total) {
		this.set(FIELD_SUCCESS, total);
	}

	@JsonIgnore
	public boolean isSuccessDirty() {
		return this.contains(FIELD_SUCCESS);
	}
	
	/**
	 * 错误信息
	 */
	public final static String FIELD_ERRORINFO = "errorinfo";

	@JsonIgnore
	public Map<Integer, EntityError> getErrorInfo() {
		Object objValue = this.get(FIELD_ERRORINFO);
		if (objValue == null) {
			return null;
		}
		return (Map<Integer, EntityError>) objValue;
	}

	@JsonProperty(FIELD_ERRORINFO)
	public void setErrorInfo(Map<Integer, EntityError> errorInfo) {
		this.set(FIELD_ERRORINFO, errorInfo);
	}

	@JsonIgnore
	public boolean isErrorInfoDirty() {
		return this.contains(FIELD_ERRORINFO);
	}
	
	/**
	 * 错误文件
	 */
	public final static String FIELD_ERRORFILE = "errorfile";

	@JsonIgnore
	public net.ibizsys.runtime.util.domain.File getErrorFile() {
		Object objValue = this.get(FIELD_ERRORFILE);
		if (objValue == null) {
			return null;
		}
		return (net.ibizsys.runtime.util.domain.File) objValue;
	}

	@JsonProperty(FIELD_ERRORFILE)
	public void setErrorFile(net.ibizsys.runtime.util.domain.File errorFile) {
		this.set(FIELD_ERRORFILE, errorFile);
	}

	@JsonIgnore
	public boolean isErrorFileDirty() {
		return this.contains(FIELD_ERRORFILE);
	}
	
	
}
