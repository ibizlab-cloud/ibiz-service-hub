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


public class ResUsersApikeysDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 有效期
     */
    public final static String FIELD_EXPIRATION_DATE = "expiration_date";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 范围
     */
    public final static String FIELD_SCOPE = "scope";

    /**
     * 属性: 用户
     */
    public final static String FIELD_USER_ID = "user_id";

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public ResUsersApikeysDTO setCreateDate(Timestamp val) {
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
    public ResUsersApikeysDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public ResUsersApikeysDTO setDisplayName(String val) {
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
    public ResUsersApikeysDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「有效期」
     * @param val
     */
    @JsonProperty(FIELD_EXPIRATION_DATE)
    public ResUsersApikeysDTO setExpirationDate(Timestamp val) {
        this._set(FIELD_EXPIRATION_DATE, val);
        return this;
    }

    /**
     * 获取「有效期」值
     *
     */
    @JsonIgnore
    public Timestamp getExpirationDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_EXPIRATION_DATE), null);
    }

    /**
     * 判断 「有效期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsExpirationDate() {
        return this._contains(FIELD_EXPIRATION_DATE);
    }

    /**
     * 重置 「有效期」
     *
     */
    @JsonIgnore
    public ResUsersApikeysDTO resetExpirationDate() {
        this._reset(FIELD_EXPIRATION_DATE);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public ResUsersApikeysDTO setId(String val) {
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
    public ResUsersApikeysDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public ResUsersApikeysDTO setName(String val) {
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
    public ResUsersApikeysDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「范围」
     * @param val
     */
    @JsonProperty(FIELD_SCOPE)
    public ResUsersApikeysDTO setScope(String val) {
        this._set(FIELD_SCOPE, val);
        return this;
    }

    /**
     * 获取「范围」值
     *
     */
    @JsonIgnore
    public String getScope() {
        return DataTypeUtils.asString(this._get(FIELD_SCOPE), null);
    }

    /**
     * 判断 「范围」是否有值
     *
     */
    @JsonIgnore
    public boolean containsScope() {
        return this._contains(FIELD_SCOPE);
    }

    /**
     * 重置 「范围」
     *
     */
    @JsonIgnore
    public ResUsersApikeysDTO resetScope() {
        this._reset(FIELD_SCOPE);
        return this;
    }

    /**
     * 设置「用户」
     * @param val
     */
    @JsonProperty(FIELD_USER_ID)
    public ResUsersApikeysDTO setUserId(String val) {
        this._set(FIELD_USER_ID, val);
        return this;
    }

    /**
     * 获取「用户」值
     *
     */
    @JsonIgnore
    public String getUserId() {
        return DataTypeUtils.asString(this._get(FIELD_USER_ID), null);
    }

    /**
     * 判断 「用户」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUserId() {
        return this._contains(FIELD_USER_ID);
    }

    /**
     * 重置 「用户」
     *
     */
    @JsonIgnore
    public ResUsersApikeysDTO resetUserId() {
        this._reset(FIELD_USER_ID);
        return this;
    }

}
