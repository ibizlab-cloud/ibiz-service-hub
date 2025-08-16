package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

public class V2SystemExtensionPortlet extends EntityBase {

    /**
     * 属性: 模型版本
     */
    public final static String FIELD_VERSION = "version";

    /**
     * 属性: 状态
     */
    public final static String FIELD_STATE = "state";

    /**
     * 属性: 已应用
     */
    public final static String FIELD_APPLY_FLAG = "apply_flag";

    /**
     * 属性: 应用信息
     */
    public final static String FIELD_APPLY_INFO = "apply_info";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_MAN = "create_man";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_TIME = "create_time";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 系统扩展标识
     */
    public final static String FIELD_SYSTEM_EXTENSION_ID = "system_extension_id";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_UPDATE_MAN = "update_man";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_UPDATE_TIME = "update_time";

    /**
     * 属性: 系统标记
     */
    public final static String FIELD_SYSTEM_TAG = "system_tag";

    /**
     * 属性: 数据实体标记
     */
    public final static String FIELD_DATA_ENTITY_TAG = "data_entity_tag";

    /**
     * 属性: 排序值
     */
    public final static String FIELD_ORDER_VALUE = "order_value";

    /**
     * 属性: 扩展标记
     */
    public final static String FIELD_EXTENSION_TAG = "extension_tag";

    /**
     * 属性: 扩展标记2
     */
    public final static String FIELD_EXTENSION_TAG2 = "extension_tag2";

    /**
     * 属性: 扩展标记3
     */
    public final static String FIELD_EXTENSION_TAG3 = "extension_tag3";

    /**
     * 属性: 扩展标记4
     */
    public final static String FIELD_EXTENSION_TAG4 = "extension_tag4";

    /**
     * 属性: 扩展模型
     */
    public final static String FIELD_EXTENSION_MODEL = "extension_model";

    /**
     * 属性: 待定扩展模型
     */
    public final static String FIELD_PENDING_EXTENSION_MODEL = "pending_extension_model";

    /**
     * 属性: 运行时模型
     */
    public final static String FIELD_RUNTIME_MODEL = "runtime_model";

    /**
     * 属性: 扩展作用范围类型
     */
    public final static String FIELD_SCOPE_TYPE = "scope_type";
    

    /**
     * 属性: 门户部件标记
     */
    public final static String FIELD_PORTLET_TAG = "portlet_tag";

    

    /**
     * 设置「模型版本」
     * @param val
     */
    @JsonProperty(FIELD_VERSION)
    public V2SystemExtensionPortlet setVersion(Integer val) {
        this.set(FIELD_VERSION, val);
        return this;
    }

    /**
     * 获取「模型版本」值
     *
     */
    @JsonIgnore
    public Integer getVersion() {
        return DataTypeUtils.asInteger(this.get(FIELD_VERSION), null);
    }

    /**
     * 判断 「模型版本」是否有值
     *
     */
    @JsonIgnore
    public boolean containsVersion() {
        return this.contains(FIELD_VERSION);
    }

    /**
     * 重置 「模型版本」
     *
     */
    @JsonIgnore
    public V2SystemExtensionPortlet resetVersion() {
        this.reset(FIELD_VERSION);
        return this;
    }

    /**
     * 设置「状态」
     * @param val
     */
    @JsonProperty(FIELD_STATE)
    public V2SystemExtensionPortlet setState(Integer val) {
        this.set(FIELD_STATE, val);
        return this;
    }

    /**
     * 获取「状态」值
     *
     */
    @JsonIgnore
    public Integer getState() {
        return DataTypeUtils.asInteger(this.get(FIELD_STATE), null);
    }

    /**
     * 判断 「状态」是否有值
     *
     */
    @JsonIgnore
    public boolean containsState() {
        return this.contains(FIELD_STATE);
    }

    /**
     * 重置 「状态」
     *
     */
    @JsonIgnore
    public V2SystemExtensionPortlet resetState() {
        this.reset(FIELD_STATE);
        return this;
    }

    /**
     * 设置「已应用」
     * 代码表[系统扩展模型应用状态]
     * //@see net.ibizsys.central.cloud.saas.v2.core.runtime.dict.StaticDict.system_extension_apply_state
     * @param val
     */
    @JsonProperty(FIELD_APPLY_FLAG)
    public V2SystemExtensionPortlet setApplyFlag(Integer val) {
        this.set(FIELD_APPLY_FLAG, val);
        return this;
    }

    /**
     * 获取「已应用」值
     * 代码表[系统扩展模型应用状态]
     * //@see net.ibizsys.central.cloud.saas.v2.core.runtime.dict.StaticDict.system_extension_apply_state
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
    public V2SystemExtensionPortlet resetApplyFlag() {
        this.reset(FIELD_APPLY_FLAG);
        return this;
    }

    /**
     * 设置「应用信息」
     * @param val
     */
    @JsonProperty(FIELD_APPLY_INFO)
    public V2SystemExtensionPortlet setApplyInfo(String val) {
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
    public V2SystemExtensionPortlet resetApplyInfo() {
        this.reset(FIELD_APPLY_INFO);
        return this;
    }

    /**
     * 设置「建立人」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_MAN)
    public V2SystemExtensionPortlet setCreateMan(String val) {
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
    public V2SystemExtensionPortlet resetCreateMan() {
        this.reset(FIELD_CREATE_MAN);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_TIME)
    public V2SystemExtensionPortlet setCreateTime(Timestamp val) {
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
    public V2SystemExtensionPortlet resetCreateTime() {
        this.reset(FIELD_CREATE_TIME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public V2SystemExtensionPortlet setId(String val) {
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
    public V2SystemExtensionPortlet resetId() {
        this.reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public V2SystemExtensionPortlet setName(String val) {
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
    public V2SystemExtensionPortlet resetName() {
        this.reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「系统扩展标识」
     * @param val
     */
    @JsonProperty(FIELD_SYSTEM_EXTENSION_ID)
    public V2SystemExtensionPortlet setSystemExtensionId(String val) {
        this.set(FIELD_SYSTEM_EXTENSION_ID, val);
        return this;
    }

    /**
     * 获取「系统扩展标识」值
     *
     */
    @JsonIgnore
    public String getSystemExtensionId() {
        return DataTypeUtils.asString(this.get(FIELD_SYSTEM_EXTENSION_ID), null);
    }

    /**
     * 判断 「系统扩展标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSystemExtensionId() {
        return this.contains(FIELD_SYSTEM_EXTENSION_ID);
    }

    /**
     * 重置 「系统扩展标识」
     *
     */
    @JsonIgnore
    public V2SystemExtensionPortlet resetSystemExtensionId() {
        this.reset(FIELD_SYSTEM_EXTENSION_ID);
        return this;
    }

    /**
     * 设置「更新人」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_MAN)
    public V2SystemExtensionPortlet setUpdateMan(String val) {
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
    public V2SystemExtensionPortlet resetUpdateMan() {
        this.reset(FIELD_UPDATE_MAN);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_TIME)
    public V2SystemExtensionPortlet setUpdateTime(Timestamp val) {
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
    public V2SystemExtensionPortlet resetUpdateTime() {
        this.reset(FIELD_UPDATE_TIME);
        return this;
    }

    /**
     * 设置「系统标记」
     * @param val
     */
    @JsonProperty(FIELD_SYSTEM_TAG)
    public V2SystemExtensionPortlet setSystemTag(String val) {
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
    public V2SystemExtensionPortlet resetSystemTag() {
        this.reset(FIELD_SYSTEM_TAG);
        return this;
    }

    /**
     * 设置「数据实体标记」
     * @param val
     */
    @JsonProperty(FIELD_DATA_ENTITY_TAG)
    public V2SystemExtensionPortlet setDataEntityTag(String val) {
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
    public V2SystemExtensionPortlet resetDataEntityTag() {
        this.reset(FIELD_DATA_ENTITY_TAG);
        return this;
    }

    /**
     * 设置「排序值」
     * @param val
     */
    @JsonProperty(FIELD_ORDER_VALUE)
    public V2SystemExtensionPortlet setOrderValue(Integer val) {
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
    public V2SystemExtensionPortlet resetOrderValue() {
        this.reset(FIELD_ORDER_VALUE);
        return this;
    }

    /**
     * 设置「扩展标记」
     * @param val
     */
    @JsonProperty(FIELD_EXTENSION_TAG)
    public V2SystemExtensionPortlet setExtensionTag(String val) {
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
    public V2SystemExtensionPortlet resetExtensionTag() {
        this.reset(FIELD_EXTENSION_TAG);
        return this;
    }

    /**
     * 设置「扩展标记2」
     * @param val
     */
    @JsonProperty(FIELD_EXTENSION_TAG2)
    public V2SystemExtensionPortlet setExtensionTag2(String val) {
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
    public V2SystemExtensionPortlet resetExtensionTag2() {
        this.reset(FIELD_EXTENSION_TAG2);
        return this;
    }

    /**
     * 设置「扩展标记3」
     * @param val
     */
    @JsonProperty(FIELD_EXTENSION_TAG3)
    public V2SystemExtensionPortlet setExtensionTag3(String val) {
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
    public V2SystemExtensionPortlet resetExtensionTag3() {
        this.reset(FIELD_EXTENSION_TAG3);
        return this;
    }

    /**
     * 设置「扩展标记4」
     * @param val
     */
    @JsonProperty(FIELD_EXTENSION_TAG4)
    public V2SystemExtensionPortlet setExtensionTag4(String val) {
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
    public V2SystemExtensionPortlet resetExtensionTag4() {
        this.reset(FIELD_EXTENSION_TAG4);
        return this;
    }

    /**
     * 设置「扩展模型」
     * @param val
     */
    @JsonProperty(FIELD_EXTENSION_MODEL)
    public V2SystemExtensionPortlet setExtensionModel(String val) {
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
    public V2SystemExtensionPortlet resetExtensionModel() {
        this.reset(FIELD_EXTENSION_MODEL);
        return this;
    }

    /**
     * 设置「待定扩展模型」
     * @param val
     */
    @JsonProperty(FIELD_PENDING_EXTENSION_MODEL)
    public V2SystemExtensionPortlet setPendingExtensionModel(String val) {
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
    public V2SystemExtensionPortlet resetPendingExtensionModel() {
        this.reset(FIELD_PENDING_EXTENSION_MODEL);
        return this;
    }

    /**
     * 设置「运行时模型」
     * @param val
     */
    @JsonProperty(FIELD_RUNTIME_MODEL)
    public V2SystemExtensionPortlet setRuntimeModel(String val) {
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
    public V2SystemExtensionPortlet resetRuntimeModel() {
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
    public V2SystemExtensionPortlet setScopeType(String val) {
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
    public V2SystemExtensionPortlet resetScopeType() {
        this.reset(FIELD_SCOPE_TYPE);
        return this;
    }

    /**
     * 设置「门户部件标记」
     * @param val
     */
    @JsonProperty(FIELD_PORTLET_TAG)
    public V2SystemExtensionPortlet setPortletTag(String val) {
        this.set(FIELD_PORTLET_TAG, val);
        return this;
    }

    /**
     * 获取「门户部件标记」值
     *
     */
    @JsonIgnore
    public String getPortletTag() {
        return DataTypeUtils.asString(this.get(FIELD_PORTLET_TAG), null);
    }

    /**
     * 判断 「门户部件标记」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPortletTag() {
        return this.contains(FIELD_PORTLET_TAG);
    }

    /**
     * 重置 「门户部件标记」
     *
     */
    @JsonIgnore
    public V2SystemExtensionPortlet resetPortletTag() {
        this.reset(FIELD_PORTLET_TAG);
        return this;
    }

}
