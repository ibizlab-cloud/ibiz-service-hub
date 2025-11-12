package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 凭证
 * @author lionlau
 *
 */
public class Credential extends EntityBase {

	/**
	 * 访问凭证
	 */
	public final static String FIELD_ID = "id";
	
	
	/**
	 *凭证名称
	 */
	public final static String FIELD_NAME = "name";
	
	/**
	 * 是否禁用
	 */
	public final static String FIELD_DISABLED = "disabled";
	
	
	
	/**
	 * 管理账号token过期时间
	  */
	public final static String FIELD_EXPIRESTIME = "expirestime";
	
	
	/**
	 * 凭证类型
	 */
	public final static String FIELD_TYPE = "type";
	
	
	/**
	 * 凭证内容
	 */
	public final static String FIELD_CONTENT = "content";
	
	
	/**
	 * AccessKey(AppId)
	 */
	public final static String FIELD_ACCESSKEY = "accesskey";

	/**
	 * SecretKey(AppSecret)
	*/
	public final static String FIELD_SECRETKEY = "secretkey";

	/**
	 * 管理账号token
	 */
	public final static String FIELD_ACCESSTOKEN = "accesstoken";
	
	/**
	 * ClientId
	 */
	public final static String FIELD_CLIENTID = "clientid";

	/**
	 * ClientSecret
	 */
	public final static String FIELD_CLIENTSECRET = "clientsecret";
	
	
	/**
	 * TokenUrl
	 */
	public final static String FIELD_TOKENURL = "tokenurl";
	
	/**
	 * 设置「凭证标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Credential setId(String val) {
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
	public Credential resetId() {
		this.reset(FIELD_ID);
		return this;
	}
	
	/**
	 * 设置「凭证名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Credential setName(String val) {
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
	public Credential resetName() {
		this.reset(FIELD_NAME);
		return this;
	}
	

	/**
	 * 设置「是否禁用」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Credential setDisabled(Integer val) {
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
	public Credential resetDisabled() {
		this.reset(FIELD_DISABLED);
		return this;
	}
	
	/**
	 * 设置「管理账号token过期时间」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Credential setExpiresTime(Timestamp val) {
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
	public Credential resetExpiresTime() {
		this.reset(FIELD_EXPIRESTIME);
		return this;
	}
	
	

	
	
	/**
	 * 设置「凭证类型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Credential setType(String val) {
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
	public Credential resetType() {
		this.reset(FIELD_TYPE);
		return this;
	}

	
	/**
	 * 设置「凭证内容」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Credential setContent(String val) {
		this.set(FIELD_CONTENT, val);
		return this;
	}

	/**
	 * 获取「凭证内容」值
	 *
	 */
	@JsonIgnore
	public String getContent() {
		return (String) this.get(FIELD_CONTENT);
	}

	/**
	 * 判断 「凭证内容」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsContent() {
		return this.contains(FIELD_CONTENT);
	}

	/**
	 * 重置 「凭证内容」
	 *
	 */
	@JsonIgnore
	public Credential resetContent() {
		this.reset(FIELD_CONTENT);
		return this;
	}

	/**
	 * 设置「AccessKey(AppId)」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Credential setAccessKey(String val) {
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
	public Credential resetAccessKey() {
		this.reset(FIELD_ACCESSKEY);
		return this;
	}

	/**
	 * 设置「SecretKey(AppSecret)」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Credential setSecretKey(String val) {
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
	public Credential resetSecretKey() {
		this.reset(FIELD_SECRETKEY);
		return this;
	}
	
	/**
	 * 设置「管理账号token」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Credential setAccessToken(String val) {
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
	public Credential resetAccessToken() {
		this.reset(FIELD_ACCESSTOKEN);
		return this;
	}
	
	
	/**
	 * 设置「ClientId」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Credential setClientId(String val) {
		this.set(FIELD_CLIENTID, val);
		return this;
	}

	/**
	 * 获取「ClientId」值
	 *
	 */
	@JsonIgnore
	public String getClientId() {
		return (String) this.get(FIELD_CLIENTID);
	}

	/**
	 * 判断 「ClientId」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsClientId() {
		return this.contains(FIELD_CLIENTID);
	}

	/**
	 * 重置 「ClientId」
	 *
	 */
	@JsonIgnore
	public Credential resetClientId() {
		this.reset(FIELD_CLIENTID);
		return this;
	}

	/**
	 * 设置「ClientSecret」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Credential setClientSecret(String val) {
		this.set(FIELD_CLIENTSECRET, val);
		return this;
	}

	/**
	 * 获取「ClientSecret」值
	 *
	 */
	@JsonIgnore
	public String getClientSecret() {
		return (String) this.get(FIELD_CLIENTSECRET);
	}

	/**
	 * 判断 「ClientSecret」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsClientSecret() {
		return this.contains(FIELD_CLIENTSECRET);
	}

	/**
	 * 重置 「ClientSecret」
	 *
	 */
	@JsonIgnore
	public Credential resetClientSecret() {
		this.reset(FIELD_CLIENTSECRET);
		return this;
	}
	
	/**
	 * 设置「TokenUrl」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Credential setTokenUrl(String val) {
		this.set(FIELD_TOKENURL, val);
		return this;
	}

	/**
	 * 获取「TokenUrl」值
	 *
	 */
	@JsonIgnore
	public String getTokenUrl() {
		return (String) this.get(FIELD_TOKENURL);
	}

	/**
	 * 判断 「TokenUrl」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsTokenUrl() {
		return this.contains(FIELD_TOKENURL);
	}

	/**
	 * 重置 「TokenUrl」
	 *
	 */
	@JsonIgnore
	public Credential resetTokenUrl() {
		this.reset(FIELD_TOKENURL);
		return this;
	}
}
