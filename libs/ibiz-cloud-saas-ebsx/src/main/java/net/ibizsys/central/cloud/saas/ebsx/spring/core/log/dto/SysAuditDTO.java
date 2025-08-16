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
public class SysAuditDTO extends EntityDTO {

  /**.
   * 访问地址
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdefields/ADDRESS/.ibizmodel.index
   */
  public final static String FIELD_ADDRESS = "address";

  /**.
   * 审计类别
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdefields/AUDITCAT/.ibizmodel.index
   */
  public final static String FIELD_AUDITCAT = "auditcat";

  /**.
   * 审计信息
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdefields/AUDITINFO/.ibizmodel.index
   */
  public final static String FIELD_AUDITINFO = "auditinfo";

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
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdefields/DCSYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/minorpsders/DER1N_SYS_AUDIT_SYS_DC_SYSTEM_DCSYSTEMID_285E96/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";

  /**.
   * 系统
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdefields/DCSYSTEMNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/minorpsders/DER1N_SYS_AUDIT_SYS_DC_SYSTEM_DCSYSTEMID_285E96/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMNAME = "dcsystemname";

  /**.
   * 日志级别
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdefields/LOGLEVEL/.ibizmodel.index
   */
  public final static String FIELD_LOGLEVEL = "loglevel";

  /**.
   * 操作人
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdefields/OPPERSONID/.ibizmodel.index
   */
  public final static String FIELD_OPPERSONID = "oppersonid";

  /**.
   * 操作人
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdefields/OPPERSONNAME/.ibizmodel.index
   */
  public final static String FIELD_OPPERSONNAME = "oppersonname";

  /**.
   * 租户
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdefields/SRFDCID/.ibizmodel.index
   */
  public final static String FIELD_SRFDCID = "srfdcid";

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
     * 设置「访问地址」
     *
     * @param val
    */
    @JsonIgnore
    public SysAuditDTO setAddress(String val) {
        this._set(FIELD_ADDRESS, val);
        return this;
    }

    /**
     * 获取「访问地址」值
     *
    */
    @JsonIgnore
    public String getAddress() {
        return (String) this._get(FIELD_ADDRESS);
    }

    /**
     * 判断 「访问地址」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAddress() {
        return this._contains(FIELD_ADDRESS);
    }

    /**
     * 重置 「访问地址」
     *
    */
    @JsonIgnore
    public SysAuditDTO resetAddress() {
        this._reset(FIELD_ADDRESS);
        return this;
    }

    /**
     * 设置「审计类别」
     *
     * @param val
    */
    @JsonIgnore
    public SysAuditDTO setAuditCat(String val) {
        this._set(FIELD_AUDITCAT, val);
        return this;
    }

    /**
     * 获取「审计类别」值
     *
    */
    @JsonIgnore
    public String getAuditCat() {
        return (String) this._get(FIELD_AUDITCAT);
    }

    /**
     * 判断 「审计类别」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAuditCat() {
        return this._contains(FIELD_AUDITCAT);
    }

    /**
     * 重置 「审计类别」
     *
    */
    @JsonIgnore
    public SysAuditDTO resetAuditCat() {
        this._reset(FIELD_AUDITCAT);
        return this;
    }

    /**
     * 设置「审计信息」
     *
     * @param val
    */
    @JsonIgnore
    public SysAuditDTO setAuditInfo(String val) {
        this._set(FIELD_AUDITINFO, val);
        return this;
    }

    /**
     * 获取「审计信息」值
     *
    */
    @JsonIgnore
    public String getAuditInfo() {
        return (String) this._get(FIELD_AUDITINFO);
    }

    /**
     * 判断 「审计信息」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAuditInfo() {
        return this._contains(FIELD_AUDITINFO);
    }

    /**
     * 重置 「审计信息」
     *
    */
    @JsonIgnore
    public SysAuditDTO resetAuditInfo() {
        this._reset(FIELD_AUDITINFO);
        return this;
    }

    /**
     * 设置「审计时间」
     *
     * @param val
    */
    @JsonIgnore
    public SysAuditDTO setCreateDate(Timestamp val) {
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
    public SysAuditDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public SysAuditDTO setCreateMan(String val) {
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
    public SysAuditDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public SysAuditDTO setDCSystemId(String val) {
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
    public SysAuditDTO resetDCSystemId() {
        this._reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public SysAuditDTO setDCSystemName(String val) {
        this._set(FIELD_DCSYSTEMNAME, val);
        return this;
    }

    /**
     * 获取「系统」值
     *
    */
    @JsonIgnore
    public String getDCSystemName() {
        return (String) this._get(FIELD_DCSYSTEMNAME);
    }

    /**
     * 判断 「系统」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDCSystemName() {
        return this._contains(FIELD_DCSYSTEMNAME);
    }

    /**
     * 重置 「系统」
     *
    */
    @JsonIgnore
    public SysAuditDTO resetDCSystemName() {
        this._reset(FIELD_DCSYSTEMNAME);
        return this;
    }

    /**
     * 设置「日志级别」
     *
     * @param val
    */
    @JsonIgnore
    public SysAuditDTO setLogLevel(Integer val) {
        this._set(FIELD_LOGLEVEL, val);
        return this;
    }

    /**
     * 获取「日志级别」值
     *
    */
    @JsonIgnore
    public Integer getLogLevel() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_LOGLEVEL),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「日志级别」是否有值
     *
    */
    @JsonIgnore
    public boolean containsLogLevel() {
        return this._contains(FIELD_LOGLEVEL);
    }

    /**
     * 重置 「日志级别」
     *
    */
    @JsonIgnore
    public SysAuditDTO resetLogLevel() {
        this._reset(FIELD_LOGLEVEL);
        return this;
    }

    /**
     * 设置「操作人」
     *
     * @param val
    */
    @JsonIgnore
    public SysAuditDTO setOPPersonId(String val) {
        this._set(FIELD_OPPERSONID, val);
        return this;
    }

    /**
     * 获取「操作人」值
     *
    */
    @JsonIgnore
    public String getOPPersonId() {
        return (String) this._get(FIELD_OPPERSONID);
    }

    /**
     * 判断 「操作人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOPPersonId() {
        return this._contains(FIELD_OPPERSONID);
    }

    /**
     * 重置 「操作人」
     *
    */
    @JsonIgnore
    public SysAuditDTO resetOPPersonId() {
        this._reset(FIELD_OPPERSONID);
        return this;
    }

    /**
     * 设置「操作人」
     *
     * @param val
    */
    @JsonIgnore
    public SysAuditDTO setOPPersonName(String val) {
        this._set(FIELD_OPPERSONNAME, val);
        return this;
    }

    /**
     * 获取「操作人」值
     *
    */
    @JsonIgnore
    public String getOPPersonName() {
        return (String) this._get(FIELD_OPPERSONNAME);
    }

    /**
     * 判断 「操作人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOPPersonName() {
        return this._contains(FIELD_OPPERSONNAME);
    }

    /**
     * 重置 「操作人」
     *
    */
    @JsonIgnore
    public SysAuditDTO resetOPPersonName() {
        this._reset(FIELD_OPPERSONNAME);
        return this;
    }

    /**
     * 设置「租户」
     *
     * @param val
    */
    @JsonIgnore
    public SysAuditDTO setSrfdcid(String val) {
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
    public SysAuditDTO resetSrfdcid() {
        this._reset(FIELD_SRFDCID);
        return this;
    }

    /**
     * 设置「系统审计标识」
     *
     * @param val
    */
    @JsonIgnore
    public SysAuditDTO setSysAuditId(String val) {
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
    public SysAuditDTO resetSysAuditId() {
        this._reset(FIELD_SYSAUDITID);
        return this;
    }

    /**
     * 设置「审计名称」
     *
     * @param val
    */
    @JsonIgnore
    public SysAuditDTO setSysAuditName(String val) {
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
    public SysAuditDTO resetSysAuditName() {
        this._reset(FIELD_SYSAUDITNAME);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public SysAuditDTO setUpdateDate(Timestamp val) {
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
    public SysAuditDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public SysAuditDTO setUpdateMan(String val) {
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
    public SysAuditDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
