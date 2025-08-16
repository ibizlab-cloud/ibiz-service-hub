package net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 模型
 * 
 * @see ibizmos:/psmodules/lite/psdataentities/META_MODEL/.ibizmodel.index
 */
public class MetaModelDTO extends EntityDTO {

  /**.
   * 标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_MODEL/psdefields/MODELID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_MODEL/psdefields/MODELNAME/.ibizmodel.index
   */
  public final static String FIELD_NAME = "name";

  /**.
   * 代码名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_MODEL/psdefields/CODENAME/.ibizmodel.index
   */
  public final static String FIELD_CODE_NAME = "code_name";

  /**.
   * 配置
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_MODEL/psdefields/MODELCFG/.ibizmodel.index
   */
  public final static String FIELD_CONFIG = "config";

  /**.
   * 系统标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_MODEL/psdefields/SYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_MODEL/minorpsders/DER1N_META_MODEL_DST_SYSTEM_SYSTEMID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEM_ID = "system_id";

  /**.
   * 物化视图
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_MODEL/psdefields/MATERIALIZEDVIEW/.ibizmodel.index
   */
  public final static String FIELD_MATERIALIZED_VIEW = "materialized_view";

  /**.
   * 刷新时间
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_MODEL/psdefields/REFRESHTIME/.ibizmodel.index
   */
  public final static String FIELD_REFRESH_TIME = "refresh_time";

  /**.
   * 创建时间
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_MODEL/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 最后修改时间
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_MODEL/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";


    /**
     * 设置「标识」
     *
     * @param val
    */
    @JsonIgnore
    public MetaModelDTO setId(String val) {
        this._set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
    */
    @JsonIgnore
    public String getId() {
        return (String) this._get(FIELD_ID);
    }

    /**
     * 判断 「标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsId() {
        return this._contains(FIELD_ID);
    }

    /**
     * 重置 「标识」
     *
    */
    @JsonIgnore
    public MetaModelDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     *
     * @param val
    */
    @JsonIgnore
    public MetaModelDTO setName(String val) {
        this._set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
    */
    @JsonIgnore
    public String getName() {
        return (String) this._get(FIELD_NAME);
    }

    /**
     * 判断 「名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsName() {
        return this._contains(FIELD_NAME);
    }

    /**
     * 重置 「名称」
     *
    */
    @JsonIgnore
    public MetaModelDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「代码名称」
     *
     * @param val
    */
    @JsonIgnore
    public MetaModelDTO setCode_name(String val) {
        this._set(FIELD_CODE_NAME, val);
        return this;
    }

    /**
     * 获取「代码名称」值
     *
    */
    @JsonIgnore
    public String getCode_name() {
        return (String) this._get(FIELD_CODE_NAME);
    }

    /**
     * 判断 「代码名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsCode_name() {
        return this._contains(FIELD_CODE_NAME);
    }

    /**
     * 重置 「代码名称」
     *
    */
    @JsonIgnore
    public MetaModelDTO resetCode_name() {
        this._reset(FIELD_CODE_NAME);
        return this;
    }

    /**
     * 设置「配置」
     *
     * @param val
    */
    @JsonIgnore
    public MetaModelDTO setConfig(String val) {
        this._set(FIELD_CONFIG, val);
        return this;
    }

    /**
     * 获取「配置」值
     *
    */
    @JsonIgnore
    public String getConfig() {
        return (String) this._get(FIELD_CONFIG);
    }

    /**
     * 判断 「配置」是否有值
     *
    */
    @JsonIgnore
    public boolean containsConfig() {
        return this._contains(FIELD_CONFIG);
    }

    /**
     * 重置 「配置」
     *
    */
    @JsonIgnore
    public MetaModelDTO resetConfig() {
        this._reset(FIELD_CONFIG);
        return this;
    }

    /**
     * 设置「系统标识」
     *
     * @param val
    */
    @JsonIgnore
    public MetaModelDTO setSystem_id(String val) {
        this._set(FIELD_SYSTEM_ID, val);
        return this;
    }

    /**
     * 获取「系统标识」值
     *
    */
    @JsonIgnore
    public String getSystem_id() {
        return (String) this._get(FIELD_SYSTEM_ID);
    }

    /**
     * 判断 「系统标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSystem_id() {
        return this._contains(FIELD_SYSTEM_ID);
    }

    /**
     * 重置 「系统标识」
     *
    */
    @JsonIgnore
    public MetaModelDTO resetSystem_id() {
        this._reset(FIELD_SYSTEM_ID);
        return this;
    }

    /**
     * 设置「物化视图」
     *
     * @param val
    */
    @JsonIgnore
    public MetaModelDTO setMaterialized_view(String val) {
        this._set(FIELD_MATERIALIZED_VIEW, val);
        return this;
    }

    /**
     * 获取「物化视图」值
     *
    */
    @JsonIgnore
    public String getMaterialized_view() {
        return (String) this._get(FIELD_MATERIALIZED_VIEW);
    }

    /**
     * 判断 「物化视图」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMaterialized_view() {
        return this._contains(FIELD_MATERIALIZED_VIEW);
    }

    /**
     * 重置 「物化视图」
     *
    */
    @JsonIgnore
    public MetaModelDTO resetMaterialized_view() {
        this._reset(FIELD_MATERIALIZED_VIEW);
        return this;
    }

    /**
     * 设置「刷新时间」
     *
     * @param val
    */
    @JsonIgnore
    public MetaModelDTO setRefresh_time(Timestamp val) {
        this._set(FIELD_REFRESH_TIME, val);
        return this;
    }

    /**
     * 获取「刷新时间」值
     *
    */
    @JsonIgnore
    public Timestamp getRefresh_time() {
        try{
            return DataTypeUtils.getDateTimeValue(this._get(FIELD_REFRESH_TIME),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「刷新时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRefresh_time() {
        return this._contains(FIELD_REFRESH_TIME);
    }

    /**
     * 重置 「刷新时间」
     *
    */
    @JsonIgnore
    public MetaModelDTO resetRefresh_time() {
        this._reset(FIELD_REFRESH_TIME);
        return this;
    }

    /**
     * 设置「创建时间」
     *
     * @param val
    */
    @JsonIgnore
    public MetaModelDTO setCreateDate(Timestamp val) {
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
    public MetaModelDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「最后修改时间」
     *
     * @param val
    */
    @JsonIgnore
    public MetaModelDTO setUpdateDate(Timestamp val) {
        this._set(FIELD_UPDATEDATE, val);
        return this;
    }

    /**
     * 获取「最后修改时间」值
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
     * 判断 「最后修改时间」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUpdateDate() {
        return this._contains(FIELD_UPDATEDATE);
    }

    /**
     * 重置 「最后修改时间」
     *
    */
    @JsonIgnore
    public MetaModelDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }


}
