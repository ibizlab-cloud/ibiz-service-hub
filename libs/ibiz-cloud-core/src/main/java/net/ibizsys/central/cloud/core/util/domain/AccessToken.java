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
	 * 凭证名称
	 */
	public final static String FIELD_NAME = "name";
	
	
	/**
	 * 凭证类型
	 */
	public final static String FIELD_TYPE = "type";
	
	
	
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
	 * 会话上下文
	 */
	public final static String FIELD_SESSION = "session";
	
	
	/**
	 * 用户标识
	 */
	public final static String FIELD_USERID = "userid";
	
	
	/**
	 * 用户名称
	 */
	public final static String FIELD_USERNAME = "username";
	
	
	/**
	 * 登录名称
	 */
	public final static String FIELD_LOGINNAME = "loginname";
	
	/**
	 * API 用户模式
	 */
	public final static String FIELD_APIUSER = "apiuser";
	
	
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
	 * 设置「凭证名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AccessToken setName(String val) {
		this.set(FIELD_NAME, val);
		return this;
	}

	/**
	 * 获取「凭证名称」值
	 *
	 */
	@JsonIgnore
	public String getName() {
		return (String) this.get(FIELD_NAME);
	}

	/**
	 * 判断 「凭证名称」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsName() {
		return this.contains(FIELD_NAME);
	}

	/**
	 * 重置 「凭证名称」
	 *
	 */
	@JsonIgnore
	public AccessToken resetName() {
		this.reset(FIELD_NAME);
		return this;
	}
	
	/**
	 * 设置「用户标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AccessToken setUserId(String val) {
		this.set(FIELD_USERID, val);
		return this;
	}

	/**
	 * 获取「用户标识」值
	 *
	 */
	@JsonIgnore
	public String getUserId() {
		return (String) this.get(FIELD_USERID);
	}

	/**
	 * 判断 「用户标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsUserId() {
		return this.contains(FIELD_USERID);
	}

	/**
	 * 重置 「用户标识」
	 *
	 */
	@JsonIgnore
	public AccessToken resetUserId() {
		this.reset(FIELD_USERID);
		return this;
	}
	
	/**
	 * 设置「用户名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AccessToken setUserName(String val) {
		this.set(FIELD_USERNAME, val);
		return this;
	}

	/**
	 * 获取「用户名称」值
	 *
	 */
	@JsonIgnore
	public String getUserName() {
		return (String) this.get(FIELD_USERNAME);
	}

	/**
	 * 判断 「用户名称」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsUserName() {
		return this.contains(FIELD_USERNAME);
	}

	/**
	 * 重置 「用户名称」
	 *
	 */
	@JsonIgnore
	public AccessToken resetUserName() {
		this.reset(FIELD_USERNAME);
		return this;
	}
	
	
	/**
	 * 设置「登录名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AccessToken setLoginName(String val) {
		this.set(FIELD_LOGINNAME, val);
		return this;
	}

	/**
	 * 获取「登录名称」值
	 *
	 */
	@JsonIgnore
	public String getLoginName() {
		return (String) this.get(FIELD_LOGINNAME);
	}

	/**
	 * 判断 「登录名称」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsLoginName() {
		return this.contains(FIELD_LOGINNAME);
	}

	/**
	 * 重置 「登录名称」
	 *
	 */
	@JsonIgnore
	public AccessToken resetLoginName() {
		this.reset(FIELD_LOGINNAME);
		return this;
	}
	
	/**
	 * 设置「接口用户模式」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AccessToken setApiUser(Integer val) {
		this.set(FIELD_APIUSER, val);
		return this;
	}

	/**
	 * 获取「接口用户模式」值
	 *
	 */
	@JsonIgnore
	public Integer getApiUser() {
		return (Integer) this.get(FIELD_APIUSER);
	}

	/**
	 * 判断 「接口用户模式」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsApiUser() {
		return this.contains(FIELD_APIUSER);
	}

	/**
	 * 重置 「接口用户模式」
	 *
	 */
	@JsonIgnore
	public AccessToken resetApiUser() {
		this.reset(FIELD_APIUSER);
		return this;
	}
	
	
	
	
	/**
	 * 设置「凭证类型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public AccessToken setType(String val) {
		this.set(FIELD_TYPE, val);
		return this;
	}

	/**
	 * 获取「凭证类型」值
	 *
	 */
	@JsonIgnore
	public String getType() {
		return (String) this.get(FIELD_TYPE);
	}

	/**
	 * 判断 「凭证类型」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsType() {
		return this.contains(FIELD_TYPE);
	}

	/**
	 * 重置 「凭证类型」
	 *
	 */
	@JsonIgnore
	public AccessToken resetType() {
		this.reset(FIELD_TYPE);
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
	
	
	/**
	 * 设置「会话」
	 *
	 * @param val
	 */
	@JsonProperty(FIELD_SESSION)
	public AccessToken setSession(Map<String, Object> val) {
		this.set(FIELD_SESSION, val);
		return this;
	}

	/**
	 * 获取「会话」值
	 *
	 */
	@JsonIgnore
	public Map<String, Object> getSession() {
		Object value = this.get(FIELD_SESSION);
		if(value == null) {
			return null;
		}
		if(value instanceof Map) {
			return (Map)value;
		}
		
		Map map = JsonUtils.as(value, Map.class);
		this.setSession(map);
		
		return map;
	}

	/**
	 * 判断 「会话」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsSession() {
		return this.contains(FIELD_SESSION);
	}

	/**
	 * 重置 「会话」
	 *
	 */
	@JsonIgnore
	public AccessToken resetSession() {
		this.reset(FIELD_SESSION);
		return this;
	}
}
