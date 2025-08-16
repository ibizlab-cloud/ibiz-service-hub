package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

public class V2DataSource extends EntityBase {

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
     * 属性: 密码
     */
    public final static String FIELD_PASSWORD = "password";

    /**
     * 属性: 简介
     */
    public final static String FIELD_SUMMARY = "summary";

    /**
     * 属性: 数据源类型
     */
    public final static String FIELD_TYPE = "type";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_UPDATE_MAN = "update_man";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_UPDATE_TIME = "update_time";

    /**
     * 属性: 连接串
     */
    public final static String FIELD_URL = "url";

    /**
     * 属性: 用户名
     */
    public final static String FIELD_USERNAME = "username";

    /**
     * 属性: 启用标记
     */
    public final static String FIELD_VALID_FLAG = "valid_flag";

    /**
     * 属性: 额外配置
     */
    public final static String FIELD_CONFIG = "config";
    
    /**
     * 设置「建立人」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_MAN)
    public V2DataSource setCreateMan(String val) {
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
    public V2DataSource resetCreateMan() {
        this.reset(FIELD_CREATE_MAN);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_TIME)
    public V2DataSource setCreateTime(Timestamp val) {
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
    public V2DataSource resetCreateTime() {
        this.reset(FIELD_CREATE_TIME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public V2DataSource setId(String val) {
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
    public V2DataSource resetId() {
        this.reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public V2DataSource setName(String val) {
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
    public V2DataSource resetName() {
        this.reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「密码」
     * @param val
     */
    @JsonProperty(FIELD_PASSWORD)
    public V2DataSource setPassword(String val) {
        this.set(FIELD_PASSWORD, val);
        return this;
    }

    /**
     * 获取「密码」值
     *
     */
    @JsonIgnore
    public String getPassword() {
        return DataTypeUtils.asString(this.get(FIELD_PASSWORD), null);
    }

    /**
     * 判断 「密码」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPassword() {
        return this.contains(FIELD_PASSWORD);
    }

    /**
     * 重置 「密码」
     *
     */
    @JsonIgnore
    public V2DataSource resetPassword() {
        this.reset(FIELD_PASSWORD);
        return this;
    }

    /**
     * 设置「简介」
     * @param val
     */
    @JsonProperty(FIELD_SUMMARY)
    public V2DataSource setSummary(String val) {
        this.set(FIELD_SUMMARY, val);
        return this;
    }

    /**
     * 获取「简介」值
     *
     */
    @JsonIgnore
    public String getSummary() {
        return DataTypeUtils.asString(this.get(FIELD_SUMMARY), null);
    }

    /**
     * 判断 「简介」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSummary() {
        return this.contains(FIELD_SUMMARY);
    }

    /**
     * 重置 「简介」
     *
     */
    @JsonIgnore
    public V2DataSource resetSummary() {
        this.reset(FIELD_SUMMARY);
        return this;
    }

    /**
     * 设置「数据源类型」
     * 代码表[数据源类型]
     * //@see net.ibizsys.central.cloud.saas.v2.core.runtime.dict.StaticDict.data_source_type
     * @param val
     */
    @JsonProperty(FIELD_TYPE)
    public V2DataSource setType(String val) {
        this.set(FIELD_TYPE, val);
        return this;
    }

    /**
     * 获取「数据源类型」值
     * 代码表[数据源类型]
     * //@see net.ibizsys.central.cloud.saas.v2.core.runtime.dict.StaticDict.data_source_type
     *
     */
    @JsonIgnore
    public String getType() {
        return DataTypeUtils.asString(this.get(FIELD_TYPE), null);
    }

    /**
     * 判断 「数据源类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsType() {
        return this.contains(FIELD_TYPE);
    }

    /**
     * 重置 「数据源类型」
     *
     */
    @JsonIgnore
    public V2DataSource resetType() {
        this.reset(FIELD_TYPE);
        return this;
    }

    /**
     * 设置「更新人」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_MAN)
    public V2DataSource setUpdateMan(String val) {
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
    public V2DataSource resetUpdateMan() {
        this.reset(FIELD_UPDATE_MAN);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_TIME)
    public V2DataSource setUpdateTime(Timestamp val) {
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
    public V2DataSource resetUpdateTime() {
        this.reset(FIELD_UPDATE_TIME);
        return this;
    }

    /**
     * 设置「连接串」
     * @param val
     */
    @JsonProperty(FIELD_URL)
    public V2DataSource setUrl(String val) {
        this.set(FIELD_URL, val);
        return this;
    }

    /**
     * 获取「连接串」值
     *
     */
    @JsonIgnore
    public String getUrl() {
        return DataTypeUtils.asString(this.get(FIELD_URL), null);
    }

    /**
     * 判断 「连接串」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUrl() {
        return this.contains(FIELD_URL);
    }

    /**
     * 重置 「连接串」
     *
     */
    @JsonIgnore
    public V2DataSource resetUrl() {
        this.reset(FIELD_URL);
        return this;
    }

    /**
     * 设置「用户名」
     * @param val
     */
    @JsonProperty(FIELD_USERNAME)
    public V2DataSource setUsername(String val) {
        this.set(FIELD_USERNAME, val);
        return this;
    }

    /**
     * 获取「用户名」值
     *
     */
    @JsonIgnore
    public String getUsername() {
        return DataTypeUtils.asString(this.get(FIELD_USERNAME), null);
    }

    /**
     * 判断 「用户名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUsername() {
        return this.contains(FIELD_USERNAME);
    }

    /**
     * 重置 「用户名」
     *
     */
    @JsonIgnore
    public V2DataSource resetUsername() {
        this.reset(FIELD_USERNAME);
        return this;
    }

    /**
     * 设置「启用标记」
     * 代码表[是否]
     * //@see net.ibizsys.central.cloud.saas.v2.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_VALID_FLAG)
    public V2DataSource setValidFlag(Integer val) {
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
    public V2DataSource resetValidFlag() {
        this.reset(FIELD_VALID_FLAG);
        return this;
    }

    
    /**
     * 设置「额外配置」
     * @param val
     */
    @JsonProperty(FIELD_CONFIG)
    public V2DataSource setConfig(String val) {
        this.set(FIELD_CONFIG, val);
        return this;
    }

    /**
     * 获取「额外配置」值
     *
     */
    @JsonIgnore
    public String getConfig() {
        return DataTypeUtils.asString(this.get(FIELD_CONFIG), null);
    }

    /**
     * 判断 「额外配置」是否有值
     *
     */
    @JsonIgnore
    public boolean containsConfig() {
        return this.contains(FIELD_CONFIG);
    }

    /**
     * 重置 「额外配置」
     *
     */
    @JsonIgnore
    public V2DataSource resetConfig() {
        this.reset(FIELD_CONFIG);
        return this;
    }

}
