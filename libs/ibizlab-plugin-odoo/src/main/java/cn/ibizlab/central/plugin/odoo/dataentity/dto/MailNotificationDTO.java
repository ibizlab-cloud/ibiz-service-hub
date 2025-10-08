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


public class MailNotificationDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 作者
     */
    public final static String FIELD_AUTHOR_ID = "author_id";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 失败原因
     */
    public final static String FIELD_FAILURE_REASON = "failure_reason";

    /**
     * 属性: 失败类型
     */
    public final static String FIELD_FAILURE_TYPE = "failure_type";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 已读
     */
    public final static String FIELD_IS_READ = "is_read";

    /**
     * 属性: 邮件
     */
    public final static String FIELD_MAIL_MAIL_ID = "mail_mail_id";

    /**
     * 属性: 消息
     */
    public final static String FIELD_MAIL_MESSAGE_ID = "mail_message_id";

    /**
     * 属性: 状态
     */
    public final static String FIELD_NOTIFICATION_STATUS = "notification_status";

    /**
     * 属性: 通知类型
     */
    public final static String FIELD_NOTIFICATION_TYPE = "notification_type";

    /**
     * 属性: 读取日期
     */
    public final static String FIELD_READ_DATE = "read_date";

    /**
     * 属性: 收件人
     */
    public final static String FIELD_RES_PARTNER_ID = "res_partner_id";

    /**
     * 属性: 短信 ID
     */
    public final static String FIELD_SMS_ID_INT = "sms_id_int";

    /**
     * 属性: 短信息号码
     */
    public final static String FIELD_SMS_NUMBER = "sms_number";

    /**
     * 设置「作者」
     * @param val
     */
    @JsonProperty(FIELD_AUTHOR_ID)
    public MailNotificationDTO setAuthorId(String val) {
        this._set(FIELD_AUTHOR_ID, val);
        return this;
    }

    /**
     * 获取「作者」值
     *
     */
    @JsonIgnore
    public String getAuthorId() {
        return DataTypeUtils.asString(this._get(FIELD_AUTHOR_ID), null);
    }

    /**
     * 判断 「作者」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAuthorId() {
        return this._contains(FIELD_AUTHOR_ID);
    }

    /**
     * 重置 「作者」
     *
     */
    @JsonIgnore
    public MailNotificationDTO resetAuthorId() {
        this._reset(FIELD_AUTHOR_ID);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public MailNotificationDTO setDisplayName(String val) {
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
    public MailNotificationDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「失败原因」
     * @param val
     */
    @JsonProperty(FIELD_FAILURE_REASON)
    public MailNotificationDTO setFailureReason(String val) {
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
    public MailNotificationDTO resetFailureReason() {
        this._reset(FIELD_FAILURE_REASON);
        return this;
    }

    /**
     * 设置「失败类型」
     * 代码表[失败类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_notification_failure_type
     * @param val
     */
    @JsonProperty(FIELD_FAILURE_TYPE)
    public MailNotificationDTO setFailureType(String val) {
        this._set(FIELD_FAILURE_TYPE, val);
        return this;
    }

    /**
     * 获取「失败类型」值
     * 代码表[失败类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_notification_failure_type
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
    public MailNotificationDTO resetFailureType() {
        this._reset(FIELD_FAILURE_TYPE);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailNotificationDTO setId(String val) {
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
    public MailNotificationDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「已读」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_READ)
    public MailNotificationDTO setIsRead(Integer val) {
        this._set(FIELD_IS_READ, val);
        return this;
    }

    /**
     * 获取「已读」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsRead() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_READ), null);
    }

    /**
     * 判断 「已读」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsRead() {
        return this._contains(FIELD_IS_READ);
    }

    /**
     * 重置 「已读」
     *
     */
    @JsonIgnore
    public MailNotificationDTO resetIsRead() {
        this._reset(FIELD_IS_READ);
        return this;
    }

    /**
     * 设置「邮件」
     * @param val
     */
    @JsonProperty(FIELD_MAIL_MAIL_ID)
    public MailNotificationDTO setMailMailId(String val) {
        this._set(FIELD_MAIL_MAIL_ID, val);
        return this;
    }

    /**
     * 获取「邮件」值
     *
     */
    @JsonIgnore
    public String getMailMailId() {
        return DataTypeUtils.asString(this._get(FIELD_MAIL_MAIL_ID), null);
    }

    /**
     * 判断 「邮件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMailMailId() {
        return this._contains(FIELD_MAIL_MAIL_ID);
    }

    /**
     * 重置 「邮件」
     *
     */
    @JsonIgnore
    public MailNotificationDTO resetMailMailId() {
        this._reset(FIELD_MAIL_MAIL_ID);
        return this;
    }

    /**
     * 设置「消息」
     * @param val
     */
    @JsonProperty(FIELD_MAIL_MESSAGE_ID)
    public MailNotificationDTO setMailMessageId(String val) {
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
    public MailNotificationDTO resetMailMessageId() {
        this._reset(FIELD_MAIL_MESSAGE_ID);
        return this;
    }

    /**
     * 设置「状态」
     * 代码表[状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_notification_notification_status
     * @param val
     */
    @JsonProperty(FIELD_NOTIFICATION_STATUS)
    public MailNotificationDTO setNotificationStatus(String val) {
        this._set(FIELD_NOTIFICATION_STATUS, val);
        return this;
    }

    /**
     * 获取「状态」值
     * 代码表[状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_notification_notification_status
     *
     */
    @JsonIgnore
    public String getNotificationStatus() {
        return DataTypeUtils.asString(this._get(FIELD_NOTIFICATION_STATUS), null);
    }

    /**
     * 判断 「状态」是否有值
     *
     */
    @JsonIgnore
    public boolean containsNotificationStatus() {
        return this._contains(FIELD_NOTIFICATION_STATUS);
    }

    /**
     * 重置 「状态」
     *
     */
    @JsonIgnore
    public MailNotificationDTO resetNotificationStatus() {
        this._reset(FIELD_NOTIFICATION_STATUS);
        return this;
    }

    /**
     * 设置「通知类型」
     * 代码表[通知类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_notification_notification_type
     * @param val
     */
    @JsonProperty(FIELD_NOTIFICATION_TYPE)
    public MailNotificationDTO setNotificationType(String val) {
        this._set(FIELD_NOTIFICATION_TYPE, val);
        return this;
    }

    /**
     * 获取「通知类型」值
     * 代码表[通知类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_notification_notification_type
     *
     */
    @JsonIgnore
    public String getNotificationType() {
        return DataTypeUtils.asString(this._get(FIELD_NOTIFICATION_TYPE), null);
    }

    /**
     * 判断 「通知类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsNotificationType() {
        return this._contains(FIELD_NOTIFICATION_TYPE);
    }

    /**
     * 重置 「通知类型」
     *
     */
    @JsonIgnore
    public MailNotificationDTO resetNotificationType() {
        this._reset(FIELD_NOTIFICATION_TYPE);
        return this;
    }

    /**
     * 设置「读取日期」
     * @param val
     */
    @JsonProperty(FIELD_READ_DATE)
    public MailNotificationDTO setReadDate(Timestamp val) {
        this._set(FIELD_READ_DATE, val);
        return this;
    }

    /**
     * 获取「读取日期」值
     *
     */
    @JsonIgnore
    public Timestamp getReadDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_READ_DATE), null);
    }

    /**
     * 判断 「读取日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsReadDate() {
        return this._contains(FIELD_READ_DATE);
    }

    /**
     * 重置 「读取日期」
     *
     */
    @JsonIgnore
    public MailNotificationDTO resetReadDate() {
        this._reset(FIELD_READ_DATE);
        return this;
    }

    /**
     * 设置「收件人」
     * @param val
     */
    @JsonProperty(FIELD_RES_PARTNER_ID)
    public MailNotificationDTO setResPartnerId(String val) {
        this._set(FIELD_RES_PARTNER_ID, val);
        return this;
    }

    /**
     * 获取「收件人」值
     *
     */
    @JsonIgnore
    public String getResPartnerId() {
        return DataTypeUtils.asString(this._get(FIELD_RES_PARTNER_ID), null);
    }

    /**
     * 判断 「收件人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResPartnerId() {
        return this._contains(FIELD_RES_PARTNER_ID);
    }

    /**
     * 重置 「收件人」
     *
     */
    @JsonIgnore
    public MailNotificationDTO resetResPartnerId() {
        this._reset(FIELD_RES_PARTNER_ID);
        return this;
    }

    /**
     * 设置「短信 ID」
     * @param val
     */
    @JsonProperty(FIELD_SMS_ID_INT)
    public MailNotificationDTO setSmsIdInt(Integer val) {
        this._set(FIELD_SMS_ID_INT, val);
        return this;
    }

    /**
     * 获取「短信 ID」值
     *
     */
    @JsonIgnore
    public Integer getSmsIdInt() {
        return DataTypeUtils.asInteger(this._get(FIELD_SMS_ID_INT), null);
    }

    /**
     * 判断 「短信 ID」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSmsIdInt() {
        return this._contains(FIELD_SMS_ID_INT);
    }

    /**
     * 重置 「短信 ID」
     *
     */
    @JsonIgnore
    public MailNotificationDTO resetSmsIdInt() {
        this._reset(FIELD_SMS_ID_INT);
        return this;
    }

    /**
     * 设置「短信息号码」
     * @param val
     */
    @JsonProperty(FIELD_SMS_NUMBER)
    public MailNotificationDTO setSmsNumber(String val) {
        this._set(FIELD_SMS_NUMBER, val);
        return this;
    }

    /**
     * 获取「短信息号码」值
     *
     */
    @JsonIgnore
    public String getSmsNumber() {
        return DataTypeUtils.asString(this._get(FIELD_SMS_NUMBER), null);
    }

    /**
     * 判断 「短信息号码」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSmsNumber() {
        return this._contains(FIELD_SMS_NUMBER);
    }

    /**
     * 重置 「短信息号码」
     *
     */
    @JsonIgnore
    public MailNotificationDTO resetSmsNumber() {
        this._reset(FIELD_SMS_NUMBER);
        return this;
    }

}
