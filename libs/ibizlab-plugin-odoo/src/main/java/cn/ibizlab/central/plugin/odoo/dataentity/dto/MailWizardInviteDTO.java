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


public class MailWizardInviteDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

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
    public final static String FIELD_MESSAGE = "message";

    /**
     * 属性: 通知收件人
     */
    public final static String FIELD_NOTIFY = "notify";

    /**
     * 属性: 相关单据ID
     */
    public final static String FIELD_RES_ID = "res_id";

    /**
     * 属性: 相关单据模型
     */
    public final static String FIELD_RES_MODEL = "res_model";

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
    public MailWizardInviteDTO setCreateDate(Timestamp val) {
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
    public MailWizardInviteDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public MailWizardInviteDTO setCreateUid(String val) {
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
    public MailWizardInviteDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public MailWizardInviteDTO setDisplayName(String val) {
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
    public MailWizardInviteDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailWizardInviteDTO setId(String val) {
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
    public MailWizardInviteDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「消息」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE)
    public MailWizardInviteDTO setMessage(String val) {
        this._set(FIELD_MESSAGE, val);
        return this;
    }

    /**
     * 获取「消息」值
     *
     */
    @JsonIgnore
    public String getMessage() {
        return DataTypeUtils.asString(this._get(FIELD_MESSAGE), null);
    }

    /**
     * 判断 「消息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessage() {
        return this._contains(FIELD_MESSAGE);
    }

    /**
     * 重置 「消息」
     *
     */
    @JsonIgnore
    public MailWizardInviteDTO resetMessage() {
        this._reset(FIELD_MESSAGE);
        return this;
    }

    /**
     * 设置「通知收件人」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_NOTIFY)
    public MailWizardInviteDTO setNotify(Integer val) {
        this._set(FIELD_NOTIFY, val);
        return this;
    }

    /**
     * 获取「通知收件人」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getNotify() {
        return DataTypeUtils.asInteger(this._get(FIELD_NOTIFY), null);
    }

    /**
     * 判断 「通知收件人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsNotify() {
        return this._contains(FIELD_NOTIFY);
    }

    /**
     * 重置 「通知收件人」
     *
     */
    @JsonIgnore
    public MailWizardInviteDTO resetNotify() {
        this._reset(FIELD_NOTIFY);
        return this;
    }

    /**
     * 设置「相关单据ID」
     * @param val
     */
    @JsonProperty(FIELD_RES_ID)
    public MailWizardInviteDTO setResId(Integer val) {
        this._set(FIELD_RES_ID, val);
        return this;
    }

    /**
     * 获取「相关单据ID」值
     *
     */
    @JsonIgnore
    public Integer getResId() {
        return DataTypeUtils.asInteger(this._get(FIELD_RES_ID), null);
    }

    /**
     * 判断 「相关单据ID」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResId() {
        return this._contains(FIELD_RES_ID);
    }

    /**
     * 重置 「相关单据ID」
     *
     */
    @JsonIgnore
    public MailWizardInviteDTO resetResId() {
        this._reset(FIELD_RES_ID);
        return this;
    }

    /**
     * 设置「相关单据模型」
     * @param val
     */
    @JsonProperty(FIELD_RES_MODEL)
    public MailWizardInviteDTO setResModel(String val) {
        this._set(FIELD_RES_MODEL, val);
        return this;
    }

    /**
     * 获取「相关单据模型」值
     *
     */
    @JsonIgnore
    public String getResModel() {
        return DataTypeUtils.asString(this._get(FIELD_RES_MODEL), null);
    }

    /**
     * 判断 「相关单据模型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResModel() {
        return this._contains(FIELD_RES_MODEL);
    }

    /**
     * 重置 「相关单据模型」
     *
     */
    @JsonIgnore
    public MailWizardInviteDTO resetResModel() {
        this._reset(FIELD_RES_MODEL);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public MailWizardInviteDTO setWriteDate(Timestamp val) {
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
    public MailWizardInviteDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public MailWizardInviteDTO setWriteUid(String val) {
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
    public MailWizardInviteDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
