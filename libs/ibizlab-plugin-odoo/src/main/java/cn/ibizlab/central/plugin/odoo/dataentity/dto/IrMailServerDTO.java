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


public class IrMailServerDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 有效
     */
    public final static String FIELD_ACTIVE = "active";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: FROM 过滤
     */
    public final static String FIELD_FROM_FILTER = "from_filter";

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
     * 属性: 最大电子邮件大小
     */
    public final static String FIELD_MAX_EMAIL_SIZE = "max_email_size";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 优先级
     */
    public final static String FIELD_SEQUENCE = "sequence";

    /**
     * 属性: 验证
     */
    public final static String FIELD_SMTP_AUTHENTICATION = "smtp_authentication";

    /**
     * 属性: 调试
     */
    public final static String FIELD_SMTP_DEBUG = "smtp_debug";

    /**
     * 属性: 连接加密
     */
    public final static String FIELD_SMTP_ENCRYPTION = "smtp_encryption";

    /**
     * 属性: SMTP服务器
     */
    public final static String FIELD_SMTP_HOST = "smtp_host";

    /**
     * 属性: 密码
     */
    public final static String FIELD_SMTP_PASS = "smtp_pass";

    /**
     * 属性: SMTP端口
     */
    public final static String FIELD_SMTP_PORT = "smtp_port";

    /**
     * 属性: 用户名
     */
    public final static String FIELD_SMTP_USER = "smtp_user";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「有效」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ACTIVE)
    public IrMailServerDTO setActive(Integer val) {
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
    public IrMailServerDTO resetActive() {
        this._reset(FIELD_ACTIVE);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public IrMailServerDTO setCreateDate(Timestamp val) {
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
    public IrMailServerDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public IrMailServerDTO setCreateUid(String val) {
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
    public IrMailServerDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「FROM 过滤」
     * @param val
     */
    @JsonProperty(FIELD_FROM_FILTER)
    public IrMailServerDTO setFromFilter(String val) {
        this._set(FIELD_FROM_FILTER, val);
        return this;
    }

    /**
     * 获取「FROM 过滤」值
     *
     */
    @JsonIgnore
    public String getFromFilter() {
        return DataTypeUtils.asString(this._get(FIELD_FROM_FILTER), null);
    }

    /**
     * 判断 「FROM 过滤」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFromFilter() {
        return this._contains(FIELD_FROM_FILTER);
    }

    /**
     * 重置 「FROM 过滤」
     *
     */
    @JsonIgnore
    public IrMailServerDTO resetFromFilter() {
        this._reset(FIELD_FROM_FILTER);
        return this;
    }

    /**
     * 设置「访问令牌」
     * @param val
     */
    @JsonProperty(FIELD_GOOGLE_GMAIL_ACCESS_TOKEN)
    public IrMailServerDTO setGoogleGmailAccessToken(String val) {
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
    public IrMailServerDTO resetGoogleGmailAccessToken() {
        this._reset(FIELD_GOOGLE_GMAIL_ACCESS_TOKEN);
        return this;
    }

    /**
     * 设置「访问令牌到期时间戳」
     * @param val
     */
    @JsonProperty(FIELD_GOOGLE_GMAIL_ACCESS_TOKEN_EXPIRATION)
    public IrMailServerDTO setGoogleGmailAccessTokenExpiration(Integer val) {
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
    public IrMailServerDTO resetGoogleGmailAccessTokenExpiration() {
        this._reset(FIELD_GOOGLE_GMAIL_ACCESS_TOKEN_EXPIRATION);
        return this;
    }

    /**
     * 设置「授权码」
     * @param val
     */
    @JsonProperty(FIELD_GOOGLE_GMAIL_AUTHORIZATION_CODE)
    public IrMailServerDTO setGoogleGmailAuthorizationCode(String val) {
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
    public IrMailServerDTO resetGoogleGmailAuthorizationCode() {
        this._reset(FIELD_GOOGLE_GMAIL_AUTHORIZATION_CODE);
        return this;
    }

    /**
     * 设置「更新 Token」
     * @param val
     */
    @JsonProperty(FIELD_GOOGLE_GMAIL_REFRESH_TOKEN)
    public IrMailServerDTO setGoogleGmailRefreshToken(String val) {
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
    public IrMailServerDTO resetGoogleGmailRefreshToken() {
        this._reset(FIELD_GOOGLE_GMAIL_REFRESH_TOKEN);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public IrMailServerDTO setId(String val) {
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
    public IrMailServerDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「最大电子邮件大小」
     * @param val
     */
    @JsonProperty(FIELD_MAX_EMAIL_SIZE)
    public IrMailServerDTO setMaxEmailSize(Double val) {
        this._set(FIELD_MAX_EMAIL_SIZE, val);
        return this;
    }

    /**
     * 获取「最大电子邮件大小」值
     *
     */
    @JsonIgnore
    public Double getMaxEmailSize() {
        return DataTypeUtils.asDouble(this._get(FIELD_MAX_EMAIL_SIZE), null);
    }

    /**
     * 判断 「最大电子邮件大小」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMaxEmailSize() {
        return this._contains(FIELD_MAX_EMAIL_SIZE);
    }

    /**
     * 重置 「最大电子邮件大小」
     *
     */
    @JsonIgnore
    public IrMailServerDTO resetMaxEmailSize() {
        this._reset(FIELD_MAX_EMAIL_SIZE);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public IrMailServerDTO setName(String val) {
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
    public IrMailServerDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「优先级」
     * @param val
     */
    @JsonProperty(FIELD_SEQUENCE)
    public IrMailServerDTO setSequence(Integer val) {
        this._set(FIELD_SEQUENCE, val);
        return this;
    }

    /**
     * 获取「优先级」值
     *
     */
    @JsonIgnore
    public Integer getSequence() {
        return DataTypeUtils.asInteger(this._get(FIELD_SEQUENCE), null);
    }

    /**
     * 判断 「优先级」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSequence() {
        return this._contains(FIELD_SEQUENCE);
    }

    /**
     * 重置 「优先级」
     *
     */
    @JsonIgnore
    public IrMailServerDTO resetSequence() {
        this._reset(FIELD_SEQUENCE);
        return this;
    }

    /**
     * 设置「验证」
     * 代码表[验证]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_mail_server_smtp_authentication
     * @param val
     */
    @JsonProperty(FIELD_SMTP_AUTHENTICATION)
    public IrMailServerDTO setSmtpAuthentication(String val) {
        this._set(FIELD_SMTP_AUTHENTICATION, val);
        return this;
    }

    /**
     * 获取「验证」值
     * 代码表[验证]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_mail_server_smtp_authentication
     *
     */
    @JsonIgnore
    public String getSmtpAuthentication() {
        return DataTypeUtils.asString(this._get(FIELD_SMTP_AUTHENTICATION), null);
    }

    /**
     * 判断 「验证」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSmtpAuthentication() {
        return this._contains(FIELD_SMTP_AUTHENTICATION);
    }

    /**
     * 重置 「验证」
     *
     */
    @JsonIgnore
    public IrMailServerDTO resetSmtpAuthentication() {
        this._reset(FIELD_SMTP_AUTHENTICATION);
        return this;
    }

    /**
     * 设置「调试」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_SMTP_DEBUG)
    public IrMailServerDTO setSmtpDebug(Integer val) {
        this._set(FIELD_SMTP_DEBUG, val);
        return this;
    }

    /**
     * 获取「调试」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getSmtpDebug() {
        return DataTypeUtils.asInteger(this._get(FIELD_SMTP_DEBUG), null);
    }

    /**
     * 判断 「调试」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSmtpDebug() {
        return this._contains(FIELD_SMTP_DEBUG);
    }

    /**
     * 重置 「调试」
     *
     */
    @JsonIgnore
    public IrMailServerDTO resetSmtpDebug() {
        this._reset(FIELD_SMTP_DEBUG);
        return this;
    }

    /**
     * 设置「连接加密」
     * 代码表[连接加密]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_mail_server_smtp_encryption
     * @param val
     */
    @JsonProperty(FIELD_SMTP_ENCRYPTION)
    public IrMailServerDTO setSmtpEncryption(String val) {
        this._set(FIELD_SMTP_ENCRYPTION, val);
        return this;
    }

    /**
     * 获取「连接加密」值
     * 代码表[连接加密]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_mail_server_smtp_encryption
     *
     */
    @JsonIgnore
    public String getSmtpEncryption() {
        return DataTypeUtils.asString(this._get(FIELD_SMTP_ENCRYPTION), null);
    }

    /**
     * 判断 「连接加密」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSmtpEncryption() {
        return this._contains(FIELD_SMTP_ENCRYPTION);
    }

    /**
     * 重置 「连接加密」
     *
     */
    @JsonIgnore
    public IrMailServerDTO resetSmtpEncryption() {
        this._reset(FIELD_SMTP_ENCRYPTION);
        return this;
    }

    /**
     * 设置「SMTP服务器」
     * @param val
     */
    @JsonProperty(FIELD_SMTP_HOST)
    public IrMailServerDTO setSmtpHost(String val) {
        this._set(FIELD_SMTP_HOST, val);
        return this;
    }

    /**
     * 获取「SMTP服务器」值
     *
     */
    @JsonIgnore
    public String getSmtpHost() {
        return DataTypeUtils.asString(this._get(FIELD_SMTP_HOST), null);
    }

    /**
     * 判断 「SMTP服务器」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSmtpHost() {
        return this._contains(FIELD_SMTP_HOST);
    }

    /**
     * 重置 「SMTP服务器」
     *
     */
    @JsonIgnore
    public IrMailServerDTO resetSmtpHost() {
        this._reset(FIELD_SMTP_HOST);
        return this;
    }

    /**
     * 设置「密码」
     * @param val
     */
    @JsonProperty(FIELD_SMTP_PASS)
    public IrMailServerDTO setSmtpPass(String val) {
        this._set(FIELD_SMTP_PASS, val);
        return this;
    }

    /**
     * 获取「密码」值
     *
     */
    @JsonIgnore
    public String getSmtpPass() {
        return DataTypeUtils.asString(this._get(FIELD_SMTP_PASS), null);
    }

    /**
     * 判断 「密码」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSmtpPass() {
        return this._contains(FIELD_SMTP_PASS);
    }

    /**
     * 重置 「密码」
     *
     */
    @JsonIgnore
    public IrMailServerDTO resetSmtpPass() {
        this._reset(FIELD_SMTP_PASS);
        return this;
    }

    /**
     * 设置「SMTP端口」
     * @param val
     */
    @JsonProperty(FIELD_SMTP_PORT)
    public IrMailServerDTO setSmtpPort(Integer val) {
        this._set(FIELD_SMTP_PORT, val);
        return this;
    }

    /**
     * 获取「SMTP端口」值
     *
     */
    @JsonIgnore
    public Integer getSmtpPort() {
        return DataTypeUtils.asInteger(this._get(FIELD_SMTP_PORT), null);
    }

    /**
     * 判断 「SMTP端口」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSmtpPort() {
        return this._contains(FIELD_SMTP_PORT);
    }

    /**
     * 重置 「SMTP端口」
     *
     */
    @JsonIgnore
    public IrMailServerDTO resetSmtpPort() {
        this._reset(FIELD_SMTP_PORT);
        return this;
    }

    /**
     * 设置「用户名」
     * @param val
     */
    @JsonProperty(FIELD_SMTP_USER)
    public IrMailServerDTO setSmtpUser(String val) {
        this._set(FIELD_SMTP_USER, val);
        return this;
    }

    /**
     * 获取「用户名」值
     *
     */
    @JsonIgnore
    public String getSmtpUser() {
        return DataTypeUtils.asString(this._get(FIELD_SMTP_USER), null);
    }

    /**
     * 判断 「用户名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSmtpUser() {
        return this._contains(FIELD_SMTP_USER);
    }

    /**
     * 重置 「用户名」
     *
     */
    @JsonIgnore
    public IrMailServerDTO resetSmtpUser() {
        this._reset(FIELD_SMTP_USER);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public IrMailServerDTO setWriteDate(Timestamp val) {
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
    public IrMailServerDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public IrMailServerDTO setWriteUid(String val) {
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
    public IrMailServerDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
