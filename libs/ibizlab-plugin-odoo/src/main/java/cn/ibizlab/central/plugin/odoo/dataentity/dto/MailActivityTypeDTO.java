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


public class MailActivityTypeDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 有效
     */
    public final static String FIELD_ACTIVE = "active";

    /**
     * 属性: 操作
     */
    public final static String FIELD_CATEGORY = "category";

    /**
     * 属性: 链接类型
     */
    public final static String FIELD_CHAINING_TYPE = "chaining_type";

    /**
     * 属性: 建立时间
     */
    public final static String FIELD_CREATE_DATE = "create_date";

    /**
     * 属性: 建立人
     */
    public final static String FIELD_CREATE_UID = "create_uid";

    /**
     * 属性: 排版类型
     */
    public final static String FIELD_DECORATION_TYPE = "decoration_type";

    /**
     * 属性: 默认备注
     */
    public final static String FIELD_DEFAULT_NOTE = "default_note";

    /**
     * 属性: 默认用户
     */
    public final static String FIELD_DEFAULT_USER_ID = "default_user_id";

    /**
     * 属性: 安排
     */
    public final static String FIELD_DELAY_COUNT = "delay_count";

    /**
     * 属性: 延迟类型
     */
    public final static String FIELD_DELAY_FROM = "delay_from";

    /**
     * 属性: 延迟标签
     */
    public final static String FIELD_DELAY_LABEL = "delay_label";

    /**
     * 属性: 延迟单位
     */
    public final static String FIELD_DELAY_UNIT = "delay_unit";

    /**
     * 属性: 显示名称
     */
    public final static String FIELD_DISPLAY_NAME = "display_name";

    /**
     * 属性: 图标
     */
    public final static String FIELD_ICON = "icon";

    /**
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 保持完成
     */
    public final static String FIELD_KEEP_DONE = "keep_done";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 属性: 资源模型
     */
    public final static String FIELD_RES_MODEL = "res_model";

    /**
     * 属性: 模型已更改
     */
    public final static String FIELD_RES_MODEL_CHANGE = "res_model_change";

    /**
     * 属性: 序列
     */
    public final static String FIELD_SEQUENCE = "sequence";

    /**
     * 属性: 默认摘要
     */
    public final static String FIELD_SUMMARY = "summary";

    /**
     * 属性: 触发方式
     */
    public final static String FIELD_TRIGGERED_NEXT_TYPE_ID = "triggered_next_type_id";

    /**
     * 属性: 触发方式
     */
    public final static String FIELD_TRIGGERED_NEXT_TYPE_NAME = "triggered_next_type_name";

    /**
     * 属性: 更新时间
     */
    public final static String FIELD_WRITE_DATE = "write_date";

    /**
     * 属性: 更新人
     */
    public final static String FIELD_WRITE_UID = "write_uid";

    /**
     * 设置「有效」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_ACTIVE)
    public MailActivityTypeDTO setActive(Integer val) {
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
    public MailActivityTypeDTO resetActive() {
        this._reset(FIELD_ACTIVE);
        return this;
    }

    /**
     * 设置「操作」
     * 代码表[操作]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_activity_type_category
     * @param val
     */
    @JsonProperty(FIELD_CATEGORY)
    public MailActivityTypeDTO setCategory(String val) {
        this._set(FIELD_CATEGORY, val);
        return this;
    }

    /**
     * 获取「操作」值
     * 代码表[操作]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_activity_type_category
     *
     */
    @JsonIgnore
    public String getCategory() {
        return DataTypeUtils.asString(this._get(FIELD_CATEGORY), null);
    }

    /**
     * 判断 「操作」是否有值
     *
     */
    @JsonIgnore
    public boolean containsCategory() {
        return this._contains(FIELD_CATEGORY);
    }

    /**
     * 重置 「操作」
     *
     */
    @JsonIgnore
    public MailActivityTypeDTO resetCategory() {
        this._reset(FIELD_CATEGORY);
        return this;
    }

    /**
     * 设置「链接类型」
     * 代码表[链接类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_activity_type_chaining_type
     * @param val
     */
    @JsonProperty(FIELD_CHAINING_TYPE)
    public MailActivityTypeDTO setChainingType(String val) {
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
    public MailActivityTypeDTO resetChainingType() {
        this._reset(FIELD_CHAINING_TYPE);
        return this;
    }

    /**
     * 设置「建立时间」
     * @param val
     */
    @JsonProperty(FIELD_CREATE_DATE)
    public MailActivityTypeDTO setCreateDate(Timestamp val) {
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
    public MailActivityTypeDTO resetCreateDate() {
        this._reset(FIELD_CREATE_DATE);
        return this;
    }

    /**
     * 设置「建立人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_CREATE_UID)
    public MailActivityTypeDTO setCreateUid(String val) {
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
    public MailActivityTypeDTO resetCreateUid() {
        this._reset(FIELD_CREATE_UID);
        return this;
    }

    /**
     * 设置「排版类型」
     * 代码表[排版类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_activity_type_decoration_type
     * @param val
     */
    @JsonProperty(FIELD_DECORATION_TYPE)
    public MailActivityTypeDTO setDecorationType(String val) {
        this._set(FIELD_DECORATION_TYPE, val);
        return this;
    }

    /**
     * 获取「排版类型」值
     * 代码表[排版类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_activity_type_decoration_type
     *
     */
    @JsonIgnore
    public String getDecorationType() {
        return DataTypeUtils.asString(this._get(FIELD_DECORATION_TYPE), null);
    }

    /**
     * 判断 「排版类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDecorationType() {
        return this._contains(FIELD_DECORATION_TYPE);
    }

    /**
     * 重置 「排版类型」
     *
     */
    @JsonIgnore
    public MailActivityTypeDTO resetDecorationType() {
        this._reset(FIELD_DECORATION_TYPE);
        return this;
    }

    /**
     * 设置「默认备注」
     * @param val
     */
    @JsonProperty(FIELD_DEFAULT_NOTE)
    public MailActivityTypeDTO setDefaultNote(String val) {
        this._set(FIELD_DEFAULT_NOTE, val);
        return this;
    }

    /**
     * 获取「默认备注」值
     *
     */
    @JsonIgnore
    public String getDefaultNote() {
        return DataTypeUtils.asString(this._get(FIELD_DEFAULT_NOTE), null);
    }

    /**
     * 判断 「默认备注」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDefaultNote() {
        return this._contains(FIELD_DEFAULT_NOTE);
    }

    /**
     * 重置 「默认备注」
     *
     */
    @JsonIgnore
    public MailActivityTypeDTO resetDefaultNote() {
        this._reset(FIELD_DEFAULT_NOTE);
        return this;
    }

    /**
     * 设置「默认用户」
     * @param val
     */
    @JsonProperty(FIELD_DEFAULT_USER_ID)
    public MailActivityTypeDTO setDefaultUserId(String val) {
        this._set(FIELD_DEFAULT_USER_ID, val);
        return this;
    }

    /**
     * 获取「默认用户」值
     *
     */
    @JsonIgnore
    public String getDefaultUserId() {
        return DataTypeUtils.asString(this._get(FIELD_DEFAULT_USER_ID), null);
    }

    /**
     * 判断 「默认用户」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDefaultUserId() {
        return this._contains(FIELD_DEFAULT_USER_ID);
    }

    /**
     * 重置 「默认用户」
     *
     */
    @JsonIgnore
    public MailActivityTypeDTO resetDefaultUserId() {
        this._reset(FIELD_DEFAULT_USER_ID);
        return this;
    }

    /**
     * 设置「安排」
     * @param val
     */
    @JsonProperty(FIELD_DELAY_COUNT)
    public MailActivityTypeDTO setDelayCount(Integer val) {
        this._set(FIELD_DELAY_COUNT, val);
        return this;
    }

    /**
     * 获取「安排」值
     *
     */
    @JsonIgnore
    public Integer getDelayCount() {
        return DataTypeUtils.asInteger(this._get(FIELD_DELAY_COUNT), null);
    }

    /**
     * 判断 「安排」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDelayCount() {
        return this._contains(FIELD_DELAY_COUNT);
    }

    /**
     * 重置 「安排」
     *
     */
    @JsonIgnore
    public MailActivityTypeDTO resetDelayCount() {
        this._reset(FIELD_DELAY_COUNT);
        return this;
    }

    /**
     * 设置「延迟类型」
     * 代码表[延迟类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_activity_type_delay_from
     * @param val
     */
    @JsonProperty(FIELD_DELAY_FROM)
    public MailActivityTypeDTO setDelayFrom(String val) {
        this._set(FIELD_DELAY_FROM, val);
        return this;
    }

    /**
     * 获取「延迟类型」值
     * 代码表[延迟类型]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_activity_type_delay_from
     *
     */
    @JsonIgnore
    public String getDelayFrom() {
        return DataTypeUtils.asString(this._get(FIELD_DELAY_FROM), null);
    }

    /**
     * 判断 「延迟类型」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDelayFrom() {
        return this._contains(FIELD_DELAY_FROM);
    }

    /**
     * 重置 「延迟类型」
     *
     */
    @JsonIgnore
    public MailActivityTypeDTO resetDelayFrom() {
        this._reset(FIELD_DELAY_FROM);
        return this;
    }

    /**
     * 设置「延迟标签」
     * @param val
     */
    @JsonProperty(FIELD_DELAY_LABEL)
    public MailActivityTypeDTO setDelayLabel(String val) {
        this._set(FIELD_DELAY_LABEL, val);
        return this;
    }

    /**
     * 获取「延迟标签」值
     *
     */
    @JsonIgnore
    public String getDelayLabel() {
        return DataTypeUtils.asString(this._get(FIELD_DELAY_LABEL), null);
    }

    /**
     * 判断 「延迟标签」是否有值
     *
     */
    @JsonIgnore
    public boolean containsDelayLabel() {
        return this._contains(FIELD_DELAY_LABEL);
    }

    /**
     * 重置 「延迟标签」
     *
     */
    @JsonIgnore
    public MailActivityTypeDTO resetDelayLabel() {
        this._reset(FIELD_DELAY_LABEL);
        return this;
    }

    /**
     * 设置「延迟单位」
     * 代码表[延迟单位]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_activity_type_delay_unit
     * @param val
     */
    @JsonProperty(FIELD_DELAY_UNIT)
    public MailActivityTypeDTO setDelayUnit(String val) {
        this._set(FIELD_DELAY_UNIT, val);
        return this;
    }

    /**
     * 获取「延迟单位」值
     * 代码表[延迟单位]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.mail_activity_type_delay_unit
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
    public MailActivityTypeDTO resetDelayUnit() {
        this._reset(FIELD_DELAY_UNIT);
        return this;
    }

    /**
     * 设置「显示名称」
     * @param val
     */
    @JsonProperty(FIELD_DISPLAY_NAME)
    public MailActivityTypeDTO setDisplayName(String val) {
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
    public MailActivityTypeDTO resetDisplayName() {
        this._reset(FIELD_DISPLAY_NAME);
        return this;
    }

    /**
     * 设置「图标」
     * @param val
     */
    @JsonProperty(FIELD_ICON)
    public MailActivityTypeDTO setIcon(String val) {
        this._set(FIELD_ICON, val);
        return this;
    }

    /**
     * 获取「图标」值
     *
     */
    @JsonIgnore
    public String getIcon() {
        return DataTypeUtils.asString(this._get(FIELD_ICON), null);
    }

    /**
     * 判断 「图标」是否有值
     *
     */
    @JsonIgnore
    public boolean containsIcon() {
        return this._contains(FIELD_ICON);
    }

    /**
     * 重置 「图标」
     *
     */
    @JsonIgnore
    public MailActivityTypeDTO resetIcon() {
        this._reset(FIELD_ICON);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailActivityTypeDTO setId(String val) {
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
    public MailActivityTypeDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「保持完成」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_KEEP_DONE)
    public MailActivityTypeDTO setKeepDone(Integer val) {
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
    public MailActivityTypeDTO resetKeepDone() {
        this._reset(FIELD_KEEP_DONE);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public MailActivityTypeDTO setName(String val) {
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
    public MailActivityTypeDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

    /**
     * 设置「资源模型」
     * @param val
     */
    @JsonProperty(FIELD_RES_MODEL)
    public MailActivityTypeDTO setResModel(String val) {
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
    public MailActivityTypeDTO resetResModel() {
        this._reset(FIELD_RES_MODEL);
        return this;
    }

    /**
     * 设置「模型已更改」
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     * @param val
     */
    @JsonProperty(FIELD_RES_MODEL_CHANGE)
    public MailActivityTypeDTO setResModelChange(Integer val) {
        this._set(FIELD_RES_MODEL_CHANGE, val);
        return this;
    }

    /**
     * 获取「模型已更改」值
     * 代码表[是否]
     * //@see cn.ibizlab.ibizodoo.core.runtime.dict.StaticDict.YesNo
     *
     */
    @JsonIgnore
    public Integer getResModelChange() {
        return DataTypeUtils.asInteger(this._get(FIELD_RES_MODEL_CHANGE), null);
    }

    /**
     * 判断 「模型已更改」是否有值
     *
     */
    @JsonIgnore
    public boolean containsResModelChange() {
        return this._contains(FIELD_RES_MODEL_CHANGE);
    }

    /**
     * 重置 「模型已更改」
     *
     */
    @JsonIgnore
    public MailActivityTypeDTO resetResModelChange() {
        this._reset(FIELD_RES_MODEL_CHANGE);
        return this;
    }

    /**
     * 设置「序列」
     * @param val
     */
    @JsonProperty(FIELD_SEQUENCE)
    public MailActivityTypeDTO setSequence(Integer val) {
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
    public MailActivityTypeDTO resetSequence() {
        this._reset(FIELD_SEQUENCE);
        return this;
    }

    /**
     * 设置「默认摘要」
     * @param val
     */
    @JsonProperty(FIELD_SUMMARY)
    public MailActivityTypeDTO setSummary(String val) {
        this._set(FIELD_SUMMARY, val);
        return this;
    }

    /**
     * 获取「默认摘要」值
     *
     */
    @JsonIgnore
    public String getSummary() {
        return DataTypeUtils.asString(this._get(FIELD_SUMMARY), null);
    }

    /**
     * 判断 「默认摘要」是否有值
     *
     */
    @JsonIgnore
    public boolean containsSummary() {
        return this._contains(FIELD_SUMMARY);
    }

    /**
     * 重置 「默认摘要」
     *
     */
    @JsonIgnore
    public MailActivityTypeDTO resetSummary() {
        this._reset(FIELD_SUMMARY);
        return this;
    }

    /**
     * 设置「触发方式」
     * @param val
     */
    @JsonProperty(FIELD_TRIGGERED_NEXT_TYPE_ID)
    public MailActivityTypeDTO setTriggeredNextTypeId(String val) {
        this._set(FIELD_TRIGGERED_NEXT_TYPE_ID, val);
        return this;
    }

    /**
     * 获取「触发方式」值
     *
     */
    @JsonIgnore
    public String getTriggeredNextTypeId() {
        return DataTypeUtils.asString(this._get(FIELD_TRIGGERED_NEXT_TYPE_ID), null);
    }

    /**
     * 判断 「触发方式」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTriggeredNextTypeId() {
        return this._contains(FIELD_TRIGGERED_NEXT_TYPE_ID);
    }

    /**
     * 重置 「触发方式」
     *
     */
    @JsonIgnore
    public MailActivityTypeDTO resetTriggeredNextTypeId() {
        this._reset(FIELD_TRIGGERED_NEXT_TYPE_ID);
        return this;
    }

    /**
     * 设置「触发方式」
     * @param val
     */
    @JsonProperty(FIELD_TRIGGERED_NEXT_TYPE_NAME)
    public MailActivityTypeDTO setTriggeredNextTypeName(String val) {
        this._set(FIELD_TRIGGERED_NEXT_TYPE_NAME, val);
        return this;
    }

    /**
     * 获取「触发方式」值
     *
     */
    @JsonIgnore
    public String getTriggeredNextTypeName() {
        return DataTypeUtils.asString(this._get(FIELD_TRIGGERED_NEXT_TYPE_NAME), null);
    }

    /**
     * 判断 「触发方式」是否有值
     *
     */
    @JsonIgnore
    public boolean containsTriggeredNextTypeName() {
        return this._contains(FIELD_TRIGGERED_NEXT_TYPE_NAME);
    }

    /**
     * 重置 「触发方式」
     *
     */
    @JsonIgnore
    public MailActivityTypeDTO resetTriggeredNextTypeName() {
        this._reset(FIELD_TRIGGERED_NEXT_TYPE_NAME);
        return this;
    }

    /**
     * 设置「更新时间」
     * @param val
     */
    @JsonProperty(FIELD_WRITE_DATE)
    public MailActivityTypeDTO setWriteDate(Timestamp val) {
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
    public MailActivityTypeDTO resetWriteDate() {
        this._reset(FIELD_WRITE_DATE);
        return this;
    }

    /**
     * 设置「更新人」
     * 代码表[云系统操作者]
     * @param val
     */
    @JsonProperty(FIELD_WRITE_UID)
    public MailActivityTypeDTO setWriteUid(String val) {
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
    public MailActivityTypeDTO resetWriteUid() {
        this._reset(FIELD_WRITE_UID);
        return this;
    }

}
