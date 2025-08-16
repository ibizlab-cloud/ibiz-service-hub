package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 组织系统应用
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/.ibizmodel.index
 */
public class OrgApplicationDTO extends EntityDTO {

  /**.
   * AccessKey(AppId)
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/psdefields/ACCESS_KEY/.ibizmodel.index
   */
  public final static String FIELD_ACCESS_KEY = "access_key";

  /**.
   * SecretKey(AppSecret)
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/psdefields/SECRET_KEY/.ibizmodel.index
   */
  public final static String FIELD_SECRET_KEY = "secret_key";

  /**.
   * RegionId
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/psdefields/REGION_ID/.ibizmodel.index
   */
  public final static String FIELD_REGION_ID = "region_id";

  /**.
   * 管理账号token
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/psdefields/ACCESS_TOKEN/.ibizmodel.index
   */
  public final static String FIELD_ACCESS_TOKEN = "access_token";

  /**.
   * 管理账号token过期时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/psdefields/EXPIRES_TIME/.ibizmodel.index
   */
  public final static String FIELD_EXPIRES_TIME = "expires_time";

  /**.
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/psdefields/DCSYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/minorpsders/DER1N_SYS_ORG_SYSTEMAPP_SYS_ORG_SYSTEM_ORGSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";

  /**.
   * 组织标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/psdefields/ORGID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/minorpsders/DER1N_SYS_ORG_SYSTEMAPP_SYS_ORG_SYSTEM_ORGSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_ORGID = "orgid";

  /**.
   * 组织系统应用标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/psdefields/ORGSYSTEMAPPID/.ibizmodel.index
   */
  public final static String FIELD_ORGSYSTEMAPPID = "orgsystemappid";

  /**.
   * 组织系统名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/psdefields/ORGSYSTEMAPPNAME/.ibizmodel.index
   */
  public final static String FIELD_ORGSYSTEMAPPNAME = "orgsystemappname";

  /**.
   * 组织系统标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/psdefields/ORGSYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/minorpsders/DER1N_SYS_ORG_SYSTEMAPP_SYS_ORG_SYSTEM_ORGSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_ORGSYSTEMID = "orgsystemid";

  /**.
   * 租户
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/psdefields/SRFDCID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/minorpsders/DER1N_SYS_ORG_SYSTEMAPP_SYS_ORG_SYSTEM_ORGSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_SRFDCID = "srfdcid";

  /**.
   * 系统标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/psdefields/SYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_ORG_SYSTEMAPP/minorpsders/DER1N_SYS_ORG_SYSTEMAPP_SYS_ORG_SYSTEM_ORGSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEMID = "systemid";


    /**
     * 设置「AccessKey(AppId)」
     *
     * @param val
    */
    @JsonIgnore
    public OrgApplicationDTO setAccess_key(String val) {
        this._set(FIELD_ACCESS_KEY, val);
        return this;
    }

    /**
     * 获取「AccessKey(AppId)」值
     *
    */
    @JsonIgnore
    public String getAccess_key() {
        return (String) this._get(FIELD_ACCESS_KEY);
    }

    /**
     * 判断 「AccessKey(AppId)」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAccess_key() {
        return this._contains(FIELD_ACCESS_KEY);
    }

    /**
     * 重置 「AccessKey(AppId)」
     *
    */
    @JsonIgnore
    public OrgApplicationDTO resetAccess_key() {
        this._reset(FIELD_ACCESS_KEY);
        return this;
    }

    /**
     * 设置「SecretKey(AppSecret)」
     *
     * @param val
    */
    @JsonIgnore
    public OrgApplicationDTO setSecret_key(String val) {
        this._set(FIELD_SECRET_KEY, val);
        return this;
    }

    /**
     * 获取「SecretKey(AppSecret)」值
     *
    */
    @JsonIgnore
    public String getSecret_key() {
        return (String) this._get(FIELD_SECRET_KEY);
    }

    /**
     * 判断 「SecretKey(AppSecret)」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSecret_key() {
        return this._contains(FIELD_SECRET_KEY);
    }

    /**
     * 重置 「SecretKey(AppSecret)」
     *
    */
    @JsonIgnore
    public OrgApplicationDTO resetSecret_key() {
        this._reset(FIELD_SECRET_KEY);
        return this;
    }

    /**
     * 设置「RegionId」
     *
     * @param val
    */
    @JsonIgnore
    public OrgApplicationDTO setRegion_id(String val) {
        this._set(FIELD_REGION_ID, val);
        return this;
    }

    /**
     * 获取「RegionId」值
     *
    */
    @JsonIgnore
    public String getRegion_id() {
        return (String) this._get(FIELD_REGION_ID);
    }

    /**
     * 判断 「RegionId」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRegion_id() {
        return this._contains(FIELD_REGION_ID);
    }

    /**
     * 重置 「RegionId」
     *
    */
    @JsonIgnore
    public OrgApplicationDTO resetRegion_id() {
        this._reset(FIELD_REGION_ID);
        return this;
    }

    /**
     * 设置「管理账号token」
     *
     * @param val
    */
    @JsonIgnore
    public OrgApplicationDTO setAccess_token(String val) {
        this._set(FIELD_ACCESS_TOKEN, val);
        return this;
    }

    /**
     * 获取「管理账号token」值
     *
    */
    @JsonIgnore
    public String getAccess_token() {
        return (String) this._get(FIELD_ACCESS_TOKEN);
    }

    /**
     * 判断 「管理账号token」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAccess_token() {
        return this._contains(FIELD_ACCESS_TOKEN);
    }

    /**
     * 重置 「管理账号token」
     *
    */
    @JsonIgnore
    public OrgApplicationDTO resetAccess_token() {
        this._reset(FIELD_ACCESS_TOKEN);
        return this;
    }

    /**
     * 设置「管理账号token过期时间」
     *
     * @param val
    */
    @JsonIgnore
    public OrgApplicationDTO setExpires_time(Timestamp val) {
        this._set(FIELD_EXPIRES_TIME, val);
        return this;
    }

    /**
     * 获取「管理账号token过期时间」值
     *
    */
    @JsonIgnore
    public Timestamp getExpires_time() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_EXPIRES_TIME),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「管理账号token过期时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsExpires_time() {
        return this._contains(FIELD_EXPIRES_TIME);
    }

    /**
     * 重置 「管理账号token过期时间」
     *
    */
    @JsonIgnore
    public OrgApplicationDTO resetExpires_time() {
        this._reset(FIELD_EXPIRES_TIME);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public OrgApplicationDTO setDCSystemId(String val) {
        this._set(FIELD_DCSYSTEMID, val);
        return this;
    }

    /**
     * 获取「租户系统标识」值
     *
    */
    @JsonIgnore
    public String getDCSystemId() {
        return (String) this._get(FIELD_DCSYSTEMID);
    }

    /**
     * 判断 「租户系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDCSystemId() {
        return this._contains(FIELD_DCSYSTEMID);
    }

    /**
     * 重置 「租户系统标识」
     *
    */
    @JsonIgnore
    public OrgApplicationDTO resetDCSystemId() {
        this._reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「组织标识」
     *
     * @param val
    */
    @JsonIgnore
    public OrgApplicationDTO setOrgId(String val) {
        this._set(FIELD_ORGID, val);
        return this;
    }

    /**
     * 获取「组织标识」值
     *
    */
    @JsonIgnore
    public String getOrgId() {
        return (String) this._get(FIELD_ORGID);
    }

    /**
     * 判断 「组织标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgId() {
        return this._contains(FIELD_ORGID);
    }

    /**
     * 重置 「组织标识」
     *
    */
    @JsonIgnore
    public OrgApplicationDTO resetOrgId() {
        this._reset(FIELD_ORGID);
        return this;
    }

    /**
     * 设置「组织系统应用标识」
     *
     * @param val
    */
    @JsonIgnore
    public OrgApplicationDTO setOrgSystemAppId(String val) {
        this._set(FIELD_ORGSYSTEMAPPID, val);
        return this;
    }

    /**
     * 获取「组织系统应用标识」值
     *
    */
    @JsonIgnore
    public String getOrgSystemAppId() {
        return (String) this._get(FIELD_ORGSYSTEMAPPID);
    }

    /**
     * 判断 「组织系统应用标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgSystemAppId() {
        return this._contains(FIELD_ORGSYSTEMAPPID);
    }

    /**
     * 重置 「组织系统应用标识」
     *
    */
    @JsonIgnore
    public OrgApplicationDTO resetOrgSystemAppId() {
        this._reset(FIELD_ORGSYSTEMAPPID);
        return this;
    }

    /**
     * 设置「组织系统名称」
     *
     * @param val
    */
    @JsonIgnore
    public OrgApplicationDTO setOrgSystemAppName(String val) {
        this._set(FIELD_ORGSYSTEMAPPNAME, val);
        return this;
    }

    /**
     * 获取「组织系统名称」值
     *
    */
    @JsonIgnore
    public String getOrgSystemAppName() {
        return (String) this._get(FIELD_ORGSYSTEMAPPNAME);
    }

    /**
     * 判断 「组织系统名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgSystemAppName() {
        return this._contains(FIELD_ORGSYSTEMAPPNAME);
    }

    /**
     * 重置 「组织系统名称」
     *
    */
    @JsonIgnore
    public OrgApplicationDTO resetOrgSystemAppName() {
        this._reset(FIELD_ORGSYSTEMAPPNAME);
        return this;
    }

    /**
     * 设置「组织系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public OrgApplicationDTO setOrgSystemId(String val) {
        this._set(FIELD_ORGSYSTEMID, val);
        return this;
    }

    /**
     * 获取「组织系统标识」值
     *
    */
    @JsonIgnore
    public String getOrgSystemId() {
        return (String) this._get(FIELD_ORGSYSTEMID);
    }

    /**
     * 判断 「组织系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgSystemId() {
        return this._contains(FIELD_ORGSYSTEMID);
    }

    /**
     * 重置 「组织系统标识」
     *
    */
    @JsonIgnore
    public OrgApplicationDTO resetOrgSystemId() {
        this._reset(FIELD_ORGSYSTEMID);
        return this;
    }

    /**
     * 设置「租户」
     *
     * @param val
    */
    @JsonIgnore
    public OrgApplicationDTO setSrfdcid(String val) {
        this._set(FIELD_SRFDCID, val);
        return this;
    }

    /**
     * 获取「租户」值
     *
    */
    @JsonIgnore
    public String getSrfdcid() {
        return (String) this._get(FIELD_SRFDCID);
    }

    /**
     * 判断 「租户」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSrfdcid() {
        return this._contains(FIELD_SRFDCID);
    }

    /**
     * 重置 「租户」
     *
    */
    @JsonIgnore
    public OrgApplicationDTO resetSrfdcid() {
        this._reset(FIELD_SRFDCID);
        return this;
    }

    /**
     * 设置「系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public OrgApplicationDTO setSystemId(String val) {
        this._set(FIELD_SYSTEMID, val);
        return this;
    }

    /**
     * 获取「系统标识」值
     *
    */
    @JsonIgnore
    public String getSystemId() {
        return (String) this._get(FIELD_SYSTEMID);
    }

    /**
     * 判断 「系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSystemId() {
        return this._contains(FIELD_SYSTEMID);
    }

    /**
     * 重置 「系统标识」
     *
    */
    @JsonIgnore
    public OrgApplicationDTO resetSystemId() {
        this._reset(FIELD_SYSTEMID);
        return this;
    }


}
