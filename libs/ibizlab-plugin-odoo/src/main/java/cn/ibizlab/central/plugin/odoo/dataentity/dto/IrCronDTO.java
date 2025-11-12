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


public class IrCronDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 模型
     */
    public final static String FIELD_MODEL_ID = "model_id";

    /**
     * 属性: 代码
     */
    public final static String FIELD_CODE = "code";

    /**
     * 属性: 值类型
     */
    public final static String FIELD_EVALUATION_TYPE = "evaluation_type";

    /**
     * 属性: 字段更新路径
     */
    public final static String FIELD_UPDATE_PATH = "update_path";

    /**
     * 属性: 要更新的字段
     */
    public final static String FIELD_UPDATE_FIELD_ID = "update_field_id";

    /**
     * 属性: 更新相关模型
     */
    public final static String FIELD_UPDATE_RELATED_MODEL_ID = "update_related_model_id";

    /**
     * 属性: 值
     */
    public final static String FIELD_VALUE = "value";

    /**
     * 属性: 布尔值
     */
    public final static String FIELD_UPDATE_BOOLEAN_VALUE = "update_boolean_value";

    /**
     * 属性: 创建记录
     */
    public final static String FIELD_CRUD_MODEL_ID = "crud_model_id";

    /**
     * 属性: 链接字段
     */
    public final static String FIELD_LINK_FIELD_ID = "link_field_id";

    /**
     * 属性: 发送短信为
     */
    public final static String FIELD_SMS_METHOD = "sms_method";

    /**
     * 属性: EMail模板
     */
    public final static String FIELD_TEMPLATE_ID = "template_id";

    /**
     * 属性: 订阅收件人
     */
    public final static String FIELD_MAIL_POST_AUTOFOLLOW = "mail_post_autofollow";

    /**
     * 属性: 活动类型
     */
    public final static String FIELD_ACTIVITY_TYPE_ID = "activity_type_id";

    /**
     * 属性: 用户类型
     */
    public final static String FIELD_ACTIVITY_USER_TYPE = "activity_user_type";

    /**
     * 属性: 用户字段
     */
    public final static String FIELD_ACTIVITY_USER_FIELD_NAME = "activity_user_field_name";

    /**
     * 属性: 负责人
     */
    public final static String FIELD_ACTIVITY_USER_ID = "activity_user_id";

    /**
     * 属性: 备注
     */
    public final static String FIELD_ACTIVITY_NOTE = "activity_note";

    /**
     * 属性: 用途
     */
    public final static String FIELD_USAGE = "usage";

    /**
     * 属性: 类型
     */
    public final static String FIELD_STATE = "state";

    /**
     * 属性: 活动类型名称
     */
    public final static String FIELD_ACTIVITY_TYPE_NAME = "activity_type_name";

    /**
     * 属性: 负责人
     */
    public final static String FIELD_ACTIVITY_USER_NAME = "activity_user_name";

    /**
     * 属性: 标题
     */
    public final static String FIELD_ACTIVITY_SUMMARY = "activity_summary";

    /**
     * 属性: 到期类型
     */
    public final static String FIELD_ACTIVITY_DATE_DEADLINE_RANGE_TYPE = "activity_date_deadline_range_type";

    /**
     * 属性: 截止日期至
     */
    public final static String FIELD_ACTIVITY_DATE_DEADLINE_RANGE = "activity_date_deadline_range";

    /**
     * 属性: 发送电子邮件
     */
    public final static String FIELD_MAIL_POST_METHOD = "mail_post_method";

    /**
     * 属性: Webhook URL
     */
    public final static String FIELD_WEBHOOK_URL = "webhook_url";

    /**
     * 属性: EMail模板
     */
    public final static String FIELD_TEMPLATE_NAME = "template_name";

    /**
     * 属性: 动作名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 有效
     */
    public final static String FIELD_ACTIVE = "active";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 名称
     */
    public final static String FIELD_CRON_NAME = "cron_name";

    /**
     * 属性: 失败次数
     */
    public final static String FIELD_FAILURE_COUNT = "failure_count";

    /**
     * 属性: 首次失败日期
     */
    public final static String FIELD_FIRST_FAILURE_DATE = "first_failure_date";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 间隔数值
     */
    public final static String FIELD_INTERVAL_NUMBER = "interval_number";

    /**
     * 属性: 间隔单位
     */
    public final static String FIELD_INTERVAL_TYPE = "interval_type";

    /**
     * 属性: 服务器动作标识
     */
    public final static String FIELD_IR_ACTIONS_SERVER_ID = "ir_actions_server_id";

    /**
     * 属性: 最后执行日期
     */
    public final static String FIELD_LASTCALL = "lastcall";

    /**
     * 属性: 下一次执行日期
     */
    public final static String FIELD_NEXTCALL = "nextcall";

    /**
     * 属性: 优先级
     */
    public final static String FIELD_PRIORITY = "priority";

    /**
     * 属性: 执行帐户
     */
    public final static String FIELD_USER_ID = "user_id";

    /**
     * 属性: 执行帐户
     */
    public final static String FIELD_USER_NAME = "user_name";

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
    public IrCronDTO setModelId(String val) {
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
    public IrCronDTO resetModelId() {
        this._reset(FIELD_MODEL_ID);
        return this;
    }

    /**
     * 设置「代码」
     * @param val
     */
    @JsonProperty(FIELD_CODE)
    public IrCronDTO setCode(String val) {
        this._set(FIELD_CODE, val);
        return this;
    }

    /**
     * 获取「代码」值
     *
     */
    @JsonIgnore
    public String getCode() {
        return DataTypeUtils.asString(this._get(FIELD_CODE), null);
    }

    /**
     * 判断 「代码」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCode() {
        return this._contains(FIELD_CODE);
    }

    /**
     * 重置 「代码」
     *
     */
    @JsonIgnore
    public IrCronDTO resetCode() {
        this._reset(FIELD_CODE);
        return this;
    }

    /**
     * 设置「值类型」
     * 代码表[值类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_actions_server_evaluation_type
     * @param val
     */
    @JsonProperty(FIELD_EVALUATION_TYPE)
    public IrCronDTO setEvaluationType(String val) {
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
    public IrCronDTO resetEvaluationType() {
        this._reset(FIELD_EVALUATION_TYPE);
        return this;
    }

    /**
     * 设置「字段更新路径」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_PATH)
    public IrCronDTO setUpdatePath(String val) {
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
    public IrCronDTO resetUpdatePath() {
        this._reset(FIELD_UPDATE_PATH);
        return this;
    }

    /**
     * 设置「要更新的字段」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_FIELD_ID)
    public IrCronDTO setUpdateFieldId(String val) {
        this._set(FIELD_UPDATE_FIELD_ID, val);
        return this;
    }

    /**
     * 获取「要更新的字段」值
     *
     */
    @JsonIgnore
    public String getUpdateFieldId() {
        return DataTypeUtils.asString(this._get(FIELD_UPDATE_FIELD_ID), null);
    }

    /**
     * 判断 「要更新的字段」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUpdateFieldId() {
        return this._contains(FIELD_UPDATE_FIELD_ID);
    }

    /**
     * 重置 「要更新的字段」
     *
     */
    @JsonIgnore
    public IrCronDTO resetUpdateFieldId() {
        this._reset(FIELD_UPDATE_FIELD_ID);
        return this;
    }

    /**
     * 设置「更新相关模型」
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_RELATED_MODEL_ID)
    public IrCronDTO setUpdateRelatedModelId(String val) {
        this._set(FIELD_UPDATE_RELATED_MODEL_ID, val);
        return this;
    }

    /**
     * 获取「更新相关模型」值
     *
     */
    @JsonIgnore
    public String getUpdateRelatedModelId() {
        return DataTypeUtils.asString(this._get(FIELD_UPDATE_RELATED_MODEL_ID), null);
    }

    /**
     * 判断 「更新相关模型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUpdateRelatedModelId() {
        return this._contains(FIELD_UPDATE_RELATED_MODEL_ID);
    }

    /**
     * 重置 「更新相关模型」
     *
     */
    @JsonIgnore
    public IrCronDTO resetUpdateRelatedModelId() {
        this._reset(FIELD_UPDATE_RELATED_MODEL_ID);
        return this;
    }

    /**
     * 设置「值」
     * @param val
     */
    @JsonProperty(FIELD_VALUE)
    public IrCronDTO setValue(String val) {
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
    public IrCronDTO resetValue() {
        this._reset(FIELD_VALUE);
        return this;
    }

    /**
     * 设置「布尔值」
     * 代码表[布尔值]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_actions_server_update_boolean_value
     * @param val
     */
    @JsonProperty(FIELD_UPDATE_BOOLEAN_VALUE)
    public IrCronDTO setUpdateBooleanValue(String val) {
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
    public IrCronDTO resetUpdateBooleanValue() {
        this._reset(FIELD_UPDATE_BOOLEAN_VALUE);
        return this;
    }

    /**
     * 设置「创建记录」
     * 代码表[模型]
     * @param val
     */
    @JsonProperty(FIELD_CRUD_MODEL_ID)
    public IrCronDTO setCrudModelId(String val) {
        this._set(FIELD_CRUD_MODEL_ID, val);
        return this;
    }

    /**
     * 获取「创建记录」值
     * 代码表[模型]
     *
     */
    @JsonIgnore
    public String getCrudModelId() {
        return DataTypeUtils.asString(this._get(FIELD_CRUD_MODEL_ID), null);
    }

    /**
     * 判断 「创建记录」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCrudModelId() {
        return this._contains(FIELD_CRUD_MODEL_ID);
    }

    /**
     * 重置 「创建记录」
     *
     */
    @JsonIgnore
    public IrCronDTO resetCrudModelId() {
        this._reset(FIELD_CRUD_MODEL_ID);
        return this;
    }

    /**
     * 设置「链接字段」
     * @param val
     */
    @JsonProperty(FIELD_LINK_FIELD_ID)
    public IrCronDTO setLinkFieldId(String val) {
        this._set(FIELD_LINK_FIELD_ID, val);
        return this;
    }

    /**
     * 获取「链接字段」值
     *
     */
    @JsonIgnore
    public String getLinkFieldId() {
        return DataTypeUtils.asString(this._get(FIELD_LINK_FIELD_ID), null);
    }

    /**
     * 判断 「链接字段」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLinkFieldId() {
        return this._contains(FIELD_LINK_FIELD_ID);
    }

    /**
     * 重置 「链接字段」
     *
     */
    @JsonIgnore
    public IrCronDTO resetLinkFieldId() {
        this._reset(FIELD_LINK_FIELD_ID);
        return this;
    }

    /**
     * 设置「发送短信为」
     * 代码表[发送短信为]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_actions_server_sms_method
     * @param val
     */
    @JsonProperty(FIELD_SMS_METHOD)
    public IrCronDTO setSmsMethod(String val) {
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
    public IrCronDTO resetSmsMethod() {
        this._reset(FIELD_SMS_METHOD);
        return this;
    }

    /**
     * 设置「EMail模板」
     * @param val
     */
    @JsonProperty(FIELD_TEMPLATE_ID)
    public IrCronDTO setTemplateId(String val) {
        this._set(FIELD_TEMPLATE_ID, val);
        return this;
    }

    /**
     * 获取「EMail模板」值
     *
     */
    @JsonIgnore
    public String getTemplateId() {
        return DataTypeUtils.asString(this._get(FIELD_TEMPLATE_ID), null);
    }

    /**
     * 判断 「EMail模板」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTemplateId() {
        return this._contains(FIELD_TEMPLATE_ID);
    }

    /**
     * 重置 「EMail模板」
     *
     */
    @JsonIgnore
    public IrCronDTO resetTemplateId() {
        this._reset(FIELD_TEMPLATE_ID);
        return this;
    }

    /**
     * 设置「订阅收件人」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_MAIL_POST_AUTOFOLLOW)
    public IrCronDTO setMailPostAutofollow(Integer val) {
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
    public IrCronDTO resetMailPostAutofollow() {
        this._reset(FIELD_MAIL_POST_AUTOFOLLOW);
        return this;
    }

    /**
     * 设置「活动类型」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_TYPE_ID)
    public IrCronDTO setActivityTypeId(String val) {
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
    public IrCronDTO resetActivityTypeId() {
        this._reset(FIELD_ACTIVITY_TYPE_ID);
        return this;
    }

    /**
     * 设置「用户类型」
     * 代码表[用户类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_actions_server_activity_user_type
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_USER_TYPE)
    public IrCronDTO setActivityUserType(String val) {
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
    public IrCronDTO resetActivityUserType() {
        this._reset(FIELD_ACTIVITY_USER_TYPE);
        return this;
    }

    /**
     * 设置「用户字段」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_USER_FIELD_NAME)
    public IrCronDTO setActivityUserFieldName(String val) {
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
    public IrCronDTO resetActivityUserFieldName() {
        this._reset(FIELD_ACTIVITY_USER_FIELD_NAME);
        return this;
    }

    /**
     * 设置「负责人」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_USER_ID)
    public IrCronDTO setActivityUserId(String val) {
        this._set(FIELD_ACTIVITY_USER_ID, val);
        return this;
    }

    /**
     * 获取「负责人」值
     *
     */
    @JsonIgnore
    public String getActivityUserId() {
        return DataTypeUtils.asString(this._get(FIELD_ACTIVITY_USER_ID), null);
    }

    /**
     * 判断 「负责人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActivityUserId() {
        return this._contains(FIELD_ACTIVITY_USER_ID);
    }

    /**
     * 重置 「负责人」
     *
     */
    @JsonIgnore
    public IrCronDTO resetActivityUserId() {
        this._reset(FIELD_ACTIVITY_USER_ID);
        return this;
    }

    /**
     * 设置「备注」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_NOTE)
    public IrCronDTO setActivityNote(String val) {
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
    public IrCronDTO resetActivityNote() {
        this._reset(FIELD_ACTIVITY_NOTE);
        return this;
    }

    /**
     * 设置「用途」
     * 代码表[用途]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_actions_server_usage
     * @param val
     */
    @JsonProperty(FIELD_USAGE)
    public IrCronDTO setUsage(String val) {
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
    public IrCronDTO resetUsage() {
        this._reset(FIELD_USAGE);
        return this;
    }

    /**
     * 设置「类型」
     * 代码表[类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_actions_server_state
     * @param val
     */
    @JsonProperty(FIELD_STATE)
    public IrCronDTO setState(String val) {
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
    public IrCronDTO resetState() {
        this._reset(FIELD_STATE);
        return this;
    }

    /**
     * 设置「活动类型名称」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_TYPE_NAME)
    public IrCronDTO setActivityTypeName(String val) {
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
    public IrCronDTO resetActivityTypeName() {
        this._reset(FIELD_ACTIVITY_TYPE_NAME);
        return this;
    }

    /**
     * 设置「负责人」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_USER_NAME)
    public IrCronDTO setActivityUserName(String val) {
        this._set(FIELD_ACTIVITY_USER_NAME, val);
        return this;
    }

    /**
     * 获取「负责人」值
     *
     */
    @JsonIgnore
    public String getActivityUserName() {
        return DataTypeUtils.asString(this._get(FIELD_ACTIVITY_USER_NAME), null);
    }

    /**
     * 判断 「负责人」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActivityUserName() {
        return this._contains(FIELD_ACTIVITY_USER_NAME);
    }

    /**
     * 重置 「负责人」
     *
     */
    @JsonIgnore
    public IrCronDTO resetActivityUserName() {
        this._reset(FIELD_ACTIVITY_USER_NAME);
        return this;
    }

    /**
     * 设置「标题」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_SUMMARY)
    public IrCronDTO setActivitySummary(String val) {
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
    public IrCronDTO resetActivitySummary() {
        this._reset(FIELD_ACTIVITY_SUMMARY);
        return this;
    }

    /**
     * 设置「到期类型」
     * 代码表[到期类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_actions_server_activity_date_deadline_range_type
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_DATE_DEADLINE_RANGE_TYPE)
    public IrCronDTO setActivityDateDeadlineRangeType(String val) {
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
    public IrCronDTO resetActivityDateDeadlineRangeType() {
        this._reset(FIELD_ACTIVITY_DATE_DEADLINE_RANGE_TYPE);
        return this;
    }

    /**
     * 设置「截止日期至」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_DATE_DEADLINE_RANGE)
    public IrCronDTO setActivityDateDeadlineRange(Integer val) {
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
    public IrCronDTO resetActivityDateDeadlineRange() {
        this._reset(FIELD_ACTIVITY_DATE_DEADLINE_RANGE);
        return this;
    }

    /**
     * 设置「发送电子邮件」
     * 代码表[发送电子邮件]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_actions_server_mail_post_method
     * @param val
     */
    @JsonProperty(FIELD_MAIL_POST_METHOD)
    public IrCronDTO setMailPostMethod(String val) {
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
    public IrCronDTO resetMailPostMethod() {
        this._reset(FIELD_MAIL_POST_METHOD);
        return this;
    }

    /**
     * 设置「Webhook URL」
     * @param val
     */
    @JsonProperty(FIELD_WEBHOOK_URL)
    public IrCronDTO setWebhookUrl(String val) {
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
    public IrCronDTO resetWebhookUrl() {
        this._reset(FIELD_WEBHOOK_URL);
        return this;
    }

    /**
     * 设置「EMail模板」
     * @param val
     */
    @JsonProperty(FIELD_TEMPLATE_NAME)
    public IrCronDTO setTemplateName(String val) {
        this._set(FIELD_TEMPLATE_NAME, val);
        return this;
    }

    /**
     * 获取「EMail模板」值
     *
     */
    @JsonIgnore
    public String getTemplateName() {
        return DataTypeUtils.asString(this._get(FIELD_TEMPLATE_NAME), null);
    }

    /**
     * 判断 「EMail模板」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTemplateName() {
        return this._contains(FIELD_TEMPLATE_NAME);
    }

    /**
     * 重置 「EMail模板」
     *
     */
    @JsonIgnore
    public IrCronDTO resetTemplateName() {
        this._reset(FIELD_TEMPLATE_NAME);
        return this;
    }

    /**
     * 设置「动作名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public IrCronDTO setName(String val) {
        this._set(FIELD_NAME, val);
        return this;
    }

    /**
     * 获取「动作名称」值
     *
     */
    @JsonIgnore
    public String getName() {
        return DataTypeUtils.asString(this._get(FIELD_NAME), null);
    }

    /**
     * 判断 「动作名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsName() {
        return this._contains(FIELD_NAME);
    }

    /**
     * 重置 「动作名称」
     *
     */
    @JsonIgnore
    public IrCronDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「有效」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ACTIVE)
    public IrCronDTO setActive(Integer val) {
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
    public IrCronDTO resetActive() {
        this._reset(FIELD_ACTIVE);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public IrCronDTO setCreateDate(Timestamp val) {
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
    public IrCronDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public IrCronDTO setCreateUid(String val) {
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
    public IrCronDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_CRON_NAME)
    public IrCronDTO setCronName(String val) {
        this._set(FIELD_CRON_NAME, val);
        return this;
    }

    /**
     * 获取「名称」值
     *
     */
    @JsonIgnore
    public String getCronName() {
        return DataTypeUtils.asString(this._get(FIELD_CRON_NAME), null);
    }

    /**
     * 判断 「名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCronName() {
        return this._contains(FIELD_CRON_NAME);
    }

    /**
     * 重置 「名称」
     *
     */
    @JsonIgnore
    public IrCronDTO resetCronName() {
        this._reset(FIELD_CRON_NAME);
        return this;
    }

    /**
     * 设置「失败次数」
     * @param val
     */
    @JsonProperty(FIELD_FAILURE_COUNT)
    public IrCronDTO setFailureCount(Integer val) {
        this._set(FIELD_FAILURE_COUNT, val);
        return this;
    }

    /**
     * 获取「失败次数」值
     *
     */
    @JsonIgnore
    public Integer getFailureCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_FAILURE_COUNT), null);
    }

    /**
     * 判断 「失败次数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFailureCount() {
        return this._contains(FIELD_FAILURE_COUNT);
    }

    /**
     * 重置 「失败次数」
     *
     */
    @JsonIgnore
    public IrCronDTO resetFailureCount() {
        this._reset(FIELD_FAILURE_COUNT);
        return this;
    }

    /**
     * 设置「首次失败日期」
     * @param val
     */
    @JsonProperty(FIELD_FIRST_FAILURE_DATE)
    public IrCronDTO setFirstFailureDate(Timestamp val) {
        this._set(FIELD_FIRST_FAILURE_DATE, val);
        return this;
    }

    /**
     * 获取「首次失败日期」值
     *
     */
    @JsonIgnore
    public Timestamp getFirstFailureDate() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_FIRST_FAILURE_DATE), null);
    }

    /**
     * 判断 「首次失败日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsFirstFailureDate() {
        return this._contains(FIELD_FIRST_FAILURE_DATE);
    }

    /**
     * 重置 「首次失败日期」
     *
     */
    @JsonIgnore
    public IrCronDTO resetFirstFailureDate() {
        this._reset(FIELD_FIRST_FAILURE_DATE);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public IrCronDTO setId(String val) {
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
    public IrCronDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「间隔数值」
     * @param val
     */
    @JsonProperty(FIELD_INTERVAL_NUMBER)
    public IrCronDTO setIntervalNumber(Integer val) {
        this._set(FIELD_INTERVAL_NUMBER, val);
        return this;
    }

    /**
     * 获取「间隔数值」值
     *
     */
    @JsonIgnore
    public Integer getIntervalNumber() {
        return DataTypeUtils.asInteger(this._get(FIELD_INTERVAL_NUMBER), null);
    }

    /**
     * 判断 「间隔数值」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIntervalNumber() {
        return this._contains(FIELD_INTERVAL_NUMBER);
    }

    /**
     * 重置 「间隔数值」
     *
     */
    @JsonIgnore
    public IrCronDTO resetIntervalNumber() {
        this._reset(FIELD_INTERVAL_NUMBER);
        return this;
    }

    /**
     * 设置「间隔单位」
     * 代码表[间隔单位]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_cron_interval_type
     * @param val
     */
    @JsonProperty(FIELD_INTERVAL_TYPE)
    public IrCronDTO setIntervalType(String val) {
        this._set(FIELD_INTERVAL_TYPE, val);
        return this;
    }

    /**
     * 获取「间隔单位」值
     * 代码表[间隔单位]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.ir_cron_interval_type
     *
     */
    @JsonIgnore
    public String getIntervalType() {
        return DataTypeUtils.asString(this._get(FIELD_INTERVAL_TYPE), null);
    }

    /**
     * 判断 「间隔单位」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIntervalType() {
        return this._contains(FIELD_INTERVAL_TYPE);
    }

    /**
     * 重置 「间隔单位」
     *
     */
    @JsonIgnore
    public IrCronDTO resetIntervalType() {
        this._reset(FIELD_INTERVAL_TYPE);
        return this;
    }

    /**
     * 设置「服务器动作标识」
     * @param val
     */
    @JsonProperty(FIELD_IR_ACTIONS_SERVER_ID)
    public IrCronDTO setIrActionsServerId(String val) {
        this._set(FIELD_IR_ACTIONS_SERVER_ID, val);
        return this;
    }

    /**
     * 获取「服务器动作标识」值
     *
     */
    @JsonIgnore
    public String getIrActionsServerId() {
        return DataTypeUtils.asString(this._get(FIELD_IR_ACTIONS_SERVER_ID), null);
    }

    /**
     * 判断 「服务器动作标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIrActionsServerId() {
        return this._contains(FIELD_IR_ACTIONS_SERVER_ID);
    }

    /**
     * 重置 「服务器动作标识」
     *
     */
    @JsonIgnore
    public IrCronDTO resetIrActionsServerId() {
        this._reset(FIELD_IR_ACTIONS_SERVER_ID);
        return this;
    }

    /**
     * 设置「最后执行日期」
     * @param val
     */
    @JsonProperty(FIELD_LASTCALL)
    public IrCronDTO setLastcall(Timestamp val) {
        this._set(FIELD_LASTCALL, val);
        return this;
    }

    /**
     * 获取「最后执行日期」值
     *
     */
    @JsonIgnore
    public Timestamp getLastcall() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_LASTCALL), null);
    }

    /**
     * 判断 「最后执行日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsLastcall() {
        return this._contains(FIELD_LASTCALL);
    }

    /**
     * 重置 「最后执行日期」
     *
     */
    @JsonIgnore
    public IrCronDTO resetLastcall() {
        this._reset(FIELD_LASTCALL);
        return this;
    }

    /**
     * 设置「下一次执行日期」
     * @param val
     */
    @JsonProperty(FIELD_NEXTCALL)
    public IrCronDTO setNextcall(Timestamp val) {
        this._set(FIELD_NEXTCALL, val);
        return this;
    }

    /**
     * 获取「下一次执行日期」值
     *
     */
    @JsonIgnore
    public Timestamp getNextcall() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_NEXTCALL), null);
    }

    /**
     * 判断 「下一次执行日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsNextcall() {
        return this._contains(FIELD_NEXTCALL);
    }

    /**
     * 重置 「下一次执行日期」
     *
     */
    @JsonIgnore
    public IrCronDTO resetNextcall() {
        this._reset(FIELD_NEXTCALL);
        return this;
    }

    /**
     * 设置「优先级」
     * @param val
     */
    @JsonProperty(FIELD_PRIORITY)
    public IrCronDTO setPriority(Integer val) {
        this._set(FIELD_PRIORITY, val);
        return this;
    }

    /**
     * 获取「优先级」值
     *
     */
    @JsonIgnore
    public Integer getPriority() {
        return DataTypeUtils.asInteger(this._get(FIELD_PRIORITY), null);
    }

    /**
     * 判断 「优先级」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPriority() {
        return this._contains(FIELD_PRIORITY);
    }

    /**
     * 重置 「优先级」
     *
     */
    @JsonIgnore
    public IrCronDTO resetPriority() {
        this._reset(FIELD_PRIORITY);
        return this;
    }

    /**
     * 设置「执行帐户」
     * @param val
     */
    @JsonProperty(FIELD_USER_ID)
    public IrCronDTO setUserId(String val) {
        this._set(FIELD_USER_ID, val);
        return this;
    }

    /**
     * 获取「执行帐户」值
     *
     */
    @JsonIgnore
    public String getUserId() {
        return DataTypeUtils.asString(this._get(FIELD_USER_ID), null);
    }

    /**
     * 判断 「执行帐户」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUserId() {
        return this._contains(FIELD_USER_ID);
    }

    /**
     * 重置 「执行帐户」
     *
     */
    @JsonIgnore
    public IrCronDTO resetUserId() {
        this._reset(FIELD_USER_ID);
        return this;
    }

    /**
     * 设置「执行帐户」
     * @param val
     */
    @JsonProperty(FIELD_USER_NAME)
    public IrCronDTO setUserName(String val) {
        this._set(FIELD_USER_NAME, val);
        return this;
    }

    /**
     * 获取「执行帐户」值
     *
     */
    @JsonIgnore
    public String getUserName() {
        return DataTypeUtils.asString(this._get(FIELD_USER_NAME), null);
    }

    /**
     * 判断 「执行帐户」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUserName() {
        return this._contains(FIELD_USER_NAME);
    }

    /**
     * 重置 「执行帐户」
     *
     */
    @JsonIgnore
    public IrCronDTO resetUserName() {
        this._reset(FIELD_USER_NAME);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public IrCronDTO setWriteDate(Timestamp val) {
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
    public IrCronDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public IrCronDTO setWriteUid(String val) {
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
    public IrCronDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
