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


public class ResConfigSettingsDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 默认信用额度
     */
    public final static String FIELD_ACCOUNT_DEFAULT_CREDIT_LIMIT = "account_default_credit_limit";

    /**
     * 属性: 有效用户数量
     */
    public final static String FIELD_ACTIVE_USER_COUNT = "active_user_count";

    /**
     * 属性: 允许在登录页开启密码重置功能
     */
    public final static String FIELD_AUTH_SIGNUP_RESET_PASSWORD = "auth_signup_reset_password";

    /**
     * 属性: 用作通过注册创建的新用户的模版
     */
    public final static String FIELD_AUTH_SIGNUP_TEMPLATE_USER_ID = "auth_signup_template_user_id";

    /**
     * 属性: 客户帐号
     */
    public final static String FIELD_AUTH_SIGNUP_UNINVITED = "auth_signup_uninvited";

    /**
     * 属性: 自动发票
     */
    public final static String FIELD_AUTOMATIC_INVOICE = "automatic_invoice";

    /**
     * 属性: 分隔符
     */
    public final static String FIELD_BARCODE_SEPARATOR = "barcode_separator";

    /**
     * 属性: 公司数量
     */
    public final static String FIELD_COMPANY_COUNT = "company_count";

    /**
     * 属性: 公司
     */
    public final static String FIELD_COMPANY_ID = "company_id";

    /**
     * 属性: 公司信息
     */
    public final static String FIELD_COMPANY_INFORMATIONS = "company_informations";

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
     * 属性: 自动分配操作
     */
    public final static String FIELD_CRM_AUTO_ASSIGNMENT_ACTION = "crm_auto_assignment_action";

    /**
     * 属性: 重复间隔为每
     */
    public final static String FIELD_CRM_AUTO_ASSIGNMENT_INTERVAL_NUMBER = "crm_auto_assignment_interval_number";

    /**
     * 属性: 自动分配间隔单位
     */
    public final static String FIELD_CRM_AUTO_ASSIGNMENT_INTERVAL_TYPE = "crm_auto_assignment_interval_type";

    /**
     * 属性: 自动指派下次执行日期
     */
    public final static String FIELD_CRM_AUTO_ASSIGNMENT_RUN_DATETIME = "crm_auto_assignment_run_datetime";

    /**
     * 属性: 基于规则的分配
     */
    public final static String FIELD_CRM_USE_AUTO_ASSIGNMENT = "crm_use_auto_assignment";

    /**
     * 属性: 开票原则
     */
    public final static String FIELD_DEFAULT_INVOICE_POLICY = "default_invoice_policy";

    /**
     * 属性: 拣货策略
     */
    public final static String FIELD_DEFAULT_PICKING_POLICY = "default_picking_policy";

    /**
     * 属性: 账单管理
     */
    public final static String FIELD_DEFAULT_PURCHASE_METHOD = "default_purchase_method";

    /**
     * 属性: 合同逾期延时预警
     */
    public final static String FIELD_DELAY_ALERT_CONTRACT = "delay_alert_contract";

    /**
     * 属性: 摘要邮件
     */
    public final static String FIELD_DIGEST_EMAILS = "digest_emails";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 使用自定义电子邮件服务器
     */
    public final static String FIELD_EXTERNAL_EMAIL_SERVER_DEFAULT = "external_email_server_default";

    /**
     * 属性: 失败的邮件
     */
    public final static String FIELD_FAIL_COUNTER = "fail_counter";

    /**
     * 属性: Gmail 客户端 ID
     */
    public final static String FIELD_GOOGLE_GMAIL_CLIENT_IDENTIFIER = "google_gmail_client_identifier";

    /**
     * 属性: Gmail客户端Secret
     */
    public final static String FIELD_GOOGLE_GMAIL_CLIENT_SECRET = "google_gmail_client_secret";

    /**
     * 属性: 消息翻译 API 密钥
     */
    public final static String FIELD_GOOGLE_TRANSLATE_API_KEY = "google_translate_api_key";

    /**
     * 属性: 分析会计
     */
    public final static String FIELD_GROUP_ANALYTIC_ACCOUNTING = "group_analytic_accounting";

    /**
     * 属性: 团体申请人简历展示
     */
    public final static String FIELD_GROUP_APPLICANT_CV_DISPLAY = "group_applicant_cv_display";

    /**
     * 属性: 锁定已确认的销售订单
     */
    public final static String FIELD_GROUP_AUTO_DONE_SETTING = "group_auto_done_setting";

    /**
     * 属性: 现金舍入
     */
    public final static String FIELD_GROUP_CASH_ROUNDING = "group_cash_rounding";

    /**
     * 属性: 折扣
     */
    public final static String FIELD_GROUP_DISCOUNT_PER_SO_LINE = "group_discount_per_so_line";

    /**
     * 属性: 在送货单上显示批次 / 序列号
     */
    public final static String FIELD_GROUP_LOT_ON_DELIVERY_SLIP = "group_lot_on_delivery_slip";

    /**
     * 属性: 在结算单上显示批次 / 序列号
     */
    public final static String FIELD_GROUP_LOT_ON_INVOICE = "group_lot_on_invoice";

    /**
     * 属性: 邮件营销
     */
    public final static String FIELD_GROUP_MASS_MAILING_CAMPAIGN = "group_mass_mailing_campaign";

    /**
     * 属性: 副产品
     */
    public final static String FIELD_GROUP_MRP_BYPRODUCTS = "group_mrp_byproducts";

    /**
     * 属性: 制造订单分配报表
     */
    public final static String FIELD_GROUP_MRP_RECEPTION_REPORT = "group_mrp_reception_report";

    /**
     * 属性: 物料需求计划（MRP）工单
     */
    public final static String FIELD_GROUP_MRP_ROUTINGS = "group_mrp_routings";

    /**
     * 属性: 工单依赖性
     */
    public final static String FIELD_GROUP_MRP_WORKORDER_DEPENDENCIES = "group_mrp_workorder_dependencies";

    /**
     * 属性: 多币别
     */
    public final static String FIELD_GROUP_MULTI_CURRENCY = "group_multi_currency";

    /**
     * 属性: 价格表
     */
    public final static String FIELD_GROUP_PRODUCT_PRICELIST = "group_product_pricelist";

    /**
     * 属性: 变体
     */
    public final static String FIELD_GROUP_PRODUCT_VARIANT = "group_product_variant";

    /**
     * 属性: 形式发票
     */
    public final static String FIELD_GROUP_PROFORMA_SALES = "group_proforma_sales";

    /**
     * 属性: 里程碑
     */
    public final static String FIELD_GROUP_PROJECT_MILESTONE = "group_project_milestone";

    /**
     * 属性: 客户点评
     */
    public final static String FIELD_GROUP_PROJECT_RATING = "group_project_rating";

    /**
     * 属性: 周期任务
     */
    public final static String FIELD_GROUP_PROJECT_RECURRING_TASKS = "group_project_recurring_tasks";

    /**
     * 属性: 项目阶段
     */
    public final static String FIELD_GROUP_PROJECT_STAGES = "group_project_stages";

    /**
     * 属性: 任务依赖
     */
    public final static String FIELD_GROUP_PROJECT_TASK_DEPENDENCIES = "group_project_task_dependencies";

    /**
     * 属性: 客户地址
     */
    public final static String FIELD_GROUP_SALE_DELIVERY_ADDRESS = "group_sale_delivery_address";

    /**
     * 属性: 报价模板
     */
    public final static String FIELD_GROUP_SALE_ORDER_TEMPLATE = "group_sale_order_template";

    /**
     * 属性: 收货提醒
     */
    public final static String FIELD_GROUP_SEND_REMINDER = "group_send_reminder";

    /**
     * 属性: 采购收据
     */
    public final static String FIELD_GROUP_SHOW_PURCHASE_RECEIPTS = "group_show_purchase_receipts";

    /**
     * 属性: 销售收据
     */
    public final static String FIELD_GROUP_SHOW_SALE_RECEIPTS = "group_show_sale_receipts";

    /**
     * 属性: 自动库存会计
     */
    public final static String FIELD_GROUP_STOCK_ACCOUNTING_AUTOMATIC = "group_stock_accounting_automatic";

    /**
     * 属性: 多步路线
     */
    public final static String FIELD_GROUP_STOCK_ADV_LOCATION = "group_stock_adv_location";

    /**
     * 属性: 使用GS1编码格式打印批号和序列号
     */
    public final static String FIELD_GROUP_STOCK_LOT_PRINT_GS1 = "group_stock_lot_print_gs1";

    /**
     * 属性: 储存位置
     */
    public final static String FIELD_GROUP_STOCK_MULTI_LOCATIONS = "group_stock_multi_locations";

    /**
     * 属性: 产品包装
     */
    public final static String FIELD_GROUP_STOCK_PACKAGING = "group_stock_packaging";

    /**
     * 属性: 批次 / 序列号
     */
    public final static String FIELD_GROUP_STOCK_PRODUCTION_LOT = "group_stock_production_lot";

    /**
     * 属性: 库存接收报表
     */
    public final static String FIELD_GROUP_STOCK_RECEPTION_REPORT = "group_stock_reception_report";

    /**
     * 属性: 签名
     */
    public final static String FIELD_GROUP_STOCK_SIGN_DELIVERY = "group_stock_sign_delivery";

    /**
     * 属性: 包裹
     */
    public final static String FIELD_GROUP_STOCK_TRACKING_LOT = "group_stock_tracking_lot";

    /**
     * 属性: 寄售
     */
    public final static String FIELD_GROUP_STOCK_TRACKING_OWNER = "group_stock_tracking_owner";

    /**
     * 属性: 解锁制造订单
     */
    public final static String FIELD_GROUP_UNLOCKED_BY_DEFAULT = "group_unlocked_by_default";

    /**
     * 属性: 计量单位
     */
    public final static String FIELD_GROUP_UOM = "group_uom";

    /**
     * 属性: 线索
     */
    public final static String FIELD_GROUP_USE_LEAD = "group_use_lead";

    /**
     * 属性: 经常性收入
     */
    public final static String FIELD_GROUP_USE_RECURRING_REVENUES = "group_use_recurring_revenues";

    /**
     * 属性: 发票中的警告
     */
    public final static String FIELD_GROUP_WARNING_ACCOUNT = "group_warning_account";

    /**
     * 属性: 采购警告
     */
    public final static String FIELD_GROUP_WARNING_PURCHASE = "group_warning_purchase";

    /**
     * 属性: 销售订单警告信息
     */
    public final static String FIELD_GROUP_WARNING_SALE = "group_warning_sale";

    /**
     * 属性: 库存警报
     */
    public final static String FIELD_GROUP_WARNING_STOCK = "group_warning_stock";

    /**
     * 属性: Has Accounting Entries
     */
    public final static String FIELD_HAS_ACCOUNTING_ENTRIES = "has_accounting_entries";

    /**
     * 属性: Company has a chart of accounts
     */
    public final static String FIELD_HAS_CHART_OF_ACCOUNTS = "has_chart_of_accounts";

    /**
     * 属性: 员工编辑
     */
    public final static String FIELD_HR_EMPLOYEE_SELF_EDIT = "hr_employee_self_edit";

    /**
     * 属性: 默认的费用别名
     */
    public final static String FIELD_HR_EXPENSE_ALIAS_PREFIX = "hr_expense_alias_prefix";

    /**
     * 属性: 允许员工通过电子邮件记录费用
     */
    public final static String FIELD_HR_EXPENSE_USE_MAILGATEWAY = "hr_expense_use_mailgateway";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 发票电子邮件模板
     */
    public final static String FIELD_INVOICE_MAIL_TEMPLATE_ID = "invoice_mail_template_id";

    /**
     * 属性: PEPPOL 符合条件
     */
    public final static String FIELD_IS_ACCOUNT_PEPPOL_ELIGIBLE = "is_account_peppol_eligible";

    /**
     * 属性: 销售模块是否已安装
     */
    public final static String FIELD_IS_INSTALLED_SALE = "is_installed_sale";

    /**
     * 属性: 多团队
     */
    public final static String FIELD_IS_MEMBERSHIP_MULTI = "is_membership_multi";

    /**
     * 属性: 是母公司
     */
    public final static String FIELD_IS_ROOT_COMPANY = "is_root_company";

    /**
     * 属性: 语言数量
     */
    public final static String FIELD_LANGUAGE_COUNT = "language_count";

    /**
     * 属性: 自动丰富线索
     */
    public final static String FIELD_LEAD_ENRICH_AUTO = "lead_enrich_auto";

    /**
     * 属性: 直接从商机商机创建线索挖掘申请。
     */
    public final static String FIELD_LEAD_MINING_IN_PIPELINE = "lead_mining_in_pipeline";

    /**
     * 属性: 锁定已确认的订单
     */
    public final static String FIELD_LOCK_CONFIRMED_PO = "lock_confirmed_po";

    /**
     * 属性: 专门服务器
     */
    public final static String FIELD_MASS_MAILING_OUTGOING_MAIL_SERVER = "mass_mailing_outgoing_mail_server";

    /**
     * 属性: 24小时统计邮寄报告
     */
    public final static String FIELD_MASS_MAILING_REPORTS = "mass_mailing_reports";

    /**
     * 属性: 拆分名字和姓氏
     */
    public final static String FIELD_MASS_MAILING_SPLIT_CONTACT_NAME = "mass_mailing_split_contact_name";

    /**
     * 属性: 3单匹配:采购订单，收货单与发票
     */
    public final static String FIELD_MODULE_ACCOUNT3WAY_MATCH = "module_account3way_match";

    /**
     * 属性: 会计
     */
    public final static String FIELD_MODULE_ACCOUNT_ACCOUNTANT = "module_account_accountant";

    /**
     * 属性: Bank Statement Digitization
     */
    public final static String FIELD_MODULE_ACCOUNT_BANK_STATEMENT_EXTRACT = "module_account_bank_statement_extract";

    /**
     * 属性: 以CAMT.053 格式导入
     */
    public final static String FIELD_MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_CAMT = "module_account_bank_statement_import_camt";

    /**
     * 属性: 以.csv、.xls和.xlsx格式导入
     */
    public final static String FIELD_MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_CSV = "module_account_bank_statement_import_csv";

    /**
     * 属性: 以.ofx格式导入
     */
    public final static String FIELD_MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_OFX = "module_account_bank_statement_import_ofx";

    /**
     * 属性: 导入.qif单据
     */
    public final static String FIELD_MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_QIF = "module_account_bank_statement_import_qif";

    /**
     * 属性: 使用批量付款
     */
    public final static String FIELD_MODULE_ACCOUNT_BATCH_PAYMENT = "module_account_batch_payment";

    /**
     * 属性: 预算管理
     */
    public final static String FIELD_MODULE_ACCOUNT_BUDGET = "module_account_budget";

    /**
     * 属性: Allow check printing and deposits
     */
    public final static String FIELD_MODULE_ACCOUNT_CHECK_PRINTING = "module_account_check_printing";

    /**
     * 属性: Document Digitization
     */
    public final static String FIELD_MODULE_ACCOUNT_EXTRACT = "module_account_extract";

    /**
     * 属性: 管理公司间交易
     */
    public final static String FIELD_MODULE_ACCOUNT_INTER_COMPANY_RULES = "module_account_inter_company_rules";

    /**
     * 属性: 国际联盟
     */
    public final static String FIELD_MODULE_ACCOUNT_INTRASTAT = "module_account_intrastat";

    /**
     * 属性: Invoice Digitization
     */
    public final static String FIELD_MODULE_ACCOUNT_INVOICE_EXTRACT = "module_account_invoice_extract";

    /**
     * 属性: SEPA Credit Transfer / ISO20022
     */
    public final static String FIELD_MODULE_ACCOUNT_ISO20022 = "module_account_iso20022";

    /**
     * 属性: Invoice Online Payment
     */
    public final static String FIELD_MODULE_ACCOUNT_PAYMENT = "module_account_payment";

    /**
     * 属性: PEPPOL 开具发票
     */
    public final static String FIELD_MODULE_ACCOUNT_PEPPOL = "module_account_peppol";

    /**
     * 属性: Dynamic Reports
     */
    public final static String FIELD_MODULE_ACCOUNT_REPORTS = "module_account_reports";

    /**
     * 属性: Use SEPA Direct Debit
     */
    public final static String FIELD_MODULE_ACCOUNT_SEPA_DIRECT_DEBIT = "module_account_sepa_direct_debit";

    /**
     * 属性: LDAP认证
     */
    public final static String FIELD_MODULE_AUTH_LDAP = "module_auth_ldap";

    /**
     * 属性: 使用外部验证提供者 (OAuth)
     */
    public final static String FIELD_MODULE_AUTH_OAUTH = "module_auth_oauth";

    /**
     * 属性: 地理定位
     */
    public final static String FIELD_MODULE_BASE_GEOLOCALIZE = "module_base_geolocalize";

    /**
     * 属性: 允许用户导入 CSV/XLS/XLSX/ODS格式的文档数据
     */
    public final static String FIELD_MODULE_BASE_IMPORT = "module_base_import";

    /**
     * 属性: 根据线索的电子邮箱地址、使用公司数据自动丰富线索。
     */
    public final static String FIELD_MODULE_CRM_IAP_ENRICH = "module_crm_iap_enrich";

    /**
     * 属性: 基于国家/地区、行业、规模等信息生成新的线索。
     */
    public final static String FIELD_MODULE_CRM_IAP_MINE = "module_crm_iap_mine";

    /**
     * 属性: 自动汇率
     */
    public final static String FIELD_MODULE_CURRENCY_RATE_LIVE = "module_currency_rate_live";

    /**
     * 属性: 交付方式
     */
    public final static String FIELD_MODULE_DELIVERY = "module_delivery";

    /**
     * 属性: bpost连接器
     */
    public final static String FIELD_MODULE_DELIVERY_BPOST = "module_delivery_bpost";

    /**
     * 属性: DHL快递连接器
     */
    public final static String FIELD_MODULE_DELIVERY_DHL = "module_delivery_dhl";

    /**
     * 属性: Easypost连接器
     */
    public final static String FIELD_MODULE_DELIVERY_EASYPOST = "module_delivery_easypost";

    /**
     * 属性: FedEx连接器
     */
    public final static String FIELD_MODULE_DELIVERY_FEDEX = "module_delivery_fedex";

    /**
     * 属性: Sendcloud连接器
     */
    public final static String FIELD_MODULE_DELIVERY_SENDCLOUD = "module_delivery_sendcloud";

    /**
     * 属性: Shiprocket 连接器
     */
    public final static String FIELD_MODULE_DELIVERY_SHIPROCKET = "module_delivery_shiprocket";

    /**
     * 属性: Starshipit 连接器
     */
    public final static String FIELD_MODULE_DELIVERY_STARSHIPIT = "module_delivery_starshipit";

    /**
     * 属性: UPS连接器
     */
    public final static String FIELD_MODULE_DELIVERY_UPS = "module_delivery_ups";

    /**
     * 属性: USPS连接器
     */
    public final static String FIELD_MODULE_DELIVERY_USPS = "module_delivery_usps";

    /**
     * 属性: 允许用户同步谷歌日历
     */
    public final static String FIELD_MODULE_GOOGLE_CALENDAR = "module_google_calendar";

    /**
     * 属性: 支持Gmail身份验证
     */
    public final static String FIELD_MODULE_GOOGLE_GMAIL = "module_google_gmail";

    /**
     * 属性: 验证码
     */
    public final static String FIELD_MODULE_GOOGLE_RECAPTCHA = "module_google_recaptcha";

    /**
     * 属性: 向OCR发送账单以产生费用
     */
    public final static String FIELD_MODULE_HR_EXPENSE_EXTRACT = "module_hr_expense_extract";

    /**
     * 属性: 远程工作
     */
    public final static String FIELD_MODULE_HR_HOMEWORKING = "module_hr_homeworking";

    /**
     * 属性: 工资单上的报销费用
     */
    public final static String FIELD_MODULE_HR_PAYROLL_EXPENSE = "module_hr_payroll_expense";

    /**
     * 属性: 高级出席控制
     */
    public final static String FIELD_MODULE_HR_PRESENCE = "module_hr_presence";

    /**
     * 属性: 将简历发送到 OCR 以填写申请
     */
    public final static String FIELD_MODULE_HR_RECRUITMENT_EXTRACT = "module_hr_recruitment_extract";

    /**
     * 属性: 面试表单
     */
    public final static String FIELD_MODULE_HR_RECRUITMENT_SURVEY = "module_hr_recruitment_survey";

    /**
     * 属性: 技能管理
     */
    public final static String FIELD_MODULE_HR_SKILLS = "module_hr_skills";

    /**
     * 属性: 任务日志
     */
    public final static String FIELD_MODULE_HR_TIMESHEET = "module_hr_timesheet";

    /**
     * 属性: 欧盟共同体内部远程销售
     */
    public final static String FIELD_MODULE_L10N_EU_OSS = "module_l10n_eu_oss";

    /**
     * 属性: 促销、优惠券、礼品卡和会员方案
     */
    public final static String FIELD_MODULE_LOYALTY = "module_loyalty";

    /**
     * 属性: 允许与邮件插件集成
     */
    public final static String FIELD_MODULE_MAIL_PLUGIN = "module_mail_plugin";

    /**
     * 属性: 定制维护工作表
     */
    public final static String FIELD_MODULE_MAINTENANCE_WORKSHEET = "module_maintenance_worksheet";

    /**
     * 属性: 允许用户同步Outlook日历
     */
    public final static String FIELD_MODULE_MICROSOFT_CALENDAR = "module_microsoft_calendar";

    /**
     * 属性: 支持Outlook身份验证
     */
    public final static String FIELD_MODULE_MICROSOFT_OUTLOOK = "module_microsoft_outlook";

    /**
     * 属性: 主生产计划
     */
    public final static String FIELD_MODULE_MRP_MPS = "module_mrp_mps";

    /**
     * 属性: 产品生命周期管理（PLM）
     */
    public final static String FIELD_MODULE_MRP_PLM = "module_mrp_plm";

    /**
     * 属性: 外包
     */
    public final static String FIELD_MODULE_MRP_SUBCONTRACTING = "module_mrp_subcontracting";

    /**
     * 属性: 合作伙伴自动完成
     */
    public final static String FIELD_MODULE_PARTNER_AUTOCOMPLETE = "module_partner_autocomplete";

    /**
     * 属性: 特定的电子邮件
     */
    public final static String FIELD_MODULE_PRODUCT_EMAIL_TEMPLATE = "module_product_email_template";

    /**
     * 属性: 到期日期
     */
    public final static String FIELD_MODULE_PRODUCT_EXPIRY = "module_product_expiry";

    /**
     * 属性: 使用条形码获取产品图片
     */
    public final static String FIELD_MODULE_PRODUCT_IMAGES = "module_product_images";

    /**
     * 属性: 允许产品毛利
     */
    public final static String FIELD_MODULE_PRODUCT_MARGIN = "module_product_margin";

    /**
     * 属性: 采购表格入口
     */
    public final static String FIELD_MODULE_PURCHASE_PRODUCT_MATRIX = "module_purchase_product_matrix";

    /**
     * 属性: 采购协议
     */
    public final static String FIELD_MODULE_PURCHASE_REQUISITION = "module_purchase_requisition";

    /**
     * 属性: 质量
     */
    public final static String FIELD_MODULE_QUALITY_CONTROL = "module_quality_control";

    /**
     * 属性: 质量工作表
     */
    public final static String FIELD_MODULE_QUALITY_CONTROL_WORKSHEET = "module_quality_control_worksheet";

    /**
     * 属性: 亚马逊同步
     */
    public final static String FIELD_MODULE_SALE_AMAZON = "module_sale_amazon";

    /**
     * 属性: 佣金
     */
    public final static String FIELD_MODULE_SALE_COMMISSION = "module_sale_commission";

    /**
     * 属性: 优惠券和会员
     */
    public final static String FIELD_MODULE_SALE_LOYALTY = "module_sale_loyalty";

    /**
     * 属性: 毛利
     */
    public final static String FIELD_MODULE_SALE_MARGIN = "module_sale_margin";

    /**
     * 属性: PDF 报价生成器
     */
    public final static String FIELD_MODULE_SALE_PDF_QUOTE_BUILDER = "module_sale_pdf_quote_builder";

    /**
     * 属性: 销售表格录入
     */
    public final static String FIELD_MODULE_SALE_PRODUCT_MATRIX = "module_sale_product_matrix";

    /**
     * 属性: 短信息
     */
    public final static String FIELD_MODULE_SMS = "module_sms";

    /**
     * 属性: 传统信件
     */
    public final static String FIELD_MODULE_SNAILMAIL_ACCOUNT = "module_snailmail_account";

    /**
     * 属性: 条码扫描器
     */
    public final static String FIELD_MODULE_STOCK_BARCODE = "module_stock_barcode";

    /**
     * 属性: 库存条形码数据库
     */
    public final static String FIELD_MODULE_STOCK_BARCODE_BARCODELOOKUP = "module_stock_barcode_barcodelookup";

    /**
     * 属性: 代发货
     */
    public final static String FIELD_MODULE_STOCK_DROPSHIPPING = "module_stock_dropshipping";

    /**
     * 属性: 配送管理系统
     */
    public final static String FIELD_MODULE_STOCK_FLEET = "module_stock_fleet";

    /**
     * 属性: 到岸成本
     */
    public final static String FIELD_MODULE_STOCK_LANDED_COSTS = "module_stock_landed_costs";

    /**
     * 属性: 批量、波次和集群调拨
     */
    public final static String FIELD_MODULE_STOCK_PICKING_BATCH = "module_stock_picking_batch";

    /**
     * 属性: 短信息确认
     */
    public final static String FIELD_MODULE_STOCK_SMS = "module_stock_sms";

    /**
     * 属性: 网络电话
     */
    public final static String FIELD_MODULE_VOIP = "module_voip";

    /**
     * 属性: Unsplash图像库
     */
    public final static String FIELD_MODULE_WEB_UNSPLASH = "module_web_unsplash";

    /**
     * 属性: Cloudflare Turnstile
     */
    public final static String FIELD_MODULE_WEBSITE_CF_TURNSTILE = "module_website_cf_turnstile";

    /**
     * 属性: 从网站流量创建线索/商机
     */
    public final static String FIELD_MODULE_WEBSITE_CRM_IAP_REVEAL = "module_website_crm_iap_reveal";

    /**
     * 属性: 线上发布
     */
    public final static String FIELD_MODULE_WEBSITE_HR_RECRUITMENT = "module_website_hr_recruitment";

    /**
     * 属性: 对公司有利的宽容时间
     */
    public final static String FIELD_OVERTIME_COMPANY_THRESHOLD = "overtime_company_threshold";

    /**
     * 属性: 对员工有利的宽容时间
     */
    public final static String FIELD_OVERTIME_EMPLOYEE_THRESHOLD = "overtime_employee_threshold";

    /**
     * 属性: 信用不足
     */
    public final static String FIELD_PARTNER_AUTOCOMPLETE_INSUFFICIENT_CREDIT = "partner_autocomplete_insufficient_credit";

    /**
     * 属性: 在线支付发票
     */
    public final static String FIELD_PAY_INVOICES_ONLINE = "pay_invoices_online";

    /**
     * 属性: 订单审批
     */
    public final static String FIELD_PO_ORDER_APPROVAL = "po_order_approval";

    /**
     * 属性: 客户 API 密钥
     */
    public final static String FIELD_PORTAL_ALLOW_API_KEYS = "portal_allow_api_keys";

    /**
     * 属性: 预测线索评分字段标签
     */
    public final static String FIELD_PREDICTIVE_LEAD_SCORING_FIELD_LABELS = "predictive_lead_scoring_field_labels";

    /**
     * 属性: 字符串中的线索评分频率字段
     */
    public final static String FIELD_PREDICTIVE_LEAD_SCORING_FIELDS_STR = "predictive_lead_scoring_fields_str";

    /**
     * 属性: 线索评分开始日期
     */
    public final static String FIELD_PREDICTIVE_LEAD_SCORING_START_DATE = "predictive_lead_scoring_start_date";

    /**
     * 属性: 字符串中的线索评分开始日期
     */
    public final static String FIELD_PREDICTIVE_LEAD_SCORING_START_DATE_STR = "predictive_lead_scoring_start_date_str";

    /**
     * 属性: Display preview button
     */
    public final static String FIELD_PREVIEW_READY = "preview_ready";

    /**
     * 属性: 体积单位
     */
    public final static String FIELD_PRODUCT_VOLUME_VOLUME_IN_CUBIC_FEET = "product_volume_volume_in_cubic_feet";

    /**
     * 属性: 重量单位
     */
    public final static String FIELD_PRODUCT_WEIGHT_IN_LBS = "product_weight_in_lbs";

    /**
     * 属性: 启用分析直到
     */
    public final static String FIELD_PROFILING_ENABLED_UNTIL = "profiling_enabled_until";

    /**
     * 属性: 限制模板渲染
     */
    public final static String FIELD_RESTRICT_TEMPLATE_RENDERING = "restrict_template_rendering";

    /**
     * 属性: SFU 服务器密钥
     */
    public final static String FIELD_SFU_SERVER_KEY = "sfu_server_key";

    /**
     * 属性: SFU 服务器 URL
     */
    public final static String FIELD_SFU_SERVER_URL = "sfu_server_url";

    /**
     * 属性: 退订时黑名单选项
     */
    public final static String FIELD_SHOW_BLACKLIST_BUTTONS = "show_blacklist_buttons";

    /**
     * 属性: 显示效果
     */
    public final static String FIELD_SHOW_EFFECT = "show_effect";

    /**
     * 属性: 蜗牛邮件封面只读
     */
    public final static String FIELD_SNAILMAIL_COVER_READONLY = "snailmail_cover_readonly";

    /**
     * 属性: Tenor API 密钥
     */
    public final static String FIELD_TENOR_API_KEY = "tenor_api_key";

    /**
     * 属性: Tenor 内容过滤器
     */
    public final static String FIELD_TENOR_CONTENT_FILTER = "tenor_content_filter";

    /**
     * 属性: Tenor Gif 限额
     */
    public final static String FIELD_TENOR_GIF_LIMIT = "tenor_gif_limit";

    /**
     * 属性: Twilio 帐户 SID
     */
    public final static String FIELD_TWILIO_ACCOUNT_SID = "twilio_account_sid";

    /**
     * 属性: Twilio 帐户身份验证令牌
     */
    public final static String FIELD_TWILIO_ACCOUNT_TOKEN = "twilio_account_token";

    /**
     * 属性: 访问秘钥
     */
    public final static String FIELD_UNSPLASH_ACCESS_KEY = "unsplash_access_key";

    /**
     * 属性: 应用程序ID
     */
    public final static String FIELD_UNSPLASH_APP_ID = "unsplash_app_id";

    /**
     * 属性: 默认条款和条件
     */
    public final static String FIELD_USE_INVOICE_TERMS = "use_invoice_terms";

    /**
     * 属性: 默认制造提前期
     */
    public final static String FIELD_USE_MANUFACTURING_LEAD = "use_manufacturing_lead";

    /**
     * 属性: 安全交货时间
     */
    public final static String FIELD_USE_PO_LEAD = "use_po_lead";

    /**
     * 属性: 销售的安全提前期
     */
    public final static String FIELD_USE_SECURITY_LEAD = "use_security_lead";

    /**
     * 属性: 使用 Twilio ICE 服务器
     */
    public final static String FIELD_USE_TWILIO_RTC_SERVERS = "use_twilio_rtc_servers";

    /**
     * 属性: 默认访问权限
     */
    public final static String FIELD_USER_DEFAULT_RIGHTS = "user_default_rights";

    /**
     * 属性: 网络应用程序名称
     */
    public final static String FIELD_WEB_APP_NAME = "web_app_name";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「默认信用额度」
     * @param val
     */
    @JsonProperty(FIELD_ACCOUNT_DEFAULT_CREDIT_LIMIT)
    public ResConfigSettingsDTO setAccountDefaultCreditLimit(BigDecimal val) {
        this._set(FIELD_ACCOUNT_DEFAULT_CREDIT_LIMIT, val);
        return this;
    }

    /**
     * 获取「默认信用额度」值
     *
     */
    @JsonIgnore
    public BigDecimal getAccountDefaultCreditLimit() {
        return DataTypeUtils.asBigDecimal(this._get(FIELD_ACCOUNT_DEFAULT_CREDIT_LIMIT), null);
    }

    /**
     * 判断 「默认信用额度」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAccountDefaultCreditLimit() {
        return this._contains(FIELD_ACCOUNT_DEFAULT_CREDIT_LIMIT);
    }

    /**
     * 重置 「默认信用额度」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetAccountDefaultCreditLimit() {
        this._reset(FIELD_ACCOUNT_DEFAULT_CREDIT_LIMIT);
        return this;
    }

    /**
     * 设置「有效用户数量」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVE_USER_COUNT)
    public ResConfigSettingsDTO setActiveUserCount(Integer val) {
        this._set(FIELD_ACTIVE_USER_COUNT, val);
        return this;
    }

    /**
     * 获取「有效用户数量」值
     *
     */
    @JsonIgnore
    public Integer getActiveUserCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_ACTIVE_USER_COUNT), null);
    }

    /**
     * 判断 「有效用户数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActiveUserCount() {
        return this._contains(FIELD_ACTIVE_USER_COUNT);
    }

    /**
     * 重置 「有效用户数量」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetActiveUserCount() {
        this._reset(FIELD_ACTIVE_USER_COUNT);
        return this;
    }

    /**
     * 设置「允许在登录页开启密码重置功能」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_AUTH_SIGNUP_RESET_PASSWORD)
    public ResConfigSettingsDTO setAuthSignupResetPassword(Integer val) {
        this._set(FIELD_AUTH_SIGNUP_RESET_PASSWORD, val);
        return this;
    }

    /**
     * 获取「允许在登录页开启密码重置功能」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getAuthSignupResetPassword() {
        return DataTypeUtils.asInteger(this._get(FIELD_AUTH_SIGNUP_RESET_PASSWORD), null);
    }

    /**
     * 判断 「允许在登录页开启密码重置功能」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAuthSignupResetPassword() {
        return this._contains(FIELD_AUTH_SIGNUP_RESET_PASSWORD);
    }

    /**
     * 重置 「允许在登录页开启密码重置功能」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetAuthSignupResetPassword() {
        this._reset(FIELD_AUTH_SIGNUP_RESET_PASSWORD);
        return this;
    }

    /**
     * 设置「用作通过注册创建的新用户的模版」
     * @param val
     */
    @JsonProperty(FIELD_AUTH_SIGNUP_TEMPLATE_USER_ID)
    public ResConfigSettingsDTO setAuthSignupTemplateUserId(String val) {
        this._set(FIELD_AUTH_SIGNUP_TEMPLATE_USER_ID, val);
        return this;
    }

    /**
     * 获取「用作通过注册创建的新用户的模版」值
     *
     */
    @JsonIgnore
    public String getAuthSignupTemplateUserId() {
        return DataTypeUtils.asString(this._get(FIELD_AUTH_SIGNUP_TEMPLATE_USER_ID), null);
    }

    /**
     * 判断 「用作通过注册创建的新用户的模版」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAuthSignupTemplateUserId() {
        return this._contains(FIELD_AUTH_SIGNUP_TEMPLATE_USER_ID);
    }

    /**
     * 重置 「用作通过注册创建的新用户的模版」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetAuthSignupTemplateUserId() {
        this._reset(FIELD_AUTH_SIGNUP_TEMPLATE_USER_ID);
        return this;
    }

    /**
     * 设置「客户帐号」
     * 代码表[客户帐号]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_config_settings_auth_signup_uninvited
     * @param val
     */
    @JsonProperty(FIELD_AUTH_SIGNUP_UNINVITED)
    public ResConfigSettingsDTO setAuthSignupUninvited(String val) {
        this._set(FIELD_AUTH_SIGNUP_UNINVITED, val);
        return this;
    }

    /**
     * 获取「客户帐号」值
     * 代码表[客户帐号]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_config_settings_auth_signup_uninvited
     *
     */
    @JsonIgnore
    public String getAuthSignupUninvited() {
        return DataTypeUtils.asString(this._get(FIELD_AUTH_SIGNUP_UNINVITED), null);
    }

    /**
     * 判断 「客户帐号」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAuthSignupUninvited() {
        return this._contains(FIELD_AUTH_SIGNUP_UNINVITED);
    }

    /**
     * 重置 「客户帐号」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetAuthSignupUninvited() {
        this._reset(FIELD_AUTH_SIGNUP_UNINVITED);
        return this;
    }

    /**
     * 设置「自动发票」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_AUTOMATIC_INVOICE)
    public ResConfigSettingsDTO setAutomaticInvoice(Integer val) {
        this._set(FIELD_AUTOMATIC_INVOICE, val);
        return this;
    }

    /**
     * 获取「自动发票」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getAutomaticInvoice() {
        return DataTypeUtils.asInteger(this._get(FIELD_AUTOMATIC_INVOICE), null);
    }

    /**
     * 判断 「自动发票」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAutomaticInvoice() {
        return this._contains(FIELD_AUTOMATIC_INVOICE);
    }

    /**
     * 重置 「自动发票」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetAutomaticInvoice() {
        this._reset(FIELD_AUTOMATIC_INVOICE);
        return this;
    }

    /**
     * 设置「分隔符」
     * @param val
     */
    @JsonProperty(FIELD_BARCODE_SEPARATOR)
    public ResConfigSettingsDTO setBarcodeSeparator(String val) {
        this._set(FIELD_BARCODE_SEPARATOR, val);
        return this;
    }

    /**
     * 获取「分隔符」值
     *
     */
    @JsonIgnore
    public String getBarcodeSeparator() {
        return DataTypeUtils.asString(this._get(FIELD_BARCODE_SEPARATOR), null);
    }

    /**
     * 判断 「分隔符」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBarcodeSeparator() {
        return this._contains(FIELD_BARCODE_SEPARATOR);
    }

    /**
     * 重置 「分隔符」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetBarcodeSeparator() {
        this._reset(FIELD_BARCODE_SEPARATOR);
        return this;
    }

    /**
     * 设置「公司数量」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_COUNT)
    public ResConfigSettingsDTO setCompanyCount(Integer val) {
        this._set(FIELD_COMPANY_COUNT, val);
        return this;
    }

    /**
     * 获取「公司数量」值
     *
     */
    @JsonIgnore
    public Integer getCompanyCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_COMPANY_COUNT), null);
    }

    /**
     * 判断 「公司数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCompanyCount() {
        return this._contains(FIELD_COMPANY_COUNT);
    }

    /**
     * 重置 「公司数量」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetCompanyCount() {
        this._reset(FIELD_COMPANY_COUNT);
        return this;
    }

    /**
     * 设置「公司」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_ID)
    public ResConfigSettingsDTO setCompanyId(String val) {
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
    public ResConfigSettingsDTO resetCompanyId() {
        this._reset(FIELD_COMPANY_ID);
        return this;
    }

    /**
     * 设置「公司信息」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_INFORMATIONS)
    public ResConfigSettingsDTO setCompanyInformations(String val) {
        this._set(FIELD_COMPANY_INFORMATIONS, val);
        return this;
    }

    /**
     * 获取「公司信息」值
     *
     */
    @JsonIgnore
    public String getCompanyInformations() {
        return DataTypeUtils.asString(this._get(FIELD_COMPANY_INFORMATIONS), null);
    }

    /**
     * 判断 「公司信息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCompanyInformations() {
        return this._contains(FIELD_COMPANY_INFORMATIONS);
    }

    /**
     * 重置 「公司信息」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetCompanyInformations() {
        this._reset(FIELD_COMPANY_INFORMATIONS);
        return this;
    }

    /**
     * 设置「公司」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_NAME)
    public ResConfigSettingsDTO setCompanyName(String val) {
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
    public ResConfigSettingsDTO resetCompanyName() {
        this._reset(FIELD_COMPANY_NAME);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public ResConfigSettingsDTO setCreateDate(Timestamp val) {
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
    public ResConfigSettingsDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public ResConfigSettingsDTO setCreateUid(String val) {
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
    public ResConfigSettingsDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「自动分配操作」
     * 代码表[自动分配操作]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_config_settings_crm_auto_assignment_action
     * @param val
     */
    @JsonProperty(FIELD_CRM_AUTO_ASSIGNMENT_ACTION)
    public ResConfigSettingsDTO setCrmAutoAssignmentAction(String val) {
        this._set(FIELD_CRM_AUTO_ASSIGNMENT_ACTION, val);
        return this;
    }

    /**
     * 获取「自动分配操作」值
     * 代码表[自动分配操作]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_config_settings_crm_auto_assignment_action
     *
     */
    @JsonIgnore
    public String getCrmAutoAssignmentAction() {
        return DataTypeUtils.asString(this._get(FIELD_CRM_AUTO_ASSIGNMENT_ACTION), null);
    }

    /**
     * 判断 「自动分配操作」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCrmAutoAssignmentAction() {
        return this._contains(FIELD_CRM_AUTO_ASSIGNMENT_ACTION);
    }

    /**
     * 重置 「自动分配操作」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetCrmAutoAssignmentAction() {
        this._reset(FIELD_CRM_AUTO_ASSIGNMENT_ACTION);
        return this;
    }

    /**
     * 设置「重复间隔为每」
     * @param val
     */
    @JsonProperty(FIELD_CRM_AUTO_ASSIGNMENT_INTERVAL_NUMBER)
    public ResConfigSettingsDTO setCrmAutoAssignmentIntervalNumber(Integer val) {
        this._set(FIELD_CRM_AUTO_ASSIGNMENT_INTERVAL_NUMBER, val);
        return this;
    }

    /**
     * 获取「重复间隔为每」值
     *
     */
    @JsonIgnore
    public Integer getCrmAutoAssignmentIntervalNumber() {
        return DataTypeUtils.asInteger(this._get(FIELD_CRM_AUTO_ASSIGNMENT_INTERVAL_NUMBER), null);
    }

    /**
     * 判断 「重复间隔为每」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCrmAutoAssignmentIntervalNumber() {
        return this._contains(FIELD_CRM_AUTO_ASSIGNMENT_INTERVAL_NUMBER);
    }

    /**
     * 重置 「重复间隔为每」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetCrmAutoAssignmentIntervalNumber() {
        this._reset(FIELD_CRM_AUTO_ASSIGNMENT_INTERVAL_NUMBER);
        return this;
    }

    /**
     * 设置「自动分配间隔单位」
     * 代码表[自动分配间隔单位]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_config_settings_crm_auto_assignment_interval_type
     * @param val
     */
    @JsonProperty(FIELD_CRM_AUTO_ASSIGNMENT_INTERVAL_TYPE)
    public ResConfigSettingsDTO setCrmAutoAssignmentIntervalType(String val) {
        this._set(FIELD_CRM_AUTO_ASSIGNMENT_INTERVAL_TYPE, val);
        return this;
    }

    /**
     * 获取「自动分配间隔单位」值
     * 代码表[自动分配间隔单位]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_config_settings_crm_auto_assignment_interval_type
     *
     */
    @JsonIgnore
    public String getCrmAutoAssignmentIntervalType() {
        return DataTypeUtils.asString(this._get(FIELD_CRM_AUTO_ASSIGNMENT_INTERVAL_TYPE), null);
    }

    /**
     * 判断 「自动分配间隔单位」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCrmAutoAssignmentIntervalType() {
        return this._contains(FIELD_CRM_AUTO_ASSIGNMENT_INTERVAL_TYPE);
    }

    /**
     * 重置 「自动分配间隔单位」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetCrmAutoAssignmentIntervalType() {
        this._reset(FIELD_CRM_AUTO_ASSIGNMENT_INTERVAL_TYPE);
        return this;
    }

    /**
     * 设置「自动指派下次执行日期」
     * @param val
     */
    @JsonProperty(FIELD_CRM_AUTO_ASSIGNMENT_RUN_DATETIME)
    public ResConfigSettingsDTO setCrmAutoAssignmentRunDatetime(Timestamp val) {
        this._set(FIELD_CRM_AUTO_ASSIGNMENT_RUN_DATETIME, val);
        return this;
    }

    /**
     * 获取「自动指派下次执行日期」值
     *
     */
    @JsonIgnore
    public Timestamp getCrmAutoAssignmentRunDatetime() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_CRM_AUTO_ASSIGNMENT_RUN_DATETIME), null);
    }

    /**
     * 判断 「自动指派下次执行日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCrmAutoAssignmentRunDatetime() {
        return this._contains(FIELD_CRM_AUTO_ASSIGNMENT_RUN_DATETIME);
    }

    /**
     * 重置 「自动指派下次执行日期」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetCrmAutoAssignmentRunDatetime() {
        this._reset(FIELD_CRM_AUTO_ASSIGNMENT_RUN_DATETIME);
        return this;
    }

    /**
     * 设置「基于规则的分配」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_CRM_USE_AUTO_ASSIGNMENT)
    public ResConfigSettingsDTO setCrmUseAutoAssignment(Integer val) {
        this._set(FIELD_CRM_USE_AUTO_ASSIGNMENT, val);
        return this;
    }

    /**
     * 获取「基于规则的分配」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getCrmUseAutoAssignment() {
        return DataTypeUtils.asInteger(this._get(FIELD_CRM_USE_AUTO_ASSIGNMENT), null);
    }

    /**
     * 判断 「基于规则的分配」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCrmUseAutoAssignment() {
        return this._contains(FIELD_CRM_USE_AUTO_ASSIGNMENT);
    }

    /**
     * 重置 「基于规则的分配」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetCrmUseAutoAssignment() {
        this._reset(FIELD_CRM_USE_AUTO_ASSIGNMENT);
        return this;
    }

    /**
     * 设置「开票原则」
     * 代码表[开票原则]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_config_settings_default_invoice_policy
     * @param val
     */
    @JsonProperty(FIELD_DEFAULT_INVOICE_POLICY)
    public ResConfigSettingsDTO setDefaultInvoicePolicy(String val) {
        this._set(FIELD_DEFAULT_INVOICE_POLICY, val);
        return this;
    }

    /**
     * 获取「开票原则」值
     * 代码表[开票原则]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_config_settings_default_invoice_policy
     *
     */
    @JsonIgnore
    public String getDefaultInvoicePolicy() {
        return DataTypeUtils.asString(this._get(FIELD_DEFAULT_INVOICE_POLICY), null);
    }

    /**
     * 判断 「开票原则」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDefaultInvoicePolicy() {
        return this._contains(FIELD_DEFAULT_INVOICE_POLICY);
    }

    /**
     * 重置 「开票原则」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetDefaultInvoicePolicy() {
        this._reset(FIELD_DEFAULT_INVOICE_POLICY);
        return this;
    }

    /**
     * 设置「拣货策略」
     * 代码表[拣货策略]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_config_settings_default_picking_policy
     * @param val
     */
    @JsonProperty(FIELD_DEFAULT_PICKING_POLICY)
    public ResConfigSettingsDTO setDefaultPickingPolicy(String val) {
        this._set(FIELD_DEFAULT_PICKING_POLICY, val);
        return this;
    }

    /**
     * 获取「拣货策略」值
     * 代码表[拣货策略]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_config_settings_default_picking_policy
     *
     */
    @JsonIgnore
    public String getDefaultPickingPolicy() {
        return DataTypeUtils.asString(this._get(FIELD_DEFAULT_PICKING_POLICY), null);
    }

    /**
     * 判断 「拣货策略」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDefaultPickingPolicy() {
        return this._contains(FIELD_DEFAULT_PICKING_POLICY);
    }

    /**
     * 重置 「拣货策略」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetDefaultPickingPolicy() {
        this._reset(FIELD_DEFAULT_PICKING_POLICY);
        return this;
    }

    /**
     * 设置「账单管理」
     * 代码表[账单管理]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_config_settings_default_purchase_method
     * @param val
     */
    @JsonProperty(FIELD_DEFAULT_PURCHASE_METHOD)
    public ResConfigSettingsDTO setDefaultPurchaseMethod(String val) {
        this._set(FIELD_DEFAULT_PURCHASE_METHOD, val);
        return this;
    }

    /**
     * 获取「账单管理」值
     * 代码表[账单管理]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_config_settings_default_purchase_method
     *
     */
    @JsonIgnore
    public String getDefaultPurchaseMethod() {
        return DataTypeUtils.asString(this._get(FIELD_DEFAULT_PURCHASE_METHOD), null);
    }

    /**
     * 判断 「账单管理」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDefaultPurchaseMethod() {
        return this._contains(FIELD_DEFAULT_PURCHASE_METHOD);
    }

    /**
     * 重置 「账单管理」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetDefaultPurchaseMethod() {
        this._reset(FIELD_DEFAULT_PURCHASE_METHOD);
        return this;
    }

    /**
     * 设置「合同逾期延时预警」
     * @param val
     */
    @JsonProperty(FIELD_DELAY_ALERT_CONTRACT)
    public ResConfigSettingsDTO setDelayAlertContract(Integer val) {
        this._set(FIELD_DELAY_ALERT_CONTRACT, val);
        return this;
    }

    /**
     * 获取「合同逾期延时预警」值
     *
     */
    @JsonIgnore
    public Integer getDelayAlertContract() {
        return DataTypeUtils.asInteger(this._get(FIELD_DELAY_ALERT_CONTRACT), null);
    }

    /**
     * 判断 「合同逾期延时预警」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDelayAlertContract() {
        return this._contains(FIELD_DELAY_ALERT_CONTRACT);
    }

    /**
     * 重置 「合同逾期延时预警」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetDelayAlertContract() {
        this._reset(FIELD_DELAY_ALERT_CONTRACT);
        return this;
    }

    /**
     * 设置「摘要邮件」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_DIGEST_EMAILS)
    public ResConfigSettingsDTO setDigestEmails(Integer val) {
        this._set(FIELD_DIGEST_EMAILS, val);
        return this;
    }

    /**
     * 获取「摘要邮件」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getDigestEmails() {
        return DataTypeUtils.asInteger(this._get(FIELD_DIGEST_EMAILS), null);
    }

    /**
     * 判断 「摘要邮件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDigestEmails() {
        return this._contains(FIELD_DIGEST_EMAILS);
    }

    /**
     * 重置 「摘要邮件」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetDigestEmails() {
        this._reset(FIELD_DIGEST_EMAILS);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public ResConfigSettingsDTO setDisplayName(String val) {
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
    public ResConfigSettingsDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「使用自定义电子邮件服务器」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_EXTERNAL_EMAIL_SERVER_DEFAULT)
    public ResConfigSettingsDTO setExternalEmailServerDefault(Integer val) {
        this._set(FIELD_EXTERNAL_EMAIL_SERVER_DEFAULT, val);
        return this;
    }

    /**
     * 获取「使用自定义电子邮件服务器」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getExternalEmailServerDefault() {
        return DataTypeUtils.asInteger(this._get(FIELD_EXTERNAL_EMAIL_SERVER_DEFAULT), null);
    }

    /**
     * 判断 「使用自定义电子邮件服务器」是否有值
     *
     */
    @JsonIgnore
    public boolean containsExternalEmailServerDefault() {
        return this._contains(FIELD_EXTERNAL_EMAIL_SERVER_DEFAULT);
    }

    /**
     * 重置 「使用自定义电子邮件服务器」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetExternalEmailServerDefault() {
        this._reset(FIELD_EXTERNAL_EMAIL_SERVER_DEFAULT);
        return this;
    }

    /**
     * 设置「失败的邮件」
     * @param val
     */
    @JsonProperty(FIELD_FAIL_COUNTER)
    public ResConfigSettingsDTO setFailCounter(Integer val) {
        this._set(FIELD_FAIL_COUNTER, val);
        return this;
    }

    /**
     * 获取「失败的邮件」值
     *
     */
    @JsonIgnore
    public Integer getFailCounter() {
        return DataTypeUtils.asInteger(this._get(FIELD_FAIL_COUNTER), null);
    }

    /**
     * 判断 「失败的邮件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFailCounter() {
        return this._contains(FIELD_FAIL_COUNTER);
    }

    /**
     * 重置 「失败的邮件」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetFailCounter() {
        this._reset(FIELD_FAIL_COUNTER);
        return this;
    }

    /**
     * 设置「Gmail 客户端 ID」
     * @param val
     */
    @JsonProperty(FIELD_GOOGLE_GMAIL_CLIENT_IDENTIFIER)
    public ResConfigSettingsDTO setGoogleGmailClientIdentifier(String val) {
        this._set(FIELD_GOOGLE_GMAIL_CLIENT_IDENTIFIER, val);
        return this;
    }

    /**
     * 获取「Gmail 客户端 ID」值
     *
     */
    @JsonIgnore
    public String getGoogleGmailClientIdentifier() {
        return DataTypeUtils.asString(this._get(FIELD_GOOGLE_GMAIL_CLIENT_IDENTIFIER), null);
    }

    /**
     * 判断 「Gmail 客户端 ID」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGoogleGmailClientIdentifier() {
        return this._contains(FIELD_GOOGLE_GMAIL_CLIENT_IDENTIFIER);
    }

    /**
     * 重置 「Gmail 客户端 ID」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGoogleGmailClientIdentifier() {
        this._reset(FIELD_GOOGLE_GMAIL_CLIENT_IDENTIFIER);
        return this;
    }

    /**
     * 设置「Gmail客户端Secret」
     * @param val
     */
    @JsonProperty(FIELD_GOOGLE_GMAIL_CLIENT_SECRET)
    public ResConfigSettingsDTO setGoogleGmailClientSecret(String val) {
        this._set(FIELD_GOOGLE_GMAIL_CLIENT_SECRET, val);
        return this;
    }

    /**
     * 获取「Gmail客户端Secret」值
     *
     */
    @JsonIgnore
    public String getGoogleGmailClientSecret() {
        return DataTypeUtils.asString(this._get(FIELD_GOOGLE_GMAIL_CLIENT_SECRET), null);
    }

    /**
     * 判断 「Gmail客户端Secret」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGoogleGmailClientSecret() {
        return this._contains(FIELD_GOOGLE_GMAIL_CLIENT_SECRET);
    }

    /**
     * 重置 「Gmail客户端Secret」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGoogleGmailClientSecret() {
        this._reset(FIELD_GOOGLE_GMAIL_CLIENT_SECRET);
        return this;
    }

    /**
     * 设置「消息翻译 API 密钥」
     * @param val
     */
    @JsonProperty(FIELD_GOOGLE_TRANSLATE_API_KEY)
    public ResConfigSettingsDTO setGoogleTranslateApiKey(String val) {
        this._set(FIELD_GOOGLE_TRANSLATE_API_KEY, val);
        return this;
    }

    /**
     * 获取「消息翻译 API 密钥」值
     *
     */
    @JsonIgnore
    public String getGoogleTranslateApiKey() {
        return DataTypeUtils.asString(this._get(FIELD_GOOGLE_TRANSLATE_API_KEY), null);
    }

    /**
     * 判断 「消息翻译 API 密钥」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGoogleTranslateApiKey() {
        return this._contains(FIELD_GOOGLE_TRANSLATE_API_KEY);
    }

    /**
     * 重置 「消息翻译 API 密钥」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGoogleTranslateApiKey() {
        this._reset(FIELD_GOOGLE_TRANSLATE_API_KEY);
        return this;
    }

    /**
     * 设置「分析会计」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_ANALYTIC_ACCOUNTING)
    public ResConfigSettingsDTO setGroupAnalyticAccounting(Integer val) {
        this._set(FIELD_GROUP_ANALYTIC_ACCOUNTING, val);
        return this;
    }

    /**
     * 获取「分析会计」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupAnalyticAccounting() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_ANALYTIC_ACCOUNTING), null);
    }

    /**
     * 判断 「分析会计」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupAnalyticAccounting() {
        return this._contains(FIELD_GROUP_ANALYTIC_ACCOUNTING);
    }

    /**
     * 重置 「分析会计」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupAnalyticAccounting() {
        this._reset(FIELD_GROUP_ANALYTIC_ACCOUNTING);
        return this;
    }

    /**
     * 设置「团体申请人简历展示」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_APPLICANT_CV_DISPLAY)
    public ResConfigSettingsDTO setGroupApplicantCvDisplay(Integer val) {
        this._set(FIELD_GROUP_APPLICANT_CV_DISPLAY, val);
        return this;
    }

    /**
     * 获取「团体申请人简历展示」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupApplicantCvDisplay() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_APPLICANT_CV_DISPLAY), null);
    }

    /**
     * 判断 「团体申请人简历展示」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupApplicantCvDisplay() {
        return this._contains(FIELD_GROUP_APPLICANT_CV_DISPLAY);
    }

    /**
     * 重置 「团体申请人简历展示」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupApplicantCvDisplay() {
        this._reset(FIELD_GROUP_APPLICANT_CV_DISPLAY);
        return this;
    }

    /**
     * 设置「锁定已确认的销售订单」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_AUTO_DONE_SETTING)
    public ResConfigSettingsDTO setGroupAutoDoneSetting(Integer val) {
        this._set(FIELD_GROUP_AUTO_DONE_SETTING, val);
        return this;
    }

    /**
     * 获取「锁定已确认的销售订单」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupAutoDoneSetting() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_AUTO_DONE_SETTING), null);
    }

    /**
     * 判断 「锁定已确认的销售订单」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupAutoDoneSetting() {
        return this._contains(FIELD_GROUP_AUTO_DONE_SETTING);
    }

    /**
     * 重置 「锁定已确认的销售订单」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupAutoDoneSetting() {
        this._reset(FIELD_GROUP_AUTO_DONE_SETTING);
        return this;
    }

    /**
     * 设置「现金舍入」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_CASH_ROUNDING)
    public ResConfigSettingsDTO setGroupCashRounding(Integer val) {
        this._set(FIELD_GROUP_CASH_ROUNDING, val);
        return this;
    }

    /**
     * 获取「现金舍入」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupCashRounding() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_CASH_ROUNDING), null);
    }

    /**
     * 判断 「现金舍入」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupCashRounding() {
        return this._contains(FIELD_GROUP_CASH_ROUNDING);
    }

    /**
     * 重置 「现金舍入」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupCashRounding() {
        this._reset(FIELD_GROUP_CASH_ROUNDING);
        return this;
    }

    /**
     * 设置「折扣」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_DISCOUNT_PER_SO_LINE)
    public ResConfigSettingsDTO setGroupDiscountPerSoLine(Integer val) {
        this._set(FIELD_GROUP_DISCOUNT_PER_SO_LINE, val);
        return this;
    }

    /**
     * 获取「折扣」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupDiscountPerSoLine() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_DISCOUNT_PER_SO_LINE), null);
    }

    /**
     * 判断 「折扣」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupDiscountPerSoLine() {
        return this._contains(FIELD_GROUP_DISCOUNT_PER_SO_LINE);
    }

    /**
     * 重置 「折扣」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupDiscountPerSoLine() {
        this._reset(FIELD_GROUP_DISCOUNT_PER_SO_LINE);
        return this;
    }

    /**
     * 设置「在送货单上显示批次 / 序列号」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_LOT_ON_DELIVERY_SLIP)
    public ResConfigSettingsDTO setGroupLotOnDeliverySlip(Integer val) {
        this._set(FIELD_GROUP_LOT_ON_DELIVERY_SLIP, val);
        return this;
    }

    /**
     * 获取「在送货单上显示批次 / 序列号」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupLotOnDeliverySlip() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_LOT_ON_DELIVERY_SLIP), null);
    }

    /**
     * 判断 「在送货单上显示批次 / 序列号」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupLotOnDeliverySlip() {
        return this._contains(FIELD_GROUP_LOT_ON_DELIVERY_SLIP);
    }

    /**
     * 重置 「在送货单上显示批次 / 序列号」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupLotOnDeliverySlip() {
        this._reset(FIELD_GROUP_LOT_ON_DELIVERY_SLIP);
        return this;
    }

    /**
     * 设置「在结算单上显示批次 / 序列号」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_LOT_ON_INVOICE)
    public ResConfigSettingsDTO setGroupLotOnInvoice(Integer val) {
        this._set(FIELD_GROUP_LOT_ON_INVOICE, val);
        return this;
    }

    /**
     * 获取「在结算单上显示批次 / 序列号」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupLotOnInvoice() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_LOT_ON_INVOICE), null);
    }

    /**
     * 判断 「在结算单上显示批次 / 序列号」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupLotOnInvoice() {
        return this._contains(FIELD_GROUP_LOT_ON_INVOICE);
    }

    /**
     * 重置 「在结算单上显示批次 / 序列号」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupLotOnInvoice() {
        this._reset(FIELD_GROUP_LOT_ON_INVOICE);
        return this;
    }

    /**
     * 设置「邮件营销」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_MASS_MAILING_CAMPAIGN)
    public ResConfigSettingsDTO setGroupMassMailingCampaign(Integer val) {
        this._set(FIELD_GROUP_MASS_MAILING_CAMPAIGN, val);
        return this;
    }

    /**
     * 获取「邮件营销」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupMassMailingCampaign() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_MASS_MAILING_CAMPAIGN), null);
    }

    /**
     * 判断 「邮件营销」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupMassMailingCampaign() {
        return this._contains(FIELD_GROUP_MASS_MAILING_CAMPAIGN);
    }

    /**
     * 重置 「邮件营销」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupMassMailingCampaign() {
        this._reset(FIELD_GROUP_MASS_MAILING_CAMPAIGN);
        return this;
    }

    /**
     * 设置「副产品」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_MRP_BYPRODUCTS)
    public ResConfigSettingsDTO setGroupMrpByproducts(Integer val) {
        this._set(FIELD_GROUP_MRP_BYPRODUCTS, val);
        return this;
    }

    /**
     * 获取「副产品」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupMrpByproducts() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_MRP_BYPRODUCTS), null);
    }

    /**
     * 判断 「副产品」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupMrpByproducts() {
        return this._contains(FIELD_GROUP_MRP_BYPRODUCTS);
    }

    /**
     * 重置 「副产品」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupMrpByproducts() {
        this._reset(FIELD_GROUP_MRP_BYPRODUCTS);
        return this;
    }

    /**
     * 设置「制造订单分配报表」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_MRP_RECEPTION_REPORT)
    public ResConfigSettingsDTO setGroupMrpReceptionReport(Integer val) {
        this._set(FIELD_GROUP_MRP_RECEPTION_REPORT, val);
        return this;
    }

    /**
     * 获取「制造订单分配报表」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupMrpReceptionReport() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_MRP_RECEPTION_REPORT), null);
    }

    /**
     * 判断 「制造订单分配报表」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupMrpReceptionReport() {
        return this._contains(FIELD_GROUP_MRP_RECEPTION_REPORT);
    }

    /**
     * 重置 「制造订单分配报表」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupMrpReceptionReport() {
        this._reset(FIELD_GROUP_MRP_RECEPTION_REPORT);
        return this;
    }

    /**
     * 设置「物料需求计划（MRP）工单」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_MRP_ROUTINGS)
    public ResConfigSettingsDTO setGroupMrpRoutings(Integer val) {
        this._set(FIELD_GROUP_MRP_ROUTINGS, val);
        return this;
    }

    /**
     * 获取「物料需求计划（MRP）工单」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupMrpRoutings() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_MRP_ROUTINGS), null);
    }

    /**
     * 判断 「物料需求计划（MRP）工单」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupMrpRoutings() {
        return this._contains(FIELD_GROUP_MRP_ROUTINGS);
    }

    /**
     * 重置 「物料需求计划（MRP）工单」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupMrpRoutings() {
        this._reset(FIELD_GROUP_MRP_ROUTINGS);
        return this;
    }

    /**
     * 设置「工单依赖性」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_MRP_WORKORDER_DEPENDENCIES)
    public ResConfigSettingsDTO setGroupMrpWorkorderDependencies(Integer val) {
        this._set(FIELD_GROUP_MRP_WORKORDER_DEPENDENCIES, val);
        return this;
    }

    /**
     * 获取「工单依赖性」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupMrpWorkorderDependencies() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_MRP_WORKORDER_DEPENDENCIES), null);
    }

    /**
     * 判断 「工单依赖性」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupMrpWorkorderDependencies() {
        return this._contains(FIELD_GROUP_MRP_WORKORDER_DEPENDENCIES);
    }

    /**
     * 重置 「工单依赖性」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupMrpWorkorderDependencies() {
        this._reset(FIELD_GROUP_MRP_WORKORDER_DEPENDENCIES);
        return this;
    }

    /**
     * 设置「多币别」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_MULTI_CURRENCY)
    public ResConfigSettingsDTO setGroupMultiCurrency(Integer val) {
        this._set(FIELD_GROUP_MULTI_CURRENCY, val);
        return this;
    }

    /**
     * 获取「多币别」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupMultiCurrency() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_MULTI_CURRENCY), null);
    }

    /**
     * 判断 「多币别」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupMultiCurrency() {
        return this._contains(FIELD_GROUP_MULTI_CURRENCY);
    }

    /**
     * 重置 「多币别」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupMultiCurrency() {
        this._reset(FIELD_GROUP_MULTI_CURRENCY);
        return this;
    }

    /**
     * 设置「价格表」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_PRODUCT_PRICELIST)
    public ResConfigSettingsDTO setGroupProductPricelist(Integer val) {
        this._set(FIELD_GROUP_PRODUCT_PRICELIST, val);
        return this;
    }

    /**
     * 获取「价格表」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupProductPricelist() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_PRODUCT_PRICELIST), null);
    }

    /**
     * 判断 「价格表」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupProductPricelist() {
        return this._contains(FIELD_GROUP_PRODUCT_PRICELIST);
    }

    /**
     * 重置 「价格表」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupProductPricelist() {
        this._reset(FIELD_GROUP_PRODUCT_PRICELIST);
        return this;
    }

    /**
     * 设置「变体」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_PRODUCT_VARIANT)
    public ResConfigSettingsDTO setGroupProductVariant(Integer val) {
        this._set(FIELD_GROUP_PRODUCT_VARIANT, val);
        return this;
    }

    /**
     * 获取「变体」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupProductVariant() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_PRODUCT_VARIANT), null);
    }

    /**
     * 判断 「变体」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupProductVariant() {
        return this._contains(FIELD_GROUP_PRODUCT_VARIANT);
    }

    /**
     * 重置 「变体」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupProductVariant() {
        this._reset(FIELD_GROUP_PRODUCT_VARIANT);
        return this;
    }

    /**
     * 设置「形式发票」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_PROFORMA_SALES)
    public ResConfigSettingsDTO setGroupProformaSales(Integer val) {
        this._set(FIELD_GROUP_PROFORMA_SALES, val);
        return this;
    }

    /**
     * 获取「形式发票」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupProformaSales() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_PROFORMA_SALES), null);
    }

    /**
     * 判断 「形式发票」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupProformaSales() {
        return this._contains(FIELD_GROUP_PROFORMA_SALES);
    }

    /**
     * 重置 「形式发票」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupProformaSales() {
        this._reset(FIELD_GROUP_PROFORMA_SALES);
        return this;
    }

    /**
     * 设置「里程碑」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_PROJECT_MILESTONE)
    public ResConfigSettingsDTO setGroupProjectMilestone(Integer val) {
        this._set(FIELD_GROUP_PROJECT_MILESTONE, val);
        return this;
    }

    /**
     * 获取「里程碑」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupProjectMilestone() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_PROJECT_MILESTONE), null);
    }

    /**
     * 判断 「里程碑」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupProjectMilestone() {
        return this._contains(FIELD_GROUP_PROJECT_MILESTONE);
    }

    /**
     * 重置 「里程碑」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupProjectMilestone() {
        this._reset(FIELD_GROUP_PROJECT_MILESTONE);
        return this;
    }

    /**
     * 设置「客户点评」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_PROJECT_RATING)
    public ResConfigSettingsDTO setGroupProjectRating(Integer val) {
        this._set(FIELD_GROUP_PROJECT_RATING, val);
        return this;
    }

    /**
     * 获取「客户点评」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupProjectRating() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_PROJECT_RATING), null);
    }

    /**
     * 判断 「客户点评」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupProjectRating() {
        return this._contains(FIELD_GROUP_PROJECT_RATING);
    }

    /**
     * 重置 「客户点评」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupProjectRating() {
        this._reset(FIELD_GROUP_PROJECT_RATING);
        return this;
    }

    /**
     * 设置「周期任务」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_PROJECT_RECURRING_TASKS)
    public ResConfigSettingsDTO setGroupProjectRecurringTasks(Integer val) {
        this._set(FIELD_GROUP_PROJECT_RECURRING_TASKS, val);
        return this;
    }

    /**
     * 获取「周期任务」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupProjectRecurringTasks() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_PROJECT_RECURRING_TASKS), null);
    }

    /**
     * 判断 「周期任务」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupProjectRecurringTasks() {
        return this._contains(FIELD_GROUP_PROJECT_RECURRING_TASKS);
    }

    /**
     * 重置 「周期任务」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupProjectRecurringTasks() {
        this._reset(FIELD_GROUP_PROJECT_RECURRING_TASKS);
        return this;
    }

    /**
     * 设置「项目阶段」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_PROJECT_STAGES)
    public ResConfigSettingsDTO setGroupProjectStages(Integer val) {
        this._set(FIELD_GROUP_PROJECT_STAGES, val);
        return this;
    }

    /**
     * 获取「项目阶段」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupProjectStages() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_PROJECT_STAGES), null);
    }

    /**
     * 判断 「项目阶段」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupProjectStages() {
        return this._contains(FIELD_GROUP_PROJECT_STAGES);
    }

    /**
     * 重置 「项目阶段」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupProjectStages() {
        this._reset(FIELD_GROUP_PROJECT_STAGES);
        return this;
    }

    /**
     * 设置「任务依赖」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_PROJECT_TASK_DEPENDENCIES)
    public ResConfigSettingsDTO setGroupProjectTaskDependencies(Integer val) {
        this._set(FIELD_GROUP_PROJECT_TASK_DEPENDENCIES, val);
        return this;
    }

    /**
     * 获取「任务依赖」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupProjectTaskDependencies() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_PROJECT_TASK_DEPENDENCIES), null);
    }

    /**
     * 判断 「任务依赖」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupProjectTaskDependencies() {
        return this._contains(FIELD_GROUP_PROJECT_TASK_DEPENDENCIES);
    }

    /**
     * 重置 「任务依赖」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupProjectTaskDependencies() {
        this._reset(FIELD_GROUP_PROJECT_TASK_DEPENDENCIES);
        return this;
    }

    /**
     * 设置「客户地址」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_SALE_DELIVERY_ADDRESS)
    public ResConfigSettingsDTO setGroupSaleDeliveryAddress(Integer val) {
        this._set(FIELD_GROUP_SALE_DELIVERY_ADDRESS, val);
        return this;
    }

    /**
     * 获取「客户地址」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupSaleDeliveryAddress() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_SALE_DELIVERY_ADDRESS), null);
    }

    /**
     * 判断 「客户地址」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupSaleDeliveryAddress() {
        return this._contains(FIELD_GROUP_SALE_DELIVERY_ADDRESS);
    }

    /**
     * 重置 「客户地址」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupSaleDeliveryAddress() {
        this._reset(FIELD_GROUP_SALE_DELIVERY_ADDRESS);
        return this;
    }

    /**
     * 设置「报价模板」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_SALE_ORDER_TEMPLATE)
    public ResConfigSettingsDTO setGroupSaleOrderTemplate(Integer val) {
        this._set(FIELD_GROUP_SALE_ORDER_TEMPLATE, val);
        return this;
    }

    /**
     * 获取「报价模板」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupSaleOrderTemplate() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_SALE_ORDER_TEMPLATE), null);
    }

    /**
     * 判断 「报价模板」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupSaleOrderTemplate() {
        return this._contains(FIELD_GROUP_SALE_ORDER_TEMPLATE);
    }

    /**
     * 重置 「报价模板」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupSaleOrderTemplate() {
        this._reset(FIELD_GROUP_SALE_ORDER_TEMPLATE);
        return this;
    }

    /**
     * 设置「收货提醒」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_SEND_REMINDER)
    public ResConfigSettingsDTO setGroupSendReminder(Integer val) {
        this._set(FIELD_GROUP_SEND_REMINDER, val);
        return this;
    }

    /**
     * 获取「收货提醒」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupSendReminder() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_SEND_REMINDER), null);
    }

    /**
     * 判断 「收货提醒」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupSendReminder() {
        return this._contains(FIELD_GROUP_SEND_REMINDER);
    }

    /**
     * 重置 「收货提醒」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupSendReminder() {
        this._reset(FIELD_GROUP_SEND_REMINDER);
        return this;
    }

    /**
     * 设置「采购收据」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_SHOW_PURCHASE_RECEIPTS)
    public ResConfigSettingsDTO setGroupShowPurchaseReceipts(Integer val) {
        this._set(FIELD_GROUP_SHOW_PURCHASE_RECEIPTS, val);
        return this;
    }

    /**
     * 获取「采购收据」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupShowPurchaseReceipts() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_SHOW_PURCHASE_RECEIPTS), null);
    }

    /**
     * 判断 「采购收据」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupShowPurchaseReceipts() {
        return this._contains(FIELD_GROUP_SHOW_PURCHASE_RECEIPTS);
    }

    /**
     * 重置 「采购收据」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupShowPurchaseReceipts() {
        this._reset(FIELD_GROUP_SHOW_PURCHASE_RECEIPTS);
        return this;
    }

    /**
     * 设置「销售收据」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_SHOW_SALE_RECEIPTS)
    public ResConfigSettingsDTO setGroupShowSaleReceipts(Integer val) {
        this._set(FIELD_GROUP_SHOW_SALE_RECEIPTS, val);
        return this;
    }

    /**
     * 获取「销售收据」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupShowSaleReceipts() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_SHOW_SALE_RECEIPTS), null);
    }

    /**
     * 判断 「销售收据」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupShowSaleReceipts() {
        return this._contains(FIELD_GROUP_SHOW_SALE_RECEIPTS);
    }

    /**
     * 重置 「销售收据」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupShowSaleReceipts() {
        this._reset(FIELD_GROUP_SHOW_SALE_RECEIPTS);
        return this;
    }

    /**
     * 设置「自动库存会计」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_STOCK_ACCOUNTING_AUTOMATIC)
    public ResConfigSettingsDTO setGroupStockAccountingAutomatic(Integer val) {
        this._set(FIELD_GROUP_STOCK_ACCOUNTING_AUTOMATIC, val);
        return this;
    }

    /**
     * 获取「自动库存会计」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupStockAccountingAutomatic() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_STOCK_ACCOUNTING_AUTOMATIC), null);
    }

    /**
     * 判断 「自动库存会计」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupStockAccountingAutomatic() {
        return this._contains(FIELD_GROUP_STOCK_ACCOUNTING_AUTOMATIC);
    }

    /**
     * 重置 「自动库存会计」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupStockAccountingAutomatic() {
        this._reset(FIELD_GROUP_STOCK_ACCOUNTING_AUTOMATIC);
        return this;
    }

    /**
     * 设置「多步路线」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_STOCK_ADV_LOCATION)
    public ResConfigSettingsDTO setGroupStockAdvLocation(Integer val) {
        this._set(FIELD_GROUP_STOCK_ADV_LOCATION, val);
        return this;
    }

    /**
     * 获取「多步路线」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupStockAdvLocation() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_STOCK_ADV_LOCATION), null);
    }

    /**
     * 判断 「多步路线」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupStockAdvLocation() {
        return this._contains(FIELD_GROUP_STOCK_ADV_LOCATION);
    }

    /**
     * 重置 「多步路线」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupStockAdvLocation() {
        this._reset(FIELD_GROUP_STOCK_ADV_LOCATION);
        return this;
    }

    /**
     * 设置「使用GS1编码格式打印批号和序列号」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_STOCK_LOT_PRINT_GS1)
    public ResConfigSettingsDTO setGroupStockLotPrintGs1(Integer val) {
        this._set(FIELD_GROUP_STOCK_LOT_PRINT_GS1, val);
        return this;
    }

    /**
     * 获取「使用GS1编码格式打印批号和序列号」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupStockLotPrintGs1() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_STOCK_LOT_PRINT_GS1), null);
    }

    /**
     * 判断 「使用GS1编码格式打印批号和序列号」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupStockLotPrintGs1() {
        return this._contains(FIELD_GROUP_STOCK_LOT_PRINT_GS1);
    }

    /**
     * 重置 「使用GS1编码格式打印批号和序列号」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupStockLotPrintGs1() {
        this._reset(FIELD_GROUP_STOCK_LOT_PRINT_GS1);
        return this;
    }

    /**
     * 设置「储存位置」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_STOCK_MULTI_LOCATIONS)
    public ResConfigSettingsDTO setGroupStockMultiLocations(Integer val) {
        this._set(FIELD_GROUP_STOCK_MULTI_LOCATIONS, val);
        return this;
    }

    /**
     * 获取「储存位置」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupStockMultiLocations() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_STOCK_MULTI_LOCATIONS), null);
    }

    /**
     * 判断 「储存位置」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupStockMultiLocations() {
        return this._contains(FIELD_GROUP_STOCK_MULTI_LOCATIONS);
    }

    /**
     * 重置 「储存位置」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupStockMultiLocations() {
        this._reset(FIELD_GROUP_STOCK_MULTI_LOCATIONS);
        return this;
    }

    /**
     * 设置「产品包装」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_STOCK_PACKAGING)
    public ResConfigSettingsDTO setGroupStockPackaging(Integer val) {
        this._set(FIELD_GROUP_STOCK_PACKAGING, val);
        return this;
    }

    /**
     * 获取「产品包装」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupStockPackaging() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_STOCK_PACKAGING), null);
    }

    /**
     * 判断 「产品包装」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupStockPackaging() {
        return this._contains(FIELD_GROUP_STOCK_PACKAGING);
    }

    /**
     * 重置 「产品包装」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupStockPackaging() {
        this._reset(FIELD_GROUP_STOCK_PACKAGING);
        return this;
    }

    /**
     * 设置「批次 / 序列号」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_STOCK_PRODUCTION_LOT)
    public ResConfigSettingsDTO setGroupStockProductionLot(Integer val) {
        this._set(FIELD_GROUP_STOCK_PRODUCTION_LOT, val);
        return this;
    }

    /**
     * 获取「批次 / 序列号」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupStockProductionLot() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_STOCK_PRODUCTION_LOT), null);
    }

    /**
     * 判断 「批次 / 序列号」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupStockProductionLot() {
        return this._contains(FIELD_GROUP_STOCK_PRODUCTION_LOT);
    }

    /**
     * 重置 「批次 / 序列号」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupStockProductionLot() {
        this._reset(FIELD_GROUP_STOCK_PRODUCTION_LOT);
        return this;
    }

    /**
     * 设置「库存接收报表」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_STOCK_RECEPTION_REPORT)
    public ResConfigSettingsDTO setGroupStockReceptionReport(Integer val) {
        this._set(FIELD_GROUP_STOCK_RECEPTION_REPORT, val);
        return this;
    }

    /**
     * 获取「库存接收报表」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupStockReceptionReport() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_STOCK_RECEPTION_REPORT), null);
    }

    /**
     * 判断 「库存接收报表」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupStockReceptionReport() {
        return this._contains(FIELD_GROUP_STOCK_RECEPTION_REPORT);
    }

    /**
     * 重置 「库存接收报表」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupStockReceptionReport() {
        this._reset(FIELD_GROUP_STOCK_RECEPTION_REPORT);
        return this;
    }

    /**
     * 设置「签名」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_STOCK_SIGN_DELIVERY)
    public ResConfigSettingsDTO setGroupStockSignDelivery(Integer val) {
        this._set(FIELD_GROUP_STOCK_SIGN_DELIVERY, val);
        return this;
    }

    /**
     * 获取「签名」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupStockSignDelivery() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_STOCK_SIGN_DELIVERY), null);
    }

    /**
     * 判断 「签名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupStockSignDelivery() {
        return this._contains(FIELD_GROUP_STOCK_SIGN_DELIVERY);
    }

    /**
     * 重置 「签名」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupStockSignDelivery() {
        this._reset(FIELD_GROUP_STOCK_SIGN_DELIVERY);
        return this;
    }

    /**
     * 设置「包裹」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_STOCK_TRACKING_LOT)
    public ResConfigSettingsDTO setGroupStockTrackingLot(Integer val) {
        this._set(FIELD_GROUP_STOCK_TRACKING_LOT, val);
        return this;
    }

    /**
     * 获取「包裹」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupStockTrackingLot() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_STOCK_TRACKING_LOT), null);
    }

    /**
     * 判断 「包裹」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupStockTrackingLot() {
        return this._contains(FIELD_GROUP_STOCK_TRACKING_LOT);
    }

    /**
     * 重置 「包裹」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupStockTrackingLot() {
        this._reset(FIELD_GROUP_STOCK_TRACKING_LOT);
        return this;
    }

    /**
     * 设置「寄售」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_STOCK_TRACKING_OWNER)
    public ResConfigSettingsDTO setGroupStockTrackingOwner(Integer val) {
        this._set(FIELD_GROUP_STOCK_TRACKING_OWNER, val);
        return this;
    }

    /**
     * 获取「寄售」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupStockTrackingOwner() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_STOCK_TRACKING_OWNER), null);
    }

    /**
     * 判断 「寄售」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupStockTrackingOwner() {
        return this._contains(FIELD_GROUP_STOCK_TRACKING_OWNER);
    }

    /**
     * 重置 「寄售」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupStockTrackingOwner() {
        this._reset(FIELD_GROUP_STOCK_TRACKING_OWNER);
        return this;
    }

    /**
     * 设置「解锁制造订单」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_UNLOCKED_BY_DEFAULT)
    public ResConfigSettingsDTO setGroupUnlockedByDefault(Integer val) {
        this._set(FIELD_GROUP_UNLOCKED_BY_DEFAULT, val);
        return this;
    }

    /**
     * 获取「解锁制造订单」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupUnlockedByDefault() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_UNLOCKED_BY_DEFAULT), null);
    }

    /**
     * 判断 「解锁制造订单」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupUnlockedByDefault() {
        return this._contains(FIELD_GROUP_UNLOCKED_BY_DEFAULT);
    }

    /**
     * 重置 「解锁制造订单」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupUnlockedByDefault() {
        this._reset(FIELD_GROUP_UNLOCKED_BY_DEFAULT);
        return this;
    }

    /**
     * 设置「计量单位」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_UOM)
    public ResConfigSettingsDTO setGroupUom(Integer val) {
        this._set(FIELD_GROUP_UOM, val);
        return this;
    }

    /**
     * 获取「计量单位」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupUom() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_UOM), null);
    }

    /**
     * 判断 「计量单位」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupUom() {
        return this._contains(FIELD_GROUP_UOM);
    }

    /**
     * 重置 「计量单位」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupUom() {
        this._reset(FIELD_GROUP_UOM);
        return this;
    }

    /**
     * 设置「线索」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_USE_LEAD)
    public ResConfigSettingsDTO setGroupUseLead(Integer val) {
        this._set(FIELD_GROUP_USE_LEAD, val);
        return this;
    }

    /**
     * 获取「线索」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupUseLead() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_USE_LEAD), null);
    }

    /**
     * 判断 「线索」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupUseLead() {
        return this._contains(FIELD_GROUP_USE_LEAD);
    }

    /**
     * 重置 「线索」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupUseLead() {
        this._reset(FIELD_GROUP_USE_LEAD);
        return this;
    }

    /**
     * 设置「经常性收入」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_USE_RECURRING_REVENUES)
    public ResConfigSettingsDTO setGroupUseRecurringRevenues(Integer val) {
        this._set(FIELD_GROUP_USE_RECURRING_REVENUES, val);
        return this;
    }

    /**
     * 获取「经常性收入」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupUseRecurringRevenues() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_USE_RECURRING_REVENUES), null);
    }

    /**
     * 判断 「经常性收入」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupUseRecurringRevenues() {
        return this._contains(FIELD_GROUP_USE_RECURRING_REVENUES);
    }

    /**
     * 重置 「经常性收入」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupUseRecurringRevenues() {
        this._reset(FIELD_GROUP_USE_RECURRING_REVENUES);
        return this;
    }

    /**
     * 设置「发票中的警告」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_WARNING_ACCOUNT)
    public ResConfigSettingsDTO setGroupWarningAccount(Integer val) {
        this._set(FIELD_GROUP_WARNING_ACCOUNT, val);
        return this;
    }

    /**
     * 获取「发票中的警告」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupWarningAccount() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_WARNING_ACCOUNT), null);
    }

    /**
     * 判断 「发票中的警告」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupWarningAccount() {
        return this._contains(FIELD_GROUP_WARNING_ACCOUNT);
    }

    /**
     * 重置 「发票中的警告」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupWarningAccount() {
        this._reset(FIELD_GROUP_WARNING_ACCOUNT);
        return this;
    }

    /**
     * 设置「采购警告」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_WARNING_PURCHASE)
    public ResConfigSettingsDTO setGroupWarningPurchase(Integer val) {
        this._set(FIELD_GROUP_WARNING_PURCHASE, val);
        return this;
    }

    /**
     * 获取「采购警告」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupWarningPurchase() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_WARNING_PURCHASE), null);
    }

    /**
     * 判断 「采购警告」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupWarningPurchase() {
        return this._contains(FIELD_GROUP_WARNING_PURCHASE);
    }

    /**
     * 重置 「采购警告」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupWarningPurchase() {
        this._reset(FIELD_GROUP_WARNING_PURCHASE);
        return this;
    }

    /**
     * 设置「销售订单警告信息」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_WARNING_SALE)
    public ResConfigSettingsDTO setGroupWarningSale(Integer val) {
        this._set(FIELD_GROUP_WARNING_SALE, val);
        return this;
    }

    /**
     * 获取「销售订单警告信息」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupWarningSale() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_WARNING_SALE), null);
    }

    /**
     * 判断 「销售订单警告信息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupWarningSale() {
        return this._contains(FIELD_GROUP_WARNING_SALE);
    }

    /**
     * 重置 「销售订单警告信息」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupWarningSale() {
        this._reset(FIELD_GROUP_WARNING_SALE);
        return this;
    }

    /**
     * 设置「库存警报」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_GROUP_WARNING_STOCK)
    public ResConfigSettingsDTO setGroupWarningStock(Integer val) {
        this._set(FIELD_GROUP_WARNING_STOCK, val);
        return this;
    }

    /**
     * 获取「库存警报」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getGroupWarningStock() {
        return DataTypeUtils.asInteger(this._get(FIELD_GROUP_WARNING_STOCK), null);
    }

    /**
     * 判断 「库存警报」是否有值
     *
     */
    @JsonIgnore
    public boolean containsGroupWarningStock() {
        return this._contains(FIELD_GROUP_WARNING_STOCK);
    }

    /**
     * 重置 「库存警报」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetGroupWarningStock() {
        this._reset(FIELD_GROUP_WARNING_STOCK);
        return this;
    }

    /**
     * 设置「Has Accounting Entries」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_HAS_ACCOUNTING_ENTRIES)
    public ResConfigSettingsDTO setHasAccountingEntries(Integer val) {
        this._set(FIELD_HAS_ACCOUNTING_ENTRIES, val);
        return this;
    }

    /**
     * 获取「Has Accounting Entries」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getHasAccountingEntries() {
        return DataTypeUtils.asInteger(this._get(FIELD_HAS_ACCOUNTING_ENTRIES), null);
    }

    /**
     * 判断 「Has Accounting Entries」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHasAccountingEntries() {
        return this._contains(FIELD_HAS_ACCOUNTING_ENTRIES);
    }

    /**
     * 重置 「Has Accounting Entries」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetHasAccountingEntries() {
        this._reset(FIELD_HAS_ACCOUNTING_ENTRIES);
        return this;
    }

    /**
     * 设置「Company has a chart of accounts」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_HAS_CHART_OF_ACCOUNTS)
    public ResConfigSettingsDTO setHasChartOfAccounts(Integer val) {
        this._set(FIELD_HAS_CHART_OF_ACCOUNTS, val);
        return this;
    }

    /**
     * 获取「Company has a chart of accounts」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getHasChartOfAccounts() {
        return DataTypeUtils.asInteger(this._get(FIELD_HAS_CHART_OF_ACCOUNTS), null);
    }

    /**
     * 判断 「Company has a chart of accounts」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHasChartOfAccounts() {
        return this._contains(FIELD_HAS_CHART_OF_ACCOUNTS);
    }

    /**
     * 重置 「Company has a chart of accounts」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetHasChartOfAccounts() {
        this._reset(FIELD_HAS_CHART_OF_ACCOUNTS);
        return this;
    }

    /**
     * 设置「员工编辑」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_HR_EMPLOYEE_SELF_EDIT)
    public ResConfigSettingsDTO setHrEmployeeSelfEdit(Integer val) {
        this._set(FIELD_HR_EMPLOYEE_SELF_EDIT, val);
        return this;
    }

    /**
     * 获取「员工编辑」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getHrEmployeeSelfEdit() {
        return DataTypeUtils.asInteger(this._get(FIELD_HR_EMPLOYEE_SELF_EDIT), null);
    }

    /**
     * 判断 「员工编辑」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHrEmployeeSelfEdit() {
        return this._contains(FIELD_HR_EMPLOYEE_SELF_EDIT);
    }

    /**
     * 重置 「员工编辑」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetHrEmployeeSelfEdit() {
        this._reset(FIELD_HR_EMPLOYEE_SELF_EDIT);
        return this;
    }

    /**
     * 设置「默认的费用别名」
     * @param val
     */
    @JsonProperty(FIELD_HR_EXPENSE_ALIAS_PREFIX)
    public ResConfigSettingsDTO setHrExpenseAliasPrefix(String val) {
        this._set(FIELD_HR_EXPENSE_ALIAS_PREFIX, val);
        return this;
    }

    /**
     * 获取「默认的费用别名」值
     *
     */
    @JsonIgnore
    public String getHrExpenseAliasPrefix() {
        return DataTypeUtils.asString(this._get(FIELD_HR_EXPENSE_ALIAS_PREFIX), null);
    }

    /**
     * 判断 「默认的费用别名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHrExpenseAliasPrefix() {
        return this._contains(FIELD_HR_EXPENSE_ALIAS_PREFIX);
    }

    /**
     * 重置 「默认的费用别名」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetHrExpenseAliasPrefix() {
        this._reset(FIELD_HR_EXPENSE_ALIAS_PREFIX);
        return this;
    }

    /**
     * 设置「允许员工通过电子邮件记录费用」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_HR_EXPENSE_USE_MAILGATEWAY)
    public ResConfigSettingsDTO setHrExpenseUseMailgateway(Integer val) {
        this._set(FIELD_HR_EXPENSE_USE_MAILGATEWAY, val);
        return this;
    }

    /**
     * 获取「允许员工通过电子邮件记录费用」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getHrExpenseUseMailgateway() {
        return DataTypeUtils.asInteger(this._get(FIELD_HR_EXPENSE_USE_MAILGATEWAY), null);
    }

    /**
     * 判断 「允许员工通过电子邮件记录费用」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHrExpenseUseMailgateway() {
        return this._contains(FIELD_HR_EXPENSE_USE_MAILGATEWAY);
    }

    /**
     * 重置 「允许员工通过电子邮件记录费用」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetHrExpenseUseMailgateway() {
        this._reset(FIELD_HR_EXPENSE_USE_MAILGATEWAY);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public ResConfigSettingsDTO setId(String val) {
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
    public ResConfigSettingsDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「发票电子邮件模板」
     * @param val
     */
    @JsonProperty(FIELD_INVOICE_MAIL_TEMPLATE_ID)
    public ResConfigSettingsDTO setInvoiceMailTemplateId(String val) {
        this._set(FIELD_INVOICE_MAIL_TEMPLATE_ID, val);
        return this;
    }

    /**
     * 获取「发票电子邮件模板」值
     *
     */
    @JsonIgnore
    public String getInvoiceMailTemplateId() {
        return DataTypeUtils.asString(this._get(FIELD_INVOICE_MAIL_TEMPLATE_ID), null);
    }

    /**
     * 判断 「发票电子邮件模板」是否有值
     *
     */
    @JsonIgnore
    public boolean containsInvoiceMailTemplateId() {
        return this._contains(FIELD_INVOICE_MAIL_TEMPLATE_ID);
    }

    /**
     * 重置 「发票电子邮件模板」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetInvoiceMailTemplateId() {
        this._reset(FIELD_INVOICE_MAIL_TEMPLATE_ID);
        return this;
    }

    /**
     * 设置「PEPPOL 符合条件」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_ACCOUNT_PEPPOL_ELIGIBLE)
    public ResConfigSettingsDTO setIsAccountPeppolEligible(Integer val) {
        this._set(FIELD_IS_ACCOUNT_PEPPOL_ELIGIBLE, val);
        return this;
    }

    /**
     * 获取「PEPPOL 符合条件」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsAccountPeppolEligible() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_ACCOUNT_PEPPOL_ELIGIBLE), null);
    }

    /**
     * 判断 「PEPPOL 符合条件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsAccountPeppolEligible() {
        return this._contains(FIELD_IS_ACCOUNT_PEPPOL_ELIGIBLE);
    }

    /**
     * 重置 「PEPPOL 符合条件」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetIsAccountPeppolEligible() {
        this._reset(FIELD_IS_ACCOUNT_PEPPOL_ELIGIBLE);
        return this;
    }

    /**
     * 设置「销售模块是否已安装」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_INSTALLED_SALE)
    public ResConfigSettingsDTO setIsInstalledSale(Integer val) {
        this._set(FIELD_IS_INSTALLED_SALE, val);
        return this;
    }

    /**
     * 获取「销售模块是否已安装」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsInstalledSale() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_INSTALLED_SALE), null);
    }

    /**
     * 判断 「销售模块是否已安装」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsInstalledSale() {
        return this._contains(FIELD_IS_INSTALLED_SALE);
    }

    /**
     * 重置 「销售模块是否已安装」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetIsInstalledSale() {
        this._reset(FIELD_IS_INSTALLED_SALE);
        return this;
    }

    /**
     * 设置「多团队」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_MEMBERSHIP_MULTI)
    public ResConfigSettingsDTO setIsMembershipMulti(Integer val) {
        this._set(FIELD_IS_MEMBERSHIP_MULTI, val);
        return this;
    }

    /**
     * 获取「多团队」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsMembershipMulti() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_MEMBERSHIP_MULTI), null);
    }

    /**
     * 判断 「多团队」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsMembershipMulti() {
        return this._contains(FIELD_IS_MEMBERSHIP_MULTI);
    }

    /**
     * 重置 「多团队」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetIsMembershipMulti() {
        this._reset(FIELD_IS_MEMBERSHIP_MULTI);
        return this;
    }

    /**
     * 设置「是母公司」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_IS_ROOT_COMPANY)
    public ResConfigSettingsDTO setIsRootCompany(Integer val) {
        this._set(FIELD_IS_ROOT_COMPANY, val);
        return this;
    }

    /**
     * 获取「是母公司」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getIsRootCompany() {
        return DataTypeUtils.asInteger(this._get(FIELD_IS_ROOT_COMPANY), null);
    }

    /**
     * 判断 「是母公司」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIsRootCompany() {
        return this._contains(FIELD_IS_ROOT_COMPANY);
    }

    /**
     * 重置 「是母公司」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetIsRootCompany() {
        this._reset(FIELD_IS_ROOT_COMPANY);
        return this;
    }

    /**
     * 设置「语言数量」
     * @param val
     */
    @JsonProperty(FIELD_LANGUAGE_COUNT)
    public ResConfigSettingsDTO setLanguageCount(Integer val) {
        this._set(FIELD_LANGUAGE_COUNT, val);
        return this;
    }

    /**
     * 获取「语言数量」值
     *
     */
    @JsonIgnore
    public Integer getLanguageCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_LANGUAGE_COUNT), null);
    }

    /**
     * 判断 「语言数量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLanguageCount() {
        return this._contains(FIELD_LANGUAGE_COUNT);
    }

    /**
     * 重置 「语言数量」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetLanguageCount() {
        this._reset(FIELD_LANGUAGE_COUNT);
        return this;
    }

    /**
     * 设置「自动丰富线索」
     * 代码表[自动丰富线索]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_config_settings_lead_enrich_auto
     * @param val
     */
    @JsonProperty(FIELD_LEAD_ENRICH_AUTO)
    public ResConfigSettingsDTO setLeadEnrichAuto(String val) {
        this._set(FIELD_LEAD_ENRICH_AUTO, val);
        return this;
    }

    /**
     * 获取「自动丰富线索」值
     * 代码表[自动丰富线索]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_config_settings_lead_enrich_auto
     *
     */
    @JsonIgnore
    public String getLeadEnrichAuto() {
        return DataTypeUtils.asString(this._get(FIELD_LEAD_ENRICH_AUTO), null);
    }

    /**
     * 判断 「自动丰富线索」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLeadEnrichAuto() {
        return this._contains(FIELD_LEAD_ENRICH_AUTO);
    }

    /**
     * 重置 「自动丰富线索」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetLeadEnrichAuto() {
        this._reset(FIELD_LEAD_ENRICH_AUTO);
        return this;
    }

    /**
     * 设置「直接从商机商机创建线索挖掘申请。」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_LEAD_MINING_IN_PIPELINE)
    public ResConfigSettingsDTO setLeadMiningInPipeline(Integer val) {
        this._set(FIELD_LEAD_MINING_IN_PIPELINE, val);
        return this;
    }

    /**
     * 获取「直接从商机商机创建线索挖掘申请。」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getLeadMiningInPipeline() {
        return DataTypeUtils.asInteger(this._get(FIELD_LEAD_MINING_IN_PIPELINE), null);
    }

    /**
     * 判断 「直接从商机商机创建线索挖掘申请。」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLeadMiningInPipeline() {
        return this._contains(FIELD_LEAD_MINING_IN_PIPELINE);
    }

    /**
     * 重置 「直接从商机商机创建线索挖掘申请。」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetLeadMiningInPipeline() {
        this._reset(FIELD_LEAD_MINING_IN_PIPELINE);
        return this;
    }

    /**
     * 设置「锁定已确认的订单」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_LOCK_CONFIRMED_PO)
    public ResConfigSettingsDTO setLockConfirmedPo(Integer val) {
        this._set(FIELD_LOCK_CONFIRMED_PO, val);
        return this;
    }

    /**
     * 获取「锁定已确认的订单」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getLockConfirmedPo() {
        return DataTypeUtils.asInteger(this._get(FIELD_LOCK_CONFIRMED_PO), null);
    }

    /**
     * 判断 「锁定已确认的订单」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLockConfirmedPo() {
        return this._contains(FIELD_LOCK_CONFIRMED_PO);
    }

    /**
     * 重置 「锁定已确认的订单」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetLockConfirmedPo() {
        this._reset(FIELD_LOCK_CONFIRMED_PO);
        return this;
    }

    /**
     * 设置「专门服务器」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MASS_MAILING_OUTGOING_MAIL_SERVER)
    public ResConfigSettingsDTO setMassMailingOutgoingMailServer(Integer val) {
        this._set(FIELD_MASS_MAILING_OUTGOING_MAIL_SERVER, val);
        return this;
    }

    /**
     * 获取「专门服务器」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getMassMailingOutgoingMailServer() {
        return DataTypeUtils.asInteger(this._get(FIELD_MASS_MAILING_OUTGOING_MAIL_SERVER), null);
    }

    /**
     * 判断 「专门服务器」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMassMailingOutgoingMailServer() {
        return this._contains(FIELD_MASS_MAILING_OUTGOING_MAIL_SERVER);
    }

    /**
     * 重置 「专门服务器」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetMassMailingOutgoingMailServer() {
        this._reset(FIELD_MASS_MAILING_OUTGOING_MAIL_SERVER);
        return this;
    }

    /**
     * 设置「24小时统计邮寄报告」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MASS_MAILING_REPORTS)
    public ResConfigSettingsDTO setMassMailingReports(Integer val) {
        this._set(FIELD_MASS_MAILING_REPORTS, val);
        return this;
    }

    /**
     * 获取「24小时统计邮寄报告」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getMassMailingReports() {
        return DataTypeUtils.asInteger(this._get(FIELD_MASS_MAILING_REPORTS), null);
    }

    /**
     * 判断 「24小时统计邮寄报告」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMassMailingReports() {
        return this._contains(FIELD_MASS_MAILING_REPORTS);
    }

    /**
     * 重置 「24小时统计邮寄报告」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetMassMailingReports() {
        this._reset(FIELD_MASS_MAILING_REPORTS);
        return this;
    }

    /**
     * 设置「拆分名字和姓氏」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MASS_MAILING_SPLIT_CONTACT_NAME)
    public ResConfigSettingsDTO setMassMailingSplitContactName(Integer val) {
        this._set(FIELD_MASS_MAILING_SPLIT_CONTACT_NAME, val);
        return this;
    }

    /**
     * 获取「拆分名字和姓氏」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getMassMailingSplitContactName() {
        return DataTypeUtils.asInteger(this._get(FIELD_MASS_MAILING_SPLIT_CONTACT_NAME), null);
    }

    /**
     * 判断 「拆分名字和姓氏」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMassMailingSplitContactName() {
        return this._contains(FIELD_MASS_MAILING_SPLIT_CONTACT_NAME);
    }

    /**
     * 重置 「拆分名字和姓氏」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetMassMailingSplitContactName() {
        this._reset(FIELD_MASS_MAILING_SPLIT_CONTACT_NAME);
        return this;
    }

    /**
     * 设置「3单匹配:采购订单，收货单与发票」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_ACCOUNT3WAY_MATCH)
    public ResConfigSettingsDTO setModuleAccount3wayMatch(Integer val) {
        this._set(FIELD_MODULE_ACCOUNT3WAY_MATCH, val);
        return this;
    }

    /**
     * 获取「3单匹配:采购订单，收货单与发票」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleAccount3wayMatch() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_ACCOUNT3WAY_MATCH), null);
    }

    /**
     * 判断 「3单匹配:采购订单，收货单与发票」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleAccount3wayMatch() {
        return this._contains(FIELD_MODULE_ACCOUNT3WAY_MATCH);
    }

    /**
     * 重置 「3单匹配:采购订单，收货单与发票」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleAccount3wayMatch() {
        this._reset(FIELD_MODULE_ACCOUNT3WAY_MATCH);
        return this;
    }

    /**
     * 设置「会计」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_ACCOUNT_ACCOUNTANT)
    public ResConfigSettingsDTO setModuleAccountAccountant(Integer val) {
        this._set(FIELD_MODULE_ACCOUNT_ACCOUNTANT, val);
        return this;
    }

    /**
     * 获取「会计」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleAccountAccountant() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_ACCOUNT_ACCOUNTANT), null);
    }

    /**
     * 判断 「会计」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleAccountAccountant() {
        return this._contains(FIELD_MODULE_ACCOUNT_ACCOUNTANT);
    }

    /**
     * 重置 「会计」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleAccountAccountant() {
        this._reset(FIELD_MODULE_ACCOUNT_ACCOUNTANT);
        return this;
    }

    /**
     * 设置「Bank Statement Digitization」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_ACCOUNT_BANK_STATEMENT_EXTRACT)
    public ResConfigSettingsDTO setModuleAccountBankStatementExtract(Integer val) {
        this._set(FIELD_MODULE_ACCOUNT_BANK_STATEMENT_EXTRACT, val);
        return this;
    }

    /**
     * 获取「Bank Statement Digitization」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleAccountBankStatementExtract() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_ACCOUNT_BANK_STATEMENT_EXTRACT), null);
    }

    /**
     * 判断 「Bank Statement Digitization」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleAccountBankStatementExtract() {
        return this._contains(FIELD_MODULE_ACCOUNT_BANK_STATEMENT_EXTRACT);
    }

    /**
     * 重置 「Bank Statement Digitization」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleAccountBankStatementExtract() {
        this._reset(FIELD_MODULE_ACCOUNT_BANK_STATEMENT_EXTRACT);
        return this;
    }

    /**
     * 设置「以CAMT.053 格式导入」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_CAMT)
    public ResConfigSettingsDTO setModuleAccountBankStatementImportCamt(Integer val) {
        this._set(FIELD_MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_CAMT, val);
        return this;
    }

    /**
     * 获取「以CAMT.053 格式导入」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleAccountBankStatementImportCamt() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_CAMT), null);
    }

    /**
     * 判断 「以CAMT.053 格式导入」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleAccountBankStatementImportCamt() {
        return this._contains(FIELD_MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_CAMT);
    }

    /**
     * 重置 「以CAMT.053 格式导入」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleAccountBankStatementImportCamt() {
        this._reset(FIELD_MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_CAMT);
        return this;
    }

    /**
     * 设置「以.csv、.xls和.xlsx格式导入」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_CSV)
    public ResConfigSettingsDTO setModuleAccountBankStatementImportCsv(Integer val) {
        this._set(FIELD_MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_CSV, val);
        return this;
    }

    /**
     * 获取「以.csv、.xls和.xlsx格式导入」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleAccountBankStatementImportCsv() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_CSV), null);
    }

    /**
     * 判断 「以.csv、.xls和.xlsx格式导入」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleAccountBankStatementImportCsv() {
        return this._contains(FIELD_MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_CSV);
    }

    /**
     * 重置 「以.csv、.xls和.xlsx格式导入」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleAccountBankStatementImportCsv() {
        this._reset(FIELD_MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_CSV);
        return this;
    }

    /**
     * 设置「以.ofx格式导入」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_OFX)
    public ResConfigSettingsDTO setModuleAccountBankStatementImportOfx(Integer val) {
        this._set(FIELD_MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_OFX, val);
        return this;
    }

    /**
     * 获取「以.ofx格式导入」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleAccountBankStatementImportOfx() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_OFX), null);
    }

    /**
     * 判断 「以.ofx格式导入」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleAccountBankStatementImportOfx() {
        return this._contains(FIELD_MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_OFX);
    }

    /**
     * 重置 「以.ofx格式导入」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleAccountBankStatementImportOfx() {
        this._reset(FIELD_MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_OFX);
        return this;
    }

    /**
     * 设置「导入.qif单据」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_QIF)
    public ResConfigSettingsDTO setModuleAccountBankStatementImportQif(Integer val) {
        this._set(FIELD_MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_QIF, val);
        return this;
    }

    /**
     * 获取「导入.qif单据」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleAccountBankStatementImportQif() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_QIF), null);
    }

    /**
     * 判断 「导入.qif单据」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleAccountBankStatementImportQif() {
        return this._contains(FIELD_MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_QIF);
    }

    /**
     * 重置 「导入.qif单据」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleAccountBankStatementImportQif() {
        this._reset(FIELD_MODULE_ACCOUNT_BANK_STATEMENT_IMPORT_QIF);
        return this;
    }

    /**
     * 设置「使用批量付款」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_ACCOUNT_BATCH_PAYMENT)
    public ResConfigSettingsDTO setModuleAccountBatchPayment(Integer val) {
        this._set(FIELD_MODULE_ACCOUNT_BATCH_PAYMENT, val);
        return this;
    }

    /**
     * 获取「使用批量付款」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleAccountBatchPayment() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_ACCOUNT_BATCH_PAYMENT), null);
    }

    /**
     * 判断 「使用批量付款」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleAccountBatchPayment() {
        return this._contains(FIELD_MODULE_ACCOUNT_BATCH_PAYMENT);
    }

    /**
     * 重置 「使用批量付款」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleAccountBatchPayment() {
        this._reset(FIELD_MODULE_ACCOUNT_BATCH_PAYMENT);
        return this;
    }

    /**
     * 设置「预算管理」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_ACCOUNT_BUDGET)
    public ResConfigSettingsDTO setModuleAccountBudget(Integer val) {
        this._set(FIELD_MODULE_ACCOUNT_BUDGET, val);
        return this;
    }

    /**
     * 获取「预算管理」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleAccountBudget() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_ACCOUNT_BUDGET), null);
    }

    /**
     * 判断 「预算管理」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleAccountBudget() {
        return this._contains(FIELD_MODULE_ACCOUNT_BUDGET);
    }

    /**
     * 重置 「预算管理」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleAccountBudget() {
        this._reset(FIELD_MODULE_ACCOUNT_BUDGET);
        return this;
    }

    /**
     * 设置「Allow check printing and deposits」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_ACCOUNT_CHECK_PRINTING)
    public ResConfigSettingsDTO setModuleAccountCheckPrinting(Integer val) {
        this._set(FIELD_MODULE_ACCOUNT_CHECK_PRINTING, val);
        return this;
    }

    /**
     * 获取「Allow check printing and deposits」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleAccountCheckPrinting() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_ACCOUNT_CHECK_PRINTING), null);
    }

    /**
     * 判断 「Allow check printing and deposits」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleAccountCheckPrinting() {
        return this._contains(FIELD_MODULE_ACCOUNT_CHECK_PRINTING);
    }

    /**
     * 重置 「Allow check printing and deposits」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleAccountCheckPrinting() {
        this._reset(FIELD_MODULE_ACCOUNT_CHECK_PRINTING);
        return this;
    }

    /**
     * 设置「Document Digitization」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_ACCOUNT_EXTRACT)
    public ResConfigSettingsDTO setModuleAccountExtract(Integer val) {
        this._set(FIELD_MODULE_ACCOUNT_EXTRACT, val);
        return this;
    }

    /**
     * 获取「Document Digitization」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleAccountExtract() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_ACCOUNT_EXTRACT), null);
    }

    /**
     * 判断 「Document Digitization」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleAccountExtract() {
        return this._contains(FIELD_MODULE_ACCOUNT_EXTRACT);
    }

    /**
     * 重置 「Document Digitization」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleAccountExtract() {
        this._reset(FIELD_MODULE_ACCOUNT_EXTRACT);
        return this;
    }

    /**
     * 设置「管理公司间交易」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_ACCOUNT_INTER_COMPANY_RULES)
    public ResConfigSettingsDTO setModuleAccountInterCompanyRules(Integer val) {
        this._set(FIELD_MODULE_ACCOUNT_INTER_COMPANY_RULES, val);
        return this;
    }

    /**
     * 获取「管理公司间交易」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleAccountInterCompanyRules() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_ACCOUNT_INTER_COMPANY_RULES), null);
    }

    /**
     * 判断 「管理公司间交易」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleAccountInterCompanyRules() {
        return this._contains(FIELD_MODULE_ACCOUNT_INTER_COMPANY_RULES);
    }

    /**
     * 重置 「管理公司间交易」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleAccountInterCompanyRules() {
        this._reset(FIELD_MODULE_ACCOUNT_INTER_COMPANY_RULES);
        return this;
    }

    /**
     * 设置「国际联盟」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_ACCOUNT_INTRASTAT)
    public ResConfigSettingsDTO setModuleAccountIntrastat(Integer val) {
        this._set(FIELD_MODULE_ACCOUNT_INTRASTAT, val);
        return this;
    }

    /**
     * 获取「国际联盟」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleAccountIntrastat() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_ACCOUNT_INTRASTAT), null);
    }

    /**
     * 判断 「国际联盟」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleAccountIntrastat() {
        return this._contains(FIELD_MODULE_ACCOUNT_INTRASTAT);
    }

    /**
     * 重置 「国际联盟」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleAccountIntrastat() {
        this._reset(FIELD_MODULE_ACCOUNT_INTRASTAT);
        return this;
    }

    /**
     * 设置「Invoice Digitization」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_ACCOUNT_INVOICE_EXTRACT)
    public ResConfigSettingsDTO setModuleAccountInvoiceExtract(Integer val) {
        this._set(FIELD_MODULE_ACCOUNT_INVOICE_EXTRACT, val);
        return this;
    }

    /**
     * 获取「Invoice Digitization」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleAccountInvoiceExtract() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_ACCOUNT_INVOICE_EXTRACT), null);
    }

    /**
     * 判断 「Invoice Digitization」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleAccountInvoiceExtract() {
        return this._contains(FIELD_MODULE_ACCOUNT_INVOICE_EXTRACT);
    }

    /**
     * 重置 「Invoice Digitization」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleAccountInvoiceExtract() {
        this._reset(FIELD_MODULE_ACCOUNT_INVOICE_EXTRACT);
        return this;
    }

    /**
     * 设置「SEPA Credit Transfer / ISO20022」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_ACCOUNT_ISO20022)
    public ResConfigSettingsDTO setModuleAccountIso20022(Integer val) {
        this._set(FIELD_MODULE_ACCOUNT_ISO20022, val);
        return this;
    }

    /**
     * 获取「SEPA Credit Transfer / ISO20022」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleAccountIso20022() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_ACCOUNT_ISO20022), null);
    }

    /**
     * 判断 「SEPA Credit Transfer / ISO20022」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleAccountIso20022() {
        return this._contains(FIELD_MODULE_ACCOUNT_ISO20022);
    }

    /**
     * 重置 「SEPA Credit Transfer / ISO20022」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleAccountIso20022() {
        this._reset(FIELD_MODULE_ACCOUNT_ISO20022);
        return this;
    }

    /**
     * 设置「Invoice Online Payment」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_ACCOUNT_PAYMENT)
    public ResConfigSettingsDTO setModuleAccountPayment(Integer val) {
        this._set(FIELD_MODULE_ACCOUNT_PAYMENT, val);
        return this;
    }

    /**
     * 获取「Invoice Online Payment」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleAccountPayment() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_ACCOUNT_PAYMENT), null);
    }

    /**
     * 判断 「Invoice Online Payment」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleAccountPayment() {
        return this._contains(FIELD_MODULE_ACCOUNT_PAYMENT);
    }

    /**
     * 重置 「Invoice Online Payment」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleAccountPayment() {
        this._reset(FIELD_MODULE_ACCOUNT_PAYMENT);
        return this;
    }

    /**
     * 设置「PEPPOL 开具发票」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_ACCOUNT_PEPPOL)
    public ResConfigSettingsDTO setModuleAccountPeppol(Integer val) {
        this._set(FIELD_MODULE_ACCOUNT_PEPPOL, val);
        return this;
    }

    /**
     * 获取「PEPPOL 开具发票」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleAccountPeppol() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_ACCOUNT_PEPPOL), null);
    }

    /**
     * 判断 「PEPPOL 开具发票」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleAccountPeppol() {
        return this._contains(FIELD_MODULE_ACCOUNT_PEPPOL);
    }

    /**
     * 重置 「PEPPOL 开具发票」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleAccountPeppol() {
        this._reset(FIELD_MODULE_ACCOUNT_PEPPOL);
        return this;
    }

    /**
     * 设置「Dynamic Reports」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_ACCOUNT_REPORTS)
    public ResConfigSettingsDTO setModuleAccountReports(Integer val) {
        this._set(FIELD_MODULE_ACCOUNT_REPORTS, val);
        return this;
    }

    /**
     * 获取「Dynamic Reports」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleAccountReports() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_ACCOUNT_REPORTS), null);
    }

    /**
     * 判断 「Dynamic Reports」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleAccountReports() {
        return this._contains(FIELD_MODULE_ACCOUNT_REPORTS);
    }

    /**
     * 重置 「Dynamic Reports」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleAccountReports() {
        this._reset(FIELD_MODULE_ACCOUNT_REPORTS);
        return this;
    }

    /**
     * 设置「Use SEPA Direct Debit」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_ACCOUNT_SEPA_DIRECT_DEBIT)
    public ResConfigSettingsDTO setModuleAccountSepaDirectDebit(Integer val) {
        this._set(FIELD_MODULE_ACCOUNT_SEPA_DIRECT_DEBIT, val);
        return this;
    }

    /**
     * 获取「Use SEPA Direct Debit」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleAccountSepaDirectDebit() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_ACCOUNT_SEPA_DIRECT_DEBIT), null);
    }

    /**
     * 判断 「Use SEPA Direct Debit」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleAccountSepaDirectDebit() {
        return this._contains(FIELD_MODULE_ACCOUNT_SEPA_DIRECT_DEBIT);
    }

    /**
     * 重置 「Use SEPA Direct Debit」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleAccountSepaDirectDebit() {
        this._reset(FIELD_MODULE_ACCOUNT_SEPA_DIRECT_DEBIT);
        return this;
    }

    /**
     * 设置「LDAP认证」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_AUTH_LDAP)
    public ResConfigSettingsDTO setModuleAuthLdap(Integer val) {
        this._set(FIELD_MODULE_AUTH_LDAP, val);
        return this;
    }

    /**
     * 获取「LDAP认证」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleAuthLdap() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_AUTH_LDAP), null);
    }

    /**
     * 判断 「LDAP认证」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleAuthLdap() {
        return this._contains(FIELD_MODULE_AUTH_LDAP);
    }

    /**
     * 重置 「LDAP认证」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleAuthLdap() {
        this._reset(FIELD_MODULE_AUTH_LDAP);
        return this;
    }

    /**
     * 设置「使用外部验证提供者 (OAuth)」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_AUTH_OAUTH)
    public ResConfigSettingsDTO setModuleAuthOauth(Integer val) {
        this._set(FIELD_MODULE_AUTH_OAUTH, val);
        return this;
    }

    /**
     * 获取「使用外部验证提供者 (OAuth)」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleAuthOauth() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_AUTH_OAUTH), null);
    }

    /**
     * 判断 「使用外部验证提供者 (OAuth)」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleAuthOauth() {
        return this._contains(FIELD_MODULE_AUTH_OAUTH);
    }

    /**
     * 重置 「使用外部验证提供者 (OAuth)」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleAuthOauth() {
        this._reset(FIELD_MODULE_AUTH_OAUTH);
        return this;
    }

    /**
     * 设置「地理定位」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_BASE_GEOLOCALIZE)
    public ResConfigSettingsDTO setModuleBaseGeolocalize(Integer val) {
        this._set(FIELD_MODULE_BASE_GEOLOCALIZE, val);
        return this;
    }

    /**
     * 获取「地理定位」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleBaseGeolocalize() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_BASE_GEOLOCALIZE), null);
    }

    /**
     * 判断 「地理定位」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleBaseGeolocalize() {
        return this._contains(FIELD_MODULE_BASE_GEOLOCALIZE);
    }

    /**
     * 重置 「地理定位」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleBaseGeolocalize() {
        this._reset(FIELD_MODULE_BASE_GEOLOCALIZE);
        return this;
    }

    /**
     * 设置「允许用户导入 CSV/XLS/XLSX/ODS格式的文档数据」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_BASE_IMPORT)
    public ResConfigSettingsDTO setModuleBaseImport(Integer val) {
        this._set(FIELD_MODULE_BASE_IMPORT, val);
        return this;
    }

    /**
     * 获取「允许用户导入 CSV/XLS/XLSX/ODS格式的文档数据」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleBaseImport() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_BASE_IMPORT), null);
    }

    /**
     * 判断 「允许用户导入 CSV/XLS/XLSX/ODS格式的文档数据」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleBaseImport() {
        return this._contains(FIELD_MODULE_BASE_IMPORT);
    }

    /**
     * 重置 「允许用户导入 CSV/XLS/XLSX/ODS格式的文档数据」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleBaseImport() {
        this._reset(FIELD_MODULE_BASE_IMPORT);
        return this;
    }

    /**
     * 设置「根据线索的电子邮箱地址、使用公司数据自动丰富线索。」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_CRM_IAP_ENRICH)
    public ResConfigSettingsDTO setModuleCrmIapEnrich(Integer val) {
        this._set(FIELD_MODULE_CRM_IAP_ENRICH, val);
        return this;
    }

    /**
     * 获取「根据线索的电子邮箱地址、使用公司数据自动丰富线索。」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleCrmIapEnrich() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_CRM_IAP_ENRICH), null);
    }

    /**
     * 判断 「根据线索的电子邮箱地址、使用公司数据自动丰富线索。」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleCrmIapEnrich() {
        return this._contains(FIELD_MODULE_CRM_IAP_ENRICH);
    }

    /**
     * 重置 「根据线索的电子邮箱地址、使用公司数据自动丰富线索。」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleCrmIapEnrich() {
        this._reset(FIELD_MODULE_CRM_IAP_ENRICH);
        return this;
    }

    /**
     * 设置「基于国家/地区、行业、规模等信息生成新的线索。」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_CRM_IAP_MINE)
    public ResConfigSettingsDTO setModuleCrmIapMine(Integer val) {
        this._set(FIELD_MODULE_CRM_IAP_MINE, val);
        return this;
    }

    /**
     * 获取「基于国家/地区、行业、规模等信息生成新的线索。」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleCrmIapMine() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_CRM_IAP_MINE), null);
    }

    /**
     * 判断 「基于国家/地区、行业、规模等信息生成新的线索。」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleCrmIapMine() {
        return this._contains(FIELD_MODULE_CRM_IAP_MINE);
    }

    /**
     * 重置 「基于国家/地区、行业、规模等信息生成新的线索。」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleCrmIapMine() {
        this._reset(FIELD_MODULE_CRM_IAP_MINE);
        return this;
    }

    /**
     * 设置「自动汇率」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_CURRENCY_RATE_LIVE)
    public ResConfigSettingsDTO setModuleCurrencyRateLive(Integer val) {
        this._set(FIELD_MODULE_CURRENCY_RATE_LIVE, val);
        return this;
    }

    /**
     * 获取「自动汇率」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleCurrencyRateLive() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_CURRENCY_RATE_LIVE), null);
    }

    /**
     * 判断 「自动汇率」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleCurrencyRateLive() {
        return this._contains(FIELD_MODULE_CURRENCY_RATE_LIVE);
    }

    /**
     * 重置 「自动汇率」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleCurrencyRateLive() {
        this._reset(FIELD_MODULE_CURRENCY_RATE_LIVE);
        return this;
    }

    /**
     * 设置「交付方式」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_DELIVERY)
    public ResConfigSettingsDTO setModuleDelivery(Integer val) {
        this._set(FIELD_MODULE_DELIVERY, val);
        return this;
    }

    /**
     * 获取「交付方式」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleDelivery() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_DELIVERY), null);
    }

    /**
     * 判断 「交付方式」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleDelivery() {
        return this._contains(FIELD_MODULE_DELIVERY);
    }

    /**
     * 重置 「交付方式」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleDelivery() {
        this._reset(FIELD_MODULE_DELIVERY);
        return this;
    }

    /**
     * 设置「bpost连接器」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_DELIVERY_BPOST)
    public ResConfigSettingsDTO setModuleDeliveryBpost(Integer val) {
        this._set(FIELD_MODULE_DELIVERY_BPOST, val);
        return this;
    }

    /**
     * 获取「bpost连接器」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleDeliveryBpost() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_DELIVERY_BPOST), null);
    }

    /**
     * 判断 「bpost连接器」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleDeliveryBpost() {
        return this._contains(FIELD_MODULE_DELIVERY_BPOST);
    }

    /**
     * 重置 「bpost连接器」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleDeliveryBpost() {
        this._reset(FIELD_MODULE_DELIVERY_BPOST);
        return this;
    }

    /**
     * 设置「DHL快递连接器」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_DELIVERY_DHL)
    public ResConfigSettingsDTO setModuleDeliveryDhl(Integer val) {
        this._set(FIELD_MODULE_DELIVERY_DHL, val);
        return this;
    }

    /**
     * 获取「DHL快递连接器」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleDeliveryDhl() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_DELIVERY_DHL), null);
    }

    /**
     * 判断 「DHL快递连接器」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleDeliveryDhl() {
        return this._contains(FIELD_MODULE_DELIVERY_DHL);
    }

    /**
     * 重置 「DHL快递连接器」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleDeliveryDhl() {
        this._reset(FIELD_MODULE_DELIVERY_DHL);
        return this;
    }

    /**
     * 设置「Easypost连接器」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_DELIVERY_EASYPOST)
    public ResConfigSettingsDTO setModuleDeliveryEasypost(Integer val) {
        this._set(FIELD_MODULE_DELIVERY_EASYPOST, val);
        return this;
    }

    /**
     * 获取「Easypost连接器」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleDeliveryEasypost() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_DELIVERY_EASYPOST), null);
    }

    /**
     * 判断 「Easypost连接器」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleDeliveryEasypost() {
        return this._contains(FIELD_MODULE_DELIVERY_EASYPOST);
    }

    /**
     * 重置 「Easypost连接器」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleDeliveryEasypost() {
        this._reset(FIELD_MODULE_DELIVERY_EASYPOST);
        return this;
    }

    /**
     * 设置「FedEx连接器」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_DELIVERY_FEDEX)
    public ResConfigSettingsDTO setModuleDeliveryFedex(Integer val) {
        this._set(FIELD_MODULE_DELIVERY_FEDEX, val);
        return this;
    }

    /**
     * 获取「FedEx连接器」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleDeliveryFedex() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_DELIVERY_FEDEX), null);
    }

    /**
     * 判断 「FedEx连接器」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleDeliveryFedex() {
        return this._contains(FIELD_MODULE_DELIVERY_FEDEX);
    }

    /**
     * 重置 「FedEx连接器」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleDeliveryFedex() {
        this._reset(FIELD_MODULE_DELIVERY_FEDEX);
        return this;
    }

    /**
     * 设置「Sendcloud连接器」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_DELIVERY_SENDCLOUD)
    public ResConfigSettingsDTO setModuleDeliverySendcloud(Integer val) {
        this._set(FIELD_MODULE_DELIVERY_SENDCLOUD, val);
        return this;
    }

    /**
     * 获取「Sendcloud连接器」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleDeliverySendcloud() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_DELIVERY_SENDCLOUD), null);
    }

    /**
     * 判断 「Sendcloud连接器」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleDeliverySendcloud() {
        return this._contains(FIELD_MODULE_DELIVERY_SENDCLOUD);
    }

    /**
     * 重置 「Sendcloud连接器」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleDeliverySendcloud() {
        this._reset(FIELD_MODULE_DELIVERY_SENDCLOUD);
        return this;
    }

    /**
     * 设置「Shiprocket 连接器」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_DELIVERY_SHIPROCKET)
    public ResConfigSettingsDTO setModuleDeliveryShiprocket(Integer val) {
        this._set(FIELD_MODULE_DELIVERY_SHIPROCKET, val);
        return this;
    }

    /**
     * 获取「Shiprocket 连接器」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleDeliveryShiprocket() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_DELIVERY_SHIPROCKET), null);
    }

    /**
     * 判断 「Shiprocket 连接器」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleDeliveryShiprocket() {
        return this._contains(FIELD_MODULE_DELIVERY_SHIPROCKET);
    }

    /**
     * 重置 「Shiprocket 连接器」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleDeliveryShiprocket() {
        this._reset(FIELD_MODULE_DELIVERY_SHIPROCKET);
        return this;
    }

    /**
     * 设置「Starshipit 连接器」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_DELIVERY_STARSHIPIT)
    public ResConfigSettingsDTO setModuleDeliveryStarshipit(Integer val) {
        this._set(FIELD_MODULE_DELIVERY_STARSHIPIT, val);
        return this;
    }

    /**
     * 获取「Starshipit 连接器」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleDeliveryStarshipit() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_DELIVERY_STARSHIPIT), null);
    }

    /**
     * 判断 「Starshipit 连接器」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleDeliveryStarshipit() {
        return this._contains(FIELD_MODULE_DELIVERY_STARSHIPIT);
    }

    /**
     * 重置 「Starshipit 连接器」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleDeliveryStarshipit() {
        this._reset(FIELD_MODULE_DELIVERY_STARSHIPIT);
        return this;
    }

    /**
     * 设置「UPS连接器」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_DELIVERY_UPS)
    public ResConfigSettingsDTO setModuleDeliveryUps(Integer val) {
        this._set(FIELD_MODULE_DELIVERY_UPS, val);
        return this;
    }

    /**
     * 获取「UPS连接器」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleDeliveryUps() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_DELIVERY_UPS), null);
    }

    /**
     * 判断 「UPS连接器」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleDeliveryUps() {
        return this._contains(FIELD_MODULE_DELIVERY_UPS);
    }

    /**
     * 重置 「UPS连接器」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleDeliveryUps() {
        this._reset(FIELD_MODULE_DELIVERY_UPS);
        return this;
    }

    /**
     * 设置「USPS连接器」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_DELIVERY_USPS)
    public ResConfigSettingsDTO setModuleDeliveryUsps(Integer val) {
        this._set(FIELD_MODULE_DELIVERY_USPS, val);
        return this;
    }

    /**
     * 获取「USPS连接器」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleDeliveryUsps() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_DELIVERY_USPS), null);
    }

    /**
     * 判断 「USPS连接器」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleDeliveryUsps() {
        return this._contains(FIELD_MODULE_DELIVERY_USPS);
    }

    /**
     * 重置 「USPS连接器」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleDeliveryUsps() {
        this._reset(FIELD_MODULE_DELIVERY_USPS);
        return this;
    }

    /**
     * 设置「允许用户同步谷歌日历」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_GOOGLE_CALENDAR)
    public ResConfigSettingsDTO setModuleGoogleCalendar(Integer val) {
        this._set(FIELD_MODULE_GOOGLE_CALENDAR, val);
        return this;
    }

    /**
     * 获取「允许用户同步谷歌日历」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleGoogleCalendar() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_GOOGLE_CALENDAR), null);
    }

    /**
     * 判断 「允许用户同步谷歌日历」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleGoogleCalendar() {
        return this._contains(FIELD_MODULE_GOOGLE_CALENDAR);
    }

    /**
     * 重置 「允许用户同步谷歌日历」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleGoogleCalendar() {
        this._reset(FIELD_MODULE_GOOGLE_CALENDAR);
        return this;
    }

    /**
     * 设置「支持Gmail身份验证」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_GOOGLE_GMAIL)
    public ResConfigSettingsDTO setModuleGoogleGmail(Integer val) {
        this._set(FIELD_MODULE_GOOGLE_GMAIL, val);
        return this;
    }

    /**
     * 获取「支持Gmail身份验证」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleGoogleGmail() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_GOOGLE_GMAIL), null);
    }

    /**
     * 判断 「支持Gmail身份验证」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleGoogleGmail() {
        return this._contains(FIELD_MODULE_GOOGLE_GMAIL);
    }

    /**
     * 重置 「支持Gmail身份验证」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleGoogleGmail() {
        this._reset(FIELD_MODULE_GOOGLE_GMAIL);
        return this;
    }

    /**
     * 设置「验证码」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_GOOGLE_RECAPTCHA)
    public ResConfigSettingsDTO setModuleGoogleRecaptcha(Integer val) {
        this._set(FIELD_MODULE_GOOGLE_RECAPTCHA, val);
        return this;
    }

    /**
     * 获取「验证码」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleGoogleRecaptcha() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_GOOGLE_RECAPTCHA), null);
    }

    /**
     * 判断 「验证码」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleGoogleRecaptcha() {
        return this._contains(FIELD_MODULE_GOOGLE_RECAPTCHA);
    }

    /**
     * 重置 「验证码」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleGoogleRecaptcha() {
        this._reset(FIELD_MODULE_GOOGLE_RECAPTCHA);
        return this;
    }

    /**
     * 设置「向OCR发送账单以产生费用」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_HR_EXPENSE_EXTRACT)
    public ResConfigSettingsDTO setModuleHrExpenseExtract(Integer val) {
        this._set(FIELD_MODULE_HR_EXPENSE_EXTRACT, val);
        return this;
    }

    /**
     * 获取「向OCR发送账单以产生费用」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleHrExpenseExtract() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_HR_EXPENSE_EXTRACT), null);
    }

    /**
     * 判断 「向OCR发送账单以产生费用」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleHrExpenseExtract() {
        return this._contains(FIELD_MODULE_HR_EXPENSE_EXTRACT);
    }

    /**
     * 重置 「向OCR发送账单以产生费用」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleHrExpenseExtract() {
        this._reset(FIELD_MODULE_HR_EXPENSE_EXTRACT);
        return this;
    }

    /**
     * 设置「远程工作」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_HR_HOMEWORKING)
    public ResConfigSettingsDTO setModuleHrHomeworking(Integer val) {
        this._set(FIELD_MODULE_HR_HOMEWORKING, val);
        return this;
    }

    /**
     * 获取「远程工作」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleHrHomeworking() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_HR_HOMEWORKING), null);
    }

    /**
     * 判断 「远程工作」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleHrHomeworking() {
        return this._contains(FIELD_MODULE_HR_HOMEWORKING);
    }

    /**
     * 重置 「远程工作」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleHrHomeworking() {
        this._reset(FIELD_MODULE_HR_HOMEWORKING);
        return this;
    }

    /**
     * 设置「工资单上的报销费用」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_HR_PAYROLL_EXPENSE)
    public ResConfigSettingsDTO setModuleHrPayrollExpense(Integer val) {
        this._set(FIELD_MODULE_HR_PAYROLL_EXPENSE, val);
        return this;
    }

    /**
     * 获取「工资单上的报销费用」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleHrPayrollExpense() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_HR_PAYROLL_EXPENSE), null);
    }

    /**
     * 判断 「工资单上的报销费用」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleHrPayrollExpense() {
        return this._contains(FIELD_MODULE_HR_PAYROLL_EXPENSE);
    }

    /**
     * 重置 「工资单上的报销费用」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleHrPayrollExpense() {
        this._reset(FIELD_MODULE_HR_PAYROLL_EXPENSE);
        return this;
    }

    /**
     * 设置「高级出席控制」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_HR_PRESENCE)
    public ResConfigSettingsDTO setModuleHrPresence(Integer val) {
        this._set(FIELD_MODULE_HR_PRESENCE, val);
        return this;
    }

    /**
     * 获取「高级出席控制」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleHrPresence() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_HR_PRESENCE), null);
    }

    /**
     * 判断 「高级出席控制」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleHrPresence() {
        return this._contains(FIELD_MODULE_HR_PRESENCE);
    }

    /**
     * 重置 「高级出席控制」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleHrPresence() {
        this._reset(FIELD_MODULE_HR_PRESENCE);
        return this;
    }

    /**
     * 设置「将简历发送到 OCR 以填写申请」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_HR_RECRUITMENT_EXTRACT)
    public ResConfigSettingsDTO setModuleHrRecruitmentExtract(Integer val) {
        this._set(FIELD_MODULE_HR_RECRUITMENT_EXTRACT, val);
        return this;
    }

    /**
     * 获取「将简历发送到 OCR 以填写申请」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleHrRecruitmentExtract() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_HR_RECRUITMENT_EXTRACT), null);
    }

    /**
     * 判断 「将简历发送到 OCR 以填写申请」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleHrRecruitmentExtract() {
        return this._contains(FIELD_MODULE_HR_RECRUITMENT_EXTRACT);
    }

    /**
     * 重置 「将简历发送到 OCR 以填写申请」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleHrRecruitmentExtract() {
        this._reset(FIELD_MODULE_HR_RECRUITMENT_EXTRACT);
        return this;
    }

    /**
     * 设置「面试表单」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_HR_RECRUITMENT_SURVEY)
    public ResConfigSettingsDTO setModuleHrRecruitmentSurvey(Integer val) {
        this._set(FIELD_MODULE_HR_RECRUITMENT_SURVEY, val);
        return this;
    }

    /**
     * 获取「面试表单」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleHrRecruitmentSurvey() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_HR_RECRUITMENT_SURVEY), null);
    }

    /**
     * 判断 「面试表单」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleHrRecruitmentSurvey() {
        return this._contains(FIELD_MODULE_HR_RECRUITMENT_SURVEY);
    }

    /**
     * 重置 「面试表单」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleHrRecruitmentSurvey() {
        this._reset(FIELD_MODULE_HR_RECRUITMENT_SURVEY);
        return this;
    }

    /**
     * 设置「技能管理」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_HR_SKILLS)
    public ResConfigSettingsDTO setModuleHrSkills(Integer val) {
        this._set(FIELD_MODULE_HR_SKILLS, val);
        return this;
    }

    /**
     * 获取「技能管理」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleHrSkills() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_HR_SKILLS), null);
    }

    /**
     * 判断 「技能管理」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleHrSkills() {
        return this._contains(FIELD_MODULE_HR_SKILLS);
    }

    /**
     * 重置 「技能管理」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleHrSkills() {
        this._reset(FIELD_MODULE_HR_SKILLS);
        return this;
    }

    /**
     * 设置「任务日志」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_HR_TIMESHEET)
    public ResConfigSettingsDTO setModuleHrTimesheet(Integer val) {
        this._set(FIELD_MODULE_HR_TIMESHEET, val);
        return this;
    }

    /**
     * 获取「任务日志」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleHrTimesheet() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_HR_TIMESHEET), null);
    }

    /**
     * 判断 「任务日志」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleHrTimesheet() {
        return this._contains(FIELD_MODULE_HR_TIMESHEET);
    }

    /**
     * 重置 「任务日志」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleHrTimesheet() {
        this._reset(FIELD_MODULE_HR_TIMESHEET);
        return this;
    }

    /**
     * 设置「欧盟共同体内部远程销售」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_L10N_EU_OSS)
    public ResConfigSettingsDTO setModuleL10nEuOss(Integer val) {
        this._set(FIELD_MODULE_L10N_EU_OSS, val);
        return this;
    }

    /**
     * 获取「欧盟共同体内部远程销售」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleL10nEuOss() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_L10N_EU_OSS), null);
    }

    /**
     * 判断 「欧盟共同体内部远程销售」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleL10nEuOss() {
        return this._contains(FIELD_MODULE_L10N_EU_OSS);
    }

    /**
     * 重置 「欧盟共同体内部远程销售」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleL10nEuOss() {
        this._reset(FIELD_MODULE_L10N_EU_OSS);
        return this;
    }

    /**
     * 设置「促销、优惠券、礼品卡和会员方案」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_LOYALTY)
    public ResConfigSettingsDTO setModuleLoyalty(Integer val) {
        this._set(FIELD_MODULE_LOYALTY, val);
        return this;
    }

    /**
     * 获取「促销、优惠券、礼品卡和会员方案」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleLoyalty() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_LOYALTY), null);
    }

    /**
     * 判断 「促销、优惠券、礼品卡和会员方案」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleLoyalty() {
        return this._contains(FIELD_MODULE_LOYALTY);
    }

    /**
     * 重置 「促销、优惠券、礼品卡和会员方案」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleLoyalty() {
        this._reset(FIELD_MODULE_LOYALTY);
        return this;
    }

    /**
     * 设置「允许与邮件插件集成」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_MAIL_PLUGIN)
    public ResConfigSettingsDTO setModuleMailPlugin(Integer val) {
        this._set(FIELD_MODULE_MAIL_PLUGIN, val);
        return this;
    }

    /**
     * 获取「允许与邮件插件集成」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleMailPlugin() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_MAIL_PLUGIN), null);
    }

    /**
     * 判断 「允许与邮件插件集成」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleMailPlugin() {
        return this._contains(FIELD_MODULE_MAIL_PLUGIN);
    }

    /**
     * 重置 「允许与邮件插件集成」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleMailPlugin() {
        this._reset(FIELD_MODULE_MAIL_PLUGIN);
        return this;
    }

    /**
     * 设置「定制维护工作表」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_MAINTENANCE_WORKSHEET)
    public ResConfigSettingsDTO setModuleMaintenanceWorksheet(Integer val) {
        this._set(FIELD_MODULE_MAINTENANCE_WORKSHEET, val);
        return this;
    }

    /**
     * 获取「定制维护工作表」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleMaintenanceWorksheet() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_MAINTENANCE_WORKSHEET), null);
    }

    /**
     * 判断 「定制维护工作表」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleMaintenanceWorksheet() {
        return this._contains(FIELD_MODULE_MAINTENANCE_WORKSHEET);
    }

    /**
     * 重置 「定制维护工作表」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleMaintenanceWorksheet() {
        this._reset(FIELD_MODULE_MAINTENANCE_WORKSHEET);
        return this;
    }

    /**
     * 设置「允许用户同步Outlook日历」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_MICROSOFT_CALENDAR)
    public ResConfigSettingsDTO setModuleMicrosoftCalendar(Integer val) {
        this._set(FIELD_MODULE_MICROSOFT_CALENDAR, val);
        return this;
    }

    /**
     * 获取「允许用户同步Outlook日历」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleMicrosoftCalendar() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_MICROSOFT_CALENDAR), null);
    }

    /**
     * 判断 「允许用户同步Outlook日历」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleMicrosoftCalendar() {
        return this._contains(FIELD_MODULE_MICROSOFT_CALENDAR);
    }

    /**
     * 重置 「允许用户同步Outlook日历」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleMicrosoftCalendar() {
        this._reset(FIELD_MODULE_MICROSOFT_CALENDAR);
        return this;
    }

    /**
     * 设置「支持Outlook身份验证」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_MICROSOFT_OUTLOOK)
    public ResConfigSettingsDTO setModuleMicrosoftOutlook(Integer val) {
        this._set(FIELD_MODULE_MICROSOFT_OUTLOOK, val);
        return this;
    }

    /**
     * 获取「支持Outlook身份验证」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleMicrosoftOutlook() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_MICROSOFT_OUTLOOK), null);
    }

    /**
     * 判断 「支持Outlook身份验证」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleMicrosoftOutlook() {
        return this._contains(FIELD_MODULE_MICROSOFT_OUTLOOK);
    }

    /**
     * 重置 「支持Outlook身份验证」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleMicrosoftOutlook() {
        this._reset(FIELD_MODULE_MICROSOFT_OUTLOOK);
        return this;
    }

    /**
     * 设置「主生产计划」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_MRP_MPS)
    public ResConfigSettingsDTO setModuleMrpMps(Integer val) {
        this._set(FIELD_MODULE_MRP_MPS, val);
        return this;
    }

    /**
     * 获取「主生产计划」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleMrpMps() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_MRP_MPS), null);
    }

    /**
     * 判断 「主生产计划」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleMrpMps() {
        return this._contains(FIELD_MODULE_MRP_MPS);
    }

    /**
     * 重置 「主生产计划」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleMrpMps() {
        this._reset(FIELD_MODULE_MRP_MPS);
        return this;
    }

    /**
     * 设置「产品生命周期管理（PLM）」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_MRP_PLM)
    public ResConfigSettingsDTO setModuleMrpPlm(Integer val) {
        this._set(FIELD_MODULE_MRP_PLM, val);
        return this;
    }

    /**
     * 获取「产品生命周期管理（PLM）」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleMrpPlm() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_MRP_PLM), null);
    }

    /**
     * 判断 「产品生命周期管理（PLM）」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleMrpPlm() {
        return this._contains(FIELD_MODULE_MRP_PLM);
    }

    /**
     * 重置 「产品生命周期管理（PLM）」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleMrpPlm() {
        this._reset(FIELD_MODULE_MRP_PLM);
        return this;
    }

    /**
     * 设置「外包」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_MRP_SUBCONTRACTING)
    public ResConfigSettingsDTO setModuleMrpSubcontracting(Integer val) {
        this._set(FIELD_MODULE_MRP_SUBCONTRACTING, val);
        return this;
    }

    /**
     * 获取「外包」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleMrpSubcontracting() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_MRP_SUBCONTRACTING), null);
    }

    /**
     * 判断 「外包」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleMrpSubcontracting() {
        return this._contains(FIELD_MODULE_MRP_SUBCONTRACTING);
    }

    /**
     * 重置 「外包」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleMrpSubcontracting() {
        this._reset(FIELD_MODULE_MRP_SUBCONTRACTING);
        return this;
    }

    /**
     * 设置「合作伙伴自动完成」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_PARTNER_AUTOCOMPLETE)
    public ResConfigSettingsDTO setModulePartnerAutocomplete(Integer val) {
        this._set(FIELD_MODULE_PARTNER_AUTOCOMPLETE, val);
        return this;
    }

    /**
     * 获取「合作伙伴自动完成」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModulePartnerAutocomplete() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_PARTNER_AUTOCOMPLETE), null);
    }

    /**
     * 判断 「合作伙伴自动完成」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModulePartnerAutocomplete() {
        return this._contains(FIELD_MODULE_PARTNER_AUTOCOMPLETE);
    }

    /**
     * 重置 「合作伙伴自动完成」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModulePartnerAutocomplete() {
        this._reset(FIELD_MODULE_PARTNER_AUTOCOMPLETE);
        return this;
    }

    /**
     * 设置「特定的电子邮件」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_PRODUCT_EMAIL_TEMPLATE)
    public ResConfigSettingsDTO setModuleProductEmailTemplate(Integer val) {
        this._set(FIELD_MODULE_PRODUCT_EMAIL_TEMPLATE, val);
        return this;
    }

    /**
     * 获取「特定的电子邮件」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleProductEmailTemplate() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_PRODUCT_EMAIL_TEMPLATE), null);
    }

    /**
     * 判断 「特定的电子邮件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleProductEmailTemplate() {
        return this._contains(FIELD_MODULE_PRODUCT_EMAIL_TEMPLATE);
    }

    /**
     * 重置 「特定的电子邮件」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleProductEmailTemplate() {
        this._reset(FIELD_MODULE_PRODUCT_EMAIL_TEMPLATE);
        return this;
    }

    /**
     * 设置「到期日期」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_PRODUCT_EXPIRY)
    public ResConfigSettingsDTO setModuleProductExpiry(Integer val) {
        this._set(FIELD_MODULE_PRODUCT_EXPIRY, val);
        return this;
    }

    /**
     * 获取「到期日期」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleProductExpiry() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_PRODUCT_EXPIRY), null);
    }

    /**
     * 判断 「到期日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleProductExpiry() {
        return this._contains(FIELD_MODULE_PRODUCT_EXPIRY);
    }

    /**
     * 重置 「到期日期」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleProductExpiry() {
        this._reset(FIELD_MODULE_PRODUCT_EXPIRY);
        return this;
    }

    /**
     * 设置「使用条形码获取产品图片」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_PRODUCT_IMAGES)
    public ResConfigSettingsDTO setModuleProductImages(Integer val) {
        this._set(FIELD_MODULE_PRODUCT_IMAGES, val);
        return this;
    }

    /**
     * 获取「使用条形码获取产品图片」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleProductImages() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_PRODUCT_IMAGES), null);
    }

    /**
     * 判断 「使用条形码获取产品图片」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleProductImages() {
        return this._contains(FIELD_MODULE_PRODUCT_IMAGES);
    }

    /**
     * 重置 「使用条形码获取产品图片」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleProductImages() {
        this._reset(FIELD_MODULE_PRODUCT_IMAGES);
        return this;
    }

    /**
     * 设置「允许产品毛利」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_PRODUCT_MARGIN)
    public ResConfigSettingsDTO setModuleProductMargin(Integer val) {
        this._set(FIELD_MODULE_PRODUCT_MARGIN, val);
        return this;
    }

    /**
     * 获取「允许产品毛利」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleProductMargin() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_PRODUCT_MARGIN), null);
    }

    /**
     * 判断 「允许产品毛利」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleProductMargin() {
        return this._contains(FIELD_MODULE_PRODUCT_MARGIN);
    }

    /**
     * 重置 「允许产品毛利」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleProductMargin() {
        this._reset(FIELD_MODULE_PRODUCT_MARGIN);
        return this;
    }

    /**
     * 设置「采购表格入口」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_PURCHASE_PRODUCT_MATRIX)
    public ResConfigSettingsDTO setModulePurchaseProductMatrix(Integer val) {
        this._set(FIELD_MODULE_PURCHASE_PRODUCT_MATRIX, val);
        return this;
    }

    /**
     * 获取「采购表格入口」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModulePurchaseProductMatrix() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_PURCHASE_PRODUCT_MATRIX), null);
    }

    /**
     * 判断 「采购表格入口」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModulePurchaseProductMatrix() {
        return this._contains(FIELD_MODULE_PURCHASE_PRODUCT_MATRIX);
    }

    /**
     * 重置 「采购表格入口」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModulePurchaseProductMatrix() {
        this._reset(FIELD_MODULE_PURCHASE_PRODUCT_MATRIX);
        return this;
    }

    /**
     * 设置「采购协议」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_PURCHASE_REQUISITION)
    public ResConfigSettingsDTO setModulePurchaseRequisition(Integer val) {
        this._set(FIELD_MODULE_PURCHASE_REQUISITION, val);
        return this;
    }

    /**
     * 获取「采购协议」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModulePurchaseRequisition() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_PURCHASE_REQUISITION), null);
    }

    /**
     * 判断 「采购协议」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModulePurchaseRequisition() {
        return this._contains(FIELD_MODULE_PURCHASE_REQUISITION);
    }

    /**
     * 重置 「采购协议」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModulePurchaseRequisition() {
        this._reset(FIELD_MODULE_PURCHASE_REQUISITION);
        return this;
    }

    /**
     * 设置「质量」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_QUALITY_CONTROL)
    public ResConfigSettingsDTO setModuleQualityControl(Integer val) {
        this._set(FIELD_MODULE_QUALITY_CONTROL, val);
        return this;
    }

    /**
     * 获取「质量」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleQualityControl() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_QUALITY_CONTROL), null);
    }

    /**
     * 判断 「质量」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleQualityControl() {
        return this._contains(FIELD_MODULE_QUALITY_CONTROL);
    }

    /**
     * 重置 「质量」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleQualityControl() {
        this._reset(FIELD_MODULE_QUALITY_CONTROL);
        return this;
    }

    /**
     * 设置「质量工作表」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_QUALITY_CONTROL_WORKSHEET)
    public ResConfigSettingsDTO setModuleQualityControlWorksheet(Integer val) {
        this._set(FIELD_MODULE_QUALITY_CONTROL_WORKSHEET, val);
        return this;
    }

    /**
     * 获取「质量工作表」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleQualityControlWorksheet() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_QUALITY_CONTROL_WORKSHEET), null);
    }

    /**
     * 判断 「质量工作表」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleQualityControlWorksheet() {
        return this._contains(FIELD_MODULE_QUALITY_CONTROL_WORKSHEET);
    }

    /**
     * 重置 「质量工作表」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleQualityControlWorksheet() {
        this._reset(FIELD_MODULE_QUALITY_CONTROL_WORKSHEET);
        return this;
    }

    /**
     * 设置「亚马逊同步」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_SALE_AMAZON)
    public ResConfigSettingsDTO setModuleSaleAmazon(Integer val) {
        this._set(FIELD_MODULE_SALE_AMAZON, val);
        return this;
    }

    /**
     * 获取「亚马逊同步」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleSaleAmazon() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_SALE_AMAZON), null);
    }

    /**
     * 判断 「亚马逊同步」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleSaleAmazon() {
        return this._contains(FIELD_MODULE_SALE_AMAZON);
    }

    /**
     * 重置 「亚马逊同步」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleSaleAmazon() {
        this._reset(FIELD_MODULE_SALE_AMAZON);
        return this;
    }

    /**
     * 设置「佣金」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_SALE_COMMISSION)
    public ResConfigSettingsDTO setModuleSaleCommission(Integer val) {
        this._set(FIELD_MODULE_SALE_COMMISSION, val);
        return this;
    }

    /**
     * 获取「佣金」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleSaleCommission() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_SALE_COMMISSION), null);
    }

    /**
     * 判断 「佣金」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleSaleCommission() {
        return this._contains(FIELD_MODULE_SALE_COMMISSION);
    }

    /**
     * 重置 「佣金」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleSaleCommission() {
        this._reset(FIELD_MODULE_SALE_COMMISSION);
        return this;
    }

    /**
     * 设置「优惠券和会员」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_SALE_LOYALTY)
    public ResConfigSettingsDTO setModuleSaleLoyalty(Integer val) {
        this._set(FIELD_MODULE_SALE_LOYALTY, val);
        return this;
    }

    /**
     * 获取「优惠券和会员」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleSaleLoyalty() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_SALE_LOYALTY), null);
    }

    /**
     * 判断 「优惠券和会员」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleSaleLoyalty() {
        return this._contains(FIELD_MODULE_SALE_LOYALTY);
    }

    /**
     * 重置 「优惠券和会员」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleSaleLoyalty() {
        this._reset(FIELD_MODULE_SALE_LOYALTY);
        return this;
    }

    /**
     * 设置「毛利」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_SALE_MARGIN)
    public ResConfigSettingsDTO setModuleSaleMargin(Integer val) {
        this._set(FIELD_MODULE_SALE_MARGIN, val);
        return this;
    }

    /**
     * 获取「毛利」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleSaleMargin() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_SALE_MARGIN), null);
    }

    /**
     * 判断 「毛利」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleSaleMargin() {
        return this._contains(FIELD_MODULE_SALE_MARGIN);
    }

    /**
     * 重置 「毛利」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleSaleMargin() {
        this._reset(FIELD_MODULE_SALE_MARGIN);
        return this;
    }

    /**
     * 设置「PDF 报价生成器」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_SALE_PDF_QUOTE_BUILDER)
    public ResConfigSettingsDTO setModuleSalePdfQuoteBuilder(Integer val) {
        this._set(FIELD_MODULE_SALE_PDF_QUOTE_BUILDER, val);
        return this;
    }

    /**
     * 获取「PDF 报价生成器」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleSalePdfQuoteBuilder() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_SALE_PDF_QUOTE_BUILDER), null);
    }

    /**
     * 判断 「PDF 报价生成器」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleSalePdfQuoteBuilder() {
        return this._contains(FIELD_MODULE_SALE_PDF_QUOTE_BUILDER);
    }

    /**
     * 重置 「PDF 报价生成器」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleSalePdfQuoteBuilder() {
        this._reset(FIELD_MODULE_SALE_PDF_QUOTE_BUILDER);
        return this;
    }

    /**
     * 设置「销售表格录入」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_SALE_PRODUCT_MATRIX)
    public ResConfigSettingsDTO setModuleSaleProductMatrix(Integer val) {
        this._set(FIELD_MODULE_SALE_PRODUCT_MATRIX, val);
        return this;
    }

    /**
     * 获取「销售表格录入」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleSaleProductMatrix() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_SALE_PRODUCT_MATRIX), null);
    }

    /**
     * 判断 「销售表格录入」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleSaleProductMatrix() {
        return this._contains(FIELD_MODULE_SALE_PRODUCT_MATRIX);
    }

    /**
     * 重置 「销售表格录入」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleSaleProductMatrix() {
        this._reset(FIELD_MODULE_SALE_PRODUCT_MATRIX);
        return this;
    }

    /**
     * 设置「短信息」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_SMS)
    public ResConfigSettingsDTO setModuleSms(Integer val) {
        this._set(FIELD_MODULE_SMS, val);
        return this;
    }

    /**
     * 获取「短信息」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleSms() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_SMS), null);
    }

    /**
     * 判断 「短信息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleSms() {
        return this._contains(FIELD_MODULE_SMS);
    }

    /**
     * 重置 「短信息」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleSms() {
        this._reset(FIELD_MODULE_SMS);
        return this;
    }

    /**
     * 设置「传统信件」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_SNAILMAIL_ACCOUNT)
    public ResConfigSettingsDTO setModuleSnailmailAccount(Integer val) {
        this._set(FIELD_MODULE_SNAILMAIL_ACCOUNT, val);
        return this;
    }

    /**
     * 获取「传统信件」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleSnailmailAccount() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_SNAILMAIL_ACCOUNT), null);
    }

    /**
     * 判断 「传统信件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleSnailmailAccount() {
        return this._contains(FIELD_MODULE_SNAILMAIL_ACCOUNT);
    }

    /**
     * 重置 「传统信件」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleSnailmailAccount() {
        this._reset(FIELD_MODULE_SNAILMAIL_ACCOUNT);
        return this;
    }

    /**
     * 设置「条码扫描器」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_STOCK_BARCODE)
    public ResConfigSettingsDTO setModuleStockBarcode(Integer val) {
        this._set(FIELD_MODULE_STOCK_BARCODE, val);
        return this;
    }

    /**
     * 获取「条码扫描器」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleStockBarcode() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_STOCK_BARCODE), null);
    }

    /**
     * 判断 「条码扫描器」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleStockBarcode() {
        return this._contains(FIELD_MODULE_STOCK_BARCODE);
    }

    /**
     * 重置 「条码扫描器」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleStockBarcode() {
        this._reset(FIELD_MODULE_STOCK_BARCODE);
        return this;
    }

    /**
     * 设置「库存条形码数据库」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_STOCK_BARCODE_BARCODELOOKUP)
    public ResConfigSettingsDTO setModuleStockBarcodeBarcodelookup(Integer val) {
        this._set(FIELD_MODULE_STOCK_BARCODE_BARCODELOOKUP, val);
        return this;
    }

    /**
     * 获取「库存条形码数据库」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleStockBarcodeBarcodelookup() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_STOCK_BARCODE_BARCODELOOKUP), null);
    }

    /**
     * 判断 「库存条形码数据库」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleStockBarcodeBarcodelookup() {
        return this._contains(FIELD_MODULE_STOCK_BARCODE_BARCODELOOKUP);
    }

    /**
     * 重置 「库存条形码数据库」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleStockBarcodeBarcodelookup() {
        this._reset(FIELD_MODULE_STOCK_BARCODE_BARCODELOOKUP);
        return this;
    }

    /**
     * 设置「代发货」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_STOCK_DROPSHIPPING)
    public ResConfigSettingsDTO setModuleStockDropshipping(Integer val) {
        this._set(FIELD_MODULE_STOCK_DROPSHIPPING, val);
        return this;
    }

    /**
     * 获取「代发货」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleStockDropshipping() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_STOCK_DROPSHIPPING), null);
    }

    /**
     * 判断 「代发货」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleStockDropshipping() {
        return this._contains(FIELD_MODULE_STOCK_DROPSHIPPING);
    }

    /**
     * 重置 「代发货」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleStockDropshipping() {
        this._reset(FIELD_MODULE_STOCK_DROPSHIPPING);
        return this;
    }

    /**
     * 设置「配送管理系统」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_STOCK_FLEET)
    public ResConfigSettingsDTO setModuleStockFleet(Integer val) {
        this._set(FIELD_MODULE_STOCK_FLEET, val);
        return this;
    }

    /**
     * 获取「配送管理系统」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleStockFleet() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_STOCK_FLEET), null);
    }

    /**
     * 判断 「配送管理系统」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleStockFleet() {
        return this._contains(FIELD_MODULE_STOCK_FLEET);
    }

    /**
     * 重置 「配送管理系统」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleStockFleet() {
        this._reset(FIELD_MODULE_STOCK_FLEET);
        return this;
    }

    /**
     * 设置「到岸成本」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_STOCK_LANDED_COSTS)
    public ResConfigSettingsDTO setModuleStockLandedCosts(Integer val) {
        this._set(FIELD_MODULE_STOCK_LANDED_COSTS, val);
        return this;
    }

    /**
     * 获取「到岸成本」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleStockLandedCosts() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_STOCK_LANDED_COSTS), null);
    }

    /**
     * 判断 「到岸成本」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleStockLandedCosts() {
        return this._contains(FIELD_MODULE_STOCK_LANDED_COSTS);
    }

    /**
     * 重置 「到岸成本」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleStockLandedCosts() {
        this._reset(FIELD_MODULE_STOCK_LANDED_COSTS);
        return this;
    }

    /**
     * 设置「批量、波次和集群调拨」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_STOCK_PICKING_BATCH)
    public ResConfigSettingsDTO setModuleStockPickingBatch(Integer val) {
        this._set(FIELD_MODULE_STOCK_PICKING_BATCH, val);
        return this;
    }

    /**
     * 获取「批量、波次和集群调拨」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleStockPickingBatch() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_STOCK_PICKING_BATCH), null);
    }

    /**
     * 判断 「批量、波次和集群调拨」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleStockPickingBatch() {
        return this._contains(FIELD_MODULE_STOCK_PICKING_BATCH);
    }

    /**
     * 重置 「批量、波次和集群调拨」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleStockPickingBatch() {
        this._reset(FIELD_MODULE_STOCK_PICKING_BATCH);
        return this;
    }

    /**
     * 设置「短信息确认」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_STOCK_SMS)
    public ResConfigSettingsDTO setModuleStockSms(Integer val) {
        this._set(FIELD_MODULE_STOCK_SMS, val);
        return this;
    }

    /**
     * 获取「短信息确认」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleStockSms() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_STOCK_SMS), null);
    }

    /**
     * 判断 「短信息确认」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleStockSms() {
        return this._contains(FIELD_MODULE_STOCK_SMS);
    }

    /**
     * 重置 「短信息确认」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleStockSms() {
        this._reset(FIELD_MODULE_STOCK_SMS);
        return this;
    }

    /**
     * 设置「网络电话」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_VOIP)
    public ResConfigSettingsDTO setModuleVoip(Integer val) {
        this._set(FIELD_MODULE_VOIP, val);
        return this;
    }

    /**
     * 获取「网络电话」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleVoip() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_VOIP), null);
    }

    /**
     * 判断 「网络电话」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleVoip() {
        return this._contains(FIELD_MODULE_VOIP);
    }

    /**
     * 重置 「网络电话」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleVoip() {
        this._reset(FIELD_MODULE_VOIP);
        return this;
    }

    /**
     * 设置「Unsplash图像库」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_WEB_UNSPLASH)
    public ResConfigSettingsDTO setModuleWebUnsplash(Integer val) {
        this._set(FIELD_MODULE_WEB_UNSPLASH, val);
        return this;
    }

    /**
     * 获取「Unsplash图像库」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleWebUnsplash() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_WEB_UNSPLASH), null);
    }

    /**
     * 判断 「Unsplash图像库」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleWebUnsplash() {
        return this._contains(FIELD_MODULE_WEB_UNSPLASH);
    }

    /**
     * 重置 「Unsplash图像库」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleWebUnsplash() {
        this._reset(FIELD_MODULE_WEB_UNSPLASH);
        return this;
    }

    /**
     * 设置「Cloudflare Turnstile」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_WEBSITE_CF_TURNSTILE)
    public ResConfigSettingsDTO setModuleWebsiteCfTurnstile(Integer val) {
        this._set(FIELD_MODULE_WEBSITE_CF_TURNSTILE, val);
        return this;
    }

    /**
     * 获取「Cloudflare Turnstile」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleWebsiteCfTurnstile() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_WEBSITE_CF_TURNSTILE), null);
    }

    /**
     * 判断 「Cloudflare Turnstile」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleWebsiteCfTurnstile() {
        return this._contains(FIELD_MODULE_WEBSITE_CF_TURNSTILE);
    }

    /**
     * 重置 「Cloudflare Turnstile」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleWebsiteCfTurnstile() {
        this._reset(FIELD_MODULE_WEBSITE_CF_TURNSTILE);
        return this;
    }

    /**
     * 设置「从网站流量创建线索/商机」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_WEBSITE_CRM_IAP_REVEAL)
    public ResConfigSettingsDTO setModuleWebsiteCrmIapReveal(Integer val) {
        this._set(FIELD_MODULE_WEBSITE_CRM_IAP_REVEAL, val);
        return this;
    }

    /**
     * 获取「从网站流量创建线索/商机」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleWebsiteCrmIapReveal() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_WEBSITE_CRM_IAP_REVEAL), null);
    }

    /**
     * 判断 「从网站流量创建线索/商机」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleWebsiteCrmIapReveal() {
        return this._contains(FIELD_MODULE_WEBSITE_CRM_IAP_REVEAL);
    }

    /**
     * 重置 「从网站流量创建线索/商机」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleWebsiteCrmIapReveal() {
        this._reset(FIELD_MODULE_WEBSITE_CRM_IAP_REVEAL);
        return this;
    }

    /**
     * 设置「线上发布」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MODULE_WEBSITE_HR_RECRUITMENT)
    public ResConfigSettingsDTO setModuleWebsiteHrRecruitment(Integer val) {
        this._set(FIELD_MODULE_WEBSITE_HR_RECRUITMENT, val);
        return this;
    }

    /**
     * 获取「线上发布」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getModuleWebsiteHrRecruitment() {
        return DataTypeUtils.asInteger(this._get(FIELD_MODULE_WEBSITE_HR_RECRUITMENT), null);
    }

    /**
     * 判断 「线上发布」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModuleWebsiteHrRecruitment() {
        return this._contains(FIELD_MODULE_WEBSITE_HR_RECRUITMENT);
    }

    /**
     * 重置 「线上发布」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetModuleWebsiteHrRecruitment() {
        this._reset(FIELD_MODULE_WEBSITE_HR_RECRUITMENT);
        return this;
    }

    /**
     * 设置「对公司有利的宽容时间」
     * @param val
     */
    @JsonProperty(FIELD_OVERTIME_COMPANY_THRESHOLD)
    public ResConfigSettingsDTO setOvertimeCompanyThreshold(Integer val) {
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
    public ResConfigSettingsDTO resetOvertimeCompanyThreshold() {
        this._reset(FIELD_OVERTIME_COMPANY_THRESHOLD);
        return this;
    }

    /**
     * 设置「对员工有利的宽容时间」
     * @param val
     */
    @JsonProperty(FIELD_OVERTIME_EMPLOYEE_THRESHOLD)
    public ResConfigSettingsDTO setOvertimeEmployeeThreshold(Integer val) {
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
    public ResConfigSettingsDTO resetOvertimeEmployeeThreshold() {
        this._reset(FIELD_OVERTIME_EMPLOYEE_THRESHOLD);
        return this;
    }

    /**
     * 设置「信用不足」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_PARTNER_AUTOCOMPLETE_INSUFFICIENT_CREDIT)
    public ResConfigSettingsDTO setPartnerAutocompleteInsufficientCredit(Integer val) {
        this._set(FIELD_PARTNER_AUTOCOMPLETE_INSUFFICIENT_CREDIT, val);
        return this;
    }

    /**
     * 获取「信用不足」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getPartnerAutocompleteInsufficientCredit() {
        return DataTypeUtils.asInteger(this._get(FIELD_PARTNER_AUTOCOMPLETE_INSUFFICIENT_CREDIT), null);
    }

    /**
     * 判断 「信用不足」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPartnerAutocompleteInsufficientCredit() {
        return this._contains(FIELD_PARTNER_AUTOCOMPLETE_INSUFFICIENT_CREDIT);
    }

    /**
     * 重置 「信用不足」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetPartnerAutocompleteInsufficientCredit() {
        this._reset(FIELD_PARTNER_AUTOCOMPLETE_INSUFFICIENT_CREDIT);
        return this;
    }

    /**
     * 设置「在线支付发票」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_PAY_INVOICES_ONLINE)
    public ResConfigSettingsDTO setPayInvoicesOnline(Integer val) {
        this._set(FIELD_PAY_INVOICES_ONLINE, val);
        return this;
    }

    /**
     * 获取「在线支付发票」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getPayInvoicesOnline() {
        return DataTypeUtils.asInteger(this._get(FIELD_PAY_INVOICES_ONLINE), null);
    }

    /**
     * 判断 「在线支付发票」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPayInvoicesOnline() {
        return this._contains(FIELD_PAY_INVOICES_ONLINE);
    }

    /**
     * 重置 「在线支付发票」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetPayInvoicesOnline() {
        this._reset(FIELD_PAY_INVOICES_ONLINE);
        return this;
    }

    /**
     * 设置「订单审批」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_PO_ORDER_APPROVAL)
    public ResConfigSettingsDTO setPoOrderApproval(Integer val) {
        this._set(FIELD_PO_ORDER_APPROVAL, val);
        return this;
    }

    /**
     * 获取「订单审批」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getPoOrderApproval() {
        return DataTypeUtils.asInteger(this._get(FIELD_PO_ORDER_APPROVAL), null);
    }

    /**
     * 判断 「订单审批」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPoOrderApproval() {
        return this._contains(FIELD_PO_ORDER_APPROVAL);
    }

    /**
     * 重置 「订单审批」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetPoOrderApproval() {
        this._reset(FIELD_PO_ORDER_APPROVAL);
        return this;
    }

    /**
     * 设置「客户 API 密钥」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_PORTAL_ALLOW_API_KEYS)
    public ResConfigSettingsDTO setPortalAllowApiKeys(Integer val) {
        this._set(FIELD_PORTAL_ALLOW_API_KEYS, val);
        return this;
    }

    /**
     * 获取「客户 API 密钥」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getPortalAllowApiKeys() {
        return DataTypeUtils.asInteger(this._get(FIELD_PORTAL_ALLOW_API_KEYS), null);
    }

    /**
     * 判断 「客户 API 密钥」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPortalAllowApiKeys() {
        return this._contains(FIELD_PORTAL_ALLOW_API_KEYS);
    }

    /**
     * 重置 「客户 API 密钥」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetPortalAllowApiKeys() {
        this._reset(FIELD_PORTAL_ALLOW_API_KEYS);
        return this;
    }

    /**
     * 设置「预测线索评分字段标签」
     * @param val
     */
    @JsonProperty(FIELD_PREDICTIVE_LEAD_SCORING_FIELD_LABELS)
    public ResConfigSettingsDTO setPredictiveLeadScoringFieldLabels(String val) {
        this._set(FIELD_PREDICTIVE_LEAD_SCORING_FIELD_LABELS, val);
        return this;
    }

    /**
     * 获取「预测线索评分字段标签」值
     *
     */
    @JsonIgnore
    public String getPredictiveLeadScoringFieldLabels() {
        return DataTypeUtils.asString(this._get(FIELD_PREDICTIVE_LEAD_SCORING_FIELD_LABELS), null);
    }

    /**
     * 判断 「预测线索评分字段标签」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPredictiveLeadScoringFieldLabels() {
        return this._contains(FIELD_PREDICTIVE_LEAD_SCORING_FIELD_LABELS);
    }

    /**
     * 重置 「预测线索评分字段标签」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetPredictiveLeadScoringFieldLabels() {
        this._reset(FIELD_PREDICTIVE_LEAD_SCORING_FIELD_LABELS);
        return this;
    }

    /**
     * 设置「字符串中的线索评分频率字段」
     * @param val
     */
    @JsonProperty(FIELD_PREDICTIVE_LEAD_SCORING_FIELDS_STR)
    public ResConfigSettingsDTO setPredictiveLeadScoringFieldsStr(String val) {
        this._set(FIELD_PREDICTIVE_LEAD_SCORING_FIELDS_STR, val);
        return this;
    }

    /**
     * 获取「字符串中的线索评分频率字段」值
     *
     */
    @JsonIgnore
    public String getPredictiveLeadScoringFieldsStr() {
        return DataTypeUtils.asString(this._get(FIELD_PREDICTIVE_LEAD_SCORING_FIELDS_STR), null);
    }

    /**
     * 判断 「字符串中的线索评分频率字段」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPredictiveLeadScoringFieldsStr() {
        return this._contains(FIELD_PREDICTIVE_LEAD_SCORING_FIELDS_STR);
    }

    /**
     * 重置 「字符串中的线索评分频率字段」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetPredictiveLeadScoringFieldsStr() {
        this._reset(FIELD_PREDICTIVE_LEAD_SCORING_FIELDS_STR);
        return this;
    }

    /**
     * 设置「线索评分开始日期」
     * @param val
     */
    @JsonProperty(FIELD_PREDICTIVE_LEAD_SCORING_START_DATE)
    public ResConfigSettingsDTO setPredictiveLeadScoringStartDate(Timestamp val) {
        this._set(FIELD_PREDICTIVE_LEAD_SCORING_START_DATE, val);
        return this;
    }

    /**
     * 获取「线索评分开始日期」值
     *
     */
    @JsonIgnore
    public Timestamp getPredictiveLeadScoringStartDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_PREDICTIVE_LEAD_SCORING_START_DATE), null);
    }

    /**
     * 判断 「线索评分开始日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPredictiveLeadScoringStartDate() {
        return this._contains(FIELD_PREDICTIVE_LEAD_SCORING_START_DATE);
    }

    /**
     * 重置 「线索评分开始日期」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetPredictiveLeadScoringStartDate() {
        this._reset(FIELD_PREDICTIVE_LEAD_SCORING_START_DATE);
        return this;
    }

    /**
     * 设置「字符串中的线索评分开始日期」
     * @param val
     */
    @JsonProperty(FIELD_PREDICTIVE_LEAD_SCORING_START_DATE_STR)
    public ResConfigSettingsDTO setPredictiveLeadScoringStartDateStr(String val) {
        this._set(FIELD_PREDICTIVE_LEAD_SCORING_START_DATE_STR, val);
        return this;
    }

    /**
     * 获取「字符串中的线索评分开始日期」值
     *
     */
    @JsonIgnore
    public String getPredictiveLeadScoringStartDateStr() {
        return DataTypeUtils.asString(this._get(FIELD_PREDICTIVE_LEAD_SCORING_START_DATE_STR), null);
    }

    /**
     * 判断 「字符串中的线索评分开始日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPredictiveLeadScoringStartDateStr() {
        return this._contains(FIELD_PREDICTIVE_LEAD_SCORING_START_DATE_STR);
    }

    /**
     * 重置 「字符串中的线索评分开始日期」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetPredictiveLeadScoringStartDateStr() {
        this._reset(FIELD_PREDICTIVE_LEAD_SCORING_START_DATE_STR);
        return this;
    }

    /**
     * 设置「Display preview button」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_PREVIEW_READY)
    public ResConfigSettingsDTO setPreviewReady(Integer val) {
        this._set(FIELD_PREVIEW_READY, val);
        return this;
    }

    /**
     * 获取「Display preview button」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getPreviewReady() {
        return DataTypeUtils.asInteger(this._get(FIELD_PREVIEW_READY), null);
    }

    /**
     * 判断 「Display preview button」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPreviewReady() {
        return this._contains(FIELD_PREVIEW_READY);
    }

    /**
     * 重置 「Display preview button」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetPreviewReady() {
        this._reset(FIELD_PREVIEW_READY);
        return this;
    }

    /**
     * 设置「体积单位」
     * 代码表[体积单位]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_config_settings_product_volume_volume_in_cubic_feet
     * @param val
     */
    @JsonProperty(FIELD_PRODUCT_VOLUME_VOLUME_IN_CUBIC_FEET)
    public ResConfigSettingsDTO setProductVolumeVolumeInCubicFeet(String val) {
        this._set(FIELD_PRODUCT_VOLUME_VOLUME_IN_CUBIC_FEET, val);
        return this;
    }

    /**
     * 获取「体积单位」值
     * 代码表[体积单位]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_config_settings_product_volume_volume_in_cubic_feet
     *
     */
    @JsonIgnore
    public String getProductVolumeVolumeInCubicFeet() {
        return DataTypeUtils.asString(this._get(FIELD_PRODUCT_VOLUME_VOLUME_IN_CUBIC_FEET), null);
    }

    /**
     * 判断 「体积单位」是否有值
     *
     */
    @JsonIgnore
    public boolean containsProductVolumeVolumeInCubicFeet() {
        return this._contains(FIELD_PRODUCT_VOLUME_VOLUME_IN_CUBIC_FEET);
    }

    /**
     * 重置 「体积单位」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetProductVolumeVolumeInCubicFeet() {
        this._reset(FIELD_PRODUCT_VOLUME_VOLUME_IN_CUBIC_FEET);
        return this;
    }

    /**
     * 设置「重量单位」
     * 代码表[重量单位]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_config_settings_product_weight_in_lbs
     * @param val
     */
    @JsonProperty(FIELD_PRODUCT_WEIGHT_IN_LBS)
    public ResConfigSettingsDTO setProductWeightInLbs(String val) {
        this._set(FIELD_PRODUCT_WEIGHT_IN_LBS, val);
        return this;
    }

    /**
     * 获取「重量单位」值
     * 代码表[重量单位]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_config_settings_product_weight_in_lbs
     *
     */
    @JsonIgnore
    public String getProductWeightInLbs() {
        return DataTypeUtils.asString(this._get(FIELD_PRODUCT_WEIGHT_IN_LBS), null);
    }

    /**
     * 判断 「重量单位」是否有值
     *
     */
    @JsonIgnore
    public boolean containsProductWeightInLbs() {
        return this._contains(FIELD_PRODUCT_WEIGHT_IN_LBS);
    }

    /**
     * 重置 「重量单位」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetProductWeightInLbs() {
        this._reset(FIELD_PRODUCT_WEIGHT_IN_LBS);
        return this;
    }

    /**
     * 设置「启用分析直到」
     * @param val
     */
    @JsonProperty(FIELD_PROFILING_ENABLED_UNTIL)
    public ResConfigSettingsDTO setProfilingEnabledUntil(Timestamp val) {
        this._set(FIELD_PROFILING_ENABLED_UNTIL, val);
        return this;
    }

    /**
     * 获取「启用分析直到」值
     *
     */
    @JsonIgnore
    public Timestamp getProfilingEnabledUntil() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_PROFILING_ENABLED_UNTIL), null);
    }

    /**
     * 判断 「启用分析直到」是否有值
     *
     */
    @JsonIgnore
    public boolean containsProfilingEnabledUntil() {
        return this._contains(FIELD_PROFILING_ENABLED_UNTIL);
    }

    /**
     * 重置 「启用分析直到」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetProfilingEnabledUntil() {
        this._reset(FIELD_PROFILING_ENABLED_UNTIL);
        return this;
    }

    /**
     * 设置「限制模板渲染」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_RESTRICT_TEMPLATE_RENDERING)
    public ResConfigSettingsDTO setRestrictTemplateRendering(Integer val) {
        this._set(FIELD_RESTRICT_TEMPLATE_RENDERING, val);
        return this;
    }

    /**
     * 获取「限制模板渲染」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getRestrictTemplateRendering() {
        return DataTypeUtils.asInteger(this._get(FIELD_RESTRICT_TEMPLATE_RENDERING), null);
    }

    /**
     * 判断 「限制模板渲染」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRestrictTemplateRendering() {
        return this._contains(FIELD_RESTRICT_TEMPLATE_RENDERING);
    }

    /**
     * 重置 「限制模板渲染」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetRestrictTemplateRendering() {
        this._reset(FIELD_RESTRICT_TEMPLATE_RENDERING);
        return this;
    }

    /**
     * 设置「SFU 服务器密钥」
     * @param val
     */
    @JsonProperty(FIELD_SFU_SERVER_KEY)
    public ResConfigSettingsDTO setSfuServerKey(String val) {
        this._set(FIELD_SFU_SERVER_KEY, val);
        return this;
    }

    /**
     * 获取「SFU 服务器密钥」值
     *
     */
    @JsonIgnore
    public String getSfuServerKey() {
        return DataTypeUtils.asString(this._get(FIELD_SFU_SERVER_KEY), null);
    }

    /**
     * 判断 「SFU 服务器密钥」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSfuServerKey() {
        return this._contains(FIELD_SFU_SERVER_KEY);
    }

    /**
     * 重置 「SFU 服务器密钥」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetSfuServerKey() {
        this._reset(FIELD_SFU_SERVER_KEY);
        return this;
    }

    /**
     * 设置「SFU 服务器 URL」
     * @param val
     */
    @JsonProperty(FIELD_SFU_SERVER_URL)
    public ResConfigSettingsDTO setSfuServerUrl(String val) {
        this._set(FIELD_SFU_SERVER_URL, val);
        return this;
    }

    /**
     * 获取「SFU 服务器 URL」值
     *
     */
    @JsonIgnore
    public String getSfuServerUrl() {
        return DataTypeUtils.asString(this._get(FIELD_SFU_SERVER_URL), null);
    }

    /**
     * 判断 「SFU 服务器 URL」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSfuServerUrl() {
        return this._contains(FIELD_SFU_SERVER_URL);
    }

    /**
     * 重置 「SFU 服务器 URL」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetSfuServerUrl() {
        this._reset(FIELD_SFU_SERVER_URL);
        return this;
    }

    /**
     * 设置「退订时黑名单选项」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_SHOW_BLACKLIST_BUTTONS)
    public ResConfigSettingsDTO setShowBlacklistButtons(Integer val) {
        this._set(FIELD_SHOW_BLACKLIST_BUTTONS, val);
        return this;
    }

    /**
     * 获取「退订时黑名单选项」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getShowBlacklistButtons() {
        return DataTypeUtils.asInteger(this._get(FIELD_SHOW_BLACKLIST_BUTTONS), null);
    }

    /**
     * 判断 「退订时黑名单选项」是否有值
     *
     */
    @JsonIgnore
    public boolean containsShowBlacklistButtons() {
        return this._contains(FIELD_SHOW_BLACKLIST_BUTTONS);
    }

    /**
     * 重置 「退订时黑名单选项」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetShowBlacklistButtons() {
        this._reset(FIELD_SHOW_BLACKLIST_BUTTONS);
        return this;
    }

    /**
     * 设置「显示效果」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_SHOW_EFFECT)
    public ResConfigSettingsDTO setShowEffect(Integer val) {
        this._set(FIELD_SHOW_EFFECT, val);
        return this;
    }

    /**
     * 获取「显示效果」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getShowEffect() {
        return DataTypeUtils.asInteger(this._get(FIELD_SHOW_EFFECT), null);
    }

    /**
     * 判断 「显示效果」是否有值
     *
     */
    @JsonIgnore
    public boolean containsShowEffect() {
        return this._contains(FIELD_SHOW_EFFECT);
    }

    /**
     * 重置 「显示效果」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetShowEffect() {
        this._reset(FIELD_SHOW_EFFECT);
        return this;
    }

    /**
     * 设置「蜗牛邮件封面只读」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_SNAILMAIL_COVER_READONLY)
    public ResConfigSettingsDTO setSnailmailCoverReadonly(Integer val) {
        this._set(FIELD_SNAILMAIL_COVER_READONLY, val);
        return this;
    }

    /**
     * 获取「蜗牛邮件封面只读」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getSnailmailCoverReadonly() {
        return DataTypeUtils.asInteger(this._get(FIELD_SNAILMAIL_COVER_READONLY), null);
    }

    /**
     * 判断 「蜗牛邮件封面只读」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSnailmailCoverReadonly() {
        return this._contains(FIELD_SNAILMAIL_COVER_READONLY);
    }

    /**
     * 重置 「蜗牛邮件封面只读」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetSnailmailCoverReadonly() {
        this._reset(FIELD_SNAILMAIL_COVER_READONLY);
        return this;
    }

    /**
     * 设置「Tenor API 密钥」
     * @param val
     */
    @JsonProperty(FIELD_TENOR_API_KEY)
    public ResConfigSettingsDTO setTenorApiKey(String val) {
        this._set(FIELD_TENOR_API_KEY, val);
        return this;
    }

    /**
     * 获取「Tenor API 密钥」值
     *
     */
    @JsonIgnore
    public String getTenorApiKey() {
        return DataTypeUtils.asString(this._get(FIELD_TENOR_API_KEY), null);
    }

    /**
     * 判断 「Tenor API 密钥」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTenorApiKey() {
        return this._contains(FIELD_TENOR_API_KEY);
    }

    /**
     * 重置 「Tenor API 密钥」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetTenorApiKey() {
        this._reset(FIELD_TENOR_API_KEY);
        return this;
    }

    /**
     * 设置「Tenor 内容过滤器」
     * 代码表[Tenor 内容过滤器]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_config_settings_tenor_content_filter
     * @param val
     */
    @JsonProperty(FIELD_TENOR_CONTENT_FILTER)
    public ResConfigSettingsDTO setTenorContentFilter(String val) {
        this._set(FIELD_TENOR_CONTENT_FILTER, val);
        return this;
    }

    /**
     * 获取「Tenor 内容过滤器」值
     * 代码表[Tenor 内容过滤器]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_config_settings_tenor_content_filter
     *
     */
    @JsonIgnore
    public String getTenorContentFilter() {
        return DataTypeUtils.asString(this._get(FIELD_TENOR_CONTENT_FILTER), null);
    }

    /**
     * 判断 「Tenor 内容过滤器」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTenorContentFilter() {
        return this._contains(FIELD_TENOR_CONTENT_FILTER);
    }

    /**
     * 重置 「Tenor 内容过滤器」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetTenorContentFilter() {
        this._reset(FIELD_TENOR_CONTENT_FILTER);
        return this;
    }

    /**
     * 设置「Tenor Gif 限额」
     * @param val
     */
    @JsonProperty(FIELD_TENOR_GIF_LIMIT)
    public ResConfigSettingsDTO setTenorGifLimit(Integer val) {
        this._set(FIELD_TENOR_GIF_LIMIT, val);
        return this;
    }

    /**
     * 获取「Tenor Gif 限额」值
     *
     */
    @JsonIgnore
    public Integer getTenorGifLimit() {
        return DataTypeUtils.asInteger(this._get(FIELD_TENOR_GIF_LIMIT), null);
    }

    /**
     * 判断 「Tenor Gif 限额」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTenorGifLimit() {
        return this._contains(FIELD_TENOR_GIF_LIMIT);
    }

    /**
     * 重置 「Tenor Gif 限额」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetTenorGifLimit() {
        this._reset(FIELD_TENOR_GIF_LIMIT);
        return this;
    }

    /**
     * 设置「Twilio 帐户 SID」
     * @param val
     */
    @JsonProperty(FIELD_TWILIO_ACCOUNT_SID)
    public ResConfigSettingsDTO setTwilioAccountSid(String val) {
        this._set(FIELD_TWILIO_ACCOUNT_SID, val);
        return this;
    }

    /**
     * 获取「Twilio 帐户 SID」值
     *
     */
    @JsonIgnore
    public String getTwilioAccountSid() {
        return DataTypeUtils.asString(this._get(FIELD_TWILIO_ACCOUNT_SID), null);
    }

    /**
     * 判断 「Twilio 帐户 SID」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTwilioAccountSid() {
        return this._contains(FIELD_TWILIO_ACCOUNT_SID);
    }

    /**
     * 重置 「Twilio 帐户 SID」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetTwilioAccountSid() {
        this._reset(FIELD_TWILIO_ACCOUNT_SID);
        return this;
    }

    /**
     * 设置「Twilio 帐户身份验证令牌」
     * @param val
     */
    @JsonProperty(FIELD_TWILIO_ACCOUNT_TOKEN)
    public ResConfigSettingsDTO setTwilioAccountToken(String val) {
        this._set(FIELD_TWILIO_ACCOUNT_TOKEN, val);
        return this;
    }

    /**
     * 获取「Twilio 帐户身份验证令牌」值
     *
     */
    @JsonIgnore
    public String getTwilioAccountToken() {
        return DataTypeUtils.asString(this._get(FIELD_TWILIO_ACCOUNT_TOKEN), null);
    }

    /**
     * 判断 「Twilio 帐户身份验证令牌」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTwilioAccountToken() {
        return this._contains(FIELD_TWILIO_ACCOUNT_TOKEN);
    }

    /**
     * 重置 「Twilio 帐户身份验证令牌」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetTwilioAccountToken() {
        this._reset(FIELD_TWILIO_ACCOUNT_TOKEN);
        return this;
    }

    /**
     * 设置「访问秘钥」
     * @param val
     */
    @JsonProperty(FIELD_UNSPLASH_ACCESS_KEY)
    public ResConfigSettingsDTO setUnsplashAccessKey(String val) {
        this._set(FIELD_UNSPLASH_ACCESS_KEY, val);
        return this;
    }

    /**
     * 获取「访问秘钥」值
     *
     */
    @JsonIgnore
    public String getUnsplashAccessKey() {
        return DataTypeUtils.asString(this._get(FIELD_UNSPLASH_ACCESS_KEY), null);
    }

    /**
     * 判断 「访问秘钥」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUnsplashAccessKey() {
        return this._contains(FIELD_UNSPLASH_ACCESS_KEY);
    }

    /**
     * 重置 「访问秘钥」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetUnsplashAccessKey() {
        this._reset(FIELD_UNSPLASH_ACCESS_KEY);
        return this;
    }

    /**
     * 设置「应用程序ID」
     * @param val
     */
    @JsonProperty(FIELD_UNSPLASH_APP_ID)
    public ResConfigSettingsDTO setUnsplashAppId(String val) {
        this._set(FIELD_UNSPLASH_APP_ID, val);
        return this;
    }

    /**
     * 获取「应用程序ID」值
     *
     */
    @JsonIgnore
    public String getUnsplashAppId() {
        return DataTypeUtils.asString(this._get(FIELD_UNSPLASH_APP_ID), null);
    }

    /**
     * 判断 「应用程序ID」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUnsplashAppId() {
        return this._contains(FIELD_UNSPLASH_APP_ID);
    }

    /**
     * 重置 「应用程序ID」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetUnsplashAppId() {
        this._reset(FIELD_UNSPLASH_APP_ID);
        return this;
    }

    /**
     * 设置「默认条款和条件」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_USE_INVOICE_TERMS)
    public ResConfigSettingsDTO setUseInvoiceTerms(Integer val) {
        this._set(FIELD_USE_INVOICE_TERMS, val);
        return this;
    }

    /**
     * 获取「默认条款和条件」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getUseInvoiceTerms() {
        return DataTypeUtils.asInteger(this._get(FIELD_USE_INVOICE_TERMS), null);
    }

    /**
     * 判断 「默认条款和条件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUseInvoiceTerms() {
        return this._contains(FIELD_USE_INVOICE_TERMS);
    }

    /**
     * 重置 「默认条款和条件」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetUseInvoiceTerms() {
        this._reset(FIELD_USE_INVOICE_TERMS);
        return this;
    }

    /**
     * 设置「默认制造提前期」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_USE_MANUFACTURING_LEAD)
    public ResConfigSettingsDTO setUseManufacturingLead(Integer val) {
        this._set(FIELD_USE_MANUFACTURING_LEAD, val);
        return this;
    }

    /**
     * 获取「默认制造提前期」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getUseManufacturingLead() {
        return DataTypeUtils.asInteger(this._get(FIELD_USE_MANUFACTURING_LEAD), null);
    }

    /**
     * 判断 「默认制造提前期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUseManufacturingLead() {
        return this._contains(FIELD_USE_MANUFACTURING_LEAD);
    }

    /**
     * 重置 「默认制造提前期」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetUseManufacturingLead() {
        this._reset(FIELD_USE_MANUFACTURING_LEAD);
        return this;
    }

    /**
     * 设置「安全交货时间」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_USE_PO_LEAD)
    public ResConfigSettingsDTO setUsePoLead(Integer val) {
        this._set(FIELD_USE_PO_LEAD, val);
        return this;
    }

    /**
     * 获取「安全交货时间」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getUsePoLead() {
        return DataTypeUtils.asInteger(this._get(FIELD_USE_PO_LEAD), null);
    }

    /**
     * 判断 「安全交货时间」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUsePoLead() {
        return this._contains(FIELD_USE_PO_LEAD);
    }

    /**
     * 重置 「安全交货时间」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetUsePoLead() {
        this._reset(FIELD_USE_PO_LEAD);
        return this;
    }

    /**
     * 设置「销售的安全提前期」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_USE_SECURITY_LEAD)
    public ResConfigSettingsDTO setUseSecurityLead(Integer val) {
        this._set(FIELD_USE_SECURITY_LEAD, val);
        return this;
    }

    /**
     * 获取「销售的安全提前期」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getUseSecurityLead() {
        return DataTypeUtils.asInteger(this._get(FIELD_USE_SECURITY_LEAD), null);
    }

    /**
     * 判断 「销售的安全提前期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUseSecurityLead() {
        return this._contains(FIELD_USE_SECURITY_LEAD);
    }

    /**
     * 重置 「销售的安全提前期」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetUseSecurityLead() {
        this._reset(FIELD_USE_SECURITY_LEAD);
        return this;
    }

    /**
     * 设置「使用 Twilio ICE 服务器」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_USE_TWILIO_RTC_SERVERS)
    public ResConfigSettingsDTO setUseTwilioRtcServers(Integer val) {
        this._set(FIELD_USE_TWILIO_RTC_SERVERS, val);
        return this;
    }

    /**
     * 获取「使用 Twilio ICE 服务器」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getUseTwilioRtcServers() {
        return DataTypeUtils.asInteger(this._get(FIELD_USE_TWILIO_RTC_SERVERS), null);
    }

    /**
     * 判断 「使用 Twilio ICE 服务器」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUseTwilioRtcServers() {
        return this._contains(FIELD_USE_TWILIO_RTC_SERVERS);
    }

    /**
     * 重置 「使用 Twilio ICE 服务器」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetUseTwilioRtcServers() {
        this._reset(FIELD_USE_TWILIO_RTC_SERVERS);
        return this;
    }

    /**
     * 设置「默认访问权限」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_USER_DEFAULT_RIGHTS)
    public ResConfigSettingsDTO setUserDefaultRights(Integer val) {
        this._set(FIELD_USER_DEFAULT_RIGHTS, val);
        return this;
    }

    /**
     * 获取「默认访问权限」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getUserDefaultRights() {
        return DataTypeUtils.asInteger(this._get(FIELD_USER_DEFAULT_RIGHTS), null);
    }

    /**
     * 判断 「默认访问权限」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUserDefaultRights() {
        return this._contains(FIELD_USER_DEFAULT_RIGHTS);
    }

    /**
     * 重置 「默认访问权限」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetUserDefaultRights() {
        this._reset(FIELD_USER_DEFAULT_RIGHTS);
        return this;
    }

    /**
     * 设置「网络应用程序名称」
     * @param val
     */
    @JsonProperty(FIELD_WEB_APP_NAME)
    public ResConfigSettingsDTO setWebAppName(String val) {
        this._set(FIELD_WEB_APP_NAME, val);
        return this;
    }

    /**
     * 获取「网络应用程序名称」值
     *
     */
    @JsonIgnore
    public String getWebAppName() {
        return DataTypeUtils.asString(this._get(FIELD_WEB_APP_NAME), null);
    }

    /**
     * 判断 「网络应用程序名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWebAppName() {
        return this._contains(FIELD_WEB_APP_NAME);
    }

    /**
     * 重置 「网络应用程序名称」
     *
     */
    @JsonIgnore
    public ResConfigSettingsDTO resetWebAppName() {
        this._reset(FIELD_WEB_APP_NAME);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public ResConfigSettingsDTO setWriteDate(Timestamp val) {
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
    public ResConfigSettingsDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public ResConfigSettingsDTO setWriteUid(String val) {
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
    public ResConfigSettingsDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
