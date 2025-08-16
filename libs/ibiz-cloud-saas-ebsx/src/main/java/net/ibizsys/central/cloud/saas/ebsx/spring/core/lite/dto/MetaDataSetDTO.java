package net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 数据集
 * 
 * @see ibizmos:/psmodules/lite/psdataentities/META_DATASET/.ibizmodel.index
 */
public class MetaDataSetDTO extends EntityDTO {

  /**.
   * 标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_DATASET/psdefields/DATASETID/.ibizmodel.index
   */
  public final static String FIELD_DATASET_ID = "dataset_id";

  /**.
   * 名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_DATASET/psdefields/DATASETNAME/.ibizmodel.index
   */
  public final static String FIELD_DATASET_NAME = "dataset_name";

  /**.
   * 实体标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_DATASET/psdefields/ENTITYID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_DATASET/minorpsders/DER1N_META_DATASET_META_ENTITY_ENTITYID/.ibizmodel.index
   */
  public final static String FIELD_ENTITYID = "entityid";

  /**.
   * 实体
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_DATASET/psdefields/ENTITYNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_DATASET/minorpsders/DER1N_META_DATASET_META_ENTITY_ENTITYID/.ibizmodel.index
   */
  public final static String FIELD_ENTITYNAME = "entityname";

  /**.
   * 代码名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_DATASET/psdefields/CODENAME/.ibizmodel.index
   */
  public final static String FIELD_CODE_NAME = "code_name";

  /**.
   * 代码
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_DATASET/psdefields/DSCODE/.ibizmodel.index
   */
  public final static String FIELD_DS_CODE = "ds_code";

  /**.
   * 模型
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_DATASET/psdefields/DSMODEL/.ibizmodel.index
   */
  public final static String FIELD_DS_MODEL = "ds_model";


    /**
     * 设置「标识」
     *
     * @param val
    */
    @JsonIgnore
    public MetaDataSetDTO setDataset_id(String val) {
        this._set(FIELD_DATASET_ID, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
    */
    @JsonIgnore
    public String getDataset_id() {
        return (String) this._get(FIELD_DATASET_ID);
    }

    /**
     * 判断 「标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDataset_id() {
        return this._contains(FIELD_DATASET_ID);
    }

    /**
     * 重置 「标识」
     *
    */
    @JsonIgnore
    public MetaDataSetDTO resetDataset_id() {
        this._reset(FIELD_DATASET_ID);
        return this;
    }

    /**
     * 设置「名称」
     *
     * @param val
    */
    @JsonIgnore
    public MetaDataSetDTO setDataset_name(String val) {
        this._set(FIELD_DATASET_NAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
    */
    @JsonIgnore
    public String getDataset_name() {
        return (String) this._get(FIELD_DATASET_NAME);
    }

    /**
     * 判断 「名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDataset_name() {
        return this._contains(FIELD_DATASET_NAME);
    }

    /**
     * 重置 「名称」
     *
    */
    @JsonIgnore
    public MetaDataSetDTO resetDataset_name() {
        this._reset(FIELD_DATASET_NAME);
        return this;
    }

    /**
     * 设置「实体标识」
     *
     * @param val
    */
    @JsonIgnore
    public MetaDataSetDTO setEntityId(String val) {
        this._set(FIELD_ENTITYID, val);
        return this;
    }

    /**
     * 获取「实体标识」值
     *
    */
    @JsonIgnore
    public String getEntityId() {
        return (String) this._get(FIELD_ENTITYID);
    }

    /**
     * 判断 「实体标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEntityId() {
        return this._contains(FIELD_ENTITYID);
    }

    /**
     * 重置 「实体标识」
     *
    */
    @JsonIgnore
    public MetaDataSetDTO resetEntityId() {
        this._reset(FIELD_ENTITYID);
        return this;
    }

    /**
     * 设置「实体」
     *
     * @param val
    */
    @JsonIgnore
    public MetaDataSetDTO setEntityName(String val) {
        this._set(FIELD_ENTITYNAME, val);
        return this;
    }

    /**
     * 获取「实体」值
     *
    */
    @JsonIgnore
    public String getEntityName() {
        return (String) this._get(FIELD_ENTITYNAME);
    }

    /**
     * 判断 「实体」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEntityName() {
        return this._contains(FIELD_ENTITYNAME);
    }

    /**
     * 重置 「实体」
     *
    */
    @JsonIgnore
    public MetaDataSetDTO resetEntityName() {
        this._reset(FIELD_ENTITYNAME);
        return this;
    }

    /**
     * 设置「代码名称」
     *
     * @param val
    */
    @JsonIgnore
    public MetaDataSetDTO setCode_name(String val) {
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
    public MetaDataSetDTO resetCode_name() {
        this._reset(FIELD_CODE_NAME);
        return this;
    }

    /**
     * 设置「代码」
     *
     * @param val
    */
    @JsonIgnore
    public MetaDataSetDTO setDs_code(String val) {
        this._set(FIELD_DS_CODE, val);
        return this;
    }

    /**
     * 获取「代码」值
     *
    */
    @JsonIgnore
    public String getDs_code() {
        return (String) this._get(FIELD_DS_CODE);
    }

    /**
     * 判断 「代码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDs_code() {
        return this._contains(FIELD_DS_CODE);
    }

    /**
     * 重置 「代码」
     *
    */
    @JsonIgnore
    public MetaDataSetDTO resetDs_code() {
        this._reset(FIELD_DS_CODE);
        return this;
    }

    /**
     * 设置「模型」
     *
     * @param val
    */
    @JsonIgnore
    public MetaDataSetDTO setDs_model(String val) {
        this._set(FIELD_DS_MODEL, val);
        return this;
    }

    /**
     * 获取「模型」值
     *
    */
    @JsonIgnore
    public String getDs_model() {
        return (String) this._get(FIELD_DS_MODEL);
    }

    /**
     * 判断 「模型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDs_model() {
        return this._contains(FIELD_DS_MODEL);
    }

    /**
     * 重置 「模型」
     *
    */
    @JsonIgnore
    public MetaDataSetDTO resetDs_model() {
        this._reset(FIELD_DS_MODEL);
        return this;
    }


}
