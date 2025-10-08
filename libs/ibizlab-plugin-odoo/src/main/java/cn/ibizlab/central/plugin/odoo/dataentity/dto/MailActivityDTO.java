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


public class MailActivityDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 到期天数
     */
    public final static String FIELD_DEADLINE_DAY = "deadline_day";

    /**
     * 属性: 链接类型
     */
    public final static String FIELD_CHAINING_TYPE = "chaining_type";

    /**
     * 属性: 保持完成
     */
    public final static String FIELD_KEEP_DONE = "keep_done";

    /**
     * 属性: 资源标识
     */
    public final static String FIELD_RES_ID = "res_id";

    /**
     * 属性: 有效
     */
    public final static String FIELD_ACTIVE = "active";

    /**
     * 属性: 活动类型
     */
    public final static String FIELD_ACTIVITY_TYPE_ID = "activity_type_id";

    /**
     * 属性: 活动类型
     */
    public final static String FIELD_ACTIVITY_TYPE_NAME = "activity_type_name";

    /**
     * 属性: 自动活动
     */
    public final static String FIELD_AUTOMATED = "automated";

    /**
     * 属性: 可写
     */
    public final static String FIELD_CAN_WRITE = "can_write";

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
     * 属性: 完成日期
     */
    public final static String FIELD_DATE_DONE = "date_done";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 下一活动可用
     */
    public final static String FIELD_HAS_RECOMMENDED_ACTIVITIES = "has_recommended_activities";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 备注
     */
    public final static String FIELD_NOTE = "note";

    /**
     * 属性: 上一个活动类型
     */
    public final static String FIELD_PREVIOUS_ACTIVITY_TYPE_ID = "previous_activity_type_id";

    /**
     * 属性: 推荐的活动类型
     */
    public final static String FIELD_RECOMMENDED_ACTIVITY_TYPE_ID = "recommended_activity_type_id";

    /**
     * 属性: 请求伙伴
     */
    public final static String FIELD_REQUEST_PARTNER_ID = "request_partner_id";

    /**
     * 属性: 资源模型
     */
    public final static String FIELD_RES_MODEL = "res_model";

    /**
     * 属性: 单据名称
     */
    public final static String FIELD_RES_NAME = "res_name";

    /**
     * 属性: 状态
     */
    public final static String FIELD_STATE = "state";

    /**
     * 属性: 摘要
     */
    public final static String FIELD_SUMMARY = "summary";

    /**
     * 属性: 分派给
     */
    public final static String FIELD_USER_ID = "user_id";

    /**
     * 属性: 分派给_名称
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
     * 设置「到期天数」
     * @param val
     */
    @JsonProperty(FIELD_DEADLINE_DAY)
    public MailActivityDTO setDeadlineDay(Integer val) {
        this._set(FIELD_DEADLINE_DAY, val);
        return this;
    }

    /**
     * 获取「到期天数」值
     *
     */
    @JsonIgnore
    public Integer getDeadlineDay() {
        return DataTypeUtils.asInteger(this._get(FIELD_DEADLINE_DAY), null);
    }

    /**
     * 判断 「到期天数」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDeadlineDay() {
        return this._contains(FIELD_DEADLINE_DAY);
    }

    /**
     * 重置 「到期天数」
     *
     */
    @JsonIgnore
    public MailActivityDTO resetDeadlineDay() {
        this._reset(FIELD_DEADLINE_DAY);
        return this;
    }

    /**
     * 设置「链接类型」
     * 代码表[链接类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_activity_type_chaining_type
     * @param val
     */
    @JsonProperty(FIELD_CHAINING_TYPE)
    public MailActivityDTO setChainingType(String val) {
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
    public MailActivityDTO resetChainingType() {
        this._reset(FIELD_CHAINING_TYPE);
        return this;
    }

    /**
     * 设置「保持完成」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_KEEP_DONE)
    public MailActivityDTO setKeepDone(Integer val) {
        this._set(FIELD_KEEP_DONE, val);
        return this;
    }

    /**
     * 获取「保持完成」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getKeepDone() {
        return DataTypeUtils.asInteger(this._get(FIELD_KEEP_DONE), null);
    }

    /**
     * 判断 「保持完成」是否有值
     *
     */
    @JsonIgnore
    public boolean containsKeepDone() {
        return this._contains(FIELD_KEEP_DONE);
    }

    /**
     * 重置 「保持完成」
     *
     */
    @JsonIgnore
    public MailActivityDTO resetKeepDone() {
        this._reset(FIELD_KEEP_DONE);
        return this;
    }

    /**
     * 设置「资源标识」
     * @param val
     */
    @JsonProperty(FIELD_RES_ID)
    public MailActivityDTO setResId(String val) {
        this._set(FIELD_RES_ID, val);
        return this;
    }

    /**
     * 获取「资源标识」值
     *
     */
    @JsonIgnore
    public String getResId() {
        return DataTypeUtils.asString(this._get(FIELD_RES_ID), null);
    }

    /**
     * 判断 「资源标识」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResId() {
        return this._contains(FIELD_RES_ID);
    }

    /**
     * 重置 「资源标识」
     *
     */
    @JsonIgnore
    public MailActivityDTO resetResId() {
        this._reset(FIELD_RES_ID);
        return this;
    }

    /**
     * 设置「有效」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ACTIVE)
    public MailActivityDTO setActive(Integer val) {
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
    public MailActivityDTO resetActive() {
        this._reset(FIELD_ACTIVE);
        return this;
    }

    /**
     * 设置「活动类型」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_TYPE_ID)
    public MailActivityDTO setActivityTypeId(String val) {
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
    public MailActivityDTO resetActivityTypeId() {
        this._reset(FIELD_ACTIVITY_TYPE_ID);
        return this;
    }

    /**
     * 设置「活动类型」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_TYPE_NAME)
    public MailActivityDTO setActivityTypeName(String val) {
        this._set(FIELD_ACTIVITY_TYPE_NAME, val);
        return this;
    }

    /**
     * 获取「活动类型」值
     *
     */
    @JsonIgnore
    public String getActivityTypeName() {
        return DataTypeUtils.asString(this._get(FIELD_ACTIVITY_TYPE_NAME), null);
    }

    /**
     * 判断 「活动类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsActivityTypeName() {
        return this._contains(FIELD_ACTIVITY_TYPE_NAME);
    }

    /**
     * 重置 「活动类型」
     *
     */
    @JsonIgnore
    public MailActivityDTO resetActivityTypeName() {
        this._reset(FIELD_ACTIVITY_TYPE_NAME);
        return this;
    }

    /**
     * 设置「自动活动」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_AUTOMATED)
    public MailActivityDTO setAutomated(Integer val) {
        this._set(FIELD_AUTOMATED, val);
        return this;
    }

    /**
     * 获取「自动活动」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getAutomated() {
        return DataTypeUtils.asInteger(this._get(FIELD_AUTOMATED), null);
    }

    /**
     * 判断 「自动活动」是否有值
     *
     */
    @JsonIgnore
    public boolean containsAutomated() {
        return this._contains(FIELD_AUTOMATED);
    }

    /**
     * 重置 「自动活动」
     *
     */
    @JsonIgnore
    public MailActivityDTO resetAutomated() {
        this._reset(FIELD_AUTOMATED);
        return this;
    }

    /**
     * 设置「可写」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_CAN_WRITE)
    public MailActivityDTO setCanWrite(Integer val) {
        this._set(FIELD_CAN_WRITE, val);
        return this;
    }

    /**
     * 获取「可写」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getCanWrite() {
        return DataTypeUtils.asInteger(this._get(FIELD_CAN_WRITE), null);
    }

    /**
     * 判断 「可写」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCanWrite() {
        return this._contains(FIELD_CAN_WRITE);
    }

    /**
     * 重置 「可写」
     *
     */
    @JsonIgnore
    public MailActivityDTO resetCanWrite() {
        this._reset(FIELD_CAN_WRITE);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public MailActivityDTO setCreateDate(Timestamp val) {
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
    public MailActivityDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public MailActivityDTO setCreateUid(String val) {
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
    public MailActivityDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「到期日期」
     * @param val
     */
    @JsonProperty(FIELD_DATE_DEADLINE)
    public MailActivityDTO setDateDeadline(Timestamp val) {
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
    public MailActivityDTO resetDateDeadline() {
        this._reset(FIELD_DATE_DEADLINE);
        return this;
    }

    /**
     * 设置「完成日期」
     * @param val
     */
    @JsonProperty(FIELD_DATE_DONE)
    public MailActivityDTO setDateDone(Timestamp val) {
        this._set(FIELD_DATE_DONE, val);
        return this;
    }

    /**
     * 获取「完成日期」值
     *
     */
    @JsonIgnore
    public Timestamp getDateDone() {
        return DataTypeUtils.asDateTimeValue(this._get(FIELD_DATE_DONE), null);
    }

    /**
     * 判断 「完成日期」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDateDone() {
        return this._contains(FIELD_DATE_DONE);
    }

    /**
     * 重置 「完成日期」
     *
     */
    @JsonIgnore
    public MailActivityDTO resetDateDone() {
        this._reset(FIELD_DATE_DONE);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public MailActivityDTO setDisplayName(String val) {
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
    public MailActivityDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「下一活动可用」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_HAS_RECOMMENDED_ACTIVITIES)
    public MailActivityDTO setHasRecommendedActivities(Integer val) {
        this._set(FIELD_HAS_RECOMMENDED_ACTIVITIES, val);
        return this;
    }

    /**
     * 获取「下一活动可用」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getHasRecommendedActivities() {
        return DataTypeUtils.asInteger(this._get(FIELD_HAS_RECOMMENDED_ACTIVITIES), null);
    }

    /**
     * 判断 「下一活动可用」是否有值
     *
     */
    @JsonIgnore
    public boolean containsHasRecommendedActivities() {
        return this._contains(FIELD_HAS_RECOMMENDED_ACTIVITIES);
    }

    /**
     * 重置 「下一活动可用」
     *
     */
    @JsonIgnore
    public MailActivityDTO resetHasRecommendedActivities() {
        this._reset(FIELD_HAS_RECOMMENDED_ACTIVITIES);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailActivityDTO setId(String val) {
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
    public MailActivityDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「备注」
     * @param val
     */
    @JsonProperty(FIELD_NOTE)
    public MailActivityDTO setNote(String val) {
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
    public MailActivityDTO resetNote() {
        this._reset(FIELD_NOTE);
        return this;
    }

    /**
     * 设置「上一个活动类型」
     * @param val
     */
    @JsonProperty(FIELD_PREVIOUS_ACTIVITY_TYPE_ID)
    public MailActivityDTO setPreviousActivityTypeId(String val) {
        this._set(FIELD_PREVIOUS_ACTIVITY_TYPE_ID, val);
        return this;
    }

    /**
     * 获取「上一个活动类型」值
     *
     */
    @JsonIgnore
    public String getPreviousActivityTypeId() {
        return DataTypeUtils.asString(this._get(FIELD_PREVIOUS_ACTIVITY_TYPE_ID), null);
    }

    /**
     * 判断 「上一个活动类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPreviousActivityTypeId() {
        return this._contains(FIELD_PREVIOUS_ACTIVITY_TYPE_ID);
    }

    /**
     * 重置 「上一个活动类型」
     *
     */
    @JsonIgnore
    public MailActivityDTO resetPreviousActivityTypeId() {
        this._reset(FIELD_PREVIOUS_ACTIVITY_TYPE_ID);
        return this;
    }

    /**
     * 设置「推荐的活动类型」
     * @param val
     */
    @JsonProperty(FIELD_RECOMMENDED_ACTIVITY_TYPE_ID)
    public MailActivityDTO setRecommendedActivityTypeId(String val) {
        this._set(FIELD_RECOMMENDED_ACTIVITY_TYPE_ID, val);
        return this;
    }

    /**
     * 获取「推荐的活动类型」值
     *
     */
    @JsonIgnore
    public String getRecommendedActivityTypeId() {
        return DataTypeUtils.asString(this._get(FIELD_RECOMMENDED_ACTIVITY_TYPE_ID), null);
    }

    /**
     * 判断 「推荐的活动类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRecommendedActivityTypeId() {
        return this._contains(FIELD_RECOMMENDED_ACTIVITY_TYPE_ID);
    }

    /**
     * 重置 「推荐的活动类型」
     *
     */
    @JsonIgnore
    public MailActivityDTO resetRecommendedActivityTypeId() {
        this._reset(FIELD_RECOMMENDED_ACTIVITY_TYPE_ID);
        return this;
    }

    /**
     * 设置「请求伙伴」
     * @param val
     */
    @JsonProperty(FIELD_REQUEST_PARTNER_ID)
    public MailActivityDTO setRequestPartnerId(String val) {
        this._set(FIELD_REQUEST_PARTNER_ID, val);
        return this;
    }

    /**
     * 获取「请求伙伴」值
     *
     */
    @JsonIgnore
    public String getRequestPartnerId() {
        return DataTypeUtils.asString(this._get(FIELD_REQUEST_PARTNER_ID), null);
    }

    /**
     * 判断 「请求伙伴」是否有值
     *
     */
    @JsonIgnore
    public boolean containsRequestPartnerId() {
        return this._contains(FIELD_REQUEST_PARTNER_ID);
    }

    /**
     * 重置 「请求伙伴」
     *
     */
    @JsonIgnore
    public MailActivityDTO resetRequestPartnerId() {
        this._reset(FIELD_REQUEST_PARTNER_ID);
        return this;
    }

    /**
     * 设置「资源模型」
     * @param val
     */
    @JsonProperty(FIELD_RES_MODEL)
    public MailActivityDTO setResModel(String val) {
        this._set(FIELD_RES_MODEL, val);
        return this;
    }

    /**
     * 获取「资源模型」值
     *
     */
    @JsonIgnore
    public String getResModel() {
        return DataTypeUtils.asString(this._get(FIELD_RES_MODEL), null);
    }

    /**
     * 判断 「资源模型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResModel() {
        return this._contains(FIELD_RES_MODEL);
    }

    /**
     * 重置 「资源模型」
     *
     */
    @JsonIgnore
    public MailActivityDTO resetResModel() {
        this._reset(FIELD_RES_MODEL);
        return this;
    }

    /**
     * 设置「单据名称」
     * @param val
     */
    @JsonProperty(FIELD_RES_NAME)
    public MailActivityDTO setResName(String val) {
        this._set(FIELD_RES_NAME, val);
        return this;
    }

    /**
     * 获取「单据名称」值
     *
     */
    @JsonIgnore
    public String getResName() {
        return DataTypeUtils.asString(this._get(FIELD_RES_NAME), null);
    }

    /**
     * 判断 「单据名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResName() {
        return this._contains(FIELD_RES_NAME);
    }

    /**
     * 重置 「单据名称」
     *
     */
    @JsonIgnore
    public MailActivityDTO resetResName() {
        this._reset(FIELD_RES_NAME);
        return this;
    }

    /**
     * 设置「状态」
     * 代码表[状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_activity_state
     * @param val
     */
    @JsonProperty(FIELD_STATE)
    public MailActivityDTO setState(String val) {
        this._set(FIELD_STATE, val);
        return this;
    }

    /**
     * 获取「状态」值
     * 代码表[状态]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_activity_state
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
    public MailActivityDTO resetState() {
        this._reset(FIELD_STATE);
        return this;
    }

    /**
     * 设置「摘要」
     * @param val
     */
    @JsonProperty(FIELD_SUMMARY)
    public MailActivityDTO setSummary(String val) {
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
    public MailActivityDTO resetSummary() {
        this._reset(FIELD_SUMMARY);
        return this;
    }

    /**
     * 设置「分派给」
     * @param val
     */
    @JsonProperty(FIELD_USER_ID)
    public MailActivityDTO setUserId(String val) {
        this._set(FIELD_USER_ID, val);
        return this;
    }

    /**
     * 获取「分派给」值
     *
     */
    @JsonIgnore
    public String getUserId() {
        return DataTypeUtils.asString(this._get(FIELD_USER_ID), null);
    }

    /**
     * 判断 「分派给」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUserId() {
        return this._contains(FIELD_USER_ID);
    }

    /**
     * 重置 「分派给」
     *
     */
    @JsonIgnore
    public MailActivityDTO resetUserId() {
        this._reset(FIELD_USER_ID);
        return this;
    }

    /**
     * 设置「分派给_名称」
     * @param val
     */
    @JsonProperty(FIELD_USER_NAME)
    public MailActivityDTO setUserName(String val) {
        this._set(FIELD_USER_NAME, val);
        return this;
    }

    /**
     * 获取「分派给_名称」值
     *
     */
    @JsonIgnore
    public String getUserName() {
        return DataTypeUtils.asString(this._get(FIELD_USER_NAME), null);
    }

    /**
     * 判断 「分派给_名称」是否有值
     *
     */
    @JsonIgnore
    public boolean containsUserName() {
        return this._contains(FIELD_USER_NAME);
    }

    /**
     * 重置 「分派给_名称」
     *
     */
    @JsonIgnore
    public MailActivityDTO resetUserName() {
        this._reset(FIELD_USER_NAME);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public MailActivityDTO setWriteDate(Timestamp val) {
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
    public MailActivityDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public MailActivityDTO setWriteUid(String val) {
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
    public MailActivityDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
