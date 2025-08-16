package net.ibizsys.central.cloud.saas.ebsx.spring.core.portal.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 门户异步操作
 * 
 * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/.ibizmodel.index
 */
public class PTAsyncActionSimpleDTO extends EntityDTO {

  /**.
   * 异步操作标识
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/ASYNCACITONID/.ibizmodel.index
   */
  public final static String FIELD_ASYNCACITONID = "asyncacitonid";

  /**.
   * 异步操作名称
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/ASYNCACITONNAME/.ibizmodel.index
   */
  public final static String FIELD_ASYNCACITONNAME = "asyncacitonname";

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/portal/psdataentities/PT_ASYNCACTION/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";


    /**
     * 设置「异步操作标识」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionSimpleDTO setAsyncAcitonId(String val) {
        this._set(FIELD_ASYNCACITONID, val);
        return this;
    }

    /**
     * 获取「异步操作标识」值
     *
    */
    @JsonIgnore
    public String getAsyncAcitonId() {
        return (String) this._get(FIELD_ASYNCACITONID);
    }

    /**
     * 判断 「异步操作标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAsyncAcitonId() {
        return this._contains(FIELD_ASYNCACITONID);
    }

    /**
     * 重置 「异步操作标识」
     *
    */
    @JsonIgnore
    public PTAsyncActionSimpleDTO resetAsyncAcitonId() {
        this._reset(FIELD_ASYNCACITONID);
        return this;
    }

    /**
     * 设置「异步操作名称」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionSimpleDTO setAsyncAcitonName(String val) {
        this._set(FIELD_ASYNCACITONNAME, val);
        return this;
    }

    /**
     * 获取「异步操作名称」值
     *
    */
    @JsonIgnore
    public String getAsyncAcitonName() {
        return (String) this._get(FIELD_ASYNCACITONNAME);
    }

    /**
     * 判断 「异步操作名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsAsyncAcitonName() {
        return this._contains(FIELD_ASYNCACITONNAME);
    }

    /**
     * 重置 「异步操作名称」
     *
    */
    @JsonIgnore
    public PTAsyncActionSimpleDTO resetAsyncAcitonName() {
        this._reset(FIELD_ASYNCACITONNAME);
        return this;
    }

    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionSimpleDTO setCreateDate(Timestamp val) {
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
    public PTAsyncActionSimpleDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionSimpleDTO setCreateMan(String val) {
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
    public PTAsyncActionSimpleDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionSimpleDTO setUpdateDate(Timestamp val) {
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
    public PTAsyncActionSimpleDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public PTAsyncActionSimpleDTO setUpdateMan(String val) {
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
    public PTAsyncActionSimpleDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
