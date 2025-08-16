package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 系统日志
 * 
 * @see ibizmos:/psmodules/log/psdataentities/SYS_LOG/.ibizmodel.index
 */
public class SysLog extends EntityBase {

  /**.
   * 日志时间
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_LOG/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_LOG/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 租户系统
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_LOG/psdefields/DCSYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/log/psdataentities/SYS_LOG/minorpsders/DER1N_SYS_LOG_SYS_DC_SYSTEM_DCSYSTEMID2/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";

  /**.
   * 系统
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_LOG/psdefields/DCSYSTEMNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/log/psdataentities/SYS_LOG/minorpsders/DER1N_SYS_LOG_SYS_DC_SYSTEM_DCSYSTEMID2/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMNAME = "dcsystemname";

  /**.
   * 组织部门标识
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_LOG/psdefields/DEPTID/.ibizmodel.index
   */
  public final static String FIELD_DEPTID = "deptid";

  /**.
   * 日志类别
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_LOG/psdefields/CAT/.ibizmodel.index
   */
  public final static String FIELD_CAT = "cat";

  /**.
   * 日志信息
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_LOG/psdefields/INFO/.ibizmodel.index
   */
  public final static String FIELD_INFO = "info";

  /**.
   * 日志级别
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_LOG/psdefields/LOGLEVEL/.ibizmodel.index
   */
  public final static String FIELD_LOGLEVEL = "loglevel";

  /**.
   * 操作人
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_LOG/psdefields/OPPERSONID/.ibizmodel.index
   */
  public final static String FIELD_OPPERSONID = "oppersonid";

  /**.
   * 组织机构标识
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_LOG/psdefields/ORGID/.ibizmodel.index
   */
  public final static String FIELD_ORGID = "orgid";

  /**.
   * 日志标识
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_LOG/psdefields/SYSLOGID/.ibizmodel.index
   */
  public final static String FIELD_SYSLOGID = "syslogid";

  /**.
   * 日志信息
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_LOG/psdefields/SYSLOGNAME/.ibizmodel.index
   */
  public final static String FIELD_SYSLOGNAME = "syslogname";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_LOG/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_LOG/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";

  /**.
   * 用户数据
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_LOG/psdefields/USERDATA/.ibizmodel.index
   */
  public final static String FIELD_USERDATA = "userdata";

  /**.
   * 用户数据2
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_LOG/psdefields/USERDATA2/.ibizmodel.index
   */
  public final static String FIELD_USERDATA2 = "userdata2";


    /**
     * 设置「日志时间」
     *
     * @param val
    */
    @JsonIgnore
    public SysLog setCreateDate(Timestamp val) {
        this.set(FIELD_CREATEDATE, val);
        return this;
    }

    /**
     * 获取「日志时间」值
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
     * 判断 「日志时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateDate() {
        return this.contains(FIELD_CREATEDATE);
    }

    /**
     * 重置 「日志时间」
     *
    */
    @JsonIgnore
    public SysLog resetCreateDate() {
        this.reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public SysLog setCreateMan(String val) {
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
    public SysLog resetCreateMan() {
        this.reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「租户系统」
     *
     * @param val
    */
    @JsonIgnore
    public SysLog setDCSystemId(String val) {
        this.set(FIELD_DCSYSTEMID, val);
        return this;
    }

    /**
     * 获取「租户系统」值
     *
    */
    @JsonIgnore
    public String getDCSystemId() {
        return (String) this.get(FIELD_DCSYSTEMID);
    }

    /**
     * 判断 「租户系统」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDCSystemId() {
        return this.contains(FIELD_DCSYSTEMID);
    }

    /**
     * 重置 「租户系统」
     *
    */
    @JsonIgnore
    public SysLog resetDCSystemId() {
        this.reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public SysLog setDCSystemName(String val) {
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
    public SysLog resetDCSystemName() {
        this.reset(FIELD_DCSYSTEMNAME);
        return this;
    }

    /**
     * 设置「组织部门标识」
     *
     * @param val
    */
    @JsonIgnore
    public SysLog setDeptId(String val) {
        this.set(FIELD_DEPTID, val);
        return this;
    }

    /**
     * 获取「组织部门标识」值
     *
    */
    @JsonIgnore
    public String getDeptId() {
        return (String) this.get(FIELD_DEPTID);
    }

    /**
     * 判断 「组织部门标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDeptId() {
        return this.contains(FIELD_DEPTID);
    }

    /**
     * 重置 「组织部门标识」
     *
    */
    @JsonIgnore
    public SysLog resetDeptId() {
        this.reset(FIELD_DEPTID);
        return this;
    }

    /**
     * 设置「日志类别」
     *
     * @param val
    */
    @JsonIgnore
    public SysLog setCat(String val) {
        this.set(FIELD_CAT, val);
        return this;
    }

    /**
     * 获取「日志类别」值
     *
    */
    @JsonIgnore
    public String getCat() {
        return (String) this.get(FIELD_CAT);
    }

    /**
     * 判断 「日志类别」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCat() {
        return this.contains(FIELD_CAT);
    }

    /**
     * 重置 「日志类别」
     *
    */
    @JsonIgnore
    public SysLog resetCat() {
        this.reset(FIELD_CAT);
        return this;
    }

    /**
     * 设置「日志信息」
     *
     * @param val
    */
    @JsonIgnore
    public SysLog setInfo(String val) {
        this.set(FIELD_INFO, val);
        return this;
    }

    /**
     * 获取「日志信息」值
     *
    */
    @JsonIgnore
    public String getInfo() {
        return (String) this.get(FIELD_INFO);
    }

    /**
     * 判断 「日志信息」是否有值
     *
    */
    @JsonIgnore
    public boolean containsInfo() {
        return this.contains(FIELD_INFO);
    }

    /**
     * 重置 「日志信息」
     *
    */
    @JsonIgnore
    public SysLog resetInfo() {
        this.reset(FIELD_INFO);
        return this;
    }

    /**
     * 设置「日志级别」
     *
     * @param val
    */
    @JsonIgnore
    public SysLog setLogLevel(Integer val) {
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
    public SysLog resetLogLevel() {
        this.reset(FIELD_LOGLEVEL);
        return this;
    }

    /**
     * 设置「操作人」
     *
     * @param val
    */
    @JsonIgnore
    public SysLog setOPPersonId(String val) {
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
    public SysLog resetOPPersonId() {
        this.reset(FIELD_OPPERSONID);
        return this;
    }

    /**
     * 设置「组织机构标识」
     *
     * @param val
    */
    @JsonIgnore
    public SysLog setOrgId(String val) {
        this.set(FIELD_ORGID, val);
        return this;
    }

    /**
     * 获取「组织机构标识」值
     *
    */
    @JsonIgnore
    public String getOrgId() {
        return (String) this.get(FIELD_ORGID);
    }

    /**
     * 判断 「组织机构标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgId() {
        return this.contains(FIELD_ORGID);
    }

    /**
     * 重置 「组织机构标识」
     *
    */
    @JsonIgnore
    public SysLog resetOrgId() {
        this.reset(FIELD_ORGID);
        return this;
    }

    /**
     * 设置「日志标识」
     *
     * @param val
    */
    @JsonIgnore
    public SysLog setSysLogId(String val) {
        this.set(FIELD_SYSLOGID, val);
        return this;
    }

    /**
     * 获取「日志标识」值
     *
    */
    @JsonIgnore
    public String getSysLogId() {
        return (String) this.get(FIELD_SYSLOGID);
    }

    /**
     * 判断 「日志标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysLogId() {
        return this.contains(FIELD_SYSLOGID);
    }

    /**
     * 重置 「日志标识」
     *
    */
    @JsonIgnore
    public SysLog resetSysLogId() {
        this.reset(FIELD_SYSLOGID);
        return this;
    }

    /**
     * 设置「日志信息」
     *
     * @param val
    */
    @JsonIgnore
    public SysLog setSysLogName(String val) {
        this.set(FIELD_SYSLOGNAME, val);
        return this;
    }

    /**
     * 获取「日志信息」值
     *
    */
    @JsonIgnore
    public String getSysLogName() {
        return (String) this.get(FIELD_SYSLOGNAME);
    }

    /**
     * 判断 「日志信息」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysLogName() {
        return this.contains(FIELD_SYSLOGNAME);
    }

    /**
     * 重置 「日志信息」
     *
    */
    @JsonIgnore
    public SysLog resetSysLogName() {
        this.reset(FIELD_SYSLOGNAME);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public SysLog setUpdateDate(Timestamp val) {
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
    public SysLog resetUpdateDate() {
        this.reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public SysLog setUpdateMan(String val) {
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
    public SysLog resetUpdateMan() {
        this.reset(FIELD_UPDATEMAN);
        return this;
    }

    /**
     * 设置「用户数据」
     *
     * @param val
    */
    @JsonIgnore
    public SysLog setUserData(String val) {
        this.set(FIELD_USERDATA, val);
        return this;
    }

    /**
     * 获取「用户数据」值
     *
    */
    @JsonIgnore
    public String getUserData() {
        return (String) this.get(FIELD_USERDATA);
    }

    /**
     * 判断 「用户数据」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserData() {
        return this.contains(FIELD_USERDATA);
    }

    /**
     * 重置 「用户数据」
     *
    */
    @JsonIgnore
    public SysLog resetUserData() {
        this.reset(FIELD_USERDATA);
        return this;
    }

    /**
     * 设置「用户数据2」
     *
     * @param val
    */
    @JsonIgnore
    public SysLog setUserData2(String val) {
        this.set(FIELD_USERDATA2, val);
        return this;
    }

    /**
     * 获取「用户数据2」值
     *
    */
    @JsonIgnore
    public String getUserData2() {
        return (String) this.get(FIELD_USERDATA2);
    }

    /**
     * 判断 「用户数据2」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserData2() {
        return this.contains(FIELD_USERDATA2);
    }

    /**
     * 重置 「用户数据2」
     *
    */
    @JsonIgnore
    public SysLog resetUserData2() {
        this.reset(FIELD_USERDATA2);
        return this;
    }


}
