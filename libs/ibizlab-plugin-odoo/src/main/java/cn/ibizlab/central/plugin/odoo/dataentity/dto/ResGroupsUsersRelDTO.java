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


public class ResGroupsUsersRelDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 登录
     */
    public final static String FIELD_LOGIN = "login";

    /**
     * 属性: 状态
     */
    public final static String FIELD_STATE = "state";

    /**
     * 属性: 公司
     */
    public final static String FIELD_COMPANY_NAME = "company_name";

    /**
     * 属性: 应用
     */
    public final static String FIELD_CATEGORY_ID = "category_id";

    /**
     * 属性: 应用
     */
    public final static String FIELD_CATEGORY_NAME = "category_name";

    /**
     * 属性: 标识
     */
    public final static String FIELD_GID = "gid";

    /**
     * 属性: 组名称
     */
    public final static String FIELD_GROUP_NAME = "group_name";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 用户
     */
    public final static String FIELD_USER_ID = "user_id";

    /**
     * 属性: 用户
     */
    public final static String FIELD_USER_NAME = "user_name";

    /**
     * 设置「登录」
     * @param val
     */
    @JsonProperty(FIELD_LOGIN)
    public ResGroupsUsersRelDTO setLogin(String val) {
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
    public ResGroupsUsersRelDTO resetLogin() {
        this._reset(FIELD_LOGIN);
        return this;
    }

    /**
     * 设置「状态」
     * 代码表[状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_users_state
     * @param val
     */
    @JsonProperty(FIELD_STATE)
    public ResGroupsUsersRelDTO setState(String val) {
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
    public ResGroupsUsersRelDTO resetState() {
        this._reset(FIELD_STATE);
        return this;
    }

    /**
     * 设置「公司」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_NAME)
    public ResGroupsUsersRelDTO setCompanyName(String val) {
        this._set(FIELD_COMPANY_NAME, val);
        return this;
    }

    /**
     * 获取「公司」值
     *
     */
    @JsonIgnore
    public String getCompanyName() {
        return DataTypeUtils.asString(this._get(FIELD_COMPANY_NAME), null);
    }

    /**
     * 判断 「公司」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCompanyName() {
        return this._contains(FIELD_COMPANY_NAME);
    }

    /**
     * 重置 「公司」
     *
     */
    @JsonIgnore
    public ResGroupsUsersRelDTO resetCompanyName() {
        this._reset(FIELD_COMPANY_NAME);
        return this;
    }

    /**
     * 设置「应用」
     * @param val
     */
    @JsonProperty(FIELD_CATEGORY_ID)
    public ResGroupsUsersRelDTO setCategoryId(String val) {
        this._set(FIELD_CATEGORY_ID, val);
        return this;
    }

    /**
     * 获取「应用」值
     *
     */
    @JsonIgnore
    public String getCategoryId() {
        return DataTypeUtils.asString(this._get(FIELD_CATEGORY_ID), null);
    }

    /**
     * 判断 「应用」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCategoryId() {
        return this._contains(FIELD_CATEGORY_ID);
    }

    /**
     * 重置 「应用」
     *
     */
    @JsonIgnore
    public ResGroupsUsersRelDTO resetCategoryId() {
        this._reset(FIELD_CATEGORY_ID);
        return this;
    }

    /**
     * 设置「应用」
     * @param val
     */
    @JsonProperty(FIELD_CATEGORY_NAME)
    public ResGroupsUsersRelDTO setCategoryName(String val) {
        this._set(FIELD_CATEGORY_NAME, val);
        return this;
    }

    /**
     * 获取「应用」值
     *
     */
    @JsonIgnore
    public String getCategoryName() {
        return DataTypeUtils.asString(this._get(FIELD_CATEGORY_NAME), null);
    }

    /**
     * 判断 「应用」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCategoryName() {
        return this._contains(FIELD_CATEGORY_NAME);
    }

    /**
     * 重置 「应用」
     *
     */
    @JsonIgnore
    public ResGroupsUsersRelDTO resetCategoryName() {
        this._reset(FIELD_CATEGORY_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_GID)
    public ResGroupsUsersRelDTO setGid(String val) {
        this._set(FIELD_GID, val);
        return this;
    }

    /**
     * 获取「标识」值
     *
     */
    @JsonIgnore
    public String getGid() {
        return DataTypeUtils.asString(this._get(FIELD_GID), null);
    }

    /**
     * 判断 「标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGid() {
        return this._contains(FIELD_GID);
    }

    /**
     * 重置 「标识」
     *
     */
    @JsonIgnore
    public ResGroupsUsersRelDTO resetGid() {
        this._reset(FIELD_GID);
        return this;
    }

    /**
     * 设置「组名称」
     * @param val
     */
    @JsonProperty(FIELD_GROUP_NAME)
    public ResGroupsUsersRelDTO setGroupName(String val) {
        this._set(FIELD_GROUP_NAME, val);
        return this;
    }

    /**
     * 获取「组名称」值
     *
     */
    @JsonIgnore
    public String getGroupName() {
        return DataTypeUtils.asString(this._get(FIELD_GROUP_NAME), null);
    }

    /**
     * 判断 「组名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupName() {
        return this._contains(FIELD_GROUP_NAME);
    }

    /**
     * 重置 「组名称」
     *
     */
    @JsonIgnore
    public ResGroupsUsersRelDTO resetGroupName() {
        this._reset(FIELD_GROUP_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public ResGroupsUsersRelDTO setId(String val) {
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
    public ResGroupsUsersRelDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public ResGroupsUsersRelDTO setName(String val) {
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
    public ResGroupsUsersRelDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「用户」
     * @param val
     */
    @JsonProperty(FIELD_USER_ID)
    public ResGroupsUsersRelDTO setUserId(String val) {
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
    public ResGroupsUsersRelDTO resetUserId() {
        this._reset(FIELD_USER_ID);
        return this;
    }

    /**
     * 设置「用户」
     * @param val
     */
    @JsonProperty(FIELD_USER_NAME)
    public ResGroupsUsersRelDTO setUserName(String val) {
        this._set(FIELD_USER_NAME, val);
        return this;
    }

    /**
     * 获取「用户」值
     *
     */
    @JsonIgnore
    public String getUserName() {
        return DataTypeUtils.asString(this._get(FIELD_USER_NAME), null);
    }

    /**
     * 判断 「用户」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUserName() {
        return this._contains(FIELD_USER_NAME);
    }

    /**
     * 重置 「用户」
     *
     */
    @JsonIgnore
    public ResGroupsUsersRelDTO resetUserName() {
        this._reset(FIELD_USER_NAME);
        return this;
    }

}
