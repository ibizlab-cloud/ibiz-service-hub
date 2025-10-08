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


public class CloudProxyUserDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 姓名
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 邮箱
     */
    public final static String FIELD_EMAIL = "email";

    /**
     * 属性: 手机号
     */
    public final static String FIELD_MOBILE = "mobile";

    /**
     * 属性: 密码
     */
    public final static String FIELD_PASSWORD = "password";

    /**
     * 属性: 工号
     */
    public final static String FIELD_EMPLOYEE_NUMBER = "employee_number";

    /**
     * 属性: 头像
     */
    public final static String FIELD_AVATAR = "avatar";

    /**
     * 属性: 状态
     */
    public final static String FIELD_STATUS = "status";

    /**
     * 属性: 用户ID
     */
    public final static String FIELD_USER_ID = "user_id";

    /**
     * 属性: 职位
     */
    public final static String FIELD_TITLE = "title";

    /**
     * 属性: 部门标识
     */
    public final static String FIELD_DEPARTMENT_ID = "department_id";

    /**
     * 属性: 部门名称
     */
    public final static String FIELD_DEPARTMENT_NAME = "department_name";

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
     * 属性: 组织标识
     */
    public final static String FIELD_ORGANIZATION_ID = "organization_id";

    /**
     * 属性: 组织名称
     */
    public final static String FIELD_ORGANIZATION_NAME = "organization_name";

    /**
     * 设置「姓名」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public CloudProxyUserDTO setDisplayName(String val) {
        this._set(FIELD_DISPLAY_NAME, val);
        return this;
    }

    /**
     * 获取「姓名」值
     *
     */
    @JsonIgnore
    public String getDisplayName() {
        return DataTypeUtils.asString(this._get(FIELD_DISPLAY_NAME), null);
    }

    /**
     * 判断 「姓名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDisplayName() {
        return this._contains(FIELD_DISPLAY_NAME);
    }

    /**
     * 重置 「姓名」
     *
     */
    @JsonIgnore
    public CloudProxyUserDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「邮箱」
     * @param val
     */
    @JsonProperty(FIELD_EMAIL)
    public CloudProxyUserDTO setEmail(String val) {
        this._set(FIELD_EMAIL, val);
        return this;
    }

    /**
     * 获取「邮箱」值
     *
     */
    @JsonIgnore
    public String getEmail() {
        return DataTypeUtils.asString(this._get(FIELD_EMAIL), null);
    }

    /**
     * 判断 「邮箱」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEmail() {
        return this._contains(FIELD_EMAIL);
    }

    /**
     * 重置 「邮箱」
     *
     */
    @JsonIgnore
    public CloudProxyUserDTO resetEmail() {
        this._reset(FIELD_EMAIL);
        return this;
    }

    /**
     * 设置「手机号」
     * @param val
     */
    @JsonProperty(FIELD_MOBILE)
    public CloudProxyUserDTO setMobile(String val) {
        this._set(FIELD_MOBILE, val);
        return this;
    }

    /**
     * 获取「手机号」值
     *
     */
    @JsonIgnore
    public String getMobile() {
        return DataTypeUtils.asString(this._get(FIELD_MOBILE), null);
    }

    /**
     * 判断 「手机号」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMobile() {
        return this._contains(FIELD_MOBILE);
    }

    /**
     * 重置 「手机号」
     *
     */
    @JsonIgnore
    public CloudProxyUserDTO resetMobile() {
        this._reset(FIELD_MOBILE);
        return this;
    }

    /**
     * 设置「密码」
     * @param val
     */
    @JsonProperty(FIELD_PASSWORD)
    public CloudProxyUserDTO setPassword(String val) {
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
    public CloudProxyUserDTO resetPassword() {
        this._reset(FIELD_PASSWORD);
        return this;
    }

    /**
     * 设置「工号」
     * @param val
     */
    @JsonProperty(FIELD_EMPLOYEE_NUMBER)
    public CloudProxyUserDTO setEmployeeNumber(String val) {
        this._set(FIELD_EMPLOYEE_NUMBER, val);
        return this;
    }

    /**
     * 获取「工号」值
     *
     */
    @JsonIgnore
    public String getEmployeeNumber() {
        return DataTypeUtils.asString(this._get(FIELD_EMPLOYEE_NUMBER), null);
    }

    /**
     * 判断 「工号」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEmployeeNumber() {
        return this._contains(FIELD_EMPLOYEE_NUMBER);
    }

    /**
     * 重置 「工号」
     *
     */
    @JsonIgnore
    public CloudProxyUserDTO resetEmployeeNumber() {
        this._reset(FIELD_EMPLOYEE_NUMBER);
        return this;
    }

    /**
     * 设置「头像」
     * @param val
     */
    @JsonProperty(FIELD_AVATAR)
    public CloudProxyUserDTO setAvatar(String val) {
        this._set(FIELD_AVATAR, val);
        return this;
    }

    /**
     * 获取「头像」值
     *
     */
    @JsonIgnore
    public String getAvatar() {
        return DataTypeUtils.asString(this._get(FIELD_AVATAR), null);
    }

    /**
     * 判断 「头像」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAvatar() {
        return this._contains(FIELD_AVATAR);
    }

    /**
     * 重置 「头像」
     *
     */
    @JsonIgnore
    public CloudProxyUserDTO resetAvatar() {
        this._reset(FIELD_AVATAR);
        return this;
    }

    /**
     * 设置「状态」
     * @param val
     */
    @JsonProperty(FIELD_STATUS)
    public CloudProxyUserDTO setStatus(String val) {
        this._set(FIELD_STATUS, val);
        return this;
    }

    /**
     * 获取「状态」值
     *
     */
    @JsonIgnore
    public String getStatus() {
        return DataTypeUtils.asString(this._get(FIELD_STATUS), null);
    }

    /**
     * 判断 「状态」是否有值
     *
     */
    @JsonIgnore
    public boolean containsStatus() {
        return this._contains(FIELD_STATUS);
    }

    /**
     * 重置 「状态」
     *
     */
    @JsonIgnore
    public CloudProxyUserDTO resetStatus() {
        this._reset(FIELD_STATUS);
        return this;
    }

    /**
     * 设置「用户ID」
     * @param val
     */
    @JsonProperty(FIELD_USER_ID)
    public CloudProxyUserDTO setUserId(String val) {
        this._set(FIELD_USER_ID, val);
        return this;
    }

    /**
     * 获取「用户ID」值
     *
     */
    @JsonIgnore
    public String getUserId() {
        return DataTypeUtils.asString(this._get(FIELD_USER_ID), null);
    }

    /**
     * 判断 「用户ID」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUserId() {
        return this._contains(FIELD_USER_ID);
    }

    /**
     * 重置 「用户ID」
     *
     */
    @JsonIgnore
    public CloudProxyUserDTO resetUserId() {
        this._reset(FIELD_USER_ID);
        return this;
    }

    /**
     * 设置「职位」
     * @param val
     */
    @JsonProperty(FIELD_TITLE)
    public CloudProxyUserDTO setTitle(String val) {
        this._set(FIELD_TITLE, val);
        return this;
    }

    /**
     * 获取「职位」值
     *
     */
    @JsonIgnore
    public String getTitle() {
        return DataTypeUtils.asString(this._get(FIELD_TITLE), null);
    }

    /**
     * 判断 「职位」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTitle() {
        return this._contains(FIELD_TITLE);
    }

    /**
     * 重置 「职位」
     *
     */
    @JsonIgnore
    public CloudProxyUserDTO resetTitle() {
        this._reset(FIELD_TITLE);
        return this;
    }

    /**
     * 设置「部门标识」
     * @param val
     */
    @JsonProperty(FIELD_DEPARTMENT_ID)
    public CloudProxyUserDTO setDepartmentId(String val) {
        this._set(FIELD_DEPARTMENT_ID, val);
        return this;
    }

    /**
     * 获取「部门标识」值
     *
     */
    @JsonIgnore
    public String getDepartmentId() {
        return DataTypeUtils.asString(this._get(FIELD_DEPARTMENT_ID), null);
    }

    /**
     * 判断 「部门标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDepartmentId() {
        return this._contains(FIELD_DEPARTMENT_ID);
    }

    /**
     * 重置 「部门标识」
     *
     */
    @JsonIgnore
    public CloudProxyUserDTO resetDepartmentId() {
        this._reset(FIELD_DEPARTMENT_ID);
        return this;
    }

    /**
     * 设置「部门名称」
     * @param val
     */
    @JsonProperty(FIELD_DEPARTMENT_NAME)
    public CloudProxyUserDTO setDepartmentName(String val) {
        this._set(FIELD_DEPARTMENT_NAME, val);
        return this;
    }

    /**
     * 获取「部门名称」值
     *
     */
    @JsonIgnore
    public String getDepartmentName() {
        return DataTypeUtils.asString(this._get(FIELD_DEPARTMENT_NAME), null);
    }

    /**
     * 判断 「部门名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDepartmentName() {
        return this._contains(FIELD_DEPARTMENT_NAME);
    }

    /**
     * 重置 「部门名称」
     *
     */
    @JsonIgnore
    public CloudProxyUserDTO resetDepartmentName() {
        this._reset(FIELD_DEPARTMENT_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public CloudProxyUserDTO setId(String val) {
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
    public CloudProxyUserDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「登录」
     * @param val
     */
    @JsonProperty(FIELD_LOGIN)
    public CloudProxyUserDTO setLogin(String val) {
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
    public CloudProxyUserDTO resetLogin() {
        this._reset(FIELD_LOGIN);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public CloudProxyUserDTO setName(String val) {
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
    public CloudProxyUserDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「组织标识」
     * @param val
     */
    @JsonProperty(FIELD_ORGANIZATION_ID)
    public CloudProxyUserDTO setOrganizationId(String val) {
        this._set(FIELD_ORGANIZATION_ID, val);
        return this;
    }

    /**
     * 获取「组织标识」值
     *
     */
    @JsonIgnore
    public String getOrganizationId() {
        return DataTypeUtils.asString(this._get(FIELD_ORGANIZATION_ID), null);
    }

    /**
     * 判断 「组织标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOrganizationId() {
        return this._contains(FIELD_ORGANIZATION_ID);
    }

    /**
     * 重置 「组织标识」
     *
     */
    @JsonIgnore
    public CloudProxyUserDTO resetOrganizationId() {
        this._reset(FIELD_ORGANIZATION_ID);
        return this;
    }

    /**
     * 设置「组织名称」
     * @param val
     */
    @JsonProperty(FIELD_ORGANIZATION_NAME)
    public CloudProxyUserDTO setOrganizationName(String val) {
        this._set(FIELD_ORGANIZATION_NAME, val);
        return this;
    }

    /**
     * 获取「组织名称」值
     *
     */
    @JsonIgnore
    public String getOrganizationName() {
        return DataTypeUtils.asString(this._get(FIELD_ORGANIZATION_NAME), null);
    }

    /**
     * 判断 「组织名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOrganizationName() {
        return this._contains(FIELD_ORGANIZATION_NAME);
    }

    /**
     * 重置 「组织名称」
     *
     */
    @JsonIgnore
    public CloudProxyUserDTO resetOrganizationName() {
        this._reset(FIELD_ORGANIZATION_NAME);
        return this;
    }

}
