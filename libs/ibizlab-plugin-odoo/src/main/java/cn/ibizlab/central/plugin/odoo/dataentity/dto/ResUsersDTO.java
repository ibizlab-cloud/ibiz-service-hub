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


public class ResUsersDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 姓名
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: # 访问权限
     */
    public final static String FIELD_ACCESSES_COUNT = "accesses_count";

    /**
     * 属性: 有效
     */
    public final static String FIELD_ACTIVE = "active";

    /**
     * 属性: 有效语言数量
     */
    public final static String FIELD_ACTIVE_LANG_COUNT = "active_lang_count";

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
     * 属性: 附加信息
     */
    public final static String FIELD_ADDITIONAL_INFO = "additional_info";

    /**
     * 属性: Auto-post bills
     */
    public final static String FIELD_AUTOPOST_BILLS = "autopost_bills";

    /**
     * 属性: 银行
     */
    public final static String FIELD_BANK_ACCOUNT_COUNT = "bank_account_count";

    /**
     * 属性: 条形码
     */
    public final static String FIELD_BARCODE = "barcode";

    /**
     * 属性: 青铜徽标数目
     */
    public final static String FIELD_BRONZE_BADGE = "bronze_badge";

    /**
     * 属性: 采购员
     */
    public final static String FIELD_BUYER_ID = "buyer_id";

    /**
     * 属性: 日历默认隐私
     */
    public final static String FIELD_CALENDAR_DEFAULT_PRIVACY = "calendar_default_privacy";

    /**
     * 属性: 从基本日历中标记为已读的最后一条通知
     */
    public final static String FIELD_CALENDAR_LAST_NOTIF_ACK = "calendar_last_notif_ack";

    /**
     * 属性: 能编辑
     */
    public final static String FIELD_CAN_EDIT = "can_edit";

    /**
     * 属性: 公司认证数
     */
    public final static String FIELD_CERTIFICATIONS_COMPANY_COUNT = "certifications_company_count";

    /**
     * 属性: 认证计算
     */
    public final static String FIELD_CERTIFICATIONS_COUNT = "certifications_count";

    /**
     * 属性: 城市
     */
    public final static String FIELD_CITY = "city";

    /**
     * 属性: 颜色索引
     */
    public final static String FIELD_COLOR = "color";

    /**
     * 属性: 备注
     */
    public final static String FIELD_COMMENT = "comment";

    /**
     * 属性: 公司名称实体
     */
    public final static String FIELD_COMMERCIAL_COMPANY_NAME = "commercial_company_name";

    /**
     * 属性: 商业实体
     */
    public final static String FIELD_COMMERCIAL_PARTNER_ID = "commercial_partner_id";

    /**
     * 属性: 公司数目
     */
    public final static String FIELD_COMPANIES_COUNT = "companies_count";

    /**
     * 属性: 公司
     */
    public final static String FIELD_COMPANY_ID = "company_id";

    /**
     * 属性: 公司名称
     */
    public final static String FIELD_COMPANY_NAME = "company_name";

    /**
     * 属性: 公司注册号
     */
    public final static String FIELD_COMPANY_REGISTRY = "company_registry";

    /**
     * 属性: 公司 ID 标签
     */
    public final static String FIELD_COMPANY_REGISTRY_LABEL = "company_registry_label";

    /**
     * 属性: 公司类型
     */
    public final static String FIELD_COMPANY_TYPE = "company_type";

    /**
     * 属性: 全名
     */
    public final static String FIELD_COMPLETE_NAME = "complete_name";

    /**
     * 属性: 完整地址
     */
    public final static String FIELD_CONTACT_ADDRESS = "contact_address";

    /**
     * 属性: 内嵌完整地址
     */
    public final static String FIELD_CONTACT_ADDRESS_INLINE = "contact_address_inline";

    /**
     * 属性: 国家/地区
     */
    public final static String FIELD_COUNTRY_ID = "country_id";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 技术领域，是否创建员工
     */
    public final static String FIELD_CREATE_EMPLOYEE = "create_employee";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 应收账款总计
     */
    public final static String FIELD_CREDIT = "credit";

    /**
     * 属性: 信贷额度
     */
    public final static String FIELD_CREDIT_LIMIT = "credit_limit";

    /**
     * 属性: 贷记入发票
     */
    public final static String FIELD_CREDIT_TO_INVOICE = "credit_to_invoice";

    /**
     * 属性: 客户等级
     */
    public final static String FIELD_CUSTOMER_RANK = "customer_rank";

    /**
     * 属性: 销售变现天数（DSO）
     */
    public final static String FIELD_DAYS_SALES_OUTSTANDING = "days_sales_outstanding";

    /**
     * 属性: 应付账款总计
     */
    public final static String FIELD_DEBIT = "debit";

    /**
     * 属性: 应付账款限额
     */
    public final static String FIELD_DEBIT_LIMIT = "debit_limit";

    /**
     * 属性: 显示发票 Edi 格式
     */
    public final static String FIELD_DISPLAY_INVOICE_EDI_FORMAT = "display_invoice_edi_format";

    /**
     * 属性: Display Invoice Template Pdf Report
     */
    public final static String FIELD_DISPLAY_INVOICE_TEMPLATE_PDF_REPORT_ID = "display_invoice_template_pdf_report_id";

    /**
     * 属性: Duplicated Bank Account Partners Count
     */
    public final static String FIELD_DUPLICATED_BANK_ACCOUNT_PARTNERS_COUNT = "duplicated_bank_account_partners_count";

    /**
     * 属性: 邮箱
     */
    public final static String FIELD_EMAIL = "email";

    /**
     * 属性: 格式化邮件
     */
    public final static String FIELD_EMAIL_FORMATTED = "email_formatted";

    /**
     * 属性: 规范化邮件
     */
    public final static String FIELD_EMAIL_NORMALIZED = "email_normalized";

    /**
     * 属性: 员工
     */
    public final static String FIELD_EMPLOYEE = "employee";

    /**
     * 属性: 员工人数
     */
    public final static String FIELD_EMPLOYEE_COUNT = "employee_count";

    /**
     * 属性: 员工数量
     */
    public final static String FIELD_EMPLOYEES_COUNT = "employees_count";

    /**
     * 属性: 会计所在国家/地区代码
     */
    public final static String FIELD_FISCAL_COUNTRY_CODES = "fiscal_country_codes";

    /**
     * 属性: 工作职位
     */
    public final static String FIELD_FUNCTION = "function";

    /**
     * 属性: 金质徽标数量
     */
    public final static String FIELD_GOLD_BADGE = "gold_badge";

    /**
     * 属性: # 分组
     */
    public final static String FIELD_GROUPS_COUNT = "groups_count";

    /**
     * 属性: 有消息
     */
    public final static String FIELD_HAS_MESSAGE = "has_message";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: Ignore Abnormal Invoice Amount
     */
    public final static String FIELD_IGNORE_ABNORMAL_INVOICE_AMOUNT = "ignore_abnormal_invoice_amount";

    /**
     * 属性: Ignore Abnormal Invoice Date
     */
    public final static String FIELD_IGNORE_ABNORMAL_INVOICE_DATE = "ignore_abnormal_invoice_date";

    /**
     * 属性: IM的状态
     */
    public final static String FIELD_IM_STATUS = "im_status";

    /**
     * 属性: 行业
     */
    public final static String FIELD_INDUSTRY_ID = "industry_id";

    /**
     * 属性: 电子发票格式
     */
    public final static String FIELD_INVOICE_EDI_FORMAT = "invoice_edi_format";

    /**
     * 属性: 发票 EDI 格式商店
     */
    public final static String FIELD_INVOICE_EDI_FORMAT_STORE = "invoice_edi_format_store";

    /**
     * 属性: 传送发票
     */
    public final static String FIELD_INVOICE_SENDING_METHOD = "invoice_sending_method";

    /**
     * 属性: 发票
     */
    public final static String FIELD_INVOICE_WARN = "invoice_warn";

    /**
     * 属性: 发票消息
     */
    public final static String FIELD_INVOICE_WARN_MSG = "invoice_warn_msg";

    /**
     * 属性: 黑名单
     */
    public final static String FIELD_IS_BLACKLISTED = "is_blacklisted";

    /**
     * 属性: Is Coa Installed
     */
    public final static String FIELD_IS_COA_INSTALLED = "is_coa_installed";

    /**
     * 属性: 是公司
     */
    public final static String FIELD_IS_COMPANY = "is_company";

    /**
     * 属性: 是 Peppol Edi 格式
     */
    public final static String FIELD_IS_PEPPOL_EDI_FORMAT = "is_peppol_edi_format";

    /**
     * 属性: 是公共
     */
    public final static String FIELD_IS_PUBLIC = "is_public";

    /**
     * 属性: 是系统
     */
    public final static String FIELD_IS_SYSTEM = "is_system";

    /**
     * 属性: 是 Ubl 格式
     */
    public final static String FIELD_IS_UBL_FORMAT = "is_ubl_format";

    /**
     * 属性: 日记账项目
     */
    public final static String FIELD_JOURNAL_ITEM_COUNT = "journal_item_count";

    /**
     * 属性: 贡献值
     */
    public final static String FIELD_KARMA = "karma";

    /**
     * 属性: 登录
     */
    public final static String FIELD_LOGIN = "login";

    /**
     * 属性: # 会议
     */
    public final static String FIELD_MEETING_COUNT = "meeting_count";

    /**
     * 属性: 附件数量
     */
    public final static String FIELD_MESSAGE_ATTACHMENT_COUNT = "message_attachment_count";

    /**
     * 属性: 退回
     */
    public final static String FIELD_MESSAGE_BOUNCE = "message_bounce";

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
     * 属性: 待处理
     */
    public final static String FIELD_MESSAGE_NEEDACTION = "message_needaction";

    /**
     * 属性: 操作数量
     */
    public final static String FIELD_MESSAGE_NEEDACTION_COUNTER = "message_needaction_counter";

    /**
     * 属性: 手机
     */
    public final static String FIELD_MOBILE = "mobile";

    /**
     * 属性: 列入黑名单的手机是移动的
     */
    public final static String FIELD_MOBILE_BLACKLISTED = "mobile_blacklisted";

    /**
     * 属性: 我的活动截止时间
     */
    public final static String FIELD_MY_ACTIVITY_DATE_DEADLINE = "my_activity_date_deadline";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 设置密码
     */
    public final static String FIELD_NEW_PASSWORD = "new_password";

    /**
     * 属性: 通知
     */
    public final static String FIELD_NOTIFICATION_TYPE = "notification_type";

    /**
     * 属性: Odoobot 挂了
     */
    public final static String FIELD_ODOOBOT_FAILED = "odoobot_failed";

    /**
     * 属性: 小秘书状态
     */
    public final static String FIELD_ODOOBOT_STATE = "odoobot_state";

    /**
     * 属性: 准时交货率
     */
    public final static String FIELD_ON_TIME_RATE = "on_time_rate";

    /**
     * 属性: 商机数量
     */
    public final static String FIELD_OPPORTUNITY_COUNT = "opportunity_count";

    /**
     * 属性: 相关公司
     */
    public final static String FIELD_PARENT_ID = "parent_id";

    /**
     * 属性: 合作伙伴公司注册处占位符
     */
    public final static String FIELD_PARTNER_COMPANY_REGISTRY_PLACEHOLDER = "partner_company_registry_placeholder";

    /**
     * 属性: 公司数据库ID
     */
    public final static String FIELD_PARTNER_GID = "partner_gid";

    /**
     * 属性: 相关合作伙伴
     */
    public final static String FIELD_PARTNER_ID = "partner_id";

    /**
     * 属性: 地理纬度
     */
    public final static String FIELD_PARTNER_LATITUDE = "partner_latitude";

    /**
     * 属性: 地理经度
     */
    public final static String FIELD_PARTNER_LONGITUDE = "partner_longitude";

    /**
     * 属性: 相关合作伙伴
     */
    public final static String FIELD_PARTNER_NAME = "partner_name";

    /**
     * 属性: 共享合作伙伴
     */
    public final static String FIELD_PARTNER_SHARE = "partner_share";

    /**
     * 属性: Partner Vat Placeholder
     */
    public final static String FIELD_PARTNER_VAT_PLACEHOLDER = "partner_vat_placeholder";

    /**
     * 属性: 密码
     */
    public final static String FIELD_PASSWORD = "password";

    /**
     * 属性: 支付令牌计数
     */
    public final static String FIELD_PAYMENT_TOKEN_COUNT = "payment_token_count";

    /**
     * 属性: Peppol电子地址（EAS）
     */
    public final static String FIELD_PEPPOL_EAS = "peppol_eas";

    /**
     * 属性: Peppol Endpoint
     */
    public final static String FIELD_PEPPOL_ENDPOINT = "peppol_endpoint";

    /**
     * 属性: 电话
     */
    public final static String FIELD_PHONE = "phone";

    /**
     * 属性: 列入黑名单的电话是电话
     */
    public final static String FIELD_PHONE_BLACKLISTED = "phone_blacklisted";

    /**
     * 属性: 电话/手机
     */
    public final static String FIELD_PHONE_MOBILE_SEARCH = "phone_mobile_search";

    /**
     * 属性: 净化数量
     */
    public final static String FIELD_PHONE_SANITIZED = "phone_sanitized";

    /**
     * 属性: 电话加黑
     */
    public final static String FIELD_PHONE_SANITIZED_BLACKLISTED = "phone_sanitized_blacklisted";

    /**
     * 属性: 库存拣货
     */
    public final static String FIELD_PICKING_WARN = "picking_warn";

    /**
     * 属性: 库存拣货单消息
     */
    public final static String FIELD_PICKING_WARN_MSG = "picking_warn_msg";

    /**
     * 属性: 计划更换自行车
     */
    public final static String FIELD_PLAN_TO_CHANGE_BIKE = "plan_to_change_bike";

    /**
     * 属性: 更换车辆计划
     */
    public final static String FIELD_PLAN_TO_CHANGE_CAR = "plan_to_change_car";

    /**
     * 属性: 供应商币别
     */
    public final static String FIELD_PROPERTY_PURCHASE_CURRENCY_ID = "property_purchase_currency_id";

    /**
     * 属性: 采购订单数
     */
    public final static String FIELD_PURCHASE_ORDER_COUNT = "purchase_order_count";

    /**
     * 属性: 采购订单预警
     */
    public final static String FIELD_PURCHASE_WARN = "purchase_warn";

    /**
     * 属性: 采购订单消息
     */
    public final static String FIELD_PURCHASE_WARN_MSG = "purchase_warn_msg";

    /**
     * 属性: 收货提醒
     */
    public final static String FIELD_RECEIPT_REMINDER_EMAIL = "receipt_reminder_email";

    /**
     * 属性: 参考
     */
    public final static String FIELD_REF = "ref";

    /**
     * 属性: 收货前几天
     */
    public final static String FIELD_REMINDER_DATE_BEFORE_RECEIPT = "reminder_date_before_receipt";

    /**
     * 属性: 要求加班
     */
    public final static String FIELD_REQUEST_OVERTIME = "request_overtime";

    /**
     * 属性: # 记录规则
     */
    public final static String FIELD_RULES_COUNT = "rules_count";

    /**
     * 属性: 销售订单计数
     */
    public final static String FIELD_SALE_ORDER_COUNT = "sale_order_count";

    /**
     * 属性: 用户销售团队
     */
    public final static String FIELD_SALE_TEAM_ID = "sale_team_id";

    /**
     * 属性: 销售警告信息
     */
    public final static String FIELD_SALE_WARN = "sale_warn";

    /**
     * 属性: 销售订单消息
     */
    public final static String FIELD_SALE_WARN_MSG = "sale_warn_msg";

    /**
     * 属性: 共享用户
     */
    public final static String FIELD_SHARE = "share";

    /**
     * 属性: 显示信用额度
     */
    public final static String FIELD_SHOW_CREDIT_LIMIT = "show_credit_limit";

    /**
     * 属性: 电子邮件签名
     */
    public final static String FIELD_SIGNATURE = "signature";

    /**
     * 属性: 注册令牌（Token）类型
     */
    public final static String FIELD_SIGNUP_TYPE = "signup_type";

    /**
     * 属性: 银质徽标数量
     */
    public final static String FIELD_SILVER_BADGE = "silver_badge";

    /**
     * 属性: 状态
     */
    public final static String FIELD_STATE = "state";

    /**
     * 属性: 省/州
     */
    public final static String FIELD_STATE_ID = "state_id";

    /**
     * 属性: 街道
     */
    public final static String FIELD_STREET = "street";

    /**
     * 属性: 详细地址
     */
    public final static String FIELD_STREET2 = "street2";

    /**
     * 属性: ＃供应商账单
     */
    public final static String FIELD_SUPPLIER_INVOICE_COUNT = "supplier_invoice_count";

    /**
     * 属性: 供应商排名
     */
    public final static String FIELD_SUPPLIER_RANK = "supplier_rank";

    /**
     * 属性: 活动完成目标
     */
    public final static String FIELD_TARGET_SALES_DONE = "target_sales_done";

    /**
     * 属性: 销售订单目标结算单
     */
    public final static String FIELD_TARGET_SALES_INVOICED = "target_sales_invoiced";

    /**
     * 属性: 商机赢得目标
     */
    public final static String FIELD_TARGET_SALES_WON = "target_sales_won";

    /**
     * 属性: null
     */
    public final static String FIELD_TASK_COUNT = "task_count";

    /**
     * 属性: 已开票总计
     */
    public final static String FIELD_TOTAL_INVOICED = "total_invoiced";

    /**
     * 属性: 双重身份验证
     */
    public final static String FIELD_TOTP_ENABLED = "totp_enabled";

    /**
     * 属性: Totp密匙
     */
    public final static String FIELD_TOTP_SECRET = "totp_secret";

    /**
     * 属性: 新手入门
     */
    public final static String FIELD_TOUR_ENABLED = "tour_enabled";

    /**
     * 属性: Degree of trust you have in this debtor
     */
    public final static String FIELD_TRUST = "trust";

    /**
     * 属性: 地址类型
     */
    public final static String FIELD_TYPE = "type";

    /**
     * 属性: 时区
     */
    public final static String FIELD_TZ = "tz";

    /**
     * 属性: 时区偏移
     */
    public final static String FIELD_TZ_OFFSET = "tz_offset";

    /**
     * 属性: 合作伙伴限制
     */
    public final static String FIELD_USE_PARTNER_CREDIT_LIMIT = "use_partner_credit_limit";

    /**
     * 属性: 用户组警告
     */
    public final static String FIELD_USER_GROUP_WARNING = "user_group_warning";

    /**
     * 属性: 业务员
     */
    public final static String FIELD_USER_ID = "user_id";

    /**
     * 属性: 税号ID
     */
    public final static String FIELD_VAT = "vat";

    /**
     * 属性: 税务 ID 标签
     */
    public final static String FIELD_VAT_LABEL = "vat_label";

    /**
     * 属性: 网站链接
     */
    public final static String FIELD_WEBSITE = "website";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 属性: 邮编
     */
    public final static String FIELD_ZIP = "zip";

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
     * 属性: null
     */
    public final static String FIELD_GROUPS_USERS_RELS = "groups_users_rels";

    /**
     * 设置「姓名」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public ResUsersDTO setDisplayName(String val) {
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
    public ResUsersDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「# 访问权限」
     * @param val
     */
    @JsonProperty(FIELD_ACCESSES_COUNT)
    public ResUsersDTO setAccessesCount(Integer val) {
        this._set(FIELD_ACCESSES_COUNT, val);
        return this;
    }

    /**
     * 获取「# 访问权限」值
     *
     */
    @JsonIgnore
    public Integer getAccessesCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_ACCESSES_COUNT), null);
    }

    /**
     * 判断 「# 访问权限」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAccessesCount() {
        return this._contains(FIELD_ACCESSES_COUNT);
    }

    /**
     * 重置 「# 访问权限」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetAccessesCount() {
        this._reset(FIELD_ACCESSES_COUNT);
        return this;
    }

    /**
     * 设置「有效」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ACTIVE)
    public ResUsersDTO setActive(Integer val) {
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
    public ResUsersDTO resetActive() {
        this._reset(FIELD_ACTIVE);
        return this;
    }

    /**
     * 设置「有效语言数量」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVE_LANG_COUNT)
    public ResUsersDTO setActiveLangCount(Integer val) {
        this._set(FIELD_ACTIVE_LANG_COUNT, val);
        return this;
    }

    /**
     * 获取「有效语言数量」值
     *
     */
    @JsonIgnore
    public Integer getActiveLangCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_ACTIVE_LANG_COUNT), null);
    }

    /**
     * 判断 「有效语言数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActiveLangCount() {
        return this._contains(FIELD_ACTIVE_LANG_COUNT);
    }

    /**
     * 重置 「有效语言数量」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetActiveLangCount() {
        this._reset(FIELD_ACTIVE_LANG_COUNT);
        return this;
    }

    /**
     * 设置「下一活动截止日期」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_DATE_DEADLINE)
    public ResUsersDTO setActivityDateDeadline(Timestamp val) {
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
    public ResUsersDTO resetActivityDateDeadline() {
        this._reset(FIELD_ACTIVITY_DATE_DEADLINE);
        return this;
    }

    /**
     * 设置「活动异常标示」
     * 代码表[活动异常标示]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_activity_exception_decoration
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_EXCEPTION_DECORATION)
    public ResUsersDTO setActivityExceptionDecoration(String val) {
        this._set(FIELD_ACTIVITY_EXCEPTION_DECORATION, val);
        return this;
    }

    /**
     * 获取「活动异常标示」值
     * 代码表[活动异常标示]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_activity_exception_decoration
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
    public ResUsersDTO resetActivityExceptionDecoration() {
        this._reset(FIELD_ACTIVITY_EXCEPTION_DECORATION);
        return this;
    }

    /**
     * 设置「图标」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_EXCEPTION_ICON)
    public ResUsersDTO setActivityExceptionIcon(String val) {
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
    public ResUsersDTO resetActivityExceptionIcon() {
        this._reset(FIELD_ACTIVITY_EXCEPTION_ICON);
        return this;
    }

    /**
     * 设置「活动状态」
     * 代码表[活动状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_activity_state
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_STATE)
    public ResUsersDTO setActivityState(String val) {
        this._set(FIELD_ACTIVITY_STATE, val);
        return this;
    }

    /**
     * 获取「活动状态」值
     * 代码表[活动状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_activity_state
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
    public ResUsersDTO resetActivityState() {
        this._reset(FIELD_ACTIVITY_STATE);
        return this;
    }

    /**
     * 设置「附加信息」
     * @param val
     */
    @JsonProperty(FIELD_ADDITIONAL_INFO)
    public ResUsersDTO setAdditionalInfo(String val) {
        this._set(FIELD_ADDITIONAL_INFO, val);
        return this;
    }

    /**
     * 获取「附加信息」值
     *
     */
    @JsonIgnore
    public String getAdditionalInfo() {
        return DataTypeUtils.asString(this._get(FIELD_ADDITIONAL_INFO), null);
    }

    /**
     * 判断 「附加信息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAdditionalInfo() {
        return this._contains(FIELD_ADDITIONAL_INFO);
    }

    /**
     * 重置 「附加信息」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetAdditionalInfo() {
        this._reset(FIELD_ADDITIONAL_INFO);
        return this;
    }

    /**
     * 设置「Auto-post bills」
     * 代码表[Auto-post bills]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_autopost_bills
     * @param val
     */
    @JsonProperty(FIELD_AUTOPOST_BILLS)
    public ResUsersDTO setAutopostBills(String val) {
        this._set(FIELD_AUTOPOST_BILLS, val);
        return this;
    }

    /**
     * 获取「Auto-post bills」值
     * 代码表[Auto-post bills]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_autopost_bills
     *
     */
    @JsonIgnore
    public String getAutopostBills() {
        return DataTypeUtils.asString(this._get(FIELD_AUTOPOST_BILLS), null);
    }

    /**
     * 判断 「Auto-post bills」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAutopostBills() {
        return this._contains(FIELD_AUTOPOST_BILLS);
    }

    /**
     * 重置 「Auto-post bills」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetAutopostBills() {
        this._reset(FIELD_AUTOPOST_BILLS);
        return this;
    }

    /**
     * 设置「银行」
     * @param val
     */
    @JsonProperty(FIELD_BANK_ACCOUNT_COUNT)
    public ResUsersDTO setBankAccountCount(Integer val) {
        this._set(FIELD_BANK_ACCOUNT_COUNT, val);
        return this;
    }

    /**
     * 获取「银行」值
     *
     */
    @JsonIgnore
    public Integer getBankAccountCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_BANK_ACCOUNT_COUNT), null);
    }

    /**
     * 判断 「银行」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBankAccountCount() {
        return this._contains(FIELD_BANK_ACCOUNT_COUNT);
    }

    /**
     * 重置 「银行」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetBankAccountCount() {
        this._reset(FIELD_BANK_ACCOUNT_COUNT);
        return this;
    }

    /**
     * 设置「条形码」
     * @param val
     */
    @JsonProperty(FIELD_BARCODE)
    public ResUsersDTO setBarcode(String val) {
        this._set(FIELD_BARCODE, val);
        return this;
    }

    /**
     * 获取「条形码」值
     *
     */
    @JsonIgnore
    public String getBarcode() {
        return DataTypeUtils.asString(this._get(FIELD_BARCODE), null);
    }

    /**
     * 判断 「条形码」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBarcode() {
        return this._contains(FIELD_BARCODE);
    }

    /**
     * 重置 「条形码」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetBarcode() {
        this._reset(FIELD_BARCODE);
        return this;
    }

    /**
     * 设置「青铜徽标数目」
     * @param val
     */
    @JsonProperty(FIELD_BRONZE_BADGE)
    public ResUsersDTO setBronzeBadge(Integer val) {
        this._set(FIELD_BRONZE_BADGE, val);
        return this;
    }

    /**
     * 获取「青铜徽标数目」值
     *
     */
    @JsonIgnore
    public Integer getBronzeBadge() {
        return DataTypeUtils.asInteger(this._get(FIELD_BRONZE_BADGE), null);
    }

    /**
     * 判断 「青铜徽标数目」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBronzeBadge() {
        return this._contains(FIELD_BRONZE_BADGE);
    }

    /**
     * 重置 「青铜徽标数目」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetBronzeBadge() {
        this._reset(FIELD_BRONZE_BADGE);
        return this;
    }

    /**
     * 设置「采购员」
     * @param val
     */
    @JsonProperty(FIELD_BUYER_ID)
    public ResUsersDTO setBuyerId(String val) {
        this._set(FIELD_BUYER_ID, val);
        return this;
    }

    /**
     * 获取「采购员」值
     *
     */
    @JsonIgnore
    public String getBuyerId() {
        return DataTypeUtils.asString(this._get(FIELD_BUYER_ID), null);
    }

    /**
     * 判断 「采购员」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBuyerId() {
        return this._contains(FIELD_BUYER_ID);
    }

    /**
     * 重置 「采购员」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetBuyerId() {
        this._reset(FIELD_BUYER_ID);
        return this;
    }

    /**
     * 设置「日历默认隐私」
     * 代码表[日历默认隐私]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_users_calendar_default_privacy
     * @param val
     */
    @JsonProperty(FIELD_CALENDAR_DEFAULT_PRIVACY)
    public ResUsersDTO setCalendarDefaultPrivacy(String val) {
        this._set(FIELD_CALENDAR_DEFAULT_PRIVACY, val);
        return this;
    }

    /**
     * 获取「日历默认隐私」值
     * 代码表[日历默认隐私]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_users_calendar_default_privacy
     *
     */
    @JsonIgnore
    public String getCalendarDefaultPrivacy() {
        return DataTypeUtils.asString(this._get(FIELD_CALENDAR_DEFAULT_PRIVACY), null);
    }

    /**
     * 判断 「日历默认隐私」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCalendarDefaultPrivacy() {
        return this._contains(FIELD_CALENDAR_DEFAULT_PRIVACY);
    }

    /**
     * 重置 「日历默认隐私」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetCalendarDefaultPrivacy() {
        this._reset(FIELD_CALENDAR_DEFAULT_PRIVACY);
        return this;
    }

    /**
     * 设置「从基本日历中标记为已读的最后一条通知」
     * @param val
     */
    @JsonProperty(FIELD_CALENDAR_LAST_NOTIF_ACK)
    public ResUsersDTO setCalendarLastNotifAck(Timestamp val) {
        this._set(FIELD_CALENDAR_LAST_NOTIF_ACK, val);
        return this;
    }

    /**
     * 获取「从基本日历中标记为已读的最后一条通知」值
     *
     */
    @JsonIgnore
    public Timestamp getCalendarLastNotifAck() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_CALENDAR_LAST_NOTIF_ACK), null);
    }

    /**
     * 判断 「从基本日历中标记为已读的最后一条通知」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCalendarLastNotifAck() {
        return this._contains(FIELD_CALENDAR_LAST_NOTIF_ACK);
    }

    /**
     * 重置 「从基本日历中标记为已读的最后一条通知」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetCalendarLastNotifAck() {
        this._reset(FIELD_CALENDAR_LAST_NOTIF_ACK);
        return this;
    }

    /**
     * 设置「能编辑」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_CAN_EDIT)
    public ResUsersDTO setCanEdit(Integer val) {
        this._set(FIELD_CAN_EDIT, val);
        return this;
    }

    /**
     * 获取「能编辑」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getCanEdit() {
        return DataTypeUtils.asInteger(this._get(FIELD_CAN_EDIT), null);
    }

    /**
     * 判断 「能编辑」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCanEdit() {
        return this._contains(FIELD_CAN_EDIT);
    }

    /**
     * 重置 「能编辑」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetCanEdit() {
        this._reset(FIELD_CAN_EDIT);
        return this;
    }

    /**
     * 设置「公司认证数」
     * @param val
     */
    @JsonProperty(FIELD_CERTIFICATIONS_COMPANY_COUNT)
    public ResUsersDTO setCertificationsCompanyCount(Integer val) {
        this._set(FIELD_CERTIFICATIONS_COMPANY_COUNT, val);
        return this;
    }

    /**
     * 获取「公司认证数」值
     *
     */
    @JsonIgnore
    public Integer getCertificationsCompanyCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_CERTIFICATIONS_COMPANY_COUNT), null);
    }

    /**
     * 判断 「公司认证数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCertificationsCompanyCount() {
        return this._contains(FIELD_CERTIFICATIONS_COMPANY_COUNT);
    }

    /**
     * 重置 「公司认证数」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetCertificationsCompanyCount() {
        this._reset(FIELD_CERTIFICATIONS_COMPANY_COUNT);
        return this;
    }

    /**
     * 设置「认证计算」
     * @param val
     */
    @JsonProperty(FIELD_CERTIFICATIONS_COUNT)
    public ResUsersDTO setCertificationsCount(Integer val) {
        this._set(FIELD_CERTIFICATIONS_COUNT, val);
        return this;
    }

    /**
     * 获取「认证计算」值
     *
     */
    @JsonIgnore
    public Integer getCertificationsCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_CERTIFICATIONS_COUNT), null);
    }

    /**
     * 判断 「认证计算」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCertificationsCount() {
        return this._contains(FIELD_CERTIFICATIONS_COUNT);
    }

    /**
     * 重置 「认证计算」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetCertificationsCount() {
        this._reset(FIELD_CERTIFICATIONS_COUNT);
        return this;
    }

    /**
     * 设置「城市」
     * @param val
     */
    @JsonProperty(FIELD_CITY)
    public ResUsersDTO setCity(String val) {
        this._set(FIELD_CITY, val);
        return this;
    }

    /**
     * 获取「城市」值
     *
     */
    @JsonIgnore
    public String getCity() {
        return DataTypeUtils.asString(this._get(FIELD_CITY), null);
    }

    /**
     * 判断 「城市」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCity() {
        return this._contains(FIELD_CITY);
    }

    /**
     * 重置 「城市」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetCity() {
        this._reset(FIELD_CITY);
        return this;
    }

    /**
     * 设置「颜色索引」
     * @param val
     */
    @JsonProperty(FIELD_COLOR)
    public ResUsersDTO setColor(Integer val) {
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
    public ResUsersDTO resetColor() {
        this._reset(FIELD_COLOR);
        return this;
    }

    /**
     * 设置「备注」
     * @param val
     */
    @JsonProperty(FIELD_COMMENT)
    public ResUsersDTO setComment(String val) {
        this._set(FIELD_COMMENT, val);
        return this;
    }

    /**
     * 获取「备注」值
     *
     */
    @JsonIgnore
    public String getComment() {
        return DataTypeUtils.asString(this._get(FIELD_COMMENT), null);
    }

    /**
     * 判断 「备注」是否有值
     *
     */
    @JsonIgnore
    public boolean containsComment() {
        return this._contains(FIELD_COMMENT);
    }

    /**
     * 重置 「备注」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetComment() {
        this._reset(FIELD_COMMENT);
        return this;
    }

    /**
     * 设置「公司名称实体」
     * @param val
     */
    @JsonProperty(FIELD_COMMERCIAL_COMPANY_NAME)
    public ResUsersDTO setCommercialCompanyName(String val) {
        this._set(FIELD_COMMERCIAL_COMPANY_NAME, val);
        return this;
    }

    /**
     * 获取「公司名称实体」值
     *
     */
    @JsonIgnore
    public String getCommercialCompanyName() {
        return DataTypeUtils.asString(this._get(FIELD_COMMERCIAL_COMPANY_NAME), null);
    }

    /**
     * 判断 「公司名称实体」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCommercialCompanyName() {
        return this._contains(FIELD_COMMERCIAL_COMPANY_NAME);
    }

    /**
     * 重置 「公司名称实体」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetCommercialCompanyName() {
        this._reset(FIELD_COMMERCIAL_COMPANY_NAME);
        return this;
    }

    /**
     * 设置「商业实体」
     * @param val
     */
    @JsonProperty(FIELD_COMMERCIAL_PARTNER_ID)
    public ResUsersDTO setCommercialPartnerId(String val) {
        this._set(FIELD_COMMERCIAL_PARTNER_ID, val);
        return this;
    }

    /**
     * 获取「商业实体」值
     *
     */
    @JsonIgnore
    public String getCommercialPartnerId() {
        return DataTypeUtils.asString(this._get(FIELD_COMMERCIAL_PARTNER_ID), null);
    }

    /**
     * 判断 「商业实体」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCommercialPartnerId() {
        return this._contains(FIELD_COMMERCIAL_PARTNER_ID);
    }

    /**
     * 重置 「商业实体」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetCommercialPartnerId() {
        this._reset(FIELD_COMMERCIAL_PARTNER_ID);
        return this;
    }

    /**
     * 设置「公司数目」
     * @param val
     */
    @JsonProperty(FIELD_COMPANIES_COUNT)
    public ResUsersDTO setCompaniesCount(Integer val) {
        this._set(FIELD_COMPANIES_COUNT, val);
        return this;
    }

    /**
     * 获取「公司数目」值
     *
     */
    @JsonIgnore
    public Integer getCompaniesCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_COMPANIES_COUNT), null);
    }

    /**
     * 判断 「公司数目」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCompaniesCount() {
        return this._contains(FIELD_COMPANIES_COUNT);
    }

    /**
     * 重置 「公司数目」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetCompaniesCount() {
        this._reset(FIELD_COMPANIES_COUNT);
        return this;
    }

    /**
     * 设置「公司」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_ID)
    public ResUsersDTO setCompanyId(String val) {
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
    public ResUsersDTO resetCompanyId() {
        this._reset(FIELD_COMPANY_ID);
        return this;
    }

    /**
     * 设置「公司名称」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_NAME)
    public ResUsersDTO setCompanyName(String val) {
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
    public ResUsersDTO resetCompanyName() {
        this._reset(FIELD_COMPANY_NAME);
        return this;
    }

    /**
     * 设置「公司注册号」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_REGISTRY)
    public ResUsersDTO setCompanyRegistry(String val) {
        this._set(FIELD_COMPANY_REGISTRY, val);
        return this;
    }

    /**
     * 获取「公司注册号」值
     *
     */
    @JsonIgnore
    public String getCompanyRegistry() {
        return DataTypeUtils.asString(this._get(FIELD_COMPANY_REGISTRY), null);
    }

    /**
     * 判断 「公司注册号」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCompanyRegistry() {
        return this._contains(FIELD_COMPANY_REGISTRY);
    }

    /**
     * 重置 「公司注册号」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetCompanyRegistry() {
        this._reset(FIELD_COMPANY_REGISTRY);
        return this;
    }

    /**
     * 设置「公司 ID 标签」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_REGISTRY_LABEL)
    public ResUsersDTO setCompanyRegistryLabel(String val) {
        this._set(FIELD_COMPANY_REGISTRY_LABEL, val);
        return this;
    }

    /**
     * 获取「公司 ID 标签」值
     *
     */
    @JsonIgnore
    public String getCompanyRegistryLabel() {
        return DataTypeUtils.asString(this._get(FIELD_COMPANY_REGISTRY_LABEL), null);
    }

    /**
     * 判断 「公司 ID 标签」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCompanyRegistryLabel() {
        return this._contains(FIELD_COMPANY_REGISTRY_LABEL);
    }

    /**
     * 重置 「公司 ID 标签」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetCompanyRegistryLabel() {
        this._reset(FIELD_COMPANY_REGISTRY_LABEL);
        return this;
    }

    /**
     * 设置「公司类型」
     * 代码表[公司类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_company_type
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_TYPE)
    public ResUsersDTO setCompanyType(String val) {
        this._set(FIELD_COMPANY_TYPE, val);
        return this;
    }

    /**
     * 获取「公司类型」值
     * 代码表[公司类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_company_type
     *
     */
    @JsonIgnore
    public String getCompanyType() {
        return DataTypeUtils.asString(this._get(FIELD_COMPANY_TYPE), null);
    }

    /**
     * 判断 「公司类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCompanyType() {
        return this._contains(FIELD_COMPANY_TYPE);
    }

    /**
     * 重置 「公司类型」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetCompanyType() {
        this._reset(FIELD_COMPANY_TYPE);
        return this;
    }

    /**
     * 设置「全名」
     * @param val
     */
    @JsonProperty(FIELD_COMPLETE_NAME)
    public ResUsersDTO setCompleteName(String val) {
        this._set(FIELD_COMPLETE_NAME, val);
        return this;
    }

    /**
     * 获取「全名」值
     *
     */
    @JsonIgnore
    public String getCompleteName() {
        return DataTypeUtils.asString(this._get(FIELD_COMPLETE_NAME), null);
    }

    /**
     * 判断 「全名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCompleteName() {
        return this._contains(FIELD_COMPLETE_NAME);
    }

    /**
     * 重置 「全名」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetCompleteName() {
        this._reset(FIELD_COMPLETE_NAME);
        return this;
    }

    /**
     * 设置「完整地址」
     * @param val
     */
    @JsonProperty(FIELD_CONTACT_ADDRESS)
    public ResUsersDTO setContactAddress(String val) {
        this._set(FIELD_CONTACT_ADDRESS, val);
        return this;
    }

    /**
     * 获取「完整地址」值
     *
     */
    @JsonIgnore
    public String getContactAddress() {
        return DataTypeUtils.asString(this._get(FIELD_CONTACT_ADDRESS), null);
    }

    /**
     * 判断 「完整地址」是否有值
     *
     */
    @JsonIgnore
    public boolean containsContactAddress() {
        return this._contains(FIELD_CONTACT_ADDRESS);
    }

    /**
     * 重置 「完整地址」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetContactAddress() {
        this._reset(FIELD_CONTACT_ADDRESS);
        return this;
    }

    /**
     * 设置「内嵌完整地址」
     * @param val
     */
    @JsonProperty(FIELD_CONTACT_ADDRESS_INLINE)
    public ResUsersDTO setContactAddressInline(String val) {
        this._set(FIELD_CONTACT_ADDRESS_INLINE, val);
        return this;
    }

    /**
     * 获取「内嵌完整地址」值
     *
     */
    @JsonIgnore
    public String getContactAddressInline() {
        return DataTypeUtils.asString(this._get(FIELD_CONTACT_ADDRESS_INLINE), null);
    }

    /**
     * 判断 「内嵌完整地址」是否有值
     *
     */
    @JsonIgnore
    public boolean containsContactAddressInline() {
        return this._contains(FIELD_CONTACT_ADDRESS_INLINE);
    }

    /**
     * 重置 「内嵌完整地址」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetContactAddressInline() {
        this._reset(FIELD_CONTACT_ADDRESS_INLINE);
        return this;
    }

    /**
     * 设置「国家/地区」
     * @param val
     */
    @JsonProperty(FIELD_COUNTRY_ID)
    public ResUsersDTO setCountryId(String val) {
        this._set(FIELD_COUNTRY_ID, val);
        return this;
    }

    /**
     * 获取「国家/地区」值
     *
     */
    @JsonIgnore
    public String getCountryId() {
        return DataTypeUtils.asString(this._get(FIELD_COUNTRY_ID), null);
    }

    /**
     * 判断 「国家/地区」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCountryId() {
        return this._contains(FIELD_COUNTRY_ID);
    }

    /**
     * 重置 「国家/地区」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetCountryId() {
        this._reset(FIELD_COUNTRY_ID);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public ResUsersDTO setCreateDate(Timestamp val) {
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
    public ResUsersDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「技术领域，是否创建员工」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_CREATE_EMPLOYEE)
    public ResUsersDTO setCreateEmployee(Integer val) {
        this._set(FIELD_CREATE_EMPLOYEE, val);
        return this;
    }

    /**
     * 获取「技术领域，是否创建员工」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getCreateEmployee() {
        return DataTypeUtils.asInteger(this._get(FIELD_CREATE_EMPLOYEE), null);
    }

    /**
     * 判断 「技术领域，是否创建员工」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCreateEmployee() {
        return this._contains(FIELD_CREATE_EMPLOYEE);
    }

    /**
     * 重置 「技术领域，是否创建员工」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetCreateEmployee() {
        this._reset(FIELD_CREATE_EMPLOYEE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public ResUsersDTO setCreateUid(String val) {
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
    public ResUsersDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「应收账款总计」
     * @param val
     */
    @JsonProperty(FIELD_CREDIT)
    public ResUsersDTO setCredit(BigDecimal val) {
        this._set(FIELD_CREDIT, val);
        return this;
    }

    /**
     * 获取「应收账款总计」值
     *
     */
    @JsonIgnore
    public BigDecimal getCredit() {
        return DataTypeUtils.asBigDecimal(this._get(FIELD_CREDIT), null);
    }

    /**
     * 判断 「应收账款总计」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCredit() {
        return this._contains(FIELD_CREDIT);
    }

    /**
     * 重置 「应收账款总计」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetCredit() {
        this._reset(FIELD_CREDIT);
        return this;
    }

    /**
     * 设置「信贷额度」
     * @param val
     */
    @JsonProperty(FIELD_CREDIT_LIMIT)
    public ResUsersDTO setCreditLimit(Double val) {
        this._set(FIELD_CREDIT_LIMIT, val);
        return this;
    }

    /**
     * 获取「信贷额度」值
     *
     */
    @JsonIgnore
    public Double getCreditLimit() {
        return DataTypeUtils.asDouble(this._get(FIELD_CREDIT_LIMIT), null);
    }

    /**
     * 判断 「信贷额度」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCreditLimit() {
        return this._contains(FIELD_CREDIT_LIMIT);
    }

    /**
     * 重置 「信贷额度」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetCreditLimit() {
        this._reset(FIELD_CREDIT_LIMIT);
        return this;
    }

    /**
     * 设置「贷记入发票」
     * @param val
     */
    @JsonProperty(FIELD_CREDIT_TO_INVOICE)
    public ResUsersDTO setCreditToInvoice(BigDecimal val) {
        this._set(FIELD_CREDIT_TO_INVOICE, val);
        return this;
    }

    /**
     * 获取「贷记入发票」值
     *
     */
    @JsonIgnore
    public BigDecimal getCreditToInvoice() {
        return DataTypeUtils.asBigDecimal(this._get(FIELD_CREDIT_TO_INVOICE), null);
    }

    /**
     * 判断 「贷记入发票」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCreditToInvoice() {
        return this._contains(FIELD_CREDIT_TO_INVOICE);
    }

    /**
     * 重置 「贷记入发票」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetCreditToInvoice() {
        this._reset(FIELD_CREDIT_TO_INVOICE);
        return this;
    }

    /**
     * 设置「客户等级」
     * @param val
     */
    @JsonProperty(FIELD_CUSTOMER_RANK)
    public ResUsersDTO setCustomerRank(Integer val) {
        this._set(FIELD_CUSTOMER_RANK, val);
        return this;
    }

    /**
     * 获取「客户等级」值
     *
     */
    @JsonIgnore
    public Integer getCustomerRank() {
        return DataTypeUtils.asInteger(this._get(FIELD_CUSTOMER_RANK), null);
    }

    /**
     * 判断 「客户等级」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCustomerRank() {
        return this._contains(FIELD_CUSTOMER_RANK);
    }

    /**
     * 重置 「客户等级」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetCustomerRank() {
        this._reset(FIELD_CUSTOMER_RANK);
        return this;
    }

    /**
     * 设置「销售变现天数（DSO）」
     * @param val
     */
    @JsonProperty(FIELD_DAYS_SALES_OUTSTANDING)
    public ResUsersDTO setDaysSalesOutstanding(Double val) {
        this._set(FIELD_DAYS_SALES_OUTSTANDING, val);
        return this;
    }

    /**
     * 获取「销售变现天数（DSO）」值
     *
     */
    @JsonIgnore
    public Double getDaysSalesOutstanding() {
        return DataTypeUtils.asDouble(this._get(FIELD_DAYS_SALES_OUTSTANDING), null);
    }

    /**
     * 判断 「销售变现天数（DSO）」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDaysSalesOutstanding() {
        return this._contains(FIELD_DAYS_SALES_OUTSTANDING);
    }

    /**
     * 重置 「销售变现天数（DSO）」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetDaysSalesOutstanding() {
        this._reset(FIELD_DAYS_SALES_OUTSTANDING);
        return this;
    }

    /**
     * 设置「应付账款总计」
     * @param val
     */
    @JsonProperty(FIELD_DEBIT)
    public ResUsersDTO setDebit(BigDecimal val) {
        this._set(FIELD_DEBIT, val);
        return this;
    }

    /**
     * 获取「应付账款总计」值
     *
     */
    @JsonIgnore
    public BigDecimal getDebit() {
        return DataTypeUtils.asBigDecimal(this._get(FIELD_DEBIT), null);
    }

    /**
     * 判断 「应付账款总计」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDebit() {
        return this._contains(FIELD_DEBIT);
    }

    /**
     * 重置 「应付账款总计」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetDebit() {
        this._reset(FIELD_DEBIT);
        return this;
    }

    /**
     * 设置「应付账款限额」
     * @param val
     */
    @JsonProperty(FIELD_DEBIT_LIMIT)
    public ResUsersDTO setDebitLimit(BigDecimal val) {
        this._set(FIELD_DEBIT_LIMIT, val);
        return this;
    }

    /**
     * 获取「应付账款限额」值
     *
     */
    @JsonIgnore
    public BigDecimal getDebitLimit() {
        return DataTypeUtils.asBigDecimal(this._get(FIELD_DEBIT_LIMIT), null);
    }

    /**
     * 判断 「应付账款限额」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDebitLimit() {
        return this._contains(FIELD_DEBIT_LIMIT);
    }

    /**
     * 重置 「应付账款限额」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetDebitLimit() {
        this._reset(FIELD_DEBIT_LIMIT);
        return this;
    }

    /**
     * 设置「显示发票 Edi 格式」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_INVOICE_EDI_FORMAT)
    public ResUsersDTO setDisplayInvoiceEdiFormat(Integer val) {
        this._set(FIELD_DISPLAY_INVOICE_EDI_FORMAT, val);
        return this;
    }

    /**
     * 获取「显示发票 Edi 格式」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getDisplayInvoiceEdiFormat() {
        return DataTypeUtils.asInteger(this._get(FIELD_DISPLAY_INVOICE_EDI_FORMAT), null);
    }

    /**
     * 判断 「显示发票 Edi 格式」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDisplayInvoiceEdiFormat() {
        return this._contains(FIELD_DISPLAY_INVOICE_EDI_FORMAT);
    }

    /**
     * 重置 「显示发票 Edi 格式」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetDisplayInvoiceEdiFormat() {
        this._reset(FIELD_DISPLAY_INVOICE_EDI_FORMAT);
        return this;
    }

    /**
     * 设置「Display Invoice Template Pdf Report」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_INVOICE_TEMPLATE_PDF_REPORT_ID)
    public ResUsersDTO setDisplayInvoiceTemplatePdfReportId(Integer val) {
        this._set(FIELD_DISPLAY_INVOICE_TEMPLATE_PDF_REPORT_ID, val);
        return this;
    }

    /**
     * 获取「Display Invoice Template Pdf Report」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getDisplayInvoiceTemplatePdfReportId() {
        return DataTypeUtils.asInteger(this._get(FIELD_DISPLAY_INVOICE_TEMPLATE_PDF_REPORT_ID), null);
    }

    /**
     * 判断 「Display Invoice Template Pdf Report」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDisplayInvoiceTemplatePdfReportId() {
        return this._contains(FIELD_DISPLAY_INVOICE_TEMPLATE_PDF_REPORT_ID);
    }

    /**
     * 重置 「Display Invoice Template Pdf Report」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetDisplayInvoiceTemplatePdfReportId() {
        this._reset(FIELD_DISPLAY_INVOICE_TEMPLATE_PDF_REPORT_ID);
        return this;
    }

    /**
     * 设置「Duplicated Bank Account Partners Count」
     * @param val
     */
    @JsonProperty(FIELD_DUPLICATED_BANK_ACCOUNT_PARTNERS_COUNT)
    public ResUsersDTO setDuplicatedBankAccountPartnersCount(Integer val) {
        this._set(FIELD_DUPLICATED_BANK_ACCOUNT_PARTNERS_COUNT, val);
        return this;
    }

    /**
     * 获取「Duplicated Bank Account Partners Count」值
     *
     */
    @JsonIgnore
    public Integer getDuplicatedBankAccountPartnersCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_DUPLICATED_BANK_ACCOUNT_PARTNERS_COUNT), null);
    }

    /**
     * 判断 「Duplicated Bank Account Partners Count」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDuplicatedBankAccountPartnersCount() {
        return this._contains(FIELD_DUPLICATED_BANK_ACCOUNT_PARTNERS_COUNT);
    }

    /**
     * 重置 「Duplicated Bank Account Partners Count」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetDuplicatedBankAccountPartnersCount() {
        this._reset(FIELD_DUPLICATED_BANK_ACCOUNT_PARTNERS_COUNT);
        return this;
    }

    /**
     * 设置「邮箱」
     * @param val
     */
    @JsonProperty(FIELD_EMAIL)
    public ResUsersDTO setEmail(String val) {
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
    public ResUsersDTO resetEmail() {
        this._reset(FIELD_EMAIL);
        return this;
    }

    /**
     * 设置「格式化邮件」
     * @param val
     */
    @JsonProperty(FIELD_EMAIL_FORMATTED)
    public ResUsersDTO setEmailFormatted(String val) {
        this._set(FIELD_EMAIL_FORMATTED, val);
        return this;
    }

    /**
     * 获取「格式化邮件」值
     *
     */
    @JsonIgnore
    public String getEmailFormatted() {
        return DataTypeUtils.asString(this._get(FIELD_EMAIL_FORMATTED), null);
    }

    /**
     * 判断 「格式化邮件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEmailFormatted() {
        return this._contains(FIELD_EMAIL_FORMATTED);
    }

    /**
     * 重置 「格式化邮件」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetEmailFormatted() {
        this._reset(FIELD_EMAIL_FORMATTED);
        return this;
    }

    /**
     * 设置「规范化邮件」
     * @param val
     */
    @JsonProperty(FIELD_EMAIL_NORMALIZED)
    public ResUsersDTO setEmailNormalized(String val) {
        this._set(FIELD_EMAIL_NORMALIZED, val);
        return this;
    }

    /**
     * 获取「规范化邮件」值
     *
     */
    @JsonIgnore
    public String getEmailNormalized() {
        return DataTypeUtils.asString(this._get(FIELD_EMAIL_NORMALIZED), null);
    }

    /**
     * 判断 「规范化邮件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEmailNormalized() {
        return this._contains(FIELD_EMAIL_NORMALIZED);
    }

    /**
     * 重置 「规范化邮件」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetEmailNormalized() {
        this._reset(FIELD_EMAIL_NORMALIZED);
        return this;
    }

    /**
     * 设置「员工」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_EMPLOYEE)
    public ResUsersDTO setEmployee(Integer val) {
        this._set(FIELD_EMPLOYEE, val);
        return this;
    }

    /**
     * 获取「员工」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getEmployee() {
        return DataTypeUtils.asInteger(this._get(FIELD_EMPLOYEE), null);
    }

    /**
     * 判断 「员工」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEmployee() {
        return this._contains(FIELD_EMPLOYEE);
    }

    /**
     * 重置 「员工」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetEmployee() {
        this._reset(FIELD_EMPLOYEE);
        return this;
    }

    /**
     * 设置「员工人数」
     * @param val
     */
    @JsonProperty(FIELD_EMPLOYEE_COUNT)
    public ResUsersDTO setEmployeeCount(Integer val) {
        this._set(FIELD_EMPLOYEE_COUNT, val);
        return this;
    }

    /**
     * 获取「员工人数」值
     *
     */
    @JsonIgnore
    public Integer getEmployeeCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_EMPLOYEE_COUNT), null);
    }

    /**
     * 判断 「员工人数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEmployeeCount() {
        return this._contains(FIELD_EMPLOYEE_COUNT);
    }

    /**
     * 重置 「员工人数」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetEmployeeCount() {
        this._reset(FIELD_EMPLOYEE_COUNT);
        return this;
    }

    /**
     * 设置「员工数量」
     * @param val
     */
    @JsonProperty(FIELD_EMPLOYEES_COUNT)
    public ResUsersDTO setEmployeesCount(Integer val) {
        this._set(FIELD_EMPLOYEES_COUNT, val);
        return this;
    }

    /**
     * 获取「员工数量」值
     *
     */
    @JsonIgnore
    public Integer getEmployeesCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_EMPLOYEES_COUNT), null);
    }

    /**
     * 判断 「员工数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEmployeesCount() {
        return this._contains(FIELD_EMPLOYEES_COUNT);
    }

    /**
     * 重置 「员工数量」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetEmployeesCount() {
        this._reset(FIELD_EMPLOYEES_COUNT);
        return this;
    }

    /**
     * 设置「会计所在国家/地区代码」
     * @param val
     */
    @JsonProperty(FIELD_FISCAL_COUNTRY_CODES)
    public ResUsersDTO setFiscalCountryCodes(String val) {
        this._set(FIELD_FISCAL_COUNTRY_CODES, val);
        return this;
    }

    /**
     * 获取「会计所在国家/地区代码」值
     *
     */
    @JsonIgnore
    public String getFiscalCountryCodes() {
        return DataTypeUtils.asString(this._get(FIELD_FISCAL_COUNTRY_CODES), null);
    }

    /**
     * 判断 「会计所在国家/地区代码」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFiscalCountryCodes() {
        return this._contains(FIELD_FISCAL_COUNTRY_CODES);
    }

    /**
     * 重置 「会计所在国家/地区代码」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetFiscalCountryCodes() {
        this._reset(FIELD_FISCAL_COUNTRY_CODES);
        return this;
    }

    /**
     * 设置「工作职位」
     * @param val
     */
    @JsonProperty(FIELD_FUNCTION)
    public ResUsersDTO setFunction(String val) {
        this._set(FIELD_FUNCTION, val);
        return this;
    }

    /**
     * 获取「工作职位」值
     *
     */
    @JsonIgnore
    public String getFunction() {
        return DataTypeUtils.asString(this._get(FIELD_FUNCTION), null);
    }

    /**
     * 判断 「工作职位」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFunction() {
        return this._contains(FIELD_FUNCTION);
    }

    /**
     * 重置 「工作职位」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetFunction() {
        this._reset(FIELD_FUNCTION);
        return this;
    }

    /**
     * 设置「金质徽标数量」
     * @param val
     */
    @JsonProperty(FIELD_GOLD_BADGE)
    public ResUsersDTO setGoldBadge(Integer val) {
        this._set(FIELD_GOLD_BADGE, val);
        return this;
    }

    /**
     * 获取「金质徽标数量」值
     *
     */
    @JsonIgnore
    public Integer getGoldBadge() {
        return DataTypeUtils.asInteger(this._get(FIELD_GOLD_BADGE), null);
    }

    /**
     * 判断 「金质徽标数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGoldBadge() {
        return this._contains(FIELD_GOLD_BADGE);
    }

    /**
     * 重置 「金质徽标数量」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetGoldBadge() {
        this._reset(FIELD_GOLD_BADGE);
        return this;
    }

    /**
     * 设置「# 分组」
     * @param val
     */
    @JsonProperty(FIELD_GROUPS_COUNT)
    public ResUsersDTO setGroupsCount(Integer val) {
        this._set(FIELD_GROUPS_COUNT, val);
        return this;
    }

    /**
     * 获取「# 分组」值
     *
     */
    @JsonIgnore
    public Integer getGroupsCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUPS_COUNT), null);
    }

    /**
     * 判断 「# 分组」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupsCount() {
        return this._contains(FIELD_GROUPS_COUNT);
    }

    /**
     * 重置 「# 分组」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetGroupsCount() {
        this._reset(FIELD_GROUPS_COUNT);
        return this;
    }

    /**
     * 设置「有消息」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_HAS_MESSAGE)
    public ResUsersDTO setHasMessage(Integer val) {
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
    public ResUsersDTO resetHasMessage() {
        this._reset(FIELD_HAS_MESSAGE);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public ResUsersDTO setId(String val) {
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
    public ResUsersDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「Ignore Abnormal Invoice Amount」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IGNORE_ABNORMAL_INVOICE_AMOUNT)
    public ResUsersDTO setIgnoreAbnormalInvoiceAmount(Integer val) {
        this._set(FIELD_IGNORE_ABNORMAL_INVOICE_AMOUNT, val);
        return this;
    }

    /**
     * 获取「Ignore Abnormal Invoice Amount」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIgnoreAbnormalInvoiceAmount() {
        return DataTypeUtils.asInteger(this._get(FIELD_IGNORE_ABNORMAL_INVOICE_AMOUNT), null);
    }

    /**
     * 判断 「Ignore Abnormal Invoice Amount」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIgnoreAbnormalInvoiceAmount() {
        return this._contains(FIELD_IGNORE_ABNORMAL_INVOICE_AMOUNT);
    }

    /**
     * 重置 「Ignore Abnormal Invoice Amount」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetIgnoreAbnormalInvoiceAmount() {
        this._reset(FIELD_IGNORE_ABNORMAL_INVOICE_AMOUNT);
        return this;
    }

    /**
     * 设置「Ignore Abnormal Invoice Date」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IGNORE_ABNORMAL_INVOICE_DATE)
    public ResUsersDTO setIgnoreAbnormalInvoiceDate(Integer val) {
        this._set(FIELD_IGNORE_ABNORMAL_INVOICE_DATE, val);
        return this;
    }

    /**
     * 获取「Ignore Abnormal Invoice Date」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIgnoreAbnormalInvoiceDate() {
        return DataTypeUtils.asInteger(this._get(FIELD_IGNORE_ABNORMAL_INVOICE_DATE), null);
    }

    /**
     * 判断 「Ignore Abnormal Invoice Date」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIgnoreAbnormalInvoiceDate() {
        return this._contains(FIELD_IGNORE_ABNORMAL_INVOICE_DATE);
    }

    /**
     * 重置 「Ignore Abnormal Invoice Date」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetIgnoreAbnormalInvoiceDate() {
        this._reset(FIELD_IGNORE_ABNORMAL_INVOICE_DATE);
        return this;
    }

    /**
     * 设置「IM的状态」
     * @param val
     */
    @JsonProperty(FIELD_IM_STATUS)
    public ResUsersDTO setImStatus(String val) {
        this._set(FIELD_IM_STATUS, val);
        return this;
    }

    /**
     * 获取「IM的状态」值
     *
     */
    @JsonIgnore
    public String getImStatus() {
        return DataTypeUtils.asString(this._get(FIELD_IM_STATUS), null);
    }

    /**
     * 判断 「IM的状态」是否有值
     *
     */
    @JsonIgnore
    public boolean containsImStatus() {
        return this._contains(FIELD_IM_STATUS);
    }

    /**
     * 重置 「IM的状态」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetImStatus() {
        this._reset(FIELD_IM_STATUS);
        return this;
    }

    /**
     * 设置「行业」
     * @param val
     */
    @JsonProperty(FIELD_INDUSTRY_ID)
    public ResUsersDTO setIndustryId(String val) {
        this._set(FIELD_INDUSTRY_ID, val);
        return this;
    }

    /**
     * 获取「行业」值
     *
     */
    @JsonIgnore
    public String getIndustryId() {
        return DataTypeUtils.asString(this._get(FIELD_INDUSTRY_ID), null);
    }

    /**
     * 判断 「行业」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIndustryId() {
        return this._contains(FIELD_INDUSTRY_ID);
    }

    /**
     * 重置 「行业」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetIndustryId() {
        this._reset(FIELD_INDUSTRY_ID);
        return this;
    }

    /**
     * 设置「电子发票格式」
     * 代码表[电子发票格式]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_invoice_edi_format
     * @param val
     */
    @JsonProperty(FIELD_INVOICE_EDI_FORMAT)
    public ResUsersDTO setInvoiceEdiFormat(String val) {
        this._set(FIELD_INVOICE_EDI_FORMAT, val);
        return this;
    }

    /**
     * 获取「电子发票格式」值
     * 代码表[电子发票格式]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_invoice_edi_format
     *
     */
    @JsonIgnore
    public String getInvoiceEdiFormat() {
        return DataTypeUtils.asString(this._get(FIELD_INVOICE_EDI_FORMAT), null);
    }

    /**
     * 判断 「电子发票格式」是否有值
     *
     */
    @JsonIgnore
    public boolean containsInvoiceEdiFormat() {
        return this._contains(FIELD_INVOICE_EDI_FORMAT);
    }

    /**
     * 重置 「电子发票格式」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetInvoiceEdiFormat() {
        this._reset(FIELD_INVOICE_EDI_FORMAT);
        return this;
    }

    /**
     * 设置「发票 EDI 格式商店」
     * @param val
     */
    @JsonProperty(FIELD_INVOICE_EDI_FORMAT_STORE)
    public ResUsersDTO setInvoiceEdiFormatStore(String val) {
        this._set(FIELD_INVOICE_EDI_FORMAT_STORE, val);
        return this;
    }

    /**
     * 获取「发票 EDI 格式商店」值
     *
     */
    @JsonIgnore
    public String getInvoiceEdiFormatStore() {
        return DataTypeUtils.asString(this._get(FIELD_INVOICE_EDI_FORMAT_STORE), null);
    }

    /**
     * 判断 「发票 EDI 格式商店」是否有值
     *
     */
    @JsonIgnore
    public boolean containsInvoiceEdiFormatStore() {
        return this._contains(FIELD_INVOICE_EDI_FORMAT_STORE);
    }

    /**
     * 重置 「发票 EDI 格式商店」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetInvoiceEdiFormatStore() {
        this._reset(FIELD_INVOICE_EDI_FORMAT_STORE);
        return this;
    }

    /**
     * 设置「传送发票」
     * 代码表[传送发票]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_invoice_sending_method
     * @param val
     */
    @JsonProperty(FIELD_INVOICE_SENDING_METHOD)
    public ResUsersDTO setInvoiceSendingMethod(String val) {
        this._set(FIELD_INVOICE_SENDING_METHOD, val);
        return this;
    }

    /**
     * 获取「传送发票」值
     * 代码表[传送发票]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_invoice_sending_method
     *
     */
    @JsonIgnore
    public String getInvoiceSendingMethod() {
        return DataTypeUtils.asString(this._get(FIELD_INVOICE_SENDING_METHOD), null);
    }

    /**
     * 判断 「传送发票」是否有值
     *
     */
    @JsonIgnore
    public boolean containsInvoiceSendingMethod() {
        return this._contains(FIELD_INVOICE_SENDING_METHOD);
    }

    /**
     * 重置 「传送发票」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetInvoiceSendingMethod() {
        this._reset(FIELD_INVOICE_SENDING_METHOD);
        return this;
    }

    /**
     * 设置「发票」
     * 代码表[发票]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_invoice_warn
     * @param val
     */
    @JsonProperty(FIELD_INVOICE_WARN)
    public ResUsersDTO setInvoiceWarn(String val) {
        this._set(FIELD_INVOICE_WARN, val);
        return this;
    }

    /**
     * 获取「发票」值
     * 代码表[发票]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_invoice_warn
     *
     */
    @JsonIgnore
    public String getInvoiceWarn() {
        return DataTypeUtils.asString(this._get(FIELD_INVOICE_WARN), null);
    }

    /**
     * 判断 「发票」是否有值
     *
     */
    @JsonIgnore
    public boolean containsInvoiceWarn() {
        return this._contains(FIELD_INVOICE_WARN);
    }

    /**
     * 重置 「发票」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetInvoiceWarn() {
        this._reset(FIELD_INVOICE_WARN);
        return this;
    }

    /**
     * 设置「发票消息」
     * @param val
     */
    @JsonProperty(FIELD_INVOICE_WARN_MSG)
    public ResUsersDTO setInvoiceWarnMsg(String val) {
        this._set(FIELD_INVOICE_WARN_MSG, val);
        return this;
    }

    /**
     * 获取「发票消息」值
     *
     */
    @JsonIgnore
    public String getInvoiceWarnMsg() {
        return DataTypeUtils.asString(this._get(FIELD_INVOICE_WARN_MSG), null);
    }

    /**
     * 判断 「发票消息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsInvoiceWarnMsg() {
        return this._contains(FIELD_INVOICE_WARN_MSG);
    }

    /**
     * 重置 「发票消息」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetInvoiceWarnMsg() {
        this._reset(FIELD_INVOICE_WARN_MSG);
        return this;
    }

    /**
     * 设置「黑名单」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_BLACKLISTED)
    public ResUsersDTO setIsBlacklisted(Integer val) {
        this._set(FIELD_IS_BLACKLISTED, val);
        return this;
    }

    /**
     * 获取「黑名单」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsBlacklisted() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_BLACKLISTED), null);
    }

    /**
     * 判断 「黑名单」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsBlacklisted() {
        return this._contains(FIELD_IS_BLACKLISTED);
    }

    /**
     * 重置 「黑名单」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetIsBlacklisted() {
        this._reset(FIELD_IS_BLACKLISTED);
        return this;
    }

    /**
     * 设置「Is Coa Installed」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_COA_INSTALLED)
    public ResUsersDTO setIsCoaInstalled(Integer val) {
        this._set(FIELD_IS_COA_INSTALLED, val);
        return this;
    }

    /**
     * 获取「Is Coa Installed」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsCoaInstalled() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_COA_INSTALLED), null);
    }

    /**
     * 判断 「Is Coa Installed」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsCoaInstalled() {
        return this._contains(FIELD_IS_COA_INSTALLED);
    }

    /**
     * 重置 「Is Coa Installed」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetIsCoaInstalled() {
        this._reset(FIELD_IS_COA_INSTALLED);
        return this;
    }

    /**
     * 设置「是公司」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_COMPANY)
    public ResUsersDTO setIsCompany(Integer val) {
        this._set(FIELD_IS_COMPANY, val);
        return this;
    }

    /**
     * 获取「是公司」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsCompany() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_COMPANY), null);
    }

    /**
     * 判断 「是公司」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsCompany() {
        return this._contains(FIELD_IS_COMPANY);
    }

    /**
     * 重置 「是公司」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetIsCompany() {
        this._reset(FIELD_IS_COMPANY);
        return this;
    }

    /**
     * 设置「是 Peppol Edi 格式」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_PEPPOL_EDI_FORMAT)
    public ResUsersDTO setIsPeppolEdiFormat(Integer val) {
        this._set(FIELD_IS_PEPPOL_EDI_FORMAT, val);
        return this;
    }

    /**
     * 获取「是 Peppol Edi 格式」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsPeppolEdiFormat() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_PEPPOL_EDI_FORMAT), null);
    }

    /**
     * 判断 「是 Peppol Edi 格式」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsPeppolEdiFormat() {
        return this._contains(FIELD_IS_PEPPOL_EDI_FORMAT);
    }

    /**
     * 重置 「是 Peppol Edi 格式」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetIsPeppolEdiFormat() {
        this._reset(FIELD_IS_PEPPOL_EDI_FORMAT);
        return this;
    }

    /**
     * 设置「是公共」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_PUBLIC)
    public ResUsersDTO setIsPublic(Integer val) {
        this._set(FIELD_IS_PUBLIC, val);
        return this;
    }

    /**
     * 获取「是公共」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsPublic() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_PUBLIC), null);
    }

    /**
     * 判断 「是公共」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsPublic() {
        return this._contains(FIELD_IS_PUBLIC);
    }

    /**
     * 重置 「是公共」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetIsPublic() {
        this._reset(FIELD_IS_PUBLIC);
        return this;
    }

    /**
     * 设置「是系统」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_SYSTEM)
    public ResUsersDTO setIsSystem(Integer val) {
        this._set(FIELD_IS_SYSTEM, val);
        return this;
    }

    /**
     * 获取「是系统」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsSystem() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_SYSTEM), null);
    }

    /**
     * 判断 「是系统」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsSystem() {
        return this._contains(FIELD_IS_SYSTEM);
    }

    /**
     * 重置 「是系统」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetIsSystem() {
        this._reset(FIELD_IS_SYSTEM);
        return this;
    }

    /**
     * 设置「是 Ubl 格式」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_UBL_FORMAT)
    public ResUsersDTO setIsUblFormat(Integer val) {
        this._set(FIELD_IS_UBL_FORMAT, val);
        return this;
    }

    /**
     * 获取「是 Ubl 格式」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsUblFormat() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_UBL_FORMAT), null);
    }

    /**
     * 判断 「是 Ubl 格式」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsUblFormat() {
        return this._contains(FIELD_IS_UBL_FORMAT);
    }

    /**
     * 重置 「是 Ubl 格式」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetIsUblFormat() {
        this._reset(FIELD_IS_UBL_FORMAT);
        return this;
    }

    /**
     * 设置「日记账项目」
     * @param val
     */
    @JsonProperty(FIELD_JOURNAL_ITEM_COUNT)
    public ResUsersDTO setJournalItemCount(Integer val) {
        this._set(FIELD_JOURNAL_ITEM_COUNT, val);
        return this;
    }

    /**
     * 获取「日记账项目」值
     *
     */
    @JsonIgnore
    public Integer getJournalItemCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_JOURNAL_ITEM_COUNT), null);
    }

    /**
     * 判断 「日记账项目」是否有值
     *
     */
    @JsonIgnore
    public boolean containsJournalItemCount() {
        return this._contains(FIELD_JOURNAL_ITEM_COUNT);
    }

    /**
     * 重置 「日记账项目」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetJournalItemCount() {
        this._reset(FIELD_JOURNAL_ITEM_COUNT);
        return this;
    }

    /**
     * 设置「贡献值」
     * @param val
     */
    @JsonProperty(FIELD_KARMA)
    public ResUsersDTO setKarma(Integer val) {
        this._set(FIELD_KARMA, val);
        return this;
    }

    /**
     * 获取「贡献值」值
     *
     */
    @JsonIgnore
    public Integer getKarma() {
        return DataTypeUtils.asInteger(this._get(FIELD_KARMA), null);
    }

    /**
     * 判断 「贡献值」是否有值
     *
     */
    @JsonIgnore
    public boolean containsKarma() {
        return this._contains(FIELD_KARMA);
    }

    /**
     * 重置 「贡献值」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetKarma() {
        this._reset(FIELD_KARMA);
        return this;
    }

    /**
     * 设置「登录」
     * @param val
     */
    @JsonProperty(FIELD_LOGIN)
    public ResUsersDTO setLogin(String val) {
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
    public ResUsersDTO resetLogin() {
        this._reset(FIELD_LOGIN);
        return this;
    }

    /**
     * 设置「# 会议」
     * @param val
     */
    @JsonProperty(FIELD_MEETING_COUNT)
    public ResUsersDTO setMeetingCount(Integer val) {
        this._set(FIELD_MEETING_COUNT, val);
        return this;
    }

    /**
     * 获取「# 会议」值
     *
     */
    @JsonIgnore
    public Integer getMeetingCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_MEETING_COUNT), null);
    }

    /**
     * 判断 「# 会议」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMeetingCount() {
        return this._contains(FIELD_MEETING_COUNT);
    }

    /**
     * 重置 「# 会议」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetMeetingCount() {
        this._reset(FIELD_MEETING_COUNT);
        return this;
    }

    /**
     * 设置「附件数量」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_ATTACHMENT_COUNT)
    public ResUsersDTO setMessageAttachmentCount(Integer val) {
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
    public ResUsersDTO resetMessageAttachmentCount() {
        this._reset(FIELD_MESSAGE_ATTACHMENT_COUNT);
        return this;
    }

    /**
     * 设置「退回」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_BOUNCE)
    public ResUsersDTO setMessageBounce(Integer val) {
        this._set(FIELD_MESSAGE_BOUNCE, val);
        return this;
    }

    /**
     * 获取「退回」值
     *
     */
    @JsonIgnore
    public Integer getMessageBounce() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_BOUNCE), null);
    }

    /**
     * 判断 「退回」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageBounce() {
        return this._contains(FIELD_MESSAGE_BOUNCE);
    }

    /**
     * 重置 「退回」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetMessageBounce() {
        this._reset(FIELD_MESSAGE_BOUNCE);
        return this;
    }

    /**
     * 设置「消息发送错误」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_HAS_ERROR)
    public ResUsersDTO setMessageHasError(Integer val) {
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
    public ResUsersDTO resetMessageHasError() {
        this._reset(FIELD_MESSAGE_HAS_ERROR);
        return this;
    }

    /**
     * 设置「错误数量」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_HAS_ERROR_COUNTER)
    public ResUsersDTO setMessageHasErrorCounter(Integer val) {
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
    public ResUsersDTO resetMessageHasErrorCounter() {
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
    public ResUsersDTO setMessageHasSmsError(Integer val) {
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
    public ResUsersDTO resetMessageHasSmsError() {
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
    public ResUsersDTO setMessageIsFollower(Integer val) {
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
    public ResUsersDTO resetMessageIsFollower() {
        this._reset(FIELD_MESSAGE_IS_FOLLOWER);
        return this;
    }

    /**
     * 设置「待处理」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_NEEDACTION)
    public ResUsersDTO setMessageNeedaction(Integer val) {
        this._set(FIELD_MESSAGE_NEEDACTION, val);
        return this;
    }

    /**
     * 获取「待处理」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getMessageNeedaction() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_NEEDACTION), null);
    }

    /**
     * 判断 「待处理」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageNeedaction() {
        return this._contains(FIELD_MESSAGE_NEEDACTION);
    }

    /**
     * 重置 「待处理」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetMessageNeedaction() {
        this._reset(FIELD_MESSAGE_NEEDACTION);
        return this;
    }

    /**
     * 设置「操作数量」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_NEEDACTION_COUNTER)
    public ResUsersDTO setMessageNeedactionCounter(Integer val) {
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
    public ResUsersDTO resetMessageNeedactionCounter() {
        this._reset(FIELD_MESSAGE_NEEDACTION_COUNTER);
        return this;
    }

    /**
     * 设置「手机」
     * @param val
     */
    @JsonProperty(FIELD_MOBILE)
    public ResUsersDTO setMobile(String val) {
        this._set(FIELD_MOBILE, val);
        return this;
    }

    /**
     * 获取「手机」值
     *
     */
    @JsonIgnore
    public String getMobile() {
        return DataTypeUtils.asString(this._get(FIELD_MOBILE), null);
    }

    /**
     * 判断 「手机」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMobile() {
        return this._contains(FIELD_MOBILE);
    }

    /**
     * 重置 「手机」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetMobile() {
        this._reset(FIELD_MOBILE);
        return this;
    }

    /**
     * 设置「列入黑名单的手机是移动的」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MOBILE_BLACKLISTED)
    public ResUsersDTO setMobileBlacklisted(Integer val) {
        this._set(FIELD_MOBILE_BLACKLISTED, val);
        return this;
    }

    /**
     * 获取「列入黑名单的手机是移动的」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getMobileBlacklisted() {
        return DataTypeUtils.asInteger(this._get(FIELD_MOBILE_BLACKLISTED), null);
    }

    /**
     * 判断 「列入黑名单的手机是移动的」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMobileBlacklisted() {
        return this._contains(FIELD_MOBILE_BLACKLISTED);
    }

    /**
     * 重置 「列入黑名单的手机是移动的」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetMobileBlacklisted() {
        this._reset(FIELD_MOBILE_BLACKLISTED);
        return this;
    }

    /**
     * 设置「我的活动截止时间」
     * @param val
     */
    @JsonProperty(FIELD_MY_ACTIVITY_DATE_DEADLINE)
    public ResUsersDTO setMyActivityDateDeadline(Timestamp val) {
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
    public ResUsersDTO resetMyActivityDateDeadline() {
        this._reset(FIELD_MY_ACTIVITY_DATE_DEADLINE);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public ResUsersDTO setName(String val) {
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
    public ResUsersDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「设置密码」
     * @param val
     */
    @JsonProperty(FIELD_NEW_PASSWORD)
    public ResUsersDTO setNewPassword(String val) {
        this._set(FIELD_NEW_PASSWORD, val);
        return this;
    }

    /**
     * 获取「设置密码」值
     *
     */
    @JsonIgnore
    public String getNewPassword() {
        return DataTypeUtils.asString(this._get(FIELD_NEW_PASSWORD), null);
    }

    /**
     * 判断 「设置密码」是否有值
     *
     */
    @JsonIgnore
    public boolean containsNewPassword() {
        return this._contains(FIELD_NEW_PASSWORD);
    }

    /**
     * 重置 「设置密码」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetNewPassword() {
        this._reset(FIELD_NEW_PASSWORD);
        return this;
    }

    /**
     * 设置「通知」
     * 代码表[通知]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_users_notification_type
     * @param val
     */
    @JsonProperty(FIELD_NOTIFICATION_TYPE)
    public ResUsersDTO setNotificationType(String val) {
        this._set(FIELD_NOTIFICATION_TYPE, val);
        return this;
    }

    /**
     * 获取「通知」值
     * 代码表[通知]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_users_notification_type
     *
     */
    @JsonIgnore
    public String getNotificationType() {
        return DataTypeUtils.asString(this._get(FIELD_NOTIFICATION_TYPE), null);
    }

    /**
     * 判断 「通知」是否有值
     *
     */
    @JsonIgnore
    public boolean containsNotificationType() {
        return this._contains(FIELD_NOTIFICATION_TYPE);
    }

    /**
     * 重置 「通知」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetNotificationType() {
        this._reset(FIELD_NOTIFICATION_TYPE);
        return this;
    }

    /**
     * 设置「Odoobot 挂了」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ODOOBOT_FAILED)
    public ResUsersDTO setOdoobotFailed(Integer val) {
        this._set(FIELD_ODOOBOT_FAILED, val);
        return this;
    }

    /**
     * 获取「Odoobot 挂了」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getOdoobotFailed() {
        return DataTypeUtils.asInteger(this._get(FIELD_ODOOBOT_FAILED), null);
    }

    /**
     * 判断 「Odoobot 挂了」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOdoobotFailed() {
        return this._contains(FIELD_ODOOBOT_FAILED);
    }

    /**
     * 重置 「Odoobot 挂了」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetOdoobotFailed() {
        this._reset(FIELD_ODOOBOT_FAILED);
        return this;
    }

    /**
     * 设置「小秘书状态」
     * 代码表[小秘书状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_users_odoobot_state
     * @param val
     */
    @JsonProperty(FIELD_ODOOBOT_STATE)
    public ResUsersDTO setOdoobotState(String val) {
        this._set(FIELD_ODOOBOT_STATE, val);
        return this;
    }

    /**
     * 获取「小秘书状态」值
     * 代码表[小秘书状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_users_odoobot_state
     *
     */
    @JsonIgnore
    public String getOdoobotState() {
        return DataTypeUtils.asString(this._get(FIELD_ODOOBOT_STATE), null);
    }

    /**
     * 判断 「小秘书状态」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOdoobotState() {
        return this._contains(FIELD_ODOOBOT_STATE);
    }

    /**
     * 重置 「小秘书状态」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetOdoobotState() {
        this._reset(FIELD_ODOOBOT_STATE);
        return this;
    }

    /**
     * 设置「准时交货率」
     * @param val
     */
    @JsonProperty(FIELD_ON_TIME_RATE)
    public ResUsersDTO setOnTimeRate(Double val) {
        this._set(FIELD_ON_TIME_RATE, val);
        return this;
    }

    /**
     * 获取「准时交货率」值
     *
     */
    @JsonIgnore
    public Double getOnTimeRate() {
        return DataTypeUtils.asDouble(this._get(FIELD_ON_TIME_RATE), null);
    }

    /**
     * 判断 「准时交货率」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOnTimeRate() {
        return this._contains(FIELD_ON_TIME_RATE);
    }

    /**
     * 重置 「准时交货率」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetOnTimeRate() {
        this._reset(FIELD_ON_TIME_RATE);
        return this;
    }

    /**
     * 设置「商机数量」
     * @param val
     */
    @JsonProperty(FIELD_OPPORTUNITY_COUNT)
    public ResUsersDTO setOpportunityCount(Integer val) {
        this._set(FIELD_OPPORTUNITY_COUNT, val);
        return this;
    }

    /**
     * 获取「商机数量」值
     *
     */
    @JsonIgnore
    public Integer getOpportunityCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_OPPORTUNITY_COUNT), null);
    }

    /**
     * 判断 「商机数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOpportunityCount() {
        return this._contains(FIELD_OPPORTUNITY_COUNT);
    }

    /**
     * 重置 「商机数量」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetOpportunityCount() {
        this._reset(FIELD_OPPORTUNITY_COUNT);
        return this;
    }

    /**
     * 设置「相关公司」
     * @param val
     */
    @JsonProperty(FIELD_PARENT_ID)
    public ResUsersDTO setParentId(String val) {
        this._set(FIELD_PARENT_ID, val);
        return this;
    }

    /**
     * 获取「相关公司」值
     *
     */
    @JsonIgnore
    public String getParentId() {
        return DataTypeUtils.asString(this._get(FIELD_PARENT_ID), null);
    }

    /**
     * 判断 「相关公司」是否有值
     *
     */
    @JsonIgnore
    public boolean containsParentId() {
        return this._contains(FIELD_PARENT_ID);
    }

    /**
     * 重置 「相关公司」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetParentId() {
        this._reset(FIELD_PARENT_ID);
        return this;
    }

    /**
     * 设置「合作伙伴公司注册处占位符」
     * @param val
     */
    @JsonProperty(FIELD_PARTNER_COMPANY_REGISTRY_PLACEHOLDER)
    public ResUsersDTO setPartnerCompanyRegistryPlaceholder(String val) {
        this._set(FIELD_PARTNER_COMPANY_REGISTRY_PLACEHOLDER, val);
        return this;
    }

    /**
     * 获取「合作伙伴公司注册处占位符」值
     *
     */
    @JsonIgnore
    public String getPartnerCompanyRegistryPlaceholder() {
        return DataTypeUtils.asString(this._get(FIELD_PARTNER_COMPANY_REGISTRY_PLACEHOLDER), null);
    }

    /**
     * 判断 「合作伙伴公司注册处占位符」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPartnerCompanyRegistryPlaceholder() {
        return this._contains(FIELD_PARTNER_COMPANY_REGISTRY_PLACEHOLDER);
    }

    /**
     * 重置 「合作伙伴公司注册处占位符」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetPartnerCompanyRegistryPlaceholder() {
        this._reset(FIELD_PARTNER_COMPANY_REGISTRY_PLACEHOLDER);
        return this;
    }

    /**
     * 设置「公司数据库ID」
     * @param val
     */
    @JsonProperty(FIELD_PARTNER_GID)
    public ResUsersDTO setPartnerGid(Integer val) {
        this._set(FIELD_PARTNER_GID, val);
        return this;
    }

    /**
     * 获取「公司数据库ID」值
     *
     */
    @JsonIgnore
    public Integer getPartnerGid() {
        return DataTypeUtils.asInteger(this._get(FIELD_PARTNER_GID), null);
    }

    /**
     * 判断 「公司数据库ID」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPartnerGid() {
        return this._contains(FIELD_PARTNER_GID);
    }

    /**
     * 重置 「公司数据库ID」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetPartnerGid() {
        this._reset(FIELD_PARTNER_GID);
        return this;
    }

    /**
     * 设置「相关合作伙伴」
     * @param val
     */
    @JsonProperty(FIELD_PARTNER_ID)
    public ResUsersDTO setPartnerId(String val) {
        this._set(FIELD_PARTNER_ID, val);
        return this;
    }

    /**
     * 获取「相关合作伙伴」值
     *
     */
    @JsonIgnore
    public String getPartnerId() {
        return DataTypeUtils.asString(this._get(FIELD_PARTNER_ID), null);
    }

    /**
     * 判断 「相关合作伙伴」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPartnerId() {
        return this._contains(FIELD_PARTNER_ID);
    }

    /**
     * 重置 「相关合作伙伴」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetPartnerId() {
        this._reset(FIELD_PARTNER_ID);
        return this;
    }

    /**
     * 设置「地理纬度」
     * @param val
     */
    @JsonProperty(FIELD_PARTNER_LATITUDE)
    public ResUsersDTO setPartnerLatitude(Double val) {
        this._set(FIELD_PARTNER_LATITUDE, val);
        return this;
    }

    /**
     * 获取「地理纬度」值
     *
     */
    @JsonIgnore
    public Double getPartnerLatitude() {
        return DataTypeUtils.asDouble(this._get(FIELD_PARTNER_LATITUDE), null);
    }

    /**
     * 判断 「地理纬度」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPartnerLatitude() {
        return this._contains(FIELD_PARTNER_LATITUDE);
    }

    /**
     * 重置 「地理纬度」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetPartnerLatitude() {
        this._reset(FIELD_PARTNER_LATITUDE);
        return this;
    }

    /**
     * 设置「地理经度」
     * @param val
     */
    @JsonProperty(FIELD_PARTNER_LONGITUDE)
    public ResUsersDTO setPartnerLongitude(Double val) {
        this._set(FIELD_PARTNER_LONGITUDE, val);
        return this;
    }

    /**
     * 获取「地理经度」值
     *
     */
    @JsonIgnore
    public Double getPartnerLongitude() {
        return DataTypeUtils.asDouble(this._get(FIELD_PARTNER_LONGITUDE), null);
    }

    /**
     * 判断 「地理经度」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPartnerLongitude() {
        return this._contains(FIELD_PARTNER_LONGITUDE);
    }

    /**
     * 重置 「地理经度」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetPartnerLongitude() {
        this._reset(FIELD_PARTNER_LONGITUDE);
        return this;
    }

    /**
     * 设置「相关合作伙伴」
     * @param val
     */
    @JsonProperty(FIELD_PARTNER_NAME)
    public ResUsersDTO setPartnerName(String val) {
        this._set(FIELD_PARTNER_NAME, val);
        return this;
    }

    /**
     * 获取「相关合作伙伴」值
     *
     */
    @JsonIgnore
    public String getPartnerName() {
        return DataTypeUtils.asString(this._get(FIELD_PARTNER_NAME), null);
    }

    /**
     * 判断 「相关合作伙伴」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPartnerName() {
        return this._contains(FIELD_PARTNER_NAME);
    }

    /**
     * 重置 「相关合作伙伴」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetPartnerName() {
        this._reset(FIELD_PARTNER_NAME);
        return this;
    }

    /**
     * 设置「共享合作伙伴」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_PARTNER_SHARE)
    public ResUsersDTO setPartnerShare(Integer val) {
        this._set(FIELD_PARTNER_SHARE, val);
        return this;
    }

    /**
     * 获取「共享合作伙伴」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getPartnerShare() {
        return DataTypeUtils.asInteger(this._get(FIELD_PARTNER_SHARE), null);
    }

    /**
     * 判断 「共享合作伙伴」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPartnerShare() {
        return this._contains(FIELD_PARTNER_SHARE);
    }

    /**
     * 重置 「共享合作伙伴」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetPartnerShare() {
        this._reset(FIELD_PARTNER_SHARE);
        return this;
    }

    /**
     * 设置「Partner Vat Placeholder」
     * @param val
     */
    @JsonProperty(FIELD_PARTNER_VAT_PLACEHOLDER)
    public ResUsersDTO setPartnerVatPlaceholder(String val) {
        this._set(FIELD_PARTNER_VAT_PLACEHOLDER, val);
        return this;
    }

    /**
     * 获取「Partner Vat Placeholder」值
     *
     */
    @JsonIgnore
    public String getPartnerVatPlaceholder() {
        return DataTypeUtils.asString(this._get(FIELD_PARTNER_VAT_PLACEHOLDER), null);
    }

    /**
     * 判断 「Partner Vat Placeholder」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPartnerVatPlaceholder() {
        return this._contains(FIELD_PARTNER_VAT_PLACEHOLDER);
    }

    /**
     * 重置 「Partner Vat Placeholder」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetPartnerVatPlaceholder() {
        this._reset(FIELD_PARTNER_VAT_PLACEHOLDER);
        return this;
    }

    /**
     * 设置「密码」
     * @param val
     */
    @JsonProperty(FIELD_PASSWORD)
    public ResUsersDTO setPassword(String val) {
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
    public ResUsersDTO resetPassword() {
        this._reset(FIELD_PASSWORD);
        return this;
    }

    /**
     * 设置「支付令牌计数」
     * @param val
     */
    @JsonProperty(FIELD_PAYMENT_TOKEN_COUNT)
    public ResUsersDTO setPaymentTokenCount(Integer val) {
        this._set(FIELD_PAYMENT_TOKEN_COUNT, val);
        return this;
    }

    /**
     * 获取「支付令牌计数」值
     *
     */
    @JsonIgnore
    public Integer getPaymentTokenCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_PAYMENT_TOKEN_COUNT), null);
    }

    /**
     * 判断 「支付令牌计数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPaymentTokenCount() {
        return this._contains(FIELD_PAYMENT_TOKEN_COUNT);
    }

    /**
     * 重置 「支付令牌计数」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetPaymentTokenCount() {
        this._reset(FIELD_PAYMENT_TOKEN_COUNT);
        return this;
    }

    /**
     * 设置「Peppol电子地址（EAS）」
     * 代码表[Peppol电子地址（EAS）]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_peppol_eas
     * @param val
     */
    @JsonProperty(FIELD_PEPPOL_EAS)
    public ResUsersDTO setPeppolEas(String val) {
        this._set(FIELD_PEPPOL_EAS, val);
        return this;
    }

    /**
     * 获取「Peppol电子地址（EAS）」值
     * 代码表[Peppol电子地址（EAS）]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_peppol_eas
     *
     */
    @JsonIgnore
    public String getPeppolEas() {
        return DataTypeUtils.asString(this._get(FIELD_PEPPOL_EAS), null);
    }

    /**
     * 判断 「Peppol电子地址（EAS）」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPeppolEas() {
        return this._contains(FIELD_PEPPOL_EAS);
    }

    /**
     * 重置 「Peppol电子地址（EAS）」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetPeppolEas() {
        this._reset(FIELD_PEPPOL_EAS);
        return this;
    }

    /**
     * 设置「Peppol Endpoint」
     * @param val
     */
    @JsonProperty(FIELD_PEPPOL_ENDPOINT)
    public ResUsersDTO setPeppolEndpoint(String val) {
        this._set(FIELD_PEPPOL_ENDPOINT, val);
        return this;
    }

    /**
     * 获取「Peppol Endpoint」值
     *
     */
    @JsonIgnore
    public String getPeppolEndpoint() {
        return DataTypeUtils.asString(this._get(FIELD_PEPPOL_ENDPOINT), null);
    }

    /**
     * 判断 「Peppol Endpoint」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPeppolEndpoint() {
        return this._contains(FIELD_PEPPOL_ENDPOINT);
    }

    /**
     * 重置 「Peppol Endpoint」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetPeppolEndpoint() {
        this._reset(FIELD_PEPPOL_ENDPOINT);
        return this;
    }

    /**
     * 设置「电话」
     * @param val
     */
    @JsonProperty(FIELD_PHONE)
    public ResUsersDTO setPhone(String val) {
        this._set(FIELD_PHONE, val);
        return this;
    }

    /**
     * 获取「电话」值
     *
     */
    @JsonIgnore
    public String getPhone() {
        return DataTypeUtils.asString(this._get(FIELD_PHONE), null);
    }

    /**
     * 判断 「电话」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPhone() {
        return this._contains(FIELD_PHONE);
    }

    /**
     * 重置 「电话」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetPhone() {
        this._reset(FIELD_PHONE);
        return this;
    }

    /**
     * 设置「列入黑名单的电话是电话」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_PHONE_BLACKLISTED)
    public ResUsersDTO setPhoneBlacklisted(Integer val) {
        this._set(FIELD_PHONE_BLACKLISTED, val);
        return this;
    }

    /**
     * 获取「列入黑名单的电话是电话」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getPhoneBlacklisted() {
        return DataTypeUtils.asInteger(this._get(FIELD_PHONE_BLACKLISTED), null);
    }

    /**
     * 判断 「列入黑名单的电话是电话」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPhoneBlacklisted() {
        return this._contains(FIELD_PHONE_BLACKLISTED);
    }

    /**
     * 重置 「列入黑名单的电话是电话」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetPhoneBlacklisted() {
        this._reset(FIELD_PHONE_BLACKLISTED);
        return this;
    }

    /**
     * 设置「电话/手机」
     * @param val
     */
    @JsonProperty(FIELD_PHONE_MOBILE_SEARCH)
    public ResUsersDTO setPhoneMobileSearch(String val) {
        this._set(FIELD_PHONE_MOBILE_SEARCH, val);
        return this;
    }

    /**
     * 获取「电话/手机」值
     *
     */
    @JsonIgnore
    public String getPhoneMobileSearch() {
        return DataTypeUtils.asString(this._get(FIELD_PHONE_MOBILE_SEARCH), null);
    }

    /**
     * 判断 「电话/手机」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPhoneMobileSearch() {
        return this._contains(FIELD_PHONE_MOBILE_SEARCH);
    }

    /**
     * 重置 「电话/手机」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetPhoneMobileSearch() {
        this._reset(FIELD_PHONE_MOBILE_SEARCH);
        return this;
    }

    /**
     * 设置「净化数量」
     * @param val
     */
    @JsonProperty(FIELD_PHONE_SANITIZED)
    public ResUsersDTO setPhoneSanitized(String val) {
        this._set(FIELD_PHONE_SANITIZED, val);
        return this;
    }

    /**
     * 获取「净化数量」值
     *
     */
    @JsonIgnore
    public String getPhoneSanitized() {
        return DataTypeUtils.asString(this._get(FIELD_PHONE_SANITIZED), null);
    }

    /**
     * 判断 「净化数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPhoneSanitized() {
        return this._contains(FIELD_PHONE_SANITIZED);
    }

    /**
     * 重置 「净化数量」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetPhoneSanitized() {
        this._reset(FIELD_PHONE_SANITIZED);
        return this;
    }

    /**
     * 设置「电话加黑」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_PHONE_SANITIZED_BLACKLISTED)
    public ResUsersDTO setPhoneSanitizedBlacklisted(Integer val) {
        this._set(FIELD_PHONE_SANITIZED_BLACKLISTED, val);
        return this;
    }

    /**
     * 获取「电话加黑」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getPhoneSanitizedBlacklisted() {
        return DataTypeUtils.asInteger(this._get(FIELD_PHONE_SANITIZED_BLACKLISTED), null);
    }

    /**
     * 判断 「电话加黑」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPhoneSanitizedBlacklisted() {
        return this._contains(FIELD_PHONE_SANITIZED_BLACKLISTED);
    }

    /**
     * 重置 「电话加黑」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetPhoneSanitizedBlacklisted() {
        this._reset(FIELD_PHONE_SANITIZED_BLACKLISTED);
        return this;
    }

    /**
     * 设置「库存拣货」
     * 代码表[库存拣货]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_picking_warn
     * @param val
     */
    @JsonProperty(FIELD_PICKING_WARN)
    public ResUsersDTO setPickingWarn(String val) {
        this._set(FIELD_PICKING_WARN, val);
        return this;
    }

    /**
     * 获取「库存拣货」值
     * 代码表[库存拣货]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_picking_warn
     *
     */
    @JsonIgnore
    public String getPickingWarn() {
        return DataTypeUtils.asString(this._get(FIELD_PICKING_WARN), null);
    }

    /**
     * 判断 「库存拣货」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPickingWarn() {
        return this._contains(FIELD_PICKING_WARN);
    }

    /**
     * 重置 「库存拣货」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetPickingWarn() {
        this._reset(FIELD_PICKING_WARN);
        return this;
    }

    /**
     * 设置「库存拣货单消息」
     * @param val
     */
    @JsonProperty(FIELD_PICKING_WARN_MSG)
    public ResUsersDTO setPickingWarnMsg(String val) {
        this._set(FIELD_PICKING_WARN_MSG, val);
        return this;
    }

    /**
     * 获取「库存拣货单消息」值
     *
     */
    @JsonIgnore
    public String getPickingWarnMsg() {
        return DataTypeUtils.asString(this._get(FIELD_PICKING_WARN_MSG), null);
    }

    /**
     * 判断 「库存拣货单消息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPickingWarnMsg() {
        return this._contains(FIELD_PICKING_WARN_MSG);
    }

    /**
     * 重置 「库存拣货单消息」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetPickingWarnMsg() {
        this._reset(FIELD_PICKING_WARN_MSG);
        return this;
    }

    /**
     * 设置「计划更换自行车」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_PLAN_TO_CHANGE_BIKE)
    public ResUsersDTO setPlanToChangeBike(Integer val) {
        this._set(FIELD_PLAN_TO_CHANGE_BIKE, val);
        return this;
    }

    /**
     * 获取「计划更换自行车」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getPlanToChangeBike() {
        return DataTypeUtils.asInteger(this._get(FIELD_PLAN_TO_CHANGE_BIKE), null);
    }

    /**
     * 判断 「计划更换自行车」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPlanToChangeBike() {
        return this._contains(FIELD_PLAN_TO_CHANGE_BIKE);
    }

    /**
     * 重置 「计划更换自行车」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetPlanToChangeBike() {
        this._reset(FIELD_PLAN_TO_CHANGE_BIKE);
        return this;
    }

    /**
     * 设置「更换车辆计划」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_PLAN_TO_CHANGE_CAR)
    public ResUsersDTO setPlanToChangeCar(Integer val) {
        this._set(FIELD_PLAN_TO_CHANGE_CAR, val);
        return this;
    }

    /**
     * 获取「更换车辆计划」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getPlanToChangeCar() {
        return DataTypeUtils.asInteger(this._get(FIELD_PLAN_TO_CHANGE_CAR), null);
    }

    /**
     * 判断 「更换车辆计划」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPlanToChangeCar() {
        return this._contains(FIELD_PLAN_TO_CHANGE_CAR);
    }

    /**
     * 重置 「更换车辆计划」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetPlanToChangeCar() {
        this._reset(FIELD_PLAN_TO_CHANGE_CAR);
        return this;
    }

    /**
     * 设置「供应商币别」
     * @param val
     */
    @JsonProperty(FIELD_PROPERTY_PURCHASE_CURRENCY_ID)
    public ResUsersDTO setPropertyPurchaseCurrencyId(String val) {
        this._set(FIELD_PROPERTY_PURCHASE_CURRENCY_ID, val);
        return this;
    }

    /**
     * 获取「供应商币别」值
     *
     */
    @JsonIgnore
    public String getPropertyPurchaseCurrencyId() {
        return DataTypeUtils.asString(this._get(FIELD_PROPERTY_PURCHASE_CURRENCY_ID), null);
    }

    /**
     * 判断 「供应商币别」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPropertyPurchaseCurrencyId() {
        return this._contains(FIELD_PROPERTY_PURCHASE_CURRENCY_ID);
    }

    /**
     * 重置 「供应商币别」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetPropertyPurchaseCurrencyId() {
        this._reset(FIELD_PROPERTY_PURCHASE_CURRENCY_ID);
        return this;
    }

    /**
     * 设置「采购订单数」
     * @param val
     */
    @JsonProperty(FIELD_PURCHASE_ORDER_COUNT)
    public ResUsersDTO setPurchaseOrderCount(Integer val) {
        this._set(FIELD_PURCHASE_ORDER_COUNT, val);
        return this;
    }

    /**
     * 获取「采购订单数」值
     *
     */
    @JsonIgnore
    public Integer getPurchaseOrderCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_PURCHASE_ORDER_COUNT), null);
    }

    /**
     * 判断 「采购订单数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPurchaseOrderCount() {
        return this._contains(FIELD_PURCHASE_ORDER_COUNT);
    }

    /**
     * 重置 「采购订单数」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetPurchaseOrderCount() {
        this._reset(FIELD_PURCHASE_ORDER_COUNT);
        return this;
    }

    /**
     * 设置「采购订单预警」
     * 代码表[采购订单预警]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_purchase_warn
     * @param val
     */
    @JsonProperty(FIELD_PURCHASE_WARN)
    public ResUsersDTO setPurchaseWarn(String val) {
        this._set(FIELD_PURCHASE_WARN, val);
        return this;
    }

    /**
     * 获取「采购订单预警」值
     * 代码表[采购订单预警]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_purchase_warn
     *
     */
    @JsonIgnore
    public String getPurchaseWarn() {
        return DataTypeUtils.asString(this._get(FIELD_PURCHASE_WARN), null);
    }

    /**
     * 判断 「采购订单预警」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPurchaseWarn() {
        return this._contains(FIELD_PURCHASE_WARN);
    }

    /**
     * 重置 「采购订单预警」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetPurchaseWarn() {
        this._reset(FIELD_PURCHASE_WARN);
        return this;
    }

    /**
     * 设置「采购订单消息」
     * @param val
     */
    @JsonProperty(FIELD_PURCHASE_WARN_MSG)
    public ResUsersDTO setPurchaseWarnMsg(String val) {
        this._set(FIELD_PURCHASE_WARN_MSG, val);
        return this;
    }

    /**
     * 获取「采购订单消息」值
     *
     */
    @JsonIgnore
    public String getPurchaseWarnMsg() {
        return DataTypeUtils.asString(this._get(FIELD_PURCHASE_WARN_MSG), null);
    }

    /**
     * 判断 「采购订单消息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPurchaseWarnMsg() {
        return this._contains(FIELD_PURCHASE_WARN_MSG);
    }

    /**
     * 重置 「采购订单消息」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetPurchaseWarnMsg() {
        this._reset(FIELD_PURCHASE_WARN_MSG);
        return this;
    }

    /**
     * 设置「收货提醒」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_RECEIPT_REMINDER_EMAIL)
    public ResUsersDTO setReceiptReminderEmail(Integer val) {
        this._set(FIELD_RECEIPT_REMINDER_EMAIL, val);
        return this;
    }

    /**
     * 获取「收货提醒」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getReceiptReminderEmail() {
        return DataTypeUtils.asInteger(this._get(FIELD_RECEIPT_REMINDER_EMAIL), null);
    }

    /**
     * 判断 「收货提醒」是否有值
     *
     */
    @JsonIgnore
    public boolean containsReceiptReminderEmail() {
        return this._contains(FIELD_RECEIPT_REMINDER_EMAIL);
    }

    /**
     * 重置 「收货提醒」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetReceiptReminderEmail() {
        this._reset(FIELD_RECEIPT_REMINDER_EMAIL);
        return this;
    }

    /**
     * 设置「参考」
     * @param val
     */
    @JsonProperty(FIELD_REF)
    public ResUsersDTO setRef(String val) {
        this._set(FIELD_REF, val);
        return this;
    }

    /**
     * 获取「参考」值
     *
     */
    @JsonIgnore
    public String getRef() {
        return DataTypeUtils.asString(this._get(FIELD_REF), null);
    }

    /**
     * 判断 「参考」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRef() {
        return this._contains(FIELD_REF);
    }

    /**
     * 重置 「参考」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetRef() {
        this._reset(FIELD_REF);
        return this;
    }

    /**
     * 设置「收货前几天」
     * @param val
     */
    @JsonProperty(FIELD_REMINDER_DATE_BEFORE_RECEIPT)
    public ResUsersDTO setReminderDateBeforeReceipt(Integer val) {
        this._set(FIELD_REMINDER_DATE_BEFORE_RECEIPT, val);
        return this;
    }

    /**
     * 获取「收货前几天」值
     *
     */
    @JsonIgnore
    public Integer getReminderDateBeforeReceipt() {
        return DataTypeUtils.asInteger(this._get(FIELD_REMINDER_DATE_BEFORE_RECEIPT), null);
    }

    /**
     * 判断 「收货前几天」是否有值
     *
     */
    @JsonIgnore
    public boolean containsReminderDateBeforeReceipt() {
        return this._contains(FIELD_REMINDER_DATE_BEFORE_RECEIPT);
    }

    /**
     * 重置 「收货前几天」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetReminderDateBeforeReceipt() {
        this._reset(FIELD_REMINDER_DATE_BEFORE_RECEIPT);
        return this;
    }

    /**
     * 设置「要求加班」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_REQUEST_OVERTIME)
    public ResUsersDTO setRequestOvertime(Integer val) {
        this._set(FIELD_REQUEST_OVERTIME, val);
        return this;
    }

    /**
     * 获取「要求加班」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getRequestOvertime() {
        return DataTypeUtils.asInteger(this._get(FIELD_REQUEST_OVERTIME), null);
    }

    /**
     * 判断 「要求加班」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRequestOvertime() {
        return this._contains(FIELD_REQUEST_OVERTIME);
    }

    /**
     * 重置 「要求加班」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetRequestOvertime() {
        this._reset(FIELD_REQUEST_OVERTIME);
        return this;
    }

    /**
     * 设置「# 记录规则」
     * @param val
     */
    @JsonProperty(FIELD_RULES_COUNT)
    public ResUsersDTO setRulesCount(Integer val) {
        this._set(FIELD_RULES_COUNT, val);
        return this;
    }

    /**
     * 获取「# 记录规则」值
     *
     */
    @JsonIgnore
    public Integer getRulesCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_RULES_COUNT), null);
    }

    /**
     * 判断 「# 记录规则」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRulesCount() {
        return this._contains(FIELD_RULES_COUNT);
    }

    /**
     * 重置 「# 记录规则」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetRulesCount() {
        this._reset(FIELD_RULES_COUNT);
        return this;
    }

    /**
     * 设置「销售订单计数」
     * @param val
     */
    @JsonProperty(FIELD_SALE_ORDER_COUNT)
    public ResUsersDTO setSaleOrderCount(Integer val) {
        this._set(FIELD_SALE_ORDER_COUNT, val);
        return this;
    }

    /**
     * 获取「销售订单计数」值
     *
     */
    @JsonIgnore
    public Integer getSaleOrderCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_SALE_ORDER_COUNT), null);
    }

    /**
     * 判断 「销售订单计数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSaleOrderCount() {
        return this._contains(FIELD_SALE_ORDER_COUNT);
    }

    /**
     * 重置 「销售订单计数」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetSaleOrderCount() {
        this._reset(FIELD_SALE_ORDER_COUNT);
        return this;
    }

    /**
     * 设置「用户销售团队」
     * @param val
     */
    @JsonProperty(FIELD_SALE_TEAM_ID)
    public ResUsersDTO setSaleTeamId(String val) {
        this._set(FIELD_SALE_TEAM_ID, val);
        return this;
    }

    /**
     * 获取「用户销售团队」值
     *
     */
    @JsonIgnore
    public String getSaleTeamId() {
        return DataTypeUtils.asString(this._get(FIELD_SALE_TEAM_ID), null);
    }

    /**
     * 判断 「用户销售团队」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSaleTeamId() {
        return this._contains(FIELD_SALE_TEAM_ID);
    }

    /**
     * 重置 「用户销售团队」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetSaleTeamId() {
        this._reset(FIELD_SALE_TEAM_ID);
        return this;
    }

    /**
     * 设置「销售警告信息」
     * 代码表[销售警告信息]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_sale_warn
     * @param val
     */
    @JsonProperty(FIELD_SALE_WARN)
    public ResUsersDTO setSaleWarn(String val) {
        this._set(FIELD_SALE_WARN, val);
        return this;
    }

    /**
     * 获取「销售警告信息」值
     * 代码表[销售警告信息]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_sale_warn
     *
     */
    @JsonIgnore
    public String getSaleWarn() {
        return DataTypeUtils.asString(this._get(FIELD_SALE_WARN), null);
    }

    /**
     * 判断 「销售警告信息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSaleWarn() {
        return this._contains(FIELD_SALE_WARN);
    }

    /**
     * 重置 「销售警告信息」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetSaleWarn() {
        this._reset(FIELD_SALE_WARN);
        return this;
    }

    /**
     * 设置「销售订单消息」
     * @param val
     */
    @JsonProperty(FIELD_SALE_WARN_MSG)
    public ResUsersDTO setSaleWarnMsg(String val) {
        this._set(FIELD_SALE_WARN_MSG, val);
        return this;
    }

    /**
     * 获取「销售订单消息」值
     *
     */
    @JsonIgnore
    public String getSaleWarnMsg() {
        return DataTypeUtils.asString(this._get(FIELD_SALE_WARN_MSG), null);
    }

    /**
     * 判断 「销售订单消息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSaleWarnMsg() {
        return this._contains(FIELD_SALE_WARN_MSG);
    }

    /**
     * 重置 「销售订单消息」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetSaleWarnMsg() {
        this._reset(FIELD_SALE_WARN_MSG);
        return this;
    }

    /**
     * 设置「共享用户」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_SHARE)
    public ResUsersDTO setShare(Integer val) {
        this._set(FIELD_SHARE, val);
        return this;
    }

    /**
     * 获取「共享用户」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getShare() {
        return DataTypeUtils.asInteger(this._get(FIELD_SHARE), null);
    }

    /**
     * 判断 「共享用户」是否有值
     *
     */
    @JsonIgnore
    public boolean containsShare() {
        return this._contains(FIELD_SHARE);
    }

    /**
     * 重置 「共享用户」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetShare() {
        this._reset(FIELD_SHARE);
        return this;
    }

    /**
     * 设置「显示信用额度」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_SHOW_CREDIT_LIMIT)
    public ResUsersDTO setShowCreditLimit(Integer val) {
        this._set(FIELD_SHOW_CREDIT_LIMIT, val);
        return this;
    }

    /**
     * 获取「显示信用额度」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getShowCreditLimit() {
        return DataTypeUtils.asInteger(this._get(FIELD_SHOW_CREDIT_LIMIT), null);
    }

    /**
     * 判断 「显示信用额度」是否有值
     *
     */
    @JsonIgnore
    public boolean containsShowCreditLimit() {
        return this._contains(FIELD_SHOW_CREDIT_LIMIT);
    }

    /**
     * 重置 「显示信用额度」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetShowCreditLimit() {
        this._reset(FIELD_SHOW_CREDIT_LIMIT);
        return this;
    }

    /**
     * 设置「电子邮件签名」
     * @param val
     */
    @JsonProperty(FIELD_SIGNATURE)
    public ResUsersDTO setSignature(String val) {
        this._set(FIELD_SIGNATURE, val);
        return this;
    }

    /**
     * 获取「电子邮件签名」值
     *
     */
    @JsonIgnore
    public String getSignature() {
        return DataTypeUtils.asString(this._get(FIELD_SIGNATURE), null);
    }

    /**
     * 判断 「电子邮件签名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSignature() {
        return this._contains(FIELD_SIGNATURE);
    }

    /**
     * 重置 「电子邮件签名」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetSignature() {
        this._reset(FIELD_SIGNATURE);
        return this;
    }

    /**
     * 设置「注册令牌（Token）类型」
     * @param val
     */
    @JsonProperty(FIELD_SIGNUP_TYPE)
    public ResUsersDTO setSignupType(String val) {
        this._set(FIELD_SIGNUP_TYPE, val);
        return this;
    }

    /**
     * 获取「注册令牌（Token）类型」值
     *
     */
    @JsonIgnore
    public String getSignupType() {
        return DataTypeUtils.asString(this._get(FIELD_SIGNUP_TYPE), null);
    }

    /**
     * 判断 「注册令牌（Token）类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSignupType() {
        return this._contains(FIELD_SIGNUP_TYPE);
    }

    /**
     * 重置 「注册令牌（Token）类型」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetSignupType() {
        this._reset(FIELD_SIGNUP_TYPE);
        return this;
    }

    /**
     * 设置「银质徽标数量」
     * @param val
     */
    @JsonProperty(FIELD_SILVER_BADGE)
    public ResUsersDTO setSilverBadge(Integer val) {
        this._set(FIELD_SILVER_BADGE, val);
        return this;
    }

    /**
     * 获取「银质徽标数量」值
     *
     */
    @JsonIgnore
    public Integer getSilverBadge() {
        return DataTypeUtils.asInteger(this._get(FIELD_SILVER_BADGE), null);
    }

    /**
     * 判断 「银质徽标数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSilverBadge() {
        return this._contains(FIELD_SILVER_BADGE);
    }

    /**
     * 重置 「银质徽标数量」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetSilverBadge() {
        this._reset(FIELD_SILVER_BADGE);
        return this;
    }

    /**
     * 设置「状态」
     * 代码表[状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_users_state
     * @param val
     */
    @JsonProperty(FIELD_STATE)
    public ResUsersDTO setState(String val) {
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
    public ResUsersDTO resetState() {
        this._reset(FIELD_STATE);
        return this;
    }

    /**
     * 设置「省/州」
     * @param val
     */
    @JsonProperty(FIELD_STATE_ID)
    public ResUsersDTO setStateId(String val) {
        this._set(FIELD_STATE_ID, val);
        return this;
    }

    /**
     * 获取「省/州」值
     *
     */
    @JsonIgnore
    public String getStateId() {
        return DataTypeUtils.asString(this._get(FIELD_STATE_ID), null);
    }

    /**
     * 判断 「省/州」是否有值
     *
     */
    @JsonIgnore
    public boolean containsStateId() {
        return this._contains(FIELD_STATE_ID);
    }

    /**
     * 重置 「省/州」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetStateId() {
        this._reset(FIELD_STATE_ID);
        return this;
    }

    /**
     * 设置「街道」
     * @param val
     */
    @JsonProperty(FIELD_STREET)
    public ResUsersDTO setStreet(String val) {
        this._set(FIELD_STREET, val);
        return this;
    }

    /**
     * 获取「街道」值
     *
     */
    @JsonIgnore
    public String getStreet() {
        return DataTypeUtils.asString(this._get(FIELD_STREET), null);
    }

    /**
     * 判断 「街道」是否有值
     *
     */
    @JsonIgnore
    public boolean containsStreet() {
        return this._contains(FIELD_STREET);
    }

    /**
     * 重置 「街道」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetStreet() {
        this._reset(FIELD_STREET);
        return this;
    }

    /**
     * 设置「详细地址」
     * @param val
     */
    @JsonProperty(FIELD_STREET2)
    public ResUsersDTO setStreet2(String val) {
        this._set(FIELD_STREET2, val);
        return this;
    }

    /**
     * 获取「详细地址」值
     *
     */
    @JsonIgnore
    public String getStreet2() {
        return DataTypeUtils.asString(this._get(FIELD_STREET2), null);
    }

    /**
     * 判断 「详细地址」是否有值
     *
     */
    @JsonIgnore
    public boolean containsStreet2() {
        return this._contains(FIELD_STREET2);
    }

    /**
     * 重置 「详细地址」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetStreet2() {
        this._reset(FIELD_STREET2);
        return this;
    }

    /**
     * 设置「＃供应商账单」
     * @param val
     */
    @JsonProperty(FIELD_SUPPLIER_INVOICE_COUNT)
    public ResUsersDTO setSupplierInvoiceCount(Integer val) {
        this._set(FIELD_SUPPLIER_INVOICE_COUNT, val);
        return this;
    }

    /**
     * 获取「＃供应商账单」值
     *
     */
    @JsonIgnore
    public Integer getSupplierInvoiceCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_SUPPLIER_INVOICE_COUNT), null);
    }

    /**
     * 判断 「＃供应商账单」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSupplierInvoiceCount() {
        return this._contains(FIELD_SUPPLIER_INVOICE_COUNT);
    }

    /**
     * 重置 「＃供应商账单」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetSupplierInvoiceCount() {
        this._reset(FIELD_SUPPLIER_INVOICE_COUNT);
        return this;
    }

    /**
     * 设置「供应商排名」
     * @param val
     */
    @JsonProperty(FIELD_SUPPLIER_RANK)
    public ResUsersDTO setSupplierRank(Integer val) {
        this._set(FIELD_SUPPLIER_RANK, val);
        return this;
    }

    /**
     * 获取「供应商排名」值
     *
     */
    @JsonIgnore
    public Integer getSupplierRank() {
        return DataTypeUtils.asInteger(this._get(FIELD_SUPPLIER_RANK), null);
    }

    /**
     * 判断 「供应商排名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSupplierRank() {
        return this._contains(FIELD_SUPPLIER_RANK);
    }

    /**
     * 重置 「供应商排名」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetSupplierRank() {
        this._reset(FIELD_SUPPLIER_RANK);
        return this;
    }

    /**
     * 设置「活动完成目标」
     * @param val
     */
    @JsonProperty(FIELD_TARGET_SALES_DONE)
    public ResUsersDTO setTargetSalesDone(Integer val) {
        this._set(FIELD_TARGET_SALES_DONE, val);
        return this;
    }

    /**
     * 获取「活动完成目标」值
     *
     */
    @JsonIgnore
    public Integer getTargetSalesDone() {
        return DataTypeUtils.asInteger(this._get(FIELD_TARGET_SALES_DONE), null);
    }

    /**
     * 判断 「活动完成目标」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTargetSalesDone() {
        return this._contains(FIELD_TARGET_SALES_DONE);
    }

    /**
     * 重置 「活动完成目标」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetTargetSalesDone() {
        this._reset(FIELD_TARGET_SALES_DONE);
        return this;
    }

    /**
     * 设置「销售订单目标结算单」
     * @param val
     */
    @JsonProperty(FIELD_TARGET_SALES_INVOICED)
    public ResUsersDTO setTargetSalesInvoiced(Integer val) {
        this._set(FIELD_TARGET_SALES_INVOICED, val);
        return this;
    }

    /**
     * 获取「销售订单目标结算单」值
     *
     */
    @JsonIgnore
    public Integer getTargetSalesInvoiced() {
        return DataTypeUtils.asInteger(this._get(FIELD_TARGET_SALES_INVOICED), null);
    }

    /**
     * 判断 「销售订单目标结算单」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTargetSalesInvoiced() {
        return this._contains(FIELD_TARGET_SALES_INVOICED);
    }

    /**
     * 重置 「销售订单目标结算单」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetTargetSalesInvoiced() {
        this._reset(FIELD_TARGET_SALES_INVOICED);
        return this;
    }

    /**
     * 设置「商机赢得目标」
     * @param val
     */
    @JsonProperty(FIELD_TARGET_SALES_WON)
    public ResUsersDTO setTargetSalesWon(Integer val) {
        this._set(FIELD_TARGET_SALES_WON, val);
        return this;
    }

    /**
     * 获取「商机赢得目标」值
     *
     */
    @JsonIgnore
    public Integer getTargetSalesWon() {
        return DataTypeUtils.asInteger(this._get(FIELD_TARGET_SALES_WON), null);
    }

    /**
     * 判断 「商机赢得目标」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTargetSalesWon() {
        return this._contains(FIELD_TARGET_SALES_WON);
    }

    /**
     * 重置 「商机赢得目标」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetTargetSalesWon() {
        this._reset(FIELD_TARGET_SALES_WON);
        return this;
    }

    /**
     * 设置「null」
     * @param val
     */
    @JsonProperty(FIELD_TASK_COUNT)
    public ResUsersDTO setTaskCount(Integer val) {
        this._set(FIELD_TASK_COUNT, val);
        return this;
    }

    /**
     * 获取「null」值
     *
     */
    @JsonIgnore
    public Integer getTaskCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_TASK_COUNT), null);
    }

    /**
     * 判断 「null」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTaskCount() {
        return this._contains(FIELD_TASK_COUNT);
    }

    /**
     * 重置 「null」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetTaskCount() {
        this._reset(FIELD_TASK_COUNT);
        return this;
    }

    /**
     * 设置「已开票总计」
     * @param val
     */
    @JsonProperty(FIELD_TOTAL_INVOICED)
    public ResUsersDTO setTotalInvoiced(BigDecimal val) {
        this._set(FIELD_TOTAL_INVOICED, val);
        return this;
    }

    /**
     * 获取「已开票总计」值
     *
     */
    @JsonIgnore
    public BigDecimal getTotalInvoiced() {
        return DataTypeUtils.asBigDecimal(this._get(FIELD_TOTAL_INVOICED), null);
    }

    /**
     * 判断 「已开票总计」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTotalInvoiced() {
        return this._contains(FIELD_TOTAL_INVOICED);
    }

    /**
     * 重置 「已开票总计」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetTotalInvoiced() {
        this._reset(FIELD_TOTAL_INVOICED);
        return this;
    }

    /**
     * 设置「双重身份验证」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_TOTP_ENABLED)
    public ResUsersDTO setTotpEnabled(Integer val) {
        this._set(FIELD_TOTP_ENABLED, val);
        return this;
    }

    /**
     * 获取「双重身份验证」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getTotpEnabled() {
        return DataTypeUtils.asInteger(this._get(FIELD_TOTP_ENABLED), null);
    }

    /**
     * 判断 「双重身份验证」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTotpEnabled() {
        return this._contains(FIELD_TOTP_ENABLED);
    }

    /**
     * 重置 「双重身份验证」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetTotpEnabled() {
        this._reset(FIELD_TOTP_ENABLED);
        return this;
    }

    /**
     * 设置「Totp密匙」
     * @param val
     */
    @JsonProperty(FIELD_TOTP_SECRET)
    public ResUsersDTO setTotpSecret(String val) {
        this._set(FIELD_TOTP_SECRET, val);
        return this;
    }

    /**
     * 获取「Totp密匙」值
     *
     */
    @JsonIgnore
    public String getTotpSecret() {
        return DataTypeUtils.asString(this._get(FIELD_TOTP_SECRET), null);
    }

    /**
     * 判断 「Totp密匙」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTotpSecret() {
        return this._contains(FIELD_TOTP_SECRET);
    }

    /**
     * 重置 「Totp密匙」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetTotpSecret() {
        this._reset(FIELD_TOTP_SECRET);
        return this;
    }

    /**
     * 设置「新手入门」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_TOUR_ENABLED)
    public ResUsersDTO setTourEnabled(Integer val) {
        this._set(FIELD_TOUR_ENABLED, val);
        return this;
    }

    /**
     * 获取「新手入门」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getTourEnabled() {
        return DataTypeUtils.asInteger(this._get(FIELD_TOUR_ENABLED), null);
    }

    /**
     * 判断 「新手入门」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTourEnabled() {
        return this._contains(FIELD_TOUR_ENABLED);
    }

    /**
     * 重置 「新手入门」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetTourEnabled() {
        this._reset(FIELD_TOUR_ENABLED);
        return this;
    }

    /**
     * 设置「Degree of trust you have in this debtor」
     * 代码表[Degree of trust you have in this debtor]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_trust
     * @param val
     */
    @JsonProperty(FIELD_TRUST)
    public ResUsersDTO setTrust(String val) {
        this._set(FIELD_TRUST, val);
        return this;
    }

    /**
     * 获取「Degree of trust you have in this debtor」值
     * 代码表[Degree of trust you have in this debtor]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_trust
     *
     */
    @JsonIgnore
    public String getTrust() {
        return DataTypeUtils.asString(this._get(FIELD_TRUST), null);
    }

    /**
     * 判断 「Degree of trust you have in this debtor」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTrust() {
        return this._contains(FIELD_TRUST);
    }

    /**
     * 重置 「Degree of trust you have in this debtor」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetTrust() {
        this._reset(FIELD_TRUST);
        return this;
    }

    /**
     * 设置「地址类型」
     * 代码表[地址类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_type
     * @param val
     */
    @JsonProperty(FIELD_TYPE)
    public ResUsersDTO setType(String val) {
        this._set(FIELD_TYPE, val);
        return this;
    }

    /**
     * 获取「地址类型」值
     * 代码表[地址类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_type
     *
     */
    @JsonIgnore
    public String getType() {
        return DataTypeUtils.asString(this._get(FIELD_TYPE), null);
    }

    /**
     * 判断 「地址类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsType() {
        return this._contains(FIELD_TYPE);
    }

    /**
     * 重置 「地址类型」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetType() {
        this._reset(FIELD_TYPE);
        return this;
    }

    /**
     * 设置「时区」
     * 代码表[时区]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_tz
     * @param val
     */
    @JsonProperty(FIELD_TZ)
    public ResUsersDTO setTz(String val) {
        this._set(FIELD_TZ, val);
        return this;
    }

    /**
     * 获取「时区」值
     * 代码表[时区]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_tz
     *
     */
    @JsonIgnore
    public String getTz() {
        return DataTypeUtils.asString(this._get(FIELD_TZ), null);
    }

    /**
     * 判断 「时区」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTz() {
        return this._contains(FIELD_TZ);
    }

    /**
     * 重置 「时区」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetTz() {
        this._reset(FIELD_TZ);
        return this;
    }

    /**
     * 设置「时区偏移」
     * @param val
     */
    @JsonProperty(FIELD_TZ_OFFSET)
    public ResUsersDTO setTzOffset(String val) {
        this._set(FIELD_TZ_OFFSET, val);
        return this;
    }

    /**
     * 获取「时区偏移」值
     *
     */
    @JsonIgnore
    public String getTzOffset() {
        return DataTypeUtils.asString(this._get(FIELD_TZ_OFFSET), null);
    }

    /**
     * 判断 「时区偏移」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTzOffset() {
        return this._contains(FIELD_TZ_OFFSET);
    }

    /**
     * 重置 「时区偏移」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetTzOffset() {
        this._reset(FIELD_TZ_OFFSET);
        return this;
    }

    /**
     * 设置「合作伙伴限制」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_USE_PARTNER_CREDIT_LIMIT)
    public ResUsersDTO setUsePartnerCreditLimit(Integer val) {
        this._set(FIELD_USE_PARTNER_CREDIT_LIMIT, val);
        return this;
    }

    /**
     * 获取「合作伙伴限制」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getUsePartnerCreditLimit() {
        return DataTypeUtils.asInteger(this._get(FIELD_USE_PARTNER_CREDIT_LIMIT), null);
    }

    /**
     * 判断 「合作伙伴限制」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUsePartnerCreditLimit() {
        return this._contains(FIELD_USE_PARTNER_CREDIT_LIMIT);
    }

    /**
     * 重置 「合作伙伴限制」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetUsePartnerCreditLimit() {
        this._reset(FIELD_USE_PARTNER_CREDIT_LIMIT);
        return this;
    }

    /**
     * 设置「用户组警告」
     * @param val
     */
    @JsonProperty(FIELD_USER_GROUP_WARNING)
    public ResUsersDTO setUserGroupWarning(String val) {
        this._set(FIELD_USER_GROUP_WARNING, val);
        return this;
    }

    /**
     * 获取「用户组警告」值
     *
     */
    @JsonIgnore
    public String getUserGroupWarning() {
        return DataTypeUtils.asString(this._get(FIELD_USER_GROUP_WARNING), null);
    }

    /**
     * 判断 「用户组警告」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUserGroupWarning() {
        return this._contains(FIELD_USER_GROUP_WARNING);
    }

    /**
     * 重置 「用户组警告」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetUserGroupWarning() {
        this._reset(FIELD_USER_GROUP_WARNING);
        return this;
    }

    /**
     * 设置「业务员」
     * @param val
     */
    @JsonProperty(FIELD_USER_ID)
    public ResUsersDTO setUserId(String val) {
        this._set(FIELD_USER_ID, val);
        return this;
    }

    /**
     * 获取「业务员」值
     *
     */
    @JsonIgnore
    public String getUserId() {
        return DataTypeUtils.asString(this._get(FIELD_USER_ID), null);
    }

    /**
     * 判断 「业务员」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUserId() {
        return this._contains(FIELD_USER_ID);
    }

    /**
     * 重置 「业务员」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetUserId() {
        this._reset(FIELD_USER_ID);
        return this;
    }

    /**
     * 设置「税号ID」
     * @param val
     */
    @JsonProperty(FIELD_VAT)
    public ResUsersDTO setVat(String val) {
        this._set(FIELD_VAT, val);
        return this;
    }

    /**
     * 获取「税号ID」值
     *
     */
    @JsonIgnore
    public String getVat() {
        return DataTypeUtils.asString(this._get(FIELD_VAT), null);
    }

    /**
     * 判断 「税号ID」是否有值
     *
     */
    @JsonIgnore
    public boolean containsVat() {
        return this._contains(FIELD_VAT);
    }

    /**
     * 重置 「税号ID」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetVat() {
        this._reset(FIELD_VAT);
        return this;
    }

    /**
     * 设置「税务 ID 标签」
     * @param val
     */
    @JsonProperty(FIELD_VAT_LABEL)
    public ResUsersDTO setVatLabel(String val) {
        this._set(FIELD_VAT_LABEL, val);
        return this;
    }

    /**
     * 获取「税务 ID 标签」值
     *
     */
    @JsonIgnore
    public String getVatLabel() {
        return DataTypeUtils.asString(this._get(FIELD_VAT_LABEL), null);
    }

    /**
     * 判断 「税务 ID 标签」是否有值
     *
     */
    @JsonIgnore
    public boolean containsVatLabel() {
        return this._contains(FIELD_VAT_LABEL);
    }

    /**
     * 重置 「税务 ID 标签」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetVatLabel() {
        this._reset(FIELD_VAT_LABEL);
        return this;
    }

    /**
     * 设置「网站链接」
     * @param val
     */
    @JsonProperty(FIELD_WEBSITE)
    public ResUsersDTO setWebsite(String val) {
        this._set(FIELD_WEBSITE, val);
        return this;
    }

    /**
     * 获取「网站链接」值
     *
     */
    @JsonIgnore
    public String getWebsite() {
        return DataTypeUtils.asString(this._get(FIELD_WEBSITE), null);
    }

    /**
     * 判断 「网站链接」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWebsite() {
        return this._contains(FIELD_WEBSITE);
    }

    /**
     * 重置 「网站链接」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetWebsite() {
        this._reset(FIELD_WEBSITE);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public ResUsersDTO setWriteDate(Timestamp val) {
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
    public ResUsersDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public ResUsersDTO setWriteUid(String val) {
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
    public ResUsersDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

    /**
     * 设置「邮编」
     * @param val
     */
    @JsonProperty(FIELD_ZIP)
    public ResUsersDTO setZip(String val) {
        this._set(FIELD_ZIP, val);
        return this;
    }

    /**
     * 获取「邮编」值
     *
     */
    @JsonIgnore
    public String getZip() {
        return DataTypeUtils.asString(this._get(FIELD_ZIP), null);
    }

    /**
     * 判断 「邮编」是否有值
     *
     */
    @JsonIgnore
    public boolean containsZip() {
        return this._contains(FIELD_ZIP);
    }

    /**
     * 重置 「邮编」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetZip() {
        this._reset(FIELD_ZIP);
        return this;
    }

    /**
     * 设置「头像128」
     * @param val
     */
    @JsonProperty(FIELD_AVATAR128)
    public ResUsersDTO setAvatar128(String val) {
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
    public ResUsersDTO resetAvatar128() {
        this._reset(FIELD_AVATAR128);
        return this;
    }

    /**
     * 设置「图片128」
     * @param val
     */
    @JsonProperty(FIELD_IMAGE128)
    public ResUsersDTO setImage128(String val) {
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
    public ResUsersDTO resetImage128() {
        this._reset(FIELD_IMAGE128);
        return this;
    }

    /**
     * 设置「头像512」
     * @param val
     */
    @JsonProperty(FIELD_AVATAR512)
    public ResUsersDTO setAvatar512(String val) {
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
    public ResUsersDTO resetAvatar512() {
        this._reset(FIELD_AVATAR512);
        return this;
    }

    /**
     * 设置「图片512」
     * @param val
     */
    @JsonProperty(FIELD_IMAGE512)
    public ResUsersDTO setImage512(String val) {
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
    public ResUsersDTO resetImage512() {
        this._reset(FIELD_IMAGE512);
        return this;
    }

    /**
     * 设置「头像256」
     * @param val
     */
    @JsonProperty(FIELD_AVATAR256)
    public ResUsersDTO setAvatar256(String val) {
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
    public ResUsersDTO resetAvatar256() {
        this._reset(FIELD_AVATAR256);
        return this;
    }

    /**
     * 设置「图片256」
     * @param val
     */
    @JsonProperty(FIELD_IMAGE256)
    public ResUsersDTO setImage256(String val) {
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
    public ResUsersDTO resetImage256() {
        this._reset(FIELD_IMAGE256);
        return this;
    }

    /**
     * 设置「头像1024」
     * @param val
     */
    @JsonProperty(FIELD_AVATAR1024)
    public ResUsersDTO setAvatar1024(String val) {
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
    public ResUsersDTO resetAvatar1024() {
        this._reset(FIELD_AVATAR1024);
        return this;
    }

    /**
     * 设置「图片1024」
     * @param val
     */
    @JsonProperty(FIELD_IMAGE1024)
    public ResUsersDTO setImage1024(String val) {
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
    public ResUsersDTO resetImage1024() {
        this._reset(FIELD_IMAGE1024);
        return this;
    }

    /**
     * 设置「头像」
     * @param val
     */
    @JsonProperty(FIELD_AVATAR)
    public ResUsersDTO setAvatar(String val) {
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
    public ResUsersDTO resetAvatar() {
        this._reset(FIELD_AVATAR);
        return this;
    }

    /**
     * 设置「头像」
     * @param val
     */
    @JsonProperty(FIELD_IMAGE)
    public ResUsersDTO setImage(String val) {
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
    public ResUsersDTO resetImage() {
        this._reset(FIELD_IMAGE);
        return this;
    }

    /**
     * 设置「null」
     * @param val
     */
    @JsonProperty(FIELD_GROUPS_USERS_RELS)
    public ResUsersDTO setGroupsUsersRels(List<ResGroupsUsersRelDTO> val) {
        this._set(FIELD_GROUPS_USERS_RELS, val);
        return this;
    }

    /**
     * 获取「null」值
     *
     */
    @JsonIgnore
    public List<ResGroupsUsersRelDTO> getGroupsUsersRels() {
        return (List<ResGroupsUsersRelDTO>) this._get(FIELD_GROUPS_USERS_RELS);
    }

    /**
     * 判断 「null」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupsUsersRels() {
        return this._contains(FIELD_GROUPS_USERS_RELS);
    }

    /**
     * 重置 「null」
     *
     */
    @JsonIgnore
    public ResUsersDTO resetGroupsUsersRels() {
        this._reset(FIELD_GROUPS_USERS_RELS);
        return this;
    }

}
