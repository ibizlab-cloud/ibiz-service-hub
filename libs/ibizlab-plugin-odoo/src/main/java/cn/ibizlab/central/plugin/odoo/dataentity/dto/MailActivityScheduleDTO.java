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


public class MailActivityScheduleDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 链接类型
     */
    public final static String FIELD_CHAINING_TYPE = "chaining_type";

    /**
     * 属性: 活动类型
     */
    public final static String FIELD_ACTIVITY_TYPE_ID = "activity_type_id";

    /**
     * 属性: 活动类型名称
     */
    public final static String FIELD_ACTIVITY_TYPE_NAME = "activity_type_name";

    /**
     * 属性: 分派给
     */
    public final static String FIELD_ACTIVITY_USER_ID = "activity_user_id";

    /**
     * 属性: 分派给名称
     */
    public final static String FIELD_ACTIVITY_USER_NAME = "activity_user_name";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 到期日期
     */
    public final static String FIELD_DATE_DEADLINE = "date_deadline";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 错误
     */
    public final static String FIELD_ERROR = "error";

    /**
     * 属性: 有错误
     */
    public final static String FIELD_HAS_ERROR = "has_error";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 批量使用
     */
    public final static String FIELD_IS_BATCH_MODE = "is_batch_mode";

    /**
     * 属性: 备注
     */
    public final static String FIELD_NOTE = "note";

    /**
     * 属性: 计划日期
     */
    public final static String FIELD_PLAN_DATE = "plan_date";

    /**
     * 属性: 计划部门可筛选
     */
    public final static String FIELD_PLAN_DEPARTMENT_FILTERABLE = "plan_department_filterable";

    /**
     * 属性: 计划
     */
    public final static String FIELD_PLAN_ID = "plan_id";

    /**
     * 属性: 分派给
     */
    public final static String FIELD_PLAN_ON_DEMAND_USER_ID = "plan_on_demand_user_id";

    /**
     * 属性: 计划概要
     */
    public final static String FIELD_PLAN_SUMMARY = "plan_summary";

    /**
     * 属性: 文档 ID
     */
    public final static String FIELD_RES_IDS = "res_ids";

    /**
     * 属性: 模型
     */
    public final static String FIELD_RES_MODEL = "res_model";

    /**
     * 属性: 摘要
     */
    public final static String FIELD_SUMMARY = "summary";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「链接类型」
     * 代码表[链接类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_activity_type_chaining_type
     * @param val
     */
    @JsonProperty(FIELD_CHAINING_TYPE)
    public MailActivityScheduleDTO setChainingType(String val) {
        this._set(FIELD_CHAINING_TYPE, val);
        return this;
    }

    /**
     * 获取「链接类型」值
     * 代码表[链接类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_activity_type_chaining_type
     *
     */
    @JsonIgnore
    public String getChainingType() {
        return DataTypeUtils.asString(this._get(FIELD_CHAINING_TYPE), null);
    }

    /**
     * 判断 「链接类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsChainingType() {
        return this._contains(FIELD_CHAINING_TYPE);
    }

    /**
     * 重置 「链接类型」
     *
     */
    @JsonIgnore
    public MailActivityScheduleDTO resetChainingType() {
        this._reset(FIELD_CHAINING_TYPE);
        return this;
    }

    /**
     * 设置「活动类型」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_TYPE_ID)
    public MailActivityScheduleDTO setActivityTypeId(String val) {
        this._set(FIELD_ACTIVITY_TYPE_ID, val);
        return this;
    }

    /**
     * 获取「活动类型」值
     *
     */
    @JsonIgnore
    public String getActivityTypeId() {
        return DataTypeUtils.asString(this._get(FIELD_ACTIVITY_TYPE_ID), null);
    }

    /**
     * 判断 「活动类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActivityTypeId() {
        return this._contains(FIELD_ACTIVITY_TYPE_ID);
    }

    /**
     * 重置 「活动类型」
     *
     */
    @JsonIgnore
    public MailActivityScheduleDTO resetActivityTypeId() {
        this._reset(FIELD_ACTIVITY_TYPE_ID);
        return this;
    }

    /**
     * 设置「活动类型名称」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_TYPE_NAME)
    public MailActivityScheduleDTO setActivityTypeName(String val) {
        this._set(FIELD_ACTIVITY_TYPE_NAME, val);
        return this;
    }

    /**
     * 获取「活动类型名称」值
     *
     */
    @JsonIgnore
    public String getActivityTypeName() {
        return DataTypeUtils.asString(this._get(FIELD_ACTIVITY_TYPE_NAME), null);
    }

    /**
     * 判断 「活动类型名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActivityTypeName() {
        return this._contains(FIELD_ACTIVITY_TYPE_NAME);
    }

    /**
     * 重置 「活动类型名称」
     *
     */
    @JsonIgnore
    public MailActivityScheduleDTO resetActivityTypeName() {
        this._reset(FIELD_ACTIVITY_TYPE_NAME);
        return this;
    }

    /**
     * 设置「分派给」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_USER_ID)
    public MailActivityScheduleDTO setActivityUserId(String val) {
        this._set(FIELD_ACTIVITY_USER_ID, val);
        return this;
    }

    /**
     * 获取「分派给」值
     *
     */
    @JsonIgnore
    public String getActivityUserId() {
        return DataTypeUtils.asString(this._get(FIELD_ACTIVITY_USER_ID), null);
    }

    /**
     * 判断 「分派给」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActivityUserId() {
        return this._contains(FIELD_ACTIVITY_USER_ID);
    }

    /**
     * 重置 「分派给」
     *
     */
    @JsonIgnore
    public MailActivityScheduleDTO resetActivityUserId() {
        this._reset(FIELD_ACTIVITY_USER_ID);
        return this;
    }

    /**
     * 设置「分派给名称」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_USER_NAME)
    public MailActivityScheduleDTO setActivityUserName(String val) {
        this._set(FIELD_ACTIVITY_USER_NAME, val);
        return this;
    }

    /**
     * 获取「分派给名称」值
     *
     */
    @JsonIgnore
    public String getActivityUserName() {
        return DataTypeUtils.asString(this._get(FIELD_ACTIVITY_USER_NAME), null);
    }

    /**
     * 判断 「分派给名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActivityUserName() {
        return this._contains(FIELD_ACTIVITY_USER_NAME);
    }

    /**
     * 重置 「分派给名称」
     *
     */
    @JsonIgnore
    public MailActivityScheduleDTO resetActivityUserName() {
        this._reset(FIELD_ACTIVITY_USER_NAME);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public MailActivityScheduleDTO setCreateDate(Timestamp val) {
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
    public MailActivityScheduleDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public MailActivityScheduleDTO setCreateUid(String val) {
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
    public MailActivityScheduleDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「到期日期」
     * @param val
     */
    @JsonProperty(FIELD_DATE_DEADLINE)
    public MailActivityScheduleDTO setDateDeadline(Timestamp val) {
        this._set(FIELD_DATE_DEADLINE, val);
        return this;
    }

    /**
     * 获取「到期日期」值
     *
     */
    @JsonIgnore
    public Timestamp getDateDeadline() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_DATE_DEADLINE), null);
    }

    /**
     * 判断 「到期日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDateDeadline() {
        return this._contains(FIELD_DATE_DEADLINE);
    }

    /**
     * 重置 「到期日期」
     *
     */
    @JsonIgnore
    public MailActivityScheduleDTO resetDateDeadline() {
        this._reset(FIELD_DATE_DEADLINE);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public MailActivityScheduleDTO setDisplayName(String val) {
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
    public MailActivityScheduleDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「错误」
     * @param val
     */
    @JsonProperty(FIELD_ERROR)
    public MailActivityScheduleDTO setError(String val) {
        this._set(FIELD_ERROR, val);
        return this;
    }

    /**
     * 获取「错误」值
     *
     */
    @JsonIgnore
    public String getError() {
        return DataTypeUtils.asString(this._get(FIELD_ERROR), null);
    }

    /**
     * 判断 「错误」是否有值
     *
     */
    @JsonIgnore
    public boolean containsError() {
        return this._contains(FIELD_ERROR);
    }

    /**
     * 重置 「错误」
     *
     */
    @JsonIgnore
    public MailActivityScheduleDTO resetError() {
        this._reset(FIELD_ERROR);
        return this;
    }

    /**
     * 设置「有错误」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_HAS_ERROR)
    public MailActivityScheduleDTO setHasError(Integer val) {
        this._set(FIELD_HAS_ERROR, val);
        return this;
    }

    /**
     * 获取「有错误」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getHasError() {
        return DataTypeUtils.asInteger(this._get(FIELD_HAS_ERROR), null);
    }

    /**
     * 判断 「有错误」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHasError() {
        return this._contains(FIELD_HAS_ERROR);
    }

    /**
     * 重置 「有错误」
     *
     */
    @JsonIgnore
    public MailActivityScheduleDTO resetHasError() {
        this._reset(FIELD_HAS_ERROR);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailActivityScheduleDTO setId(String val) {
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
    public MailActivityScheduleDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「批量使用」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_BATCH_MODE)
    public MailActivityScheduleDTO setIsBatchMode(Integer val) {
        this._set(FIELD_IS_BATCH_MODE, val);
        return this;
    }

    /**
     * 获取「批量使用」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsBatchMode() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_BATCH_MODE), null);
    }

    /**
     * 判断 「批量使用」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsBatchMode() {
        return this._contains(FIELD_IS_BATCH_MODE);
    }

    /**
     * 重置 「批量使用」
     *
     */
    @JsonIgnore
    public MailActivityScheduleDTO resetIsBatchMode() {
        this._reset(FIELD_IS_BATCH_MODE);
        return this;
    }

    /**
     * 设置「备注」
     * @param val
     */
    @JsonProperty(FIELD_NOTE)
    public MailActivityScheduleDTO setNote(String val) {
        this._set(FIELD_NOTE, val);
        return this;
    }

    /**
     * 获取「备注」值
     *
     */
    @JsonIgnore
    public String getNote() {
        return DataTypeUtils.asString(this._get(FIELD_NOTE), null);
    }

    /**
     * 判断 「备注」是否有值
     *
     */
    @JsonIgnore
    public boolean containsNote() {
        return this._contains(FIELD_NOTE);
    }

    /**
     * 重置 「备注」
     *
     */
    @JsonIgnore
    public MailActivityScheduleDTO resetNote() {
        this._reset(FIELD_NOTE);
        return this;
    }

    /**
     * 设置「计划日期」
     * @param val
     */
    @JsonProperty(FIELD_PLAN_DATE)
    public MailActivityScheduleDTO setPlanDate(Timestamp val) {
        this._set(FIELD_PLAN_DATE, val);
        return this;
    }

    /**
     * 获取「计划日期」值
     *
     */
    @JsonIgnore
    public Timestamp getPlanDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_PLAN_DATE), null);
    }

    /**
     * 判断 「计划日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPlanDate() {
        return this._contains(FIELD_PLAN_DATE);
    }

    /**
     * 重置 「计划日期」
     *
     */
    @JsonIgnore
    public MailActivityScheduleDTO resetPlanDate() {
        this._reset(FIELD_PLAN_DATE);
        return this;
    }

    /**
     * 设置「计划部门可筛选」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_PLAN_DEPARTMENT_FILTERABLE)
    public MailActivityScheduleDTO setPlanDepartmentFilterable(Integer val) {
        this._set(FIELD_PLAN_DEPARTMENT_FILTERABLE, val);
        return this;
    }

    /**
     * 获取「计划部门可筛选」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getPlanDepartmentFilterable() {
        return DataTypeUtils.asInteger(this._get(FIELD_PLAN_DEPARTMENT_FILTERABLE), null);
    }

    /**
     * 判断 「计划部门可筛选」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPlanDepartmentFilterable() {
        return this._contains(FIELD_PLAN_DEPARTMENT_FILTERABLE);
    }

    /**
     * 重置 「计划部门可筛选」
     *
     */
    @JsonIgnore
    public MailActivityScheduleDTO resetPlanDepartmentFilterable() {
        this._reset(FIELD_PLAN_DEPARTMENT_FILTERABLE);
        return this;
    }

    /**
     * 设置「计划」
     * @param val
     */
    @JsonProperty(FIELD_PLAN_ID)
    public MailActivityScheduleDTO setPlanId(String val) {
        this._set(FIELD_PLAN_ID, val);
        return this;
    }

    /**
     * 获取「计划」值
     *
     */
    @JsonIgnore
    public String getPlanId() {
        return DataTypeUtils.asString(this._get(FIELD_PLAN_ID), null);
    }

    /**
     * 判断 「计划」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPlanId() {
        return this._contains(FIELD_PLAN_ID);
    }

    /**
     * 重置 「计划」
     *
     */
    @JsonIgnore
    public MailActivityScheduleDTO resetPlanId() {
        this._reset(FIELD_PLAN_ID);
        return this;
    }

    /**
     * 设置「分派给」
     * @param val
     */
    @JsonProperty(FIELD_PLAN_ON_DEMAND_USER_ID)
    public MailActivityScheduleDTO setPlanOnDemandUserId(String val) {
        this._set(FIELD_PLAN_ON_DEMAND_USER_ID, val);
        return this;
    }

    /**
     * 获取「分派给」值
     *
     */
    @JsonIgnore
    public String getPlanOnDemandUserId() {
        return DataTypeUtils.asString(this._get(FIELD_PLAN_ON_DEMAND_USER_ID), null);
    }

    /**
     * 判断 「分派给」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPlanOnDemandUserId() {
        return this._contains(FIELD_PLAN_ON_DEMAND_USER_ID);
    }

    /**
     * 重置 「分派给」
     *
     */
    @JsonIgnore
    public MailActivityScheduleDTO resetPlanOnDemandUserId() {
        this._reset(FIELD_PLAN_ON_DEMAND_USER_ID);
        return this;
    }

    /**
     * 设置「计划概要」
     * @param val
     */
    @JsonProperty(FIELD_PLAN_SUMMARY)
    public MailActivityScheduleDTO setPlanSummary(String val) {
        this._set(FIELD_PLAN_SUMMARY, val);
        return this;
    }

    /**
     * 获取「计划概要」值
     *
     */
    @JsonIgnore
    public String getPlanSummary() {
        return DataTypeUtils.asString(this._get(FIELD_PLAN_SUMMARY), null);
    }

    /**
     * 判断 「计划概要」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPlanSummary() {
        return this._contains(FIELD_PLAN_SUMMARY);
    }

    /**
     * 重置 「计划概要」
     *
     */
    @JsonIgnore
    public MailActivityScheduleDTO resetPlanSummary() {
        this._reset(FIELD_PLAN_SUMMARY);
        return this;
    }

    /**
     * 设置「文档 ID」
     * @param val
     */
    @JsonProperty(FIELD_RES_IDS)
    public MailActivityScheduleDTO setResIds(String val) {
        this._set(FIELD_RES_IDS, val);
        return this;
    }

    /**
     * 获取「文档 ID」值
     *
     */
    @JsonIgnore
    public String getResIds() {
        return DataTypeUtils.asString(this._get(FIELD_RES_IDS), null);
    }

    /**
     * 判断 「文档 ID」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResIds() {
        return this._contains(FIELD_RES_IDS);
    }

    /**
     * 重置 「文档 ID」
     *
     */
    @JsonIgnore
    public MailActivityScheduleDTO resetResIds() {
        this._reset(FIELD_RES_IDS);
        return this;
    }

    /**
     * 设置「模型」
     * @param val
     */
    @JsonProperty(FIELD_RES_MODEL)
    public MailActivityScheduleDTO setResModel(String val) {
        this._set(FIELD_RES_MODEL, val);
        return this;
    }

    /**
     * 获取「模型」值
     *
     */
    @JsonIgnore
    public String getResModel() {
        return DataTypeUtils.asString(this._get(FIELD_RES_MODEL), null);
    }

    /**
     * 判断 「模型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResModel() {
        return this._contains(FIELD_RES_MODEL);
    }

    /**
     * 重置 「模型」
     *
     */
    @JsonIgnore
    public MailActivityScheduleDTO resetResModel() {
        this._reset(FIELD_RES_MODEL);
        return this;
    }

    /**
     * 设置「摘要」
     * @param val
     */
    @JsonProperty(FIELD_SUMMARY)
    public MailActivityScheduleDTO setSummary(String val) {
        this._set(FIELD_SUMMARY, val);
        return this;
    }

    /**
     * 获取「摘要」值
     *
     */
    @JsonIgnore
    public String getSummary() {
        return DataTypeUtils.asString(this._get(FIELD_SUMMARY), null);
    }

    /**
     * 判断 「摘要」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSummary() {
        return this._contains(FIELD_SUMMARY);
    }

    /**
     * 重置 「摘要」
     *
     */
    @JsonIgnore
    public MailActivityScheduleDTO resetSummary() {
        this._reset(FIELD_SUMMARY);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public MailActivityScheduleDTO setWriteDate(Timestamp val) {
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
    public MailActivityScheduleDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public MailActivityScheduleDTO setWriteUid(String val) {
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
    public MailActivityScheduleDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
