package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 系统事件
 * 
 * @see ibizmos:/psmodules/log/psdataentities/SYS_EVENT/.ibizmodel.index
 */
public class SysEvent extends EntityBase {

  /**.
   * 事件时间
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_EVENT/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_EVENT/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 租户系统标识
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_EVENT/psdefields/DCSYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/log/psdataentities/SYS_EVENT/minorpsders/DER1N_SYS_EVENT_SYS_DC_SYSTEM_DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMID = "dcsystemid";

  /**.
   * 系统
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_EVENT/psdefields/DCSYSTEMNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/log/psdataentities/SYS_EVENT/minorpsders/DER1N_SYS_EVENT_SYS_DC_SYSTEM_DCSYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_DCSYSTEMNAME = "dcsystemname";

  /**.
   * 事件类别
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_EVENT/psdefields/CAT/.ibizmodel.index
   */
  public final static String FIELD_CAT = "cat";

  /**.
   * 事件信息
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_EVENT/psdefields/INFO/.ibizmodel.index
   */
  public final static String FIELD_INFO = "info";

  /**.
   * 日志级别
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_EVENT/psdefields/LOGLEVEL/.ibizmodel.index
   */
  public final static String FIELD_LOGLEVEL = "loglevel";

  /**.
   * 操作人
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_EVENT/psdefields/OPPERSONID/.ibizmodel.index
   */
  public final static String FIELD_OPPERSONID = "oppersonid";

  /**.
   * 事件标识
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_EVENT/psdefields/SYSEVENTID/.ibizmodel.index
   */
  public final static String FIELD_SYSEVENTID = "syseventid";

  /**.
   * 事件名称
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_EVENT/psdefields/SYSEVENTNAME/.ibizmodel.index
   */
  public final static String FIELD_SYSEVENTNAME = "syseventname";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_EVENT/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/log/psdataentities/SYS_EVENT/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";


    /**
     * 设置「事件时间」
     *
     * @param val
    */
    @JsonIgnore
    public SysEvent setCreateDate(Timestamp val) {
        this.set(FIELD_CREATEDATE, val);
        return this;
    }

    /**
     * 获取「事件时间」值
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
     * 判断 「事件时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateDate() {
        return this.contains(FIELD_CREATEDATE);
    }

    /**
     * 重置 「事件时间」
     *
    */
    @JsonIgnore
    public SysEvent resetCreateDate() {
        this.reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public SysEvent setCreateMan(String val) {
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
    public SysEvent resetCreateMan() {
        this.reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「租户系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public SysEvent setDCSystemId(String val) {
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
    public SysEvent resetDCSystemId() {
        this.reset(FIELD_DCSYSTEMID);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public SysEvent setDCSystemName(String val) {
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
    public SysEvent resetDCSystemName() {
        this.reset(FIELD_DCSYSTEMNAME);
        return this;
    }

    /**
     * 设置「事件类别」
     *
     * @param val
    */
    @JsonIgnore
    public SysEvent setCat(String val) {
        this.set(FIELD_CAT, val);
        return this;
    }

    /**
     * 获取「事件类别」值
     *
    */
    @JsonIgnore
    public String getCat() {
        return (String) this.get(FIELD_CAT);
    }

    /**
     * 判断 「事件类别」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCat() {
        return this.contains(FIELD_CAT);
    }

    /**
     * 重置 「事件类别」
     *
    */
    @JsonIgnore
    public SysEvent resetCat() {
        this.reset(FIELD_CAT);
        return this;
    }

    /**
     * 设置「事件信息」
     *
     * @param val
    */
    @JsonIgnore
    public SysEvent setInfo(String val) {
        this.set(FIELD_INFO, val);
        return this;
    }

    /**
     * 获取「事件信息」值
     *
    */
    @JsonIgnore
    public String getInfo() {
        return (String) this.get(FIELD_INFO);
    }

    /**
     * 判断 「事件信息」是否有值
     *
    */
    @JsonIgnore
    public boolean containsInfo() {
        return this.contains(FIELD_INFO);
    }

    /**
     * 重置 「事件信息」
     *
    */
    @JsonIgnore
    public SysEvent resetInfo() {
        this.reset(FIELD_INFO);
        return this;
    }

    /**
     * 设置「日志级别」
     *
     * @param val
    */
    @JsonIgnore
    public SysEvent setLogLevel(Integer val) {
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
    public SysEvent resetLogLevel() {
        this.reset(FIELD_LOGLEVEL);
        return this;
    }

    /**
     * 设置「操作人」
     *
     * @param val
    */
    @JsonIgnore
    public SysEvent setOPPersonId(String val) {
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
    public SysEvent resetOPPersonId() {
        this.reset(FIELD_OPPERSONID);
        return this;
    }

    /**
     * 设置「事件标识」
     *
     * @param val
    */
    @JsonIgnore
    public SysEvent setSysEventId(String val) {
        this.set(FIELD_SYSEVENTID, val);
        return this;
    }

    /**
     * 获取「事件标识」值
     *
    */
    @JsonIgnore
    public String getSysEventId() {
        return (String) this.get(FIELD_SYSEVENTID);
    }

    /**
     * 判断 「事件标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysEventId() {
        return this.contains(FIELD_SYSEVENTID);
    }

    /**
     * 重置 「事件标识」
     *
    */
    @JsonIgnore
    public SysEvent resetSysEventId() {
        this.reset(FIELD_SYSEVENTID);
        return this;
    }

    /**
     * 设置「事件名称」
     *
     * @param val
    */
    @JsonIgnore
    public SysEvent setSysEventName(String val) {
        this.set(FIELD_SYSEVENTNAME, val);
        return this;
    }

    /**
     * 获取「事件名称」值
     *
    */
    @JsonIgnore
    public String getSysEventName() {
        return (String) this.get(FIELD_SYSEVENTNAME);
    }

    /**
     * 判断 「事件名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysEventName() {
        return this.contains(FIELD_SYSEVENTNAME);
    }

    /**
     * 重置 「事件名称」
     *
    */
    @JsonIgnore
    public SysEvent resetSysEventName() {
        this.reset(FIELD_SYSEVENTNAME);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public SysEvent setUpdateDate(Timestamp val) {
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
    public SysEvent resetUpdateDate() {
        this.reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public SysEvent setUpdateMan(String val) {
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
    public SysEvent resetUpdateMan() {
        this.reset(FIELD_UPDATEMAN);
        return this;
    }


}
