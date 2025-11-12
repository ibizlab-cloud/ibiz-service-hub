package cn.ibizlab.central.plugin.odoo.dataentity.dto;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.central.util.IEntityDTO;


public class AiCredentialDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_MAN = "create_man";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_TIME = "create_time";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_UPDATE_MAN = "update_man";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_UPDATE_TIME = "update_time";

    /**
     * 属性: 访问密钥
     */
    public final static String FIELD_ACCESS_KEY = "access_key";

    /**
     * 属性: 是否启用
     */
    public final static String FIELD_ACTIVE = "active";

    /**
     * 属性: Bearer令牌
     */
    public final static String FIELD_BEARER_TOKEN = "bearer_token";

    /**
     * 属性: 客户端ID
     */
    public final static String FIELD_CLIENT_ID = "client_id";

    /**
     * 属性: 客户端密钥
     */
    public final static String FIELD_CLIENT_SECRET = "client_secret";

    /**
     * 属性: 凭证类型
     */
    public final static String FIELD_CREDENTIAL_TYPE = "credential_type";

    /**
     * 属性: 用途说明
     */
    public final static String FIELD_DESCRIPTION = "description";

    /**
     * 属性: 模型提供商
     */
    public final static String FIELD_PROVIDER = "provider";

    /**
     * 属性: 区域
     */
    public final static String FIELD_REGION = "region";

    /**
     * 属性: 权限范围
     */
    public final static String FIELD_SCOPE = "scope";

    /**
     * 属性: 安全密钥
     */
    public final static String FIELD_SECRET_KEY = "secret_key";

    /**
     * 属性: 令牌地址
     */
    public final static String FIELD_TOKEN_URL = "token_url";

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public AiCredentialDTO setId(String val) {
        this._set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
     */
    @JsonIgnore
    public String getId() {
        return DataTypeUtils.asString(this._get(FIELD_ID), null);
    }

    /**
     * 判断 「标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsId() {
        return this._contains(FIELD_ID);
    }

    /**
     * 重置 「标识」
     *
     */
    @JsonIgnore
    public AiCredentialDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public AiCredentialDTO setName(String val) {
        this._set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
     */
    @JsonIgnore
    public String getName() {
        return DataTypeUtils.asString(this._get(FIELD_NAME), null);
    }

    /**
     * 判断 「名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsName() {
        return this._contains(FIELD_NAME);
    }

    /**
     * 重置 「名称」
     *
     */
    @JsonIgnore
    public AiCredentialDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「建立人」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_MAN)
    public AiCredentialDTO setCreateMan(String val) {
        this._set(FIELD_CREATE_MAN, val);
        return this;
    }

    /**
     * 获取「建立人」值
     *
     */
    @JsonIgnore
    public String getCreateMan() {
        return DataTypeUtils.asString(this._get(FIELD_CREATE_MAN), null);
    }

    /**
     * 判断 「建立人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCreateMan() {
        return this._contains(FIELD_CREATE_MAN);
    }

    /**
     * 重置 「建立人」
     *
     */
    @JsonIgnore
    public AiCredentialDTO resetCreateMan() {
        this._reset(FIELD_CREATE_MAN);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_TIME)
    public AiCredentialDTO setCreateTime(Timestamp val) {
        this._set(FIELD_CREATE_TIME, val);
        return this;
    }

    /**
     * 获取「建立时间」值
     *
     */
    @JsonIgnore
    public Timestamp getCreateTime() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_CREATE_TIME), null);
    }

    /**
     * 判断 「建立时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCreateTime() {
        return this._contains(FIELD_CREATE_TIME);
    }

    /**
     * 重置 「建立时间」
     *
     */
    @JsonIgnore
    public AiCredentialDTO resetCreateTime() {
        this._reset(FIELD_CREATE_TIME);
        return this;
    }

    /**
     * 设置「更新人」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_MAN)
    public AiCredentialDTO setUpdateMan(String val) {
        this._set(FIELD_UPDATE_MAN, val);
        return this;
    }

    /**
     * 获取「更新人」值
     *
     */
    @JsonIgnore
    public String getUpdateMan() {
        return DataTypeUtils.asString(this._get(FIELD_UPDATE_MAN), null);
    }

    /**
     * 判断 「更新人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUpdateMan() {
        return this._contains(FIELD_UPDATE_MAN);
    }

    /**
     * 重置 「更新人」
     *
     */
    @JsonIgnore
    public AiCredentialDTO resetUpdateMan() {
        this._reset(FIELD_UPDATE_MAN);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_TIME)
    public AiCredentialDTO setUpdateTime(Timestamp val) {
        this._set(FIELD_UPDATE_TIME, val);
        return this;
    }

    /**
     * 获取「更新时间」值
     *
     */
    @JsonIgnore
    public Timestamp getUpdateTime() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_UPDATE_TIME), null);
    }

    /**
     * 判断 「更新时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUpdateTime() {
        return this._contains(FIELD_UPDATE_TIME);
    }

    /**
     * 重置 「更新时间」
     *
     */
    @JsonIgnore
    public AiCredentialDTO resetUpdateTime() {
        this._reset(FIELD_UPDATE_TIME);
        return this;
    }

    /**
     * 设置「访问密钥」
     * @param val
     */
    @JsonProperty(FIELD_ACCESS_KEY)
    public AiCredentialDTO setAccessKey(String val) {
        this._set(FIELD_ACCESS_KEY, val);
        return this;
    }

    /**
     * 获取「访问密钥」值
     *
     */
    @JsonIgnore
    public String getAccessKey() {
        return DataTypeUtils.asString(this._get(FIELD_ACCESS_KEY), null);
    }

    /**
     * 判断 「访问密钥」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAccessKey() {
        return this._contains(FIELD_ACCESS_KEY);
    }

    /**
     * 重置 「访问密钥」
     *
     */
    @JsonIgnore
    public AiCredentialDTO resetAccessKey() {
        this._reset(FIELD_ACCESS_KEY);
        return this;
    }

    /**
     * 设置「是否启用」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ACTIVE)
    public AiCredentialDTO setActive(Integer val) {
        this._set(FIELD_ACTIVE, val);
        return this;
    }

    /**
     * 获取「是否启用」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getActive() {
        return DataTypeUtils.asInteger(this._get(FIELD_ACTIVE), null);
    }

    /**
     * 判断 「是否启用」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActive() {
        return this._contains(FIELD_ACTIVE);
    }

    /**
     * 重置 「是否启用」
     *
     */
    @JsonIgnore
    public AiCredentialDTO resetActive() {
        this._reset(FIELD_ACTIVE);
        return this;
    }

    /**
     * 设置「Bearer令牌」
     * @param val
     */
    @JsonProperty(FIELD_BEARER_TOKEN)
    public AiCredentialDTO setBearerToken(String val) {
        this._set(FIELD_BEARER_TOKEN, val);
        return this;
    }

    /**
     * 获取「Bearer令牌」值
     *
     */
    @JsonIgnore
    public String getBearerToken() {
        return DataTypeUtils.asString(this._get(FIELD_BEARER_TOKEN), null);
    }

    /**
     * 判断 「Bearer令牌」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBearerToken() {
        return this._contains(FIELD_BEARER_TOKEN);
    }

    /**
     * 重置 「Bearer令牌」
     *
     */
    @JsonIgnore
    public AiCredentialDTO resetBearerToken() {
        this._reset(FIELD_BEARER_TOKEN);
        return this;
    }

    /**
     * 设置「客户端ID」
     * @param val
     */
    @JsonProperty(FIELD_CLIENT_ID)
    public AiCredentialDTO setClientId(String val) {
        this._set(FIELD_CLIENT_ID, val);
        return this;
    }

    /**
     * 获取「客户端ID」值
     *
     */
    @JsonIgnore
    public String getClientId() {
        return DataTypeUtils.asString(this._get(FIELD_CLIENT_ID), null);
    }

    /**
     * 判断 「客户端ID」是否有值
     *
     */
    @JsonIgnore
    public boolean containsClientId() {
        return this._contains(FIELD_CLIENT_ID);
    }

    /**
     * 重置 「客户端ID」
     *
     */
    @JsonIgnore
    public AiCredentialDTO resetClientId() {
        this._reset(FIELD_CLIENT_ID);
        return this;
    }

    /**
     * 设置「客户端密钥」
     * @param val
     */
    @JsonProperty(FIELD_CLIENT_SECRET)
    public AiCredentialDTO setClientSecret(String val) {
        this._set(FIELD_CLIENT_SECRET, val);
        return this;
    }

    /**
     * 获取「客户端密钥」值
     *
     */
    @JsonIgnore
    public String getClientSecret() {
        return DataTypeUtils.asString(this._get(FIELD_CLIENT_SECRET), null);
    }

    /**
     * 判断 「客户端密钥」是否有值
     *
     */
    @JsonIgnore
    public boolean containsClientSecret() {
        return this._contains(FIELD_CLIENT_SECRET);
    }

    /**
     * 重置 「客户端密钥」
     *
     */
    @JsonIgnore
    public AiCredentialDTO resetClientSecret() {
        this._reset(FIELD_CLIENT_SECRET);
        return this;
    }

    /**
     * 设置「凭证类型」
     * 代码表[凭证类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.credential_type
     * @param val
     */
    @JsonProperty(FIELD_CREDENTIAL_TYPE)
    public AiCredentialDTO setCredentialType(String val) {
        this._set(FIELD_CREDENTIAL_TYPE, val);
        return this;
    }

    /**
     * 获取「凭证类型」值
     * 代码表[凭证类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.credential_type
     *
     */
    @JsonIgnore
    public String getCredentialType() {
        return DataTypeUtils.asString(this._get(FIELD_CREDENTIAL_TYPE), null);
    }

    /**
     * 判断 「凭证类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCredentialType() {
        return this._contains(FIELD_CREDENTIAL_TYPE);
    }

    /**
     * 重置 「凭证类型」
     *
     */
    @JsonIgnore
    public AiCredentialDTO resetCredentialType() {
        this._reset(FIELD_CREDENTIAL_TYPE);
        return this;
    }

    /**
     * 设置「用途说明」
     * @param val
     */
    @JsonProperty(FIELD_DESCRIPTION)
    public AiCredentialDTO setDescription(String val) {
        this._set(FIELD_DESCRIPTION, val);
        return this;
    }

    /**
     * 获取「用途说明」值
     *
     */
    @JsonIgnore
    public String getDescription() {
        return DataTypeUtils.asString(this._get(FIELD_DESCRIPTION), null);
    }

    /**
     * 判断 「用途说明」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDescription() {
        return this._contains(FIELD_DESCRIPTION);
    }

    /**
     * 重置 「用途说明」
     *
     */
    @JsonIgnore
    public AiCredentialDTO resetDescription() {
        this._reset(FIELD_DESCRIPTION);
        return this;
    }

    /**
     * 设置「模型提供商」
     * 代码表[AI模型提供商]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ai_model_provider
     * @param val
     */
    @JsonProperty(FIELD_PROVIDER)
    public AiCredentialDTO setProvider(String val) {
        this._set(FIELD_PROVIDER, val);
        return this;
    }

    /**
     * 获取「模型提供商」值
     * 代码表[AI模型提供商]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ai_model_provider
     *
     */
    @JsonIgnore
    public String getProvider() {
        return DataTypeUtils.asString(this._get(FIELD_PROVIDER), null);
    }

    /**
     * 判断 「模型提供商」是否有值
     *
     */
    @JsonIgnore
    public boolean containsProvider() {
        return this._contains(FIELD_PROVIDER);
    }

    /**
     * 重置 「模型提供商」
     *
     */
    @JsonIgnore
    public AiCredentialDTO resetProvider() {
        this._reset(FIELD_PROVIDER);
        return this;
    }

    /**
     * 设置「区域」
     * @param val
     */
    @JsonProperty(FIELD_REGION)
    public AiCredentialDTO setRegion(String val) {
        this._set(FIELD_REGION, val);
        return this;
    }

    /**
     * 获取「区域」值
     *
     */
    @JsonIgnore
    public String getRegion() {
        return DataTypeUtils.asString(this._get(FIELD_REGION), null);
    }

    /**
     * 判断 「区域」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRegion() {
        return this._contains(FIELD_REGION);
    }

    /**
     * 重置 「区域」
     *
     */
    @JsonIgnore
    public AiCredentialDTO resetRegion() {
        this._reset(FIELD_REGION);
        return this;
    }

    /**
     * 设置「权限范围」
     * @param val
     */
    @JsonProperty(FIELD_SCOPE)
    public AiCredentialDTO setScope(String val) {
        this._set(FIELD_SCOPE, val);
        return this;
    }

    /**
     * 获取「权限范围」值
     *
     */
    @JsonIgnore
    public String getScope() {
        return DataTypeUtils.asString(this._get(FIELD_SCOPE), null);
    }

    /**
     * 判断 「权限范围」是否有值
     *
     */
    @JsonIgnore
    public boolean containsScope() {
        return this._contains(FIELD_SCOPE);
    }

    /**
     * 重置 「权限范围」
     *
     */
    @JsonIgnore
    public AiCredentialDTO resetScope() {
        this._reset(FIELD_SCOPE);
        return this;
    }

    /**
     * 设置「安全密钥」
     * @param val
     */
    @JsonProperty(FIELD_SECRET_KEY)
    public AiCredentialDTO setSecretKey(String val) {
        this._set(FIELD_SECRET_KEY, val);
        return this;
    }

    /**
     * 获取「安全密钥」值
     *
     */
    @JsonIgnore
    public String getSecretKey() {
        return DataTypeUtils.asString(this._get(FIELD_SECRET_KEY), null);
    }

    /**
     * 判断 「安全密钥」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSecretKey() {
        return this._contains(FIELD_SECRET_KEY);
    }

    /**
     * 重置 「安全密钥」
     *
     */
    @JsonIgnore
    public AiCredentialDTO resetSecretKey() {
        this._reset(FIELD_SECRET_KEY);
        return this;
    }

    /**
     * 设置「令牌地址」
     * @param val
     */
    @JsonProperty(FIELD_TOKEN_URL)
    public AiCredentialDTO setTokenUrl(String val) {
        this._set(FIELD_TOKEN_URL, val);
        return this;
    }

    /**
     * 获取「令牌地址」值
     *
     */
    @JsonIgnore
    public String getTokenUrl() {
        return DataTypeUtils.asString(this._get(FIELD_TOKEN_URL), null);
    }

    /**
     * 判断 「令牌地址」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTokenUrl() {
        return this._contains(FIELD_TOKEN_URL);
    }

    /**
     * 重置 「令牌地址」
     *
     */
    @JsonIgnore
    public AiCredentialDTO resetTokenUrl() {
        this._reset(FIELD_TOKEN_URL);
        return this;
    }

}
