package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

public class V2SystemSource extends EntityBase {

    /**
     * 属性: OSS文件
     */
    public final static String FIELD_OSS_FILE = "oss_file";

    /**
     * 属性: 摘要信息
     */
    public final static String FIELD_DIGEST = "digest";

    /**
     * 属性: 版本
     */
    public final static String FIELD_VERSION = "version";

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
     * 属性: 系统名称
     */
    public final static String FIELD_SYSTEM_NAME = "system_name";
    
    /**
     * 设置「OSS文件」
     * @param val
     */
    @JsonProperty(FIELD_OSS_FILE)
    public V2SystemSource setOssFile(String val) {
        this.set(FIELD_OSS_FILE, val);
        return this;
    }

    /**
     * 获取「OSS文件」值
     *
     */
    @JsonIgnore
    public String getOssFile() {
        return DataTypeUtils.asString(this.get(FIELD_OSS_FILE), null);
    }

    /**
     * 判断 「OSS文件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOssFile() {
        return this.contains(FIELD_OSS_FILE);
    }

    /**
     * 重置 「OSS文件」
     *
     */
    @JsonIgnore
    public V2SystemSource resetOssFile() {
        this.reset(FIELD_OSS_FILE);
        return this;
    }

    /**
     * 设置「摘要信息」
     * @param val
     */
    @JsonProperty(FIELD_DIGEST)
    public V2SystemSource setDigest(String val) {
        this.set(FIELD_DIGEST, val);
        return this;
    }

    /**
     * 获取「摘要信息」值
     *
     */
    @JsonIgnore
    public String getDigest() {
        return DataTypeUtils.asString(this.get(FIELD_DIGEST), null);
    }

    /**
     * 判断 「摘要信息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDigest() {
        return this.contains(FIELD_DIGEST);
    }

    /**
     * 重置 「摘要信息」
     *
     */
    @JsonIgnore
    public V2SystemSource resetDigest() {
        this.reset(FIELD_DIGEST);
        return this;
    }

    /**
     * 设置「版本」
     * @param val
     */
    @JsonProperty(FIELD_VERSION)
    public V2SystemSource setVersion(Integer val) {
        this.set(FIELD_VERSION, val);
        return this;
    }

    /**
     * 获取「版本」值
     *
     */
    @JsonIgnore
    public Integer getVersion() {
        return DataTypeUtils.asInteger(this.get(FIELD_VERSION), null);
    }

    /**
     * 判断 「版本」是否有值
     *
     */
    @JsonIgnore
    public boolean containsVersion() {
        return this.contains(FIELD_VERSION);
    }

    /**
     * 重置 「版本」
     *
     */
    @JsonIgnore
    public V2SystemSource resetVersion() {
        this.reset(FIELD_VERSION);
        return this;
    }

    /**
     * 设置「建立人」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_MAN)
    public V2SystemSource setCreateMan(String val) {
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
    public V2SystemSource resetCreateMan() {
        this.reset(FIELD_CREATE_MAN);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_TIME)
    public V2SystemSource setCreateTime(Timestamp val) {
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
    public V2SystemSource resetCreateTime() {
        this.reset(FIELD_CREATE_TIME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public V2SystemSource setId(String val) {
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
    public V2SystemSource resetId() {
        this.reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public V2SystemSource setName(String val) {
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
    public V2SystemSource resetName() {
        this.reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「系统标识」
     * @param val
     */
    @JsonProperty(FIELD_SYSTEM_ID)
    public V2SystemSource setSystemId(String val) {
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
    public V2SystemSource resetSystemId() {
        this.reset(FIELD_SYSTEM_ID);
        return this;
    }

    /**
     * 设置「更新人」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_MAN)
    public V2SystemSource setUpdateMan(String val) {
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
    public V2SystemSource resetUpdateMan() {
        this.reset(FIELD_UPDATE_MAN);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_TIME)
    public V2SystemSource setUpdateTime(Timestamp val) {
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
    public V2SystemSource resetUpdateTime() {
        this.reset(FIELD_UPDATE_TIME);
        return this;
    }
    
    
    /**
     * 设置「系统名称」
     * @param val
     */
    @JsonProperty(FIELD_SYSTEM_NAME)
    public V2SystemSource setSystemName(String val) {
        this.set(FIELD_SYSTEM_NAME, val);
        return this;
    }

    /**
     * 获取「系统名称」值
     *
     */
    @JsonIgnore
    public String getSystemName() {
        return DataTypeUtils.asString(this.get(FIELD_SYSTEM_NAME), null);
    }

    /**
     * 判断 「系统名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSystemName() {
        return this.contains(FIELD_SYSTEM_NAME);
    }

    /**
     * 重置 「系统名称」
     *
     */
    @JsonIgnore
    public V2SystemSource resetSystemName() {
        this.reset(FIELD_SYSTEM_NAME);
        return this;
    }

}
