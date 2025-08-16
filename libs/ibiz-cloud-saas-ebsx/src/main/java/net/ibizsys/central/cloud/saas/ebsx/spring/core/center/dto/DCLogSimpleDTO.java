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
public class DCLogSimpleDTO extends EntityDTO {

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


    /**
     * 设置「日志时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCLogSimpleDTO setCreateDate(Timestamp val) {
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
    public DCLogSimpleDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public DCLogSimpleDTO setCreateMan(String val) {
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
    public DCLogSimpleDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「组织部门标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCLogSimpleDTO setDeptId(String val) {
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
    public DCLogSimpleDTO resetDeptId() {
        this._reset(FIELD_DEPTID);
        return this;
    }

    /**
     * 设置「日志类别」
     *
     * @param val
    */
    @JsonIgnore
    public DCLogSimpleDTO setLogCat(String val) {
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
    public DCLogSimpleDTO resetLogCat() {
        this._reset(FIELD_LOGCAT);
        return this;
    }

    /**
     * 设置「组织机构标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCLogSimpleDTO setOrgId(String val) {
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
    public DCLogSimpleDTO resetOrgId() {
        this._reset(FIELD_ORGID);
        return this;
    }

    /**
     * 设置「日志标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCLogSimpleDTO setSysLogId(String val) {
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
    public DCLogSimpleDTO resetSysLogId() {
        this._reset(FIELD_SYSLOGID);
        return this;
    }

    /**
     * 设置「日志信息」
     *
     * @param val
    */
    @JsonIgnore
    public DCLogSimpleDTO setSysLogName(String val) {
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
    public DCLogSimpleDTO resetSysLogName() {
        this._reset(FIELD_SYSLOGNAME);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCLogSimpleDTO setUpdateDate(Timestamp val) {
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
    public DCLogSimpleDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public DCLogSimpleDTO setUpdateMan(String val) {
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
    public DCLogSimpleDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
