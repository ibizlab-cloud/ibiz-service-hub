package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

public class V2SystemVersion extends EntityBase {

    /**
     * 属性: 系统合并信息
     */
    public final static String FIELD_MERGE_INFO = "merge_info";

    /**
     * 属性: 启用标记
     */
    public final static String FIELD_VALID_FLAG = "valid_flag";

    /**
     * 属性: 版本
     */
    public final static String FIELD_VERSION = "version";

    /**
     * 属性: 类型
     */
    public final static String FIELD_TYPE = "type";

    /**
     * 属性: OSS文件
     */
    public final static String FIELD_OSS_FILE = "oss_file";

    /**
     * 属性: 模型摘要
     */
    public final static String FIELD_DIGEST = "digest";

    /**
     * 属性: 状态
     */
    public final static String FIELD_STATE = "state";

    /**
     * 属性: 版本相关源
     */
    public final static String FIELD_SOURCES = "sources";

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
     * 属性: 系统名称
     */
    public final static String FIELD_SYSTEM_NAME = "system_name";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_UPDATE_MAN = "update_man";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_UPDATE_TIME = "update_time";
    
    /**
     * 属性: 默认版本
     */
    public final static String FIELD_DEFAULT_FLAG = "default_flag";
    
    
    /**
     * 属性: 名称
     */
    public final static String FIELD_SYSTEM_SOURCE_NAME = "system_source_name";



    /**
     * 属性: 系统源标识
     */
    public final static String FIELD_SYSTEM_SOURCE_ID = "system_source_id";
    
    
    /**
     * 属性: 应用程序模型
     */
    public final static String FIELD_APP_MODEL = "app_model";

    /**
     * 属性: 接口模型
     */
    public final static String FIELD_API_MODEL = "api_model";

    /**
     * 设置「系统合并信息」
     * @param val
     */
    @JsonProperty(FIELD_MERGE_INFO)
    public V2SystemVersion setMergeInfo(String val) {
        this.set(FIELD_MERGE_INFO, val);
        return this;
    }

    /**
     * 获取「系统合并信息」值
     *
     */
    @JsonIgnore
    public String getMergeInfo() {
        return DataTypeUtils.asString(this.get(FIELD_MERGE_INFO), null);
    }

    /**
     * 判断 「系统合并信息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMergeInfo() {
        return this.contains(FIELD_MERGE_INFO);
    }

    /**
     * 重置 「系统合并信息」
     *
     */
    @JsonIgnore
    public V2SystemVersion resetMergeInfo() {
        this.reset(FIELD_MERGE_INFO);
        return this;
    }

    /**
     * 设置「启用标记」
     * 代码表[是否]
     * //@see net.ibizsys.central.cloud.saas.v2.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_VALID_FLAG)
    public V2SystemVersion setValidFlag(Integer val) {
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
    public V2SystemVersion resetValidFlag() {
        this.reset(FIELD_VALID_FLAG);
        return this;
    }

    /**
     * 设置「版本」
     * @param val
     */
    @JsonProperty(FIELD_VERSION)
    public V2SystemVersion setVersion(Integer val) {
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
    public V2SystemVersion resetVersion() {
        this.reset(FIELD_VERSION);
        return this;
    }

    /**
     * 设置「类型」
     * 代码表[系统版本类型]
     * //@see net.ibizsys.central.cloud.saas.v2.core.runtime.dict.StaticDict.system_version_type
     * @param val
     */
    @JsonProperty(FIELD_TYPE)
    public V2SystemVersion setType(String val) {
        this.set(FIELD_TYPE, val);
        return this;
    }

    /**
     * 获取「类型」值
     * 代码表[系统版本类型]
     * //@see net.ibizsys.central.cloud.saas.v2.core.runtime.dict.StaticDict.system_version_type
     *
     */
    @JsonIgnore
    public String getType() {
        return DataTypeUtils.asString(this.get(FIELD_TYPE), null);
    }

    /**
     * 判断 「类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsType() {
        return this.contains(FIELD_TYPE);
    }

    /**
     * 重置 「类型」
     *
     */
    @JsonIgnore
    public V2SystemVersion resetType() {
        this.reset(FIELD_TYPE);
        return this;
    }

    /**
     * 设置「OSS文件」
     * @param val
     */
    @JsonProperty(FIELD_OSS_FILE)
    public V2SystemVersion setOssFile(String val) {
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
    public V2SystemVersion resetOssFile() {
        this.reset(FIELD_OSS_FILE);
        return this;
    }

    /**
     * 设置「模型摘要」
     * @param val
     */
    @JsonProperty(FIELD_DIGEST)
    public V2SystemVersion setDigest(String val) {
        this.set(FIELD_DIGEST, val);
        return this;
    }

    /**
     * 获取「模型摘要」值
     *
     */
    @JsonIgnore
    public String getDigest() {
        return DataTypeUtils.asString(this.get(FIELD_DIGEST), null);
    }

    /**
     * 判断 「模型摘要」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDigest() {
        return this.contains(FIELD_DIGEST);
    }

    /**
     * 重置 「模型摘要」
     *
     */
    @JsonIgnore
    public V2SystemVersion resetDigest() {
        this.reset(FIELD_DIGEST);
        return this;
    }

    /**
     * 设置「状态」
     * @param val
     */
    @JsonProperty(FIELD_STATE)
    public V2SystemVersion setState(Integer val) {
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
    public V2SystemVersion resetState() {
        this.reset(FIELD_STATE);
        return this;
    }

    /**
     * 设置「版本相关源」
     * @param val
     */
    @JsonProperty(FIELD_SOURCES)
    public V2SystemVersion setSources(List<V2SystemVersionSource> val) {
        this.set(FIELD_SOURCES, val);
        return this;
    }

    /**
     * 获取「版本相关源」值
     *
     */
    @JsonIgnore
    public List<V2SystemVersionSource> getSources() {
        return (List<V2SystemVersionSource>) this.get(FIELD_SOURCES);
    }

    /**
     * 判断 「版本相关源」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSources() {
        return this.contains(FIELD_SOURCES);
    }

    /**
     * 重置 「版本相关源」
     *
     */
    @JsonIgnore
    public V2SystemVersion resetSources() {
        this.reset(FIELD_SOURCES);
        return this;
    }

    /**
     * 设置「建立人」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_MAN)
    public V2SystemVersion setCreateMan(String val) {
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
    public V2SystemVersion resetCreateMan() {
        this.reset(FIELD_CREATE_MAN);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_TIME)
    public V2SystemVersion setCreateTime(Timestamp val) {
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
    public V2SystemVersion resetCreateTime() {
        this.reset(FIELD_CREATE_TIME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public V2SystemVersion setId(String val) {
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
    public V2SystemVersion resetId() {
        this.reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public V2SystemVersion setName(String val) {
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
    public V2SystemVersion resetName() {
        this.reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「系统标识」
     * @param val
     */
    @JsonProperty(FIELD_SYSTEM_ID)
    public V2SystemVersion setSystemId(String val) {
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
    public V2SystemVersion resetSystemId() {
        this.reset(FIELD_SYSTEM_ID);
        return this;
    }

    /**
     * 设置「系统名称」
     * @param val
     */
    @JsonProperty(FIELD_SYSTEM_NAME)
    public V2SystemVersion setSystemName(String val) {
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
    public V2SystemVersion resetSystemName() {
        this.reset(FIELD_SYSTEM_NAME);
        return this;
    }

    /**
     * 设置「更新人」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_MAN)
    public V2SystemVersion setUpdateMan(String val) {
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
    public V2SystemVersion resetUpdateMan() {
        this.reset(FIELD_UPDATE_MAN);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_TIME)
    public V2SystemVersion setUpdateTime(Timestamp val) {
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
    public V2SystemVersion resetUpdateTime() {
        this.reset(FIELD_UPDATE_TIME);
        return this;
    }

    
    /**
     * 设置「默认版本」
     * 代码表[是否]
     * //@see net.ibizsys.central.cloud.saas.v2.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_DEFAULT_FLAG)
    public V2SystemVersion setDefaultFlag(Integer val) {
        this.set(FIELD_DEFAULT_FLAG, val);
        return this;
    }

    /**
     * 获取「默认版本」值
     * 代码表[是否]
     * //@see net.ibizsys.central.cloud.saas.v2.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getDefaultFlag() {
        return DataTypeUtils.asInteger(this.get(FIELD_DEFAULT_FLAG), null);
    }

    /**
     * 判断 「默认版本」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDefaultFlag() {
        return this.contains(FIELD_DEFAULT_FLAG);
    }

    /**
     * 重置 「默认版本」
     *
     */
    @JsonIgnore
    public V2SystemVersion resetDefaultFlag() {
        this.reset(FIELD_DEFAULT_FLAG);
        return this;
    }
    
    
    
    /**
     * 设置「系统源标识」
     * @param val
     */
    @JsonProperty(FIELD_SYSTEM_SOURCE_ID)
    public V2SystemVersion setSystemSourceId(String val) {
        this.set(FIELD_SYSTEM_SOURCE_ID, val);
        return this;
    }

    /**
     * 获取「系统源标识」值
     *
     */
    @JsonIgnore
    public String getSystemSourceId() {
        return DataTypeUtils.asString(this.get(FIELD_SYSTEM_SOURCE_ID), null);
    }

    /**
     * 判断 「系统源标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSystemSourceId() {
        return this.contains(FIELD_SYSTEM_SOURCE_ID);
    }

    /**
     * 重置 「系统源标识」
     *
     */
    @JsonIgnore
    public V2SystemVersion resetSystemSourceId() {
        this.reset(FIELD_SYSTEM_SOURCE_ID);
        return this;
    }
    
    
    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_SYSTEM_SOURCE_NAME)
    public V2SystemVersion setSystemSourceName(String val) {
        this.set(FIELD_SYSTEM_SOURCE_NAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
     */
    @JsonIgnore
    public String getSystemSourceName() {
        return DataTypeUtils.asString(this.get(FIELD_SYSTEM_SOURCE_NAME), null);
    }

    /**
     * 判断 「名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSystemSourceName() {
        return this.contains(FIELD_SYSTEM_SOURCE_NAME);
    }

    /**
     * 重置 「名称」
     *
     */
    @JsonIgnore
    public V2SystemVersion resetSystemSourceName() {
        this.reset(FIELD_SYSTEM_SOURCE_NAME);
        return this;
    }
    
    
    /**
     * 设置「应用程序模型」
     * @param val
     */
    @JsonProperty(FIELD_APP_MODEL)
    public V2SystemVersion setAppModel(String val) {
        this.set(FIELD_APP_MODEL, val);
        return this;
    }

    /**
     * 获取「应用程序模型」值
     *
     */
    @JsonIgnore
    public String getAppModel() {
        return DataTypeUtils.asString(this.get(FIELD_APP_MODEL), null);
    }

    /**
     * 判断 「应用程序模型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAppModel() {
        return this.contains(FIELD_APP_MODEL);
    }

    /**
     * 重置 「应用程序模型」
     *
     */
    @JsonIgnore
    public V2SystemVersion resetAppModel() {
        this.reset(FIELD_APP_MODEL);
        return this;
    }

    /**
     * 设置「接口模型」
     * @param val
     */
    @JsonProperty(FIELD_API_MODEL)
    public V2SystemVersion setApiModel(String val) {
        this.set(FIELD_API_MODEL, val);
        return this;
    }

    /**
     * 获取「接口模型」值
     *
     */
    @JsonIgnore
    public String getApiModel() {
        return DataTypeUtils.asString(this.get(FIELD_API_MODEL), null);
    }

    /**
     * 判断 「接口模型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsApiModel() {
        return this.contains(FIELD_API_MODEL);
    }

    /**
     * 重置 「接口模型」
     *
     */
    @JsonIgnore
    public V2SystemVersion resetApiModel() {
        this.reset(FIELD_API_MODEL);
        return this;
    }
}
