package net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 实体关系
 * 
 * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/.ibizmodel.index
 */
public class MetaRelationshipDTO extends EntityDTO {

  /**.
   * 关系标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/psdefields/RELATIONID/.ibizmodel.index
   */
  public final static String FIELD_ID = "id";

  /**.
   * 关系名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/psdefields/RELATIONNAME/.ibizmodel.index
   */
  public final static String FIELD_NAME = "name";

  /**.
   * 类型
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/psdefields/RELTYPE/.ibizmodel.index
   */
  public final static String FIELD_RELATION_TYPE = "relation_type";

  /**.
   * 代码名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/psdefields/CODENAME/.ibizmodel.index
   */
  public final static String FIELD_CODE_NAME = "code_name";

  /**.
   * 实体标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/psdefields/ENTITYID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/minorpsders/DER1N_META_RELATION_META_ENTITY_ENTITYID/.ibizmodel.index
   */
  public final static String FIELD_ENTITYID = "entityid";

  /**.
   * 实体名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/psdefields/ENTITYNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/minorpsders/DER1N_META_RELATION_META_ENTITY_ENTITYID/.ibizmodel.index
   */
  public final static String FIELD_ENTITYNAME = "entityname";

  /**.
   * 引用实体标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/psdefields/REFENTITYID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/minorpsders/DER1N_META_RELATION_META_ENTITY_REFENTITYID/.ibizmodel.index
   */
  public final static String FIELD_REFENTITYID = "refentityid";

  /**.
   * 引用实体名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/psdefields/REFENTITYNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/minorpsders/DER1N_META_RELATION_META_ENTITY_REFENTITYID/.ibizmodel.index
   */
  public final static String FIELD_REFENTITYNAME = "refentityname";

  /**.
   * 嵌套代码名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/psdefields/NESTEDNAME/.ibizmodel.index
   */
  public final static String FIELD_NESTED_NAME = "nested_name";

  /**.
   * 系统
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/psdefields/SYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/minorpsders/DER1N_META_RELATION_META_ENTITY_ENTITYID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEM_ID = "system_id";

  /**.
   * Lookup
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/psdefields/LOOKUP/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_LOOKUP/minorpsders/DER1N_META_LOOKUP_META_RELATION_RELATIONID/.ibizmodel.index
   */
  public final static String FIELD_LOOKUPS = "lookups";

  /**.
   * 创建时间
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 最后修改时间
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_RELATION/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";


    /**
     * 设置「关系标识」
     *
     * @param val
    */
    @JsonIgnore
    public MetaRelationshipDTO setId(String val) {
        this._set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「关系标识」值
     *
    */
    @JsonIgnore
    public String getId() {
        return (String) this._get(FIELD_ID);
    }

    /**
     * 判断 「关系标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsId() {
        return this._contains(FIELD_ID);
    }

    /**
     * 重置 「关系标识」
     *
    */
    @JsonIgnore
    public MetaRelationshipDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「关系名称」
     *
     * @param val
    */
    @JsonIgnore
    public MetaRelationshipDTO setName(String val) {
        this._set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「关系名称」值
     *
    */
    @JsonIgnore
    public String getName() {
        return (String) this._get(FIELD_NAME);
    }

    /**
     * 判断 「关系名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsName() {
        return this._contains(FIELD_NAME);
    }

    /**
     * 重置 「关系名称」
     *
    */
    @JsonIgnore
    public MetaRelationshipDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「类型」
     *
     * @param val
    */
    @JsonIgnore
    public MetaRelationshipDTO setRelation_type(String val) {
        this._set(FIELD_RELATION_TYPE, val);
        return this;
    }

    /**
     * 获取「类型」值
     *
    */
    @JsonIgnore
    public String getRelation_type() {
        return (String) this._get(FIELD_RELATION_TYPE);
    }

    /**
     * 判断 「类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRelation_type() {
        return this._contains(FIELD_RELATION_TYPE);
    }

    /**
     * 重置 「类型」
     *
    */
    @JsonIgnore
    public MetaRelationshipDTO resetRelation_type() {
        this._reset(FIELD_RELATION_TYPE);
        return this;
    }

    /**
     * 设置「代码名称」
     *
     * @param val
    */
    @JsonIgnore
    public MetaRelationshipDTO setCode_name(String val) {
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
    public MetaRelationshipDTO resetCode_name() {
        this._reset(FIELD_CODE_NAME);
        return this;
    }

    /**
     * 设置「实体标识」
     *
     * @param val
    */
    @JsonIgnore
    public MetaRelationshipDTO setEntityId(String val) {
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
    public MetaRelationshipDTO resetEntityId() {
        this._reset(FIELD_ENTITYID);
        return this;
    }

    /**
     * 设置「实体名称」
     *
     * @param val
    */
    @JsonIgnore
    public MetaRelationshipDTO setEntityName(String val) {
        this._set(FIELD_ENTITYNAME, val);
        return this;
    }

    /**
     * 获取「实体名称」值
     *
    */
    @JsonIgnore
    public String getEntityName() {
        return (String) this._get(FIELD_ENTITYNAME);
    }

    /**
     * 判断 「实体名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEntityName() {
        return this._contains(FIELD_ENTITYNAME);
    }

    /**
     * 重置 「实体名称」
     *
    */
    @JsonIgnore
    public MetaRelationshipDTO resetEntityName() {
        this._reset(FIELD_ENTITYNAME);
        return this;
    }

    /**
     * 设置「引用实体标识」
     *
     * @param val
    */
    @JsonIgnore
    public MetaRelationshipDTO setRefEntityId(String val) {
        this._set(FIELD_REFENTITYID, val);
        return this;
    }

    /**
     * 获取「引用实体标识」值
     *
    */
    @JsonIgnore
    public String getRefEntityId() {
        return (String) this._get(FIELD_REFENTITYID);
    }

    /**
     * 判断 「引用实体标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRefEntityId() {
        return this._contains(FIELD_REFENTITYID);
    }

    /**
     * 重置 「引用实体标识」
     *
    */
    @JsonIgnore
    public MetaRelationshipDTO resetRefEntityId() {
        this._reset(FIELD_REFENTITYID);
        return this;
    }

    /**
     * 设置「引用实体名称」
     *
     * @param val
    */
    @JsonIgnore
    public MetaRelationshipDTO setRefEntityName(String val) {
        this._set(FIELD_REFENTITYNAME, val);
        return this;
    }

    /**
     * 获取「引用实体名称」值
     *
    */
    @JsonIgnore
    public String getRefEntityName() {
        return (String) this._get(FIELD_REFENTITYNAME);
    }

    /**
     * 判断 「引用实体名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRefEntityName() {
        return this._contains(FIELD_REFENTITYNAME);
    }

    /**
     * 重置 「引用实体名称」
     *
    */
    @JsonIgnore
    public MetaRelationshipDTO resetRefEntityName() {
        this._reset(FIELD_REFENTITYNAME);
        return this;
    }

    /**
     * 设置「嵌套代码名称」
     *
     * @param val
    */
    @JsonIgnore
    public MetaRelationshipDTO setNested_name(String val) {
        this._set(FIELD_NESTED_NAME, val);
        return this;
    }

    /**
     * 获取「嵌套代码名称」值
     *
    */
    @JsonIgnore
    public String getNested_name() {
        return (String) this._get(FIELD_NESTED_NAME);
    }

    /**
     * 判断 「嵌套代码名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsNested_name() {
        return this._contains(FIELD_NESTED_NAME);
    }

    /**
     * 重置 「嵌套代码名称」
     *
    */
    @JsonIgnore
    public MetaRelationshipDTO resetNested_name() {
        this._reset(FIELD_NESTED_NAME);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public MetaRelationshipDTO setSystem_id(String val) {
        this._set(FIELD_SYSTEM_ID, val);
        return this;
    }

    /**
     * 获取「系统」值
     *
    */
    @JsonIgnore
    public String getSystem_id() {
        return (String) this._get(FIELD_SYSTEM_ID);
    }

    /**
     * 判断 「系统」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSystem_id() {
        return this._contains(FIELD_SYSTEM_ID);
    }

    /**
     * 重置 「系统」
     *
    */
    @JsonIgnore
    public MetaRelationshipDTO resetSystem_id() {
        this._reset(FIELD_SYSTEM_ID);
        return this;
    }

    /**
     * 设置「Lookup」
     *
     * @param val
    */
    @JsonIgnore
    public MetaRelationshipDTO setLookups(List<net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.MetaLookupDTO> val) {
        this._set(FIELD_LOOKUPS, val);
        return this;
    }

    /**
     * 获取「Lookup」值
     *
    */
    @JsonIgnore
    public List<net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.MetaLookupDTO> getLookups() {
        return (List<net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.MetaLookupDTO>) this._get(FIELD_LOOKUPS);
    }

    /**
     * 判断 「Lookup」是否有值
     *
    */
    @JsonIgnore
    public boolean containsLookups() {
        return this._contains(FIELD_LOOKUPS);
    }

    /**
     * 重置 「Lookup」
     *
    */
    @JsonIgnore
    public MetaRelationshipDTO resetLookups() {
        this._reset(FIELD_LOOKUPS);
        return this;
    }

    /**
     * 设置「创建时间」
     *
     * @param val
    */
    @JsonIgnore
    public MetaRelationshipDTO setCreateDate(Timestamp val) {
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
    public MetaRelationshipDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「最后修改时间」
     *
     * @param val
    */
    @JsonIgnore
    public MetaRelationshipDTO setUpdateDate(Timestamp val) {
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
    public MetaRelationshipDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }


}
