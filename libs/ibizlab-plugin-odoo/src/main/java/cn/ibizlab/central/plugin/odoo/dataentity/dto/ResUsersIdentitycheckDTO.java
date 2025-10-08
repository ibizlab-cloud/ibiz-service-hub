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


public class ResUsersIdentitycheckDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 验证方式
     */
    public final static String FIELD_AUTH_METHOD = "auth_method";

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
     * 属性: 密码
     */
    public final static String FIELD_PASSWORD = "password";

    /**
     * 属性: 请求
     */
    public final static String FIELD_REQUEST = "request";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「验证方式」
     * 代码表[验证方式]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_users_identitycheck_auth_method
     * @param val
     */
    @JsonProperty(FIELD_AUTH_METHOD)
    public ResUsersIdentitycheckDTO setAuthMethod(String val) {
        this._set(FIELD_AUTH_METHOD, val);
        return this;
    }

    /**
     * 获取「验证方式」值
     * 代码表[验证方式]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_users_identitycheck_auth_method
     *
     */
    @JsonIgnore
    public String getAuthMethod() {
        return DataTypeUtils.asString(this._get(FIELD_AUTH_METHOD), null);
    }

    /**
     * 判断 「验证方式」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAuthMethod() {
        return this._contains(FIELD_AUTH_METHOD);
    }

    /**
     * 重置 「验证方式」
     *
     */
    @JsonIgnore
    public ResUsersIdentitycheckDTO resetAuthMethod() {
        this._reset(FIELD_AUTH_METHOD);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public ResUsersIdentitycheckDTO setCreateDate(Timestamp val) {
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
    public ResUsersIdentitycheckDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public ResUsersIdentitycheckDTO setCreateUid(String val) {
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
    public ResUsersIdentitycheckDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public ResUsersIdentitycheckDTO setDisplayName(String val) {
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
    public ResUsersIdentitycheckDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public ResUsersIdentitycheckDTO setId(String val) {
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
    public ResUsersIdentitycheckDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「密码」
     * @param val
     */
    @JsonProperty(FIELD_PASSWORD)
    public ResUsersIdentitycheckDTO setPassword(String val) {
        this._set(FIELD_PASSWORD, val);
        return this;
    }

    /**
     * 获取「密码」值
     *
     */
    @JsonIgnore
    public String getPassword() {
        return DataTypeUtils.asString(this._get(FIELD_PASSWORD), null);
    }

    /**
     * 判断 「密码」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPassword() {
        return this._contains(FIELD_PASSWORD);
    }

    /**
     * 重置 「密码」
     *
     */
    @JsonIgnore
    public ResUsersIdentitycheckDTO resetPassword() {
        this._reset(FIELD_PASSWORD);
        return this;
    }

    /**
     * 设置「请求」
     * @param val
     */
    @JsonProperty(FIELD_REQUEST)
    public ResUsersIdentitycheckDTO setRequest(String val) {
        this._set(FIELD_REQUEST, val);
        return this;
    }

    /**
     * 获取「请求」值
     *
     */
    @JsonIgnore
    public String getRequest() {
        return DataTypeUtils.asString(this._get(FIELD_REQUEST), null);
    }

    /**
     * 判断 「请求」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRequest() {
        return this._contains(FIELD_REQUEST);
    }

    /**
     * 重置 「请求」
     *
     */
    @JsonIgnore
    public ResUsersIdentitycheckDTO resetRequest() {
        this._reset(FIELD_REQUEST);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public ResUsersIdentitycheckDTO setWriteDate(Timestamp val) {
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
    public ResUsersIdentitycheckDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public ResUsersIdentitycheckDTO setWriteUid(String val) {
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
    public ResUsersIdentitycheckDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
