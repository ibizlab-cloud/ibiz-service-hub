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


public class MailTrackingValueDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 属性标识
     */
    public final static String FIELD_FIELD_ID = "field_id";

    /**
     * 属性: 属性信息
     */
    public final static String FIELD_FIELD_INFO = "field_info";

    /**
     * 属性: 相关模型
     */
    public final static String FIELD_MODEL = "model";

    /**
     * 属性: 资源标识
     */
    public final static String FIELD_RES_ID = "res_id";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 币别
     */
    public final static String FIELD_CURRENCY_ID = "currency_id";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 消息ID
     */
    public final static String FIELD_MAIL_MESSAGE_ID = "mail_message_id";

    /**
     * 属性: 新字符值
     */
    public final static String FIELD_NEW_VALUE_CHAR = "new_value_char";

    /**
     * 属性: 新日期时间值
     */
    public final static String FIELD_NEW_VALUE_DATETIME = "new_value_datetime";

    /**
     * 属性: 新浮点值
     */
    public final static String FIELD_NEW_VALUE_FLOAT = "new_value_float";

    /**
     * 属性: 新整数值
     */
    public final static String FIELD_NEW_VALUE_INTEGER = "new_value_integer";

    /**
     * 属性: 新文本值
     */
    public final static String FIELD_NEW_VALUE_TEXT = "new_value_text";

    /**
     * 属性: 旧字符值
     */
    public final static String FIELD_OLD_VALUE_CHAR = "old_value_char";

    /**
     * 属性: 旧日期时间值
     */
    public final static String FIELD_OLD_VALUE_DATETIME = "old_value_datetime";

    /**
     * 属性: 旧浮点值
     */
    public final static String FIELD_OLD_VALUE_FLOAT = "old_value_float";

    /**
     * 属性: 旧整数值
     */
    public final static String FIELD_OLD_VALUE_INTEGER = "old_value_integer";

    /**
     * 属性: 旧文本值
     */
    public final static String FIELD_OLD_VALUE_TEXT = "old_value_text";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「属性标识」
     * @param val
     */
    @JsonProperty(FIELD_FIELD_ID)
    public MailTrackingValueDTO setFieldId(String val) {
        this._set(FIELD_FIELD_ID, val);
        return this;
    }

    /**
     * 获取「属性标识」值
     *
     */
    @JsonIgnore
    public String getFieldId() {
        return DataTypeUtils.asString(this._get(FIELD_FIELD_ID), null);
    }

    /**
     * 判断 「属性标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFieldId() {
        return this._contains(FIELD_FIELD_ID);
    }

    /**
     * 重置 「属性标识」
     *
     */
    @JsonIgnore
    public MailTrackingValueDTO resetFieldId() {
        this._reset(FIELD_FIELD_ID);
        return this;
    }

    /**
     * 设置「属性信息」
     * @param val
     */
    @JsonProperty(FIELD_FIELD_INFO)
    public MailTrackingValueDTO setFieldInfo(String val) {
        this._set(FIELD_FIELD_INFO, val);
        return this;
    }

    /**
     * 获取「属性信息」值
     *
     */
    @JsonIgnore
    public String getFieldInfo() {
        return DataTypeUtils.asString(this._get(FIELD_FIELD_INFO), null);
    }

    /**
     * 判断 「属性信息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFieldInfo() {
        return this._contains(FIELD_FIELD_INFO);
    }

    /**
     * 重置 「属性信息」
     *
     */
    @JsonIgnore
    public MailTrackingValueDTO resetFieldInfo() {
        this._reset(FIELD_FIELD_INFO);
        return this;
    }

    /**
     * 设置「相关模型」
     * @param val
     */
    @JsonProperty(FIELD_MODEL)
    public MailTrackingValueDTO setModel(String val) {
        this._set(FIELD_MODEL, val);
        return this;
    }

    /**
     * 获取「相关模型」值
     *
     */
    @JsonIgnore
    public String getModel() {
        return DataTypeUtils.asString(this._get(FIELD_MODEL), null);
    }

    /**
     * 判断 「相关模型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModel() {
        return this._contains(FIELD_MODEL);
    }

    /**
     * 重置 「相关模型」
     *
     */
    @JsonIgnore
    public MailTrackingValueDTO resetModel() {
        this._reset(FIELD_MODEL);
        return this;
    }

    /**
     * 设置「资源标识」
     * @param val
     */
    @JsonProperty(FIELD_RES_ID)
    public MailTrackingValueDTO setResId(String val) {
        this._set(FIELD_RES_ID, val);
        return this;
    }

    /**
     * 获取「资源标识」值
     *
     */
    @JsonIgnore
    public String getResId() {
        return DataTypeUtils.asString(this._get(FIELD_RES_ID), null);
    }

    /**
     * 判断 「资源标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResId() {
        return this._contains(FIELD_RES_ID);
    }

    /**
     * 重置 「资源标识」
     *
     */
    @JsonIgnore
    public MailTrackingValueDTO resetResId() {
        this._reset(FIELD_RES_ID);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public MailTrackingValueDTO setCreateDate(Timestamp val) {
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
    public MailTrackingValueDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public MailTrackingValueDTO setCreateUid(String val) {
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
    public MailTrackingValueDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「币别」
     * @param val
     */
    @JsonProperty(FIELD_CURRENCY_ID)
    public MailTrackingValueDTO setCurrencyId(String val) {
        this._set(FIELD_CURRENCY_ID, val);
        return this;
    }

    /**
     * 获取「币别」值
     *
     */
    @JsonIgnore
    public String getCurrencyId() {
        return DataTypeUtils.asString(this._get(FIELD_CURRENCY_ID), null);
    }

    /**
     * 判断 「币别」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCurrencyId() {
        return this._contains(FIELD_CURRENCY_ID);
    }

    /**
     * 重置 「币别」
     *
     */
    @JsonIgnore
    public MailTrackingValueDTO resetCurrencyId() {
        this._reset(FIELD_CURRENCY_ID);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public MailTrackingValueDTO setDisplayName(String val) {
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
    public MailTrackingValueDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailTrackingValueDTO setId(String val) {
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
    public MailTrackingValueDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「消息ID」
     * @param val
     */
    @JsonProperty(FIELD_MAIL_MESSAGE_ID)
    public MailTrackingValueDTO setMailMessageId(String val) {
        this._set(FIELD_MAIL_MESSAGE_ID, val);
        return this;
    }

    /**
     * 获取「消息ID」值
     *
     */
    @JsonIgnore
    public String getMailMessageId() {
        return DataTypeUtils.asString(this._get(FIELD_MAIL_MESSAGE_ID), null);
    }

    /**
     * 判断 「消息ID」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMailMessageId() {
        return this._contains(FIELD_MAIL_MESSAGE_ID);
    }

    /**
     * 重置 「消息ID」
     *
     */
    @JsonIgnore
    public MailTrackingValueDTO resetMailMessageId() {
        this._reset(FIELD_MAIL_MESSAGE_ID);
        return this;
    }

    /**
     * 设置「新字符值」
     * @param val
     */
    @JsonProperty(FIELD_NEW_VALUE_CHAR)
    public MailTrackingValueDTO setNewValueChar(String val) {
        this._set(FIELD_NEW_VALUE_CHAR, val);
        return this;
    }

    /**
     * 获取「新字符值」值
     *
     */
    @JsonIgnore
    public String getNewValueChar() {
        return DataTypeUtils.asString(this._get(FIELD_NEW_VALUE_CHAR), null);
    }

    /**
     * 判断 「新字符值」是否有值
     *
     */
    @JsonIgnore
    public boolean containsNewValueChar() {
        return this._contains(FIELD_NEW_VALUE_CHAR);
    }

    /**
     * 重置 「新字符值」
     *
     */
    @JsonIgnore
    public MailTrackingValueDTO resetNewValueChar() {
        this._reset(FIELD_NEW_VALUE_CHAR);
        return this;
    }

    /**
     * 设置「新日期时间值」
     * @param val
     */
    @JsonProperty(FIELD_NEW_VALUE_DATETIME)
    public MailTrackingValueDTO setNewValueDatetime(Timestamp val) {
        this._set(FIELD_NEW_VALUE_DATETIME, val);
        return this;
    }

    /**
     * 获取「新日期时间值」值
     *
     */
    @JsonIgnore
    public Timestamp getNewValueDatetime() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_NEW_VALUE_DATETIME), null);
    }

    /**
     * 判断 「新日期时间值」是否有值
     *
     */
    @JsonIgnore
    public boolean containsNewValueDatetime() {
        return this._contains(FIELD_NEW_VALUE_DATETIME);
    }

    /**
     * 重置 「新日期时间值」
     *
     */
    @JsonIgnore
    public MailTrackingValueDTO resetNewValueDatetime() {
        this._reset(FIELD_NEW_VALUE_DATETIME);
        return this;
    }

    /**
     * 设置「新浮点值」
     * @param val
     */
    @JsonProperty(FIELD_NEW_VALUE_FLOAT)
    public MailTrackingValueDTO setNewValueFloat(Double val) {
        this._set(FIELD_NEW_VALUE_FLOAT, val);
        return this;
    }

    /**
     * 获取「新浮点值」值
     *
     */
    @JsonIgnore
    public Double getNewValueFloat() {
        return DataTypeUtils.asDouble(this._get(FIELD_NEW_VALUE_FLOAT), null);
    }

    /**
     * 判断 「新浮点值」是否有值
     *
     */
    @JsonIgnore
    public boolean containsNewValueFloat() {
        return this._contains(FIELD_NEW_VALUE_FLOAT);
    }

    /**
     * 重置 「新浮点值」
     *
     */
    @JsonIgnore
    public MailTrackingValueDTO resetNewValueFloat() {
        this._reset(FIELD_NEW_VALUE_FLOAT);
        return this;
    }

    /**
     * 设置「新整数值」
     * @param val
     */
    @JsonProperty(FIELD_NEW_VALUE_INTEGER)
    public MailTrackingValueDTO setNewValueInteger(Integer val) {
        this._set(FIELD_NEW_VALUE_INTEGER, val);
        return this;
    }

    /**
     * 获取「新整数值」值
     *
     */
    @JsonIgnore
    public Integer getNewValueInteger() {
        return DataTypeUtils.asInteger(this._get(FIELD_NEW_VALUE_INTEGER), null);
    }

    /**
     * 判断 「新整数值」是否有值
     *
     */
    @JsonIgnore
    public boolean containsNewValueInteger() {
        return this._contains(FIELD_NEW_VALUE_INTEGER);
    }

    /**
     * 重置 「新整数值」
     *
     */
    @JsonIgnore
    public MailTrackingValueDTO resetNewValueInteger() {
        this._reset(FIELD_NEW_VALUE_INTEGER);
        return this;
    }

    /**
     * 设置「新文本值」
     * @param val
     */
    @JsonProperty(FIELD_NEW_VALUE_TEXT)
    public MailTrackingValueDTO setNewValueText(String val) {
        this._set(FIELD_NEW_VALUE_TEXT, val);
        return this;
    }

    /**
     * 获取「新文本值」值
     *
     */
    @JsonIgnore
    public String getNewValueText() {
        return DataTypeUtils.asString(this._get(FIELD_NEW_VALUE_TEXT), null);
    }

    /**
     * 判断 「新文本值」是否有值
     *
     */
    @JsonIgnore
    public boolean containsNewValueText() {
        return this._contains(FIELD_NEW_VALUE_TEXT);
    }

    /**
     * 重置 「新文本值」
     *
     */
    @JsonIgnore
    public MailTrackingValueDTO resetNewValueText() {
        this._reset(FIELD_NEW_VALUE_TEXT);
        return this;
    }

    /**
     * 设置「旧字符值」
     * @param val
     */
    @JsonProperty(FIELD_OLD_VALUE_CHAR)
    public MailTrackingValueDTO setOldValueChar(String val) {
        this._set(FIELD_OLD_VALUE_CHAR, val);
        return this;
    }

    /**
     * 获取「旧字符值」值
     *
     */
    @JsonIgnore
    public String getOldValueChar() {
        return DataTypeUtils.asString(this._get(FIELD_OLD_VALUE_CHAR), null);
    }

    /**
     * 判断 「旧字符值」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOldValueChar() {
        return this._contains(FIELD_OLD_VALUE_CHAR);
    }

    /**
     * 重置 「旧字符值」
     *
     */
    @JsonIgnore
    public MailTrackingValueDTO resetOldValueChar() {
        this._reset(FIELD_OLD_VALUE_CHAR);
        return this;
    }

    /**
     * 设置「旧日期时间值」
     * @param val
     */
    @JsonProperty(FIELD_OLD_VALUE_DATETIME)
    public MailTrackingValueDTO setOldValueDatetime(Timestamp val) {
        this._set(FIELD_OLD_VALUE_DATETIME, val);
        return this;
    }

    /**
     * 获取「旧日期时间值」值
     *
     */
    @JsonIgnore
    public Timestamp getOldValueDatetime() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_OLD_VALUE_DATETIME), null);
    }

    /**
     * 判断 「旧日期时间值」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOldValueDatetime() {
        return this._contains(FIELD_OLD_VALUE_DATETIME);
    }

    /**
     * 重置 「旧日期时间值」
     *
     */
    @JsonIgnore
    public MailTrackingValueDTO resetOldValueDatetime() {
        this._reset(FIELD_OLD_VALUE_DATETIME);
        return this;
    }

    /**
     * 设置「旧浮点值」
     * @param val
     */
    @JsonProperty(FIELD_OLD_VALUE_FLOAT)
    public MailTrackingValueDTO setOldValueFloat(Double val) {
        this._set(FIELD_OLD_VALUE_FLOAT, val);
        return this;
    }

    /**
     * 获取「旧浮点值」值
     *
     */
    @JsonIgnore
    public Double getOldValueFloat() {
        return DataTypeUtils.asDouble(this._get(FIELD_OLD_VALUE_FLOAT), null);
    }

    /**
     * 判断 「旧浮点值」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOldValueFloat() {
        return this._contains(FIELD_OLD_VALUE_FLOAT);
    }

    /**
     * 重置 「旧浮点值」
     *
     */
    @JsonIgnore
    public MailTrackingValueDTO resetOldValueFloat() {
        this._reset(FIELD_OLD_VALUE_FLOAT);
        return this;
    }

    /**
     * 设置「旧整数值」
     * @param val
     */
    @JsonProperty(FIELD_OLD_VALUE_INTEGER)
    public MailTrackingValueDTO setOldValueInteger(Integer val) {
        this._set(FIELD_OLD_VALUE_INTEGER, val);
        return this;
    }

    /**
     * 获取「旧整数值」值
     *
     */
    @JsonIgnore
    public Integer getOldValueInteger() {
        return DataTypeUtils.asInteger(this._get(FIELD_OLD_VALUE_INTEGER), null);
    }

    /**
     * 判断 「旧整数值」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOldValueInteger() {
        return this._contains(FIELD_OLD_VALUE_INTEGER);
    }

    /**
     * 重置 「旧整数值」
     *
     */
    @JsonIgnore
    public MailTrackingValueDTO resetOldValueInteger() {
        this._reset(FIELD_OLD_VALUE_INTEGER);
        return this;
    }

    /**
     * 设置「旧文本值」
     * @param val
     */
    @JsonProperty(FIELD_OLD_VALUE_TEXT)
    public MailTrackingValueDTO setOldValueText(String val) {
        this._set(FIELD_OLD_VALUE_TEXT, val);
        return this;
    }

    /**
     * 获取「旧文本值」值
     *
     */
    @JsonIgnore
    public String getOldValueText() {
        return DataTypeUtils.asString(this._get(FIELD_OLD_VALUE_TEXT), null);
    }

    /**
     * 判断 「旧文本值」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOldValueText() {
        return this._contains(FIELD_OLD_VALUE_TEXT);
    }

    /**
     * 重置 「旧文本值」
     *
     */
    @JsonIgnore
    public MailTrackingValueDTO resetOldValueText() {
        this._reset(FIELD_OLD_VALUE_TEXT);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public MailTrackingValueDTO setWriteDate(Timestamp val) {
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
    public MailTrackingValueDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public MailTrackingValueDTO setWriteUid(String val) {
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
    public MailTrackingValueDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
