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


public class MailAliasDomainDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 弹跳别名
     */
    public final static String FIELD_BOUNCE_ALIAS = "bounce_alias";

    /**
     * 属性: 退件电子邮件
     */
    public final static String FIELD_BOUNCE_EMAIL = "bounce_email";

    /**
     * 属性: 全部别名
     */
    public final static String FIELD_CATCHALL_ALIAS = "catchall_alias";

    /**
     * 属性: 预设邮件
     */
    public final static String FIELD_CATCHALL_EMAIL = "catchall_email";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 默认发件人别名
     */
    public final static String FIELD_DEFAULT_FROM = "default_from";

    /**
     * 属性: 默认从
     */
    public final static String FIELD_DEFAULT_FROM_EMAIL = "default_from_email";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 序列
     */
    public final static String FIELD_SEQUENCE = "sequence";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「弹跳别名」
     * @param val
     */
    @JsonProperty(FIELD_BOUNCE_ALIAS)
    public MailAliasDomainDTO setBounceAlias(String val) {
        this._set(FIELD_BOUNCE_ALIAS, val);
        return this;
    }

    /**
     * 获取「弹跳别名」值
     *
     */
    @JsonIgnore
    public String getBounceAlias() {
        return DataTypeUtils.asString(this._get(FIELD_BOUNCE_ALIAS), null);
    }

    /**
     * 判断 「弹跳别名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBounceAlias() {
        return this._contains(FIELD_BOUNCE_ALIAS);
    }

    /**
     * 重置 「弹跳别名」
     *
     */
    @JsonIgnore
    public MailAliasDomainDTO resetBounceAlias() {
        this._reset(FIELD_BOUNCE_ALIAS);
        return this;
    }

    /**
     * 设置「退件电子邮件」
     * @param val
     */
    @JsonProperty(FIELD_BOUNCE_EMAIL)
    public MailAliasDomainDTO setBounceEmail(String val) {
        this._set(FIELD_BOUNCE_EMAIL, val);
        return this;
    }

    /**
     * 获取「退件电子邮件」值
     *
     */
    @JsonIgnore
    public String getBounceEmail() {
        return DataTypeUtils.asString(this._get(FIELD_BOUNCE_EMAIL), null);
    }

    /**
     * 判断 「退件电子邮件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBounceEmail() {
        return this._contains(FIELD_BOUNCE_EMAIL);
    }

    /**
     * 重置 「退件电子邮件」
     *
     */
    @JsonIgnore
    public MailAliasDomainDTO resetBounceEmail() {
        this._reset(FIELD_BOUNCE_EMAIL);
        return this;
    }

    /**
     * 设置「全部别名」
     * @param val
     */
    @JsonProperty(FIELD_CATCHALL_ALIAS)
    public MailAliasDomainDTO setCatchallAlias(String val) {
        this._set(FIELD_CATCHALL_ALIAS, val);
        return this;
    }

    /**
     * 获取「全部别名」值
     *
     */
    @JsonIgnore
    public String getCatchallAlias() {
        return DataTypeUtils.asString(this._get(FIELD_CATCHALL_ALIAS), null);
    }

    /**
     * 判断 「全部别名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCatchallAlias() {
        return this._contains(FIELD_CATCHALL_ALIAS);
    }

    /**
     * 重置 「全部别名」
     *
     */
    @JsonIgnore
    public MailAliasDomainDTO resetCatchallAlias() {
        this._reset(FIELD_CATCHALL_ALIAS);
        return this;
    }

    /**
     * 设置「预设邮件」
     * @param val
     */
    @JsonProperty(FIELD_CATCHALL_EMAIL)
    public MailAliasDomainDTO setCatchallEmail(String val) {
        this._set(FIELD_CATCHALL_EMAIL, val);
        return this;
    }

    /**
     * 获取「预设邮件」值
     *
     */
    @JsonIgnore
    public String getCatchallEmail() {
        return DataTypeUtils.asString(this._get(FIELD_CATCHALL_EMAIL), null);
    }

    /**
     * 判断 「预设邮件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCatchallEmail() {
        return this._contains(FIELD_CATCHALL_EMAIL);
    }

    /**
     * 重置 「预设邮件」
     *
     */
    @JsonIgnore
    public MailAliasDomainDTO resetCatchallEmail() {
        this._reset(FIELD_CATCHALL_EMAIL);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public MailAliasDomainDTO setCreateDate(Timestamp val) {
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
    public MailAliasDomainDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public MailAliasDomainDTO setCreateUid(String val) {
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
    public MailAliasDomainDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「默认发件人别名」
     * @param val
     */
    @JsonProperty(FIELD_DEFAULT_FROM)
    public MailAliasDomainDTO setDefaultFrom(String val) {
        this._set(FIELD_DEFAULT_FROM, val);
        return this;
    }

    /**
     * 获取「默认发件人别名」值
     *
     */
    @JsonIgnore
    public String getDefaultFrom() {
        return DataTypeUtils.asString(this._get(FIELD_DEFAULT_FROM), null);
    }

    /**
     * 判断 「默认发件人别名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDefaultFrom() {
        return this._contains(FIELD_DEFAULT_FROM);
    }

    /**
     * 重置 「默认发件人别名」
     *
     */
    @JsonIgnore
    public MailAliasDomainDTO resetDefaultFrom() {
        this._reset(FIELD_DEFAULT_FROM);
        return this;
    }

    /**
     * 设置「默认从」
     * @param val
     */
    @JsonProperty(FIELD_DEFAULT_FROM_EMAIL)
    public MailAliasDomainDTO setDefaultFromEmail(String val) {
        this._set(FIELD_DEFAULT_FROM_EMAIL, val);
        return this;
    }

    /**
     * 获取「默认从」值
     *
     */
    @JsonIgnore
    public String getDefaultFromEmail() {
        return DataTypeUtils.asString(this._get(FIELD_DEFAULT_FROM_EMAIL), null);
    }

    /**
     * 判断 「默认从」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDefaultFromEmail() {
        return this._contains(FIELD_DEFAULT_FROM_EMAIL);
    }

    /**
     * 重置 「默认从」
     *
     */
    @JsonIgnore
    public MailAliasDomainDTO resetDefaultFromEmail() {
        this._reset(FIELD_DEFAULT_FROM_EMAIL);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public MailAliasDomainDTO setDisplayName(String val) {
        this._set(FIELD_DISPLAY_NAME, val);
        return this;
    }

    /**
     * 获取「显示名称」值
     *
     */
    @JsonIgnore
    public String getDisplayName() {
        return DataTypeUtils.asString(this._get(FIELD_DISPLAY_NAME), null);
    }

    /**
     * 判断 「显示名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDisplayName() {
        return this._contains(FIELD_DISPLAY_NAME);
    }

    /**
     * 重置 「显示名称」
     *
     */
    @JsonIgnore
    public MailAliasDomainDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailAliasDomainDTO setId(String val) {
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
    public MailAliasDomainDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public MailAliasDomainDTO setName(String val) {
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
    public MailAliasDomainDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「序列」
     * @param val
     */
    @JsonProperty(FIELD_SEQUENCE)
    public MailAliasDomainDTO setSequence(Integer val) {
        this._set(FIELD_SEQUENCE, val);
        return this;
    }

    /**
     * 获取「序列」值
     *
     */
    @JsonIgnore
    public Integer getSequence() {
        return DataTypeUtils.asInteger(this._get(FIELD_SEQUENCE), null);
    }

    /**
     * 判断 「序列」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSequence() {
        return this._contains(FIELD_SEQUENCE);
    }

    /**
     * 重置 「序列」
     *
     */
    @JsonIgnore
    public MailAliasDomainDTO resetSequence() {
        this._reset(FIELD_SEQUENCE);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public MailAliasDomainDTO setWriteDate(Timestamp val) {
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
    public MailAliasDomainDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public MailAliasDomainDTO setWriteUid(String val) {
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
    public MailAliasDomainDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
