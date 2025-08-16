package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 数据流应用
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_ACCESS/.ibizmodel.index
 */
public class DataFlowAccess extends EntityBase {

	/**
	 * 数据流应用标识
	 */
	public final static String FIELD_ID = "id";

	/**
	 * 数据流应用
	 */
	public final static String FIELD_NAME = "name";

	/**
	 *  数据流应用类型
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
	 * 是否禁用
	 */
	public final static String FIELD_DISABLED = "disabled";

	/**
	 * RedirectURI
	 */
	public final static String FIELD_REDIRECTURI = "redirecturi";

	/**
	 * NotifyUrl
	 */
	public final static String FIELD_NOTIFYURL = "notifyurl";

	/**
	 * AGENT_ID 20210811:bigint->int
	 */
	public final static String FIELD_AGENTID = "agentid";

	/**
	 * 单位
	 */
	public final static String FIELD_ORGID = "orgid";

	/**
	 * 是否移动接入应用
	 */
	public final static String FIELD_ISMOBACCAPP = "ismobaccapp";

	/**
	 * ProxyUrl
	 */
	public final static String FIELD_PROXYURL = "proxyurl";
	
	
	/**
	 * ServicceUrl
	 */
	public final static String FIELD_SERVICEURL = "serviceurl";
	
	
	/**
	 * 设置「数据流应用标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DataFlowAccess setId(String val) {
		this.set(FIELD_ID, val);
		return this;
	}

	/**
	 * 获取「数据流应用标识」值
	 *
	 */
	@JsonIgnore
	public String getId() {
		return (String) this.get(FIELD_ID);
	}

	/**
	 * 判断 「数据流应用标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsId() {
		return this.contains(FIELD_ID);
	}

	/**
	 * 重置 「数据流应用标识」
	 *
	 */
	@JsonIgnore
	public DataFlowAccess resetId() {
		this.reset(FIELD_ID);
		return this;
	}

	/**
	 * 设置「数据流应用」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DataFlowAccess setName(String val) {
		this.set(FIELD_NAME, val);
		return this;
	}

	/**
	 * 获取「数据流应用」值
	 *
	 */
	@JsonIgnore
	public String getName() {
		return (String) this.get(FIELD_NAME);
	}

	/**
	 * 判断 「数据流应用」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsName() {
		return this.contains(FIELD_NAME);
	}

	/**
	 * 重置 「数据流应用」
	 *
	 */
	@JsonIgnore
	public DataFlowAccess resetName() {
		this.reset(FIELD_NAME);
		return this;
	}

	/**
	 * 设置「数据流应用类型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DataFlowAccess setType(String val) {
		this.set(FIELD_TYPE, val);
		return this;
	}

	/**
	 * 获取「数据流应用类型」值
	 *
	 */
	@JsonIgnore
	public String getType() {
		return (String) this.get(FIELD_TYPE);
	}

	/**
	 * 判断 「数据流应用类型」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsType() {
		return this.contains(FIELD_TYPE);
	}

	/**
	 * 重置 「数据流应用类型」
	 *
	 */
	@JsonIgnore
	public DataFlowAccess resetType() {
		this.reset(FIELD_TYPE);
		return this;
	}

	/**
	 * 设置「AccessKey(AppId)」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DataFlowAccess setAccessKey(String val) {
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
	public DataFlowAccess resetAccessKey() {
		this.reset(FIELD_ACCESSKEY);
		return this;
	}

	/**
	 * 设置「SecretKey(AppSecret)」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DataFlowAccess setSecretKey(String val) {
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
	public DataFlowAccess resetSecretKey() {
		this.reset(FIELD_SECRETKEY);
		return this;
	}

	/**
	 * 设置「RegionId」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DataFlowAccess setRegionId(String val) {
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
	public DataFlowAccess resetRegionId() {
		this.reset(FIELD_REGIONID);
		return this;
	}

	/**
	 * 设置「管理账号token」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DataFlowAccess setAccessToken(String val) {
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
	public DataFlowAccess resetAccessToken() {
		this.reset(FIELD_ACCESSTOKEN);
		return this;
	}

	/**
	 * 设置「管理账号token过期时间」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DataFlowAccess setExpiresTime(Timestamp val) {
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
	public DataFlowAccess resetExpiresTime() {
		this.reset(FIELD_EXPIRESTIME);
		return this;
	}

	/**
	 * 设置「是否禁用」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DataFlowAccess setDisabled(Integer val) {
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
	public DataFlowAccess resetDisabled() {
		this.reset(FIELD_DISABLED);
		return this;
	}

	/**
	 * 设置「RedirectURI」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DataFlowAccess setRedirectUri(String val) {
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
	public DataFlowAccess resetRedirectUri() {
		this.reset(FIELD_REDIRECTURI);
		return this;
	}

	/**
	 * 设置「NotifyUrl」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DataFlowAccess setNotifyUrl(String val) {
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
	public DataFlowAccess resetNotifyUrl() {
		this.reset(FIELD_NOTIFYURL);
		return this;
	}
	
	
	/**
	 * 设置「ProxyUrl」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DataFlowAccess setProxyUrl(String val) {
		this.set(FIELD_PROXYURL, val);
		return this;
	}

	/**
	 * 获取「ProxyUrl」值
	 *
	 */
	@JsonIgnore
	public String getProxyUrl() {
		return (String) this.get(FIELD_PROXYURL);
	}

	/**
	 * 判断 「ProxyUrl」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsProxyUrl() {
		return this.contains(FIELD_PROXYURL);
	}

	/**
	 * 重置 「ProxyUrl」
	 *
	 */
	@JsonIgnore
	public DataFlowAccess resetProxyUrl() {
		this.reset(FIELD_PROXYURL);
		return this;
	}
	

	/**
	 * 设置「ServiceUrl」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DataFlowAccess setServiceUrl(String val) {
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
	public DataFlowAccess resetServiceUrl() {
		this.reset(FIELD_SERVICEURL);
		return this;
	}
	
	/**
	 * 设置「AGENT_ID」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DataFlowAccess setAgentId(Long val) {
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
	public DataFlowAccess resetAgentId() {
		this.reset(FIELD_AGENTID);
		return this;
	}

	/**
	 * 设置「单位」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DataFlowAccess setOrgId(String val) {
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
	public DataFlowAccess resetOrgId() {
		this.reset(FIELD_ORGID);
		return this;
	}

	/**
	 * 设置「是否移动接入应用」
	 *
	 * @param val
	 */
	@JsonIgnore
	public DataFlowAccess setIsMobAccApp(Integer val) {
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
	public DataFlowAccess resetIsMobAccApp() {
		this.reset(FIELD_ISMOBACCAPP);
		return this;
	}

}
