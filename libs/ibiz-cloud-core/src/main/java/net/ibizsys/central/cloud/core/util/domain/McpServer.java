package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;
import net.ibizsys.runtime.util.JsonUtils;

/**
 * McpServer数据对象
 * 
 */
public class McpServer extends EntityBase {

	/**
	 * McpServer标识
	 */
	public final static String FIELD_ID = "id";

	/**
	 * McpServer
	 */
	public final static String FIELD_NAME = "name";

	/**
	 *  McpServer类型
	 */
	public final static String FIELD_TYPE = "type";

	/**
	 * AccessKey(AppId)
	 */
	public final static String FIELD_ACCESSKEY = "accesskey";

	/**
	 * SecretKey(AppSecret)
	*/
	public final static String FIELD_SECRETKEY = "secretkey";

	/**
	 * RegionId
	 */
	public final static String FIELD_REGIONID = "regionid";

	/**
	 * 管理账号token
	 */
	public final static String FIELD_ACCESSTOKEN = "accesstoken";

	/**
	 * 管理账号token过期时间
	  */
	public final static String FIELD_EXPIRESTIME = "expirestime";


	/**
	 * ServiceUrl
	 */
	public final static String FIELD_SERVICEURL = "serviceurl";
	
	
	/**
	 * 是否禁用
	 */
	public final static String FIELD_DISABLED = "disabled";
	
	
	/**
	 * 附加头部
	 */
	public final static String FIELD_HEADERS = "headers";
	
	
	/**
	 * 设置「McpServer标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setId(String val) {
		this.set(FIELD_ID, val);
		return this;
	}

	/**
	 * 获取「McpServer标识」值
	 *
	 */
	@JsonIgnore
	public String getId() {
		return (String) this.get(FIELD_ID);
	}

	/**
	 * 判断 「McpServer标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsId() {
		return this.contains(FIELD_ID);
	}

	/**
	 * 重置 「McpServer标识」
	 *
	 */
	@JsonIgnore
	public McpServer resetId() {
		this.reset(FIELD_ID);
		return this;
	}

	/**
	 * 设置「McpServer」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setName(String val) {
		this.set(FIELD_NAME, val);
		return this;
	}

	/**
	 * 获取「McpServer」值
	 *
	 */
	@JsonIgnore
	public String getName() {
		return (String) this.get(FIELD_NAME);
	}

	/**
	 * 判断 「McpServer」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsName() {
		return this.contains(FIELD_NAME);
	}

	/**
	 * 重置 「McpServer」
	 *
	 */
	@JsonIgnore
	public McpServer resetName() {
		this.reset(FIELD_NAME);
		return this;
	}

	/**
	 * 设置「McpServer类型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setType(String val) {
		this.set(FIELD_TYPE, val);
		return this;
	}

	/**
	 * 获取「McpServer类型」值
	 *
	 */
	@JsonIgnore
	public String getType() {
		return (String) this.get(FIELD_TYPE);
	}

	/**
	 * 判断 「McpServer类型」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsType() {
		return this.contains(FIELD_TYPE);
	}

	/**
	 * 重置 「McpServer类型」
	 *
	 */
	@JsonIgnore
	public McpServer resetType() {
		this.reset(FIELD_TYPE);
		return this;
	}

	/**
	 * 设置「AccessKey(AppId)」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setAccessKey(String val) {
		this.set(FIELD_ACCESSKEY, val);
		return this;
	}

	/**
	 * 获取「AccessKey(AppId)」值
	 *
	 */
	@JsonIgnore
	public String getAccessKey() {
		return (String) this.get(FIELD_ACCESSKEY);
	}

	/**
	 * 判断 「AccessKey(AppId)」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsAccessKey() {
		return this.contains(FIELD_ACCESSKEY);
	}

	/**
	 * 重置 「AccessKey(AppId)」
	 *
	 */
	@JsonIgnore
	public McpServer resetAccessKey() {
		this.reset(FIELD_ACCESSKEY);
		return this;
	}

	/**
	 * 设置「SecretKey(AppSecret)」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setSecretKey(String val) {
		this.set(FIELD_SECRETKEY, val);
		return this;
	}

	/**
	 * 获取「SecretKey(AppSecret)」值
	 *
	 */
	@JsonIgnore
	public String getSecretKey() {
		return (String) this.get(FIELD_SECRETKEY);
	}

	/**
	 * 判断 「SecretKey(AppSecret)」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsSecretKey() {
		return this.contains(FIELD_SECRETKEY);
	}

	/**
	 * 重置 「SecretKey(AppSecret)」
	 *
	 */
	@JsonIgnore
	public McpServer resetSecretKey() {
		this.reset(FIELD_SECRETKEY);
		return this;
	}

	/**
	 * 设置「RegionId」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setRegionId(String val) {
		this.set(FIELD_REGIONID, val);
		return this;
	}

	/**
	 * 获取「RegionId」值
	 *
	 */
	@JsonIgnore
	public String getRegionId() {
		return (String) this.get(FIELD_REGIONID);
	}

	/**
	 * 判断 「RegionId」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsRegionId() {
		return this.contains(FIELD_REGIONID);
	}

	/**
	 * 重置 「RegionId」
	 *
	 */
	@JsonIgnore
	public McpServer resetRegionId() {
		this.reset(FIELD_REGIONID);
		return this;
	}

	/**
	 * 设置「管理账号token」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setAccessToken(String val) {
		this.set(FIELD_ACCESSTOKEN, val);
		return this;
	}

	/**
	 * 获取「管理账号token」值
	 *
	 */
	@JsonIgnore
	public String getAccessToken() {
		return (String) this.get(FIELD_ACCESSTOKEN);
	}

	/**
	 * 判断 「管理账号token」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsAccessToken() {
		return this.contains(FIELD_ACCESSTOKEN);
	}

	/**
	 * 重置 「管理账号token」
	 *
	 */
	@JsonIgnore
	public McpServer resetAccessToken() {
		this.reset(FIELD_ACCESSTOKEN);
		return this;
	}

	/**
	 * 设置「管理账号token过期时间」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setExpiresTime(Timestamp val) {
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
	public McpServer resetExpiresTime() {
		this.reset(FIELD_EXPIRESTIME);
		return this;
	}


	/**
	 * 设置「ServiceUrl」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setServiceUrl(String val) {
		this.set(FIELD_SERVICEURL, val);
		return this;
	}

	/**
	 * 获取「ServiceUrl」值
	 *
	 */
	@JsonIgnore
	public String getServiceUrl() {
		return (String) this.get(FIELD_SERVICEURL);
	}

	/**
	 * 判断 「ServiceUrl」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsServiceUrl() {
		return this.contains(FIELD_SERVICEURL);
	}

	/**
	 * 重置 「ServiceUrl」
	 *
	 */
	@JsonIgnore
	public McpServer resetServiceUrl() {
		this.reset(FIELD_SERVICEURL);
		return this;
	}
	
	

	/**
	 * 设置「是否禁用」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setDisabled(Integer val) {
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
	public McpServer resetDisabled() {
		this.reset(FIELD_DISABLED);
		return this;
	}
	
	
  
	
	/**
	 * 设置「附加头部」
	 *
	 * @param val
	 */
	@JsonIgnore
	public McpServer setHeaders(Map<String, Object> val) {
		this.set(FIELD_HEADERS, val);
		return this;
	}

	/**
	 * 获取「附加头部」值
	 *
	 */
	@JsonIgnore
	public Map<String, Object> getHeaders() {
		Object value = this.get(FIELD_HEADERS);
		if(value == null) {
			return null;
		}
		
		if(value instanceof Map) {
			return (Map)value;
		}
		
		Map<String, Object> map = JsonUtils.asMap(value);
		this.setHeaders(map);
		
		return map;
	}

	/**
	 * 判断 「附加头部」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsHeaders() {
		return this.contains(FIELD_HEADERS);
	}

	/**
	 * 重置 「附加头部」
	 *
	 */
	@JsonIgnore
	public McpServer resetHeaders() {
		this.reset(FIELD_HEADERS);
		return this;
	}
	
}
