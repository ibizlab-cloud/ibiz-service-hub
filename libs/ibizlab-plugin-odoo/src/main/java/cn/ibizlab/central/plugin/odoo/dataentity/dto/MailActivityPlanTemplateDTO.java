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


public class MailActivityPlanTemplateDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 活动类型
     */
    public final static String FIELD_ACTIVITY_TYPE_ID = "activity_type_id";

    /**
     * 属性: 活动类型
     */
    public final static String FIELD_ACTIVITY_TYPE_NAME = "activity_type_name";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 间隔
     */
    public final static String FIELD_DELAY_COUNT = "delay_count";

    /**
     * 属性: 触发方式
     */
    public final static String FIELD_DELAY_FROM = "delay_from";

    /**
     * 属性: 延迟单位
     */
    public final static String FIELD_DELAY_UNIT = "delay_unit";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 备注
     */
    public final static String FIELD_NOTE = "note";

    /**
     * 属性: 计划
     */
    public final static String FIELD_PLAN_ID = "plan_id";

    /**
     * 属性: 计划
     */
    public final static String FIELD_PLAN_NAME = "plan_name";

    /**
     * 属性: 分派给
     */
    public final static String FIELD_RESPONSIBLE_ID = "responsible_id";

    /**
     * 属性: 分派给
     */
    public final static String FIELD_RESPONSIBLE_NAME = "responsible_name";

    /**
     * 属性: 指派
     */
    public final static String FIELD_RESPONSIBLE_TYPE = "responsible_type";

    /**
     * 属性: 序列
     */
    public final static String FIELD_SEQUENCE = "sequence";

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
     * 设置「活动类型」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_TYPE_ID)
    public MailActivityPlanTemplateDTO setActivityTypeId(String val) {
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
    public MailActivityPlanTemplateDTO resetActivityTypeId() {
        this._reset(FIELD_ACTIVITY_TYPE_ID);
        return this;
    }

    /**
     * 设置「活动类型」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_TYPE_NAME)
    public MailActivityPlanTemplateDTO setActivityTypeName(String val) {
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
    public MailActivityPlanTemplateDTO resetActivityTypeName() {
        this._reset(FIELD_ACTIVITY_TYPE_NAME);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public MailActivityPlanTemplateDTO setCreateDate(Timestamp val) {
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
    public MailActivityPlanTemplateDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public MailActivityPlanTemplateDTO setCreateUid(String val) {
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
    public MailActivityPlanTemplateDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「间隔」
     * @param val
     */
    @JsonProperty(FIELD_DELAY_COUNT)
    public MailActivityPlanTemplateDTO setDelayCount(Integer val) {
        this._set(FIELD_DELAY_COUNT, val);
        return this;
    }

    /**
     * 获取「间隔」值
     *
     */
    @JsonIgnore
    public Integer getDelayCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_DELAY_COUNT), null);
    }

    /**
     * 判断 「间隔」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDelayCount() {
        return this._contains(FIELD_DELAY_COUNT);
    }

    /**
     * 重置 「间隔」
     *
     */
    @JsonIgnore
    public MailActivityPlanTemplateDTO resetDelayCount() {
        this._reset(FIELD_DELAY_COUNT);
        return this;
    }

    /**
     * 设置「触发方式」
     * 代码表[触发方式]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_activity_plan_template_delay_from
     * @param val
     */
    @JsonProperty(FIELD_DELAY_FROM)
    public MailActivityPlanTemplateDTO setDelayFrom(String val) {
        this._set(FIELD_DELAY_FROM, val);
        return this;
    }

    /**
     * 获取「触发方式」值
     * 代码表[触发方式]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_activity_plan_template_delay_from
     *
     */
    @JsonIgnore
    public String getDelayFrom() {
        return DataTypeUtils.asString(this._get(FIELD_DELAY_FROM), null);
    }

    /**
     * 判断 「触发方式」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDelayFrom() {
        return this._contains(FIELD_DELAY_FROM);
    }

    /**
     * 重置 「触发方式」
     *
     */
    @JsonIgnore
    public MailActivityPlanTemplateDTO resetDelayFrom() {
        this._reset(FIELD_DELAY_FROM);
        return this;
    }

    /**
     * 设置「延迟单位」
     * 代码表[延迟单位]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_activity_plan_template_delay_unit
     * @param val
     */
    @JsonProperty(FIELD_DELAY_UNIT)
    public MailActivityPlanTemplateDTO setDelayUnit(String val) {
        this._set(FIELD_DELAY_UNIT, val);
        return this;
    }

    /**
     * 获取「延迟单位」值
     * 代码表[延迟单位]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_activity_plan_template_delay_unit
     *
     */
    @JsonIgnore
    public String getDelayUnit() {
        return DataTypeUtils.asString(this._get(FIELD_DELAY_UNIT), null);
    }

    /**
     * 判断 「延迟单位」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDelayUnit() {
        return this._contains(FIELD_DELAY_UNIT);
    }

    /**
     * 重置 「延迟单位」
     *
     */
    @JsonIgnore
    public MailActivityPlanTemplateDTO resetDelayUnit() {
        this._reset(FIELD_DELAY_UNIT);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public MailActivityPlanTemplateDTO setDisplayName(String val) {
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
    public MailActivityPlanTemplateDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailActivityPlanTemplateDTO setId(String val) {
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
    public MailActivityPlanTemplateDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「备注」
     * @param val
     */
    @JsonProperty(FIELD_NOTE)
    public MailActivityPlanTemplateDTO setNote(String val) {
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
    public MailActivityPlanTemplateDTO resetNote() {
        this._reset(FIELD_NOTE);
        return this;
    }

    /**
     * 设置「计划」
     * @param val
     */
    @JsonProperty(FIELD_PLAN_ID)
    public MailActivityPlanTemplateDTO setPlanId(String val) {
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
    public MailActivityPlanTemplateDTO resetPlanId() {
        this._reset(FIELD_PLAN_ID);
        return this;
    }

    /**
     * 设置「计划」
     * @param val
     */
    @JsonProperty(FIELD_PLAN_NAME)
    public MailActivityPlanTemplateDTO setPlanName(String val) {
        this._set(FIELD_PLAN_NAME, val);
        return this;
    }

    /**
     * 获取「计划」值
     *
     */
    @JsonIgnore
    public String getPlanName() {
        return DataTypeUtils.asString(this._get(FIELD_PLAN_NAME), null);
    }

    /**
     * 判断 「计划」是否有值
     *
     */
    @JsonIgnore
    public boolean containsPlanName() {
        return this._contains(FIELD_PLAN_NAME);
    }

    /**
     * 重置 「计划」
     *
     */
    @JsonIgnore
    public MailActivityPlanTemplateDTO resetPlanName() {
        this._reset(FIELD_PLAN_NAME);
        return this;
    }

    /**
     * 设置「分派给」
     * @param val
     */
    @JsonProperty(FIELD_RESPONSIBLE_ID)
    public MailActivityPlanTemplateDTO setResponsibleId(String val) {
        this._set(FIELD_RESPONSIBLE_ID, val);
        return this;
    }

    /**
     * 获取「分派给」值
     *
     */
    @JsonIgnore
    public String getResponsibleId() {
        return DataTypeUtils.asString(this._get(FIELD_RESPONSIBLE_ID), null);
    }

    /**
     * 判断 「分派给」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResponsibleId() {
        return this._contains(FIELD_RESPONSIBLE_ID);
    }

    /**
     * 重置 「分派给」
     *
     */
    @JsonIgnore
    public MailActivityPlanTemplateDTO resetResponsibleId() {
        this._reset(FIELD_RESPONSIBLE_ID);
        return this;
    }

    /**
     * 设置「分派给」
     * @param val
     */
    @JsonProperty(FIELD_RESPONSIBLE_NAME)
    public MailActivityPlanTemplateDTO setResponsibleName(String val) {
        this._set(FIELD_RESPONSIBLE_NAME, val);
        return this;
    }

    /**
     * 获取「分派给」值
     *
     */
    @JsonIgnore
    public String getResponsibleName() {
        return DataTypeUtils.asString(this._get(FIELD_RESPONSIBLE_NAME), null);
    }

    /**
     * 判断 「分派给」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResponsibleName() {
        return this._contains(FIELD_RESPONSIBLE_NAME);
    }

    /**
     * 重置 「分派给」
     *
     */
    @JsonIgnore
    public MailActivityPlanTemplateDTO resetResponsibleName() {
        this._reset(FIELD_RESPONSIBLE_NAME);
        return this;
    }

    /**
     * 设置「指派」
     * 代码表[指派]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_activity_plan_template_responsible_type
     * @param val
     */
    @JsonProperty(FIELD_RESPONSIBLE_TYPE)
    public MailActivityPlanTemplateDTO setResponsibleType(String val) {
        this._set(FIELD_RESPONSIBLE_TYPE, val);
        return this;
    }

    /**
     * 获取「指派」值
     * 代码表[指派]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_activity_plan_template_responsible_type
     *
     */
    @JsonIgnore
    public String getResponsibleType() {
        return DataTypeUtils.asString(this._get(FIELD_RESPONSIBLE_TYPE), null);
    }

    /**
     * 判断 「指派」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResponsibleType() {
        return this._contains(FIELD_RESPONSIBLE_TYPE);
    }

    /**
     * 重置 「指派」
     *
     */
    @JsonIgnore
    public MailActivityPlanTemplateDTO resetResponsibleType() {
        this._reset(FIELD_RESPONSIBLE_TYPE);
        return this;
    }

    /**
     * 设置「序列」
     * @param val
     */
    @JsonProperty(FIELD_SEQUENCE)
    public MailActivityPlanTemplateDTO setSequence(Integer val) {
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
    public MailActivityPlanTemplateDTO resetSequence() {
        this._reset(FIELD_SEQUENCE);
        return this;
    }

    /**
     * 设置「摘要」
     * @param val
     */
    @JsonProperty(FIELD_SUMMARY)
    public MailActivityPlanTemplateDTO setSummary(String val) {
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
    public MailActivityPlanTemplateDTO resetSummary() {
        this._reset(FIELD_SUMMARY);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public MailActivityPlanTemplateDTO setWriteDate(Timestamp val) {
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
    public MailActivityPlanTemplateDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public MailActivityPlanTemplateDTO setWriteUid(String val) {
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
    public MailActivityPlanTemplateDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
