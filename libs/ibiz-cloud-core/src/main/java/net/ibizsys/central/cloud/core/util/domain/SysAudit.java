package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 系统审计
 * 
 * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/.ibizmodel.index
 */
public class SysAudit extends EntityBase {

  /**.
   * 访问地址
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdefields/ADDRESS/.ibizmodel.index
   */
  public final static String FIELD_ADDRESS = "address";

  /**.
   * 审计类别
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdefields/CAT/.ibizmodel.index
   */
  public final static String FIELD_CAT = "cat";

  /**.
   * 审计信息
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_AUDIT/psdefields/INFO/.ibizmodel.index
   */
  public final static String FIELD_INFO = "info";

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
    public SysAudit setAddress(String val) {
        this.set(FIELD_ADDRESS, val);
        return this;
    }

    /**
     * 获取「访问地址」值
     *
    */
    @JsonIgnore
    public String getAddress() {
        return (String) this.get(FIELD_ADDRESS);
    }

    /**
     * 判断 「访问地址」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAddress() {
        return this.contains(FIELD_ADDRESS);
    }

    /**
     * 重置 「访问地址」
     *
    */
    @JsonIgnore
    public SysAudit resetAddress() {
        this.reset(FIELD_ADDRESS);
        return this;
    }

    /**
     * 设置「审计类别」
     *
     * @param val
    */
    @JsonIgnore
    public SysAudit setCat(String val) {
        this.set(FIELD_CAT, val);
        return this;
    }

    /**
     * 获取「审计类别」值
     *
    */
    @JsonIgnore
    public String getCat() {
        return (String) this.get(FIELD_CAT);
    }

    /**
     * 判断 「审计类别」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCat() {
        return this.contains(FIELD_CAT);
    }

    /**
     * 重置 「审计类别」
     *
    */
    @JsonIgnore
    public SysAudit resetCat() {
        this.reset(FIELD_CAT);
        return this;
    }

    /**
     * 设置「审计信息」
     *
     * @param val
    */
    @JsonIgnore
    public SysAudit setInfo(String val) {
        this.set(FIELD_INFO, val);
        return this;
    }

    /**
     * 获取「审计信息」值
     *
    */
    @JsonIgnore
    public String getInfo() {
        return (String) this.get(FIELD_INFO);
    }

    /**
     * 判断 「审计信息」是否有值
     *
    */
    @JsonIgnore
    public boolean containsInfo() {
        return this.contains(FIELD_INFO);
    }

    /**
     * 重置 「审计信息」
     *
    */
    @JsonIgnore
    public SysAudit resetInfo() {
        this.reset(FIELD_INFO);
        return this;
    }

    /**
     * 设置「审计时间」
     *
     * @param val
    */
    @JsonIgnore
    public SysAudit setCreateDate(Timestamp val) {
        this.set(FIELD_CREATEDATE, val);
        return this;
    }

    /**
     * 获取「审计时间」值
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
     * 判断 「审计时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateDate() {
        return this.contains(FIELD_CREATEDATE);
    }

    /**
     * 重置 「审计时间」
     *
    */
    @JsonIgnore
    public SysAudit resetCreateDate() {
        this.reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public SysAudit setCreateMan(String val) {
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
    public SysAudit resetCreateMan() {
        this.reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public SysAudit setDCSystemId(String val) {
        this.set(FIELD_DCSYSTEMID, val);
        return this;
    }

    /**
     * 获取「租户系统标识」值
     *
    */
    @JsonIgnore
    public String getDCSystemId() {
        return (String) this.get(FIELD_DCSYSTEMID);
    }

    /**
     * 判断 「租户系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDCSystemId() {
        return this.contains(FIELD_DCSYSTEMID);
    }

    /**
     * 重置 「租户系统标识」
     *
    */
    @JsonIgnore
    public SysAudit resetDCSystemId() {
        this.reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public SysAudit setDCSystemName(String val) {
        this.set(FIELD_DCSYSTEMNAME, val);
        return this;
    }

    /**
     * 获取「系统」值
     *
    */
    @JsonIgnore
    public String getDCSystemName() {
        return (String) this.get(FIELD_DCSYSTEMNAME);
    }

    /**
     * 判断 「系统」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDCSystemName() {
        return this.contains(FIELD_DCSYSTEMNAME);
    }

    /**
     * 重置 「系统」
     *
    */
    @JsonIgnore
    public SysAudit resetDCSystemName() {
        this.reset(FIELD_DCSYSTEMNAME);
        return this;
    }

    /**
     * 设置「日志级别」
     *
     * @param val
    */
    @JsonIgnore
    public SysAudit setLogLevel(Integer val) {
        this.set(FIELD_LOGLEVEL, val);
        return this;
    }

    /**
     * 获取「日志级别」值
     *
    */
    @JsonIgnore
    public Integer getLogLevel() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_LOGLEVEL),null);
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
        return this.contains(FIELD_LOGLEVEL);
    }

    /**
     * 重置 「日志级别」
     *
    */
    @JsonIgnore
    public SysAudit resetLogLevel() {
        this.reset(FIELD_LOGLEVEL);
        return this;
    }

    /**
     * 设置「操作人」
     *
     * @param val
    */
    @JsonIgnore
    public SysAudit setOPPersonId(String val) {
        this.set(FIELD_OPPERSONID, val);
        return this;
    }

    /**
     * 获取「操作人」值
     *
    */
    @JsonIgnore
    public String getOPPersonId() {
        return (String) this.get(FIELD_OPPERSONID);
    }

    /**
     * 判断 「操作人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOPPersonId() {
        return this.contains(FIELD_OPPERSONID);
    }

    /**
     * 重置 「操作人」
     *
    */
    @JsonIgnore
    public SysAudit resetOPPersonId() {
        this.reset(FIELD_OPPERSONID);
        return this;
    }

    /**
     * 设置「操作人」
     *
     * @param val
    */
    @JsonIgnore
    public SysAudit setOPPersonName(String val) {
        this.set(FIELD_OPPERSONNAME, val);
        return this;
    }

    /**
     * 获取「操作人」值
     *
    */
    @JsonIgnore
    public String getOPPersonName() {
        return (String) this.get(FIELD_OPPERSONNAME);
    }

    /**
     * 判断 「操作人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOPPersonName() {
        return this.contains(FIELD_OPPERSONNAME);
    }

    /**
     * 重置 「操作人」
     *
    */
    @JsonIgnore
    public SysAudit resetOPPersonName() {
        this.reset(FIELD_OPPERSONNAME);
        return this;
    }

    /**
     * 设置「系统审计标识」
     *
     * @param val
    */
    @JsonIgnore
    public SysAudit setSysAuditId(String val) {
        this.set(FIELD_SYSAUDITID, val);
        return this;
    }

    /**
     * 获取「系统审计标识」值
     *
    */
    @JsonIgnore
    public String getSysAuditId() {
        return (String) this.get(FIELD_SYSAUDITID);
    }

    /**
     * 判断 「系统审计标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysAuditId() {
        return this.contains(FIELD_SYSAUDITID);
    }

    /**
     * 重置 「系统审计标识」
     *
    */
    @JsonIgnore
    public SysAudit resetSysAuditId() {
        this.reset(FIELD_SYSAUDITID);
        return this;
    }

    /**
     * 设置「审计名称」
     *
     * @param val
    */
    @JsonIgnore
    public SysAudit setSysAuditName(String val) {
        this.set(FIELD_SYSAUDITNAME, val);
        return this;
    }

    /**
     * 获取「审计名称」值
     *
    */
    @JsonIgnore
    public String getSysAuditName() {
        return (String) this.get(FIELD_SYSAUDITNAME);
    }

    /**
     * 判断 「审计名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysAuditName() {
        return this.contains(FIELD_SYSAUDITNAME);
    }

    /**
     * 重置 「审计名称」
     *
    */
    @JsonIgnore
    public SysAudit resetSysAuditName() {
        this.reset(FIELD_SYSAUDITNAME);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public SysAudit setUpdateDate(Timestamp val) {
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
    public SysAudit resetUpdateDate() {
        this.reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public SysAudit setUpdateMan(String val) {
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
    public SysAudit resetUpdateMan() {
        this.reset(FIELD_UPDATEMAN);
        return this;
    }


}
