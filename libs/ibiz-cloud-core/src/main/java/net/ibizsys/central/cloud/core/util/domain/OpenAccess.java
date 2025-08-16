package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 第三方认证平台2
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_ACCESS/.ibizmodel.index
 */
public class OpenAccess extends EntityBase {

	/**
	 * . 开放平台接入标识
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_ACCESS/psdefields/ACCESSID/.ibizmodel.index
	 */
	public final static String FIELD_ID = "id";

	/**
	 * . 开放平台
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_ACCESS/psdefields/ACCESSNAME/.ibizmodel.index
	 */
	public final static String FIELD_NAME = "name";

	/**
	 * . 开放平台类型
	 * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.OpenAccessType}
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_ACCESS/psdefields/OPEN_TYPE/.ibizmodel.index
	 * @see ibizmos:/psmodules/notify/pscodelists/OpenAccessType.ibizmodel.yaml
	 */
	public final static String FIELD_OPENTYPE = "opentype";

	/**
	 * . AccessKey(AppId)
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_ACCESS/psdefields/ACCESS_KEY/.ibizmodel.index
	 */
	public final static String FIELD_ACCESSKEY = "accesskey";

	/**
	 * . SecretKey(AppSecret)
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_ACCESS/psdefields/SECRET_KEY/.ibizmodel.index
	 */
	public final static String FIELD_SECRETKEY = "secretkey";

	/**
	 * . RegionId
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_ACCESS/psdefields/REGION_ID/.ibizmodel.index
	 */
	public final static String FIELD_REGIONID = "regionid";

	/**
	 * . 管理账号token
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_ACCESS/psdefields/ACCESS_TOKEN/.ibizmodel.index
	 */
	public final static String FIELD_ACCESSTOKEN = "accesstoken";

	/**
	 * . 管理账号token过期时间
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_ACCESS/psdefields/EXPIRES_TIME/.ibizmodel.index
	 */
	public final static String FIELD_EXPIRESTIME = "expirestime";

	/**
	 * . 是否禁用
	 * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo}
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_ACCESS/psdefields/DISABLED/.ibizmodel.index
	 * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
	 */
	public final static String FIELD_DISABLED = "disabled";

	/**
	 * . RedirectURI
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_ACCESS/psdefields/REDIRECT_URI/.ibizmodel.index
	 */
	public final static String FIELD_REDIRECTURI = "redirecturi";

	/**
	 * . NotifyUrl
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_ACCESS/psdefields/NOTIFY_URL/.ibizmodel.index
	 */
	public final static String FIELD_NOTIFYURL = "notifyurl";

	/**
	 * . AGENT_ID 20210811:bigint->int
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_ACCESS/psdefields/AGENT_ID/.ibizmodel.index
	 */
	public final static String FIELD_AGENTID = "agentid";

	/**
	 * . 单位
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_ACCESS/psdefields/ORGID/.ibizmodel.index
	 */
	public final static String FIELD_ORGID = "orgid";

	/**
	 * . 是否移动接入应用
	 * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo}
	 *
	 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_ACCESS/psdefields/ISMOBACCAPP/.ibizmodel.index
	 * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
	 */
	public final static String FIELD_ISMOBACCAPP = "ismobaccapp";
	
	
	/**
	 * 回调token
	 *
	 */
	public final static String FIELD_CALLBACKTOKEN = "callbacktoken";
	
	/**
	 * 回调参数
	 *
	 */
	public final static String FIELD_CALLBACKPARAM = "callbackparam";
	
	/**
	 * 回调参数2
	 *
	 */
	public final static String FIELD_CALLBACKPARAM2 = "callbackparam2";

	/**
	 * 设置「开放平台接入标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenAccess setId(String val) {
		this.set(FIELD_ID, val);
		return this;
	}

	/**
	 * 获取「开放平台接入标识」值
	 *
	 */
	@JsonIgnore
	public String getId() {
		return (String) this.get(FIELD_ID);
	}

	/**
	 * 判断 「开放平台接入标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsId() {
		return this.contains(FIELD_ID);
	}

	/**
	 * 重置 「开放平台接入标识」
	 *
	 */
	@JsonIgnore
	public OpenAccess resetId() {
		this.reset(FIELD_ID);
		return this;
	}

	/**
	 * 设置「开放平台」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenAccess setName(String val) {
		this.set(FIELD_NAME, val);
		return this;
	}

	/**
	 * 获取「开放平台」值
	 *
	 */
	@JsonIgnore
	public String getName() {
		return (String) this.get(FIELD_NAME);
	}

	/**
	 * 判断 「开放平台」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsName() {
		return this.contains(FIELD_NAME);
	}

	/**
	 * 重置 「开放平台」
	 *
	 */
	@JsonIgnore
	public OpenAccess resetName() {
		this.reset(FIELD_NAME);
		return this;
	}

	/**
	 * 设置「开放平台类型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenAccess setOpenType(String val) {
		this.set(FIELD_OPENTYPE, val);
		return this;
	}

	/**
	 * 获取「开放平台类型」值
	 *
	 */
	@JsonIgnore
	public String getOpenType() {
		return (String) this.get(FIELD_OPENTYPE);
	}

	/**
	 * 判断 「开放平台类型」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsOpenType() {
		return this.contains(FIELD_OPENTYPE);
	}

	/**
	 * 重置 「开放平台类型」
	 *
	 */
	@JsonIgnore
	public OpenAccess resetOpenType() {
		this.reset(FIELD_OPENTYPE);
		return this;
	}

	/**
	 * 设置「AccessKey(AppId)」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenAccess setAccessKey(String val) {
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
	public OpenAccess resetAccessKey() {
		this.reset(FIELD_ACCESSKEY);
		return this;
	}

	/**
	 * 设置「SecretKey(AppSecret)」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenAccess setSecretKey(String val) {
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
	public OpenAccess resetSecretKey() {
		this.reset(FIELD_SECRETKEY);
		return this;
	}

	/**
	 * 设置「RegionId」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenAccess setRegionId(String val) {
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
	public OpenAccess resetRegionId() {
		this.reset(FIELD_REGIONID);
		return this;
	}

	/**
	 * 设置「管理账号token」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenAccess setAccessToken(String val) {
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
	public OpenAccess resetAccessToken() {
		this.reset(FIELD_ACCESSTOKEN);
		return this;
	}

	/**
	 * 设置「管理账号token过期时间」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenAccess setExpiresTime(Timestamp val) {
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
	public OpenAccess resetExpiresTime() {
		this.reset(FIELD_EXPIRESTIME);
		return this;
	}

	/**
	 * 设置「是否禁用」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenAccess setDisabled(Integer val) {
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
	public OpenAccess resetDisabled() {
		this.reset(FIELD_DISABLED);
		return this;
	}

	/**
	 * 设置「RedirectURI」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenAccess setRedirectUri(String val) {
		this.set(FIELD_REDIRECTURI, val);
		return this;
	}

	/**
	 * 获取「RedirectURI」值
	 *
	 */
	@JsonIgnore
	public String getRedirectUri() {
		return (String) this.get(FIELD_REDIRECTURI);
	}

	/**
	 * 判断 「RedirectURI」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsRedirectUri() {
		return this.contains(FIELD_REDIRECTURI);
	}

	/**
	 * 重置 「RedirectURI」
	 *
	 */
	@JsonIgnore
	public OpenAccess resetRedirectUri() {
		this.reset(FIELD_REDIRECTURI);
		return this;
	}

	/**
	 * 设置「NotifyUrl」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenAccess setNotifyUrl(String val) {
		this.set(FIELD_NOTIFYURL, val);
		return this;
	}

	/**
	 * 获取「NotifyUrl」值
	 *
	 */
	@JsonIgnore
	public String getNotifyUrl() {
		return (String) this.get(FIELD_NOTIFYURL);
	}

	/**
	 * 判断 「NotifyUrl」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsNotifyUrl() {
		return this.contains(FIELD_NOTIFYURL);
	}

	/**
	 * 重置 「NotifyUrl」
	 *
	 */
	@JsonIgnore
	public OpenAccess resetNotifyUrl() {
		this.reset(FIELD_NOTIFYURL);
		return this;
	}

	/**
	 * 设置「AGENT_ID」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenAccess setAgentId(Long val) {
		this.set(FIELD_AGENTID, val);
		return this;
	}

	/**
	 * 获取「AGENT_ID」值
	 *
	 */
	@JsonIgnore
	public Long getAgentId() {
		try {
			return DataTypeUtils.getLongValue(this.get(FIELD_AGENTID), null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 判断 「AGENT_ID」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsAgentId() {
		return this.contains(FIELD_AGENTID);
	}

	/**
	 * 重置 「AGENT_ID」
	 *
	 */
	@JsonIgnore
	public OpenAccess resetAgentId() {
		this.reset(FIELD_AGENTID);
		return this;
	}

	/**
	 * 设置「单位」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenAccess setOrgId(String val) {
		this.set(FIELD_ORGID, val);
		return this;
	}

	/**
	 * 获取「单位」值
	 *
	 */
	@JsonIgnore
	public String getOrgId() {
		return (String) this.get(FIELD_ORGID);
	}

	/**
	 * 判断 「单位」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsOrgId() {
		return this.contains(FIELD_ORGID);
	}

	/**
	 * 重置 「单位」
	 *
	 */
	@JsonIgnore
	public OpenAccess resetOrgId() {
		this.reset(FIELD_ORGID);
		return this;
	}

	/**
	 * 设置「是否移动接入应用」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenAccess setIsMobAccApp(Integer val) {
		this.set(FIELD_ISMOBACCAPP, val);
		return this;
	}

	/**
	 * 获取「是否移动接入应用」值
	 *
	 */
	@JsonIgnore
	public Integer getIsMobAccApp() {
		try {
			return DataTypeUtils.getIntegerValue(this.get(FIELD_ISMOBACCAPP), null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 判断 「是否移动接入应用」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsIsMobAccApp() {
		return this.contains(FIELD_ISMOBACCAPP);
	}

	/**
	 * 重置 「是否移动接入应用」
	 *
	 */
	@JsonIgnore
	public OpenAccess resetIsMobAccApp() {
		this.reset(FIELD_ISMOBACCAPP);
		return this;
	}
	
	
	/**
	 * 设置「回调token」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenAccess setCallbackToken(String val) {
		this.set(FIELD_CALLBACKTOKEN, val);
		return this;
	}

	/**
	 * 获取「回调token」值
	 *
	 */
	@JsonIgnore
	public String getCallbackToken() {
		return (String) this.get(FIELD_CALLBACKTOKEN);
	}

	/**
	 * 判断 「回调token」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsCallbackToken() {
		return this.contains(FIELD_CALLBACKTOKEN);
	}

	/**
	 * 重置 「回调token」
	 *
	 */
	@JsonIgnore
	public OpenAccess resetCallbackToken() {
		this.reset(FIELD_CALLBACKTOKEN);
		return this;
	}
	

	/**
	 * 设置「回调参数」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenAccess setCallbackParam(String val) {
		this.set(FIELD_CALLBACKPARAM, val);
		return this;
	}

	/**
	 * 获取「回调参数」值
	 *
	 */
	@JsonIgnore
	public String getCallbackParam() {
		return (String) this.get(FIELD_CALLBACKPARAM);
	}

	/**
	 * 判断 「回调参数」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsCallbackParam() {
		return this.contains(FIELD_CALLBACKPARAM);
	}

	/**
	 * 重置 「回调参数」
	 *
	 */
	@JsonIgnore
	public OpenAccess resetCallbackParam() {
		this.reset(FIELD_CALLBACKPARAM);
		return this;
	}
	
	
	/**
	 * 设置「回调参数2」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenAccess setCallbackParam2(String val) {
		this.set(FIELD_CALLBACKPARAM2, val);
		return this;
	}

	/**
	 * 获取「回调参数2」值
	 *
	 */
	@JsonIgnore
	public String getCallbackParam2() {
		return (String) this.get(FIELD_CALLBACKPARAM2);
	}

	/**
	 * 判断 「回调参数2」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsCallbackParam2() {
		return this.contains(FIELD_CALLBACKPARAM2);
	}

	/**
	 * 重置 「回调参数2」
	 *
	 */
	@JsonIgnore
	public OpenAccess resetCallbackParam2() {
		this.reset(FIELD_CALLBACKPARAM2);
		return this;
	}
	
}
