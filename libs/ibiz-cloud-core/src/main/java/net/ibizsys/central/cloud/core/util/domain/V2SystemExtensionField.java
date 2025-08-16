package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

public class V2SystemExtensionField extends EntityBase{

    /**
     * 属性: 扩展标识
     */
    public final static String FIELD_SYSTEM_EXTENSION_ID="system_extension_id";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_MAN="create_man";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_TIME="create_time";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID="id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME="name";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_UPDATE_MAN="update_man";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_UPDATE_TIME="update_time";

    /**
     * 属性: 系统标记
     */
    public final static String FIELD_SYSTEM_TAG="system_tag";

    /**
     * 属性: 数据实体标记
     */
    public final static String FIELD_DATA_ENTITY_TAG="data_entity_tag";

    /**
     * 属性: 属性标记
     */
    public final static String FIELD_FIELD_TAG="field_tag";

    /**
     * 属性: 排序值
     */
    public final static String FIELD_ORDER_VALUE="order_value";

    /**
     * 属性: 扩展标记
     */
    public final static String FIELD_EXTENSION_TAG="extension_tag";

    /**
     * 属性: 扩展标记2
     */
    public final static String FIELD_EXTENSION_TAG2="extension_tag2";

    /**
     * 属性: 扩展标记3
     */
    public final static String FIELD_EXTENSION_TAG3="extension_tag3";

    /**
     * 属性: 扩展标记4
     */
    public final static String FIELD_EXTENSION_TAG4="extension_tag4";

    /**
     * 属性: 扩展模型
     */
    public final static String FIELD_EXTENSION_MODEL="extension_model";

    /**
     * 属性: 扩展作用范围类型
     */
    public final static String FIELD_SCOPE_TYPE="scope_type";

    /**
     * 属性: 范围标记
     */
    public final static String FIELD_SCOPE_TAG="scope_tag";

    /**
     * 属性: 范围标记2
     */
    public final static String FIELD_SCOPE_TAG2="scope_tag2";

    /**
     * 属性: 范围标记3
     */
    public final static String FIELD_SCOPE_TAG3="scope_tag3";

    /**
     * 属性: 范围标记4
     */
    public final static String FIELD_SCOPE_TAG4="scope_tag4";
    
    /**
     * 属性: 待定扩展模型
     */
    public final static String FIELD_PENDING_EXTENSION_MODEL="pending_extension_model";

    /**
     * 属性: 运行时模型
     */
    public final static String FIELD_RUNTIME_MODEL="runtime_model";
    
    /**
     * 属性: 已应用
     */
    public final static String FIELD_APPLY_FLAG = "apply_flag";
    
    /**
     * 属性: 应用信息
     */
    public final static String FIELD_APPLY_INFO = "apply_info";
    
    /**
     * 设置「扩展标识」
     * @param val
     */
    @JsonProperty(FIELD_SYSTEM_EXTENSION_ID)
    public V2SystemExtensionField setSystemExtensionId(String val) {
        this.set(FIELD_SYSTEM_EXTENSION_ID, val);
        return this;
    }

    /**
     * 获取「扩展标识」值
     *
     */
    @JsonIgnore
    public String getSystemExtensionId() {
        return DataTypeUtils.asString(this.get(FIELD_SYSTEM_EXTENSION_ID), null);
    }

    /**
     * 判断 「扩展标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSystemExtensionId() {
        return this.contains(FIELD_SYSTEM_EXTENSION_ID);
    }

    /**
     * 重置 「扩展标识」
     *
     */
    @JsonIgnore
    public V2SystemExtensionField resetSystemExtensionId() {
        this.reset(FIELD_SYSTEM_EXTENSION_ID);
        return this;
    }

    /**
     * 设置「建立人」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_MAN)
    public V2SystemExtensionField setCreateMan(String val) {
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
    public V2SystemExtensionField resetCreateMan() {
        this.reset(FIELD_CREATE_MAN);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_TIME)
    public V2SystemExtensionField setCreateTime(Timestamp val) {
        this.set(FIELD_CREATE_TIME, val);
        return this;
    }

    /**
     * 获取「建立时间」值
     *
     */
    @JsonIgnore
    public Timestamp getCreateTime() {
        return DataTypeUtils.asDateTimeValue(this.get(FIELD_CREATE_TIME), null);
    }

    /**
     * 判断 「建立时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCreateTime() {
        return this.contains(FIELD_CREATE_TIME);
    }

    /**
     * 重置 「建立时间」
     *
     */
    @JsonIgnore
    public V2SystemExtensionField resetCreateTime() {
        this.reset(FIELD_CREATE_TIME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public V2SystemExtensionField setId(String val) {
        this.set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
     */
    @JsonIgnore
    public String getId() {
        return DataTypeUtils.asString(this.get(FIELD_ID), null);
    }

    /**
     * 判断 「标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsId() {
        return this.contains(FIELD_ID);
    }

    /**
     * 重置 「标识」
     *
     */
    @JsonIgnore
    public V2SystemExtensionField resetId() {
        this.reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public V2SystemExtensionField setName(String val) {
        this.set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
     */
    @JsonIgnore
    public String getName() {
        return DataTypeUtils.asString(this.get(FIELD_NAME), null);
    }

    /**
     * 判断 「名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsName() {
        return this.contains(FIELD_NAME);
    }

    /**
     * 重置 「名称」
     *
     */
    @JsonIgnore
    public V2SystemExtensionField resetName() {
        this.reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「更新人」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_MAN)
    public V2SystemExtensionField setUpdateMan(String val) {
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
    public V2SystemExtensionField resetUpdateMan() {
        this.reset(FIELD_UPDATE_MAN);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_TIME)
    public V2SystemExtensionField setUpdateTime(Timestamp val) {
        this.set(FIELD_UPDATE_TIME, val);
        return this;
    }

    /**
     * 获取「更新时间」值
     *
     */
    @JsonIgnore
    public Timestamp getUpdateTime() {
        return DataTypeUtils.asDateTimeValue(this.get(FIELD_UPDATE_TIME), null);
    }

    /**
     * 判断 「更新时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUpdateTime() {
        return this.contains(FIELD_UPDATE_TIME);
    }

    /**
     * 重置 「更新时间」
     *
     */
    @JsonIgnore
    public V2SystemExtensionField resetUpdateTime() {
        this.reset(FIELD_UPDATE_TIME);
        return this;
    }

    /**
     * 设置「系统标记」
     * @param val
     */
    @JsonProperty(FIELD_SYSTEM_TAG)
    public V2SystemExtensionField setSystemTag(String val) {
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
    public V2SystemExtensionField resetSystemTag() {
        this.reset(FIELD_SYSTEM_TAG);
        return this;
    }

    /**
     * 设置「数据实体标记」
     * @param val
     */
    @JsonProperty(FIELD_DATA_ENTITY_TAG)
    public V2SystemExtensionField setDataEntityTag(String val) {
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
    public V2SystemExtensionField resetDataEntityTag() {
        this.reset(FIELD_DATA_ENTITY_TAG);
        return this;
    }

    /**
     * 设置「属性标记」
     * @param val
     */
    @JsonProperty(FIELD_FIELD_TAG)
    public V2SystemExtensionField setFieldTag(String val) {
        this.set(FIELD_FIELD_TAG, val);
        return this;
    }

    /**
     * 获取「属性标记」值
     *
     */
    @JsonIgnore
    public String getFieldTag() {
        return DataTypeUtils.asString(this.get(FIELD_FIELD_TAG), null);
    }

    /**
     * 判断 「属性标记」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFieldTag() {
        return this.contains(FIELD_FIELD_TAG);
    }

    /**
     * 重置 「属性标记」
     *
     */
    @JsonIgnore
    public V2SystemExtensionField resetFieldTag() {
        this.reset(FIELD_FIELD_TAG);
        return this;
    }

    /**
     * 设置「排序值」
     * @param val
     */
    @JsonProperty(FIELD_ORDER_VALUE)
    public V2SystemExtensionField setOrderValue(Integer val) {
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
    public V2SystemExtensionField resetOrderValue() {
        this.reset(FIELD_ORDER_VALUE);
        return this;
    }

    /**
     * 设置「扩展标记」
     * @param val
     */
    @JsonProperty(FIELD_EXTENSION_TAG)
    public V2SystemExtensionField setExtensionTag(String val) {
        this.set(FIELD_EXTENSION_TAG, val);
        return this;
    }

    /**
     * 获取「扩展标记」值
     *
     */
    @JsonIgnore
    public String getExtensionTag() {
        return DataTypeUtils.asString(this.get(FIELD_EXTENSION_TAG), null);
    }

    /**
     * 判断 「扩展标记」是否有值
     *
     */
    @JsonIgnore
    public boolean containsExtensionTag() {
        return this.contains(FIELD_EXTENSION_TAG);
    }

    /**
     * 重置 「扩展标记」
     *
     */
    @JsonIgnore
    public V2SystemExtensionField resetExtensionTag() {
        this.reset(FIELD_EXTENSION_TAG);
        return this;
    }

    /**
     * 设置「扩展标记2」
     * @param val
     */
    @JsonProperty(FIELD_EXTENSION_TAG2)
    public V2SystemExtensionField setExtensionTag2(String val) {
        this.set(FIELD_EXTENSION_TAG2, val);
        return this;
    }

    /**
     * 获取「扩展标记2」值
     *
     */
    @JsonIgnore
    public String getExtensionTag2() {
        return DataTypeUtils.asString(this.get(FIELD_EXTENSION_TAG2), null);
    }

    /**
     * 判断 「扩展标记2」是否有值
     *
     */
    @JsonIgnore
    public boolean containsExtensionTag2() {
        return this.contains(FIELD_EXTENSION_TAG2);
    }

    /**
     * 重置 「扩展标记2」
     *
     */
    @JsonIgnore
    public V2SystemExtensionField resetExtensionTag2() {
        this.reset(FIELD_EXTENSION_TAG2);
        return this;
    }

    /**
     * 设置「扩展标记3」
     * @param val
     */
    @JsonProperty(FIELD_EXTENSION_TAG3)
    public V2SystemExtensionField setExtensionTag3(String val) {
        this.set(FIELD_EXTENSION_TAG3, val);
        return this;
    }

    /**
     * 获取「扩展标记3」值
     *
     */
    @JsonIgnore
    public String getExtensionTag3() {
        return DataTypeUtils.asString(this.get(FIELD_EXTENSION_TAG3), null);
    }

    /**
     * 判断 「扩展标记3」是否有值
     *
     */
    @JsonIgnore
    public boolean containsExtensionTag3() {
        return this.contains(FIELD_EXTENSION_TAG3);
    }

    /**
     * 重置 「扩展标记3」
     *
     */
    @JsonIgnore
    public V2SystemExtensionField resetExtensionTag3() {
        this.reset(FIELD_EXTENSION_TAG3);
        return this;
    }

    /**
     * 设置「扩展标记4」
     * @param val
     */
    @JsonProperty(FIELD_EXTENSION_TAG4)
    public V2SystemExtensionField setExtensionTag4(String val) {
        this.set(FIELD_EXTENSION_TAG4, val);
        return this;
    }

    /**
     * 获取「扩展标记4」值
     *
     */
    @JsonIgnore
    public String getExtensionTag4() {
        return DataTypeUtils.asString(this.get(FIELD_EXTENSION_TAG4), null);
    }

    /**
     * 判断 「扩展标记4」是否有值
     *
     */
    @JsonIgnore
    public boolean containsExtensionTag4() {
        return this.contains(FIELD_EXTENSION_TAG4);
    }

    /**
     * 重置 「扩展标记4」
     *
     */
    @JsonIgnore
    public V2SystemExtensionField resetExtensionTag4() {
        this.reset(FIELD_EXTENSION_TAG4);
        return this;
    }

    /**
     * 设置「扩展模型」
     * @param val
     */
    @JsonProperty(FIELD_EXTENSION_MODEL)
    public V2SystemExtensionField setExtensionModel(String val) {
        this.set(FIELD_EXTENSION_MODEL, val);
        return this;
    }

    /**
     * 获取「扩展模型」值
     *
     */
    @JsonIgnore
    public String getExtensionModel() {
        return DataTypeUtils.asString(this.get(FIELD_EXTENSION_MODEL), null);
    }

    /**
     * 判断 「扩展模型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsExtensionModel() {
        return this.contains(FIELD_EXTENSION_MODEL);
    }

    /**
     * 重置 「扩展模型」
     *
     */
    @JsonIgnore
    public V2SystemExtensionField resetExtensionModel() {
        this.reset(FIELD_EXTENSION_MODEL);
        return this;
    }

    /**
     * 设置「待定扩展模型」
     * @param val
     */
    @JsonProperty(FIELD_PENDING_EXTENSION_MODEL)
    public V2SystemExtensionField setPendingExtensionModel(String val) {
        this.set(FIELD_PENDING_EXTENSION_MODEL, val);
        return this;
    }

    /**
     * 获取「待定扩展模型」值
     *
     */
    @JsonIgnore
    public String getPendingExtensionModel() {
        return DataTypeUtils.asString(this.get(FIELD_PENDING_EXTENSION_MODEL), null);
    }

    /**
     * 判断 「待定扩展模型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPendingExtensionModel() {
        return this.contains(FIELD_PENDING_EXTENSION_MODEL);
    }

    /**
     * 重置 「待定扩展模型」
     *
     */
    @JsonIgnore
    public V2SystemExtensionField resetPendingExtensionModel() {
        this.reset(FIELD_PENDING_EXTENSION_MODEL);
        return this;
    }

    /**
     * 设置「运行时模型」
     * @param val
     */
    @JsonProperty(FIELD_RUNTIME_MODEL)
    public V2SystemExtensionField setRuntimeModel(String val) {
        this.set(FIELD_RUNTIME_MODEL, val);
        return this;
    }

    /**
     * 获取「运行时模型」值
     *
     */
    @JsonIgnore
    public String getRuntimeModel() {
        return DataTypeUtils.asString(this.get(FIELD_RUNTIME_MODEL), null);
    }

    /**
     * 判断 「运行时模型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRuntimeModel() {
        return this.contains(FIELD_RUNTIME_MODEL);
    }

    /**
     * 重置 「运行时模型」
     *
     */
    @JsonIgnore
    public V2SystemExtensionField resetRuntimeModel() {
        this.reset(FIELD_RUNTIME_MODEL);
        return this;
    }

    /**
     * 设置「扩展作用范围类型」
     * 代码表[系统扩展归属类型]
     * //@see net.ibizsys.central.cloud.saas.v2.core.runtime.dict.StaticDict.system_extension_scope_type
     * @param val
     */
    @JsonProperty(FIELD_SCOPE_TYPE)
    public V2SystemExtensionField setScopeType(String val) {
        this.set(FIELD_SCOPE_TYPE, val);
        return this;
    }

    /**
     * 获取「扩展作用范围类型」值
     * 代码表[系统扩展归属类型]
     * //@see net.ibizsys.central.cloud.saas.v2.core.runtime.dict.StaticDict.system_extension_scope_type
     *
     */
    @JsonIgnore
    public String getScopeType() {
        return DataTypeUtils.asString(this.get(FIELD_SCOPE_TYPE), null);
    }

    /**
     * 判断 「扩展作用范围类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsScopeType() {
        return this.contains(FIELD_SCOPE_TYPE);
    }

    /**
     * 重置 「扩展作用范围类型」
     *
     */
    @JsonIgnore
    public V2SystemExtensionField resetScopeType() {
        this.reset(FIELD_SCOPE_TYPE);
        return this;
    }

    /**
     * 设置「范围标记」
     * @param val
     */
    @JsonProperty(FIELD_SCOPE_TAG)
    public V2SystemExtensionField setScopeTag(String val) {
        this.set(FIELD_SCOPE_TAG, val);
        return this;
    }

    /**
     * 获取「范围标记」值
     *
     */
    @JsonIgnore
    public String getScopeTag() {
        return DataTypeUtils.asString(this.get(FIELD_SCOPE_TAG), null);
    }

    /**
     * 判断 「范围标记」是否有值
     *
     */
    @JsonIgnore
    public boolean containsScopeTag() {
        return this.contains(FIELD_SCOPE_TAG);
    }

    /**
     * 重置 「范围标记」
     *
     */
    @JsonIgnore
    public V2SystemExtensionField resetScopeTag() {
        this.reset(FIELD_SCOPE_TAG);
        return this;
    }

    /**
     * 设置「范围标记2」
     * @param val
     */
    @JsonProperty(FIELD_SCOPE_TAG2)
    public V2SystemExtensionField setScopeTag2(String val) {
        this.set(FIELD_SCOPE_TAG2, val);
        return this;
    }

    /**
     * 获取「范围标记2」值
     *
     */
    @JsonIgnore
    public String getScopeTag2() {
        return DataTypeUtils.asString(this.get(FIELD_SCOPE_TAG2), null);
    }

    /**
     * 判断 「范围标记2」是否有值
     *
     */
    @JsonIgnore
    public boolean containsScopeTag2() {
        return this.contains(FIELD_SCOPE_TAG2);
    }

    /**
     * 重置 「范围标记2」
     *
     */
    @JsonIgnore
    public V2SystemExtensionField resetScopeTag2() {
        this.reset(FIELD_SCOPE_TAG2);
        return this;
    }

    /**
     * 设置「范围标记3」
     * @param val
     */
    @JsonProperty(FIELD_SCOPE_TAG3)
    public V2SystemExtensionField setScopeTag3(String val) {
        this.set(FIELD_SCOPE_TAG3, val);
        return this;
    }

    /**
     * 获取「范围标记3」值
     *
     */
    @JsonIgnore
    public String getScopeTag3() {
        return DataTypeUtils.asString(this.get(FIELD_SCOPE_TAG3), null);
    }

    /**
     * 判断 「范围标记3」是否有值
     *
     */
    @JsonIgnore
    public boolean containsScopeTag3() {
        return this.contains(FIELD_SCOPE_TAG3);
    }

    /**
     * 重置 「范围标记3」
     *
     */
    @JsonIgnore
    public V2SystemExtensionField resetScopeTag3() {
        this.reset(FIELD_SCOPE_TAG3);
        return this;
    }

    /**
     * 设置「范围标记4」
     * @param val
     */
    @JsonProperty(FIELD_SCOPE_TAG4)
    public V2SystemExtensionField setScopeTag4(String val) {
        this.set(FIELD_SCOPE_TAG4, val);
        return this;
    }

    /**
     * 获取「范围标记4」值
     *
     */
    @JsonIgnore
    public String getScopeTag4() {
        return DataTypeUtils.asString(this.get(FIELD_SCOPE_TAG4), null);
    }

    /**
     * 判断 「范围标记4」是否有值
     *
     */
    @JsonIgnore
    public boolean containsScopeTag4() {
        return this.contains(FIELD_SCOPE_TAG4);
    }

    /**
     * 重置 「范围标记4」
     *
     */
    @JsonIgnore
    public V2SystemExtensionField resetScopeTag4() {
        this.reset(FIELD_SCOPE_TAG4);
        return this;
    }
    
    /**
     * 设置「已应用」
     * 代码表[是否]
     * //@see net.ibizsys.central.cloud.saas.v2.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_APPLY_FLAG)
    public V2SystemExtensionField setApplyFlag(Integer val) {
        this.set(FIELD_APPLY_FLAG, val);
        return this;
    }

    /**
     * 获取「已应用」值
     * 代码表[是否]
     * //@see net.ibizsys.central.cloud.saas.v2.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getApplyFlag() {
        return DataTypeUtils.asInteger(this.get(FIELD_APPLY_FLAG), null);
    }

    /**
     * 判断 「已应用」是否有值
     *
     */
    @JsonIgnore
    public boolean containsApplyFlag() {
        return this.contains(FIELD_APPLY_FLAG);
    }

    /**
     * 重置 「已应用」
     *
     */
    @JsonIgnore
    public V2SystemExtensionField resetApplyFlag() {
        this.reset(FIELD_APPLY_FLAG);
        return this;
    }
    
    /**
     * 设置「应用信息」
     * @param val
     */
    @JsonProperty(FIELD_APPLY_INFO)
    public V2SystemExtensionField setApplyInfo(String val) {
        this.set(FIELD_APPLY_INFO, val);
        return this;
    }

    /**
     * 获取「应用信息」值
     *
     */
    @JsonIgnore
    public String getApplyInfo() {
        return DataTypeUtils.asString(this.get(FIELD_APPLY_INFO), null);
    }

    /**
     * 判断 「应用信息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsApplyInfo() {
        return this.contains(FIELD_APPLY_INFO);
    }

    /**
     * 重置 「应用信息」
     *
     */
    @JsonIgnore
    public V2SystemExtensionField resetApplyInfo() {
        this.reset(FIELD_APPLY_INFO);
        return this;
    }

}
