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


public class AiModelDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 模型标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 模型名称
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
     * 属性: 是否启用该模型
     */
    public final static String FIELD_ACTIVE = "active";

    /**
     * 属性: 模型提供商
     */
    public final static String FIELD_PROVIDER = "provider";

    /**
     * 属性: 模型 API 地址
     */
    public final static String FIELD_API_BASE_URL = "api_base_url";

    /**
     * 属性: 模型类别
     */
    public final static String FIELD_MODEL_CATEGORY = "model_category";

    /**
     * 属性: 模型能力
     */
    public final static String FIELD_MODEL_CAPABILITY = "model_capability";

    /**
     * 属性: 最大上下文长度（token）
     */
    public final static String FIELD_MAX_CONTEXT_TOKENS = "max_context_tokens";

    /**
     * 属性: 最大输出长度
     */
    public final static String FIELD_MAX_OUTPUT_TOKENS = "max_output_tokens";

    /**
     * 属性: 模型额外参数
     */
    public final static String FIELD_EXTRA_PARAMS = "extra_params";

    /**
     * 设置「模型标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public AiModelDTO setId(String val) {
        this._set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「模型标识」值
     *
     */
    @JsonIgnore
    public String getId() {
        return DataTypeUtils.asString(this._get(FIELD_ID), null);
    }

    /**
     * 判断 「模型标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsId() {
        return this._contains(FIELD_ID);
    }

    /**
     * 重置 「模型标识」
     *
     */
    @JsonIgnore
    public AiModelDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「模型名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public AiModelDTO setName(String val) {
        this._set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「模型名称」值
     *
     */
    @JsonIgnore
    public String getName() {
        return DataTypeUtils.asString(this._get(FIELD_NAME), null);
    }

    /**
     * 判断 「模型名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsName() {
        return this._contains(FIELD_NAME);
    }

    /**
     * 重置 「模型名称」
     *
     */
    @JsonIgnore
    public AiModelDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「建立人」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_MAN)
    public AiModelDTO setCreateMan(String val) {
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
    public AiModelDTO resetCreateMan() {
        this._reset(FIELD_CREATE_MAN);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_TIME)
    public AiModelDTO setCreateTime(Timestamp val) {
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
    public AiModelDTO resetCreateTime() {
        this._reset(FIELD_CREATE_TIME);
        return this;
    }

    /**
     * 设置「更新人」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_MAN)
    public AiModelDTO setUpdateMan(String val) {
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
    public AiModelDTO resetUpdateMan() {
        this._reset(FIELD_UPDATE_MAN);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_TIME)
    public AiModelDTO setUpdateTime(Timestamp val) {
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
    public AiModelDTO resetUpdateTime() {
        this._reset(FIELD_UPDATE_TIME);
        return this;
    }

    /**
     * 设置「是否启用该模型」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ACTIVE)
    public AiModelDTO setActive(Integer val) {
        this._set(FIELD_ACTIVE, val);
        return this;
    }

    /**
     * 获取「是否启用该模型」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getActive() {
        return DataTypeUtils.asInteger(this._get(FIELD_ACTIVE), null);
    }

    /**
     * 判断 「是否启用该模型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActive() {
        return this._contains(FIELD_ACTIVE);
    }

    /**
     * 重置 「是否启用该模型」
     *
     */
    @JsonIgnore
    public AiModelDTO resetActive() {
        this._reset(FIELD_ACTIVE);
        return this;
    }

    /**
     * 设置「模型提供商」
     * 代码表[AI模型提供商]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ai_model_provider
     * @param val
     */
    @JsonProperty(FIELD_PROVIDER)
    public AiModelDTO setProvider(String val) {
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
    public AiModelDTO resetProvider() {
        this._reset(FIELD_PROVIDER);
        return this;
    }

    /**
     * 设置「模型 API 地址」
     * @param val
     */
    @JsonProperty(FIELD_API_BASE_URL)
    public AiModelDTO setApiBaseUrl(String val) {
        this._set(FIELD_API_BASE_URL, val);
        return this;
    }

    /**
     * 获取「模型 API 地址」值
     *
     */
    @JsonIgnore
    public String getApiBaseUrl() {
        return DataTypeUtils.asString(this._get(FIELD_API_BASE_URL), null);
    }

    /**
     * 判断 「模型 API 地址」是否有值
     *
     */
    @JsonIgnore
    public boolean containsApiBaseUrl() {
        return this._contains(FIELD_API_BASE_URL);
    }

    /**
     * 重置 「模型 API 地址」
     *
     */
    @JsonIgnore
    public AiModelDTO resetApiBaseUrl() {
        this._reset(FIELD_API_BASE_URL);
        return this;
    }

    /**
     * 设置「模型类别」
     * 代码表[模型类别]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.model_category
     * @param val
     */
    @JsonProperty(FIELD_MODEL_CATEGORY)
    public AiModelDTO setModelCategory(String val) {
        this._set(FIELD_MODEL_CATEGORY, val);
        return this;
    }

    /**
     * 获取「模型类别」值
     * 代码表[模型类别]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.model_category
     *
     */
    @JsonIgnore
    public String getModelCategory() {
        return DataTypeUtils.asString(this._get(FIELD_MODEL_CATEGORY), null);
    }

    /**
     * 判断 「模型类别」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModelCategory() {
        return this._contains(FIELD_MODEL_CATEGORY);
    }

    /**
     * 重置 「模型类别」
     *
     */
    @JsonIgnore
    public AiModelDTO resetModelCategory() {
        this._reset(FIELD_MODEL_CATEGORY);
        return this;
    }

    /**
     * 设置「模型能力」
     * 代码表[模型能力]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.model_capability
     * @param val
     */
    @JsonProperty(FIELD_MODEL_CAPABILITY)
    public AiModelDTO setModelCapability(String val) {
        this._set(FIELD_MODEL_CAPABILITY, val);
        return this;
    }

    /**
     * 获取「模型能力」值
     * 代码表[模型能力]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.model_capability
     *
     */
    @JsonIgnore
    public String getModelCapability() {
        return DataTypeUtils.asString(this._get(FIELD_MODEL_CAPABILITY), null);
    }

    /**
     * 判断 「模型能力」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModelCapability() {
        return this._contains(FIELD_MODEL_CAPABILITY);
    }

    /**
     * 重置 「模型能力」
     *
     */
    @JsonIgnore
    public AiModelDTO resetModelCapability() {
        this._reset(FIELD_MODEL_CAPABILITY);
        return this;
    }

    /**
     * 设置「最大上下文长度（token）」
     * @param val
     */
    @JsonProperty(FIELD_MAX_CONTEXT_TOKENS)
    public AiModelDTO setMaxContextTokens(Integer val) {
        this._set(FIELD_MAX_CONTEXT_TOKENS, val);
        return this;
    }

    /**
     * 获取「最大上下文长度（token）」值
     *
     */
    @JsonIgnore
    public Integer getMaxContextTokens() {
        return DataTypeUtils.asInteger(this._get(FIELD_MAX_CONTEXT_TOKENS), null);
    }

    /**
     * 判断 「最大上下文长度（token）」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMaxContextTokens() {
        return this._contains(FIELD_MAX_CONTEXT_TOKENS);
    }

    /**
     * 重置 「最大上下文长度（token）」
     *
     */
    @JsonIgnore
    public AiModelDTO resetMaxContextTokens() {
        this._reset(FIELD_MAX_CONTEXT_TOKENS);
        return this;
    }

    /**
     * 设置「最大输出长度」
     * @param val
     */
    @JsonProperty(FIELD_MAX_OUTPUT_TOKENS)
    public AiModelDTO setMaxOutputTokens(Integer val) {
        this._set(FIELD_MAX_OUTPUT_TOKENS, val);
        return this;
    }

    /**
     * 获取「最大输出长度」值
     *
     */
    @JsonIgnore
    public Integer getMaxOutputTokens() {
        return DataTypeUtils.asInteger(this._get(FIELD_MAX_OUTPUT_TOKENS), null);
    }

    /**
     * 判断 「最大输出长度」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMaxOutputTokens() {
        return this._contains(FIELD_MAX_OUTPUT_TOKENS);
    }

    /**
     * 重置 「最大输出长度」
     *
     */
    @JsonIgnore
    public AiModelDTO resetMaxOutputTokens() {
        this._reset(FIELD_MAX_OUTPUT_TOKENS);
        return this;
    }

    /**
     * 设置「模型额外参数」
     * @param val
     */
    @JsonProperty(FIELD_EXTRA_PARAMS)
    public AiModelDTO setExtraParams(String val) {
        this._set(FIELD_EXTRA_PARAMS, val);
        return this;
    }

    /**
     * 获取「模型额外参数」值
     *
     */
    @JsonIgnore
    public String getExtraParams() {
        return DataTypeUtils.asString(this._get(FIELD_EXTRA_PARAMS), null);
    }

    /**
     * 判断 「模型额外参数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsExtraParams() {
        return this._contains(FIELD_EXTRA_PARAMS);
    }

    /**
     * 重置 「模型额外参数」
     *
     */
    @JsonIgnore
    public AiModelDTO resetExtraParams() {
        this._reset(FIELD_EXTRA_PARAMS);
        return this;
    }

}
