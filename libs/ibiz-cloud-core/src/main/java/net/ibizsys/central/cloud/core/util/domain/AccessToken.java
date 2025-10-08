package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;
import net.ibizsys.runtime.util.JsonUtils;

public class AccessToken extends EntityBase {

	/**
	 * 访问凭证
	 */
	public final static String FIELD_ID = "id";
	
	
	/**
	 * 是否禁用
	 */
	public final static String FIELD_DISABLED = "disabled";
	
	
	
	/**
	 * 管理账号token过期时间
	  */
	public final static String FIELD_EXPIRESTIME = "expirestime";
	
	
	/**
	 * 机构用户
	  */
	public final static String FIELD_EMPLOYEE = "employee";
	
	
	/**
	 * 授权
	  */
	public final static String FIELD_AUTHORITIES = "authorities";
	
	
	/**
	 * 应用上下文
	 */
	public final static String FIELD_APPCONTEXT = "appcontext";
	
	
	/**
	 * 设置「凭证标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AccessToken setId(String val) {
		this.set(FIELD_ID, val);
		return this;
	}

	/**
	 * 获取「凭证标识」值
	 *
	 */
	@JsonIgnore
	public String getId() {
		return (String) this.get(FIELD_ID);
	}

	/**
	 * 判断 「凭证标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsId() {
		return this.contains(FIELD_ID);
	}

	/**
	 * 重置 「凭证标识」
	 *
	 */
	@JsonIgnore
	public AccessToken resetId() {
		this.reset(FIELD_ID);
		return this;
	}

	/**
	 * 设置「是否禁用」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AccessToken setDisabled(Integer val) {
		this.set(FIELD_DISABLED, val);
		return this;
	}

	/**
	 * 获取「是否禁用」值
	 *
	 */
	@JsonIgnore
	public Integer getDisabled() {
		try {
			return DataTypeUtils.getIntegerValue(this.get(FIELD_DISABLED), null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 判断 「是否禁用」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsDisabled() {
		return this.contains(FIELD_DISABLED);
	}

	/**
	 * 重置 「是否禁用」
	 *
	 */
	@JsonIgnore
	public AccessToken resetDisabled() {
		this.reset(FIELD_DISABLED);
		return this;
	}
	
	/**
	 * 设置「管理账号token过期时间」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AccessToken setExpiresTime(Timestamp val) {
		this.set(FIELD_EXPIRESTIME, val);
		return this;
	}

	/**
	 * 获取「管理账号token过期时间」值
	 *
	 */
	@JsonIgnore
	public Timestamp getExpiresTime() {
		try {
			return DataTypeUtils.getDateTimeValue(this.get(FIELD_EXPIRESTIME), null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 判断 「管理账号token过期时间」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsExpiresTime() {
		return this.contains(FIELD_EXPIRESTIME);
	}

	/**
	 * 重置 「管理账号token过期时间」
	 *
	 */
	@JsonIgnore
	public AccessToken resetExpiresTime() {
		this.reset(FIELD_EXPIRESTIME);
		return this;
	}
	
	
	/**
	 * 设置「机构用户」
	 *
	 * @param val
	 */
	@JsonProperty(FIELD_EMPLOYEE)
	public AccessToken setEmployee(Map<String, Object> val) {
		this.set(FIELD_EMPLOYEE, val);
		return this;
	}

	/**
	 * 获取「机构用户」值
	 *
	 */
	@JsonIgnore
	public Map<String, Object> getEmployee() {
		Object value = this.get(FIELD_EMPLOYEE);
		if(value == null) {
			return null;
		}
		if(value instanceof Map) {
			return (Map)value;
		}
		
		Map employee = JsonUtils.as(value, Map.class);
		this.setEmployee(employee);
		
		return employee;
	}

	/**
	 * 判断 「机构用户」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsEmployee() {
		return this.contains(FIELD_EMPLOYEE);
	}

	/**
	 * 重置 「机构用户」
	 *
	 */
	@JsonIgnore
	public AccessToken resetEmployee() {
		this.reset(FIELD_EMPLOYEE);
		return this;
	}
	
	
	/**
	 * 设置「应用上下文」
	 *
	 * @param val
	 */
	@JsonProperty(FIELD_APPCONTEXT)
	public AccessToken setAppContext(Map<String, Object> val) {
		this.set(FIELD_APPCONTEXT, val);
		return this;
	}

	/**
	 * 获取「应用上下文」值
	 *
	 */
	@JsonIgnore
	public Map<String, Object> getAppContext() {
		Object value = this.get(FIELD_APPCONTEXT);
		if(value == null) {
			return null;
		}
		if(value instanceof Map) {
			return (Map)value;
		}
		
		Map map = JsonUtils.as(value, Map.class);
		this.setAppContext(map);
		
		return map;
	}

	/**
	 * 判断 「应用上下文」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsAppContext() {
		return this.contains(FIELD_APPCONTEXT);
	}

	/**
	 * 重置 「应用上下文」
	 *
	 */
	@JsonIgnore
	public AccessToken resetAppContext() {
		this.reset(FIELD_APPCONTEXT);
		return this;
	}
	
	
	/**
	 * 设置「授权清单」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AccessToken setAuthorities(String val) {
		this.set(FIELD_AUTHORITIES, val);
		return this;
	}

	/**
	 * 获取「授权清单」值
	 *
	 */
	@JsonIgnore
	public String getAuthorities() {
		return (String)this.get(FIELD_AUTHORITIES);
	}

	/**
	 * 判断 「授权清单」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsAuthorities() {
		return this.contains(FIELD_AUTHORITIES);
	}

	/**
	 * 重置 「授权清单」
	 *
	 */
	@JsonIgnore
	public AccessToken resetAuthorities() {
		this.reset(FIELD_AUTHORITIES);
		return this;
	}
}
