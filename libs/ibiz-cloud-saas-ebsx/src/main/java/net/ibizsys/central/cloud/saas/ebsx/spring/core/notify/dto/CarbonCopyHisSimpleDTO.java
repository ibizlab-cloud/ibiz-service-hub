package net.ibizsys.central.cloud.saas.ebsx.spring.core.notify.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 抄送历史
 * 
 * @see ibizmos:/psmodules/notify/psdataentities/SYS_CARBONCOPYHIS/.ibizmodel.index
 */
public class CarbonCopyHisSimpleDTO extends EntityDTO {

  /**.
   * 创建时间
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_CARBONCOPYHIS/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 创建人
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_CARBONCOPYHIS/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 组织机构标识
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_CARBONCOPYHIS/psdefields/ORGID/.ibizmodel.index
   */
  public final static String FIELD_ORGID = "orgid";

  /**.
   * 标题
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_CARBONCOPYHIS/psdefields/TITLE/.ibizmodel.index
   */
  public final static String FIELD_TITLE = "title";

  /**.
   * 待办标识
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_CARBONCOPYHIS/psdefields/TODOID/.ibizmodel.index
   */
  public final static String FIELD_TODOID = "todoid";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_CARBONCOPYHIS/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/notify/psdataentities/SYS_CARBONCOPYHIS/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";


    /**
     * 设置「创建时间」
     *
     * @param val
    */
    @JsonIgnore
    public CarbonCopyHisSimpleDTO setCreateDate(Timestamp val) {
        this._set(FIELD_CREATEDATE, val);
        return this;
    }

    /**
     * 获取「创建时间」值
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
     * 判断 「创建时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateDate() {
        return this._contains(FIELD_CREATEDATE);
    }

    /**
     * 重置 「创建时间」
     *
    */
    @JsonIgnore
    public CarbonCopyHisSimpleDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「创建人」
     *
     * @param val
    */
    @JsonIgnore
    public CarbonCopyHisSimpleDTO setCreateMan(String val) {
        this._set(FIELD_CREATEMAN, val);
        return this;
    }

    /**
     * 获取「创建人」值
     *
    */
    @JsonIgnore
    public String getCreateMan() {
        return (String) this._get(FIELD_CREATEMAN);
    }

    /**
     * 判断 「创建人」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCreateMan() {
        return this._contains(FIELD_CREATEMAN);
    }

    /**
     * 重置 「创建人」
     *
    */
    @JsonIgnore
    public CarbonCopyHisSimpleDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「组织机构标识」
     *
     * @param val
    */
    @JsonIgnore
    public CarbonCopyHisSimpleDTO setOrgId(String val) {
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
    public CarbonCopyHisSimpleDTO resetOrgId() {
        this._reset(FIELD_ORGID);
        return this;
    }

    /**
     * 设置「标题」
     *
     * @param val
    */
    @JsonIgnore
    public CarbonCopyHisSimpleDTO setTitle(String val) {
        this._set(FIELD_TITLE, val);
        return this;
    }

    /**
     * 获取「标题」值
     *
    */
    @JsonIgnore
    public String getTitle() {
        return (String) this._get(FIELD_TITLE);
    }

    /**
     * 判断 「标题」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTitle() {
        return this._contains(FIELD_TITLE);
    }

    /**
     * 重置 「标题」
     *
    */
    @JsonIgnore
    public CarbonCopyHisSimpleDTO resetTitle() {
        this._reset(FIELD_TITLE);
        return this;
    }

    /**
     * 设置「待办标识」
     *
     * @param val
    */
    @JsonIgnore
    public CarbonCopyHisSimpleDTO setTodoId(String val) {
        this._set(FIELD_TODOID, val);
        return this;
    }

    /**
     * 获取「待办标识」值
     *
    */
    @JsonIgnore
    public String getTodoId() {
        return (String) this._get(FIELD_TODOID);
    }

    /**
     * 判断 「待办标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsTodoId() {
        return this._contains(FIELD_TODOID);
    }

    /**
     * 重置 「待办标识」
     *
    */
    @JsonIgnore
    public CarbonCopyHisSimpleDTO resetTodoId() {
        this._reset(FIELD_TODOID);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public CarbonCopyHisSimpleDTO setUpdateDate(Timestamp val) {
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
    public CarbonCopyHisSimpleDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public CarbonCopyHisSimpleDTO setUpdateMan(String val) {
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
    public CarbonCopyHisSimpleDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
