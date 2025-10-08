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


public class MailMessageScheduleDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

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
    public final static String FIELD_MAIL_MESSAGE_ID = "mail_message_id";

    /**
     * 属性: 通知参数
     */
    public final static String FIELD_NOTIFICATION_PARAMETERS = "notification_parameters";

    /**
     * 属性: 安排的发送日期
     */
    public final static String FIELD_SCHEDULED_DATETIME = "scheduled_datetime";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public MailMessageScheduleDTO setCreateDate(Timestamp val) {
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
    public MailMessageScheduleDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public MailMessageScheduleDTO setCreateUid(String val) {
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
    public MailMessageScheduleDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public MailMessageScheduleDTO setDisplayName(String val) {
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
    public MailMessageScheduleDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailMessageScheduleDTO setId(String val) {
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
    public MailMessageScheduleDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「消息」
     * @param val
     */
    @JsonProperty(FIELD_MAIL_MESSAGE_ID)
    public MailMessageScheduleDTO setMailMessageId(String val) {
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
    public MailMessageScheduleDTO resetMailMessageId() {
        this._reset(FIELD_MAIL_MESSAGE_ID);
        return this;
    }

    /**
     * 设置「通知参数」
     * @param val
     */
    @JsonProperty(FIELD_NOTIFICATION_PARAMETERS)
    public MailMessageScheduleDTO setNotificationParameters(String val) {
        this._set(FIELD_NOTIFICATION_PARAMETERS, val);
        return this;
    }

    /**
     * 获取「通知参数」值
     *
     */
    @JsonIgnore
    public String getNotificationParameters() {
        return DataTypeUtils.asString(this._get(FIELD_NOTIFICATION_PARAMETERS), null);
    }

    /**
     * 判断 「通知参数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsNotificationParameters() {
        return this._contains(FIELD_NOTIFICATION_PARAMETERS);
    }

    /**
     * 重置 「通知参数」
     *
     */
    @JsonIgnore
    public MailMessageScheduleDTO resetNotificationParameters() {
        this._reset(FIELD_NOTIFICATION_PARAMETERS);
        return this;
    }

    /**
     * 设置「安排的发送日期」
     * @param val
     */
    @JsonProperty(FIELD_SCHEDULED_DATETIME)
    public MailMessageScheduleDTO setScheduledDatetime(Timestamp val) {
        this._set(FIELD_SCHEDULED_DATETIME, val);
        return this;
    }

    /**
     * 获取「安排的发送日期」值
     *
     */
    @JsonIgnore
    public Timestamp getScheduledDatetime() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_SCHEDULED_DATETIME), null);
    }

    /**
     * 判断 「安排的发送日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsScheduledDatetime() {
        return this._contains(FIELD_SCHEDULED_DATETIME);
    }

    /**
     * 重置 「安排的发送日期」
     *
     */
    @JsonIgnore
    public MailMessageScheduleDTO resetScheduledDatetime() {
        this._reset(FIELD_SCHEDULED_DATETIME);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public MailMessageScheduleDTO setWriteDate(Timestamp val) {
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
    public MailMessageScheduleDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public MailMessageScheduleDTO setWriteUid(String val) {
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
    public MailMessageScheduleDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
