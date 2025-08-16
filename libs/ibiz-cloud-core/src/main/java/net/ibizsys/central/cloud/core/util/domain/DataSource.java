package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.EntityBase;

/**
 * 数据源
 * @author lionlau
 *
 */
public class DataSource extends EntityBase{

	/**
	 *数据源标识
	 */
	public final static String FIELD_DATASOURCEID = "datasourceid";

	@JsonIgnore
	public String getDataSourceId() {
		Object objValue = this.get(FIELD_DATASOURCEID);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_DATASOURCEID)
	public void setDataSourceId(String value) {
		this.set(FIELD_DATASOURCEID, value);
	}

	@JsonIgnore
	public boolean isDataSourceIdDirty() {
		return this.contains(FIELD_DATASOURCEID);
	}
	
	/**
	 *驱动类
	 */
	public final static String FIELD_DRIVERCLASSNAME = "driverclassname";

	@JsonIgnore
	public String getDriverClassName() {
		Object objValue = this.get(FIELD_DRIVERCLASSNAME);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_DRIVERCLASSNAME)
	public void setDriverClassName(String value) {
		this.set(FIELD_DRIVERCLASSNAME, value);
	}

	@JsonIgnore
	public boolean isDriverClassNameDirty() {
		return this.contains(FIELD_DRIVERCLASSNAME);
	}
	
	/**
	 * JdbcUrl
	 */
	public final static String FIELD_JDBCURL = "jdbcurl";

	@JsonIgnore
	public String getJdbcUrl() {
		Object objValue = this.get(FIELD_JDBCURL);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_JDBCURL)
	public void setJdbcUrl(String value) {
		this.set(FIELD_JDBCURL, value);
	}

	@JsonIgnore
	public boolean isJdbcUrlDirty() {
		return this.contains(FIELD_JDBCURL);
	}
	
	
	/**
	 * 用户名
	 */
	public final static String FIELD_USERNAME = "username";

	@JsonIgnore
	public String getUsername() {
		Object objValue = this.get(FIELD_USERNAME);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_USERNAME)
	public void setUsername(String value) {
		this.set(FIELD_USERNAME, value);
	}

	@JsonIgnore
	public boolean isUsernameDirty() {
		return this.contains(FIELD_USERNAME);
	}
	
	/**
	 * 密码
	 */
	public final static String FIELD_PASSWORD = "password";

	@JsonIgnore
	public String getPassword() {
		Object objValue = this.get(FIELD_PASSWORD);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_PASSWORD)
	public void setPassword(String value) {
		this.set(FIELD_PASSWORD, value);
	}

	@JsonIgnore
	public boolean isPasswordDirty() {
		return this.contains(FIELD_PASSWORD);
	}
	

	/**
	 * 数据库类型
	 */
	public final static String FIELD_DBTYPE = "dbtype";

	@JsonIgnore
	public String getDBType() {
		Object objValue = this.get(FIELD_DBTYPE);
		if (objValue == null) {
			return null;
		}
		return (String) objValue;
	}

	@JsonProperty(FIELD_DBTYPE)
	public void setDBType(String value) {
		this.set(FIELD_DBTYPE, value);
	}

	@JsonIgnore
	public boolean isDBTypeDirty() {
		return this.contains(FIELD_DBTYPE);
	}
	
}
