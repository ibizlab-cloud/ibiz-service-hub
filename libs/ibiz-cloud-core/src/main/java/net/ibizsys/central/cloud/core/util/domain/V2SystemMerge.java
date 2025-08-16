package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

public class V2SystemMerge extends EntityBase {

	 /**
     * 属性: 启用标记
     */
    public final static String FIELD_VALID_FLAG = "valid_flag";

    /**
     * 属性: 合并系统类型
     */
    public final static String FIELD_MERGE_SYSTEM_TYPE = "merge_system_type";

    /**
     * 属性: 合并系统标记
     */
    public final static String FIELD_MERGE_SYSTEM_TAG = "merge_system_tag";

    /**
     * 属性: 合并系统标记2
     */
    public final static String FIELD_MERGE_SYSTEM_TAG2 = "merge_system_tag2";

    /**
     * 属性: 合并系统标记3
     */
    public final static String FIELD_MERGE_SYSTEM_TAG3 = "merge_system_tag3";

    /**
     * 属性: 合并系统标记4
     */
    public final static String FIELD_MERGE_SYSTEM_TAG4 = "merge_system_tag4";

    /**
     * 属性: 合并次序
     */
    public final static String FIELD_ORDER_VALUE = "order_value";

    /**
     * 属性: 功能系统名称
     */
    public final static String FIELD_MERGE_SYSTEM_NAME = "merge_system_name";

    /**
     * 属性: 合并系统市场地址
     */
    public final static String FIELD_MERGE_SYSTEM_MARKET_URL = "merge_system_market_url";

    /**
     * 属性: 合并系统产品标识
     */
    public final static String FIELD_MERGE_SYSTEM_PRODUCT_ID = "merge_system_product_id";

    /**
     * 属性: 合并系统产品组标识
     */
    public final static String FIELD_MERGE_SYSTEM_PRODUCT_GROUP_ID = "merge_system_product_group_id";

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
     * 属性: 合并系统标识
     */
    public final static String FIELD_MERGE_SYSTEM_ID = "merge_system_id";

    /**
     * 属性: 合并系统源标识
     */
    public final static String FIELD_MERGE_SYSTEM_SOURCE_ID = "merge_system_source_id";

    /**
     * 属性: 合并系统源名称
     */
    public final static String FIELD_MERGE_SYSTEM_SOURCE_NAME = "merge_system_source_name";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 系统标识
     */
    public final static String FIELD_SYSTEM_ID = "system_id";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_UPDATE_MAN = "update_man";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_UPDATE_TIME = "update_time";
    
    /**
     * 属性: 合并系统源OSS文件
     */
    public final static String FIELD_MERGE_SYSTEM_SOURCE_OSS_FILE = "merge_system_source_oss_file";

    /**
     * 属性: 合并系统源OSS摘要
     */
    public final static String FIELD_MERGE_SYSTEM_SOURCE_DIGEST = "merge_system_source_digest";
    
    /**
     * 属性: 设置
     */
    public final static String FIELD_SETTINGS = "settings";

    /**
     * 属性: 版本
     */
    public final static String FIELD_VER = "ver";
    
    /**
     * 属性: 依赖
     */
    public final static String FIELD_DEPENDENCIES = "dependencies";

    /**
     * 设置「启用标记」
     * 代码表[是否]
     * //@see net.ibizsys.central.cloud.saas.v2.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_VALID_FLAG)
    public V2SystemMerge setValidFlag(Integer val) {
        this.set(FIELD_VALID_FLAG, val);
        return this;
    }

    /**
     * 获取「启用标记」值
     * 代码表[是否]
     * //@see net.ibizsys.central.cloud.saas.v2.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getValidFlag() {
        return DataTypeUtils.asInteger(this.get(FIELD_VALID_FLAG), null);
    }

    /**
     * 判断 「启用标记」是否有值
     *
     */
    @JsonIgnore
    public boolean containsValidFlag() {
        return this.contains(FIELD_VALID_FLAG);
    }

    /**
     * 重置 「启用标记」
     *
     */
    @JsonIgnore
    public V2SystemMerge resetValidFlag() {
        this.reset(FIELD_VALID_FLAG);
        return this;
    }

    /**
     * 设置「合并系统类型」
     * @param val
     */
    @JsonProperty(FIELD_MERGE_SYSTEM_TYPE)
    public V2SystemMerge setMergeSystemType(String val) {
        this.set(FIELD_MERGE_SYSTEM_TYPE, val);
        return this;
    }

    /**
     * 获取「合并系统类型」值
     *
     */
    @JsonIgnore
    public String getMergeSystemType() {
        return DataTypeUtils.asString(this.get(FIELD_MERGE_SYSTEM_TYPE), null);
    }

    /**
     * 判断 「合并系统类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMergeSystemType() {
        return this.contains(FIELD_MERGE_SYSTEM_TYPE);
    }

    /**
     * 重置 「合并系统类型」
     *
     */
    @JsonIgnore
    public V2SystemMerge resetMergeSystemType() {
        this.reset(FIELD_MERGE_SYSTEM_TYPE);
        return this;
    }

    /**
     * 设置「合并系统标记」
     * @param val
     */
    @JsonProperty(FIELD_MERGE_SYSTEM_TAG)
    public V2SystemMerge setMergeSystemTag(String val) {
        this.set(FIELD_MERGE_SYSTEM_TAG, val);
        return this;
    }

    /**
     * 获取「合并系统标记」值
     *
     */
    @JsonIgnore
    public String getMergeSystemTag() {
        return DataTypeUtils.asString(this.get(FIELD_MERGE_SYSTEM_TAG), null);
    }

    /**
     * 判断 「合并系统标记」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMergeSystemTag() {
        return this.contains(FIELD_MERGE_SYSTEM_TAG);
    }

    /**
     * 重置 「合并系统标记」
     *
     */
    @JsonIgnore
    public V2SystemMerge resetMergeSystemTag() {
        this.reset(FIELD_MERGE_SYSTEM_TAG);
        return this;
    }

    /**
     * 设置「合并系统标记2」
     * @param val
     */
    @JsonProperty(FIELD_MERGE_SYSTEM_TAG2)
    public V2SystemMerge setMergeSystemTag2(String val) {
        this.set(FIELD_MERGE_SYSTEM_TAG2, val);
        return this;
    }

    /**
     * 获取「合并系统标记2」值
     *
     */
    @JsonIgnore
    public String getMergeSystemTag2() {
        return DataTypeUtils.asString(this.get(FIELD_MERGE_SYSTEM_TAG2), null);
    }

    /**
     * 判断 「合并系统标记2」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMergeSystemTag2() {
        return this.contains(FIELD_MERGE_SYSTEM_TAG2);
    }

    /**
     * 重置 「合并系统标记2」
     *
     */
    @JsonIgnore
    public V2SystemMerge resetMergeSystemTag2() {
        this.reset(FIELD_MERGE_SYSTEM_TAG2);
        return this;
    }

    /**
     * 设置「合并系统标记3」
     * @param val
     */
    @JsonProperty(FIELD_MERGE_SYSTEM_TAG3)
    public V2SystemMerge setMergeSystemTag3(String val) {
        this.set(FIELD_MERGE_SYSTEM_TAG3, val);
        return this;
    }

    /**
     * 获取「合并系统标记3」值
     *
     */
    @JsonIgnore
    public String getMergeSystemTag3() {
        return DataTypeUtils.asString(this.get(FIELD_MERGE_SYSTEM_TAG3), null);
    }

    /**
     * 判断 「合并系统标记3」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMergeSystemTag3() {
        return this.contains(FIELD_MERGE_SYSTEM_TAG3);
    }

    /**
     * 重置 「合并系统标记3」
     *
     */
    @JsonIgnore
    public V2SystemMerge resetMergeSystemTag3() {
        this.reset(FIELD_MERGE_SYSTEM_TAG3);
        return this;
    }

    /**
     * 设置「合并系统标记4」
     * @param val
     */
    @JsonProperty(FIELD_MERGE_SYSTEM_TAG4)
    public V2SystemMerge setMergeSystemTag4(String val) {
        this.set(FIELD_MERGE_SYSTEM_TAG4, val);
        return this;
    }

    /**
     * 获取「合并系统标记4」值
     *
     */
    @JsonIgnore
    public String getMergeSystemTag4() {
        return DataTypeUtils.asString(this.get(FIELD_MERGE_SYSTEM_TAG4), null);
    }

    /**
     * 判断 「合并系统标记4」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMergeSystemTag4() {
        return this.contains(FIELD_MERGE_SYSTEM_TAG4);
    }

    /**
     * 重置 「合并系统标记4」
     *
     */
    @JsonIgnore
    public V2SystemMerge resetMergeSystemTag4() {
        this.reset(FIELD_MERGE_SYSTEM_TAG4);
        return this;
    }

    /**
     * 设置「合并次序」
     * @param val
     */
    @JsonProperty(FIELD_ORDER_VALUE)
    public V2SystemMerge setOrderValue(Integer val) {
        this.set(FIELD_ORDER_VALUE, val);
        return this;
    }

    /**
     * 获取「合并次序」值
     *
     */
    @JsonIgnore
    public Integer getOrderValue() {
        return DataTypeUtils.asInteger(this.get(FIELD_ORDER_VALUE), null);
    }

    /**
     * 判断 「合并次序」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOrderValue() {
        return this.contains(FIELD_ORDER_VALUE);
    }

    /**
     * 重置 「合并次序」
     *
     */
    @JsonIgnore
    public V2SystemMerge resetOrderValue() {
        this.reset(FIELD_ORDER_VALUE);
        return this;
    }

    /**
     * 设置「功能系统名称」
     * @param val
     */
    @JsonProperty(FIELD_MERGE_SYSTEM_NAME)
    public V2SystemMerge setMergeSystemName(String val) {
        this.set(FIELD_MERGE_SYSTEM_NAME, val);
        return this;
    }

    /**
     * 获取「功能系统名称」值
     *
     */
    @JsonIgnore
    public String getMergeSystemName() {
        return DataTypeUtils.asString(this.get(FIELD_MERGE_SYSTEM_NAME), null);
    }

    /**
     * 判断 「功能系统名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMergeSystemName() {
        return this.contains(FIELD_MERGE_SYSTEM_NAME);
    }

    /**
     * 重置 「功能系统名称」
     *
     */
    @JsonIgnore
    public V2SystemMerge resetMergeSystemName() {
        this.reset(FIELD_MERGE_SYSTEM_NAME);
        return this;
    }

    /**
     * 设置「合并系统市场地址」
     * @param val
     */
    @JsonProperty(FIELD_MERGE_SYSTEM_MARKET_URL)
    public V2SystemMerge setMergeSystemMarketUrl(String val) {
        this.set(FIELD_MERGE_SYSTEM_MARKET_URL, val);
        return this;
    }

    /**
     * 获取「合并系统市场地址」值
     *
     */
    @JsonIgnore
    public String getMergeSystemMarketUrl() {
        return DataTypeUtils.asString(this.get(FIELD_MERGE_SYSTEM_MARKET_URL), null);
    }

    /**
     * 判断 「合并系统市场地址」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMergeSystemMarketUrl() {
        return this.contains(FIELD_MERGE_SYSTEM_MARKET_URL);
    }

    /**
     * 重置 「合并系统市场地址」
     *
     */
    @JsonIgnore
    public V2SystemMerge resetMergeSystemMarketUrl() {
        this.reset(FIELD_MERGE_SYSTEM_MARKET_URL);
        return this;
    }

    /**
     * 设置「合并系统产品标识」
     * @param val
     */
    @JsonProperty(FIELD_MERGE_SYSTEM_PRODUCT_ID)
    public V2SystemMerge setMergeSystemProductId(String val) {
        this.set(FIELD_MERGE_SYSTEM_PRODUCT_ID, val);
        return this;
    }

    /**
     * 获取「合并系统产品标识」值
     *
     */
    @JsonIgnore
    public String getMergeSystemProductId() {
        return DataTypeUtils.asString(this.get(FIELD_MERGE_SYSTEM_PRODUCT_ID), null);
    }

    /**
     * 判断 「合并系统产品标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMergeSystemProductId() {
        return this.contains(FIELD_MERGE_SYSTEM_PRODUCT_ID);
    }

    /**
     * 重置 「合并系统产品标识」
     *
     */
    @JsonIgnore
    public V2SystemMerge resetMergeSystemProductId() {
        this.reset(FIELD_MERGE_SYSTEM_PRODUCT_ID);
        return this;
    }

    /**
     * 设置「合并系统产品组标识」
     * @param val
     */
    @JsonProperty(FIELD_MERGE_SYSTEM_PRODUCT_GROUP_ID)
    public V2SystemMerge setMergeSystemProductGroupId(String val) {
        this.set(FIELD_MERGE_SYSTEM_PRODUCT_GROUP_ID, val);
        return this;
    }

    /**
     * 获取「合并系统产品组标识」值
     *
     */
    @JsonIgnore
    public String getMergeSystemProductGroupId() {
        return DataTypeUtils.asString(this.get(FIELD_MERGE_SYSTEM_PRODUCT_GROUP_ID), null);
    }

    /**
     * 判断 「合并系统产品组标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMergeSystemProductGroupId() {
        return this.contains(FIELD_MERGE_SYSTEM_PRODUCT_GROUP_ID);
    }

    /**
     * 重置 「合并系统产品组标识」
     *
     */
    @JsonIgnore
    public V2SystemMerge resetMergeSystemProductGroupId() {
        this.reset(FIELD_MERGE_SYSTEM_PRODUCT_GROUP_ID);
        return this;
    }

    /**
     * 设置「建立人」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_MAN)
    public V2SystemMerge setCreateMan(String val) {
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
    public V2SystemMerge resetCreateMan() {
        this.reset(FIELD_CREATE_MAN);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_TIME)
    public V2SystemMerge setCreateTime(Timestamp val) {
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
    public V2SystemMerge resetCreateTime() {
        this.reset(FIELD_CREATE_TIME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public V2SystemMerge setId(String val) {
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
    public V2SystemMerge resetId() {
        this.reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「合并系统标识」
     * @param val
     */
    @JsonProperty(FIELD_MERGE_SYSTEM_ID)
    public V2SystemMerge setMergeSystemId(String val) {
        this.set(FIELD_MERGE_SYSTEM_ID, val);
        return this;
    }

    /**
     * 获取「合并系统标识」值
     *
     */
    @JsonIgnore
    public String getMergeSystemId() {
        return DataTypeUtils.asString(this.get(FIELD_MERGE_SYSTEM_ID), null);
    }

    /**
     * 判断 「合并系统标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMergeSystemId() {
        return this.contains(FIELD_MERGE_SYSTEM_ID);
    }

    /**
     * 重置 「合并系统标识」
     *
     */
    @JsonIgnore
    public V2SystemMerge resetMergeSystemId() {
        this.reset(FIELD_MERGE_SYSTEM_ID);
        return this;
    }

    /**
     * 设置「合并系统源标识」
     * @param val
     */
    @JsonProperty(FIELD_MERGE_SYSTEM_SOURCE_ID)
    public V2SystemMerge setMergeSystemSourceId(String val) {
        this.set(FIELD_MERGE_SYSTEM_SOURCE_ID, val);
        return this;
    }

    /**
     * 获取「合并系统源标识」值
     *
     */
    @JsonIgnore
    public String getMergeSystemSourceId() {
        return DataTypeUtils.asString(this.get(FIELD_MERGE_SYSTEM_SOURCE_ID), null);
    }

    /**
     * 判断 「合并系统源标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMergeSystemSourceId() {
        return this.contains(FIELD_MERGE_SYSTEM_SOURCE_ID);
    }

    /**
     * 重置 「合并系统源标识」
     *
     */
    @JsonIgnore
    public V2SystemMerge resetMergeSystemSourceId() {
        this.reset(FIELD_MERGE_SYSTEM_SOURCE_ID);
        return this;
    }

    /**
     * 设置「合并系统源名称」
     * @param val
     */
    @JsonProperty(FIELD_MERGE_SYSTEM_SOURCE_NAME)
    public V2SystemMerge setMergeSystemSourceName(String val) {
        this.set(FIELD_MERGE_SYSTEM_SOURCE_NAME, val);
        return this;
    }

    /**
     * 获取「合并系统源名称」值
     *
     */
    @JsonIgnore
    public String getMergeSystemSourceName() {
        return DataTypeUtils.asString(this.get(FIELD_MERGE_SYSTEM_SOURCE_NAME), null);
    }

    /**
     * 判断 「合并系统源名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMergeSystemSourceName() {
        return this.contains(FIELD_MERGE_SYSTEM_SOURCE_NAME);
    }

    /**
     * 重置 「合并系统源名称」
     *
     */
    @JsonIgnore
    public V2SystemMerge resetMergeSystemSourceName() {
        this.reset(FIELD_MERGE_SYSTEM_SOURCE_NAME);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public V2SystemMerge setName(String val) {
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
    public V2SystemMerge resetName() {
        this.reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「系统标识」
     * @param val
     */
    @JsonProperty(FIELD_SYSTEM_ID)
    public V2SystemMerge setSystemId(String val) {
        this.set(FIELD_SYSTEM_ID, val);
        return this;
    }

    /**
     * 获取「系统标识」值
     *
     */
    @JsonIgnore
    public String getSystemId() {
        return DataTypeUtils.asString(this.get(FIELD_SYSTEM_ID), null);
    }

    /**
     * 判断 「系统标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSystemId() {
        return this.contains(FIELD_SYSTEM_ID);
    }

    /**
     * 重置 「系统标识」
     *
     */
    @JsonIgnore
    public V2SystemMerge resetSystemId() {
        this.reset(FIELD_SYSTEM_ID);
        return this;
    }

    /**
     * 设置「更新人」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_MAN)
    public V2SystemMerge setUpdateMan(String val) {
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
    public V2SystemMerge resetUpdateMan() {
        this.reset(FIELD_UPDATE_MAN);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_TIME)
    public V2SystemMerge setUpdateTime(Timestamp val) {
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
    public V2SystemMerge resetUpdateTime() {
        this.reset(FIELD_UPDATE_TIME);
        return this;
    }

    
    /**
     * 设置「合并系统源OSS文件」
     * @param val
     */
    @JsonProperty(FIELD_MERGE_SYSTEM_SOURCE_OSS_FILE)
    public V2SystemMerge setMergeSystemSourceOssFile(String val) {
        this.set(FIELD_MERGE_SYSTEM_SOURCE_OSS_FILE, val);
        return this;
    }

    /**
     * 获取「合并系统源OSS文件」值
     *
     */
    @JsonIgnore
    public String getMergeSystemSourceOssFile() {
        return DataTypeUtils.asString(this.get(FIELD_MERGE_SYSTEM_SOURCE_OSS_FILE), null);
    }

    /**
     * 判断 「合并系统源OSS文件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMergeSystemSourceOssFile() {
        return this.contains(FIELD_MERGE_SYSTEM_SOURCE_OSS_FILE);
    }

    /**
     * 重置 「合并系统源OSS文件」
     *
     */
    @JsonIgnore
    public V2SystemMerge resetMergeSystemSourceOssFile() {
        this.reset(FIELD_MERGE_SYSTEM_SOURCE_OSS_FILE);
        return this;
    }

    /**
     * 设置「合并系统源OSS摘要」
     * @param val
     */
    @JsonProperty(FIELD_MERGE_SYSTEM_SOURCE_DIGEST)
    public V2SystemMerge setMergeSystemSourceDigest(String val) {
        this.set(FIELD_MERGE_SYSTEM_SOURCE_DIGEST, val);
        return this;
    }

    /**
     * 获取「合并系统源OSS摘要」值
     *
     */
    @JsonIgnore
    public String getMergeSystemSourceDigest() {
        return DataTypeUtils.asString(this.get(FIELD_MERGE_SYSTEM_SOURCE_DIGEST), null);
    }

    /**
     * 判断 「合并系统源OSS摘要」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMergeSystemSourceDigest() {
        return this.contains(FIELD_MERGE_SYSTEM_SOURCE_DIGEST);
    }

    /**
     * 重置 「合并系统源OSS摘要」
     *
     */
    @JsonIgnore
    public V2SystemMerge resetMergeSystemSourceDigest() {
        this.reset(FIELD_MERGE_SYSTEM_SOURCE_DIGEST);
        return this;
    }
    
    /**
     * 设置「设置」
     * @param val
     */
    @JsonProperty(FIELD_SETTINGS)
    public V2SystemMerge setSettings(String val) {
        this.set(FIELD_SETTINGS, val);
        return this;
    }

    /**
     * 获取「设置」值
     *
     */
    @JsonIgnore
    public String getSettings() {
        return DataTypeUtils.asString(this.get(FIELD_SETTINGS), null);
    }

    /**
     * 判断 「设置」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSettings() {
        return this.contains(FIELD_SETTINGS);
    }

    /**
     * 重置 「设置」
     *
     */
    @JsonIgnore
    public V2SystemMerge resetSettings() {
        this.reset(FIELD_SETTINGS);
        return this;
    }

    /**
     * 设置「版本」
     * @param val
     */
    @JsonProperty(FIELD_VER)
    public V2SystemMerge setVer(String val) {
        this.set(FIELD_VER, val);
        return this;
    }

    /**
     * 获取「版本」值
     *
     */
    @JsonIgnore
    public String getVer() {
        return DataTypeUtils.asString(this.get(FIELD_VER), null);
    }

    /**
     * 判断 「版本」是否有值
     *
     */
    @JsonIgnore
    public boolean containsVer() {
        return this.contains(FIELD_VER);
    }

    /**
     * 重置 「版本」
     *
     */
    @JsonIgnore
    public V2SystemMerge resetVer() {
        this.reset(FIELD_VER);
        return this;
    }
    
    /**
     * 设置「依赖」
     * @param val
     */
    @JsonProperty(FIELD_DEPENDENCIES)
    public V2SystemMerge setDependencies(String val) {
        this.set(FIELD_DEPENDENCIES, val);
        return this;
    }

    /**
     * 获取「依赖」值
     *
     */
    @JsonIgnore
    public String getDependencies() {
        return DataTypeUtils.asString(this.get(FIELD_DEPENDENCIES), null);
    }

    /**
     * 判断 「依赖」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDependencies() {
        return this.contains(FIELD_DEPENDENCIES);
    }
}
