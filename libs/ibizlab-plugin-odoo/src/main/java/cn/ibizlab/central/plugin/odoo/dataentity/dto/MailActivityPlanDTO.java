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


public class MailActivityPlanDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 活动计划模板
     */
    public final static String FIELD_TEMPLATES = "templates";

    /**
     * 属性: 有效
     */
    public final static String FIELD_ACTIVE = "active";

    /**
     * 属性: 公司
     */
    public final static String FIELD_COMPANY_ID = "company_id";

    /**
     * 属性: 公司
     */
    public final static String FIELD_COMPANY_NAME = "company_name";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 部门可指派
     */
    public final static String FIELD_DEPARTMENT_ASSIGNABLE = "department_assignable";

    /**
     * 属性: 部门
     */
    public final static String FIELD_DEPARTMENT_ID = "department_id";

    /**
     * 属性: 部门
     */
    public final static String FIELD_DEPARTMENT_NAME = "department_name";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 按需负责
     */
    public final static String FIELD_HAS_USER_ON_DEMAND = "has_user_on_demand";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 步数计数
     */
    public final static String FIELD_STEPS_COUNT = "steps_count";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「活动计划模板」
     * @param val
     */
    @JsonProperty(FIELD_TEMPLATES)
    public MailActivityPlanDTO setTemplates(List<MailActivityPlanTemplateDTO> val) {
        this._set(FIELD_TEMPLATES, val);
        return this;
    }

    /**
     * 获取「活动计划模板」值
     *
     */
    @JsonIgnore
    public List<MailActivityPlanTemplateDTO> getTemplates() {
        return (List<MailActivityPlanTemplateDTO>) this._get(FIELD_TEMPLATES);
    }

    /**
     * 判断 「活动计划模板」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTemplates() {
        return this._contains(FIELD_TEMPLATES);
    }

    /**
     * 重置 「活动计划模板」
     *
     */
    @JsonIgnore
    public MailActivityPlanDTO resetTemplates() {
        this._reset(FIELD_TEMPLATES);
        return this;
    }

    /**
     * 设置「有效」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ACTIVE)
    public MailActivityPlanDTO setActive(Integer val) {
        this._set(FIELD_ACTIVE, val);
        return this;
    }

    /**
     * 获取「有效」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getActive() {
        return DataTypeUtils.asInteger(this._get(FIELD_ACTIVE), null);
    }

    /**
     * 判断 「有效」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActive() {
        return this._contains(FIELD_ACTIVE);
    }

    /**
     * 重置 「有效」
     *
     */
    @JsonIgnore
    public MailActivityPlanDTO resetActive() {
        this._reset(FIELD_ACTIVE);
        return this;
    }

    /**
     * 设置「公司」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_ID)
    public MailActivityPlanDTO setCompanyId(String val) {
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
    public MailActivityPlanDTO resetCompanyId() {
        this._reset(FIELD_COMPANY_ID);
        return this;
    }

    /**
     * 设置「公司」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_NAME)
    public MailActivityPlanDTO setCompanyName(String val) {
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
    public MailActivityPlanDTO resetCompanyName() {
        this._reset(FIELD_COMPANY_NAME);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public MailActivityPlanDTO setCreateDate(Timestamp val) {
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
    public MailActivityPlanDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public MailActivityPlanDTO setCreateUid(String val) {
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
    public MailActivityPlanDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「部门可指派」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_DEPARTMENT_ASSIGNABLE)
    public MailActivityPlanDTO setDepartmentAssignable(Integer val) {
        this._set(FIELD_DEPARTMENT_ASSIGNABLE, val);
        return this;
    }

    /**
     * 获取「部门可指派」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getDepartmentAssignable() {
        return DataTypeUtils.asInteger(this._get(FIELD_DEPARTMENT_ASSIGNABLE), null);
    }

    /**
     * 判断 「部门可指派」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDepartmentAssignable() {
        return this._contains(FIELD_DEPARTMENT_ASSIGNABLE);
    }

    /**
     * 重置 「部门可指派」
     *
     */
    @JsonIgnore
    public MailActivityPlanDTO resetDepartmentAssignable() {
        this._reset(FIELD_DEPARTMENT_ASSIGNABLE);
        return this;
    }

    /**
     * 设置「部门」
     * @param val
     */
    @JsonProperty(FIELD_DEPARTMENT_ID)
    public MailActivityPlanDTO setDepartmentId(String val) {
        this._set(FIELD_DEPARTMENT_ID, val);
        return this;
    }

    /**
     * 获取「部门」值
     *
     */
    @JsonIgnore
    public String getDepartmentId() {
        return DataTypeUtils.asString(this._get(FIELD_DEPARTMENT_ID), null);
    }

    /**
     * 判断 「部门」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDepartmentId() {
        return this._contains(FIELD_DEPARTMENT_ID);
    }

    /**
     * 重置 「部门」
     *
     */
    @JsonIgnore
    public MailActivityPlanDTO resetDepartmentId() {
        this._reset(FIELD_DEPARTMENT_ID);
        return this;
    }

    /**
     * 设置「部门」
     * @param val
     */
    @JsonProperty(FIELD_DEPARTMENT_NAME)
    public MailActivityPlanDTO setDepartmentName(String val) {
        this._set(FIELD_DEPARTMENT_NAME, val);
        return this;
    }

    /**
     * 获取「部门」值
     *
     */
    @JsonIgnore
    public String getDepartmentName() {
        return DataTypeUtils.asString(this._get(FIELD_DEPARTMENT_NAME), null);
    }

    /**
     * 判断 「部门」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDepartmentName() {
        return this._contains(FIELD_DEPARTMENT_NAME);
    }

    /**
     * 重置 「部门」
     *
     */
    @JsonIgnore
    public MailActivityPlanDTO resetDepartmentName() {
        this._reset(FIELD_DEPARTMENT_NAME);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public MailActivityPlanDTO setDisplayName(String val) {
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
    public MailActivityPlanDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「按需负责」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_HAS_USER_ON_DEMAND)
    public MailActivityPlanDTO setHasUserOnDemand(Integer val) {
        this._set(FIELD_HAS_USER_ON_DEMAND, val);
        return this;
    }

    /**
     * 获取「按需负责」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getHasUserOnDemand() {
        return DataTypeUtils.asInteger(this._get(FIELD_HAS_USER_ON_DEMAND), null);
    }

    /**
     * 判断 「按需负责」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHasUserOnDemand() {
        return this._contains(FIELD_HAS_USER_ON_DEMAND);
    }

    /**
     * 重置 「按需负责」
     *
     */
    @JsonIgnore
    public MailActivityPlanDTO resetHasUserOnDemand() {
        this._reset(FIELD_HAS_USER_ON_DEMAND);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailActivityPlanDTO setId(String val) {
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
    public MailActivityPlanDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public MailActivityPlanDTO setName(String val) {
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
    public MailActivityPlanDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「步数计数」
     * @param val
     */
    @JsonProperty(FIELD_STEPS_COUNT)
    public MailActivityPlanDTO setStepsCount(Integer val) {
        this._set(FIELD_STEPS_COUNT, val);
        return this;
    }

    /**
     * 获取「步数计数」值
     *
     */
    @JsonIgnore
    public Integer getStepsCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_STEPS_COUNT), null);
    }

    /**
     * 判断 「步数计数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsStepsCount() {
        return this._contains(FIELD_STEPS_COUNT);
    }

    /**
     * 重置 「步数计数」
     *
     */
    @JsonIgnore
    public MailActivityPlanDTO resetStepsCount() {
        this._reset(FIELD_STEPS_COUNT);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public MailActivityPlanDTO setWriteDate(Timestamp val) {
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
    public MailActivityPlanDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public MailActivityPlanDTO setWriteUid(String val) {
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
    public MailActivityPlanDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
