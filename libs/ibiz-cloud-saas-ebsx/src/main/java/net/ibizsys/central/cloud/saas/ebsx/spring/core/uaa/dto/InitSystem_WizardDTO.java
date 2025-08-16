package net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 系统初始化向导
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_INITSYSTEM_WIZARD/.ibizmodel.index
 */
public class InitSystem_WizardDTO extends EntityDTO {

  /**.
   * 租户标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_INITSYSTEM_WIZARD/psdefields/CENTERID/.ibizmodel.index
   */
  public final static String FIELD_CENTERID = "centerid";

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_INITSYSTEM_WIZARD/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_INITSYSTEM_WIZARD/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 租户系统
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_INITSYSTEM_WIZARD/psdefields/DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";

  /**.
   * 租户系统初始化向导标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_INITSYSTEM_WIZARD/psdefields/SYS_INITSYSTEM_WIZARDID/.ibizmodel.index
   */
  public final static String FIELD_INITSYSTEM_WIZARDID = "initsystem_wizardid";

  /**.
   * 租户系统初始化向导名称
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_INITSYSTEM_WIZARD/psdefields/SYS_INITSYSTEM_WIZARDNAME/.ibizmodel.index
   */
  public final static String FIELD_INITSYSTEM_WIZARDNAME = "initsystem_wizardname";

  /**.
   * 系统标识
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_INITSYSTEM_WIZARD/psdefields/SYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_INITSYSTEM_WIZARD/minorpsders/DER1N_SYS_INITSYSTEM_WIZARD_SYS_PSSYSTEM_SYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEMID = "systemid";

  /**.
   * 系统
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_INITSYSTEM_WIZARD/psdefields/SYSTEMNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_INITSYSTEM_WIZARD/minorpsders/DER1N_SYS_INITSYSTEM_WIZARD_SYS_PSSYSTEM_SYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEMNAME = "systemname";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_INITSYSTEM_WIZARD/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/uaa/psdataentities/SYS_INITSYSTEM_WIZARD/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";


    /**
     * 设置「租户标识」
     *
     * @param val
    */
    @JsonIgnore
    public InitSystem_WizardDTO setCenterId(String val) {
        this._set(FIELD_CENTERID, val);
        return this;
    }

    /**
     * 获取「租户标识」值
     *
    */
    @JsonIgnore
    public String getCenterId() {
        return (String) this._get(FIELD_CENTERID);
    }

    /**
     * 判断 「租户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCenterId() {
        return this._contains(FIELD_CENTERID);
    }

    /**
     * 重置 「租户标识」
     *
    */
    @JsonIgnore
    public InitSystem_WizardDTO resetCenterId() {
        this._reset(FIELD_CENTERID);
        return this;
    }

    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public InitSystem_WizardDTO setCreateDate(Timestamp val) {
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
    public InitSystem_WizardDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public InitSystem_WizardDTO setCreateMan(String val) {
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
    public InitSystem_WizardDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「租户系统」
     *
     * @param val
    */
    @JsonIgnore
    public InitSystem_WizardDTO setDCSystemId(String val) {
        this._set(FIELD_DCSYSTEMID, val);
        return this;
    }

    /**
     * 获取「租户系统」值
     *
    */
    @JsonIgnore
    public String getDCSystemId() {
        return (String) this._get(FIELD_DCSYSTEMID);
    }

    /**
     * 判断 「租户系统」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDCSystemId() {
        return this._contains(FIELD_DCSYSTEMID);
    }

    /**
     * 重置 「租户系统」
     *
    */
    @JsonIgnore
    public InitSystem_WizardDTO resetDCSystemId() {
        this._reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「租户系统初始化向导标识」
     *
     * @param val
    */
    @JsonIgnore
    public InitSystem_WizardDTO setInitSystem_WizardId(String val) {
        this._set(FIELD_INITSYSTEM_WIZARDID, val);
        return this;
    }

    /**
     * 获取「租户系统初始化向导标识」值
     *
    */
    @JsonIgnore
    public String getInitSystem_WizardId() {
        return (String) this._get(FIELD_INITSYSTEM_WIZARDID);
    }

    /**
     * 判断 「租户系统初始化向导标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsInitSystem_WizardId() {
        return this._contains(FIELD_INITSYSTEM_WIZARDID);
    }

    /**
     * 重置 「租户系统初始化向导标识」
     *
    */
    @JsonIgnore
    public InitSystem_WizardDTO resetInitSystem_WizardId() {
        this._reset(FIELD_INITSYSTEM_WIZARDID);
        return this;
    }

    /**
     * 设置「租户系统初始化向导名称」
     *
     * @param val
    */
    @JsonIgnore
    public InitSystem_WizardDTO setInitSystem_WizardName(String val) {
        this._set(FIELD_INITSYSTEM_WIZARDNAME, val);
        return this;
    }

    /**
     * 获取「租户系统初始化向导名称」值
     *
    */
    @JsonIgnore
    public String getInitSystem_WizardName() {
        return (String) this._get(FIELD_INITSYSTEM_WIZARDNAME);
    }

    /**
     * 判断 「租户系统初始化向导名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsInitSystem_WizardName() {
        return this._contains(FIELD_INITSYSTEM_WIZARDNAME);
    }

    /**
     * 重置 「租户系统初始化向导名称」
     *
    */
    @JsonIgnore
    public InitSystem_WizardDTO resetInitSystem_WizardName() {
        this._reset(FIELD_INITSYSTEM_WIZARDNAME);
        return this;
    }

    /**
     * 设置「系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public InitSystem_WizardDTO setSystemId(String val) {
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
    public InitSystem_WizardDTO resetSystemId() {
        this._reset(FIELD_SYSTEMID);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public InitSystem_WizardDTO setSystemName(String val) {
        this._set(FIELD_SYSTEMNAME, val);
        return this;
    }

    /**
     * 获取「系统」值
     *
    */
    @JsonIgnore
    public String getSystemName() {
        return (String) this._get(FIELD_SYSTEMNAME);
    }

    /**
     * 判断 「系统」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSystemName() {
        return this._contains(FIELD_SYSTEMNAME);
    }

    /**
     * 重置 「系统」
     *
    */
    @JsonIgnore
    public InitSystem_WizardDTO resetSystemName() {
        this._reset(FIELD_SYSTEMNAME);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public InitSystem_WizardDTO setUpdateDate(Timestamp val) {
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
    public InitSystem_WizardDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public InitSystem_WizardDTO setUpdateMan(String val) {
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
    public InitSystem_WizardDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
