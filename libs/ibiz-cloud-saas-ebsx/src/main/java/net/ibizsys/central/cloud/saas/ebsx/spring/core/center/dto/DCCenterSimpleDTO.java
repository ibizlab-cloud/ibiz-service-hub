package net.ibizsys.central.cloud.saas.ebsx.spring.core.center.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 机构中心
 * 
 * @see ibizmos:/psmodules/center/psdataentities/DC_CENTER/.ibizmodel.index
 */
public class DCCenterSimpleDTO extends EntityDTO {

  /**.
   * 租户名称
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_CENTER/psdefields/CENTERNAME/.ibizmodel.index
   */
  public final static String FIELD_CENTERNAME = "centername";

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_CENTER/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_CENTER/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 租户标识
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_CENTER/psdefields/CENTERID/.ibizmodel.index
   */
  public final static String FIELD_SYSCENTERID = "syscenterid";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_CENTER/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_CENTER/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";


    /**
     * 设置「租户名称」
     *
     * @param val
    */
    @JsonIgnore
    public DCCenterSimpleDTO setCenterName(String val) {
        this._set(FIELD_CENTERNAME, val);
        return this;
    }

    /**
     * 获取「租户名称」值
     *
    */
    @JsonIgnore
    public String getCenterName() {
        return (String) this._get(FIELD_CENTERNAME);
    }

    /**
     * 判断 「租户名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCenterName() {
        return this._contains(FIELD_CENTERNAME);
    }

    /**
     * 重置 「租户名称」
     *
    */
    @JsonIgnore
    public DCCenterSimpleDTO resetCenterName() {
        this._reset(FIELD_CENTERNAME);
        return this;
    }

    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCCenterSimpleDTO setCreateDate(Timestamp val) {
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
    public DCCenterSimpleDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public DCCenterSimpleDTO setCreateMan(String val) {
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
    public DCCenterSimpleDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「租户标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCCenterSimpleDTO setSysCenterId(String val) {
        this._set(FIELD_SYSCENTERID, val);
        return this;
    }

    /**
     * 获取「租户标识」值
     *
    */
    @JsonIgnore
    public String getSysCenterId() {
        return (String) this._get(FIELD_SYSCENTERID);
    }

    /**
     * 判断 「租户标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSysCenterId() {
        return this._contains(FIELD_SYSCENTERID);
    }

    /**
     * 重置 「租户标识」
     *
    */
    @JsonIgnore
    public DCCenterSimpleDTO resetSysCenterId() {
        this._reset(FIELD_SYSCENTERID);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCCenterSimpleDTO setUpdateDate(Timestamp val) {
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
    public DCCenterSimpleDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public DCCenterSimpleDTO setUpdateMan(String val) {
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
    public DCCenterSimpleDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
