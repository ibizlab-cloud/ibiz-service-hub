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


public class ResCompanyDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

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
     * 属性: 缺勤管理
     */
    public final static String FIELD_ABSENCE_MANAGEMENT = "absence_management";

    /**
     * 属性: 会计所在国家/地区
     */
    public final static String FIELD_ACCOUNT_FISCAL_COUNTRY_ID = "account_fiscal_country_id";

    /**
     * 属性: 期初分录
     */
    public final static String FIELD_ACCOUNT_OPENING_DATE = "account_opening_date";

    /**
     * 属性: Default Sales Price Include
     */
    public final static String FIELD_ACCOUNT_PRICE_INCLUDE = "account_price_include";

    /**
     * 属性: Storno会计应用程序
     */
    public final static String FIELD_ACCOUNT_STORNO = "account_storno";

    /**
     * 属性: 销售信用额度
     */
    public final static String FIELD_ACCOUNT_USE_CREDIT_LIMIT = "account_use_credit_limit";

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
     * 属性: 电子邮件域名
     */
    public final static String FIELD_ALIAS_DOMAIN_ID = "alias_domain_id";

    /**
     * 属性: 使用盎格鲁撒克逊会计
     */
    public final static String FIELD_ANGLO_SAXON_ACCOUNTING = "anglo_saxon_accounting";

    /**
     * 属性: 日期
     */
    public final static String FIELD_ANNUAL_INVENTORY_DAY = "annual_inventory_day";

    /**
     * 属性: 年度库存月
     */
    public final static String FIELD_ANNUAL_INVENTORY_MONTH = "annual_inventory_month";

    /**
     * 属性: 条码来源
     */
    public final static String FIELD_ATTENDANCE_BARCODE_SOURCE = "attendance_barcode_source";

    /**
     * 属性: 来自 Systray 的出席情况
     */
    public final static String FIELD_ATTENDANCE_FROM_SYSTRAY = "attendance_from_systray";

    /**
     * 属性: 自助考勤终端延迟
     */
    public final static String FIELD_ATTENDANCE_KIOSK_DELAY = "attendance_kiosk_delay";

    /**
     * 属性: 自助考勤终端密钥
     */
    public final static String FIELD_ATTENDANCE_KIOSK_KEY = "attendance_kiosk_key";

    /**
     * 属性: 考勤模式
     */
    public final static String FIELD_ATTENDANCE_KIOSK_MODE = "attendance_kiosk_mode";

    /**
     * 属性: 自助考勤终端网址
     */
    public final static String FIELD_ATTENDANCE_KIOSK_URL = "attendance_kiosk_url";

    /**
     * 属性: 员工PIN
     */
    public final static String FIELD_ATTENDANCE_KIOSK_USE_PIN = "attendance_kiosk_use_pin";

    /**
     * 属性: 额外工时验证
     */
    public final static String FIELD_ATTENDANCE_OVERTIME_VALIDATION = "attendance_overtime_validation";

    /**
     * 属性: 自动签退
     */
    public final static String FIELD_AUTO_CHECK_OUT = "auto_check_out";

    /**
     * 属性: null
     */
    public final static String FIELD_AUTO_CHECK_OUT_TOLERANCE = "auto_check_out_tolerance";

    /**
     * 属性: 自动验证账单
     */
    public final static String FIELD_AUTOPOST_BILLS = "autopost_bills";

    /**
     * 属性: Prefix of the bank accounts
     */
    public final static String FIELD_BANK_ACCOUNT_CODE_PREFIX = "bank_account_code_prefix";

    /**
     * 属性: Batch Payment Sequence
     */
    public final static String FIELD_BATCH_PAYMENT_SEQUENCE_ID = "batch_payment_sequence_id";

    /**
     * 属性: 退件电子邮件
     */
    public final static String FIELD_BOUNCE_EMAIL = "bounce_email";

    /**
     * 属性: 退回
     */
    public final static String FIELD_BOUNCE_FORMATTED = "bounce_formatted";

    /**
     * 属性: 候选人属性
     */
    public final static String FIELD_CANDIDATE_PROPERTIES_DEFINITION = "candidate_properties_definition";

    /**
     * 属性: Prefix of the cash accounts
     */
    public final static String FIELD_CASH_ACCOUNT_CODE_PREFIX = "cash_account_code_prefix";

    /**
     * 属性: 预设邮件
     */
    public final static String FIELD_CATCHALL_EMAIL = "catchall_email";

    /**
     * 属性: 预设
     */
    public final static String FIELD_CATCHALL_FORMATTED = "catchall_formatted";

    /**
     * 属性: 审计跟踪
     */
    public final static String FIELD_CHECK_ACCOUNT_AUDIT_TRAIL = "check_account_audit_trail";

    /**
     * 属性: 城市
     */
    public final static String FIELD_CITY = "city";

    /**
     * 属性: 颜色
     */
    public final static String FIELD_COLOR = "color";

    /**
     * 属性: 公司详情
     */
    public final static String FIELD_COMPANY_DETAILS = "company_details";

    /**
     * 属性: 公司注册处占位符
     */
    public final static String FIELD_COMPANY_REGISTRY_PLACEHOLDER = "company_registry_placeholder";

    /**
     * 属性: 公司增值税占位符
     */
    public final static String FIELD_COMPANY_VAT_PLACEHOLDER = "company_vat_placeholder";

    /**
     * 属性: 合同到期通知期
     */
    public final static String FIELD_CONTRACT_EXPIRATION_NOTICE_PERIOD = "contract_expiration_notice_period";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 币别
     */
    public final static String FIELD_CURRENCY_ID = "currency_id";

    /**
     * 属性: 币别
     */
    public final static String FIELD_CURRENCY_NAME = "currency_name";

    /**
     * 属性: 采购前置天数
     */
    public final static String FIELD_DAYS_TO_PURCHASE = "days_to_purchase";

    /**
     * 属性: 大写发票总额
     */
    public final static String FIELD_DISPLAY_INVOICE_AMOUNT_TOTAL_WORDS = "display_invoice_amount_total_words";

    /**
     * 属性: 税款以公司币别表示
     */
    public final static String FIELD_DISPLAY_INVOICE_TAX_COMPANY_CURRENCY = "display_invoice_tax_company_currency";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 格式化的邮件
     */
    public final static String FIELD_EMAIL_FORMATTED = "email_formatted";

    /**
     * 属性: 电子邮件标题颜色
     */
    public final static String FIELD_EMAIL_PRIMARY_COLOR = "email_primary_color";

    /**
     * 属性: 电子邮件按钮颜色
     */
    public final static String FIELD_EMAIL_SECONDARY_COLOR = "email_secondary_color";

    /**
     * 属性: 员工属性
     */
    public final static String FIELD_EMPLOYEE_PROPERTIES_DEFINITION = "employee_properties_definition";

    /**
     * 属性: Expects a Chart of Accounts
     */
    public final static String FIELD_EXPECTS_CHART_OF_ACCOUNTS = "expects_chart_of_accounts";

    /**
     * 属性: 会计年度最后一天
     */
    public final static String FIELD_FISCALYEAR_LAST_DAY = "fiscalyear_last_day";

    /**
     * 属性: 会计年度最后一个月
     */
    public final static String FIELD_FISCALYEAR_LAST_MONTH = "fiscalyear_last_month";

    /**
     * 属性: 全球锁定日期
     */
    public final static String FIELD_FISCALYEAR_LOCK_DATE = "fiscalyear_lock_date";

    /**
     * 属性: 字体
     */
    public final static String FIELD_FONT = "font";

    /**
     * 属性: 硬锁定日期
     */
    public final static String FIELD_HARD_LOCK_DATE = "hard_lock_date";

    /**
     * 属性: 有消息
     */
    public final static String FIELD_HAS_MESSAGE = "has_message";

    /**
     * 属性: 已收到库存警告短信息
     */
    public final static String FIELD_HAS_RECEIVED_WARNING_STOCK_SMS = "has_received_warning_stock_sms";

    /**
     * 属性: 显示额外时间
     */
    public final static String FIELD_HR_ATTENDANCE_DISPLAY_OVERTIME = "hr_attendance_display_overtime";

    /**
     * 属性: 根据出勤率
     */
    public final static String FIELD_HR_PRESENCE_CONTROL_ATTENDANCE = "hr_presence_control_attendance";

    /**
     * 属性: 根据发送的电子邮件数量
     */
    public final static String FIELD_HR_PRESENCE_CONTROL_EMAIL = "hr_presence_control_email";

    /**
     * 属性: # 要发送的电子邮件
     */
    public final static String FIELD_HR_PRESENCE_CONTROL_EMAIL_AMOUNT = "hr_presence_control_email_amount";

    /**
     * 属性: 基于IP地址
     */
    public final static String FIELD_HR_PRESENCE_CONTROL_IP = "hr_presence_control_ip";

    /**
     * 属性: 有效的IP地址
     */
    public final static String FIELD_HR_PRESENCE_CONTROL_IP_LIST = "hr_presence_control_ip_list";

    /**
     * 属性: 基于系统中的用户状态
     */
    public final static String FIELD_HR_PRESENCE_CONTROL_LOGIN = "hr_presence_control_login";

    /**
     * 属性: 丰富完成
     */
    public final static String FIELD_IAP_ENRICH_AUTO_DONE = "iap_enrich_auto_done";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: Default Terms and Conditions
     */
    public final static String FIELD_INVOICE_TERMS = "invoice_terms";

    /**
     * 属性: Default Terms and Conditions as a Web page
     */
    public final static String FIELD_INVOICE_TERMS_HTML = "invoice_terms_html";

    /**
     * 属性: 公司详细信息是否为空
     */
    public final static String FIELD_IS_COMPANY_DETAILS_EMPTY = "is_company_details_empty";

    /**
     * 属性: 职位属性
     */
    public final static String FIELD_JOB_PROPERTIES_DEFINITION = "job_properties_definition";

    /**
     * 属性: 布局背景
     */
    public final static String FIELD_LAYOUT_BACKGROUND = "layout_background";

    /**
     * 属性: 制造提前期
     */
    public final static String FIELD_MANUFACTURING_LEAD = "manufacturing_lead";

    /**
     * 属性: Attachment Count
     */
    public final static String FIELD_MESSAGE_ATTACHMENT_COUNT = "message_attachment_count";

    /**
     * 属性: Message Delivery error
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
     * 属性: 我的活动截止时间
     */
    public final static String FIELD_MY_ACTIVITY_DATE_DEADLINE = "my_activity_date_deadline";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 对公司有利的宽容时间
     */
    public final static String FIELD_OVERTIME_COMPANY_THRESHOLD = "overtime_company_threshold";

    /**
     * 属性: 对员工有利的宽容时间
     */
    public final static String FIELD_OVERTIME_EMPLOYEE_THRESHOLD = "overtime_employee_threshold";

    /**
     * 属性: 上级公司
     */
    public final static String FIELD_PARENT_ID = "parent_id";

    /**
     * 属性: 上级公司
     */
    public final static String FIELD_PARENT_NAME = "parent_name";

    /**
     * 属性: 上级路径
     */
    public final static String FIELD_PARENT_PATH = "parent_path";

    /**
     * 属性: 合作伙伴
     */
    public final static String FIELD_PARTNER_ID = "partner_id";

    /**
     * 属性: 合作伙伴
     */
    public final static String FIELD_PARTNER_NAME = "partner_name";

    /**
     * 属性: 选择支付方式
     */
    public final static String FIELD_PAYMENT_ONBOARDING_PAYMENT_METHOD = "payment_onboarding_payment_method";

    /**
     * 属性: 批准等级
     */
    public final static String FIELD_PO_DOUBLE_VALIDATION = "po_double_validation";

    /**
     * 属性: 再次验证金额
     */
    public final static String FIELD_PO_DOUBLE_VALIDATION_AMOUNT = "po_double_validation_amount";

    /**
     * 属性: 采购提前期
     */
    public final static String FIELD_PO_LEAD = "po_lead";

    /**
     * 属性: 销售订单修改
     */
    public final static String FIELD_PO_LOCK = "po_lock";

    /**
     * 属性: 线上付款
     */
    public final static String FIELD_PORTAL_CONFIRMATION_PAY = "portal_confirmation_pay";

    /**
     * 属性: 线上签署
     */
    public final static String FIELD_PORTAL_CONFIRMATION_SIGN = "portal_confirmation_sign";

    /**
     * 属性: 预付百分比
     */
    public final static String FIELD_PREPAYMENT_PERCENT = "prepayment_percent";

    /**
     * 属性: 原色
     */
    public final static String FIELD_PRIMARY_COLOR = "primary_color";

    /**
     * 属性: 采购锁定日期
     */
    public final static String FIELD_PURCHASE_LOCK_DATE = "purchase_lock_date";

    /**
     * 属性: Display QR-code on invoices
     */
    public final static String FIELD_QR_CODE = "qr_code";

    /**
     * 属性: 快速编码
     */
    public final static String FIELD_QUICK_EDIT_MODE = "quick_edit_mode";

    /**
     * 属性: 默认报价有效期
     */
    public final static String FIELD_QUOTATION_VALIDITY_DAYS = "quotation_validity_days";

    /**
     * 属性: 报告页脚
     */
    public final static String FIELD_REPORT_FOOTER = "report_footer";

    /**
     * 属性: 公司标语
     */
    public final static String FIELD_REPORT_HEADER = "report_header";

    /**
     * 属性: 默认工作时间
     */
    public final static String FIELD_RESOURCE_CALENDAR_ID = "resource_calendar_id";

    /**
     * 属性: 销售锁定日期
     */
    public final static String FIELD_SALE_LOCK_DATE = "sale_lock_date";

    /**
     * 属性: 销售入门选择的付款方式
     */
    public final static String FIELD_SALE_ONBOARDING_PAYMENT_METHOD = "sale_onboarding_payment_method";

    /**
     * 属性: 次要颜色
     */
    public final static String FIELD_SECONDARY_COLOR = "secondary_color";

    /**
     * 属性: 销售安全天数
     */
    public final static String FIELD_SECURITY_LEAD = "security_lead";

    /**
     * 属性: 序列
     */
    public final static String FIELD_SEQUENCE = "sequence";

    /**
     * 属性: 实体邮寄颜色
     */
    public final static String FIELD_SNAILMAIL_COLOR = "snailmail_color";

    /**
     * 属性: 添加一个封面页
     */
    public final static String FIELD_SNAILMAIL_COVER = "snailmail_cover";

    /**
     * 属性: 双面
     */
    public final static String FIELD_SNAILMAIL_DUPLEX = "snailmail_duplex";

    /**
     * 属性: Facebook 账户
     */
    public final static String FIELD_SOCIAL_FACEBOOK = "social_facebook";

    /**
     * 属性: GitHub账户
     */
    public final static String FIELD_SOCIAL_GITHUB = "social_github";

    /**
     * 属性: Instagram 账号
     */
    public final static String FIELD_SOCIAL_INSTAGRAM = "social_instagram";

    /**
     * 属性: 领英账号
     */
    public final static String FIELD_SOCIAL_LINKEDIN = "social_linkedin";

    /**
     * 属性: TikTok / 抖音账号
     */
    public final static String FIELD_SOCIAL_TIKTOK = "social_tiktok";

    /**
     * 属性: X 账户
     */
    public final static String FIELD_SOCIAL_TWITTER = "social_twitter";

    /**
     * 属性: Youtube账号
     */
    public final static String FIELD_SOCIAL_YOUTUBE = "social_youtube";

    /**
     * 属性: 确认拣货邮件模版
     */
    public final static String FIELD_STOCK_MAIL_CONFIRMATION_TEMPLATE_ID = "stock_mail_confirmation_template_id";

    /**
     * 属性: 邮件确认拣货
     */
    public final static String FIELD_STOCK_MOVE_EMAIL_VALIDATION = "stock_move_email_validation";

    /**
     * 属性: 短信息确认
     */
    public final static String FIELD_STOCK_MOVE_SMS_VALIDATION = "stock_move_sms_validation";

    /**
     * 属性: 街道
     */
    public final static String FIELD_STREET = "street";

    /**
     * 属性: 详细地址
     */
    public final static String FIELD_STREET2 = "street2";

    /**
     * 属性: Tax Calculation Rounding Method
     */
    public final static String FIELD_TAX_CALCULATION_ROUNDING_METHOD = "tax_calculation_rounding_method";

    /**
     * 属性: 采用现金收付
     */
    public final static String FIELD_TAX_EXIGIBILITY = "tax_exigibility";

    /**
     * 属性: 纳税申报表锁定日期
     */
    public final static String FIELD_TAX_LOCK_DATE = "tax_lock_date";

    /**
     * 属性: Terms & Conditions format
     */
    public final static String FIELD_TERMS_TYPE = "terms_type";

    /**
     * 属性: Prefix of the transfer accounts
     */
    public final static String FIELD_TRANSFER_ACCOUNT_CODE_PREFIX = "transfer_account_code_prefix";

    /**
     * 属性: 用户财政年度锁定日期
     */
    public final static String FIELD_USER_FISCALYEAR_LOCK_DATE = "user_fiscalyear_lock_date";

    /**
     * 属性: 用户硬性锁定日期
     */
    public final static String FIELD_USER_HARD_LOCK_DATE = "user_hard_lock_date";

    /**
     * 属性: 用户采购锁定日期
     */
    public final static String FIELD_USER_PURCHASE_LOCK_DATE = "user_purchase_lock_date";

    /**
     * 属性: 用户销售锁定日期
     */
    public final static String FIELD_USER_SALE_LOCK_DATE = "user_sale_lock_date";

    /**
     * 属性: User Tax Lock Date
     */
    public final static String FIELD_USER_TAX_LOCK_DATE = "user_tax_lock_date";

    /**
     * 属性: 使用默认徽标
     */
    public final static String FIELD_USES_DEFAULT_LOGO = "uses_default_logo";

    /**
     * 属性: 工作许可证到期通知期
     */
    public final static String FIELD_WORK_PERMIT_EXPIRATION_NOTICE_PERIOD = "work_permit_expiration_notice_period";

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
     * 设置「活动集合」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITIES)
    public ResCompanyDTO setActivities(List<MailActivityDTO> val) {
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
    public ResCompanyDTO resetActivities() {
        this._reset(FIELD_ACTIVITIES);
        return this;
    }

    /**
     * 设置「附件集合」
     * @param val
     */
    @JsonProperty(FIELD_ATTACHMENTS)
    public ResCompanyDTO setAttachments(List<IrAttachmentDTO> val) {
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
    public ResCompanyDTO resetAttachments() {
        this._reset(FIELD_ATTACHMENTS);
        return this;
    }

    /**
     * 设置「关注者」
     * @param val
     */
    @JsonProperty(FIELD_FOLLOWERS)
    public ResCompanyDTO setFollowers(List<MailFollowersDTO> val) {
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
    public ResCompanyDTO resetFollowers() {
        this._reset(FIELD_FOLLOWERS);
        return this;
    }

    /**
     * 设置「缺勤管理」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ABSENCE_MANAGEMENT)
    public ResCompanyDTO setAbsenceManagement(Integer val) {
        this._set(FIELD_ABSENCE_MANAGEMENT, val);
        return this;
    }

    /**
     * 获取「缺勤管理」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getAbsenceManagement() {
        return DataTypeUtils.asInteger(this._get(FIELD_ABSENCE_MANAGEMENT), null);
    }

    /**
     * 判断 「缺勤管理」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAbsenceManagement() {
        return this._contains(FIELD_ABSENCE_MANAGEMENT);
    }

    /**
     * 重置 「缺勤管理」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetAbsenceManagement() {
        this._reset(FIELD_ABSENCE_MANAGEMENT);
        return this;
    }

    /**
     * 设置「会计所在国家/地区」
     * @param val
     */
    @JsonProperty(FIELD_ACCOUNT_FISCAL_COUNTRY_ID)
    public ResCompanyDTO setAccountFiscalCountryId(String val) {
        this._set(FIELD_ACCOUNT_FISCAL_COUNTRY_ID, val);
        return this;
    }

    /**
     * 获取「会计所在国家/地区」值
     *
     */
    @JsonIgnore
    public String getAccountFiscalCountryId() {
        return DataTypeUtils.asString(this._get(FIELD_ACCOUNT_FISCAL_COUNTRY_ID), null);
    }

    /**
     * 判断 「会计所在国家/地区」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAccountFiscalCountryId() {
        return this._contains(FIELD_ACCOUNT_FISCAL_COUNTRY_ID);
    }

    /**
     * 重置 「会计所在国家/地区」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetAccountFiscalCountryId() {
        this._reset(FIELD_ACCOUNT_FISCAL_COUNTRY_ID);
        return this;
    }

    /**
     * 设置「期初分录」
     * @param val
     */
    @JsonProperty(FIELD_ACCOUNT_OPENING_DATE)
    public ResCompanyDTO setAccountOpeningDate(Timestamp val) {
        this._set(FIELD_ACCOUNT_OPENING_DATE, val);
        return this;
    }

    /**
     * 获取「期初分录」值
     *
     */
    @JsonIgnore
    public Timestamp getAccountOpeningDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_ACCOUNT_OPENING_DATE), null);
    }

    /**
     * 判断 「期初分录」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAccountOpeningDate() {
        return this._contains(FIELD_ACCOUNT_OPENING_DATE);
    }

    /**
     * 重置 「期初分录」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetAccountOpeningDate() {
        this._reset(FIELD_ACCOUNT_OPENING_DATE);
        return this;
    }

    /**
     * 设置「Default Sales Price Include」
     * 代码表[Default Sales Price Include]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_account_price_include
     * @param val
     */
    @JsonProperty(FIELD_ACCOUNT_PRICE_INCLUDE)
    public ResCompanyDTO setAccountPriceInclude(String val) {
        this._set(FIELD_ACCOUNT_PRICE_INCLUDE, val);
        return this;
    }

    /**
     * 获取「Default Sales Price Include」值
     * 代码表[Default Sales Price Include]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_account_price_include
     *
     */
    @JsonIgnore
    public String getAccountPriceInclude() {
        return DataTypeUtils.asString(this._get(FIELD_ACCOUNT_PRICE_INCLUDE), null);
    }

    /**
     * 判断 「Default Sales Price Include」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAccountPriceInclude() {
        return this._contains(FIELD_ACCOUNT_PRICE_INCLUDE);
    }

    /**
     * 重置 「Default Sales Price Include」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetAccountPriceInclude() {
        this._reset(FIELD_ACCOUNT_PRICE_INCLUDE);
        return this;
    }

    /**
     * 设置「Storno会计应用程序」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ACCOUNT_STORNO)
    public ResCompanyDTO setAccountStorno(Integer val) {
        this._set(FIELD_ACCOUNT_STORNO, val);
        return this;
    }

    /**
     * 获取「Storno会计应用程序」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getAccountStorno() {
        return DataTypeUtils.asInteger(this._get(FIELD_ACCOUNT_STORNO), null);
    }

    /**
     * 判断 「Storno会计应用程序」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAccountStorno() {
        return this._contains(FIELD_ACCOUNT_STORNO);
    }

    /**
     * 重置 「Storno会计应用程序」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetAccountStorno() {
        this._reset(FIELD_ACCOUNT_STORNO);
        return this;
    }

    /**
     * 设置「销售信用额度」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ACCOUNT_USE_CREDIT_LIMIT)
    public ResCompanyDTO setAccountUseCreditLimit(Integer val) {
        this._set(FIELD_ACCOUNT_USE_CREDIT_LIMIT, val);
        return this;
    }

    /**
     * 获取「销售信用额度」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getAccountUseCreditLimit() {
        return DataTypeUtils.asInteger(this._get(FIELD_ACCOUNT_USE_CREDIT_LIMIT), null);
    }

    /**
     * 判断 「销售信用额度」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAccountUseCreditLimit() {
        return this._contains(FIELD_ACCOUNT_USE_CREDIT_LIMIT);
    }

    /**
     * 重置 「销售信用额度」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetAccountUseCreditLimit() {
        this._reset(FIELD_ACCOUNT_USE_CREDIT_LIMIT);
        return this;
    }

    /**
     * 设置「有效」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ACTIVE)
    public ResCompanyDTO setActive(Integer val) {
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
    public ResCompanyDTO resetActive() {
        this._reset(FIELD_ACTIVE);
        return this;
    }

    /**
     * 设置「下一活动截止日期」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_DATE_DEADLINE)
    public ResCompanyDTO setActivityDateDeadline(Timestamp val) {
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
    public ResCompanyDTO resetActivityDateDeadline() {
        this._reset(FIELD_ACTIVITY_DATE_DEADLINE);
        return this;
    }

    /**
     * 设置「活动异常标示」
     * 代码表[活动异常标示]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_activity_mixin_activity_exception_decoration
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_EXCEPTION_DECORATION)
    public ResCompanyDTO setActivityExceptionDecoration(String val) {
        this._set(FIELD_ACTIVITY_EXCEPTION_DECORATION, val);
        return this;
    }

    /**
     * 获取「活动异常标示」值
     * 代码表[活动异常标示]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_activity_mixin_activity_exception_decoration
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
    public ResCompanyDTO resetActivityExceptionDecoration() {
        this._reset(FIELD_ACTIVITY_EXCEPTION_DECORATION);
        return this;
    }

    /**
     * 设置「图标」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_EXCEPTION_ICON)
    public ResCompanyDTO setActivityExceptionIcon(String val) {
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
    public ResCompanyDTO resetActivityExceptionIcon() {
        this._reset(FIELD_ACTIVITY_EXCEPTION_ICON);
        return this;
    }

    /**
     * 设置「活动状态」
     * 代码表[活动状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_activity_mixin_activity_state
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_STATE)
    public ResCompanyDTO setActivityState(String val) {
        this._set(FIELD_ACTIVITY_STATE, val);
        return this;
    }

    /**
     * 获取「活动状态」值
     * 代码表[活动状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_activity_mixin_activity_state
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
    public ResCompanyDTO resetActivityState() {
        this._reset(FIELD_ACTIVITY_STATE);
        return this;
    }

    /**
     * 设置「电子邮件域名」
     * @param val
     */
    @JsonProperty(FIELD_ALIAS_DOMAIN_ID)
    public ResCompanyDTO setAliasDomainId(String val) {
        this._set(FIELD_ALIAS_DOMAIN_ID, val);
        return this;
    }

    /**
     * 获取「电子邮件域名」值
     *
     */
    @JsonIgnore
    public String getAliasDomainId() {
        return DataTypeUtils.asString(this._get(FIELD_ALIAS_DOMAIN_ID), null);
    }

    /**
     * 判断 「电子邮件域名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAliasDomainId() {
        return this._contains(FIELD_ALIAS_DOMAIN_ID);
    }

    /**
     * 重置 「电子邮件域名」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetAliasDomainId() {
        this._reset(FIELD_ALIAS_DOMAIN_ID);
        return this;
    }

    /**
     * 设置「使用盎格鲁撒克逊会计」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ANGLO_SAXON_ACCOUNTING)
    public ResCompanyDTO setAngloSaxonAccounting(Integer val) {
        this._set(FIELD_ANGLO_SAXON_ACCOUNTING, val);
        return this;
    }

    /**
     * 获取「使用盎格鲁撒克逊会计」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getAngloSaxonAccounting() {
        return DataTypeUtils.asInteger(this._get(FIELD_ANGLO_SAXON_ACCOUNTING), null);
    }

    /**
     * 判断 「使用盎格鲁撒克逊会计」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAngloSaxonAccounting() {
        return this._contains(FIELD_ANGLO_SAXON_ACCOUNTING);
    }

    /**
     * 重置 「使用盎格鲁撒克逊会计」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetAngloSaxonAccounting() {
        this._reset(FIELD_ANGLO_SAXON_ACCOUNTING);
        return this;
    }

    /**
     * 设置「日期」
     * @param val
     */
    @JsonProperty(FIELD_ANNUAL_INVENTORY_DAY)
    public ResCompanyDTO setAnnualInventoryDay(Integer val) {
        this._set(FIELD_ANNUAL_INVENTORY_DAY, val);
        return this;
    }

    /**
     * 获取「日期」值
     *
     */
    @JsonIgnore
    public Integer getAnnualInventoryDay() {
        return DataTypeUtils.asInteger(this._get(FIELD_ANNUAL_INVENTORY_DAY), null);
    }

    /**
     * 判断 「日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAnnualInventoryDay() {
        return this._contains(FIELD_ANNUAL_INVENTORY_DAY);
    }

    /**
     * 重置 「日期」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetAnnualInventoryDay() {
        this._reset(FIELD_ANNUAL_INVENTORY_DAY);
        return this;
    }

    /**
     * 设置「年度库存月」
     * 代码表[年度库存月]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_annual_inventory_month
     * @param val
     */
    @JsonProperty(FIELD_ANNUAL_INVENTORY_MONTH)
    public ResCompanyDTO setAnnualInventoryMonth(String val) {
        this._set(FIELD_ANNUAL_INVENTORY_MONTH, val);
        return this;
    }

    /**
     * 获取「年度库存月」值
     * 代码表[年度库存月]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_annual_inventory_month
     *
     */
    @JsonIgnore
    public String getAnnualInventoryMonth() {
        return DataTypeUtils.asString(this._get(FIELD_ANNUAL_INVENTORY_MONTH), null);
    }

    /**
     * 判断 「年度库存月」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAnnualInventoryMonth() {
        return this._contains(FIELD_ANNUAL_INVENTORY_MONTH);
    }

    /**
     * 重置 「年度库存月」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetAnnualInventoryMonth() {
        this._reset(FIELD_ANNUAL_INVENTORY_MONTH);
        return this;
    }

    /**
     * 设置「条码来源」
     * 代码表[条码来源]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_attendance_barcode_source
     * @param val
     */
    @JsonProperty(FIELD_ATTENDANCE_BARCODE_SOURCE)
    public ResCompanyDTO setAttendanceBarcodeSource(String val) {
        this._set(FIELD_ATTENDANCE_BARCODE_SOURCE, val);
        return this;
    }

    /**
     * 获取「条码来源」值
     * 代码表[条码来源]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_attendance_barcode_source
     *
     */
    @JsonIgnore
    public String getAttendanceBarcodeSource() {
        return DataTypeUtils.asString(this._get(FIELD_ATTENDANCE_BARCODE_SOURCE), null);
    }

    /**
     * 判断 「条码来源」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAttendanceBarcodeSource() {
        return this._contains(FIELD_ATTENDANCE_BARCODE_SOURCE);
    }

    /**
     * 重置 「条码来源」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetAttendanceBarcodeSource() {
        this._reset(FIELD_ATTENDANCE_BARCODE_SOURCE);
        return this;
    }

    /**
     * 设置「来自 Systray 的出席情况」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ATTENDANCE_FROM_SYSTRAY)
    public ResCompanyDTO setAttendanceFromSystray(Integer val) {
        this._set(FIELD_ATTENDANCE_FROM_SYSTRAY, val);
        return this;
    }

    /**
     * 获取「来自 Systray 的出席情况」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getAttendanceFromSystray() {
        return DataTypeUtils.asInteger(this._get(FIELD_ATTENDANCE_FROM_SYSTRAY), null);
    }

    /**
     * 判断 「来自 Systray 的出席情况」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAttendanceFromSystray() {
        return this._contains(FIELD_ATTENDANCE_FROM_SYSTRAY);
    }

    /**
     * 重置 「来自 Systray 的出席情况」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetAttendanceFromSystray() {
        this._reset(FIELD_ATTENDANCE_FROM_SYSTRAY);
        return this;
    }

    /**
     * 设置「自助考勤终端延迟」
     * @param val
     */
    @JsonProperty(FIELD_ATTENDANCE_KIOSK_DELAY)
    public ResCompanyDTO setAttendanceKioskDelay(Integer val) {
        this._set(FIELD_ATTENDANCE_KIOSK_DELAY, val);
        return this;
    }

    /**
     * 获取「自助考勤终端延迟」值
     *
     */
    @JsonIgnore
    public Integer getAttendanceKioskDelay() {
        return DataTypeUtils.asInteger(this._get(FIELD_ATTENDANCE_KIOSK_DELAY), null);
    }

    /**
     * 判断 「自助考勤终端延迟」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAttendanceKioskDelay() {
        return this._contains(FIELD_ATTENDANCE_KIOSK_DELAY);
    }

    /**
     * 重置 「自助考勤终端延迟」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetAttendanceKioskDelay() {
        this._reset(FIELD_ATTENDANCE_KIOSK_DELAY);
        return this;
    }

    /**
     * 设置「自助考勤终端密钥」
     * @param val
     */
    @JsonProperty(FIELD_ATTENDANCE_KIOSK_KEY)
    public ResCompanyDTO setAttendanceKioskKey(String val) {
        this._set(FIELD_ATTENDANCE_KIOSK_KEY, val);
        return this;
    }

    /**
     * 获取「自助考勤终端密钥」值
     *
     */
    @JsonIgnore
    public String getAttendanceKioskKey() {
        return DataTypeUtils.asString(this._get(FIELD_ATTENDANCE_KIOSK_KEY), null);
    }

    /**
     * 判断 「自助考勤终端密钥」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAttendanceKioskKey() {
        return this._contains(FIELD_ATTENDANCE_KIOSK_KEY);
    }

    /**
     * 重置 「自助考勤终端密钥」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetAttendanceKioskKey() {
        this._reset(FIELD_ATTENDANCE_KIOSK_KEY);
        return this;
    }

    /**
     * 设置「考勤模式」
     * 代码表[考勤模式]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_attendance_kiosk_mode
     * @param val
     */
    @JsonProperty(FIELD_ATTENDANCE_KIOSK_MODE)
    public ResCompanyDTO setAttendanceKioskMode(String val) {
        this._set(FIELD_ATTENDANCE_KIOSK_MODE, val);
        return this;
    }

    /**
     * 获取「考勤模式」值
     * 代码表[考勤模式]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_attendance_kiosk_mode
     *
     */
    @JsonIgnore
    public String getAttendanceKioskMode() {
        return DataTypeUtils.asString(this._get(FIELD_ATTENDANCE_KIOSK_MODE), null);
    }

    /**
     * 判断 「考勤模式」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAttendanceKioskMode() {
        return this._contains(FIELD_ATTENDANCE_KIOSK_MODE);
    }

    /**
     * 重置 「考勤模式」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetAttendanceKioskMode() {
        this._reset(FIELD_ATTENDANCE_KIOSK_MODE);
        return this;
    }

    /**
     * 设置「自助考勤终端网址」
     * @param val
     */
    @JsonProperty(FIELD_ATTENDANCE_KIOSK_URL)
    public ResCompanyDTO setAttendanceKioskUrl(String val) {
        this._set(FIELD_ATTENDANCE_KIOSK_URL, val);
        return this;
    }

    /**
     * 获取「自助考勤终端网址」值
     *
     */
    @JsonIgnore
    public String getAttendanceKioskUrl() {
        return DataTypeUtils.asString(this._get(FIELD_ATTENDANCE_KIOSK_URL), null);
    }

    /**
     * 判断 「自助考勤终端网址」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAttendanceKioskUrl() {
        return this._contains(FIELD_ATTENDANCE_KIOSK_URL);
    }

    /**
     * 重置 「自助考勤终端网址」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetAttendanceKioskUrl() {
        this._reset(FIELD_ATTENDANCE_KIOSK_URL);
        return this;
    }

    /**
     * 设置「员工PIN」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ATTENDANCE_KIOSK_USE_PIN)
    public ResCompanyDTO setAttendanceKioskUsePin(Integer val) {
        this._set(FIELD_ATTENDANCE_KIOSK_USE_PIN, val);
        return this;
    }

    /**
     * 获取「员工PIN」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getAttendanceKioskUsePin() {
        return DataTypeUtils.asInteger(this._get(FIELD_ATTENDANCE_KIOSK_USE_PIN), null);
    }

    /**
     * 判断 「员工PIN」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAttendanceKioskUsePin() {
        return this._contains(FIELD_ATTENDANCE_KIOSK_USE_PIN);
    }

    /**
     * 重置 「员工PIN」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetAttendanceKioskUsePin() {
        this._reset(FIELD_ATTENDANCE_KIOSK_USE_PIN);
        return this;
    }

    /**
     * 设置「额外工时验证」
     * 代码表[额外工时验证]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_attendance_overtime_validation
     * @param val
     */
    @JsonProperty(FIELD_ATTENDANCE_OVERTIME_VALIDATION)
    public ResCompanyDTO setAttendanceOvertimeValidation(String val) {
        this._set(FIELD_ATTENDANCE_OVERTIME_VALIDATION, val);
        return this;
    }

    /**
     * 获取「额外工时验证」值
     * 代码表[额外工时验证]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_attendance_overtime_validation
     *
     */
    @JsonIgnore
    public String getAttendanceOvertimeValidation() {
        return DataTypeUtils.asString(this._get(FIELD_ATTENDANCE_OVERTIME_VALIDATION), null);
    }

    /**
     * 判断 「额外工时验证」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAttendanceOvertimeValidation() {
        return this._contains(FIELD_ATTENDANCE_OVERTIME_VALIDATION);
    }

    /**
     * 重置 「额外工时验证」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetAttendanceOvertimeValidation() {
        this._reset(FIELD_ATTENDANCE_OVERTIME_VALIDATION);
        return this;
    }

    /**
     * 设置「自动签退」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_AUTO_CHECK_OUT)
    public ResCompanyDTO setAutoCheckOut(Integer val) {
        this._set(FIELD_AUTO_CHECK_OUT, val);
        return this;
    }

    /**
     * 获取「自动签退」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getAutoCheckOut() {
        return DataTypeUtils.asInteger(this._get(FIELD_AUTO_CHECK_OUT), null);
    }

    /**
     * 判断 「自动签退」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAutoCheckOut() {
        return this._contains(FIELD_AUTO_CHECK_OUT);
    }

    /**
     * 重置 「自动签退」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetAutoCheckOut() {
        this._reset(FIELD_AUTO_CHECK_OUT);
        return this;
    }

    /**
     * 设置「null」
     * @param val
     */
    @JsonProperty(FIELD_AUTO_CHECK_OUT_TOLERANCE)
    public ResCompanyDTO setAutoCheckOutTolerance(Double val) {
        this._set(FIELD_AUTO_CHECK_OUT_TOLERANCE, val);
        return this;
    }

    /**
     * 获取「null」值
     *
     */
    @JsonIgnore
    public Double getAutoCheckOutTolerance() {
        return DataTypeUtils.asDouble(this._get(FIELD_AUTO_CHECK_OUT_TOLERANCE), null);
    }

    /**
     * 判断 「null」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAutoCheckOutTolerance() {
        return this._contains(FIELD_AUTO_CHECK_OUT_TOLERANCE);
    }

    /**
     * 重置 「null」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetAutoCheckOutTolerance() {
        this._reset(FIELD_AUTO_CHECK_OUT_TOLERANCE);
        return this;
    }

    /**
     * 设置「自动验证账单」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_AUTOPOST_BILLS)
    public ResCompanyDTO setAutopostBills(Integer val) {
        this._set(FIELD_AUTOPOST_BILLS, val);
        return this;
    }

    /**
     * 获取「自动验证账单」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getAutopostBills() {
        return DataTypeUtils.asInteger(this._get(FIELD_AUTOPOST_BILLS), null);
    }

    /**
     * 判断 「自动验证账单」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAutopostBills() {
        return this._contains(FIELD_AUTOPOST_BILLS);
    }

    /**
     * 重置 「自动验证账单」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetAutopostBills() {
        this._reset(FIELD_AUTOPOST_BILLS);
        return this;
    }

    /**
     * 设置「Prefix of the bank accounts」
     * @param val
     */
    @JsonProperty(FIELD_BANK_ACCOUNT_CODE_PREFIX)
    public ResCompanyDTO setBankAccountCodePrefix(String val) {
        this._set(FIELD_BANK_ACCOUNT_CODE_PREFIX, val);
        return this;
    }

    /**
     * 获取「Prefix of the bank accounts」值
     *
     */
    @JsonIgnore
    public String getBankAccountCodePrefix() {
        return DataTypeUtils.asString(this._get(FIELD_BANK_ACCOUNT_CODE_PREFIX), null);
    }

    /**
     * 判断 「Prefix of the bank accounts」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBankAccountCodePrefix() {
        return this._contains(FIELD_BANK_ACCOUNT_CODE_PREFIX);
    }

    /**
     * 重置 「Prefix of the bank accounts」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetBankAccountCodePrefix() {
        this._reset(FIELD_BANK_ACCOUNT_CODE_PREFIX);
        return this;
    }

    /**
     * 设置「Batch Payment Sequence」
     * @param val
     */
    @JsonProperty(FIELD_BATCH_PAYMENT_SEQUENCE_ID)
    public ResCompanyDTO setBatchPaymentSequenceId(String val) {
        this._set(FIELD_BATCH_PAYMENT_SEQUENCE_ID, val);
        return this;
    }

    /**
     * 获取「Batch Payment Sequence」值
     *
     */
    @JsonIgnore
    public String getBatchPaymentSequenceId() {
        return DataTypeUtils.asString(this._get(FIELD_BATCH_PAYMENT_SEQUENCE_ID), null);
    }

    /**
     * 判断 「Batch Payment Sequence」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBatchPaymentSequenceId() {
        return this._contains(FIELD_BATCH_PAYMENT_SEQUENCE_ID);
    }

    /**
     * 重置 「Batch Payment Sequence」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetBatchPaymentSequenceId() {
        this._reset(FIELD_BATCH_PAYMENT_SEQUENCE_ID);
        return this;
    }

    /**
     * 设置「退件电子邮件」
     * @param val
     */
    @JsonProperty(FIELD_BOUNCE_EMAIL)
    public ResCompanyDTO setBounceEmail(String val) {
        this._set(FIELD_BOUNCE_EMAIL, val);
        return this;
    }

    /**
     * 获取「退件电子邮件」值
     *
     */
    @JsonIgnore
    public String getBounceEmail() {
        return DataTypeUtils.asString(this._get(FIELD_BOUNCE_EMAIL), null);
    }

    /**
     * 判断 「退件电子邮件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBounceEmail() {
        return this._contains(FIELD_BOUNCE_EMAIL);
    }

    /**
     * 重置 「退件电子邮件」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetBounceEmail() {
        this._reset(FIELD_BOUNCE_EMAIL);
        return this;
    }

    /**
     * 设置「退回」
     * @param val
     */
    @JsonProperty(FIELD_BOUNCE_FORMATTED)
    public ResCompanyDTO setBounceFormatted(String val) {
        this._set(FIELD_BOUNCE_FORMATTED, val);
        return this;
    }

    /**
     * 获取「退回」值
     *
     */
    @JsonIgnore
    public String getBounceFormatted() {
        return DataTypeUtils.asString(this._get(FIELD_BOUNCE_FORMATTED), null);
    }

    /**
     * 判断 「退回」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBounceFormatted() {
        return this._contains(FIELD_BOUNCE_FORMATTED);
    }

    /**
     * 重置 「退回」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetBounceFormatted() {
        this._reset(FIELD_BOUNCE_FORMATTED);
        return this;
    }

    /**
     * 设置「候选人属性」
     * @param val
     */
    @JsonProperty(FIELD_CANDIDATE_PROPERTIES_DEFINITION)
    public ResCompanyDTO setCandidatePropertiesDefinition(String val) {
        this._set(FIELD_CANDIDATE_PROPERTIES_DEFINITION, val);
        return this;
    }

    /**
     * 获取「候选人属性」值
     *
     */
    @JsonIgnore
    public String getCandidatePropertiesDefinition() {
        return DataTypeUtils.asString(this._get(FIELD_CANDIDATE_PROPERTIES_DEFINITION), null);
    }

    /**
     * 判断 「候选人属性」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCandidatePropertiesDefinition() {
        return this._contains(FIELD_CANDIDATE_PROPERTIES_DEFINITION);
    }

    /**
     * 重置 「候选人属性」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetCandidatePropertiesDefinition() {
        this._reset(FIELD_CANDIDATE_PROPERTIES_DEFINITION);
        return this;
    }

    /**
     * 设置「Prefix of the cash accounts」
     * @param val
     */
    @JsonProperty(FIELD_CASH_ACCOUNT_CODE_PREFIX)
    public ResCompanyDTO setCashAccountCodePrefix(String val) {
        this._set(FIELD_CASH_ACCOUNT_CODE_PREFIX, val);
        return this;
    }

    /**
     * 获取「Prefix of the cash accounts」值
     *
     */
    @JsonIgnore
    public String getCashAccountCodePrefix() {
        return DataTypeUtils.asString(this._get(FIELD_CASH_ACCOUNT_CODE_PREFIX), null);
    }

    /**
     * 判断 「Prefix of the cash accounts」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCashAccountCodePrefix() {
        return this._contains(FIELD_CASH_ACCOUNT_CODE_PREFIX);
    }

    /**
     * 重置 「Prefix of the cash accounts」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetCashAccountCodePrefix() {
        this._reset(FIELD_CASH_ACCOUNT_CODE_PREFIX);
        return this;
    }

    /**
     * 设置「预设邮件」
     * @param val
     */
    @JsonProperty(FIELD_CATCHALL_EMAIL)
    public ResCompanyDTO setCatchallEmail(String val) {
        this._set(FIELD_CATCHALL_EMAIL, val);
        return this;
    }

    /**
     * 获取「预设邮件」值
     *
     */
    @JsonIgnore
    public String getCatchallEmail() {
        return DataTypeUtils.asString(this._get(FIELD_CATCHALL_EMAIL), null);
    }

    /**
     * 判断 「预设邮件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCatchallEmail() {
        return this._contains(FIELD_CATCHALL_EMAIL);
    }

    /**
     * 重置 「预设邮件」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetCatchallEmail() {
        this._reset(FIELD_CATCHALL_EMAIL);
        return this;
    }

    /**
     * 设置「预设」
     * @param val
     */
    @JsonProperty(FIELD_CATCHALL_FORMATTED)
    public ResCompanyDTO setCatchallFormatted(String val) {
        this._set(FIELD_CATCHALL_FORMATTED, val);
        return this;
    }

    /**
     * 获取「预设」值
     *
     */
    @JsonIgnore
    public String getCatchallFormatted() {
        return DataTypeUtils.asString(this._get(FIELD_CATCHALL_FORMATTED), null);
    }

    /**
     * 判断 「预设」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCatchallFormatted() {
        return this._contains(FIELD_CATCHALL_FORMATTED);
    }

    /**
     * 重置 「预设」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetCatchallFormatted() {
        this._reset(FIELD_CATCHALL_FORMATTED);
        return this;
    }

    /**
     * 设置「审计跟踪」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_CHECK_ACCOUNT_AUDIT_TRAIL)
    public ResCompanyDTO setCheckAccountAuditTrail(Integer val) {
        this._set(FIELD_CHECK_ACCOUNT_AUDIT_TRAIL, val);
        return this;
    }

    /**
     * 获取「审计跟踪」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getCheckAccountAuditTrail() {
        return DataTypeUtils.asInteger(this._get(FIELD_CHECK_ACCOUNT_AUDIT_TRAIL), null);
    }

    /**
     * 判断 「审计跟踪」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCheckAccountAuditTrail() {
        return this._contains(FIELD_CHECK_ACCOUNT_AUDIT_TRAIL);
    }

    /**
     * 重置 「审计跟踪」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetCheckAccountAuditTrail() {
        this._reset(FIELD_CHECK_ACCOUNT_AUDIT_TRAIL);
        return this;
    }

    /**
     * 设置「城市」
     * @param val
     */
    @JsonProperty(FIELD_CITY)
    public ResCompanyDTO setCity(String val) {
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
    public ResCompanyDTO resetCity() {
        this._reset(FIELD_CITY);
        return this;
    }

    /**
     * 设置「颜色」
     * @param val
     */
    @JsonProperty(FIELD_COLOR)
    public ResCompanyDTO setColor(Integer val) {
        this._set(FIELD_COLOR, val);
        return this;
    }

    /**
     * 获取「颜色」值
     *
     */
    @JsonIgnore
    public Integer getColor() {
        return DataTypeUtils.asInteger(this._get(FIELD_COLOR), null);
    }

    /**
     * 判断 「颜色」是否有值
     *
     */
    @JsonIgnore
    public boolean containsColor() {
        return this._contains(FIELD_COLOR);
    }

    /**
     * 重置 「颜色」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetColor() {
        this._reset(FIELD_COLOR);
        return this;
    }

    /**
     * 设置「公司详情」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_DETAILS)
    public ResCompanyDTO setCompanyDetails(String val) {
        this._set(FIELD_COMPANY_DETAILS, val);
        return this;
    }

    /**
     * 获取「公司详情」值
     *
     */
    @JsonIgnore
    public String getCompanyDetails() {
        return DataTypeUtils.asString(this._get(FIELD_COMPANY_DETAILS), null);
    }

    /**
     * 判断 「公司详情」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCompanyDetails() {
        return this._contains(FIELD_COMPANY_DETAILS);
    }

    /**
     * 重置 「公司详情」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetCompanyDetails() {
        this._reset(FIELD_COMPANY_DETAILS);
        return this;
    }

    /**
     * 设置「公司注册处占位符」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_REGISTRY_PLACEHOLDER)
    public ResCompanyDTO setCompanyRegistryPlaceholder(String val) {
        this._set(FIELD_COMPANY_REGISTRY_PLACEHOLDER, val);
        return this;
    }

    /**
     * 获取「公司注册处占位符」值
     *
     */
    @JsonIgnore
    public String getCompanyRegistryPlaceholder() {
        return DataTypeUtils.asString(this._get(FIELD_COMPANY_REGISTRY_PLACEHOLDER), null);
    }

    /**
     * 判断 「公司注册处占位符」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCompanyRegistryPlaceholder() {
        return this._contains(FIELD_COMPANY_REGISTRY_PLACEHOLDER);
    }

    /**
     * 重置 「公司注册处占位符」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetCompanyRegistryPlaceholder() {
        this._reset(FIELD_COMPANY_REGISTRY_PLACEHOLDER);
        return this;
    }

    /**
     * 设置「公司增值税占位符」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_VAT_PLACEHOLDER)
    public ResCompanyDTO setCompanyVatPlaceholder(String val) {
        this._set(FIELD_COMPANY_VAT_PLACEHOLDER, val);
        return this;
    }

    /**
     * 获取「公司增值税占位符」值
     *
     */
    @JsonIgnore
    public String getCompanyVatPlaceholder() {
        return DataTypeUtils.asString(this._get(FIELD_COMPANY_VAT_PLACEHOLDER), null);
    }

    /**
     * 判断 「公司增值税占位符」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCompanyVatPlaceholder() {
        return this._contains(FIELD_COMPANY_VAT_PLACEHOLDER);
    }

    /**
     * 重置 「公司增值税占位符」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetCompanyVatPlaceholder() {
        this._reset(FIELD_COMPANY_VAT_PLACEHOLDER);
        return this;
    }

    /**
     * 设置「合同到期通知期」
     * @param val
     */
    @JsonProperty(FIELD_CONTRACT_EXPIRATION_NOTICE_PERIOD)
    public ResCompanyDTO setContractExpirationNoticePeriod(Integer val) {
        this._set(FIELD_CONTRACT_EXPIRATION_NOTICE_PERIOD, val);
        return this;
    }

    /**
     * 获取「合同到期通知期」值
     *
     */
    @JsonIgnore
    public Integer getContractExpirationNoticePeriod() {
        return DataTypeUtils.asInteger(this._get(FIELD_CONTRACT_EXPIRATION_NOTICE_PERIOD), null);
    }

    /**
     * 判断 「合同到期通知期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsContractExpirationNoticePeriod() {
        return this._contains(FIELD_CONTRACT_EXPIRATION_NOTICE_PERIOD);
    }

    /**
     * 重置 「合同到期通知期」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetContractExpirationNoticePeriod() {
        this._reset(FIELD_CONTRACT_EXPIRATION_NOTICE_PERIOD);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public ResCompanyDTO setCreateDate(Timestamp val) {
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
    public ResCompanyDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public ResCompanyDTO setCreateUid(String val) {
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
    public ResCompanyDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「币别」
     * @param val
     */
    @JsonProperty(FIELD_CURRENCY_ID)
    public ResCompanyDTO setCurrencyId(String val) {
        this._set(FIELD_CURRENCY_ID, val);
        return this;
    }

    /**
     * 获取「币别」值
     *
     */
    @JsonIgnore
    public String getCurrencyId() {
        return DataTypeUtils.asString(this._get(FIELD_CURRENCY_ID), null);
    }

    /**
     * 判断 「币别」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCurrencyId() {
        return this._contains(FIELD_CURRENCY_ID);
    }

    /**
     * 重置 「币别」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetCurrencyId() {
        this._reset(FIELD_CURRENCY_ID);
        return this;
    }

    /**
     * 设置「币别」
     * @param val
     */
    @JsonProperty(FIELD_CURRENCY_NAME)
    public ResCompanyDTO setCurrencyName(String val) {
        this._set(FIELD_CURRENCY_NAME, val);
        return this;
    }

    /**
     * 获取「币别」值
     *
     */
    @JsonIgnore
    public String getCurrencyName() {
        return DataTypeUtils.asString(this._get(FIELD_CURRENCY_NAME), null);
    }

    /**
     * 判断 「币别」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCurrencyName() {
        return this._contains(FIELD_CURRENCY_NAME);
    }

    /**
     * 重置 「币别」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetCurrencyName() {
        this._reset(FIELD_CURRENCY_NAME);
        return this;
    }

    /**
     * 设置「采购前置天数」
     * @param val
     */
    @JsonProperty(FIELD_DAYS_TO_PURCHASE)
    public ResCompanyDTO setDaysToPurchase(Double val) {
        this._set(FIELD_DAYS_TO_PURCHASE, val);
        return this;
    }

    /**
     * 获取「采购前置天数」值
     *
     */
    @JsonIgnore
    public Double getDaysToPurchase() {
        return DataTypeUtils.asDouble(this._get(FIELD_DAYS_TO_PURCHASE), null);
    }

    /**
     * 判断 「采购前置天数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDaysToPurchase() {
        return this._contains(FIELD_DAYS_TO_PURCHASE);
    }

    /**
     * 重置 「采购前置天数」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetDaysToPurchase() {
        this._reset(FIELD_DAYS_TO_PURCHASE);
        return this;
    }

    /**
     * 设置「大写发票总额」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_INVOICE_AMOUNT_TOTAL_WORDS)
    public ResCompanyDTO setDisplayInvoiceAmountTotalWords(Integer val) {
        this._set(FIELD_DISPLAY_INVOICE_AMOUNT_TOTAL_WORDS, val);
        return this;
    }

    /**
     * 获取「大写发票总额」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getDisplayInvoiceAmountTotalWords() {
        return DataTypeUtils.asInteger(this._get(FIELD_DISPLAY_INVOICE_AMOUNT_TOTAL_WORDS), null);
    }

    /**
     * 判断 「大写发票总额」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDisplayInvoiceAmountTotalWords() {
        return this._contains(FIELD_DISPLAY_INVOICE_AMOUNT_TOTAL_WORDS);
    }

    /**
     * 重置 「大写发票总额」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetDisplayInvoiceAmountTotalWords() {
        this._reset(FIELD_DISPLAY_INVOICE_AMOUNT_TOTAL_WORDS);
        return this;
    }

    /**
     * 设置「税款以公司币别表示」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_INVOICE_TAX_COMPANY_CURRENCY)
    public ResCompanyDTO setDisplayInvoiceTaxCompanyCurrency(Integer val) {
        this._set(FIELD_DISPLAY_INVOICE_TAX_COMPANY_CURRENCY, val);
        return this;
    }

    /**
     * 获取「税款以公司币别表示」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getDisplayInvoiceTaxCompanyCurrency() {
        return DataTypeUtils.asInteger(this._get(FIELD_DISPLAY_INVOICE_TAX_COMPANY_CURRENCY), null);
    }

    /**
     * 判断 「税款以公司币别表示」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDisplayInvoiceTaxCompanyCurrency() {
        return this._contains(FIELD_DISPLAY_INVOICE_TAX_COMPANY_CURRENCY);
    }

    /**
     * 重置 「税款以公司币别表示」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetDisplayInvoiceTaxCompanyCurrency() {
        this._reset(FIELD_DISPLAY_INVOICE_TAX_COMPANY_CURRENCY);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public ResCompanyDTO setDisplayName(String val) {
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
    public ResCompanyDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「格式化的邮件」
     * @param val
     */
    @JsonProperty(FIELD_EMAIL_FORMATTED)
    public ResCompanyDTO setEmailFormatted(String val) {
        this._set(FIELD_EMAIL_FORMATTED, val);
        return this;
    }

    /**
     * 获取「格式化的邮件」值
     *
     */
    @JsonIgnore
    public String getEmailFormatted() {
        return DataTypeUtils.asString(this._get(FIELD_EMAIL_FORMATTED), null);
    }

    /**
     * 判断 「格式化的邮件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEmailFormatted() {
        return this._contains(FIELD_EMAIL_FORMATTED);
    }

    /**
     * 重置 「格式化的邮件」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetEmailFormatted() {
        this._reset(FIELD_EMAIL_FORMATTED);
        return this;
    }

    /**
     * 设置「电子邮件标题颜色」
     * @param val
     */
    @JsonProperty(FIELD_EMAIL_PRIMARY_COLOR)
    public ResCompanyDTO setEmailPrimaryColor(String val) {
        this._set(FIELD_EMAIL_PRIMARY_COLOR, val);
        return this;
    }

    /**
     * 获取「电子邮件标题颜色」值
     *
     */
    @JsonIgnore
    public String getEmailPrimaryColor() {
        return DataTypeUtils.asString(this._get(FIELD_EMAIL_PRIMARY_COLOR), null);
    }

    /**
     * 判断 「电子邮件标题颜色」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEmailPrimaryColor() {
        return this._contains(FIELD_EMAIL_PRIMARY_COLOR);
    }

    /**
     * 重置 「电子邮件标题颜色」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetEmailPrimaryColor() {
        this._reset(FIELD_EMAIL_PRIMARY_COLOR);
        return this;
    }

    /**
     * 设置「电子邮件按钮颜色」
     * @param val
     */
    @JsonProperty(FIELD_EMAIL_SECONDARY_COLOR)
    public ResCompanyDTO setEmailSecondaryColor(String val) {
        this._set(FIELD_EMAIL_SECONDARY_COLOR, val);
        return this;
    }

    /**
     * 获取「电子邮件按钮颜色」值
     *
     */
    @JsonIgnore
    public String getEmailSecondaryColor() {
        return DataTypeUtils.asString(this._get(FIELD_EMAIL_SECONDARY_COLOR), null);
    }

    /**
     * 判断 「电子邮件按钮颜色」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEmailSecondaryColor() {
        return this._contains(FIELD_EMAIL_SECONDARY_COLOR);
    }

    /**
     * 重置 「电子邮件按钮颜色」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetEmailSecondaryColor() {
        this._reset(FIELD_EMAIL_SECONDARY_COLOR);
        return this;
    }

    /**
     * 设置「员工属性」
     * @param val
     */
    @JsonProperty(FIELD_EMPLOYEE_PROPERTIES_DEFINITION)
    public ResCompanyDTO setEmployeePropertiesDefinition(String val) {
        this._set(FIELD_EMPLOYEE_PROPERTIES_DEFINITION, val);
        return this;
    }

    /**
     * 获取「员工属性」值
     *
     */
    @JsonIgnore
    public String getEmployeePropertiesDefinition() {
        return DataTypeUtils.asString(this._get(FIELD_EMPLOYEE_PROPERTIES_DEFINITION), null);
    }

    /**
     * 判断 「员工属性」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEmployeePropertiesDefinition() {
        return this._contains(FIELD_EMPLOYEE_PROPERTIES_DEFINITION);
    }

    /**
     * 重置 「员工属性」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetEmployeePropertiesDefinition() {
        this._reset(FIELD_EMPLOYEE_PROPERTIES_DEFINITION);
        return this;
    }

    /**
     * 设置「Expects a Chart of Accounts」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_EXPECTS_CHART_OF_ACCOUNTS)
    public ResCompanyDTO setExpectsChartOfAccounts(Integer val) {
        this._set(FIELD_EXPECTS_CHART_OF_ACCOUNTS, val);
        return this;
    }

    /**
     * 获取「Expects a Chart of Accounts」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getExpectsChartOfAccounts() {
        return DataTypeUtils.asInteger(this._get(FIELD_EXPECTS_CHART_OF_ACCOUNTS), null);
    }

    /**
     * 判断 「Expects a Chart of Accounts」是否有值
     *
     */
    @JsonIgnore
    public boolean containsExpectsChartOfAccounts() {
        return this._contains(FIELD_EXPECTS_CHART_OF_ACCOUNTS);
    }

    /**
     * 重置 「Expects a Chart of Accounts」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetExpectsChartOfAccounts() {
        this._reset(FIELD_EXPECTS_CHART_OF_ACCOUNTS);
        return this;
    }

    /**
     * 设置「会计年度最后一天」
     * @param val
     */
    @JsonProperty(FIELD_FISCALYEAR_LAST_DAY)
    public ResCompanyDTO setFiscalyearLastDay(Integer val) {
        this._set(FIELD_FISCALYEAR_LAST_DAY, val);
        return this;
    }

    /**
     * 获取「会计年度最后一天」值
     *
     */
    @JsonIgnore
    public Integer getFiscalyearLastDay() {
        return DataTypeUtils.asInteger(this._get(FIELD_FISCALYEAR_LAST_DAY), null);
    }

    /**
     * 判断 「会计年度最后一天」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFiscalyearLastDay() {
        return this._contains(FIELD_FISCALYEAR_LAST_DAY);
    }

    /**
     * 重置 「会计年度最后一天」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetFiscalyearLastDay() {
        this._reset(FIELD_FISCALYEAR_LAST_DAY);
        return this;
    }

    /**
     * 设置「会计年度最后一个月」
     * 代码表[会计年度最后一个月]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_fiscalyear_last_month
     * @param val
     */
    @JsonProperty(FIELD_FISCALYEAR_LAST_MONTH)
    public ResCompanyDTO setFiscalyearLastMonth(String val) {
        this._set(FIELD_FISCALYEAR_LAST_MONTH, val);
        return this;
    }

    /**
     * 获取「会计年度最后一个月」值
     * 代码表[会计年度最后一个月]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_fiscalyear_last_month
     *
     */
    @JsonIgnore
    public String getFiscalyearLastMonth() {
        return DataTypeUtils.asString(this._get(FIELD_FISCALYEAR_LAST_MONTH), null);
    }

    /**
     * 判断 「会计年度最后一个月」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFiscalyearLastMonth() {
        return this._contains(FIELD_FISCALYEAR_LAST_MONTH);
    }

    /**
     * 重置 「会计年度最后一个月」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetFiscalyearLastMonth() {
        this._reset(FIELD_FISCALYEAR_LAST_MONTH);
        return this;
    }

    /**
     * 设置「全球锁定日期」
     * @param val
     */
    @JsonProperty(FIELD_FISCALYEAR_LOCK_DATE)
    public ResCompanyDTO setFiscalyearLockDate(Timestamp val) {
        this._set(FIELD_FISCALYEAR_LOCK_DATE, val);
        return this;
    }

    /**
     * 获取「全球锁定日期」值
     *
     */
    @JsonIgnore
    public Timestamp getFiscalyearLockDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_FISCALYEAR_LOCK_DATE), null);
    }

    /**
     * 判断 「全球锁定日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFiscalyearLockDate() {
        return this._contains(FIELD_FISCALYEAR_LOCK_DATE);
    }

    /**
     * 重置 「全球锁定日期」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetFiscalyearLockDate() {
        this._reset(FIELD_FISCALYEAR_LOCK_DATE);
        return this;
    }

    /**
     * 设置「字体」
     * 代码表[字体]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_font
     * @param val
     */
    @JsonProperty(FIELD_FONT)
    public ResCompanyDTO setFont(String val) {
        this._set(FIELD_FONT, val);
        return this;
    }

    /**
     * 获取「字体」值
     * 代码表[字体]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_font
     *
     */
    @JsonIgnore
    public String getFont() {
        return DataTypeUtils.asString(this._get(FIELD_FONT), null);
    }

    /**
     * 判断 「字体」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFont() {
        return this._contains(FIELD_FONT);
    }

    /**
     * 重置 「字体」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetFont() {
        this._reset(FIELD_FONT);
        return this;
    }

    /**
     * 设置「硬锁定日期」
     * @param val
     */
    @JsonProperty(FIELD_HARD_LOCK_DATE)
    public ResCompanyDTO setHardLockDate(Timestamp val) {
        this._set(FIELD_HARD_LOCK_DATE, val);
        return this;
    }

    /**
     * 获取「硬锁定日期」值
     *
     */
    @JsonIgnore
    public Timestamp getHardLockDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_HARD_LOCK_DATE), null);
    }

    /**
     * 判断 「硬锁定日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHardLockDate() {
        return this._contains(FIELD_HARD_LOCK_DATE);
    }

    /**
     * 重置 「硬锁定日期」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetHardLockDate() {
        this._reset(FIELD_HARD_LOCK_DATE);
        return this;
    }

    /**
     * 设置「有消息」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_HAS_MESSAGE)
    public ResCompanyDTO setHasMessage(Integer val) {
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
    public ResCompanyDTO resetHasMessage() {
        this._reset(FIELD_HAS_MESSAGE);
        return this;
    }

    /**
     * 设置「已收到库存警告短信息」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_HAS_RECEIVED_WARNING_STOCK_SMS)
    public ResCompanyDTO setHasReceivedWarningStockSms(Integer val) {
        this._set(FIELD_HAS_RECEIVED_WARNING_STOCK_SMS, val);
        return this;
    }

    /**
     * 获取「已收到库存警告短信息」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getHasReceivedWarningStockSms() {
        return DataTypeUtils.asInteger(this._get(FIELD_HAS_RECEIVED_WARNING_STOCK_SMS), null);
    }

    /**
     * 判断 「已收到库存警告短信息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHasReceivedWarningStockSms() {
        return this._contains(FIELD_HAS_RECEIVED_WARNING_STOCK_SMS);
    }

    /**
     * 重置 「已收到库存警告短信息」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetHasReceivedWarningStockSms() {
        this._reset(FIELD_HAS_RECEIVED_WARNING_STOCK_SMS);
        return this;
    }

    /**
     * 设置「显示额外时间」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_HR_ATTENDANCE_DISPLAY_OVERTIME)
    public ResCompanyDTO setHrAttendanceDisplayOvertime(Integer val) {
        this._set(FIELD_HR_ATTENDANCE_DISPLAY_OVERTIME, val);
        return this;
    }

    /**
     * 获取「显示额外时间」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getHrAttendanceDisplayOvertime() {
        return DataTypeUtils.asInteger(this._get(FIELD_HR_ATTENDANCE_DISPLAY_OVERTIME), null);
    }

    /**
     * 判断 「显示额外时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHrAttendanceDisplayOvertime() {
        return this._contains(FIELD_HR_ATTENDANCE_DISPLAY_OVERTIME);
    }

    /**
     * 重置 「显示额外时间」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetHrAttendanceDisplayOvertime() {
        this._reset(FIELD_HR_ATTENDANCE_DISPLAY_OVERTIME);
        return this;
    }

    /**
     * 设置「根据出勤率」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_HR_PRESENCE_CONTROL_ATTENDANCE)
    public ResCompanyDTO setHrPresenceControlAttendance(Integer val) {
        this._set(FIELD_HR_PRESENCE_CONTROL_ATTENDANCE, val);
        return this;
    }

    /**
     * 获取「根据出勤率」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getHrPresenceControlAttendance() {
        return DataTypeUtils.asInteger(this._get(FIELD_HR_PRESENCE_CONTROL_ATTENDANCE), null);
    }

    /**
     * 判断 「根据出勤率」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHrPresenceControlAttendance() {
        return this._contains(FIELD_HR_PRESENCE_CONTROL_ATTENDANCE);
    }

    /**
     * 重置 「根据出勤率」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetHrPresenceControlAttendance() {
        this._reset(FIELD_HR_PRESENCE_CONTROL_ATTENDANCE);
        return this;
    }

    /**
     * 设置「根据发送的电子邮件数量」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_HR_PRESENCE_CONTROL_EMAIL)
    public ResCompanyDTO setHrPresenceControlEmail(Integer val) {
        this._set(FIELD_HR_PRESENCE_CONTROL_EMAIL, val);
        return this;
    }

    /**
     * 获取「根据发送的电子邮件数量」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getHrPresenceControlEmail() {
        return DataTypeUtils.asInteger(this._get(FIELD_HR_PRESENCE_CONTROL_EMAIL), null);
    }

    /**
     * 判断 「根据发送的电子邮件数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHrPresenceControlEmail() {
        return this._contains(FIELD_HR_PRESENCE_CONTROL_EMAIL);
    }

    /**
     * 重置 「根据发送的电子邮件数量」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetHrPresenceControlEmail() {
        this._reset(FIELD_HR_PRESENCE_CONTROL_EMAIL);
        return this;
    }

    /**
     * 设置「# 要发送的电子邮件」
     * @param val
     */
    @JsonProperty(FIELD_HR_PRESENCE_CONTROL_EMAIL_AMOUNT)
    public ResCompanyDTO setHrPresenceControlEmailAmount(Integer val) {
        this._set(FIELD_HR_PRESENCE_CONTROL_EMAIL_AMOUNT, val);
        return this;
    }

    /**
     * 获取「# 要发送的电子邮件」值
     *
     */
    @JsonIgnore
    public Integer getHrPresenceControlEmailAmount() {
        return DataTypeUtils.asInteger(this._get(FIELD_HR_PRESENCE_CONTROL_EMAIL_AMOUNT), null);
    }

    /**
     * 判断 「# 要发送的电子邮件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHrPresenceControlEmailAmount() {
        return this._contains(FIELD_HR_PRESENCE_CONTROL_EMAIL_AMOUNT);
    }

    /**
     * 重置 「# 要发送的电子邮件」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetHrPresenceControlEmailAmount() {
        this._reset(FIELD_HR_PRESENCE_CONTROL_EMAIL_AMOUNT);
        return this;
    }

    /**
     * 设置「基于IP地址」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_HR_PRESENCE_CONTROL_IP)
    public ResCompanyDTO setHrPresenceControlIp(Integer val) {
        this._set(FIELD_HR_PRESENCE_CONTROL_IP, val);
        return this;
    }

    /**
     * 获取「基于IP地址」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getHrPresenceControlIp() {
        return DataTypeUtils.asInteger(this._get(FIELD_HR_PRESENCE_CONTROL_IP), null);
    }

    /**
     * 判断 「基于IP地址」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHrPresenceControlIp() {
        return this._contains(FIELD_HR_PRESENCE_CONTROL_IP);
    }

    /**
     * 重置 「基于IP地址」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetHrPresenceControlIp() {
        this._reset(FIELD_HR_PRESENCE_CONTROL_IP);
        return this;
    }

    /**
     * 设置「有效的IP地址」
     * @param val
     */
    @JsonProperty(FIELD_HR_PRESENCE_CONTROL_IP_LIST)
    public ResCompanyDTO setHrPresenceControlIpList(String val) {
        this._set(FIELD_HR_PRESENCE_CONTROL_IP_LIST, val);
        return this;
    }

    /**
     * 获取「有效的IP地址」值
     *
     */
    @JsonIgnore
    public String getHrPresenceControlIpList() {
        return DataTypeUtils.asString(this._get(FIELD_HR_PRESENCE_CONTROL_IP_LIST), null);
    }

    /**
     * 判断 「有效的IP地址」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHrPresenceControlIpList() {
        return this._contains(FIELD_HR_PRESENCE_CONTROL_IP_LIST);
    }

    /**
     * 重置 「有效的IP地址」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetHrPresenceControlIpList() {
        this._reset(FIELD_HR_PRESENCE_CONTROL_IP_LIST);
        return this;
    }

    /**
     * 设置「基于系统中的用户状态」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_HR_PRESENCE_CONTROL_LOGIN)
    public ResCompanyDTO setHrPresenceControlLogin(Integer val) {
        this._set(FIELD_HR_PRESENCE_CONTROL_LOGIN, val);
        return this;
    }

    /**
     * 获取「基于系统中的用户状态」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getHrPresenceControlLogin() {
        return DataTypeUtils.asInteger(this._get(FIELD_HR_PRESENCE_CONTROL_LOGIN), null);
    }

    /**
     * 判断 「基于系统中的用户状态」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHrPresenceControlLogin() {
        return this._contains(FIELD_HR_PRESENCE_CONTROL_LOGIN);
    }

    /**
     * 重置 「基于系统中的用户状态」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetHrPresenceControlLogin() {
        this._reset(FIELD_HR_PRESENCE_CONTROL_LOGIN);
        return this;
    }

    /**
     * 设置「丰富完成」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IAP_ENRICH_AUTO_DONE)
    public ResCompanyDTO setIapEnrichAutoDone(Integer val) {
        this._set(FIELD_IAP_ENRICH_AUTO_DONE, val);
        return this;
    }

    /**
     * 获取「丰富完成」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIapEnrichAutoDone() {
        return DataTypeUtils.asInteger(this._get(FIELD_IAP_ENRICH_AUTO_DONE), null);
    }

    /**
     * 判断 「丰富完成」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIapEnrichAutoDone() {
        return this._contains(FIELD_IAP_ENRICH_AUTO_DONE);
    }

    /**
     * 重置 「丰富完成」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetIapEnrichAutoDone() {
        this._reset(FIELD_IAP_ENRICH_AUTO_DONE);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public ResCompanyDTO setId(String val) {
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
    public ResCompanyDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「Default Terms and Conditions」
     * @param val
     */
    @JsonProperty(FIELD_INVOICE_TERMS)
    public ResCompanyDTO setInvoiceTerms(String val) {
        this._set(FIELD_INVOICE_TERMS, val);
        return this;
    }

    /**
     * 获取「Default Terms and Conditions」值
     *
     */
    @JsonIgnore
    public String getInvoiceTerms() {
        return DataTypeUtils.asString(this._get(FIELD_INVOICE_TERMS), null);
    }

    /**
     * 判断 「Default Terms and Conditions」是否有值
     *
     */
    @JsonIgnore
    public boolean containsInvoiceTerms() {
        return this._contains(FIELD_INVOICE_TERMS);
    }

    /**
     * 重置 「Default Terms and Conditions」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetInvoiceTerms() {
        this._reset(FIELD_INVOICE_TERMS);
        return this;
    }

    /**
     * 设置「Default Terms and Conditions as a Web page」
     * @param val
     */
    @JsonProperty(FIELD_INVOICE_TERMS_HTML)
    public ResCompanyDTO setInvoiceTermsHtml(String val) {
        this._set(FIELD_INVOICE_TERMS_HTML, val);
        return this;
    }

    /**
     * 获取「Default Terms and Conditions as a Web page」值
     *
     */
    @JsonIgnore
    public String getInvoiceTermsHtml() {
        return DataTypeUtils.asString(this._get(FIELD_INVOICE_TERMS_HTML), null);
    }

    /**
     * 判断 「Default Terms and Conditions as a Web page」是否有值
     *
     */
    @JsonIgnore
    public boolean containsInvoiceTermsHtml() {
        return this._contains(FIELD_INVOICE_TERMS_HTML);
    }

    /**
     * 重置 「Default Terms and Conditions as a Web page」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetInvoiceTermsHtml() {
        this._reset(FIELD_INVOICE_TERMS_HTML);
        return this;
    }

    /**
     * 设置「公司详细信息是否为空」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_COMPANY_DETAILS_EMPTY)
    public ResCompanyDTO setIsCompanyDetailsEmpty(Integer val) {
        this._set(FIELD_IS_COMPANY_DETAILS_EMPTY, val);
        return this;
    }

    /**
     * 获取「公司详细信息是否为空」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsCompanyDetailsEmpty() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_COMPANY_DETAILS_EMPTY), null);
    }

    /**
     * 判断 「公司详细信息是否为空」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsCompanyDetailsEmpty() {
        return this._contains(FIELD_IS_COMPANY_DETAILS_EMPTY);
    }

    /**
     * 重置 「公司详细信息是否为空」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetIsCompanyDetailsEmpty() {
        this._reset(FIELD_IS_COMPANY_DETAILS_EMPTY);
        return this;
    }

    /**
     * 设置「职位属性」
     * @param val
     */
    @JsonProperty(FIELD_JOB_PROPERTIES_DEFINITION)
    public ResCompanyDTO setJobPropertiesDefinition(String val) {
        this._set(FIELD_JOB_PROPERTIES_DEFINITION, val);
        return this;
    }

    /**
     * 获取「职位属性」值
     *
     */
    @JsonIgnore
    public String getJobPropertiesDefinition() {
        return DataTypeUtils.asString(this._get(FIELD_JOB_PROPERTIES_DEFINITION), null);
    }

    /**
     * 判断 「职位属性」是否有值
     *
     */
    @JsonIgnore
    public boolean containsJobPropertiesDefinition() {
        return this._contains(FIELD_JOB_PROPERTIES_DEFINITION);
    }

    /**
     * 重置 「职位属性」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetJobPropertiesDefinition() {
        this._reset(FIELD_JOB_PROPERTIES_DEFINITION);
        return this;
    }

    /**
     * 设置「布局背景」
     * 代码表[布局背景]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_layout_background
     * @param val
     */
    @JsonProperty(FIELD_LAYOUT_BACKGROUND)
    public ResCompanyDTO setLayoutBackground(String val) {
        this._set(FIELD_LAYOUT_BACKGROUND, val);
        return this;
    }

    /**
     * 获取「布局背景」值
     * 代码表[布局背景]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_layout_background
     *
     */
    @JsonIgnore
    public String getLayoutBackground() {
        return DataTypeUtils.asString(this._get(FIELD_LAYOUT_BACKGROUND), null);
    }

    /**
     * 判断 「布局背景」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLayoutBackground() {
        return this._contains(FIELD_LAYOUT_BACKGROUND);
    }

    /**
     * 重置 「布局背景」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetLayoutBackground() {
        this._reset(FIELD_LAYOUT_BACKGROUND);
        return this;
    }

    /**
     * 设置「制造提前期」
     * @param val
     */
    @JsonProperty(FIELD_MANUFACTURING_LEAD)
    public ResCompanyDTO setManufacturingLead(Double val) {
        this._set(FIELD_MANUFACTURING_LEAD, val);
        return this;
    }

    /**
     * 获取「制造提前期」值
     *
     */
    @JsonIgnore
    public Double getManufacturingLead() {
        return DataTypeUtils.asDouble(this._get(FIELD_MANUFACTURING_LEAD), null);
    }

    /**
     * 判断 「制造提前期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsManufacturingLead() {
        return this._contains(FIELD_MANUFACTURING_LEAD);
    }

    /**
     * 重置 「制造提前期」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetManufacturingLead() {
        this._reset(FIELD_MANUFACTURING_LEAD);
        return this;
    }

    /**
     * 设置「Attachment Count」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_ATTACHMENT_COUNT)
    public ResCompanyDTO setMessageAttachmentCount(Integer val) {
        this._set(FIELD_MESSAGE_ATTACHMENT_COUNT, val);
        return this;
    }

    /**
     * 获取「Attachment Count」值
     *
     */
    @JsonIgnore
    public Integer getMessageAttachmentCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_ATTACHMENT_COUNT), null);
    }

    /**
     * 判断 「Attachment Count」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageAttachmentCount() {
        return this._contains(FIELD_MESSAGE_ATTACHMENT_COUNT);
    }

    /**
     * 重置 「Attachment Count」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetMessageAttachmentCount() {
        this._reset(FIELD_MESSAGE_ATTACHMENT_COUNT);
        return this;
    }

    /**
     * 设置「Message Delivery error」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_HAS_ERROR)
    public ResCompanyDTO setMessageHasError(Integer val) {
        this._set(FIELD_MESSAGE_HAS_ERROR, val);
        return this;
    }

    /**
     * 获取「Message Delivery error」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getMessageHasError() {
        return DataTypeUtils.asInteger(this._get(FIELD_MESSAGE_HAS_ERROR), null);
    }

    /**
     * 判断 「Message Delivery error」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMessageHasError() {
        return this._contains(FIELD_MESSAGE_HAS_ERROR);
    }

    /**
     * 重置 「Message Delivery error」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetMessageHasError() {
        this._reset(FIELD_MESSAGE_HAS_ERROR);
        return this;
    }

    /**
     * 设置「错误数量」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_HAS_ERROR_COUNTER)
    public ResCompanyDTO setMessageHasErrorCounter(Integer val) {
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
    public ResCompanyDTO resetMessageHasErrorCounter() {
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
    public ResCompanyDTO setMessageHasSmsError(Integer val) {
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
    public ResCompanyDTO resetMessageHasSmsError() {
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
    public ResCompanyDTO setMessageIsFollower(Integer val) {
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
    public ResCompanyDTO resetMessageIsFollower() {
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
    public ResCompanyDTO setMessageNeedaction(Integer val) {
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
    public ResCompanyDTO resetMessageNeedaction() {
        this._reset(FIELD_MESSAGE_NEEDACTION);
        return this;
    }

    /**
     * 设置「操作数量」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_NEEDACTION_COUNTER)
    public ResCompanyDTO setMessageNeedactionCounter(Integer val) {
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
    public ResCompanyDTO resetMessageNeedactionCounter() {
        this._reset(FIELD_MESSAGE_NEEDACTION_COUNTER);
        return this;
    }

    /**
     * 设置「我的活动截止时间」
     * @param val
     */
    @JsonProperty(FIELD_MY_ACTIVITY_DATE_DEADLINE)
    public ResCompanyDTO setMyActivityDateDeadline(Timestamp val) {
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
    public ResCompanyDTO resetMyActivityDateDeadline() {
        this._reset(FIELD_MY_ACTIVITY_DATE_DEADLINE);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public ResCompanyDTO setName(String val) {
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
    public ResCompanyDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「对公司有利的宽容时间」
     * @param val
     */
    @JsonProperty(FIELD_OVERTIME_COMPANY_THRESHOLD)
    public ResCompanyDTO setOvertimeCompanyThreshold(Integer val) {
        this._set(FIELD_OVERTIME_COMPANY_THRESHOLD, val);
        return this;
    }

    /**
     * 获取「对公司有利的宽容时间」值
     *
     */
    @JsonIgnore
    public Integer getOvertimeCompanyThreshold() {
        return DataTypeUtils.asInteger(this._get(FIELD_OVERTIME_COMPANY_THRESHOLD), null);
    }

    /**
     * 判断 「对公司有利的宽容时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOvertimeCompanyThreshold() {
        return this._contains(FIELD_OVERTIME_COMPANY_THRESHOLD);
    }

    /**
     * 重置 「对公司有利的宽容时间」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetOvertimeCompanyThreshold() {
        this._reset(FIELD_OVERTIME_COMPANY_THRESHOLD);
        return this;
    }

    /**
     * 设置「对员工有利的宽容时间」
     * @param val
     */
    @JsonProperty(FIELD_OVERTIME_EMPLOYEE_THRESHOLD)
    public ResCompanyDTO setOvertimeEmployeeThreshold(Integer val) {
        this._set(FIELD_OVERTIME_EMPLOYEE_THRESHOLD, val);
        return this;
    }

    /**
     * 获取「对员工有利的宽容时间」值
     *
     */
    @JsonIgnore
    public Integer getOvertimeEmployeeThreshold() {
        return DataTypeUtils.asInteger(this._get(FIELD_OVERTIME_EMPLOYEE_THRESHOLD), null);
    }

    /**
     * 判断 「对员工有利的宽容时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsOvertimeEmployeeThreshold() {
        return this._contains(FIELD_OVERTIME_EMPLOYEE_THRESHOLD);
    }

    /**
     * 重置 「对员工有利的宽容时间」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetOvertimeEmployeeThreshold() {
        this._reset(FIELD_OVERTIME_EMPLOYEE_THRESHOLD);
        return this;
    }

    /**
     * 设置「上级公司」
     * @param val
     */
    @JsonProperty(FIELD_PARENT_ID)
    public ResCompanyDTO setParentId(String val) {
        this._set(FIELD_PARENT_ID, val);
        return this;
    }

    /**
     * 获取「上级公司」值
     *
     */
    @JsonIgnore
    public String getParentId() {
        return DataTypeUtils.asString(this._get(FIELD_PARENT_ID), null);
    }

    /**
     * 判断 「上级公司」是否有值
     *
     */
    @JsonIgnore
    public boolean containsParentId() {
        return this._contains(FIELD_PARENT_ID);
    }

    /**
     * 重置 「上级公司」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetParentId() {
        this._reset(FIELD_PARENT_ID);
        return this;
    }

    /**
     * 设置「上级公司」
     * @param val
     */
    @JsonProperty(FIELD_PARENT_NAME)
    public ResCompanyDTO setParentName(String val) {
        this._set(FIELD_PARENT_NAME, val);
        return this;
    }

    /**
     * 获取「上级公司」值
     *
     */
    @JsonIgnore
    public String getParentName() {
        return DataTypeUtils.asString(this._get(FIELD_PARENT_NAME), null);
    }

    /**
     * 判断 「上级公司」是否有值
     *
     */
    @JsonIgnore
    public boolean containsParentName() {
        return this._contains(FIELD_PARENT_NAME);
    }

    /**
     * 重置 「上级公司」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetParentName() {
        this._reset(FIELD_PARENT_NAME);
        return this;
    }

    /**
     * 设置「上级路径」
     * @param val
     */
    @JsonProperty(FIELD_PARENT_PATH)
    public ResCompanyDTO setParentPath(String val) {
        this._set(FIELD_PARENT_PATH, val);
        return this;
    }

    /**
     * 获取「上级路径」值
     *
     */
    @JsonIgnore
    public String getParentPath() {
        return DataTypeUtils.asString(this._get(FIELD_PARENT_PATH), null);
    }

    /**
     * 判断 「上级路径」是否有值
     *
     */
    @JsonIgnore
    public boolean containsParentPath() {
        return this._contains(FIELD_PARENT_PATH);
    }

    /**
     * 重置 「上级路径」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetParentPath() {
        this._reset(FIELD_PARENT_PATH);
        return this;
    }

    /**
     * 设置「合作伙伴」
     * @param val
     */
    @JsonProperty(FIELD_PARTNER_ID)
    public ResCompanyDTO setPartnerId(String val) {
        this._set(FIELD_PARTNER_ID, val);
        return this;
    }

    /**
     * 获取「合作伙伴」值
     *
     */
    @JsonIgnore
    public String getPartnerId() {
        return DataTypeUtils.asString(this._get(FIELD_PARTNER_ID), null);
    }

    /**
     * 判断 「合作伙伴」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPartnerId() {
        return this._contains(FIELD_PARTNER_ID);
    }

    /**
     * 重置 「合作伙伴」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetPartnerId() {
        this._reset(FIELD_PARTNER_ID);
        return this;
    }

    /**
     * 设置「合作伙伴」
     * @param val
     */
    @JsonProperty(FIELD_PARTNER_NAME)
    public ResCompanyDTO setPartnerName(String val) {
        this._set(FIELD_PARTNER_NAME, val);
        return this;
    }

    /**
     * 获取「合作伙伴」值
     *
     */
    @JsonIgnore
    public String getPartnerName() {
        return DataTypeUtils.asString(this._get(FIELD_PARTNER_NAME), null);
    }

    /**
     * 判断 「合作伙伴」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPartnerName() {
        return this._contains(FIELD_PARTNER_NAME);
    }

    /**
     * 重置 「合作伙伴」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetPartnerName() {
        this._reset(FIELD_PARTNER_NAME);
        return this;
    }

    /**
     * 设置「选择支付方式」
     * 代码表[选择支付方式]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_payment_onboarding_payment_method
     * @param val
     */
    @JsonProperty(FIELD_PAYMENT_ONBOARDING_PAYMENT_METHOD)
    public ResCompanyDTO setPaymentOnboardingPaymentMethod(String val) {
        this._set(FIELD_PAYMENT_ONBOARDING_PAYMENT_METHOD, val);
        return this;
    }

    /**
     * 获取「选择支付方式」值
     * 代码表[选择支付方式]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_payment_onboarding_payment_method
     *
     */
    @JsonIgnore
    public String getPaymentOnboardingPaymentMethod() {
        return DataTypeUtils.asString(this._get(FIELD_PAYMENT_ONBOARDING_PAYMENT_METHOD), null);
    }

    /**
     * 判断 「选择支付方式」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPaymentOnboardingPaymentMethod() {
        return this._contains(FIELD_PAYMENT_ONBOARDING_PAYMENT_METHOD);
    }

    /**
     * 重置 「选择支付方式」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetPaymentOnboardingPaymentMethod() {
        this._reset(FIELD_PAYMENT_ONBOARDING_PAYMENT_METHOD);
        return this;
    }

    /**
     * 设置「批准等级」
     * 代码表[批准等级]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_po_double_validation
     * @param val
     */
    @JsonProperty(FIELD_PO_DOUBLE_VALIDATION)
    public ResCompanyDTO setPoDoubleValidation(String val) {
        this._set(FIELD_PO_DOUBLE_VALIDATION, val);
        return this;
    }

    /**
     * 获取「批准等级」值
     * 代码表[批准等级]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_po_double_validation
     *
     */
    @JsonIgnore
    public String getPoDoubleValidation() {
        return DataTypeUtils.asString(this._get(FIELD_PO_DOUBLE_VALIDATION), null);
    }

    /**
     * 判断 「批准等级」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPoDoubleValidation() {
        return this._contains(FIELD_PO_DOUBLE_VALIDATION);
    }

    /**
     * 重置 「批准等级」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetPoDoubleValidation() {
        this._reset(FIELD_PO_DOUBLE_VALIDATION);
        return this;
    }

    /**
     * 设置「再次验证金额」
     * @param val
     */
    @JsonProperty(FIELD_PO_DOUBLE_VALIDATION_AMOUNT)
    public ResCompanyDTO setPoDoubleValidationAmount(BigDecimal val) {
        this._set(FIELD_PO_DOUBLE_VALIDATION_AMOUNT, val);
        return this;
    }

    /**
     * 获取「再次验证金额」值
     *
     */
    @JsonIgnore
    public BigDecimal getPoDoubleValidationAmount() {
        return DataTypeUtils.asBigDecimal(this._get(FIELD_PO_DOUBLE_VALIDATION_AMOUNT), null);
    }

    /**
     * 判断 「再次验证金额」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPoDoubleValidationAmount() {
        return this._contains(FIELD_PO_DOUBLE_VALIDATION_AMOUNT);
    }

    /**
     * 重置 「再次验证金额」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetPoDoubleValidationAmount() {
        this._reset(FIELD_PO_DOUBLE_VALIDATION_AMOUNT);
        return this;
    }

    /**
     * 设置「采购提前期」
     * @param val
     */
    @JsonProperty(FIELD_PO_LEAD)
    public ResCompanyDTO setPoLead(Double val) {
        this._set(FIELD_PO_LEAD, val);
        return this;
    }

    /**
     * 获取「采购提前期」值
     *
     */
    @JsonIgnore
    public Double getPoLead() {
        return DataTypeUtils.asDouble(this._get(FIELD_PO_LEAD), null);
    }

    /**
     * 判断 「采购提前期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPoLead() {
        return this._contains(FIELD_PO_LEAD);
    }

    /**
     * 重置 「采购提前期」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetPoLead() {
        this._reset(FIELD_PO_LEAD);
        return this;
    }

    /**
     * 设置「销售订单修改」
     * 代码表[销售订单修改]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_po_lock
     * @param val
     */
    @JsonProperty(FIELD_PO_LOCK)
    public ResCompanyDTO setPoLock(String val) {
        this._set(FIELD_PO_LOCK, val);
        return this;
    }

    /**
     * 获取「销售订单修改」值
     * 代码表[销售订单修改]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_po_lock
     *
     */
    @JsonIgnore
    public String getPoLock() {
        return DataTypeUtils.asString(this._get(FIELD_PO_LOCK), null);
    }

    /**
     * 判断 「销售订单修改」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPoLock() {
        return this._contains(FIELD_PO_LOCK);
    }

    /**
     * 重置 「销售订单修改」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetPoLock() {
        this._reset(FIELD_PO_LOCK);
        return this;
    }

    /**
     * 设置「线上付款」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_PORTAL_CONFIRMATION_PAY)
    public ResCompanyDTO setPortalConfirmationPay(Integer val) {
        this._set(FIELD_PORTAL_CONFIRMATION_PAY, val);
        return this;
    }

    /**
     * 获取「线上付款」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getPortalConfirmationPay() {
        return DataTypeUtils.asInteger(this._get(FIELD_PORTAL_CONFIRMATION_PAY), null);
    }

    /**
     * 判断 「线上付款」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPortalConfirmationPay() {
        return this._contains(FIELD_PORTAL_CONFIRMATION_PAY);
    }

    /**
     * 重置 「线上付款」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetPortalConfirmationPay() {
        this._reset(FIELD_PORTAL_CONFIRMATION_PAY);
        return this;
    }

    /**
     * 设置「线上签署」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_PORTAL_CONFIRMATION_SIGN)
    public ResCompanyDTO setPortalConfirmationSign(Integer val) {
        this._set(FIELD_PORTAL_CONFIRMATION_SIGN, val);
        return this;
    }

    /**
     * 获取「线上签署」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getPortalConfirmationSign() {
        return DataTypeUtils.asInteger(this._get(FIELD_PORTAL_CONFIRMATION_SIGN), null);
    }

    /**
     * 判断 「线上签署」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPortalConfirmationSign() {
        return this._contains(FIELD_PORTAL_CONFIRMATION_SIGN);
    }

    /**
     * 重置 「线上签署」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetPortalConfirmationSign() {
        this._reset(FIELD_PORTAL_CONFIRMATION_SIGN);
        return this;
    }

    /**
     * 设置「预付百分比」
     * @param val
     */
    @JsonProperty(FIELD_PREPAYMENT_PERCENT)
    public ResCompanyDTO setPrepaymentPercent(Double val) {
        this._set(FIELD_PREPAYMENT_PERCENT, val);
        return this;
    }

    /**
     * 获取「预付百分比」值
     *
     */
    @JsonIgnore
    public Double getPrepaymentPercent() {
        return DataTypeUtils.asDouble(this._get(FIELD_PREPAYMENT_PERCENT), null);
    }

    /**
     * 判断 「预付百分比」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPrepaymentPercent() {
        return this._contains(FIELD_PREPAYMENT_PERCENT);
    }

    /**
     * 重置 「预付百分比」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetPrepaymentPercent() {
        this._reset(FIELD_PREPAYMENT_PERCENT);
        return this;
    }

    /**
     * 设置「原色」
     * @param val
     */
    @JsonProperty(FIELD_PRIMARY_COLOR)
    public ResCompanyDTO setPrimaryColor(String val) {
        this._set(FIELD_PRIMARY_COLOR, val);
        return this;
    }

    /**
     * 获取「原色」值
     *
     */
    @JsonIgnore
    public String getPrimaryColor() {
        return DataTypeUtils.asString(this._get(FIELD_PRIMARY_COLOR), null);
    }

    /**
     * 判断 「原色」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPrimaryColor() {
        return this._contains(FIELD_PRIMARY_COLOR);
    }

    /**
     * 重置 「原色」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetPrimaryColor() {
        this._reset(FIELD_PRIMARY_COLOR);
        return this;
    }

    /**
     * 设置「采购锁定日期」
     * @param val
     */
    @JsonProperty(FIELD_PURCHASE_LOCK_DATE)
    public ResCompanyDTO setPurchaseLockDate(Timestamp val) {
        this._set(FIELD_PURCHASE_LOCK_DATE, val);
        return this;
    }

    /**
     * 获取「采购锁定日期」值
     *
     */
    @JsonIgnore
    public Timestamp getPurchaseLockDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_PURCHASE_LOCK_DATE), null);
    }

    /**
     * 判断 「采购锁定日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPurchaseLockDate() {
        return this._contains(FIELD_PURCHASE_LOCK_DATE);
    }

    /**
     * 重置 「采购锁定日期」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetPurchaseLockDate() {
        this._reset(FIELD_PURCHASE_LOCK_DATE);
        return this;
    }

    /**
     * 设置「Display QR-code on invoices」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_QR_CODE)
    public ResCompanyDTO setQrCode(Integer val) {
        this._set(FIELD_QR_CODE, val);
        return this;
    }

    /**
     * 获取「Display QR-code on invoices」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getQrCode() {
        return DataTypeUtils.asInteger(this._get(FIELD_QR_CODE), null);
    }

    /**
     * 判断 「Display QR-code on invoices」是否有值
     *
     */
    @JsonIgnore
    public boolean containsQrCode() {
        return this._contains(FIELD_QR_CODE);
    }

    /**
     * 重置 「Display QR-code on invoices」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetQrCode() {
        this._reset(FIELD_QR_CODE);
        return this;
    }

    /**
     * 设置「快速编码」
     * 代码表[快速编码]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_quick_edit_mode
     * @param val
     */
    @JsonProperty(FIELD_QUICK_EDIT_MODE)
    public ResCompanyDTO setQuickEditMode(String val) {
        this._set(FIELD_QUICK_EDIT_MODE, val);
        return this;
    }

    /**
     * 获取「快速编码」值
     * 代码表[快速编码]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_quick_edit_mode
     *
     */
    @JsonIgnore
    public String getQuickEditMode() {
        return DataTypeUtils.asString(this._get(FIELD_QUICK_EDIT_MODE), null);
    }

    /**
     * 判断 「快速编码」是否有值
     *
     */
    @JsonIgnore
    public boolean containsQuickEditMode() {
        return this._contains(FIELD_QUICK_EDIT_MODE);
    }

    /**
     * 重置 「快速编码」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetQuickEditMode() {
        this._reset(FIELD_QUICK_EDIT_MODE);
        return this;
    }

    /**
     * 设置「默认报价有效期」
     * @param val
     */
    @JsonProperty(FIELD_QUOTATION_VALIDITY_DAYS)
    public ResCompanyDTO setQuotationValidityDays(Integer val) {
        this._set(FIELD_QUOTATION_VALIDITY_DAYS, val);
        return this;
    }

    /**
     * 获取「默认报价有效期」值
     *
     */
    @JsonIgnore
    public Integer getQuotationValidityDays() {
        return DataTypeUtils.asInteger(this._get(FIELD_QUOTATION_VALIDITY_DAYS), null);
    }

    /**
     * 判断 「默认报价有效期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsQuotationValidityDays() {
        return this._contains(FIELD_QUOTATION_VALIDITY_DAYS);
    }

    /**
     * 重置 「默认报价有效期」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetQuotationValidityDays() {
        this._reset(FIELD_QUOTATION_VALIDITY_DAYS);
        return this;
    }

    /**
     * 设置「报告页脚」
     * @param val
     */
    @JsonProperty(FIELD_REPORT_FOOTER)
    public ResCompanyDTO setReportFooter(String val) {
        this._set(FIELD_REPORT_FOOTER, val);
        return this;
    }

    /**
     * 获取「报告页脚」值
     *
     */
    @JsonIgnore
    public String getReportFooter() {
        return DataTypeUtils.asString(this._get(FIELD_REPORT_FOOTER), null);
    }

    /**
     * 判断 「报告页脚」是否有值
     *
     */
    @JsonIgnore
    public boolean containsReportFooter() {
        return this._contains(FIELD_REPORT_FOOTER);
    }

    /**
     * 重置 「报告页脚」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetReportFooter() {
        this._reset(FIELD_REPORT_FOOTER);
        return this;
    }

    /**
     * 设置「公司标语」
     * @param val
     */
    @JsonProperty(FIELD_REPORT_HEADER)
    public ResCompanyDTO setReportHeader(String val) {
        this._set(FIELD_REPORT_HEADER, val);
        return this;
    }

    /**
     * 获取「公司标语」值
     *
     */
    @JsonIgnore
    public String getReportHeader() {
        return DataTypeUtils.asString(this._get(FIELD_REPORT_HEADER), null);
    }

    /**
     * 判断 「公司标语」是否有值
     *
     */
    @JsonIgnore
    public boolean containsReportHeader() {
        return this._contains(FIELD_REPORT_HEADER);
    }

    /**
     * 重置 「公司标语」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetReportHeader() {
        this._reset(FIELD_REPORT_HEADER);
        return this;
    }

    /**
     * 设置「默认工作时间」
     * @param val
     */
    @JsonProperty(FIELD_RESOURCE_CALENDAR_ID)
    public ResCompanyDTO setResourceCalendarId(String val) {
        this._set(FIELD_RESOURCE_CALENDAR_ID, val);
        return this;
    }

    /**
     * 获取「默认工作时间」值
     *
     */
    @JsonIgnore
    public String getResourceCalendarId() {
        return DataTypeUtils.asString(this._get(FIELD_RESOURCE_CALENDAR_ID), null);
    }

    /**
     * 判断 「默认工作时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResourceCalendarId() {
        return this._contains(FIELD_RESOURCE_CALENDAR_ID);
    }

    /**
     * 重置 「默认工作时间」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetResourceCalendarId() {
        this._reset(FIELD_RESOURCE_CALENDAR_ID);
        return this;
    }

    /**
     * 设置「销售锁定日期」
     * @param val
     */
    @JsonProperty(FIELD_SALE_LOCK_DATE)
    public ResCompanyDTO setSaleLockDate(Timestamp val) {
        this._set(FIELD_SALE_LOCK_DATE, val);
        return this;
    }

    /**
     * 获取「销售锁定日期」值
     *
     */
    @JsonIgnore
    public Timestamp getSaleLockDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_SALE_LOCK_DATE), null);
    }

    /**
     * 判断 「销售锁定日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSaleLockDate() {
        return this._contains(FIELD_SALE_LOCK_DATE);
    }

    /**
     * 重置 「销售锁定日期」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetSaleLockDate() {
        this._reset(FIELD_SALE_LOCK_DATE);
        return this;
    }

    /**
     * 设置「销售入门选择的付款方式」
     * 代码表[销售入门选择的付款方式]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_sale_onboarding_payment_method
     * @param val
     */
    @JsonProperty(FIELD_SALE_ONBOARDING_PAYMENT_METHOD)
    public ResCompanyDTO setSaleOnboardingPaymentMethod(String val) {
        this._set(FIELD_SALE_ONBOARDING_PAYMENT_METHOD, val);
        return this;
    }

    /**
     * 获取「销售入门选择的付款方式」值
     * 代码表[销售入门选择的付款方式]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_sale_onboarding_payment_method
     *
     */
    @JsonIgnore
    public String getSaleOnboardingPaymentMethod() {
        return DataTypeUtils.asString(this._get(FIELD_SALE_ONBOARDING_PAYMENT_METHOD), null);
    }

    /**
     * 判断 「销售入门选择的付款方式」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSaleOnboardingPaymentMethod() {
        return this._contains(FIELD_SALE_ONBOARDING_PAYMENT_METHOD);
    }

    /**
     * 重置 「销售入门选择的付款方式」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetSaleOnboardingPaymentMethod() {
        this._reset(FIELD_SALE_ONBOARDING_PAYMENT_METHOD);
        return this;
    }

    /**
     * 设置「次要颜色」
     * @param val
     */
    @JsonProperty(FIELD_SECONDARY_COLOR)
    public ResCompanyDTO setSecondaryColor(String val) {
        this._set(FIELD_SECONDARY_COLOR, val);
        return this;
    }

    /**
     * 获取「次要颜色」值
     *
     */
    @JsonIgnore
    public String getSecondaryColor() {
        return DataTypeUtils.asString(this._get(FIELD_SECONDARY_COLOR), null);
    }

    /**
     * 判断 「次要颜色」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSecondaryColor() {
        return this._contains(FIELD_SECONDARY_COLOR);
    }

    /**
     * 重置 「次要颜色」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetSecondaryColor() {
        this._reset(FIELD_SECONDARY_COLOR);
        return this;
    }

    /**
     * 设置「销售安全天数」
     * @param val
     */
    @JsonProperty(FIELD_SECURITY_LEAD)
    public ResCompanyDTO setSecurityLead(Double val) {
        this._set(FIELD_SECURITY_LEAD, val);
        return this;
    }

    /**
     * 获取「销售安全天数」值
     *
     */
    @JsonIgnore
    public Double getSecurityLead() {
        return DataTypeUtils.asDouble(this._get(FIELD_SECURITY_LEAD), null);
    }

    /**
     * 判断 「销售安全天数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSecurityLead() {
        return this._contains(FIELD_SECURITY_LEAD);
    }

    /**
     * 重置 「销售安全天数」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetSecurityLead() {
        this._reset(FIELD_SECURITY_LEAD);
        return this;
    }

    /**
     * 设置「序列」
     * @param val
     */
    @JsonProperty(FIELD_SEQUENCE)
    public ResCompanyDTO setSequence(Integer val) {
        this._set(FIELD_SEQUENCE, val);
        return this;
    }

    /**
     * 获取「序列」值
     *
     */
    @JsonIgnore
    public Integer getSequence() {
        return DataTypeUtils.asInteger(this._get(FIELD_SEQUENCE), null);
    }

    /**
     * 判断 「序列」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSequence() {
        return this._contains(FIELD_SEQUENCE);
    }

    /**
     * 重置 「序列」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetSequence() {
        this._reset(FIELD_SEQUENCE);
        return this;
    }

    /**
     * 设置「实体邮寄颜色」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_SNAILMAIL_COLOR)
    public ResCompanyDTO setSnailmailColor(Integer val) {
        this._set(FIELD_SNAILMAIL_COLOR, val);
        return this;
    }

    /**
     * 获取「实体邮寄颜色」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getSnailmailColor() {
        return DataTypeUtils.asInteger(this._get(FIELD_SNAILMAIL_COLOR), null);
    }

    /**
     * 判断 「实体邮寄颜色」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSnailmailColor() {
        return this._contains(FIELD_SNAILMAIL_COLOR);
    }

    /**
     * 重置 「实体邮寄颜色」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetSnailmailColor() {
        this._reset(FIELD_SNAILMAIL_COLOR);
        return this;
    }

    /**
     * 设置「添加一个封面页」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_SNAILMAIL_COVER)
    public ResCompanyDTO setSnailmailCover(Integer val) {
        this._set(FIELD_SNAILMAIL_COVER, val);
        return this;
    }

    /**
     * 获取「添加一个封面页」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getSnailmailCover() {
        return DataTypeUtils.asInteger(this._get(FIELD_SNAILMAIL_COVER), null);
    }

    /**
     * 判断 「添加一个封面页」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSnailmailCover() {
        return this._contains(FIELD_SNAILMAIL_COVER);
    }

    /**
     * 重置 「添加一个封面页」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetSnailmailCover() {
        this._reset(FIELD_SNAILMAIL_COVER);
        return this;
    }

    /**
     * 设置「双面」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_SNAILMAIL_DUPLEX)
    public ResCompanyDTO setSnailmailDuplex(Integer val) {
        this._set(FIELD_SNAILMAIL_DUPLEX, val);
        return this;
    }

    /**
     * 获取「双面」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getSnailmailDuplex() {
        return DataTypeUtils.asInteger(this._get(FIELD_SNAILMAIL_DUPLEX), null);
    }

    /**
     * 判断 「双面」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSnailmailDuplex() {
        return this._contains(FIELD_SNAILMAIL_DUPLEX);
    }

    /**
     * 重置 「双面」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetSnailmailDuplex() {
        this._reset(FIELD_SNAILMAIL_DUPLEX);
        return this;
    }

    /**
     * 设置「Facebook 账户」
     * @param val
     */
    @JsonProperty(FIELD_SOCIAL_FACEBOOK)
    public ResCompanyDTO setSocialFacebook(String val) {
        this._set(FIELD_SOCIAL_FACEBOOK, val);
        return this;
    }

    /**
     * 获取「Facebook 账户」值
     *
     */
    @JsonIgnore
    public String getSocialFacebook() {
        return DataTypeUtils.asString(this._get(FIELD_SOCIAL_FACEBOOK), null);
    }

    /**
     * 判断 「Facebook 账户」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSocialFacebook() {
        return this._contains(FIELD_SOCIAL_FACEBOOK);
    }

    /**
     * 重置 「Facebook 账户」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetSocialFacebook() {
        this._reset(FIELD_SOCIAL_FACEBOOK);
        return this;
    }

    /**
     * 设置「GitHub账户」
     * @param val
     */
    @JsonProperty(FIELD_SOCIAL_GITHUB)
    public ResCompanyDTO setSocialGithub(String val) {
        this._set(FIELD_SOCIAL_GITHUB, val);
        return this;
    }

    /**
     * 获取「GitHub账户」值
     *
     */
    @JsonIgnore
    public String getSocialGithub() {
        return DataTypeUtils.asString(this._get(FIELD_SOCIAL_GITHUB), null);
    }

    /**
     * 判断 「GitHub账户」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSocialGithub() {
        return this._contains(FIELD_SOCIAL_GITHUB);
    }

    /**
     * 重置 「GitHub账户」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetSocialGithub() {
        this._reset(FIELD_SOCIAL_GITHUB);
        return this;
    }

    /**
     * 设置「Instagram 账号」
     * @param val
     */
    @JsonProperty(FIELD_SOCIAL_INSTAGRAM)
    public ResCompanyDTO setSocialInstagram(String val) {
        this._set(FIELD_SOCIAL_INSTAGRAM, val);
        return this;
    }

    /**
     * 获取「Instagram 账号」值
     *
     */
    @JsonIgnore
    public String getSocialInstagram() {
        return DataTypeUtils.asString(this._get(FIELD_SOCIAL_INSTAGRAM), null);
    }

    /**
     * 判断 「Instagram 账号」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSocialInstagram() {
        return this._contains(FIELD_SOCIAL_INSTAGRAM);
    }

    /**
     * 重置 「Instagram 账号」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetSocialInstagram() {
        this._reset(FIELD_SOCIAL_INSTAGRAM);
        return this;
    }

    /**
     * 设置「领英账号」
     * @param val
     */
    @JsonProperty(FIELD_SOCIAL_LINKEDIN)
    public ResCompanyDTO setSocialLinkedin(String val) {
        this._set(FIELD_SOCIAL_LINKEDIN, val);
        return this;
    }

    /**
     * 获取「领英账号」值
     *
     */
    @JsonIgnore
    public String getSocialLinkedin() {
        return DataTypeUtils.asString(this._get(FIELD_SOCIAL_LINKEDIN), null);
    }

    /**
     * 判断 「领英账号」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSocialLinkedin() {
        return this._contains(FIELD_SOCIAL_LINKEDIN);
    }

    /**
     * 重置 「领英账号」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetSocialLinkedin() {
        this._reset(FIELD_SOCIAL_LINKEDIN);
        return this;
    }

    /**
     * 设置「TikTok / 抖音账号」
     * @param val
     */
    @JsonProperty(FIELD_SOCIAL_TIKTOK)
    public ResCompanyDTO setSocialTiktok(String val) {
        this._set(FIELD_SOCIAL_TIKTOK, val);
        return this;
    }

    /**
     * 获取「TikTok / 抖音账号」值
     *
     */
    @JsonIgnore
    public String getSocialTiktok() {
        return DataTypeUtils.asString(this._get(FIELD_SOCIAL_TIKTOK), null);
    }

    /**
     * 判断 「TikTok / 抖音账号」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSocialTiktok() {
        return this._contains(FIELD_SOCIAL_TIKTOK);
    }

    /**
     * 重置 「TikTok / 抖音账号」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetSocialTiktok() {
        this._reset(FIELD_SOCIAL_TIKTOK);
        return this;
    }

    /**
     * 设置「X 账户」
     * @param val
     */
    @JsonProperty(FIELD_SOCIAL_TWITTER)
    public ResCompanyDTO setSocialTwitter(String val) {
        this._set(FIELD_SOCIAL_TWITTER, val);
        return this;
    }

    /**
     * 获取「X 账户」值
     *
     */
    @JsonIgnore
    public String getSocialTwitter() {
        return DataTypeUtils.asString(this._get(FIELD_SOCIAL_TWITTER), null);
    }

    /**
     * 判断 「X 账户」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSocialTwitter() {
        return this._contains(FIELD_SOCIAL_TWITTER);
    }

    /**
     * 重置 「X 账户」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetSocialTwitter() {
        this._reset(FIELD_SOCIAL_TWITTER);
        return this;
    }

    /**
     * 设置「Youtube账号」
     * @param val
     */
    @JsonProperty(FIELD_SOCIAL_YOUTUBE)
    public ResCompanyDTO setSocialYoutube(String val) {
        this._set(FIELD_SOCIAL_YOUTUBE, val);
        return this;
    }

    /**
     * 获取「Youtube账号」值
     *
     */
    @JsonIgnore
    public String getSocialYoutube() {
        return DataTypeUtils.asString(this._get(FIELD_SOCIAL_YOUTUBE), null);
    }

    /**
     * 判断 「Youtube账号」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSocialYoutube() {
        return this._contains(FIELD_SOCIAL_YOUTUBE);
    }

    /**
     * 重置 「Youtube账号」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetSocialYoutube() {
        this._reset(FIELD_SOCIAL_YOUTUBE);
        return this;
    }

    /**
     * 设置「确认拣货邮件模版」
     * @param val
     */
    @JsonProperty(FIELD_STOCK_MAIL_CONFIRMATION_TEMPLATE_ID)
    public ResCompanyDTO setStockMailConfirmationTemplateId(String val) {
        this._set(FIELD_STOCK_MAIL_CONFIRMATION_TEMPLATE_ID, val);
        return this;
    }

    /**
     * 获取「确认拣货邮件模版」值
     *
     */
    @JsonIgnore
    public String getStockMailConfirmationTemplateId() {
        return DataTypeUtils.asString(this._get(FIELD_STOCK_MAIL_CONFIRMATION_TEMPLATE_ID), null);
    }

    /**
     * 判断 「确认拣货邮件模版」是否有值
     *
     */
    @JsonIgnore
    public boolean containsStockMailConfirmationTemplateId() {
        return this._contains(FIELD_STOCK_MAIL_CONFIRMATION_TEMPLATE_ID);
    }

    /**
     * 重置 「确认拣货邮件模版」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetStockMailConfirmationTemplateId() {
        this._reset(FIELD_STOCK_MAIL_CONFIRMATION_TEMPLATE_ID);
        return this;
    }

    /**
     * 设置「邮件确认拣货」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_STOCK_MOVE_EMAIL_VALIDATION)
    public ResCompanyDTO setStockMoveEmailValidation(Integer val) {
        this._set(FIELD_STOCK_MOVE_EMAIL_VALIDATION, val);
        return this;
    }

    /**
     * 获取「邮件确认拣货」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getStockMoveEmailValidation() {
        return DataTypeUtils.asInteger(this._get(FIELD_STOCK_MOVE_EMAIL_VALIDATION), null);
    }

    /**
     * 判断 「邮件确认拣货」是否有值
     *
     */
    @JsonIgnore
    public boolean containsStockMoveEmailValidation() {
        return this._contains(FIELD_STOCK_MOVE_EMAIL_VALIDATION);
    }

    /**
     * 重置 「邮件确认拣货」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetStockMoveEmailValidation() {
        this._reset(FIELD_STOCK_MOVE_EMAIL_VALIDATION);
        return this;
    }

    /**
     * 设置「短信息确认」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_STOCK_MOVE_SMS_VALIDATION)
    public ResCompanyDTO setStockMoveSmsValidation(Integer val) {
        this._set(FIELD_STOCK_MOVE_SMS_VALIDATION, val);
        return this;
    }

    /**
     * 获取「短信息确认」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getStockMoveSmsValidation() {
        return DataTypeUtils.asInteger(this._get(FIELD_STOCK_MOVE_SMS_VALIDATION), null);
    }

    /**
     * 判断 「短信息确认」是否有值
     *
     */
    @JsonIgnore
    public boolean containsStockMoveSmsValidation() {
        return this._contains(FIELD_STOCK_MOVE_SMS_VALIDATION);
    }

    /**
     * 重置 「短信息确认」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetStockMoveSmsValidation() {
        this._reset(FIELD_STOCK_MOVE_SMS_VALIDATION);
        return this;
    }

    /**
     * 设置「街道」
     * @param val
     */
    @JsonProperty(FIELD_STREET)
    public ResCompanyDTO setStreet(String val) {
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
    public ResCompanyDTO resetStreet() {
        this._reset(FIELD_STREET);
        return this;
    }

    /**
     * 设置「详细地址」
     * @param val
     */
    @JsonProperty(FIELD_STREET2)
    public ResCompanyDTO setStreet2(String val) {
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
    public ResCompanyDTO resetStreet2() {
        this._reset(FIELD_STREET2);
        return this;
    }

    /**
     * 设置「Tax Calculation Rounding Method」
     * 代码表[Tax Calculation Rounding Method]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_tax_calculation_rounding_method
     * @param val
     */
    @JsonProperty(FIELD_TAX_CALCULATION_ROUNDING_METHOD)
    public ResCompanyDTO setTaxCalculationRoundingMethod(String val) {
        this._set(FIELD_TAX_CALCULATION_ROUNDING_METHOD, val);
        return this;
    }

    /**
     * 获取「Tax Calculation Rounding Method」值
     * 代码表[Tax Calculation Rounding Method]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_tax_calculation_rounding_method
     *
     */
    @JsonIgnore
    public String getTaxCalculationRoundingMethod() {
        return DataTypeUtils.asString(this._get(FIELD_TAX_CALCULATION_ROUNDING_METHOD), null);
    }

    /**
     * 判断 「Tax Calculation Rounding Method」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTaxCalculationRoundingMethod() {
        return this._contains(FIELD_TAX_CALCULATION_ROUNDING_METHOD);
    }

    /**
     * 重置 「Tax Calculation Rounding Method」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetTaxCalculationRoundingMethod() {
        this._reset(FIELD_TAX_CALCULATION_ROUNDING_METHOD);
        return this;
    }

    /**
     * 设置「采用现金收付」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_TAX_EXIGIBILITY)
    public ResCompanyDTO setTaxExigibility(Integer val) {
        this._set(FIELD_TAX_EXIGIBILITY, val);
        return this;
    }

    /**
     * 获取「采用现金收付」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getTaxExigibility() {
        return DataTypeUtils.asInteger(this._get(FIELD_TAX_EXIGIBILITY), null);
    }

    /**
     * 判断 「采用现金收付」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTaxExigibility() {
        return this._contains(FIELD_TAX_EXIGIBILITY);
    }

    /**
     * 重置 「采用现金收付」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetTaxExigibility() {
        this._reset(FIELD_TAX_EXIGIBILITY);
        return this;
    }

    /**
     * 设置「纳税申报表锁定日期」
     * @param val
     */
    @JsonProperty(FIELD_TAX_LOCK_DATE)
    public ResCompanyDTO setTaxLockDate(Timestamp val) {
        this._set(FIELD_TAX_LOCK_DATE, val);
        return this;
    }

    /**
     * 获取「纳税申报表锁定日期」值
     *
     */
    @JsonIgnore
    public Timestamp getTaxLockDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_TAX_LOCK_DATE), null);
    }

    /**
     * 判断 「纳税申报表锁定日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTaxLockDate() {
        return this._contains(FIELD_TAX_LOCK_DATE);
    }

    /**
     * 重置 「纳税申报表锁定日期」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetTaxLockDate() {
        this._reset(FIELD_TAX_LOCK_DATE);
        return this;
    }

    /**
     * 设置「Terms & Conditions format」
     * 代码表[Terms & Conditions format]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_terms_type
     * @param val
     */
    @JsonProperty(FIELD_TERMS_TYPE)
    public ResCompanyDTO setTermsType(String val) {
        this._set(FIELD_TERMS_TYPE, val);
        return this;
    }

    /**
     * 获取「Terms & Conditions format」值
     * 代码表[Terms & Conditions format]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_company_terms_type
     *
     */
    @JsonIgnore
    public String getTermsType() {
        return DataTypeUtils.asString(this._get(FIELD_TERMS_TYPE), null);
    }

    /**
     * 判断 「Terms & Conditions format」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTermsType() {
        return this._contains(FIELD_TERMS_TYPE);
    }

    /**
     * 重置 「Terms & Conditions format」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetTermsType() {
        this._reset(FIELD_TERMS_TYPE);
        return this;
    }

    /**
     * 设置「Prefix of the transfer accounts」
     * @param val
     */
    @JsonProperty(FIELD_TRANSFER_ACCOUNT_CODE_PREFIX)
    public ResCompanyDTO setTransferAccountCodePrefix(String val) {
        this._set(FIELD_TRANSFER_ACCOUNT_CODE_PREFIX, val);
        return this;
    }

    /**
     * 获取「Prefix of the transfer accounts」值
     *
     */
    @JsonIgnore
    public String getTransferAccountCodePrefix() {
        return DataTypeUtils.asString(this._get(FIELD_TRANSFER_ACCOUNT_CODE_PREFIX), null);
    }

    /**
     * 判断 「Prefix of the transfer accounts」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTransferAccountCodePrefix() {
        return this._contains(FIELD_TRANSFER_ACCOUNT_CODE_PREFIX);
    }

    /**
     * 重置 「Prefix of the transfer accounts」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetTransferAccountCodePrefix() {
        this._reset(FIELD_TRANSFER_ACCOUNT_CODE_PREFIX);
        return this;
    }

    /**
     * 设置「用户财政年度锁定日期」
     * @param val
     */
    @JsonProperty(FIELD_USER_FISCALYEAR_LOCK_DATE)
    public ResCompanyDTO setUserFiscalyearLockDate(Timestamp val) {
        this._set(FIELD_USER_FISCALYEAR_LOCK_DATE, val);
        return this;
    }

    /**
     * 获取「用户财政年度锁定日期」值
     *
     */
    @JsonIgnore
    public Timestamp getUserFiscalyearLockDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_USER_FISCALYEAR_LOCK_DATE), null);
    }

    /**
     * 判断 「用户财政年度锁定日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUserFiscalyearLockDate() {
        return this._contains(FIELD_USER_FISCALYEAR_LOCK_DATE);
    }

    /**
     * 重置 「用户财政年度锁定日期」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetUserFiscalyearLockDate() {
        this._reset(FIELD_USER_FISCALYEAR_LOCK_DATE);
        return this;
    }

    /**
     * 设置「用户硬性锁定日期」
     * @param val
     */
    @JsonProperty(FIELD_USER_HARD_LOCK_DATE)
    public ResCompanyDTO setUserHardLockDate(Timestamp val) {
        this._set(FIELD_USER_HARD_LOCK_DATE, val);
        return this;
    }

    /**
     * 获取「用户硬性锁定日期」值
     *
     */
    @JsonIgnore
    public Timestamp getUserHardLockDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_USER_HARD_LOCK_DATE), null);
    }

    /**
     * 判断 「用户硬性锁定日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUserHardLockDate() {
        return this._contains(FIELD_USER_HARD_LOCK_DATE);
    }

    /**
     * 重置 「用户硬性锁定日期」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetUserHardLockDate() {
        this._reset(FIELD_USER_HARD_LOCK_DATE);
        return this;
    }

    /**
     * 设置「用户采购锁定日期」
     * @param val
     */
    @JsonProperty(FIELD_USER_PURCHASE_LOCK_DATE)
    public ResCompanyDTO setUserPurchaseLockDate(Timestamp val) {
        this._set(FIELD_USER_PURCHASE_LOCK_DATE, val);
        return this;
    }

    /**
     * 获取「用户采购锁定日期」值
     *
     */
    @JsonIgnore
    public Timestamp getUserPurchaseLockDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_USER_PURCHASE_LOCK_DATE), null);
    }

    /**
     * 判断 「用户采购锁定日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUserPurchaseLockDate() {
        return this._contains(FIELD_USER_PURCHASE_LOCK_DATE);
    }

    /**
     * 重置 「用户采购锁定日期」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetUserPurchaseLockDate() {
        this._reset(FIELD_USER_PURCHASE_LOCK_DATE);
        return this;
    }

    /**
     * 设置「用户销售锁定日期」
     * @param val
     */
    @JsonProperty(FIELD_USER_SALE_LOCK_DATE)
    public ResCompanyDTO setUserSaleLockDate(Timestamp val) {
        this._set(FIELD_USER_SALE_LOCK_DATE, val);
        return this;
    }

    /**
     * 获取「用户销售锁定日期」值
     *
     */
    @JsonIgnore
    public Timestamp getUserSaleLockDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_USER_SALE_LOCK_DATE), null);
    }

    /**
     * 判断 「用户销售锁定日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUserSaleLockDate() {
        return this._contains(FIELD_USER_SALE_LOCK_DATE);
    }

    /**
     * 重置 「用户销售锁定日期」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetUserSaleLockDate() {
        this._reset(FIELD_USER_SALE_LOCK_DATE);
        return this;
    }

    /**
     * 设置「User Tax Lock Date」
     * @param val
     */
    @JsonProperty(FIELD_USER_TAX_LOCK_DATE)
    public ResCompanyDTO setUserTaxLockDate(Timestamp val) {
        this._set(FIELD_USER_TAX_LOCK_DATE, val);
        return this;
    }

    /**
     * 获取「User Tax Lock Date」值
     *
     */
    @JsonIgnore
    public Timestamp getUserTaxLockDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_USER_TAX_LOCK_DATE), null);
    }

    /**
     * 判断 「User Tax Lock Date」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUserTaxLockDate() {
        return this._contains(FIELD_USER_TAX_LOCK_DATE);
    }

    /**
     * 重置 「User Tax Lock Date」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetUserTaxLockDate() {
        this._reset(FIELD_USER_TAX_LOCK_DATE);
        return this;
    }

    /**
     * 设置「使用默认徽标」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_USES_DEFAULT_LOGO)
    public ResCompanyDTO setUsesDefaultLogo(Integer val) {
        this._set(FIELD_USES_DEFAULT_LOGO, val);
        return this;
    }

    /**
     * 获取「使用默认徽标」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getUsesDefaultLogo() {
        return DataTypeUtils.asInteger(this._get(FIELD_USES_DEFAULT_LOGO), null);
    }

    /**
     * 判断 「使用默认徽标」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUsesDefaultLogo() {
        return this._contains(FIELD_USES_DEFAULT_LOGO);
    }

    /**
     * 重置 「使用默认徽标」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetUsesDefaultLogo() {
        this._reset(FIELD_USES_DEFAULT_LOGO);
        return this;
    }

    /**
     * 设置「工作许可证到期通知期」
     * @param val
     */
    @JsonProperty(FIELD_WORK_PERMIT_EXPIRATION_NOTICE_PERIOD)
    public ResCompanyDTO setWorkPermitExpirationNoticePeriod(Integer val) {
        this._set(FIELD_WORK_PERMIT_EXPIRATION_NOTICE_PERIOD, val);
        return this;
    }

    /**
     * 获取「工作许可证到期通知期」值
     *
     */
    @JsonIgnore
    public Integer getWorkPermitExpirationNoticePeriod() {
        return DataTypeUtils.asInteger(this._get(FIELD_WORK_PERMIT_EXPIRATION_NOTICE_PERIOD), null);
    }

    /**
     * 判断 「工作许可证到期通知期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWorkPermitExpirationNoticePeriod() {
        return this._contains(FIELD_WORK_PERMIT_EXPIRATION_NOTICE_PERIOD);
    }

    /**
     * 重置 「工作许可证到期通知期」
     *
     */
    @JsonIgnore
    public ResCompanyDTO resetWorkPermitExpirationNoticePeriod() {
        this._reset(FIELD_WORK_PERMIT_EXPIRATION_NOTICE_PERIOD);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public ResCompanyDTO setWriteDate(Timestamp val) {
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
    public ResCompanyDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public ResCompanyDTO setWriteUid(String val) {
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
    public ResCompanyDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

    /**
     * 设置「邮编」
     * @param val
     */
    @JsonProperty(FIELD_ZIP)
    public ResCompanyDTO setZip(String val) {
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
    public ResCompanyDTO resetZip() {
        this._reset(FIELD_ZIP);
        return this;
    }

}
