package net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto;

import java.sql.Timestamp;
import java.util.List;
import java.math.BigDecimal;

import net.ibizsys.central.util.EntityDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * 属性
 * 
 * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/.ibizmodel.index
 */
public class MetaFieldDTO extends EntityDTO {

  /**.
   * 属性标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/FIELDID/.ibizmodel.index
   */
  public final static String FIELD_FIELD_ID = "field_id";

  /**.
   * 属性名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/FIELDNAME/.ibizmodel.index
   */
  public final static String FIELD_FIELD_NAME = "field_name";

  /**.
   * 代码名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/CODENAME/.ibizmodel.index
   */
  public final static String FIELD_CODE_NAME = "code_name";

  /**.
   * 实体标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/ENTITYID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/minorpsders/DER1N_META_FIELD_META_ENTITY_ENTITYID/.ibizmodel.index
   */
  public final static String FIELD_ENTITYID = "entityid";

  /**.
   * 实体名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/ENTITYNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/minorpsders/DER1N_META_FIELD_META_ENTITY_ENTITYID/.ibizmodel.index
   */
  public final static String FIELD_ENTITYNAME = "entityname";

  /**.
   * 实体代码名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/ENTITYCODENAME/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/minorpsders/DER1N_META_FIELD_META_ENTITY_ENTITYID/.ibizmodel.index
   */
  public final static String FIELD_ENTITY_CODE_NAME = "entity_code_name";

  /**.
   * 系统
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/SYSTEMID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/minorpsders/DER1N_META_FIELD_META_ENTITY_ENTITYID/.ibizmodel.index
   */
  public final static String FIELD_SYSTEM_ID = "system_id";

  /**.
   * 属性逻辑名
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/FIELDLOGICNAME/.ibizmodel.index
   */
  public final static String FIELD_FIELD_LOGIC_NAME = "field_logic_name";

  /**.
   * 属性全路径名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/FIELDUNINAME/.ibizmodel.index
   */
  public final static String FIELD_FIELD_UNI_NAME = "field_uni_name";

  /**.
   * 显示名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/FIELDSHOWNAME/.ibizmodel.index
   */
  public final static String FIELD_FIELD_SHOW_NAME = "field_show_name";

  /**.
   * 引用属性标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/REFFIELDID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/minorpsders/DER1N_META_FIELD_META_FIELD_REFFIELDID/.ibizmodel.index
   */
  public final static String FIELD_REF_FIELD_ID = "ref_field_id";

  /**.
   * 引用属性名称
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/REFFIELDNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/minorpsders/DER1N_META_FIELD_META_FIELD_REFFIELDID/.ibizmodel.index
   */
  public final static String FIELD_REF_FIELD_NAME = "ref_field_name";

  /**.
   * 引用关系标识
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/RELATIONID/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/minorpsders/DER1N_META_FIELD_META_RELATION_RELATIONID/.ibizmodel.index
   */
  public final static String FIELD_RELATION_ID = "relation_id";

  /**.
   * 引用关系
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/RELATIONNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/minorpsders/DER1N_META_FIELD_META_RELATION_RELATIONID/.ibizmodel.index
   */
  public final static String FIELD_RELATION_NAME = "relation_name";

  /**.
   * 引用实体
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/REFENTITYNAME/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/minorpsders/DER1N_META_FIELD_META_RELATION_RELATIONID/.ibizmodel.index
   */
  public final static String FIELD_REFENTITYNAME = "refentityname";

  /**.
   * 关系代码
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/RELATIONCODENAME/.ibizmodel.index
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/minorpsders/DER1N_META_FIELD_META_RELATION_RELATIONID/.ibizmodel.index
   */
  public final static String FIELD_RELATION_CODE_NAME = "relation_code_name";

  /**.
   * 主键
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/KEYFIELD/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_KEY_FIELD = "key_field";

  /**.
   * 主信息
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/MAJORFIELD/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_MAJOR_FIELD = "major_field";

  /**.
   * 联合主键
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/UNIONKEY/.ibizmodel.index
   */
  public final static String FIELD_UNION_KEY = "union_key";

  /**.
   * 属性类型
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/FIELDTYPE/.ibizmodel.index
   */
  public final static String FIELD_FIELD_TYPE = "field_type";

  /**.
   * 预定义类型
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/PREDEFINED/.ibizmodel.index
   */
  public final static String FIELD_PREDEFINED = "predefined";

  /**.
   * 数据字典
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/DICT/.ibizmodel.index
   */
  public final static String FIELD_DICT = "dict";

  /**.
   * 允许为空
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/NULLABLE/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_NULLABLE = "nullable";

  /**.
   * 物理属性
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/PHYSICALFIELD/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_PHYSICAL_FIELD = "physical_field";

  /**.
   * 数据类型
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/DATATYPE/.ibizmodel.index
   */
  public final static String FIELD_DATA_TYPE = "data_type";

  /**.
   * 长度
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/DATALENGTH/.ibizmodel.index
   */
  public final static String FIELD_DATA_LENGTH = "data_length";

  /**.
   * 精度
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/DATAPRECI/.ibizmodel.index
   */
  public final static String FIELD_DATA_PRECI = "data_preci";

  /**.
   * 逻辑表达式
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/EXPRESSION/.ibizmodel.index
   */
  public final static String FIELD_EXPRESSION = "expression";

  /**.
   * 扩展属性
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/EXTENSIONFIELD/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_EXTENSION_FIELD = "extension_field";

  /**.
   * 审计
   * {@link net.ibizsys.central.cloud.saas.ebsx.spring.core.runtime.dict.StaticDict.YesNo} 
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/ISENABLEAUDIT/.ibizmodel.index
   * @see ibizmos:/psmodules/uaa/pscodelists/YesNo.ibizmodel.yaml
   */
  public final static String FIELD_IS_ENABLE_AUDIT = "is_enable_audit";

  /**.
   * 排序
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/SHOWORDER/.ibizmodel.index
   */
  public final static String FIELD_SHOW_ORDER = "show_order";

  /**.
   * 创建时间
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/CREATEDATE/.ibizmodel.index
   */
  public final static String FIELD_CREATEDATE = "createdate";

  /**.
   * 最后修改时间
   *
   * @see ibizmos:/psmodules/lite/psdataentities/META_FIELD/psdefields/UPDATEDATE/.ibizmodel.index
   */
  public final static String FIELD_UPDATEDATE = "updatedate";


    /**
     * 设置「属性标识」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setField_id(String val) {
        this._set(FIELD_FIELD_ID, val);
        return this;
    }

    /**
     * 获取「属性标识」值
     *
    */
    @JsonIgnore
    public String getField_id() {
        return (String) this._get(FIELD_FIELD_ID);
    }

    /**
     * 判断 「属性标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsField_id() {
        return this._contains(FIELD_FIELD_ID);
    }

    /**
     * 重置 「属性标识」
     *
    */
    @JsonIgnore
    public MetaFieldDTO resetField_id() {
        this._reset(FIELD_FIELD_ID);
        return this;
    }

    /**
     * 设置「属性名称」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setField_name(String val) {
        this._set(FIELD_FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「属性名称」值
     *
    */
    @JsonIgnore
    public String getField_name() {
        return (String) this._get(FIELD_FIELD_NAME);
    }

    /**
     * 判断 「属性名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsField_name() {
        return this._contains(FIELD_FIELD_NAME);
    }

    /**
     * 重置 「属性名称」
     *
    */
    @JsonIgnore
    public MetaFieldDTO resetField_name() {
        this._reset(FIELD_FIELD_NAME);
        return this;
    }

    /**
     * 设置「代码名称」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setCode_name(String val) {
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
    public MetaFieldDTO resetCode_name() {
        this._reset(FIELD_CODE_NAME);
        return this;
    }

    /**
     * 设置「实体标识」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setEntityId(String val) {
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
    public MetaFieldDTO resetEntityId() {
        this._reset(FIELD_ENTITYID);
        return this;
    }

    /**
     * 设置「实体名称」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setEntityName(String val) {
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
    public MetaFieldDTO resetEntityName() {
        this._reset(FIELD_ENTITYNAME);
        return this;
    }

    /**
     * 设置「实体代码名称」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setEntity_code_name(String val) {
        this._set(FIELD_ENTITY_CODE_NAME, val);
        return this;
    }

    /**
     * 获取「实体代码名称」值
     *
    */
    @JsonIgnore
    public String getEntity_code_name() {
        return (String) this._get(FIELD_ENTITY_CODE_NAME);
    }

    /**
     * 判断 「实体代码名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsEntity_code_name() {
        return this._contains(FIELD_ENTITY_CODE_NAME);
    }

    /**
     * 重置 「实体代码名称」
     *
    */
    @JsonIgnore
    public MetaFieldDTO resetEntity_code_name() {
        this._reset(FIELD_ENTITY_CODE_NAME);
        return this;
    }

    /**
     * 设置「系统」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setSystem_id(String val) {
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
    public MetaFieldDTO resetSystem_id() {
        this._reset(FIELD_SYSTEM_ID);
        return this;
    }

    /**
     * 设置「属性逻辑名」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setField_logic_name(String val) {
        this._set(FIELD_FIELD_LOGIC_NAME, val);
        return this;
    }

    /**
     * 获取「属性逻辑名」值
     *
    */
    @JsonIgnore
    public String getField_logic_name() {
        return (String) this._get(FIELD_FIELD_LOGIC_NAME);
    }

    /**
     * 判断 「属性逻辑名」是否有值
     *
    */
    @JsonIgnore
    public boolean containsField_logic_name() {
        return this._contains(FIELD_FIELD_LOGIC_NAME);
    }

    /**
     * 重置 「属性逻辑名」
     *
    */
    @JsonIgnore
    public MetaFieldDTO resetField_logic_name() {
        this._reset(FIELD_FIELD_LOGIC_NAME);
        return this;
    }

    /**
     * 设置「属性全路径名称」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setField_uni_name(String val) {
        this._set(FIELD_FIELD_UNI_NAME, val);
        return this;
    }

    /**
     * 获取「属性全路径名称」值
     *
    */
    @JsonIgnore
    public String getField_uni_name() {
        return (String) this._get(FIELD_FIELD_UNI_NAME);
    }

    /**
     * 判断 「属性全路径名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsField_uni_name() {
        return this._contains(FIELD_FIELD_UNI_NAME);
    }

    /**
     * 重置 「属性全路径名称」
     *
    */
    @JsonIgnore
    public MetaFieldDTO resetField_uni_name() {
        this._reset(FIELD_FIELD_UNI_NAME);
        return this;
    }

    /**
     * 设置「显示名称」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setField_show_name(String val) {
        this._set(FIELD_FIELD_SHOW_NAME, val);
        return this;
    }

    /**
     * 获取「显示名称」值
     *
    */
    @JsonIgnore
    public String getField_show_name() {
        return (String) this._get(FIELD_FIELD_SHOW_NAME);
    }

    /**
     * 判断 「显示名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsField_show_name() {
        return this._contains(FIELD_FIELD_SHOW_NAME);
    }

    /**
     * 重置 「显示名称」
     *
    */
    @JsonIgnore
    public MetaFieldDTO resetField_show_name() {
        this._reset(FIELD_FIELD_SHOW_NAME);
        return this;
    }

    /**
     * 设置「引用属性标识」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setRef_field_id(String val) {
        this._set(FIELD_REF_FIELD_ID, val);
        return this;
    }

    /**
     * 获取「引用属性标识」值
     *
    */
    @JsonIgnore
    public String getRef_field_id() {
        return (String) this._get(FIELD_REF_FIELD_ID);
    }

    /**
     * 判断 「引用属性标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRef_field_id() {
        return this._contains(FIELD_REF_FIELD_ID);
    }

    /**
     * 重置 「引用属性标识」
     *
    */
    @JsonIgnore
    public MetaFieldDTO resetRef_field_id() {
        this._reset(FIELD_REF_FIELD_ID);
        return this;
    }

    /**
     * 设置「引用属性名称」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setRef_field_name(String val) {
        this._set(FIELD_REF_FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「引用属性名称」值
     *
    */
    @JsonIgnore
    public String getRef_field_name() {
        return (String) this._get(FIELD_REF_FIELD_NAME);
    }

    /**
     * 判断 「引用属性名称」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRef_field_name() {
        return this._contains(FIELD_REF_FIELD_NAME);
    }

    /**
     * 重置 「引用属性名称」
     *
    */
    @JsonIgnore
    public MetaFieldDTO resetRef_field_name() {
        this._reset(FIELD_REF_FIELD_NAME);
        return this;
    }

    /**
     * 设置「引用关系标识」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setRelation_id(String val) {
        this._set(FIELD_RELATION_ID, val);
        return this;
    }

    /**
     * 获取「引用关系标识」值
     *
    */
    @JsonIgnore
    public String getRelation_id() {
        return (String) this._get(FIELD_RELATION_ID);
    }

    /**
     * 判断 「引用关系标识」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRelation_id() {
        return this._contains(FIELD_RELATION_ID);
    }

    /**
     * 重置 「引用关系标识」
     *
    */
    @JsonIgnore
    public MetaFieldDTO resetRelation_id() {
        this._reset(FIELD_RELATION_ID);
        return this;
    }

    /**
     * 设置「引用关系」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setRelation_name(String val) {
        this._set(FIELD_RELATION_NAME, val);
        return this;
    }

    /**
     * 获取「引用关系」值
     *
    */
    @JsonIgnore
    public String getRelation_name() {
        return (String) this._get(FIELD_RELATION_NAME);
    }

    /**
     * 判断 「引用关系」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRelation_name() {
        return this._contains(FIELD_RELATION_NAME);
    }

    /**
     * 重置 「引用关系」
     *
    */
    @JsonIgnore
    public MetaFieldDTO resetRelation_name() {
        this._reset(FIELD_RELATION_NAME);
        return this;
    }

    /**
     * 设置「引用实体」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setRefEntityName(String val) {
        this._set(FIELD_REFENTITYNAME, val);
        return this;
    }

    /**
     * 获取「引用实体」值
     *
    */
    @JsonIgnore
    public String getRefEntityName() {
        return (String) this._get(FIELD_REFENTITYNAME);
    }

    /**
     * 判断 「引用实体」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRefEntityName() {
        return this._contains(FIELD_REFENTITYNAME);
    }

    /**
     * 重置 「引用实体」
     *
    */
    @JsonIgnore
    public MetaFieldDTO resetRefEntityName() {
        this._reset(FIELD_REFENTITYNAME);
        return this;
    }

    /**
     * 设置「关系代码」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setRelation_code_name(String val) {
        this._set(FIELD_RELATION_CODE_NAME, val);
        return this;
    }

    /**
     * 获取「关系代码」值
     *
    */
    @JsonIgnore
    public String getRelation_code_name() {
        return (String) this._get(FIELD_RELATION_CODE_NAME);
    }

    /**
     * 判断 「关系代码」是否有值
     *
    */
    @JsonIgnore
    public boolean containsRelation_code_name() {
        return this._contains(FIELD_RELATION_CODE_NAME);
    }

    /**
     * 重置 「关系代码」
     *
    */
    @JsonIgnore
    public MetaFieldDTO resetRelation_code_name() {
        this._reset(FIELD_RELATION_CODE_NAME);
        return this;
    }

    /**
     * 设置「主键」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setKey_field(Integer val) {
        this._set(FIELD_KEY_FIELD, val);
        return this;
    }

    /**
     * 获取「主键」值
     *
    */
    @JsonIgnore
    public Integer getKey_field() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_KEY_FIELD),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「主键」是否有值
     *
    */
    @JsonIgnore
    public boolean containsKey_field() {
        return this._contains(FIELD_KEY_FIELD);
    }

    /**
     * 重置 「主键」
     *
    */
    @JsonIgnore
    public MetaFieldDTO resetKey_field() {
        this._reset(FIELD_KEY_FIELD);
        return this;
    }

    /**
     * 设置「主信息」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setMajor_field(Integer val) {
        this._set(FIELD_MAJOR_FIELD, val);
        return this;
    }

    /**
     * 获取「主信息」值
     *
    */
    @JsonIgnore
    public Integer getMajor_field() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_MAJOR_FIELD),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「主信息」是否有值
     *
    */
    @JsonIgnore
    public boolean containsMajor_field() {
        return this._contains(FIELD_MAJOR_FIELD);
    }

    /**
     * 重置 「主信息」
     *
    */
    @JsonIgnore
    public MetaFieldDTO resetMajor_field() {
        this._reset(FIELD_MAJOR_FIELD);
        return this;
    }

    /**
     * 设置「联合主键」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setUnion_key(String val) {
        this._set(FIELD_UNION_KEY, val);
        return this;
    }

    /**
     * 获取「联合主键」值
     *
    */
    @JsonIgnore
    public String getUnion_key() {
        return (String) this._get(FIELD_UNION_KEY);
    }

    /**
     * 判断 「联合主键」是否有值
     *
    */
    @JsonIgnore
    public boolean containsUnion_key() {
        return this._contains(FIELD_UNION_KEY);
    }

    /**
     * 重置 「联合主键」
     *
    */
    @JsonIgnore
    public MetaFieldDTO resetUnion_key() {
        this._reset(FIELD_UNION_KEY);
        return this;
    }

    /**
     * 设置「属性类型」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setField_type(String val) {
        this._set(FIELD_FIELD_TYPE, val);
        return this;
    }

    /**
     * 获取「属性类型」值
     *
    */
    @JsonIgnore
    public String getField_type() {
        return (String) this._get(FIELD_FIELD_TYPE);
    }

    /**
     * 判断 「属性类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsField_type() {
        return this._contains(FIELD_FIELD_TYPE);
    }

    /**
     * 重置 「属性类型」
     *
    */
    @JsonIgnore
    public MetaFieldDTO resetField_type() {
        this._reset(FIELD_FIELD_TYPE);
        return this;
    }

    /**
     * 设置「预定义类型」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setPredefined(String val) {
        this._set(FIELD_PREDEFINED, val);
        return this;
    }

    /**
     * 获取「预定义类型」值
     *
    */
    @JsonIgnore
    public String getPredefined() {
        return (String) this._get(FIELD_PREDEFINED);
    }

    /**
     * 判断 「预定义类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPredefined() {
        return this._contains(FIELD_PREDEFINED);
    }

    /**
     * 重置 「预定义类型」
     *
    */
    @JsonIgnore
    public MetaFieldDTO resetPredefined() {
        this._reset(FIELD_PREDEFINED);
        return this;
    }

    /**
     * 设置「数据字典」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setDict(String val) {
        this._set(FIELD_DICT, val);
        return this;
    }

    /**
     * 获取「数据字典」值
     *
    */
    @JsonIgnore
    public String getDict() {
        return (String) this._get(FIELD_DICT);
    }

    /**
     * 判断 「数据字典」是否有值
     *
    */
    @JsonIgnore
    public boolean containsDict() {
        return this._contains(FIELD_DICT);
    }

    /**
     * 重置 「数据字典」
     *
    */
    @JsonIgnore
    public MetaFieldDTO resetDict() {
        this._reset(FIELD_DICT);
        return this;
    }

    /**
     * 设置「允许为空」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setNullable(Integer val) {
        this._set(FIELD_NULLABLE, val);
        return this;
    }

    /**
     * 获取「允许为空」值
     *
    */
    @JsonIgnore
    public Integer getNullable() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_NULLABLE),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「允许为空」是否有值
     *
    */
    @JsonIgnore
    public boolean containsNullable() {
        return this._contains(FIELD_NULLABLE);
    }

    /**
     * 重置 「允许为空」
     *
    */
    @JsonIgnore
    public MetaFieldDTO resetNullable() {
        this._reset(FIELD_NULLABLE);
        return this;
    }

    /**
     * 设置「物理属性」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setPhysical_field(Integer val) {
        this._set(FIELD_PHYSICAL_FIELD, val);
        return this;
    }

    /**
     * 获取「物理属性」值
     *
    */
    @JsonIgnore
    public Integer getPhysical_field() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_PHYSICAL_FIELD),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「物理属性」是否有值
     *
    */
    @JsonIgnore
    public boolean containsPhysical_field() {
        return this._contains(FIELD_PHYSICAL_FIELD);
    }

    /**
     * 重置 「物理属性」
     *
    */
    @JsonIgnore
    public MetaFieldDTO resetPhysical_field() {
        this._reset(FIELD_PHYSICAL_FIELD);
        return this;
    }

    /**
     * 设置「数据类型」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setData_type(String val) {
        this._set(FIELD_DATA_TYPE, val);
        return this;
    }

    /**
     * 获取「数据类型」值
     *
    */
    @JsonIgnore
    public String getData_type() {
        return (String) this._get(FIELD_DATA_TYPE);
    }

    /**
     * 判断 「数据类型」是否有值
     *
    */
    @JsonIgnore
    public boolean containsData_type() {
        return this._contains(FIELD_DATA_TYPE);
    }

    /**
     * 重置 「数据类型」
     *
    */
    @JsonIgnore
    public MetaFieldDTO resetData_type() {
        this._reset(FIELD_DATA_TYPE);
        return this;
    }

    /**
     * 设置「长度」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setData_length(Integer val) {
        this._set(FIELD_DATA_LENGTH, val);
        return this;
    }

    /**
     * 获取「长度」值
     *
    */
    @JsonIgnore
    public Integer getData_length() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_DATA_LENGTH),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「长度」是否有值
     *
    */
    @JsonIgnore
    public boolean containsData_length() {
        return this._contains(FIELD_DATA_LENGTH);
    }

    /**
     * 重置 「长度」
     *
    */
    @JsonIgnore
    public MetaFieldDTO resetData_length() {
        this._reset(FIELD_DATA_LENGTH);
        return this;
    }

    /**
     * 设置「精度」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setData_preci(Integer val) {
        this._set(FIELD_DATA_PRECI, val);
        return this;
    }

    /**
     * 获取「精度」值
     *
    */
    @JsonIgnore
    public Integer getData_preci() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_DATA_PRECI),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「精度」是否有值
     *
    */
    @JsonIgnore
    public boolean containsData_preci() {
        return this._contains(FIELD_DATA_PRECI);
    }

    /**
     * 重置 「精度」
     *
    */
    @JsonIgnore
    public MetaFieldDTO resetData_preci() {
        this._reset(FIELD_DATA_PRECI);
        return this;
    }

    /**
     * 设置「逻辑表达式」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setExpression(String val) {
        this._set(FIELD_EXPRESSION, val);
        return this;
    }

    /**
     * 获取「逻辑表达式」值
     *
    */
    @JsonIgnore
    public String getExpression() {
        return (String) this._get(FIELD_EXPRESSION);
    }

    /**
     * 判断 「逻辑表达式」是否有值
     *
    */
    @JsonIgnore
    public boolean containsExpression() {
        return this._contains(FIELD_EXPRESSION);
    }

    /**
     * 重置 「逻辑表达式」
     *
    */
    @JsonIgnore
    public MetaFieldDTO resetExpression() {
        this._reset(FIELD_EXPRESSION);
        return this;
    }

    /**
     * 设置「扩展属性」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setExtension_field(Integer val) {
        this._set(FIELD_EXTENSION_FIELD, val);
        return this;
    }

    /**
     * 获取「扩展属性」值
     *
    */
    @JsonIgnore
    public Integer getExtension_field() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_EXTENSION_FIELD),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「扩展属性」是否有值
     *
    */
    @JsonIgnore
    public boolean containsExtension_field() {
        return this._contains(FIELD_EXTENSION_FIELD);
    }

    /**
     * 重置 「扩展属性」
     *
    */
    @JsonIgnore
    public MetaFieldDTO resetExtension_field() {
        this._reset(FIELD_EXTENSION_FIELD);
        return this;
    }

    /**
     * 设置「审计」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setIs_enable_audit(Integer val) {
        this._set(FIELD_IS_ENABLE_AUDIT, val);
        return this;
    }

    /**
     * 获取「审计」值
     *
    */
    @JsonIgnore
    public Integer getIs_enable_audit() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_IS_ENABLE_AUDIT),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「审计」是否有值
     *
    */
    @JsonIgnore
    public boolean containsIs_enable_audit() {
        return this._contains(FIELD_IS_ENABLE_AUDIT);
    }

    /**
     * 重置 「审计」
     *
    */
    @JsonIgnore
    public MetaFieldDTO resetIs_enable_audit() {
        this._reset(FIELD_IS_ENABLE_AUDIT);
        return this;
    }

    /**
     * 设置「排序」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setShow_order(Integer val) {
        this._set(FIELD_SHOW_ORDER, val);
        return this;
    }

    /**
     * 获取「排序」值
     *
    */
    @JsonIgnore
    public Integer getShow_order() {
        try{
            return DataTypeUtils.getIntegerValue(this._get(FIELD_SHOW_ORDER),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「排序」是否有值
     *
    */
    @JsonIgnore
    public boolean containsShow_order() {
        return this._contains(FIELD_SHOW_ORDER);
    }

    /**
     * 重置 「排序」
     *
    */
    @JsonIgnore
    public MetaFieldDTO resetShow_order() {
        this._reset(FIELD_SHOW_ORDER);
        return this;
    }

    /**
     * 设置「创建时间」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setCreateDate(Timestamp val) {
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
    public MetaFieldDTO resetCreateDate() {
        this._reset(FIELD_CREATEDATE);
        return this;
    }

    /**
     * 设置「最后修改时间」
     *
     * @param val
    */
    @JsonIgnore
    public MetaFieldDTO setUpdateDate(Timestamp val) {
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
    public MetaFieldDTO resetUpdateDate() {
        this._reset(FIELD_UPDATEDATE);
        return this;
    }


}
