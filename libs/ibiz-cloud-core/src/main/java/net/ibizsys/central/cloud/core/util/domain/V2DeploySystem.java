package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

public class V2DeploySystem extends EntityBase{

	 /**
     * 属性: 市场地址
     */
    public final static String FIELD_MARKET_URL = "market_url";

    /**
     * 属性: 产品标识
     */
    public final static String FIELD_PRODUCT_ID = "product_id";

    /**
     * 属性: 产品分组标识
     */
    public final static String FIELD_PRODUCT_GROUP_ID = "product_group_id";

    /**
     * 属性: 产品基础分组标识
     */
    public final static String FIELD_PRODUCT_BASE_GROUP_ID = "product_base_group_id";

    /**
     * 属性: 模型文件对象
     */
    public final static String FIELD_OSS_FILE = "oss_file";

    /**
     * 属性: oss文件摘要
     */
    public final static String FIELD_OSS_FILE_DIGEST = "oss_file_digest";

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
     * 属性: 名称
     */
    public final static String FIELD_SYSTEM_EXTENSION_NAME = "system_extension_name";

    /**
     * 属性: 系统标识
     */
    public final static String FIELD_SYSTEM_ID = "system_id";

    /**
     * 属性: 系统名称
     */
    public final static String FIELD_SYSTEM_NAME = "system_name";

    /**
     * 属性: 系统版本标识
     */
    public final static String FIELD_SYSTEM_VERSION_ID = "system_version_id";

    /**
     * 属性: 版本名称
     */
    public final static String FIELD_SYSTEM_VERSION_NAME = "system_version_name";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_UPDATE_MAN = "update_man";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_UPDATE_TIME = "update_time";

    /**
     * 属性: 设置集合
     */
    public final static String FIELD_SETTINGS = "settings";

    /**
     * 属性: 数据源集合
     */
    public final static String FIELD_DATA_SOURCES = "data_sources";
    
    /**
     * 属性: 系统仓库地址
     */
    public final static String FIELD_HTTP_URL_TO_REPO = "http_url_to_repo";
    
    /**
     * 属性: 版本
     */
    public final static String FIELD_VER = "ver";
    
    /**
     * 属性: 默认分支
     */
    public final static String FIELD_DEFAULT_BRANCH = "default_branch";
    
    /**
     * 设置「市场地址」
     * @param val
     */
    @JsonProperty(FIELD_MARKET_URL)
    public V2DeploySystem setMarketUrl(String val) {
        this.set(FIELD_MARKET_URL, val);
        return this;
    }

    /**
     * 获取「市场地址」值
     *
     */
    @JsonIgnore
    public String getMarketUrl() {
        return DataTypeUtils.asString(this.get(FIELD_MARKET_URL), null);
    }

    /**
     * 判断 「市场地址」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMarketUrl() {
        return this.contains(FIELD_MARKET_URL);
    }

    /**
     * 重置 「市场地址」
     *
     */
    @JsonIgnore
    public V2DeploySystem resetMarketUrl() {
        this.reset(FIELD_MARKET_URL);
        return this;
    }

    /**
     * 设置「产品标识」
     * @param val
     */
    @JsonProperty(FIELD_PRODUCT_ID)
    public V2DeploySystem setProductId(String val) {
        this.set(FIELD_PRODUCT_ID, val);
        return this;
    }

    /**
     * 获取「产品标识」值
     *
     */
    @JsonIgnore
    public String getProductId() {
        return DataTypeUtils.asString(this.get(FIELD_PRODUCT_ID), null);
    }

    /**
     * 判断 「产品标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsProductId() {
        return this.contains(FIELD_PRODUCT_ID);
    }

    /**
     * 重置 「产品标识」
     *
     */
    @JsonIgnore
    public V2DeploySystem resetProductId() {
        this.reset(FIELD_PRODUCT_ID);
        return this;
    }

    /**
     * 设置「产品分组标识」
     * @param val
     */
    @JsonProperty(FIELD_PRODUCT_GROUP_ID)
    public V2DeploySystem setProductGroupId(String val) {
        this.set(FIELD_PRODUCT_GROUP_ID, val);
        return this;
    }

    /**
     * 获取「产品分组标识」值
     *
     */
    @JsonIgnore
    public String getProductGroupId() {
        return DataTypeUtils.asString(this.get(FIELD_PRODUCT_GROUP_ID), null);
    }

    /**
     * 判断 「产品分组标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsProductGroupId() {
        return this.contains(FIELD_PRODUCT_GROUP_ID);
    }

    /**
     * 重置 「产品分组标识」
     *
     */
    @JsonIgnore
    public V2DeploySystem resetProductGroupId() {
        this.reset(FIELD_PRODUCT_GROUP_ID);
        return this;
    }

    /**
     * 设置「产品基础分组标识」
     * @param val
     */
    @JsonProperty(FIELD_PRODUCT_BASE_GROUP_ID)
    public V2DeploySystem setProductBaseGroupId(String val) {
        this.set(FIELD_PRODUCT_BASE_GROUP_ID, val);
        return this;
    }

    /**
     * 获取「产品基础分组标识」值
     *
     */
    @JsonIgnore
    public String getProductBaseGroupId() {
        return DataTypeUtils.asString(this.get(FIELD_PRODUCT_BASE_GROUP_ID), null);
    }

    /**
     * 判断 「产品基础分组标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsProductBaseGroupId() {
        return this.contains(FIELD_PRODUCT_BASE_GROUP_ID);
    }

    /**
     * 重置 「产品基础分组标识」
     *
     */
    @JsonIgnore
    public V2DeploySystem resetProductBaseGroupId() {
        this.reset(FIELD_PRODUCT_BASE_GROUP_ID);
        return this;
    }

    /**
     * 设置「模型文件对象」
     * @param val
     */
    @JsonProperty(FIELD_OSS_FILE)
    public V2DeploySystem setOssFile(String val) {
        this.set(FIELD_OSS_FILE, val);
        return this;
    }

    /**
     * 获取「模型文件对象」值
     *
     */
    @JsonIgnore
    public String getOssFile() {
        return DataTypeUtils.asString(this.get(FIELD_OSS_FILE), null);
    }

    /**
     * 判断 「模型文件对象」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOssFile() {
        return this.contains(FIELD_OSS_FILE);
    }

    /**
     * 重置 「模型文件对象」
     *
     */
    @JsonIgnore
    public V2DeploySystem resetOssFile() {
        this.reset(FIELD_OSS_FILE);
        return this;
    }

    /**
     * 设置「oss文件摘要」
     * @param val
     */
    @JsonProperty(FIELD_OSS_FILE_DIGEST)
    public V2DeploySystem setOssFileDigest(String val) {
        this.set(FIELD_OSS_FILE_DIGEST, val);
        return this;
    }

    /**
     * 获取「oss文件摘要」值
     *
     */
    @JsonIgnore
    public String getOssFileDigest() {
        return DataTypeUtils.asString(this.get(FIELD_OSS_FILE_DIGEST), null);
    }

    /**
     * 判断 「oss文件摘要」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOssFileDigest() {
        return this.contains(FIELD_OSS_FILE_DIGEST);
    }

    /**
     * 重置 「oss文件摘要」
     *
     */
    @JsonIgnore
    public V2DeploySystem resetOssFileDigest() {
        this.reset(FIELD_OSS_FILE_DIGEST);
        return this;
    }

    /**
     * 设置「建立人」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_MAN)
    public V2DeploySystem setCreateMan(String val) {
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
    public V2DeploySystem resetCreateMan() {
        this.reset(FIELD_CREATE_MAN);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_TIME)
    public V2DeploySystem setCreateTime(Timestamp val) {
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
    public V2DeploySystem resetCreateTime() {
        this.reset(FIELD_CREATE_TIME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public V2DeploySystem setId(String val) {
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
    public V2DeploySystem resetId() {
        this.reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public V2DeploySystem setName(String val) {
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
    public V2DeploySystem resetName() {
        this.reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「系统扩展标识」
     * @param val
     */
    @JsonProperty(FIELD_SYSTEM_EXTENSION_ID)
    public V2DeploySystem setSystemExtensionId(String val) {
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
    public V2DeploySystem resetSystemExtensionId() {
        this.reset(FIELD_SYSTEM_EXTENSION_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_SYSTEM_EXTENSION_NAME)
    public V2DeploySystem setSystemExtensionName(String val) {
        this.set(FIELD_SYSTEM_EXTENSION_NAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
     */
    @JsonIgnore
    public String getSystemExtensionName() {
        return DataTypeUtils.asString(this.get(FIELD_SYSTEM_EXTENSION_NAME), null);
    }

    /**
     * 判断 「名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSystemExtensionName() {
        return this.contains(FIELD_SYSTEM_EXTENSION_NAME);
    }

    /**
     * 重置 「名称」
     *
     */
    @JsonIgnore
    public V2DeploySystem resetSystemExtensionName() {
        this.reset(FIELD_SYSTEM_EXTENSION_NAME);
        return this;
    }

    /**
     * 设置「系统标识」
     * @param val
     */
    @JsonProperty(FIELD_SYSTEM_ID)
    public V2DeploySystem setSystemId(String val) {
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
    public V2DeploySystem resetSystemId() {
        this.reset(FIELD_SYSTEM_ID);
        return this;
    }

    /**
     * 设置「系统名称」
     * @param val
     */
    @JsonProperty(FIELD_SYSTEM_NAME)
    public V2DeploySystem setSystemName(String val) {
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
    public V2DeploySystem resetSystemName() {
        this.reset(FIELD_SYSTEM_NAME);
        return this;
    }

    /**
     * 设置「系统版本标识」
     * @param val
     */
    @JsonProperty(FIELD_SYSTEM_VERSION_ID)
    public V2DeploySystem setSystemVersionId(String val) {
        this.set(FIELD_SYSTEM_VERSION_ID, val);
        return this;
    }

    /**
     * 获取「系统版本标识」值
     *
     */
    @JsonIgnore
    public String getSystemVersionId() {
        return DataTypeUtils.asString(this.get(FIELD_SYSTEM_VERSION_ID), null);
    }

    /**
     * 判断 「系统版本标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSystemVersionId() {
        return this.contains(FIELD_SYSTEM_VERSION_ID);
    }

    /**
     * 重置 「系统版本标识」
     *
     */
    @JsonIgnore
    public V2DeploySystem resetSystemVersionId() {
        this.reset(FIELD_SYSTEM_VERSION_ID);
        return this;
    }

    /**
     * 设置「版本名称」
     * @param val
     */
    @JsonProperty(FIELD_SYSTEM_VERSION_NAME)
    public V2DeploySystem setSystemVersionName(String val) {
        this.set(FIELD_SYSTEM_VERSION_NAME, val);
        return this;
    }

    /**
     * 获取「版本名称」值
     *
     */
    @JsonIgnore
    public String getSystemVersionName() {
        return DataTypeUtils.asString(this.get(FIELD_SYSTEM_VERSION_NAME), null);
    }

    /**
     * 判断 「版本名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSystemVersionName() {
        return this.contains(FIELD_SYSTEM_VERSION_NAME);
    }

    /**
     * 重置 「版本名称」
     *
     */
    @JsonIgnore
    public V2DeploySystem resetSystemVersionName() {
        this.reset(FIELD_SYSTEM_VERSION_NAME);
        return this;
    }

    /**
     * 设置「更新人」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_MAN)
    public V2DeploySystem setUpdateMan(String val) {
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
    public V2DeploySystem resetUpdateMan() {
        this.reset(FIELD_UPDATE_MAN);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_TIME)
    public V2DeploySystem setUpdateTime(Timestamp val) {
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
    public V2DeploySystem resetUpdateTime() {
        this.reset(FIELD_UPDATE_TIME);
        return this;
    }

    
    /**
     * 设置「设置集合」
     * @param val
     */
    @JsonProperty(FIELD_SETTINGS)
    public V2DeploySystem setSettings(List<V2DeploySystemSetting> val) {
        this.set(FIELD_SETTINGS, val);
        return this;
    }

    /**
     * 获取「设置集合」值
     *
     */
    @JsonIgnore
    public List<V2DeploySystemSetting> getSettings() {
        return (List<V2DeploySystemSetting>) this.get(FIELD_SETTINGS);
    }

    /**
     * 判断 「设置集合」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSettings() {
        return this.contains(FIELD_SETTINGS);
    }

    /**
     * 重置 「设置集合」
     *
     */
    @JsonIgnore
    public V2DeploySystem resetSettings() {
        this.reset(FIELD_SETTINGS);
        return this;
    }

    /**
     * 设置「数据源集合」
     * @param val
     */
    @JsonProperty(FIELD_DATA_SOURCES)
    public V2DeploySystem setDataSources(List<V2DeploySystemDataSource> val) {
        this.set(FIELD_DATA_SOURCES, val);
        return this;
    }

    /**
     * 获取「数据源集合」值
     *
     */
    @JsonIgnore
    public List<V2DeploySystemDataSource> getDataSources() {
        return (List<V2DeploySystemDataSource>) this.get(FIELD_DATA_SOURCES);
    }

    /**
     * 判断 「数据源集合」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDataSources() {
        return this.contains(FIELD_DATA_SOURCES);
    }

    /**
     * 重置 「数据源集合」
     *
     */
    @JsonIgnore
    public V2DeploySystem resetDataSources() {
        this.reset(FIELD_DATA_SOURCES);
        return this;
    }
    
    /**
     * 设置「系统仓库地址」
     * @param val
     */
    @JsonProperty(FIELD_HTTP_URL_TO_REPO)
    public V2DeploySystem setHttpUrlToRepo(String val) {
        this.set(FIELD_HTTP_URL_TO_REPO, val);
        return this;
    }

    /**
     * 获取「系统仓库地址」值
     *
     */
    @JsonIgnore
    public String getHttpUrlToRepo() {
        return DataTypeUtils.asString(this.get(FIELD_HTTP_URL_TO_REPO), null);
    }

    /**
     * 判断 「系统仓库地址」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHttpUrlToRepo() {
        return this.contains(FIELD_HTTP_URL_TO_REPO);
    }

    /**
     * 重置 「系统仓库地址」
     *
     */
    @JsonIgnore
    public V2DeploySystem resetHttpUrlToRepo() {
        this.reset(FIELD_HTTP_URL_TO_REPO);
        return this;
    }

    /**
     * 设置「版本」
     * @param val
     */
    @JsonProperty(FIELD_VER)
    public V2DeploySystem setVer(String val) {
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
    public V2DeploySystem resetVer() {
        this.reset(FIELD_VER);
        return this;
    }
    
    /**
     * 设置「默认分支」
     * @param val
     */
    @JsonProperty(FIELD_DEFAULT_BRANCH)
    public V2DeploySystem setDefaultBranch(String val) {
        this.set(FIELD_DEFAULT_BRANCH, val);
        return this;
    }

    /**
     * 获取「默认分支」值
     *
     */
    @JsonIgnore
    public String getDefaultBranch() {
        return DataTypeUtils.asString(this.get(FIELD_DEFAULT_BRANCH), null);
    }
}
