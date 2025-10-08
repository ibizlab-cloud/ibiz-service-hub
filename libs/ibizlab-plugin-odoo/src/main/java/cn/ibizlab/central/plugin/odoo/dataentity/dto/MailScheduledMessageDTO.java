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


public class MailScheduledMessageDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 作者
     */
    public final static String FIELD_AUTHOR_ID = "author_id";

    /**
     * 属性: 内容
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
     * 属性: 是备注
     */
    public final static String FIELD_IS_NOTE = "is_note";

    /**
     * 属性: 相关单据模型
     */
    public final static String FIELD_MODEL = "model";

    /**
     * 属性: 通知参数
     */
    public final static String FIELD_NOTIFICATION_PARAMETERS = "notification_parameters";

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
     * 设置「作者」
     * @param val
     */
    @JsonProperty(FIELD_AUTHOR_ID)
    public MailScheduledMessageDTO setAuthorId(String val) {
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
    public MailScheduledMessageDTO resetAuthorId() {
        this._reset(FIELD_AUTHOR_ID);
        return this;
    }

    /**
     * 设置「内容」
     * @param val
     */
    @JsonProperty(FIELD_BODY)
    public MailScheduledMessageDTO setBody(String val) {
        this._set(FIELD_BODY, val);
        return this;
    }

    /**
     * 获取「内容」值
     *
     */
    @JsonIgnore
    public String getBody() {
        return DataTypeUtils.asString(this._get(FIELD_BODY), null);
    }

    /**
     * 判断 「内容」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBody() {
        return this._contains(FIELD_BODY);
    }

    /**
     * 重置 「内容」
     *
     */
    @JsonIgnore
    public MailScheduledMessageDTO resetBody() {
        this._reset(FIELD_BODY);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public MailScheduledMessageDTO setCreateDate(Timestamp val) {
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
    public MailScheduledMessageDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public MailScheduledMessageDTO setCreateUid(String val) {
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
    public MailScheduledMessageDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public MailScheduledMessageDTO setDisplayName(String val) {
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
    public MailScheduledMessageDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailScheduledMessageDTO setId(String val) {
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
    public MailScheduledMessageDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「是备注」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_NOTE)
    public MailScheduledMessageDTO setIsNote(Integer val) {
        this._set(FIELD_IS_NOTE, val);
        return this;
    }

    /**
     * 获取「是备注」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsNote() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_NOTE), null);
    }

    /**
     * 判断 「是备注」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsNote() {
        return this._contains(FIELD_IS_NOTE);
    }

    /**
     * 重置 「是备注」
     *
     */
    @JsonIgnore
    public MailScheduledMessageDTO resetIsNote() {
        this._reset(FIELD_IS_NOTE);
        return this;
    }

    /**
     * 设置「相关单据模型」
     * @param val
     */
    @JsonProperty(FIELD_MODEL)
    public MailScheduledMessageDTO setModel(String val) {
        this._set(FIELD_MODEL, val);
        return this;
    }

    /**
     * 获取「相关单据模型」值
     *
     */
    @JsonIgnore
    public String getModel() {
        return DataTypeUtils.asString(this._get(FIELD_MODEL), null);
    }

    /**
     * 判断 「相关单据模型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModel() {
        return this._contains(FIELD_MODEL);
    }

    /**
     * 重置 「相关单据模型」
     *
     */
    @JsonIgnore
    public MailScheduledMessageDTO resetModel() {
        this._reset(FIELD_MODEL);
        return this;
    }

    /**
     * 设置「通知参数」
     * @param val
     */
    @JsonProperty(FIELD_NOTIFICATION_PARAMETERS)
    public MailScheduledMessageDTO setNotificationParameters(String val) {
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
    public MailScheduledMessageDTO resetNotificationParameters() {
        this._reset(FIELD_NOTIFICATION_PARAMETERS);
        return this;
    }

    /**
     * 设置「安排的日期」
     * @param val
     */
    @JsonProperty(FIELD_SCHEDULED_DATE)
    public MailScheduledMessageDTO setScheduledDate(Timestamp val) {
        this._set(FIELD_SCHEDULED_DATE, val);
        return this;
    }

    /**
     * 获取「安排的日期」值
     *
     */
    @JsonIgnore
    public Timestamp getScheduledDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_SCHEDULED_DATE), null);
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
    public MailScheduledMessageDTO resetScheduledDate() {
        this._reset(FIELD_SCHEDULED_DATE);
        return this;
    }

    /**
     * 设置「主旨」
     * @param val
     */
    @JsonProperty(FIELD_SUBJECT)
    public MailScheduledMessageDTO setSubject(String val) {
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
    public MailScheduledMessageDTO resetSubject() {
        this._reset(FIELD_SUBJECT);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public MailScheduledMessageDTO setWriteDate(Timestamp val) {
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
    public MailScheduledMessageDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public MailScheduledMessageDTO setWriteUid(String val) {
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
    public MailScheduledMessageDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
