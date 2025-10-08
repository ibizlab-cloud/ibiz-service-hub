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


public class ResGroupsDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 规则权限引用
     */
    public final static String FIELD_RULE_GROUP_RELS = "rule_group_rels";

    /**
     * 属性: 权限组用户
     */
    public final static String FIELD_GROUPS_USERS_RELS = "groups_users_rels";

    /**
     * 属性: API 密钥最长有效期（天）
     */
    public final static String FIELD_API_KEY_DURATION = "api_key_duration";

    /**
     * 属性: 应用
     */
    public final static String FIELD_CATEGORY_ID = "category_id";

    /**
     * 属性: 应用
     */
    public final static String FIELD_CATEGORY_NAME = "category_name";

    /**
     * 属性: 颜色索引
     */
    public final static String FIELD_COLOR = "color";

    /**
     * 属性: 评论
     */
    public final static String FIELD_COMMENT = "comment";

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
     * 属性: 组名称
     */
    public final static String FIELD_FULL_NAME = "full_name";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 共享组
     */
    public final static String FIELD_SHARE = "share";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 属性: null
     */
    public final static String FIELD_GROUPS_IMPLIED_RELS = "groups_implied_rels";

    /**
     * 属性: null
     */
    public final static String FIELD_MODEL_ACCESS = "model_access";

    /**
     * 属性: null
     */
    public final static String FIELD_UNIRES_GROUP_RELS = "unires_group_rels";

    /**
     * 设置「规则权限引用」
     * @param val
     */
    @JsonProperty(FIELD_RULE_GROUP_RELS)
    public ResGroupsDTO setRuleGroupRels(List<RuleGroupRelDTO> val) {
        this._set(FIELD_RULE_GROUP_RELS, val);
        return this;
    }

    /**
     * 获取「规则权限引用」值
     *
     */
    @JsonIgnore
    public List<RuleGroupRelDTO> getRuleGroupRels() {
        return (List<RuleGroupRelDTO>) this._get(FIELD_RULE_GROUP_RELS);
    }

    /**
     * 判断 「规则权限引用」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRuleGroupRels() {
        return this._contains(FIELD_RULE_GROUP_RELS);
    }

    /**
     * 重置 「规则权限引用」
     *
     */
    @JsonIgnore
    public ResGroupsDTO resetRuleGroupRels() {
        this._reset(FIELD_RULE_GROUP_RELS);
        return this;
    }

    /**
     * 设置「权限组用户」
     * @param val
     */
    @JsonProperty(FIELD_GROUPS_USERS_RELS)
    public ResGroupsDTO setGroupsUsersRels(List<ResGroupsUsersRelDTO> val) {
        this._set(FIELD_GROUPS_USERS_RELS, val);
        return this;
    }

    /**
     * 获取「权限组用户」值
     *
     */
    @JsonIgnore
    public List<ResGroupsUsersRelDTO> getGroupsUsersRels() {
        return (List<ResGroupsUsersRelDTO>) this._get(FIELD_GROUPS_USERS_RELS);
    }

    /**
     * 判断 「权限组用户」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupsUsersRels() {
        return this._contains(FIELD_GROUPS_USERS_RELS);
    }

    /**
     * 重置 「权限组用户」
     *
     */
    @JsonIgnore
    public ResGroupsDTO resetGroupsUsersRels() {
        this._reset(FIELD_GROUPS_USERS_RELS);
        return this;
    }

    /**
     * 设置「API 密钥最长有效期（天）」
     * @param val
     */
    @JsonProperty(FIELD_API_KEY_DURATION)
    public ResGroupsDTO setApiKeyDuration(Double val) {
        this._set(FIELD_API_KEY_DURATION, val);
        return this;
    }

    /**
     * 获取「API 密钥最长有效期（天）」值
     *
     */
    @JsonIgnore
    public Double getApiKeyDuration() {
        return DataTypeUtils.asDouble(this._get(FIELD_API_KEY_DURATION), null);
    }

    /**
     * 判断 「API 密钥最长有效期（天）」是否有值
     *
     */
    @JsonIgnore
    public boolean containsApiKeyDuration() {
        return this._contains(FIELD_API_KEY_DURATION);
    }

    /**
     * 重置 「API 密钥最长有效期（天）」
     *
     */
    @JsonIgnore
    public ResGroupsDTO resetApiKeyDuration() {
        this._reset(FIELD_API_KEY_DURATION);
        return this;
    }

    /**
     * 设置「应用」
     * @param val
     */
    @JsonProperty(FIELD_CATEGORY_ID)
    public ResGroupsDTO setCategoryId(String val) {
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
    public ResGroupsDTO resetCategoryId() {
        this._reset(FIELD_CATEGORY_ID);
        return this;
    }

    /**
     * 设置「应用」
     * @param val
     */
    @JsonProperty(FIELD_CATEGORY_NAME)
    public ResGroupsDTO setCategoryName(String val) {
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
    public ResGroupsDTO resetCategoryName() {
        this._reset(FIELD_CATEGORY_NAME);
        return this;
    }

    /**
     * 设置「颜色索引」
     * @param val
     */
    @JsonProperty(FIELD_COLOR)
    public ResGroupsDTO setColor(Integer val) {
        this._set(FIELD_COLOR, val);
        return this;
    }

    /**
     * 获取「颜色索引」值
     *
     */
    @JsonIgnore
    public Integer getColor() {
        return DataTypeUtils.asInteger(this._get(FIELD_COLOR), null);
    }

    /**
     * 判断 「颜色索引」是否有值
     *
     */
    @JsonIgnore
    public boolean containsColor() {
        return this._contains(FIELD_COLOR);
    }

    /**
     * 重置 「颜色索引」
     *
     */
    @JsonIgnore
    public ResGroupsDTO resetColor() {
        this._reset(FIELD_COLOR);
        return this;
    }

    /**
     * 设置「评论」
     * @param val
     */
    @JsonProperty(FIELD_COMMENT)
    public ResGroupsDTO setComment(String val) {
        this._set(FIELD_COMMENT, val);
        return this;
    }

    /**
     * 获取「评论」值
     *
     */
    @JsonIgnore
    public String getComment() {
        return DataTypeUtils.asString(this._get(FIELD_COMMENT), null);
    }

    /**
     * 判断 「评论」是否有值
     *
     */
    @JsonIgnore
    public boolean containsComment() {
        return this._contains(FIELD_COMMENT);
    }

    /**
     * 重置 「评论」
     *
     */
    @JsonIgnore
    public ResGroupsDTO resetComment() {
        this._reset(FIELD_COMMENT);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public ResGroupsDTO setCreateDate(Timestamp val) {
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
    public ResGroupsDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public ResGroupsDTO setCreateUid(String val) {
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
    public ResGroupsDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public ResGroupsDTO setDisplayName(String val) {
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
    public ResGroupsDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「组名称」
     * @param val
     */
    @JsonProperty(FIELD_FULL_NAME)
    public ResGroupsDTO setFullName(String val) {
        this._set(FIELD_FULL_NAME, val);
        return this;
    }

    /**
     * 获取「组名称」值
     *
     */
    @JsonIgnore
    public String getFullName() {
        return DataTypeUtils.asString(this._get(FIELD_FULL_NAME), null);
    }

    /**
     * 判断 「组名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFullName() {
        return this._contains(FIELD_FULL_NAME);
    }

    /**
     * 重置 「组名称」
     *
     */
    @JsonIgnore
    public ResGroupsDTO resetFullName() {
        this._reset(FIELD_FULL_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public ResGroupsDTO setId(String val) {
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
    public ResGroupsDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public ResGroupsDTO setName(String val) {
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
    public ResGroupsDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「共享组」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_SHARE)
    public ResGroupsDTO setShare(Integer val) {
        this._set(FIELD_SHARE, val);
        return this;
    }

    /**
     * 获取「共享组」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getShare() {
        return DataTypeUtils.asInteger(this._get(FIELD_SHARE), null);
    }

    /**
     * 判断 「共享组」是否有值
     *
     */
    @JsonIgnore
    public boolean containsShare() {
        return this._contains(FIELD_SHARE);
    }

    /**
     * 重置 「共享组」
     *
     */
    @JsonIgnore
    public ResGroupsDTO resetShare() {
        this._reset(FIELD_SHARE);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public ResGroupsDTO setWriteDate(Timestamp val) {
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
    public ResGroupsDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public ResGroupsDTO setWriteUid(String val) {
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
    public ResGroupsDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

    /**
     * 设置「null」
     * @param val
     */
    @JsonProperty(FIELD_GROUPS_IMPLIED_RELS)
    public ResGroupsDTO setGroupsImpliedRels(List<ResGroupsImpliedRelDTO> val) {
        this._set(FIELD_GROUPS_IMPLIED_RELS, val);
        return this;
    }

    /**
     * 获取「null」值
     *
     */
    @JsonIgnore
    public List<ResGroupsImpliedRelDTO> getGroupsImpliedRels() {
        return (List<ResGroupsImpliedRelDTO>) this._get(FIELD_GROUPS_IMPLIED_RELS);
    }

    /**
     * 判断 「null」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupsImpliedRels() {
        return this._contains(FIELD_GROUPS_IMPLIED_RELS);
    }

    /**
     * 重置 「null」
     *
     */
    @JsonIgnore
    public ResGroupsDTO resetGroupsImpliedRels() {
        this._reset(FIELD_GROUPS_IMPLIED_RELS);
        return this;
    }

    /**
     * 设置「null」
     * @param val
     */
    @JsonProperty(FIELD_MODEL_ACCESS)
    public ResGroupsDTO setModelAccess(List<IrModelAccessDTO> val) {
        this._set(FIELD_MODEL_ACCESS, val);
        return this;
    }

    /**
     * 获取「null」值
     *
     */
    @JsonIgnore
    public List<IrModelAccessDTO> getModelAccess() {
        return (List<IrModelAccessDTO>) this._get(FIELD_MODEL_ACCESS);
    }

    /**
     * 判断 「null」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModelAccess() {
        return this._contains(FIELD_MODEL_ACCESS);
    }

    /**
     * 重置 「null」
     *
     */
    @JsonIgnore
    public ResGroupsDTO resetModelAccess() {
        this._reset(FIELD_MODEL_ACCESS);
        return this;
    }

    /**
     * 设置「null」
     * @param val
     */
    @JsonProperty(FIELD_UNIRES_GROUP_RELS)
    public ResGroupsDTO setUniresGroupRels(List<UniresGroupRelDTO> val) {
        this._set(FIELD_UNIRES_GROUP_RELS, val);
        return this;
    }

    /**
     * 获取「null」值
     *
     */
    @JsonIgnore
    public List<UniresGroupRelDTO> getUniresGroupRels() {
        return (List<UniresGroupRelDTO>) this._get(FIELD_UNIRES_GROUP_RELS);
    }

    /**
     * 判断 「null」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUniresGroupRels() {
        return this._contains(FIELD_UNIRES_GROUP_RELS);
    }

    /**
     * 重置 「null」
     *
     */
    @JsonIgnore
    public ResGroupsDTO resetUniresGroupRels() {
        this._reset(FIELD_UNIRES_GROUP_RELS);
        return this;
    }

}
