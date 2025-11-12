package cn.ibizlab.central.plugin.odoo.dataentity.dto;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.central.util.IEntityDTO;


public class AuthLogDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 标识
     */
    public final static String FIELD_LOGID = "logid";

    /**
     * 属性: 用户全局标识
     */
    public final static String FIELD_USERID = "userid";

    /**
     * 属性: 用户全局名
     */
    public final static String FIELD_USERNAME = "username";

    /**
     * 属性: 用户名称
     */
    public final static String FIELD_PERSONNAME = "personname";

    /**
     * 属性: 域
     */
    public final static String FIELD_DOMAIN = "domain";

    /**
     * 属性: 认证时间
     */
    public final static String FIELD_AUTHTIME = "authtime";

    /**
     * 属性: IP地址
     */
    public final static String FIELD_IPADDR = "ipaddr";

    /**
     * 属性: MAC地址
     */
    public final static String FIELD_MACADDR = "macaddr";

    /**
     * 属性: 客户端
     */
    public final static String FIELD_USERAGENT = "useragent";

    /**
     * 属性: 认证方式
     */
    public final static String FIELD_AUTHAGENT = "authagent";

    /**
     * 属性: 认证结果
     */
    public final static String FIELD_AUTHCODE = "authcode";

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_LOGID)
    public AuthLogDTO setLogId(String val) {
        this._set(FIELD_LOGID, val);
        return this;
    }

    public AuthLogDTO setId(String val) {
        this.setLogId(val);
        return this;
    }

    /**
     * 获取「标识」值
     *
     */
    @JsonIgnore
    public String getLogId() {
        return DataTypeUtils.asString(this._get(FIELD_LOGID), null);
    }

    @JsonIgnore
    public String getId() {
        return getLogId();
    }

    /**
     * 判断 「标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLogId() {
        return this._contains(FIELD_LOGID);
    }

    /**
     * 重置 「标识」
     *
     */
    @JsonIgnore
    public AuthLogDTO resetLogId() {
        this._reset(FIELD_LOGID);
        return this;
    }

    /**
     * 设置「用户全局标识」
     * @param val
     */
    @JsonProperty(FIELD_USERID)
    public AuthLogDTO setUserId(String val) {
        this._set(FIELD_USERID, val);
        return this;
    }

    /**
     * 获取「用户全局标识」值
     *
     */
    @JsonIgnore
    public String getUserId() {
        return DataTypeUtils.asString(this._get(FIELD_USERID), null);
    }

    /**
     * 判断 「用户全局标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUserId() {
        return this._contains(FIELD_USERID);
    }

    /**
     * 重置 「用户全局标识」
     *
     */
    @JsonIgnore
    public AuthLogDTO resetUserId() {
        this._reset(FIELD_USERID);
        return this;
    }

    /**
     * 设置「用户全局名」
     * @param val
     */
    @JsonProperty(FIELD_USERNAME)
    public AuthLogDTO setUserName(String val) {
        this._set(FIELD_USERNAME, val);
        return this;
    }

    public AuthLogDTO setName(String val) {
        this.setUserName(val);
        return this;
    }

    /**
     * 获取「用户全局名」值
     *
     */
    @JsonIgnore
    public String getUserName() {
        return DataTypeUtils.asString(this._get(FIELD_USERNAME), null);
    }

    @JsonIgnore
    public String getName() {
        return getUserName();
    }

    /**
     * 判断 「用户全局名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUserName() {
        return this._contains(FIELD_USERNAME);
    }

    /**
     * 重置 「用户全局名」
     *
     */
    @JsonIgnore
    public AuthLogDTO resetUserName() {
        this._reset(FIELD_USERNAME);
        return this;
    }

    /**
     * 设置「用户名称」
     * @param val
     */
    @JsonProperty(FIELD_PERSONNAME)
    public AuthLogDTO setPersonName(String val) {
        this._set(FIELD_PERSONNAME, val);
        return this;
    }

    /**
     * 获取「用户名称」值
     *
     */
    @JsonIgnore
    public String getPersonName() {
        return DataTypeUtils.asString(this._get(FIELD_PERSONNAME), null);
    }

    /**
     * 判断 「用户名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPersonName() {
        return this._contains(FIELD_PERSONNAME);
    }

    /**
     * 重置 「用户名称」
     *
     */
    @JsonIgnore
    public AuthLogDTO resetPersonName() {
        this._reset(FIELD_PERSONNAME);
        return this;
    }

    /**
     * 设置「域」
     * @param val
     */
    @JsonProperty(FIELD_DOMAIN)
    public AuthLogDTO setDomain(String val) {
        this._set(FIELD_DOMAIN, val);
        return this;
    }

    /**
     * 获取「域」值
     *
     */
    @JsonIgnore
    public String getDomain() {
        return DataTypeUtils.asString(this._get(FIELD_DOMAIN), null);
    }

    /**
     * 判断 「域」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDomain() {
        return this._contains(FIELD_DOMAIN);
    }

    /**
     * 重置 「域」
     *
     */
    @JsonIgnore
    public AuthLogDTO resetDomain() {
        this._reset(FIELD_DOMAIN);
        return this;
    }

    /**
     * 设置「认证时间」
     * @param val
     */
    @JsonProperty(FIELD_AUTHTIME)
    public AuthLogDTO setAuthTime(Timestamp val) {
        this._set(FIELD_AUTHTIME, val);
        return this;
    }

    /**
     * 获取「认证时间」值
     *
     */
    @JsonIgnore
    public Timestamp getAuthTime() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_AUTHTIME), null);
    }

    /**
     * 判断 「认证时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAuthTime() {
        return this._contains(FIELD_AUTHTIME);
    }

    /**
     * 重置 「认证时间」
     *
     */
    @JsonIgnore
    public AuthLogDTO resetAuthTime() {
        this._reset(FIELD_AUTHTIME);
        return this;
    }

    /**
     * 设置「IP地址」
     * @param val
     */
    @JsonProperty(FIELD_IPADDR)
    public AuthLogDTO setIPAddr(String val) {
        this._set(FIELD_IPADDR, val);
        return this;
    }

    /**
     * 获取「IP地址」值
     *
     */
    @JsonIgnore
    public String getIPAddr() {
        return DataTypeUtils.asString(this._get(FIELD_IPADDR), null);
    }

    /**
     * 判断 「IP地址」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIPAddr() {
        return this._contains(FIELD_IPADDR);
    }

    /**
     * 重置 「IP地址」
     *
     */
    @JsonIgnore
    public AuthLogDTO resetIPAddr() {
        this._reset(FIELD_IPADDR);
        return this;
    }

    /**
     * 设置「MAC地址」
     * @param val
     */
    @JsonProperty(FIELD_MACADDR)
    public AuthLogDTO setMacAddr(String val) {
        this._set(FIELD_MACADDR, val);
        return this;
    }

    /**
     * 获取「MAC地址」值
     *
     */
    @JsonIgnore
    public String getMacAddr() {
        return DataTypeUtils.asString(this._get(FIELD_MACADDR), null);
    }

    /**
     * 判断 「MAC地址」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMacAddr() {
        return this._contains(FIELD_MACADDR);
    }

    /**
     * 重置 「MAC地址」
     *
     */
    @JsonIgnore
    public AuthLogDTO resetMacAddr() {
        this._reset(FIELD_MACADDR);
        return this;
    }

    /**
     * 设置「客户端」
     * @param val
     */
    @JsonProperty(FIELD_USERAGENT)
    public AuthLogDTO setUserAgent(String val) {
        this._set(FIELD_USERAGENT, val);
        return this;
    }

    /**
     * 获取「客户端」值
     *
     */
    @JsonIgnore
    public String getUserAgent() {
        return DataTypeUtils.asString(this._get(FIELD_USERAGENT), null);
    }

    /**
     * 判断 「客户端」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUserAgent() {
        return this._contains(FIELD_USERAGENT);
    }

    /**
     * 重置 「客户端」
     *
     */
    @JsonIgnore
    public AuthLogDTO resetUserAgent() {
        this._reset(FIELD_USERAGENT);
        return this;
    }

    /**
     * 设置「认证方式」
     * @param val
     */
    @JsonProperty(FIELD_AUTHAGENT)
    public AuthLogDTO setAuthAgent(String val) {
        this._set(FIELD_AUTHAGENT, val);
        return this;
    }

    /**
     * 获取「认证方式」值
     *
     */
    @JsonIgnore
    public String getAuthAgent() {
        return DataTypeUtils.asString(this._get(FIELD_AUTHAGENT), null);
    }

    /**
     * 判断 「认证方式」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAuthAgent() {
        return this._contains(FIELD_AUTHAGENT);
    }

    /**
     * 重置 「认证方式」
     *
     */
    @JsonIgnore
    public AuthLogDTO resetAuthAgent() {
        this._reset(FIELD_AUTHAGENT);
        return this;
    }

    /**
     * 设置「认证结果」
     * 代码表[登录结果]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.AuthCode
     * @param val
     */
    @JsonProperty(FIELD_AUTHCODE)
    public AuthLogDTO setAuthCode(String val) {
        this._set(FIELD_AUTHCODE, val);
        return this;
    }

    /**
     * 获取「认证结果」值
     * 代码表[登录结果]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.AuthCode
     *
     */
    @JsonIgnore
    public String getAuthCode() {
        return DataTypeUtils.asString(this._get(FIELD_AUTHCODE), null);
    }

    /**
     * 判断 「认证结果」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAuthCode() {
        return this._contains(FIELD_AUTHCODE);
    }

    /**
     * 重置 「认证结果」
     *
     */
    @JsonIgnore
    public AuthLogDTO resetAuthCode() {
        this._reset(FIELD_AUTHCODE);
        return this;
    }

}
