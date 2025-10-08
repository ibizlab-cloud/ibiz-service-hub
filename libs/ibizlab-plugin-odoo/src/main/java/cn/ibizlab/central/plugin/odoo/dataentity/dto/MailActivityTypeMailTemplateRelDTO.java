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


public class MailActivityTypeMailTemplateRelDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 标识
     */
    public final static String FIELD_MAIL_ACTIVITY_TYPE_ID = "mail_activity_type_id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_MAIL_ACTIVITY_TYPE_NAME = "mail_activity_type_name";

    /**
     * 属性: 标识
     */
    public final static String FIELD_MAIL_TEMPLATE_ID = "mail_template_id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_MAIL_TEMPLATE_NAME = "mail_template_name";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailActivityTypeMailTemplateRelDTO setId(String val) {
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
    public MailActivityTypeMailTemplateRelDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_MAIL_ACTIVITY_TYPE_ID)
    public MailActivityTypeMailTemplateRelDTO setMailActivityTypeId(String val) {
        this._set(FIELD_MAIL_ACTIVITY_TYPE_ID, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
     */
    @JsonIgnore
    public String getMailActivityTypeId() {
        return DataTypeUtils.asString(this._get(FIELD_MAIL_ACTIVITY_TYPE_ID), null);
    }

    /**
     * 判断 「标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMailActivityTypeId() {
        return this._contains(FIELD_MAIL_ACTIVITY_TYPE_ID);
    }

    /**
     * 重置 「标识」
     *
     */
    @JsonIgnore
    public MailActivityTypeMailTemplateRelDTO resetMailActivityTypeId() {
        this._reset(FIELD_MAIL_ACTIVITY_TYPE_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_MAIL_ACTIVITY_TYPE_NAME)
    public MailActivityTypeMailTemplateRelDTO setMailActivityTypeName(String val) {
        this._set(FIELD_MAIL_ACTIVITY_TYPE_NAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
     */
    @JsonIgnore
    public String getMailActivityTypeName() {
        return DataTypeUtils.asString(this._get(FIELD_MAIL_ACTIVITY_TYPE_NAME), null);
    }

    /**
     * 判断 「名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMailActivityTypeName() {
        return this._contains(FIELD_MAIL_ACTIVITY_TYPE_NAME);
    }

    /**
     * 重置 「名称」
     *
     */
    @JsonIgnore
    public MailActivityTypeMailTemplateRelDTO resetMailActivityTypeName() {
        this._reset(FIELD_MAIL_ACTIVITY_TYPE_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_MAIL_TEMPLATE_ID)
    public MailActivityTypeMailTemplateRelDTO setMailTemplateId(String val) {
        this._set(FIELD_MAIL_TEMPLATE_ID, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
     */
    @JsonIgnore
    public String getMailTemplateId() {
        return DataTypeUtils.asString(this._get(FIELD_MAIL_TEMPLATE_ID), null);
    }

    /**
     * 判断 「标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMailTemplateId() {
        return this._contains(FIELD_MAIL_TEMPLATE_ID);
    }

    /**
     * 重置 「标识」
     *
     */
    @JsonIgnore
    public MailActivityTypeMailTemplateRelDTO resetMailTemplateId() {
        this._reset(FIELD_MAIL_TEMPLATE_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_MAIL_TEMPLATE_NAME)
    public MailActivityTypeMailTemplateRelDTO setMailTemplateName(String val) {
        this._set(FIELD_MAIL_TEMPLATE_NAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
     */
    @JsonIgnore
    public String getMailTemplateName() {
        return DataTypeUtils.asString(this._get(FIELD_MAIL_TEMPLATE_NAME), null);
    }

    /**
     * 判断 「名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMailTemplateName() {
        return this._contains(FIELD_MAIL_TEMPLATE_NAME);
    }

    /**
     * 重置 「名称」
     *
     */
    @JsonIgnore
    public MailActivityTypeMailTemplateRelDTO resetMailTemplateName() {
        this._reset(FIELD_MAIL_TEMPLATE_NAME);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public MailActivityTypeMailTemplateRelDTO setName(String val) {
        this._set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
     */
    @JsonIgnore
    public String getName() {
        return DataTypeUtils.asString(this._get(FIELD_NAME), null);
    }

    /**
     * 判断 「名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsName() {
        return this._contains(FIELD_NAME);
    }

    /**
     * 重置 「名称」
     *
     */
    @JsonIgnore
    public MailActivityTypeMailTemplateRelDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

}
