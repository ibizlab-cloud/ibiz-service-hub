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


public class MailMessageTranslationDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 翻译正文
     */
    public final static String FIELD_BODY = "body";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 消息
     */
    public final static String FIELD_MESSAGE_ID = "message_id";

    /**
     * 属性: 语言
     */
    public final static String FIELD_SOURCE_LANG = "source_lang";

    /**
     * 属性: 目标语言
     */
    public final static String FIELD_TARGET_LANG = "target_lang";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「翻译正文」
     * @param val
     */
    @JsonProperty(FIELD_BODY)
    public MailMessageTranslationDTO setBody(String val) {
        this._set(FIELD_BODY, val);
        return this;
    }

    /**
     * 获取「翻译正文」值
     *
     */
    @JsonIgnore
    public String getBody() {
        return DataTypeUtils.asString(this._get(FIELD_BODY), null);
    }

    /**
     * 判断 「翻译正文」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBody() {
        return this._contains(FIELD_BODY);
    }

    /**
     * 重置 「翻译正文」
     *
     */
    @JsonIgnore
    public MailMessageTranslationDTO resetBody() {
        this._reset(FIELD_BODY);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public MailMessageTranslationDTO setCreateDate(Timestamp val) {
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
    public MailMessageTranslationDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public MailMessageTranslationDTO setCreateUid(String val) {
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
    public MailMessageTranslationDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public MailMessageTranslationDTO setDisplayName(String val) {
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
    public MailMessageTranslationDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailMessageTranslationDTO setId(String val) {
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
    public MailMessageTranslationDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「消息」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_ID)
    public MailMessageTranslationDTO setMessageId(String val) {
        this._set(FIELD_MESSAGE_ID, val);
        return this;
    }

    /**
     * 获取「消息」值
     *
     */
    @JsonIgnore
    public String getMessageId() {
        return DataTypeUtils.asString(this._get(FIELD_MESSAGE_ID), null);
    }

    /**
     * 判断 「消息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageId() {
        return this._contains(FIELD_MESSAGE_ID);
    }

    /**
     * 重置 「消息」
     *
     */
    @JsonIgnore
    public MailMessageTranslationDTO resetMessageId() {
        this._reset(FIELD_MESSAGE_ID);
        return this;
    }

    /**
     * 设置「语言」
     * @param val
     */
    @JsonProperty(FIELD_SOURCE_LANG)
    public MailMessageTranslationDTO setSourceLang(String val) {
        this._set(FIELD_SOURCE_LANG, val);
        return this;
    }

    /**
     * 获取「语言」值
     *
     */
    @JsonIgnore
    public String getSourceLang() {
        return DataTypeUtils.asString(this._get(FIELD_SOURCE_LANG), null);
    }

    /**
     * 判断 「语言」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSourceLang() {
        return this._contains(FIELD_SOURCE_LANG);
    }

    /**
     * 重置 「语言」
     *
     */
    @JsonIgnore
    public MailMessageTranslationDTO resetSourceLang() {
        this._reset(FIELD_SOURCE_LANG);
        return this;
    }

    /**
     * 设置「目标语言」
     * @param val
     */
    @JsonProperty(FIELD_TARGET_LANG)
    public MailMessageTranslationDTO setTargetLang(String val) {
        this._set(FIELD_TARGET_LANG, val);
        return this;
    }

    /**
     * 获取「目标语言」值
     *
     */
    @JsonIgnore
    public String getTargetLang() {
        return DataTypeUtils.asString(this._get(FIELD_TARGET_LANG), null);
    }

    /**
     * 判断 「目标语言」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTargetLang() {
        return this._contains(FIELD_TARGET_LANG);
    }

    /**
     * 重置 「目标语言」
     *
     */
    @JsonIgnore
    public MailMessageTranslationDTO resetTargetLang() {
        this._reset(FIELD_TARGET_LANG);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public MailMessageTranslationDTO setWriteDate(Timestamp val) {
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
    public MailMessageTranslationDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public MailMessageTranslationDTO setWriteUid(String val) {
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
    public MailMessageTranslationDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
