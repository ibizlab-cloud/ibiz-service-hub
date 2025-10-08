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


public class ChangePasswordUserDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 新密码
     */
    public final static String FIELD_NEW_PASSWD = "new_passwd";

    /**
     * 属性: 用户登录
     */
    public final static String FIELD_USER_LOGIN = "user_login";

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
    public ChangePasswordUserDTO setCreateDate(Timestamp val) {
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
    public ChangePasswordUserDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public ChangePasswordUserDTO setCreateUid(String val) {
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
    public ChangePasswordUserDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public ChangePasswordUserDTO setId(String val) {
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
    public ChangePasswordUserDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「新密码」
     * @param val
     */
    @JsonProperty(FIELD_NEW_PASSWD)
    public ChangePasswordUserDTO setNewPasswd(String val) {
        this._set(FIELD_NEW_PASSWD, val);
        return this;
    }

    /**
     * 获取「新密码」值
     *
     */
    @JsonIgnore
    public String getNewPasswd() {
        return DataTypeUtils.asString(this._get(FIELD_NEW_PASSWD), null);
    }

    /**
     * 判断 「新密码」是否有值
     *
     */
    @JsonIgnore
    public boolean containsNewPasswd() {
        return this._contains(FIELD_NEW_PASSWD);
    }

    /**
     * 重置 「新密码」
     *
     */
    @JsonIgnore
    public ChangePasswordUserDTO resetNewPasswd() {
        this._reset(FIELD_NEW_PASSWD);
        return this;
    }

    /**
     * 设置「用户登录」
     * @param val
     */
    @JsonProperty(FIELD_USER_LOGIN)
    public ChangePasswordUserDTO setUserLogin(String val) {
        this._set(FIELD_USER_LOGIN, val);
        return this;
    }

    /**
     * 获取「用户登录」值
     *
     */
    @JsonIgnore
    public String getUserLogin() {
        return DataTypeUtils.asString(this._get(FIELD_USER_LOGIN), null);
    }

    /**
     * 判断 「用户登录」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUserLogin() {
        return this._contains(FIELD_USER_LOGIN);
    }

    /**
     * 重置 「用户登录」
     *
     */
    @JsonIgnore
    public ChangePasswordUserDTO resetUserLogin() {
        this._reset(FIELD_USER_LOGIN);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public ChangePasswordUserDTO setWriteDate(Timestamp val) {
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
    public ChangePasswordUserDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public ChangePasswordUserDTO setWriteUid(String val) {
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
    public ChangePasswordUserDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
