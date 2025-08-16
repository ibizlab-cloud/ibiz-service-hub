package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 机构
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_CENTER/.ibizmodel.index
 */
public class DepCenter extends EntityBase {

  /**.
   * 租户名称
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
   * 租户标识
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
     * 设置「租户名称」
     *
     * @param val
    */
    @JsonIgnore
    public DepCenter setCenterName(String val) {
        this.set(FIELD_CENTERNAME, val);
        return this;
    }

    /**
     * 获取「租户名称」值
     *
    */
    @JsonIgnore
    public String getCenterName() {
        return (String) this.get(FIELD_CENTERNAME);
    }

    /**
     * 判断 「租户名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCenterName() {
        return this.contains(FIELD_CENTERNAME);
    }

    /**
     * 重置 「租户名称」
     *
    */
    @JsonIgnore
    public DepCenter resetCenterName() {
        this.reset(FIELD_CENTERNAME);
        return this;
    }

    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public DepCenter setCreateDate(Timestamp val) {
        this.set(FIELD_CREATEDATE, val);
        return this;
    }

    /**
     * 获取「建立时间」值
     *
    */
    @JsonIgnore
    public Timestamp getCreateDate() {
        try{
            return DataTypeUtils.getDateTimeValue(this.get(FIELD_CREATEDATE),null);
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
        return this.contains(FIELD_CREATEDATE);
    }

    /**
     * 重置 「建立时间」
     *
    */
    @JsonIgnore
    public DepCenter resetCreateDate() {
        this.reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public DepCenter setCreateMan(String val) {
        this.set(FIELD_CREATEMAN, val);
        return this;
    }

    /**
     * 获取「建立人」值
     *
    */
    @JsonIgnore
    public String getCreateMan() {
        return (String) this.get(FIELD_CREATEMAN);
    }

    /**
     * 判断 「建立人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateMan() {
        return this.contains(FIELD_CREATEMAN);
    }

    /**
     * 重置 「建立人」
     *
    */
    @JsonIgnore
    public DepCenter resetCreateMan() {
        this.reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「域名」
     *
     * @param val
    */
    @JsonIgnore
    public DepCenter setDomain(String val) {
        this.set(FIELD_DOMAIN, val);
        return this;
    }

    /**
     * 获取「域名」值
     *
    */
    @JsonIgnore
    public String getDomain() {
        return (String) this.get(FIELD_DOMAIN);
    }

    /**
     * 判断 「域名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDomain() {
        return this.contains(FIELD_DOMAIN);
    }

    /**
     * 重置 「域名」
     *
    */
    @JsonIgnore
    public DepCenter resetDomain() {
        this.reset(FIELD_DOMAIN);
        return this;
    }

    /**
     * 设置「到期时间」
     *
     * @param val
    */
    @JsonIgnore
    public DepCenter setExpirationDate(Timestamp val) {
        this.set(FIELD_EXPIRATIONDATE, val);
        return this;
    }

    /**
     * 获取「到期时间」值
     *
    */
    @JsonIgnore
    public Timestamp getExpirationDate() {
        try{
            return DataTypeUtils.getDateTimeValue(this.get(FIELD_EXPIRATIONDATE),null);
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
        return this.contains(FIELD_EXPIRATIONDATE);
    }

    /**
     * 重置 「到期时间」
     *
    */
    @JsonIgnore
    public DepCenter resetExpirationDate() {
        this.reset(FIELD_EXPIRATIONDATE);
        return this;
    }

    /**
     * 设置「门户地址」
     *
     * @param val
    */
    @JsonIgnore
    public DepCenter setPortalUrl(String val) {
        this.set(FIELD_PORTALURL, val);
        return this;
    }

    /**
     * 获取「门户地址」值
     *
    */
    @JsonIgnore
    public String getPortalUrl() {
        return (String) this.get(FIELD_PORTALURL);
    }

    /**
     * 判断 「门户地址」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPortalUrl() {
        return this.contains(FIELD_PORTALURL);
    }

    /**
     * 重置 「门户地址」
     *
    */
    @JsonIgnore
    public DepCenter resetPortalUrl() {
        this.reset(FIELD_PORTALURL);
        return this;
    }

    /**
     * 设置「租户标识」
     *
     * @param val
    */
    @JsonIgnore
    public DepCenter setSysCenterId(String val) {
        this.set(FIELD_SYSCENTERID, val);
        return this;
    }

    /**
     * 获取「租户标识」值
     *
    */
    @JsonIgnore
    public String getSysCenterId() {
        return (String) this.get(FIELD_SYSCENTERID);
    }

    /**
     * 判断 「租户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysCenterId() {
        return this.contains(FIELD_SYSCENTERID);
    }

    /**
     * 重置 「租户标识」
     *
    */
    @JsonIgnore
    public DepCenter resetSysCenterId() {
        this.reset(FIELD_SYSCENTERID);
        return this;
    }

    /**
     * 设置「第三方插件服务地址」
     *
     * @param val
    */
    @JsonIgnore
    public DepCenter setTPPRootUrl(String val) {
        this.set(FIELD_TPPROOTURL, val);
        return this;
    }

    /**
     * 获取「第三方插件服务地址」值
     *
    */
    @JsonIgnore
    public String getTPPRootUrl() {
        return (String) this.get(FIELD_TPPROOTURL);
    }

    /**
     * 判断 「第三方插件服务地址」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTPPRootUrl() {
        return this.contains(FIELD_TPPROOTURL);
    }

    /**
     * 重置 「第三方插件服务地址」
     *
    */
    @JsonIgnore
    public DepCenter resetTPPRootUrl() {
        this.reset(FIELD_TPPROOTURL);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public DepCenter setUpdateDate(Timestamp val) {
        this.set(FIELD_UPDATEDATE, val);
        return this;
    }

    /**
     * 获取「更新时间」值
     *
    */
    @JsonIgnore
    public Timestamp getUpdateDate() {
        try{
            return DataTypeUtils.getDateTimeValue(this.get(FIELD_UPDATEDATE),null);
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
        return this.contains(FIELD_UPDATEDATE);
    }

    /**
     * 重置 「更新时间」
     *
    */
    @JsonIgnore
    public DepCenter resetUpdateDate() {
        this.reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public DepCenter setUpdateMan(String val) {
        this.set(FIELD_UPDATEMAN, val);
        return this;
    }

    /**
     * 获取「更新人」值
     *
    */
    @JsonIgnore
    public String getUpdateMan() {
        return (String) this.get(FIELD_UPDATEMAN);
    }

    /**
     * 判断 「更新人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUpdateMan() {
        return this.contains(FIELD_UPDATEMAN);
    }

    /**
     * 重置 「更新人」
     *
    */
    @JsonIgnore
    public DepCenter resetUpdateMan() {
        this.reset(FIELD_UPDATEMAN);
        return this;
    }


}
