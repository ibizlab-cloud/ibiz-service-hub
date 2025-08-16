package net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 日程
 * 
 * @see ibizmos:/psmodules/notify/psdataentities/SYS_SCHEDULES/.ibizmodel.index
 */
public class SchedulesDTO extends EntityDTO {

  /**.
   * 备注
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_SCHEDULES/psdefields/MEMO/.ibizmodel.index
   */
  public final static String FIELD_MEMO = "memo";

  /**.
   * 开始时间
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_SCHEDULES/psdefields/BEGINTIME/.ibizmodel.index
   */
  public final static String FIELD_BEGINTIME = "begintime";

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_SCHEDULES/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_SCHEDULES/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 用户标识
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_SCHEDULES/psdefields/EMPID/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_SCHEDULES/minorpsders/DER1N_SYS_SCHEDULES_SYS_EMP_EMPID/.ibizmodel.index
   */
  public final static String FIELD_EMPID = "empid";

  /**.
   * 结束时间
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_SCHEDULES/psdefields/ENDTIME/.ibizmodel.index
   */
  public final static String FIELD_ENDTIME = "endtime";

  /**.
   * 单位标识
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_SCHEDULES/psdefields/ORGID/.ibizmodel.index
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_SCHEDULES/minorpsders/DER1N_SYS_SCHEDULES_SYS_ORG_ORGID/.ibizmodel.index
   */
  public final static String FIELD_ORGID = "orgid";

  /**.
   * 日程标识
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_SCHEDULES/psdefields/SCHEDULESID/.ibizmodel.index
   */
  public final static String FIELD_SCHEDULESID = "schedulesid";

  /**.
   * 标题
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_SCHEDULES/psdefields/SCHEDULESNAME/.ibizmodel.index
   */
  public final static String FIELD_SCHEDULESNAME = "schedulesname";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_SCHEDULES/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_SCHEDULES/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";


    /**
     * 设置「备注」
     *
     * @param val
    */
    @JsonIgnore
    public SchedulesDTO setMemo(String val) {
        this._set(FIELD_MEMO, val);
        return this;
    }

    /**
     * 获取「备注」值
     *
    */
    @JsonIgnore
    public String getMemo() {
        return (String) this._get(FIELD_MEMO);
    }

    /**
     * 判断 「备注」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMemo() {
        return this._contains(FIELD_MEMO);
    }

    /**
     * 重置 「备注」
     *
    */
    @JsonIgnore
    public SchedulesDTO resetMemo() {
        this._reset(FIELD_MEMO);
        return this;
    }

    /**
     * 设置「开始时间」
     *
     * @param val
    */
    @JsonIgnore
    public SchedulesDTO setBeginTime(Timestamp val) {
        this._set(FIELD_BEGINTIME, val);
        return this;
    }

    /**
     * 获取「开始时间」值
     *
    */
    @JsonIgnore
    public Timestamp getBeginTime() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_BEGINTIME),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「开始时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsBeginTime() {
        return this._contains(FIELD_BEGINTIME);
    }

    /**
     * 重置 「开始时间」
     *
    */
    @JsonIgnore
    public SchedulesDTO resetBeginTime() {
        this._reset(FIELD_BEGINTIME);
        return this;
    }

    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public SchedulesDTO setCreateDate(Timestamp val) {
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
    public SchedulesDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public SchedulesDTO setCreateMan(String val) {
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
    public SchedulesDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「用户标识」
     *
     * @param val
    */
    @JsonIgnore
    public SchedulesDTO setEmpId(String val) {
        this._set(FIELD_EMPID, val);
        return this;
    }

    /**
     * 获取「用户标识」值
     *
    */
    @JsonIgnore
    public String getEmpId() {
        return (String) this._get(FIELD_EMPID);
    }

    /**
     * 判断 「用户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEmpId() {
        return this._contains(FIELD_EMPID);
    }

    /**
     * 重置 「用户标识」
     *
    */
    @JsonIgnore
    public SchedulesDTO resetEmpId() {
        this._reset(FIELD_EMPID);
        return this;
    }

    /**
     * 设置「结束时间」
     *
     * @param val
    */
    @JsonIgnore
    public SchedulesDTO setEndTime(Timestamp val) {
        this._set(FIELD_ENDTIME, val);
        return this;
    }

    /**
     * 获取「结束时间」值
     *
    */
    @JsonIgnore
    public Timestamp getEndTime() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_ENDTIME),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「结束时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEndTime() {
        return this._contains(FIELD_ENDTIME);
    }

    /**
     * 重置 「结束时间」
     *
    */
    @JsonIgnore
    public SchedulesDTO resetEndTime() {
        this._reset(FIELD_ENDTIME);
        return this;
    }

    /**
     * 设置「单位标识」
     *
     * @param val
    */
    @JsonIgnore
    public SchedulesDTO setOrgId(String val) {
        this._set(FIELD_ORGID, val);
        return this;
    }

    /**
     * 获取「单位标识」值
     *
    */
    @JsonIgnore
    public String getOrgId() {
        return (String) this._get(FIELD_ORGID);
    }

    /**
     * 判断 「单位标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsOrgId() {
        return this._contains(FIELD_ORGID);
    }

    /**
     * 重置 「单位标识」
     *
    */
    @JsonIgnore
    public SchedulesDTO resetOrgId() {
        this._reset(FIELD_ORGID);
        return this;
    }

    /**
     * 设置「日程标识」
     *
     * @param val
    */
    @JsonIgnore
    public SchedulesDTO setSchedulesId(String val) {
        this._set(FIELD_SCHEDULESID, val);
        return this;
    }

    /**
     * 获取「日程标识」值
     *
    */
    @JsonIgnore
    public String getSchedulesId() {
        return (String) this._get(FIELD_SCHEDULESID);
    }

    /**
     * 判断 「日程标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSchedulesId() {
        return this._contains(FIELD_SCHEDULESID);
    }

    /**
     * 重置 「日程标识」
     *
    */
    @JsonIgnore
    public SchedulesDTO resetSchedulesId() {
        this._reset(FIELD_SCHEDULESID);
        return this;
    }

    /**
     * 设置「标题」
     *
     * @param val
    */
    @JsonIgnore
    public SchedulesDTO setSchedulesName(String val) {
        this._set(FIELD_SCHEDULESNAME, val);
        return this;
    }

    /**
     * 获取「标题」值
     *
    */
    @JsonIgnore
    public String getSchedulesName() {
        return (String) this._get(FIELD_SCHEDULESNAME);
    }

    /**
     * 判断 「标题」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSchedulesName() {
        return this._contains(FIELD_SCHEDULESNAME);
    }

    /**
     * 重置 「标题」
     *
    */
    @JsonIgnore
    public SchedulesDTO resetSchedulesName() {
        this._reset(FIELD_SCHEDULESNAME);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public SchedulesDTO setUpdateDate(Timestamp val) {
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
    public SchedulesDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public SchedulesDTO setUpdateMan(String val) {
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
    public SchedulesDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
