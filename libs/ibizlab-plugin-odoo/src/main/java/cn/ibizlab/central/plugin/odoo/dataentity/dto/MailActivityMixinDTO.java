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


public class MailActivityMixinDTO extends cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOBase {

    /**
     * 属性: 活动集合
     */
    public final static String FIELD_ACTIVITIES = "activities";

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
     * 属性: 标识
     */
    public final static String FIELD_ID = "id";

    /**
     * 属性: 我的活动截止时间
     */
    public final static String FIELD_MY_ACTIVITY_DATE_DEADLINE = "my_activity_date_deadline";

    /**
     * 属性: 名称
     */
    public final static String FIELD_NAME = "name";

    /**
     * 设置「活动集合」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITIES)
    public MailActivityMixinDTO setActivities(List<MailActivityDTO> val) {
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
    public MailActivityMixinDTO resetActivities() {
        this._reset(FIELD_ACTIVITIES);
        return this;
    }

    /**
     * 设置「下一活动截止日期」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_DATE_DEADLINE)
    public MailActivityMixinDTO setActivityDateDeadline(Timestamp val) {
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
    public MailActivityMixinDTO resetActivityDateDeadline() {
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
    public MailActivityMixinDTO setActivityExceptionDecoration(String val) {
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
    public MailActivityMixinDTO resetActivityExceptionDecoration() {
        this._reset(FIELD_ACTIVITY_EXCEPTION_DECORATION);
        return this;
    }

    /**
     * 设置「图标」
     * @param val
     */
    @JsonProperty(FIELD_ACTIVITY_EXCEPTION_ICON)
    public MailActivityMixinDTO setActivityExceptionIcon(String val) {
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
    public MailActivityMixinDTO resetActivityExceptionIcon() {
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
    public MailActivityMixinDTO setActivityState(String val) {
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
    public MailActivityMixinDTO resetActivityState() {
        this._reset(FIELD_ACTIVITY_STATE);
        return this;
    }

    /**
     * 设置「标识」
     * @param val
     */
    @JsonProperty(FIELD_ID)
    public MailActivityMixinDTO setId(String val) {
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
    public MailActivityMixinDTO resetId() {
        this._reset(FIELD_ID);
        return this;
    }

    /**
     * 设置「我的活动截止时间」
     * @param val
     */
    @JsonProperty(FIELD_MY_ACTIVITY_DATE_DEADLINE)
    public MailActivityMixinDTO setMyActivityDateDeadline(Timestamp val) {
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
    public MailActivityMixinDTO resetMyActivityDateDeadline() {
        this._reset(FIELD_MY_ACTIVITY_DATE_DEADLINE);
        return this;
    }

    /**
     * 设置「名称」
     * @param val
     */
    @JsonProperty(FIELD_NAME)
    public MailActivityMixinDTO setName(String val) {
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
    public MailActivityMixinDTO resetName() {
        this._reset(FIELD_NAME);
        return this;
    }

}
