package net.ibizsys.central.cloud.saas.ebsx.spring.core.center.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 系统日志
 * 
 * @see ibizmos:/psmodules/center/psdataentities/DC_LOG/.ibizmodel.index
 */
public class DCLogDTO extends EntityDTO {

  /**.
   * 日志时间
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_LOG/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_LOG/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_LOG/psdefields/DCSYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/center/psdataentities/DC_LOG/minorpsders/DER1N_DC_LOG_DC_DC_SYSTEM_DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";

  /**.
   * 系统
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_LOG/psdefields/DCSYSTEMNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/center/psdataentities/DC_LOG/minorpsders/DER1N_DC_LOG_DC_DC_SYSTEM_DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMNAME = "dcsystemname";

  /**.
   * 组织部门标识
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_LOG/psdefields/DEPTID/.ibizmodel.index
   */
  public final static String FIELD_DEPTID = "deptid";

  /**.
   * 日志类别
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.LogCat} 
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_LOG/psdefields/LOGCAT/.ibizmodel.index
   * @see ibizmos:/psmodules/center/pscodelists/LogCat.ibizmodel.yaml
   */
  public final static String FIELD_LOGCAT = "logcat";

  /**.
   * 详细信息
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_LOG/psdefields/LOGINFO/.ibizmodel.index
   */
  public final static String FIELD_LOGINFO = "loginfo";

  /**.
   * 日志级别
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_LOG/psdefields/LOGLEVEL/.ibizmodel.index
   */
  public final static String FIELD_LOGLEVEL = "loglevel";

  /**.
   * 操作人
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_LOG/psdefields/OPPERSONID/.ibizmodel.index
   */
  public final static String FIELD_OPPERSONID = "oppersonid";

  /**.
   * 组织机构标识
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_LOG/psdefields/ORGID/.ibizmodel.index
   */
  public final static String FIELD_ORGID = "orgid";

  /**.
   * 日志标识
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_LOG/psdefields/SYSLOGID/.ibizmodel.index
   */
  public final static String FIELD_SYSLOGID = "syslogid";

  /**.
   * 日志信息
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_LOG/psdefields/SYSLOGNAME/.ibizmodel.index
   */
  public final static String FIELD_SYSLOGNAME = "syslogname";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_LOG/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_LOG/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";

  /**.
   * 用户数据
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_LOG/psdefields/USERDATA/.ibizmodel.index
   */
  public final static String FIELD_USERDATA = "userdata";

  /**.
   * 用户数据2
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_LOG/psdefields/USERDATA2/.ibizmodel.index
   */
  public final static String FIELD_USERDATA2 = "userdata2";


    /**
     * 设置「日志时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCLogDTO setCreateDate(Timestamp val) {
        this._set(FIELD_CREATEDATE, val);
        return this;
    }

    /**
     * 获取「日志时间」值
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
     * 判断 「日志时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateDate() {
        return this._contains(FIELD_CREATEDATE);
    }

    /**
     * 重置 「日志时间」
     *
    */
    @JsonIgnore
    public DCLogDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public DCLogDTO setCreateMan(String val) {
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
    public DCLogDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCLogDTO setDCSystemId(String val) {
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
    public DCLogDTO resetDCSystemId() {
        this._reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public DCLogDTO setDCSystemName(String val) {
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
    public DCLogDTO resetDCSystemName() {
        this._reset(FIELD_DCSYSTEMNAME);
        return this;
    }

    /**
     * 设置「组织部门标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCLogDTO setDeptId(String val) {
        this._set(FIELD_DEPTID, val);
        return this;
    }

    /**
     * 获取「组织部门标识」值
     *
    */
    @JsonIgnore
    public String getDeptId() {
        return (String) this._get(FIELD_DEPTID);
    }

    /**
     * 判断 「组织部门标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDeptId() {
        return this._contains(FIELD_DEPTID);
    }

    /**
     * 重置 「组织部门标识」
     *
    */
    @JsonIgnore
    public DCLogDTO resetDeptId() {
        this._reset(FIELD_DEPTID);
        return this;
    }

    /**
     * 设置「日志类别」
     *
     * @param val
    */
    @JsonIgnore
    public DCLogDTO setLogCat(String val) {
        this._set(FIELD_LOGCAT, val);
        return this;
    }

    /**
     * 获取「日志类别」值
     *
    */
    @JsonIgnore
    public String getLogCat() {
        return (String) this._get(FIELD_LOGCAT);
    }

    /**
     * 判断 「日志类别」是否有值
     *
    */
    @JsonIgnore
    public boolean containsLogCat() {
        return this._contains(FIELD_LOGCAT);
    }

    /**
     * 重置 「日志类别」
     *
    */
    @JsonIgnore
    public DCLogDTO resetLogCat() {
        this._reset(FIELD_LOGCAT);
        return this;
    }

    /**
     * 设置「详细信息」
     *
     * @param val
    */
    @JsonIgnore
    public DCLogDTO setLogInfo(String val) {
        this._set(FIELD_LOGINFO, val);
        return this;
    }

    /**
     * 获取「详细信息」值
     *
    */
    @JsonIgnore
    public String getLogInfo() {
        return (String) this._get(FIELD_LOGINFO);
    }

    /**
     * 判断 「详细信息」是否有值
     *
    */
    @JsonIgnore
    public boolean containsLogInfo() {
        return this._contains(FIELD_LOGINFO);
    }

    /**
     * 重置 「详细信息」
     *
    */
    @JsonIgnore
    public DCLogDTO resetLogInfo() {
        this._reset(FIELD_LOGINFO);
        return this;
    }

    /**
     * 设置「日志级别」
     *
     * @param val
    */
    @JsonIgnore
    public DCLogDTO setLogLevel(Integer val) {
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
    public DCLogDTO resetLogLevel() {
        this._reset(FIELD_LOGLEVEL);
        return this;
    }

    /**
     * 设置「操作人」
     *
     * @param val
    */
    @JsonIgnore
    public DCLogDTO setOPPersonId(String val) {
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
    public DCLogDTO resetOPPersonId() {
        this._reset(FIELD_OPPERSONID);
        return this;
    }

    /**
     * 设置「组织机构标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCLogDTO setOrgId(String val) {
        this._set(FIELD_ORGID, val);
        return this;
    }

    /**
     * 获取「组织机构标识」值
     *
    */
    @JsonIgnore
    public String getOrgId() {
        return (String) this._get(FIELD_ORGID);
    }

    /**
     * 判断 「组织机构标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgId() {
        return this._contains(FIELD_ORGID);
    }

    /**
     * 重置 「组织机构标识」
     *
    */
    @JsonIgnore
    public DCLogDTO resetOrgId() {
        this._reset(FIELD_ORGID);
        return this;
    }

    /**
     * 设置「日志标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCLogDTO setSysLogId(String val) {
        this._set(FIELD_SYSLOGID, val);
        return this;
    }

    /**
     * 获取「日志标识」值
     *
    */
    @JsonIgnore
    public String getSysLogId() {
        return (String) this._get(FIELD_SYSLOGID);
    }

    /**
     * 判断 「日志标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysLogId() {
        return this._contains(FIELD_SYSLOGID);
    }

    /**
     * 重置 「日志标识」
     *
    */
    @JsonIgnore
    public DCLogDTO resetSysLogId() {
        this._reset(FIELD_SYSLOGID);
        return this;
    }

    /**
     * 设置「日志信息」
     *
     * @param val
    */
    @JsonIgnore
    public DCLogDTO setSysLogName(String val) {
        this._set(FIELD_SYSLOGNAME, val);
        return this;
    }

    /**
     * 获取「日志信息」值
     *
    */
    @JsonIgnore
    public String getSysLogName() {
        return (String) this._get(FIELD_SYSLOGNAME);
    }

    /**
     * 判断 「日志信息」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysLogName() {
        return this._contains(FIELD_SYSLOGNAME);
    }

    /**
     * 重置 「日志信息」
     *
    */
    @JsonIgnore
    public DCLogDTO resetSysLogName() {
        this._reset(FIELD_SYSLOGNAME);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCLogDTO setUpdateDate(Timestamp val) {
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
    public DCLogDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public DCLogDTO setUpdateMan(String val) {
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
    public DCLogDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }

    /**
     * 设置「用户数据」
     *
     * @param val
    */
    @JsonIgnore
    public DCLogDTO setUserData(String val) {
        this._set(FIELD_USERDATA, val);
        return this;
    }

    /**
     * 获取「用户数据」值
     *
    */
    @JsonIgnore
    public String getUserData() {
        return (String) this._get(FIELD_USERDATA);
    }

    /**
     * 判断 「用户数据」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserData() {
        return this._contains(FIELD_USERDATA);
    }

    /**
     * 重置 「用户数据」
     *
    */
    @JsonIgnore
    public DCLogDTO resetUserData() {
        this._reset(FIELD_USERDATA);
        return this;
    }

    /**
     * 设置「用户数据2」
     *
     * @param val
    */
    @JsonIgnore
    public DCLogDTO setUserData2(String val) {
        this._set(FIELD_USERDATA2, val);
        return this;
    }

    /**
     * 获取「用户数据2」值
     *
    */
    @JsonIgnore
    public String getUserData2() {
        return (String) this._get(FIELD_USERDATA2);
    }

    /**
     * 判断 「用户数据2」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUserData2() {
        return this._contains(FIELD_USERDATA2);
    }

    /**
     * 重置 「用户数据2」
     *
    */
    @JsonIgnore
    public DCLogDTO resetUserData2() {
        this._reset(FIELD_USERDATA2);
        return this;
    }


}
