package net.ibizsys.central.cloud.core.util.domain;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

public class V2System extends EntityBase{

    /**
     * 属性: 群组标识
     */
    public final static String FIELD_GROUP_ID = "group_id";

    /**
     * 属性: 系统标识
     */
    public final static String FIELD_SYSTEM_ID = "system_id";

    /**
     * 属性: 系统类型
     */
    public final static String FIELD_TYPE = "type";

    /**
     * 属性: 系统标记
     */
    public final static String FIELD_SYSTEM_TAG = "system_tag";

    /**
     * 属性: 系统标记2
     */
    public final static String FIELD_SYSTEM_TAG2 = "system_tag2";

    /**
     * 属性: 系统标记3
     */
    public final static String FIELD_SYSTEM_TAG3 = "system_tag3";

    /**
     * 属性: 系统标记4
     */
    public final static String FIELD_SYSTEM_TAG4 = "system_tag4";

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
     * 属性: 更新人
     */
    public final static String FIELD_UPDATE_MAN = "update_man";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_UPDATE_TIME = "update_time";


    /**
     * 属性: 系统仓库地址
     */
    public final static String FIELD_HTTP_URL_TO_REPO = "http_url_to_repo";
    
    /**
     * 属性: 默认分支
     */
    public final static String FIELD_DEFAULT_BRANCH = "default_branch";
    
    /**
     * 设置「群组标识」
     * @param val
     */
    @JsonProperty(FIELD_GROUP_ID)
    public V2System setGroupId(String val) {
        this.set(FIELD_GROUP_ID, val);
        return this;
    }

    /**
     * 获取「群组标识」值
     *
     */
    @JsonIgnore
    public String getGroupId() {
        return DataTypeUtils.asString(this.get(FIELD_GROUP_ID), null);
    }

    /**
     * 判断 「群组标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupId() {
        return this.contains(FIELD_GROUP_ID);
    }

    /**
     * 重置 「群组标识」
     *
     */
    @JsonIgnore
    public V2System resetGroupId() {
        this.reset(FIELD_GROUP_ID);
        return this;
    }

    /**
     * 设置「系统标识」
     * @param val
     */
    @JsonProperty(FIELD_SYSTEM_ID)
    public V2System setSystemId(String val) {
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
    public V2System resetSystemId() {
        this.reset(FIELD_SYSTEM_ID);
        return this;
    }

    /**
     * 设置「系统类型」
     * @param val
     */
    @JsonProperty(FIELD_TYPE)
    public V2System setType(String val) {
        this.set(FIELD_TYPE, val);
        return this;
    }

    /**
     * 获取「系统类型」值
     *
     */
    @JsonIgnore
    public String getType() {
        return DataTypeUtils.asString(this.get(FIELD_TYPE), null);
    }

    /**
     * 判断 「系统类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsType() {
        return this.contains(FIELD_TYPE);
    }

    /**
     * 重置 「系统类型」
     *
     */
    @JsonIgnore
    public V2System resetType() {
        this.reset(FIELD_TYPE);
        return this;
    }

    /**
     * 设置「系统标记」
     * @param val
     */
    @JsonProperty(FIELD_SYSTEM_TAG)
    public V2System setSystemTag(String val) {
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
    public V2System resetSystemTag() {
        this.reset(FIELD_SYSTEM_TAG);
        return this;
    }

    /**
     * 设置「系统标记2」
     * @param val
     */
    @JsonProperty(FIELD_SYSTEM_TAG2)
    public V2System setSystemTag2(String val) {
        this.set(FIELD_SYSTEM_TAG2, val);
        return this;
    }

    /**
     * 获取「系统标记2」值
     *
     */
    @JsonIgnore
    public String getSystemTag2() {
        return DataTypeUtils.asString(this.get(FIELD_SYSTEM_TAG2), null);
    }

    /**
     * 判断 「系统标记2」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSystemTag2() {
        return this.contains(FIELD_SYSTEM_TAG2);
    }

    /**
     * 重置 「系统标记2」
     *
     */
    @JsonIgnore
    public V2System resetSystemTag2() {
        this.reset(FIELD_SYSTEM_TAG2);
        return this;
    }

    /**
     * 设置「系统标记3」
     * @param val
     */
    @JsonProperty(FIELD_SYSTEM_TAG3)
    public V2System setSystemTag3(String val) {
        this.set(FIELD_SYSTEM_TAG3, val);
        return this;
    }

    /**
     * 获取「系统标记3」值
     *
     */
    @JsonIgnore
    public String getSystemTag3() {
        return DataTypeUtils.asString(this.get(FIELD_SYSTEM_TAG3), null);
    }

    /**
     * 判断 「系统标记3」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSystemTag3() {
        return this.contains(FIELD_SYSTEM_TAG3);
    }

    /**
     * 重置 「系统标记3」
     *
     */
    @JsonIgnore
    public V2System resetSystemTag3() {
        this.reset(FIELD_SYSTEM_TAG3);
        return this;
    }

    /**
     * 设置「系统标记4」
     * @param val
     */
    @JsonProperty(FIELD_SYSTEM_TAG4)
    public V2System setSystemTag4(String val) {
        this.set(FIELD_SYSTEM_TAG4, val);
        return this;
    }

    /**
     * 获取「系统标记4」值
     *
     */
    @JsonIgnore
    public String getSystemTag4() {
        return DataTypeUtils.asString(this.get(FIELD_SYSTEM_TAG4), null);
    }

    /**
     * 判断 「系统标记4」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSystemTag4() {
        return this.contains(FIELD_SYSTEM_TAG4);
    }

    /**
     * 重置 「系统标记4」
     *
     */
    @JsonIgnore
    public V2System resetSystemTag4() {
        this.reset(FIELD_SYSTEM_TAG4);
        return this;
    }

    /**
     * 设置「市场地址」
     * @param val
     */
    @JsonProperty(FIELD_MARKET_URL)
    public V2System setMarketUrl(String val) {
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
    public V2System resetMarketUrl() {
        this.reset(FIELD_MARKET_URL);
        return this;
    }

    /**
     * 设置「产品标识」
     * @param val
     */
    @JsonProperty(FIELD_PRODUCT_ID)
    public V2System setProductId(String val) {
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
    public V2System resetProductId() {
        this.reset(FIELD_PRODUCT_ID);
        return this;
    }

    /**
     * 设置「产品分组标识」
     * @param val
     */
    @JsonProperty(FIELD_PRODUCT_GROUP_ID)
    public V2System setProductGroupId(String val) {
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
    public V2System resetProductGroupId() {
        this.reset(FIELD_PRODUCT_GROUP_ID);
        return this;
    }

    /**
     * 设置「产品基础分组标识」
     * @param val
     */
    @JsonProperty(FIELD_PRODUCT_BASE_GROUP_ID)
    public V2System setProductBaseGroupId(String val) {
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
    public V2System resetProductBaseGroupId() {
        this.reset(FIELD_PRODUCT_BASE_GROUP_ID);
        return this;
    }

    /**
     * 设置「建立人」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_MAN)
    public V2System setCreateMan(String val) {
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
    public V2System resetCreateMan() {
        this.reset(FIELD_CREATE_MAN);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_TIME)
    public V2System setCreateTime(Timestamp val) {
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
    public V2System resetCreateTime() {
        this.reset(FIELD_CREATE_TIME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public V2System setId(String val) {
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
    public V2System resetId() {
        this.reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public V2System setName(String val) {
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
    public V2System resetName() {
        this.reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「更新人」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_MAN)
    public V2System setUpdateMan(String val) {
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
    public V2System resetUpdateMan() {
        this.reset(FIELD_UPDATE_MAN);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_TIME)
    public V2System setUpdateTime(Timestamp val) {
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
    public V2System resetUpdateTime() {
        this.reset(FIELD_UPDATE_TIME);
        return this;
    }
    
    /**
     * 设置「系统仓库地址」
     * @param val
     */
    @JsonProperty(FIELD_HTTP_URL_TO_REPO)
    public V2System setHttpUrlToRepo(String val) {
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
    public V2System resetHttpUrlToRepo() {
        this.reset(FIELD_HTTP_URL_TO_REPO);
        return this;
    }
    
    /**
     * 设置「默认分支」
     * @param val
     */
    @JsonProperty(FIELD_DEFAULT_BRANCH)
    public V2System setDefaultBranch(String val) {
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

    /**
     * 判断 「默认分支」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDefaultBranch() {
        return this.contains(FIELD_DEFAULT_BRANCH);
    }

}
