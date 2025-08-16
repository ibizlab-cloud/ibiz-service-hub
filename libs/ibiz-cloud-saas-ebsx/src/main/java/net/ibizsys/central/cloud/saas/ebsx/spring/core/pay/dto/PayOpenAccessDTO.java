package net.ibizsys.central.cloud.saas.ebsx.spring.core.pay.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 支付平台
 * 
 * @see ibizmos:/psmodules/pay/psdataentities/PAY_OPEN_ACCESS/.ibizmodel.index
 */
public class PayOpenAccessDTO extends EntityDTO {

  /**.
   * 开放应用
   *
   * @see ibizmos:/psmodules/pay/psdataentities/PAY_OPEN_ACCESS/psdefields/ACCESSID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 应用名称
   *
   * @see ibizmos:/psmodules/pay/psdataentities/PAY_OPEN_ACCESS/psdefields/ACCESSNAME/.ibizmodel.index
   */
  public final static String FIELD_NAME = "name";

  /**.
   * 开放平台类型
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.OpenAccessType} 
   *
   * @see ibizmos:/psmodules/pay/psdataentities/PAY_OPEN_ACCESS/psdefields/OPEN_TYPE/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/pscodelists/OpenAccessType.ibizmodel.yaml
   */
  public final static String FIELD_OPENTYPE = "opentype";

  /**.
   * AccessKey(AppId)
   *
   * @see ibizmos:/psmodules/pay/psdataentities/PAY_OPEN_ACCESS/psdefields/ACCESS_KEY/.ibizmodel.index
   */
  public final static String FIELD_ACCESSKEY = "accesskey";

  /**.
   * SecretKey(AppSecret)
   *
   * @see ibizmos:/psmodules/pay/psdataentities/PAY_OPEN_ACCESS/psdefields/SECRET_KEY/.ibizmodel.index
   */
  public final static String FIELD_SECRETKEY = "secretkey";

  /**.
   * RegionId
   *
   * @see ibizmos:/psmodules/pay/psdataentities/PAY_OPEN_ACCESS/psdefields/REGION_ID/.ibizmodel.index
   */
  public final static String FIELD_REGIONID = "regionid";

  /**.
   * 管理账号token
   *
   * @see ibizmos:/psmodules/pay/psdataentities/PAY_OPEN_ACCESS/psdefields/ACCESS_TOKEN/.ibizmodel.index
   */
  public final static String FIELD_ACCESSTOKEN = "accesstoken";

  /**.
   * 管理账号token过期时间
   *
   * @see ibizmos:/psmodules/pay/psdataentities/PAY_OPEN_ACCESS/psdefields/EXPIRES_TIME/.ibizmodel.index
   */
  public final static String FIELD_EXPIRESTIME = "expirestime";

  /**.
   * 是否禁用
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/pay/psdataentities/PAY_OPEN_ACCESS/psdefields/DISABLED/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_DISABLED = "disabled";

  /**.
   * RedirectURI
   *
   * @see ibizmos:/psmodules/pay/psdataentities/PAY_OPEN_ACCESS/psdefields/REDIRECT_URI/.ibizmodel.index
   */
  public final static String FIELD_REDIRECTURI = "redirecturi";

  /**.
   * NotifyUrl
   *
   * @see ibizmos:/psmodules/pay/psdataentities/PAY_OPEN_ACCESS/psdefields/NOTIFY_URL/.ibizmodel.index
   */
  public final static String FIELD_NOTIFYURL = "notifyurl";

  /**.
   * AGENT_ID
   * 20210811:bigint->int
   *
   * @see ibizmos:/psmodules/pay/psdataentities/PAY_OPEN_ACCESS/psdefields/AGENT_ID/.ibizmodel.index
   */
  public final static String FIELD_AGENTID = "agentid";


    /**
     * 设置「开放应用」
     *
     * @param val
    */
    @JsonIgnore
    public PayOpenAccessDTO setId(String val) {
        this._set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「开放应用」值
     *
    */
    @JsonIgnore
    public String getId() {
        return (String) this._get(FIELD_ID);
    }

    /**
     * 判断 「开放应用」是否有值
     *
    */
    @JsonIgnore
    public boolean containsId() {
        return this._contains(FIELD_ID);
    }

    /**
     * 重置 「开放应用」
     *
    */
    @JsonIgnore
    public PayOpenAccessDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「应用名称」
     *
     * @param val
    */
    @JsonIgnore
    public PayOpenAccessDTO setName(String val) {
        this._set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「应用名称」值
     *
    */
    @JsonIgnore
    public String getName() {
        return (String) this._get(FIELD_NAME);
    }

    /**
     * 判断 「应用名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsName() {
        return this._contains(FIELD_NAME);
    }

    /**
     * 重置 「应用名称」
     *
    */
    @JsonIgnore
    public PayOpenAccessDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「开放平台类型」
     *
     * @param val
    */
    @JsonIgnore
    public PayOpenAccessDTO setOpenType(String val) {
        this._set(FIELD_OPENTYPE, val);
        return this;
    }

    /**
     * 获取「开放平台类型」值
     *
    */
    @JsonIgnore
    public String getOpenType() {
        return (String) this._get(FIELD_OPENTYPE);
    }

    /**
     * 判断 「开放平台类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOpenType() {
        return this._contains(FIELD_OPENTYPE);
    }

    /**
     * 重置 「开放平台类型」
     *
    */
    @JsonIgnore
    public PayOpenAccessDTO resetOpenType() {
        this._reset(FIELD_OPENTYPE);
        return this;
    }

    /**
     * 设置「AccessKey(AppId)」
     *
     * @param val
    */
    @JsonIgnore
    public PayOpenAccessDTO setAccessKey(String val) {
        this._set(FIELD_ACCESSKEY, val);
        return this;
    }

    /**
     * 获取「AccessKey(AppId)」值
     *
    */
    @JsonIgnore
    public String getAccessKey() {
        return (String) this._get(FIELD_ACCESSKEY);
    }

    /**
     * 判断 「AccessKey(AppId)」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAccessKey() {
        return this._contains(FIELD_ACCESSKEY);
    }

    /**
     * 重置 「AccessKey(AppId)」
     *
    */
    @JsonIgnore
    public PayOpenAccessDTO resetAccessKey() {
        this._reset(FIELD_ACCESSKEY);
        return this;
    }

    /**
     * 设置「SecretKey(AppSecret)」
     *
     * @param val
    */
    @JsonIgnore
    public PayOpenAccessDTO setSecretKey(String val) {
        this._set(FIELD_SECRETKEY, val);
        return this;
    }

    /**
     * 获取「SecretKey(AppSecret)」值
     *
    */
    @JsonIgnore
    public String getSecretKey() {
        return (String) this._get(FIELD_SECRETKEY);
    }

    /**
     * 判断 「SecretKey(AppSecret)」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSecretKey() {
        return this._contains(FIELD_SECRETKEY);
    }

    /**
     * 重置 「SecretKey(AppSecret)」
     *
    */
    @JsonIgnore
    public PayOpenAccessDTO resetSecretKey() {
        this._reset(FIELD_SECRETKEY);
        return this;
    }

    /**
     * 设置「RegionId」
     *
     * @param val
    */
    @JsonIgnore
    public PayOpenAccessDTO setRegionId(String val) {
        this._set(FIELD_REGIONID, val);
        return this;
    }

    /**
     * 获取「RegionId」值
     *
    */
    @JsonIgnore
    public String getRegionId() {
        return (String) this._get(FIELD_REGIONID);
    }

    /**
     * 判断 「RegionId」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRegionId() {
        return this._contains(FIELD_REGIONID);
    }

    /**
     * 重置 「RegionId」
     *
    */
    @JsonIgnore
    public PayOpenAccessDTO resetRegionId() {
        this._reset(FIELD_REGIONID);
        return this;
    }

    /**
     * 设置「管理账号token」
     *
     * @param val
    */
    @JsonIgnore
    public PayOpenAccessDTO setAccessToken(String val) {
        this._set(FIELD_ACCESSTOKEN, val);
        return this;
    }

    /**
     * 获取「管理账号token」值
     *
    */
    @JsonIgnore
    public String getAccessToken() {
        return (String) this._get(FIELD_ACCESSTOKEN);
    }

    /**
     * 判断 「管理账号token」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAccessToken() {
        return this._contains(FIELD_ACCESSTOKEN);
    }

    /**
     * 重置 「管理账号token」
     *
    */
    @JsonIgnore
    public PayOpenAccessDTO resetAccessToken() {
        this._reset(FIELD_ACCESSTOKEN);
        return this;
    }

    /**
     * 设置「管理账号token过期时间」
     *
     * @param val
    */
    @JsonIgnore
    public PayOpenAccessDTO setExpiresTime(Timestamp val) {
        this._set(FIELD_EXPIRESTIME, val);
        return this;
    }

    /**
     * 获取「管理账号token过期时间」值
     *
    */
    @JsonIgnore
    public Timestamp getExpiresTime() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_EXPIRESTIME),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「管理账号token过期时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsExpiresTime() {
        return this._contains(FIELD_EXPIRESTIME);
    }

    /**
     * 重置 「管理账号token过期时间」
     *
    */
    @JsonIgnore
    public PayOpenAccessDTO resetExpiresTime() {
        this._reset(FIELD_EXPIRESTIME);
        return this;
    }

    /**
     * 设置「是否禁用」
     *
     * @param val
    */
    @JsonIgnore
    public PayOpenAccessDTO setDisabled(Integer val) {
        this._set(FIELD_DISABLED, val);
        return this;
    }

    /**
     * 获取「是否禁用」值
     *
    */
    @JsonIgnore
    public Integer getDisabled() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_DISABLED),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「是否禁用」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDisabled() {
        return this._contains(FIELD_DISABLED);
    }

    /**
     * 重置 「是否禁用」
     *
    */
    @JsonIgnore
    public PayOpenAccessDTO resetDisabled() {
        this._reset(FIELD_DISABLED);
        return this;
    }

    /**
     * 设置「RedirectURI」
     *
     * @param val
    */
    @JsonIgnore
    public PayOpenAccessDTO setRedirectUri(String val) {
        this._set(FIELD_REDIRECTURI, val);
        return this;
    }

    /**
     * 获取「RedirectURI」值
     *
    */
    @JsonIgnore
    public String getRedirectUri() {
        return (String) this._get(FIELD_REDIRECTURI);
    }

    /**
     * 判断 「RedirectURI」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRedirectUri() {
        return this._contains(FIELD_REDIRECTURI);
    }

    /**
     * 重置 「RedirectURI」
     *
    */
    @JsonIgnore
    public PayOpenAccessDTO resetRedirectUri() {
        this._reset(FIELD_REDIRECTURI);
        return this;
    }

    /**
     * 设置「NotifyUrl」
     *
     * @param val
    */
    @JsonIgnore
    public PayOpenAccessDTO setNotifyUrl(String val) {
        this._set(FIELD_NOTIFYURL, val);
        return this;
    }

    /**
     * 获取「NotifyUrl」值
     *
    */
    @JsonIgnore
    public String getNotifyUrl() {
        return (String) this._get(FIELD_NOTIFYURL);
    }

    /**
     * 判断 「NotifyUrl」是否有值
     *
    */
    @JsonIgnore
    public boolean containsNotifyUrl() {
        return this._contains(FIELD_NOTIFYURL);
    }

    /**
     * 重置 「NotifyUrl」
     *
    */
    @JsonIgnore
    public PayOpenAccessDTO resetNotifyUrl() {
        this._reset(FIELD_NOTIFYURL);
        return this;
    }

    /**
     * 设置「AGENT_ID」
     *
     * @param val
    */
    @JsonIgnore
    public PayOpenAccessDTO setAgentId(Long val) {
        this._set(FIELD_AGENTID, val);
        return this;
    }

    /**
     * 获取「AGENT_ID」值
     *
    */
    @JsonIgnore
    public Long getAgentId() {
        try{
            return DataTypeUtils.getLongValue(this._get(FIELD_AGENTID),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「AGENT_ID」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAgentId() {
        return this._contains(FIELD_AGENTID);
    }

    /**
     * 重置 「AGENT_ID」
     *
    */
    @JsonIgnore
    public PayOpenAccessDTO resetAgentId() {
        this._reset(FIELD_AGENTID);
        return this;
    }


}
