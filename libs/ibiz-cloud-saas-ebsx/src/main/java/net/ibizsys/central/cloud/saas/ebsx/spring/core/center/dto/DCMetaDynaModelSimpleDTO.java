package net.ibizsys.central.cloud.saas.ebsx.spring.core.center.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 模型版本
 * 
 * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/.ibizmodel.index
 */
public class DCMetaDynaModelSimpleDTO extends EntityDTO {

  /**.
   * 配置标识
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdefields/CONFIGID/.ibizmodel.index
   */
  public final static String FIELD_CONFIGID = "configid";

  /**.
   * 配置名称
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdefields/CONFIGNAME/.ibizmodel.index
   */
  public final static String FIELD_CONFIGNAME = "configname";

  /**.
   * 建立时间
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 建立人
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdefields/CREATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_CREATEMAN = "createman";

  /**.
   * 更新时间
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";

  /**.
   * 更新人
   *
   * @see ibizmos:/psmodules/center/psdataentities/DC_META_DYNAMICMODEL/psdefields/UPDATEMAN/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/SysOperator.ibizmodel.yaml
   */
  public final static String FIELD_UPDATEMAN = "updateman";


    /**
     * 设置「配置标识」
     *
     * @param val
    */
    @JsonIgnore
    public DCMetaDynaModelSimpleDTO setConfigId(String val) {
        this._set(FIELD_CONFIGID, val);
        return this;
    }

    /**
     * 获取「配置标识」值
     *
    */
    @JsonIgnore
    public String getConfigId() {
        return (String) this._get(FIELD_CONFIGID);
    }

    /**
     * 判断 「配置标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsConfigId() {
        return this._contains(FIELD_CONFIGID);
    }

    /**
     * 重置 「配置标识」
     *
    */
    @JsonIgnore
    public DCMetaDynaModelSimpleDTO resetConfigId() {
        this._reset(FIELD_CONFIGID);
        return this;
    }

    /**
     * 设置「配置名称」
     *
     * @param val
    */
    @JsonIgnore
    public DCMetaDynaModelSimpleDTO setConfigName(String val) {
        this._set(FIELD_CONFIGNAME, val);
        return this;
    }

    /**
     * 获取「配置名称」值
     *
    */
    @JsonIgnore
    public String getConfigName() {
        return (String) this._get(FIELD_CONFIGNAME);
    }

    /**
     * 判断 「配置名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsConfigName() {
        return this._contains(FIELD_CONFIGNAME);
    }

    /**
     * 重置 「配置名称」
     *
    */
    @JsonIgnore
    public DCMetaDynaModelSimpleDTO resetConfigName() {
        this._reset(FIELD_CONFIGNAME);
        return this;
    }

    /**
     * 设置「建立时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCMetaDynaModelSimpleDTO setCreateDate(Timestamp val) {
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
    public DCMetaDynaModelSimpleDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「建立人」
     *
     * @param val
    */
    @JsonIgnore
    public DCMetaDynaModelSimpleDTO setCreateMan(String val) {
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
    public DCMetaDynaModelSimpleDTO resetCreateMan() {
        this._reset(FIELD_CREATEMAN);
        return this;
    }

    /**
     * 设置「更新时间」
     *
     * @param val
    */
    @JsonIgnore
    public DCMetaDynaModelSimpleDTO setUpdateDate(Timestamp val) {
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
    public DCMetaDynaModelSimpleDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }

    /**
     * 设置「更新人」
     *
     * @param val
    */
    @JsonIgnore
    public DCMetaDynaModelSimpleDTO setUpdateMan(String val) {
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
    public DCMetaDynaModelSimpleDTO resetUpdateMan() {
        this._reset(FIELD_UPDATEMAN);
        return this;
    }


}
