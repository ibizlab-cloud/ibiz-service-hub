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


public class AiToolDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: AI调用工具标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: AI调用工具名称
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
     * 属性: 认证方式
     */
    public final static String FIELD_API_AUTH_TYPE = "api_auth_type";

    /**
     * 属性: 请求头
     */
    public final static String FIELD_API_HEADERS = "api_headers";

    /**
     * 属性: HTTP 方法
     */
    public final static String FIELD_API_METHOD = "api_method";

    /**
     * 属性: 接口地址
     */
    public final static String FIELD_API_URL = "api_url";

    /**
     * 属性: 输入参数 Schema
     */
    public final static String FIELD_INPUT_SCHEMA = "input_schema";

    /**
     * 属性: 超时时间
     */
    public final static String FIELD_TIMEOUT = "timeout";

    /**
     * 属性: 工具类型
     */
    public final static String FIELD_TOOL_TYPE = "tool_type";

    /**
     * 设置「AI调用工具标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public AiToolDTO setId(String val) {
        this._set(FIELD_ID, val);
        return this;
    }

    /**
     * 获取「AI调用工具标识」值
     *
     */
    @JsonIgnore
    public String getId() {
        return DataTypeUtils.asString(this._get(FIELD_ID), null);
    }

    /**
     * 判断 「AI调用工具标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsId() {
        return this._contains(FIELD_ID);
    }

    /**
     * 重置 「AI调用工具标识」
     *
     */
    @JsonIgnore
    public AiToolDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「AI调用工具名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public AiToolDTO setName(String val) {
        this._set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「AI调用工具名称」值
     *
     */
    @JsonIgnore
    public String getName() {
        return DataTypeUtils.asString(this._get(FIELD_NAME), null);
    }

    /**
     * 判断 「AI调用工具名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsName() {
        return this._contains(FIELD_NAME);
    }

    /**
     * 重置 「AI调用工具名称」
     *
     */
    @JsonIgnore
    public AiToolDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「建立人」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_MAN)
    public AiToolDTO setCreateMan(String val) {
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
    public AiToolDTO resetCreateMan() {
        this._reset(FIELD_CREATE_MAN);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_TIME)
    public AiToolDTO setCreateTime(Timestamp val) {
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
    public AiToolDTO resetCreateTime() {
        this._reset(FIELD_CREATE_TIME);
        return this;
    }

    /**
     * 设置「更新人」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_MAN)
    public AiToolDTO setUpdateMan(String val) {
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
    public AiToolDTO resetUpdateMan() {
        this._reset(FIELD_UPDATE_MAN);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_TIME)
    public AiToolDTO setUpdateTime(Timestamp val) {
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
    public AiToolDTO resetUpdateTime() {
        this._reset(FIELD_UPDATE_TIME);
        return this;
    }

    /**
     * 设置「认证方式」
     * 代码表[认证方式]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.api_auth_type_codelist
     * @param val
     */
    @JsonProperty(FIELD_API_AUTH_TYPE)
    public AiToolDTO setApiAuthType(String val) {
        this._set(FIELD_API_AUTH_TYPE, val);
        return this;
    }

    /**
     * 获取「认证方式」值
     * 代码表[认证方式]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.api_auth_type_codelist
     *
     */
    @JsonIgnore
    public String getApiAuthType() {
        return DataTypeUtils.asString(this._get(FIELD_API_AUTH_TYPE), null);
    }

    /**
     * 判断 「认证方式」是否有值
     *
     */
    @JsonIgnore
    public boolean containsApiAuthType() {
        return this._contains(FIELD_API_AUTH_TYPE);
    }

    /**
     * 重置 「认证方式」
     *
     */
    @JsonIgnore
    public AiToolDTO resetApiAuthType() {
        this._reset(FIELD_API_AUTH_TYPE);
        return this;
    }

    /**
     * 设置「请求头」
     * @param val
     */
    @JsonProperty(FIELD_API_HEADERS)
    public AiToolDTO setApiHeaders(String val) {
        this._set(FIELD_API_HEADERS, val);
        return this;
    }

    /**
     * 获取「请求头」值
     *
     */
    @JsonIgnore
    public String getApiHeaders() {
        return DataTypeUtils.asString(this._get(FIELD_API_HEADERS), null);
    }

    /**
     * 判断 「请求头」是否有值
     *
     */
    @JsonIgnore
    public boolean containsApiHeaders() {
        return this._contains(FIELD_API_HEADERS);
    }

    /**
     * 重置 「请求头」
     *
     */
    @JsonIgnore
    public AiToolDTO resetApiHeaders() {
        this._reset(FIELD_API_HEADERS);
        return this;
    }

    /**
     * 设置「HTTP 方法」
     * 代码表[HTTP 方法]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.api_method_codelist
     * @param val
     */
    @JsonProperty(FIELD_API_METHOD)
    public AiToolDTO setApiMethod(String val) {
        this._set(FIELD_API_METHOD, val);
        return this;
    }

    /**
     * 获取「HTTP 方法」值
     * 代码表[HTTP 方法]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.api_method_codelist
     *
     */
    @JsonIgnore
    public String getApiMethod() {
        return DataTypeUtils.asString(this._get(FIELD_API_METHOD), null);
    }

    /**
     * 判断 「HTTP 方法」是否有值
     *
     */
    @JsonIgnore
    public boolean containsApiMethod() {
        return this._contains(FIELD_API_METHOD);
    }

    /**
     * 重置 「HTTP 方法」
     *
     */
    @JsonIgnore
    public AiToolDTO resetApiMethod() {
        this._reset(FIELD_API_METHOD);
        return this;
    }

    /**
     * 设置「接口地址」
     * @param val
     */
    @JsonProperty(FIELD_API_URL)
    public AiToolDTO setApiUrl(String val) {
        this._set(FIELD_API_URL, val);
        return this;
    }

    /**
     * 获取「接口地址」值
     *
     */
    @JsonIgnore
    public String getApiUrl() {
        return DataTypeUtils.asString(this._get(FIELD_API_URL), null);
    }

    /**
     * 判断 「接口地址」是否有值
     *
     */
    @JsonIgnore
    public boolean containsApiUrl() {
        return this._contains(FIELD_API_URL);
    }

    /**
     * 重置 「接口地址」
     *
     */
    @JsonIgnore
    public AiToolDTO resetApiUrl() {
        this._reset(FIELD_API_URL);
        return this;
    }

    /**
     * 设置「输入参数 Schema」
     * @param val
     */
    @JsonProperty(FIELD_INPUT_SCHEMA)
    public AiToolDTO setInputSchema(String val) {
        this._set(FIELD_INPUT_SCHEMA, val);
        return this;
    }

    /**
     * 获取「输入参数 Schema」值
     *
     */
    @JsonIgnore
    public String getInputSchema() {
        return DataTypeUtils.asString(this._get(FIELD_INPUT_SCHEMA), null);
    }

    /**
     * 判断 「输入参数 Schema」是否有值
     *
     */
    @JsonIgnore
    public boolean containsInputSchema() {
        return this._contains(FIELD_INPUT_SCHEMA);
    }

    /**
     * 重置 「输入参数 Schema」
     *
     */
    @JsonIgnore
    public AiToolDTO resetInputSchema() {
        this._reset(FIELD_INPUT_SCHEMA);
        return this;
    }

    /**
     * 设置「超时时间」
     * @param val
     */
    @JsonProperty(FIELD_TIMEOUT)
    public AiToolDTO setTimeout(Integer val) {
        this._set(FIELD_TIMEOUT, val);
        return this;
    }

    /**
     * 获取「超时时间」值
     *
     */
    @JsonIgnore
    public Integer getTimeout() {
        return DataTypeUtils.asInteger(this._get(FIELD_TIMEOUT), null);
    }

    /**
     * 判断 「超时时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTimeout() {
        return this._contains(FIELD_TIMEOUT);
    }

    /**
     * 重置 「超时时间」
     *
     */
    @JsonIgnore
    public AiToolDTO resetTimeout() {
        this._reset(FIELD_TIMEOUT);
        return this;
    }

    /**
     * 设置「工具类型」
     * 代码表[Tool类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.tool_type_codelist
     * @param val
     */
    @JsonProperty(FIELD_TOOL_TYPE)
    public AiToolDTO setToolType(String val) {
        this._set(FIELD_TOOL_TYPE, val);
        return this;
    }

    /**
     * 获取「工具类型」值
     * 代码表[Tool类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.tool_type_codelist
     *
     */
    @JsonIgnore
    public String getToolType() {
        return DataTypeUtils.asString(this._get(FIELD_TOOL_TYPE), null);
    }

    /**
     * 判断 「工具类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsToolType() {
        return this._contains(FIELD_TOOL_TYPE);
    }

    /**
     * 重置 「工具类型」
     *
     */
    @JsonIgnore
    public AiToolDTO resetToolType() {
        this._reset(FIELD_TOOL_TYPE);
        return this;
    }

}
