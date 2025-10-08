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


public class MailActivityTodoCreateDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 截止日期
     */
    public final static String FIELD_DATE_DEADLINE = "date_deadline";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 注意
     */
    public final static String FIELD_NOTE = "note";

    /**
     * 属性: 摘要
     */
    public final static String FIELD_SUMMARY = "summary";

    /**
     * 属性: 指派给
     */
    public final static String FIELD_USER_ID = "user_id";

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
    public MailActivityTodoCreateDTO setCreateDate(Timestamp val) {
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
    public MailActivityTodoCreateDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public MailActivityTodoCreateDTO setCreateUid(String val) {
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
    public MailActivityTodoCreateDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「截止日期」
     * @param val
     */
    @JsonProperty(FIELD_DATE_DEADLINE)
    public MailActivityTodoCreateDTO setDateDeadline(Timestamp val) {
        this._set(FIELD_DATE_DEADLINE, val);
        return this;
    }

    /**
     * 获取「截止日期」值
     *
     */
    @JsonIgnore
    public Timestamp getDateDeadline() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_DATE_DEADLINE), null);
    }

    /**
     * 判断 「截止日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDateDeadline() {
        return this._contains(FIELD_DATE_DEADLINE);
    }

    /**
     * 重置 「截止日期」
     *
     */
    @JsonIgnore
    public MailActivityTodoCreateDTO resetDateDeadline() {
        this._reset(FIELD_DATE_DEADLINE);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public MailActivityTodoCreateDTO setDisplayName(String val) {
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
    public MailActivityTodoCreateDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailActivityTodoCreateDTO setId(String val) {
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
    public MailActivityTodoCreateDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「注意」
     * @param val
     */
    @JsonProperty(FIELD_NOTE)
    public MailActivityTodoCreateDTO setNote(String val) {
        this._set(FIELD_NOTE, val);
        return this;
    }

    /**
     * 获取「注意」值
     *
     */
    @JsonIgnore
    public String getNote() {
        return DataTypeUtils.asString(this._get(FIELD_NOTE), null);
    }

    /**
     * 判断 「注意」是否有值
     *
     */
    @JsonIgnore
    public boolean containsNote() {
        return this._contains(FIELD_NOTE);
    }

    /**
     * 重置 「注意」
     *
     */
    @JsonIgnore
    public MailActivityTodoCreateDTO resetNote() {
        this._reset(FIELD_NOTE);
        return this;
    }

    /**
     * 设置「摘要」
     * @param val
     */
    @JsonProperty(FIELD_SUMMARY)
    public MailActivityTodoCreateDTO setSummary(String val) {
        this._set(FIELD_SUMMARY, val);
        return this;
    }

    /**
     * 获取「摘要」值
     *
     */
    @JsonIgnore
    public String getSummary() {
        return DataTypeUtils.asString(this._get(FIELD_SUMMARY), null);
    }

    /**
     * 判断 「摘要」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSummary() {
        return this._contains(FIELD_SUMMARY);
    }

    /**
     * 重置 「摘要」
     *
     */
    @JsonIgnore
    public MailActivityTodoCreateDTO resetSummary() {
        this._reset(FIELD_SUMMARY);
        return this;
    }

    /**
     * 设置「指派给」
     * @param val
     */
    @JsonProperty(FIELD_USER_ID)
    public MailActivityTodoCreateDTO setUserId(String val) {
        this._set(FIELD_USER_ID, val);
        return this;
    }

    /**
     * 获取「指派给」值
     *
     */
    @JsonIgnore
    public String getUserId() {
        return DataTypeUtils.asString(this._get(FIELD_USER_ID), null);
    }

    /**
     * 判断 「指派给」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUserId() {
        return this._contains(FIELD_USER_ID);
    }

    /**
     * 重置 「指派给」
     *
     */
    @JsonIgnore
    public MailActivityTodoCreateDTO resetUserId() {
        this._reset(FIELD_USER_ID);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public MailActivityTodoCreateDTO setWriteDate(Timestamp val) {
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
    public MailActivityTodoCreateDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public MailActivityTodoCreateDTO setWriteUid(String val) {
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
    public MailActivityTodoCreateDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
