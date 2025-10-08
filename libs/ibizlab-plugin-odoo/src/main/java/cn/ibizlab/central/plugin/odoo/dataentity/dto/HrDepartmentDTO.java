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


public class HrDepartmentDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 活动集合
     */
    public final static String FIELD_ACTIVITIES = "activities";

    /**
     * 属性: 附件集合
     */
    public final static String FIELD_ATTACHMENTS = "attachments";

    /**
     * 属性: 关注者
     */
    public final static String FIELD_FOLLOWERS = "followers";

    /**
     * 属性: 今日缺勤
     */
    public final static String FIELD_ABSENCE_OF_TODAY = "absence_of_today";

    /**
     * 属性: 有效
     */
    public final static String FIELD_ACTIVE = "active";

    /**
     * 属性: 下一活动截止日期
     */
    public final static String FIELD_ACTIVITY_DATE_DEADLINE = "activity_date_deadline";

    /**
     * 属性: 活动异常标示
     */
    public final static String FIELD_ACTIVITY_EXCEPTION_DECORATION = "activity_exception_decoration";

    /**
     * 属性: 图标
     */
    public final static String FIELD_ACTIVITY_EXCEPTION_ICON = "activity_exception_icon";

    /**
     * 属性: 活动状态
     */
    public final static String FIELD_ACTIVITY_STATE = "activity_state";

    /**
     * 属性: 待批准的分配
     */
    public final static String FIELD_ALLOCATION_TO_APPROVE_COUNT = "allocation_to_approve_count";

    /**
     * 属性: 直接下属部门数
     */
    public final static String FIELD_CHILD_COUNT = "child_count";

    /**
     * 属性: 颜色指标
     */
    public final static String FIELD_COLOR = "color";

    /**
     * 属性: 公司
     */
    public final static String FIELD_COMPANY_ID = "company_id";

    /**
     * 属性: 公司
     */
    public final static String FIELD_COMPANY_NAME = "company_name";

    /**
     * 属性: 完整名称
     */
    public final static String FIELD_COMPLETE_NAME = "complete_name";

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
     * 属性: 预期的员工
     */
    public final static String FIELD_EXPECTED_EMPLOYEE = "expected_employee";

    /**
     * 属性: 待批准的费用报表
     */
    public final static String FIELD_EXPENSE_SHEETS_TO_APPROVE_COUNT = "expense_sheets_to_approve_count";

    /**
     * 属性: 有消息
     */
    public final static String FIELD_HAS_MESSAGE = "has_message";

    /**
     * 属性: Has Read Access
     */
    public final static String FIELD_HAS_READ_ACCESS = "has_read_access";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 待批准的休假
     */
    public final static String FIELD_LEAVE_TO_APPROVE_COUNT = "leave_to_approve_count";

    /**
     * 属性: 管理员
     */
    public final static String FIELD_MANAGER_ID = "manager_id";

    /**
     * 属性: 管理员
     */
    public final static String FIELD_MANAGER_NAME = "manager_name";

    /**
     * 属性: 主部门
     */
    public final static String FIELD_MASTER_DEPARTMENT_ID = "master_department_id";

    /**
     * 属性: 附件数量
     */
    public final static String FIELD_MESSAGE_ATTACHMENT_COUNT = "message_attachment_count";

    /**
     * 属性: 消息发送错误
     */
    public final static String FIELD_MESSAGE_HAS_ERROR = "message_has_error";

    /**
     * 属性: 错误数量
     */
    public final static String FIELD_MESSAGE_HAS_ERROR_COUNTER = "message_has_error_counter";

    /**
     * 属性: 短信发送错误
     */
    public final static String FIELD_MESSAGE_HAS_SMS_ERROR = "message_has_sms_error";

    /**
     * 属性: 是关注者
     */
    public final static String FIELD_MESSAGE_IS_FOLLOWER = "message_is_follower";

    /**
     * 属性: 所需操作
     */
    public final static String FIELD_MESSAGE_NEEDACTION = "message_needaction";

    /**
     * 属性: 操作数量
     */
    public final static String FIELD_MESSAGE_NEEDACTION_COUNTER = "message_needaction_counter";

    /**
     * 属性: 我的活动截止时间
     */
    public final static String FIELD_MY_ACTIVITY_DATE_DEADLINE = "my_activity_date_deadline";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 新申请
     */
    public final static String FIELD_NEW_APPLICANT_COUNT = "new_applicant_count";

    /**
     * 属性: 新雇用的员工
     */
    public final static String FIELD_NEW_HIRED_EMPLOYEE = "new_hired_employee";

    /**
     * 属性: 备注
     */
    public final static String FIELD_NOTE = "note";

    /**
     * 属性: 上级部门
     */
    public final static String FIELD_PARENT_ID = "parent_id";

    /**
     * 属性: 上级部门
     */
    public final static String FIELD_PARENT_NAME = "parent_name";

    /**
     * 属性: 父级路径
     */
    public final static String FIELD_PARENT_PATH = "parent_path";

    /**
     * 属性: 计划数量
     */
    public final static String FIELD_PLANS_COUNT = "plans_count";

    /**
     * 属性: Total Employee
     */
    public final static String FIELD_TOTAL_EMPLOYEE = "total_employee";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「活动集合」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITIES)
    public HrDepartmentDTO setActivities(List<MailActivityDTO> val) {
        this._set(FIELD_ACTIVITIES, val);
        return this;
    }

    /**
     * 获取「活动集合」值
     *
     */
    @JsonIgnore
    public List<MailActivityDTO> getActivities() {
        return (List<MailActivityDTO>) this._get(FIELD_ACTIVITIES);
    }

    /**
     * 判断 「活动集合」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActivities() {
        return this._contains(FIELD_ACTIVITIES);
    }

    /**
     * 重置 「活动集合」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetActivities() {
        this._reset(FIELD_ACTIVITIES);
        return this;
    }

    /**
     * 设置「附件集合」
     * @param val
     */
    @JsonProperty(FIELD_ATTACHMENTS)
    public HrDepartmentDTO setAttachments(List<IrAttachmentDTO> val) {
        this._set(FIELD_ATTACHMENTS, val);
        return this;
    }

    /**
     * 获取「附件集合」值
     *
     */
    @JsonIgnore
    public List<IrAttachmentDTO> getAttachments() {
        return (List<IrAttachmentDTO>) this._get(FIELD_ATTACHMENTS);
    }

    /**
     * 判断 「附件集合」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAttachments() {
        return this._contains(FIELD_ATTACHMENTS);
    }

    /**
     * 重置 「附件集合」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetAttachments() {
        this._reset(FIELD_ATTACHMENTS);
        return this;
    }

    /**
     * 设置「关注者」
     * @param val
     */
    @JsonProperty(FIELD_FOLLOWERS)
    public HrDepartmentDTO setFollowers(List<MailFollowersDTO> val) {
        this._set(FIELD_FOLLOWERS, val);
        return this;
    }

    /**
     * 获取「关注者」值
     *
     */
    @JsonIgnore
    public List<MailFollowersDTO> getFollowers() {
        return (List<MailFollowersDTO>) this._get(FIELD_FOLLOWERS);
    }

    /**
     * 判断 「关注者」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFollowers() {
        return this._contains(FIELD_FOLLOWERS);
    }

    /**
     * 重置 「关注者」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetFollowers() {
        this._reset(FIELD_FOLLOWERS);
        return this;
    }

    /**
     * 设置「今日缺勤」
     * @param val
     */
    @JsonProperty(FIELD_ABSENCE_OF_TODAY)
    public HrDepartmentDTO setAbsenceOfToday(Integer val) {
        this._set(FIELD_ABSENCE_OF_TODAY, val);
        return this;
    }

    /**
     * 获取「今日缺勤」值
     *
     */
    @JsonIgnore
    public Integer getAbsenceOfToday() {
        return DataTypeUtils.asInteger(this._get(FIELD_ABSENCE_OF_TODAY), null);
    }

    /**
     * 判断 「今日缺勤」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAbsenceOfToday() {
        return this._contains(FIELD_ABSENCE_OF_TODAY);
    }

    /**
     * 重置 「今日缺勤」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetAbsenceOfToday() {
        this._reset(FIELD_ABSENCE_OF_TODAY);
        return this;
    }

    /**
     * 设置「有效」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ACTIVE)
    public HrDepartmentDTO setActive(Integer val) {
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
    public HrDepartmentDTO resetActive() {
        this._reset(FIELD_ACTIVE);
        return this;
    }

    /**
     * 设置「下一活动截止日期」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_DATE_DEADLINE)
    public HrDepartmentDTO setActivityDateDeadline(Timestamp val) {
        this._set(FIELD_ACTIVITY_DATE_DEADLINE, val);
        return this;
    }

    /**
     * 获取「下一活动截止日期」值
     *
     */
    @JsonIgnore
    public Timestamp getActivityDateDeadline() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_ACTIVITY_DATE_DEADLINE), null);
    }

    /**
     * 判断 「下一活动截止日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActivityDateDeadline() {
        return this._contains(FIELD_ACTIVITY_DATE_DEADLINE);
    }

    /**
     * 重置 「下一活动截止日期」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetActivityDateDeadline() {
        this._reset(FIELD_ACTIVITY_DATE_DEADLINE);
        return this;
    }

    /**
     * 设置「活动异常标示」
     * 代码表[活动异常标示]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.hr_department_activity_exception_decoration
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_EXCEPTION_DECORATION)
    public HrDepartmentDTO setActivityExceptionDecoration(String val) {
        this._set(FIELD_ACTIVITY_EXCEPTION_DECORATION, val);
        return this;
    }

    /**
     * 获取「活动异常标示」值
     * 代码表[活动异常标示]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.hr_department_activity_exception_decoration
     *
     */
    @JsonIgnore
    public String getActivityExceptionDecoration() {
        return DataTypeUtils.asString(this._get(FIELD_ACTIVITY_EXCEPTION_DECORATION), null);
    }

    /**
     * 判断 「活动异常标示」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActivityExceptionDecoration() {
        return this._contains(FIELD_ACTIVITY_EXCEPTION_DECORATION);
    }

    /**
     * 重置 「活动异常标示」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetActivityExceptionDecoration() {
        this._reset(FIELD_ACTIVITY_EXCEPTION_DECORATION);
        return this;
    }

    /**
     * 设置「图标」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_EXCEPTION_ICON)
    public HrDepartmentDTO setActivityExceptionIcon(String val) {
        this._set(FIELD_ACTIVITY_EXCEPTION_ICON, val);
        return this;
    }

    /**
     * 获取「图标」值
     *
     */
    @JsonIgnore
    public String getActivityExceptionIcon() {
        return DataTypeUtils.asString(this._get(FIELD_ACTIVITY_EXCEPTION_ICON), null);
    }

    /**
     * 判断 「图标」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActivityExceptionIcon() {
        return this._contains(FIELD_ACTIVITY_EXCEPTION_ICON);
    }

    /**
     * 重置 「图标」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetActivityExceptionIcon() {
        this._reset(FIELD_ACTIVITY_EXCEPTION_ICON);
        return this;
    }

    /**
     * 设置「活动状态」
     * 代码表[活动状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.hr_department_activity_state
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_STATE)
    public HrDepartmentDTO setActivityState(String val) {
        this._set(FIELD_ACTIVITY_STATE, val);
        return this;
    }

    /**
     * 获取「活动状态」值
     * 代码表[活动状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.hr_department_activity_state
     *
     */
    @JsonIgnore
    public String getActivityState() {
        return DataTypeUtils.asString(this._get(FIELD_ACTIVITY_STATE), null);
    }

    /**
     * 判断 「活动状态」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActivityState() {
        return this._contains(FIELD_ACTIVITY_STATE);
    }

    /**
     * 重置 「活动状态」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetActivityState() {
        this._reset(FIELD_ACTIVITY_STATE);
        return this;
    }

    /**
     * 设置「待批准的分配」
     * @param val
     */
    @JsonProperty(FIELD_ALLOCATION_TO_APPROVE_COUNT)
    public HrDepartmentDTO setAllocationToApproveCount(Integer val) {
        this._set(FIELD_ALLOCATION_TO_APPROVE_COUNT, val);
        return this;
    }

    /**
     * 获取「待批准的分配」值
     *
     */
    @JsonIgnore
    public Integer getAllocationToApproveCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_ALLOCATION_TO_APPROVE_COUNT), null);
    }

    /**
     * 判断 「待批准的分配」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAllocationToApproveCount() {
        return this._contains(FIELD_ALLOCATION_TO_APPROVE_COUNT);
    }

    /**
     * 重置 「待批准的分配」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetAllocationToApproveCount() {
        this._reset(FIELD_ALLOCATION_TO_APPROVE_COUNT);
        return this;
    }

    /**
     * 设置「直接下属部门数」
     * @param val
     */
    @JsonProperty(FIELD_CHILD_COUNT)
    public HrDepartmentDTO setChildCount(Integer val) {
        this._set(FIELD_CHILD_COUNT, val);
        return this;
    }

    /**
     * 获取「直接下属部门数」值
     *
     */
    @JsonIgnore
    public Integer getChildCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_CHILD_COUNT), null);
    }

    /**
     * 判断 「直接下属部门数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsChildCount() {
        return this._contains(FIELD_CHILD_COUNT);
    }

    /**
     * 重置 「直接下属部门数」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetChildCount() {
        this._reset(FIELD_CHILD_COUNT);
        return this;
    }

    /**
     * 设置「颜色指标」
     * @param val
     */
    @JsonProperty(FIELD_COLOR)
    public HrDepartmentDTO setColor(String val) {
        this._set(FIELD_COLOR, val);
        return this;
    }

    /**
     * 获取「颜色指标」值
     *
     */
    @JsonIgnore
    public String getColor() {
        return DataTypeUtils.asString(this._get(FIELD_COLOR), null);
    }

    /**
     * 判断 「颜色指标」是否有值
     *
     */
    @JsonIgnore
    public boolean containsColor() {
        return this._contains(FIELD_COLOR);
    }

    /**
     * 重置 「颜色指标」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetColor() {
        this._reset(FIELD_COLOR);
        return this;
    }

    /**
     * 设置「公司」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_ID)
    public HrDepartmentDTO setCompanyId(String val) {
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
    public HrDepartmentDTO resetCompanyId() {
        this._reset(FIELD_COMPANY_ID);
        return this;
    }

    /**
     * 设置「公司」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_NAME)
    public HrDepartmentDTO setCompanyName(String val) {
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
    public HrDepartmentDTO resetCompanyName() {
        this._reset(FIELD_COMPANY_NAME);
        return this;
    }

    /**
     * 设置「完整名称」
     * @param val
     */
    @JsonProperty(FIELD_COMPLETE_NAME)
    public HrDepartmentDTO setCompleteName(String val) {
        this._set(FIELD_COMPLETE_NAME, val);
        return this;
    }

    /**
     * 获取「完整名称」值
     *
     */
    @JsonIgnore
    public String getCompleteName() {
        return DataTypeUtils.asString(this._get(FIELD_COMPLETE_NAME), null);
    }

    /**
     * 判断 「完整名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCompleteName() {
        return this._contains(FIELD_COMPLETE_NAME);
    }

    /**
     * 重置 「完整名称」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetCompleteName() {
        this._reset(FIELD_COMPLETE_NAME);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public HrDepartmentDTO setCreateDate(Timestamp val) {
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
    public HrDepartmentDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public HrDepartmentDTO setCreateUid(String val) {
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
    public HrDepartmentDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public HrDepartmentDTO setDisplayName(String val) {
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
    public HrDepartmentDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「预期的员工」
     * @param val
     */
    @JsonProperty(FIELD_EXPECTED_EMPLOYEE)
    public HrDepartmentDTO setExpectedEmployee(Integer val) {
        this._set(FIELD_EXPECTED_EMPLOYEE, val);
        return this;
    }

    /**
     * 获取「预期的员工」值
     *
     */
    @JsonIgnore
    public Integer getExpectedEmployee() {
        return DataTypeUtils.asInteger(this._get(FIELD_EXPECTED_EMPLOYEE), null);
    }

    /**
     * 判断 「预期的员工」是否有值
     *
     */
    @JsonIgnore
    public boolean containsExpectedEmployee() {
        return this._contains(FIELD_EXPECTED_EMPLOYEE);
    }

    /**
     * 重置 「预期的员工」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetExpectedEmployee() {
        this._reset(FIELD_EXPECTED_EMPLOYEE);
        return this;
    }

    /**
     * 设置「待批准的费用报表」
     * @param val
     */
    @JsonProperty(FIELD_EXPENSE_SHEETS_TO_APPROVE_COUNT)
    public HrDepartmentDTO setExpenseSheetsToApproveCount(Integer val) {
        this._set(FIELD_EXPENSE_SHEETS_TO_APPROVE_COUNT, val);
        return this;
    }

    /**
     * 获取「待批准的费用报表」值
     *
     */
    @JsonIgnore
    public Integer getExpenseSheetsToApproveCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_EXPENSE_SHEETS_TO_APPROVE_COUNT), null);
    }

    /**
     * 判断 「待批准的费用报表」是否有值
     *
     */
    @JsonIgnore
    public boolean containsExpenseSheetsToApproveCount() {
        return this._contains(FIELD_EXPENSE_SHEETS_TO_APPROVE_COUNT);
    }

    /**
     * 重置 「待批准的费用报表」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetExpenseSheetsToApproveCount() {
        this._reset(FIELD_EXPENSE_SHEETS_TO_APPROVE_COUNT);
        return this;
    }

    /**
     * 设置「有消息」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_HAS_MESSAGE)
    public HrDepartmentDTO setHasMessage(Integer val) {
        this._set(FIELD_HAS_MESSAGE, val);
        return this;
    }

    /**
     * 获取「有消息」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getHasMessage() {
        return DataTypeUtils.asInteger(this._get(FIELD_HAS_MESSAGE), null);
    }

    /**
     * 判断 「有消息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHasMessage() {
        return this._contains(FIELD_HAS_MESSAGE);
    }

    /**
     * 重置 「有消息」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetHasMessage() {
        this._reset(FIELD_HAS_MESSAGE);
        return this;
    }

    /**
     * 设置「Has Read Access」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_HAS_READ_ACCESS)
    public HrDepartmentDTO setHasReadAccess(Integer val) {
        this._set(FIELD_HAS_READ_ACCESS, val);
        return this;
    }

    /**
     * 获取「Has Read Access」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getHasReadAccess() {
        return DataTypeUtils.asInteger(this._get(FIELD_HAS_READ_ACCESS), null);
    }

    /**
     * 判断 「Has Read Access」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHasReadAccess() {
        return this._contains(FIELD_HAS_READ_ACCESS);
    }

    /**
     * 重置 「Has Read Access」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetHasReadAccess() {
        this._reset(FIELD_HAS_READ_ACCESS);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public HrDepartmentDTO setId(String val) {
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
    public HrDepartmentDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「待批准的休假」
     * @param val
     */
    @JsonProperty(FIELD_LEAVE_TO_APPROVE_COUNT)
    public HrDepartmentDTO setLeaveToApproveCount(Integer val) {
        this._set(FIELD_LEAVE_TO_APPROVE_COUNT, val);
        return this;
    }

    /**
     * 获取「待批准的休假」值
     *
     */
    @JsonIgnore
    public Integer getLeaveToApproveCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_LEAVE_TO_APPROVE_COUNT), null);
    }

    /**
     * 判断 「待批准的休假」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLeaveToApproveCount() {
        return this._contains(FIELD_LEAVE_TO_APPROVE_COUNT);
    }

    /**
     * 重置 「待批准的休假」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetLeaveToApproveCount() {
        this._reset(FIELD_LEAVE_TO_APPROVE_COUNT);
        return this;
    }

    /**
     * 设置「管理员」
     * @param val
     */
    @JsonProperty(FIELD_MANAGER_ID)
    public HrDepartmentDTO setManagerId(String val) {
        this._set(FIELD_MANAGER_ID, val);
        return this;
    }

    /**
     * 获取「管理员」值
     *
     */
    @JsonIgnore
    public String getManagerId() {
        return DataTypeUtils.asString(this._get(FIELD_MANAGER_ID), null);
    }

    /**
     * 判断 「管理员」是否有值
     *
     */
    @JsonIgnore
    public boolean containsManagerId() {
        return this._contains(FIELD_MANAGER_ID);
    }

    /**
     * 重置 「管理员」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetManagerId() {
        this._reset(FIELD_MANAGER_ID);
        return this;
    }

    /**
     * 设置「管理员」
     * @param val
     */
    @JsonProperty(FIELD_MANAGER_NAME)
    public HrDepartmentDTO setManagerName(String val) {
        this._set(FIELD_MANAGER_NAME, val);
        return this;
    }

    /**
     * 获取「管理员」值
     *
     */
    @JsonIgnore
    public String getManagerName() {
        return DataTypeUtils.asString(this._get(FIELD_MANAGER_NAME), null);
    }

    /**
     * 判断 「管理员」是否有值
     *
     */
    @JsonIgnore
    public boolean containsManagerName() {
        return this._contains(FIELD_MANAGER_NAME);
    }

    /**
     * 重置 「管理员」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetManagerName() {
        this._reset(FIELD_MANAGER_NAME);
        return this;
    }

    /**
     * 设置「主部门」
     * @param val
     */
    @JsonProperty(FIELD_MASTER_DEPARTMENT_ID)
    public HrDepartmentDTO setMasterDepartmentId(String val) {
        this._set(FIELD_MASTER_DEPARTMENT_ID, val);
        return this;
    }

    /**
     * 获取「主部门」值
     *
     */
    @JsonIgnore
    public String getMasterDepartmentId() {
        return DataTypeUtils.asString(this._get(FIELD_MASTER_DEPARTMENT_ID), null);
    }

    /**
     * 判断 「主部门」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMasterDepartmentId() {
        return this._contains(FIELD_MASTER_DEPARTMENT_ID);
    }

    /**
     * 重置 「主部门」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetMasterDepartmentId() {
        this._reset(FIELD_MASTER_DEPARTMENT_ID);
        return this;
    }

    /**
     * 设置「附件数量」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_ATTACHMENT_COUNT)
    public HrDepartmentDTO setMessageAttachmentCount(Integer val) {
        this._set(FIELD_MESSAGE_ATTACHMENT_COUNT, val);
        return this;
    }

    /**
     * 获取「附件数量」值
     *
     */
    @JsonIgnore
    public Integer getMessageAttachmentCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_ATTACHMENT_COUNT), null);
    }

    /**
     * 判断 「附件数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageAttachmentCount() {
        return this._contains(FIELD_MESSAGE_ATTACHMENT_COUNT);
    }

    /**
     * 重置 「附件数量」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetMessageAttachmentCount() {
        this._reset(FIELD_MESSAGE_ATTACHMENT_COUNT);
        return this;
    }

    /**
     * 设置「消息发送错误」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_HAS_ERROR)
    public HrDepartmentDTO setMessageHasError(Integer val) {
        this._set(FIELD_MESSAGE_HAS_ERROR, val);
        return this;
    }

    /**
     * 获取「消息发送错误」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getMessageHasError() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_HAS_ERROR), null);
    }

    /**
     * 判断 「消息发送错误」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageHasError() {
        return this._contains(FIELD_MESSAGE_HAS_ERROR);
    }

    /**
     * 重置 「消息发送错误」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetMessageHasError() {
        this._reset(FIELD_MESSAGE_HAS_ERROR);
        return this;
    }

    /**
     * 设置「错误数量」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_HAS_ERROR_COUNTER)
    public HrDepartmentDTO setMessageHasErrorCounter(Integer val) {
        this._set(FIELD_MESSAGE_HAS_ERROR_COUNTER, val);
        return this;
    }

    /**
     * 获取「错误数量」值
     *
     */
    @JsonIgnore
    public Integer getMessageHasErrorCounter() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_HAS_ERROR_COUNTER), null);
    }

    /**
     * 判断 「错误数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageHasErrorCounter() {
        return this._contains(FIELD_MESSAGE_HAS_ERROR_COUNTER);
    }

    /**
     * 重置 「错误数量」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetMessageHasErrorCounter() {
        this._reset(FIELD_MESSAGE_HAS_ERROR_COUNTER);
        return this;
    }

    /**
     * 设置「短信发送错误」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_HAS_SMS_ERROR)
    public HrDepartmentDTO setMessageHasSmsError(Integer val) {
        this._set(FIELD_MESSAGE_HAS_SMS_ERROR, val);
        return this;
    }

    /**
     * 获取「短信发送错误」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getMessageHasSmsError() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_HAS_SMS_ERROR), null);
    }

    /**
     * 判断 「短信发送错误」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageHasSmsError() {
        return this._contains(FIELD_MESSAGE_HAS_SMS_ERROR);
    }

    /**
     * 重置 「短信发送错误」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetMessageHasSmsError() {
        this._reset(FIELD_MESSAGE_HAS_SMS_ERROR);
        return this;
    }

    /**
     * 设置「是关注者」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_IS_FOLLOWER)
    public HrDepartmentDTO setMessageIsFollower(Integer val) {
        this._set(FIELD_MESSAGE_IS_FOLLOWER, val);
        return this;
    }

    /**
     * 获取「是关注者」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getMessageIsFollower() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_IS_FOLLOWER), null);
    }

    /**
     * 判断 「是关注者」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageIsFollower() {
        return this._contains(FIELD_MESSAGE_IS_FOLLOWER);
    }

    /**
     * 重置 「是关注者」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetMessageIsFollower() {
        this._reset(FIELD_MESSAGE_IS_FOLLOWER);
        return this;
    }

    /**
     * 设置「所需操作」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_NEEDACTION)
    public HrDepartmentDTO setMessageNeedaction(Integer val) {
        this._set(FIELD_MESSAGE_NEEDACTION, val);
        return this;
    }

    /**
     * 获取「所需操作」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getMessageNeedaction() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_NEEDACTION), null);
    }

    /**
     * 判断 「所需操作」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageNeedaction() {
        return this._contains(FIELD_MESSAGE_NEEDACTION);
    }

    /**
     * 重置 「所需操作」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetMessageNeedaction() {
        this._reset(FIELD_MESSAGE_NEEDACTION);
        return this;
    }

    /**
     * 设置「操作数量」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_NEEDACTION_COUNTER)
    public HrDepartmentDTO setMessageNeedactionCounter(Integer val) {
        this._set(FIELD_MESSAGE_NEEDACTION_COUNTER, val);
        return this;
    }

    /**
     * 获取「操作数量」值
     *
     */
    @JsonIgnore
    public Integer getMessageNeedactionCounter() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_NEEDACTION_COUNTER), null);
    }

    /**
     * 判断 「操作数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageNeedactionCounter() {
        return this._contains(FIELD_MESSAGE_NEEDACTION_COUNTER);
    }

    /**
     * 重置 「操作数量」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetMessageNeedactionCounter() {
        this._reset(FIELD_MESSAGE_NEEDACTION_COUNTER);
        return this;
    }

    /**
     * 设置「我的活动截止时间」
     * @param val
     */
    @JsonProperty(FIELD_MY_ACTIVITY_DATE_DEADLINE)
    public HrDepartmentDTO setMyActivityDateDeadline(Timestamp val) {
        this._set(FIELD_MY_ACTIVITY_DATE_DEADLINE, val);
        return this;
    }

    /**
     * 获取「我的活动截止时间」值
     *
     */
    @JsonIgnore
    public Timestamp getMyActivityDateDeadline() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_MY_ACTIVITY_DATE_DEADLINE), null);
    }

    /**
     * 判断 「我的活动截止时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMyActivityDateDeadline() {
        return this._contains(FIELD_MY_ACTIVITY_DATE_DEADLINE);
    }

    /**
     * 重置 「我的活动截止时间」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetMyActivityDateDeadline() {
        this._reset(FIELD_MY_ACTIVITY_DATE_DEADLINE);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public HrDepartmentDTO setName(String val) {
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
    public HrDepartmentDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「新申请」
     * @param val
     */
    @JsonProperty(FIELD_NEW_APPLICANT_COUNT)
    public HrDepartmentDTO setNewApplicantCount(Integer val) {
        this._set(FIELD_NEW_APPLICANT_COUNT, val);
        return this;
    }

    /**
     * 获取「新申请」值
     *
     */
    @JsonIgnore
    public Integer getNewApplicantCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_NEW_APPLICANT_COUNT), null);
    }

    /**
     * 判断 「新申请」是否有值
     *
     */
    @JsonIgnore
    public boolean containsNewApplicantCount() {
        return this._contains(FIELD_NEW_APPLICANT_COUNT);
    }

    /**
     * 重置 「新申请」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetNewApplicantCount() {
        this._reset(FIELD_NEW_APPLICANT_COUNT);
        return this;
    }

    /**
     * 设置「新雇用的员工」
     * @param val
     */
    @JsonProperty(FIELD_NEW_HIRED_EMPLOYEE)
    public HrDepartmentDTO setNewHiredEmployee(Integer val) {
        this._set(FIELD_NEW_HIRED_EMPLOYEE, val);
        return this;
    }

    /**
     * 获取「新雇用的员工」值
     *
     */
    @JsonIgnore
    public Integer getNewHiredEmployee() {
        return DataTypeUtils.asInteger(this._get(FIELD_NEW_HIRED_EMPLOYEE), null);
    }

    /**
     * 判断 「新雇用的员工」是否有值
     *
     */
    @JsonIgnore
    public boolean containsNewHiredEmployee() {
        return this._contains(FIELD_NEW_HIRED_EMPLOYEE);
    }

    /**
     * 重置 「新雇用的员工」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetNewHiredEmployee() {
        this._reset(FIELD_NEW_HIRED_EMPLOYEE);
        return this;
    }

    /**
     * 设置「备注」
     * @param val
     */
    @JsonProperty(FIELD_NOTE)
    public HrDepartmentDTO setNote(String val) {
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
    public HrDepartmentDTO resetNote() {
        this._reset(FIELD_NOTE);
        return this;
    }

    /**
     * 设置「上级部门」
     * @param val
     */
    @JsonProperty(FIELD_PARENT_ID)
    public HrDepartmentDTO setParentId(String val) {
        this._set(FIELD_PARENT_ID, val);
        return this;
    }

    /**
     * 获取「上级部门」值
     *
     */
    @JsonIgnore
    public String getParentId() {
        return DataTypeUtils.asString(this._get(FIELD_PARENT_ID), null);
    }

    /**
     * 判断 「上级部门」是否有值
     *
     */
    @JsonIgnore
    public boolean containsParentId() {
        return this._contains(FIELD_PARENT_ID);
    }

    /**
     * 重置 「上级部门」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetParentId() {
        this._reset(FIELD_PARENT_ID);
        return this;
    }

    /**
     * 设置「上级部门」
     * @param val
     */
    @JsonProperty(FIELD_PARENT_NAME)
    public HrDepartmentDTO setParentName(String val) {
        this._set(FIELD_PARENT_NAME, val);
        return this;
    }

    /**
     * 获取「上级部门」值
     *
     */
    @JsonIgnore
    public String getParentName() {
        return DataTypeUtils.asString(this._get(FIELD_PARENT_NAME), null);
    }

    /**
     * 判断 「上级部门」是否有值
     *
     */
    @JsonIgnore
    public boolean containsParentName() {
        return this._contains(FIELD_PARENT_NAME);
    }

    /**
     * 重置 「上级部门」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetParentName() {
        this._reset(FIELD_PARENT_NAME);
        return this;
    }

    /**
     * 设置「父级路径」
     * @param val
     */
    @JsonProperty(FIELD_PARENT_PATH)
    public HrDepartmentDTO setParentPath(String val) {
        this._set(FIELD_PARENT_PATH, val);
        return this;
    }

    /**
     * 获取「父级路径」值
     *
     */
    @JsonIgnore
    public String getParentPath() {
        return DataTypeUtils.asString(this._get(FIELD_PARENT_PATH), null);
    }

    /**
     * 判断 「父级路径」是否有值
     *
     */
    @JsonIgnore
    public boolean containsParentPath() {
        return this._contains(FIELD_PARENT_PATH);
    }

    /**
     * 重置 「父级路径」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetParentPath() {
        this._reset(FIELD_PARENT_PATH);
        return this;
    }

    /**
     * 设置「计划数量」
     * @param val
     */
    @JsonProperty(FIELD_PLANS_COUNT)
    public HrDepartmentDTO setPlansCount(Integer val) {
        this._set(FIELD_PLANS_COUNT, val);
        return this;
    }

    /**
     * 获取「计划数量」值
     *
     */
    @JsonIgnore
    public Integer getPlansCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_PLANS_COUNT), null);
    }

    /**
     * 判断 「计划数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPlansCount() {
        return this._contains(FIELD_PLANS_COUNT);
    }

    /**
     * 重置 「计划数量」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetPlansCount() {
        this._reset(FIELD_PLANS_COUNT);
        return this;
    }

    /**
     * 设置「Total Employee」
     * @param val
     */
    @JsonProperty(FIELD_TOTAL_EMPLOYEE)
    public HrDepartmentDTO setTotalEmployee(Integer val) {
        this._set(FIELD_TOTAL_EMPLOYEE, val);
        return this;
    }

    /**
     * 获取「Total Employee」值
     *
     */
    @JsonIgnore
    public Integer getTotalEmployee() {
        return DataTypeUtils.asInteger(this._get(FIELD_TOTAL_EMPLOYEE), null);
    }

    /**
     * 判断 「Total Employee」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTotalEmployee() {
        return this._contains(FIELD_TOTAL_EMPLOYEE);
    }

    /**
     * 重置 「Total Employee」
     *
     */
    @JsonIgnore
    public HrDepartmentDTO resetTotalEmployee() {
        this._reset(FIELD_TOTAL_EMPLOYEE);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public HrDepartmentDTO setWriteDate(Timestamp val) {
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
    public HrDepartmentDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public HrDepartmentDTO setWriteUid(String val) {
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
    public HrDepartmentDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
