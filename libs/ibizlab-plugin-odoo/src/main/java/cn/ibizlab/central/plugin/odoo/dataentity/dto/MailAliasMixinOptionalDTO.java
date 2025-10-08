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


public class MailAliasMixinOptionalDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 电子邮件别名
     */
    public final static String FIELD_ALIAS_EMAIL = "alias_email";

    /**
     * 属性: 别名
     */
    public final static String FIELD_ALIAS_ID = "alias_id";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 设置「电子邮件别名」
     * @param val
     */
    @JsonProperty(FIELD_ALIAS_EMAIL)
    public MailAliasMixinOptionalDTO setAliasEmail(String val) {
        this._set(FIELD_ALIAS_EMAIL, val);
        return this;
    }

    /**
     * 获取「电子邮件别名」值
     *
     */
    @JsonIgnore
    public String getAliasEmail() {
        return DataTypeUtils.asString(this._get(FIELD_ALIAS_EMAIL), null);
    }

    /**
     * 判断 「电子邮件别名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAliasEmail() {
        return this._contains(FIELD_ALIAS_EMAIL);
    }

    /**
     * 重置 「电子邮件别名」
     *
     */
    @JsonIgnore
    public MailAliasMixinOptionalDTO resetAliasEmail() {
        this._reset(FIELD_ALIAS_EMAIL);
        return this;
    }

    /**
     * 设置「别名」
     * @param val
     */
    @JsonProperty(FIELD_ALIAS_ID)
    public MailAliasMixinOptionalDTO setAliasId(String val) {
        this._set(FIELD_ALIAS_ID, val);
        return this;
    }

    /**
     * 获取「别名」值
     *
     */
    @JsonIgnore
    public String getAliasId() {
        return DataTypeUtils.asString(this._get(FIELD_ALIAS_ID), null);
    }

    /**
     * 判断 「别名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAliasId() {
        return this._contains(FIELD_ALIAS_ID);
    }

    /**
     * 重置 「别名」
     *
     */
    @JsonIgnore
    public MailAliasMixinOptionalDTO resetAliasId() {
        this._reset(FIELD_ALIAS_ID);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailAliasMixinOptionalDTO setId(String val) {
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
    public MailAliasMixinOptionalDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public MailAliasMixinOptionalDTO setName(String val) {
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
    public MailAliasMixinOptionalDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

}
