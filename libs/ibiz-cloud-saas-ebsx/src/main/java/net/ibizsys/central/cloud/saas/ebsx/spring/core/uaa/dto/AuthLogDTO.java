package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 认证日志
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_AUTHLOG/.ibizmodel.index
 */
public class AuthLogDTO extends EntityDTO {

  /**.
   * 标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_AUTHLOG/psdefields/LOGID/.ibizmodel.index
   */
  public final static String FIELD_LOGID = "logid";

  /**.
   * 用户全局标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_AUTHLOG/psdefields/USERID/.ibizmodel.index
   */
  public final static String FIELD_USERID = "userid";

  /**.
   * 用户全局名
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_AUTHLOG/psdefields/USERNAME/.ibizmodel.index
   */
  public final static String FIELD_USERNAME = "username";

  /**.
   * 用户名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_AUTHLOG/psdefields/PERSONNAME/.ibizmodel.index
   */
  public final static String FIELD_PERSONNAME = "personname";

  /**.
   * 域
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_AUTHLOG/psdefields/DOMAINS/.ibizmodel.index
   */
  public final static String FIELD_DOMAIN = "domain";

  /**.
   * 认证时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_AUTHLOG/psdefields/AUTHTIME/.ibizmodel.index
   */
  public final static String FIELD_AUTHTIME = "authtime";

  /**.
   * IP地址
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_AUTHLOG/psdefields/IPADDR/.ibizmodel.index
   */
  public final static String FIELD_IPADDR = "ipaddr";

  /**.
   * MAC地址
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_AUTHLOG/psdefields/MACADDR/.ibizmodel.index
   */
  public final static String FIELD_MACADDR = "macaddr";

  /**.
   * 客户端
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_AUTHLOG/psdefields/USERAGENT/.ibizmodel.index
   */
  public final static String FIELD_USERAGENT = "useragent";

  /**.
   * 认证方式
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_AUTHLOG/psdefields/AUTHAGENT/.ibizmodel.index
   */
  public final static String FIELD_AUTHAGENT = "authagent";

  /**.
   * 认证结果
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.AuthCode} 
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_AUTHLOG/psdefields/AUTHCODE/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/AuthCode.ibizmodel.yaml
   */
  public final static String FIELD_AUTHCODE = "authcode";


    /**
     * 设置「标识」
     *
     * @param val
    */
    @JsonIgnore
    public AuthLogDTO setLogId(String val) {
        this._set(FIELD_LOGID, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
    */
    @JsonIgnore
    public String getLogId() {
        return (String) this._get(FIELD_LOGID);
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
     *
     * @param val
    */
    @JsonIgnore
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
        return (String) this._get(FIELD_USERID);
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
     *
     * @param val
    */
    @JsonIgnore
    public AuthLogDTO setUserName(String val) {
        this._set(FIELD_USERNAME, val);
        return this;
    }

    /**
     * 获取「用户全局名」值
     *
    */
    @JsonIgnore
    public String getUserName() {
        return (String) this._get(FIELD_USERNAME);
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
     *
     * @param val
    */
    @JsonIgnore
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
        return (String) this._get(FIELD_PERSONNAME);
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
     *
     * @param val
    */
    @JsonIgnore
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
        return (String) this._get(FIELD_DOMAIN);
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
     *
     * @param val
    */
    @JsonIgnore
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
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_AUTHTIME),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
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
     *
     * @param val
    */
    @JsonIgnore
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
        return (String) this._get(FIELD_IPADDR);
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
     *
     * @param val
    */
    @JsonIgnore
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
        return (String) this._get(FIELD_MACADDR);
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
     *
     * @param val
    */
    @JsonIgnore
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
        return (String) this._get(FIELD_USERAGENT);
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
     *
     * @param val
    */
    @JsonIgnore
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
        return (String) this._get(FIELD_AUTHAGENT);
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
     *
     * @param val
    */
    @JsonIgnore
    public AuthLogDTO setAuthCode(String val) {
        this._set(FIELD_AUTHCODE, val);
        return this;
    }

    /**
     * 获取「认证结果」值
     *
    */
    @JsonIgnore
    public String getAuthCode() {
        return (String) this._get(FIELD_AUTHCODE);
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
