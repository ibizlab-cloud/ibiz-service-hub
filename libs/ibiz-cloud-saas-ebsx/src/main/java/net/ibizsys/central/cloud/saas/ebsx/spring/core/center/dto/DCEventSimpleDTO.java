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
public class DCEventSimpleDTO extends EntityDTO {

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
    public DCEventSimpleDTO setCreateDate(Timestamp val) {
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
    public DCEventSimpleDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public DCEventSimpleDTO setCreateMan(String val) {
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
    public DCEventSimpleDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「事件标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCEventSimpleDTO setSysEventId(String val) {
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
    public DCEventSimpleDTO resetSysEventId() {
        this._reset(FIELD_SYSEVENTID);
        return this;
    }

    /**
     * 设置「事件名称」
     *
     * @param val
    */
    @JsonIgnore
    public DCEventSimpleDTO setSysEventName(String val) {
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
    public DCEventSimpleDTO resetSysEventName() {
        this._reset(FIELD_SYSEVENTNAME);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCEventSimpleDTO setUpdateDate(Timestamp val) {
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
    public DCEventSimpleDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public DCEventSimpleDTO setUpdateMan(String val) {
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
    public DCEventSimpleDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
