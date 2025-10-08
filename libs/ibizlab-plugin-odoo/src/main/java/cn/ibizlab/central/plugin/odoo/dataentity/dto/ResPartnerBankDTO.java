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


public class ResPartnerBankDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: null
     */
    public final static String FIELD_ABA_ROUTING = "aba_routing";

    /**
     * 属性: 账户持有人姓名
     */
    public final static String FIELD_ACC_HOLDER_NAME = "acc_holder_name";

    /**
     * 属性: 账户编号
     */
    public final static String FIELD_ACC_NUMBER = "acc_number";

    /**
     * 属性: 有效
     */
    public final static String FIELD_ACTIVE = "active";

    /**
     * 属性: 下一活动截止日期
     */
    public final static String FIELD_ACTIVITY_DATE_DEADLINE = "activity_date_deadline";

    /**
     * 属性: Activity Exception Decoration
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
     * 属性: 转出资金
     */
    public final static String FIELD_ALLOW_OUT_PAYMENT = "allow_out_payment";

    /**
     * 属性: 银行
     */
    public final static String FIELD_BANK_ID = "bank_id";

    /**
     * 属性: 公司
     */
    public final static String FIELD_COMPANY_ID = "company_id";

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
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 有Iban警告消息
     */
    public final static String FIELD_HAS_IBAN_WARNING = "has_iban_warning";

    /**
     * 属性: 有消息
     */
    public final static String FIELD_HAS_MESSAGE = "has_message";

    /**
     * 属性: 有资金转账警告消息
     */
    public final static String FIELD_HAS_MONEY_TRANSFER_WARNING = "has_money_transfer_warning";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 锁定信任字段
     */
    public final static String FIELD_LOCK_TRUST_FIELDS = "lock_trust_fields";

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
     * 属性: Money Transfer Service
     */
    public final static String FIELD_MONEY_TRANSFER_SERVICE = "money_transfer_service";

    /**
     * 属性: 我的活动截止时间
     */
    public final static String FIELD_MY_ACTIVITY_DATE_DEADLINE = "my_activity_date_deadline";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 账户持有者
     */
    public final static String FIELD_PARTNER_ID = "partner_id";

    /**
     * 属性: 消毒账号
     */
    public final static String FIELD_SANITIZED_ACC_NUMBER = "sanitized_acc_number";

    /**
     * 属性: 序列
     */
    public final static String FIELD_SEQUENCE = "sequence";

    /**
     * 属性: 用户有验证银行账户的群组
     */
    public final static String FIELD_USER_HAS_GROUP_VALIDATE_BANK_ACCOUNT = "user_has_group_validate_bank_account";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「null」
     * @param val
     */
    @JsonProperty(FIELD_ABA_ROUTING)
    public ResPartnerBankDTO setAbaRouting(String val) {
        this._set(FIELD_ABA_ROUTING, val);
        return this;
    }

    /**
     * 获取「null」值
     *
     */
    @JsonIgnore
    public String getAbaRouting() {
        return DataTypeUtils.asString(this._get(FIELD_ABA_ROUTING), null);
    }

    /**
     * 判断 「null」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAbaRouting() {
        return this._contains(FIELD_ABA_ROUTING);
    }

    /**
     * 重置 「null」
     *
     */
    @JsonIgnore
    public ResPartnerBankDTO resetAbaRouting() {
        this._reset(FIELD_ABA_ROUTING);
        return this;
    }

    /**
     * 设置「账户持有人姓名」
     * @param val
     */
    @JsonProperty(FIELD_ACC_HOLDER_NAME)
    public ResPartnerBankDTO setAccHolderName(String val) {
        this._set(FIELD_ACC_HOLDER_NAME, val);
        return this;
    }

    /**
     * 获取「账户持有人姓名」值
     *
     */
    @JsonIgnore
    public String getAccHolderName() {
        return DataTypeUtils.asString(this._get(FIELD_ACC_HOLDER_NAME), null);
    }

    /**
     * 判断 「账户持有人姓名」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAccHolderName() {
        return this._contains(FIELD_ACC_HOLDER_NAME);
    }

    /**
     * 重置 「账户持有人姓名」
     *
     */
    @JsonIgnore
    public ResPartnerBankDTO resetAccHolderName() {
        this._reset(FIELD_ACC_HOLDER_NAME);
        return this;
    }

    /**
     * 设置「账户编号」
     * @param val
     */
    @JsonProperty(FIELD_ACC_NUMBER)
    public ResPartnerBankDTO setAccNumber(String val) {
        this._set(FIELD_ACC_NUMBER, val);
        return this;
    }

    /**
     * 获取「账户编号」值
     *
     */
    @JsonIgnore
    public String getAccNumber() {
        return DataTypeUtils.asString(this._get(FIELD_ACC_NUMBER), null);
    }

    /**
     * 判断 「账户编号」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAccNumber() {
        return this._contains(FIELD_ACC_NUMBER);
    }

    /**
     * 重置 「账户编号」
     *
     */
    @JsonIgnore
    public ResPartnerBankDTO resetAccNumber() {
        this._reset(FIELD_ACC_NUMBER);
        return this;
    }

    /**
     * 设置「有效」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ACTIVE)
    public ResPartnerBankDTO setActive(Integer val) {
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
    public ResPartnerBankDTO resetActive() {
        this._reset(FIELD_ACTIVE);
        return this;
    }

    /**
     * 设置「下一活动截止日期」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_DATE_DEADLINE)
    public ResPartnerBankDTO setActivityDateDeadline(Timestamp val) {
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
    public ResPartnerBankDTO resetActivityDateDeadline() {
        this._reset(FIELD_ACTIVITY_DATE_DEADLINE);
        return this;
    }

    /**
     * 设置「Activity Exception Decoration」
     * 代码表[Activity Exception Decoration]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_bank_activity_exception_decoration
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_EXCEPTION_DECORATION)
    public ResPartnerBankDTO setActivityExceptionDecoration(String val) {
        this._set(FIELD_ACTIVITY_EXCEPTION_DECORATION, val);
        return this;
    }

    /**
     * 获取「Activity Exception Decoration」值
     * 代码表[Activity Exception Decoration]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_bank_activity_exception_decoration
     *
     */
    @JsonIgnore
    public String getActivityExceptionDecoration() {
        return DataTypeUtils.asString(this._get(FIELD_ACTIVITY_EXCEPTION_DECORATION), null);
    }

    /**
     * 判断 「Activity Exception Decoration」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActivityExceptionDecoration() {
        return this._contains(FIELD_ACTIVITY_EXCEPTION_DECORATION);
    }

    /**
     * 重置 「Activity Exception Decoration」
     *
     */
    @JsonIgnore
    public ResPartnerBankDTO resetActivityExceptionDecoration() {
        this._reset(FIELD_ACTIVITY_EXCEPTION_DECORATION);
        return this;
    }

    /**
     * 设置「图标」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_EXCEPTION_ICON)
    public ResPartnerBankDTO setActivityExceptionIcon(String val) {
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
    public ResPartnerBankDTO resetActivityExceptionIcon() {
        this._reset(FIELD_ACTIVITY_EXCEPTION_ICON);
        return this;
    }

    /**
     * 设置「活动状态」
     * 代码表[活动状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_bank_activity_state
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_STATE)
    public ResPartnerBankDTO setActivityState(String val) {
        this._set(FIELD_ACTIVITY_STATE, val);
        return this;
    }

    /**
     * 获取「活动状态」值
     * 代码表[活动状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.res_partner_bank_activity_state
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
    public ResPartnerBankDTO resetActivityState() {
        this._reset(FIELD_ACTIVITY_STATE);
        return this;
    }

    /**
     * 设置「转出资金」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ALLOW_OUT_PAYMENT)
    public ResPartnerBankDTO setAllowOutPayment(Integer val) {
        this._set(FIELD_ALLOW_OUT_PAYMENT, val);
        return this;
    }

    /**
     * 获取「转出资金」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getAllowOutPayment() {
        return DataTypeUtils.asInteger(this._get(FIELD_ALLOW_OUT_PAYMENT), null);
    }

    /**
     * 判断 「转出资金」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAllowOutPayment() {
        return this._contains(FIELD_ALLOW_OUT_PAYMENT);
    }

    /**
     * 重置 「转出资金」
     *
     */
    @JsonIgnore
    public ResPartnerBankDTO resetAllowOutPayment() {
        this._reset(FIELD_ALLOW_OUT_PAYMENT);
        return this;
    }

    /**
     * 设置「银行」
     * @param val
     */
    @JsonProperty(FIELD_BANK_ID)
    public ResPartnerBankDTO setBankId(String val) {
        this._set(FIELD_BANK_ID, val);
        return this;
    }

    /**
     * 获取「银行」值
     *
     */
    @JsonIgnore
    public String getBankId() {
        return DataTypeUtils.asString(this._get(FIELD_BANK_ID), null);
    }

    /**
     * 判断 「银行」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBankId() {
        return this._contains(FIELD_BANK_ID);
    }

    /**
     * 重置 「银行」
     *
     */
    @JsonIgnore
    public ResPartnerBankDTO resetBankId() {
        this._reset(FIELD_BANK_ID);
        return this;
    }

    /**
     * 设置「公司」
     * @param val
     */
    @JsonProperty(FIELD_COMPANY_ID)
    public ResPartnerBankDTO setCompanyId(String val) {
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
    public ResPartnerBankDTO resetCompanyId() {
        this._reset(FIELD_COMPANY_ID);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public ResPartnerBankDTO setCreateDate(Timestamp val) {
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
    public ResPartnerBankDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public ResPartnerBankDTO setCreateUid(String val) {
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
    public ResPartnerBankDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「币别」
     * @param val
     */
    @JsonProperty(FIELD_CURRENCY_ID)
    public ResPartnerBankDTO setCurrencyId(String val) {
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
    public ResPartnerBankDTO resetCurrencyId() {
        this._reset(FIELD_CURRENCY_ID);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public ResPartnerBankDTO setDisplayName(String val) {
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
    public ResPartnerBankDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「有Iban警告消息」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_HAS_IBAN_WARNING)
    public ResPartnerBankDTO setHasIbanWarning(Integer val) {
        this._set(FIELD_HAS_IBAN_WARNING, val);
        return this;
    }

    /**
     * 获取「有Iban警告消息」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getHasIbanWarning() {
        return DataTypeUtils.asInteger(this._get(FIELD_HAS_IBAN_WARNING), null);
    }

    /**
     * 判断 「有Iban警告消息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHasIbanWarning() {
        return this._contains(FIELD_HAS_IBAN_WARNING);
    }

    /**
     * 重置 「有Iban警告消息」
     *
     */
    @JsonIgnore
    public ResPartnerBankDTO resetHasIbanWarning() {
        this._reset(FIELD_HAS_IBAN_WARNING);
        return this;
    }

    /**
     * 设置「有消息」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_HAS_MESSAGE)
    public ResPartnerBankDTO setHasMessage(Integer val) {
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
    public ResPartnerBankDTO resetHasMessage() {
        this._reset(FIELD_HAS_MESSAGE);
        return this;
    }

    /**
     * 设置「有资金转账警告消息」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_HAS_MONEY_TRANSFER_WARNING)
    public ResPartnerBankDTO setHasMoneyTransferWarning(Integer val) {
        this._set(FIELD_HAS_MONEY_TRANSFER_WARNING, val);
        return this;
    }

    /**
     * 获取「有资金转账警告消息」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getHasMoneyTransferWarning() {
        return DataTypeUtils.asInteger(this._get(FIELD_HAS_MONEY_TRANSFER_WARNING), null);
    }

    /**
     * 判断 「有资金转账警告消息」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHasMoneyTransferWarning() {
        return this._contains(FIELD_HAS_MONEY_TRANSFER_WARNING);
    }

    /**
     * 重置 「有资金转账警告消息」
     *
     */
    @JsonIgnore
    public ResPartnerBankDTO resetHasMoneyTransferWarning() {
        this._reset(FIELD_HAS_MONEY_TRANSFER_WARNING);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public ResPartnerBankDTO setId(String val) {
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
    public ResPartnerBankDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「锁定信任字段」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_LOCK_TRUST_FIELDS)
    public ResPartnerBankDTO setLockTrustFields(Integer val) {
        this._set(FIELD_LOCK_TRUST_FIELDS, val);
        return this;
    }

    /**
     * 获取「锁定信任字段」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getLockTrustFields() {
        return DataTypeUtils.asInteger(this._get(FIELD_LOCK_TRUST_FIELDS), null);
    }

    /**
     * 判断 「锁定信任字段」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLockTrustFields() {
        return this._contains(FIELD_LOCK_TRUST_FIELDS);
    }

    /**
     * 重置 「锁定信任字段」
     *
     */
    @JsonIgnore
    public ResPartnerBankDTO resetLockTrustFields() {
        this._reset(FIELD_LOCK_TRUST_FIELDS);
        return this;
    }

    /**
     * 设置「Attachment Count」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_ATTACHMENT_COUNT)
    public ResPartnerBankDTO setMessageAttachmentCount(Integer val) {
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
    public ResPartnerBankDTO resetMessageAttachmentCount() {
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
    public ResPartnerBankDTO setMessageHasError(Integer val) {
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
    public ResPartnerBankDTO resetMessageHasError() {
        this._reset(FIELD_MESSAGE_HAS_ERROR);
        return this;
    }

    /**
     * 设置「错误数量」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_HAS_ERROR_COUNTER)
    public ResPartnerBankDTO setMessageHasErrorCounter(Integer val) {
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
    public ResPartnerBankDTO resetMessageHasErrorCounter() {
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
    public ResPartnerBankDTO setMessageHasSmsError(Integer val) {
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
    public ResPartnerBankDTO resetMessageHasSmsError() {
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
    public ResPartnerBankDTO setMessageIsFollower(Integer val) {
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
    public ResPartnerBankDTO resetMessageIsFollower() {
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
    public ResPartnerBankDTO setMessageNeedaction(Integer val) {
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
    public ResPartnerBankDTO resetMessageNeedaction() {
        this._reset(FIELD_MESSAGE_NEEDACTION);
        return this;
    }

    /**
     * 设置「操作数量」
     * @param val
     */
    @JsonProperty(FIELD_MESSAGE_NEEDACTION_COUNTER)
    public ResPartnerBankDTO setMessageNeedactionCounter(Integer val) {
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
    public ResPartnerBankDTO resetMessageNeedactionCounter() {
        this._reset(FIELD_MESSAGE_NEEDACTION_COUNTER);
        return this;
    }

    /**
     * 设置「Money Transfer Service」
     * @param val
     */
    @JsonProperty(FIELD_MONEY_TRANSFER_SERVICE)
    public ResPartnerBankDTO setMoneyTransferService(String val) {
        this._set(FIELD_MONEY_TRANSFER_SERVICE, val);
        return this;
    }

    /**
     * 获取「Money Transfer Service」值
     *
     */
    @JsonIgnore
    public String getMoneyTransferService() {
        return DataTypeUtils.asString(this._get(FIELD_MONEY_TRANSFER_SERVICE), null);
    }

    /**
     * 判断 「Money Transfer Service」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMoneyTransferService() {
        return this._contains(FIELD_MONEY_TRANSFER_SERVICE);
    }

    /**
     * 重置 「Money Transfer Service」
     *
     */
    @JsonIgnore
    public ResPartnerBankDTO resetMoneyTransferService() {
        this._reset(FIELD_MONEY_TRANSFER_SERVICE);
        return this;
    }

    /**
     * 设置「我的活动截止时间」
     * @param val
     */
    @JsonProperty(FIELD_MY_ACTIVITY_DATE_DEADLINE)
    public ResPartnerBankDTO setMyActivityDateDeadline(Timestamp val) {
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
    public ResPartnerBankDTO resetMyActivityDateDeadline() {
        this._reset(FIELD_MY_ACTIVITY_DATE_DEADLINE);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public ResPartnerBankDTO setName(String val) {
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
    public ResPartnerBankDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「账户持有者」
     * @param val
     */
    @JsonProperty(FIELD_PARTNER_ID)
    public ResPartnerBankDTO setPartnerId(String val) {
        this._set(FIELD_PARTNER_ID, val);
        return this;
    }

    /**
     * 获取「账户持有者」值
     *
     */
    @JsonIgnore
    public String getPartnerId() {
        return DataTypeUtils.asString(this._get(FIELD_PARTNER_ID), null);
    }

    /**
     * 判断 「账户持有者」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPartnerId() {
        return this._contains(FIELD_PARTNER_ID);
    }

    /**
     * 重置 「账户持有者」
     *
     */
    @JsonIgnore
    public ResPartnerBankDTO resetPartnerId() {
        this._reset(FIELD_PARTNER_ID);
        return this;
    }

    /**
     * 设置「消毒账号」
     * @param val
     */
    @JsonProperty(FIELD_SANITIZED_ACC_NUMBER)
    public ResPartnerBankDTO setSanitizedAccNumber(String val) {
        this._set(FIELD_SANITIZED_ACC_NUMBER, val);
        return this;
    }

    /**
     * 获取「消毒账号」值
     *
     */
    @JsonIgnore
    public String getSanitizedAccNumber() {
        return DataTypeUtils.asString(this._get(FIELD_SANITIZED_ACC_NUMBER), null);
    }

    /**
     * 判断 「消毒账号」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSanitizedAccNumber() {
        return this._contains(FIELD_SANITIZED_ACC_NUMBER);
    }

    /**
     * 重置 「消毒账号」
     *
     */
    @JsonIgnore
    public ResPartnerBankDTO resetSanitizedAccNumber() {
        this._reset(FIELD_SANITIZED_ACC_NUMBER);
        return this;
    }

    /**
     * 设置「序列」
     * @param val
     */
    @JsonProperty(FIELD_SEQUENCE)
    public ResPartnerBankDTO setSequence(Integer val) {
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
    public ResPartnerBankDTO resetSequence() {
        this._reset(FIELD_SEQUENCE);
        return this;
    }

    /**
     * 设置「用户有验证银行账户的群组」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_USER_HAS_GROUP_VALIDATE_BANK_ACCOUNT)
    public ResPartnerBankDTO setUserHasGroupValidateBankAccount(Integer val) {
        this._set(FIELD_USER_HAS_GROUP_VALIDATE_BANK_ACCOUNT, val);
        return this;
    }

    /**
     * 获取「用户有验证银行账户的群组」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getUserHasGroupValidateBankAccount() {
        return DataTypeUtils.asInteger(this._get(FIELD_USER_HAS_GROUP_VALIDATE_BANK_ACCOUNT), null);
    }

    /**
     * 判断 「用户有验证银行账户的群组」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUserHasGroupValidateBankAccount() {
        return this._contains(FIELD_USER_HAS_GROUP_VALIDATE_BANK_ACCOUNT);
    }

    /**
     * 重置 「用户有验证银行账户的群组」
     *
     */
    @JsonIgnore
    public ResPartnerBankDTO resetUserHasGroupValidateBankAccount() {
        this._reset(FIELD_USER_HAS_GROUP_VALIDATE_BANK_ACCOUNT);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public ResPartnerBankDTO setWriteDate(Timestamp val) {
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
    public ResPartnerBankDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public ResPartnerBankDTO setWriteUid(String val) {
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
    public ResPartnerBankDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
