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


public class MailMailDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 自动删除
     */
    public final static String FIELD_AUTO_DELETE = "auto_delete";

    /**
     * 属性: 富文本内容
     */
    public final static String FIELD_BODY_CONTENT = "body_content";

    /**
     * 属性: 文本内容
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
     * 属性: 至
     */
    public final static String FIELD_EMAIL_TO = "email_to";

    /**
     * 属性: 失败原因
     */
    public final static String FIELD_FAILURE_REASON = "failure_reason";

    /**
     * 属性: 失败类型
     */
    public final static String FIELD_FAILURE_TYPE = "failure_type";

    /**
     * 属性: 请求头
     */
    public final static String FIELD_HEADERS = "headers";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 通知电子邮件
     */
    public final static String FIELD_IS_NOTIFICATION = "is_notification";

    /**
     * 属性: 消息
     */
    public final static String FIELD_MAIL_MESSAGE_ID = "mail_message_id";

    /**
     * 属性: 邮件消息 ID 整型
     */
    public final static String FIELD_MAIL_MESSAGE_ID_INT = "mail_message_id_int";

    /**
     * 属性: 参考
     */
    public final static String FIELD_REFERENCES = "references";

    /**
     * 属性: 受限制的附件
     */
    public final static String FIELD_RESTRICTED_ATTACHMENT_COUNT = "restricted_attachment_count";

    /**
     * 属性: 安排的发送日期
     */
    public final static String FIELD_SCHEDULED_DATE = "scheduled_date";

    /**
     * 属性: 状态
     */
    public final static String FIELD_STATE = "state";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「自动删除」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_AUTO_DELETE)
    public MailMailDTO setAutoDelete(Integer val) {
        this._set(FIELD_AUTO_DELETE, val);
        return this;
    }

    /**
     * 获取「自动删除」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getAutoDelete() {
        return DataTypeUtils.asInteger(this._get(FIELD_AUTO_DELETE), null);
    }

    /**
     * 判断 「自动删除」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAutoDelete() {
        return this._contains(FIELD_AUTO_DELETE);
    }

    /**
     * 重置 「自动删除」
     *
     */
    @JsonIgnore
    public MailMailDTO resetAutoDelete() {
        this._reset(FIELD_AUTO_DELETE);
        return this;
    }

    /**
     * 设置「富文本内容」
     * @param val
     */
    @JsonProperty(FIELD_BODY_CONTENT)
    public MailMailDTO setBodyContent(String val) {
        this._set(FIELD_BODY_CONTENT, val);
        return this;
    }

    /**
     * 获取「富文本内容」值
     *
     */
    @JsonIgnore
    public String getBodyContent() {
        return DataTypeUtils.asString(this._get(FIELD_BODY_CONTENT), null);
    }

    /**
     * 判断 「富文本内容」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBodyContent() {
        return this._contains(FIELD_BODY_CONTENT);
    }

    /**
     * 重置 「富文本内容」
     *
     */
    @JsonIgnore
    public MailMailDTO resetBodyContent() {
        this._reset(FIELD_BODY_CONTENT);
        return this;
    }

    /**
     * 设置「文本内容」
     * @param val
     */
    @JsonProperty(FIELD_BODY_HTML)
    public MailMailDTO setBodyHtml(String val) {
        this._set(FIELD_BODY_HTML, val);
        return this;
    }

    /**
     * 获取「文本内容」值
     *
     */
    @JsonIgnore
    public String getBodyHtml() {
        return DataTypeUtils.asString(this._get(FIELD_BODY_HTML), null);
    }

    /**
     * 判断 「文本内容」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBodyHtml() {
        return this._contains(FIELD_BODY_HTML);
    }

    /**
     * 重置 「文本内容」
     *
     */
    @JsonIgnore
    public MailMailDTO resetBodyHtml() {
        this._reset(FIELD_BODY_HTML);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public MailMailDTO setCreateDate(Timestamp val) {
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
    public MailMailDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public MailMailDTO setCreateUid(String val) {
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
    public MailMailDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public MailMailDTO setDisplayName(String val) {
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
    public MailMailDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「抄送」
     * @param val
     */
    @JsonProperty(FIELD_EMAIL_CC)
    public MailMailDTO setEmailCc(String val) {
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
    public MailMailDTO resetEmailCc() {
        this._reset(FIELD_EMAIL_CC);
        return this;
    }

    /**
     * 设置「至」
     * @param val
     */
    @JsonProperty(FIELD_EMAIL_TO)
    public MailMailDTO setEmailTo(String val) {
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
    public MailMailDTO resetEmailTo() {
        this._reset(FIELD_EMAIL_TO);
        return this;
    }

    /**
     * 设置「失败原因」
     * @param val
     */
    @JsonProperty(FIELD_FAILURE_REASON)
    public MailMailDTO setFailureReason(String val) {
        this._set(FIELD_FAILURE_REASON, val);
        return this;
    }

    /**
     * 获取「失败原因」值
     *
     */
    @JsonIgnore
    public String getFailureReason() {
        return DataTypeUtils.asString(this._get(FIELD_FAILURE_REASON), null);
    }

    /**
     * 判断 「失败原因」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFailureReason() {
        return this._contains(FIELD_FAILURE_REASON);
    }

    /**
     * 重置 「失败原因」
     *
     */
    @JsonIgnore
    public MailMailDTO resetFailureReason() {
        this._reset(FIELD_FAILURE_REASON);
        return this;
    }

    /**
     * 设置「失败类型」
     * 代码表[失败类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_mail_failure_type
     * @param val
     */
    @JsonProperty(FIELD_FAILURE_TYPE)
    public MailMailDTO setFailureType(String val) {
        this._set(FIELD_FAILURE_TYPE, val);
        return this;
    }

    /**
     * 获取「失败类型」值
     * 代码表[失败类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_mail_failure_type
     *
     */
    @JsonIgnore
    public String getFailureType() {
        return DataTypeUtils.asString(this._get(FIELD_FAILURE_TYPE), null);
    }

    /**
     * 判断 「失败类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFailureType() {
        return this._contains(FIELD_FAILURE_TYPE);
    }

    /**
     * 重置 「失败类型」
     *
     */
    @JsonIgnore
    public MailMailDTO resetFailureType() {
        this._reset(FIELD_FAILURE_TYPE);
        return this;
    }

    /**
     * 设置「请求头」
     * @param val
     */
    @JsonProperty(FIELD_HEADERS)
    public MailMailDTO setHeaders(String val) {
        this._set(FIELD_HEADERS, val);
        return this;
    }

    /**
     * 获取「请求头」值
     *
     */
    @JsonIgnore
    public String getHeaders() {
        return DataTypeUtils.asString(this._get(FIELD_HEADERS), null);
    }

    /**
     * 判断 「请求头」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHeaders() {
        return this._contains(FIELD_HEADERS);
    }

    /**
     * 重置 「请求头」
     *
     */
    @JsonIgnore
    public MailMailDTO resetHeaders() {
        this._reset(FIELD_HEADERS);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailMailDTO setId(String val) {
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
    public MailMailDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「通知电子邮件」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_NOTIFICATION)
    public MailMailDTO setIsNotification(Integer val) {
        this._set(FIELD_IS_NOTIFICATION, val);
        return this;
    }

    /**
     * 获取「通知电子邮件」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsNotification() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_NOTIFICATION), null);
    }

    /**
     * 判断 「通知电子邮件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsNotification() {
        return this._contains(FIELD_IS_NOTIFICATION);
    }

    /**
     * 重置 「通知电子邮件」
     *
     */
    @JsonIgnore
    public MailMailDTO resetIsNotification() {
        this._reset(FIELD_IS_NOTIFICATION);
        return this;
    }

    /**
     * 设置「消息」
     * @param val
     */
    @JsonProperty(FIELD_MAIL_MESSAGE_ID)
    public MailMailDTO setMailMessageId(String val) {
        this._set(FIELD_MAIL_MESSAGE_ID, val);
        return this;
    }

    /**
     * 获取「消息」值
     *
     */
    @JsonIgnore
    public String getMailMessageId() {
        return DataTypeUtils.asString(this._get(FIELD_MAIL_MESSAGE_ID), null);
    }

    /**
     * 判断 「消息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMailMessageId() {
        return this._contains(FIELD_MAIL_MESSAGE_ID);
    }

    /**
     * 重置 「消息」
     *
     */
    @JsonIgnore
    public MailMailDTO resetMailMessageId() {
        this._reset(FIELD_MAIL_MESSAGE_ID);
        return this;
    }

    /**
     * 设置「邮件消息 ID 整型」
     * @param val
     */
    @JsonProperty(FIELD_MAIL_MESSAGE_ID_INT)
    public MailMailDTO setMailMessageIdInt(Integer val) {
        this._set(FIELD_MAIL_MESSAGE_ID_INT, val);
        return this;
    }

    /**
     * 获取「邮件消息 ID 整型」值
     *
     */
    @JsonIgnore
    public Integer getMailMessageIdInt() {
        return DataTypeUtils.asInteger(this._get(FIELD_MAIL_MESSAGE_ID_INT), null);
    }

    /**
     * 判断 「邮件消息 ID 整型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMailMessageIdInt() {
        return this._contains(FIELD_MAIL_MESSAGE_ID_INT);
    }

    /**
     * 重置 「邮件消息 ID 整型」
     *
     */
    @JsonIgnore
    public MailMailDTO resetMailMessageIdInt() {
        this._reset(FIELD_MAIL_MESSAGE_ID_INT);
        return this;
    }

    /**
     * 设置「参考」
     * @param val
     */
    @JsonProperty(FIELD_REFERENCES)
    public MailMailDTO setReferences(String val) {
        this._set(FIELD_REFERENCES, val);
        return this;
    }

    /**
     * 获取「参考」值
     *
     */
    @JsonIgnore
    public String getReferences() {
        return DataTypeUtils.asString(this._get(FIELD_REFERENCES), null);
    }

    /**
     * 判断 「参考」是否有值
     *
     */
    @JsonIgnore
    public boolean containsReferences() {
        return this._contains(FIELD_REFERENCES);
    }

    /**
     * 重置 「参考」
     *
     */
    @JsonIgnore
    public MailMailDTO resetReferences() {
        this._reset(FIELD_REFERENCES);
        return this;
    }

    /**
     * 设置「受限制的附件」
     * @param val
     */
    @JsonProperty(FIELD_RESTRICTED_ATTACHMENT_COUNT)
    public MailMailDTO setRestrictedAttachmentCount(Integer val) {
        this._set(FIELD_RESTRICTED_ATTACHMENT_COUNT, val);
        return this;
    }

    /**
     * 获取「受限制的附件」值
     *
     */
    @JsonIgnore
    public Integer getRestrictedAttachmentCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_RESTRICTED_ATTACHMENT_COUNT), null);
    }

    /**
     * 判断 「受限制的附件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRestrictedAttachmentCount() {
        return this._contains(FIELD_RESTRICTED_ATTACHMENT_COUNT);
    }

    /**
     * 重置 「受限制的附件」
     *
     */
    @JsonIgnore
    public MailMailDTO resetRestrictedAttachmentCount() {
        this._reset(FIELD_RESTRICTED_ATTACHMENT_COUNT);
        return this;
    }

    /**
     * 设置「安排的发送日期」
     * @param val
     */
    @JsonProperty(FIELD_SCHEDULED_DATE)
    public MailMailDTO setScheduledDate(Timestamp val) {
        this._set(FIELD_SCHEDULED_DATE, val);
        return this;
    }

    /**
     * 获取「安排的发送日期」值
     *
     */
    @JsonIgnore
    public Timestamp getScheduledDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_SCHEDULED_DATE), null);
    }

    /**
     * 判断 「安排的发送日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsScheduledDate() {
        return this._contains(FIELD_SCHEDULED_DATE);
    }

    /**
     * 重置 「安排的发送日期」
     *
     */
    @JsonIgnore
    public MailMailDTO resetScheduledDate() {
        this._reset(FIELD_SCHEDULED_DATE);
        return this;
    }

    /**
     * 设置「状态」
     * 代码表[状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_mail_state
     * @param val
     */
    @JsonProperty(FIELD_STATE)
    public MailMailDTO setState(String val) {
        this._set(FIELD_STATE, val);
        return this;
    }

    /**
     * 获取「状态」值
     * 代码表[状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_mail_state
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
    public MailMailDTO resetState() {
        this._reset(FIELD_STATE);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public MailMailDTO setWriteDate(Timestamp val) {
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
    public MailMailDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public MailMailDTO setWriteUid(String val) {
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
    public MailMailDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
