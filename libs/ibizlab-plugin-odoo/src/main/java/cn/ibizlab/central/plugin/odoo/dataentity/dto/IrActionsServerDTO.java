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


public class IrActionsServerDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 模型
     */
    public final static String FIELD_MODEL_ID = "model_id";

    /**
     * 属性: 截止日期至
     */
    public final static String FIELD_ACTIVITY_DATE_DEADLINE_RANGE = "activity_date_deadline_range";

    /**
     * 属性: 到期类型
     */
    public final static String FIELD_ACTIVITY_DATE_DEADLINE_RANGE_TYPE = "activity_date_deadline_range_type";

    /**
     * 属性: 备注
     */
    public final static String FIELD_ACTIVITY_NOTE = "activity_note";

    /**
     * 属性: 标题
     */
    public final static String FIELD_ACTIVITY_SUMMARY = "activity_summary";

    /**
     * 属性: 用户字段
     */
    public final static String FIELD_ACTIVITY_USER_FIELD_NAME = "activity_user_field_name";

    /**
     * 属性: 用户类型
     */
    public final static String FIELD_ACTIVITY_USER_TYPE = "activity_user_type";

    /**
     * 属性: 绑定类型
     */
    public final static String FIELD_BINDING_TYPE = "binding_type";

    /**
     * 属性: 绑定视图类型
     */
    public final static String FIELD_BINDING_VIEW_TYPES = "binding_view_types";

    /**
     * 属性: Python 代码
     */
    public final static String FIELD_CODE = "code";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 值类型
     */
    public final static String FIELD_EVALUATION_TYPE = "evaluation_type";

    /**
     * 属性: 动作描述
     */
    public final static String FIELD_HELP = "help";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 订阅收件人
     */
    public final static String FIELD_MAIL_POST_AUTOFOLLOW = "mail_post_autofollow";

    /**
     * 属性: 发送电子邮件
     */
    public final static String FIELD_MAIL_POST_METHOD = "mail_post_method";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 网站中显示的路径
     */
    public final static String FIELD_PATH = "path";

    /**
     * 属性: 序列
     */
    public final static String FIELD_SEQUENCE = "sequence";

    /**
     * 属性: 发送短信为
     */
    public final static String FIELD_SMS_METHOD = "sms_method";

    /**
     * 属性: 类型
     */
    public final static String FIELD_STATE = "state";

    /**
     * 属性: 动作类型
     */
    public final static String FIELD_TYPE = "type";

    /**
     * 属性: 布尔值
     */
    public final static String FIELD_UPDATE_BOOLEAN_VALUE = "update_boolean_value";

    /**
     * 属性: Many2many 业务
     */
    public final static String FIELD_UPDATE_M2M_OPERATION = "update_m2m_operation";

    /**
     * 属性: 字段更新路径
     */
    public final static String FIELD_UPDATE_PATH = "update_path";

    /**
     * 属性: 用途
     */
    public final static String FIELD_USAGE = "usage";

    /**
     * 属性: 值
     */
    public final static String FIELD_VALUE = "value";

    /**
     * 属性: Webhook URL
     */
    public final static String FIELD_WEBHOOK_URL = "webhook_url";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「模型」
     * @param val
     */
    @JsonProperty(FIELD_MODEL_ID)
    public IrActionsServerDTO setModelId(String val) {
        this._set(FIELD_MODEL_ID, val);
        return this;
    }

    /**
     * 获取「模型」值
     *
     */
    @JsonIgnore
    public String getModelId() {
        return DataTypeUtils.asString(this._get(FIELD_MODEL_ID), null);
    }

    /**
     * 判断 「模型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsModelId() {
        return this._contains(FIELD_MODEL_ID);
    }

    /**
     * 重置 「模型」
     *
     */
    @JsonIgnore
    public IrActionsServerDTO resetModelId() {
        this._reset(FIELD_MODEL_ID);
        return this;
    }

    /**
     * 设置「截止日期至」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_DATE_DEADLINE_RANGE)
    public IrActionsServerDTO setActivityDateDeadlineRange(Integer val) {
        this._set(FIELD_ACTIVITY_DATE_DEADLINE_RANGE, val);
        return this;
    }

    /**
     * 获取「截止日期至」值
     *
     */
    @JsonIgnore
    public Integer getActivityDateDeadlineRange() {
        return DataTypeUtils.asInteger(this._get(FIELD_ACTIVITY_DATE_DEADLINE_RANGE), null);
    }

    /**
     * 判断 「截止日期至」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActivityDateDeadlineRange() {
        return this._contains(FIELD_ACTIVITY_DATE_DEADLINE_RANGE);
    }

    /**
     * 重置 「截止日期至」
     *
     */
    @JsonIgnore
    public IrActionsServerDTO resetActivityDateDeadlineRange() {
        this._reset(FIELD_ACTIVITY_DATE_DEADLINE_RANGE);
        return this;
    }

    /**
     * 设置「到期类型」
     * 代码表[到期类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_actions_server_activity_date_deadline_range_type
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_DATE_DEADLINE_RANGE_TYPE)
    public IrActionsServerDTO setActivityDateDeadlineRangeType(String val) {
        this._set(FIELD_ACTIVITY_DATE_DEADLINE_RANGE_TYPE, val);
        return this;
    }

    /**
     * 获取「到期类型」值
     * 代码表[到期类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_actions_server_activity_date_deadline_range_type
     *
     */
    @JsonIgnore
    public String getActivityDateDeadlineRangeType() {
        return DataTypeUtils.asString(this._get(FIELD_ACTIVITY_DATE_DEADLINE_RANGE_TYPE), null);
    }

    /**
     * 判断 「到期类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActivityDateDeadlineRangeType() {
        return this._contains(FIELD_ACTIVITY_DATE_DEADLINE_RANGE_TYPE);
    }

    /**
     * 重置 「到期类型」
     *
     */
    @JsonIgnore
    public IrActionsServerDTO resetActivityDateDeadlineRangeType() {
        this._reset(FIELD_ACTIVITY_DATE_DEADLINE_RANGE_TYPE);
        return this;
    }

    /**
     * 设置「备注」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_NOTE)
    public IrActionsServerDTO setActivityNote(String val) {
        this._set(FIELD_ACTIVITY_NOTE, val);
        return this;
    }

    /**
     * 获取「备注」值
     *
     */
    @JsonIgnore
    public String getActivityNote() {
        return DataTypeUtils.asString(this._get(FIELD_ACTIVITY_NOTE), null);
    }

    /**
     * 判断 「备注」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActivityNote() {
        return this._contains(FIELD_ACTIVITY_NOTE);
    }

    /**
     * 重置 「备注」
     *
     */
    @JsonIgnore
    public IrActionsServerDTO resetActivityNote() {
        this._reset(FIELD_ACTIVITY_NOTE);
        return this;
    }

    /**
     * 设置「标题」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_SUMMARY)
    public IrActionsServerDTO setActivitySummary(String val) {
        this._set(FIELD_ACTIVITY_SUMMARY, val);
        return this;
    }

    /**
     * 获取「标题」值
     *
     */
    @JsonIgnore
    public String getActivitySummary() {
        return DataTypeUtils.asString(this._get(FIELD_ACTIVITY_SUMMARY), null);
    }

    /**
     * 判断 「标题」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActivitySummary() {
        return this._contains(FIELD_ACTIVITY_SUMMARY);
    }

    /**
     * 重置 「标题」
     *
     */
    @JsonIgnore
    public IrActionsServerDTO resetActivitySummary() {
        this._reset(FIELD_ACTIVITY_SUMMARY);
        return this;
    }

    /**
     * 设置「用户字段」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_USER_FIELD_NAME)
    public IrActionsServerDTO setActivityUserFieldName(String val) {
        this._set(FIELD_ACTIVITY_USER_FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「用户字段」值
     *
     */
    @JsonIgnore
    public String getActivityUserFieldName() {
        return DataTypeUtils.asString(this._get(FIELD_ACTIVITY_USER_FIELD_NAME), null);
    }

    /**
     * 判断 「用户字段」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActivityUserFieldName() {
        return this._contains(FIELD_ACTIVITY_USER_FIELD_NAME);
    }

    /**
     * 重置 「用户字段」
     *
     */
    @JsonIgnore
    public IrActionsServerDTO resetActivityUserFieldName() {
        this._reset(FIELD_ACTIVITY_USER_FIELD_NAME);
        return this;
    }

    /**
     * 设置「用户类型」
     * 代码表[用户类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_actions_server_activity_user_type
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_USER_TYPE)
    public IrActionsServerDTO setActivityUserType(String val) {
        this._set(FIELD_ACTIVITY_USER_TYPE, val);
        return this;
    }

    /**
     * 获取「用户类型」值
     * 代码表[用户类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_actions_server_activity_user_type
     *
     */
    @JsonIgnore
    public String getActivityUserType() {
        return DataTypeUtils.asString(this._get(FIELD_ACTIVITY_USER_TYPE), null);
    }

    /**
     * 判断 「用户类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActivityUserType() {
        return this._contains(FIELD_ACTIVITY_USER_TYPE);
    }

    /**
     * 重置 「用户类型」
     *
     */
    @JsonIgnore
    public IrActionsServerDTO resetActivityUserType() {
        this._reset(FIELD_ACTIVITY_USER_TYPE);
        return this;
    }

    /**
     * 设置「绑定类型」
     * 代码表[绑定类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_actions_server_binding_type
     * @param val
     */
    @JsonProperty(FIELD_BINDING_TYPE)
    public IrActionsServerDTO setBindingType(String val) {
        this._set(FIELD_BINDING_TYPE, val);
        return this;
    }

    /**
     * 获取「绑定类型」值
     * 代码表[绑定类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_actions_server_binding_type
     *
     */
    @JsonIgnore
    public String getBindingType() {
        return DataTypeUtils.asString(this._get(FIELD_BINDING_TYPE), null);
    }

    /**
     * 判断 「绑定类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBindingType() {
        return this._contains(FIELD_BINDING_TYPE);
    }

    /**
     * 重置 「绑定类型」
     *
     */
    @JsonIgnore
    public IrActionsServerDTO resetBindingType() {
        this._reset(FIELD_BINDING_TYPE);
        return this;
    }

    /**
     * 设置「绑定视图类型」
     * @param val
     */
    @JsonProperty(FIELD_BINDING_VIEW_TYPES)
    public IrActionsServerDTO setBindingViewTypes(String val) {
        this._set(FIELD_BINDING_VIEW_TYPES, val);
        return this;
    }

    /**
     * 获取「绑定视图类型」值
     *
     */
    @JsonIgnore
    public String getBindingViewTypes() {
        return DataTypeUtils.asString(this._get(FIELD_BINDING_VIEW_TYPES), null);
    }

    /**
     * 判断 「绑定视图类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsBindingViewTypes() {
        return this._contains(FIELD_BINDING_VIEW_TYPES);
    }

    /**
     * 重置 「绑定视图类型」
     *
     */
    @JsonIgnore
    public IrActionsServerDTO resetBindingViewTypes() {
        this._reset(FIELD_BINDING_VIEW_TYPES);
        return this;
    }

    /**
     * 设置「Python 代码」
     * @param val
     */
    @JsonProperty(FIELD_CODE)
    public IrActionsServerDTO setCode(String val) {
        this._set(FIELD_CODE, val);
        return this;
    }

    /**
     * 获取「Python 代码」值
     *
     */
    @JsonIgnore
    public String getCode() {
        return DataTypeUtils.asString(this._get(FIELD_CODE), null);
    }

    /**
     * 判断 「Python 代码」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCode() {
        return this._contains(FIELD_CODE);
    }

    /**
     * 重置 「Python 代码」
     *
     */
    @JsonIgnore
    public IrActionsServerDTO resetCode() {
        this._reset(FIELD_CODE);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public IrActionsServerDTO setCreateDate(Timestamp val) {
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
    public IrActionsServerDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public IrActionsServerDTO setCreateUid(String val) {
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
    public IrActionsServerDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「值类型」
     * 代码表[值类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_actions_server_evaluation_type
     * @param val
     */
    @JsonProperty(FIELD_EVALUATION_TYPE)
    public IrActionsServerDTO setEvaluationType(String val) {
        this._set(FIELD_EVALUATION_TYPE, val);
        return this;
    }

    /**
     * 获取「值类型」值
     * 代码表[值类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_actions_server_evaluation_type
     *
     */
    @JsonIgnore
    public String getEvaluationType() {
        return DataTypeUtils.asString(this._get(FIELD_EVALUATION_TYPE), null);
    }

    /**
     * 判断 「值类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsEvaluationType() {
        return this._contains(FIELD_EVALUATION_TYPE);
    }

    /**
     * 重置 「值类型」
     *
     */
    @JsonIgnore
    public IrActionsServerDTO resetEvaluationType() {
        this._reset(FIELD_EVALUATION_TYPE);
        return this;
    }

    /**
     * 设置「动作描述」
     * @param val
     */
    @JsonProperty(FIELD_HELP)
    public IrActionsServerDTO setHelp(String val) {
        this._set(FIELD_HELP, val);
        return this;
    }

    /**
     * 获取「动作描述」值
     *
     */
    @JsonIgnore
    public String getHelp() {
        return DataTypeUtils.asString(this._get(FIELD_HELP), null);
    }

    /**
     * 判断 「动作描述」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHelp() {
        return this._contains(FIELD_HELP);
    }

    /**
     * 重置 「动作描述」
     *
     */
    @JsonIgnore
    public IrActionsServerDTO resetHelp() {
        this._reset(FIELD_HELP);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public IrActionsServerDTO setId(String val) {
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
    public IrActionsServerDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「订阅收件人」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MAIL_POST_AUTOFOLLOW)
    public IrActionsServerDTO setMailPostAutofollow(Integer val) {
        this._set(FIELD_MAIL_POST_AUTOFOLLOW, val);
        return this;
    }

    /**
     * 获取「订阅收件人」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getMailPostAutofollow() {
        return DataTypeUtils.asInteger(this._get(FIELD_MAIL_POST_AUTOFOLLOW), null);
    }

    /**
     * 判断 「订阅收件人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMailPostAutofollow() {
        return this._contains(FIELD_MAIL_POST_AUTOFOLLOW);
    }

    /**
     * 重置 「订阅收件人」
     *
     */
    @JsonIgnore
    public IrActionsServerDTO resetMailPostAutofollow() {
        this._reset(FIELD_MAIL_POST_AUTOFOLLOW);
        return this;
    }

    /**
     * 设置「发送电子邮件」
     * 代码表[发送电子邮件]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_actions_server_mail_post_method
     * @param val
     */
    @JsonProperty(FIELD_MAIL_POST_METHOD)
    public IrActionsServerDTO setMailPostMethod(String val) {
        this._set(FIELD_MAIL_POST_METHOD, val);
        return this;
    }

    /**
     * 获取「发送电子邮件」值
     * 代码表[发送电子邮件]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_actions_server_mail_post_method
     *
     */
    @JsonIgnore
    public String getMailPostMethod() {
        return DataTypeUtils.asString(this._get(FIELD_MAIL_POST_METHOD), null);
    }

    /**
     * 判断 「发送电子邮件」是否有值
     *
     */
    @JsonIgnore
    public boolean containsMailPostMethod() {
        return this._contains(FIELD_MAIL_POST_METHOD);
    }

    /**
     * 重置 「发送电子邮件」
     *
     */
    @JsonIgnore
    public IrActionsServerDTO resetMailPostMethod() {
        this._reset(FIELD_MAIL_POST_METHOD);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public IrActionsServerDTO setName(String val) {
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
    public IrActionsServerDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「网站中显示的路径」
     * @param val
     */
    @JsonProperty(FIELD_PATH)
    public IrActionsServerDTO setPath(String val) {
        this._set(FIELD_PATH, val);
        return this;
    }

    /**
     * 获取「网站中显示的路径」值
     *
     */
    @JsonIgnore
    public String getPath() {
        return DataTypeUtils.asString(this._get(FIELD_PATH), null);
    }

    /**
     * 判断 「网站中显示的路径」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPath() {
        return this._contains(FIELD_PATH);
    }

    /**
     * 重置 「网站中显示的路径」
     *
     */
    @JsonIgnore
    public IrActionsServerDTO resetPath() {
        this._reset(FIELD_PATH);
        return this;
    }

    /**
     * 设置「序列」
     * @param val
     */
    @JsonProperty(FIELD_SEQUENCE)
    public IrActionsServerDTO setSequence(Integer val) {
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
    public IrActionsServerDTO resetSequence() {
        this._reset(FIELD_SEQUENCE);
        return this;
    }

    /**
     * 设置「发送短信为」
     * 代码表[发送短信为]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_actions_server_sms_method
     * @param val
     */
    @JsonProperty(FIELD_SMS_METHOD)
    public IrActionsServerDTO setSmsMethod(String val) {
        this._set(FIELD_SMS_METHOD, val);
        return this;
    }

    /**
     * 获取「发送短信为」值
     * 代码表[发送短信为]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_actions_server_sms_method
     *
     */
    @JsonIgnore
    public String getSmsMethod() {
        return DataTypeUtils.asString(this._get(FIELD_SMS_METHOD), null);
    }

    /**
     * 判断 「发送短信为」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSmsMethod() {
        return this._contains(FIELD_SMS_METHOD);
    }

    /**
     * 重置 「发送短信为」
     *
     */
    @JsonIgnore
    public IrActionsServerDTO resetSmsMethod() {
        this._reset(FIELD_SMS_METHOD);
        return this;
    }

    /**
     * 设置「类型」
     * 代码表[类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_actions_server_state
     * @param val
     */
    @JsonProperty(FIELD_STATE)
    public IrActionsServerDTO setState(String val) {
        this._set(FIELD_STATE, val);
        return this;
    }

    /**
     * 获取「类型」值
     * 代码表[类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_actions_server_state
     *
     */
    @JsonIgnore
    public String getState() {
        return DataTypeUtils.asString(this._get(FIELD_STATE), null);
    }

    /**
     * 判断 「类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsState() {
        return this._contains(FIELD_STATE);
    }

    /**
     * 重置 「类型」
     *
     */
    @JsonIgnore
    public IrActionsServerDTO resetState() {
        this._reset(FIELD_STATE);
        return this;
    }

    /**
     * 设置「动作类型」
     * @param val
     */
    @JsonProperty(FIELD_TYPE)
    public IrActionsServerDTO setType(String val) {
        this._set(FIELD_TYPE, val);
        return this;
    }

    /**
     * 获取「动作类型」值
     *
     */
    @JsonIgnore
    public String getType() {
        return DataTypeUtils.asString(this._get(FIELD_TYPE), null);
    }

    /**
     * 判断 「动作类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsType() {
        return this._contains(FIELD_TYPE);
    }

    /**
     * 重置 「动作类型」
     *
     */
    @JsonIgnore
    public IrActionsServerDTO resetType() {
        this._reset(FIELD_TYPE);
        return this;
    }

    /**
     * 设置「布尔值」
     * 代码表[布尔值]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_actions_server_update_boolean_value
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_BOOLEAN_VALUE)
    public IrActionsServerDTO setUpdateBooleanValue(String val) {
        this._set(FIELD_UPDATE_BOOLEAN_VALUE, val);
        return this;
    }

    /**
     * 获取「布尔值」值
     * 代码表[布尔值]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_actions_server_update_boolean_value
     *
     */
    @JsonIgnore
    public String getUpdateBooleanValue() {
        return DataTypeUtils.asString(this._get(FIELD_UPDATE_BOOLEAN_VALUE), null);
    }

    /**
     * 判断 「布尔值」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUpdateBooleanValue() {
        return this._contains(FIELD_UPDATE_BOOLEAN_VALUE);
    }

    /**
     * 重置 「布尔值」
     *
     */
    @JsonIgnore
    public IrActionsServerDTO resetUpdateBooleanValue() {
        this._reset(FIELD_UPDATE_BOOLEAN_VALUE);
        return this;
    }

    /**
     * 设置「Many2many 业务」
     * 代码表[Many2many 业务]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_actions_server_update_m2m_operation
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_M2M_OPERATION)
    public IrActionsServerDTO setUpdateM2mOperation(String val) {
        this._set(FIELD_UPDATE_M2M_OPERATION, val);
        return this;
    }

    /**
     * 获取「Many2many 业务」值
     * 代码表[Many2many 业务]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_actions_server_update_m2m_operation
     *
     */
    @JsonIgnore
    public String getUpdateM2mOperation() {
        return DataTypeUtils.asString(this._get(FIELD_UPDATE_M2M_OPERATION), null);
    }

    /**
     * 判断 「Many2many 业务」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUpdateM2mOperation() {
        return this._contains(FIELD_UPDATE_M2M_OPERATION);
    }

    /**
     * 重置 「Many2many 业务」
     *
     */
    @JsonIgnore
    public IrActionsServerDTO resetUpdateM2mOperation() {
        this._reset(FIELD_UPDATE_M2M_OPERATION);
        return this;
    }

    /**
     * 设置「字段更新路径」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_PATH)
    public IrActionsServerDTO setUpdatePath(String val) {
        this._set(FIELD_UPDATE_PATH, val);
        return this;
    }

    /**
     * 获取「字段更新路径」值
     *
     */
    @JsonIgnore
    public String getUpdatePath() {
        return DataTypeUtils.asString(this._get(FIELD_UPDATE_PATH), null);
    }

    /**
     * 判断 「字段更新路径」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUpdatePath() {
        return this._contains(FIELD_UPDATE_PATH);
    }

    /**
     * 重置 「字段更新路径」
     *
     */
    @JsonIgnore
    public IrActionsServerDTO resetUpdatePath() {
        this._reset(FIELD_UPDATE_PATH);
        return this;
    }

    /**
     * 设置「用途」
     * 代码表[用途]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_actions_server_usage
     * @param val
     */
    @JsonProperty(FIELD_USAGE)
    public IrActionsServerDTO setUsage(String val) {
        this._set(FIELD_USAGE, val);
        return this;
    }

    /**
     * 获取「用途」值
     * 代码表[用途]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_actions_server_usage
     *
     */
    @JsonIgnore
    public String getUsage() {
        return DataTypeUtils.asString(this._get(FIELD_USAGE), null);
    }

    /**
     * 判断 「用途」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUsage() {
        return this._contains(FIELD_USAGE);
    }

    /**
     * 重置 「用途」
     *
     */
    @JsonIgnore
    public IrActionsServerDTO resetUsage() {
        this._reset(FIELD_USAGE);
        return this;
    }

    /**
     * 设置「值」
     * @param val
     */
    @JsonProperty(FIELD_VALUE)
    public IrActionsServerDTO setValue(String val) {
        this._set(FIELD_VALUE, val);
        return this;
    }

    /**
     * 获取「值」值
     *
     */
    @JsonIgnore
    public String getValue() {
        return DataTypeUtils.asString(this._get(FIELD_VALUE), null);
    }

    /**
     * 判断 「值」是否有值
     *
     */
    @JsonIgnore
    public boolean containsValue() {
        return this._contains(FIELD_VALUE);
    }

    /**
     * 重置 「值」
     *
     */
    @JsonIgnore
    public IrActionsServerDTO resetValue() {
        this._reset(FIELD_VALUE);
        return this;
    }

    /**
     * 设置「Webhook URL」
     * @param val
     */
    @JsonProperty(FIELD_WEBHOOK_URL)
    public IrActionsServerDTO setWebhookUrl(String val) {
        this._set(FIELD_WEBHOOK_URL, val);
        return this;
    }

    /**
     * 获取「Webhook URL」值
     *
     */
    @JsonIgnore
    public String getWebhookUrl() {
        return DataTypeUtils.asString(this._get(FIELD_WEBHOOK_URL), null);
    }

    /**
     * 判断 「Webhook URL」是否有值
     *
     */
    @JsonIgnore
    public boolean containsWebhookUrl() {
        return this._contains(FIELD_WEBHOOK_URL);
    }

    /**
     * 重置 「Webhook URL」
     *
     */
    @JsonIgnore
    public IrActionsServerDTO resetWebhookUrl() {
        this._reset(FIELD_WEBHOOK_URL);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public IrActionsServerDTO setWriteDate(Timestamp val) {
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
    public IrActionsServerDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public IrActionsServerDTO setWriteUid(String val) {
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
    public IrActionsServerDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
