package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 导入主题
 * @author lionlau
 *
 */
public class V2ImportSchema extends EntityBase{

	 /**
     * 属性: 导入模式标识
     */
    public final static String FIELD_ID="id";

    /**
     * 属性: 导入模式名称
     */
    public final static String FIELD_NAME="name";

    /**
     * 属性: 导入模式属性
     */
    public final static String FIELD_FIELDS="fields";

    /**
     * 属性: 导入模式类型
     */
    public final static String FIELD_TYPE="type";

    /**
     * 属性: 系统标记
     */
    public final static String FIELD_SYSTEM_TAG="system_tag";

    /**
     * 属性: 数据实体标记
     */
    public final static String FIELD_DATA_ENTITY_TAG="data_entity_tag";

    /**
     * 属性: 导入标记
     */
    public final static String FIELD_IMPORT_TAG="import_tag";

    /**
     * 属性: 导入模式标记
     */
    public final static String FIELD_SCHAME_TAG="schame_tag";

    /**
     * 属性: 排序值
     */
    public final static String FIELD_ORDER_VALUE="order_value";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_MAN="create_man";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE="create_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_UPDATE_MAN="update_man";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_UPDATE_DATE="update_date";

    /**
     * 设置「导入模式标识」
     * @param val
     */
    @JsonIgnore
    public V2ImportSchema setId(String val) {
        this.set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「导入模式标识」值
     *
     */
    @JsonIgnore
    public String getId() {
        return DataTypeUtils.asString(this.get(FIELD_ID), null);
    }

    /**
     * 判断 「导入模式标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsId() {
        return this.contains(FIELD_ID);
    }

    /**
     * 重置 「导入模式标识」
     *
     */
    @JsonIgnore
    public V2ImportSchema resetId() {
        this.reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「导入模式名称」
     * @param val
     */
    @JsonIgnore
    public V2ImportSchema setName(String val) {
        this.set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「导入模式名称」值
     *
     */
    @JsonIgnore
    public String getName() {
        return DataTypeUtils.asString(this.get(FIELD_NAME), null);
    }

    /**
     * 判断 「导入模式名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsName() {
        return this.contains(FIELD_NAME);
    }

    /**
     * 重置 「导入模式名称」
     *
     */
    @JsonIgnore
    public V2ImportSchema resetName() {
        this.reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「导入模式属性」
     * @param val
     */
    //@JsonIgnore
    @JsonProperty(FIELD_FIELDS)
    public V2ImportSchema setFields(List<V2ImportSchemaField> val) {
        this.set(FIELD_FIELDS, val);
        return this;
    }

    /**
     * 获取「导入模式属性」值
     *
     */
    @JsonIgnore
    public List<V2ImportSchemaField> getFields() {
        return (List<V2ImportSchemaField>) this.get(FIELD_FIELDS);
    }

    /**
     * 判断 「导入模式属性」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFields() {
        return this.contains(FIELD_FIELDS);
    }

    /**
     * 重置 「导入模式属性」
     *
     */
    @JsonIgnore
    public V2ImportSchema resetFields() {
        this.reset(FIELD_FIELDS);
        return this;
    }

    /**
     * 设置「导入模式类型」
     * 代码表[导入模式类型]
     * //@see net.ibizsys.central.cloud.saas.v2.core.runtime.dict.StaticDict.SchameType
     * @param val
     */
    @JsonIgnore
    public V2ImportSchema setType(String val) {
        this.set(FIELD_TYPE, val);
        return this;
    }

    /**
     * 获取「导入模式类型」值
     * 代码表[导入模式类型]
     * //@see net.ibizsys.central.cloud.saas.v2.core.runtime.dict.StaticDict.SchameType
     *
     */
    @JsonIgnore
    public String getType() {
        return DataTypeUtils.asString(this.get(FIELD_TYPE), null);
    }

    /**
     * 判断 「导入模式类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsType() {
        return this.contains(FIELD_TYPE);
    }

    /**
     * 重置 「导入模式类型」
     *
     */
    @JsonIgnore
    public V2ImportSchema resetType() {
        this.reset(FIELD_TYPE);
        return this;
    }

    /**
     * 设置「系统标记」
     * @param val
     */
    @JsonIgnore
    public V2ImportSchema setSystemTag(String val) {
        this.set(FIELD_SYSTEM_TAG, val);
        return this;
    }

    /**
     * 获取「系统标记」值
     *
     */
    @JsonIgnore
    public String getSystemTag() {
        return DataTypeUtils.asString(this.get(FIELD_SYSTEM_TAG), null);
    }

    /**
     * 判断 「系统标记」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSystemTag() {
        return this.contains(FIELD_SYSTEM_TAG);
    }

    /**
     * 重置 「系统标记」
     *
     */
    @JsonIgnore
    public V2ImportSchema resetSystemTag() {
        this.reset(FIELD_SYSTEM_TAG);
        return this;
    }

    /**
     * 设置「数据实体标记」
     * @param val
     */
    @JsonIgnore
    public V2ImportSchema setDataEntityTag(String val) {
        this.set(FIELD_DATA_ENTITY_TAG, val);
        return this;
    }

    /**
     * 获取「数据实体标记」值
     *
     */
    @JsonIgnore
    public String getDataEntityTag() {
        return DataTypeUtils.asString(this.get(FIELD_DATA_ENTITY_TAG), null);
    }

    /**
     * 判断 「数据实体标记」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDataEntityTag() {
        return this.contains(FIELD_DATA_ENTITY_TAG);
    }

    /**
     * 重置 「数据实体标记」
     *
     */
    @JsonIgnore
    public V2ImportSchema resetDataEntityTag() {
        this.reset(FIELD_DATA_ENTITY_TAG);
        return this;
    }

    /**
     * 设置「导入标记」
     * @param val
     */
    @JsonIgnore
    public V2ImportSchema setImportTag(String val) {
        this.set(FIELD_IMPORT_TAG, val);
        return this;
    }

    /**
     * 获取「导入标记」值
     *
     */
    @JsonIgnore
    public String getImportTag() {
        return DataTypeUtils.asString(this.get(FIELD_IMPORT_TAG), null);
    }

    /**
     * 判断 「导入标记」是否有值
     *
     */
    @JsonIgnore
    public boolean containsImportTag() {
        return this.contains(FIELD_IMPORT_TAG);
    }

    /**
     * 重置 「导入标记」
     *
     */
    @JsonIgnore
    public V2ImportSchema resetImportTag() {
        this.reset(FIELD_IMPORT_TAG);
        return this;
    }

    /**
     * 设置「导入模式标记」
     * @param val
     */
    @JsonIgnore
    public V2ImportSchema setSchameTag(String val) {
        this.set(FIELD_SCHAME_TAG, val);
        return this;
    }

    /**
     * 获取「导入模式标记」值
     *
     */
    @JsonIgnore
    public String getSchameTag() {
        return DataTypeUtils.asString(this.get(FIELD_SCHAME_TAG), null);
    }

    /**
     * 判断 「导入模式标记」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSchameTag() {
        return this.contains(FIELD_SCHAME_TAG);
    }

    /**
     * 重置 「导入模式标记」
     *
     */
    @JsonIgnore
    public V2ImportSchema resetSchameTag() {
        this.reset(FIELD_SCHAME_TAG);
        return this;
    }

    /**
     * 设置「排序值」
     * @param val
     */
    @JsonIgnore
    public V2ImportSchema setOrderValue(Integer val) {
        this.set(FIELD_ORDER_VALUE, val);
        return this;
    }

    /**
     * 获取「排序值」值
     *
     */
    @JsonIgnore
    public Integer getOrderValue() {
        return DataTypeUtils.asInteger(this.get(FIELD_ORDER_VALUE), null);
    }

    /**
     * 判断 「排序值」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOrderValue() {
        return this.contains(FIELD_ORDER_VALUE);
    }

    /**
     * 重置 「排序值」
     *
     */
    @JsonIgnore
    public V2ImportSchema resetOrderValue() {
        this.reset(FIELD_ORDER_VALUE);
        return this;
    }

    /**
     * 设置「建立人」
     * @param val
     */
    @JsonIgnore
    public V2ImportSchema setCreateMan(String val) {
        this.set(FIELD_CREATE_MAN, val);
        return this;
    }

    /**
     * 获取「建立人」值
     *
     */
    @JsonIgnore
    public String getCreateMan() {
        return DataTypeUtils.asString(this.get(FIELD_CREATE_MAN), null);
    }

    /**
     * 判断 「建立人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCreateMan() {
        return this.contains(FIELD_CREATE_MAN);
    }

    /**
     * 重置 「建立人」
     *
     */
    @JsonIgnore
    public V2ImportSchema resetCreateMan() {
        this.reset(FIELD_CREATE_MAN);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonIgnore
    public V2ImportSchema setCreateDate(Timestamp val) {
        this.set(FIELD_CREATE_DATE, val);
        return this;
    }

    /**
     * 获取「建立时间」值
     *
     */
    @JsonIgnore
    public Timestamp getCreateDate() {
        return DataTypeUtils.asDateTimeValue(this.get(FIELD_CREATE_DATE), null);
    }

    /**
     * 判断 「建立时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCreateDate() {
        return this.contains(FIELD_CREATE_DATE);
    }

    /**
     * 重置 「建立时间」
     *
     */
    @JsonIgnore
    public V2ImportSchema resetCreateDate() {
        this.reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * @param val
     */
    @JsonIgnore
    public V2ImportSchema setUpdateMan(String val) {
        this.set(FIELD_UPDATE_MAN, val);
        return this;
    }

    /**
     * 获取「更新人」值
     *
     */
    @JsonIgnore
    public String getUpdateMan() {
        return DataTypeUtils.asString(this.get(FIELD_UPDATE_MAN), null);
    }

    /**
     * 判断 「更新人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUpdateMan() {
        return this.contains(FIELD_UPDATE_MAN);
    }

    /**
     * 重置 「更新人」
     *
     */
    @JsonIgnore
    public V2ImportSchema resetUpdateMan() {
        this.reset(FIELD_UPDATE_MAN);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonIgnore
    public V2ImportSchema setUpdateDate(Timestamp val) {
        this.set(FIELD_UPDATE_DATE, val);
        return this;
    }

    /**
     * 获取「更新时间」值
     *
     */
    @JsonIgnore
    public Timestamp getUpdateDate() {
        return DataTypeUtils.asDateTimeValue(this.get(FIELD_UPDATE_DATE), null);
    }

    /**
     * 判断 「更新时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUpdateDate() {
        return this.contains(FIELD_UPDATE_DATE);
    }

    /**
     * 重置 「更新时间」
     *
     */
    @JsonIgnore
    public V2ImportSchema resetUpdateDate() {
        this.reset(FIELD_UPDATE_DATE);
        return this;
    }
}
