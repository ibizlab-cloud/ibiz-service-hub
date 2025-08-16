package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 机构
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_CENTER/.ibizmodel.index
 */
public class CenterDTO extends EntityDTO {

  /**.
   * 机构名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_CENTER/psdefields/CENTERNAME/.ibizmodel.index
   */
  public final static String FIELD_CENTERNAME = "centername";

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_CENTER/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_CENTER/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 域名
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_CENTER/psdefields/DOMAINS/.ibizmodel.index
   */
  public final static String FIELD_DOMAIN = "domain";

  /**.
   * 到期时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_CENTER/psdefields/EXPIRATIONDATE/.ibizmodel.index
   */
  public final static String FIELD_EXPIRATIONDATE = "expirationdate";

  /**.
   * 门户地址
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_CENTER/psdefields/PORTALURL/.ibizmodel.index
   */
  public final static String FIELD_PORTALURL = "portalurl";

  /**.
   * 机构标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_CENTER/psdefields/CENTERID/.ibizmodel.index
   */
  public final static String FIELD_SYSCENTERID = "syscenterid";

  /**.
   * 第三方插件服务地址
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_CENTER/psdefields/TPPROOTURL/.ibizmodel.index
   */
  public final static String FIELD_TPPROOTURL = "tpprooturl";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_CENTER/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_CENTER/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";


    /**
     * 设置「机构名称」
     *
     * @param val
    */
    @JsonIgnore
    public CenterDTO setCenterName(String val) {
        this._set(FIELD_CENTERNAME, val);
        return this;
    }

    /**
     * 获取「机构名称」值
     *
    */
    @JsonIgnore
    public String getCenterName() {
        return (String) this._get(FIELD_CENTERNAME);
    }

    /**
     * 判断 「机构名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCenterName() {
        return this._contains(FIELD_CENTERNAME);
    }

    /**
     * 重置 「机构名称」
     *
    */
    @JsonIgnore
    public CenterDTO resetCenterName() {
        this._reset(FIELD_CENTERNAME);
        return this;
    }

    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public CenterDTO setCreateDate(Timestamp val) {
        this._set(FIELD_CREATEDATE, val);
        return this;
    }

    /**
     * 获取「建立时间」值
     *
    */
    @JsonIgnore
    public Timestamp getCreateDate() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_CREATEDATE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「建立时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateDate() {
        return this._contains(FIELD_CREATEDATE);
    }

    /**
     * 重置 「建立时间」
     *
    */
    @JsonIgnore
    public CenterDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public CenterDTO setCreateMan(String val) {
        this._set(FIELD_CREATEMAN, val);
        return this;
    }

    /**
     * 获取「建立人」值
     *
    */
    @JsonIgnore
    public String getCreateMan() {
        return (String) this._get(FIELD_CREATEMAN);
    }

    /**
     * 判断 「建立人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateMan() {
        return this._contains(FIELD_CREATEMAN);
    }

    /**
     * 重置 「建立人」
     *
    */
    @JsonIgnore
    public CenterDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「域名」
     *
     * @param val
    */
    @JsonIgnore
    public CenterDTO setDomain(String val) {
        this._set(FIELD_DOMAIN, val);
        return this;
    }

    /**
     * 获取「域名」值
     *
    */
    @JsonIgnore
    public String getDomain() {
        return (String) this._get(FIELD_DOMAIN);
    }

    /**
     * 判断 「域名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDomain() {
        return this._contains(FIELD_DOMAIN);
    }

    /**
     * 重置 「域名」
     *
    */
    @JsonIgnore
    public CenterDTO resetDomain() {
        this._reset(FIELD_DOMAIN);
        return this;
    }

    /**
     * 设置「到期时间」
     *
     * @param val
    */
    @JsonIgnore
    public CenterDTO setExpirationDate(Timestamp val) {
        this._set(FIELD_EXPIRATIONDATE, val);
        return this;
    }

    /**
     * 获取「到期时间」值
     *
    */
    @JsonIgnore
    public Timestamp getExpirationDate() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_EXPIRATIONDATE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「到期时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsExpirationDate() {
        return this._contains(FIELD_EXPIRATIONDATE);
    }

    /**
     * 重置 「到期时间」
     *
    */
    @JsonIgnore
    public CenterDTO resetExpirationDate() {
        this._reset(FIELD_EXPIRATIONDATE);
        return this;
    }

    /**
     * 设置「门户地址」
     *
     * @param val
    */
    @JsonIgnore
    public CenterDTO setPortalUrl(String val) {
        this._set(FIELD_PORTALURL, val);
        return this;
    }

    /**
     * 获取「门户地址」值
     *
    */
    @JsonIgnore
    public String getPortalUrl() {
        return (String) this._get(FIELD_PORTALURL);
    }

    /**
     * 判断 「门户地址」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPortalUrl() {
        return this._contains(FIELD_PORTALURL);
    }

    /**
     * 重置 「门户地址」
     *
    */
    @JsonIgnore
    public CenterDTO resetPortalUrl() {
        this._reset(FIELD_PORTALURL);
        return this;
    }

    /**
     * 设置「机构标识」
     *
     * @param val
    */
    @JsonIgnore
    public CenterDTO setSysCenterId(String val) {
        this._set(FIELD_SYSCENTERID, val);
        return this;
    }

    /**
     * 获取「机构标识」值
     *
    */
    @JsonIgnore
    public String getSysCenterId() {
        return (String) this._get(FIELD_SYSCENTERID);
    }

    /**
     * 判断 「机构标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysCenterId() {
        return this._contains(FIELD_SYSCENTERID);
    }

    /**
     * 重置 「机构标识」
     *
    */
    @JsonIgnore
    public CenterDTO resetSysCenterId() {
        this._reset(FIELD_SYSCENTERID);
        return this;
    }

    /**
     * 设置「第三方插件服务地址」
     *
     * @param val
    */
    @JsonIgnore
    public CenterDTO setTPPRootUrl(String val) {
        this._set(FIELD_TPPROOTURL, val);
        return this;
    }

    /**
     * 获取「第三方插件服务地址」值
     *
    */
    @JsonIgnore
    public String getTPPRootUrl() {
        return (String) this._get(FIELD_TPPROOTURL);
    }

    /**
     * 判断 「第三方插件服务地址」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTPPRootUrl() {
        return this._contains(FIELD_TPPROOTURL);
    }

    /**
     * 重置 「第三方插件服务地址」
     *
    */
    @JsonIgnore
    public CenterDTO resetTPPRootUrl() {
        this._reset(FIELD_TPPROOTURL);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public CenterDTO setUpdateDate(Timestamp val) {
        this._set(FIELD_UPDATEDATE, val);
        return this;
    }

    /**
     * 获取「更新时间」值
     *
    */
    @JsonIgnore
    public Timestamp getUpdateDate() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_UPDATEDATE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「更新时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUpdateDate() {
        return this._contains(FIELD_UPDATEDATE);
    }

    /**
     * 重置 「更新时间」
     *
    */
    @JsonIgnore
    public CenterDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public CenterDTO setUpdateMan(String val) {
        this._set(FIELD_UPDATEMAN, val);
        return this;
    }

    /**
     * 获取「更新人」值
     *
    */
    @JsonIgnore
    public String getUpdateMan() {
        return (String) this._get(FIELD_UPDATEMAN);
    }

    /**
     * 判断 「更新人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUpdateMan() {
        return this._contains(FIELD_UPDATEMAN);
    }

    /**
     * 重置 「更新人」
     *
    */
    @JsonIgnore
    public CenterDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
