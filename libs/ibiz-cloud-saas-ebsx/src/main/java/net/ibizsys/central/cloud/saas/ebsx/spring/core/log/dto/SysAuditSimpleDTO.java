package net.ibizsys.central.cloud.saas.ebsx.spring.core.log.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 系统审计
 * 
 * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/.ibizmodel.index
 */
public class SysAuditSimpleDTO extends EntityDTO {

  /**.
   * 审计时间
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 系统审计标识
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdefields/SYSAUDITID/.ibizmodel.index
   */
  public final static String FIELD_SYSAUDITID = "sysauditid";

  /**.
   * 审计名称
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdefields/SYSAUDITNAME/.ibizmodel.index
   */
  public final static String FIELD_SYSAUDITNAME = "sysauditname";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";


    /**
     * 设置「审计时间」
     *
     * @param val
    */
    @JsonIgnore
    public SysAuditSimpleDTO setCreateDate(Timestamp val) {
        this._set(FIELD_CREATEDATE, val);
        return this;
    }

    /**
     * 获取「审计时间」值
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
     * 判断 「审计时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateDate() {
        return this._contains(FIELD_CREATEDATE);
    }

    /**
     * 重置 「审计时间」
     *
    */
    @JsonIgnore
    public SysAuditSimpleDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public SysAuditSimpleDTO setCreateMan(String val) {
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
    public SysAuditSimpleDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「系统审计标识」
     *
     * @param val
    */
    @JsonIgnore
    public SysAuditSimpleDTO setSysAuditId(String val) {
        this._set(FIELD_SYSAUDITID, val);
        return this;
    }

    /**
     * 获取「系统审计标识」值
     *
    */
    @JsonIgnore
    public String getSysAuditId() {
        return (String) this._get(FIELD_SYSAUDITID);
    }

    /**
     * 判断 「系统审计标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysAuditId() {
        return this._contains(FIELD_SYSAUDITID);
    }

    /**
     * 重置 「系统审计标识」
     *
    */
    @JsonIgnore
    public SysAuditSimpleDTO resetSysAuditId() {
        this._reset(FIELD_SYSAUDITID);
        return this;
    }

    /**
     * 设置「审计名称」
     *
     * @param val
    */
    @JsonIgnore
    public SysAuditSimpleDTO setSysAuditName(String val) {
        this._set(FIELD_SYSAUDITNAME, val);
        return this;
    }

    /**
     * 获取「审计名称」值
     *
    */
    @JsonIgnore
    public String getSysAuditName() {
        return (String) this._get(FIELD_SYSAUDITNAME);
    }

    /**
     * 判断 「审计名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysAuditName() {
        return this._contains(FIELD_SYSAUDITNAME);
    }

    /**
     * 重置 「审计名称」
     *
    */
    @JsonIgnore
    public SysAuditSimpleDTO resetSysAuditName() {
        this._reset(FIELD_SYSAUDITNAME);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public SysAuditSimpleDTO setUpdateDate(Timestamp val) {
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
    public SysAuditSimpleDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public SysAuditSimpleDTO setUpdateMan(String val) {
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
    public SysAuditSimpleDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
