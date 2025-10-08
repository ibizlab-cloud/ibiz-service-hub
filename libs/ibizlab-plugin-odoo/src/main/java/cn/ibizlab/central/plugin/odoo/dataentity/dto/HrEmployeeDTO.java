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


public class HrEmployeeDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

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
     * 属性: 其它说明
     */
    public final static String FIELD_ADDITIONAL_NOTE = "additional_note";

    /**
     * 属性: 工作地址
     */
    public final static String FIELD_ADDRESS_ID = "address_id";

    /**
     * 属性: 工作地址
     */
    public final static String FIELD_ADDRESS_NAME = "address_name";

    /**
     * 属性: 分配的总天数。
     */
    public final static String FIELD_ALLOCATION_COUNT = "allocation_count";

    /**
     * 属性: 分配显示
     */
    public final static String FIELD_ALLOCATION_DISPLAY = "allocation_display";

    /**
     * 属性: 剩余的分配显示
     */
    public final static String FIELD_ALLOCATION_REMAINING_DISPLAY = "allocation_remaining_display";

    /**
     * 属性: 分配总数量
     */
    public final static String FIELD_ALLOCATIONS_COUNT = "allocations_count";

    /**
     * 属性: 考勤管理员
     */
    public final static String FIELD_ATTENDANCE_MANAGER_ID = "attendance_manager_id";

    /**
     * 属性: 考勤管理员
     */
    public final static String FIELD_ATTENDANCE_MANAGER_NAME = "attendance_manager_name";

    /**
     * 属性: 出勤状态
     */
    public final static String FIELD_ATTENDANCE_STATE = "attendance_state";

    /**
     * 属性: 银行账户
     */
    public final static String FIELD_BANK_ACCOUNT_ID = "bank_account_id";

    /**
     * 属性: 银行账户
     */
    public final static String FIELD_BANK_ACCOUNT_NAME = "bank_account_name";

    /**
     * 属性: 徽标 ID
     */
    public final static String FIELD_BARCODE = "barcode";

    /**
     * 属性: 出生日期
     */
    public final static String FIELD_BIRTHDAY = "birthday";

    /**
     * 属性: 证书等级
     */
    public final static String FIELD_CERTIFICATE = "certificate";

    /**
     * 属性: 间接下属统计
     */
    public final static String FIELD_CHILD_ALL_COUNT = "child_all_count";

    /**
     * 属性: 直接下属人数
     */
    public final static String FIELD_CHILD_COUNT = "child_count";

    /**
     * 属性: 受抚养的子女数
     */
    public final static String FIELD_CHILDREN = "children";

    /**
     * 属性: 教练
     */
    public final static String FIELD_COACH_ID = "coach_id";

    /**
     * 属性: 教练
     */
    public final static String FIELD_COACH_NAME = "coach_name";

    /**
     * 属性: 颜色指标
     */
    public final static String FIELD_COLOR = "color";

    /**
     * 属性: 公司
     */
    public final static String FIELD_COMPANY_ID = "company_id";

    /**
     * 属性: 公司名称
     */
    public final static String FIELD_COMPANY_NAME = "company_name";

    /**
     * 属性: 当前合同
     */
    public final static String FIELD_CONTRACT_ID = "contract_id";

    /**
     * 属性: 合同警告
     */
    public final static String FIELD_CONTRACT_WARNING = "contract_warning";

    /**
     * 属性: 合同统计
     */
    public final static String FIELD_CONTRACTS_COUNT = "contracts_count";

    /**
     * 属性: 国籍(国家)
     */
    public final static String FIELD_COUNTRY_ID = "country_id";

    /**
     * 属性: 国籍(国家)
     */
    public final static String FIELD_COUNTRY_NAME = "country_name";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 当前休假状态
     */
    public final static String FIELD_CURRENT_LEAVE_STATE = "current_leave_state";

    /**
     * 属性: 部门
     */
    public final static String FIELD_DEPARTMENT_ID = "department_id";

    /**
     * 属性: 部门名称
     */
    public final static String FIELD_DEPARTMENT_NAME = "department_name";

    /**
     * 属性: 离职日期
     */
    public final static String FIELD_DEPARTURE_DATE = "departure_date";

    /**
     * 属性: 其它信息
     */
    public final static String FIELD_DEPARTURE_DESCRIPTION = "departure_description";

    /**
     * 属性: 离职原因
     */
    public final static String FIELD_DEPARTURE_REASON_ID = "departure_reason_id";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 通勤距离
     */
    public final static String FIELD_DISTANCE_HOME_WORK = "distance_home_work";

    /**
     * 属性: 通勤距离（单位）
     */
    public final static String FIELD_DISTANCE_HOME_WORK_UNIT = "distance_home_work_unit";

    /**
     * 属性: 联系人姓名
     */
    public final static String FIELD_EMERGENCY_CONTACT = "emergency_contact";

    /**
     * 属性: 电话
     */
    public final static String FIELD_EMERGENCY_PHONE = "emergency_phone";

    /**
     * 属性: 车辆
     */
    public final static String FIELD_EMPLOYEE_CARS_COUNT = "employee_cars_count";

    /**
     * 属性: 员工类型
     */
    public final static String FIELD_EMPLOYEE_TYPE = "employee_type";

    /**
     * 属性: 设备数量
     */
    public final static String FIELD_EQUIPMENT_COUNT = "equipment_count";

    /**
     * 属性: 费用
     */
    public final static String FIELD_EXPENSE_MANAGER_ID = "expense_manager_id";

    /**
     * 属性: 费用筛选
     */
    public final static String FIELD_FILTER_FOR_EXPENSE = "filter_for_expense";

    /**
     * 属性: 首次合同日期
     */
    public final static String FIELD_FIRST_CONTRACT_DATE = "first_contract_date";

    /**
     * 属性: 性别
     */
    public final static String FIELD_GENDER = "gender";

    /**
     * 属性: 有徽章
     */
    public final static String FIELD_HAS_BADGES = "has_badges";

    /**
     * 属性: 有消息
     */
    public final static String FIELD_HAS_MESSAGE = "has_message";

    /**
     * 属性: 小时上月
     */
    public final static String FIELD_HOURS_LAST_MONTH = "hours_last_month";

    /**
     * 属性: 小时上月显示
     */
    public final static String FIELD_HOURS_LAST_MONTH_DISPLAY = "hours_last_month_display";

    /**
     * 属性: 今天之前的小时数
     */
    public final static String FIELD_HOURS_PREVIOUSLY_TODAY = "hours_previously_today";

    /**
     * 属性: 小时今天
     */
    public final static String FIELD_HOURS_TODAY = "hours_today";

    /**
     * 属性: 人力资源显示的图标
     */
    public final static String FIELD_HR_ICON_DISPLAY = "hr_icon_display";

    /**
     * 属性: 人力资源出席状态
     */
    public final static String FIELD_HR_PRESENCE_STATE = "hr_presence_state";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 身份证号
     */
    public final static String FIELD_IDENTIFICATION_ID = "identification_id";

    /**
     * 属性: 今日缺勤
     */
    public final static String FIELD_IS_ABSENT = "is_absent";

    /**
     * 属性: 灵活可变
     */
    public final static String FIELD_IS_FLEXIBLE = "is_flexible";

    /**
     * 属性: 完全灵活
     */
    public final static String FIELD_IS_FULLY_FLEXIBLE = "is_fully_flexible";

    /**
     * 属性: 是下属
     */
    public final static String FIELD_IS_SUBORDINATE = "is_subordinate";

    /**
     * 属性: 工作岗位
     */
    public final static String FIELD_JOB_ID = "job_id";

    /**
     * 属性: 工作岗位
     */
    public final static String FIELD_JOB_NAME = "job_name";

    /**
     * 属性: 工作头衔
     */
    public final static String FIELD_JOB_TITLE = "job_title";

    /**
     * 属性: 通勤距离（公里）
     */
    public final static String FIELD_KM_HOME_WORK = "km_home_work";

    /**
     * 属性: 上个活动
     */
    public final static String FIELD_LAST_ACTIVITY = "last_activity";

    /**
     * 属性: 上个活动时间
     */
    public final static String FIELD_LAST_ACTIVITY_TIME = "last_activity_time";

    /**
     * 属性: 上次出勤
     */
    public final static String FIELD_LAST_ATTENDANCE_ID = "last_attendance_id";

    /**
     * 属性: 最后一次出勤 工作时数
     */
    public final static String FIELD_LAST_ATTENDANCE_WORKED_HOURS = "last_attendance_worked_hours";

    /**
     * 属性: 起始日期
     */
    public final static String FIELD_LEAVE_DATE_FROM = "leave_date_from";

    /**
     * 属性: 至日期
     */
    public final static String FIELD_LEAVE_DATE_TO = "leave_date_to";

    /**
     * 属性: 休假
     */
    public final static String FIELD_LEAVE_MANAGER_ID = "leave_manager_id";

    /**
     * 属性: 休假
     */
    public final static String FIELD_LEAVE_MANAGER_NAME = "leave_manager_name";

    /**
     * 属性: 休假次数
     */
    public final static String FIELD_LEAVES_COUNT = "leaves_count";

    /**
     * 属性: 法定名称
     */
    public final static String FIELD_LEGAL_NAME = "legal_name";

    /**
     * 属性: 车辆牌照
     */
    public final static String FIELD_LICENSE_PLATE = "license_plate";

    /**
     * 属性: 部门数量
     */
    public final static String FIELD_MEMBER_OF_DEPARTMENT = "member_of_department";

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
     * 属性: 主要附件
     */
    public final static String FIELD_MESSAGE_MAIN_ATTACHMENT_ID = "message_main_attachment_id";

    /**
     * 属性: 所需操作
     */
    public final static String FIELD_MESSAGE_NEEDACTION = "message_needaction";

    /**
     * 属性: 操作数量
     */
    public final static String FIELD_MESSAGE_NEEDACTION_COUNTER = "message_needaction_counter";

    /**
     * 属性: 办公手机
     */
    public final static String FIELD_MOBILE_PHONE = "mobile_phone";

    /**
     * 属性: 调动卡
     */
    public final static String FIELD_MOBILITY_CARD = "mobility_card";

    /**
     * 属性: 我的活动截止时间
     */
    public final static String FIELD_MY_ACTIVITY_DATE_DEADLINE = "my_activity_date_deadline";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 最近聘用的
     */
    public final static String FIELD_NEWLY_HIRED = "newly_hired";

    /**
     * 属性: 备注
     */
    public final static String FIELD_NOTES = "notes";

    /**
     * 属性: 管理员标识
     */
    public final static String FIELD_PARENT_ID = "parent_id";

    /**
     * 属性: 管理员
     */
    public final static String FIELD_PARENT_NAME = "parent_name";

    /**
     * 属性: 护照号
     */
    public final static String FIELD_PASSPORT_ID = "passport_id";

    /**
     * 属性: 工作证编号
     */
    public final static String FIELD_PERMIT_NO = "permit_no";

    /**
     * 属性: PIN
     */
    public final static String FIELD_PIN = "pin";

    /**
     * 属性: 出生地
     */
    public final static String FIELD_PLACE_OF_BIRTH = "place_of_birth";

    /**
     * 属性: 私人车辆车牌
     */
    public final static String FIELD_PRIVATE_CAR_PLATE = "private_car_plate";

    /**
     * 属性: 城市
     */
    public final static String FIELD_PRIVATE_CITY = "private_city";

    /**
     * 属性: 国家
     */
    public final static String FIELD_PRIVATE_COUNTRY_ID = "private_country_id";

    /**
     * 属性: 国家
     */
    public final static String FIELD_PRIVATE_COUNTRY_NAME = "private_country_name";

    /**
     * 属性: 私人电子邮箱
     */
    public final static String FIELD_PRIVATE_EMAIL = "private_email";

    /**
     * 属性: 私人电话
     */
    public final static String FIELD_PRIVATE_PHONE = "private_phone";

    /**
     * 属性: 私人省/州
     */
    public final static String FIELD_PRIVATE_STATE_ID = "private_state_id";

    /**
     * 属性: 私人省/州
     */
    public final static String FIELD_PRIVATE_STATE_NAME = "private_state_name";

    /**
     * 属性: 街道
     */
    public final static String FIELD_PRIVATE_STREET = "private_street";

    /**
     * 属性: 街道2
     */
    public final static String FIELD_PRIVATE_STREET2 = "private_street2";

    /**
     * 属性: 邮编
     */
    public final static String FIELD_PRIVATE_ZIP = "private_zip";

    /**
     * 属性: 相关合作伙伴数量
     */
    public final static String FIELD_RELATED_PARTNERS_COUNT = "related_partners_count";

    /**
     * 属性: 可用休假天数
     */
    public final static String FIELD_REMAINING_LEAVES = "remaining_leaves";

    /**
     * 属性: 工作时间
     */
    public final static String FIELD_RESOURCE_CALENDAR_ID = "resource_calendar_id";

    /**
     * 属性: 工作时间
     */
    public final static String FIELD_RESOURCE_CALENDAR_NAME = "resource_calendar_name";

    /**
     * 属性: 资源
     */
    public final static String FIELD_RESOURCE_ID = "resource_id";

    /**
     * 属性: 显示HR图标
     */
    public final static String FIELD_SHOW_HR_ICON_DISPLAY = "show_hr_icon_display";

    /**
     * 属性: 能够查看到剩余休假
     */
    public final static String FIELD_SHOW_LEAVES = "show_leaves";

    /**
     * 属性: 社会保险号SIN
     */
    public final static String FIELD_SINID = "sinid";

    /**
     * 属性: 配偶生日
     */
    public final static String FIELD_SPOUSE_BIRTHDATE = "spouse_birthdate";

    /**
     * 属性: 配偶全名
     */
    public final static String FIELD_SPOUSE_COMPLETE_NAME = "spouse_complete_name";

    /**
     * 属性: 社会保障号SSN
     */
    public final static String FIELD_SSNID = "ssnid";

    /**
     * 属性: 研究领域
     */
    public final static String FIELD_STUDY_FIELD = "study_field";

    /**
     * 属性: 毕业院校
     */
    public final static String FIELD_STUDY_SCHOOL = "study_school";

    /**
     * 属性: 加班费总额
     */
    public final static String FIELD_TOTAL_OVERTIME = "total_overtime";

    /**
     * 属性: 用户
     */
    public final static String FIELD_USER_ID = "user_id";

    /**
     * 属性: 用户
     */
    public final static String FIELD_USER_NAME = "user_name";

    /**
     * 属性: 公司汽车
     */
    public final static String FIELD_VEHICLE = "vehicle";

    /**
     * 属性: 签证有效期
     */
    public final static String FIELD_VISA_EXPIRE = "visa_expire";

    /**
     * 属性: 签证号
     */
    public final static String FIELD_VISA_NO = "visa_no";

    /**
     * 属性: 工作联系人
     */
    public final static String FIELD_WORK_CONTACT_ID = "work_contact_id";

    /**
     * 属性: 工作电子邮件
     */
    public final static String FIELD_WORK_EMAIL = "work_email";

    /**
     * 属性: 工作地点
     */
    public final static String FIELD_WORK_LOCATION_ID = "work_location_id";

    /**
     * 属性: 工作地点
     */
    public final static String FIELD_WORK_LOCATION_NAME = "work_location_name";

    /**
     * 属性: 工作位置类型
     */
    public final static String FIELD_WORK_LOCATION_TYPE = "work_location_type";

    /**
     * 属性: 工作许可证到期日期
     */
    public final static String FIELD_WORK_PERMIT_EXPIRATION_DATE = "work_permit_expiration_date";

    /**
     * 属性: 工作许可名称
     */
    public final static String FIELD_WORK_PERMIT_NAME = "work_permit_name";

    /**
     * 属性: 工作许可的预定活动
     */
    public final static String FIELD_WORK_PERMIT_SCHEDULED_ACTIVITY = "work_permit_scheduled_activity";

    /**
     * 属性: 办公电话
     */
    public final static String FIELD_WORK_PHONE = "work_phone";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 属性: 管理链
     */
    public final static String FIELD_PARENT_PATH = "parent_path";

    /**
     * 属性: 头像128
     */
    public final static String FIELD_AVATAR128 = "avatar128";

    /**
     * 属性: 图片128
     */
    public final static String FIELD_IMAGE128 = "image128";

    /**
     * 属性: 头像512
     */
    public final static String FIELD_AVATAR512 = "avatar512";

    /**
     * 属性: 图片512
     */
    public final static String FIELD_IMAGE512 = "image512";

    /**
     * 属性: 头像256
     */
    public final static String FIELD_AVATAR256 = "avatar256";

    /**
     * 属性: 图片256
     */
    public final static String FIELD_IMAGE256 = "image256";

    /**
     * 属性: 头像1024
     */
    public final static String FIELD_AVATAR1024 = "avatar1024";

    /**
     * 属性: 图片1024
     */
    public final static String FIELD_IMAGE1024 = "image1024";

    /**
     * 属性: 头像
     */
    public final static String FIELD_AVATAR = "avatar";

    /**
     * 属性: 头像
     */
    public final static String FIELD_IMAGE = "image";

    /**
     * 设置「活动集合」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITIES)
    public HrEmployeeDTO setActivities(List<MailActivityDTO> val) {
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
    public HrEmployeeDTO resetActivities() {
        this._reset(FIELD_ACTIVITIES);
        return this;
    }

    /**
     * 设置「附件集合」
     * @param val
     */
    @JsonProperty(FIELD_ATTACHMENTS)
    public HrEmployeeDTO setAttachments(List<IrAttachmentDTO> val) {
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
    public HrEmployeeDTO resetAttachments() {
        this._reset(FIELD_ATTACHMENTS);
        return this;
    }

    /**
     * 设置「关注者」
     * @param val
     */
    @JsonProperty(FIELD_FOLLOWERS)
    public HrEmployeeDTO setFollowers(List<MailFollowersDTO> val) {
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
    public HrEmployeeDTO resetFollowers() {
        this._reset(FIELD_FOLLOWERS);
        return this;
    }

    /**
     * 设置「有效」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ACTIVE)
    public HrEmployeeDTO setActive(Integer val) {
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
    public HrEmployeeDTO resetActive() {
        this._reset(FIELD_ACTIVE);
        return this;
    }

    /**
     * 设置「下一活动截止日期」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_DATE_DEADLINE)
    public HrEmployeeDTO setActivityDateDeadline(Timestamp val) {
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
    public HrEmployeeDTO resetActivityDateDeadline() {
        this._reset(FIELD_ACTIVITY_DATE_DEADLINE);
        return this;
    }

    /**
     * 设置「活动异常标示」
     * 代码表[活动异常标示]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.hr_employee_activity_exception_decoration
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_EXCEPTION_DECORATION)
    public HrEmployeeDTO setActivityExceptionDecoration(String val) {
        this._set(FIELD_ACTIVITY_EXCEPTION_DECORATION, val);
        return this;
    }

    /**
     * 获取「活动异常标示」值
     * 代码表[活动异常标示]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.hr_employee_activity_exception_decoration
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
    public HrEmployeeDTO resetActivityExceptionDecoration() {
        this._reset(FIELD_ACTIVITY_EXCEPTION_DECORATION);
        return this;
    }

    /**
     * 设置「图标」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_EXCEPTION_ICON)
    public HrEmployeeDTO setActivityExceptionIcon(String val) {
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
    public HrEmployeeDTO resetActivityExceptionIcon() {
        this._reset(FIELD_ACTIVITY_EXCEPTION_ICON);
        return this;
    }

    /**
     * 设置「活动状态」
     * 代码表[活动状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.hr_employee_activity_state
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_STATE)
    public HrEmployeeDTO setActivityState(String val) {
        this._set(FIELD_ACTIVITY_STATE, val);
        return this;
    }

    /**
     * 获取「活动状态」值
     * 代码表[活动状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.hr_employee_activity_state
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
    public HrEmployeeDTO resetActivityState() {
        this._reset(FIELD_ACTIVITY_STATE);
        return this;
    }

    /**
     * 设置「其它说明」
     * @param val
     */
    @JsonProperty(FIELD_ADDITIONAL_NOTE)
    public HrEmployeeDTO setAdditionalNote(String val) {
        this._set(FIELD_ADDITIONAL_NOTE, val);
        return this;
    }

    /**
     * 获取「其它说明」值
     *
     */
    @JsonIgnore
    public String getAdditionalNote() {
        return DataTypeUtils.asString(this._get(FIELD_ADDITIONAL_NOTE), null);
    }

    /**
     * 判断 「其它说明」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAdditionalNote() {
        return this._contains(FIELD_ADDITIONAL_NOTE);
    }

    /**
     * 重置 「其它说明」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetAdditionalNote() {
        this._reset(FIELD_ADDITIONAL_NOTE);
        return this;
    }

    /**
     * 设置「工作地址」
     * @param val
     */
    @JsonProperty(FIELD_ADDRESS_ID)
    public HrEmployeeDTO setAddressId(String val) {
        this._set(FIELD_ADDRESS_ID, val);
        return this;
    }

    /**
     * 获取「工作地址」值
     *
     */
    @JsonIgnore
    public String getAddressId() {
        return DataTypeUtils.asString(this._get(FIELD_ADDRESS_ID), null);
    }

    /**
     * 判断 「工作地址」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAddressId() {
        return this._contains(FIELD_ADDRESS_ID);
    }

    /**
     * 重置 「工作地址」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetAddressId() {
        this._reset(FIELD_ADDRESS_ID);
        return this;
    }

    /**
     * 设置「工作地址」
     * @param val
     */
    @JsonProperty(FIELD_ADDRESS_NAME)
    public HrEmployeeDTO setAddressName(String val) {
        this._set(FIELD_ADDRESS_NAME, val);
        return this;
    }

    /**
     * 获取「工作地址」值
     *
     */
    @JsonIgnore
    public String getAddressName() {
        return DataTypeUtils.asString(this._get(FIELD_ADDRESS_NAME), null);
    }

    /**
     * 判断 「工作地址」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAddressName() {
        return this._contains(FIELD_ADDRESS_NAME);
    }

    /**
     * 重置 「工作地址」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetAddressName() {
        this._reset(FIELD_ADDRESS_NAME);
        return this;
    }

    /**
     * 设置「分配的总天数。」
     * @param val
     */
    @JsonProperty(FIELD_ALLOCATION_COUNT)
    public HrEmployeeDTO setAllocationCount(Double val) {
        this._set(FIELD_ALLOCATION_COUNT, val);
        return this;
    }

    /**
     * 获取「分配的总天数。」值
     *
     */
    @JsonIgnore
    public Double getAllocationCount() {
        return DataTypeUtils.asDouble(this._get(FIELD_ALLOCATION_COUNT), null);
    }

    /**
     * 判断 「分配的总天数。」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAllocationCount() {
        return this._contains(FIELD_ALLOCATION_COUNT);
    }

    /**
     * 重置 「分配的总天数。」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetAllocationCount() {
        this._reset(FIELD_ALLOCATION_COUNT);
        return this;
    }

    /**
     * 设置「分配显示」
     * @param val
     */
    @JsonProperty(FIELD_ALLOCATION_DISPLAY)
    public HrEmployeeDTO setAllocationDisplay(String val) {
        this._set(FIELD_ALLOCATION_DISPLAY, val);
        return this;
    }

    /**
     * 获取「分配显示」值
     *
     */
    @JsonIgnore
    public String getAllocationDisplay() {
        return DataTypeUtils.asString(this._get(FIELD_ALLOCATION_DISPLAY), null);
    }

    /**
     * 判断 「分配显示」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAllocationDisplay() {
        return this._contains(FIELD_ALLOCATION_DISPLAY);
    }

    /**
     * 重置 「分配显示」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetAllocationDisplay() {
        this._reset(FIELD_ALLOCATION_DISPLAY);
        return this;
    }

    /**
     * 设置「剩余的分配显示」
     * @param val
     */
    @JsonProperty(FIELD_ALLOCATION_REMAINING_DISPLAY)
    public HrEmployeeDTO setAllocationRemainingDisplay(String val) {
        this._set(FIELD_ALLOCATION_REMAINING_DISPLAY, val);
        return this;
    }

    /**
     * 获取「剩余的分配显示」值
     *
     */
    @JsonIgnore
    public String getAllocationRemainingDisplay() {
        return DataTypeUtils.asString(this._get(FIELD_ALLOCATION_REMAINING_DISPLAY), null);
    }

    /**
     * 判断 「剩余的分配显示」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAllocationRemainingDisplay() {
        return this._contains(FIELD_ALLOCATION_REMAINING_DISPLAY);
    }

    /**
     * 重置 「剩余的分配显示」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetAllocationRemainingDisplay() {
        this._reset(FIELD_ALLOCATION_REMAINING_DISPLAY);
        return this;
    }

    /**
     * 设置「分配总数量」
     * @param val
     */
    @JsonProperty(FIELD_ALLOCATIONS_COUNT)
    public HrEmployeeDTO setAllocationsCount(Integer val) {
        this._set(FIELD_ALLOCATIONS_COUNT, val);
        return this;
    }

    /**
     * 获取「分配总数量」值
     *
     */
    @JsonIgnore
    public Integer getAllocationsCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_ALLOCATIONS_COUNT), null);
    }

    /**
     * 判断 「分配总数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAllocationsCount() {
        return this._contains(FIELD_ALLOCATIONS_COUNT);
    }

    /**
     * 重置 「分配总数量」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetAllocationsCount() {
        this._reset(FIELD_ALLOCATIONS_COUNT);
        return this;
    }

    /**
     * 设置「考勤管理员」
     * @param val
     */
    @JsonProperty(FIELD_ATTENDANCE_MANAGER_ID)
    public HrEmployeeDTO setAttendanceManagerId(String val) {
        this._set(FIELD_ATTENDANCE_MANAGER_ID, val);
        return this;
    }

    /**
     * 获取「考勤管理员」值
     *
     */
    @JsonIgnore
    public String getAttendanceManagerId() {
        return DataTypeUtils.asString(this._get(FIELD_ATTENDANCE_MANAGER_ID), null);
    }

    /**
     * 判断 「考勤管理员」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAttendanceManagerId() {
        return this._contains(FIELD_ATTENDANCE_MANAGER_ID);
    }

    /**
     * 重置 「考勤管理员」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetAttendanceManagerId() {
        this._reset(FIELD_ATTENDANCE_MANAGER_ID);
        return this;
    }

    /**
     * 设置「考勤管理员」
     * @param val
     */
    @JsonProperty(FIELD_ATTENDANCE_MANAGER_NAME)
    public HrEmployeeDTO setAttendanceManagerName(String val) {
        this._set(FIELD_ATTENDANCE_MANAGER_NAME, val);
        return this;
    }

    /**
     * 获取「考勤管理员」值
     *
     */
    @JsonIgnore
    public String getAttendanceManagerName() {
        return DataTypeUtils.asString(this._get(FIELD_ATTENDANCE_MANAGER_NAME), null);
    }

    /**
     * 判断 「考勤管理员」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAttendanceManagerName() {
        return this._contains(FIELD_ATTENDANCE_MANAGER_NAME);
    }

    /**
     * 重置 「考勤管理员」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetAttendanceManagerName() {
        this._reset(FIELD_ATTENDANCE_MANAGER_NAME);
        return this;
    }

    /**
     * 设置「出勤状态」
     * 代码表[出勤状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.hr_employee_attendance_state
     * @param val
     */
    @JsonProperty(FIELD_ATTENDANCE_STATE)
    public HrEmployeeDTO setAttendanceState(String val) {
        this._set(FIELD_ATTENDANCE_STATE, val);
        return this;
    }

    /**
     * 获取「出勤状态」值
     * 代码表[出勤状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.hr_employee_attendance_state
     *
     */
    @JsonIgnore
    public String getAttendanceState() {
        return DataTypeUtils.asString(this._get(FIELD_ATTENDANCE_STATE), null);
    }

    /**
     * 判断 「出勤状态」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAttendanceState() {
        return this._contains(FIELD_ATTENDANCE_STATE);
    }

    /**
     * 重置 「出勤状态」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetAttendanceState() {
        this._reset(FIELD_ATTENDANCE_STATE);
        return this;
    }

    /**
     * 设置「银行账户」
     * @param val
     */
    @JsonProperty(FIELD_BANK_ACCOUNT_ID)
    public HrEmployeeDTO setBankAccountId(String val) {
        this._set(FIELD_BANK_ACCOUNT_ID, val);
        return this;
    }

    /**
     * 获取「银行账户」值
     *
     */
    @JsonIgnore
    public String getBankAccountId() {
        return DataTypeUtils.asString(this._get(FIELD_BANK_ACCOUNT_ID), null);
    }

    /**
     * 判断 「银行账户」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBankAccountId() {
        return this._contains(FIELD_BANK_ACCOUNT_ID);
    }

    /**
     * 重置 「银行账户」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetBankAccountId() {
        this._reset(FIELD_BANK_ACCOUNT_ID);
        return this;
    }

    /**
     * 设置「银行账户」
     * @param val
     */
    @JsonProperty(FIELD_BANK_ACCOUNT_NAME)
    public HrEmployeeDTO setBankAccountName(String val) {
        this._set(FIELD_BANK_ACCOUNT_NAME, val);
        return this;
    }

    /**
     * 获取「银行账户」值
     *
     */
    @JsonIgnore
    public String getBankAccountName() {
        return DataTypeUtils.asString(this._get(FIELD_BANK_ACCOUNT_NAME), null);
    }

    /**
     * 判断 「银行账户」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBankAccountName() {
        return this._contains(FIELD_BANK_ACCOUNT_NAME);
    }

    /**
     * 重置 「银行账户」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetBankAccountName() {
        this._reset(FIELD_BANK_ACCOUNT_NAME);
        return this;
    }

    /**
     * 设置「徽标 ID」
     * @param val
     */
    @JsonProperty(FIELD_BARCODE)
    public HrEmployeeDTO setBarcode(String val) {
        this._set(FIELD_BARCODE, val);
        return this;
    }

    /**
     * 获取「徽标 ID」值
     *
     */
    @JsonIgnore
    public String getBarcode() {
        return DataTypeUtils.asString(this._get(FIELD_BARCODE), null);
    }

    /**
     * 判断 「徽标 ID」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBarcode() {
        return this._contains(FIELD_BARCODE);
    }

    /**
     * 重置 「徽标 ID」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetBarcode() {
        this._reset(FIELD_BARCODE);
        return this;
    }

    /**
     * 设置「出生日期」
     * @param val
     */
    @JsonProperty(FIELD_BIRTHDAY)
    public HrEmployeeDTO setBirthday(Timestamp val) {
        this._set(FIELD_BIRTHDAY, val);
        return this;
    }

    /**
     * 获取「出生日期」值
     *
     */
    @JsonIgnore
    public Timestamp getBirthday() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_BIRTHDAY), null);
    }

    /**
     * 判断 「出生日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBirthday() {
        return this._contains(FIELD_BIRTHDAY);
    }

    /**
     * 重置 「出生日期」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetBirthday() {
        this._reset(FIELD_BIRTHDAY);
        return this;
    }

    /**
     * 设置「证书等级」
     * 代码表[证书等级]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.hr_employee_certificate
     * @param val
     */
    @JsonProperty(FIELD_CERTIFICATE)
    public HrEmployeeDTO setCertificate(String val) {
        this._set(FIELD_CERTIFICATE, val);
        return this;
    }

    /**
     * 获取「证书等级」值
     * 代码表[证书等级]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.hr_employee_certificate
     *
     */
    @JsonIgnore
    public String getCertificate() {
        return DataTypeUtils.asString(this._get(FIELD_CERTIFICATE), null);
    }

    /**
     * 判断 「证书等级」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCertificate() {
        return this._contains(FIELD_CERTIFICATE);
    }

    /**
     * 重置 「证书等级」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetCertificate() {
        this._reset(FIELD_CERTIFICATE);
        return this;
    }

    /**
     * 设置「间接下属统计」
     * @param val
     */
    @JsonProperty(FIELD_CHILD_ALL_COUNT)
    public HrEmployeeDTO setChildAllCount(Integer val) {
        this._set(FIELD_CHILD_ALL_COUNT, val);
        return this;
    }

    /**
     * 获取「间接下属统计」值
     *
     */
    @JsonIgnore
    public Integer getChildAllCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_CHILD_ALL_COUNT), null);
    }

    /**
     * 判断 「间接下属统计」是否有值
     *
     */
    @JsonIgnore
    public boolean containsChildAllCount() {
        return this._contains(FIELD_CHILD_ALL_COUNT);
    }

    /**
     * 重置 「间接下属统计」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetChildAllCount() {
        this._reset(FIELD_CHILD_ALL_COUNT);
        return this;
    }

    /**
     * 设置「直接下属人数」
     * @param val
     */
    @JsonProperty(FIELD_CHILD_COUNT)
    public HrEmployeeDTO setChildCount(Integer val) {
        this._set(FIELD_CHILD_COUNT, val);
        return this;
    }

    /**
     * 获取「直接下属人数」值
     *
     */
    @JsonIgnore
    public Integer getChildCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_CHILD_COUNT), null);
    }

    /**
     * 判断 「直接下属人数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsChildCount() {
        return this._contains(FIELD_CHILD_COUNT);
    }

    /**
     * 重置 「直接下属人数」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetChildCount() {
        this._reset(FIELD_CHILD_COUNT);
        return this;
    }

    /**
     * 设置「受抚养的子女数」
     * @param val
     */
    @JsonProperty(FIELD_CHILDREN)
    public HrEmployeeDTO setChildren(Integer val) {
        this._set(FIELD_CHILDREN, val);
        return this;
    }

    /**
     * 获取「受抚养的子女数」值
     *
     */
    @JsonIgnore
    public Integer getChildren() {
        return DataTypeUtils.asInteger(this._get(FIELD_CHILDREN), null);
    }

    /**
     * 判断 「受抚养的子女数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsChildren() {
        return this._contains(FIELD_CHILDREN);
    }

    /**
     * 重置 「受抚养的子女数」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetChildren() {
        this._reset(FIELD_CHILDREN);
        return this;
    }

    /**
     * 设置「教练」
     * @param val
     */
    @JsonProperty(FIELD_COACH_ID)
    public HrEmployeeDTO setCoachId(String val) {
        this._set(FIELD_COACH_ID, val);
        return this;
    }

    /**
     * 获取「教练」值
     *
     */
    @JsonIgnore
    public String getCoachId() {
        return DataTypeUtils.asString(this._get(FIELD_COACH_ID), null);
    }

    /**
     * 判断 「教练」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCoachId() {
        return this._contains(FIELD_COACH_ID);
    }

    /**
     * 重置 「教练」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetCoachId() {
        this._reset(FIELD_COACH_ID);
        return this;
    }

    /**
     * 设置「教练」
     * @param val
     */
    @JsonProperty(FIELD_COACH_NAME)
    public HrEmployeeDTO setCoachName(String val) {
        this._set(FIELD_COACH_NAME, val);
        return this;
    }

    /**
     * 获取「教练」值
     *
     */
    @JsonIgnore
    public String getCoachName() {
        return DataTypeUtils.asString(this._get(FIELD_COACH_NAME), null);
    }

    /**
     * 判断 「教练」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCoachName() {
        return this._contains(FIELD_COACH_NAME);
    }

    /**
     * 重置 「教练」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetCoachName() {
        this._reset(FIELD_COACH_NAME);
        return this;
    }

    /**
     * 设置「颜色指标」
     * @param val
     */
    @JsonProperty(FIELD_COLOR)
    public HrEmployeeDTO setColor(Integer val) {
        this._set(FIELD_COLOR, val);
        return this;
    }

    /**
     * 获取「颜色指标」值
     *
     */
    @JsonIgnore
    public Integer getColor() {
        return DataTypeUtils.asInteger(this._get(FIELD_COLOR), null);
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
    public HrEmployeeDTO resetColor() {
        this._reset(FIELD_COLOR);
        return this;
    }

    /**
     * 设置「公司」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_ID)
    public HrEmployeeDTO setCompanyId(String val) {
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
    public HrEmployeeDTO resetCompanyId() {
        this._reset(FIELD_COMPANY_ID);
        return this;
    }

    /**
     * 设置「公司名称」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_NAME)
    public HrEmployeeDTO setCompanyName(String val) {
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
    public HrEmployeeDTO resetCompanyName() {
        this._reset(FIELD_COMPANY_NAME);
        return this;
    }

    /**
     * 设置「当前合同」
     * @param val
     */
    @JsonProperty(FIELD_CONTRACT_ID)
    public HrEmployeeDTO setContractId(String val) {
        this._set(FIELD_CONTRACT_ID, val);
        return this;
    }

    /**
     * 获取「当前合同」值
     *
     */
    @JsonIgnore
    public String getContractId() {
        return DataTypeUtils.asString(this._get(FIELD_CONTRACT_ID), null);
    }

    /**
     * 判断 「当前合同」是否有值
     *
     */
    @JsonIgnore
    public boolean containsContractId() {
        return this._contains(FIELD_CONTRACT_ID);
    }

    /**
     * 重置 「当前合同」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetContractId() {
        this._reset(FIELD_CONTRACT_ID);
        return this;
    }

    /**
     * 设置「合同警告」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_CONTRACT_WARNING)
    public HrEmployeeDTO setContractWarning(Integer val) {
        this._set(FIELD_CONTRACT_WARNING, val);
        return this;
    }

    /**
     * 获取「合同警告」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getContractWarning() {
        return DataTypeUtils.asInteger(this._get(FIELD_CONTRACT_WARNING), null);
    }

    /**
     * 判断 「合同警告」是否有值
     *
     */
    @JsonIgnore
    public boolean containsContractWarning() {
        return this._contains(FIELD_CONTRACT_WARNING);
    }

    /**
     * 重置 「合同警告」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetContractWarning() {
        this._reset(FIELD_CONTRACT_WARNING);
        return this;
    }

    /**
     * 设置「合同统计」
     * @param val
     */
    @JsonProperty(FIELD_CONTRACTS_COUNT)
    public HrEmployeeDTO setContractsCount(Integer val) {
        this._set(FIELD_CONTRACTS_COUNT, val);
        return this;
    }

    /**
     * 获取「合同统计」值
     *
     */
    @JsonIgnore
    public Integer getContractsCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_CONTRACTS_COUNT), null);
    }

    /**
     * 判断 「合同统计」是否有值
     *
     */
    @JsonIgnore
    public boolean containsContractsCount() {
        return this._contains(FIELD_CONTRACTS_COUNT);
    }

    /**
     * 重置 「合同统计」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetContractsCount() {
        this._reset(FIELD_CONTRACTS_COUNT);
        return this;
    }

    /**
     * 设置「国籍(国家)」
     * @param val
     */
    @JsonProperty(FIELD_COUNTRY_ID)
    public HrEmployeeDTO setCountryId(String val) {
        this._set(FIELD_COUNTRY_ID, val);
        return this;
    }

    /**
     * 获取「国籍(国家)」值
     *
     */
    @JsonIgnore
    public String getCountryId() {
        return DataTypeUtils.asString(this._get(FIELD_COUNTRY_ID), null);
    }

    /**
     * 判断 「国籍(国家)」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCountryId() {
        return this._contains(FIELD_COUNTRY_ID);
    }

    /**
     * 重置 「国籍(国家)」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetCountryId() {
        this._reset(FIELD_COUNTRY_ID);
        return this;
    }

    /**
     * 设置「国籍(国家)」
     * @param val
     */
    @JsonProperty(FIELD_COUNTRY_NAME)
    public HrEmployeeDTO setCountryName(String val) {
        this._set(FIELD_COUNTRY_NAME, val);
        return this;
    }

    /**
     * 获取「国籍(国家)」值
     *
     */
    @JsonIgnore
    public String getCountryName() {
        return DataTypeUtils.asString(this._get(FIELD_COUNTRY_NAME), null);
    }

    /**
     * 判断 「国籍(国家)」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCountryName() {
        return this._contains(FIELD_COUNTRY_NAME);
    }

    /**
     * 重置 「国籍(国家)」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetCountryName() {
        this._reset(FIELD_COUNTRY_NAME);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public HrEmployeeDTO setCreateDate(Timestamp val) {
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
    public HrEmployeeDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public HrEmployeeDTO setCreateUid(String val) {
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
    public HrEmployeeDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「当前休假状态」
     * 代码表[当前休假状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.hr_employee_current_leave_state
     * @param val
     */
    @JsonProperty(FIELD_CURRENT_LEAVE_STATE)
    public HrEmployeeDTO setCurrentLeaveState(String val) {
        this._set(FIELD_CURRENT_LEAVE_STATE, val);
        return this;
    }

    /**
     * 获取「当前休假状态」值
     * 代码表[当前休假状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.hr_employee_current_leave_state
     *
     */
    @JsonIgnore
    public String getCurrentLeaveState() {
        return DataTypeUtils.asString(this._get(FIELD_CURRENT_LEAVE_STATE), null);
    }

    /**
     * 判断 「当前休假状态」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCurrentLeaveState() {
        return this._contains(FIELD_CURRENT_LEAVE_STATE);
    }

    /**
     * 重置 「当前休假状态」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetCurrentLeaveState() {
        this._reset(FIELD_CURRENT_LEAVE_STATE);
        return this;
    }

    /**
     * 设置「部门」
     * @param val
     */
    @JsonProperty(FIELD_DEPARTMENT_ID)
    public HrEmployeeDTO setDepartmentId(String val) {
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
    public HrEmployeeDTO resetDepartmentId() {
        this._reset(FIELD_DEPARTMENT_ID);
        return this;
    }

    /**
     * 设置「部门名称」
     * @param val
     */
    @JsonProperty(FIELD_DEPARTMENT_NAME)
    public HrEmployeeDTO setDepartmentName(String val) {
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
    public HrEmployeeDTO resetDepartmentName() {
        this._reset(FIELD_DEPARTMENT_NAME);
        return this;
    }

    /**
     * 设置「离职日期」
     * @param val
     */
    @JsonProperty(FIELD_DEPARTURE_DATE)
    public HrEmployeeDTO setDepartureDate(Timestamp val) {
        this._set(FIELD_DEPARTURE_DATE, val);
        return this;
    }

    /**
     * 获取「离职日期」值
     *
     */
    @JsonIgnore
    public Timestamp getDepartureDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_DEPARTURE_DATE), null);
    }

    /**
     * 判断 「离职日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDepartureDate() {
        return this._contains(FIELD_DEPARTURE_DATE);
    }

    /**
     * 重置 「离职日期」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetDepartureDate() {
        this._reset(FIELD_DEPARTURE_DATE);
        return this;
    }

    /**
     * 设置「其它信息」
     * @param val
     */
    @JsonProperty(FIELD_DEPARTURE_DESCRIPTION)
    public HrEmployeeDTO setDepartureDescription(String val) {
        this._set(FIELD_DEPARTURE_DESCRIPTION, val);
        return this;
    }

    /**
     * 获取「其它信息」值
     *
     */
    @JsonIgnore
    public String getDepartureDescription() {
        return DataTypeUtils.asString(this._get(FIELD_DEPARTURE_DESCRIPTION), null);
    }

    /**
     * 判断 「其它信息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDepartureDescription() {
        return this._contains(FIELD_DEPARTURE_DESCRIPTION);
    }

    /**
     * 重置 「其它信息」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetDepartureDescription() {
        this._reset(FIELD_DEPARTURE_DESCRIPTION);
        return this;
    }

    /**
     * 设置「离职原因」
     * @param val
     */
    @JsonProperty(FIELD_DEPARTURE_REASON_ID)
    public HrEmployeeDTO setDepartureReasonId(String val) {
        this._set(FIELD_DEPARTURE_REASON_ID, val);
        return this;
    }

    /**
     * 获取「离职原因」值
     *
     */
    @JsonIgnore
    public String getDepartureReasonId() {
        return DataTypeUtils.asString(this._get(FIELD_DEPARTURE_REASON_ID), null);
    }

    /**
     * 判断 「离职原因」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDepartureReasonId() {
        return this._contains(FIELD_DEPARTURE_REASON_ID);
    }

    /**
     * 重置 「离职原因」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetDepartureReasonId() {
        this._reset(FIELD_DEPARTURE_REASON_ID);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public HrEmployeeDTO setDisplayName(String val) {
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
    public HrEmployeeDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「通勤距离」
     * @param val
     */
    @JsonProperty(FIELD_DISTANCE_HOME_WORK)
    public HrEmployeeDTO setDistanceHomeWork(Integer val) {
        this._set(FIELD_DISTANCE_HOME_WORK, val);
        return this;
    }

    /**
     * 获取「通勤距离」值
     *
     */
    @JsonIgnore
    public Integer getDistanceHomeWork() {
        return DataTypeUtils.asInteger(this._get(FIELD_DISTANCE_HOME_WORK), null);
    }

    /**
     * 判断 「通勤距离」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDistanceHomeWork() {
        return this._contains(FIELD_DISTANCE_HOME_WORK);
    }

    /**
     * 重置 「通勤距离」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetDistanceHomeWork() {
        this._reset(FIELD_DISTANCE_HOME_WORK);
        return this;
    }

    /**
     * 设置「通勤距离（单位）」
     * 代码表[通勤距离（单位）]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.hr_employee_distance_home_work_unit
     * @param val
     */
    @JsonProperty(FIELD_DISTANCE_HOME_WORK_UNIT)
    public HrEmployeeDTO setDistanceHomeWorkUnit(String val) {
        this._set(FIELD_DISTANCE_HOME_WORK_UNIT, val);
        return this;
    }

    /**
     * 获取「通勤距离（单位）」值
     * 代码表[通勤距离（单位）]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.hr_employee_distance_home_work_unit
     *
     */
    @JsonIgnore
    public String getDistanceHomeWorkUnit() {
        return DataTypeUtils.asString(this._get(FIELD_DISTANCE_HOME_WORK_UNIT), null);
    }

    /**
     * 判断 「通勤距离（单位）」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDistanceHomeWorkUnit() {
        return this._contains(FIELD_DISTANCE_HOME_WORK_UNIT);
    }

    /**
     * 重置 「通勤距离（单位）」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetDistanceHomeWorkUnit() {
        this._reset(FIELD_DISTANCE_HOME_WORK_UNIT);
        return this;
    }

    /**
     * 设置「联系人姓名」
     * @param val
     */
    @JsonProperty(FIELD_EMERGENCY_CONTACT)
    public HrEmployeeDTO setEmergencyContact(String val) {
        this._set(FIELD_EMERGENCY_CONTACT, val);
        return this;
    }

    /**
     * 获取「联系人姓名」值
     *
     */
    @JsonIgnore
    public String getEmergencyContact() {
        return DataTypeUtils.asString(this._get(FIELD_EMERGENCY_CONTACT), null);
    }

    /**
     * 判断 「联系人姓名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEmergencyContact() {
        return this._contains(FIELD_EMERGENCY_CONTACT);
    }

    /**
     * 重置 「联系人姓名」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetEmergencyContact() {
        this._reset(FIELD_EMERGENCY_CONTACT);
        return this;
    }

    /**
     * 设置「电话」
     * @param val
     */
    @JsonProperty(FIELD_EMERGENCY_PHONE)
    public HrEmployeeDTO setEmergencyPhone(String val) {
        this._set(FIELD_EMERGENCY_PHONE, val);
        return this;
    }

    /**
     * 获取「电话」值
     *
     */
    @JsonIgnore
    public String getEmergencyPhone() {
        return DataTypeUtils.asString(this._get(FIELD_EMERGENCY_PHONE), null);
    }

    /**
     * 判断 「电话」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEmergencyPhone() {
        return this._contains(FIELD_EMERGENCY_PHONE);
    }

    /**
     * 重置 「电话」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetEmergencyPhone() {
        this._reset(FIELD_EMERGENCY_PHONE);
        return this;
    }

    /**
     * 设置「车辆」
     * @param val
     */
    @JsonProperty(FIELD_EMPLOYEE_CARS_COUNT)
    public HrEmployeeDTO setEmployeeCarsCount(Integer val) {
        this._set(FIELD_EMPLOYEE_CARS_COUNT, val);
        return this;
    }

    /**
     * 获取「车辆」值
     *
     */
    @JsonIgnore
    public Integer getEmployeeCarsCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_EMPLOYEE_CARS_COUNT), null);
    }

    /**
     * 判断 「车辆」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEmployeeCarsCount() {
        return this._contains(FIELD_EMPLOYEE_CARS_COUNT);
    }

    /**
     * 重置 「车辆」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetEmployeeCarsCount() {
        this._reset(FIELD_EMPLOYEE_CARS_COUNT);
        return this;
    }

    /**
     * 设置「员工类型」
     * 代码表[员工类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.hr_employee_employee_type
     * @param val
     */
    @JsonProperty(FIELD_EMPLOYEE_TYPE)
    public HrEmployeeDTO setEmployeeType(String val) {
        this._set(FIELD_EMPLOYEE_TYPE, val);
        return this;
    }

    /**
     * 获取「员工类型」值
     * 代码表[员工类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.hr_employee_employee_type
     *
     */
    @JsonIgnore
    public String getEmployeeType() {
        return DataTypeUtils.asString(this._get(FIELD_EMPLOYEE_TYPE), null);
    }

    /**
     * 判断 「员工类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEmployeeType() {
        return this._contains(FIELD_EMPLOYEE_TYPE);
    }

    /**
     * 重置 「员工类型」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetEmployeeType() {
        this._reset(FIELD_EMPLOYEE_TYPE);
        return this;
    }

    /**
     * 设置「设备数量」
     * @param val
     */
    @JsonProperty(FIELD_EQUIPMENT_COUNT)
    public HrEmployeeDTO setEquipmentCount(Integer val) {
        this._set(FIELD_EQUIPMENT_COUNT, val);
        return this;
    }

    /**
     * 获取「设备数量」值
     *
     */
    @JsonIgnore
    public Integer getEquipmentCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_EQUIPMENT_COUNT), null);
    }

    /**
     * 判断 「设备数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEquipmentCount() {
        return this._contains(FIELD_EQUIPMENT_COUNT);
    }

    /**
     * 重置 「设备数量」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetEquipmentCount() {
        this._reset(FIELD_EQUIPMENT_COUNT);
        return this;
    }

    /**
     * 设置「费用」
     * @param val
     */
    @JsonProperty(FIELD_EXPENSE_MANAGER_ID)
    public HrEmployeeDTO setExpenseManagerId(String val) {
        this._set(FIELD_EXPENSE_MANAGER_ID, val);
        return this;
    }

    /**
     * 获取「费用」值
     *
     */
    @JsonIgnore
    public String getExpenseManagerId() {
        return DataTypeUtils.asString(this._get(FIELD_EXPENSE_MANAGER_ID), null);
    }

    /**
     * 判断 「费用」是否有值
     *
     */
    @JsonIgnore
    public boolean containsExpenseManagerId() {
        return this._contains(FIELD_EXPENSE_MANAGER_ID);
    }

    /**
     * 重置 「费用」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetExpenseManagerId() {
        this._reset(FIELD_EXPENSE_MANAGER_ID);
        return this;
    }

    /**
     * 设置「费用筛选」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_FILTER_FOR_EXPENSE)
    public HrEmployeeDTO setFilterForExpense(Integer val) {
        this._set(FIELD_FILTER_FOR_EXPENSE, val);
        return this;
    }

    /**
     * 获取「费用筛选」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getFilterForExpense() {
        return DataTypeUtils.asInteger(this._get(FIELD_FILTER_FOR_EXPENSE), null);
    }

    /**
     * 判断 「费用筛选」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFilterForExpense() {
        return this._contains(FIELD_FILTER_FOR_EXPENSE);
    }

    /**
     * 重置 「费用筛选」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetFilterForExpense() {
        this._reset(FIELD_FILTER_FOR_EXPENSE);
        return this;
    }

    /**
     * 设置「首次合同日期」
     * @param val
     */
    @JsonProperty(FIELD_FIRST_CONTRACT_DATE)
    public HrEmployeeDTO setFirstContractDate(Timestamp val) {
        this._set(FIELD_FIRST_CONTRACT_DATE, val);
        return this;
    }

    /**
     * 获取「首次合同日期」值
     *
     */
    @JsonIgnore
    public Timestamp getFirstContractDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_FIRST_CONTRACT_DATE), null);
    }

    /**
     * 判断 「首次合同日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFirstContractDate() {
        return this._contains(FIELD_FIRST_CONTRACT_DATE);
    }

    /**
     * 重置 「首次合同日期」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetFirstContractDate() {
        this._reset(FIELD_FIRST_CONTRACT_DATE);
        return this;
    }

    /**
     * 设置「性别」
     * 代码表[性别]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.hr_employee_gender
     * @param val
     */
    @JsonProperty(FIELD_GENDER)
    public HrEmployeeDTO setGender(String val) {
        this._set(FIELD_GENDER, val);
        return this;
    }

    /**
     * 获取「性别」值
     * 代码表[性别]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.hr_employee_gender
     *
     */
    @JsonIgnore
    public String getGender() {
        return DataTypeUtils.asString(this._get(FIELD_GENDER), null);
    }

    /**
     * 判断 「性别」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGender() {
        return this._contains(FIELD_GENDER);
    }

    /**
     * 重置 「性别」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetGender() {
        this._reset(FIELD_GENDER);
        return this;
    }

    /**
     * 设置「有徽章」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_HAS_BADGES)
    public HrEmployeeDTO setHasBadges(Integer val) {
        this._set(FIELD_HAS_BADGES, val);
        return this;
    }

    /**
     * 获取「有徽章」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getHasBadges() {
        return DataTypeUtils.asInteger(this._get(FIELD_HAS_BADGES), null);
    }

    /**
     * 判断 「有徽章」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHasBadges() {
        return this._contains(FIELD_HAS_BADGES);
    }

    /**
     * 重置 「有徽章」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetHasBadges() {
        this._reset(FIELD_HAS_BADGES);
        return this;
    }

    /**
     * 设置「有消息」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_HAS_MESSAGE)
    public HrEmployeeDTO setHasMessage(Integer val) {
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
    public HrEmployeeDTO resetHasMessage() {
        this._reset(FIELD_HAS_MESSAGE);
        return this;
    }

    /**
     * 设置「小时上月」
     * @param val
     */
    @JsonProperty(FIELD_HOURS_LAST_MONTH)
    public HrEmployeeDTO setHoursLastMonth(Double val) {
        this._set(FIELD_HOURS_LAST_MONTH, val);
        return this;
    }

    /**
     * 获取「小时上月」值
     *
     */
    @JsonIgnore
    public Double getHoursLastMonth() {
        return DataTypeUtils.asDouble(this._get(FIELD_HOURS_LAST_MONTH), null);
    }

    /**
     * 判断 「小时上月」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHoursLastMonth() {
        return this._contains(FIELD_HOURS_LAST_MONTH);
    }

    /**
     * 重置 「小时上月」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetHoursLastMonth() {
        this._reset(FIELD_HOURS_LAST_MONTH);
        return this;
    }

    /**
     * 设置「小时上月显示」
     * @param val
     */
    @JsonProperty(FIELD_HOURS_LAST_MONTH_DISPLAY)
    public HrEmployeeDTO setHoursLastMonthDisplay(String val) {
        this._set(FIELD_HOURS_LAST_MONTH_DISPLAY, val);
        return this;
    }

    /**
     * 获取「小时上月显示」值
     *
     */
    @JsonIgnore
    public String getHoursLastMonthDisplay() {
        return DataTypeUtils.asString(this._get(FIELD_HOURS_LAST_MONTH_DISPLAY), null);
    }

    /**
     * 判断 「小时上月显示」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHoursLastMonthDisplay() {
        return this._contains(FIELD_HOURS_LAST_MONTH_DISPLAY);
    }

    /**
     * 重置 「小时上月显示」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetHoursLastMonthDisplay() {
        this._reset(FIELD_HOURS_LAST_MONTH_DISPLAY);
        return this;
    }

    /**
     * 设置「今天之前的小时数」
     * @param val
     */
    @JsonProperty(FIELD_HOURS_PREVIOUSLY_TODAY)
    public HrEmployeeDTO setHoursPreviouslyToday(Double val) {
        this._set(FIELD_HOURS_PREVIOUSLY_TODAY, val);
        return this;
    }

    /**
     * 获取「今天之前的小时数」值
     *
     */
    @JsonIgnore
    public Double getHoursPreviouslyToday() {
        return DataTypeUtils.asDouble(this._get(FIELD_HOURS_PREVIOUSLY_TODAY), null);
    }

    /**
     * 判断 「今天之前的小时数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHoursPreviouslyToday() {
        return this._contains(FIELD_HOURS_PREVIOUSLY_TODAY);
    }

    /**
     * 重置 「今天之前的小时数」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetHoursPreviouslyToday() {
        this._reset(FIELD_HOURS_PREVIOUSLY_TODAY);
        return this;
    }

    /**
     * 设置「小时今天」
     * @param val
     */
    @JsonProperty(FIELD_HOURS_TODAY)
    public HrEmployeeDTO setHoursToday(Double val) {
        this._set(FIELD_HOURS_TODAY, val);
        return this;
    }

    /**
     * 获取「小时今天」值
     *
     */
    @JsonIgnore
    public Double getHoursToday() {
        return DataTypeUtils.asDouble(this._get(FIELD_HOURS_TODAY), null);
    }

    /**
     * 判断 「小时今天」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHoursToday() {
        return this._contains(FIELD_HOURS_TODAY);
    }

    /**
     * 重置 「小时今天」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetHoursToday() {
        this._reset(FIELD_HOURS_TODAY);
        return this;
    }

    /**
     * 设置「人力资源显示的图标」
     * 代码表[人力资源显示的图标]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.hr_employee_hr_icon_display
     * @param val
     */
    @JsonProperty(FIELD_HR_ICON_DISPLAY)
    public HrEmployeeDTO setHrIconDisplay(String val) {
        this._set(FIELD_HR_ICON_DISPLAY, val);
        return this;
    }

    /**
     * 获取「人力资源显示的图标」值
     * 代码表[人力资源显示的图标]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.hr_employee_hr_icon_display
     *
     */
    @JsonIgnore
    public String getHrIconDisplay() {
        return DataTypeUtils.asString(this._get(FIELD_HR_ICON_DISPLAY), null);
    }

    /**
     * 判断 「人力资源显示的图标」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHrIconDisplay() {
        return this._contains(FIELD_HR_ICON_DISPLAY);
    }

    /**
     * 重置 「人力资源显示的图标」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetHrIconDisplay() {
        this._reset(FIELD_HR_ICON_DISPLAY);
        return this;
    }

    /**
     * 设置「人力资源出席状态」
     * 代码表[人力资源出席状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.hr_employee_hr_presence_state
     * @param val
     */
    @JsonProperty(FIELD_HR_PRESENCE_STATE)
    public HrEmployeeDTO setHrPresenceState(String val) {
        this._set(FIELD_HR_PRESENCE_STATE, val);
        return this;
    }

    /**
     * 获取「人力资源出席状态」值
     * 代码表[人力资源出席状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.hr_employee_hr_presence_state
     *
     */
    @JsonIgnore
    public String getHrPresenceState() {
        return DataTypeUtils.asString(this._get(FIELD_HR_PRESENCE_STATE), null);
    }

    /**
     * 判断 「人力资源出席状态」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHrPresenceState() {
        return this._contains(FIELD_HR_PRESENCE_STATE);
    }

    /**
     * 重置 「人力资源出席状态」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetHrPresenceState() {
        this._reset(FIELD_HR_PRESENCE_STATE);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public HrEmployeeDTO setId(String val) {
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
    public HrEmployeeDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「身份证号」
     * @param val
     */
    @JsonProperty(FIELD_IDENTIFICATION_ID)
    public HrEmployeeDTO setIdentificationId(String val) {
        this._set(FIELD_IDENTIFICATION_ID, val);
        return this;
    }

    /**
     * 获取「身份证号」值
     *
     */
    @JsonIgnore
    public String getIdentificationId() {
        return DataTypeUtils.asString(this._get(FIELD_IDENTIFICATION_ID), null);
    }

    /**
     * 判断 「身份证号」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIdentificationId() {
        return this._contains(FIELD_IDENTIFICATION_ID);
    }

    /**
     * 重置 「身份证号」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetIdentificationId() {
        this._reset(FIELD_IDENTIFICATION_ID);
        return this;
    }

    /**
     * 设置「今日缺勤」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_ABSENT)
    public HrEmployeeDTO setIsAbsent(Integer val) {
        this._set(FIELD_IS_ABSENT, val);
        return this;
    }

    /**
     * 获取「今日缺勤」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsAbsent() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_ABSENT), null);
    }

    /**
     * 判断 「今日缺勤」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsAbsent() {
        return this._contains(FIELD_IS_ABSENT);
    }

    /**
     * 重置 「今日缺勤」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetIsAbsent() {
        this._reset(FIELD_IS_ABSENT);
        return this;
    }

    /**
     * 设置「灵活可变」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_FLEXIBLE)
    public HrEmployeeDTO setIsFlexible(Integer val) {
        this._set(FIELD_IS_FLEXIBLE, val);
        return this;
    }

    /**
     * 获取「灵活可变」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsFlexible() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_FLEXIBLE), null);
    }

    /**
     * 判断 「灵活可变」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsFlexible() {
        return this._contains(FIELD_IS_FLEXIBLE);
    }

    /**
     * 重置 「灵活可变」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetIsFlexible() {
        this._reset(FIELD_IS_FLEXIBLE);
        return this;
    }

    /**
     * 设置「完全灵活」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_FULLY_FLEXIBLE)
    public HrEmployeeDTO setIsFullyFlexible(Integer val) {
        this._set(FIELD_IS_FULLY_FLEXIBLE, val);
        return this;
    }

    /**
     * 获取「完全灵活」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsFullyFlexible() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_FULLY_FLEXIBLE), null);
    }

    /**
     * 判断 「完全灵活」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsFullyFlexible() {
        return this._contains(FIELD_IS_FULLY_FLEXIBLE);
    }

    /**
     * 重置 「完全灵活」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetIsFullyFlexible() {
        this._reset(FIELD_IS_FULLY_FLEXIBLE);
        return this;
    }

    /**
     * 设置「是下属」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_SUBORDINATE)
    public HrEmployeeDTO setIsSubordinate(Integer val) {
        this._set(FIELD_IS_SUBORDINATE, val);
        return this;
    }

    /**
     * 获取「是下属」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsSubordinate() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_SUBORDINATE), null);
    }

    /**
     * 判断 「是下属」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsSubordinate() {
        return this._contains(FIELD_IS_SUBORDINATE);
    }

    /**
     * 重置 「是下属」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetIsSubordinate() {
        this._reset(FIELD_IS_SUBORDINATE);
        return this;
    }

    /**
     * 设置「工作岗位」
     * @param val
     */
    @JsonProperty(FIELD_JOB_ID)
    public HrEmployeeDTO setJobId(String val) {
        this._set(FIELD_JOB_ID, val);
        return this;
    }

    /**
     * 获取「工作岗位」值
     *
     */
    @JsonIgnore
    public String getJobId() {
        return DataTypeUtils.asString(this._get(FIELD_JOB_ID), null);
    }

    /**
     * 判断 「工作岗位」是否有值
     *
     */
    @JsonIgnore
    public boolean containsJobId() {
        return this._contains(FIELD_JOB_ID);
    }

    /**
     * 重置 「工作岗位」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetJobId() {
        this._reset(FIELD_JOB_ID);
        return this;
    }

    /**
     * 设置「工作岗位」
     * @param val
     */
    @JsonProperty(FIELD_JOB_NAME)
    public HrEmployeeDTO setJobName(String val) {
        this._set(FIELD_JOB_NAME, val);
        return this;
    }

    /**
     * 获取「工作岗位」值
     *
     */
    @JsonIgnore
    public String getJobName() {
        return DataTypeUtils.asString(this._get(FIELD_JOB_NAME), null);
    }

    /**
     * 判断 「工作岗位」是否有值
     *
     */
    @JsonIgnore
    public boolean containsJobName() {
        return this._contains(FIELD_JOB_NAME);
    }

    /**
     * 重置 「工作岗位」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetJobName() {
        this._reset(FIELD_JOB_NAME);
        return this;
    }

    /**
     * 设置「工作头衔」
     * @param val
     */
    @JsonProperty(FIELD_JOB_TITLE)
    public HrEmployeeDTO setJobTitle(String val) {
        this._set(FIELD_JOB_TITLE, val);
        return this;
    }

    /**
     * 获取「工作头衔」值
     *
     */
    @JsonIgnore
    public String getJobTitle() {
        return DataTypeUtils.asString(this._get(FIELD_JOB_TITLE), null);
    }

    /**
     * 判断 「工作头衔」是否有值
     *
     */
    @JsonIgnore
    public boolean containsJobTitle() {
        return this._contains(FIELD_JOB_TITLE);
    }

    /**
     * 重置 「工作头衔」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetJobTitle() {
        this._reset(FIELD_JOB_TITLE);
        return this;
    }

    /**
     * 设置「通勤距离（公里）」
     * @param val
     */
    @JsonProperty(FIELD_KM_HOME_WORK)
    public HrEmployeeDTO setKmHomeWork(Integer val) {
        this._set(FIELD_KM_HOME_WORK, val);
        return this;
    }

    /**
     * 获取「通勤距离（公里）」值
     *
     */
    @JsonIgnore
    public Integer getKmHomeWork() {
        return DataTypeUtils.asInteger(this._get(FIELD_KM_HOME_WORK), null);
    }

    /**
     * 判断 「通勤距离（公里）」是否有值
     *
     */
    @JsonIgnore
    public boolean containsKmHomeWork() {
        return this._contains(FIELD_KM_HOME_WORK);
    }

    /**
     * 重置 「通勤距离（公里）」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetKmHomeWork() {
        this._reset(FIELD_KM_HOME_WORK);
        return this;
    }

    /**
     * 设置「上个活动」
     * @param val
     */
    @JsonProperty(FIELD_LAST_ACTIVITY)
    public HrEmployeeDTO setLastActivity(Timestamp val) {
        this._set(FIELD_LAST_ACTIVITY, val);
        return this;
    }

    /**
     * 获取「上个活动」值
     *
     */
    @JsonIgnore
    public Timestamp getLastActivity() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_LAST_ACTIVITY), null);
    }

    /**
     * 判断 「上个活动」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLastActivity() {
        return this._contains(FIELD_LAST_ACTIVITY);
    }

    /**
     * 重置 「上个活动」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetLastActivity() {
        this._reset(FIELD_LAST_ACTIVITY);
        return this;
    }

    /**
     * 设置「上个活动时间」
     * @param val
     */
    @JsonProperty(FIELD_LAST_ACTIVITY_TIME)
    public HrEmployeeDTO setLastActivityTime(String val) {
        this._set(FIELD_LAST_ACTIVITY_TIME, val);
        return this;
    }

    /**
     * 获取「上个活动时间」值
     *
     */
    @JsonIgnore
    public String getLastActivityTime() {
        return DataTypeUtils.asString(this._get(FIELD_LAST_ACTIVITY_TIME), null);
    }

    /**
     * 判断 「上个活动时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLastActivityTime() {
        return this._contains(FIELD_LAST_ACTIVITY_TIME);
    }

    /**
     * 重置 「上个活动时间」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetLastActivityTime() {
        this._reset(FIELD_LAST_ACTIVITY_TIME);
        return this;
    }

    /**
     * 设置「上次出勤」
     * @param val
     */
    @JsonProperty(FIELD_LAST_ATTENDANCE_ID)
    public HrEmployeeDTO setLastAttendanceId(String val) {
        this._set(FIELD_LAST_ATTENDANCE_ID, val);
        return this;
    }

    /**
     * 获取「上次出勤」值
     *
     */
    @JsonIgnore
    public String getLastAttendanceId() {
        return DataTypeUtils.asString(this._get(FIELD_LAST_ATTENDANCE_ID), null);
    }

    /**
     * 判断 「上次出勤」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLastAttendanceId() {
        return this._contains(FIELD_LAST_ATTENDANCE_ID);
    }

    /**
     * 重置 「上次出勤」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetLastAttendanceId() {
        this._reset(FIELD_LAST_ATTENDANCE_ID);
        return this;
    }

    /**
     * 设置「最后一次出勤 工作时数」
     * @param val
     */
    @JsonProperty(FIELD_LAST_ATTENDANCE_WORKED_HOURS)
    public HrEmployeeDTO setLastAttendanceWorkedHours(Double val) {
        this._set(FIELD_LAST_ATTENDANCE_WORKED_HOURS, val);
        return this;
    }

    /**
     * 获取「最后一次出勤 工作时数」值
     *
     */
    @JsonIgnore
    public Double getLastAttendanceWorkedHours() {
        return DataTypeUtils.asDouble(this._get(FIELD_LAST_ATTENDANCE_WORKED_HOURS), null);
    }

    /**
     * 判断 「最后一次出勤 工作时数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLastAttendanceWorkedHours() {
        return this._contains(FIELD_LAST_ATTENDANCE_WORKED_HOURS);
    }

    /**
     * 重置 「最后一次出勤 工作时数」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetLastAttendanceWorkedHours() {
        this._reset(FIELD_LAST_ATTENDANCE_WORKED_HOURS);
        return this;
    }

    /**
     * 设置「起始日期」
     * @param val
     */
    @JsonProperty(FIELD_LEAVE_DATE_FROM)
    public HrEmployeeDTO setLeaveDateFrom(Timestamp val) {
        this._set(FIELD_LEAVE_DATE_FROM, val);
        return this;
    }

    /**
     * 获取「起始日期」值
     *
     */
    @JsonIgnore
    public Timestamp getLeaveDateFrom() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_LEAVE_DATE_FROM), null);
    }

    /**
     * 判断 「起始日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLeaveDateFrom() {
        return this._contains(FIELD_LEAVE_DATE_FROM);
    }

    /**
     * 重置 「起始日期」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetLeaveDateFrom() {
        this._reset(FIELD_LEAVE_DATE_FROM);
        return this;
    }

    /**
     * 设置「至日期」
     * @param val
     */
    @JsonProperty(FIELD_LEAVE_DATE_TO)
    public HrEmployeeDTO setLeaveDateTo(Timestamp val) {
        this._set(FIELD_LEAVE_DATE_TO, val);
        return this;
    }

    /**
     * 获取「至日期」值
     *
     */
    @JsonIgnore
    public Timestamp getLeaveDateTo() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_LEAVE_DATE_TO), null);
    }

    /**
     * 判断 「至日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLeaveDateTo() {
        return this._contains(FIELD_LEAVE_DATE_TO);
    }

    /**
     * 重置 「至日期」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetLeaveDateTo() {
        this._reset(FIELD_LEAVE_DATE_TO);
        return this;
    }

    /**
     * 设置「休假」
     * @param val
     */
    @JsonProperty(FIELD_LEAVE_MANAGER_ID)
    public HrEmployeeDTO setLeaveManagerId(String val) {
        this._set(FIELD_LEAVE_MANAGER_ID, val);
        return this;
    }

    /**
     * 获取「休假」值
     *
     */
    @JsonIgnore
    public String getLeaveManagerId() {
        return DataTypeUtils.asString(this._get(FIELD_LEAVE_MANAGER_ID), null);
    }

    /**
     * 判断 「休假」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLeaveManagerId() {
        return this._contains(FIELD_LEAVE_MANAGER_ID);
    }

    /**
     * 重置 「休假」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetLeaveManagerId() {
        this._reset(FIELD_LEAVE_MANAGER_ID);
        return this;
    }

    /**
     * 设置「休假」
     * @param val
     */
    @JsonProperty(FIELD_LEAVE_MANAGER_NAME)
    public HrEmployeeDTO setLeaveManagerName(String val) {
        this._set(FIELD_LEAVE_MANAGER_NAME, val);
        return this;
    }

    /**
     * 获取「休假」值
     *
     */
    @JsonIgnore
    public String getLeaveManagerName() {
        return DataTypeUtils.asString(this._get(FIELD_LEAVE_MANAGER_NAME), null);
    }

    /**
     * 判断 「休假」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLeaveManagerName() {
        return this._contains(FIELD_LEAVE_MANAGER_NAME);
    }

    /**
     * 重置 「休假」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetLeaveManagerName() {
        this._reset(FIELD_LEAVE_MANAGER_NAME);
        return this;
    }

    /**
     * 设置「休假次数」
     * @param val
     */
    @JsonProperty(FIELD_LEAVES_COUNT)
    public HrEmployeeDTO setLeavesCount(Double val) {
        this._set(FIELD_LEAVES_COUNT, val);
        return this;
    }

    /**
     * 获取「休假次数」值
     *
     */
    @JsonIgnore
    public Double getLeavesCount() {
        return DataTypeUtils.asDouble(this._get(FIELD_LEAVES_COUNT), null);
    }

    /**
     * 判断 「休假次数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLeavesCount() {
        return this._contains(FIELD_LEAVES_COUNT);
    }

    /**
     * 重置 「休假次数」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetLeavesCount() {
        this._reset(FIELD_LEAVES_COUNT);
        return this;
    }

    /**
     * 设置「法定名称」
     * @param val
     */
    @JsonProperty(FIELD_LEGAL_NAME)
    public HrEmployeeDTO setLegalName(String val) {
        this._set(FIELD_LEGAL_NAME, val);
        return this;
    }

    /**
     * 获取「法定名称」值
     *
     */
    @JsonIgnore
    public String getLegalName() {
        return DataTypeUtils.asString(this._get(FIELD_LEGAL_NAME), null);
    }

    /**
     * 判断 「法定名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLegalName() {
        return this._contains(FIELD_LEGAL_NAME);
    }

    /**
     * 重置 「法定名称」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetLegalName() {
        this._reset(FIELD_LEGAL_NAME);
        return this;
    }

    /**
     * 设置「车辆牌照」
     * @param val
     */
    @JsonProperty(FIELD_LICENSE_PLATE)
    public HrEmployeeDTO setLicensePlate(String val) {
        this._set(FIELD_LICENSE_PLATE, val);
        return this;
    }

    /**
     * 获取「车辆牌照」值
     *
     */
    @JsonIgnore
    public String getLicensePlate() {
        return DataTypeUtils.asString(this._get(FIELD_LICENSE_PLATE), null);
    }

    /**
     * 判断 「车辆牌照」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLicensePlate() {
        return this._contains(FIELD_LICENSE_PLATE);
    }

    /**
     * 重置 「车辆牌照」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetLicensePlate() {
        this._reset(FIELD_LICENSE_PLATE);
        return this;
    }

    /**
     * 设置「部门数量」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MEMBER_OF_DEPARTMENT)
    public HrEmployeeDTO setMemberOfDepartment(Integer val) {
        this._set(FIELD_MEMBER_OF_DEPARTMENT, val);
        return this;
    }

    /**
     * 获取「部门数量」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getMemberOfDepartment() {
        return DataTypeUtils.asInteger(this._get(FIELD_MEMBER_OF_DEPARTMENT), null);
    }

    /**
     * 判断 「部门数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMemberOfDepartment() {
        return this._contains(FIELD_MEMBER_OF_DEPARTMENT);
    }

    /**
     * 重置 「部门数量」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetMemberOfDepartment() {
        this._reset(FIELD_MEMBER_OF_DEPARTMENT);
        return this;
    }

    /**
     * 设置「附件数量」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_ATTACHMENT_COUNT)
    public HrEmployeeDTO setMessageAttachmentCount(Integer val) {
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
    public HrEmployeeDTO resetMessageAttachmentCount() {
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
    public HrEmployeeDTO setMessageHasError(Integer val) {
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
    public HrEmployeeDTO resetMessageHasError() {
        this._reset(FIELD_MESSAGE_HAS_ERROR);
        return this;
    }

    /**
     * 设置「错误数量」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_HAS_ERROR_COUNTER)
    public HrEmployeeDTO setMessageHasErrorCounter(Integer val) {
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
    public HrEmployeeDTO resetMessageHasErrorCounter() {
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
    public HrEmployeeDTO setMessageHasSmsError(Integer val) {
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
    public HrEmployeeDTO resetMessageHasSmsError() {
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
    public HrEmployeeDTO setMessageIsFollower(Integer val) {
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
    public HrEmployeeDTO resetMessageIsFollower() {
        this._reset(FIELD_MESSAGE_IS_FOLLOWER);
        return this;
    }

    /**
     * 设置「主要附件」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_MAIN_ATTACHMENT_ID)
    public HrEmployeeDTO setMessageMainAttachmentId(String val) {
        this._set(FIELD_MESSAGE_MAIN_ATTACHMENT_ID, val);
        return this;
    }

    /**
     * 获取「主要附件」值
     *
     */
    @JsonIgnore
    public String getMessageMainAttachmentId() {
        return DataTypeUtils.asString(this._get(FIELD_MESSAGE_MAIN_ATTACHMENT_ID), null);
    }

    /**
     * 判断 「主要附件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageMainAttachmentId() {
        return this._contains(FIELD_MESSAGE_MAIN_ATTACHMENT_ID);
    }

    /**
     * 重置 「主要附件」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetMessageMainAttachmentId() {
        this._reset(FIELD_MESSAGE_MAIN_ATTACHMENT_ID);
        return this;
    }

    /**
     * 设置「所需操作」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_NEEDACTION)
    public HrEmployeeDTO setMessageNeedaction(Integer val) {
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
    public HrEmployeeDTO resetMessageNeedaction() {
        this._reset(FIELD_MESSAGE_NEEDACTION);
        return this;
    }

    /**
     * 设置「操作数量」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_NEEDACTION_COUNTER)
    public HrEmployeeDTO setMessageNeedactionCounter(Integer val) {
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
    public HrEmployeeDTO resetMessageNeedactionCounter() {
        this._reset(FIELD_MESSAGE_NEEDACTION_COUNTER);
        return this;
    }

    /**
     * 设置「办公手机」
     * @param val
     */
    @JsonProperty(FIELD_MOBILE_PHONE)
    public HrEmployeeDTO setMobilePhone(String val) {
        this._set(FIELD_MOBILE_PHONE, val);
        return this;
    }

    /**
     * 获取「办公手机」值
     *
     */
    @JsonIgnore
    public String getMobilePhone() {
        return DataTypeUtils.asString(this._get(FIELD_MOBILE_PHONE), null);
    }

    /**
     * 判断 「办公手机」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMobilePhone() {
        return this._contains(FIELD_MOBILE_PHONE);
    }

    /**
     * 重置 「办公手机」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetMobilePhone() {
        this._reset(FIELD_MOBILE_PHONE);
        return this;
    }

    /**
     * 设置「调动卡」
     * @param val
     */
    @JsonProperty(FIELD_MOBILITY_CARD)
    public HrEmployeeDTO setMobilityCard(String val) {
        this._set(FIELD_MOBILITY_CARD, val);
        return this;
    }

    /**
     * 获取「调动卡」值
     *
     */
    @JsonIgnore
    public String getMobilityCard() {
        return DataTypeUtils.asString(this._get(FIELD_MOBILITY_CARD), null);
    }

    /**
     * 判断 「调动卡」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMobilityCard() {
        return this._contains(FIELD_MOBILITY_CARD);
    }

    /**
     * 重置 「调动卡」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetMobilityCard() {
        this._reset(FIELD_MOBILITY_CARD);
        return this;
    }

    /**
     * 设置「我的活动截止时间」
     * @param val
     */
    @JsonProperty(FIELD_MY_ACTIVITY_DATE_DEADLINE)
    public HrEmployeeDTO setMyActivityDateDeadline(Timestamp val) {
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
    public HrEmployeeDTO resetMyActivityDateDeadline() {
        this._reset(FIELD_MY_ACTIVITY_DATE_DEADLINE);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public HrEmployeeDTO setName(String val) {
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
    public HrEmployeeDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「最近聘用的」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_NEWLY_HIRED)
    public HrEmployeeDTO setNewlyHired(Integer val) {
        this._set(FIELD_NEWLY_HIRED, val);
        return this;
    }

    /**
     * 获取「最近聘用的」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getNewlyHired() {
        return DataTypeUtils.asInteger(this._get(FIELD_NEWLY_HIRED), null);
    }

    /**
     * 判断 「最近聘用的」是否有值
     *
     */
    @JsonIgnore
    public boolean containsNewlyHired() {
        return this._contains(FIELD_NEWLY_HIRED);
    }

    /**
     * 重置 「最近聘用的」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetNewlyHired() {
        this._reset(FIELD_NEWLY_HIRED);
        return this;
    }

    /**
     * 设置「备注」
     * @param val
     */
    @JsonProperty(FIELD_NOTES)
    public HrEmployeeDTO setNotes(String val) {
        this._set(FIELD_NOTES, val);
        return this;
    }

    /**
     * 获取「备注」值
     *
     */
    @JsonIgnore
    public String getNotes() {
        return DataTypeUtils.asString(this._get(FIELD_NOTES), null);
    }

    /**
     * 判断 「备注」是否有值
     *
     */
    @JsonIgnore
    public boolean containsNotes() {
        return this._contains(FIELD_NOTES);
    }

    /**
     * 重置 「备注」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetNotes() {
        this._reset(FIELD_NOTES);
        return this;
    }

    /**
     * 设置「管理员标识」
     * @param val
     */
    @JsonProperty(FIELD_PARENT_ID)
    public HrEmployeeDTO setParentId(String val) {
        this._set(FIELD_PARENT_ID, val);
        return this;
    }

    /**
     * 获取「管理员标识」值
     *
     */
    @JsonIgnore
    public String getParentId() {
        return DataTypeUtils.asString(this._get(FIELD_PARENT_ID), null);
    }

    /**
     * 判断 「管理员标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsParentId() {
        return this._contains(FIELD_PARENT_ID);
    }

    /**
     * 重置 「管理员标识」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetParentId() {
        this._reset(FIELD_PARENT_ID);
        return this;
    }

    /**
     * 设置「管理员」
     * @param val
     */
    @JsonProperty(FIELD_PARENT_NAME)
    public HrEmployeeDTO setParentName(String val) {
        this._set(FIELD_PARENT_NAME, val);
        return this;
    }

    /**
     * 获取「管理员」值
     *
     */
    @JsonIgnore
    public String getParentName() {
        return DataTypeUtils.asString(this._get(FIELD_PARENT_NAME), null);
    }

    /**
     * 判断 「管理员」是否有值
     *
     */
    @JsonIgnore
    public boolean containsParentName() {
        return this._contains(FIELD_PARENT_NAME);
    }

    /**
     * 重置 「管理员」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetParentName() {
        this._reset(FIELD_PARENT_NAME);
        return this;
    }

    /**
     * 设置「护照号」
     * @param val
     */
    @JsonProperty(FIELD_PASSPORT_ID)
    public HrEmployeeDTO setPassportId(String val) {
        this._set(FIELD_PASSPORT_ID, val);
        return this;
    }

    /**
     * 获取「护照号」值
     *
     */
    @JsonIgnore
    public String getPassportId() {
        return DataTypeUtils.asString(this._get(FIELD_PASSPORT_ID), null);
    }

    /**
     * 判断 「护照号」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPassportId() {
        return this._contains(FIELD_PASSPORT_ID);
    }

    /**
     * 重置 「护照号」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetPassportId() {
        this._reset(FIELD_PASSPORT_ID);
        return this;
    }

    /**
     * 设置「工作证编号」
     * @param val
     */
    @JsonProperty(FIELD_PERMIT_NO)
    public HrEmployeeDTO setPermitNo(String val) {
        this._set(FIELD_PERMIT_NO, val);
        return this;
    }

    /**
     * 获取「工作证编号」值
     *
     */
    @JsonIgnore
    public String getPermitNo() {
        return DataTypeUtils.asString(this._get(FIELD_PERMIT_NO), null);
    }

    /**
     * 判断 「工作证编号」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPermitNo() {
        return this._contains(FIELD_PERMIT_NO);
    }

    /**
     * 重置 「工作证编号」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetPermitNo() {
        this._reset(FIELD_PERMIT_NO);
        return this;
    }

    /**
     * 设置「PIN」
     * @param val
     */
    @JsonProperty(FIELD_PIN)
    public HrEmployeeDTO setPin(String val) {
        this._set(FIELD_PIN, val);
        return this;
    }

    /**
     * 获取「PIN」值
     *
     */
    @JsonIgnore
    public String getPin() {
        return DataTypeUtils.asString(this._get(FIELD_PIN), null);
    }

    /**
     * 判断 「PIN」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPin() {
        return this._contains(FIELD_PIN);
    }

    /**
     * 重置 「PIN」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetPin() {
        this._reset(FIELD_PIN);
        return this;
    }

    /**
     * 设置「出生地」
     * @param val
     */
    @JsonProperty(FIELD_PLACE_OF_BIRTH)
    public HrEmployeeDTO setPlaceOfBirth(String val) {
        this._set(FIELD_PLACE_OF_BIRTH, val);
        return this;
    }

    /**
     * 获取「出生地」值
     *
     */
    @JsonIgnore
    public String getPlaceOfBirth() {
        return DataTypeUtils.asString(this._get(FIELD_PLACE_OF_BIRTH), null);
    }

    /**
     * 判断 「出生地」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPlaceOfBirth() {
        return this._contains(FIELD_PLACE_OF_BIRTH);
    }

    /**
     * 重置 「出生地」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetPlaceOfBirth() {
        this._reset(FIELD_PLACE_OF_BIRTH);
        return this;
    }

    /**
     * 设置「私人车辆车牌」
     * @param val
     */
    @JsonProperty(FIELD_PRIVATE_CAR_PLATE)
    public HrEmployeeDTO setPrivateCarPlate(String val) {
        this._set(FIELD_PRIVATE_CAR_PLATE, val);
        return this;
    }

    /**
     * 获取「私人车辆车牌」值
     *
     */
    @JsonIgnore
    public String getPrivateCarPlate() {
        return DataTypeUtils.asString(this._get(FIELD_PRIVATE_CAR_PLATE), null);
    }

    /**
     * 判断 「私人车辆车牌」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPrivateCarPlate() {
        return this._contains(FIELD_PRIVATE_CAR_PLATE);
    }

    /**
     * 重置 「私人车辆车牌」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetPrivateCarPlate() {
        this._reset(FIELD_PRIVATE_CAR_PLATE);
        return this;
    }

    /**
     * 设置「城市」
     * @param val
     */
    @JsonProperty(FIELD_PRIVATE_CITY)
    public HrEmployeeDTO setPrivateCity(String val) {
        this._set(FIELD_PRIVATE_CITY, val);
        return this;
    }

    /**
     * 获取「城市」值
     *
     */
    @JsonIgnore
    public String getPrivateCity() {
        return DataTypeUtils.asString(this._get(FIELD_PRIVATE_CITY), null);
    }

    /**
     * 判断 「城市」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPrivateCity() {
        return this._contains(FIELD_PRIVATE_CITY);
    }

    /**
     * 重置 「城市」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetPrivateCity() {
        this._reset(FIELD_PRIVATE_CITY);
        return this;
    }

    /**
     * 设置「国家」
     * @param val
     */
    @JsonProperty(FIELD_PRIVATE_COUNTRY_ID)
    public HrEmployeeDTO setPrivateCountryId(String val) {
        this._set(FIELD_PRIVATE_COUNTRY_ID, val);
        return this;
    }

    /**
     * 获取「国家」值
     *
     */
    @JsonIgnore
    public String getPrivateCountryId() {
        return DataTypeUtils.asString(this._get(FIELD_PRIVATE_COUNTRY_ID), null);
    }

    /**
     * 判断 「国家」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPrivateCountryId() {
        return this._contains(FIELD_PRIVATE_COUNTRY_ID);
    }

    /**
     * 重置 「国家」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetPrivateCountryId() {
        this._reset(FIELD_PRIVATE_COUNTRY_ID);
        return this;
    }

    /**
     * 设置「国家」
     * @param val
     */
    @JsonProperty(FIELD_PRIVATE_COUNTRY_NAME)
    public HrEmployeeDTO setPrivateCountryName(String val) {
        this._set(FIELD_PRIVATE_COUNTRY_NAME, val);
        return this;
    }

    /**
     * 获取「国家」值
     *
     */
    @JsonIgnore
    public String getPrivateCountryName() {
        return DataTypeUtils.asString(this._get(FIELD_PRIVATE_COUNTRY_NAME), null);
    }

    /**
     * 判断 「国家」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPrivateCountryName() {
        return this._contains(FIELD_PRIVATE_COUNTRY_NAME);
    }

    /**
     * 重置 「国家」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetPrivateCountryName() {
        this._reset(FIELD_PRIVATE_COUNTRY_NAME);
        return this;
    }

    /**
     * 设置「私人电子邮箱」
     * @param val
     */
    @JsonProperty(FIELD_PRIVATE_EMAIL)
    public HrEmployeeDTO setPrivateEmail(String val) {
        this._set(FIELD_PRIVATE_EMAIL, val);
        return this;
    }

    /**
     * 获取「私人电子邮箱」值
     *
     */
    @JsonIgnore
    public String getPrivateEmail() {
        return DataTypeUtils.asString(this._get(FIELD_PRIVATE_EMAIL), null);
    }

    /**
     * 判断 「私人电子邮箱」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPrivateEmail() {
        return this._contains(FIELD_PRIVATE_EMAIL);
    }

    /**
     * 重置 「私人电子邮箱」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetPrivateEmail() {
        this._reset(FIELD_PRIVATE_EMAIL);
        return this;
    }

    /**
     * 设置「私人电话」
     * @param val
     */
    @JsonProperty(FIELD_PRIVATE_PHONE)
    public HrEmployeeDTO setPrivatePhone(String val) {
        this._set(FIELD_PRIVATE_PHONE, val);
        return this;
    }

    /**
     * 获取「私人电话」值
     *
     */
    @JsonIgnore
    public String getPrivatePhone() {
        return DataTypeUtils.asString(this._get(FIELD_PRIVATE_PHONE), null);
    }

    /**
     * 判断 「私人电话」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPrivatePhone() {
        return this._contains(FIELD_PRIVATE_PHONE);
    }

    /**
     * 重置 「私人电话」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetPrivatePhone() {
        this._reset(FIELD_PRIVATE_PHONE);
        return this;
    }

    /**
     * 设置「私人省/州」
     * @param val
     */
    @JsonProperty(FIELD_PRIVATE_STATE_ID)
    public HrEmployeeDTO setPrivateStateId(String val) {
        this._set(FIELD_PRIVATE_STATE_ID, val);
        return this;
    }

    /**
     * 获取「私人省/州」值
     *
     */
    @JsonIgnore
    public String getPrivateStateId() {
        return DataTypeUtils.asString(this._get(FIELD_PRIVATE_STATE_ID), null);
    }

    /**
     * 判断 「私人省/州」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPrivateStateId() {
        return this._contains(FIELD_PRIVATE_STATE_ID);
    }

    /**
     * 重置 「私人省/州」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetPrivateStateId() {
        this._reset(FIELD_PRIVATE_STATE_ID);
        return this;
    }

    /**
     * 设置「私人省/州」
     * @param val
     */
    @JsonProperty(FIELD_PRIVATE_STATE_NAME)
    public HrEmployeeDTO setPrivateStateName(String val) {
        this._set(FIELD_PRIVATE_STATE_NAME, val);
        return this;
    }

    /**
     * 获取「私人省/州」值
     *
     */
    @JsonIgnore
    public String getPrivateStateName() {
        return DataTypeUtils.asString(this._get(FIELD_PRIVATE_STATE_NAME), null);
    }

    /**
     * 判断 「私人省/州」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPrivateStateName() {
        return this._contains(FIELD_PRIVATE_STATE_NAME);
    }

    /**
     * 重置 「私人省/州」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetPrivateStateName() {
        this._reset(FIELD_PRIVATE_STATE_NAME);
        return this;
    }

    /**
     * 设置「街道」
     * @param val
     */
    @JsonProperty(FIELD_PRIVATE_STREET)
    public HrEmployeeDTO setPrivateStreet(String val) {
        this._set(FIELD_PRIVATE_STREET, val);
        return this;
    }

    /**
     * 获取「街道」值
     *
     */
    @JsonIgnore
    public String getPrivateStreet() {
        return DataTypeUtils.asString(this._get(FIELD_PRIVATE_STREET), null);
    }

    /**
     * 判断 「街道」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPrivateStreet() {
        return this._contains(FIELD_PRIVATE_STREET);
    }

    /**
     * 重置 「街道」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetPrivateStreet() {
        this._reset(FIELD_PRIVATE_STREET);
        return this;
    }

    /**
     * 设置「街道2」
     * @param val
     */
    @JsonProperty(FIELD_PRIVATE_STREET2)
    public HrEmployeeDTO setPrivateStreet2(String val) {
        this._set(FIELD_PRIVATE_STREET2, val);
        return this;
    }

    /**
     * 获取「街道2」值
     *
     */
    @JsonIgnore
    public String getPrivateStreet2() {
        return DataTypeUtils.asString(this._get(FIELD_PRIVATE_STREET2), null);
    }

    /**
     * 判断 「街道2」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPrivateStreet2() {
        return this._contains(FIELD_PRIVATE_STREET2);
    }

    /**
     * 重置 「街道2」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetPrivateStreet2() {
        this._reset(FIELD_PRIVATE_STREET2);
        return this;
    }

    /**
     * 设置「邮编」
     * @param val
     */
    @JsonProperty(FIELD_PRIVATE_ZIP)
    public HrEmployeeDTO setPrivateZip(String val) {
        this._set(FIELD_PRIVATE_ZIP, val);
        return this;
    }

    /**
     * 获取「邮编」值
     *
     */
    @JsonIgnore
    public String getPrivateZip() {
        return DataTypeUtils.asString(this._get(FIELD_PRIVATE_ZIP), null);
    }

    /**
     * 判断 「邮编」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPrivateZip() {
        return this._contains(FIELD_PRIVATE_ZIP);
    }

    /**
     * 重置 「邮编」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetPrivateZip() {
        this._reset(FIELD_PRIVATE_ZIP);
        return this;
    }

    /**
     * 设置「相关合作伙伴数量」
     * @param val
     */
    @JsonProperty(FIELD_RELATED_PARTNERS_COUNT)
    public HrEmployeeDTO setRelatedPartnersCount(Integer val) {
        this._set(FIELD_RELATED_PARTNERS_COUNT, val);
        return this;
    }

    /**
     * 获取「相关合作伙伴数量」值
     *
     */
    @JsonIgnore
    public Integer getRelatedPartnersCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_RELATED_PARTNERS_COUNT), null);
    }

    /**
     * 判断 「相关合作伙伴数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRelatedPartnersCount() {
        return this._contains(FIELD_RELATED_PARTNERS_COUNT);
    }

    /**
     * 重置 「相关合作伙伴数量」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetRelatedPartnersCount() {
        this._reset(FIELD_RELATED_PARTNERS_COUNT);
        return this;
    }

    /**
     * 设置「可用休假天数」
     * @param val
     */
    @JsonProperty(FIELD_REMAINING_LEAVES)
    public HrEmployeeDTO setRemainingLeaves(Double val) {
        this._set(FIELD_REMAINING_LEAVES, val);
        return this;
    }

    /**
     * 获取「可用休假天数」值
     *
     */
    @JsonIgnore
    public Double getRemainingLeaves() {
        return DataTypeUtils.asDouble(this._get(FIELD_REMAINING_LEAVES), null);
    }

    /**
     * 判断 「可用休假天数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRemainingLeaves() {
        return this._contains(FIELD_REMAINING_LEAVES);
    }

    /**
     * 重置 「可用休假天数」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetRemainingLeaves() {
        this._reset(FIELD_REMAINING_LEAVES);
        return this;
    }

    /**
     * 设置「工作时间」
     * @param val
     */
    @JsonProperty(FIELD_RESOURCE_CALENDAR_ID)
    public HrEmployeeDTO setResourceCalendarId(String val) {
        this._set(FIELD_RESOURCE_CALENDAR_ID, val);
        return this;
    }

    /**
     * 获取「工作时间」值
     *
     */
    @JsonIgnore
    public String getResourceCalendarId() {
        return DataTypeUtils.asString(this._get(FIELD_RESOURCE_CALENDAR_ID), null);
    }

    /**
     * 判断 「工作时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResourceCalendarId() {
        return this._contains(FIELD_RESOURCE_CALENDAR_ID);
    }

    /**
     * 重置 「工作时间」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetResourceCalendarId() {
        this._reset(FIELD_RESOURCE_CALENDAR_ID);
        return this;
    }

    /**
     * 设置「工作时间」
     * @param val
     */
    @JsonProperty(FIELD_RESOURCE_CALENDAR_NAME)
    public HrEmployeeDTO setResourceCalendarName(String val) {
        this._set(FIELD_RESOURCE_CALENDAR_NAME, val);
        return this;
    }

    /**
     * 获取「工作时间」值
     *
     */
    @JsonIgnore
    public String getResourceCalendarName() {
        return DataTypeUtils.asString(this._get(FIELD_RESOURCE_CALENDAR_NAME), null);
    }

    /**
     * 判断 「工作时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResourceCalendarName() {
        return this._contains(FIELD_RESOURCE_CALENDAR_NAME);
    }

    /**
     * 重置 「工作时间」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetResourceCalendarName() {
        this._reset(FIELD_RESOURCE_CALENDAR_NAME);
        return this;
    }

    /**
     * 设置「资源」
     * @param val
     */
    @JsonProperty(FIELD_RESOURCE_ID)
    public HrEmployeeDTO setResourceId(String val) {
        this._set(FIELD_RESOURCE_ID, val);
        return this;
    }

    /**
     * 获取「资源」值
     *
     */
    @JsonIgnore
    public String getResourceId() {
        return DataTypeUtils.asString(this._get(FIELD_RESOURCE_ID), null);
    }

    /**
     * 判断 「资源」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResourceId() {
        return this._contains(FIELD_RESOURCE_ID);
    }

    /**
     * 重置 「资源」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetResourceId() {
        this._reset(FIELD_RESOURCE_ID);
        return this;
    }

    /**
     * 设置「显示HR图标」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_SHOW_HR_ICON_DISPLAY)
    public HrEmployeeDTO setShowHrIconDisplay(Integer val) {
        this._set(FIELD_SHOW_HR_ICON_DISPLAY, val);
        return this;
    }

    /**
     * 获取「显示HR图标」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getShowHrIconDisplay() {
        return DataTypeUtils.asInteger(this._get(FIELD_SHOW_HR_ICON_DISPLAY), null);
    }

    /**
     * 判断 「显示HR图标」是否有值
     *
     */
    @JsonIgnore
    public boolean containsShowHrIconDisplay() {
        return this._contains(FIELD_SHOW_HR_ICON_DISPLAY);
    }

    /**
     * 重置 「显示HR图标」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetShowHrIconDisplay() {
        this._reset(FIELD_SHOW_HR_ICON_DISPLAY);
        return this;
    }

    /**
     * 设置「能够查看到剩余休假」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_SHOW_LEAVES)
    public HrEmployeeDTO setShowLeaves(Integer val) {
        this._set(FIELD_SHOW_LEAVES, val);
        return this;
    }

    /**
     * 获取「能够查看到剩余休假」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getShowLeaves() {
        return DataTypeUtils.asInteger(this._get(FIELD_SHOW_LEAVES), null);
    }

    /**
     * 判断 「能够查看到剩余休假」是否有值
     *
     */
    @JsonIgnore
    public boolean containsShowLeaves() {
        return this._contains(FIELD_SHOW_LEAVES);
    }

    /**
     * 重置 「能够查看到剩余休假」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetShowLeaves() {
        this._reset(FIELD_SHOW_LEAVES);
        return this;
    }

    /**
     * 设置「社会保险号SIN」
     * @param val
     */
    @JsonProperty(FIELD_SINID)
    public HrEmployeeDTO setSinid(String val) {
        this._set(FIELD_SINID, val);
        return this;
    }

    /**
     * 获取「社会保险号SIN」值
     *
     */
    @JsonIgnore
    public String getSinid() {
        return DataTypeUtils.asString(this._get(FIELD_SINID), null);
    }

    /**
     * 判断 「社会保险号SIN」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSinid() {
        return this._contains(FIELD_SINID);
    }

    /**
     * 重置 「社会保险号SIN」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetSinid() {
        this._reset(FIELD_SINID);
        return this;
    }

    /**
     * 设置「配偶生日」
     * @param val
     */
    @JsonProperty(FIELD_SPOUSE_BIRTHDATE)
    public HrEmployeeDTO setSpouseBirthdate(Timestamp val) {
        this._set(FIELD_SPOUSE_BIRTHDATE, val);
        return this;
    }

    /**
     * 获取「配偶生日」值
     *
     */
    @JsonIgnore
    public Timestamp getSpouseBirthdate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_SPOUSE_BIRTHDATE), null);
    }

    /**
     * 判断 「配偶生日」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSpouseBirthdate() {
        return this._contains(FIELD_SPOUSE_BIRTHDATE);
    }

    /**
     * 重置 「配偶生日」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetSpouseBirthdate() {
        this._reset(FIELD_SPOUSE_BIRTHDATE);
        return this;
    }

    /**
     * 设置「配偶全名」
     * @param val
     */
    @JsonProperty(FIELD_SPOUSE_COMPLETE_NAME)
    public HrEmployeeDTO setSpouseCompleteName(String val) {
        this._set(FIELD_SPOUSE_COMPLETE_NAME, val);
        return this;
    }

    /**
     * 获取「配偶全名」值
     *
     */
    @JsonIgnore
    public String getSpouseCompleteName() {
        return DataTypeUtils.asString(this._get(FIELD_SPOUSE_COMPLETE_NAME), null);
    }

    /**
     * 判断 「配偶全名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSpouseCompleteName() {
        return this._contains(FIELD_SPOUSE_COMPLETE_NAME);
    }

    /**
     * 重置 「配偶全名」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetSpouseCompleteName() {
        this._reset(FIELD_SPOUSE_COMPLETE_NAME);
        return this;
    }

    /**
     * 设置「社会保障号SSN」
     * @param val
     */
    @JsonProperty(FIELD_SSNID)
    public HrEmployeeDTO setSsnid(String val) {
        this._set(FIELD_SSNID, val);
        return this;
    }

    /**
     * 获取「社会保障号SSN」值
     *
     */
    @JsonIgnore
    public String getSsnid() {
        return DataTypeUtils.asString(this._get(FIELD_SSNID), null);
    }

    /**
     * 判断 「社会保障号SSN」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSsnid() {
        return this._contains(FIELD_SSNID);
    }

    /**
     * 重置 「社会保障号SSN」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetSsnid() {
        this._reset(FIELD_SSNID);
        return this;
    }

    /**
     * 设置「研究领域」
     * @param val
     */
    @JsonProperty(FIELD_STUDY_FIELD)
    public HrEmployeeDTO setStudyField(String val) {
        this._set(FIELD_STUDY_FIELD, val);
        return this;
    }

    /**
     * 获取「研究领域」值
     *
     */
    @JsonIgnore
    public String getStudyField() {
        return DataTypeUtils.asString(this._get(FIELD_STUDY_FIELD), null);
    }

    /**
     * 判断 「研究领域」是否有值
     *
     */
    @JsonIgnore
    public boolean containsStudyField() {
        return this._contains(FIELD_STUDY_FIELD);
    }

    /**
     * 重置 「研究领域」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetStudyField() {
        this._reset(FIELD_STUDY_FIELD);
        return this;
    }

    /**
     * 设置「毕业院校」
     * @param val
     */
    @JsonProperty(FIELD_STUDY_SCHOOL)
    public HrEmployeeDTO setStudySchool(String val) {
        this._set(FIELD_STUDY_SCHOOL, val);
        return this;
    }

    /**
     * 获取「毕业院校」值
     *
     */
    @JsonIgnore
    public String getStudySchool() {
        return DataTypeUtils.asString(this._get(FIELD_STUDY_SCHOOL), null);
    }

    /**
     * 判断 「毕业院校」是否有值
     *
     */
    @JsonIgnore
    public boolean containsStudySchool() {
        return this._contains(FIELD_STUDY_SCHOOL);
    }

    /**
     * 重置 「毕业院校」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetStudySchool() {
        this._reset(FIELD_STUDY_SCHOOL);
        return this;
    }

    /**
     * 设置「加班费总额」
     * @param val
     */
    @JsonProperty(FIELD_TOTAL_OVERTIME)
    public HrEmployeeDTO setTotalOvertime(Double val) {
        this._set(FIELD_TOTAL_OVERTIME, val);
        return this;
    }

    /**
     * 获取「加班费总额」值
     *
     */
    @JsonIgnore
    public Double getTotalOvertime() {
        return DataTypeUtils.asDouble(this._get(FIELD_TOTAL_OVERTIME), null);
    }

    /**
     * 判断 「加班费总额」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTotalOvertime() {
        return this._contains(FIELD_TOTAL_OVERTIME);
    }

    /**
     * 重置 「加班费总额」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetTotalOvertime() {
        this._reset(FIELD_TOTAL_OVERTIME);
        return this;
    }

    /**
     * 设置「用户」
     * @param val
     */
    @JsonProperty(FIELD_USER_ID)
    public HrEmployeeDTO setUserId(String val) {
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
    public HrEmployeeDTO resetUserId() {
        this._reset(FIELD_USER_ID);
        return this;
    }

    /**
     * 设置「用户」
     * @param val
     */
    @JsonProperty(FIELD_USER_NAME)
    public HrEmployeeDTO setUserName(String val) {
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
    public HrEmployeeDTO resetUserName() {
        this._reset(FIELD_USER_NAME);
        return this;
    }

    /**
     * 设置「公司汽车」
     * @param val
     */
    @JsonProperty(FIELD_VEHICLE)
    public HrEmployeeDTO setVehicle(String val) {
        this._set(FIELD_VEHICLE, val);
        return this;
    }

    /**
     * 获取「公司汽车」值
     *
     */
    @JsonIgnore
    public String getVehicle() {
        return DataTypeUtils.asString(this._get(FIELD_VEHICLE), null);
    }

    /**
     * 判断 「公司汽车」是否有值
     *
     */
    @JsonIgnore
    public boolean containsVehicle() {
        return this._contains(FIELD_VEHICLE);
    }

    /**
     * 重置 「公司汽车」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetVehicle() {
        this._reset(FIELD_VEHICLE);
        return this;
    }

    /**
     * 设置「签证有效期」
     * @param val
     */
    @JsonProperty(FIELD_VISA_EXPIRE)
    public HrEmployeeDTO setVisaExpire(Timestamp val) {
        this._set(FIELD_VISA_EXPIRE, val);
        return this;
    }

    /**
     * 获取「签证有效期」值
     *
     */
    @JsonIgnore
    public Timestamp getVisaExpire() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_VISA_EXPIRE), null);
    }

    /**
     * 判断 「签证有效期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsVisaExpire() {
        return this._contains(FIELD_VISA_EXPIRE);
    }

    /**
     * 重置 「签证有效期」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetVisaExpire() {
        this._reset(FIELD_VISA_EXPIRE);
        return this;
    }

    /**
     * 设置「签证号」
     * @param val
     */
    @JsonProperty(FIELD_VISA_NO)
    public HrEmployeeDTO setVisaNo(String val) {
        this._set(FIELD_VISA_NO, val);
        return this;
    }

    /**
     * 获取「签证号」值
     *
     */
    @JsonIgnore
    public String getVisaNo() {
        return DataTypeUtils.asString(this._get(FIELD_VISA_NO), null);
    }

    /**
     * 判断 「签证号」是否有值
     *
     */
    @JsonIgnore
    public boolean containsVisaNo() {
        return this._contains(FIELD_VISA_NO);
    }

    /**
     * 重置 「签证号」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetVisaNo() {
        this._reset(FIELD_VISA_NO);
        return this;
    }

    /**
     * 设置「工作联系人」
     * @param val
     */
    @JsonProperty(FIELD_WORK_CONTACT_ID)
    public HrEmployeeDTO setWorkContactId(String val) {
        this._set(FIELD_WORK_CONTACT_ID, val);
        return this;
    }

    /**
     * 获取「工作联系人」值
     *
     */
    @JsonIgnore
    public String getWorkContactId() {
        return DataTypeUtils.asString(this._get(FIELD_WORK_CONTACT_ID), null);
    }

    /**
     * 判断 「工作联系人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWorkContactId() {
        return this._contains(FIELD_WORK_CONTACT_ID);
    }

    /**
     * 重置 「工作联系人」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetWorkContactId() {
        this._reset(FIELD_WORK_CONTACT_ID);
        return this;
    }

    /**
     * 设置「工作电子邮件」
     * @param val
     */
    @JsonProperty(FIELD_WORK_EMAIL)
    public HrEmployeeDTO setWorkEmail(String val) {
        this._set(FIELD_WORK_EMAIL, val);
        return this;
    }

    /**
     * 获取「工作电子邮件」值
     *
     */
    @JsonIgnore
    public String getWorkEmail() {
        return DataTypeUtils.asString(this._get(FIELD_WORK_EMAIL), null);
    }

    /**
     * 判断 「工作电子邮件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWorkEmail() {
        return this._contains(FIELD_WORK_EMAIL);
    }

    /**
     * 重置 「工作电子邮件」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetWorkEmail() {
        this._reset(FIELD_WORK_EMAIL);
        return this;
    }

    /**
     * 设置「工作地点」
     * @param val
     */
    @JsonProperty(FIELD_WORK_LOCATION_ID)
    public HrEmployeeDTO setWorkLocationId(String val) {
        this._set(FIELD_WORK_LOCATION_ID, val);
        return this;
    }

    /**
     * 获取「工作地点」值
     *
     */
    @JsonIgnore
    public String getWorkLocationId() {
        return DataTypeUtils.asString(this._get(FIELD_WORK_LOCATION_ID), null);
    }

    /**
     * 判断 「工作地点」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWorkLocationId() {
        return this._contains(FIELD_WORK_LOCATION_ID);
    }

    /**
     * 重置 「工作地点」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetWorkLocationId() {
        this._reset(FIELD_WORK_LOCATION_ID);
        return this;
    }

    /**
     * 设置「工作地点」
     * @param val
     */
    @JsonProperty(FIELD_WORK_LOCATION_NAME)
    public HrEmployeeDTO setWorkLocationName(String val) {
        this._set(FIELD_WORK_LOCATION_NAME, val);
        return this;
    }

    /**
     * 获取「工作地点」值
     *
     */
    @JsonIgnore
    public String getWorkLocationName() {
        return DataTypeUtils.asString(this._get(FIELD_WORK_LOCATION_NAME), null);
    }

    /**
     * 判断 「工作地点」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWorkLocationName() {
        return this._contains(FIELD_WORK_LOCATION_NAME);
    }

    /**
     * 重置 「工作地点」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetWorkLocationName() {
        this._reset(FIELD_WORK_LOCATION_NAME);
        return this;
    }

    /**
     * 设置「工作位置类型」
     * 代码表[工作位置类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.hr_employee_work_location_type
     * @param val
     */
    @JsonProperty(FIELD_WORK_LOCATION_TYPE)
    public HrEmployeeDTO setWorkLocationType(String val) {
        this._set(FIELD_WORK_LOCATION_TYPE, val);
        return this;
    }

    /**
     * 获取「工作位置类型」值
     * 代码表[工作位置类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.hr_employee_work_location_type
     *
     */
    @JsonIgnore
    public String getWorkLocationType() {
        return DataTypeUtils.asString(this._get(FIELD_WORK_LOCATION_TYPE), null);
    }

    /**
     * 判断 「工作位置类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWorkLocationType() {
        return this._contains(FIELD_WORK_LOCATION_TYPE);
    }

    /**
     * 重置 「工作位置类型」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetWorkLocationType() {
        this._reset(FIELD_WORK_LOCATION_TYPE);
        return this;
    }

    /**
     * 设置「工作许可证到期日期」
     * @param val
     */
    @JsonProperty(FIELD_WORK_PERMIT_EXPIRATION_DATE)
    public HrEmployeeDTO setWorkPermitExpirationDate(Timestamp val) {
        this._set(FIELD_WORK_PERMIT_EXPIRATION_DATE, val);
        return this;
    }

    /**
     * 获取「工作许可证到期日期」值
     *
     */
    @JsonIgnore
    public Timestamp getWorkPermitExpirationDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_WORK_PERMIT_EXPIRATION_DATE), null);
    }

    /**
     * 判断 「工作许可证到期日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWorkPermitExpirationDate() {
        return this._contains(FIELD_WORK_PERMIT_EXPIRATION_DATE);
    }

    /**
     * 重置 「工作许可证到期日期」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetWorkPermitExpirationDate() {
        this._reset(FIELD_WORK_PERMIT_EXPIRATION_DATE);
        return this;
    }

    /**
     * 设置「工作许可名称」
     * @param val
     */
    @JsonProperty(FIELD_WORK_PERMIT_NAME)
    public HrEmployeeDTO setWorkPermitName(String val) {
        this._set(FIELD_WORK_PERMIT_NAME, val);
        return this;
    }

    /**
     * 获取「工作许可名称」值
     *
     */
    @JsonIgnore
    public String getWorkPermitName() {
        return DataTypeUtils.asString(this._get(FIELD_WORK_PERMIT_NAME), null);
    }

    /**
     * 判断 「工作许可名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWorkPermitName() {
        return this._contains(FIELD_WORK_PERMIT_NAME);
    }

    /**
     * 重置 「工作许可名称」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetWorkPermitName() {
        this._reset(FIELD_WORK_PERMIT_NAME);
        return this;
    }

    /**
     * 设置「工作许可的预定活动」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_WORK_PERMIT_SCHEDULED_ACTIVITY)
    public HrEmployeeDTO setWorkPermitScheduledActivity(Integer val) {
        this._set(FIELD_WORK_PERMIT_SCHEDULED_ACTIVITY, val);
        return this;
    }

    /**
     * 获取「工作许可的预定活动」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getWorkPermitScheduledActivity() {
        return DataTypeUtils.asInteger(this._get(FIELD_WORK_PERMIT_SCHEDULED_ACTIVITY), null);
    }

    /**
     * 判断 「工作许可的预定活动」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWorkPermitScheduledActivity() {
        return this._contains(FIELD_WORK_PERMIT_SCHEDULED_ACTIVITY);
    }

    /**
     * 重置 「工作许可的预定活动」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetWorkPermitScheduledActivity() {
        this._reset(FIELD_WORK_PERMIT_SCHEDULED_ACTIVITY);
        return this;
    }

    /**
     * 设置「办公电话」
     * @param val
     */
    @JsonProperty(FIELD_WORK_PHONE)
    public HrEmployeeDTO setWorkPhone(String val) {
        this._set(FIELD_WORK_PHONE, val);
        return this;
    }

    /**
     * 获取「办公电话」值
     *
     */
    @JsonIgnore
    public String getWorkPhone() {
        return DataTypeUtils.asString(this._get(FIELD_WORK_PHONE), null);
    }

    /**
     * 判断 「办公电话」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWorkPhone() {
        return this._contains(FIELD_WORK_PHONE);
    }

    /**
     * 重置 「办公电话」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetWorkPhone() {
        this._reset(FIELD_WORK_PHONE);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public HrEmployeeDTO setWriteDate(Timestamp val) {
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
    public HrEmployeeDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public HrEmployeeDTO setWriteUid(String val) {
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
    public HrEmployeeDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

    /**
     * 设置「管理链」
     * @param val
     */
    @JsonProperty(FIELD_PARENT_PATH)
    public HrEmployeeDTO setParentPath(String val) {
        this._set(FIELD_PARENT_PATH, val);
        return this;
    }

    /**
     * 获取「管理链」值
     *
     */
    @JsonIgnore
    public String getParentPath() {
        return DataTypeUtils.asString(this._get(FIELD_PARENT_PATH), null);
    }

    /**
     * 判断 「管理链」是否有值
     *
     */
    @JsonIgnore
    public boolean containsParentPath() {
        return this._contains(FIELD_PARENT_PATH);
    }

    /**
     * 重置 「管理链」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetParentPath() {
        this._reset(FIELD_PARENT_PATH);
        return this;
    }

    /**
     * 设置「头像128」
     * @param val
     */
    @JsonProperty(FIELD_AVATAR128)
    public HrEmployeeDTO setAvatar128(String val) {
        this._set(FIELD_AVATAR128, val);
        return this;
    }

    /**
     * 获取「头像128」值
     *
     */
    @JsonIgnore
    public String getAvatar128() {
        return DataTypeUtils.asString(this._get(FIELD_AVATAR128), null);
    }

    /**
     * 判断 「头像128」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAvatar128() {
        return this._contains(FIELD_AVATAR128);
    }

    /**
     * 重置 「头像128」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetAvatar128() {
        this._reset(FIELD_AVATAR128);
        return this;
    }

    /**
     * 设置「图片128」
     * @param val
     */
    @JsonProperty(FIELD_IMAGE128)
    public HrEmployeeDTO setImage128(String val) {
        this._set(FIELD_IMAGE128, val);
        return this;
    }

    /**
     * 获取「图片128」值
     *
     */
    @JsonIgnore
    public String getImage128() {
        return DataTypeUtils.asString(this._get(FIELD_IMAGE128), null);
    }

    /**
     * 判断 「图片128」是否有值
     *
     */
    @JsonIgnore
    public boolean containsImage128() {
        return this._contains(FIELD_IMAGE128);
    }

    /**
     * 重置 「图片128」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetImage128() {
        this._reset(FIELD_IMAGE128);
        return this;
    }

    /**
     * 设置「头像512」
     * @param val
     */
    @JsonProperty(FIELD_AVATAR512)
    public HrEmployeeDTO setAvatar512(String val) {
        this._set(FIELD_AVATAR512, val);
        return this;
    }

    /**
     * 获取「头像512」值
     *
     */
    @JsonIgnore
    public String getAvatar512() {
        return DataTypeUtils.asString(this._get(FIELD_AVATAR512), null);
    }

    /**
     * 判断 「头像512」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAvatar512() {
        return this._contains(FIELD_AVATAR512);
    }

    /**
     * 重置 「头像512」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetAvatar512() {
        this._reset(FIELD_AVATAR512);
        return this;
    }

    /**
     * 设置「图片512」
     * @param val
     */
    @JsonProperty(FIELD_IMAGE512)
    public HrEmployeeDTO setImage512(String val) {
        this._set(FIELD_IMAGE512, val);
        return this;
    }

    /**
     * 获取「图片512」值
     *
     */
    @JsonIgnore
    public String getImage512() {
        return DataTypeUtils.asString(this._get(FIELD_IMAGE512), null);
    }

    /**
     * 判断 「图片512」是否有值
     *
     */
    @JsonIgnore
    public boolean containsImage512() {
        return this._contains(FIELD_IMAGE512);
    }

    /**
     * 重置 「图片512」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetImage512() {
        this._reset(FIELD_IMAGE512);
        return this;
    }

    /**
     * 设置「头像256」
     * @param val
     */
    @JsonProperty(FIELD_AVATAR256)
    public HrEmployeeDTO setAvatar256(String val) {
        this._set(FIELD_AVATAR256, val);
        return this;
    }

    /**
     * 获取「头像256」值
     *
     */
    @JsonIgnore
    public String getAvatar256() {
        return DataTypeUtils.asString(this._get(FIELD_AVATAR256), null);
    }

    /**
     * 判断 「头像256」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAvatar256() {
        return this._contains(FIELD_AVATAR256);
    }

    /**
     * 重置 「头像256」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetAvatar256() {
        this._reset(FIELD_AVATAR256);
        return this;
    }

    /**
     * 设置「图片256」
     * @param val
     */
    @JsonProperty(FIELD_IMAGE256)
    public HrEmployeeDTO setImage256(String val) {
        this._set(FIELD_IMAGE256, val);
        return this;
    }

    /**
     * 获取「图片256」值
     *
     */
    @JsonIgnore
    public String getImage256() {
        return DataTypeUtils.asString(this._get(FIELD_IMAGE256), null);
    }

    /**
     * 判断 「图片256」是否有值
     *
     */
    @JsonIgnore
    public boolean containsImage256() {
        return this._contains(FIELD_IMAGE256);
    }

    /**
     * 重置 「图片256」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetImage256() {
        this._reset(FIELD_IMAGE256);
        return this;
    }

    /**
     * 设置「头像1024」
     * @param val
     */
    @JsonProperty(FIELD_AVATAR1024)
    public HrEmployeeDTO setAvatar1024(String val) {
        this._set(FIELD_AVATAR1024, val);
        return this;
    }

    /**
     * 获取「头像1024」值
     *
     */
    @JsonIgnore
    public String getAvatar1024() {
        return DataTypeUtils.asString(this._get(FIELD_AVATAR1024), null);
    }

    /**
     * 判断 「头像1024」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAvatar1024() {
        return this._contains(FIELD_AVATAR1024);
    }

    /**
     * 重置 「头像1024」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetAvatar1024() {
        this._reset(FIELD_AVATAR1024);
        return this;
    }

    /**
     * 设置「图片1024」
     * @param val
     */
    @JsonProperty(FIELD_IMAGE1024)
    public HrEmployeeDTO setImage1024(String val) {
        this._set(FIELD_IMAGE1024, val);
        return this;
    }

    /**
     * 获取「图片1024」值
     *
     */
    @JsonIgnore
    public String getImage1024() {
        return DataTypeUtils.asString(this._get(FIELD_IMAGE1024), null);
    }

    /**
     * 判断 「图片1024」是否有值
     *
     */
    @JsonIgnore
    public boolean containsImage1024() {
        return this._contains(FIELD_IMAGE1024);
    }

    /**
     * 重置 「图片1024」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetImage1024() {
        this._reset(FIELD_IMAGE1024);
        return this;
    }

    /**
     * 设置「头像」
     * @param val
     */
    @JsonProperty(FIELD_AVATAR)
    public HrEmployeeDTO setAvatar(String val) {
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
    public HrEmployeeDTO resetAvatar() {
        this._reset(FIELD_AVATAR);
        return this;
    }

    /**
     * 设置「头像」
     * @param val
     */
    @JsonProperty(FIELD_IMAGE)
    public HrEmployeeDTO setImage(String val) {
        this._set(FIELD_IMAGE, val);
        return this;
    }

    /**
     * 获取「头像」值
     *
     */
    @JsonIgnore
    public String getImage() {
        return DataTypeUtils.asString(this._get(FIELD_IMAGE), null);
    }

    /**
     * 判断 「头像」是否有值
     *
     */
    @JsonIgnore
    public boolean containsImage() {
        return this._contains(FIELD_IMAGE);
    }

    /**
     * 重置 「头像」
     *
     */
    @JsonIgnore
    public HrEmployeeDTO resetImage() {
        this._reset(FIELD_IMAGE);
        return this;
    }

}
