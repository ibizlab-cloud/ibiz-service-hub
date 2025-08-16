package net.ibizsys.central.cloud.saas.ebsx.spring.core.center.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 系统事件
 * 
 * @see ibizmos:/psmodules/center/psdataentities/DC_EVENT/.ibizmodel.index
 */
public class DCEventDTO extends EntityDTO {

  /**.
   * 事件时间
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_EVENT/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_EVENT/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_EVENT/psdefields/DCSYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/center/psdataentities/DC_EVENT/minorpsders/DER1N_DC_EVENT_DC_DC_SYSTEM_DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";

  /**.
   * 系统
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_EVENT/psdefields/DCSYSTEMNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/center/psdataentities/DC_EVENT/minorpsders/DER1N_DC_EVENT_DC_DC_SYSTEM_DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMNAME = "dcsystemname";

  /**.
   * 事件类别
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_EVENT/psdefields/EVENTCAT/.ibizmodel.index
   */
  public final static String FIELD_EVENTCAT = "eventcat";

  /**.
   * 详细信息
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_EVENT/psdefields/EVENTINFO/.ibizmodel.index
   */
  public final static String FIELD_EVENTINFO = "eventinfo";

  /**.
   * 日志级别
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_EVENT/psdefields/LOGLEVEL/.ibizmodel.index
   */
  public final static String FIELD_LOGLEVEL = "loglevel";

  /**.
   * 操作人
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_EVENT/psdefields/OPPERSONID/.ibizmodel.index
   */
  public final static String FIELD_OPPERSONID = "oppersonid";

  /**.
   * 事件标识
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_EVENT/psdefields/SYSEVENTID/.ibizmodel.index
   */
  public final static String FIELD_SYSEVENTID = "syseventid";

  /**.
   * 事件名称
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_EVENT/psdefields/SYSEVENTNAME/.ibizmodel.index
   */
  public final static String FIELD_SYSEVENTNAME = "syseventname";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_EVENT/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_EVENT/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";


    /**
     * 设置「事件时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCEventDTO setCreateDate(Timestamp val) {
        this._set(FIELD_CREATEDATE, val);
        return this;
    }

    /**
     * 获取「事件时间」值
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
     * 判断 「事件时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateDate() {
        return this._contains(FIELD_CREATEDATE);
    }

    /**
     * 重置 「事件时间」
     *
    */
    @JsonIgnore
    public DCEventDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public DCEventDTO setCreateMan(String val) {
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
    public DCEventDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCEventDTO setDCSystemId(String val) {
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
    public DCEventDTO resetDCSystemId() {
        this._reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public DCEventDTO setDCSystemName(String val) {
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
    public DCEventDTO resetDCSystemName() {
        this._reset(FIELD_DCSYSTEMNAME);
        return this;
    }

    /**
     * 设置「事件类别」
     *
     * @param val
    */
    @JsonIgnore
    public DCEventDTO setEventCat(String val) {
        this._set(FIELD_EVENTCAT, val);
        return this;
    }

    /**
     * 获取「事件类别」值
     *
    */
    @JsonIgnore
    public String getEventCat() {
        return (String) this._get(FIELD_EVENTCAT);
    }

    /**
     * 判断 「事件类别」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEventCat() {
        return this._contains(FIELD_EVENTCAT);
    }

    /**
     * 重置 「事件类别」
     *
    */
    @JsonIgnore
    public DCEventDTO resetEventCat() {
        this._reset(FIELD_EVENTCAT);
        return this;
    }

    /**
     * 设置「详细信息」
     *
     * @param val
    */
    @JsonIgnore
    public DCEventDTO setEventInfo(String val) {
        this._set(FIELD_EVENTINFO, val);
        return this;
    }

    /**
     * 获取「详细信息」值
     *
    */
    @JsonIgnore
    public String getEventInfo() {
        return (String) this._get(FIELD_EVENTINFO);
    }

    /**
     * 判断 「详细信息」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEventInfo() {
        return this._contains(FIELD_EVENTINFO);
    }

    /**
     * 重置 「详细信息」
     *
    */
    @JsonIgnore
    public DCEventDTO resetEventInfo() {
        this._reset(FIELD_EVENTINFO);
        return this;
    }

    /**
     * 设置「日志级别」
     *
     * @param val
    */
    @JsonIgnore
    public DCEventDTO setLogLevel(Integer val) {
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
    public DCEventDTO resetLogLevel() {
        this._reset(FIELD_LOGLEVEL);
        return this;
    }

    /**
     * 设置「操作人」
     *
     * @param val
    */
    @JsonIgnore
    public DCEventDTO setOPPersonId(String val) {
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
    public DCEventDTO resetOPPersonId() {
        this._reset(FIELD_OPPERSONID);
        return this;
    }

    /**
     * 设置「事件标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCEventDTO setSysEventId(String val) {
        this._set(FIELD_SYSEVENTID, val);
        return this;
    }

    /**
     * 获取「事件标识」值
     *
    */
    @JsonIgnore
    public String getSysEventId() {
        return (String) this._get(FIELD_SYSEVENTID);
    }

    /**
     * 判断 「事件标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysEventId() {
        return this._contains(FIELD_SYSEVENTID);
    }

    /**
     * 重置 「事件标识」
     *
    */
    @JsonIgnore
    public DCEventDTO resetSysEventId() {
        this._reset(FIELD_SYSEVENTID);
        return this;
    }

    /**
     * 设置「事件名称」
     *
     * @param val
    */
    @JsonIgnore
    public DCEventDTO setSysEventName(String val) {
        this._set(FIELD_SYSEVENTNAME, val);
        return this;
    }

    /**
     * 获取「事件名称」值
     *
    */
    @JsonIgnore
    public String getSysEventName() {
        return (String) this._get(FIELD_SYSEVENTNAME);
    }

    /**
     * 判断 「事件名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysEventName() {
        return this._contains(FIELD_SYSEVENTNAME);
    }

    /**
     * 重置 「事件名称」
     *
    */
    @JsonIgnore
    public DCEventDTO resetSysEventName() {
        this._reset(FIELD_SYSEVENTNAME);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCEventDTO setUpdateDate(Timestamp val) {
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
    public DCEventDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public DCEventDTO setUpdateMan(String val) {
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
    public DCEventDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
