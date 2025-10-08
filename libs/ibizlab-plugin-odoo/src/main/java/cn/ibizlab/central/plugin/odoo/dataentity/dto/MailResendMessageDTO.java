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


public class MailResendMessageDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 可以取消
     */
    public final static String FIELD_CAN_CANCEL = "can_cancel";

    /**
     * 属性: 可以重新发送
     */
    public final static String FIELD_CAN_RESEND = "can_resend";

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
     * 属性: 业务合作伙伴只读
     */
    public final static String FIELD_PARTNER_READONLY = "partner_readonly";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「可以取消」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_CAN_CANCEL)
    public MailResendMessageDTO setCanCancel(Integer val) {
        this._set(FIELD_CAN_CANCEL, val);
        return this;
    }

    /**
     * 获取「可以取消」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getCanCancel() {
        return DataTypeUtils.asInteger(this._get(FIELD_CAN_CANCEL), null);
    }

    /**
     * 判断 「可以取消」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCanCancel() {
        return this._contains(FIELD_CAN_CANCEL);
    }

    /**
     * 重置 「可以取消」
     *
     */
    @JsonIgnore
    public MailResendMessageDTO resetCanCancel() {
        this._reset(FIELD_CAN_CANCEL);
        return this;
    }

    /**
     * 设置「可以重新发送」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_CAN_RESEND)
    public MailResendMessageDTO setCanResend(Integer val) {
        this._set(FIELD_CAN_RESEND, val);
        return this;
    }

    /**
     * 获取「可以重新发送」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getCanResend() {
        return DataTypeUtils.asInteger(this._get(FIELD_CAN_RESEND), null);
    }

    /**
     * 判断 「可以重新发送」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCanResend() {
        return this._contains(FIELD_CAN_RESEND);
    }

    /**
     * 重置 「可以重新发送」
     *
     */
    @JsonIgnore
    public MailResendMessageDTO resetCanResend() {
        this._reset(FIELD_CAN_RESEND);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public MailResendMessageDTO setCreateDate(Timestamp val) {
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
    public MailResendMessageDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public MailResendMessageDTO setCreateUid(String val) {
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
    public MailResendMessageDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public MailResendMessageDTO setDisplayName(String val) {
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
    public MailResendMessageDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailResendMessageDTO setId(String val) {
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
    public MailResendMessageDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「消息」
     * @param val
     */
    @JsonProperty(FIELD_MAIL_MESSAGE_ID)
    public MailResendMessageDTO setMailMessageId(String val) {
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
    public MailResendMessageDTO resetMailMessageId() {
        this._reset(FIELD_MAIL_MESSAGE_ID);
        return this;
    }

    /**
     * 设置「业务合作伙伴只读」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_PARTNER_READONLY)
    public MailResendMessageDTO setPartnerReadonly(Integer val) {
        this._set(FIELD_PARTNER_READONLY, val);
        return this;
    }

    /**
     * 获取「业务合作伙伴只读」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getPartnerReadonly() {
        return DataTypeUtils.asInteger(this._get(FIELD_PARTNER_READONLY), null);
    }

    /**
     * 判断 「业务合作伙伴只读」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPartnerReadonly() {
        return this._contains(FIELD_PARTNER_READONLY);
    }

    /**
     * 重置 「业务合作伙伴只读」
     *
     */
    @JsonIgnore
    public MailResendMessageDTO resetPartnerReadonly() {
        this._reset(FIELD_PARTNER_READONLY);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public MailResendMessageDTO setWriteDate(Timestamp val) {
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
    public MailResendMessageDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public MailResendMessageDTO setWriteUid(String val) {
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
    public MailResendMessageDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
