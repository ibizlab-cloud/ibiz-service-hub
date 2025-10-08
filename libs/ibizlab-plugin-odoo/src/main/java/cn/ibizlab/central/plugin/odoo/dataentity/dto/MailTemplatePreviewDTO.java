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


public class MailTemplatePreviewDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 正文
     */
    public final static String FIELD_BODY_HTML = "body_html";

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
     * 属性: 抄送
     */
    public final static String FIELD_EMAIL_CC = "email_cc";

    /**
     * 属性: 来自
     */
    public final static String FIELD_EMAIL_FROM = "email_from";

    /**
     * 属性: 至
     */
    public final static String FIELD_EMAIL_TO = "email_to";

    /**
     * 属性: 错误消息
     */
    public final static String FIELD_ERROR_MSG = "error_msg";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 相关的邮件模板
     */
    public final static String FIELD_MAIL_TEMPLATE_ID = "mail_template_id";

    /**
     * 属性: 没有记录
     */
    public final static String FIELD_NO_RECORD = "no_record";

    /**
     * 属性: 回复 至
     */
    public final static String FIELD_REPLY_TO = "reply_to";

    /**
     * 属性: 安排的日期
     */
    public final static String FIELD_SCHEDULED_DATE = "scheduled_date";

    /**
     * 属性: 主旨
     */
    public final static String FIELD_SUBJECT = "subject";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「正文」
     * @param val
     */
    @JsonProperty(FIELD_BODY_HTML)
    public MailTemplatePreviewDTO setBodyHtml(String val) {
        this._set(FIELD_BODY_HTML, val);
        return this;
    }

    /**
     * 获取「正文」值
     *
     */
    @JsonIgnore
    public String getBodyHtml() {
        return DataTypeUtils.asString(this._get(FIELD_BODY_HTML), null);
    }

    /**
     * 判断 「正文」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBodyHtml() {
        return this._contains(FIELD_BODY_HTML);
    }

    /**
     * 重置 「正文」
     *
     */
    @JsonIgnore
    public MailTemplatePreviewDTO resetBodyHtml() {
        this._reset(FIELD_BODY_HTML);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public MailTemplatePreviewDTO setCreateDate(Timestamp val) {
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
    public MailTemplatePreviewDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public MailTemplatePreviewDTO setCreateUid(String val) {
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
    public MailTemplatePreviewDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public MailTemplatePreviewDTO setDisplayName(String val) {
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
    public MailTemplatePreviewDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「抄送」
     * @param val
     */
    @JsonProperty(FIELD_EMAIL_CC)
    public MailTemplatePreviewDTO setEmailCc(String val) {
        this._set(FIELD_EMAIL_CC, val);
        return this;
    }

    /**
     * 获取「抄送」值
     *
     */
    @JsonIgnore
    public String getEmailCc() {
        return DataTypeUtils.asString(this._get(FIELD_EMAIL_CC), null);
    }

    /**
     * 判断 「抄送」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEmailCc() {
        return this._contains(FIELD_EMAIL_CC);
    }

    /**
     * 重置 「抄送」
     *
     */
    @JsonIgnore
    public MailTemplatePreviewDTO resetEmailCc() {
        this._reset(FIELD_EMAIL_CC);
        return this;
    }

    /**
     * 设置「来自」
     * @param val
     */
    @JsonProperty(FIELD_EMAIL_FROM)
    public MailTemplatePreviewDTO setEmailFrom(String val) {
        this._set(FIELD_EMAIL_FROM, val);
        return this;
    }

    /**
     * 获取「来自」值
     *
     */
    @JsonIgnore
    public String getEmailFrom() {
        return DataTypeUtils.asString(this._get(FIELD_EMAIL_FROM), null);
    }

    /**
     * 判断 「来自」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEmailFrom() {
        return this._contains(FIELD_EMAIL_FROM);
    }

    /**
     * 重置 「来自」
     *
     */
    @JsonIgnore
    public MailTemplatePreviewDTO resetEmailFrom() {
        this._reset(FIELD_EMAIL_FROM);
        return this;
    }

    /**
     * 设置「至」
     * @param val
     */
    @JsonProperty(FIELD_EMAIL_TO)
    public MailTemplatePreviewDTO setEmailTo(String val) {
        this._set(FIELD_EMAIL_TO, val);
        return this;
    }

    /**
     * 获取「至」值
     *
     */
    @JsonIgnore
    public String getEmailTo() {
        return DataTypeUtils.asString(this._get(FIELD_EMAIL_TO), null);
    }

    /**
     * 判断 「至」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEmailTo() {
        return this._contains(FIELD_EMAIL_TO);
    }

    /**
     * 重置 「至」
     *
     */
    @JsonIgnore
    public MailTemplatePreviewDTO resetEmailTo() {
        this._reset(FIELD_EMAIL_TO);
        return this;
    }

    /**
     * 设置「错误消息」
     * @param val
     */
    @JsonProperty(FIELD_ERROR_MSG)
    public MailTemplatePreviewDTO setErrorMsg(String val) {
        this._set(FIELD_ERROR_MSG, val);
        return this;
    }

    /**
     * 获取「错误消息」值
     *
     */
    @JsonIgnore
    public String getErrorMsg() {
        return DataTypeUtils.asString(this._get(FIELD_ERROR_MSG), null);
    }

    /**
     * 判断 「错误消息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsErrorMsg() {
        return this._contains(FIELD_ERROR_MSG);
    }

    /**
     * 重置 「错误消息」
     *
     */
    @JsonIgnore
    public MailTemplatePreviewDTO resetErrorMsg() {
        this._reset(FIELD_ERROR_MSG);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailTemplatePreviewDTO setId(String val) {
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
    public MailTemplatePreviewDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「相关的邮件模板」
     * @param val
     */
    @JsonProperty(FIELD_MAIL_TEMPLATE_ID)
    public MailTemplatePreviewDTO setMailTemplateId(String val) {
        this._set(FIELD_MAIL_TEMPLATE_ID, val);
        return this;
    }

    /**
     * 获取「相关的邮件模板」值
     *
     */
    @JsonIgnore
    public String getMailTemplateId() {
        return DataTypeUtils.asString(this._get(FIELD_MAIL_TEMPLATE_ID), null);
    }

    /**
     * 判断 「相关的邮件模板」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMailTemplateId() {
        return this._contains(FIELD_MAIL_TEMPLATE_ID);
    }

    /**
     * 重置 「相关的邮件模板」
     *
     */
    @JsonIgnore
    public MailTemplatePreviewDTO resetMailTemplateId() {
        this._reset(FIELD_MAIL_TEMPLATE_ID);
        return this;
    }

    /**
     * 设置「没有记录」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_NO_RECORD)
    public MailTemplatePreviewDTO setNoRecord(Integer val) {
        this._set(FIELD_NO_RECORD, val);
        return this;
    }

    /**
     * 获取「没有记录」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getNoRecord() {
        return DataTypeUtils.asInteger(this._get(FIELD_NO_RECORD), null);
    }

    /**
     * 判断 「没有记录」是否有值
     *
     */
    @JsonIgnore
    public boolean containsNoRecord() {
        return this._contains(FIELD_NO_RECORD);
    }

    /**
     * 重置 「没有记录」
     *
     */
    @JsonIgnore
    public MailTemplatePreviewDTO resetNoRecord() {
        this._reset(FIELD_NO_RECORD);
        return this;
    }

    /**
     * 设置「回复 至」
     * @param val
     */
    @JsonProperty(FIELD_REPLY_TO)
    public MailTemplatePreviewDTO setReplyTo(String val) {
        this._set(FIELD_REPLY_TO, val);
        return this;
    }

    /**
     * 获取「回复 至」值
     *
     */
    @JsonIgnore
    public String getReplyTo() {
        return DataTypeUtils.asString(this._get(FIELD_REPLY_TO), null);
    }

    /**
     * 判断 「回复 至」是否有值
     *
     */
    @JsonIgnore
    public boolean containsReplyTo() {
        return this._contains(FIELD_REPLY_TO);
    }

    /**
     * 重置 「回复 至」
     *
     */
    @JsonIgnore
    public MailTemplatePreviewDTO resetReplyTo() {
        this._reset(FIELD_REPLY_TO);
        return this;
    }

    /**
     * 设置「安排的日期」
     * @param val
     */
    @JsonProperty(FIELD_SCHEDULED_DATE)
    public MailTemplatePreviewDTO setScheduledDate(String val) {
        this._set(FIELD_SCHEDULED_DATE, val);
        return this;
    }

    /**
     * 获取「安排的日期」值
     *
     */
    @JsonIgnore
    public String getScheduledDate() {
        return DataTypeUtils.asString(this._get(FIELD_SCHEDULED_DATE), null);
    }

    /**
     * 判断 「安排的日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsScheduledDate() {
        return this._contains(FIELD_SCHEDULED_DATE);
    }

    /**
     * 重置 「安排的日期」
     *
     */
    @JsonIgnore
    public MailTemplatePreviewDTO resetScheduledDate() {
        this._reset(FIELD_SCHEDULED_DATE);
        return this;
    }

    /**
     * 设置「主旨」
     * @param val
     */
    @JsonProperty(FIELD_SUBJECT)
    public MailTemplatePreviewDTO setSubject(String val) {
        this._set(FIELD_SUBJECT, val);
        return this;
    }

    /**
     * 获取「主旨」值
     *
     */
    @JsonIgnore
    public String getSubject() {
        return DataTypeUtils.asString(this._get(FIELD_SUBJECT), null);
    }

    /**
     * 判断 「主旨」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSubject() {
        return this._contains(FIELD_SUBJECT);
    }

    /**
     * 重置 「主旨」
     *
     */
    @JsonIgnore
    public MailTemplatePreviewDTO resetSubject() {
        this._reset(FIELD_SUBJECT);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public MailTemplatePreviewDTO setWriteDate(Timestamp val) {
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
    public MailTemplatePreviewDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public MailTemplatePreviewDTO setWriteUid(String val) {
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
    public MailTemplatePreviewDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
