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


public class ResUsersNonLoggedInDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 公司
     */
    public final static String FIELD_COMPANY_ID = "company_id";

    /**
     * 属性: 公司名称
     */
    public final static String FIELD_COMPANY_NAME = "company_name";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 登录
     */
    public final static String FIELD_LOGIN = "login";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 状态
     */
    public final static String FIELD_STATE = "state";

    /**
     * 属性: 最近的登录日期
     */
    public final static String FIELD_LOGIN_DATE = "login_date";

    /**
     * 设置「公司」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_ID)
    public ResUsersNonLoggedInDTO setCompanyId(String val) {
        this._set(FIELD_COMPANY_ID, val);
        return this;
    }

    /**
     * 获取「公司」值
     *
     */
    @JsonIgnore
    public String getCompanyId() {
        return DataTypeUtils.asString(this._get(FIELD_COMPANY_ID), null);
    }

    /**
     * 判断 「公司」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCompanyId() {
        return this._contains(FIELD_COMPANY_ID);
    }

    /**
     * 重置 「公司」
     *
     */
    @JsonIgnore
    public ResUsersNonLoggedInDTO resetCompanyId() {
        this._reset(FIELD_COMPANY_ID);
        return this;
    }

    /**
     * 设置「公司名称」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_NAME)
    public ResUsersNonLoggedInDTO setCompanyName(String val) {
        this._set(FIELD_COMPANY_NAME, val);
        return this;
    }

    /**
     * 获取「公司名称」值
     *
     */
    @JsonIgnore
    public String getCompanyName() {
        return DataTypeUtils.asString(this._get(FIELD_COMPANY_NAME), null);
    }

    /**
     * 判断 「公司名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCompanyName() {
        return this._contains(FIELD_COMPANY_NAME);
    }

    /**
     * 重置 「公司名称」
     *
     */
    @JsonIgnore
    public ResUsersNonLoggedInDTO resetCompanyName() {
        this._reset(FIELD_COMPANY_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public ResUsersNonLoggedInDTO setId(String val) {
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
    public ResUsersNonLoggedInDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「登录」
     * @param val
     */
    @JsonProperty(FIELD_LOGIN)
    public ResUsersNonLoggedInDTO setLogin(String val) {
        this._set(FIELD_LOGIN, val);
        return this;
    }

    /**
     * 获取「登录」值
     *
     */
    @JsonIgnore
    public String getLogin() {
        return DataTypeUtils.asString(this._get(FIELD_LOGIN), null);
    }

    /**
     * 判断 「登录」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLogin() {
        return this._contains(FIELD_LOGIN);
    }

    /**
     * 重置 「登录」
     *
     */
    @JsonIgnore
    public ResUsersNonLoggedInDTO resetLogin() {
        this._reset(FIELD_LOGIN);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public ResUsersNonLoggedInDTO setName(String val) {
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
    public ResUsersNonLoggedInDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「状态」
     * 代码表[状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_users_state
     * @param val
     */
    @JsonProperty(FIELD_STATE)
    public ResUsersNonLoggedInDTO setState(String val) {
        this._set(FIELD_STATE, val);
        return this;
    }

    /**
     * 获取「状态」值
     * 代码表[状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_users_state
     *
     */
    @JsonIgnore
    public String getState() {
        return DataTypeUtils.asString(this._get(FIELD_STATE), null);
    }

    /**
     * 判断 「状态」是否有值
     *
     */
    @JsonIgnore
    public boolean containsState() {
        return this._contains(FIELD_STATE);
    }

    /**
     * 重置 「状态」
     *
     */
    @JsonIgnore
    public ResUsersNonLoggedInDTO resetState() {
        this._reset(FIELD_STATE);
        return this;
    }

    /**
     * 设置「最近的登录日期」
     * @param val
     */
    @JsonProperty(FIELD_LOGIN_DATE)
    public ResUsersNonLoggedInDTO setLoginDate(Timestamp val) {
        this._set(FIELD_LOGIN_DATE, val);
        return this;
    }

    /**
     * 获取「最近的登录日期」值
     *
     */
    @JsonIgnore
    public Timestamp getLoginDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_LOGIN_DATE), null);
    }

    /**
     * 判断 「最近的登录日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLoginDate() {
        return this._contains(FIELD_LOGIN_DATE);
    }

    /**
     * 重置 「最近的登录日期」
     *
     */
    @JsonIgnore
    public ResUsersNonLoggedInDTO resetLoginDate() {
        this._reset(FIELD_LOGIN_DATE);
        return this;
    }

}
