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


public class FetchmailServerDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 创建新记录
     */
    public final static String FIELD_OBJECT_ID = "object_id";

    /**
     * 属性: 有效
     */
    public final static String FIELD_ACTIVE = "active";

    /**
     * 属性: 保存附件
     */
    public final static String FIELD_ATTACH = "attach";

    /**
     * 属性: 配置
     */
    public final static String FIELD_CONFIGURATION = "configuration";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 最后收取日期
     */
    public final static String FIELD_DATE = "date";

    /**
     * 属性: 访问令牌
     */
    public final static String FIELD_GOOGLE_GMAIL_ACCESS_TOKEN = "google_gmail_access_token";

    /**
     * 属性: 访问令牌到期时间戳
     */
    public final static String FIELD_GOOGLE_GMAIL_ACCESS_TOKEN_EXPIRATION = "google_gmail_access_token_expiration";

    /**
     * 属性: 授权码
     */
    public final static String FIELD_GOOGLE_GMAIL_AUTHORIZATION_CODE = "google_gmail_authorization_code";

    /**
     * 属性: 更新 Token
     */
    public final static String FIELD_GOOGLE_GMAIL_REFRESH_TOKEN = "google_gmail_refresh_token";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: SSL/TLS
     */
    public final static String FIELD_IS_SSL = "is_ssl";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 保留原件
     */
    public final static String FIELD_ORIGINAL = "original";

    /**
     * 属性: 密码
     */
    public final static String FIELD_PASSWORD = "password";

    /**
     * 属性: 端口
     */
    public final static String FIELD_PORT = "port";

    /**
     * 属性: 服务器优先级
     */
    public final static String FIELD_PRIORITY = "priority";

    /**
     * 属性: 脚本
     */
    public final static String FIELD_SCRIPT = "script";

    /**
     * 属性: 服务器名称
     */
    public final static String FIELD_SERVER = "server";

    /**
     * 属性: 服务器类型
     */
    public final static String FIELD_SERVER_TYPE = "server_type";

    /**
     * 属性: 状态
     */
    public final static String FIELD_STATE = "state";

    /**
     * 属性: 用户名
     */
    public final static String FIELD_USER = "user";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「创建新记录」
     * 代码表[模型]
     * @param val
     */
    @JsonProperty(FIELD_OBJECT_ID)
    public FetchmailServerDTO setObjectId(String val) {
        this._set(FIELD_OBJECT_ID, val);
        return this;
    }

    /**
     * 获取「创建新记录」值
     * 代码表[模型]
     *
     */
    @JsonIgnore
    public String getObjectId() {
        return DataTypeUtils.asString(this._get(FIELD_OBJECT_ID), null);
    }

    /**
     * 判断 「创建新记录」是否有值
     *
     */
    @JsonIgnore
    public boolean containsObjectId() {
        return this._contains(FIELD_OBJECT_ID);
    }

    /**
     * 重置 「创建新记录」
     *
     */
    @JsonIgnore
    public FetchmailServerDTO resetObjectId() {
        this._reset(FIELD_OBJECT_ID);
        return this;
    }

    /**
     * 设置「有效」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ACTIVE)
    public FetchmailServerDTO setActive(Integer val) {
        this._set(FIELD_ACTIVE, val);
        return this;
    }

    /**
     * 获取「有效」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getActive() {
        return DataTypeUtils.asInteger(this._get(FIELD_ACTIVE), null);
    }

    /**
     * 判断 「有效」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActive() {
        return this._contains(FIELD_ACTIVE);
    }

    /**
     * 重置 「有效」
     *
     */
    @JsonIgnore
    public FetchmailServerDTO resetActive() {
        this._reset(FIELD_ACTIVE);
        return this;
    }

    /**
     * 设置「保存附件」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ATTACH)
    public FetchmailServerDTO setAttach(Integer val) {
        this._set(FIELD_ATTACH, val);
        return this;
    }

    /**
     * 获取「保存附件」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getAttach() {
        return DataTypeUtils.asInteger(this._get(FIELD_ATTACH), null);
    }

    /**
     * 判断 「保存附件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAttach() {
        return this._contains(FIELD_ATTACH);
    }

    /**
     * 重置 「保存附件」
     *
     */
    @JsonIgnore
    public FetchmailServerDTO resetAttach() {
        this._reset(FIELD_ATTACH);
        return this;
    }

    /**
     * 设置「配置」
     * @param val
     */
    @JsonProperty(FIELD_CONFIGURATION)
    public FetchmailServerDTO setConfiguration(String val) {
        this._set(FIELD_CONFIGURATION, val);
        return this;
    }

    /**
     * 获取「配置」值
     *
     */
    @JsonIgnore
    public String getConfiguration() {
        return DataTypeUtils.asString(this._get(FIELD_CONFIGURATION), null);
    }

    /**
     * 判断 「配置」是否有值
     *
     */
    @JsonIgnore
    public boolean containsConfiguration() {
        return this._contains(FIELD_CONFIGURATION);
    }

    /**
     * 重置 「配置」
     *
     */
    @JsonIgnore
    public FetchmailServerDTO resetConfiguration() {
        this._reset(FIELD_CONFIGURATION);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public FetchmailServerDTO setCreateDate(Timestamp val) {
        this._set(FIELD_CREATE_DATE, val);
        return this;
    }

    /**
     * 获取「建立时间」值
     *
     */
    @JsonIgnore
    public Timestamp getCreateDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_CREATE_DATE), null);
    }

    /**
     * 判断 「建立时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCreateDate() {
        return this._contains(FIELD_CREATE_DATE);
    }

    /**
     * 重置 「建立时间」
     *
     */
    @JsonIgnore
    public FetchmailServerDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public FetchmailServerDTO setCreateUid(String val) {
        this._set(FIELD_CREATE_UID, val);
        return this;
    }

    /**
     * 获取「建立人」值
     * 代码表[云系统操作者]
     *
     */
    @JsonIgnore
    public String getCreateUid() {
        return DataTypeUtils.asString(this._get(FIELD_CREATE_UID), null);
    }

    /**
     * 判断 「建立人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCreateUid() {
        return this._contains(FIELD_CREATE_UID);
    }

    /**
     * 重置 「建立人」
     *
     */
    @JsonIgnore
    public FetchmailServerDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「最后收取日期」
     * @param val
     */
    @JsonProperty(FIELD_DATE)
    public FetchmailServerDTO setDate(Timestamp val) {
        this._set(FIELD_DATE, val);
        return this;
    }

    /**
     * 获取「最后收取日期」值
     *
     */
    @JsonIgnore
    public Timestamp getDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_DATE), null);
    }

    /**
     * 判断 「最后收取日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDate() {
        return this._contains(FIELD_DATE);
    }

    /**
     * 重置 「最后收取日期」
     *
     */
    @JsonIgnore
    public FetchmailServerDTO resetDate() {
        this._reset(FIELD_DATE);
        return this;
    }

    /**
     * 设置「访问令牌」
     * @param val
     */
    @JsonProperty(FIELD_GOOGLE_GMAIL_ACCESS_TOKEN)
    public FetchmailServerDTO setGoogleGmailAccessToken(String val) {
        this._set(FIELD_GOOGLE_GMAIL_ACCESS_TOKEN, val);
        return this;
    }

    /**
     * 获取「访问令牌」值
     *
     */
    @JsonIgnore
    public String getGoogleGmailAccessToken() {
        return DataTypeUtils.asString(this._get(FIELD_GOOGLE_GMAIL_ACCESS_TOKEN), null);
    }

    /**
     * 判断 「访问令牌」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGoogleGmailAccessToken() {
        return this._contains(FIELD_GOOGLE_GMAIL_ACCESS_TOKEN);
    }

    /**
     * 重置 「访问令牌」
     *
     */
    @JsonIgnore
    public FetchmailServerDTO resetGoogleGmailAccessToken() {
        this._reset(FIELD_GOOGLE_GMAIL_ACCESS_TOKEN);
        return this;
    }

    /**
     * 设置「访问令牌到期时间戳」
     * @param val
     */
    @JsonProperty(FIELD_GOOGLE_GMAIL_ACCESS_TOKEN_EXPIRATION)
    public FetchmailServerDTO setGoogleGmailAccessTokenExpiration(Integer val) {
        this._set(FIELD_GOOGLE_GMAIL_ACCESS_TOKEN_EXPIRATION, val);
        return this;
    }

    /**
     * 获取「访问令牌到期时间戳」值
     *
     */
    @JsonIgnore
    public Integer getGoogleGmailAccessTokenExpiration() {
        return DataTypeUtils.asInteger(this._get(FIELD_GOOGLE_GMAIL_ACCESS_TOKEN_EXPIRATION), null);
    }

    /**
     * 判断 「访问令牌到期时间戳」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGoogleGmailAccessTokenExpiration() {
        return this._contains(FIELD_GOOGLE_GMAIL_ACCESS_TOKEN_EXPIRATION);
    }

    /**
     * 重置 「访问令牌到期时间戳」
     *
     */
    @JsonIgnore
    public FetchmailServerDTO resetGoogleGmailAccessTokenExpiration() {
        this._reset(FIELD_GOOGLE_GMAIL_ACCESS_TOKEN_EXPIRATION);
        return this;
    }

    /**
     * 设置「授权码」
     * @param val
     */
    @JsonProperty(FIELD_GOOGLE_GMAIL_AUTHORIZATION_CODE)
    public FetchmailServerDTO setGoogleGmailAuthorizationCode(String val) {
        this._set(FIELD_GOOGLE_GMAIL_AUTHORIZATION_CODE, val);
        return this;
    }

    /**
     * 获取「授权码」值
     *
     */
    @JsonIgnore
    public String getGoogleGmailAuthorizationCode() {
        return DataTypeUtils.asString(this._get(FIELD_GOOGLE_GMAIL_AUTHORIZATION_CODE), null);
    }

    /**
     * 判断 「授权码」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGoogleGmailAuthorizationCode() {
        return this._contains(FIELD_GOOGLE_GMAIL_AUTHORIZATION_CODE);
    }

    /**
     * 重置 「授权码」
     *
     */
    @JsonIgnore
    public FetchmailServerDTO resetGoogleGmailAuthorizationCode() {
        this._reset(FIELD_GOOGLE_GMAIL_AUTHORIZATION_CODE);
        return this;
    }

    /**
     * 设置「更新 Token」
     * @param val
     */
    @JsonProperty(FIELD_GOOGLE_GMAIL_REFRESH_TOKEN)
    public FetchmailServerDTO setGoogleGmailRefreshToken(String val) {
        this._set(FIELD_GOOGLE_GMAIL_REFRESH_TOKEN, val);
        return this;
    }

    /**
     * 获取「更新 Token」值
     *
     */
    @JsonIgnore
    public String getGoogleGmailRefreshToken() {
        return DataTypeUtils.asString(this._get(FIELD_GOOGLE_GMAIL_REFRESH_TOKEN), null);
    }

    /**
     * 判断 「更新 Token」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGoogleGmailRefreshToken() {
        return this._contains(FIELD_GOOGLE_GMAIL_REFRESH_TOKEN);
    }

    /**
     * 重置 「更新 Token」
     *
     */
    @JsonIgnore
    public FetchmailServerDTO resetGoogleGmailRefreshToken() {
        this._reset(FIELD_GOOGLE_GMAIL_REFRESH_TOKEN);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public FetchmailServerDTO setId(String val) {
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
    public FetchmailServerDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「SSL/TLS」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_SSL)
    public FetchmailServerDTO setIsSsl(Integer val) {
        this._set(FIELD_IS_SSL, val);
        return this;
    }

    /**
     * 获取「SSL/TLS」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsSsl() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_SSL), null);
    }

    /**
     * 判断 「SSL/TLS」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsSsl() {
        return this._contains(FIELD_IS_SSL);
    }

    /**
     * 重置 「SSL/TLS」
     *
     */
    @JsonIgnore
    public FetchmailServerDTO resetIsSsl() {
        this._reset(FIELD_IS_SSL);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public FetchmailServerDTO setName(String val) {
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
    public FetchmailServerDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「保留原件」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ORIGINAL)
    public FetchmailServerDTO setOriginal(Integer val) {
        this._set(FIELD_ORIGINAL, val);
        return this;
    }

    /**
     * 获取「保留原件」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getOriginal() {
        return DataTypeUtils.asInteger(this._get(FIELD_ORIGINAL), null);
    }

    /**
     * 判断 「保留原件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOriginal() {
        return this._contains(FIELD_ORIGINAL);
    }

    /**
     * 重置 「保留原件」
     *
     */
    @JsonIgnore
    public FetchmailServerDTO resetOriginal() {
        this._reset(FIELD_ORIGINAL);
        return this;
    }

    /**
     * 设置「密码」
     * @param val
     */
    @JsonProperty(FIELD_PASSWORD)
    public FetchmailServerDTO setPassword(String val) {
        this._set(FIELD_PASSWORD, val);
        return this;
    }

    /**
     * 获取「密码」值
     *
     */
    @JsonIgnore
    public String getPassword() {
        return DataTypeUtils.asString(this._get(FIELD_PASSWORD), null);
    }

    /**
     * 判断 「密码」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPassword() {
        return this._contains(FIELD_PASSWORD);
    }

    /**
     * 重置 「密码」
     *
     */
    @JsonIgnore
    public FetchmailServerDTO resetPassword() {
        this._reset(FIELD_PASSWORD);
        return this;
    }

    /**
     * 设置「端口」
     * @param val
     */
    @JsonProperty(FIELD_PORT)
    public FetchmailServerDTO setPort(Integer val) {
        this._set(FIELD_PORT, val);
        return this;
    }

    /**
     * 获取「端口」值
     *
     */
    @JsonIgnore
    public Integer getPort() {
        return DataTypeUtils.asInteger(this._get(FIELD_PORT), null);
    }

    /**
     * 判断 「端口」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPort() {
        return this._contains(FIELD_PORT);
    }

    /**
     * 重置 「端口」
     *
     */
    @JsonIgnore
    public FetchmailServerDTO resetPort() {
        this._reset(FIELD_PORT);
        return this;
    }

    /**
     * 设置「服务器优先级」
     * @param val
     */
    @JsonProperty(FIELD_PRIORITY)
    public FetchmailServerDTO setPriority(Integer val) {
        this._set(FIELD_PRIORITY, val);
        return this;
    }

    /**
     * 获取「服务器优先级」值
     *
     */
    @JsonIgnore
    public Integer getPriority() {
        return DataTypeUtils.asInteger(this._get(FIELD_PRIORITY), null);
    }

    /**
     * 判断 「服务器优先级」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPriority() {
        return this._contains(FIELD_PRIORITY);
    }

    /**
     * 重置 「服务器优先级」
     *
     */
    @JsonIgnore
    public FetchmailServerDTO resetPriority() {
        this._reset(FIELD_PRIORITY);
        return this;
    }

    /**
     * 设置「脚本」
     * @param val
     */
    @JsonProperty(FIELD_SCRIPT)
    public FetchmailServerDTO setScript(String val) {
        this._set(FIELD_SCRIPT, val);
        return this;
    }

    /**
     * 获取「脚本」值
     *
     */
    @JsonIgnore
    public String getScript() {
        return DataTypeUtils.asString(this._get(FIELD_SCRIPT), null);
    }

    /**
     * 判断 「脚本」是否有值
     *
     */
    @JsonIgnore
    public boolean containsScript() {
        return this._contains(FIELD_SCRIPT);
    }

    /**
     * 重置 「脚本」
     *
     */
    @JsonIgnore
    public FetchmailServerDTO resetScript() {
        this._reset(FIELD_SCRIPT);
        return this;
    }

    /**
     * 设置「服务器名称」
     * @param val
     */
    @JsonProperty(FIELD_SERVER)
    public FetchmailServerDTO setServer(String val) {
        this._set(FIELD_SERVER, val);
        return this;
    }

    /**
     * 获取「服务器名称」值
     *
     */
    @JsonIgnore
    public String getServer() {
        return DataTypeUtils.asString(this._get(FIELD_SERVER), null);
    }

    /**
     * 判断 「服务器名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsServer() {
        return this._contains(FIELD_SERVER);
    }

    /**
     * 重置 「服务器名称」
     *
     */
    @JsonIgnore
    public FetchmailServerDTO resetServer() {
        this._reset(FIELD_SERVER);
        return this;
    }

    /**
     * 设置「服务器类型」
     * 代码表[服务器类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.fetchmail_server_server_type
     * @param val
     */
    @JsonProperty(FIELD_SERVER_TYPE)
    public FetchmailServerDTO setServerType(String val) {
        this._set(FIELD_SERVER_TYPE, val);
        return this;
    }

    /**
     * 获取「服务器类型」值
     * 代码表[服务器类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.fetchmail_server_server_type
     *
     */
    @JsonIgnore
    public String getServerType() {
        return DataTypeUtils.asString(this._get(FIELD_SERVER_TYPE), null);
    }

    /**
     * 判断 「服务器类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsServerType() {
        return this._contains(FIELD_SERVER_TYPE);
    }

    /**
     * 重置 「服务器类型」
     *
     */
    @JsonIgnore
    public FetchmailServerDTO resetServerType() {
        this._reset(FIELD_SERVER_TYPE);
        return this;
    }

    /**
     * 设置「状态」
     * 代码表[状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.fetchmail_server_state
     * @param val
     */
    @JsonProperty(FIELD_STATE)
    public FetchmailServerDTO setState(String val) {
        this._set(FIELD_STATE, val);
        return this;
    }

    /**
     * 获取「状态」值
     * 代码表[状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.fetchmail_server_state
     *
     */
    @JsonIgnore
    public String getState() {
        return DataTypeUtils.asString(this._get(FIELD_STATE), null);
    }

    /**
     * 判断 「状态」是否有值
     *
     */
    @JsonIgnore
    public boolean containsState() {
        return this._contains(FIELD_STATE);
    }

    /**
     * 重置 「状态」
     *
     */
    @JsonIgnore
    public FetchmailServerDTO resetState() {
        this._reset(FIELD_STATE);
        return this;
    }

    /**
     * 设置「用户名」
     * @param val
     */
    @JsonProperty(FIELD_USER)
    public FetchmailServerDTO setUser(String val) {
        this._set(FIELD_USER, val);
        return this;
    }

    /**
     * 获取「用户名」值
     *
     */
    @JsonIgnore
    public String getUser() {
        return DataTypeUtils.asString(this._get(FIELD_USER), null);
    }

    /**
     * 判断 「用户名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUser() {
        return this._contains(FIELD_USER);
    }

    /**
     * 重置 「用户名」
     *
     */
    @JsonIgnore
    public FetchmailServerDTO resetUser() {
        this._reset(FIELD_USER);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public FetchmailServerDTO setWriteDate(Timestamp val) {
        this._set(FIELD_WRITE_DATE, val);
        return this;
    }

    /**
     * 获取「更新时间」值
     *
     */
    @JsonIgnore
    public Timestamp getWriteDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_WRITE_DATE), null);
    }

    /**
     * 判断 「更新时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWriteDate() {
        return this._contains(FIELD_WRITE_DATE);
    }

    /**
     * 重置 「更新时间」
     *
     */
    @JsonIgnore
    public FetchmailServerDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public FetchmailServerDTO setWriteUid(String val) {
        this._set(FIELD_WRITE_UID, val);
        return this;
    }

    /**
     * 获取「更新人」值
     * 代码表[云系统操作者]
     *
     */
    @JsonIgnore
    public String getWriteUid() {
        return DataTypeUtils.asString(this._get(FIELD_WRITE_UID), null);
    }

    /**
     * 判断 「更新人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWriteUid() {
        return this._contains(FIELD_WRITE_UID);
    }

    /**
     * 重置 「更新人」
     *
     */
    @JsonIgnore
    public FetchmailServerDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
