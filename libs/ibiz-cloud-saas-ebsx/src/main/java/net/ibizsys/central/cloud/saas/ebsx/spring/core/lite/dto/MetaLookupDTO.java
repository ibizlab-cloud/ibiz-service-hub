package net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * lookup
 * 
 * @see ibizmos:/psmodules/lite/psdataentities/META_LOOKUP/.ibizmodel.index
 */
public class MetaLookupDTO extends EntityDTO {

  /**.
   * 标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_LOOKUP/psdefields/ID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 关系标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_LOOKUP/psdefields/RELATIONID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_LOOKUP/minorpsders/DER1N_META_LOOKUP_META_RELATION_RELATIONID/.ibizmodel.index
   */
  public final static String FIELD_RELATIONID = "relationid";

  /**.
   * 属性名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_LOOKUP/psdefields/FIELDNAME/.ibizmodel.index
   */
  public final static String FIELD_FIELDNAME = "fieldname";

  /**.
   * 引用属性名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_LOOKUP/psdefields/REFFIELDNAME/.ibizmodel.index
   */
  public final static String FIELD_REFFIELDNAME = "reffieldname";


    /**
     * 设置「标识」
     *
     * @param val
    */
    @JsonIgnore
    public MetaLookupDTO setId(String val) {
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
    public MetaLookupDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「关系标识」
     *
     * @param val
    */
    @JsonIgnore
    public MetaLookupDTO setRelationId(String val) {
        this._set(FIELD_RELATIONID, val);
        return this;
    }

    /**
     * 获取「关系标识」值
     *
    */
    @JsonIgnore
    public String getRelationId() {
        return (String) this._get(FIELD_RELATIONID);
    }

    /**
     * 判断 「关系标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRelationId() {
        return this._contains(FIELD_RELATIONID);
    }

    /**
     * 重置 「关系标识」
     *
    */
    @JsonIgnore
    public MetaLookupDTO resetRelationId() {
        this._reset(FIELD_RELATIONID);
        return this;
    }

    /**
     * 设置「属性名称」
     *
     * @param val
    */
    @JsonIgnore
    public MetaLookupDTO setFieldName(String val) {
        this._set(FIELD_FIELDNAME, val);
        return this;
    }

    /**
     * 获取「属性名称」值
     *
    */
    @JsonIgnore
    public String getFieldName() {
        return (String) this._get(FIELD_FIELDNAME);
    }

    /**
     * 判断 「属性名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsFieldName() {
        return this._contains(FIELD_FIELDNAME);
    }

    /**
     * 重置 「属性名称」
     *
    */
    @JsonIgnore
    public MetaLookupDTO resetFieldName() {
        this._reset(FIELD_FIELDNAME);
        return this;
    }

    /**
     * 设置「引用属性名称」
     *
     * @param val
    */
    @JsonIgnore
    public MetaLookupDTO setRefFieldName(String val) {
        this._set(FIELD_REFFIELDNAME, val);
        return this;
    }

    /**
     * 获取「引用属性名称」值
     *
    */
    @JsonIgnore
    public String getRefFieldName() {
        return (String) this._get(FIELD_REFFIELDNAME);
    }

    /**
     * 判断 「引用属性名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRefFieldName() {
        return this._contains(FIELD_REFFIELDNAME);
    }

    /**
     * 重置 「引用属性名称」
     *
    */
    @JsonIgnore
    public MetaLookupDTO resetRefFieldName() {
        this._reset(FIELD_REFFIELDNAME);
        return this;
    }


}
